/*
 * Decompiled with CFR 0.152.
 */
package com.google.ads.mediation;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

final class zzb
extends AdListener
implements AppEventListener,
zza {
    final AbstractAdViewAdapter zza;
    final MediationBannerListener zzb;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationBannerListener;
    }

    public final void onAdClicked() {
        MediationBannerListener mediationBannerListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationBannerListener.onAdClicked(abstractAdViewAdapter);
    }

    public final void onAdClosed() {
        MediationBannerListener mediationBannerListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationBannerListener.onAdClosed(abstractAdViewAdapter);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        MediationBannerListener mediationBannerListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter)abstractAdViewAdapter, loadAdError);
    }

    public final void onAdLoaded() {
        MediationBannerListener mediationBannerListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationBannerListener.onAdLoaded(abstractAdViewAdapter);
    }

    public final void onAdOpened() {
        MediationBannerListener mediationBannerListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationBannerListener.onAdOpened(abstractAdViewAdapter);
    }

    public final void onAppEvent(String string2, String string3) {
        MediationBannerListener mediationBannerListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationBannerListener.zzb(abstractAdViewAdapter, string2, string3);
    }
}

