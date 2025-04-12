/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbwj;

public final class zza
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdRequest zzc;
    public final /* synthetic */ AppOpenAd$AppOpenAdLoadCallback zzd;

    public /* synthetic */ zza(Context context, String string2, AdRequest adRequest, AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = adRequest;
        this.zzd = appOpenAd$AppOpenAdLoadCallback;
    }

    public final void run() {
        zzbco zzbco2;
        int n3;
        zzdx zzdx2;
        Context context = this.zza;
        String string2 = this.zzb;
        Object object = this.zzc;
        AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback = this.zzd;
        try {
            zzdx2 = ((AdRequest)object).zza();
            n3 = 3;
            object = zzbco2;
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(context).zzh(illegalStateException, "AppOpenAd.load");
            return;
        }
        zzbco2 = new zzbco(context, string2, zzdx2, n3, appOpenAd$AppOpenAdLoadCallback);
        zzbco2.zza();
    }
}

