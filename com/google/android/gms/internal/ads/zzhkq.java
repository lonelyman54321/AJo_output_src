/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;

public final class zzhkq
implements zzhkp,
zzhkj {
    private static final zzhkq zza;
    private final Object zzb;

    static {
        zzhkq zzhkq2;
        zza = zzhkq2 = new zzhkq(null);
    }

    private zzhkq(Object object) {
        this.zzb = object;
    }

    public static zzhkp zza(Object object) {
        zzhkx.zza(object, "instance cannot be null");
        zzhkq zzhkq2 = new zzhkq(object);
        return zzhkq2;
    }

    public static zzhkp zzc(Object object) {
        if (object == null) {
            object = zza;
        } else {
            zzhkq zzhkq2 = new zzhkq(object);
            object = zzhkq2;
        }
        return object;
    }

    public final Object zzb() {
        return this.zzb;
    }
}

