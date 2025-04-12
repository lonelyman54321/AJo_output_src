/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmz;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfna
extends Enum
implements zzhbs {
    public static final /* enum */ zzfna zza;
    public static final /* enum */ zzfna zzb;
    public static final /* enum */ zzfna zzc;
    public static final /* enum */ zzfna zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzfna[] zzf;
    private final int zzg;

    static {
        zzfna zzfna2;
        zzfna zzfna3;
        zzfna zzfna4;
        Object object = new zzfna("OS_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfna4 = new zzfna("OS_ANDROID", n3, n3);
        int n4 = 2;
        zzc = zzfna3 = new zzfna("OS_IOS", n4, n4);
        int n7 = 3;
        zzd = zzfna2 = new zzfna("UNRECOGNIZED", n7, -1);
        zzfna[] zzfnaArray = new zzfna[4];
        zzfnaArray[0] = object;
        zzfnaArray[n3] = zzfna4;
        zzfnaArray[n4] = zzfna3;
        zzfnaArray[n7] = zzfna2;
        zzf = zzfnaArray;
        zze = object = new zzfmz();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfna() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzfna[] values() {
        return (zzfna[])zzf.clone();
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzd;
        if (this != object) {
            return this.zzg;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

