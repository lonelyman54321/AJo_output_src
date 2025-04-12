/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.companionads;

import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.companionads.CompanionManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d
extends Lambda
implements Function0 {
    public final /* synthetic */ JioAdView$JioAdCompanion c;
    public final /* synthetic */ CompanionManager d;
    public final /* synthetic */ String e;

    public d(JioAdView$JioAdCompanion jioAdView$JioAdCompanion, CompanionManager companionManager, String string2) {
        this.c = jioAdView$JioAdCompanion;
        this.d = companionManager;
        this.e = string2;
        super(0);
    }

    public final Object invoke() {
        Object object = this.d;
        Object object2 = CompanionManager.access$getPrimaryAdView$p((CompanionManager)object);
        JioAdView$JioAdCompanion jioAdView$JioAdCompanion = this.c;
        jioAdView$JioAdCompanion.removeHtmlCompanionView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdView$JioAdCompanion, (JioAdView)object2);
        object = CompanionManager.access$getJioCompanionListener$p((CompanionManager)object);
        if (object != null) {
            object.onCompanionClose(jioAdView$JioAdCompanion);
        }
        object = new StringBuilder("firing onCompanionClose for masterAdId: ");
        object2 = this.e;
        ir3_0.b((StringBuilder)object, (String)object2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return Unit.a;
    }
}

