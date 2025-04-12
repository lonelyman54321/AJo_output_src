/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.tracker;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class JioEventTracker$makeRequest$1$3
implements NetworkTaskListener {
    public final /* synthetic */ c a;
    public final /* synthetic */ b b;
    public final /* synthetic */ JioEventTracker$TrackingEvents c;

    public JioEventTracker$makeRequest$1$3(c c2, b b2, JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents) {
        this.a = c2;
        this.b = b2;
        this.c = jioEventTracker$TrackingEvents;
    }

    public void onError(int n3, Object object, Map object2) {
        this.a.a();
        object = new StringBuilder();
        j_0.n(this.b, (StringBuilder)object, ": fireEvent request error ");
        object2 = this.c;
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", responseCode: ");
        ((StringBuilder)object).append(n3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onSuccess(String object, Map object2) {
        this.a.a();
        object = new StringBuilder();
        j_0.n(this.b, (StringBuilder)object, ": ");
        object2 = this.c;
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(" fired successfully ");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

