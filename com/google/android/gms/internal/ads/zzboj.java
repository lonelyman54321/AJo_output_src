/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbrb;

public final class zzboj
extends AdManagerInterstitialAd {
    private final Context zza;
    private final zzp zzb;
    private final zzbu zzc;
    private final String zzd;
    private final zzbrb zze;
    private AppEventListener zzf;
    private FullScreenContentCallback zzg;
    private OnPaidEventListener zzh;

    public zzboj(Context object, String string2) {
        zzbrb zzbrb2;
        this.zze = zzbrb2 = new zzbrb();
        this.zza = object;
        this.zzd = string2;
        Object object2 = zzp.zza;
        this.zzb = object2;
        object2 = zzay.zza();
        zzq zzq2 = new zzq();
        object = ((zzaw)object2).zze((Context)object, zzq2, string2, zzbrb2);
        this.zzc = object;
    }

    public final String getAdUnitId() {
        return this.zzd;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzf;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzh;
    }

    public final ResponseInfo getResponseInfo() {
        zzdn zzdn2;
        block3: {
            zzdn2 = null;
            zzbu zzbu2 = this.zzc;
            if (zzbu2 == null) break block3;
            try {
                zzdn2 = zzbu2.zzk();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
        return ResponseInfo.zzb(zzdn2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setAppEventListener(AppEventListener appEventListener) {
        RemoteException remoteException2;
        block3: {
            zzbbb zzbbb2;
            zzbu zzbu2;
            try {
                this.zzf = appEventListener;
                zzbu2 = this.zzc;
                if (zzbu2 == null) return;
                zzbbb2 = appEventListener != null ? new zzbbb(appEventListener) : null;
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            zzbu2.zzG(zzbbb2);
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        RemoteException remoteException2;
        block6: {
            block5: {
                zzbu zzbu2;
                try {
                    this.zzg = fullScreenContentCallback;
                    zzbu2 = this.zzc;
                    if (zzbu2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                zzbb zzbb2 = new zzbb(fullScreenContentCallback);
                zzbu2.zzJ(zzbb2);
                return;
                break block6;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setImmersiveMode(boolean bl2) {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbu zzbu2;
                try {
                    zzbu2 = this.zzc;
                    if (zzbu2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbu2.zzL(bl2);
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        RemoteException remoteException2;
        block6: {
            block5: {
                zzbu zzbu2;
                try {
                    this.zzh = onPaidEventListener;
                    zzbu2 = this.zzc;
                    if (zzbu2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                zzfe zzfe2 = new zzfe(onPaidEventListener);
                zzbu2.zzP(zzfe2);
                return;
                break block6;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void show(Activity object) {
        RemoteException remoteException2;
        block6: {
            block5: {
                Object object2;
                if (object == null) {
                    object2 = "The activity for show is null, will proceed with show using the context provided when loading the ad.";
                    zzm.zzj((String)object2);
                }
                try {
                    object2 = this.zzc;
                    if (object2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                object = ObjectWrapper.wrap(object);
                object2.zzW((IObjectWrapper)object);
                return;
                break block6;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zza(zzdx object, AdLoadCallback adLoadCallback) {
        LoadAdError loadAdError;
        Object object2;
        RemoteException remoteException2;
        block9: {
            block8: {
                zzbu zzbu2;
                try {
                    zzbu2 = this.zzc;
                    if (zzbu2 == null) break block8;
                }
                catch (RemoteException remoteException2) {}
                object2 = this.zzb;
                Context context = this.zza;
                object = ((zzp)object2).zza(context, (zzdx)object);
                object2 = new zzh(adLoadCallback, this);
                zzbu2.zzy((zzl)object, (zzbk)object2);
                return;
                break block9;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
        object2 = loadAdError;
        loadAdError = new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null);
        adLoadCallback.onAdFailedToLoad(loadAdError);
    }
}

