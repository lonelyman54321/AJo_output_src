/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.zzb;
import com.google.ads.mediation.zzc;
import com.google.ads.mediation.zze;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader$Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.Iterator;

public abstract class AbstractAdViewAdapter
implements MediationBannerAdapter,
MediationInterstitialAdapter,
MediationNativeAdapter,
OnImmersiveModeUpdatedListener,
zza {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    protected AdView mAdView;
    protected InterstitialAd mInterstitialAd;

    public AdRequest buildAdRequest(Context object, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        boolean bl2;
        boolean bl3;
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder();
        Object object2 = mediationAdRequest.getKeywords();
        if (object2 != null) {
            boolean bl4;
            object2 = object2.iterator();
            while (bl4 = object2.hasNext()) {
                String string2 = (String)object2.next();
                adRequest$Builder.addKeyword(string2);
            }
        }
        if (bl3 = mediationAdRequest.isTesting()) {
            zzay.zzb();
            object = com.google.android.gms.ads.internal.util.client.zzf.zzz(object);
            adRequest$Builder.zza((String)object);
        }
        if ((bl2 = mediationAdRequest.taggedForChildDirectedTreatment()) != (bl3 = -1 != 0)) {
            bl2 = mediationAdRequest.taggedForChildDirectedTreatment();
            if (bl2 != (bl3 = true)) {
                bl3 = false;
                object2 = null;
            }
            adRequest$Builder.zzc(bl3);
        }
        bl2 = mediationAdRequest.isDesignedForFamilies();
        adRequest$Builder.zzb(bl2);
        object = this.buildExtrasBundle(bundle, bundle2);
        adRequest$Builder.addNetworkExtrasBundle(AdMobAdapter.class, (Bundle)object);
        return adRequest$Builder.build();
    }

    public abstract Bundle buildExtrasBundle(Bundle var1, Bundle var2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.mAdView;
    }

    public InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public zzdq getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.zza().zza();
        }
        return null;
    }

    public AdLoader$Builder newAdLoader(Context context, String string2) {
        AdLoader$Builder adLoader$Builder = new AdLoader$Builder(context, string2);
        return adLoader$Builder;
    }

    public void onDestroy() {
        Object object = this.mAdView;
        if (object != null) {
            object.destroy();
            this.mAdView = null;
        }
        if ((object = this.mInterstitialAd) != null) {
            this.mInterstitialAd = null;
        }
        if ((object = this.adLoader) != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean bl2) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(bl2);
        }
    }

    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.pause();
        }
    }

    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.resume();
        }
    }

    public void requestBannerAd(Context object, MediationBannerListener object2, Bundle bundle, AdSize object3, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Object object4;
        this.mAdView = object4 = new AdView((Context)object);
        int n3 = ((AdSize)object3).getWidth();
        int n4 = ((AdSize)object3).getHeight();
        AdSize adSize = new AdSize(n3, n4);
        object4.setAdSize(adSize);
        object3 = this.mAdView;
        object4 = this.getAdUnitId(bundle);
        ((BaseAdView)((Object)object3)).setAdUnitId((String)object4);
        object3 = this.mAdView;
        object4 = new zzb(this, (MediationBannerListener)object2);
        ((BaseAdView)((Object)object3)).setAdListener((AdListener)object4);
        object2 = this.mAdView;
        object = this.buildAdRequest((Context)object, mediationAdRequest, bundle2, bundle);
        ((BaseAdView)((Object)object2)).loadAd((AdRequest)object);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle object, MediationAdRequest object2, Bundle bundle) {
        String string2 = this.getAdUnitId((Bundle)object);
        object = this.buildAdRequest(context, (MediationAdRequest)object2, bundle, (Bundle)object);
        object2 = new zzc(this, mediationInterstitialListener);
        InterstitialAd.load(context, string2, (AdRequest)object, (InterstitialAdLoadCallback)object2);
    }

    public void requestNativeAd(Context object, MediationNativeListener object2, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zze zze2 = new zze(this, (MediationNativeListener)object2);
        object2 = bundle.getString(AD_UNIT_ID_PARAMETER);
        object2 = this.newAdLoader((Context)object, (String)object2).withAdListener(zze2);
        Iterator iterator = nativeMediationAdRequest.getNativeAdOptions();
        ((AdLoader$Builder)object2).zzc((com.google.android.gms.ads.formats.NativeAdOptions)((Object)iterator));
        iterator = nativeMediationAdRequest.getNativeAdRequestOptions();
        ((AdLoader$Builder)object2).withNativeAdOptions((NativeAdOptions)((Object)iterator));
        boolean bl2 = nativeMediationAdRequest.isUnifiedNativeAdRequested();
        if (bl2) {
            ((AdLoader$Builder)object2).zzb(zze2);
        }
        if (bl2 = nativeMediationAdRequest.zzb()) {
            boolean bl3;
            iterator = nativeMediationAdRequest.zza().keySet().iterator();
            while (bl3 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                boolean bl4 = true;
                Object object3 = (Boolean)nativeMediationAdRequest.zza().get(string2);
                boolean bl5 = (Boolean)object3;
                if (bl4 != bl5) {
                    bl5 = false;
                    object3 = null;
                } else {
                    object3 = zze2;
                }
                ((AdLoader$Builder)object2).zza(string2, zze2, (zzf)object3);
            }
        }
        this.adLoader = object2 = ((AdLoader$Builder)object2).build();
        object = this.buildAdRequest((Context)object, nativeMediationAdRequest, bundle2, bundle);
        ((AdLoader)object2).loadAd((AdRequest)object);
    }

    public void showInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(null);
        }
    }
}

