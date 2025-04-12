/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instream.video.c;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

public final class d
extends Lambda
implements Function0 {
    public final /* synthetic */ InstreamVideo c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ m f;

    public d(InstreamVideo instreamVideo, Context context, Map map2, m m2) {
        this.c = instreamVideo;
        this.d = context;
        this.e = map2;
        this.f = m2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        int n3;
        int n4;
        int n7;
        InstreamVideo instreamVideo = this.c;
        int n8 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        Object object = "message";
        if (n8 != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            stringBuilder.append(string2);
            stringBuilder.append(": returning from initJioVideoViewIfNull");
            Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return Unit.a;
        }
        Object object2 = InstreamVideo.access$getJioVideoView$p(instreamVideo);
        if (object2 != null) {
            return Unit.a;
        }
        object2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).I();
        if (object2 != null && (n7 = ((Integer)object2).intValue()) != (n4 = -1)) {
            InstreamVideo.access$setCustomLayout$p(instreamVideo, (Integer)object2);
            n8 = (Integer)object2;
        } else {
            object2 = this.d;
            n8 = j_0.l((Context)object2);
            n8 = n8 != 0 ? InstreamVideo.access$getDefaultLayoutForSTB(instreamVideo) : InstreamVideo.access$getDefaultLayout(instreamVideo);
        }
        int n10 = n8;
        object2 = InstreamVideo.access$getIJioAdView$p(instreamVideo);
        n8 = (int)(object2.F() ? 1 : 0);
        if (n8 == 0) {
            object2 = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.RECEIVED;
            ((V)object2).e(jioAdView$AdState);
            object2 = new StringBuilder();
            String string3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            ((StringBuilder)object2).append(string3);
            String string4 = ": call onAdReceived from InstreamVideo";
            ((StringBuilder)object2).append(string4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = (V)InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
            ((V)object2).o();
        }
        if ((object = this.e) == null) {
            object = new HashMap();
        }
        HashMap hashMap = new HashMap(object);
        boolean bl2 = InstreamVideo.access$isExoPlayerEnabled(instreamVideo);
        b b2 = InstreamVideo.access$getIJioAdView$p(instreamVideo);
        com.jio.jioads.common.c c2 = InstreamVideo.access$getIJioAdViewController$p(instreamVideo);
        m m2 = this.f;
        Object object3 = object2;
        object2 = new s(hashMap, m2, n10, bl2, b2, c2, null);
        ((s)object2).z = object = InstreamVideo.access$getListener$p(instreamVideo);
        ((s)object2).b0 = object = InstreamVideo.access$getIJioAdView$p(instreamVideo).d();
        com.jio.jioads.videomodule.config.b b3 = ((s)object2).h0();
        if (object != null) {
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = 1;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        b3.e = n3 ^= n4;
        InstreamVideo.access$initConfiguration(instreamVideo, (s)object2);
        InstreamVideo.access$setJioVideoView$p(instreamVideo, (s)object2);
        object2 = InstreamVideo.access$getJioVideoView$p(instreamVideo);
        if (object2 != null) {
            ((s)object2).h();
        }
        if ((object2 = InstreamVideo.access$getJioVideoView$p(instreamVideo)) == null) {
            return Unit.a;
        }
        ((s)object2).r = object = new c(instreamVideo);
        return Unit.a;
    }
}

