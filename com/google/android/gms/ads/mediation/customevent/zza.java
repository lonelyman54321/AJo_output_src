/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;

final class zza
implements CustomEventBannerListener {
    private final CustomEventAdapter zza;
    private final MediationBannerListener zzb;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationBannerListener;
    }

    public final void onAdClicked() {
        zzm.zze("Custom event adapter called onAdClicked.");
        MediationBannerListener mediationBannerListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationBannerListener.onAdClicked(customEventAdapter);
    }

    public final void onAdClosed() {
        zzm.zze("Custom event adapter called onAdClosed.");
        MediationBannerListener mediationBannerListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationBannerListener.onAdClosed(customEventAdapter);
    }

    public final void onAdFailedToLoad(int n3) {
        zzm.zze("Custom event adapter called onAdFailedToLoad.");
        MediationBannerListener mediationBannerListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter)customEventAdapter, n3);
    }

    public final void onAdFailedToLoad(AdError adError) {
        zzm.zze("Custom event adapter called onAdFailedToLoad.");
        MediationBannerListener mediationBannerListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter)customEventAdapter, adError);
    }

    public final void onAdLeftApplication() {
        zzm.zze("Custom event adapter called onAdLeftApplication.");
        MediationBannerListener mediationBannerListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationBannerListener.onAdLeftApplication(customEventAdapter);
    }

    public final void onAdLoaded(View object) {
        zzm.zze("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.zza(this.zza, (View)object);
        object = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        object.onAdLoaded(customEventAdapter);
    }

    public final void onAdOpened() {
        zzm.zze("Custom event adapter called onAdOpened.");
        MediationBannerListener mediationBannerListener = this.zzb;
        CustomEventAdapter customEventAdapter = this.zza;
        mediationBannerListener.onAdOpened(customEventAdapter);
    }
}

