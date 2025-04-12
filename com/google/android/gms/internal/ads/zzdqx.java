/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdhg;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzdqw;
import com.google.android.gms.internal.ads.zzdqy;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.Objects;

public final class zzdqx {
    private final zzczj zza;
    private final zzdas zzb;
    private final zzdbf zzc;
    private final zzdbr zzd;
    private final zzdef zze;
    private final zzdhg zzf;
    private final zzdvc zzg;
    private final zzfoe zzh;
    private final zzefz zzi;
    private final zzcqd zzj;

    public zzdqx(zzczj zzczj2, zzdas zzdas2, zzdbf zzdbf2, zzdbr zzdbr2, zzdef zzdef2, zzdhg zzdhg2, zzdvc zzdvc2, zzfoe zzfoe2, zzefz zzefz2, zzcqd zzcqd2) {
        this.zza = zzczj2;
        this.zzb = zzdas2;
        this.zzc = zzdbf2;
        this.zzd = zzdbr2;
        this.zze = zzdef2;
        this.zzf = zzdhg2;
        this.zzg = zzdvc2;
        this.zzh = zzfoe2;
        this.zzi = zzefz2;
        this.zzj = zzcqd2;
    }

    public final void zza(zzdqy object, zzchd object2) {
        Object object3 = zzdqy.zza((zzdqy)object);
        object = this.zzb;
        Objects.requireNonNull(object);
        zzdqw zzdqw2 = new zzdqw((zzdas)object);
        Object object4 = this.zza;
        zzdbf zzdbf2 = this.zzc;
        zzdbr zzdbr2 = this.zzd;
        zzdef zzdef2 = this.zze;
        zzdhg zzdhg2 = this.zzf;
        ((zzdqv)object3).zzi((zza)object4, zzdbf2, zzdbr2, zzdef2, zzdqw2, zzdhg2);
        object = zzbep.zzkg;
        object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && object2 != null && (object = object2.zzN()) != null) {
            object = object2.zzN();
            object2 = this.zzj;
            object3 = this.zzi;
            object4 = this.zzh;
            object.zzI((zzcqd)object2, (zzefz)((Object)object3), (zzfoe)object4);
            object2 = this.zzj;
            object3 = this.zzi;
            object4 = this.zzg;
            object.zzK((zzcqd)object2, (zzefz)((Object)object3), (zzdvc)object4);
        }
    }
}

