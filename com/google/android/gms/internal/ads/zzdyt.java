/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzdyx;

final class zzdyt
extends RewardedInterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdyx zzc;

    public zzdyt(zzdyx zzdyx2, String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzdyx2;
    }

    public final void onAdFailedToLoad(LoadAdError object) {
        zzdyx zzdyx2 = this.zzc;
        object = zzdyx.zzc(object);
        String string2 = this.zzb;
        zzdyx.zzd(zzdyx2, (String)object, string2);
    }
}

