/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzw;

public final class zzt$zza$zzc
extends Enum
implements zzcj {
    private static final zzck zzbq;
    private static final /* enum */ zzt$zza$zzc zzbs;
    private static final /* enum */ zzt$zza$zzc zzbt;
    private static final /* enum */ zzt$zza$zzc zzbu;
    private static final /* enum */ zzt$zza$zzc zzbv;
    private static final /* enum */ zzt$zza$zzc zzbw;
    private static final /* enum */ zzt$zza$zzc zzbx;
    private static final /* enum */ zzt$zza$zzc zzby;
    private static final /* enum */ zzt$zza$zzc zzbz;
    private static final /* enum */ zzt$zza$zzc zzca;
    private static final /* enum */ zzt$zza$zzc zzcb;
    private static final /* enum */ zzt$zza$zzc zzcc;
    private static final /* enum */ zzt$zza$zzc zzcd;
    private static final /* synthetic */ zzt$zza$zzc[] zzce;
    private final int value;

    static {
        zzt$zza$zzc zzt$zza$zzc;
        zzt$zza$zzc zzt$zza$zzc2;
        zzt$zza$zzc zzt$zza$zzc3;
        zzt$zza$zzc zzt$zza$zzc4;
        zzt$zza$zzc zzt$zza$zzc5;
        zzt$zza$zzc zzt$zza$zzc6;
        zzt$zza$zzc zzt$zza$zzc7;
        zzt$zza$zzc zzt$zza$zzc8;
        zzt$zza$zzc zzt$zza$zzc9;
        zzt$zza$zzc zzt$zza$zzc10;
        zzt$zza$zzc zzt$zza$zzc11;
        Object object = new zzt$zza$zzc("BUILD_TYPE_UNKNOWN", 0, 0);
        zzbs = object;
        int n3 = 1;
        zzbt = zzt$zza$zzc11 = new zzt$zza$zzc("BUILD_TYPE_PROD", n3, n3);
        int n4 = 2;
        zzbu = zzt$zza$zzc10 = new zzt$zza$zzc("BUILD_TYPE_INTERNAL", n4, n4);
        int n7 = 3;
        zzbv = zzt$zza$zzc9 = new zzt$zza$zzc("BUILD_TYPE_PRODLMP", n7, n7);
        int n8 = 4;
        zzbw = zzt$zza$zzc8 = new zzt$zza$zzc("BUILD_TYPE_THINGS", n8, n8);
        int n10 = 5;
        zzbx = zzt$zza$zzc7 = new zzt$zza$zzc("BUILD_TYPE_PRODMNC", n10, n10);
        int n14 = 6;
        zzby = zzt$zza$zzc6 = new zzt$zza$zzc("BUILD_TYPE_WEARABLE", n14, n14);
        n14 = 7;
        zzbz = zzt$zza$zzc5 = new zzt$zza$zzc("BUILD_TYPE_AUTO", n14, n14);
        n10 = 8;
        zzca = zzt$zza$zzc4 = new zzt$zza$zzc("BUILD_TYPE_SIDEWINDERMNC", n10, n10);
        n8 = 9;
        zzcb = zzt$zza$zzc3 = new zzt$zza$zzc("BUILD_TYPE_ATV", n8, n8);
        n7 = 10;
        zzcc = zzt$zza$zzc2 = new zzt$zza$zzc("BUILD_TYPE_PRODPIX", n7, n7);
        n4 = 11;
        zzcd = zzt$zza$zzc = new zzt$zza$zzc("BUILD_TYPE_PRODPI", n4, n4);
        zzt$zza$zzc[] zzt$zza$zzcArray = new zzt$zza$zzc[12];
        zzt$zza$zzcArray[0] = object;
        zzt$zza$zzcArray[n3] = zzt$zza$zzc11;
        zzt$zza$zzcArray[2] = zzt$zza$zzc10;
        zzt$zza$zzcArray[3] = zzt$zza$zzc9;
        zzt$zza$zzcArray[4] = zzt$zza$zzc8;
        zzt$zza$zzcArray[5] = zzt$zza$zzc7;
        zzt$zza$zzcArray[6] = zzt$zza$zzc6;
        zzt$zza$zzcArray[7] = zzt$zza$zzc5;
        zzt$zza$zzcArray[8] = zzt$zza$zzc4;
        zzt$zza$zzcArray[9] = zzt$zza$zzc3;
        zzt$zza$zzcArray[10] = zzt$zza$zzc2;
        zzt$zza$zzcArray[n4] = zzt$zza$zzc;
        zzce = zzt$zza$zzcArray;
        zzbq = object = new zzw();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzt$zza$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzt$zza$zzc[] values() {
        return (zzt$zza$zzc[])zzce.clone();
    }

    public static zzt$zza$zzc zzc(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 11: {
                return zzcd;
            }
            case 10: {
                return zzcc;
            }
            case 9: {
                return zzcb;
            }
            case 8: {
                return zzca;
            }
            case 7: {
                return zzbz;
            }
            case 6: {
                return zzby;
            }
            case 5: {
                return zzbx;
            }
            case 4: {
                return zzbw;
            }
            case 3: {
                return zzbv;
            }
            case 2: {
                return zzbu;
            }
            case 1: {
                return zzbt;
            }
            case 0: 
        }
        return zzbs;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}

