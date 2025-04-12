/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzeog;
import com.google.android.gms.internal.ads.zzfhm;
import java.util.ArrayList;

public final class zzeof
extends zzbp {
    final zzfhm zza;
    final zzdmc zzb;
    private final Context zzc;
    private final zzcjd zzd;
    private zzbh zze;

    public zzeof(zzcjd zzcjd2, Context context, String string2) {
        zzdmc zzdmc2;
        zzfhm zzfhm2;
        this.zza = zzfhm2 = new zzfhm();
        this.zzb = zzdmc2 = new zzdmc();
        this.zzd = zzcjd2;
        zzfhm2.zzt(string2);
        this.zzc = context;
    }

    public final zzbn zze() {
        zzdme zzdme2 = this.zzb.zzg();
        Object object = zzdme2.zzi();
        this.zza.zzE((ArrayList)object);
        object = zzdme2.zzh();
        this.zza.zzF((ArrayList)object);
        object = this.zza;
        Object object2 = ((zzfhm)object).zzh();
        if (object2 == null) {
            object2 = zzq.zzc();
            ((zzfhm)object).zzs((zzq)object2);
        }
        Context context = this.zzc;
        zzcjd zzcjd2 = this.zzd;
        zzfhm zzfhm2 = this.zza;
        zzbh zzbh2 = this.zze;
        object2 = object;
        object = new zzeog(context, zzcjd2, zzfhm2, zzdme2, zzbh2);
        return object;
    }

    public final void zzf(zzbit zzbit2) {
        this.zzb.zza(zzbit2);
    }

    public final void zzg(zzbiw zzbiw2) {
        this.zzb.zzb(zzbiw2);
    }

    public final void zzh(String string2, zzbjc zzbjc2, zzbiz zzbiz2) {
        this.zzb.zzc(string2, zzbjc2, zzbiz2);
    }

    public final void zzi(zzboi zzboi2) {
        this.zzb.zzd(zzboi2);
    }

    public final void zzj(zzbjg zzbjg2, zzq zzq2) {
        this.zzb.zze(zzbjg2);
        this.zza.zzs(zzq2);
    }

    public final void zzk(zzbjj zzbjj2) {
        this.zzb.zzf(zzbjj2);
    }

    public final void zzl(zzbh zzbh2) {
        this.zze = zzbh2;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    public final void zzn(zzbnz zzbnz2) {
        this.zza.zzw(zzbnz2);
    }

    public final void zzo(zzbhk zzbhk2) {
        this.zza.zzD(zzbhk2);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    public final void zzq(zzcf zzcf2) {
        this.zza.zzU(zzcf2);
    }
}

