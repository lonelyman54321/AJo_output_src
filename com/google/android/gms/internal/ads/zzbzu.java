/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzbzu
extends RewardedInterstitialAd {
    private final String zza;
    private final zzbza zzb;
    private final Context zzc;
    private final zzbzs zzd;
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;

    public zzbzu(Context object, String string2) {
        this.zza = string2;
        Object object2 = object.getApplicationContext();
        this.zzc = object2;
        object2 = zzay.zza();
        zzbrb zzbrb2 = new zzbrb();
        object = ((zzaw)object2).zzq((Context)object, string2, zzbrb2);
        this.zzb = object;
        this.zzd = object;
    }

    public final Bundle getAdMetadata() {
        zzbza zzbza2;
        block3: {
            zzbza2 = this.zzb;
            if (zzbza2 == null) break block3;
            try {
                return zzbza2.zzb();
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
        zzbza2 = new Bundle();
        return zzbza2;
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    public final ResponseInfo getResponseInfo() {
        zzdn zzdn2;
        block3: {
            zzdn2 = null;
            zzbza zzbza2 = this.zzb;
            if (zzbza2 == null) break block3;
            try {
                zzdn2 = zzbza2.zzc();
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
    public final RewardItem getRewardItem() {
        RemoteException remoteException2;
        block2: {
            Object object;
            try {
                object = this.zzb;
                object = object != null ? object.zzd() : null;
            }
            catch (RemoteException remoteException2) {
                break block2;
            }
            if (object == null) return RewardItem.DEFAULT_REWARD;
            return new zzbzk((zzbyx)object);
        }
        String string2 = "#007 Could not call remote method.";
        zzm.zzl(string2, remoteException2);
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean bl2) {
        RemoteException remoteException2;
        block4: {
            block3: {
                zzbza zzbza2;
                try {
                    zzbza2 = this.zzb;
                    if (zzbza2 == null) break block3;
                }
                catch (RemoteException remoteException2) {}
                zzbza2.zzh(bl2);
                return;
                break block4;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        RemoteException remoteException2;
        block6: {
            block5: {
                zzbza zzbza2;
                this.zzf = onAdMetadataChangedListener;
                try {
                    zzbza2 = this.zzb;
                    if (zzbza2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                zzfd zzfd2 = new zzfd(onAdMetadataChangedListener);
                zzbza2.zzi(zzfd2);
                return;
                break block6;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        RemoteException remoteException2;
        block6: {
            block5: {
                zzbza zzbza2;
                this.zzg = onPaidEventListener;
                try {
                    zzbza2 = this.zzb;
                    if (zzbza2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                zzfe zzfe2 = new zzfe(onPaidEventListener);
                zzbza2.zzj(zzfe2);
                return;
                break block6;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        RemoteException remoteException2;
        block6: {
            block5: {
                zzbza zzbza2;
                try {
                    zzbza2 = this.zzb;
                    if (zzbza2 == null) break block5;
                }
                catch (RemoteException remoteException2) {}
                zzbzo zzbzo2 = new zzbzo(serverSideVerificationOptions);
                zzbza2.zzl(zzbzo2);
                return;
                break block6;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void show(Activity object, OnUserEarnedRewardListener object2) {
        RemoteException remoteException2;
        block7: {
            block6: {
                zzbzs zzbzs2 = this.zzd;
                zzbzs2.zzc((OnUserEarnedRewardListener)object2);
                try {
                    object2 = this.zzb;
                    if (object2 == null) break block6;
                }
                catch (RemoteException remoteException2) {}
                zzbzs2 = this.zzd;
                object2.zzk(zzbzs2);
                object2 = this.zzb;
                object = ObjectWrapper.wrap(object);
                object2.zzm((IObjectWrapper)object);
                return;
                break block7;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }

    public final void zza(zzdx object, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        RemoteException remoteException2;
        block9: {
            block8: {
                zzbza zzbza2;
                try {
                    zzbza2 = this.zzb;
                    if (zzbza2 == null) break block8;
                }
                catch (RemoteException remoteException2) {}
                Object object2 = zzp.zza;
                Context context = this.zzc;
                object = ((zzp)object2).zza(context, (zzdx)object);
                object2 = new zzbzt(rewardedInterstitialAdLoadCallback, this);
                zzbza2.zzg((zzl)object, (zzbzh)object2);
                return;
                break block9;
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }
}

