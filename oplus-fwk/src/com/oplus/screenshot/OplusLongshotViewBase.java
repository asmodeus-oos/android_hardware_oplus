package com.oplus.screenshot;

import android.content.Context;
import android.compat.annotation.UnsupportedAppUsage;

public interface OplusLongshotViewBase {

    boolean canLongScroll();

    int computeLongScrollExtent();

    int computeLongScrollOffset();

    int computeLongScrollRange();

    boolean findViewsLongshotInfo(OplusLongshowViewInfo oplusLongshowViewInfo);

    Context getContext();

    boolean isLongshotVisibleToUser();
}
