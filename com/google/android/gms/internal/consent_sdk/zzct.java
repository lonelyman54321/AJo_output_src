/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

public final class zzct {
    public static boolean zza(boolean n3) {
        n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        String string2 = "generic";
        if (n3 >= n4) {
            String string3;
            String string4 = Build.FINGERPRINT;
            n4 = (int)(string4.contains(string2) ? 1 : 0);
            return n4 != 0 || (n3 = (int)(string4.contains(string3 = "emulator") ? 1 : 0)) != 0 || (n3 = (int)((string4 = Build.HARDWARE).contains(string3 = "ranchu") ? 1 : 0)) != 0;
            {
            }
        }
        return Build.DEVICE.startsWith(string2);
    }
}

