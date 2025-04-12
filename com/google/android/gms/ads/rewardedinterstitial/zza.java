/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.rewardedinterstitial;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbzu;

public final class zza
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ RewardedInterstitialAdLoadCallback zzd;

    public /* synthetic */ zza(Context context, String string2, AdManagerAdRequest adManagerAdRequest, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adManagerAdRequest;
        this.zzd = rewardedInterstitialAdLoadCallback;
    }

    public final void run() {
        zzbzu zzbzu2;
        Context context = this.zza;
        Object object = this.zzb;
        AdManagerAdRequest adManagerAdRequest = this.zzc;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzd;
        try {
            zzbzu2 = new zzbzu(context, (String)object);
            object = adManagerAdRequest.zza();
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "RewardedInterstitialAdManager.load");
            return;
        }
        zzbzu2.zza((zzdx)object, rewardedInterstitialAdLoadCallback);
    }
}

