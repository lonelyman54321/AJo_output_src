/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhfw;

public final class zzhfy
extends Enum
implements zzhbs {
    public static final /* enum */ zzhfy zza;
    public static final /* enum */ zzhfy zzb;
    private static final zzhbt zzc;
    private static final /* synthetic */ zzhfy[] zzd;
    private final int zze;

    static {
        zzhfy zzhfy2;
        Object object = new zzhfy("SOURCE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhfy2 = new zzhfy("CLIENT_GENERATION", n3, n3);
        zzhfy[] zzhfyArray = new zzhfy[2];
        zzhfyArray[0] = object;
        zzhfyArray[n3] = zzhfy2;
        zzd = zzhfyArray;
        zzc = object = new zzhfw();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhfy() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzhfy[] values() {
        return (zzhfy[])zzd.clone();
    }

    public static zzhfy zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return null;
            }
            return zzb;
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zze);
    }

    public final int zza() {
        return this.zze;
    }
}

