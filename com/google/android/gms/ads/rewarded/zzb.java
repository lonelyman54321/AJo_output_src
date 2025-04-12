/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbzj;

public final class zzb
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ RewardedAdLoadCallback zzd;

    public /* synthetic */ zzb(Context context, String string2, AdManagerAdRequest adManagerAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adManagerAdRequest;
        this.zzd = rewardedAdLoadCallback;
    }

    public final void run() {
        zzbzj zzbzj2;
        Context context = this.zza;
        Object object = this.zzb;
        AdManagerAdRequest adManagerAdRequest = this.zzc;
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzd;
        try {
            zzbzj2 = new zzbzj(context, (String)object);
            object = adManagerAdRequest.zza();
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "RewardedAd.loadAdManager");
            return;
        }
        zzbzj2.zza((zzdx)object, rewardedAdLoadCallback);
    }
}

