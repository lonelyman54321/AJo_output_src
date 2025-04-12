/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.tracker;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.network.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class JioAdsSSAITracker {
    public static final JioAdsSSAITracker INSTANCE;

    static {
        JioAdsSSAITracker jioAdsSSAITracker;
        INSTANCE = jioAdsSSAITracker = new JioAdsSSAITracker();
    }

    public final void fireTrackingURL(List object) {
        if (object != null) {
            char c2;
            Object object2;
            try {
                object = object.iterator();
            }
            catch (Exception exception) {
                object = new StringBuilder("Exception inside JioAdsSSAITracker ");
                object2 = Unit.a;
                ((StringBuilder)object).append(object2);
                c2 = ' ';
                ((StringBuilder)object).append(c2);
                object = ((StringBuilder)object).toString();
                object2 = "message";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            while (true) {
                c2 = object.hasNext();
                if (c2 == '\u0000') break;
                object2 = object.next();
                object2 = (String)object2;
                b b2 = new b();
                int n3 = 1;
                xu0_2 xu0_22 = new xu0_2(object2, n3);
                n3 = 8;
                b2.a(n3, (String)object2, xu0_22);
                continue;
                break;
            }
        }
    }
}

