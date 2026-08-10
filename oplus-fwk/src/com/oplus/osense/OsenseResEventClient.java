package com.oplus.osense;

import android.compat.annotation.UnsupportedAppUsage;
import com.oplus.osense.eventinfo.EventConfig;
import com.oplus.osense.eventinfo.OsenseEventCallback;

public class OsenseResEventClient {

    private static OsenseResEventClient sInstance;

    @UnsupportedAppUsage
public static OsenseResEventClient getInstance() {
        if (sInstance == null) {
            sInstance = new OsenseResEventClient();
        }
        return sInstance;
    }

    @UnsupportedAppUsage
public int registerEventCallback(OsenseEventCallback callback, EventConfig config) {
        return 0;
    }

    @UnsupportedAppUsage
public int unregisterEventCallback(OsenseEventCallback callback) {
        return 0;
    }
}
