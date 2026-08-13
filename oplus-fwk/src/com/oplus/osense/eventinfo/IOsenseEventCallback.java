package com.oplus.osense.eventinfo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.compat.annotation.UnsupportedAppUsage;

public interface IOsenseEventCallback extends IInterface {

    public static class Default implements IOsenseEventCallback {
        @Override
        @UnsupportedAppUsage
public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IOsenseEventCallback {
        @Override
        @UnsupportedAppUsage
public IBinder asBinder() {
            return this;
        }
    }
}
