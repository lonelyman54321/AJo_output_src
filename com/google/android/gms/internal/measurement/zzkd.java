/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

final class zzkd
extends Enum {
    public static final /* enum */ zzkd zza;
    public static final /* enum */ zzkd zzb;
    public static final /* enum */ zzkd zzc;
    public static final /* enum */ zzkd zzd;
    private static final /* synthetic */ zzkd[] zze;

    static {
        zzkd zzkd2;
        zzkd zzkd3;
        zzkd zzkd4;
        zzkd zzkd5;
        zza = zzkd5 = new zzkd("SCALAR", 0, false);
        int n3 = 1;
        zzb = zzkd4 = new zzkd("VECTOR", n3, n3 != 0);
        int n4 = 2;
        zzc = zzkd3 = new zzkd("PACKED_VECTOR", n4, n3 != 0);
        int n7 = 3;
        zzd = zzkd2 = new zzkd("MAP", n7, false);
        zzkd[] zzkdArray = new zzkd[4];
        zzkdArray[0] = zzkd5;
        zzkdArray[n3] = zzkd4;
        zzkdArray[n4] = zzkd3;
        zzkdArray[n7] = zzkd2;
        zze = zzkdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzkd() {
        void var2_1;
        void var1_-1;
    }

    public static zzkd[] values() {
        return (zzkd[])zze.clone();
    }
}

