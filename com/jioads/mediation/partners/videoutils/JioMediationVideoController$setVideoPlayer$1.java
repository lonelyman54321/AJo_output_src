/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.google.ads.interactivemedia.v3.api.player.AdMediaInfo
 *  com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
 *  com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback
 *  com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate
 */
package com.jioads.mediation.partners.videoutils;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.jio.jioads.adinterfaces.E;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.o;
import com.jio.jioads.videomodule.callback.a;
import com.jio.jioads.videomodule.s;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class JioMediationVideoController$setVideoPlayer$1
implements a {
    public final /* synthetic */ JioMediationVideoController a;

    public JioMediationVideoController$setVideoPlayer$1(JioMediationVideoController jioMediationVideoController) {
        this.a = jioMediationVideoController;
    }

    public boolean canPrepareNextVideoAd(int n3) {
        return true;
    }

    public int getBitRate() {
        return 0;
    }

    public void onAdChange(String string2, int n3) {
        block8: {
            Object object;
            Object object2;
            String string3;
            block7: {
                int n4;
                JioAdView$AdPodVariant jioAdView$AdPodVariant;
                string3 = "adId";
                Intrinsics.checkNotNullParameter(string2, string3);
                object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
                int n7 = 0;
                object = null;
                if (object2 != null) {
                    jioAdView$AdPodVariant = object2.L();
                } else {
                    n4 = 0;
                    jioAdView$AdPodVariant = null;
                }
                JioAdView$AdPodVariant jioAdView$AdPodVariant2 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                if (jioAdView$AdPodVariant == jioAdView$AdPodVariant2) break block7;
                if (object2 != null) {
                    object = object2.L();
                }
                if (object != (jioAdView$AdPodVariant = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP) && (n7 = (object = JioMediationVideoController.access$getMJioInStreamVideo$p(this.a)) != null ? ((s)object).U() : -1) <= (n4 = 1)) break block8;
            }
            if (object2 != null && (object2 = object2.h0()) != null) {
                object2 = (V)object2;
                Intrinsics.checkNotNullParameter(string2, string3);
                object = Looper.getMainLooper();
                string3 = new Handler((Looper)object);
                object2 = ((V)object2).a;
                object = new E(n3, (JioAdView)object2, string2);
                string3.post((Runnable)object);
            }
        }
    }

    public void onAdClick() {
        Object object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            object = (V)object;
            ((V)object).a();
        }
    }

    public void onAdCollapsed() {
        Object object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.COLLAPSED;
            object = (V)object;
            ((V)object).e(jioAdView$AdState);
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object = object.h0()) != null) {
            object = (V)object;
            ((V)object).j();
        }
    }

    public void onAdComplete(String object, int n3, int n4, int n7, Integer object2) {
        Object object3;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "adId");
        object = new StringBuilder();
        Object object5 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        object5 = object5 != null ? object5.P() : null;
        ((StringBuilder)object).append((String)object5);
        ((StringBuilder)object).append(": playerCallback completed ");
        object5 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        ((StringBuilder)object).append(object5);
        object = ((StringBuilder)object).toString();
        object5 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        if (object != null) {
            boolean bl2;
            object = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
            while (bl2 = object.hasNext()) {
                object4 = (VideoAdPlayer.VideoAdPlayerCallback)object.next();
                object3 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                Intrinsics.checkNotNull(object3);
                object4.onEnded((AdMediaInfo)object3);
            }
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null) {
            object4 = object.h0();
            if (object4 != null) {
                object3 = JioAdView$AdState.CLOSED;
                object4 = (V)object4;
                ((V)object4).e((JioAdView$AdState)((Object)object3));
            }
            object4 = new StringBuilder();
            object3 = object.P();
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(": onAdComplete servedDuration : ");
            ((StringBuilder)object4).append(n4);
            ((StringBuilder)object4).append(", totalDuration: ");
            ((StringBuilder)object4).append(n7);
            object3 = ", rewardSkipValue: ";
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(object2);
            object2 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            object5 = object.h0();
            if (object5 != null) {
                object5 = (V)object5;
                ((V)object5).l();
            }
            if ((object = object.h0()) != null) {
                object5 = null;
                n4 = n4 == n7 ? 1 : 0;
                object = (V)object;
                ((V)object).h(n4 != 0, false);
            }
        }
    }

    public void onAdExpand() {
        Object object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
            object = (V)object;
            ((V)object).e(jioAdView$AdState);
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object = object.h0()) != null) {
            object = (V)object;
            ((V)object).k();
        }
    }

    public void onAdLoaded(String object, int n3) {
        Object object2 = "adId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            object2 = JioAdView$AdState.STARTED;
            object = (V)object;
            ((V)object).e((JioAdView$AdState)((Object)object2));
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object = object.h0()) != null) {
            object2 = JioMediationVideoController.access$getMJioInStreamVideo$p(this.a);
            if (object2 == null || (object2 = ((s)object2).T()) == null) {
                object2 = "";
            }
            object = (V)object;
            ((V)object).i((String)object2);
        }
    }

    public void onAdPrepared(String string2) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public void onAdProgress(String string2, long l2, long l3) {
        Object object;
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        if (object2 != null && (object2 = JioMediationVideoController.access$getVideoAdPlayer$p(this.a)) != null) {
            boolean bl2;
            object2 = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
            while (bl2 = object2.hasNext()) {
                object = (VideoAdPlayer.VideoAdPlayerCallback)object2.next();
                AdMediaInfo adMediaInfo = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                Intrinsics.checkNotNull(adMediaInfo);
                VideoAdPlayer videoAdPlayer = JioMediationVideoController.access$getVideoAdPlayer$p(this.a);
                Intrinsics.checkNotNull(videoAdPlayer);
                videoAdPlayer = videoAdPlayer.getAdProgress();
                object.onAdProgress(adMediaInfo, (VideoProgressUpdate)videoAdPlayer);
            }
        }
        if ((object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object2 = object2.h0()) != null) {
            object = object2;
            object = (V)object2;
            ((V)object).c(l3, string2, l2);
        }
    }

    public void onAdSkippable(String object, int n3, int n4, int n7, Integer n8) {
        String string2 = "adId";
        Intrinsics.checkNotNullParameter(object, string2);
        object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            object = (V)object;
            ((V)object).p();
        }
    }

    public void onAdSkipped(int n3, int n4, Integer object) {
        JioAdView$AdState jioAdView$AdState;
        object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            jioAdView$AdState = JioAdView$AdState.CLOSED;
            object = (V)object;
            ((V)object).e(jioAdView$AdState);
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object = object.h0()) != null) {
            jioAdView$AdState = null;
            n3 = n3 == n4 ? 1 : 0;
            object = (V)object;
            ((V)object).h(n3 != 0, false);
        }
    }

    public void onAdStarted(String object, int n3) {
        Object object2 = "adId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a;
        boolean bl2 = JioMediationVideoController.access$isFirstResumed$p((JioMediationVideoController)object);
        if (!bl2) {
            object = this.a;
            n3 = 0;
            object2 = null;
            ((JioMediationVideoController)object).resume(false);
        }
        object = new StringBuilder();
        object2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object2 != null) {
            object2 = object2.P();
        } else {
            n3 = 0;
            object2 = null;
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": playerCallback started ");
        object2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        if (object != null) {
            object = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (VideoAdPlayer.VideoAdPlayerCallback)object.next();
                AdMediaInfo adMediaInfo = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                Intrinsics.checkNotNull(adMediaInfo);
                object2.onPlay(adMediaInfo);
            }
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object = object.h0()) != null) {
            object = (V)object;
            ((V)object).m();
        }
        if ((object = JioMediationVideoController.access$getMIJioAdView$p(this.a)) != null && (object = object.z()) != null) {
            ((o)object).d0();
        }
    }

    public void onAllAdMediaProgress(long l2, long l3) {
        Object object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            object = (V)object;
            ((V)object).b(l2, l3);
        }
    }

    public void onFailedToLoad(JioAdError jioAdError, boolean bl2, d d2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        Object object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null && (object = object.h0()) != null) {
            String string5 = "InstreamVideo: ";
            String string6 = kp1_0.c(string5, string3);
            object = (V)object;
            ((V)object).d(jioAdError, bl2, d2, string2, string6, string4, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onMediaPlaybackChange(com.jio.jioads.videomodule.b object) {
        Iterator iterator;
        block17: {
            block21: {
                int n3;
                int n4;
                int n7;
                block20: {
                    String string2;
                    String string3;
                    block18: {
                        block19: {
                            iterator = "type";
                            Intrinsics.checkNotNullParameter(object, (String)((Object)iterator));
                            int n8 = ((Enum)object).ordinal();
                            n7 = 3;
                            n4 = 2;
                            n3 = 1;
                            string3 = "message";
                            string2 = null;
                            if (n8 == 0) break block18;
                            if (n8 == n3) break block19;
                            if (n8 != n4) {
                                if (n8 == n7) {
                                    iterator = new Iterator();
                                    b b2 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
                                    if (b2 != null) {
                                        string2 = b2.P();
                                    }
                                    ((StringBuilder)((Object)iterator)).append(string2);
                                    ((StringBuilder)((Object)iterator)).append(": playerCallback UN_MUTE ");
                                    string2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                                    ((StringBuilder)((Object)iterator)).append((Object)string2);
                                    Intrinsics.checkNotNullParameter(((StringBuilder)((Object)iterator)).toString(), string3);
                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    iterator = JioAds$LogLevel.NONE;
                                    iterator = JioAdView$MediaPlayBack.RESUME;
                                }
                                break block20;
                            } else {
                                iterator = new Iterator();
                                b b3 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
                                if (b3 != null) {
                                    string2 = b3.P();
                                }
                                ((StringBuilder)((Object)iterator)).append(string2);
                                ((StringBuilder)((Object)iterator)).append(": playerCallback MUTE ");
                                string2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                                ((StringBuilder)((Object)iterator)).append((Object)string2);
                                Intrinsics.checkNotNullParameter(((StringBuilder)((Object)iterator)).toString(), string3);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                iterator = JioAds$LogLevel.NONE;
                                iterator = JioAdView$MediaPlayBack.RESUME;
                            }
                            break block20;
                        }
                        iterator = new Iterator();
                        b b4 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
                        if (b4 != null) {
                            string2 = b4.P();
                        }
                        ((StringBuilder)((Object)iterator)).append(string2);
                        ((StringBuilder)((Object)iterator)).append(": playerCallback paused ");
                        string2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                        ((StringBuilder)((Object)iterator)).append((Object)string2);
                        Intrinsics.checkNotNullParameter(((StringBuilder)((Object)iterator)).toString(), string3);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        iterator = JioAds$LogLevel.NONE;
                        iterator = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                        if (iterator != null) {
                            boolean bl2;
                            iterator = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
                            while (bl2 = iterator.hasNext()) {
                                string3 = (VideoAdPlayer.VideoAdPlayerCallback)iterator.next();
                                string2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                                Intrinsics.checkNotNull(string2);
                                string3.onPause((AdMediaInfo)string2);
                            }
                        }
                        iterator = JioAdView$MediaPlayBack.RESUME;
                        break block20;
                    }
                    iterator = new Iterator();
                    b b5 = JioMediationVideoController.access$getMIJioAdView$p(this.a);
                    if (b5 != null) {
                        string2 = b5.P();
                    }
                    ((StringBuilder)((Object)iterator)).append(string2);
                    ((StringBuilder)((Object)iterator)).append(": playerCallback resume ");
                    string2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                    ((StringBuilder)((Object)iterator)).append((Object)string2);
                    Intrinsics.checkNotNullParameter(((StringBuilder)((Object)iterator)).toString(), string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    iterator = JioAds$LogLevel.NONE;
                    iterator = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                    if (iterator != null) {
                        boolean bl3;
                        iterator = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
                        while (bl3 = iterator.hasNext()) {
                            string3 = (VideoAdPlayer.VideoAdPlayerCallback)iterator.next();
                            string2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                            Intrinsics.checkNotNull(string2);
                            string3.onResume((AdMediaInfo)string2);
                        }
                    }
                    iterator = JioAdView$MediaPlayBack.RESUME;
                }
                int n10 = ((Enum)object).ordinal();
                if (n10 == 0) break block21;
                if (n10 != n3) {
                    if (n10 != n4) {
                        if (n10 != n7) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        object = JioAdView$MediaPlayBack.UNMUTE;
                        break block17;
                    } else {
                        object = JioAdView$MediaPlayBack.MUTE;
                    }
                    break block17;
                } else {
                    object = JioAdView$MediaPlayBack.PAUSE;
                }
                break block17;
            }
            object = JioAdView$MediaPlayBack.RESUME;
        }
        iterator = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (iterator != null && (iterator = iterator.h0()) != null) {
            iterator = (V)((Object)iterator);
            ((V)((Object)iterator)).f((JioAdView$MediaPlayBack)((Object)object));
        }
    }

    public void onMediaPrepareTimeOut(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public void onPlayAgain(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public void onPlayerError(int n3, String object) {
        boolean bl2;
        Object object2 = new StringBuilder();
        object = JioMediationVideoController.access$getMIJioAdView$p(this.a);
        if (object != null) {
            object = object.P();
        } else {
            bl2 = false;
            object = null;
        }
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(": playerCallback onError ");
        object = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        ((StringBuilder)object2).append(object);
        object2 = ((StringBuilder)object2).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
        if (object2 != null) {
            object2 = JioMediationVideoController.access$getVideoPlayerCallbacks$p(this.a).iterator();
            while (bl2 = object2.hasNext()) {
                object = (VideoAdPlayer.VideoAdPlayerCallback)object2.next();
                AdMediaInfo adMediaInfo = JioMediationVideoController.access$getMCurrentMediaInfo$p(this.a);
                Intrinsics.checkNotNull(adMediaInfo);
                object.onError(adMediaInfo);
            }
        }
    }

    public void onStartPrepare(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public void playAgainFromMediaPlayer(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }
}

