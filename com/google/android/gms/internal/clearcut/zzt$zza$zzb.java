/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzv;

public final class zzt$zza$zzb
extends Enum
implements zzcj {
    private static final /* enum */ zzt$zza$zzb zzbh;
    private static final /* enum */ zzt$zza$zzb zzbi;
    private static final /* enum */ zzt$zza$zzb zzbj;
    private static final /* enum */ zzt$zza$zzb zzbk;
    private static final /* enum */ zzt$zza$zzb zzbl;
    private static final /* enum */ zzt$zza$zzb zzbm;
    private static final /* enum */ zzt$zza$zzb zzbn;
    private static final /* enum */ zzt$zza$zzb zzbo;
    private static final /* enum */ zzt$zza$zzb zzbp;
    private static final zzck zzbq;
    private static final /* synthetic */ zzt$zza$zzb[] zzbr;
    private final int value;

    static {
        zzt$zza$zzb zzt$zza$zzb;
        zzt$zza$zzb zzt$zza$zzb2;
        zzt$zza$zzb zzt$zza$zzb3;
        zzt$zza$zzb zzt$zza$zzb4;
        zzt$zza$zzb zzt$zza$zzb5;
        zzt$zza$zzb zzt$zza$zzb6;
        zzt$zza$zzb zzt$zza$zzb7;
        zzt$zza$zzb zzt$zza$zzb8;
        Object object = new zzt$zza$zzb("ARCH_UNKNOWN", 0, 0);
        zzbh = object;
        int n3 = 1;
        zzbi = zzt$zza$zzb8 = new zzt$zza$zzb("ARCH_NON_NATIVE", n3, n3);
        int n4 = 2;
        zzbj = zzt$zza$zzb7 = new zzt$zza$zzb("ARCH_ARMV5", n4, n4);
        int n7 = 3;
        int n8 = 4;
        zzbk = zzt$zza$zzb6 = new zzt$zza$zzb("ARCH_ARMV7", n7, n8);
        int n10 = 5;
        zzbl = zzt$zza$zzb5 = new zzt$zza$zzb("ARCH_ARM64", n8, n10);
        int n14 = 6;
        zzbm = zzt$zza$zzb4 = new zzt$zza$zzb("ARCH_MIPS", n10, n14);
        int n15 = 7;
        zzbn = zzt$zza$zzb3 = new zzt$zza$zzb("ARCH_MIPS_64", n14, n15);
        n10 = 8;
        zzbo = zzt$zza$zzb2 = new zzt$zza$zzb("ARCH_X86", n15, n10);
        n8 = 9;
        zzbp = zzt$zza$zzb = new zzt$zza$zzb("ARCH_X86_64", n10, n8);
        zzt$zza$zzb[] zzt$zza$zzbArray = new zzt$zza$zzb[n8];
        zzt$zza$zzbArray[0] = object;
        zzt$zza$zzbArray[n3] = zzt$zza$zzb8;
        zzt$zza$zzbArray[n4] = zzt$zza$zzb7;
        zzt$zza$zzbArray[n7] = zzt$zza$zzb6;
        zzt$zza$zzbArray[4] = zzt$zza$zzb5;
        zzt$zza$zzbArray[5] = zzt$zza$zzb4;
        zzt$zza$zzbArray[6] = zzt$zza$zzb3;
        zzt$zza$zzbArray[7] = zzt$zza$zzb2;
        zzt$zza$zzbArray[n10] = zzt$zza$zzb;
        zzbr = zzt$zza$zzbArray;
        zzbq = object = new zzv();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzt$zza$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzt$zza$zzb[] values() {
        return (zzt$zza$zzb[])zzbr.clone();
    }

    public static zzt$zza$zzb zza(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 9: {
                return zzbp;
            }
            case 8: {
                return zzbo;
            }
            case 7: {
                return zzbn;
            }
            case 6: {
                return zzbm;
            }
            case 5: {
                return zzbl;
            }
            case 4: {
                return zzbk;
            }
            case 2: {
                return zzbj;
            }
            case 1: {
                return zzbi;
            }
            case 0: 
        }
        return zzbh;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}

