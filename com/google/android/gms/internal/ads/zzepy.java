/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzdkd;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzepx;
import com.google.android.gms.internal.ads.zzepz;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfp;

final class zzepy
implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzdkd zzd;
    final /* synthetic */ zzepz zze;

    public zzepy(zzepz zzepz2, zzepr zzepr2, zzfmn zzfmn2, zzfmc zzfmc2, zzdkd zzdkd2) {
        this.zza = zzepr2;
        this.zzb = zzfmn2;
        this.zzc = zzfmc2;
        this.zzd = zzdkd2;
        this.zze = zzepz2;
    }

    public final void zza(Throwable object) {
        Object object2 = this.zzd.zza().zza((Throwable)object);
        this.zzd.zzb().zzdB((zze)object2);
        Object object3 = zzepz.zzc(this.zze).zzB();
        zzepx zzepx2 = new zzepx(this, (zze)object2);
        object3.execute(zzepx2);
        zzfil.zzb(((zze)object2).zza, (Throwable)object, "NativeAdLoader.onFailure");
        this.zza.zza();
        object3 = (Boolean)zzbgd.zzc.zze();
        boolean bl2 = (Boolean)object3;
        zzepx2 = null;
        if (bl2 && (object3 = this.zzb) != null) {
            ((zzfmn)object3).zzc((zze)object2);
            object2 = this.zzc;
            object2.zzi((Throwable)object);
            object2.zzh(false);
            ((zzfmn)object3).zza((zzfmc)object2);
            ((zzfmn)object3).zzi();
            return;
        }
        object3 = this.zze;
        zzfmc zzfmc2 = this.zzc;
        object3 = zzepz.zze((zzepz)object3);
        zzfmc2.zza((zze)object2);
        zzfmc2.zzi((Throwable)object);
        zzfmc2.zzh(false);
        object = zzfmc2.zzn();
        ((zzfmq)object3).zzb((zzfmg)object);
    }
}

