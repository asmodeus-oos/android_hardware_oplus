package net.oneplus.odm;

import android.content.Context;
import android.compat.annotation.UnsupportedAppUsage;

import java.util.Map;

public class OpDeviceManagerInjector {

    private static OpDeviceManagerInjector sOpDeviceManagerInjector = null;

    @UnsupportedAppUsage
public void preserveAppData(Context a, String b, Map c, Map d) {}

    @UnsupportedAppUsage
public static OpDeviceManagerInjector getInstance() {
        if (sOpDeviceManagerInjector == null) {
            sOpDeviceManagerInjector = new OpDeviceManagerInjector();
        }
        return sOpDeviceManagerInjector;
    }
}
