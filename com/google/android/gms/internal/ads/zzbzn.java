/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.internal.ads.zzbzg;

public final class zzbzn
extends zzbzg {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzbzn(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    public final void zze(int n3) {
    }

    public final void zzf(zze object) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            object = ((zze)object).zzb();
            rewardedAdLoadCallback = this.zza;
            rewardedAdLoadCallback.onAdFailedToLoad((LoadAdError)object);
        }
    }

    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            RewardedAd rewardedAd = this.zzb;
            rewardedAdLoadCallback.onAdLoaded(rewardedAd);
        }
    }
}

