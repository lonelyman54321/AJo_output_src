/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public abstract class zzgaw {
    public static int zze(int n3, int n4) {
        int n7 = n3 >> 1;
        if ((n3 = n3 + n7 + 1) < n4) {
            n3 = Integer.highestOneBit(n4 += -1);
            n3 += n3;
        }
        if (n3 < 0) {
            n3 = -1 >>> 1;
        }
        return n3;
    }

    public abstract zzgaw zzb(Object var1);
}

