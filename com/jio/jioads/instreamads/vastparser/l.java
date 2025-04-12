/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instreamads.vastparser;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.a;
import com.jio.jioads.instreamads.vastparser.b;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.utils.h;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements Runnable {
    public final /* synthetic */ n a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ExecutorService d;

    public /* synthetic */ l(n n3, Context context, int n4, ExecutorService executorService) {
        this.a = n3;
        this.b = context;
        this.c = n4;
        this.d = executorService;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = this;
        var2_2 = "message";
        var3_3 = this.a;
        var4_4 = "this$0";
        Intrinsics.checkNotNullParameter(var3_3, (String)var4_4);
        try {
            var4_4 = var3_3.b;
            var4_4 = var4_4.k0();
            var5_5 /* !! */  = JioAdView$AdState.DESTROYED;
            if (var4_4 == var5_5 /* !! */ ) {
                return;
            }
            var6_6 = this.b;
            var7_7 = var3_3.b;
            if (var6_6 != null && (var8_8 /* !! */  = var3_3.E) != null) {
                var9_9 = var7_7.B();
                if (var9_9 != null) {
                    var10_10 = var9_9.intValue();
                } else {
                    var10_10 = 0;
                    var9_9 = null;
                }
                var12_16 = new b((n)var3_3);
                var8_8 /* !! */  = var8_8 /* !! */ .e(var6_6, var10_10, (Function2)var12_16);
            } else {
                var13_17 = 0;
                var8_8 /* !! */  = null;
            }
            var9_9 = var3_3.E;
            var12_16 = var1_1.d;
            if (var9_9 == null || var8_8 /* !! */  == null || (var14_18 = var1_1.c) >= (var10_10 = var8_8 /* !! */ .size())) ** GOTO lbl193
        }
lbl29:
        // 5 sources

        catch (Exception var11_11) {}
        var9_9 = var8_8 /* !! */ .get((int)var14_18);
        var9_9 = (k)var9_9;
        var15_19 /* !! */  = var9_9.a;
        var15_19 /* !! */  = String.valueOf(var15_19 /* !! */ );
        var16_20 = var9_9.c;
        var16_20 = String.valueOf(var16_20);
        var17_21 = new StringBuilder();
        var17_21.append((String)var16_20);
        var18_22 = '_';
        var17_21.append(var18_22);
        var4_4 = var9_9.h;
        var17_21.append((String)var4_4);
        var4_4 = var17_21.toString();
        var9_9 = var9_9.i;
        var17_21 = String.valueOf(var9_9);
        var9_9 = new StringBuilder();
        var19_15 = var7_7.P();
        var9_9.append((String)var19_15);
        var19_15 = ": downloading videoUrl: ";
        var9_9.append((String)var19_15);
        var9_9.append(var15_19 /* !! */ );
        var19_15 = var9_9.toString();
        Intrinsics.checkNotNullParameter(var19_15, (String)var2_2);
        var19_15 = JioAds.Companion;
        var9_9 = var19_15.getInstance();
        var9_9.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var9_9 = JioAds$LogLevel.NONE;
        var9_9 = new StringBuilder();
        var11_12 /* !! */  = var7_7.P();
        var9_9.append((String)var11_12 /* !! */ );
        var11_12 /* !! */  = ": adId ";
        var9_9.append((String)var11_12 /* !! */ );
        var9_9.append((String)var16_20);
        var11_12 /* !! */  = var9_9.toString();
        Intrinsics.checkNotNullParameter(var11_12 /* !! */ , (String)var2_2);
        var11_12 /* !! */  = var19_15.getInstance();
        var11_12 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var20_23 = var8_8 /* !! */ .isEmpty();
        var10_10 = 1;
        if ((var20_23 ^= var10_10) == 0) ** GOTO lbl101
        var11_12 /* !! */  = CollectionsKt.firstOrNull((List)var8_8 /* !! */ );
        var11_12 /* !! */  = (k)var11_12 /* !! */ ;
        if (var11_12 /* !! */  != null) {
            var11_12 /* !! */  = var11_12 /* !! */ .s;
        } else {
            var20_23 = 0;
            var11_12 /* !! */  = null;
        }
        if (var11_12 /* !! */  != null) {
            var11_12 /* !! */  = CollectionsKt.firstOrNull((List)var8_8 /* !! */ );
            if ((var11_12 /* !! */  = (k)var11_12 /* !! */ ) != null) {
                var11_12 /* !! */  = var11_12 /* !! */ .s;
            } else {
                var20_23 = 0;
                var11_12 /* !! */  = null;
            }
            var8_8 /* !! */  = var3_3.c;
            var8_8 /* !! */  = (f)var8_8 /* !! */ ;
            var8_8 /* !! */  = var8_8 /* !! */ .a;
            var8_8 /* !! */ .c = var11_12 /* !! */ ;
        }
lbl101:
        // 4 sources

        if ((var11_12 /* !! */  = var3_3.E) != null && (var11_12 /* !! */  = var11_12 /* !! */ .a) != null && (var11_12 /* !! */  = var11_12 /* !! */ .y) != null) {
            var11_12 /* !! */  = var11_12 /* !! */ .get(var16_20);
            var11_12 /* !! */  = (String)var11_12 /* !! */ ;
        } else {
            var20_23 = 0;
            var11_12 /* !! */  = null;
        }
        if (var11_12 /* !! */  != null && (var13_17 = var11_12 /* !! */ .length()) != 0) {
            var4_4 = new StringBuilder();
            var5_5 /* !! */  = var7_7.P();
            var4_4.append((String)var5_5 /* !! */ );
            var5_5 /* !! */  = ": file is already cached with path: ";
            var4_4.append((String)var5_5 /* !! */ );
            var4_4.append((String)var11_12 /* !! */ );
            var11_12 /* !! */  = var4_4.toString();
            Intrinsics.checkNotNullParameter(var11_12 /* !! */ , (String)var2_2);
            var11_12 /* !! */  = var19_15.getInstance();
            var11_12 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var11_12 /* !! */  = new StringBuilder();
            var4_4 = var7_7.P();
            var11_12 /* !! */ .append((String)var4_4);
            var4_4 = ": moving to next cache";
            var11_12 /* !! */ .append((String)var4_4);
            var11_12 /* !! */  = var11_12 /* !! */ .toString();
            Intrinsics.checkNotNullParameter(var11_12 /* !! */ , (String)var2_2);
            var11_12 /* !! */  = var19_15.getInstance();
            var11_12 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var20_23 = 1;
            var3_3.d((int)(var14_18 += var20_23));
            var3_3.D();
            return;
        }
        var11_12 /* !! */  = var3_3.E;
        if (var11_12 /* !! */  != null) {
            var11_12 /* !! */  = var11_12 /* !! */ .a((int)var14_18);
        } else {
            var20_23 = 0;
            var11_12 /* !! */  = null;
        }
        var8_8 /* !! */  = com.jio.jioads.util.b.b;
        var8_8 /* !! */  = "streaming";
        var20_23 = (int)Intrinsics.areEqual(var11_12 /* !! */ , var8_8 /* !! */ );
        if (var20_23 != 0) return;
        if (var14_18 && (var20_23 = (int)h.e(var6_6, (JioAds$MediaType)(var11_12 /* !! */  = JioAds$MediaType.VIDEO))) == 0) {
            var11_12 /* !! */  = new StringBuilder();
            var4_4 = var7_7.P();
            var11_12 /* !! */ .append((String)var4_4);
            var4_4 = ": no memory available for video caching";
            var11_12 /* !! */ .append((String)var4_4);
            var11_12 /* !! */  = var11_12 /* !! */ .toString();
            Intrinsics.checkNotNullParameter(var11_12 /* !! */ , (String)var2_2);
            var11_12 /* !! */  = var19_15.getInstance();
            var11_12 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var20_23 = 0;
            var11_12 /* !! */  = null;
            var3_3.K = false;
            var3_3.D();
            var12_16.shutdown();
            return;
        }
        var11_12 /* !! */  = var7_7.k0();
        if (var11_12 /* !! */  == var5_5 /* !! */ ) {
            return;
        }
        var11_12 /* !! */  = "video";
        var19_15 = new Pair(var11_12 /* !! */ , var15_19 /* !! */ );
        var20_23 = 1;
        var11_12 /* !! */  = new Pair[var20_23];
        var2_2 = null;
        var11_12 /* !! */ [0] = var19_15;
        var8_8 /* !! */  = fh1_2.j((Pair[])var11_12 /* !! */ );
        var12_16 = JioAds$MediaType.VIDEO;
        var20_23 = var7_7.g();
        var19_15 = new a((n)var3_3, (String)var16_20, (int)var14_18);
        var21_25 = var20_23;
        var14_18 = true;
        var7_7 = var2_2;
        var9_9 = var16_20;
        var15_19 /* !! */  = var17_21;
        var16_20 = var4_4;
        var17_21 = var19_15;
        var2_2 = new com.jio.jioads.utils.l(var6_6, (HashMap)var8_8 /* !! */ , (String)var9_9, (JioAds$MediaType)var12_16, var14_18, var15_19 /* !! */ , (String)var4_4, (com.jio.jioads.utils.f)var19_15, var21_25);
        var2_2.a();
        ** GOTO lbl198
        {
            catch (Exception v0) {}
lbl193:
            // 1 sources

            var20_24 = false;
            var11_13 = null;
            var3_3.K = false;
            var12_16.shutdown();
            return;
lbl198:
            // 2 sources

            ** try [egrp 7[TRYBLOCK] [118 : 1145->1173)] { 
lbl199:
            // 1 sources

            var3_3.L = var2_2;
            return;
        }
        var19_15 = new StringBuilder();
        var2_2 = var3_3.b;
        var3_3 = ": exception while caching video: ";
        j_0.n((com.jio.jioads.common.b)var2_2, (StringBuilder)var19_15, (String)var3_3);
        l_0.f(var11_11, (StringBuilder)var19_15);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var11_14 = JioAds$LogLevel.NONE;
    }
}

