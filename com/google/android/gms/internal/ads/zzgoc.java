/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgod;

public final class zzgoc {
    public static boolean zza(int n3) {
        boolean bl2 = true;
        if ((n3 += -1) != 0) {
            Boolean bl3;
            n3 = (int)(zzgod.zzb() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)((bl3 = zzgod.zza()).booleanValue() ? 1 : 0)) == 0) {
                return false;
            }
            return bl2;
        }
        n3 = (int)(zzgod.zzb() ? 1 : 0);
        if (n3 == 0) {
            return bl2;
        }
        return false;
    }
}

