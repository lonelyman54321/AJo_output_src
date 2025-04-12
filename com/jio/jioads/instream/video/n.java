/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instream.video.m;
import com.jio.jioads.instreamads.vastparser.listener.a;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.videomodule.config.b;
import com.jio.jioads.videomodule.s;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class n
implements a {
    public final /* synthetic */ InstreamVideo a;
    public final /* synthetic */ Map b;

    public n(InstreamVideo instreamVideo, Map map2) {
        this.a = instreamVideo;
        this.b = map2;
    }

    public final void a() {
        Object object = this.a;
        Object object2 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object);
        boolean bl2 = object2.f0();
        if (bl2) {
            return;
        }
        object2 = new StringBuilder();
        Object object3 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object).P();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(": onUrlMediaUpdate");
        object2 = ((StringBuilder)object2).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object);
        if (object2 != null) {
            long l2;
            int n3;
            object3 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)object);
            if (object3 != null) {
                n3 = ((com.jio.jioads.instreamads.vastparser.n)object3).u;
            } else {
                n3 = 0;
                object3 = null;
            }
            object2 = ((s)object2).h0();
            ((b)object2).a = l2 = (long)n3;
        }
        if ((object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object)) != null) {
            object = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a;
            boolean bl3 = ((o)object).D;
            ((s)object2).J(bl3);
        }
    }

    public final void a(com.jio.jioads.instreamads.vastparser.model.m object) {
        boolean bl2;
        Object object2 = this.a;
        int n3 = InstreamVideo.access$isInstreamVideoClassReleased$p((InstreamVideo)object2);
        String string2 = "message";
        if (n3 != 0) {
            object = new StringBuilder();
            object2 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).P();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": returning from onSelectionFinished as InstreamVideo is released!");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object3 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2);
        n3 = object3.f0();
        if (n3 != 0) {
            return;
        }
        object3 = new StringBuilder();
        Object object4 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).P();
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append(": onSelectionFinished");
        Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        boolean bl3 = true;
        if (object != null) {
            Object object5 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object2);
            if (object5 == null) {
                boolean bl4;
                Object object6;
                int n4;
                Object object7;
                Object object8;
                object5 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).k0();
                if (object5 == (object8 = JioAdView$AdState.DESTROYED)) {
                    return;
                }
                object5 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).Y();
                object8 = null;
                if (object5 != null) {
                    object7 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).B();
                    if (object7 != null) {
                        n4 = (Integer)object7;
                    } else {
                        n4 = 0;
                        object7 = null;
                    }
                    object6 = new m((InstreamVideo)object2);
                    object5 = ((com.jio.jioads.instreamads.vastparser.model.m)object).e((Context)object5, n4, (Function2)object6);
                } else {
                    bl4 = false;
                    object5 = null;
                }
                if (object5 != null && (object7 = (k)CollectionsKt.firstOrNull((List)object5)) != null) {
                    object7 = ((k)object7).p;
                } else {
                    n4 = 0;
                    object7 = null;
                }
                object6 = "pgm_placeholder_campaign";
                n4 = (int)(Intrinsics.areEqual(object7, object6) ? 1 : 0);
                if (n4 != 0) {
                    object = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).n();
                    if (object != null) {
                        ((JioAdView)object).setPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl3);
                    }
                    object = InstreamVideo.access$getPodSelectionTimer$p((InstreamVideo)object2);
                    if (object != null) {
                        object.cancel();
                    }
                    object = new StringBuilder();
                    object5 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).P();
                    ((StringBuilder)object).append((String)object5);
                    ((StringBuilder)object).append(": pgm found giving onPrepared callback ");
                    object5 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).n();
                    if (object5 != null) {
                        bl4 = ((JioAdView)object5).isPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object8 = bl4;
                    }
                    ((StringBuilder)object).append(object8);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string2);
                    ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object2);
                    object3 = JioAdView$AdState.RECEIVED;
                    ((V)object).e((JioAdView$AdState)((Object)object3));
                    ((V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object2)).o();
                    object = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object2);
                    object3 = JioAdView$AdState.PREPARED;
                    ((V)object).e((JioAdView$AdState)((Object)object3));
                    object = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object2);
                    ((V)object).n();
                } else if (object5 != null && (n3 = (int)(object5.isEmpty() ? 1 : 0)) == 0) {
                    object3 = this.b;
                    InstreamVideo.access$initJioVideoViewIfNull((InstreamVideo)object2, (com.jio.jioads.instreamads.vastparser.model.m)object, (Map)object3);
                } else {
                    object = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object2)).a;
                    boolean bl5 = ((o)object).o;
                    if (!bl5 && (object5 == null || (bl5 = object5.isEmpty()))) {
                        InstreamVideo.access$handleNoAdInInventory((InstreamVideo)object2);
                    }
                    return;
                }
            }
            if ((object = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object2)) != null) {
                long l2;
                object3 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)object2);
                Intrinsics.checkNotNull(object3);
                n3 = ((com.jio.jioads.instreamads.vastparser.n)object3).u;
                object = ((s)object).h0();
                ((b)object).a = l2 = (long)n3;
            }
            if ((object = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object2)) != null) {
                ((s)object).J(false);
            }
        }
        if ((bl2 = InstreamVideo.access$isAdPrepared$p((InstreamVideo)object2)) && !(bl2 = InstreamVideo.access$isAdPreparedCallbackGiven$p((InstreamVideo)object2)) && !(bl2 = InstreamVideo.access$isPodEnabledWithDuration((InstreamVideo)object2)) && (bl2 = InstreamVideo.access$isPodEnabledWithCount((InstreamVideo)object2))) {
            InstreamVideo.access$setAdPreparedCallbackGiven$p((InstreamVideo)object2, bl3);
            object = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object2);
            object3 = JioAdView$AdState.PREPARED;
            ((V)object).e((JioAdView$AdState)((Object)object3));
            object = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object2);
            ((V)object).n();
        }
    }
}

