/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.videomodule.b;
import com.jio.jioads.videomodule.callback.a;
import com.jio.jioads.videomodule.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class InterstitialAdController$a
implements a {
    public final /* synthetic */ InterstitialAdController a;

    public InterstitialAdController$a(InterstitialAdController interstitialAdController) {
        this.a = interstitialAdController;
    }

    public final boolean canPrepareNextVideoAd(int n3) {
        return true;
    }

    public final int getBitRate() {
        int n3;
        Integer n4 = this.a.getIJioAdView().B();
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        return n3;
    }

    public final void onAdChange(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdClick() {
        ((V)this.a.getJioAdCallbacks()).a();
    }

    public final void onAdCollapsed() {
        InterstitialAdController interstitialAdController = this.a;
        com.jio.jioads.controller.a a2 = interstitialAdController.getJioAdCallbacks();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.COLLAPSED;
        ((V)a2).e(jioAdView$AdState);
        ((V)interstitialAdController.getJioAdCallbacks()).j();
    }

    public final void onAdComplete(String object, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        Object object2 = ((InterstitialAdController)object).getJioAdCallbacks();
        Object object3 = JioAdView$AdState.CLOSED;
        ((V)object2).e((JioAdView$AdState)((Object)object3));
        object2 = new StringBuilder("onAdComplete servedDuration : ");
        ((StringBuilder)object2).append(n4);
        ((StringBuilder)object2).append(", totalDuration: ");
        ((StringBuilder)object2).append(n7);
        object3 = ", rewardSkipValue: ";
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(n8);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        ((V)((InterstitialAdController)object).getJioAdCallbacks()).l();
        object2 = ((InterstitialAdController)object).getJioAdCallbacks();
        n8 = null;
        n4 = n4 == n7 ? 1 : 0;
        ((V)object2).h(n4 != 0, false);
        InterstitialAdController.access$release((InterstitialAdController)object);
    }

    public final void onAdExpand() {
        InterstitialAdController interstitialAdController = this.a;
        com.jio.jioads.controller.a a2 = interstitialAdController.getJioAdCallbacks();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
        ((V)a2).e(jioAdView$AdState);
        ((V)interstitialAdController.getJioAdCallbacks()).k();
    }

    public final void onAdLoaded(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        com.jio.jioads.controller.a a2 = ((InterstitialAdController)object).getJioAdCallbacks();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.STARTED;
        ((V)a2).e(jioAdView$AdState);
        ((V)((InterstitialAdController)object).getJioAdCallbacks()).i("");
    }

    public final void onAdPrepared(String object) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        InterstitialAdController.access$setPreparedAd$p((InterstitialAdController)object, true);
        com.jio.jioads.controller.a a2 = ((InterstitialAdController)object).getJioAdCallbacks();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.PREPARED;
        ((V)a2).e(jioAdView$AdState);
        ((V)((InterstitialAdController)object).getJioAdCallbacks()).n();
    }

    public final void onAdProgress(String string2, long l2, long l3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdSkippable(String string2, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        ((V)this.a.getJioAdCallbacks()).p();
    }

    public final void onAdSkipped(int n3, int n4, Integer object) {
        InterstitialAdController interstitialAdController = this.a;
        Object object2 = interstitialAdController.getJioAdCallbacks();
        Object object3 = JioAdView$AdState.CLOSED;
        ((V)object2).e((JioAdView$AdState)((Object)object3));
        object2 = new StringBuilder("onAdSkipped servedDuration : ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(", totalDuration: ");
        ((StringBuilder)object2).append(n4);
        object3 = ", rewardSkipValue: ";
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = interstitialAdController.getJioAdCallbacks();
        object2 = null;
        n3 = n3 == n4 ? 1 : 0;
        ((V)object).h(n3 != 0, false);
        InterstitialAdController.access$release(interstitialAdController);
    }

    public final void onAdStarted(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        ((V)this.a.getJioAdCallbacks()).m();
    }

    public final void onAllAdMediaProgress(long l2, long l3) {
        ((V)this.a.getJioAdCallbacks()).b(l2, l3);
    }

    public final void onFailedToLoad(JioAdError jioAdError, boolean bl2, d d2, String string2, String string3, String string4) {
        d d5 = d.a;
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d5, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        com.jio.jioads.controller.a a2 = this.a.getJioAdCallbacks();
        String string5 = "InstreamVideo: ".concat(string3);
        ((V)a2).d(jioAdError, false, d5, string2, string5, string4, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onMediaPlaybackChange(b object) {
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
        ((V)this.a.getJioAdCallbacks()).f((JioAdView$MediaPlayBack)((Object)object));
    }

    public final void onMediaPrepareTimeOut(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object = JioAdError.Companion;
        Object object2 = JioAdError$JioAdErrorType.ERROR_TIMEOUT;
        JioAdError jioAdError = j_0.c((t_0)object, object2, "Video Ad Timeout Error");
        object = this.a;
        object2 = ((InterstitialAdController)object).getJioAdCallbacks();
        d d2 = d.a;
        StringBuilder stringBuilder = new StringBuilder("JioVideoView-Player failed to prepare because of timeout for ads ");
        object = ((InterstitialAdController)object).getIJioAdView().K();
        stringBuilder.append(object);
        String string3 = stringBuilder.toString();
        ((V)object2).d(jioAdError, false, d2, string2, "JioVideoView-adFailedToLoad", string3, null);
    }

    public final void onPlayAgain(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onPlayerError(int n3, String object) {
        Object object2 = JioAdError.Companion;
        object = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
        CharSequence charSequence = "Player preparation failed";
        JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object), (String)charSequence);
        object2 = this.a;
        object = InterstitialAdController.access$getJioVastParsingHelper$p((InterstitialAdController)object2);
        if (object != null) {
            ((n)object).t();
        }
        if ((object = InterstitialAdController.access$getJioVideoView$p((InterstitialAdController)object2)) != null) {
            ((s)object).u();
        }
        InterstitialAdController.access$setJioVideoView$p((InterstitialAdController)object2, null);
        object = ((InterstitialAdController)object2).getJioAdCallbacks();
        d d2 = d.a;
        charSequence = new StringBuilder("JioVideoView-Player failed to prepare because of Video ad retry limit reached: ");
        object2 = ((InterstitialAdController)object2).getIJioAdView().K();
        ((StringBuilder)charSequence).append(object2);
        String string2 = ((StringBuilder)charSequence).toString();
        ((V)object).d(jioAdError, false, d2, "onPlayerError", "InterstitialAdController-JioVideoView-adFailedToLoad", string2, null);
    }

    public final void onStartPrepare(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        Intrinsics.checkNotNullParameter("Interstitial onStartPrepare", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void playAgainFromMediaPlayer(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }
}

