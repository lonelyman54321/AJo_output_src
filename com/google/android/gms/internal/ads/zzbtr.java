/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbtr
extends zzbtd {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbtr(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbtr zzbtr2, MediationAppOpenAd mediationAppOpenAd) {
        zzbtr2.zzd = mediationAppOpenAd;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbtr zzbtr2, MediationInterstitialAd mediationInterstitialAd) {
        zzbtr2.zzb = mediationInterstitialAd;
    }

    public static /* bridge */ /* synthetic */ void zzu(zzbtr zzbtr2, MediationRewardedAd mediationRewardedAd) {
        zzbtr2.zzc = mediationRewardedAd;
    }

    private final Bundle zzv(zzl zzl2) {
        String string2;
        zzl2 = zzl2.zzm;
        if (zzl2 != null && (zzl2 = zzl2.getBundle(string2 = this.zza.getClass().getName())) != null) {
            return zzl2;
        }
        zzl2 = new Bundle();
        return zzl2;
    }

    private static final Bundle zzw(String string2) {
        JSONException jSONException2;
        block14: {
            String string3;
            block12: {
                block13: {
                    string3 = String.valueOf(string2);
                    Object object = "Server parameters: ";
                    string3 = ((String)object).concat(string3);
                    zzm.zzj(string3);
                    string3 = new Bundle();
                    if (string2 == null) break block12;
                    string3 = new JSONObject(string2);
                    try {
                        string2 = new Bundle();
                        object = string3.keys();
                    }
                    catch (JSONException jSONException2) {}
                    while (true) {
                        boolean bl2 = object.hasNext();
                        if (!bl2) break block13;
                        break;
                    }
                    {
                        Object object2 = object.next();
                        object2 = (String)object2;
                        String string4 = string3.getString(object2);
                        string2.putString(object2, string4);
                        continue;
                    }
                    break block14;
                }
                string3 = string2;
            }
            return string3;
        }
        zzm.zzh("", jSONException2);
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    private static final boolean zzx(zzl zzl2) {
        boolean bl2 = zzl2.zzf;
        if (!bl2) {
            zzay.zzb();
            bl2 = zzf.zzs();
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
    private static final String zzy(String string2, zzl object) {
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

    public final zzdq zze() {
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

    public final zzbtt zzf() {
        return zzbtt.zza(this.zza.getVersionInfo());
    }

    public final zzbtt zzg() {
        return zzbtt.zza(this.zza.getSDKVersionInfo());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(IObjectWrapper var1_1, String var2_2, Bundle var3_4, Bundle var4_5, zzq var5_6, zzbth var6_7) {
        block23: {
            block24: {
                block25: {
                    try {
                        var7_8 = new zzbtp(this, (zzbth)var6_7);
                        var6_7 = this.zza;
                        var9_10 = var2_2 /* !! */ .hashCode();
                    }
                    catch (Throwable var2_3) {
                        break block23;
                    }
                    switch (var9_10) {
                        default: {
                            break;
                        }
                        case 1911491517: {
                            var10_11 = "rewarded_interstitial";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 3;
                            break block25;
                        }
                        case 1778294298: {
                            var10_11 = "app_open_ad";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 6;
                            break block25;
                        }
                        case 1167692200: {
                            var10_11 = "app_open";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 5;
                            break block25;
                        }
                        case 604727084: {
                            var10_11 = "interstitial";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 1;
                            break block25;
                        }
                        case -239580146: {
                            var10_11 = "rewarded";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 2;
                            break block25;
                        }
                        case -1052618729: {
                            var10_11 = "native";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 4;
                            break block25;
                        }
                        case -1396342996: {
                            var10_11 = "banner";
                            var11_12 = (int)var2_2 /* !! */ .equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 0;
                            var2_2 /* !! */  = null;
                            break block25;
                        }
                    }
                    var11_12 = -1;
                }
                switch (var11_12) {
                    default: {
                        ** GOTO lbl-1000
                    }
                    case 6: {
                        var2_2 /* !! */  = zzbep.zzlN;
                        var10_11 = zzba.zzc();
                        var2_2 /* !! */  = var10_11.zza((zzbeg)var2_2 /* !! */ );
                        var2_2 /* !! */  = (Boolean)var2_2 /* !! */ ;
                        var11_12 = (int)var2_2 /* !! */ .booleanValue();
                        if (var11_12 != 0) {
                            var2_2 /* !! */  = AdFormat.APP_OPEN_AD;
                            break block24;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_4 /* !! */  = "Internal Error";
                            var2_2 /* !! */  = new IllegalArgumentException((String)var3_4 /* !! */ );
                            throw var2_2 /* !! */ ;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = AdFormat.APP_OPEN_AD;
                        break block24;
                    }
                    case 4: {
                        var2_2 /* !! */  = AdFormat.NATIVE;
                        break block24;
                    }
                    case 3: {
                        var2_2 /* !! */  = AdFormat.REWARDED_INTERSTITIAL;
                        break block24;
                    }
                    case 2: {
                        var2_2 /* !! */  = AdFormat.REWARDED;
                        break block24;
                    }
                    case 1: {
                        var2_2 /* !! */  = AdFormat.INTERSTITIAL;
                        break block24;
                    }
                    case 0: 
                }
                var2_2 /* !! */  = AdFormat.BANNER;
            }
            var8_9 = new MediationConfiguration((AdFormat)var2_2 /* !! */ , var4_5 /* !! */ );
            var2_2 /* !! */  = new ArrayList();
            var2_2 /* !! */ .add(var8_9);
            var8_9 = ObjectWrapper.unwrap(var1_1 /* !! */ );
            var8_9 = (Context)var8_9;
            var9_10 = var5_6.zze;
            var12_13 = var5_6.zzb;
            var5_6 = var5_6.zza;
            var5_6 = com.google.android.gms.ads.zzb.zzc(var9_10, var12_13, (String)var5_6);
            var4_5 /* !! */  = new RtbSignalData((Context)var8_9, (List)var2_2 /* !! */ , var3_4 /* !! */ , (AdSize)var5_6);
            var6_7.collectSignals((RtbSignalData)var4_5 /* !! */ , var7_8);
            return;
        }
        zzm.zzh("Error generating signals for RTB", var2_3);
        zzbrc.zza(var1_1 /* !! */ , var2_3, "adapter.collectSignals");
        var1_1 /* !! */  = new RemoteException();
        throw var1_1 /* !! */ ;
    }

    public final void zzi(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsp zzbsp2, zzbrl zzbrl2) {
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration;
        zzbto zzbto2;
        zzl zzl3 = zzl2;
        Object object = zzbsp2;
        Object object2 = zzbrl2;
        try {
            zzbto2 = new zzbto(this, zzbsp2, zzbrl2);
            object = this.zza;
        }
        catch (Throwable throwable) {
            zzm.zzh("Adapter failed to render app open ad.", throwable);
            object = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadRtbAppOpenAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        Object object3 = object2 = ObjectWrapper.unwrap(iObjectWrapper);
        object3 = (Context)object2;
        Bundle bundle = zzbtr.zzw(string3);
        Bundle bundle2 = this.zzv(zzl2);
        boolean bl2 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n3 = zzl2.zzg;
        int n4 = zzl2.zzt;
        String string4 = zzbtr.zzy(string3, zzl2);
        String string5 = this.zze;
        object2 = mediationAppOpenAdConfiguration;
        mediationAppOpenAdConfiguration = new MediationAppOpenAdConfiguration((Context)object3, string2, bundle, bundle2, bl2, location, n3, n4, string4, string5);
        ((RtbAdapter)object).loadRtbAppOpenAd(mediationAppOpenAdConfiguration, zzbto2);
    }

    public final void zzj(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbss zzbss2, zzbrl zzbrl2, zzq zzq2) {
        Object object;
        zzbtj zzbtj2;
        Object object2 = zzl2;
        Object object3 = zzq2;
        Object object4 = zzbss2;
        Object object5 = zzbrl2;
        try {
            zzbtj2 = new zzbtj(this, zzbss2, zzbrl2);
            object4 = this.zza;
        }
        catch (Throwable throwable) {
            zzm.zzh("Adapter failed to render banner ad.", throwable);
            object3 = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadRtbBannerAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        Object object6 = object5 = ObjectWrapper.unwrap(iObjectWrapper);
        object6 = (Context)object5;
        Bundle bundle = zzbtr.zzw(string3);
        Bundle bundle2 = this.zzv(zzl2);
        boolean bl2 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n3 = zzl2.zzg;
        int n4 = zzl2.zzt;
        String string4 = zzbtr.zzy(string3, zzl2);
        int n7 = zzq2.zze;
        int n8 = zzq2.zzb;
        object3 = zzq2.zza;
        object2 = com.google.android.gms.ads.zzb.zzc(n7, n8, (String)object3);
        object3 = this.zze;
        object5 = object;
        object = object2;
        ((MediationBannerAdConfiguration)object5)((Context)object6, string2, bundle, bundle2, bl2, location, n3, n4, string4, (AdSize)object2, (String)object3);
        ((RtbAdapter)object4).loadRtbBannerAd((MediationBannerAdConfiguration)object5, zzbtj2);
    }

    public final void zzk(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbss zzbss2, zzbrl zzbrl2, zzq zzq2) {
        Object object;
        zzbtk zzbtk2;
        Object object2 = zzl2;
        Object object3 = zzq2;
        Object object4 = zzbss2;
        Object object5 = zzbrl2;
        try {
            zzbtk2 = new zzbtk(this, zzbss2, zzbrl2);
            object4 = this.zza;
        }
        catch (Throwable throwable) {
            zzm.zzh("Adapter failed to render interscroller ad.", throwable);
            object3 = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadRtbInterscrollerAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        Object object6 = object5 = ObjectWrapper.unwrap(iObjectWrapper);
        object6 = (Context)object5;
        Bundle bundle = zzbtr.zzw(string3);
        Bundle bundle2 = this.zzv(zzl2);
        boolean bl2 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n3 = zzl2.zzg;
        int n4 = zzl2.zzt;
        String string4 = zzbtr.zzy(string3, zzl2);
        int n7 = zzq2.zze;
        int n8 = zzq2.zzb;
        object3 = zzq2.zza;
        object2 = com.google.android.gms.ads.zzb.zzc(n7, n8, (String)object3);
        object3 = this.zze;
        object5 = object;
        object = object2;
        ((MediationBannerAdConfiguration)object5)((Context)object6, string2, bundle, bundle2, bl2, location, n3, n4, string4, (AdSize)object2, (String)object3);
        ((RtbAdapter)object4).loadRtbInterscrollerAd((MediationBannerAdConfiguration)object5, zzbtk2);
    }

    public final void zzl(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsv zzbsv2, zzbrl zzbrl2) {
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration;
        zzbtl zzbtl2;
        zzl zzl3 = zzl2;
        Object object = zzbsv2;
        Object object2 = zzbrl2;
        try {
            zzbtl2 = new zzbtl(this, zzbsv2, zzbrl2);
            object = this.zza;
        }
        catch (Throwable throwable) {
            zzm.zzh("Adapter failed to render interstitial ad.", throwable);
            object = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadRtbInterstitialAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        Object object3 = object2 = ObjectWrapper.unwrap(iObjectWrapper);
        object3 = (Context)object2;
        Bundle bundle = zzbtr.zzw(string3);
        Bundle bundle2 = this.zzv(zzl2);
        boolean bl2 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n3 = zzl2.zzg;
        int n4 = zzl2.zzt;
        String string4 = zzbtr.zzy(string3, zzl2);
        String string5 = this.zze;
        object2 = mediationInterstitialAdConfiguration;
        mediationInterstitialAdConfiguration = new MediationInterstitialAdConfiguration((Context)object3, string2, bundle, bundle2, bl2, location, n3, n4, string4, string5);
        ((RtbAdapter)object).loadRtbInterstitialAd(mediationInterstitialAdConfiguration, zzbtl2);
    }

    public final void zzm(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsy zzbsy2, zzbrl zzbrl2) {
        this.zzn(string2, string3, zzl2, iObjectWrapper, zzbsy2, zzbrl2, null);
    }

    public final void zzn(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsy zzbsy2, zzbrl zzbrl2, zzbhk zzbhk2) {
        Object object;
        Object object2;
        Object object3;
        int n3;
        Bundle bundle;
        String string4;
        Object object4;
        Object object5;
        zzbtm zzbtm2;
        Object object6 = this;
        Object object7 = zzl2;
        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
        Object object8 = zzbsy2;
        Object object9 = zzbrl2;
        try {
            zzbtm2 = new zzbtm(this, zzbsy2, zzbrl2);
            object5 = this.zza;
        }
        catch (Throwable throwable) {
            boolean bl2;
            object7 = "Adapter failed to render native ad.";
            zzm.zzh((String)object7, throwable);
            object5 = "adapter.loadRtbNativeAdMapper";
            zzbrc.zza(iObjectWrapper2, throwable, (String)object5);
            Object object10 = throwable.getMessage();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object10);
            if (!bl3 && (bl2 = ((String)object10).equals(object5 = "Method is not found"))) {
                try {
                    object10 = new zzbtn((zzbtr)object6, (zzbsy)object8, (zzbrl)object9);
                    object8 = ((zzbtr)object6).zza;
                }
                catch (Throwable throwable2) {
                    zzm.zzh((String)object7, throwable2);
                    zzbrc.zza(iObjectWrapper2, throwable2, "adapter.loadRtbNativeAd");
                    RemoteException remoteException = new RemoteException();
                    throw remoteException;
                }
                object5 = object9 = ObjectWrapper.unwrap(iObjectWrapper);
                object5 = (Context)object9;
                object4 = zzbtr.zzw(string3);
                object9 = zzl2;
                string4 = ((zzbtr)object6).zzv(zzl2);
                boolean bl4 = zzbtr.zzx(zzl2);
                bundle = zzl2.zzk;
                n3 = zzl2.zzg;
                int n4 = zzl2.zzt;
                String string5 = zzbtr.zzy(string3, zzl2);
                object3 = ((zzbtr)object6).zze;
                object9 = object2;
                object = object3;
                object3 = string2;
                object6 = object2;
                object2 = object;
                object = zzbhk2;
                ((MediationNativeAdConfiguration)object9)((Context)object5, string2, (Bundle)object4, (Bundle)string4, bl4, (Location)bundle, n3, n4, string5, (String)object2, zzbhk2);
                ((RtbAdapter)object8).loadRtbNativeAd((MediationNativeAdConfiguration)object9, (MediationAdLoadCallback)object10);
                return;
            }
            object10 = new RemoteException();
            throw object10;
        }
        object4 = object3 = ObjectWrapper.unwrap(iObjectWrapper);
        object4 = (Context)object3;
        Bundle bundle2 = zzbtr.zzw(string3);
        bundle = this.zzv(zzl2);
        n3 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n7 = zzl2.zzg;
        int n8 = zzl2.zzt;
        object = zzbtr.zzy(string3, zzl2);
        String string6 = this.zze;
        object3 = object2;
        string4 = string2;
        object7 = object2;
        object2 = new MediationNativeAdConfiguration((Context)object4, string2, bundle2, bundle, n3 != 0, location, n7, n8, (String)object, string6, zzbhk2);
        ((RtbAdapter)object5).loadRtbNativeAdMapper((MediationNativeAdConfiguration)object2, zzbtm2);
    }

    public final void zzo(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbtb zzbtb2, zzbrl zzbrl2) {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration;
        zzbtq zzbtq2;
        zzl zzl3 = zzl2;
        Object object = zzbtb2;
        Object object2 = zzbrl2;
        try {
            zzbtq2 = new zzbtq(this, zzbtb2, zzbrl2);
            object = this.zza;
        }
        catch (Throwable throwable) {
            zzm.zzh("Adapter failed to render rewarded interstitial ad.", throwable);
            object = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadRtbRewardedInterstitialAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        Object object3 = object2 = ObjectWrapper.unwrap(iObjectWrapper);
        object3 = (Context)object2;
        Bundle bundle = zzbtr.zzw(string3);
        Bundle bundle2 = this.zzv(zzl2);
        boolean bl2 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n3 = zzl2.zzg;
        int n4 = zzl2.zzt;
        String string4 = zzbtr.zzy(string3, zzl2);
        String string5 = this.zze;
        object2 = mediationRewardedAdConfiguration;
        mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration((Context)object3, string2, bundle, bundle2, bl2, location, n3, n4, string4, string5);
        ((RtbAdapter)object).loadRtbRewardedInterstitialAd(mediationRewardedAdConfiguration, zzbtq2);
    }

    public final void zzp(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbtb zzbtb2, zzbrl zzbrl2) {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration;
        zzbtq zzbtq2;
        zzl zzl3 = zzl2;
        Object object = zzbtb2;
        Object object2 = zzbrl2;
        try {
            zzbtq2 = new zzbtq(this, zzbtb2, zzbrl2);
            object = this.zza;
        }
        catch (Throwable throwable) {
            zzm.zzh("Adapter failed to render rewarded ad.", throwable);
            object = iObjectWrapper;
            zzbrc.zza(iObjectWrapper, throwable, "adapter.loadRtbRewardedAd");
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        Object object3 = object2 = ObjectWrapper.unwrap(iObjectWrapper);
        object3 = (Context)object2;
        Bundle bundle = zzbtr.zzw(string3);
        Bundle bundle2 = this.zzv(zzl2);
        boolean bl2 = zzbtr.zzx(zzl2);
        Location location = zzl2.zzk;
        int n3 = zzl2.zzg;
        int n4 = zzl2.zzt;
        String string4 = zzbtr.zzy(string3, zzl2);
        String string5 = this.zze;
        object2 = mediationRewardedAdConfiguration;
        mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration((Context)object3, string2, bundle, bundle2, bl2, location, n3, n4, string4, string5);
        ((RtbAdapter)object).loadRtbRewardedAd(mediationRewardedAdConfiguration, zzbtq2);
    }

    public final void zzq(String string2) {
        this.zze = string2;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd != null) {
            Object object = ObjectWrapper.unwrap(iObjectWrapper);
            object = (Context)object;
            try {
                mediationAppOpenAd.showAd((Context)object);
            }
            catch (Throwable throwable) {
                zzm.zzh("", throwable);
                object = "adapter.showRtbAppOpenAd";
                zzbrc.zza(iObjectWrapper, throwable, (String)object);
            }
            return true;
        }
        return false;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            Object object = ObjectWrapper.unwrap(iObjectWrapper);
            object = (Context)object;
            try {
                mediationInterstitialAd.showAd((Context)object);
            }
            catch (Throwable throwable) {
                zzm.zzh("", throwable);
                object = "adapter.showRtbInterstitialAd";
                zzbrc.zza(iObjectWrapper, throwable, (String)object);
            }
            return true;
        }
        return false;
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            Object object = ObjectWrapper.unwrap(iObjectWrapper);
            object = (Context)object;
            try {
                mediationRewardedAd.showAd((Context)object);
            }
            catch (Throwable throwable) {
                zzm.zzh("", throwable);
                object = "adapter.showRtbRewardedAd";
                zzbrc.zza(iObjectWrapper, throwable, (String)object);
            }
            return true;
        }
        return false;
    }
}

