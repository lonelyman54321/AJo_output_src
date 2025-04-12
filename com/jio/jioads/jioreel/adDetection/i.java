/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.adDetection;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.adDetection.k;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import kotlin.jvm.internal.Intrinsics;

public final class i
implements Runnable {
    public final /* synthetic */ JioReelAdMetaData a;
    public final /* synthetic */ k b;

    public /* synthetic */ i(JioReelAdMetaData jioReelAdMetaData, k k2) {
        this.a = jioReelAdMetaData;
        this.b = k2;
    }

    public final void run() {
        k k2 = this.b;
        Intrinsics.checkNotNullParameter(k2, "this$0");
        Object object = new StringBuilder("SDK onAdChange ");
        JioReelAdMetaData jioReelAdMetaData = this.a;
        object.append(jioReelAdMetaData);
        object = object.toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jioReelAdMetaData != null ? jioReelAdMetaData.getAdId() : null;
        k2.L = object;
        k2.b.onAdChange(jioReelAdMetaData);
    }
}

