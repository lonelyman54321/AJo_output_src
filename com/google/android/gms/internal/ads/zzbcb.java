/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbci;

public final class zzbcb
extends zzbci {
    private final AppOpenAd$AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbcb(AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback, String string2) {
        this.zza = appOpenAd$AppOpenAdLoadCallback;
        this.zzb = string2;
    }

    public final void zzb(int n3) {
    }

    public final void zzc(zze object) {
        AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback = this.zza;
        if (appOpenAd$AppOpenAdLoadCallback != null) {
            object = ((zze)object).zzb();
            appOpenAd$AppOpenAdLoadCallback = this.zza;
            appOpenAd$AppOpenAdLoadCallback.onAdFailedToLoad((LoadAdError)object);
        }
    }

    public final void zzd(zzbcg object) {
        Object object2 = this.zza;
        if (object2 != null) {
            object2 = this.zzb;
            zzbcc zzbcc2 = new zzbcc((zzbcg)object, (String)object2);
            object = this.zza;
            ((AdLoadCallback)object).onAdLoaded(zzbcc2);
        }
    }
}

