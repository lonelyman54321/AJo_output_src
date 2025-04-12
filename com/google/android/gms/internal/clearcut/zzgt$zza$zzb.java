/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgv;

public final class zzgt$zza$zzb
extends Enum
implements zzcj {
    private static final /* enum */ zzgt$zza$zzb zzbim;
    private static final /* enum */ zzgt$zza$zzb zzbin;
    private static final /* enum */ zzgt$zza$zzb zzbio;
    private static final /* synthetic */ zzgt$zza$zzb[] zzbip;
    private static final zzck zzbq;
    private final int value;

    static {
        zzgt$zza$zzb zzgt$zza$zzb;
        zzgt$zza$zzb zzgt$zza$zzb2;
        Object object = new zzgt$zza$zzb("NO_RESTRICTION", 0, 0);
        zzbim = object;
        int n3 = 1;
        zzbin = zzgt$zza$zzb2 = new zzgt$zza$zzb("SIDEWINDER_DEVICE", n3, n3);
        int n4 = 2;
        zzbio = zzgt$zza$zzb = new zzgt$zza$zzb("LATCHSKY_DEVICE", n4, n4);
        zzgt$zza$zzb[] zzgt$zza$zzbArray = new zzgt$zza$zzb[3];
        zzgt$zza$zzbArray[0] = object;
        zzgt$zza$zzbArray[n3] = zzgt$zza$zzb2;
        zzgt$zza$zzbArray[n4] = zzgt$zza$zzb;
        zzbip = zzgt$zza$zzbArray;
        zzbq = object = new zzgv();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgt$zza$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzgt$zza$zzb[] values() {
        return (zzgt$zza$zzb[])zzbip.clone();
    }

    public static zzgt$zza$zzb zzbe(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return zzbio;
            }
            return zzbin;
        }
        return zzbim;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}

