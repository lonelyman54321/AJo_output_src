/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.interstitial.zza;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzboj;

public abstract class InterstitialAd {
    public static void load(Context object, String string2, AdRequest adRequest, InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.checkNotNull(object, "Context cannot be null.");
        Preconditions.checkNotNull(string2, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(object);
        Object object2 = (Boolean)zzbgi.zzi.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = zzb.zzb;
                object3 = new zza((Context)object, string2, adRequest, interstitialAdLoadCallback);
                object2.execute((Runnable)object3);
                return;
            }
        }
        object2 = new zzboj((Context)object, string2);
        object = adRequest.zza();
        ((zzboj)object2).zza((zzdx)object, interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback var1);

    public abstract void setImmersiveMode(boolean var1);

    public abstract void setOnPaidEventListener(OnPaidEventListener var1);

    public abstract void show(Activity var1);
}

