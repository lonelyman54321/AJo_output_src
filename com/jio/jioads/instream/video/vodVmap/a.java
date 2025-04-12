/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video.vodVmap;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instream.video.vodVmap.i;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.videomodule.b;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements com.jio.jioads.videomodule.callback.a {
    public final /* synthetic */ m a;

    public a(m m2) {
        this.a = m2;
    }

    public final boolean canPrepareNextVideoAd(int n3) {
        return true;
    }

    public final int getBitRate() {
        return 0;
    }

    public final void onAdChange(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdClick() {
    }

    public final void onAdCollapsed() {
    }

    public final void onAdComplete(String object, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        Object object2 = ((m)object).b;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.ENDED;
        ((V)object2).e(jioAdView$AdState);
        Intrinsics.checkNotNullParameter("vmap: onAdComplete called", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        ((m)object).c();
    }

    public final void onAdExpand() {
        m m2 = this.a;
        com.jio.jioads.controller.a a2 = m2.b;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
        ((V)a2).e(jioAdView$AdState);
        ((V)m2.b).k();
    }

    public final void onAdLoaded(String object, int n3) {
        Object object2 = "adId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a.d;
        if (object != null) {
            JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.AD_BREAK_STARTED;
            object2 = new JioAdEvent(jioAdEvent$AdEventType);
            jioAdEvent$AdEventType = null;
            object.onJioVmapEvent((JioAdEvent)object2, null);
        }
    }

    public final void onAdPrepared(String object) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = this.a;
        Object object2 = ((m)object).b;
        Object object3 = JioAdView$AdState.PREPARED;
        ((V)object2).e((JioAdView$AdState)((Object)object3));
        object2 = ((m)object).d;
        if (object2 != null) {
            Object object4 = "message";
            Intrinsics.checkNotNullParameter("vmap: AD_BREAK_READY called", object4);
            object3 = JioAds.Companion;
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object5 = JioAds$LogLevel.NONE;
            Intrinsics.checkNotNull(object2);
            JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.AD_BREAK_READY;
            object5 = new JioAdEvent(jioAdEvent$AdEventType);
            jioAdEvent$AdEventType = null;
            object2.onJioVmapEvent((JioAdEvent)object5, null);
            boolean bl2 = ((m)object).t;
            if (bl2) {
                object5 = "vmap: missed cue ad prepared";
                Intrinsics.checkNotNullParameter(object5, object4);
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object2);
                object4 = JioAdEvent$AdEventType.CONTENT_PAUSE_REQUESTED;
                object3 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object4));
                object4 = ((m)object).w;
                object2.onJioVmapEvent((JioAdEvent)object3, (HashMap)object4);
                object2 = null;
                ((m)object).t = false;
            }
        }
    }

    public final void onAdProgress(String string2, long l2, long l3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdSkippable(String string2, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdSkipped(int n3, int n4, Integer n7) {
        Intrinsics.checkNotNullParameter("vmap: onAdSkipped called", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.a.c();
    }

    public final void onAdStarted(String object, int n3) {
        Object object2 = "adId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a;
        n3 = ((m)object).k;
        int n4 = 1;
        ((m)object).k = n3 += n4;
        n3 = (int)(((m)object).x ? 1 : 0);
        if (n3 != 0) {
            object = ((m)object).r;
            if (object != null) {
                ((s)object).h0().f = n4;
                object2 = ((s)object).X;
                if (object2 != null && (object = ((s)object).e0) != null) {
                    ((e)object).u();
                }
            }
        } else {
            object = ((m)object).r;
            if (object != null) {
                object2 = ((s)object).h0();
                n4 = 0;
                ((com.jio.jioads.videomodule.config.b)object2).f = false;
                object2 = ((s)object).X;
                if (object2 != null && (object = ((s)object).e0) != null) {
                    ((e)object).u();
                }
            }
        }
    }

    public final void onAllAdMediaProgress(long l2, long l3) {
    }

    public final void onFailedToLoad(JioAdError jioAdError, boolean bl2, d d2, String string2, String string3, String string4) {
        d d5 = d.a;
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d5, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
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
        ((V)this.a.b).f((JioAdView$MediaPlayBack)((Object)object));
    }

    public final void onMediaPrepareTimeOut(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object = JioAdError.Companion;
        Object object2 = JioAdError$JioAdErrorType.ERROR_VIDEO_TIMEOUT;
        Object object3 = "Timeout while fetching video ads";
        JioAdError jioAdError = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), object3);
        object = this.a;
        object2 = ((m)object).d;
        if (object2 != null) {
            object2.onJioVmapError(jioAdError);
        }
        d d2 = d.a;
        object2 = new StringBuilder("JioVideoView-Player failed to prepare because of timeout for ads ");
        object3 = ((m)object).a.K();
        ((StringBuilder)object2).append(object3);
        String string3 = ((StringBuilder)object2).toString();
        object = ((m)object).b;
        ((V)object).d(jioAdError, false, d2, string2, "JioVideoView-adFailedToLoad", string3, null);
    }

    public final void onPlayAgain(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onPlayerError(int n3, String object) {
        block10: {
            Object object2;
            Object object3;
            block9: {
                boolean bl2;
                JioAdView$AdState jioAdView$AdState;
                object3 = this.a;
                object = ((m)object3).a.k0();
                if (object == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
                    return;
                }
                object = ((m)object3).a.Y();
                jioAdView$AdState = null;
                if (object == null) break block9;
                object2 = ((m)object3).p;
                if (object2 != null) {
                    int n4;
                    Integer n7 = ((m)object3).a.B();
                    if (n7 != null) {
                        n4 = n7;
                    } else {
                        n4 = 0;
                        n7 = null;
                    }
                    i i3 = new i((m)object3);
                    object = ((com.jio.jioads.instreamads.vastparser.model.m)object2).e((Context)object, n4, i3);
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null && !(bl2 = object.isEmpty())) break block10;
            }
            if ((object3 = ((m)object3).d) != null) {
                object2 = JioAdEvent$AdEventType.AD_BREAK_ERROR;
                object = new JioAdEvent((JioAdEvent$AdEventType)((Object)object2));
                object3.onJioVmapEvent((JioAdEvent)object, null);
            }
        }
    }

    public final void onStartPrepare(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void playAgainFromMediaPlayer(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }
}

