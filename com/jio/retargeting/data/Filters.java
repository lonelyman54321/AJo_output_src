/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.data;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Filters {
    private String name;
    private List value;

    public Filters(String object, List list) {
        object = this.validateName((String)object);
        this.name = object;
        this.value = object = this.validateValue(list);
    }

    private final String validateName(String object) {
        String string2 = "";
        String string3 = "message";
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument name must not be null", string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return string2;
        }
        int n3 = object.length();
        if (n3 == 0) {
            Intrinsics.checkNotNullParameter("Argument name must be string of length greater than 0", string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return string2;
        }
        return object;
    }

    private final List validateValue(List object) {
        String string2 = "message";
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument value must not be null", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return null;
        }
        boolean bl2 = object.isEmpty();
        if (bl2) {
            Intrinsics.checkNotNullParameter("Argument value must be List of size greater than 0", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return null;
        }
        return object;
    }

    public final String getName() {
        return this.name;
    }

    public final List getValue() {
        return this.value;
    }
}

