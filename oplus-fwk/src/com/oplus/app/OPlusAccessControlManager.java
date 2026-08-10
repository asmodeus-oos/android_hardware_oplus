package com.oplus.app;

import android.os.UserHandle;
import android.compat.annotation.UnsupportedAppUsage;

public class OPlusAccessControlManager {
    
    private static OPlusAccessControlManager sOPlusAccessControlManager = null;
@UnsupportedAppUsage
    public static final int USER_CURRENT = UserHandle.myUserId();

    @UnsupportedAppUsage
public static OPlusAccessControlManager getInstance() {
        if (sOPlusAccessControlManager == null) {
            sOPlusAccessControlManager = new OPlusAccessControlManager();
        }
        return sOPlusAccessControlManager;
    }

    @UnsupportedAppUsage
public boolean isEncryptPass(String packageName, int userId) {
        return true;
    }

    @UnsupportedAppUsage
public boolean isEncryptedPackage(String packageName, int userId) {
        return true;
    }
}
