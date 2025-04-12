/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmv;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfmw
extends Enum
implements zzhbs {
    public static final /* enum */ zzfmw zza;
    public static final /* enum */ zzfmw zzb;
    public static final /* enum */ zzfmw zzc;
    public static final /* enum */ zzfmw zzd;
    public static final /* enum */ zzfmw zze;
    public static final /* enum */ zzfmw zzf;
    public static final /* enum */ zzfmw zzg;
    public static final /* enum */ zzfmw zzh;
    private static final zzhbt zzi;
    private static final /* synthetic */ zzfmw[] zzj;
    private final int zzk;

    static {
        zzfmw zzfmw2;
        zzfmw zzfmw3;
        zzfmw zzfmw4;
        zzfmw zzfmw5;
        zzfmw zzfmw6;
        zzfmw zzfmw7;
        zzfmw zzfmw8;
        Object object = new zzfmw("FORMAT_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfmw8 = new zzfmw("FORMAT_BANNER", n3, n3);
        int n4 = 2;
        zzc = zzfmw7 = new zzfmw("FORMAT_INTERSTITIAL", n4, n4);
        int n7 = 3;
        zzd = zzfmw6 = new zzfmw("FORMAT_REWARDED", n7, n7);
        int n8 = 4;
        zze = zzfmw5 = new zzfmw("FORMAT_REWARDED_INTERSTITIAL", n8, n8);
        int n10 = 5;
        zzf = zzfmw4 = new zzfmw("FORMAT_APP_OPEN", n10, n10);
        int n14 = 6;
        zzg = zzfmw3 = new zzfmw("FORMAT_NATIVE", n14, n14);
        int n15 = 7;
        zzh = zzfmw2 = new zzfmw("UNRECOGNIZED", n15, -1);
        zzfmw[] zzfmwArray = new zzfmw[8];
        zzfmwArray[0] = object;
        zzfmwArray[n3] = zzfmw8;
        zzfmwArray[n4] = zzfmw7;
        zzfmwArray[n7] = zzfmw6;
        zzfmwArray[n8] = zzfmw5;
        zzfmwArray[5] = zzfmw4;
        zzfmwArray[6] = zzfmw3;
        zzfmwArray[n15] = zzfmw2;
        zzj = zzfmwArray;
        zzi = object = new zzfmv();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfmw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzfmw[] values() {
        return (zzfmw[])zzj.clone();
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzh;
        if (this != object) {
            return this.zzk;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

