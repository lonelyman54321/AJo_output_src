/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbl;
import com.google.android.gms.internal.clearcut.zzbm;
import com.google.android.gms.internal.clearcut.zzco;

public abstract class zzbk {
    private static volatile boolean zzft = true;
    private int zzfq = 100;
    private int zzfr = -1 >>> 1;
    private boolean zzfs = false;

    private zzbk() {
    }

    public /* synthetic */ zzbk(zzbl zzbl2) {
        this();
    }

    public static long zza(long l2) {
        long l3 = l2 >>> 1;
        return -(l2 & 1L) ^ l3;
    }

    public static zzbk zza(byte[] byArray, int n3, int n4, boolean bl2) {
        Object object = new zzbm(byArray, 0, n4, false, null);
        try {
            ((zzbm)object).zzl(n4);
            return object;
        }
        catch (zzco zzco2) {
            object = new IllegalArgumentException(zzco2);
            throw object;
        }
    }

    public static int zzm(int n3) {
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public abstract int zzaf();

    public abstract int zzl(int var1);
}

