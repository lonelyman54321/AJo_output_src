/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.view.View
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbrh;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsj;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbys;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbsg
extends zzbrh {
    private final Object zza;
    private zzbsi zzb;
    private zzbys zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl;

    public zzbsg(Adapter adapter) {
        this.zzl = "";
        this.zza = adapter;
    }

    public zzbsg(MediationAdapter mediationAdapter) {
        this.zzl = "";
        this.zza = mediationAdapter;
    }

    public static /* bridge */ /* synthetic */ void zzQ(zzbsg zzbsg2, MediationInterstitialAd mediationInterstitialAd) {
        zzbsg2.zzf = mediationInterstitialAd;
    }

    public static /* bridge */ /* synthetic */ void zzR(zzbsg zzbsg2, NativeAdMapper nativeAdMapper) {
        zzbsg2.zzh = nativeAdMapper;
    }

    public static /* bridge */ /* synthetic */ void zzS(zzbsg zzbsg2, MediationRewardedAd mediationRewardedAd) {
        zzbsg2.zzi = mediationRewardedAd;
    }

    public static /* bridge */ /* synthetic */ void zzT(zzbsg zzbsg2, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzbsg2.zzg = unifiedNativeAdMapper;
    }

    public static /* bridge */ /* synthetic */ void zzU(zzbsg zzbsg2, View view) {
        zzbsg2.zze = view;
    }

    private final Bundle zzV(zzl zzl2) {
        String string2;
        zzl2 = zzl2.zzm;
        if (zzl2 != null && (zzl2 = zzl2.getBundle(string2 = this.zza.getClass().getName())) != null) {
            return zzl2;
        }
        zzl2 = new Bundle();
        return zzl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bundle zzW(String object, zzl zzl2, String string2) {
        Throwable throwable2;
        block6: {
            Object object2;
            block5: {
                boolean bl2;
                block4: {
                    object2 = String.valueOf(object);
                    Object object3 = "Server parameters: ";
                    object2 = ((String)object3).concat((String)object2);
                    zzm.zze((String)object2);
                    try {
                        boolean bl3;
                        object2 = new Bundle();
                        if (object == null) break block4;
                        object2 = new JSONObject((String)object);
                        object = new Bundle();
                        object3 = object2.keys();
                        while (bl3 = object3.hasNext()) {
                            Object object4 = object3.next();
                            object4 = (String)object4;
                            String string3 = object2.getString(object4);
                            object.putString(object4, string3);
                        }
                        object2 = object;
                    }
                    catch (Throwable throwable2) {}
                }
                if (!(bl2 = (object = this.zza) instanceof AdMobAdapter)) break block5;
                object = "adJson";
                object2.putString((String)object, string2);
                if (zzl2 == null) break block5;
                object = "tagForChildDirectedTreatment";
                int n3 = zzl2.zzg;
                object2.putInt((String)object, n3);
                break block6;
            }
            object = "max_ad_content_rating";
            object2.remove((String)object);
            return object2;
        }
        zzm.zzh("", throwable2);
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    private static final boolean zzX(zzl zzl2) {
        boolean bl2 = zzl2.zzf;
        if (!bl2) {
            zzay.zzb();
            bl2 = com.google.android.gms.ads.internal.util.client.zzf.zzs();
            if (!bl2) {
                return false;
            }
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final String zzY(String string2, zzl object) {
        JSONObject jSONObject;
        object = ((zzl)object).zzu;
        try {
            jSONObject = new JSONObject(string2);
            string2 = "max_ad_content_rating";
        }
        catch (JSONException jSONException) {
            return object;
        }
        return jSONObject.getString(string2);
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzbsg zzbsg2) {
        return zzbsg2.zza;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbsg zzbsg2, MediationAppOpenAd mediationAppOpenAd) {
        zzbsg2.zzk = mediationAppOpenAd;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbsg zzbsg2, MediationInterscrollerAd mediationInterscrollerAd) {
        zzbsg2.zzj = mediationInterscrollerAd;
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        Object object = zzl2;
        Object object2 = string2;
        Object object3 = this.zza;
        boolean bl2 = object3 instanceof Adapter;
        if (bl2) {
            Object object4;
            object3 = "Requesting rewarded ad from adapter.";
            zzm.zze((String)object3);
            try {
                object3 = this.zza;
            }
            catch (Exception exception) {
                zzm.zzh("", exception);
                object3 = iObjectWrapper;
                zzbrc.zza(iObjectWrapper, exception, "adapter.loadRewardedAd");
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
            object3 = (Adapter)object3;
            Object object5 = zzbrl2;
            zzbse zzbse2 = new zzbse(this, zzbrl2);
            Object object6 = object5 = ObjectWrapper.unwrap(iObjectWrapper);
            object6 = (Context)object5;
            String string3 = "";
            object5 = null;
            Bundle bundle = this.zzW(string2, zzl2, null);
            Bundle bundle2 = this.zzV(zzl2);
            boolean bl3 = zzbsg.zzX(zzl2);
            Location location = zzl2.zzk;
            int n3 = zzl2.zzg;
            int n4 = zzl2.zzt;
            String string4 = zzbsg.zzY(string2, zzl2);
            object = "";
            object5 = object4;
            object2 = object4;
            object4 = object;
            ((MediationRewardedAdConfiguration)object5)((Context)object6, string3, bundle, bundle2, bl3, location, n3, n4, string4, (String)object);
            ((Adapter)object3).loadRewardedAd((MediationRewardedAdConfiguration)object5, zzbse2);
            return;
        }
        object = Adapter.class.getCanonicalName();
        object2 = object3.getClass().getCanonicalName();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" #009 Class mismatch: ");
        ((StringBuilder)object3).append((String)object2);
        zzm.zzj(((StringBuilder)object3).toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzB(zzl object, String string2, String object2) {
        object2 = this.zza;
        boolean bl2 = object2 instanceof Adapter;
        if (bl2) {
            IObjectWrapper iObjectWrapper = this.zzd;
            object2 = (Adapter)object2;
            zzbys zzbys2 = this.zzc;
            zzbsj zzbsj2 = new zzbsj((Adapter)object2, zzbys2);
            this.zzA(iObjectWrapper, (zzl)object, string2, zzbsj2);
            return;
        }
        object = Adapter.class.getCanonicalName();
        string2 = object2.getClass().getCanonicalName();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" #009 Class mismatch: ");
        ((StringBuilder)object2).append(string2);
        zzm.zzj(((StringBuilder)object2).toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        Object object = zzl2;
        Object object2 = string2;
        Object object3 = this.zza;
        boolean bl2 = object3 instanceof Adapter;
        if (bl2) {
            Object object4;
            object3 = "Requesting rewarded interstitial ad from adapter.";
            zzm.zze((String)object3);
            try {
                object3 = this.zza;
            }
            catch (Exception exception) {
                object3 = iObjectWrapper;
                zzbrc.zza(iObjectWrapper, exception, "adapter.loadRewardedInterstitialAd");
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
            object3 = (Adapter)object3;
            Object object5 = zzbrl2;
            zzbse zzbse2 = new zzbse(this, zzbrl2);
            Object object6 = object5 = ObjectWrapper.unwrap(iObjectWrapper);
            object6 = (Context)object5;
            String string3 = "";
            object5 = null;
            Bundle bundle = this.zzW(string2, zzl2, null);
            Bundle bundle2 = this.zzV(zzl2);
            boolean bl3 = zzbsg.zzX(zzl2);
            Location location = zzl2.zzk;
            int n3 = zzl2.zzg;
            int n4 = zzl2.zzt;
            String string4 = zzbsg.zzY(string2, zzl2);
            object = "";
            object5 = object4;
            object2 = object4;
            object4 = object;
            ((MediationRewardedAdConfiguration)object5)((Context)object6, string3, bundle, bundle2, bl3, location, n3, n4, string4, (String)object);
            ((Adapter)object3).loadRewardedInterstitialAd((MediationRewardedAdConfiguration)object5, zzbse2);
            return;
        }
        object = Adapter.class.getCanonicalName();
        object2 = object3.getClass().getCanonicalName();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" #009 Class mismatch: ");
        ((StringBuilder)object3).append((String)object2);
        zzm.zzj(((StringBuilder)object3).toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzD(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        Object object = this.zza;
        boolean bl2 = object instanceof OnContextChangedListener;
        if (bl2) {
            object = (OnContextChangedListener)object;
            object.onContextChanged((Context)iObjectWrapper);
        }
    }

    public final void zzE() {
        Object object = this.zza;
        boolean bl2 = object instanceof MediationAdapter;
        if (!bl2) {
            return;
        }
        try {
            object = (MediationAdapter)object;
        }
        catch (Throwable throwable) {
            zzm.zzh("", throwable);
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        object.onPause();
    }

    public final void zzF() {
        Object object = this.zza;
        boolean bl2 = object instanceof MediationAdapter;
        if (!bl2) {
            return;
        }
        try {
            object = (MediationAdapter)object;
        }
        catch (Throwable throwable) {
            zzm.zzh("", throwable);
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        object.onResume();
    }

    public final void zzG(boolean bl2) {
        Object object = this.zza;
        boolean bl3 = object instanceof OnImmersiveModeUpdatedListener;
        if (bl3) {
            try {
                object = (OnImmersiveModeUpdatedListener)object;
            }
            catch (Throwable throwable) {
                zzm.zzh("", throwable);
                return;
            }
            object.onImmersiveModeUpdated(bl2);
            return;
        }
        String string2 = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        object = object.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append((String)object);
        zzm.zze(stringBuilder.toString());
    }

    public final void zzH(IObjectWrapper object) {
        Object object2 = this.zza;
        boolean bl2 = object2 instanceof Adapter;
        if (bl2) {
            zzm.zze("Show app open ad from adapter.");
            object2 = this.zzk;
            if (object2 != null) {
                Object object3;
                try {
                    object3 = ObjectWrapper.unwrap((IObjectWrapper)object);
                }
                catch (RuntimeException runtimeException) {
                    zzbrc.zza((IObjectWrapper)object, runtimeException, "adapter.appOpen.showAd");
                    throw runtimeException;
                }
                object3 = (Context)object3;
                object2.showAd((Context)object3);
                return;
            }
            zzm.zzg("Can not show null mediation app open ad.");
            object = new RemoteException();
            throw object;
        }
        object = Adapter.class.getCanonicalName();
        object2 = object2.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append((String)object2);
        zzm.zzj(stringBuilder.toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzI() {
        Object object = this.zza;
        boolean bl2 = object instanceof MediationInterstitialAdapter;
        if (bl2) {
            object = "Showing interstitial from adapter.";
            zzm.zze((String)object);
            try {
                object = this.zza;
            }
            catch (Throwable throwable) {
                zzm.zzh("", throwable);
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
            object = (MediationInterstitialAdapter)object;
            object.showInterstitial();
            return;
        }
        String string2 = MediationInterstitialAdapter.class.getCanonicalName();
        object = object.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append((String)object);
        zzm.zzj(stringBuilder.toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzJ(IObjectWrapper object) {
        Object object2 = this.zza;
        boolean bl2 = object2 instanceof Adapter;
        if (!bl2 && !(bl2 = object2 instanceof MediationInterstitialAdapter)) {
            object = MediationInterstitialAdapter.class.getCanonicalName();
            String string2 = Adapter.class.getCanonicalName();
            object2 = object2.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(" or ");
            stringBuilder.append(string2);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append((String)object2);
            zzm.zzj(stringBuilder.toString());
            object = new RemoteException();
            throw object;
        }
        boolean bl3 = object2 instanceof MediationInterstitialAdapter;
        if (bl3) {
            this.zzI();
            return;
        }
        zzm.zze("Show interstitial ad from adapter.");
        object2 = this.zzf;
        if (object2 != null) {
            Object object3;
            try {
                object3 = ObjectWrapper.unwrap((IObjectWrapper)object);
            }
            catch (RuntimeException runtimeException) {
                zzbrc.zza((IObjectWrapper)object, runtimeException, "adapter.interstitial.showAd");
                throw runtimeException;
            }
            object3 = (Context)object3;
            object2.showAd((Context)object3);
            return;
        }
        zzm.zzg("Can not show null mediation interstitial ad.");
        object = new RemoteException();
        throw object;
    }

    public final void zzK(IObjectWrapper object) {
        Object object2 = this.zza;
        boolean bl2 = object2 instanceof Adapter;
        if (bl2) {
            zzm.zze("Show rewarded ad from adapter.");
            object2 = this.zzi;
            if (object2 != null) {
                Object object3;
                try {
                    object3 = ObjectWrapper.unwrap((IObjectWrapper)object);
                }
                catch (RuntimeException runtimeException) {
                    zzbrc.zza((IObjectWrapper)object, runtimeException, "adapter.rewarded.showAd");
                    throw runtimeException;
                }
                object3 = (Context)object3;
                object2.showAd((Context)object3);
                return;
            }
            zzm.zzg("Can not show null mediation rewarded ad.");
            object = new RemoteException();
            throw object;
        }
        object = Adapter.class.getCanonicalName();
        object2 = object2.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append((String)object2);
        zzm.zzj(stringBuilder.toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzL() {
        Object object = this.zza;
        boolean bl2 = object instanceof Adapter;
        if (bl2) {
            object = this.zzi;
            if (object != null) {
                Object object2;
                try {
                    object2 = this.zzd;
                }
                catch (RuntimeException runtimeException) {
                    zzbrc.zza(this.zzd, runtimeException, "adapter.showVideo");
                    throw runtimeException;
                }
                object2 = ObjectWrapper.unwrap((IObjectWrapper)object2);
                object2 = (Context)object2;
                object.showAd((Context)object2);
                return;
            }
            zzm.zzg("Can not show null mediated rewarded ad.");
            object = new RemoteException();
            throw object;
        }
        String string2 = Adapter.class.getCanonicalName();
        object = object.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append((String)object);
        zzm.zzj(stringBuilder.toString());
        object = new RemoteException();
        throw object;
    }

    public final boolean zzM() {
        return false;
    }

    public final boolean zzN() {
        String string2;
        boolean bl2;
        Object object = this.zza;
        boolean bl3 = object instanceof Adapter;
        if (!bl3 && !(bl2 = Objects.equals(object = object.getClass().getCanonicalName(), string2 = "com.google.ads.mediation.admob.AdMobAdapter"))) {
            object = this.zza;
            string2 = Adapter.class.getCanonicalName();
            object = object.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append((String)object);
            zzm.zzj(stringBuilder.toString());
            object = new RemoteException();
            throw object;
        }
        object = this.zzc;
        return object != null;
    }

    public final zzbrq zzO() {
        return null;
    }

    public final zzbrr zzP() {
        return null;
    }

    public final Bundle zze() {
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final Bundle zzg() {
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final zzdq zzh() {
        Object object = this.zza;
        boolean bl2 = object instanceof zza;
        if (bl2) {
            object = (zza)object;
            try {
                return object.getVideoController();
            }
            catch (Throwable throwable) {
                String string2 = "";
                zzm.zzh(string2, throwable);
            }
        }
        return null;
    }

    public final zzbip zzi() {
        boolean bl2;
        Object object = this.zzb;
        if (object != null && (bl2 = (object = ((zzbsi)object).zzc()) instanceof zzbiq)) {
            return ((zzbiq)object).zza();
        }
        return null;
    }

    public final zzbro zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            zzbsh zzbsh2 = new zzbsh(mediationInterscrollerAd);
            return zzbsh2;
        }
        return null;
    }

    public final zzbru zzk() {
        Object object = this.zza;
        boolean bl2 = object instanceof MediationNativeAdapter;
        if (bl2) {
            object = this.zzb;
            if (object != null && (object = ((zzbsi)object).zza()) != null) {
                zzbsm zzbsm2 = new zzbsm((UnifiedNativeAdMapper)object);
                return zzbsm2;
            }
        } else {
            boolean bl3 = object instanceof Adapter;
            if (bl3) {
                object = this.zzh;
                if (object != null) {
                    zzbsk zzbsk2 = new zzbsk((NativeAdMapper)object);
                    return zzbsk2;
                }
                object = this.zzg;
                if (object != null) {
                    zzbsm zzbsm3 = new zzbsm((UnifiedNativeAdMapper)object);
                    return zzbsm3;
                }
            }
        }
        return null;
    }

    public final zzbtt zzl() {
        Object object = this.zza;
        boolean bl2 = object instanceof Adapter;
        if (!bl2) {
            return null;
        }
        return zzbtt.zza(((Adapter)object).getVersionInfo());
    }

    public final zzbtt zzm() {
        Object object = this.zza;
        boolean bl2 = object instanceof Adapter;
        if (!bl2) {
            return null;
        }
        return zzbtt.zza(((Adapter)object).getSDKVersionInfo());
    }

    public final IObjectWrapper zzn() {
        Object object = this.zza;
        boolean bl2 = object instanceof MediationBannerAdapter;
        if (bl2) {
            try {
                object = (MediationBannerAdapter)object;
            }
            catch (Throwable throwable) {
                zzm.zzh("", throwable);
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
            object = object.getBannerView();
            return ObjectWrapper.wrap(object);
        }
        bl2 = object instanceof Adapter;
        if (bl2) {
            return ObjectWrapper.wrap(this.zze);
        }
        String string2 = MediationBannerAdapter.class.getCanonicalName();
        String string3 = Adapter.class.getCanonicalName();
        object = object.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" or ");
        stringBuilder.append(string3);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append((String)object);
        zzm.zzj(stringBuilder.toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzo() {
        Object object = this.zza;
        boolean bl2 = object instanceof MediationAdapter;
        if (!bl2) {
            return;
        }
        try {
            object = (MediationAdapter)object;
        }
        catch (Throwable throwable) {
            zzm.zzh("", throwable);
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        object.onDestroy();
    }

    public final void zzp(IObjectWrapper object, zzl object2, String charSequence, zzbys zzbys2, String string2) {
        boolean bl2;
        object2 = this.zza;
        boolean bl3 = object2 instanceof Adapter;
        if (!bl3 && !(bl2 = Objects.equals(object2 = object2.getClass().getCanonicalName(), charSequence = "com.google.ads.mediation.admob.AdMobAdapter"))) {
            object = this.zza;
            object2 = Adapter.class.getCanonicalName();
            object = object.getClass().getCanonicalName();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(" #009 Class mismatch: ");
            ((StringBuilder)charSequence).append((String)object);
            zzm.zzj(((StringBuilder)charSequence).toString());
            object = new RemoteException();
            throw object;
        }
        this.zzd = object;
        this.zzc = zzbys2;
        object = ObjectWrapper.wrap(this.zza);
        zzbys2.zzl((IObjectWrapper)object);
    }

    public final void zzq(IObjectWrapper object, zzbnr arrayList, List object2) {
        block19: {
            boolean bl2;
            Object object3 = this.zza;
            boolean bl3 = object3 instanceof Adapter;
            if (!bl3) break block19;
            object3 = new zzbrz(this, (zzbnr)((Object)arrayList));
            arrayList = new ArrayList<Object>();
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                int n3;
                Object object4;
                int n4;
                Object object5;
                zzbnx zzbnx2;
                block20: {
                    zzbnx2 = (zzbnx)object2.next();
                    object5 = zzbnx2.zza;
                    n4 = ((String)object5).hashCode();
                    switch (n4) {
                        default: {
                            break;
                        }
                        case 1911491517: {
                            object4 = "rewarded_interstitial";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 3;
                            break block20;
                        }
                        case 1778294298: {
                            object4 = "app_open_ad";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 6;
                            break block20;
                        }
                        case 1167692200: {
                            object4 = "app_open";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 5;
                            break block20;
                        }
                        case 604727084: {
                            object4 = "interstitial";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 1;
                            break block20;
                        }
                        case -239580146: {
                            object4 = "rewarded";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 2;
                            break block20;
                        }
                        case -1052618729: {
                            object4 = "native";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 4;
                            break block20;
                        }
                        case -1396342996: {
                            object4 = "banner";
                            n3 = (int)(((String)object5).equals(object4) ? 1 : 0);
                            if (n3 == 0) break;
                            n3 = 0;
                            object5 = null;
                            break block20;
                        }
                    }
                    n3 = -1;
                }
                n4 = 0;
                object4 = null;
                switch (n3) {
                    default: {
                        break;
                    }
                    case 6: {
                        object5 = zzbep.zzlN;
                        zzben zzben2 = zzba.zzc();
                        object5 = (Boolean)zzben2.zza((zzbeg)object5);
                        n3 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                        if (n3 == 0) break;
                        object4 = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    case 5: {
                        object4 = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    case 4: {
                        object4 = AdFormat.NATIVE;
                        break;
                    }
                    case 3: {
                        object4 = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    }
                    case 2: {
                        object4 = AdFormat.REWARDED;
                        break;
                    }
                    case 1: {
                        object4 = AdFormat.INTERSTITIAL;
                        break;
                    }
                    case 0: {
                        object4 = AdFormat.BANNER;
                    }
                }
                if (object4 == null) continue;
                zzbnx2 = zzbnx2.zzb;
                object5 = new MediationConfiguration((AdFormat)((Object)object4), (Bundle)zzbnx2);
                arrayList.add(object5);
            }
            object2 = (Adapter)this.zza;
            object = (Context)ObjectWrapper.unwrap(object);
            ((Adapter)object2).initialize((Context)object, (InitializationCompleteCallback)object3, arrayList);
            return;
        }
        object = new RemoteException();
        throw object;
    }

    public final void zzr(IObjectWrapper object, zzbys zzbys2, List list) {
        zzm.zzj("Could not initialize rewarded video adapter.");
        object = new RemoteException();
        throw object;
    }

    public final void zzs(zzl zzl2, String string2) {
        this.zzB(zzl2, string2, null);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        Object object = zzl2;
        Object object2 = string2;
        Object object3 = this.zza;
        boolean bl2 = object3 instanceof Adapter;
        if (bl2) {
            Object object4;
            object3 = "Requesting app open ad from adapter.";
            zzm.zze((String)object3);
            try {
                object3 = this.zza;
            }
            catch (Exception exception) {
                zzm.zzh("", exception);
                object3 = iObjectWrapper;
                zzbrc.zza(iObjectWrapper, exception, "adapter.loadAppOpenAd");
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
            object3 = (Adapter)object3;
            Object object5 = zzbrl2;
            zzbsf zzbsf2 = new zzbsf(this, zzbrl2);
            Object object6 = object5 = ObjectWrapper.unwrap(iObjectWrapper);
            object6 = (Context)object5;
            String string3 = "";
            object5 = null;
            Bundle bundle = this.zzW(string2, zzl2, null);
            Bundle bundle2 = this.zzV(zzl2);
            boolean bl3 = zzbsg.zzX(zzl2);
            Location location = zzl2.zzk;
            int n3 = zzl2.zzg;
            int n4 = zzl2.zzt;
            String string4 = zzbsg.zzY(string2, zzl2);
            object = "";
            object5 = object4;
            object2 = object4;
            object4 = object;
            ((MediationAppOpenAdConfiguration)object5)((Context)object6, string3, bundle, bundle2, bl3, location, n3, n4, string4, (String)object);
            ((Adapter)object3).loadAppOpenAd((MediationAppOpenAdConfiguration)object5, zzbsf2);
            return;
        }
        object = Adapter.class.getCanonicalName();
        object2 = object3.getClass().getCanonicalName();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" #009 Class mismatch: ");
        ((StringBuilder)object3).append((String)object2);
        zzm.zzj(((StringBuilder)object3).toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq2, zzl zzl2, String string2, zzbrl zzbrl2) {
        this.zzv(iObjectWrapper, zzq2, zzl2, string2, null, zzbrl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(IObjectWrapper iObjectWrapper, zzq object, zzl zzl2, String string2, String string3, zzbrl zzbrl2) {
        Object object2 = this;
        Object object3 = iObjectWrapper;
        Object object4 = object;
        Object object5 = zzl2;
        Object object6 = string2;
        Object object7 = string3;
        Object object8 = zzbrl2;
        Object object9 = this.zza;
        boolean bl2 = object9 instanceof MediationBannerAdapter;
        if (!bl2 && !(bl2 = object9 instanceof Adapter)) {
            object4 = MediationBannerAdapter.class.getCanonicalName();
            object3 = Adapter.class.getCanonicalName();
            object5 = object9.getClass().getCanonicalName();
            object6 = new StringBuilder();
            ((StringBuilder)object6).append((String)object4);
            ((StringBuilder)object6).append(" or ");
            ((StringBuilder)object6).append((String)object3);
            ((StringBuilder)object6).append(" #009 Class mismatch: ");
            ((StringBuilder)object6).append((String)object5);
            zzm.zzj(((StringBuilder)object6).toString());
            object4 = new RemoteException();
            throw object4;
        }
        object9 = "Requesting banner ad from adapter.";
        zzm.zze((String)object9);
        int n3 = ((zzq)object4).zzn;
        if (n3 != 0) {
            n3 = ((zzq)object4).zze;
            int n4 = ((zzq)object4).zzb;
            object4 = com.google.android.gms.ads.zzb.zzd(n3, n4);
        } else {
            n3 = ((zzq)object4).zze;
            bl2 = ((zzq)object4).zzb;
            object4 = ((zzq)object4).zza;
            object4 = com.google.android.gms.ads.zzb.zzc(n3, (int)(bl2 ? 1 : 0), (String)object4);
        }
        Object object10 = object4;
        object4 = ((zzbsg)object2).zza;
        n3 = object4 instanceof MediationBannerAdapter;
        String string4 = "";
        if (n3 != 0) {
            Throwable throwable2;
            block11: {
                Object object11;
                Object object12;
                Object object13;
                try {
                    object4 = (MediationBannerAdapter)object4;
                    object9 = ((zzl)object5).zze;
                    bl2 = false;
                    object13 = null;
                    object11 = object9 != null ? (object12 = new HashSet(object9)) : null;
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                long l2 = ((zzl)object5).zzb;
                long l3 = -1;
                n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                Object object14 = n3 == 0 ? null : (object9 = new Date(l2));
                n3 = ((zzl)object5).zzd;
                Object object15 = ((zzl)object5).zzk;
                boolean bl3 = zzbsg.zzX(zzl2);
                int n7 = ((zzl)object5).zzg;
                boolean bl4 = ((zzl)object5).zzr;
                int n8 = ((zzl)object5).zzt;
                String string5 = zzbsg.zzY((String)object6, (zzl)object5);
                Object object16 = object12;
                object12 = new zzbrx((Date)object14, n3, (Set)object11, (Location)object15, bl3, n7, bl4, n8, string5);
                object9 = ((zzl)object5).zzm;
                if (object9 != null) {
                    object13 = object4.getClass();
                    object13 = ((Class)object13).getName();
                    object9 = object9.getBundle((String)object13);
                    object15 = object9;
                } else {
                    boolean bl5 = false;
                    object15 = null;
                }
                object9 = ObjectWrapper.unwrap(iObjectWrapper);
                object9 = (Context)object9;
                object13 = new zzbsi((zzbrl)object8);
                object8 = super.zzW((String)object6, (zzl)object5, (String)object7);
                object5 = object4;
                object6 = object9;
                object7 = object13;
                object9 = object10;
                object13 = object12;
                object12 = object15;
                object4.requestBannerAd((Context)object6, (MediationBannerListener)object7, (Bundle)object8, (AdSize)object10, (MediationAdRequest)object13, (Bundle)object15);
                return;
            }
            zzm.zzh(string4, throwable2);
            zzbrc.zza((IObjectWrapper)object3, throwable2, "adapter.requestBannerAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        n3 = object4 instanceof Adapter;
        if (n3 == 0) {
            return;
        }
        try {
            String string6;
            object4 = (Adapter)object4;
            Object object17 = new zzbsa((zzbsg)object2, (zzbrl)object8);
            object8 = ObjectWrapper.unwrap(iObjectWrapper);
            object8 = (Context)object8;
            object9 = "";
            Bundle bundle = ((zzbsg)object2).zzW((String)object6, (zzl)object5, (String)object7);
            Bundle bundle2 = ((zzbsg)object2).zzV((zzl)object5);
            int n10 = zzbsg.zzX(zzl2);
            Location location = ((zzl)object5).zzk;
            int n14 = ((zzl)object5).zzg;
            object = object17;
            int n15 = ((zzl)object5).zzt;
            String string7 = zzbsg.zzY((String)object6, (zzl)object5);
            object6 = ((zzbsg)object2).zzl;
            object5 = string6;
            CharSequence charSequence = object6;
            object6 = object8;
            object7 = object9;
            object8 = bundle;
            object9 = bundle2;
            bl2 = n10 != 0;
            bundle2 = location;
            n10 = n14;
            int n16 = n15;
            object17 = string6;
            string6 = string7;
            object2 = object;
            object3 = object5;
            object17 = charSequence;
            ((MediationBannerAdConfiguration)object5)((Context)object6, (String)object7, bundle, (Bundle)object9, bl2, location, n14, n15, string7, (AdSize)object10, (String)charSequence);
            ((Adapter)object4).loadBannerAd((MediationBannerAdConfiguration)object5, (MediationAdLoadCallback)object);
            return;
        }
        catch (Throwable throwable) {
            zzm.zzh(string4, throwable);
            object3 = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadBannerAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzq2, zzl zzl2, String string2, String string3, zzbrl zzbrl2) {
        Object object = zzq2;
        Object object2 = zzl2;
        Object object3 = string2;
        Object object4 = this.zza;
        boolean bl2 = object4 instanceof Adapter;
        if (bl2) {
            Object object5;
            object4 = "Requesting interscroller ad from adapter.";
            zzm.zze((String)object4);
            try {
                object4 = this.zza;
            }
            catch (Exception exception) {
                zzm.zzh("", exception);
                object3 = iObjectWrapper;
                zzbrc.zza(iObjectWrapper, exception, "adapter.loadInterscrollerAd");
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
            object4 = (Adapter)object4;
            Object object6 = zzbrl2;
            zzbry zzbry2 = new zzbry(this, zzbrl2, (Adapter)object4);
            Object object7 = object6 = ObjectWrapper.unwrap(iObjectWrapper);
            object7 = (Context)object6;
            String string4 = "";
            object6 = string3;
            Bundle bundle = this.zzW(string2, zzl2, string3);
            Bundle bundle2 = this.zzV(zzl2);
            boolean bl3 = zzbsg.zzX(zzl2);
            Location location = zzl2.zzk;
            int n3 = zzl2.zzg;
            int n4 = zzl2.zzt;
            object2 = zzbsg.zzY(string2, zzl2);
            int n7 = zzq2.zze;
            int n8 = zzq2.zzb;
            AdSize adSize = com.google.android.gms.ads.zzb.zze(n7, n8);
            String string5 = "";
            object6 = object5;
            object = object5;
            object5 = object2;
            ((MediationBannerAdConfiguration)object6)((Context)object7, string4, bundle, bundle2, bl3, location, n3, n4, (String)object2, adSize, string5);
            ((Adapter)object4).loadInterscrollerAd((MediationBannerAdConfiguration)object6, zzbry2);
            return;
        }
        object = Adapter.class.getCanonicalName();
        object2 = object4.getClass().getCanonicalName();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" #009 Class mismatch: ");
        ((StringBuilder)object3).append((String)object2);
        zzm.zzj(((StringBuilder)object3).toString());
        object = new RemoteException();
        throw object;
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        this.zzy(iObjectWrapper, zzl2, string2, null, zzbrl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, String string3, zzbrl zzbrl2) {
        zzbsg zzbsg2 = this;
        Object object = iObjectWrapper;
        Object object2 = zzl2;
        String string4 = string2;
        CharSequence charSequence = string3;
        Object object3 = zzbrl2;
        Object object4 = this.zza;
        int n3 = object4 instanceof MediationInterstitialAdapter;
        if (n3 == 0 && (n3 = object4 instanceof Adapter) == 0) {
            object2 = MediationInterstitialAdapter.class.getCanonicalName();
            object = Adapter.class.getCanonicalName();
            string4 = object4.getClass().getCanonicalName();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(" or ");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(" #009 Class mismatch: ");
            ((StringBuilder)charSequence).append(string4);
            zzm.zzj(((StringBuilder)charSequence).toString());
            object2 = new RemoteException();
            throw object2;
        }
        zzm.zze("Requesting interstitial ad from adapter.");
        object4 = zzbsg2.zza;
        n3 = object4 instanceof MediationInterstitialAdapter;
        String string5 = "";
        if (n3 != 0) {
            Throwable throwable2;
            block11: {
                boolean bl2;
                Object object5;
                Object object6;
                Object object7;
                block10: {
                    block9: {
                        object7 = object4;
                        try {
                            object7 = (MediationInterstitialAdapter)object4;
                            object4 = ((zzl)object2).zze;
                            if (object4 == null) break block9;
                            object6 = new HashSet(object4);
                            object5 = object6;
                            break block10;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                    }
                    bl2 = false;
                    object5 = null;
                }
                long l2 = ((zzl)object2).zzb;
                long l3 = -1;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                Date date = l4 == false ? null : new Date(l2);
                int n4 = ((zzl)object2).zzd;
                Location location = ((zzl)object2).zzk;
                boolean bl3 = zzbsg.zzX(zzl2);
                int n7 = ((zzl)object2).zzg;
                boolean bl4 = ((zzl)object2).zzr;
                n3 = ((zzl)object2).zzt;
                String string6 = zzbsg.zzY(string4, (zzl)object2);
                Object object8 = object4;
                object4 = new zzbrx(date, n4, (Set)object5, location, bl3, n7, bl4, n3, string6);
                Object object9 = ((zzl)object2).zzm;
                if (object9 != null) {
                    object6 = object7.getClass();
                    object6 = ((Class)object6).getName();
                    object5 = object9 = object9.getBundle((String)object6);
                } else {
                    bl2 = false;
                    object5 = null;
                }
                object9 = ObjectWrapper.unwrap(iObjectWrapper);
                object6 = object9;
                object6 = (Context)object9;
                object8 = new zzbsi((zzbrl)object3);
                date = zzbsg2.zzW(string4, (zzl)object2, (String)charSequence);
                Object object10 = object4;
                object7.requestInterstitialAd((Context)object6, (MediationInterstitialListener)object8, (Bundle)date, (MediationAdRequest)object4, (Bundle)object5);
                return;
            }
            zzm.zzh(string5, throwable2);
            zzbrc.zza((IObjectWrapper)object, throwable2, "adapter.requestInterstitialAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        n3 = object4 instanceof Adapter;
        if (n3 == 0) {
            return;
        }
        try {
            Object object11;
            object4 = (Adapter)object4;
            zzbsb zzbsb2 = new zzbsb(zzbsg2, (zzbrl)object3);
            Object object12 = object11 = ObjectWrapper.unwrap(iObjectWrapper);
            object12 = (Context)object11;
            String string7 = "";
            Bundle bundle = zzbsg2.zzW(string4, (zzl)object2, (String)charSequence);
            Bundle bundle2 = zzbsg2.zzV((zzl)object2);
            boolean bl5 = zzbsg.zzX(zzl2);
            Location location = ((zzl)object2).zzk;
            int n8 = ((zzl)object2).zzg;
            int n10 = ((zzl)object2).zzt;
            String string8 = zzbsg.zzY(string4, (zzl)object2);
            object2 = zzbsg2.zzl;
            object11 = object3;
            int n14 = n8;
            object3 = new MediationInterstitialAdConfiguration((Context)object12, string7, bundle, bundle2, bl5, location, n8, n10, string8, (String)object2);
            ((Adapter)object4).loadInterstitialAd((MediationInterstitialAdConfiguration)object3, zzbsb2);
            return;
        }
        catch (Throwable throwable) {
            zzm.zzh(string5, throwable);
            zzbrc.zza((IObjectWrapper)object, throwable, "adapter.loadInterstitialAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzz(IObjectWrapper iObjectWrapper, zzl object, String object2, String object3, zzbrl object4, zzbhk object5, List list) {
        zzbsg zzbsg2 = this;
        Object object6 = iObjectWrapper;
        Object object7 = object;
        Object object8 = object2;
        Object object9 = object3;
        Object object10 = object4;
        Object object11 = this.zza;
        int n3 = object11 instanceof MediationNativeAdapter;
        if (n3 == 0 && (n3 = object11 instanceof Adapter) == 0) {
            object6 = MediationNativeAdapter.class.getCanonicalName();
            object7 = Adapter.class.getCanonicalName();
            object11 = object11.getClass().getCanonicalName();
            object8 = new StringBuilder();
            ((StringBuilder)object8).append((String)object6);
            ((StringBuilder)object8).append(" or ");
            ((StringBuilder)object8).append((String)object7);
            ((StringBuilder)object8).append(" #009 Class mismatch: ");
            ((StringBuilder)object8).append((String)object11);
            zzm.zzj(((StringBuilder)object8).toString());
            object11 = new RemoteException();
            throw object11;
        }
        zzm.zze("Requesting native ad from adapter.");
        object11 = zzbsg2.zza;
        n3 = object11 instanceof MediationNativeAdapter;
        String string2 = "";
        if (n3 != 0) {
            Throwable throwable2;
            block14: {
                HashSet hashSet;
                Object object12;
                Object object13;
                block13: {
                    block12: {
                        try {
                            object11 = (MediationNativeAdapter)object11;
                            object13 = ((zzl)object7).zze;
                            if (object13 == null) break block12;
                            object12 = new HashSet(object13);
                            hashSet = object12;
                            break block13;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    boolean bl2 = false;
                    hashSet = null;
                }
                long l2 = ((zzl)object7).zzb;
                long l3 = -1;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                Date date = l4 == false ? null : new Date(l2);
                int n4 = ((zzl)object7).zzd;
                Location location = ((zzl)object7).zzk;
                boolean bl3 = zzbsg.zzX((zzl)object);
                int n7 = ((zzl)object7).zzg;
                boolean bl4 = ((zzl)object7).zzr;
                int n8 = ((zzl)object7).zzt;
                String string3 = zzbsg.zzY((String)object8, (zzl)object7);
                Object object14 = object13;
                zzbhk zzbhk2 = object5;
                object13 = new zzbsl(date, n4, hashSet, location, bl3, n7, (zzbhk)object5, list, bl4, n8, string3);
                Bundle bundle = ((zzl)object7).zzm;
                if (bundle != null) {
                    object12 = object11.getClass();
                    object12 = ((Class)object12).getName();
                    bundle = bundle.getBundle((String)object12);
                } else {
                    n8 = 0;
                    bundle = null;
                }
                zzbsg2.zzb = object12 = new zzbsi((zzbrl)object10);
                object10 = ObjectWrapper.unwrap(iObjectWrapper);
                object10 = (Context)object10;
                object12 = zzbsg2.zzb;
                object7 = zzbsg2.zzW((String)object8, (zzl)object7, (String)object9);
                object = object11;
                object2 = object10;
                object3 = object12;
                object4 = object7;
                object5 = object13;
                list = bundle;
                object11.requestNativeAd((Context)object10, (MediationNativeListener)object12, (Bundle)object7, (NativeMediationAdRequest)object13, bundle);
                return;
            }
            zzm.zzh(string2, throwable2);
            zzbrc.zza((IObjectWrapper)object6, throwable2, "adapter.requestNativeAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        n3 = object11 instanceof Adapter;
        if (n3 == 0) {
            return;
        }
        try {
            Object object15;
            Object object16;
            object11 = (Adapter)object11;
            zzbsd zzbsd2 = new zzbsd(zzbsg2, (zzbrl)object10);
            Object object17 = object16 = ObjectWrapper.unwrap(iObjectWrapper);
            object17 = (Context)object16;
            String string4 = "";
            Bundle bundle = zzbsg2.zzW((String)object8, (zzl)object7, (String)object9);
            Bundle bundle2 = zzbsg2.zzV((zzl)object7);
            boolean bl5 = zzbsg.zzX((zzl)object);
            object16 = ((zzl)object7).zzk;
            int n10 = ((zzl)object7).zzg;
            int n14 = ((zzl)object7).zzt;
            String string5 = zzbsg.zzY((String)object8, (zzl)object7);
            object7 = zzbsg2.zzl;
            Object object18 = object16;
            object16 = object15;
            object8 = object15;
            object15 = object18;
            int n15 = n10;
            ((MediationNativeAdConfiguration)object16)((Context)object17, string4, bundle, bundle2, bl5, (Location)object18, n10, n14, string5, (String)object7, (zzbhk)object5);
            ((Adapter)object11).loadNativeAdMapper((MediationNativeAdConfiguration)object16, zzbsd2);
            return;
        }
        catch (Throwable throwable) {
            boolean bl6;
            zzm.zzh(string2, throwable);
            object7 = "adapter.loadNativeAdMapper";
            zzbrc.zza((IObjectWrapper)object6, throwable, (String)object7);
            Object object19 = throwable.getMessage();
            boolean bl7 = TextUtils.isEmpty((CharSequence)object19);
            if (!bl7 && (bl6 = ((String)object19).equals(object7 = "Method is not found"))) {
                try {
                    object19 = zzbsg2.zza;
                    object19 = (Adapter)object19;
                    object8 = object4;
                    object7 = new zzbsc(zzbsg2, (zzbrl)object4);
                    Object object20 = object9 = ObjectWrapper.unwrap(iObjectWrapper);
                    object20 = (Context)object9;
                    String string6 = "";
                    object9 = object;
                    object10 = object2;
                    String string7 = object3;
                    Bundle bundle = zzbsg2.zzW((String)object2, (zzl)object, (String)object3);
                    Bundle bundle3 = zzbsg2.zzV((zzl)object);
                    boolean bl8 = zzbsg.zzX((zzl)object);
                    Location location = ((zzl)object).zzk;
                    n3 = ((zzl)object).zzg;
                    int n16 = ((zzl)object).zzt;
                    String string8 = zzbsg.zzY((String)object2, (zzl)object);
                    object9 = zzbsg2.zzl;
                    int n17 = n16;
                    Object object21 = object8;
                    int n18 = n3;
                    object8 = new MediationNativeAdConfiguration((Context)object20, string6, bundle, bundle3, bl8, location, n3, n16, string8, (String)object9, (zzbhk)object5);
                    ((Adapter)object19).loadNativeAd((MediationNativeAdConfiguration)object8, (MediationAdLoadCallback)object7);
                    return;
                }
                catch (Throwable throwable3) {
                    zzm.zzh(string2, throwable3);
                    zzbrc.zza((IObjectWrapper)object6, throwable3, "adapter.loadNativeAd");
                    RemoteException remoteException = new RemoteException();
                    throw remoteException;
                }
            }
            object19 = new RemoteException();
            throw object19;
        }
    }
}

