/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

public final class zzq {
    /*
     * Unable to fully structure code
     */
    public static int zza(int var0) {
        var1_1 = 1;
        if (var0 == 0 || var0 == var1_1) ** GOTO lbl6
        var2_2 = 2;
        if (var0 == var2_2) {
            var0 = 2;
lbl6:
            // 2 sources

            var2_2 = 1;
        } else {
            var2_2 = 0;
        }
        var3_3 = var0;
        var4_4 = new Object[var1_1];
        var4_4[0] = var3_3;
        Preconditions.checkArgument((boolean)var2_2, "granularity %d must be a Granularity.GRANULARITY_* constant", var4_4);
        return var0;
    }

    public static String zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    return "GRANULARITY_FINE";
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                throw illegalArgumentException;
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }
}

