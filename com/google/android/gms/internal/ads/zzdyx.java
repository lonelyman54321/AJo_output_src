/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader$Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzdyl;
import com.google.android.gms.internal.ads.zzdym;
import com.google.android.gms.internal.ads.zzdyn;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzdyp;
import com.google.android.gms.internal.ads.zzdyq;
import com.google.android.gms.internal.ads.zzdyr;
import com.google.android.gms.internal.ads.zzdys;
import com.google.android.gms.internal.ads.zzdyt;
import com.google.android.gms.internal.ads.zzdyu;
import com.google.android.gms.internal.ads.zzdyv;
import com.google.android.gms.internal.ads.zzdyw;
import com.google.android.gms.internal.ads.zzdyy;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdyx
extends zzdi {
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdyl zzd;
    private final zzgge zze;
    private final zzdyy zzf;
    private zzdya zzg;

    public zzdyx(Context context, WeakReference weakReference, zzdyl zzdyl2, zzdyy zzdyy2, zzgge zzgge2) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdyl2;
        this.zze = zzgge2;
        this.zzf = zzdyy2;
    }

    public static /* bridge */ /* synthetic */ zzdyl zzb(zzdyx zzdyx2) {
        return zzdyx2.zzd;
    }

    public static /* bridge */ /* synthetic */ String zzc(Object object) {
        return zzdyx.zzl(object);
    }

    public static /* bridge */ /* synthetic */ void zzd(zzdyx zzdyx2, String string2, String string3) {
        zzdyx2.zzm(string2, string3);
    }

    private final Context zzj() {
        Context context = (Context)this.zzc.get();
        if (context == null) {
            context = this.zzb;
        }
        return context;
    }

    private static AdRequest zzk() {
        Bundle bundle = E1.a("request_origin", "inspector_ooct");
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder();
        return ((AdRequest$Builder)adRequest$Builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build();
    }

    private static String zzl(Object object) {
        block13: {
            block7: {
                boolean bl2;
                block12: {
                    block11: {
                        block10: {
                            block9: {
                                block8: {
                                    block6: {
                                        bl2 = object instanceof LoadAdError;
                                        if (!bl2) break block6;
                                        object = ((LoadAdError)object).getResponseInfo();
                                        break block7;
                                    }
                                    bl2 = object instanceof AppOpenAd;
                                    if (!bl2) break block8;
                                    object = ((AppOpenAd)object).getResponseInfo();
                                    break block7;
                                }
                                bl2 = object instanceof InterstitialAd;
                                if (!bl2) break block9;
                                object = ((InterstitialAd)object).getResponseInfo();
                                break block7;
                            }
                            bl2 = object instanceof RewardedAd;
                            if (!bl2) break block10;
                            object = ((RewardedAd)object).getResponseInfo();
                            break block7;
                        }
                        bl2 = object instanceof RewardedInterstitialAd;
                        if (!bl2) break block11;
                        object = ((RewardedInterstitialAd)object).getResponseInfo();
                        break block7;
                    }
                    bl2 = object instanceof AdView;
                    if (!bl2) break block12;
                    object = ((AdView)((Object)object)).getResponseInfo();
                    break block7;
                }
                bl2 = object instanceof NativeAd;
                if (!bl2) break block13;
                object = ((NativeAd)object).getResponseInfo();
            }
            if (object != null && (object = ((ResponseInfo)object).zzc()) != null) {
                try {
                    return object.zzh();
                }
                catch (RemoteException remoteException) {}
            }
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzm(String object, String object2) {
        synchronized (this) {
            try {
                Object object3;
                try {
                    object3 = this.zzg;
                    object = ((zzdya)object3).zzb((String)object);
                }
                catch (NullPointerException nullPointerException) {
                    String string2 = "OutOfContextTester.setAdAsOutOfContext";
                    zzcby zzcby2 = zzu.zzo();
                    zzcby2.zzw(nullPointerException, string2);
                    zzdyl zzdyl2 = this.zzd;
                    zzdyl2.zzk((String)object2);
                    return;
                }
                object3 = new zzdyv(this, (String)object2);
                object2 = this.zze;
                zzgft.zzr((ListenableFuture)object, (zzgfp)object3, (Executor)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzn(String object, String object2) {
        synchronized (this) {
            try {
                Object object3;
                try {
                    object3 = this.zzg;
                    object = ((zzdya)object3).zzb((String)object);
                }
                catch (NullPointerException nullPointerException) {
                    String string2 = "OutOfContextTester.setAdAsShown";
                    zzcby zzcby2 = zzu.zzo();
                    zzcby2.zzw(nullPointerException, string2);
                    zzdyl zzdyl2 = this.zzd;
                    zzdyl2.zzk((String)object2);
                    return;
                }
                object3 = new zzdyw(this, (String)object2);
                object2 = this.zze;
                zzgft.zzr((ListenableFuture)object, (zzgfp)object3, (Executor)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zze(String string2, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        iObjectWrapper = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        iObjectWrapper2 = (ViewGroup)ObjectWrapper.unwrap(iObjectWrapper2);
        if (iObjectWrapper != null && iObjectWrapper2 != null) {
            boolean bl2;
            Object object = this.zza.get(string2);
            if (object != null) {
                Map map2 = this.zza;
                map2.remove(string2);
            }
            if (bl2 = object instanceof AdView) {
                object = (AdView)((Object)object);
                zzdyy.zza((Context)iObjectWrapper, (ViewGroup)iObjectWrapper2, object);
                return;
            }
            bl2 = object instanceof NativeAd;
            if (bl2) {
                object = (NativeAd)object;
                zzdyy.zzb((Context)iObjectWrapper, (ViewGroup)iObjectWrapper2, object);
            }
        }
    }

    public final void zzf(zzdya zzdya2) {
        this.zzg = zzdya2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(String string2, Object object, String string3) {
        synchronized (this) {
            Map map2 = this.zza;
            map2.put(string2, object);
            string2 = zzdyx.zzl(object);
            this.zzm(string2, string3);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(String var1_1, String var2_3, String var3_4) {
        synchronized (this) {
            block13: {
                block14: {
                    try {
                        var4_5 = var2_3.hashCode();
                        var5_6 = 3;
                        var6_7 = 2;
                        var7_8 = 4;
                        var8_9 = 5;
                        var9_10 = 1;
                    }
                    catch (Throwable var1_2) {
                        break block13;
                    }
                    switch (var4_5) {
                        default: {
                            break;
                        }
                        case 1951953708: {
                            var10_11 = "BANNER";
                            var11_12 = (int)var2_3.equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 1;
                            break block14;
                        }
                        case 1854800829: {
                            var10_11 = "REWARDED_INTERSTITIAL";
                            var11_12 = (int)var2_3.equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 5;
                            break block14;
                        }
                        case 543046670: {
                            var10_11 = "REWARDED";
                            var11_12 = (int)var2_3.equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 4;
                            break block14;
                        }
                        case -428325382: {
                            var10_11 = "APP_OPEN_AD";
                            var11_12 = (int)var2_3.equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 0;
                            var2_3 = null;
                            break block14;
                        }
                        case -1372958932: {
                            var10_11 = "INTERSTITIAL";
                            var11_12 = (int)var2_3.equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 2;
                            break block14;
                        }
                        case -1999289321: {
                            var10_11 = "NATIVE";
                            var11_12 = (int)var2_3.equals(var10_11);
                            if (var11_12 == 0) break;
                            var11_12 = 3;
                            break block14;
                        }
                    }
                    var11_12 = -1;
                }
                if (var11_12 == 0) ** GOTO lbl98
                if (var11_12 == var9_10) ** GOTO lbl88
                if (var11_12 == var6_7) ** GOTO lbl83
                if (var11_12 == var5_6) ** GOTO lbl71
                if (var11_12 == var7_8) ** GOTO lbl66
                if (var11_12 == var8_9) ** GOTO lbl-1000
                return;
lbl-1000:
                // 1 sources

                {
                    var2_3 = this.zzj();
                    var10_11 = zzdyx.zzk();
                    var12_13 = new zzdyt(this, (String)var1_1, var3_4);
                    RewardedInterstitialAd.load((Context)var2_3, (String)var1_1, (AdRequest)var10_11, (RewardedInterstitialAdLoadCallback)var12_13);
                    return;
lbl66:
                    // 1 sources

                    var2_3 = this.zzj();
                    var10_11 = zzdyx.zzk();
                    var12_14 = new zzdys(this, (String)var1_1, var3_4);
                    RewardedAd.load((Context)var2_3, (String)var1_1, (AdRequest)var10_11, (RewardedAdLoadCallback)var12_14);
                    return;
lbl71:
                    // 1 sources

                    var10_11 = this.zzj();
                    var2_3 = new AdLoader$Builder((Context)var10_11, (String)var1_1);
                    var10_11 = new zzdym(this, (String)var1_1, var3_4);
                    var2_3.forNativeAd((NativeAd$OnNativeAdLoadedListener)var10_11);
                    var1_1 = new zzdyu(this, var3_4);
                    var2_3.withAdListener((AdListener)var1_1);
                    var1_1 = var2_3.build();
                    var2_3 = zzdyx.zzk();
                    var1_1.loadAd((AdRequest)var2_3);
                    return;
lbl83:
                    // 1 sources

                    var2_3 = this.zzj();
                    var10_11 = zzdyx.zzk();
                    var12_15 = new zzdyr(this, (String)var1_1, var3_4);
                    InterstitialAd.load((Context)var2_3, (String)var1_1, (AdRequest)var10_11, var12_15);
                    return;
lbl88:
                    // 1 sources

                    var10_11 = this.zzj();
                    var2_3 = new AdView((Context)var10_11);
                    var10_11 = AdSize.BANNER;
                    var2_3.setAdSize((AdSize)var10_11);
                    var2_3.setAdUnitId((String)var1_1);
                    var10_11 = new zzdyq(this, (String)var1_1, (AdView)var2_3, var3_4);
                    var2_3.setAdListener((AdListener)var10_11);
                    var1_1 = zzdyx.zzk();
                    var2_3.loadAd((AdRequest)var1_1);
                    return;
lbl98:
                    // 1 sources

                    var2_3 = this.zzj();
                    var10_11 = zzdyx.zzk();
                    var12_16 = new zzdyp(this, (String)var1_1, var3_4);
                    AppOpenAd.load((Context)var2_3, (String)var1_1, (AdRequest)var10_11, var9_10, (AppOpenAd$AppOpenAdLoadCallback)var12_16);
                    return;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(String var1_1, String var2_3) {
        synchronized (this) {
            block13: {
                block12: {
                    try {
                        var3_4 = this.zzd;
                        var3_4 = var3_4.zzg();
                        if (var3_4 == null) break block12;
                        var4_5 = this.zza;
                        if ((var4_5 = var4_5.get(var1_1)) == null) break block12;
                        var5_6 = zzbep.zzjt;
                        var6_7 = zzba.zzc();
                        var6_7 = var6_7.zza(var5_6);
                    }
                    catch (Throwable var1_2) {}
                    var7_8 = (var6_7 = (Boolean)var6_7).booleanValue();
                    if (var7_8 && !(var7_8 = var4_5 instanceof AppOpenAd) && !(var7_8 = var4_5 instanceof InterstitialAd) && !(var7_8 = var4_5 instanceof RewardedAd) && !(var7_8 = var4_5 instanceof RewardedInterstitialAd)) ** GOTO lbl18
                    var6_7 = this.zza;
                    var6_7.remove(var1_1);
lbl18:
                    // 2 sources

                    var6_7 = zzdyx.zzl(var4_5);
                    this.zzn((String)var6_7, (String)var2_3);
                    var8_9 = var4_5 instanceof AppOpenAd;
                    if (var8_9) {
                        var4_5 = (AppOpenAd)var4_5;
                        var4_5.show((Activity)var3_4);
                        return;
                    }
                    var8_9 = var4_5 instanceof InterstitialAd;
                    if (var8_9) {
                        var4_5 = (InterstitialAd)var4_5;
                        var4_5.show((Activity)var3_4);
                        return;
                    }
                    var8_9 = var4_5 instanceof RewardedAd;
                    if (var8_9) {
                        var4_5 = (RewardedAd)var4_5;
                        var1_1 = new zzdyn();
                        var4_5.show((Activity)var3_4, (OnUserEarnedRewardListener)var1_1);
                        return;
                    }
                    var8_9 = var4_5 instanceof RewardedInterstitialAd;
                    if (!var8_9) ** GOTO lbl46
                    var4_5 = (RewardedInterstitialAd)var4_5;
                    var1_1 = new zzdyo();
                    var4_5.show((Activity)var3_4, (OnUserEarnedRewardListener)var1_1);
                    return;
lbl46:
                    // 1 sources

                    var2_3 = zzba.zzc();
                    var2_3 = var2_3.zza(var5_6);
                    var8_9 = (var2_3 = (Boolean)var2_3).booleanValue();
                    if (!var8_9 || !(var8_9 = var4_5 instanceof AdView) && !(var8_9 = var4_5 instanceof NativeAd)) break block12;
                    var2_3 = new Intent();
                    var3_4 = this.zzj();
                    var4_5 = "com.google.android.gms.ads.OutOfContextTestingActivity";
                    var2_3.setClassName((Context)var3_4, (String)var4_5);
                    var4_5 = "adUnit";
                    var2_3.putExtra((String)var4_5, (String)var1_1);
                    zzu.zzp();
                    zzt.zzT((Context)var3_4, (Intent)var2_3);
                    return;
                    break block13;
                }
                return;
            }
            throw var1_2;
        }
    }
}

