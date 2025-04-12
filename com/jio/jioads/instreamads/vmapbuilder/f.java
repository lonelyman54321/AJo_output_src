/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapbuilder;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.W;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPBuilder;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPInfo;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements W {
    public final /* synthetic */ JioAdsVMAPInfo a;
    public final /* synthetic */ long b;
    public final /* synthetic */ JioAdsVMAPBuilder c;
    public final /* synthetic */ JioAdsVMAPListener d;

    public f(JioAdsVMAPInfo jioAdsVMAPInfo, long l2, JioAdsVMAPBuilder jioAdsVMAPBuilder, JioAdsVMAPListener jioAdsVMAPListener) {
        this.a = jioAdsVMAPInfo;
        this.b = l2;
        this.c = jioAdsVMAPBuilder;
        this.d = jioAdsVMAPListener;
    }

    public final void a(JioAdError jioAdError, Integer object) {
        int n3;
        Object object2;
        object = new StringBuilder();
        String string2 = this.a.getPostRollAdspot();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Post-roll fetching failed ");
        string2 = null;
        if (jioAdError != null) {
            object2 = jioAdError.getErrorTitle();
        } else {
            n3 = 0;
            object2 = null;
        }
        ir3_0.b(object, (String)object2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.c;
        n3 = 1;
        JioAdsVMAPBuilder.access$setPostrollSelectionCompleted$p((JioAdsVMAPBuilder)object, n3 != 0);
        JioAdsVMAPListener jioAdsVMAPListener = this.d;
        ((JioAdsVMAPBuilder)object).a(jioAdsVMAPListener, false);
        int n4 = ((JioAdsVMAPBuilder)object).getPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() + n3;
        ((JioAdsVMAPBuilder)object).setPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(n4);
        object2 = JioAdsVMAPBuilder.access$getPostrollJioAdView$p((JioAdsVMAPBuilder)object);
        if (object2 != null && (object2 = ((JioAdView)object2).getAdViewController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            if (jioAdError != null) {
                string2 = jioAdError.getErrorTitle();
            }
            int n7 = ((JioAdsVMAPBuilder)object).getPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            ((o)object2).u(string2, 0, n7, false);
        }
        ((JioAdsVMAPBuilder)object).setPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(0);
    }

    public final void b(JioAdView object, ArrayList arrayList, String object2, Integer object3, boolean bl2) {
        Object object4;
        object2 = new StringBuilder();
        object3 = this.a;
        String string2 = ((JioAdsVMAPInfo)object3).getPostRollAdspot();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(": Post roll completed & adsize: ");
        string2 = null;
        if (arrayList != null) {
            int n3 = arrayList.size();
            object4 = n3;
        } else {
            boolean bl3 = false;
            object4 = null;
        }
        ((StringBuilder)object2).append(object4);
        ((StringBuilder)object2).append(" & time taken: ");
        long l2 = System.currentTimeMillis();
        long l3 = this.b;
        l2 -= l3;
        int n4 = 100;
        l3 = n4;
        ((StringBuilder)object2).append(l2 /= l3);
        ((StringBuilder)object2).append(" MS");
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = new StringBuffer();
        object4 = this.c;
        JioAdsVMAPBuilder.access$setPostrollADBreak$p((JioAdsVMAPBuilder)object4, (StringBuffer)object2);
        object2 = JioAdsVMAPBuilder.access$getPostrollADBreak$p((JioAdsVMAPBuilder)object4);
        if (object2 != null) {
            b b2;
            if (object != null && (b2 = ((JioAdView)object).getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                String string3 = ((JioAdsVMAPInfo)object3).getPostRollAdspot();
                String string4 = "end";
                JioAdsVMAPBuilder jioAdsVMAPBuilder = this.c;
                object = JioAdsVMAPBuilder.access$generateADBreakTagForPrePostRoll(jioAdsVMAPBuilder, string4, arrayList, string3, b2, bl2);
            } else {
                object = null;
            }
            ((StringBuffer)object2).append((StringBuffer)object);
        }
        object = JioAdsVMAPBuilder.access$getPostrollJioAdView$p((JioAdsVMAPBuilder)object4);
        arrayList = null;
        if (object != null && (object = ((JioAdView)object).getAdViewController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            object2 = o.T;
            ((o)object).u(null, 0, 0, false);
        }
        ((JioAdsVMAPBuilder)object4).setPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(0);
        object = JioAdsVMAPBuilder.access$getPostrollJioAdView$p((JioAdsVMAPBuilder)object4);
        if (object != null) {
            ((JioAdView)object).onDestroy();
        }
        JioAdsVMAPBuilder.access$setPostrollJioAdView$p((JioAdsVMAPBuilder)object4, null);
        JioAdsVMAPBuilder.access$setPostrollSelectionCompleted$p((JioAdsVMAPBuilder)object4, true);
        object = this.d;
        ((JioAdsVMAPBuilder)object4).a((JioAdsVMAPListener)object, false);
    }
}

