/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.ads.interactivemedia.v3.api.AdPodInfo
 *  com.google.ads.interactivemedia.v3.api.player.AdMediaInfo
 *  com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
 *  com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback
 *  com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate
 */
package com.jioads.mediation.partners.videoutils;

import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import kotlin.jvm.internal.Intrinsics;

public final class JioMediationVideoController$requestAds$1$4
implements VideoAdPlayer {
    public final /* synthetic */ JioMediationVideoController a;

    public JioMediationVideoController$requestAds$1$4(JioMediationVideoController jioMediationVideoController) {
        this.a = jioMediationVideoController;
    }

    public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        Intrinsics.checkNotNullParameter(videoAdPlayerCallback, "p0");
        Object object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        String string2 = null;
        object2 = object2 != null ? object2.P() : null;
        object.append((String)object2);
        object.append(": VideoAdPlayer AddCallback ");
        object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
        if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
            string2 = object2.getAdId();
        }
        object.append(string2);
        object.append(' ');
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).add(videoAdPlayerCallback);
    }

    public VideoProgressUpdate getAdProgress() {
        int n3;
        Object object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        int n4 = 0;
        Object object3 = null;
        if (object2 != null) {
            object2 = object2.P();
        } else {
            n3 = 0;
            object2 = null;
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": VideoAdPlayer getAdProgress ");
        n3 = JioMediationVideoController.access$getMCustomListener$p(this.a).getVideoAdDuration();
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null) {
            object3 = object.k0();
        }
        if (object3 == (object = JioAdView$AdState.DESTROYED)) {
            object = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            Intrinsics.checkNotNullExpressionValue(object, "VIDEO_TIME_NOT_READY");
            return object;
        }
        object = JioMediationVideoController.access$getMCustomListener$p(this.a);
        int n7 = object.getVideoAdDuration();
        if (n7 <= 0) {
            object = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            Intrinsics.checkNotNull(object);
        } else {
            object = this.a;
            object3 = JioMediationVideoController.access$getMCustomListener$p((JioMediationVideoController)object);
            n4 = object3.getCurrentPosition();
            long l2 = n4;
            n7 = JioMediationVideoController.access$getMCustomListener$p((JioMediationVideoController)object).getVideoAdDuration();
            long l3 = n7;
            object = object2 = new VideoProgressUpdate(l2, l3);
        }
        return object;
    }

    public int getVolume() {
        return JioMediationVideoController.access$getMCustomListener$p(this.a).getVolume();
    }

    public void loadAd(AdMediaInfo object, AdPodInfo object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "adMediaInfo");
        Intrinsics.checkNotNullParameter(object2, "adpodInfo");
        object2 = new StringBuilder("Video ad Player URL ");
        String string2 = object.getUrl();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(' ');
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        string2 = null;
        if (object2 != null) {
            object2 = object2.k0();
        } else {
            bl2 = false;
            object2 = null;
        }
        Object object3 = JioAdView$AdState.DESTROYED;
        if (object2 == object3) {
            return;
        }
        object2 = object.getUrl();
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            Object object4;
            Object object5;
            int n3;
            JioMediationVideoController.access$setMCurrentMediaInfo$p(this.a, object);
            object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
            if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
                double d2 = object2.getDuration();
                object2 = d2;
            } else {
                bl2 = false;
                object2 = 0;
            }
            int n4 = ((Number)object2).intValue();
            object2 = this.a;
            object3 = JioMediationVideoController.access$getMCustomListener$p((JioMediationVideoController)object2);
            String string3 = object.getUrl();
            Intrinsics.checkNotNullExpressionValue(string3, "getUrl(...)");
            JioMediationVideoController jioMediationVideoController = this.a;
            object = JioMediationVideoController.access$getMAdsManager$p(jioMediationVideoController);
            if (object != null && (object = object.getCurrentAd()) != null) {
                n3 = object.getVastMediaHeight();
                object5 = object = Integer.valueOf(n3);
            } else {
                object5 = null;
            }
            object = JioMediationVideoController.access$getMAdsManager$p(this.a);
            if (object != null && (object = object.getCurrentAd()) != null) {
                n3 = object.getVastMediaWidth();
                object4 = object = Integer.valueOf(n3);
            } else {
                object4 = null;
            }
            object = JioMediationVideoController.access$getMAdsManager$p(this.a);
            if (object != null && (object = object.getCurrentAd()) != null) {
                string2 = object.getAdId();
            }
            int n7 = -1;
            object3.addMediationUrl(string3, jioMediationVideoController, n4, n7, (Integer)object5, (Integer)object4, string2);
        }
    }

    public void pauseAd(AdMediaInfo adMediaInfo) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(adMediaInfo, "p0");
        Object object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        String string2 = null;
        if (object2 != null) {
            object2 = object2.P();
        } else {
            bl2 = false;
            object2 = null;
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": VideoAdPlayer pauseAd ");
        object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
        if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
            string2 = object2.getAdId();
        }
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(' ');
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioMediationVideoController.access$getMCustomListener$p(this.a);
        object2 = this.a;
        bl2 = JioMediationVideoController.access$getMIsPauseCalledByDev$p((JioMediationVideoController)object2);
        object.pauseAdFromMediation(bl2);
        object = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (VideoAdPlayer.VideoAdPlayerCallback)object.next();
            object2.onPause(adMediaInfo);
        }
    }

    public void playAd(AdMediaInfo adMediaInfo) {
        Intrinsics.checkNotNullParameter(adMediaInfo, "p0");
        Object object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        String string2 = null;
        if (object2 != null) {
            object2 = object2.P();
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": VideoAdPlayer play ad ");
        object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
        if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
            string2 = object2.getAdId();
        }
        ((StringBuilder)object).append(string2);
        char c2 = ' ';
        ((StringBuilder)object).append(c2);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        boolean bl2 = JioMediationVideoController.access$isAdStarted$p((JioMediationVideoController)object);
        if (bl2) {
            boolean bl3;
            object = JioMediationVideoController.access$getMCustomListener$p(this.a);
            object2 = this.a;
            boolean bl4 = JioMediationVideoController.access$getMIsResumeCalledByDev$p((JioMediationVideoController)object2);
            object.resumeFromMediation(bl4);
            object = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
            while (bl3 = object.hasNext()) {
                object2 = (VideoAdPlayer.VideoAdPlayerCallback)object.next();
                object2.onResume(adMediaInfo);
            }
        } else {
            boolean bl5;
            object = this.a;
            bl2 = JioMediationVideoController.access$isStartCalled$p((JioMediationVideoController)object);
            if (!bl2) {
                object = JioMediationVideoController.access$getMAdsManager$p(this.a);
                if (object != null) {
                    object.start();
                }
                object = this.a;
                boolean bl6 = true;
                JioMediationVideoController.access$setStartCalled$p((JioMediationVideoController)object, bl6);
            }
            object = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
            while (bl5 = object.hasNext()) {
                object2 = (VideoAdPlayer.VideoAdPlayerCallback)object.next();
                object2.onPlay(adMediaInfo);
            }
        }
    }

    public void release() {
        Object object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        String string2 = null;
        object2 = object2 != null ? object2.P() : null;
        object.append((String)object2);
        object.append(": VideoAdPlayer release ");
        object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
        if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
            string2 = object2.getAdId();
        }
        object.append(string2);
        object.append(' ');
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        JioMediationVideoController.access$resetStates(this.a);
    }

    public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        Intrinsics.checkNotNullParameter(videoAdPlayerCallback, "p0");
        Object object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        String string2 = null;
        object2 = object2 != null ? object2.P() : null;
        object.append((String)object2);
        object.append(":VideoAdPlayer removeCallback ");
        object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
        if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
            string2 = object2.getAdId();
        }
        object.append(string2);
        object.append(' ');
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).remove(videoAdPlayerCallback);
    }

    public void stopAd(AdMediaInfo object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "p0");
        object = new StringBuilder();
        Object object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        String string2 = null;
        if (object2 != null) {
            object2 = object2.P();
        } else {
            bl2 = false;
            object2 = null;
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": VideoAdPlayer stopAd ");
        object2 = JioMediationVideoController.access$getMAdsManager$p(this.a);
        if (object2 != null && (object2 = object2.getCurrentAd()) != null) {
            string2 = object2.getAdId();
        }
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(' ');
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioMediationVideoController.access$getMCustomListener$p(this.a);
        bl2 = JioMediationVideoController.access$isSkipped$p(this.a);
        object.stopAds(bl2);
    }
}

