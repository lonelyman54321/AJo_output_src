/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.jio.jioads.native;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.native.t;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class s
implements Handler.Callback {
    public final /* synthetic */ t a;
    public final /* synthetic */ Context b;

    public /* synthetic */ s(t t3, Context context) {
        this.a = t3;
        this.b = context;
    }

    public final boolean handleMessage(Message object) {
        boolean bl2;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "it");
        object = ((t)object2).a.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        a a2 = ((t)object2).b;
        Object object4 = ((t)object2).a;
        if (object != object3 && !(bl2 = ((Utility)(object = Utility.INSTANCE)).isInternetAvailable((Context)(object3 = this.b)))) {
            com.jio.jioads.audioplayer.b.a((b)object4, ": Not connected to the Internet.Please check your connection and try again.");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = JioAdError$JioAdErrorType.ERROR_INTERNET_NOT_AVAILABLE;
            object2 = JioAdError.Companion;
            object3 = "Not connected to the Internet.Please check your connection and try again.";
            JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object), (String)object3);
            d d2 = d.a;
            object4 = a2;
            object4 = (V)a2;
            String string2 = "Not connected to the Internet.Please check your connection and try again";
            String string3 = "initRefreshHandler";
            String string4 = "NativeAdController";
            ((V)object4).d(jioAdError, false, d2, string3, string4, string2, null);
        } else {
            object = JioAdView$AdState.NOT_REQUESTED;
            a2 = (V)a2;
            ((V)a2).e((JioAdView$AdState)((Object)object));
            object = new StringBuilder();
            object3 = "  Calling cacheAd() API for Refresh Request";
            j_0.i((b)object4, (StringBuilder)object, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = (f)((t)object2).c;
            ((f)object).o();
        }
        return false;
    }
}

