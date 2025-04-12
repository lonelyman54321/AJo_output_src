/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.view.Display
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

final class zzabh {
    /*
     * WARNING - void declaration
     */
    public static boolean zza(Context object) {
        int n3;
        void var0_4;
        DisplayManager displayManager = (DisplayManager)object.getSystemService("display");
        boolean bl2 = false;
        if (displayManager != null) {
            Display display = displayManager.getDisplay(0);
        } else {
            Object var0_3 = null;
        }
        if (var0_4 != null && (n3 = VL1.a((Display)var0_4)) != 0) {
            for (int n4 : XL1.a(WL1.a((Display)var0_4))) {
                int n7 = 1;
                if (n4 != n7) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }
}

