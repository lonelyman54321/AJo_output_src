/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvh;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdvc {
    private final zzdvh zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdvc(zzdvh object, Executor executor) {
        this.zza = object;
        this.zzc = object = ((zzdvh)object).zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdvh zzb(zzdvc zzdvc2) {
        return zzdvc2.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzdvc zzdvc2) {
        return zzdvc2.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdvc zzdvc2) {
        return zzdvc2.zzb;
    }

    public final zzdvb zza() {
        zzdvb zzdvb2 = new zzdvb(this);
        zzdvb.zza(zzdvb2);
        return zzdvb2;
    }

    public final void zze() {
        Object object = zzbep.zzlG;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        object = this.zza();
        ((zzdvb)object).zzb("action", "pecr");
        ((zzdvb)object).zzf();
    }
}

