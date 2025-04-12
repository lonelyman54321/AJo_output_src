/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

public final class zzlu
extends Enum {
    public static final /* enum */ zzlu zza;
    public static final /* enum */ zzlu zzb;
    public static final /* enum */ zzlu zzc;
    public static final /* enum */ zzlu zzd;
    public static final /* enum */ zzlu zze;
    public static final /* enum */ zzlu zzf;
    private static final /* synthetic */ zzlu[] zzg;
    private final int zzh;

    static {
        zzlu zzlu2;
        zzlu zzlu3;
        zzlu zzlu4;
        zzlu zzlu5;
        zzlu zzlu6;
        zzlu zzlu7;
        zza = zzlu7 = new zzlu("GOOGLE_ANALYTICS", 0, 0);
        int n3 = 1;
        zzb = zzlu6 = new zzlu("GOOGLE_SIGNAL", n3, n3);
        int n4 = 2;
        zzc = zzlu5 = new zzlu("SGTM", n4, n4);
        int n7 = 3;
        zzd = zzlu4 = new zzlu("SGTM_CLIENT", n7, n7);
        int n8 = 4;
        zze = zzlu3 = new zzlu("GOOGLE_SIGNAL_PENDING", n8, n8);
        int n10 = 5;
        zzf = zzlu2 = new zzlu("UNKNOWN", n10, 99);
        zzlu[] zzluArray = new zzlu[6];
        zzluArray[0] = zzlu7;
        zzluArray[n3] = zzlu6;
        zzluArray[n4] = zzlu5;
        zzluArray[n7] = zzlu4;
        zzluArray[n8] = zzlu3;
        zzluArray[n10] = zzlu2;
        zzg = zzluArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzlu() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzlu[] values() {
        return (zzlu[])zzg.clone();
    }

    public final int zza() {
        return this.zzh;
    }
}

