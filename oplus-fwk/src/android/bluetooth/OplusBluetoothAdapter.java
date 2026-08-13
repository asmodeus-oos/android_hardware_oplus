package android.bluetooth;

import android.compat.annotation.UnsupportedAppUsage;

public class OplusBluetoothAdapter {

    private static OplusBluetoothAdapter sAdapter = null;
    
    @UnsupportedAppUsage
public static OplusBluetoothAdapter getOplusBluetoothAdapter() {
        if (sAdapter == null) {
            sAdapter = new OplusBluetoothAdapter();
        }
        return sAdapter;
    }
}
