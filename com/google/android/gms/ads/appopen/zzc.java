/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbwj;

public final class zzc
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ AppOpenAd$AppOpenAdLoadCallback zze;

    public /* synthetic */ zzc(Context context, String string2, AdManagerAdRequest adManagerAdRequest, int n3, AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adManagerAdRequest;
        this.zzd = n3;
        this.zze = appOpenAd$AppOpenAdLoadCallback;
    }

    public final void run() {
        zzbco zzbco2;
        zzdx zzdx2;
        Context context = this.zza;
        int n3 = this.zzd;
        String string2 = this.zzb;
        Object object = this.zzc;
        AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback = this.zze;
        try {
            zzdx2 = ((AdRequest)object).zza();
            object = zzbco2;
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "AppOpenAdManager.load");
            return;
        }
        zzbco2 = new zzbco(context, string2, zzdx2, n3, appOpenAd$AppOpenAdLoadCallback);
        zzbco2.zza();
    }
}

