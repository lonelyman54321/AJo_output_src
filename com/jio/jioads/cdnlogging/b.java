/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.cdnlogging;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements NetworkTaskListener {
    public final void onError(int n3, Object object, Map object2) {
        object2 = new StringBuilder("Error while CDN logging.Response code: ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(" ,error: ");
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onSuccess(String string2, Map map2) {
        Intrinsics.checkNotNullParameter("CDN error logging success", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }
}

