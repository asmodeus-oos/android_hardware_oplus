package android.os;

import android.compat.annotation.UnsupportedAppUsage;

public class OplusSystemProperties {

    @UnsupportedAppUsage
public static String get(String key) {
        return SystemProperties.get(key);
    }

    @UnsupportedAppUsage
public static String get(String key, String def) {
        return SystemProperties.get(key, def);
    }

    @UnsupportedAppUsage
public static int getInt(String key, int def) {
        return SystemProperties.getInt(key, def);
    }

    @UnsupportedAppUsage
public static boolean getBoolean(String key, boolean def) {
        return SystemProperties.getBoolean(key, def);
    }
}
