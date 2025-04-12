/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.InputEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 */
package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzcra;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdhg;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdrt;
import com.google.android.gms.internal.ads.zzdru;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzdrx;
import com.google.android.gms.internal.ads.zzdry;
import com.google.android.gms.internal.ads.zzdrz;
import com.google.android.gms.internal.ads.zzdsa;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdsc {
    private final zzczj zza;
    private final zzdhg zzb;
    private final zzdas zzc;
    private final zzdbf zzd;
    private final zzdbr zze;
    private final zzdef zzf;
    private final Executor zzg;
    private final zzdhc zzh;
    private final zzcra zzi;
    private final zzb zzj;
    private final zzcaf zzk;
    private final zzaxd zzl;
    private final zzddw zzm;
    private final zzefz zzn;
    private final zzfoe zzo;
    private final zzdvc zzp;
    private final zzcqd zzq;
    private final zzdsi zzr;

    public zzdsc(zzczj zzczj2, zzdas zzdas2, zzdbf zzdbf2, zzdbr zzdbr2, zzdef zzdef2, Executor executor, zzdhc zzdhc2, zzcra zzcra2, zzb zzb2, zzcaf zzcaf2, zzaxd zzaxd2, zzddw zzddw2, zzefz zzefz2, zzfoe zzfoe2, zzdvc zzdvc2, zzdhg zzdhg2, zzcqd zzcqd2, zzdsi zzdsi2) {
        this.zza = zzczj2;
        this.zzc = zzdas2;
        this.zzd = zzdbf2;
        this.zze = zzdbr2;
        this.zzf = zzdef2;
        this.zzg = executor;
        this.zzh = zzdhc2;
        this.zzi = zzcra2;
        this.zzj = zzb2;
        this.zzk = zzcaf2;
        this.zzl = zzaxd2;
        this.zzm = zzddw2;
        this.zzn = zzefz2;
        this.zzo = zzfoe2;
        this.zzp = zzdvc2;
        this.zzb = zzdhg2;
        this.zzq = zzcqd2;
        this.zzr = zzdsi2;
    }

    public static /* bridge */ /* synthetic */ zzdas zza(zzdsc zzdsc2) {
        return zzdsc2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzddw zzb(zzdsc zzdsc2) {
        return zzdsc2.zzm;
    }

    public static final ListenableFuture zzj(zzchd zzchd2, String string2, String string3) {
        zzccn zzccn2 = new zzccn();
        zzciv zzciv2 = zzchd2.zzN();
        zzdrt zzdrt2 = new zzdrt(zzccn2);
        zzciv2.zzB(zzdrt2);
        zzchd2.zzae(string2, string3, null);
        return zzccn2;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String string2, String string3) {
        this.zzf.zzb(string2, string3);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzg(zzchd zzchd2, zzchd zzchd3, Map map2) {
        this.zzi.zzh(zzchd2);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent object) {
        int n3;
        Object object2 = zzbep.zzka;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean n32 = (Boolean)object2;
        if (n32 && object != null && (n3 = object.getAction()) == 0) {
            object2 = this.zzr;
            ((zzdsi)object2).zzb((InputEvent)object);
        }
        object = this.zzj;
        ((zzb)object).zza();
        if (view != null) {
            view.performClick();
        }
        return false;
    }

    public final void zzi(zzchd zzchd2, boolean bl2, zzbls zzbls2) {
        Object object;
        zzdsc zzdsc2 = this;
        Object object2 = zzchd2;
        zzdhi zzdhi2 = zzchd2.zzN();
        Object object3 = object;
        Object object4 = object = new zzdru(this);
        Object object5 = object = new zzdrv(this);
        Object object6 = object = new zzdrw(this);
        object = new zzdsb(this);
        zzcaf zzcaf2 = this.zzk;
        zzefz zzefz2 = this.zzn;
        zzfoe zzfoe2 = this.zzo;
        object = this.zzd;
        zzdvc zzdvc2 = this.zzp;
        zzdbr zzdbr2 = this.zze;
        zzb zzb2 = this.zzj;
        zzdhg zzdhg2 = this.zzb;
        object2 = this.zzq;
        zzdhi2.zzR((zza)object3, (zzbkf)object, zzdbr2, (zzbkh)object4, (zzaa)object5, bl2, zzbls2, zzb2, (zzbuk)object6, zzcaf2, zzefz2, zzfoe2, zzdvc2, null, zzdhg2, null, null, null, (zzcqd)object2);
        object2 = new zzdrx(this);
        zzdhi2 = zzchd2;
        zzchd2.setOnTouchListener((View.OnTouchListener)object2);
        object2 = new zzdry(this);
        zzchd2.setOnClickListener((View.OnClickListener)object2);
        object2 = zzbep.zzcD;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3 && (object2 = this.zzl.zzc()) != null) {
            object3 = zzchd2;
            object3 = (View)zzchd2;
            object2.zzo((View)object3);
        }
        object2 = zzdsc2.zzh;
        object3 = zzdsc2.zzg;
        ((zzdez)object2).zzo(zzdhi2, (Executor)object3);
        object2 = zzdsc2.zzh;
        object3 = new zzdrz((zzchd)zzdhi2);
        object = zzdsc2.zzg;
        ((zzdez)object2).zzo(object3, (Executor)object);
        object2 = zzdsc2.zzh;
        object3 = zzdhi2;
        object3 = (View)zzdhi2;
        ((zzdhc)object2).zza((View)object3);
        object2 = new zzdsa(zzdsc2, (zzchd)zzdhi2);
        zzdhi2.zzag("/trackActiveViewUnit", (zzblp)object2);
        zzdsc2.zzi.zzi(zzdhi2);
    }
}

