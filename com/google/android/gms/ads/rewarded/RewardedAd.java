/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewarded.zzb;
import com.google.android.gms.ads.rewarded.zzc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbzj;

public abstract class RewardedAd {
    public static void load(Context object, String string2, AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(object, "Context cannot be null.");
        Preconditions.checkNotNull(string2, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(object);
        Object object2 = (Boolean)zzbgi.zzl.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object3 = new zzc((Context)object, string2, adRequest, rewardedAdLoadCallback);
                object2.execute((Runnable)object3);
                return;
            }
        }
        zzm.zze("Loading on UI thread");
        object2 = new zzbzj((Context)object, string2);
        object = adRequest.zza();
        ((zzbzj)object2).zza((zzdx)object, rewardedAdLoadCallback);
    }

    public static void load(Context object, String string2, AdManagerAdRequest adManagerAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(object, "Context cannot be null.");
        Preconditions.checkNotNull(string2, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(object);
        Object object2 = (Boolean)zzbgi.zzl.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                zzm.zze("Loading on background thread");
                object2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object3 = new zzb((Context)object, string2, adManagerAdRequest, rewardedAdLoadCallback);
                object2.execute((Runnable)object3);
                return;
            }
        }
        zzm.zze("Loading on UI thread");
        object2 = new zzbzj((Context)object, string2);
        object = adManagerAdRequest.zza();
        ((zzbzj)object2).zza((zzdx)object, rewardedAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback var1);

    public abstract void setImmersiveMode(boolean var1);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener var1);

    public abstract void setOnPaidEventListener(OnPaidEventListener var1);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions var1);

    public abstract void show(Activity var1, OnUserEarnedRewardListener var2);
}

