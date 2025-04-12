/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;

final class zzb
implements CustomEventInterstitialListener {
    final /* synthetic */ CustomEventAdapter zza;
    private final CustomEventAdapter zzb;
    private final MediationInterstitialListener zzc;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = customEventAdapter;
        this.zzb = customEventAdapter2;
        this.zzc = mediationInterstitialListener;
    }

    public final void onAdClicked() {
        zzm.zze("Custom event adapter called onAdClicked.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zzb;
        mediationInterstitialListener.onAdClicked(customEventAdapter);
    }

    public final void onAdClosed() {
        zzm.zze("Custom event adapter called onAdClosed.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zzb;
        mediationInterstitialListener.onAdClosed(customEventAdapter);
    }

    public final void onAdFailedToLoad(int n3) {
        zzm.zze("Custom event adapter called onFailedToReceiveAd.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zzb;
        mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter)customEventAdapter, n3);
    }

    public final void onAdFailedToLoad(AdError adError) {
        zzm.zze("Custom event adapter called onFailedToReceiveAd.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zzb;
        mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter)customEventAdapter, adError);
    }

    public final void onAdLeftApplication() {
        zzm.zze("Custom event adapter called onAdLeftApplication.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zzb;
        mediationInterstitialListener.onAdLeftApplication(customEventAdapter);
    }

    public final void onAdLoaded() {
        zzm.zze("Custom event adapter called onReceivedAd.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationInterstitialListener.onAdLoaded(customEventAdapter);
    }

    public final void onAdOpened() {
        zzm.zze("Custom event adapter called onAdOpened.");
        MediationInterstitialListener mediationInterstitialListener = this.zzc;
        CustomEventAdapter customEventAdapter = this.zzb;
        mediationInterstitialListener.onAdOpened(customEventAdapter);
    }
}

