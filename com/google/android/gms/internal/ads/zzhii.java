/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhig;

public final class zzhii
extends Enum
implements zzhbs {
    public static final /* enum */ zzhii zza;
    public static final /* enum */ zzhii zzb;
    private static final zzhbt zzc;
    private static final /* synthetic */ zzhii[] zzd;
    private final int zze;

    static {
        zzhii zzhii2;
        Object object = new zzhii("TYPE_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhii2 = new zzhii("TYPE_CREATIVE", n3, n3);
        zzhii[] zzhiiArray = new zzhii[2];
        zzhiiArray[0] = object;
        zzhiiArray[n3] = zzhii2;
        zzd = zzhiiArray;
        zzc = object = new zzhig();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhii() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzhii[] values() {
        return (zzhii[])zzd.clone();
    }

    public static zzhii zzb(int n3) {
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

