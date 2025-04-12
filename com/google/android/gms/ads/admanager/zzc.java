/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbwj;

public final class zzc
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ AdManagerInterstitialAdLoadCallback zzd;

    public /* synthetic */ zzc(Context context, String string2, AdManagerAdRequest adManagerAdRequest, AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adManagerAdRequest;
        this.zzd = adManagerInterstitialAdLoadCallback;
    }

    public final void run() {
        zzboj zzboj2;
        Context context = this.zza;
        Object object = this.zzb;
        AdManagerAdRequest adManagerAdRequest = this.zzc;
        AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback = this.zzd;
        try {
            zzboj2 = new zzboj(context, (String)object);
            object = adManagerAdRequest.zza();
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "AdManagerInterstitialAd.load");
            return;
        }
        zzboj2.zza((zzdx)object, adManagerInterstitialAdLoadCallback);
    }
}

