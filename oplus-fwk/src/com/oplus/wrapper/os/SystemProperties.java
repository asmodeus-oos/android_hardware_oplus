package com.oplus.wrapper.os;

import android.compat.annotation.UnsupportedAppUsage;

public class SystemProperties {

    @UnsupportedAppUsage
public static String get(String key) {
        return android.os.SystemProperties.get(key, "");
    }

    @UnsupportedAppUsage
public static String get(String key, String def) {
        return android.os.SystemProperties.get(key, def);
    }

    @UnsupportedAppUsage
public static int getInt(String key, int def) {
        return android.os.SystemProperties.getInt(key, def);
    }

    @UnsupportedAppUsage
public static boolean getBoolean(String key, boolean def) {
        return android.os.SystemProperties.getBoolean(key, def);
    }

    @UnsupportedAppUsage
public static void set(String key, String val) {
        android.os.SystemProperties.set(key, val);
    }
}
