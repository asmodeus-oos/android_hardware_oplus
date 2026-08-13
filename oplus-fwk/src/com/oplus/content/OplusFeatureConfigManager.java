/*
 * Copyright (C) 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.content;

import android.text.TextUtils;
import android.compat.annotation.UnsupportedAppUsage;

import java.util.List;

public class OplusFeatureConfigManager {
    public static OplusFeatureConfigManager sInstance = null;

    @UnsupportedAppUsage
public static OplusFeatureConfigManager getInstance() {
        if (sInstance == null) {
            sInstance = new OplusFeatureConfigManager();
        }
        return sInstance;
    }

    @UnsupportedAppUsage
public boolean hasFeature(String featureName) {
        return false;
    }

    public interface OnFeatureObserver {
        default void onFeatureUpdate(List<String> features) {}
    }
}
