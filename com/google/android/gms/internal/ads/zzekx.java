/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcsc;
import com.google.android.gms.internal.ads.zzcuh;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzeku;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzenl;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzekx
extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzenl zzc;
    private final zzdfc zzd;
    private final zzdjy zze;
    private final zzdca zzf;
    private final ViewGroup zzg;
    private final zzdeh zzh;
    private final zzelf zzi;
    private final zzehq zzj;

    public zzekx(zzcjd zzcjd2, zzcyt zzcyt2, zzenl zzenl2, zzdfc zzdfc2, zzdjy zzdjy2, zzdca zzdca2, ViewGroup viewGroup, zzdeh zzdeh2, zzelf zzelf2, zzehq zzehq2) {
        this.zza = zzcjd2;
        this.zzb = zzcyt2;
        this.zzc = zzenl2;
        this.zzd = zzdfc2;
        this.zze = zzdjy2;
        this.zzf = zzdca2;
        this.zzg = viewGroup;
        this.zzh = zzdeh2;
        this.zzi = zzelf2;
        this.zzj = zzehq2;
    }

    public final ListenableFuture zzc(zzfho object, Bundle object2, zzfgt object3, zzfhf object4) {
        zzcyt zzcyt2 = this.zzb;
        zzcyt2.zzi((zzfho)object);
        zzcyt2.zzf((Bundle)object2);
        object2 = this.zzi;
        object = new zzcyn((zzfhf)object4, (zzfgt)object3, (zzelf)object2);
        zzcyt2.zzg((zzcyn)object);
        object = zzbep.zzdA;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            object2 = this.zzj;
            ((zzcyt)object).zzd((zzehq)object2);
        }
        object = this.zza;
        object2 = this.zzb;
        object = ((zzcjd)object).zze();
        object2 = ((zzcyt)object2).zzj();
        object.zzi((zzcyv)object2);
        object2 = this.zzd;
        object.zzf((zzdfc)object2);
        object2 = this.zzc;
        object.zze((zzenl)object2);
        object2 = this.zze;
        object.zzd((zzdjy)object2);
        object2 = this.zzf;
        object3 = this.zzh;
        object4 = new zzcuh((zzdca)object2, (zzdeh)object3);
        object.zzg((zzcuh)object4);
        object2 = this.zzg;
        object3 = new zzcsc((ViewGroup)object2);
        object.zzc((zzcsc)object3);
        object = object.zzk().zzd();
        object2 = ((zzcvx)object).zzj();
        return ((zzcvx)object).zzi((ListenableFuture)object2);
    }
}

