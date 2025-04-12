/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.interstitial;

import android.text.TextUtils;
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
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.utils.e;
import com.jio.jioads.videomodule.b;
import com.jio.jioads.videomodule.callback.a;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class InterstitialActivity$a
implements a {
    public final /* synthetic */ InterstitialActivity a;

    public InterstitialActivity$a(InterstitialActivity interstitialActivity) {
        this.a = interstitialActivity;
    }

    public final boolean canPrepareNextVideoAd(int n3) {
        return true;
    }

    public final int getBitRate() {
        int n3;
        Object object = InterstitialActivity.access$getIJioAdView$p(this.a);
        if (object != null && (object = object.B()) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final void onAdChange(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        InterstitialActivity.access$setPrevPlayingAdId$p(this.a, string2);
    }

    public final void onAdClick() {
        Object object = this.a;
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (a2 != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.INTERACTED;
            a2 = (V)a2;
            ((V)a2).e(jioAdView$AdState);
        }
        if ((object = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object)) != null) {
            object = (V)object;
            ((V)object).a();
        }
    }

    public final void onAdCollapsed() {
        Object object = this.a;
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (a2 != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.COLLAPSED;
            a2 = (V)a2;
            ((V)a2).e(jioAdView$AdState);
        }
        if ((object = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object)) != null) {
            object = (V)object;
            ((V)object).j();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onAdComplete(String object, int n3, int n4, int n7, Integer n8) {
        int n10;
        InterstitialActivity interstitialActivity;
        block18: {
            block16: {
                Object object2;
                Boolean bl2;
                block17: {
                    n3 = 1;
                    Intrinsics.checkNotNullParameter(object, "adId");
                    object = new StringBuilder();
                    interstitialActivity = this.a;
                    Object object3 = InterstitialActivity.access$getIJioAdView$p(interstitialActivity);
                    bl2 = null;
                    object3 = object3 != null ? object3.P() : null;
                    ((StringBuilder)object).append((String)object3);
                    ((StringBuilder)object).append(": onAdComplete servedDuration : ");
                    ((StringBuilder)object).append(n4);
                    ((StringBuilder)object).append(", totalDuration: ");
                    ((StringBuilder)object).append(n7);
                    ((StringBuilder)object).append(", rewardSkipValue: ");
                    ((StringBuilder)object).append(n8);
                    object = ((StringBuilder)object).toString();
                    object3 = "message";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    interstitialActivity.allowBackPress();
                    object = InterstitialActivity.access$getJioCallbacks$p(interstitialActivity);
                    if (object != null) {
                        object = (V)object;
                        ((V)object).l();
                    }
                    object = n7;
                    InterstitialActivity.access$setTotalDuration$p(interstitialActivity, (Integer)object);
                    object = n4;
                    InterstitialActivity.access$setServedDuration$p(interstitialActivity, (Integer)object);
                    InterstitialActivity.access$setRewardSkipValue$p(interstitialActivity, n8);
                    object = InterstitialActivity.access$getJioVideoView$p(interstitialActivity);
                    if (object != null) {
                        object = ((s)object).O;
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (object == null) break block16;
                    object = InterstitialActivity.access$getJioVideoView$p(interstitialActivity);
                    if (object != null) {
                        object = ((s)object).O;
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (object == null || (n10 = (int)(object.isEmpty() ? 1 : 0)) != 0 || (object = InterstitialActivity.access$getInterstitialVastDataModel$p(interstitialActivity)) == null) break block16;
                    object = InterstitialActivity.access$getInterstitialVastDataModel$p(interstitialActivity);
                    if (object != null && (object = ((m)object).a) != null) {
                        object2 = InterstitialActivity.access$getCurrentVideoAdId(interstitialActivity);
                        object = (String)((n)object).n.get(object2);
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (object != null) break block17;
                    object = InterstitialActivity.access$getInterstitialVastDataModel$p(interstitialActivity);
                    if (object != null && (object = ((m)object).a) != null) {
                        object2 = InterstitialActivity.access$getCurrentVideoAdId(interstitialActivity);
                        object = (String)((n)object).m.get(object2);
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (object == null) break block16;
                }
                if ((object = InterstitialActivity.access$getInterstitialVastDataModel$p(interstitialActivity)) != null && (object = ((m)object).a) != null) {
                    object2 = ((n)object).m;
                    n4 = ((HashMap)object2).isEmpty() ^ n3;
                    if (n4 == 0 && (n10 = ((HashMap)(object = ((n)object).n)).isEmpty() ^ n3) == 0) {
                        n10 = 0;
                        object = null;
                    } else {
                        n10 = 1;
                    }
                    bl2 = n10 != 0;
                }
                if ((n10 = (int)(Intrinsics.areEqual(bl2, object = Boolean.FALSE) ? 1 : 0)) != 0) {
                    InterstitialActivity.access$handleClose(interstitialActivity);
                    break block18;
                } else {
                    object = InterstitialActivity.access$getInterstitialCompanionAd(interstitialActivity);
                    object2 = InterstitialActivity.access$getInterstitialCompanionTrackingUrls(interstitialActivity);
                    List list = (List)((Pair)object2).a;
                    object2 = (List)((Pair)object2).b;
                    boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                    if (!bl3) {
                        InterstitialActivity.access$showEndCard(interstitialActivity, (String)object, list, (List)object2);
                    }
                }
                break block18;
            }
            InterstitialActivity.access$handleClose(interstitialActivity);
        }
        n10 = InterstitialActivity.access$getMSkipDelay$p(interstitialActivity);
        n4 = -1;
        if (n10 == n4) {
            InterstitialActivity.access$handleClose(interstitialActivity);
        }
        interstitialActivity.allowBackPress();
        object = new uf3_2(interstitialActivity, n3);
        com.jio.jioads.util.s.b(200L, (Function0)object);
    }

    public final void onAdExpand() {
        Object object = this.a;
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (a2 != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
            a2 = (V)a2;
            ((V)a2).e(jioAdView$AdState);
        }
        if ((object = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object)) != null) {
            object = (V)object;
            ((V)object).k();
        }
    }

    public final void onAdLoaded(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (a2 != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.STARTED;
            a2 = (V)a2;
            ((V)a2).e(jioAdView$AdState);
        }
        if ((a2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object)) != null) {
            int n4 = e.b(((InterstitialActivity)object).getHeaders());
            object = ((Object)n4).toString();
            a2 = (V)a2;
            ((V)a2).i((String)object);
        }
    }

    public final void onAdPrepared(String string2) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdProgress(String string2, long l2, long l3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p(this.a);
        if (a2 != null) {
            com.jio.jioads.controller.a a3 = a2;
            a3 = (V)a2;
            ((V)a3).c(l3, string2, l2);
        }
    }

    public final void onAdSkippable(String object, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        Object object2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (object2 != null) {
            object2 = (V)object2;
            ((V)object2).p();
        }
        object2 = n7;
        InterstitialActivity.access$setTotalDuration$p((InterstitialActivity)object, (Integer)object2);
        object2 = n4;
        InterstitialActivity.access$setServedDuration$p((InterstitialActivity)object, (Integer)object2);
        InterstitialActivity.access$setRewardSkipValue$p((InterstitialActivity)object, n8);
        ((InterstitialActivity)object).allowBackPress();
    }

    public final void onAdSkipped(int n3, int n4, Integer n7) {
        Object object;
        InterstitialActivity interstitialActivity = this.a;
        Object object2 = InterstitialActivity.access$getJioCallbacks$p(interstitialActivity);
        if (object2 != null) {
            object = JioAdView$AdState.CLOSED;
            object2 = (V)object2;
            ((V)object2).e((JioAdView$AdState)((Object)object));
        }
        object2 = new StringBuilder();
        object = InterstitialActivity.access$getIJioAdView$p(interstitialActivity);
        object = object != null ? object.P() : null;
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(": onAdClose servedDuration : ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(", totalDuration: ");
        ((StringBuilder)object2).append(n4);
        ((StringBuilder)object2).append(", rewardSkipValue: ");
        ((StringBuilder)object2).append(n7);
        object2 = ((StringBuilder)object2).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = InterstitialActivity.Companion;
        object2.getClass();
        boolean bl2 = InterstitialActivity.access$isActivityRunning$cp();
        if (bl2) {
            Integer n8 = n4;
            Integer n10 = n3;
            interstitialActivity.closeAd(n8, n10, n7);
        }
    }

    public final void onAdStarted(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (a2 != null) {
            a2 = (V)a2;
            ((V)a2).m();
        }
        if ((object = InterstitialActivity.access$getIJioAdViewController$p((InterstitialActivity)object)) != null) {
            object = ((f)object).a;
            ((o)object).d0();
        }
    }

    public final void onAllAdMediaProgress(long l2, long l3) {
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p(this.a);
        if (a2 != null) {
            a2 = (V)a2;
            ((V)a2).b(l2, l3);
        }
    }

    public final void onFailedToLoad(JioAdError jioAdError, boolean bl2, d object, String string2, String string3, String string4) {
        d d2 = d.a;
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        com.jio.jioads.controller.a a2 = InterstitialActivity.access$getJioCallbacks$p(this.a);
        if (a2 != null) {
            object = "InstreamVideo: ";
            String string5 = ((String)object).concat(string3);
            com.jio.jioads.controller.a a3 = a2;
            a3 = (V)a2;
            ((V)a3).d(jioAdError, false, d2, string2, string5, string4, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onMediaPlaybackChange(b object) {
        Object object2;
        block6: {
            block7: {
                object2 = "type";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                int n3 = ((Enum)object).ordinal();
                if (n3 == 0) break block7;
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
                        break block6;
                    } else {
                        object = JioAdView$MediaPlayBack.MUTE;
                    }
                    break block6;
                } else {
                    object = JioAdView$MediaPlayBack.PAUSE;
                }
                break block6;
            }
            object = JioAdView$MediaPlayBack.RESUME;
        }
        object2 = InterstitialActivity.access$getJioCallbacks$p(this.a);
        if (object2 != null) {
            object2 = (V)object2;
            ((V)object2).f((JioAdView$MediaPlayBack)((Object)object));
        }
    }

    public final void onMediaPrepareTimeOut(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object = JioAdError.Companion;
        Object object2 = JioAdError$JioAdErrorType.ERROR_TIMEOUT;
        CharSequence charSequence = "Video Ad Timeout Error";
        JioAdError jioAdError = j_0.c((t_0)object, object2, (String)charSequence);
        object = this.a;
        object2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (object2 != null) {
            d d2 = d.a;
            Object object3 = "JioVideoView-Player failed to prepare because of timeout for ads ";
            charSequence = new StringBuilder((String)object3);
            object = (object = InterstitialActivity.access$getIJioAdView$p((InterstitialActivity)object)) != null ? object.K() : null;
            ((StringBuilder)charSequence).append(object);
            String string3 = ((StringBuilder)charSequence).toString();
            object3 = object2;
            object3 = (V)object2;
            String string4 = "JioVideoView-adFailedToLoad";
            ((V)object3).d(jioAdError, false, d2, string2, string4, string3, null);
        }
    }

    public final void onPlayAgain(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onPlayerError(int n3, String string2) {
    }

    public final void onStartPrepare(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void playAgainFromMediaPlayer(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }
}

