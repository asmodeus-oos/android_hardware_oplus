/*
 * Copyright (C) 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.nec;

import android.content.Context;
import android.os.Bundle;
import android.compat.annotation.UnsupportedAppUsage;

public class OplusNecManager implements IOplusNecManager {
    private static OplusNecManager sInstance = null;

    public OplusNecManager(Context context) {}

    @UnsupportedAppUsage
public static OplusNecManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new OplusNecManager(context);
        }
        return sInstance;
    }

    @UnsupportedAppUsage
public void notifyNwDiagnoseInitComplete() {}
    @UnsupportedAppUsage
public void broadcastNecEvent(int slotId, int eventId, Bundle data) {}
    @UnsupportedAppUsage
public void broadcastServiceStateChanged(boolean oos, int slotId) {}
    @UnsupportedAppUsage
public void broadcastDataConnect(int slotId, String type) {}
    @UnsupportedAppUsage
public void broadcastOlkKeylog(int slotId, Bundle data) {}
    @UnsupportedAppUsage
public void broadcastDataConnectResult(int slotId, String type, boolean success) {}
    @UnsupportedAppUsage
public void broadcastVolteVopsOrSettingChanged(int slotId, int event, boolean isVolteEnabled) {}
    @UnsupportedAppUsage
public void broadcastDataDisconnect(int slotId, String type) {}
    @UnsupportedAppUsage
public void broadcastDataDisconnectComplete(int slotId, String type) {}
    @UnsupportedAppUsage
public void broadcastDataCallInternetProtocolType(int slotId, int protocol) {}
    @UnsupportedAppUsage
public void broadcastNoDataIconError(int slotId, int errorcode, int protocol, String cause) {}
    @UnsupportedAppUsage
public void broadcastNoDataFlowError(int slotId, int errorcode, String mNoDataFlowReason) {}
    @UnsupportedAppUsage
public void broadcastNoDataFlowRecoveryError(int slotId, int errorcode, String recovery) {}
    @UnsupportedAppUsage
public void broadcastFastRecoveryEvent(int slotId, int errorcode, String event) {}
    @UnsupportedAppUsage
public void broadcastSlowDataFlowError(int slotId, int errorcode, String score) {}
    @UnsupportedAppUsage
public void broadcastSlowDataFlowRecovery(int slotId, int errorcode, String score) {}
    @UnsupportedAppUsage
public void broadcastGameLargeDelayError(int slotId, int errorcode, String gameError) {}
    @UnsupportedAppUsage
public void broadcastLimitState(int slotId, boolean limitState) {}
    @UnsupportedAppUsage
public void broadcastScanQrCodeStats(int slotId, int errorcode, String QrSuccess) {}
    @UnsupportedAppUsage
public void broadcastPreferredNetworkMode(int slotId, int preferredMode) {}
    @UnsupportedAppUsage
public void broadcastDataEnabledChanged(int slotId, boolean enabled) {}
    @UnsupportedAppUsage
public void broadcastLostConnectionReason(int slotId, int errorcode, int lostReason) {}
    @UnsupportedAppUsage
public void broadcastAnrEventStat(int slotId, int errorcode, String anrEventStat) {}
    @UnsupportedAppUsage
public void broadcastHangUpDelayTimer(int slotId, long millis, int csOrIms) {}
    @UnsupportedAppUsage
public void broadcastCdmaResetActiveTimer(int slotId, int networkType) {}
    @UnsupportedAppUsage
public void broadcastPreciseCallStateChanged(int slotId, int ring, int foreground, int background, int cause, int preciseCause, int disconnectState) {}
    @UnsupportedAppUsage
public void broadcastSrvccStateChanged(int slotId, int srvccState) {}
    @UnsupportedAppUsage
public void broadcastCallError(int slotId, int event, int cause, int preciseCause, String desc, boolean isImsCall, boolean isIncoming) {}
    @UnsupportedAppUsage
public void broadcastVolteCallKeylog(int slotId, int event, String desc) {}
    @UnsupportedAppUsage
public void broadcastImsRegisterState(int slotId, boolean imsRegisterState) {}
    @UnsupportedAppUsage
public void broadcastRegInfoChanged(int voiceRegState, int voiceNetworkType, int dataRegState, int dataNetworkType, int slotId) {}
    @UnsupportedAppUsage
public void broadcastImsNetworkStateChanged(int phoneId, int errorCode, String errorMessage, int regState, int imsRat) {}
    @UnsupportedAppUsage
public void broadcastScreenShare(int phoneId) {}
    @UnsupportedAppUsage
public void broadcastScreenTouch(int phoneId, int screenTouchCount, int screenTouchSuccCount) {}
    @UnsupportedAppUsage
public void broadcastOnlineMeeting(int slotId, int errorcode, String record) {}
    @UnsupportedAppUsage
public void broadcastNetworkDiagnosis(int slotId, Bundle data) {}
    @UnsupportedAppUsage
public void broadcastDispatchedSmsId(int slotId, int errorCode, long messageId, boolean isWapPush, boolean isClass0, String mPackageName) {}
    @UnsupportedAppUsage
public void broadcastDispatchedMoSmsId(int slotId, int eventId, String networkType, int rat, int errorType, int errorCode, String success) {}
}
