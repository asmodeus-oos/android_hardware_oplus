package android.app;

import android.content.Context;
import android.compat.annotation.UnsupportedAppUsage;

import java.util.ArrayList;

public class OplusWhiteListManager {

    public OplusWhiteListManager(Context context) {}

    @UnsupportedAppUsage
public ArrayList<String> getStageProtectListFromPkg(String calledPkg, int type) {
        return new ArrayList<>();
    }

    @UnsupportedAppUsage
public void addStageProtectInfo(String pkg, long timeout) {}

    @UnsupportedAppUsage
public void removeStageProtectInfo(String pkg) {}
}
