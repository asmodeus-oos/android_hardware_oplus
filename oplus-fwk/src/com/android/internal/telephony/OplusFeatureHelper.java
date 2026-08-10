/*
 * Copyright (C) 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.internal.telephony;

import com.oplus.content.OplusFeatureConfigManager;

import java.util.List;
import android.compat.annotation.UnsupportedAppUsage;

public class OplusFeatureHelper {
    private static OplusFeatureHelper sInstance = null;

    @UnsupportedAppUsage
public static OplusFeatureHelper getInstance() {
        if (sInstance == null) {
            sInstance = new OplusFeatureHelper();
        }
        return sInstance;
    }

    @UnsupportedAppUsage
public boolean hasFeature(String featureName) {
        return false;
    }

    @UnsupportedAppUsage
public boolean enableFeature(String featureName) {
        return true;
    }

    @UnsupportedAppUsage
public boolean disableFeature(String featureName) {
        return true;
    }

    @UnsupportedAppUsage
public void notifyFeaturesUpdate(String action, String actionValue) {}

    @UnsupportedAppUsage
public boolean registerFeatureObserver(List<String> features, FeatureObserver observer) {
        return true;
    }

    @UnsupportedAppUsage
public boolean unregisterFeatureObserver(FeatureObserver observer) {
        return true;
    }

    public static class FeatureObserver implements OplusFeatureConfigManager.OnFeatureObserver {}
}
