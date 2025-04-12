/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;

final class zzc
implements CustomEventNativeListener {
    private final CustomEventAdapter zza;
    private final MediationNativeListener zzb;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationNativeListener;
    }

    public final void onAdClicked() {
        zzm.zze("Custom event adapter called onAdClicked.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdClicked(customEventAdapter);
    }

    public final void onAdClosed() {
        zzm.zze("Custom event adapter called onAdClosed.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdClosed(customEventAdapter);
    }

    public final void onAdFailedToLoad(int n3) {
        zzm.zze("Custom event adapter called onAdFailedToLoad.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdFailedToLoad((MediationNativeAdapter)customEventAdapter, n3);
    }

    public final void onAdFailedToLoad(AdError adError) {
        zzm.zze("Custom event adapter called onAdFailedToLoad.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdFailedToLoad((MediationNativeAdapter)customEventAdapter, adError);
    }

    public final void onAdImpression() {
        zzm.zze("Custom event adapter called onAdImpression.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdImpression(customEventAdapter);
    }

    public final void onAdLeftApplication() {
        zzm.zze("Custom event adapter called onAdLeftApplication.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdLeftApplication(customEventAdapter);
    }

    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzm.zze("Custom event adapter called onAdLoaded.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdLoaded(customEventAdapter, unifiedNativeAdMapper);
    }

    public final void onAdOpened() {
        zzm.zze("Custom event adapter called onAdOpened.");
        MediationNativeListener mediationNativeListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationNativeListener.onAdOpened(customEventAdapter);
    }
}

