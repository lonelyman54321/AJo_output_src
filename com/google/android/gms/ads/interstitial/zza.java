/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.interstitial;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbwj;

public final class zza
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdRequest zzc;
    public final /* synthetic */ InterstitialAdLoadCallback zzd;

    public /* synthetic */ zza(Context context, String string2, AdRequest adRequest, InterstitialAdLoadCallback interstitialAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adRequest;
        this.zzd = interstitialAdLoadCallback;
    }

    public final void run() {
        zzboj zzboj2;
        Context context = this.zza;
        Object object = this.zzb;
        AdRequest adRequest = this.zzc;
        InterstitialAdLoadCallback interstitialAdLoadCallback = this.zzd;
        try {
            zzboj2 = new zzboj(context, (String)object);
            object = adRequest.zza();
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "InterstitialAd.load");
            return;
        }
        zzboj2.zza((zzdx)object, interstitialAdLoadCallback);
    }
}

