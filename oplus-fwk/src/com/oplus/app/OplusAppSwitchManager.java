package com.oplus.app;

import android.content.Context;
import android.compat.annotation.UnsupportedAppUsage;

public class OplusAppSwitchManager {

    private static OplusAppSwitchManager sOplusAppSwitchManager = null;
@UnsupportedAppUsage
public static int APP_SWITCH_VERSION = 1;

    @UnsupportedAppUsage
public static OplusAppSwitchManager getInstance() {
        if (sOplusAppSwitchManager == null) {
            sOplusAppSwitchManager = new OplusAppSwitchManager();
        }
        return sOplusAppSwitchManager;
    }

    @UnsupportedAppUsage
public boolean registerAppSwitchObserver(Context context,
            OnAppSwitchObserver observer, OplusAppSwitchConfig config) {
        return true;
    }

    @UnsupportedAppUsage
public boolean unregisterAppSwitchObserver(Context context, OnAppSwitchObserver observer) {
        return true;
    }

    public interface OnAppSwitchObserver {

        void onActivityEnter(OplusAppEnterInfo oplusAppEnterInfo);

        void onActivityExit(OplusAppExitInfo oplusAppExitInfo);

        void onAppEnter(OplusAppEnterInfo oplusAppEnterInfo);

        void onAppExit(OplusAppExitInfo oplusAppExitInfo);
    }
}
