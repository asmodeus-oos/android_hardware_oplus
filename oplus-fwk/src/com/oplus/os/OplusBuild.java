package com.oplus.os;

import android.compat.annotation.UnsupportedAppUsage;

public class OplusBuild {

    @UnsupportedAppUsage
public static final int OplusOS_11_3 = 22;

    @UnsupportedAppUsage
public static int getOplusOSVERSION() {
        return 23;
    }

    public static class VERSION {
        @UnsupportedAppUsage
public VERSION() {
        }

        @UnsupportedAppUsage
public static final String RELEASE = "unknown";

        @UnsupportedAppUsage
public static final int SDK_VERSION = getOplusOSVERSION();

        @UnsupportedAppUsage
public static final int SDK_SUB_VERSION = 1;
    }

}
