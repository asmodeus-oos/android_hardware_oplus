package android.os;

import android.view.KeyEvent;
import android.compat.annotation.UnsupportedAppUsage;

public class OplusKeyEventManager {

    public interface OnKeyEventObserver {
        void onKeyEvent(KeyEvent event); 
    }
}
