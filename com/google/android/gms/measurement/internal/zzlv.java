/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

public final class zzlv
extends Enum {
    public static final /* enum */ zzlv zza;
    public static final /* enum */ zzlv zzb;
    private static final /* enum */ zzlv zzc;
    private static final /* synthetic */ zzlv[] zzd;
    private final int zze;

    static {
        zzlv zzlv2;
        zzlv zzlv3;
        zzlv zzlv4;
        zzc = zzlv4 = new zzlv("UNKNOWN", 0, 0);
        int n3 = 1;
        zza = zzlv3 = new zzlv("SUCCESS", n3, n3);
        int n4 = 2;
        zzb = zzlv2 = new zzlv("FAILURE", n4, n4);
        zzlv[] zzlvArray = new zzlv[3];
        zzlvArray[0] = zzlv4;
        zzlvArray[n3] = zzlv3;
        zzlvArray[n4] = zzlv2;
        zzd = zzlvArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzlv() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzlv[] values() {
        return (zzlv[])zzd.clone();
    }

    public final int zza() {
        return this.zze;
    }
}

