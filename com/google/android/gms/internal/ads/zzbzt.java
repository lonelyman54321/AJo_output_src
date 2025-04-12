/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzu;

public final class zzbzt
extends zzbzg {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbzu zzb;

    public zzbzt(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbzu zzbzu2) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbzu2;
    }

    public final void zze(int n3) {
    }

    public final void zzf(zze object) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            object = ((zze)object).zzb();
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad((LoadAdError)object);
        }
    }

    public final void zzg() {
        zzbzu zzbzu2;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzbzu2 = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzbzu2);
        }
    }
}

