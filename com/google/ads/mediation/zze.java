/*
 * Decompiled with CFR 0.152.
 */
package com.google.ads.mediation;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.zza;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbiq;

final class zze
extends AdListener
implements zzi,
zzg,
zzf {
    final AbstractAdViewAdapter zza;
    final MediationNativeListener zzb;

    public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationNativeListener;
    }

    public final void onAdClicked() {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.onAdClicked(abstractAdViewAdapter);
    }

    public final void onAdClosed() {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.onAdClosed(abstractAdViewAdapter);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.onAdFailedToLoad((MediationNativeAdapter)abstractAdViewAdapter, loadAdError);
    }

    public final void onAdImpression() {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.onAdImpression(abstractAdViewAdapter);
    }

    public final void onAdLoaded() {
    }

    public final void onAdOpened() {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.onAdOpened(abstractAdViewAdapter);
    }

    public final void zza(UnifiedNativeAd object) {
        zza zza2 = new zza((UnifiedNativeAd)object);
        object = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        object.onAdLoaded(abstractAdViewAdapter, zza2);
    }

    public final void zzb(zzbiq zzbiq2, String string2) {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.zze(abstractAdViewAdapter, zzbiq2, string2);
    }

    public final void zzc(zzbiq zzbiq2) {
        MediationNativeListener mediationNativeListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationNativeListener.zzd(abstractAdViewAdapter, zzbiq2);
    }
}

