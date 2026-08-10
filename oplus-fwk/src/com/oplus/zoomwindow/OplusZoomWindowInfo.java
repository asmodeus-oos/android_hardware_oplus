package com.oplus.zoomwindow;

import android.os.Parcel;
import android.os.Parcelable;
import android.compat.annotation.UnsupportedAppUsage;

public class OplusZoomWindowInfo implements Parcelable {
@UnsupportedAppUsage
    public static final Parcelable.Creator<OplusZoomWindowInfo> CREATOR =
            new Parcelable.Creator<OplusZoomWindowInfo>() {

        @Override
        @UnsupportedAppUsage
public OplusZoomWindowInfo createFromParcel(Parcel source) {
            return new OplusZoomWindowInfo(source);
        }

        @Override
        @UnsupportedAppUsage
public OplusZoomWindowInfo[] newArray(int size) {
            return new OplusZoomWindowInfo[size];
        }
    };

    public OplusZoomWindowInfo() {}

    public OplusZoomWindowInfo(Parcel in) {}

    public OplusZoomWindowInfo(OplusZoomWindowInfo in) {}

    @Override
    @UnsupportedAppUsage
public int describeContents() {
        return 0;
    }

    @Override
    @UnsupportedAppUsage
public void writeToParcel(Parcel dest, int flags) {}

    @UnsupportedAppUsage
public void readFromParcel(Parcel in) {}
}
