/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  org.json.JSONObject
 */
package com.jio.jioads.jioreel.ssai;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.jioreel.data.StreamType;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.jioreel.ssai.m;
import com.jio.jioads.jioreel.ssai.n;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.network.e;
import com.jio.jioads.network.f;
import com.jio.jioads.util.Utility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class o
extends Lambda
implements Function1 {
    public final /* synthetic */ p c;
    public final /* synthetic */ String d;

    public o(p p2, String string2) {
        this.c = p2;
        this.d = string2;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (f)object;
        Object object3 = "it";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = object2 instanceof e;
        Object object4 = "message";
        p p2 = this.c;
        if (bl2) {
            object2 = ((e)object2).a;
            if (object2 != null) {
                int n3;
                Intrinsics.checkNotNullParameter(object2, "media");
                object3 = new JSONObject((String)object2);
                object2 = object3.get("mediaURL").toString();
                Object object5 = object3.get("vastURL").toString();
                Object object6 = "clientSideTracking";
                boolean bl3 = object3.has(object6);
                if (bl3) {
                    object3 = object3.get(object6);
                    object6 = "null cannot be cast to non-null type kotlin.Boolean";
                    Intrinsics.checkNotNull(object3, object6);
                    object3 = (Boolean)object3;
                } else {
                    object3 = Boolean.TRUE;
                }
                p2.f = object2;
                p2.e = object5;
                object6 = p2.j;
                Object object7 = StreamType.VOD;
                if (object6 == object7 && object5 != null && (n3 = ((String)object5).length()) != 0) {
                    object6 = new b();
                    object7 = new g13(p2, 1);
                    int n4 = 8;
                    ((b)object6).a(n4, (String)object5, (Function1)object7);
                }
                l_0.h("media url ", (String)object2);
                object5 = JioAds.Companion;
                ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object6 = JioAds$LogLevel.NONE;
                p2.l = object3;
                object3 = new StringBuilder("clientSideTracking: ");
                object6 = p2.l;
                ((StringBuilder)object3).append(object6);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object4);
                ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = Looper.getMainLooper();
                object3 = new Handler((Looper)object4);
                object4 = new m(p2, (String)object2);
                object3.post((Runnable)object4);
            }
        } else {
            bl2 = object2 instanceof com.jio.jioads.network.d;
            if (bl2) {
                object3 = new StringBuilder("network error ");
                Object object8 = object2;
                object8 = ((com.jio.jioads.network.d)object2).b;
                ir3_0.b((StringBuilder)object3, (String)object8, (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object8 = Utility.INSTANCE;
                Context context = p2.a;
                d d2 = com.jio.jioads.cdnlogging.d.a;
                object3 = JioAdError$JioAdErrorType.IO_ERROR;
                String string2 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorTitle();
                a a2 = new a();
                Boolean bl4 = Boolean.FALSE;
                String string3 = p2.a.getPackageName();
                String string4 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorCode();
                String string5 = "SSAIController-initiateControllerForLive";
                String string6 = this.d;
                String string7 = "Exception while initiating Controller For Live";
                ((Utility)object8).logError(context, string6, d2, string2, string7, a2, string5, bl4, string3, string4, false);
                object4 = Looper.getMainLooper();
                object3 = new Handler((Looper)object4);
                object4 = new n(p2, (f)object2);
                object3.post((Runnable)object4);
            }
        }
        return Unit.a;
    }
}

