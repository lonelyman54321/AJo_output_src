/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class zzb {
    private final zzdw zza;
    private String zzb;

    public zzb() {
        zzdw zzdw2;
        this.zza = zzdw2 = new zzdw();
    }

    public static /* bridge */ /* synthetic */ zzdw zza(zzb zzb2) {
        return zzb2.zza;
    }

    public static /* bridge */ /* synthetic */ String zzf(zzb zzb2) {
        return zzb2.zzb;
    }

    public final zzb zzb(Class clazz, Bundle bundle) {
        this.zza.zzo(clazz, bundle);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras) {
        this.zza.zzs(networkExtras);
        return this;
    }

    public final zzb zzd(Class clazz, Bundle bundle) {
        this.zza.zzr(clazz, bundle);
        return this;
    }

    public final zzb zze(String string2) {
        this.zzb = string2;
        return this;
    }
}

