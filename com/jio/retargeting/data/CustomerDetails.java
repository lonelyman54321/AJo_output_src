/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.data;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import kotlin.jvm.internal.Intrinsics;

public final class CustomerDetails {
    private String hashMethod;
    private String idValue;
    private int type;

    public CustomerDetails(int n3, String string2, String string3) {
        String string4;
        this.type = n3;
        this.idValue = string4 = this.validateAttribute(string2, "idValue");
        this.hashMethod = string4 = this.validateAttribute(string3, "hashMethod");
    }

    private final String validateAttribute(String object, String string2) {
        String string3 = "";
        String string4 = "message";
        String string5 = "Argument ";
        if (object == null) {
            object = new StringBuilder(string5);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" must not be null");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return string3;
        }
        int n3 = object.length();
        if (n3 == 0) {
            object = new StringBuilder(string5);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" must be string of length greater than 0");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return string3;
        }
        return object;
    }

    public final String getHashMethod() {
        return this.hashMethod;
    }

    public final String getIdValue() {
        return this.idValue;
    }

    public final int getType() {
        return this.type;
    }
}

