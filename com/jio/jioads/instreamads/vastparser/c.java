/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.model.a;
import kotlin.jvm.internal.Intrinsics;

public final class c
implements f_0 {
    public final /* synthetic */ n a;

    public c(n n3) {
        this.a = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(a var1_1, com.jio.jioads.multiad.model.f var2_2, String var3_3) {
        block16: {
            block15: {
                var3_3 = this.a;
                var4_4 = var3_3.G;
                if (var4_4) {
                    var1_1 /* !! */  = new StringBuilder();
                    j_0.j((n)var3_3, (StringBuilder)var1_1 /* !! */ , ": returning from backup: onAdSelected");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 /* !! */  = JioAds$LogLevel.NONE;
                    return;
                }
                var5_5 = var3_3.b;
                var6_6 /* !! */  = var5_5.k0();
                if (var6_6 /* !! */  == (var7_7 = JioAdView$AdState.FAILED) || (var6_6 /* !! */  = var5_5.k0()) == (var7_7 = JioAdView$AdState.DESTROYED)) break block16;
                var6_6 /* !! */  = new StringBuilder("onAdSelected: call getBackupAd: ");
                var8_8 = null;
                var9_9 /* !! */  = var1_1 /* !! */  != null ? var1_1 /* !! */ .a : null;
                var6_6 /* !! */ .append(var9_9 /* !! */ );
                var9_9 /* !! */  = ": ";
                var6_6 /* !! */ .append(var9_9 /* !! */ );
                var9_9 /* !! */  = var2_2 != null ? var2_2.l : null;
                var10_10 = "message";
                ir3_0.b((StringBuilder)var6_6 /* !! */ , var9_9 /* !! */ , var10_10);
                var6_6 /* !! */  = JioAds.Companion;
                var6_6 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var9_9 /* !! */  = JioAds$LogLevel.NONE;
                var9_9 /* !! */  = var5_5.k0();
                if (var9_9 /* !! */  == var7_7) ** GOTO lbl70
                if (var1_1 /* !! */  == null) ** GOTO lbl64
                try {
                    var7_7 = new StringBuilder();
                    var5_5 = var5_5.P();
                }
                catch (Exception v0) {
                    ** continue;
                }
                var7_7.append((String)var5_5);
                var5_5 = ": Selected Backup Ad from locally saved config";
                var7_7.append((String)var5_5);
                var5_5 = var7_7.toString();
                Intrinsics.checkNotNullParameter(var5_5, var10_10);
                var5_5 = var6_6 /* !! */ .getInstance();
                var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var5_5 = var3_3.c;
                var5_5 = (f)var5_5;
                var5_5 = var5_5.i();
                var5_5 = var5_5.c;
                if (var5_5 == null) break block15;
                var8_8 = var5_5.b;
            }
            n.g((n)var3_3, (a)var1_1 /* !! */ , var8_8, var2_2);
            ** GOTO lbl70
lbl64:
            // 1 sources

            var1_1 /* !! */  = var3_3.E;
            if (var1_1 /* !! */  == null) ** GOTO lbl69
            var11_11 = true;
            var1_1 /* !! */ .f = var11_11;
lbl69:
            // 2 sources

            var3_3.G();
lbl70:
            // 4 sources

            return;
        }
        com.jio.jioads.audioplayer.b.a((b)var5_5, ": JioAdView state is destroyed so returning from getBackupAd() of  JioVastParsingHelper");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_1 /* !! */  = JioAds$LogLevel.NONE;
    }
}

