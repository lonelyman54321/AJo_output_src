/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzar;
import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;

public final class zzap$zza$zzb
extends Enum
implements zzcj {
    private static final zzck zzbq;
    private static final /* enum */ zzap$zza$zzb zzet;
    private static final /* enum */ zzap$zza$zzb zzeu;
    private static final /* enum */ zzap$zza$zzb zzev;
    private static final /* synthetic */ zzap$zza$zzb[] zzew;
    private final int value;

    static {
        zzap$zza$zzb zzap$zza$zzb;
        zzap$zza$zzb zzap$zza$zzb2;
        Object object = new zzap$zza$zzb("UNKNOWN", 0, 0);
        zzet = object;
        int n3 = 1;
        zzeu = zzap$zza$zzb2 = new zzap$zza$zzb("ON", n3, n3);
        int n4 = 2;
        zzev = zzap$zza$zzb = new zzap$zza$zzb("OFF", n4, n4);
        zzap$zza$zzb[] zzap$zza$zzbArray = new zzap$zza$zzb[3];
        zzap$zza$zzbArray[0] = object;
        zzap$zza$zzbArray[n3] = zzap$zza$zzb2;
        zzap$zza$zzbArray[n4] = zzap$zza$zzb;
        zzew = zzap$zza$zzbArray;
        zzbq = object = new zzar();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzap$zza$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzap$zza$zzb[] values() {
        return (zzap$zza$zzb[])zzew.clone();
    }

    public static zzck zzd() {
        return zzbq;
    }

    public static zzap$zza$zzb zze(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return zzev;
            }
            return zzeu;
        }
        return zzet;
    }

    public final int zzc() {
        return this.value;
    }
}

