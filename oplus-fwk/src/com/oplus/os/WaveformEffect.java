/*
 * Copyright (C) 2022 The Nameless-AOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Slog;
import android.compat.annotation.UnsupportedAppUsage;

public class WaveformEffect implements Parcelable {

    private static final String TAG = "WaveformEffect";
@UnsupportedAppUsage
    public static final Parcelable.Creator<WaveformEffect> CREATOR =
            new Parcelable.Creator<WaveformEffect>() {
        @Override
        @UnsupportedAppUsage
public WaveformEffect createFromParcel(Parcel in) {
            return new WaveformEffect(in);
        }

        @Override
        @UnsupportedAppUsage
public WaveformEffect[] newArray(int size) {
            return new WaveformEffect[size];
        }
    };

    private int mEffectType;
    private boolean mEffectLoop;
    private boolean mStrengthSettingEnabled;

    private WaveformEffect() {
        mEffectType = -1;
        mEffectLoop = false;
        mStrengthSettingEnabled = false;
    }

    @UnsupportedAppUsage
public int getEffectType() {
        return mEffectType;
    }

    @UnsupportedAppUsage
public boolean getEffectLoop() {
        return mEffectLoop;
    }

    @UnsupportedAppUsage
public boolean getStrengthSettingEnabled() {
        return mStrengthSettingEnabled;
    }

    public static class Builder {
        private int mEffectType;
        private boolean mEffectLoop;
        private boolean mStrengthSettingEnabled;

        @UnsupportedAppUsage
public Builder() {
            mEffectType = -1;
            mEffectLoop = false;
            mStrengthSettingEnabled = false;
        }

        @UnsupportedAppUsage
public Builder(WaveformEffect effect) {
            mEffectType = -1;
            mEffectLoop = false;
            mStrengthSettingEnabled = false;
        }

        @UnsupportedAppUsage
public WaveformEffect build() {
            WaveformEffect effect = new WaveformEffect();
            effect.mEffectType = mEffectType;
            effect.mEffectLoop = mEffectLoop;
            effect.mStrengthSettingEnabled = mStrengthSettingEnabled;
            return effect;
        }

        @UnsupportedAppUsage
public Builder setEffectType(int type) {
            mEffectType = type;
            return this;
        }

        @UnsupportedAppUsage
public Builder setEffectLoop(boolean loop) {
            mEffectLoop = loop;
            return this;
        }

        @UnsupportedAppUsage
public Builder setStrengthSettingEnabled(boolean enabled) {
            mStrengthSettingEnabled = enabled;
            return this;
        }
    }

    @Override
    @UnsupportedAppUsage
public int describeContents() {
        return 0;
    }

    @Override
    @UnsupportedAppUsage
public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mEffectType);
        dest.writeBoolean(mEffectLoop);
        dest.writeBoolean(mStrengthSettingEnabled);
    }

    private WaveformEffect(Parcel in) {
        mEffectType = in.readInt();
        mEffectLoop = in.readBoolean();
        mStrengthSettingEnabled = in.readBoolean();
    }

    @Override
    @UnsupportedAppUsage
public String toString() {
        return String.valueOf(mEffectType);
    }
}
