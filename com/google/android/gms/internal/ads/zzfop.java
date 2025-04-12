/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfop
extends Enum {
    public static final /* enum */ zzfop zza;
    public static final /* enum */ zzfop zzb;
    public static final /* enum */ zzfop zzc;
    private static final /* synthetic */ zzfop[] zzd;
    private final String zze;

    static {
        zzfop zzfop2;
        zzfop zzfop3;
        zzfop zzfop4;
        zza = zzfop4 = new zzfop("CTV", 0, "ctv");
        int n3 = 1;
        zzb = zzfop3 = new zzfop("MOBILE", n3, "mobile");
        int n4 = 2;
        zzc = zzfop2 = new zzfop("OTHER", n4, "other");
        zzfop[] zzfopArray = new zzfop[3];
        zzfopArray[0] = zzfop4;
        zzfopArray[n3] = zzfop3;
        zzfopArray[n4] = zzfop2;
        zzd = zzfopArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfop() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfop[] values() {
        return (zzfop[])zzd.clone();
    }

    public final String toString() {
        return this.zze;
    }
}

