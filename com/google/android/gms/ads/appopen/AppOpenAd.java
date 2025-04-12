/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.zza;
import com.google.android.gms.ads.appopen.zzb;
import com.google.android.gms.ads.appopen.zzc;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;

public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public static void load(Context context, String string2, AdRequest adRequest, int n3, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Object object;
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(string2, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(context);
        Object object2 = (Boolean)zzbgi.zzd.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            object = zzba.zzc();
            object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                zzb zzb2;
                object2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object = zzb2;
                AdRequest adRequest2 = adRequest;
                zzb2 = new zzb(context, string2, adRequest, n3, appOpenAdLoadCallback);
                object2.execute(zzb2);
                return;
            }
        }
        zzdx zzdx2 = adRequest.zza();
        object = object2;
        object2 = new zzbco(context, string2, zzdx2, n3, appOpenAdLoadCallback);
        ((zzbco)object2).zza();
    }

    public static void load(Context context, String string2, AdRequest adRequest, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(string2, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(context);
        Object object = (Boolean)zzbgi.zzd.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzlg;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object2 = new zza(context, string2, adRequest, appOpenAdLoadCallback);
                object.execute((Runnable)object2);
                return;
            }
        }
        zzdx zzdx2 = adRequest.zza();
        object = new zzbco(context, string2, zzdx2, 3, appOpenAdLoadCallback);
        ((zzbco)object).zza();
    }

    public static void load(Context context, String string2, AdManagerAdRequest adManagerAdRequest, int n3, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Object object;
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(string2, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(context);
        Object object2 = (Boolean)zzbgi.zzd.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            object = zzba.zzc();
            object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                zzc zzc2;
                object2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object = zzc2;
                AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                zzc2 = new zzc(context, string2, adManagerAdRequest, n3, appOpenAdLoadCallback);
                object2.execute(zzc2);
                return;
            }
        }
        zzdx zzdx2 = adManagerAdRequest.zza();
        object = object2;
        object2 = new zzbco(context, string2, zzdx2, n3, appOpenAdLoadCallback);
        ((zzbco)object2).zza();
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

