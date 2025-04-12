/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.o
 */
public final class o_0
implements NetworkTaskListener {
    public final void onError(int n3, Object object, Map map2) {
        Intrinsics.checkNotNullParameter("Conversion URL Failure", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onSuccess(String string2, Map map2) {
        Intrinsics.checkNotNullParameter("Conversion URL Success", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }
}

