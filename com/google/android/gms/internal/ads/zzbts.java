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
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbzr;

final class zzbts
implements MediationBannerAdCallback,
MediationInterstitialAdCallback,
MediationRewardedAdCallback,
MediationNativeAdCallback,
MediationAppOpenAdCallback {
    final zzbrl zza;

    public zzbts(zzbrl zzbrl2) {
        this.zza = zzbrl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onAdClosed() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzf();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onAdFailedToShow(AdError object) {
        int n3;
        Object object2 = "Mediated ad failed to show: Error Code = ";
        try {
            n3 = ((AdError)object).getCode();
        }
        catch (RemoteException remoteException) {
            return;
        }
        String string2 = ((AdError)object).getMessage();
        String string3 = ((AdError)object).getDomain();
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        stringBuilder.append(n3);
        object2 = ". Error Message = ";
        stringBuilder.append((String)object2);
        stringBuilder.append(string2);
        object2 = " Error Domain = ";
        stringBuilder.append((String)object2);
        stringBuilder.append(string3);
        object2 = stringBuilder.toString();
        zzm.zzj((String)object2);
        object2 = this.zza;
        object = ((AdError)object).zza();
        object2.zzk((zze)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onAdFailedToShow(String string2) {
        StringBuilder stringBuilder;
        Object object = "Mediated ad failed to show: ";
        try {
            stringBuilder = new StringBuilder((String)object);
        }
        catch (RemoteException remoteException) {
            return;
        }
        stringBuilder.append(string2);
        object = stringBuilder.toString();
        zzm.zzj((String)object);
        object = this.zza;
        object.zzl(string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onAdLeftApplication() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzn();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onAdOpened() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzp();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onUserEarnedReward(RewardItem rewardItem) {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbzr zzbzr2 = new zzbzr(rewardItem);
        zzbrl2.zzt(zzbzr2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onVideoComplete() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzv();
    }

    public final void onVideoMute() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onVideoPause() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzw();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onVideoPlay() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzx();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onVideoStart() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzy();
    }

    public final void onVideoUnmute() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void reportAdClicked() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zze();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void reportAdImpression() {
        zzbrl zzbrl2;
        try {
            zzbrl2 = this.zza;
        }
        catch (RemoteException remoteException) {
            return;
        }
        zzbrl2.zzm();
    }
}

