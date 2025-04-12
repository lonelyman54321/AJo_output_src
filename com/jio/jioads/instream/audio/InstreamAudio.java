/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.media.AudioManager
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.jio.jioads.instream.audio;

import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.d;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.instream.audio.k;
import com.jio.jioads.instream.audio.l;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InstreamAudio
extends d {
    public ViewGroup a;
    public final a b;
    public final b c;
    public final c d;
    public n e;
    public j f;
    public ViewGroup g;
    public Integer h;
    public Integer i;
    public Drawable j;
    public Drawable k;
    public final rq1_2 l;

    public InstreamAudio(ViewGroup object, a a2, b b2, c c2) {
        Intrinsics.checkNotNullParameter(a2, "jioAdCallbacks");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        super(a2, b2, c2);
        this.a = object;
        this.b = a2;
        this.c = b2;
        this.d = c2;
        object = yr1_2.b(com.jio.jioads.instream.audio.k.c);
        this.l = object;
        System.out.println((Object)"inside InstreamAudio");
    }

    public static final /* synthetic */ ViewGroup access$getContainer$p(InstreamAudio instreamAudio) {
        return instreamAudio.g;
    }

    public static final HashMap access$getHeaders(InstreamAudio instreamAudio) {
        return (HashMap)instreamAudio.l.getValue();
    }

    public static final /* synthetic */ b access$getIJioAdView$p(InstreamAudio instreamAudio) {
        return instreamAudio.c;
    }

    public static final /* synthetic */ c access$getIJioAdViewController$p(InstreamAudio instreamAudio) {
        return instreamAudio.d;
    }

    public static final /* synthetic */ a access$getJioAdCallbacks$p(InstreamAudio instreamAudio) {
        return instreamAudio.b;
    }

    public static final /* synthetic */ Drawable access$getLandScapeImage$p(InstreamAudio instreamAudio) {
        return instreamAudio.k;
    }

    public static final /* synthetic */ Drawable access$getPortraitImage$p(InstreamAudio instreamAudio) {
        return instreamAudio.j;
    }

    public static final /* synthetic */ Integer access$getToInt$p(InstreamAudio instreamAudio) {
        return instreamAudio.h;
    }

    public static final /* synthetic */ Integer access$getToInt1$p(InstreamAudio instreamAudio) {
        return instreamAudio.i;
    }

    public static final /* synthetic */ void access$setJioVastParsingHelper$p(InstreamAudio instreamAudio, n n3) {
        instreamAudio.e = n3;
    }

    public void forceCloseAd() {
        super.forceCloseAd();
        Object object = new StringBuilder();
        b b2 = this.c;
        String string2 = ": inside forceCloseAd() InstreamAudio";
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.f;
        if (object != null) {
            ((j)object).t();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Integer getAudioCurrentPosition() {
        int n3;
        Object object = this.f;
        if (object == null) return super.getAudioCurrentPosition();
        object = ((j)object).m;
        if (object != null) {
            n3 = object.getCurrentPosition();
            return n3;
        }
        n3 = 0;
        object = null;
        return n3;
    }

    public final j getInStreamAudioRenderer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.f;
    }

    public void onAdDataUpdate(String object, Map object2) {
        int n3;
        Object object3 = new StringBuilder();
        Object object4 = this.c;
        Object object5 = ": InstreamAudio onAdDataUpdate";
        j_0.i((b)object4, (StringBuilder)object3, (String)object5);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            object = new StringBuilder();
            com.jio.jioads.common.l.a(this.c, (StringBuilder)object, ": No ads in inventory", (JioAds$Companion)object3);
            object = JioAdError.Companion;
            object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object5 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), "No ads in inventory");
            object = this.b;
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            object4 = object;
            ((V)object).d((JioAdError)object5, false, d2, "onAdDataUpdate", "InstreamVideo", "No ads in inventory", null);
            return;
        }
        object4 = this.c;
        n4 = object4.W();
        if (n4 == (n3 = 1)) {
            ((HashMap)this.l.getValue()).clear();
            object4 = (HashMap)this.l.getValue();
            if (object2 == null) {
                object2 = fh1_2.f();
            }
            ((HashMap)object4).putAll(object2);
            object2 = new StringBuilder();
            object4 = this.c;
            object5 = ": inside startAudioProcessing";
            com.jio.jioads.common.l.a((b)object4, (StringBuilder)object2, (String)object5, (JioAds$Companion)object3);
            object2 = this.b;
            object3 = JioAdView$AdState.RECEIVED;
            ((V)object2).e((JioAdView$AdState)((Object)object3));
            ((V)this.b).o();
            object2 = this.e;
            if (object2 == null) {
                object4 = object2 = this.l.getValue();
                object4 = (HashMap)object2;
                object5 = this.c;
                c c2 = this.d;
                a a2 = this.b;
                l l2 = new l(this);
                object3 = object2;
                this.e = object2 = new n((HashMap)object4, (b)object5, c2, l2, a2);
                object3 = new Object();
                ((n)object2).l = object3;
            }
            if ((object2 = this.e) != null) {
                ((n)object2).u((String)object);
            }
            return;
        }
        object = JioAdError.Companion;
        object2 = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE;
        object5 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), "Mismatch Ad Type");
        object = this.b;
        com.jio.jioads.cdnlogging.d d5 = com.jio.jioads.cdnlogging.d.a;
        object4 = object;
        ((V)object).d((JioAdError)object5, false, d5, "onAdDataUpdate", "InstreamVideo", "Mismatch Ad Type", null);
    }

    public void onCacheAd() {
    }

    public void onCacheMediationAd(JSONObject jSONObject, String string2, Map map2) {
    }

    public void onDestroy() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("onDestroy ad", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.f;
        if (object != null) {
            ((j)object).t();
        }
    }

    public View onShowAdView() {
        Object object;
        Object object2 = this.c.K();
        if (object2 != null && (object2 = this.c.K()) == (object = JioAdView$AD_TYPE.INSTREAM_AUDIO) || (object2 = this.c.K()) == (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
            int n3;
            Object object3;
            object2 = new StringBuilder();
            j_0.i(this.c, (StringBuilder)object2, ": Loading InStream audio ad");
            object2 = JioAds.Companion;
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.c.Y();
            int n4 = 0;
            Object object4 = null;
            if (object != null) {
                object3 = "audio";
                object = object.getSystemService((String)object3);
            } else {
                n3 = 0;
                object = null;
            }
            boolean bl2 = object instanceof AudioManager;
            if (bl2) {
                object = (AudioManager)object;
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                n4 = 3;
                n3 = object.getStreamVolume(n4);
                object4 = n3;
            }
            object = new StringBuilder();
            object3 = this.c.P();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(": current device Volume: ");
            ((StringBuilder)object).append(object4);
            object = ((StringBuilder)object).toString();
            object3 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object4 != null && (n3 = ((Integer)object4).intValue()) > 0) {
                object2 = this.f;
                if (object2 != null) {
                    ((j)object2).x();
                }
            } else {
                v12.a("device volume is zero.So can't show audio ad", (String)object3, (JioAds$Companion)object2);
                object2 = JioAdError.Companion;
                object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                object4 = "Device volume is zero so can not show Audio Ad";
                JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object), (String)object4);
                ((f)this.d).g();
                object2 = this.b;
                com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                object3 = object2;
                object3 = (V)object2;
                String string2 = "showInstreamAudioAd";
                String string3 = "InStremAudio";
                String string4 = "Device volume is zero so can not show Audio Ad";
                ((V)object3).d(jioAdError, false, d2, string2, string3, string4, null);
            }
        }
        return this.a;
    }

    public void pauseAd(boolean bl2) {
        j j3;
        if (bl2 && (j3 = this.f) != null) {
            j3.g();
        }
    }

    public void resumeAd(boolean bl2) {
        Object object;
        if (bl2 && (object = this.f) != null) {
            boolean bl3;
            boolean bl4;
            Object object2 = ((j)object).m;
            if (object2 == null || (bl4 = object2.isPlaying()) != (bl3 = true)) {
                object2 = JioEventTracker$TrackingEvents.EVENT_RESUME;
                String string2 = ((j)object).o();
                ((j)object).i(string2, (JioEventTracker$TrackingEvents)((Object)object2));
            }
            bl4 = ((j)object).r();
            if (!bl4 && (object = ((j)object).m) != null) {
                object.start();
            }
        }
    }

    public void setAudioCompanionContainer(ViewGroup object, int n3, int n4, Drawable drawable2, Drawable drawable3) {
        super.setAudioCompanionContainer((ViewGroup)object, n3, n4, drawable2, drawable3);
        Object object2 = new StringBuilder();
        String string2 = this.c.P();
        object2.append(string2);
        object2.append(": value of container setAudioCompanionContainer : ");
        object2.append(object);
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        this.g = object;
        object = n3;
        this.h = object;
        object = n4;
        this.i = object;
        this.j = drawable2;
        this.k = drawable3;
    }

    public final void setInStreamAudioRenderer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(j j3) {
        this.f = j3;
    }

    public void setParentContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        this.a = viewGroup;
    }
}

