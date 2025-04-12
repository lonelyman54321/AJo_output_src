/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

public final class zzan {
    /*
     * Unable to fully structure code
     */
    public static int zza(int var0) {
        var1_1 = 100;
        var2_2 = 1;
        if (var0 == var1_1 || var0 == (var1_1 = 102) || var0 == (var1_1 = 104)) ** GOTO lbl7
        var1_1 = 105;
        if (var0 == var1_1) {
            var0 = 105;
lbl7:
            // 2 sources

            var1_1 = 1;
        } else {
            var1_1 = 0;
        }
        var3_3 = var0;
        var4_4 = new Object[var2_2];
        var4_4[0] = var3_3;
        Preconditions.checkArgument((boolean)var1_1, "priority %d must be a Priority.PRIORITY_* constant", var4_4);
        return var0;
    }

    public static String zzb(int n3) {
        int n4 = 100;
        if (n3 != n4) {
            n4 = 102;
            if (n3 != n4) {
                n4 = 104;
                if (n3 != n4) {
                    n4 = 105;
                    if (n3 == n4) {
                        return "PASSIVE";
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                    throw illegalArgumentException;
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }
}

