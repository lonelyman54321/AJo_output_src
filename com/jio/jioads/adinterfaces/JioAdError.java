/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.t_0;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdError {
    public static final t_0 Companion;
    public String a;
    public String b;
    public String c;

    static {
        t_0 t_02;
        Companion = t_02 = new Object();
    }

    public static final /* synthetic */ void access$setErrorDescription$p(JioAdError jioAdError, String string2) {
        jioAdError.c = string2;
    }

    public static final JioAdError getJioAdError(JioAdError$JioAdErrorType jioAdError$JioAdErrorType) {
        Companion.getClass();
        return t_0.a(jioAdError$JioAdErrorType);
    }

    public static final JioAdError getJioAdError(String string2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(string2, "errorCode");
        JioAdError jioAdError = new JioAdError();
        jioAdError.setErrorCode$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
        return jioAdError;
    }

    public final String getErrorCode() {
        return this.a;
    }

    public final String getErrorDescription() {
        return this.c;
    }

    public final String getErrorTitle() {
        return this.b;
    }

    public final void setErrorCode$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorCode");
        this.a = string2;
    }

    public final void setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        int n3;
        String string3 = this.c;
        int n4 = 1;
        n3 = string3 != null && (n3 = string3.length()) != 0 ? 0 : 1;
        if ((n4 ^= n3) == 0) {
            string3 = null;
        }
        if (string3 != null) {
            string2 = string3;
        }
        this.c = string2;
    }

    public final void setErrorTitle$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorTitle");
        this.b = string2;
    }
}

