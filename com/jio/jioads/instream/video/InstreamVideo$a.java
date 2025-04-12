/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.instream.video;

import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.E;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.CompanionManager$Companion;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.iab.b;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.multiad.t;
import com.jio.jioads.util.Utility;
import com.jio.jioads.videomodule.callback.a;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class InstreamVideo$a
implements a {
    public final /* synthetic */ InstreamVideo a;

    public InstreamVideo$a(InstreamVideo instreamVideo) {
        this.a = instreamVideo;
    }

    public final boolean canPrepareNextVideoAd(int n3) {
        InstreamVideo instreamVideo = this.a;
        int n4 = 1;
        return (InstreamVideo.access$isPGMQueued(instreamVideo, n4) ^ n4) != 0;
    }

    public final int getBitRate() {
        int n3;
        Integer n4 = InstreamVideo.access$getIJioAdView$p(this.a).B();
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        return n3;
    }

    public final void onAdChange(String object, int n3) {
        int n4;
        Object object2;
        Object object3;
        String string2 = "adId";
        Intrinsics.checkNotNullParameter(object, string2);
        InstreamVideo instreamVideo = this.a;
        int n7 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        if (n7 != 0) {
            return;
        }
        n7 = 1;
        if (n3 > n7) {
            object3 = InstreamVideo.access$getPrevPlayingAdId$p(instreamVideo);
            if (object3 != null && (object2 = CompanionManager.Companion.getInstance()) != null) {
                ((CompanionManager)object2).doCloseCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object3);
            }
            InstreamVideo.access$setPrevPlayingAdId$p(instreamVideo, (String)object);
            object3 = CompanionManager.Companion.getInstance();
            if (object3 != null) {
                object2 = InstreamVideo.access$getCcbValue(instreamVideo);
                ((CompanionManager)object3).doShowCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object, (String)object2);
            }
        }
        object3 = InstreamVideo.access$getJioVideoView$p(instreamVideo);
        object2 = null;
        n4 = (object3 = object3 != null ? ((s)object3).i0() : null) != null && (n4 = ((String)object3).length()) != 0 ? 0 : 1;
        if ((n7 ^= n4) != 0) {
            object2 = object3;
        }
        if (object2 != null) {
            object = object2;
        }
        Object object4 = (V)InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        object4.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        object3 = Looper.getMainLooper();
        string2 = new Handler((Looper)object3);
        object4 = ((V)object4).a;
        object3 = new E(n3, (JioAdView)object4, (String)object);
        string2.post((Runnable)object3);
        object = InstreamVideo.access$getIJioAdView$p(instreamVideo).L();
        JioAdView$AdPodVariant jioAdView$AdPodVariant = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
        if (object == jioAdView$AdPodVariant) {
            InstreamVideo.access$startFetchingAdsForInfinite(instreamVideo);
        }
    }

    public final void onAdClick() {
        Object object = this.a;
        Object object2 = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
        ((V)object2).a();
        boolean bl2 = Utility.ifOmSdkIsAvailable();
        if (bl2) {
            object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object);
            if (object2 != null) {
                object2 = ((s)object2).p;
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null && (object = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object)) != null && (object = ((s)object).p) != null) {
                object2 = com.jio.jioads.iab.a.o;
                long l2 = 0L;
                ((b)object).c((com.jio.jioads.iab.a)((Object)object2), l2);
            }
        }
    }

    public final void onAdCollapsed() {
        Object object = this.a;
        Object object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.COLLAPSED;
        ((V)object2).e(jioAdView$AdState);
        object2 = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
        ((V)object2).j();
        boolean bl2 = Utility.ifOmSdkIsAvailable();
        if (bl2 && (object2 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a.c) != null) {
            object2 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a.c;
            Intrinsics.checkNotNull(object2);
            bl2 = object2.isEmpty() ^ true;
            if (bl2) {
                object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object);
                if (object2 != null) {
                    object2 = ((s)object2).p;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null && (object = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object)) != null && (object = ((s)object).p) != null) {
                    object2 = com.jio.jioads.iab.a.k;
                    long l2 = 0L;
                    ((b)object).c((com.jio.jioads.iab.a)((Object)object2), l2);
                }
            }
        }
    }

    public final void onAdComplete(String object, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(object, "adId");
        InstreamVideo instreamVideo = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        if (bl2) {
            return;
        }
        Object object2 = InstreamVideo.access$getIJioAdViewController$p(instreamVideo);
        Object object3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        object2 = (f)object2;
        object2.getClass();
        Object object4 = "adspotId";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object2 = ((f)object2).a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object2 = ((o)object2).f;
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object4 = ((t)object2).a();
            boolean bl3 = ((HashMap)object4).containsKey(object3);
            if (bl3) {
                object4 = ((t)object2).a();
                ((HashMap)object4).remove(object3);
            }
            if (bl3 = ((HashMap)(object4 = ((t)object2).c())).containsKey(object3)) {
                object2 = ((t)object2).c();
                ((HashMap)object2).remove(object3);
            }
        }
        if ((object3 = ((CompanionManager$Companion)(object2 = CompanionManager.Companion)).getInstance()) != null) {
            object4 = InstreamVideo.access$getPrevPlayingAdId$p(instreamVideo);
            if (object4 == null) {
                object4 = object;
            }
            ((CompanionManager)object3).doCloseCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object4);
        }
        if ((object2 = ((CompanionManager$Companion)object2).getInstance()) != null) {
            object3 = InstreamVideo.access$getPrevPlayingAdId$p(instreamVideo);
            if (object3 != null) {
                object = object3;
            }
            ((CompanionManager)object2).removeCompanionCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
        }
        object = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        object2 = JioAdView$AdState.CLOSED;
        ((V)object).e((JioAdView$AdState)((Object)object2));
        object = new StringBuilder();
        object2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": onAdComplete servedDuration : ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", totalDuration: ");
        ((StringBuilder)object).append(n7);
        object2 = ", rewardSkipValue: ";
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(n8);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        ((V)InstreamVideo.access$getJioAdCallbacks$p(instreamVideo)).l();
        object = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        n8 = null;
        n4 = n4 == n7 ? 1 : 0;
        ((V)object).h(n4 != 0, false);
        InstreamVideo.access$releaseInstream(instreamVideo);
    }

    public final void onAdExpand() {
        Object object = this.a;
        Object object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
        ((V)object2).e(jioAdView$AdState);
        object2 = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
        ((V)object2).k();
        boolean bl2 = Utility.ifOmSdkIsAvailable();
        if (bl2 && (object2 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a.c) != null) {
            object2 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a.c;
            Intrinsics.checkNotNull(object2);
            bl2 = object2.isEmpty() ^ true;
            if (bl2) {
                object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object);
                if (object2 != null) {
                    object2 = ((s)object2).p;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null && (object = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object)) != null && (object = ((s)object).p) != null) {
                    object2 = com.jio.jioads.iab.a.l;
                    long l2 = 0L;
                    ((b)object).c((com.jio.jioads.iab.a)((Object)object2), l2);
                }
            }
        }
    }

    public final void onAdLoaded(String object, int n3) {
        int n4;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "adId");
        InstreamVideo instreamVideo = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        if (bl2) {
            return;
        }
        Object object3 = CompanionManager.Companion;
        Object object4 = ((CompanionManager$Companion)object3).getInstance();
        Object object5 = null;
        if (object4 != null) {
            object2 = InstreamVideo.access$getJioVideoView$p(instreamVideo);
            if (object2 != null) {
                object2 = ((s)object2).l0;
            } else {
                n4 = 0;
                object2 = null;
            }
            ((CompanionManager)object4).setCompanionTrackerReceiver$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((q_0)object2);
        }
        InstreamVideo.access$setPrevPlayingAdId$p(instreamVideo, (String)object);
        object3 = ((CompanionManager$Companion)object3).getInstance();
        if (object3 != null) {
            object4 = InstreamVideo.access$getCcbValue(instreamVideo);
            ((CompanionManager)object3).doShowCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object, (String)object4);
        }
        object3 = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        object4 = JioAdView$AdState.STARTED;
        ((V)object3).e((JioAdView$AdState)((Object)object4));
        object3 = InstreamVideo.access$getJioVideoView$p(instreamVideo);
        if (object3 != null) {
            object3 = ((s)object3).i0();
        } else {
            bl2 = false;
            object3 = null;
        }
        int n7 = 1;
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = 1;
        }
        if ((n7 ^= n4) != 0) {
            object5 = object3;
        }
        if (object5 != null) {
            object = object5;
        }
        ((V)InstreamVideo.access$getJioAdCallbacks$p(instreamVideo)).i((String)object);
    }

    public final void onAdPrepared(String object) {
        Object object2 = "adId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p((InstreamVideo)object);
        if (bl2) {
            object2 = new StringBuilder();
            object = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": returning from onAdPrepared as instream video is released");
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        bl2 = true;
        InstreamVideo.access$setAdPrepared$p((InstreamVideo)object, bl2);
        boolean bl3 = InstreamVideo.access$isAdPreparedCallbackGiven$p((InstreamVideo)object);
        if (!bl3) {
            Object object3 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a;
            bl3 = object3.o;
            if (bl3) {
                bl3 = InstreamVideo.access$isPodEnabledWithCount((InstreamVideo)object);
                if (bl3 && !(bl3 = InstreamVideo.access$isPodEnabledWithDuration((InstreamVideo)object)) && (object3 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)object)) != null && (bl3 = ((n)object3).j) == bl2) {
                    InstreamVideo.access$setAdPreparedCallbackGiven$p((InstreamVideo)object, bl2);
                    object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                    object3 = JioAdView$AdState.PREPARED;
                    object2 = (V)object2;
                    ((V)object2).e((JioAdView$AdState)((Object)object3));
                    object = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                    ((V)object).n();
                } else {
                    bl3 = InstreamVideo.access$isPodEnabledWithDuration((InstreamVideo)object);
                    if (bl3) {
                        InstreamVideo.access$setAdPreparedCallbackGiven$p((InstreamVideo)object, bl2);
                        object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                        object3 = JioAdView$AdState.PREPARED;
                        object2 = (V)object2;
                        ((V)object2).e((JioAdView$AdState)((Object)object3));
                        object = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                        ((V)object).n();
                    } else {
                        bl3 = InstreamVideo.access$isPodEnabledWithCount((InstreamVideo)object);
                        if (!bl3 && !(bl3 = InstreamVideo.access$isPodEnabledWithDuration((InstreamVideo)object))) {
                            InstreamVideo.access$setAdPreparedCallbackGiven$p((InstreamVideo)object, bl2);
                            object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                            object3 = JioAdView$AdState.PREPARED;
                            object2 = (V)object2;
                            ((V)object2).e((JioAdView$AdState)((Object)object3));
                            object = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                            ((V)object).n();
                        }
                    }
                }
            } else {
                InstreamVideo.access$setAdPreparedCallbackGiven$p((InstreamVideo)object, bl2);
                object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                object3 = JioAdView$AdState.PREPARED;
                object2 = (V)object2;
                ((V)object2).e((JioAdView$AdState)((Object)object3));
                object = (V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
                ((V)object).n();
            }
        }
    }

    public final void onAdProgress(String string2, long l2, long l3) {
        Object object = "adId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = InstreamVideo.access$getJioAdCallbacks$p(this.a);
        ((V)object).c(l3, string2, l2);
    }

    public final void onAdSkippable(String string2, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        ((V)InstreamVideo.access$getJioAdCallbacks$p(this.a)).p();
    }

    public final void onAdSkipped(int n3, int n4, Integer object) {
        InstreamVideo instreamVideo = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        if (bl2) {
            return;
        }
        Object object2 = InstreamVideo.access$getIJioAdViewController$p(instreamVideo);
        Object object3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        object2 = (f)object2;
        object2.getClass();
        Object object4 = "adspotId";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object2 = ((f)object2).a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object2 = ((o)object2).f;
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object4 = ((t)object2).a();
            boolean bl3 = ((HashMap)object4).containsKey(object3);
            if (bl3) {
                object4 = ((t)object2).a();
                ((HashMap)object4).remove(object3);
            }
            if (bl3 = ((HashMap)(object4 = ((t)object2).c())).containsKey(object3)) {
                object2 = ((t)object2).c();
                ((HashMap)object2).remove(object3);
            }
        }
        object2 = CompanionManager.Companion;
        object3 = ((CompanionManager$Companion)object2).getInstance();
        object4 = "";
        if (object3 != null) {
            Object object5 = InstreamVideo.access$getPrevPlayingAdId$p(instreamVideo);
            if (object5 == null) {
                object5 = object4;
            }
            ((CompanionManager)object3).doCloseCompanion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object5);
        }
        if ((object2 = ((CompanionManager$Companion)object2).getInstance()) != null) {
            object3 = InstreamVideo.access$getPrevPlayingAdId$p(instreamVideo);
            if (object3 != null) {
                object4 = object3;
            }
            ((CompanionManager)object2).removeCompanionCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object4);
        }
        object2 = new StringBuilder();
        object3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(": onAdSkipped servedDuration : ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(", totalDuration: ");
        ((StringBuilder)object2).append(n4);
        object3 = ", rewardSkipValue: ";
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        object2 = JioAdView$AdState.CLOSED;
        ((V)object).e((JioAdView$AdState)((Object)object2));
        object = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        bl2 = false;
        object2 = null;
        n3 = n3 == n4 ? 1 : 0;
        ((V)object).h(n3 != 0, false);
        InstreamVideo.access$releaseInstream(instreamVideo);
    }

    public final void onAdStarted(String object, int n3) {
        String string2 = "adId";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a;
        n3 = (int)(InstreamVideo.access$isInstreamVideoClassReleased$p((InstreamVideo)object) ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        ((V)InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object)).m();
        ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)object)).a.d0();
        InstreamVideo.access$startPodViewingTimer((InstreamVideo)object);
    }

    public final void onAllAdMediaProgress(long l2, long l3) {
        InstreamVideo instreamVideo = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        if (bl2) {
            return;
        }
        ((V)InstreamVideo.access$getJioAdCallbacks$p(instreamVideo)).b(l2, l3);
    }

    public final void onFailedToLoad(JioAdError jioAdError, boolean bl2, d d2, String string2, String string3, String string4) {
        d d5 = d.a;
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d5, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        com.jio.jioads.controller.a a2 = InstreamVideo.access$getJioAdCallbacks$p(this.a);
        String string5 = "InstreamVideo: ".concat(string3);
        ((V)a2).d(jioAdError, false, d5, string2, string5, string4, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onMediaPlaybackChange(com.jio.jioads.videomodule.b object) {
        block5: {
            block6: {
                String string2 = "type";
                Intrinsics.checkNotNullParameter(object, string2);
                int n3 = ((Enum)object).ordinal();
                if (n3 == 0) break block6;
                int n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        n4 = 3;
                        if (n3 != n4) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        object = JioAdView$MediaPlayBack.UNMUTE;
                        break block5;
                    } else {
                        object = JioAdView$MediaPlayBack.MUTE;
                    }
                    break block5;
                } else {
                    object = JioAdView$MediaPlayBack.PAUSE;
                }
                break block5;
            }
            object = JioAdView$MediaPlayBack.RESUME;
        }
        ((V)InstreamVideo.access$getJioAdCallbacks$p(this.a)).f((JioAdView$MediaPlayBack)((Object)object));
    }

    public final void onMediaPrepareTimeOut(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(object);
        if (bl2) {
            return;
        }
        Object object2 = JioAdError.Companion;
        Object object3 = JioAdError$JioAdErrorType.ERROR_TIMEOUT;
        JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), "Video Ad Timeout Error");
        object2 = InstreamVideo.access$getJioAdCallbacks$p(object);
        d d2 = d.a;
        object3 = new StringBuilder("JioVideoView-Player failed to prepare because of timeout for ads ");
        object = InstreamVideo.access$getIJioAdView$p(object).K();
        ((StringBuilder)object3).append(object);
        String string3 = ((StringBuilder)object3).toString();
        ((V)object2).d(jioAdError, false, d2, string2, "JioVideoView-adFailedToLoad", string3, null);
    }

    public final void onPlayAgain(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onPlayerError(int n3, String object) {
        InstreamVideo instreamVideo = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        if (bl2) {
            return;
        }
        Object object2 = new StringBuilder();
        Object object3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(": inside onPlayerError InstreamVideo: duration: ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(", campaign: ");
        object3 = "message";
        ir3_0.b((StringBuilder)object2, (String)object, (String)object3);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = InstreamVideo.access$getIJioAdView$p(instreamVideo).L();
        Object object5 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
        if (object4 == object5) {
            object4 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)instreamVideo)).a;
            boolean bl3 = ((o)object4).o;
            if (bl3) {
                Object object6 = new StringBuilder();
                object = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
                ((StringBuilder)object6).append((String)object);
                object = " onPlayerError fetching next ad for infinite pod";
                ((StringBuilder)object6).append((String)object);
                Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), (String)object3);
                object6 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                InstreamVideo.access$startFetchingAdsForInfinite(instreamVideo);
                return;
            }
        }
        object3 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)instreamVideo)).a;
        boolean bl4 = ((o)object3).o;
        object4 = "Player preparation failed";
        if (bl4 && n3 > 0 && (object3 = InstreamVideo.access$getJioVastParsingHelper$p(instreamVideo)) != null) {
            object3 = InstreamVideo.access$getJioVastParsingHelper$p(instreamVideo);
            Intrinsics.checkNotNull(object3);
            boolean bl5 = ((n)object3).F();
            if (bl5) {
                n3 = (int)(InstreamVideo.access$isAdPreparedCallbackGiven$p(instreamVideo) ? 1 : 0);
                if (n3 != 0) return;
                Object object7 = JioAdError.Companion;
                object = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
                JioAdError jioAdError = j_0.c((t_0)object7, (JioAdError$JioAdErrorType)((Object)object), (String)object4);
                object7 = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
                d d2 = d.a;
                object2 = "JioVideoView-Player failed to prepare because of Video ad retry limit reached: ";
                object = new StringBuilder((String)object2);
                JioAdView$AD_TYPE jioAdView$AD_TYPE = InstreamVideo.access$getIJioAdView$p(instreamVideo).K();
                ((StringBuilder)object).append((Object)jioAdView$AD_TYPE);
                String string2 = ((StringBuilder)object).toString();
                object5 = object7;
                object5 = (V)object7;
                Object var15_30 = null;
                String string3 = "onPlayerError";
                String string4 = "JioVideoView-adFailedToLoad";
                ((V)object5).d(jioAdError, false, d2, string3, string4, string2, null);
                return;
            }
            int n4 = InstreamVideo.access$isAdPreparedCallbackGiven$p(instreamVideo);
            object4 = "pgm";
            boolean bl6 = Intrinsics.areEqual(object, object4);
            if (bl6) {
                object = InstreamVideo.access$getJioVastParsingHelper$p(instreamVideo);
                if (object != null) {
                    ((n)object).o(n3);
                }
                Object object8 = InstreamVideo.access$getIJioAdViewController$p(instreamVideo);
                ((f)object8).a.I = bl6 = InstreamVideo.access$isAdPreparedCallbackGiven$p(instreamVideo) ^ true;
                object8 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)instreamVideo)).a;
                ((o)object8).c0();
            } else {
                bl6 = InstreamVideo.access$isAdPreparedCallbackGiven$p(instreamVideo);
                if (bl6 && (bl6 = InstreamVideo.access$isPGMQueuedInReq(instreamVideo, n4))) {
                    InstreamVideo.access$isPGMQueued(instreamVideo, n4);
                } else {
                    bl6 = InstreamVideo.access$isAdPreparedCallbackGiven$p(instreamVideo);
                    if ((bl6 || !(bl6 = InstreamVideo.access$isPGMQueuedInReq(instreamVideo, n4))) && (object = InstreamVideo.access$getJioVastParsingHelper$p(instreamVideo)) != null) {
                        object3 = ((f)((n)object).c).a;
                        boolean bl7 = ((o)object3).o;
                        if (bl7) {
                            boolean bl8 = ((n)object).F();
                            if (bl8) {
                                t_0 t_02 = JioAdError.Companion;
                                object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                object3 = "Retry limit reached";
                                object5 = j_0.c(t_02, (JioAdError$JioAdErrorType)((Object)object2), (String)object3);
                                object4 = ((n)object).d;
                                if (object4 != null) {
                                    d d5 = d.a;
                                    String string5 = "Retry limit reached";
                                    String string6 = "fetchNextAdOnError";
                                    String string7 = "JioVastParsingHelper2";
                                    object4.b((JioAdError)object5, d5, string6, string7, string5);
                                }
                            } else {
                                object3 = new StringBuilder();
                                object4 = ": fetchNextAdOnError";
                                j_0.j((n)object, (StringBuilder)object3, (String)object4);
                                object2 = ((JioAds$Companion)object2).getInstance();
                                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                ((n)object).o(n3);
                                Object object9 = ((n)object).E;
                                if (object9 != null) {
                                    bl2 = false;
                                    object2 = null;
                                    ((m)object9).f = false;
                                }
                                object9 = ((n)object).v();
                                ((n)object).q((String)object9);
                            }
                        }
                    }
                }
            }
            InstreamVideo.access$fireFillRateBeacon(instreamVideo);
            return;
        }
        Object object10 = ((f)InstreamVideo.access$getIJioAdViewController$p((InstreamVideo)instreamVideo)).a;
        n3 = (int)(((o)object10).o ? 1 : 0);
        if (n3 != 0) return;
        object10 = JioAdError.Companion;
        object = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
        JioAdError jioAdError = j_0.c((t_0)object10, (JioAdError$JioAdErrorType)((Object)object), (String)object4);
        object10 = InstreamVideo.access$getJioAdCallbacks$p(instreamVideo);
        d d7 = d.a;
        object = jioAdError.getErrorDescription();
        if (object == null) {
            object = "";
        }
        Object object11 = object;
        object5 = object10;
        object5 = (V)object10;
        String string8 = "onPlayerError";
        String string9 = "InstreamVideo";
        Object var15_31 = null;
        ((V)object5).d(jioAdError, false, d7, string8, string9, (String)object, null);
    }

    public final void onStartPrepare(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = new StringBuilder();
        String string2 = InstreamVideo.access$getIJioAdView$p(this.a).P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Instream onStartPrepare");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void playAgainFromMediaPlayer(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }
}

