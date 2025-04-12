/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

final class zzix
extends Enum {
    public static final /* enum */ zzix zza;
    public static final /* enum */ zzix zzb;
    public static final /* enum */ zzix zzc;
    public static final /* enum */ zzix zzd;
    private static final /* synthetic */ zzix[] zzf;
    private final boolean zze;

    static {
        zzix zzix2;
        zzix zzix3;
        zzix zzix4;
        zzix zzix5;
        zza = zzix5 = new zzix("SCALAR", 0, false);
        int n3 = 1;
        zzb = zzix4 = new zzix("VECTOR", n3, n3 != 0);
        int n4 = 2;
        zzc = zzix3 = new zzix("PACKED_VECTOR", n4, n3 != 0);
        int n7 = 3;
        zzd = zzix2 = new zzix("MAP", n7, false);
        zzix[] zzixArray = new zzix[4];
        zzixArray[0] = zzix5;
        zzixArray[n3] = zzix4;
        zzixArray[n4] = zzix3;
        zzixArray[n7] = zzix2;
        zzf = zzixArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzix() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzix[] values() {
        return (zzix[])zzf.clone();
    }
}

