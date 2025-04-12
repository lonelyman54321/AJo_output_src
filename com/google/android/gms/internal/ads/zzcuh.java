/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcug;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzgge;

public final class zzcuh {
    private final zzdca zza;
    private final zzdeh zzb;

    public zzcuh(zzdca zzdca2, zzdeh zzdeh2) {
        this.zza = zzdca2;
        this.zzb = zzdeh2;
    }

    public final zzdca zza() {
        return this.zza;
    }

    public final zzdeh zzb() {
        return this.zzb;
    }

    public final zzdha zzc() {
        Object object = this.zzb;
        if (object != null) {
            zzgge zzgge2 = zzcci.zzf;
            zzdha zzdha2 = new zzdha(object, zzgge2);
            return zzdha2;
        }
        zzcug zzcug2 = new zzcug(this);
        zzgge zzgge3 = zzcci.zzf;
        object = new zzdha(zzcug2, zzgge3);
        return object;
    }
}

