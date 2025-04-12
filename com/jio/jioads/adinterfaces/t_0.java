/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.t
 */
public final class t_0 {
    public static JioAdError a(JioAdError$JioAdErrorType object) {
        Intrinsics.checkNotNullParameter(object, "jioAdErrorType");
        JioAdError jioAdError = new JioAdError();
        String string2 = object.getErrorCode();
        jioAdError.setErrorCode$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
        string2 = object.getErrorTitle();
        jioAdError.setErrorTitle$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
        object = object.getErrorDescription();
        JioAdError.access$setErrorDescription$p(jioAdError, (String)object);
        return jioAdError;
    }
}

