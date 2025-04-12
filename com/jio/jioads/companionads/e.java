/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.companionads;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.f;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements o {
    public boolean a;
    public final /* synthetic */ CompanionManager b;
    public final /* synthetic */ f c;
    public final /* synthetic */ String d;

    public e(CompanionManager companionManager, f f5, String string2) {
        this.b = companionManager;
        this.c = f5;
        this.d = string2;
    }

    public final void a(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(string3, "failingUrl");
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void b(Constants$AdTouchEvents enum_) {
        Intrinsics.checkNotNullParameter(enum_, "adTouchEvents");
        Intrinsics.checkNotNullParameter("Inside onAdTouch", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        enum_ = JioAds$LogLevel.NONE;
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void onAdClick() {
        boolean bl2 = this.a;
        if (!bl2) {
            this.a = bl2 = true;
            q_0 q_02 = CompanionManager.access$getCompanionTrackerReceiver$p(this.b);
            if (q_02 != null) {
                Object object = this.c.g;
                String string2 = this.d;
                object = (List)((HashMap)object).get(string2);
                q_02.b((List)object);
            }
        }
    }
}

