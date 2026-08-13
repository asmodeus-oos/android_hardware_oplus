/*
 * SPDX-FileCopyrightText: 2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.osense;

import android.os.Bundle;
import android.view.MotionEvent;
import android.compat.annotation.UnsupportedAppUsage;

public class OsenseResClient {
    @UnsupportedAppUsage
public static OsenseResClient get(Class clazz) {
        return new OsenseResClient();
    }

    @UnsupportedAppUsage
public void requestSysResource(int eventId, Bundle extra) {}

    @UnsupportedAppUsage
public void releaseSysResource(int eventId) {}

    @UnsupportedAppUsage
public long osenseSetSceneAction(Object request) {
        return 0L;
    }

    @UnsupportedAppUsage
public void osenseClrSceneAction(long handle) {}

    @UnsupportedAppUsage
public void osenseSetNotification(Object request) {}

    @UnsupportedAppUsage
public void osenseSetCtrlData(Object request) {}

    @UnsupportedAppUsage
public void osenseClrCtrlData() {}

    @UnsupportedAppUsage
public void reportKeyThread(String threadName, int tid, int supportedEventId, Bundle extra) {}

    @UnsupportedAppUsage
public void removeKeyThread(int tid, Bundle extra) {}

    @UnsupportedAppUsage
public void removeKeyThread(String threadName, Bundle extra) {}

    @UnsupportedAppUsage
public void setHookKeyThread(String packageName, String threadName, int op, int pid, int[] tids) {}

    @UnsupportedAppUsage
public void reportEvent(int eventId, Bundle extra) {}

    @UnsupportedAppUsage
public void registerScene(int sceneId, Object listener) {}

    @UnsupportedAppUsage
public void unregisterScene(int sceneId, Object listener) {}

    @UnsupportedAppUsage
public int osenseGetModeStatus(int mode) {
        return 0;
    }

    @UnsupportedAppUsage
public long[][][] osenseGetPerfLimit() {
        return null;
    }

    @UnsupportedAppUsage
public void osenseSendFling(MotionEvent ev, int duration) {}
}
