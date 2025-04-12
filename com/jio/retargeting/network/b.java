/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.network;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements NetworkTaskListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public b(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public final void onError(int n3, Object object, Map object2) {
        Object object3 = new StringBuilder();
        object2 = this.a;
        object3.append((String)object2);
        object3.append(" URL Failure ");
        object2 = this.b;
        object3.append((String)object2);
        object3.append(' ');
        object3.append(object);
        Intrinsics.checkNotNullParameter(object3.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
    }

    public final void onSuccess(String object, Map object2) {
        object = new StringBuilder();
        object2 = this.a;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" URL Success ");
        object2 = this.b;
        ir3_0.b((StringBuilder)object, (String)object2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

