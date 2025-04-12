/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.Logger;

class BatteryState {
    static final int VELOCITY_CHARGING = 2;
    static final int VELOCITY_FULL = 3;
    static final int VELOCITY_UNPLUGGED = 1;
    private final Float level;
    private final boolean powerConnected;

    private BatteryState(Float f5, boolean bl2) {
        this.powerConnected = bl2;
        this.level = f5;
    }

    public static BatteryState get(Context object) {
        Float f5;
        boolean bl2;
        block6: {
            bl2 = false;
            f5 = null;
            String string2 = "android.intent.action.BATTERY_CHANGED";
            Object object2 = new IntentFilter(string2);
            object = object.registerReceiver(null, (IntentFilter)object2);
            if (object == null) break block6;
            bl2 = BatteryState.isPowerConnected((Intent)object);
            try {
                f5 = BatteryState.getLevel((Intent)object);
            }
            catch (IllegalStateException illegalStateException) {
                object2 = Logger.getLogger();
                string2 = "An error occurred getting battery state.";
                ((Logger)object2).e(string2, illegalStateException);
            }
        }
        object = new BatteryState(f5, bl2);
        return object;
    }

    private static Float getLevel(Intent intent) {
        String string2 = "level";
        int n3 = -1;
        int n4 = intent.getIntExtra(string2, n3);
        String string3 = "scale";
        int n7 = intent.getIntExtra(string3, n3);
        if (n4 != n3 && n7 != n3) {
            float f5 = n4;
            float f6 = n7;
            return Float.valueOf(f5 / f6);
        }
        return null;
    }

    private static boolean isPowerConnected(Intent intent) {
        int n3 = -1;
        int n4 = intent.getIntExtra("status", n3);
        boolean bl2 = false;
        if (n4 == n3) {
            return false;
        }
        n3 = 2;
        if (n4 == n3 || n4 == (n3 = 5)) {
            bl2 = true;
        }
        return bl2;
    }

    public Float getBatteryLevel() {
        return this.level;
    }

    public int getBatteryVelocity() {
        Float f5;
        boolean bl2 = this.powerConnected;
        if (bl2 && (f5 = this.level) != null) {
            double d2;
            float f6 = f5.floatValue();
            double d5 = f6;
            double d7 = d5 - (d2 = 0.99);
            Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
            if (object < 0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    public boolean isPowerConnected() {
        return this.powerConnected;
    }
}

