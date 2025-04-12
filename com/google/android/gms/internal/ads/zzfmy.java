/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmx;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfmy
extends Enum
implements zzhbs {
    public static final /* enum */ zzfmy zza;
    public static final /* enum */ zzfmy zzb;
    public static final /* enum */ zzfmy zzc;
    public static final /* enum */ zzfmy zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzfmy[] zzf;
    private final int zzg;

    static {
        zzfmy zzfmy2;
        zzfmy zzfmy3;
        zzfmy zzfmy4;
        Object object = new zzfmy("ORIENTATION_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfmy4 = new zzfmy("ORIENTATION_PORTRAIT", n3, n3);
        int n4 = 2;
        zzc = zzfmy3 = new zzfmy("ORIENTATION_LANDSCAPE", n4, n4);
        int n7 = 3;
        zzd = zzfmy2 = new zzfmy("UNRECOGNIZED", n7, -1);
        zzfmy[] zzfmyArray = new zzfmy[4];
        zzfmyArray[0] = object;
        zzfmyArray[n3] = zzfmy4;
        zzfmyArray[n4] = zzfmy3;
        zzfmyArray[n7] = zzfmy2;
        zzf = zzfmyArray;
        zze = object = new zzfmx();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfmy() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzfmy[] values() {
        return (zzfmy[])zzf.clone();
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

