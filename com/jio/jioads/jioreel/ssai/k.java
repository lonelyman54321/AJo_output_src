/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.ssai;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.network.d;
import com.jio.jioads.network.e;
import com.jio.jioads.network.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k
extends Lambda
implements Function1 {
    public final /* synthetic */ String c;

    public k(String string2) {
        this.c = string2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (f)object;
        String string2 = "result";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof e;
        String string3 = "message";
        String string4 = this.c;
        if (bl2) {
            string2 = "*****tracking event: Click => success: ";
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(string4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            boolean bl3 = object instanceof d;
            if (bl3) {
                string2 = "tracking event: Click=> Failure: ";
                object = new StringBuilder(string2);
                ((StringBuilder)object).append(string4);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        return Unit.a;
    }
}

