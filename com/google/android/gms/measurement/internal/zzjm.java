/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

public final class zzjm
extends Enum {
    public static final /* enum */ zzjm zza;
    public static final /* enum */ zzjm zzb;
    public static final /* enum */ zzjm zzc;
    public static final /* enum */ zzjm zzd;
    private static final /* synthetic */ zzjm[] zze;
    private final String zzf;

    static {
        zzjm zzjm2;
        zzjm zzjm3;
        zzjm zzjm4;
        zzjm zzjm5;
        zza = zzjm5 = new zzjm("UNINITIALIZED", 0, "uninitialized");
        int n3 = 1;
        zzb = zzjm4 = new zzjm("POLICY", n3, "eu_consent_policy");
        int n4 = 2;
        zzc = zzjm3 = new zzjm("DENIED", n4, "denied");
        int n7 = 3;
        zzd = zzjm2 = new zzjm("GRANTED", n7, "granted");
        zzjm[] zzjmArray = new zzjm[4];
        zzjmArray[0] = zzjm5;
        zzjmArray[n3] = zzjm4;
        zzjmArray[n4] = zzjm3;
        zzjmArray[n7] = zzjm2;
        zze = zzjmArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzjm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzjm[] values() {
        return (zzjm[])zze.clone();
    }

    public final String toString() {
        return this.zzf;
    }
}

