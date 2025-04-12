/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbzj;

public final class zzc
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdRequest zzc;
    public final /* synthetic */ RewardedAdLoadCallback zzd;

    public /* synthetic */ zzc(Context context, String string2, AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adRequest;
        this.zzd = rewardedAdLoadCallback;
    }

    public final void run() {
        zzbzj zzbzj2;
        Context context = this.zza;
        Object object = this.zzb;
        AdRequest adRequest = this.zzc;
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzd;
        try {
            zzbzj2 = new zzbzj(context, (String)object);
            object = adRequest.zza();
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "RewardedAd.load");
            return;
        }
        zzbzj2.zza((zzdx)object, rewardedAdLoadCallback);
    }
}

