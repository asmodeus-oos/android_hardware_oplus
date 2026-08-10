package com.oplus.orms;

import com.oplus.orms.info.OrmsSaParam;
import android.compat.annotation.UnsupportedAppUsage;

public class OplusResourceManager {

    private static OplusResourceManager sOplusResourceManager = null;

    @UnsupportedAppUsage
public static OplusResourceManager getInstance(Class clazz) {
        if (sOplusResourceManager == null) {
            sOplusResourceManager = new OplusResourceManager();
        }
        return sOplusResourceManager;
    }

    @UnsupportedAppUsage
public long ormsSetSceneAction(OrmsSaParam ormsSaParam) {
        return -1L;
    }
}
