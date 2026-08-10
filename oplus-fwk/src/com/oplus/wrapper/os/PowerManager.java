package com.oplus.wrapper.os;

import android.compat.annotation.UnsupportedAppUsage;

public class PowerManager {

    private final android.os.PowerManager mPowerManager;

    public PowerManager(android.os.PowerManager powerManager) {
        mPowerManager = powerManager;
    }

    @UnsupportedAppUsage
public int getMaximumScreenBrightnessSetting() {
        return mPowerManager.getMaximumScreenBrightnessSetting();
    }
}
