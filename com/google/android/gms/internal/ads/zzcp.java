/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzah;
import com.google.android.gms.internal.ads.zzcm;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzco;
import com.google.android.gms.internal.ads.zzn;

public final class zzcp {
    public static final zzcp zza;
    public static final zzn zzb;
    private static final String zzc;
    private final zzah zzd;

    static {
        Object object = new zzcn();
        zza = ((zzcn)object).zze();
        zzc = Integer.toString(0, 36);
        zzb = object = new zzcm();
    }

    public /* synthetic */ zzcp(zzah zzah2, zzco zzco2) {
        this.zzd = zzah2;
    }

    public static /* bridge */ /* synthetic */ zzah zza(zzcp zzcp2) {
        return zzcp2.zzd;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzcp;
        if (!bl2) {
            return false;
        }
        object = (zzcp)object;
        zzah zzah2 = this.zzd;
        object = ((zzcp)object).zzd;
        return zzah2.equals(object);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }
}

