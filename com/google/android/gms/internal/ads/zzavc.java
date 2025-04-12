/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzavc
extends Enum
implements zzhbs {
    public static final /* enum */ zzavc zza;
    public static final /* enum */ zzavc zzb;
    public static final /* enum */ zzavc zzc;
    public static final /* enum */ zzavc zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzavc[] zzf;
    private final int zzg;

    static {
        zzavc zzavc2;
        zzavc zzavc3;
        zzavc zzavc4;
        Object object = new zzavc("ENUM_FALSE", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzavc4 = new zzavc("ENUM_TRUE", n3, n3);
        int n4 = 2;
        zzc = zzavc3 = new zzavc("ENUM_FAILURE", n4, n4);
        int n7 = 3;
        zzd = zzavc2 = new zzavc("ENUM_UNKNOWN", n7, 1000);
        zzavc[] zzavcArray = new zzavc[4];
        zzavcArray[0] = object;
        zzavcArray[n3] = zzavc4;
        zzavcArray[n4] = zzavc3;
        zzavcArray[n7] = zzavc2;
        zzf = zzavcArray;
        zze = object = new zzava();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzavc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzavc[] values() {
        return (zzavc[])zzf.clone();
    }

    public static zzavc zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 1000;
                    if (n3 != n4) {
                        return null;
                    }
                    return zzd;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzg);
    }

    public final int zza() {
        return this.zzg;
    }
}

