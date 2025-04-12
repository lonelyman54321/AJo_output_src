/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.google.gson.Gson;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.ssai.CreativeResponse;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.network.d;
import com.jio.jioads.network.e;
import com.jio.jioads.network.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r
extends Lambda
implements Function1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ CreativeResponse d;

    public r(String string2, CreativeResponse creativeResponse) {
        this.c = string2;
        this.d = creativeResponse;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (f)object;
        Object object2 = "result";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object instanceof e;
        String string2 = "message";
        String string3 = this.c;
        if (n3 != 0) {
            object2 = nn_2.a(string3, " creativeId response= ");
            object = (e)object;
            string3 = ((e)object).a;
            ir3_0.b((StringBuilder)object2, string3, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = ((e)object).a;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                object2 = new Gson();
                b.f(((Gson)object2).fromJson((String)object, b.class));
                throw null;
            }
        } else {
            n3 = object instanceof d;
            if (n3 != 0) {
                Object object3;
                object2 = this.d;
                if (object2 != null) {
                    object3 = object;
                    object3 = (d)object;
                    String string4 = ((d)object3).a;
                    object3 = ((d)object3).b;
                    object2.onFailure(string4, (String)object3);
                }
                object3 = "Fetching trackers failed for creativeId = ";
                object2 = new StringBuilder((String)object3);
                ((StringBuilder)object2).append(string3);
                char c2 = ' ';
                ((StringBuilder)object2).append(c2);
                object = ((d)object).b;
                ir3_0.b((StringBuilder)object2, (String)object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        return Unit.a;
    }
}

