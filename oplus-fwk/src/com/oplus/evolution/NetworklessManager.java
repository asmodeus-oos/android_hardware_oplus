/*
 * SPDX-FileCopyrightText: 2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.evolution;

import android.net.Uri;
import android.content.Context;
import android.os.Bundle;
import android.compat.annotation.UnsupportedAppUsage;

import com.android.internal.telephony.IIntegerConsumer;

import com.oplus.evolution.NetworklessDevice;
import com.oplus.internal.evolution.INetworklessCallback;
import com.oplus.internal.evolution.INetworklessConsumer;

import java.util.List;

public class NetworklessManager {
    private static NetworklessManager sInstance = null;

    public NetworklessManager(Context context) {}

    @UnsupportedAppUsage
public static NetworklessManager getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new NetworklessManager(context);
        }
        return sInstance;
    }

    @UnsupportedAppUsage
public int getCallState(String subId) {
        return 0;
    }

    @UnsupportedAppUsage
public boolean getCommunictionForSub(String subId, int type) {
        return false;
    }

    @UnsupportedAppUsage
public List<NetworklessDevice> getCurrentScanDevice(String subId) {
        return null;
    }

    @UnsupportedAppUsage
public String getMsisdnHash(String subId, int a, int b, int c) {
        return null;
    }

    @UnsupportedAppUsage
public String getNickName(String subId) {
        return null;
    }

    @UnsupportedAppUsage
public int getOperatingMode(String subId) {
        return 0;
    }

    @UnsupportedAppUsage
public boolean isNetworklessEnable(String subId) {
        return false;
    }

    @UnsupportedAppUsage
public void placeNetworklessCall(String subId, String caller, String callee, String token,
            String extInfo, IIntegerConsumer consumer) {}

    @UnsupportedAppUsage
public boolean registerNetworklessCallback(String subId, int[] eventList,
            INetworklessCallback callback) {
        return false;
    }

    @UnsupportedAppUsage
public void sendRawMessage(String subId, long token, String dest, int msgType,
            Bundle bundle, byte[] payload, INetworklessConsumer consumer) {}

    @UnsupportedAppUsage
public void sendRawMessageUri(String subId, long token, String dest, int msgType,
            Bundle bundle, Uri uri, INetworklessConsumer consumer) {}

    @UnsupportedAppUsage
public void sendTextMessage(String subId, long token, String dest, int msgType, String text,
            INetworklessConsumer consumer) {}

    @UnsupportedAppUsage
public void setAudioParameters(String params) {}

    @UnsupportedAppUsage
public boolean setCommunictionForSub(String subId, int type, boolean enabled) {
        return false;
    }

    @UnsupportedAppUsage
public boolean setNetworklessEnable(String subId, boolean enabled) {
        return false;
    }

    @UnsupportedAppUsage
public boolean setNickName(String subId, String name) {
        return false;
    }

    @UnsupportedAppUsage
public boolean setOperatingMode(String subId, int mode) {
        return false;
    }

    @UnsupportedAppUsage
public boolean startScanDevices(String subId) {
        return false;
    }

    @UnsupportedAppUsage
public void stimulateBlr(String subId) {}

    @UnsupportedAppUsage
public boolean stopScanDevices(String subId) {
        return false;
    }

    @UnsupportedAppUsage
public boolean unregisterNetworklessCallback(String subId, INetworklessCallback callback) {
        return false;
    }
}
