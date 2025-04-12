/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.ViewGroup
 */
package com.jio.jioads.instream.audio;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.a;
import com.jio.jioads.instream.audio.InstreamAudio;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements com.jio.jioads.instreamads.vastparser.listener.c {
    public final /* synthetic */ InstreamAudio a;

    public l(InstreamAudio instreamAudio) {
        this.a = instreamAudio;
    }

    public final void a(m object) {
        Object object2 = this.a;
        Object object3 = InstreamAudio.access$getIJioAdView$p((InstreamAudio)object2);
        int n3 = object3.f0();
        if (n3 != 0) {
            InstreamAudio.access$setJioVastParsingHelper$p((InstreamAudio)object2, null);
            return;
        }
        if (object != null) {
            object3 = new StringBuilder();
            Object object4 = InstreamAudio.access$getIJioAdView$p((InstreamAudio)object2).P();
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(": finalVastModel is not null");
            object3 = ((StringBuilder)object3).toString();
            object4 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object3 = JioAds.Companion;
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object5 = JioAds$LogLevel.NONE;
            Object object6 = InstreamAudio.access$getJioAdCallbacks$p((InstreamAudio)object2);
            b b2 = InstreamAudio.access$getIJioAdView$p((InstreamAudio)object2);
            c c2 = InstreamAudio.access$getIJioAdViewController$p((InstreamAudio)object2);
            HashMap hashMap = InstreamAudio.access$getHeaders((InstreamAudio)object2);
            Object object7 = object5;
            object5 = new j((a)object6, b2, c2, (m)object, false, hashMap);
            ((InstreamAudio)object2).setInStreamAudioRenderer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((j)object5);
            object5 = new StringBuilder();
            object7 = InstreamAudio.access$getIJioAdView$p((InstreamAudio)object2).P();
            ((StringBuilder)object5).append((String)object7);
            ((StringBuilder)object5).append(": value of container is : ");
            object7 = InstreamAudio.access$getContainer$p((InstreamAudio)object2);
            ((StringBuilder)object5).append(object7);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = ((InstreamAudio)object2).getInStreamAudioRenderer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object3 != null) {
                ((j)object3).v();
            }
            if ((object4 = ((InstreamAudio)object2).getInStreamAudioRenderer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                int n4;
                object5 = InstreamAudio.access$getContainer$p((InstreamAudio)object2);
                object3 = InstreamAudio.access$getToInt$p((InstreamAudio)object2);
                int n7 = 0;
                object7 = null;
                if (object3 != null) {
                    n3 = (Integer)object3;
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object6 = InstreamAudio.access$getToInt1$p((InstreamAudio)object2);
                if (object6 != null) {
                    n4 = n7 = ((Integer)object6).intValue();
                } else {
                    n4 = 0;
                    object6 = null;
                }
                b2 = InstreamAudio.access$getPortraitImage$p((InstreamAudio)object2);
                c2 = InstreamAudio.access$getLandScapeImage$p((InstreamAudio)object2);
                n7 = n3;
                ((j)object4).c((ViewGroup)object5, n3, n4, (Drawable)b2, (Drawable)c2);
            }
        }
        if (object == null) {
            object = InstreamAudio.access$getJioAdCallbacks$p((InstreamAudio)object2);
            object2 = JioAdView$AdState.FAILED;
            object = (V)object;
            ((V)object).e((JioAdView$AdState)((Object)object2));
        }
    }

    public final void b(JioAdError jioAdError, d d2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        Object object = new StringBuilder();
        Object object2 = this.a;
        Object object3 = InstreamAudio.access$getIJioAdView$p((InstreamAudio)object2).P();
        object.append((String)object3);
        object.append(": onError ");
        object3 = jioAdError.getErrorDescription();
        object.append((String)object3);
        object.append(", methodName: ");
        X50.a(object, string2, ", className: ", string3, ", errorDesc: ");
        ir3_0.b(object, string4, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = InstreamAudio.access$getJioAdCallbacks$p((InstreamAudio)object2);
        object2 = object;
        object2 = (V)object;
        object3 = jioAdError;
        ((V)object2).d(jioAdError, false, d2, string2, string3, string4, null);
    }
}

