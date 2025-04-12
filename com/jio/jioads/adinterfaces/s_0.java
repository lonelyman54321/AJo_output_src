/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import com.google.gson.Gson;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsTracker;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.network.d;
import com.jio.jioads.network.e;
import com.jio.jioads.network.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.adinterfaces.s
 */
public final class s_0
extends Lambda
implements Function1 {
    public final /* synthetic */ JioAdsTracker c;

    public s_0(JioAdsTracker jioAdsTracker) {
        this.c = jioAdsTracker;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (f)object;
        Object object2 = "result";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object instanceof e;
        Object object3 = "message";
        if (n3 != 0) {
            object2 = new StringBuilder(" Default Tracker information success  ");
            object = (e)object;
            String string2 = ((e)object).a;
            ir3_0.b((StringBuilder)object2, string2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = ((e)object).a;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                object2 = JioAdsTracker.access$getContext$p(this.c);
                string2 = "default_trackers";
                String string3 = "common_prefs";
                j_0.p((Context)object2, string3, 0, object, string2);
                object2 = new Gson();
                object3 = b.class;
                object = ((Gson)object2).fromJson((String)object, (Class)object3);
                b.f(object);
            }
        } else {
            n3 = object instanceof d;
            if (n3 != 0) {
                String string4 = "Default tracker information failed  ";
                object2 = new StringBuilder(string4);
                object = ((d)object).a;
                ir3_0.b((StringBuilder)object2, (String)object, (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
        return Unit.a;
    }
}

