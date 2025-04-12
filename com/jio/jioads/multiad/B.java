/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.multiad.H;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class B {
    public final /* synthetic */ H a;

    public B(H h3) {
        this.a = h3;
    }

    public final void onMatchTargetingExpression(boolean bl2) {
        Object object = new StringBuilder();
        H h3 = this.a;
        String string2 = h3.f;
        object.append(string2);
        object.append(": matchTargetingExpression returned with: ");
        object.append(bl2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        Boolean bl3 = bl2;
        h3.b(bl3, true);
    }

    public final void onMatchTargettedAds(String[] stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "targettedAdIds");
        Object object = new StringBuilder();
        H h3 = this.a;
        String string2 = h3.f;
        object.append(string2);
        object.append(": onMatchTargettedAds returned with: ");
        string2 = Arrays.toString(stringArray);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this)");
        object.append(string2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        h3.b(stringArray, true);
    }
}

