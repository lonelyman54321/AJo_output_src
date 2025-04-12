/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;

public final class zzgec {
    /*
     * WARNING - void declaration
     */
    public static byte zza(long l2) {
        void var2_4;
        int bl2 = 8;
        long l3 = l2 >> bl2;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        zzfyg.zzg((boolean)var2_4, "out of range: %s", l2);
        return (byte)l2;
    }
}

