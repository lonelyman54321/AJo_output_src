/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzdwg;

public final class zzdwh {
    private final zzbmo zza;

    public zzdwh(zzbmo zzbmo2) {
        this.zza = zzbmo2;
    }

    private final void zzs(zzdwg object) {
        object = zzdwg.zza((zzdwg)object);
        zzm.zzi("Dispatching AFMA event on publisher webview: ".concat((String)object));
        this.zza.zzb((String)object);
    }

    public final void zza() {
        zzdwg zzdwg2 = new zzdwg("initialize", null);
        this.zzs(zzdwg2);
    }

    public final void zzb(long l2) {
        zzdwg zzdwg2 = new zzdwg("interstitial", null);
        Object object = l2;
        zzdwg.zzd(zzdwg2, (Long)object);
        zzdwg.zzc(zzdwg2, "onAdClicked");
        object = zzdwg.zza(zzdwg2);
        this.zza.zzb((String)object);
    }

    public final void zzc(long l2) {
        zzdwg zzdwg2 = new zzdwg("interstitial", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onAdClosed");
        this.zzs(zzdwg2);
    }

    public final void zzd(long l2, int n3) {
        zzdwg zzdwg2 = new zzdwg("interstitial", null);
        Number number = l2;
        zzdwg.zzd(zzdwg2, number);
        zzdwg.zzc(zzdwg2, "onAdFailedToLoad");
        number = n3;
        zzdwg.zzb(zzdwg2, (Integer)number);
        this.zzs(zzdwg2);
    }

    public final void zze(long l2) {
        zzdwg zzdwg2 = new zzdwg("interstitial", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onAdLoaded");
        this.zzs(zzdwg2);
    }

    public final void zzf(long l2) {
        zzdwg zzdwg2 = new zzdwg("interstitial", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onNativeAdObjectNotAvailable");
        this.zzs(zzdwg2);
    }

    public final void zzg(long l2) {
        zzdwg zzdwg2 = new zzdwg("interstitial", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onAdOpened");
        this.zzs(zzdwg2);
    }

    public final void zzh(long l2) {
        zzdwg zzdwg2 = new zzdwg("creation", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "nativeObjectCreated");
        this.zzs(zzdwg2);
    }

    public final void zzi(long l2) {
        zzdwg zzdwg2 = new zzdwg("creation", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "nativeObjectNotCreated");
        this.zzs(zzdwg2);
    }

    public final void zzj(long l2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onAdClicked");
        this.zzs(zzdwg2);
    }

    public final void zzk(long l2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onRewardedAdClosed");
        this.zzs(zzdwg2);
    }

    public final void zzl(long l2, zzbyx zzbyx2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Object object = l2;
        zzdwg.zzd(zzdwg2, (Long)object);
        zzdwg.zzc(zzdwg2, "onUserEarnedReward");
        object = zzbyx2.zzf();
        zzdwg.zzf(zzdwg2, (String)object);
        object = zzbyx2.zze();
        zzdwg.zze(zzdwg2, (Integer)object);
        this.zzs(zzdwg2);
    }

    public final void zzm(long l2, int n3) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Number number = l2;
        zzdwg.zzd(zzdwg2, number);
        zzdwg.zzc(zzdwg2, "onRewardedAdFailedToLoad");
        number = n3;
        zzdwg.zzb(zzdwg2, (Integer)number);
        this.zzs(zzdwg2);
    }

    public final void zzn(long l2, int n3) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Number number = l2;
        zzdwg.zzd(zzdwg2, number);
        zzdwg.zzc(zzdwg2, "onRewardedAdFailedToShow");
        number = n3;
        zzdwg.zzb(zzdwg2, (Integer)number);
        this.zzs(zzdwg2);
    }

    public final void zzo(long l2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onAdImpression");
        this.zzs(zzdwg2);
    }

    public final void zzp(long l2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onRewardedAdLoaded");
        this.zzs(zzdwg2);
    }

    public final void zzq(long l2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onNativeAdObjectNotAvailable");
        this.zzs(zzdwg2);
    }

    public final void zzr(long l2) {
        zzdwg zzdwg2 = new zzdwg("rewarded", null);
        Long l3 = l2;
        zzdwg.zzd(zzdwg2, l3);
        zzdwg.zzc(zzdwg2, "onRewardedAdOpened");
        this.zzs(zzdwg2);
    }
}

