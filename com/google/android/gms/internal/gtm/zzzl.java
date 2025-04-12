/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;

public final class zzzl
extends Enum
implements zzach {
    public static final /* enum */ zzzl zza;
    public static final /* enum */ zzzl zzb;
    public static final /* enum */ zzzl zzc;
    public static final /* enum */ zzzl zzd;
    public static final /* enum */ zzzl zze;
    public static final /* enum */ zzzl zzf;
    public static final /* enum */ zzzl zzg;
    public static final /* enum */ zzzl zzh;
    public static final /* enum */ zzzl zzi;
    public static final /* enum */ zzzl zzj;
    public static final /* enum */ zzzl zzk;
    public static final /* enum */ zzzl zzl;
    private static final /* synthetic */ zzzl[] zzm;
    private final int zzn;

    static {
        zzzl zzzl2;
        zzzl zzzl3;
        zzzl zzzl4;
        zzzl zzzl5;
        zzzl zzzl6;
        zzzl zzzl7;
        zzzl zzzl8;
        zzzl zzzl9;
        zzzl zzzl10;
        zzzl zzzl11;
        zzzl zzzl12;
        zzzl zzzl13;
        zza = zzzl13 = new zzzl("EDITION_UNKNOWN", 0, 0);
        int n3 = 1;
        zzb = zzzl12 = new zzzl("EDITION_LEGACY", n3, 900);
        int n4 = 2;
        zzc = zzzl11 = new zzzl("EDITION_PROTO2", n4, 998);
        zzd = zzzl10 = new zzzl("EDITION_PROTO3", 3, 999);
        zze = zzzl9 = new zzzl("EDITION_2023", 4, 1000);
        zzf = zzzl8 = new zzzl("EDITION_2024", 5, 1001);
        zzg = zzzl7 = new zzzl("EDITION_1_TEST_ONLY", 6, n3);
        zzh = zzzl6 = new zzzl("EDITION_2_TEST_ONLY", 7, n4);
        zzi = zzzl5 = new zzzl("EDITION_99997_TEST_ONLY", 8, 99997);
        zzj = zzzl4 = new zzzl("EDITION_99998_TEST_ONLY", 9, 99998);
        zzk = zzzl3 = new zzzl("EDITION_99999_TEST_ONLY", 10, 99999);
        int n7 = 11;
        zzl = zzzl2 = new zzzl("EDITION_MAX", n7, -1 >>> 1);
        zzzl[] zzzlArray = new zzzl[12];
        zzzlArray[0] = zzzl13;
        zzzlArray[1] = zzzl12;
        zzzlArray[2] = zzzl11;
        zzzlArray[3] = zzzl10;
        zzzlArray[4] = zzzl9;
        zzzlArray[5] = zzzl8;
        zzzlArray[6] = zzzl7;
        zzzlArray[7] = zzzl6;
        zzzlArray[8] = zzzl5;
        zzzlArray[9] = zzzl4;
        zzzlArray[10] = zzzl3;
        zzzlArray[n7] = zzzl2;
        zzm = zzzlArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzzl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzn = var3_2;
    }

    public static zzzl[] values() {
        return (zzzl[])zzm.clone();
    }

    public final String toString() {
        return Integer.toString(this.zzn);
    }

    public final int zza() {
        return this.zzn;
    }
}

