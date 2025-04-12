/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.user;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.user.c;
import com.jio.jioads.user.g;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements NetworkTaskListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ c b;

    public e(g g3, c c2) {
        this.a = g3;
        this.b = c2;
    }

    public final void onError(int n3, Object object, Map object2) {
        object2 = new StringBuilder("Not a FTTH n/w.Error code-->");
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.b.onError(n3, "Not able to get uid for STB", null);
    }

    public final void onSuccess(String object, Map map2) {
        Intrinsics.checkNotNullParameter("Connected with Jio FTTH n/w", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("app-name", "RJIL_JioPush2");
        hashMap.put("x-api-key", "l7xx546797181c79495e84ca90a1bbe2ff64");
        object = this.a;
        object.getClass();
        object = ((g)object).a;
        com.jio.jioads.network.c c2 = new com.jio.jioads.network.c((Context)object);
        Integer n3 = 0;
        Boolean bl2 = Boolean.FALSE;
        c c3 = this.b;
        c2.b(0, "http://api.jio.com/ftth/v2/users/me", null, hashMap, n3, c3, bl2);
    }
}

