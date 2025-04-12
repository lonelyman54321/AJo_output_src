/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.ViewGroup
 */
package com.jio.jioads.interstitial;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.controller.a;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.instreamads.vastparser.listener.c;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.interstitial.N;
import com.jio.jioads.interstitial.g_0;
import com.jio.jioads.utils.e;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from com.jio.jioads.interstitial.i
 */
public final class i_0
implements c {
    public final /* synthetic */ Context a;
    public final /* synthetic */ InterstitialAdController b;
    public final /* synthetic */ Map c;

    public i_0(Context context, InterstitialAdController interstitialAdController, Map map2) {
        this.a = context;
        this.b = interstitialAdController;
        this.c = map2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(m var1_1) {
        block30: {
            block29: {
                var2_2 = 0;
                var3_3 = null;
                var4_4 = 0;
                var5_5 = null;
                var6_6 = this.c;
                var7_7 = this.b;
                var8_8 = this.a;
                if (var8_8 != null && var1_1 != null) {
                    var9_9 = var7_7.getIJioAdView().B();
                    if (var9_9 != null) {
                        var10_10 = var9_9.intValue();
                    } else {
                        var10_10 = 0;
                        var9_9 = null;
                    }
                    var11_11 = new g_0(var7_7, (Map)var6_6);
                    var9_9 = var1_1.e((Context)var8_8, var10_10, (Function2)var11_11);
                } else {
                    var10_10 = 0;
                    var9_9 = null;
                }
                if (var1_1 == null || var9_9 == null || (var10_10 = (int)var9_9.isEmpty()) != 0) break block29;
                InterstitialAdController.access$setMFinalVastModel$p(var7_7, (m)var1_1);
                if (var8_8 != null) {
                    var9_9 = var7_7.getIJioAdView().B();
                    if (var9_9 != null) {
                        var10_10 = var9_9.intValue();
                    } else {
                        var10_10 = 0;
                        var9_9 = null;
                    }
                    var11_11 = new N(var7_7, (Map)var6_6);
                    var8_8 = var1_1.e((Context)var8_8, var10_10, (Function2)var11_11);
                } else {
                    var8_8 = null;
                }
                var10_10 = 1;
                if (var8_8 == null) ** GOTO lbl-1000
                var11_11 = (k)CollectionsKt.firstOrNull((List)var8_8);
                if (var11_11 != null) {
                    var11_11 = var11_11.c;
                } else {
                    var12_12 = 0;
                    var11_11 = null;
                }
                if (var11_11 != null && (var11_11 = var1_1.a) != null) {
                    var13_14 /* !! */  = (k)CollectionsKt.firstOrNull((List)var8_8);
                    if (var13_14 /* !! */  != null) {
                        var3_3 = var13_14 /* !! */ .c;
                    }
                    if ((var14_16 = TextUtils.isEmpty((CharSequence)var3_3)) == 0) {
                        var11_11 = var11_11.w;
                        var3_3 = (String)var11_11.get(var3_3);
                    } else {
                        var3_3 = "video";
                    }
                    if (var3_3 == null) {
                        var3_3 = "";
                    }
                    var7_7.setInterstitialType((String)var3_3);
                } else if ((var2_2 = var6_6.isEmpty() ^ var10_10) != 0) {
                    var2_2 = e.b((Map)var6_6);
                    var3_3 = String.valueOf(var2_2);
                    var7_7.setInterstitialType((String)var3_3);
                }
                var3_3 = new StringBuilder();
                var11_11 = var7_7.getIJioAdView().K();
                var3_3.append(var11_11);
                var3_3.append(": Value an interstitialType is ");
                var11_11 = var7_7.getInterstitialType();
                var3_3.append((String)var11_11);
                var3_3 = var3_3.toString();
                var11_11 = "message";
                Intrinsics.checkNotNullParameter(var3_3, (String)var11_11);
                var3_3 = JioAds.Companion;
                var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var13_14 /* !! */  = JioAds$LogLevel.NONE;
                var13_14 /* !! */  = var7_7.getInterstitialType();
                var15_17 = "audio";
                var10_10 = kotlin.text.b.i((String)var13_14 /* !! */ , (String)var15_17, (boolean)var10_10);
                if (var10_10 != 0) {
                    var6_6 = new StringBuilder();
                    var8_8 = var7_7.getIJioAdView().K();
                    var6_6.append(var8_8);
                    var6_6.append(": init InStreamAudioRenderer");
                    Intrinsics.checkNotNullParameter(var6_6.toString(), (String)var11_11);
                    var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var15_17 = var7_7.getJioAdCallbacks();
                    var16_19 = var7_7.getIJioAdView();
                    var17_21 = var7_7.getIJioAdViewController();
                    var18_23 = this.c;
                    var19_24 = true;
                    var13_14 /* !! */  = var6_6;
                    var6_6 = new j((a)var15_17, var16_19, var17_21, (m)var1_1, var19_24, var18_23);
                    InterstitialAdController.access$setInStreamAudioRenderer$p(var7_7, (j)var6_6);
                    var6_6 = new StringBuilder();
                    var8_8 = var7_7.getIJioAdView().P();
                    var6_6.append((String)var8_8);
                    var8_8 = ": value of container is :";
                    var6_6.append((String)var8_8);
                    var6_6 = var6_6.toString();
                    Intrinsics.checkNotNullParameter(var6_6, (String)var11_11);
                    var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var3_3 = InterstitialAdController.access$getInStreamAudioRenderer$p(var7_7);
                    if (var3_3 != null) {
                        var3_3.v();
                    }
                    if ((var8_8 = InterstitialAdController.access$getInStreamAudioRenderer$p(var7_7)) != null) {
                        var9_9 = InterstitialAdController.access$getContainer$p(var7_7);
                        var3_3 = InterstitialAdController.access$getToInt$p(var7_7);
                        if (var3_3 != null) {
                            var12_12 = var2_2 = var3_3.intValue();
                        } else {
                            var12_12 = 0;
                            var11_11 = null;
                        }
                        var3_3 = InterstitialAdController.access$getToInt1$p(var7_7);
                        if (var3_3 != null) {
                            var14_16 = var4_4 = var3_3.intValue();
                        } else {
                            var14_16 = 0;
                            var13_14 /* !! */  = null;
                        }
                        var15_17 = InterstitialAdController.access$getPortraitImage$p(var7_7);
                        var16_19 = InterstitialAdController.access$getLandScapeImage$p(var7_7);
                        var8_8.c((ViewGroup)var9_9, var12_12, var14_16, (Drawable)var15_17, (Drawable)var16_19);
                    }
                } else {
                    var3_3 = InterstitialAdController.access$getJioVideoView$p(var7_7);
                    if (var3_3 == null && var8_8 != null && (var2_2 = (int)var8_8.isEmpty()) == 0) {
                        InterstitialAdController.access$initJioVideoViewIfNull(var7_7, (m)var1_1, (Map)var6_6);
                    }
                    if ((var3_3 = InterstitialAdController.access$getJioVastParsingHelper$p(var7_7)) != null) {
                        var2_2 = var3_3.u;
                        var5_5 = InterstitialAdController.access$getJioVideoView$p(var7_7);
                        if (var5_5 != null) {
                            var5_5 = var5_5.h0();
                            var5_5.a = var20_25 = (long)var2_2;
                        }
                    }
                }
                break block30;
            }
            var3_3 = JioAdError.Companion;
            var5_5 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            var3_3.getClass();
            var9_9 = t_0.a((JioAdError$JioAdErrorType)var5_5);
            var3_3 = var7_7.getJioAdCallbacks();
            var13_15 = d.a;
            var8_8 = var3_3;
            var8_8 = (V)var3_3;
            var12_13 = false;
            var11_11 = null;
            var15_18 = "onPlayerError";
            var16_20 = "InterstitialAdController";
            var17_22 = "No ads in inventory";
            var8_8.d((JioAdError)var9_9, false, var13_15, var15_18, var16_20, var17_22, null);
        }
        if (var1_1 == null) {
            var1_1 = var7_7.getJioAdCallbacks();
            var3_3 = JioAdView$AdState.FAILED;
            var1_1 = (V)var1_1;
            var1_1.e((JioAdView$AdState)var3_3);
        }
    }

    public final void b(JioAdError jioAdError, d d2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        Object object = new StringBuilder("onError ");
        Object object2 = jioAdError.getErrorDescription();
        object.append((String)object2);
        object.append(", methodName: ");
        object.append(string2);
        object.append(", className: ");
        object.append(string3);
        object.append(", errorDesc: ");
        object.append(string4);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.b.getJioAdCallbacks();
        object2 = object;
        ((V)object).d(jioAdError, false, d2, string2, string3, string4, null);
    }
}

