/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrv;

public final class zzbsi
implements MediationBannerListener,
MediationInterstitialListener,
MediationNativeListener {
    private final zzbrl zza;
    private UnifiedNativeAdMapper zzb;
    private zzbiq zzc;

    public zzbsi(zzbrl zzbrl2) {
        this.zza = zzbrl2;
    }

    public final void onAdClicked(MediationBannerAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdClicked.";
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

    public final void onAdClicked(MediationInterstitialAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdClicked.";
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

    public final void onAdClicked(MediationNativeAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = this.zzb;
        zzbiq zzbiq2 = this.zzc;
        String string2 = "#007 Could not call remote method.";
        if (zzbiq2 == null) {
            if (object == null) {
                zzm.zzl(string2, null);
                return;
            }
            boolean bl2 = ((UnifiedNativeAdMapper)object).getOverrideClickHandling();
            if (!bl2) {
                zzm.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        object = "Adapter called onAdClicked.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl(string2, remoteException);
            return;
        }
        object.zze();
    }

    public final void onAdClosed(MediationBannerAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdClosed.";
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

    public final void onAdClosed(MediationInterstitialAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdClosed.";
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

    public final void onAdClosed(MediationNativeAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdClosed.";
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

    public final void onAdFailedToLoad(MediationBannerAdapter object, int n3) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        String string2 = "Adapter called onAdFailedToLoad with error. ";
        object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzg(n3);
    }

    public final void onAdFailedToLoad(MediationBannerAdapter object, AdError object2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int n3 = ((AdError)object2).getCode();
        String string2 = ((AdError)object2).getMessage();
        String string3 = ((AdError)object2).getDomain();
        String string4 = "Adapter called onAdFailedToLoad with error. ErrorCode: ";
        String string5 = ". ErrorMessage: ";
        String string6 = ". ErrorDomain: ";
        object = Fh3.a(n3, string4, string5, string2, string6);
        ((StringBuilder)object).append(string3);
        object = ((StringBuilder)object).toString();
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object2 = ((AdError)object2).zza();
        object.zzh((zze)object2);
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter object, int n3) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = new StringBuilder("Adapter called onAdFailedToLoad with error ");
        ((StringBuilder)object).append(n3);
        String string2 = ".";
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzg(n3);
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter object, AdError object2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int n3 = ((AdError)object2).getCode();
        String string2 = ((AdError)object2).getMessage();
        String string3 = ((AdError)object2).getDomain();
        String string4 = "Adapter called onAdFailedToLoad with error. ErrorCode: ";
        String string5 = ". ErrorMessage: ";
        String string6 = ". ErrorDomain: ";
        object = Fh3.a(n3, string4, string5, string2, string6);
        ((StringBuilder)object).append(string3);
        object = ((StringBuilder)object).toString();
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object2 = ((AdError)object2).zza();
        object.zzh((zze)object2);
    }

    public final void onAdFailedToLoad(MediationNativeAdapter object, int n3) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = new StringBuilder("Adapter called onAdFailedToLoad with error ");
        ((StringBuilder)object).append(n3);
        String string2 = ".";
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzg(n3);
    }

    public final void onAdFailedToLoad(MediationNativeAdapter object, AdError object2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int n3 = ((AdError)object2).getCode();
        String string2 = ((AdError)object2).getMessage();
        String string3 = ((AdError)object2).getDomain();
        String string4 = "Adapter called onAdFailedToLoad with error. ErrorCode: ";
        String string5 = ". ErrorMessage: ";
        String string6 = ". ErrorDomain: ";
        object = Fh3.a(n3, string4, string5, string2, string6);
        ((StringBuilder)object).append(string3);
        object = ((StringBuilder)object).toString();
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object2 = ((AdError)object2).zza();
        object.zzh((zze)object2);
    }

    public final void onAdImpression(MediationNativeAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = this.zzb;
        zzbiq zzbiq2 = this.zzc;
        String string2 = "#007 Could not call remote method.";
        if (zzbiq2 == null) {
            if (object == null) {
                zzm.zzl(string2, null);
                return;
            }
            boolean bl2 = ((UnifiedNativeAdMapper)object).getOverrideImpressionRecording();
            if (!bl2) {
                zzm.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        object = "Adapter called onAdImpression.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl(string2, remoteException);
            return;
        }
        object.zzm();
    }

    public final void onAdLeftApplication(MediationBannerAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdLeftApplication.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzn();
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdLeftApplication.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzn();
    }

    public final void onAdLeftApplication(MediationNativeAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdLeftApplication.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzn();
    }

    public final void onAdLoaded(MediationBannerAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdLoaded.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzo();
    }

    public final void onAdLoaded(MediationInterstitialAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdLoaded.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzo();
    }

    public final void onAdLoaded(MediationNativeAdapter object, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Object object2 = "Adapter called onAdLoaded.";
        zzm.zze((String)object2);
        this.zzb = unifiedNativeAdMapper;
        boolean bl2 = object instanceof AdMobAdapter;
        if (!bl2) {
            boolean bl3;
            object = new VideoController();
            object2 = new zzbrv();
            ((VideoController)object).zzb((zzdq)object2);
            if (unifiedNativeAdMapper != null && (bl3 = unifiedNativeAdMapper.hasVideoContent())) {
                unifiedNativeAdMapper.zze((VideoController)object);
            }
        }
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzo();
    }

    public final void onAdOpened(MediationBannerAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdOpened.";
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

    public final void onAdOpened(MediationInterstitialAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdOpened.";
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

    public final void onAdOpened(MediationNativeAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAdOpened.";
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

    public final void onVideoEnd(MediationNativeAdapter object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onVideoEnd.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzv();
    }

    public final UnifiedNativeAdMapper zza() {
        return this.zzb;
    }

    public final void zzb(MediationBannerAdapter object, String string2, String string3) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = "Adapter called onAppEvent.";
        zzm.zze((String)object);
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzq(string2, string3);
    }

    public final zzbiq zzc() {
        return this.zzc;
    }

    public final void zzd(MediationNativeAdapter object, zzbiq zzbiq2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        object = String.valueOf(zzbiq2.zzb());
        String string2 = "Adapter called onAdLoaded with template id ";
        object = string2.concat((String)object);
        zzm.zze((String)object);
        this.zzc = zzbiq2;
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object.zzo();
    }

    public final void zze(MediationNativeAdapter object, zzbiq object2, String string2) {
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object2 = ((zzbiq)object2).zza();
        object.zzr((zzbip)object2, string2);
    }
}

