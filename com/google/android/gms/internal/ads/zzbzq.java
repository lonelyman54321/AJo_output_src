/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbzr;

public final class zzbzq
implements MediationRewardedAdCallback {
    private final zzbrl zza;

    public zzbzq(zzbrl zzbrl2) {
        this.zza = zzbrl2;
    }

    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called onAdClosed.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzf();
    }

    public final void onAdFailedToShow(AdError object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToShow.");
        int n3 = ((AdError)object).getCode();
        String string2 = ((AdError)object).getMessage();
        String string3 = ((AdError)object).getDomain();
        String string4 = "Mediation ad failed to show: Error Code = ";
        String string5 = ". Error Message = ";
        String string6 = " Error Domain = ";
        Object object2 = Fh3.a(n3, string4, string5, string2, string6);
        ((StringBuilder)object2).append(string3);
        object2 = ((StringBuilder)object2).toString();
        zzm.zzj((String)object2);
        try {
            object2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object = ((AdError)object).zza();
        object2.zzk((zze)object);
    }

    public final void onAdFailedToShow(String string2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToShow.");
        Object object = String.valueOf(string2);
        String string3 = "Mediation ad failed to show: ";
        object = string3.concat((String)object);
        zzm.zzj((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzl(string2);
    }

    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called onAdOpened.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzp();
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called onUserEarnedReward.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        zzbzr zzbzr2 = new zzbzr(rewardItem);
        object.zzt(zzbzr2);
    }

    public final void onVideoComplete() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called onVideoComplete.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzu();
    }

    public final void onVideoStart() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called onVideoStart.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzy();
    }

    public final void reportAdClicked() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called reportAdClicked.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zze();
    }

    public final void reportAdImpression() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object = "Adapter called reportAdImpression.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzm();
    }
}

