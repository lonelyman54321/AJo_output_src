/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

public final class zzuj
extends Enum {
    public static final /* enum */ zzuj zza;
    public static final /* enum */ zzuj zzb;
    public static final /* enum */ zzuj zzc;
    public static final /* enum */ zzuj zzd;
    public static final /* enum */ zzuj zze;
    private static final /* synthetic */ zzuj[] zzf;

    static {
        zzuj zzuj2;
        zzuj zzuj3;
        zzuj zzuj4;
        zzuj zzuj5;
        zzuj zzuj6;
        zza = zzuj6 = new zzuj("SMALL", 0, 10);
        int n3 = 1;
        zzb = zzuj5 = new zzuj("MEDIUM", n3, 20);
        int n4 = 2;
        zzc = zzuj4 = new zzuj("LARGE", n4, 50);
        int n7 = 3;
        zzd = zzuj3 = new zzuj("FULL", n7, -1);
        int n8 = 4;
        zze = zzuj2 = new zzuj("NONE", n8, 0);
        zzuj[] zzujArray = new zzuj[5];
        zzujArray[0] = zzuj6;
        zzujArray[n3] = zzuj5;
        zzujArray[n4] = zzuj4;
        zzujArray[n7] = zzuj3;
        zzujArray[n8] = zzuj2;
        zzf = zzujArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzuj() {
        void var2_1;
        void var1_-1;
    }

    public static zzuj[] values() {
        return (zzuj[])zzf.clone();
    }
}

