package com.oplus.zoomwindow;

import android.compat.annotation.UnsupportedAppUsage;

public class OplusZoomWindowManager {
@UnsupportedAppUsage
public static OplusZoomWindowManager sOplusZoomWindowManager = null;

    @UnsupportedAppUsage
public static OplusZoomWindowManager getInstance() {
        if (sOplusZoomWindowManager == null) {
            sOplusZoomWindowManager = new OplusZoomWindowManager();
        }
        return sOplusZoomWindowManager;
    }

    @UnsupportedAppUsage
public boolean registerZoomWindowObserver(IOplusZoomWindowObserver observer) {
        return false;
    }

    @UnsupportedAppUsage
public boolean unregisterZoomWindowObserver(IOplusZoomWindowObserver observer) {
        return false;
    }
}
