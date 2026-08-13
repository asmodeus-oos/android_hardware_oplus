/*
 * SPDX-FileCopyrightText: 2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.evolution;

import java.util.HashMap;
import java.util.Map;
import android.compat.annotation.UnsupportedAppUsage;

public class NetworklessDevice {
    @UnsupportedAppUsage
    public static final NetworklessDevice DEFAULT = new NetworklessDevice();
@UnsupportedAppUsage
public static final int CAPABILITY_ID_BR = 1;
    public static final int CAPABILITY_ID_BT = 2;
    public static final int CAPABILITY_ID_NB = 4;
    public static final int CAPABILITYR_ID_WB = 8;
    public static final int CAPABILITY_ID_BLR = 16;
@UnsupportedAppUsage
protected int mAbility = 0;
    protected Map<Integer, String> mAddress = new HashMap<>();
    protected int mCapabilitMask = 0;
    protected String mChangeMacHash = null;
    protected String mDeviceId = null;
    protected String[] mMsisdnHash = new String[0];
    protected String mNickName = null;
    protected int mOperatingMode = 0;
    protected byte mSalt = 0;
    protected String mShortMacHash = null;

    @UnsupportedAppUsage
public int getAbility() {
        return mAbility;
    }

    @UnsupportedAppUsage
public Map<Integer, String> getAddressMap() {
        return mAddress;
    }

    @UnsupportedAppUsage
public int getCapabilityMask() {
        return mCapabilitMask;
    }

    @UnsupportedAppUsage
public String getChangeMacHash() {
        return mChangeMacHash;
    }

    @UnsupportedAppUsage
public String getDeviceId() {
        return mDeviceId;
    }

    @UnsupportedAppUsage
public String[] getMsisdnHash() {
        return mMsisdnHash;
    }

    @UnsupportedAppUsage
public String getNickName() {
        return mNickName;
    }

    @UnsupportedAppUsage
public int getOperatingMode() {
        return mOperatingMode;
    }

    @UnsupportedAppUsage
public byte getSalt() {
        return mSalt;
    }

    @UnsupportedAppUsage
public String getShortMacHash() {
        return mShortMacHash;
    }

    @UnsupportedAppUsage
public void setAbility(int ability) {
        mAbility = ability;
    }

    @UnsupportedAppUsage
public void setAddressMap(Map<Integer, String> map) {
        mAddress = map != null ? map : new HashMap<>();
    }

    @UnsupportedAppUsage
public void setCapabilityMask(int mask) {
        mCapabilitMask = mask;
    }

    @UnsupportedAppUsage
public void setChangeMacHash(String hash) {
        mChangeMacHash = hash;
    }

    @UnsupportedAppUsage
public void setDeviceId(String id) {
        mDeviceId = id;
    }

    @UnsupportedAppUsage
public void setMsisdnHash(String[] arr) {
        mMsisdnHash = (arr != null) ? arr : new String[0];
    }

    @UnsupportedAppUsage
public void setNickName(String name) {
        mNickName = name;
    }

    @UnsupportedAppUsage
public void setOperatingMode(int mode) {
        mOperatingMode = mode;
    }

    @UnsupportedAppUsage
public void setSalt(byte salt) {
        mSalt = salt;
    }

    @UnsupportedAppUsage
public void setShortMacHash(String hash) {
        mShortMacHash = hash;
    }
}
