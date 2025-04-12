/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzac;
import com.google.android.gms.ads.internal.client.zzae;
import com.google.android.gms.ads.internal.client.zzag;
import com.google.android.gms.ads.internal.client.zzai;
import com.google.android.gms.ads.internal.client.zzak;
import com.google.android.gms.ads.internal.client.zzam;
import com.google.android.gms.ads.internal.client.zzao;
import com.google.android.gms.ads.internal.client.zzas;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzav;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzi;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcbg;
import java.util.HashMap;

public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbju zzd;
    private final zzbzm zze;
    private final zzbvd zzf;
    private final zzbjv zzg;
    private zzbwl zzh;

    public zzaw(zzk zzk2, zzi zzi2, zzeq zzeq2, zzbju zzbju2, zzbzm zzbzm2, zzbvd zzbvd2, zzbjv zzbjv2) {
        this.zza = zzk2;
        this.zzb = zzi2;
        this.zzc = zzeq2;
        this.zzd = zzbju2;
        this.zze = zzbzm2;
        this.zzf = zzbvd2;
        this.zzg = zzbjv2;
    }

    public static /* bridge */ /* synthetic */ zzi zza(zzaw zzaw2) {
        return zzaw2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzk zzb(zzaw zzaw2) {
        return zzaw2.zza;
    }

    public static /* bridge */ /* synthetic */ zzeq zzg(zzaw zzaw2) {
        return zzaw2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzbju zzj(zzaw zzaw2) {
        return zzaw2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbjv zzk(zzaw zzaw2) {
        return zzaw2.zzg;
    }

    public static /* bridge */ /* synthetic */ zzbvd zzn(zzaw zzaw2) {
        return zzaw2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzbwl zzp(zzaw zzaw2) {
        return zzaw2.zzh;
    }

    public static /* bridge */ /* synthetic */ void zzs(zzaw zzaw2, zzbwl zzbwl2) {
        zzaw2.zzh = zzbwl2;
    }

    public static /* bridge */ /* synthetic */ void zzt(Context context, String string2) {
        Bundle bundle = px1_2.b("action", "no_ads_fallback", "flow", string2);
        zzf zzf2 = zzay.zzb();
        String string3 = zzay.zzc().afmaVersion;
        zzf2.zzo(context, string3, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String string2, zzbrf zzbrf2) {
        zzao zzao2 = new zzao(this, context, string2, zzbrf2);
        return (zzbq)zzao2.zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzq2, String string2, zzbrf zzbrf2) {
        zzak zzak2 = new zzak(this, context, zzq2, string2, zzbrf2);
        return (zzbu)zzak2.zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzq2, String string2, zzbrf zzbrf2) {
        zzam zzam2 = new zzam(this, context, zzq2, string2, zzbrf2);
        return (zzbu)zzam2.zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbrf zzbrf2) {
        zzac zzac2 = new zzac(this, context, zzbrf2);
        return (zzdj)zzac2.zzd(context, false);
    }

    public final zzbhz zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzas zzas2 = new zzas(this, frameLayout, frameLayout2, context);
        return (zzbhz)zzas2.zzd(context, false);
    }

    public final zzbif zzi(View view, HashMap hashMap, HashMap hashMap2) {
        zzau zzau2 = new zzau(this, view, hashMap, hashMap2);
        view = view.getContext();
        return (zzbif)zzau2.zzd((Context)view, false);
    }

    public final zzbmr zzl(Context context, zzbrf zzbrf2, OnH5AdsEventListener onH5AdsEventListener) {
        zzai zzai2 = new zzai(this, context, zzbrf2, onH5AdsEventListener);
        return (zzbmr)zzai2.zzd(context, false);
    }

    public final zzbuz zzm(Context context, zzbrf zzbrf2) {
        zzag zzag2 = new zzag(this, context, zzbrf2);
        return (zzbuz)zzag2.zzd(context, false);
    }

    public final zzbvg zzo(Activity activity) {
        zzaa zzaa2 = new zzaa(this, activity);
        Object object = activity.getIntent();
        String string2 = "com.google.android.gms.ads.internal.overlay.useClientJar";
        boolean bl2 = object.hasExtra(string2);
        boolean bl3 = false;
        if (!bl2) {
            object = "useClientJar flag not found in activity intent extras.";
            zzm.zzg((String)object);
        } else {
            bl3 = object.getBooleanExtra(string2, false);
        }
        return (zzbvg)zzaa2.zzd((Context)activity, bl3);
    }

    public final zzbza zzq(Context context, String string2, zzbrf zzbrf2) {
        zzav zzav2 = new zzav(this, context, string2, zzbrf2);
        return (zzbza)zzav2.zzd(context, false);
    }

    public final zzcbg zzr(Context context, zzbrf zzbrf2) {
        zzae zzae2 = new zzae(this, context, zzbrf2);
        return (zzcbg)zzae2.zzd(context, false);
    }
}

