package com.oplus.wrapper.os;

import android.os.IBinder;
import android.compat.annotation.UnsupportedAppUsage;

public class ServiceManager {

    @UnsupportedAppUsage
public static IBinder checkService(String name) {
        return android.os.ServiceManager.checkService(name);
    }

    @UnsupportedAppUsage
public static IBinder getService(String name) {
        return android.os.ServiceManager.getService(name);
    }

    @UnsupportedAppUsage
public static void addService(String name, IBinder token) {
        android.os.ServiceManager.addService(name, token);
    }
}
