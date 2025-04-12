/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

final class zzam
extends Enum {
    public static final /* enum */ zzam zza;
    public static final /* enum */ zzam zzb;
    public static final /* enum */ zzam zzc;
    public static final /* enum */ zzam zzd;
    public static final /* enum */ zzam zze;
    public static final /* enum */ zzam zzf;
    public static final /* enum */ zzam zzg;
    public static final /* enum */ zzam zzh;
    public static final /* enum */ zzam zzi;
    private static final /* enum */ zzam zzj;
    private static final /* synthetic */ zzam[] zzk;
    private final char zzl;

    static {
        zzam zzam2;
        zzam zzam3;
        zzam zzam4;
        zzam zzam5;
        zzam zzam6;
        zzam zzam7;
        zzam zzam8;
        zzam zzam9;
        zzam zzam10;
        zzam zzam11;
        zza = zzam11 = new zzam("UNSET", 0, '0');
        int n3 = 1;
        zzb = zzam10 = new zzam("REMOTE_DEFAULT", n3, '1');
        int n4 = 2;
        zzc = zzam9 = new zzam("REMOTE_DELEGATION", n4, '2');
        zzd = zzam8 = new zzam("MANIFEST", 3, '3');
        zze = zzam7 = new zzam("INITIALIZATION", 4, '4');
        zzf = zzam6 = new zzam("API", 5, '5');
        zzj = zzam5 = new zzam("CHILD_ACCOUNT", 6, '6');
        zzg = zzam4 = new zzam("TCF", 7, '7');
        zzh = zzam3 = new zzam("REMOTE_ENFORCED_DEFAULT", 8, '8');
        int n7 = 9;
        zzi = zzam2 = new zzam("FAILSAFE", n7, '9');
        zzam[] zzamArray = new zzam[10];
        zzamArray[0] = zzam11;
        zzamArray[n3] = zzam10;
        zzamArray[n4] = zzam9;
        zzamArray[3] = zzam8;
        zzamArray[4] = zzam7;
        zzamArray[5] = zzam6;
        zzamArray[6] = zzam5;
        zzamArray[7] = zzam4;
        zzamArray[8] = zzam3;
        zzamArray[n7] = zzam2;
        zzk = zzamArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzam() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzl = var3_2;
    }

    public static zzam[] values() {
        return (zzam[])zzk.clone();
    }

    public static /* bridge */ /* synthetic */ char zza(zzam zzam2) {
        return zzam2.zzl;
    }

    public static zzam zza(char c2) {
        for (zzam zzam2 : zzam.values()) {
            char c3 = zzam2.zzl;
            if (c3 != c2) continue;
            return zzam2;
        }
        return zza;
    }
}

