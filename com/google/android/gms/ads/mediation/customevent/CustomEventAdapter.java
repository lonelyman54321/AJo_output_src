/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventNative;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;
import com.google.android.gms.ads.mediation.customevent.zza;
import com.google.android.gms.ads.mediation.customevent.zzb;
import com.google.android.gms.ads.mediation.customevent.zzc;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;

public final class CustomEventAdapter
implements MediationBannerAdapter,
MediationInterstitialAdapter,
MediationNativeAdapter {
    static final AdError zza;
    CustomEventBanner zzb;
    CustomEventInterstitial zzc;
    CustomEventNative zzd;
    private View zze;

    static {
        AdError adError;
        zza = adError = new AdError(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    }

    public static /* synthetic */ void zza(CustomEventAdapter customEventAdapter, View view) {
        customEventAdapter.zze = view;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zzb(Class clazz, String string2) {
        Throwable throwable2;
        if (string2 != null) {
            try {
                GenericDeclaration genericDeclaration = Class.forName(string2);
                genericDeclaration = genericDeclaration.getDeclaredConstructor(null);
                genericDeclaration = ((Constructor)genericDeclaration).newInstance(null);
                return clazz.cast(genericDeclaration);
            }
            catch (Throwable throwable2) {}
        } else {
            throw null;
        }
        String string3 = throwable2.getMessage();
        StringBuilder stringBuilder = new StringBuilder("Could not instantiate custom event adapter: ");
        stringBuilder.append(string2);
        stringBuilder.append(". ");
        stringBuilder.append(string3);
        zzm.zzj(stringBuilder.toString());
        return null;
    }

    public View getBannerView() {
        return this.zze;
    }

    public void onDestroy() {
        CustomEvent customEvent = this.zzb;
        if (customEvent != null) {
            customEvent.onDestroy();
        }
        if ((customEvent = this.zzc) != null) {
            customEvent.onDestroy();
        }
        if ((customEvent = this.zzd) != null) {
            customEvent.onDestroy();
        }
    }

    public void onPause() {
        CustomEvent customEvent = this.zzb;
        if (customEvent != null) {
            customEvent.onPause();
        }
        if ((customEvent = this.zzc) != null) {
            customEvent.onPause();
        }
        if ((customEvent = this.zzd) != null) {
            customEvent.onPause();
        }
    }

    public void onResume() {
        CustomEvent customEvent = this.zzb;
        if (customEvent != null) {
            customEvent.onResume();
        }
        if ((customEvent = this.zzc) != null) {
            customEvent.onResume();
        }
        if ((customEvent = this.zzd) != null) {
            customEvent.onResume();
        }
    }

    public void requestBannerAd(Context object, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Object object2 = "class_name";
        Object object3 = bundle.getString((String)object2);
        Object object4 = CustomEventBanner.class;
        this.zzb = object3 = (CustomEventBanner)CustomEventAdapter.zzb(object4, (String)object3);
        if (object3 == null) {
            object = zza;
            mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter)this, (AdError)object);
            return;
        }
        if (bundle2 == null) {
            bundle2 = null;
        } else {
            object2 = bundle.getString((String)object2);
            bundle2 = bundle2.getBundle((String)object2);
        }
        object2 = this.zzb;
        object2.getClass();
        object4 = new zza(this, mediationBannerListener);
        String string2 = bundle.getString("parameter");
        object3 = object;
        object2.requestBannerAd((Context)object, (CustomEventBannerListener)object4, string2, adSize, mediationAdRequest, bundle2);
    }

    public void requestInterstitialAd(Context object, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Object object2 = "class_name";
        Object object3 = bundle.getString((String)object2);
        Object object4 = CustomEventInterstitial.class;
        this.zzc = object3 = (CustomEventInterstitial)CustomEventAdapter.zzb(object4, (String)object3);
        if (object3 == null) {
            object = zza;
            mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter)this, (AdError)object);
            return;
        }
        if (bundle2 == null) {
            bundle2 = null;
        } else {
            object2 = bundle.getString((String)object2);
            bundle2 = bundle2.getBundle((String)object2);
        }
        object2 = this.zzc;
        object2.getClass();
        object4 = new zzb(this, this, mediationInterstitialListener);
        String string2 = bundle.getString("parameter");
        object3 = object;
        object2.requestInterstitialAd((Context)object, (CustomEventInterstitialListener)object4, string2, mediationAdRequest, bundle2);
    }

    public void requestNativeAd(Context object, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        Object object2 = "class_name";
        Object object3 = bundle.getString((String)object2);
        Object object4 = CustomEventNative.class;
        this.zzd = object3 = (CustomEventNative)CustomEventAdapter.zzb(object4, (String)object3);
        if (object3 == null) {
            object = zza;
            mediationNativeListener.onAdFailedToLoad((MediationNativeAdapter)this, (AdError)object);
            return;
        }
        if (bundle2 == null) {
            bundle2 = null;
        } else {
            object2 = bundle.getString((String)object2);
            bundle2 = bundle2.getBundle((String)object2);
        }
        object2 = this.zzd;
        object2.getClass();
        object4 = new zzc(this, mediationNativeListener);
        String string2 = bundle.getString("parameter");
        object3 = object;
        object2.requestNativeAd((Context)object, (CustomEventNativeListener)object4, string2, nativeMediationAdRequest, bundle2);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}

