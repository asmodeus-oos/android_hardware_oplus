/*
 * SPDX-FileCopyrightText: 2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

#define LOG_TAG "vendor.lineage.touch-service.oplus"

#include <cerrno>
#include <climits>
#include <cstdlib>

#include <android-base/file.h>
#include <android-base/stringprintf.h>
#include <android-base/strings.h>

#include <OplusTouchConstants.h>
#include <TouchscreenGestureConfig.h>

using ::android::base::ReadFileToString;
using ::android::base::StringPrintf;
using ::android::base::Trim;
using ::android::base::WriteStringToFile;

namespace {

constexpr const char* kGestureEnableIndepPath = "/proc/touchpanel/double_tap_enable_indep";

}  // anonymous namespace

namespace aidl {
namespace vendor {
namespace lineage {
namespace touch {

TouchscreenGesture::TouchscreenGesture(std::shared_ptr<IOplusTouch> oplusTouch)
    : mOplusTouch(std::move(oplusTouch)) {}

ndk::ScopedAStatus TouchscreenGesture::getSupportedGestures(std::vector<Gesture>* _aidl_return) {
    std::vector<Gesture> gestures;

    for (const auto& [id, name] : kGestureNames) {
        if (kSupportedGestures & (1 << id)) {
            gestures.push_back({static_cast<int>(gestures.size()), name, kGestureStartKey + id});
        }
    }

    *_aidl_return = gestures;
    return ndk::ScopedAStatus::ok();
}

ndk::ScopedAStatus TouchscreenGesture::setGestureEnabled(const Gesture& gesture, bool enabled) {
    int contents = 0;

    if (std::string tmp; mOplusTouch) {
        mOplusTouch->touchReadNodeFile(OplusTouchConstants::DEFAULT_TP_IC_ID,
                                       OplusTouchConstants::DOUBLE_TAP_INDEP_NODE, &tmp);
        const std::string value = Trim(tmp);
        char* end = nullptr;
        errno = 0;
        const long parsed = std::strtol(value.c_str(), &end, 16);
        if (errno != 0 || end == value.c_str() || *end != '\0' || parsed < 0 ||
                parsed > INT_MAX) {
            return ndk::ScopedAStatus::fromExceptionCodeWithMessage(
                    EX_ILLEGAL_ARGUMENT, "Invalid gesture mask");
        }
        contents = static_cast<int>(parsed);
    } else if (ReadFileToString(kGestureEnableIndepPath, &tmp)) {
        const std::string value = Trim(tmp);
        char* end = nullptr;
        errno = 0;
        const long parsed = std::strtol(value.c_str(), &end, 16);
        if (errno != 0 || end == value.c_str() || *end != '\0' || parsed < 0 ||
                parsed > INT_MAX) {
            return ndk::ScopedAStatus::fromExceptionCodeWithMessage(
                    EX_ILLEGAL_ARGUMENT, "Invalid gesture mask");
        }
        contents = static_cast<int>(parsed);
    } else {
        return ndk::ScopedAStatus::fromExceptionCode(EX_UNSUPPORTED_OPERATION);
    }

    if (enabled) {
        contents |= (1 << (gesture.keycode - kGestureStartKey));
    } else {
        contents &= ~(1 << (gesture.keycode - kGestureStartKey));
    }

    if (mOplusTouch) {
        mOplusTouch->touchWriteNodeFileOneWay(OplusTouchConstants::DEFAULT_TP_IC_ID,
                                              OplusTouchConstants::DOUBLE_TAP_ENABLE_NODE,
                                              contents != 0 ? "1" : "0");
        mOplusTouch->touchWriteNodeFileOneWay(OplusTouchConstants::DEFAULT_TP_IC_ID,
                                              OplusTouchConstants::DOUBLE_TAP_INDEP_NODE,
                                              StringPrintf("%x", contents));
    } else if (!WriteStringToFile(StringPrintf("%x", contents), kGestureEnableIndepPath, true)) {
        return ndk::ScopedAStatus::fromExceptionCode(EX_UNSUPPORTED_OPERATION);
    }

    return ndk::ScopedAStatus::ok();
}

}  // namespace touch
}  // namespace lineage
}  // namespace vendor
}  // namespace aidl
