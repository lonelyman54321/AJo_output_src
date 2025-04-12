/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.interstitial.j;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import com.jio.jioads.utils.e;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.interstitial.C
 */
public final class c_0
implements o {
    public final /* synthetic */ InterstitialActivity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;

    public c_0(InterstitialActivity interstitialActivity, String string2, List list, List list2) {
        this.a = interstitialActivity;
        this.b = string2;
        this.c = list;
        this.d = list2;
    }

    public final void a(int n3, String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "description");
        Intrinsics.checkNotNullParameter(object2, "failingUrl");
        Object object3 = new StringBuilder();
        object = this.a;
        object2 = InterstitialActivity.access$getIJioAdView$p((InterstitialActivity)object);
        object2 = object2 != null ? object2.P() : null;
        j_0.k(object3, (String)object2, ": onReceivedError() InterstitialActivity");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = JioAdError.Companion;
        object2 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        String string2 = "HTML ad failed to load";
        JioAdError jioAdError = j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object2), string2);
        object3 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object);
        if (object3 != null) {
            d d2 = com.jio.jioads.cdnlogging.d.a;
            String string3 = object.getLocalClassName();
            object = "getLocalClassName(...)";
            Intrinsics.checkNotNullExpressionValue(string3, (String)object);
            Object object4 = object3;
            object4 = (V)object3;
            String string4 = "initWebView";
            String string5 = "HTML Ad failed to load";
            ((V)object4).d(jioAdError, false, d2, string4, string3, string5, null);
        }
    }

    public final void a(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        object = new StringBuilder();
        Object object2 = InterstitialActivity.access$getIJioAdView$p(this.a);
        object2 = object2 != null ? object2.P() : null;
        j_0.k((StringBuilder)object, (String)object2, ": onPageStarted() InterstitialActivity");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(Constants$AdTouchEvents object) {
        Intrinsics.checkNotNullParameter(object, "adTouchEvents");
        object = new StringBuilder();
        Object object2 = InterstitialActivity.access$getIJioAdView$p(this.a);
        object2 = object2 != null ? object2.P() : null;
        j_0.k((StringBuilder)object, (String)object2, ": Inside onAdTouch");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(String object) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "url");
        object = new StringBuilder();
        InterstitialActivity interstitialActivity = this.a;
        Object object2 = InterstitialActivity.access$getIJioAdView$p(interstitialActivity);
        if (object2 != null) {
            object2 = object2.P();
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object3 = ": onPageFinished() InterstitialActivity";
        j_0.k((StringBuilder)object, (String)object2, object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.b;
        if (object == null || (n4 = ((String)object).length()) == 0) {
            object2 = InterstitialActivity.access$getJioCallbacks$p(interstitialActivity);
            if (object2 != null) {
                object3 = JioAdView$AdState.STARTED;
                object2 = (V)object2;
                ((V)object2).e((JioAdView$AdState)((Object)object3));
            }
            if ((object2 = InterstitialActivity.access$getJioCallbacks$p(interstitialActivity)) != null) {
                object2 = (V)object2;
                object3 = "";
                ((V)object2).i((String)object3);
            }
            if ((object2 = InterstitialActivity.access$getIJioAdViewController$p(interstitialActivity)) != null) {
                object2 = ((f)object2).a;
                ((com.jio.jioads.controller.o)object2).d0();
            }
            InterstitialActivity.access$fireHTMLTracker(interstitialActivity);
            InterstitialActivity.access$fireViewableImpression(interstitialActivity);
            object2 = InterstitialActivity.access$getIJioAdViewController$p(interstitialActivity);
            if (object2 != null) {
                object3 = e.d(interstitialActivity.getHeaders());
                object2 = (f)object2;
                Intrinsics.checkNotNullParameter(object3, "campaignid");
                String string2 = "i";
                String string3 = "type";
                Intrinsics.checkNotNullParameter(string2, string3);
                object2 = ((f)object2).a;
                ((com.jio.jioads.controller.o)object2).v((String)object3, string2);
            }
        }
        if (object != null && (n3 = ((String)object).length()) != 0 && (object = this.d) != null && (n4 = (int)(object.isEmpty() ? 1 : 0)) == 0 && (object2 = InterstitialActivity.access$getJioVideoView$p(interstitialActivity)) != null && (object2 = ((s)object2).l0) != null) {
            ((y)object2).c((List)object);
        }
        if ((object = InterstitialActivity.access$getInterstitialType$p(interstitialActivity)) == (object2 = j.e) && (object = InterstitialActivity.access$getIntType$p(interstitialActivity)) == (object2 = j.d)) {
            object = InterstitialActivity.access$getIJioAdViewController$p(interstitialActivity);
            if (object != null) {
                object = (f)object;
                ((f)object).g();
            }
            if ((object = InterstitialActivity.access$getInStreamAudioRenderer$p(interstitialActivity)) != null) {
                ((com.jio.jioads.instream.audio.j)object).x();
            }
        }
        InterstitialActivity.access$initializeHtmlCloseElements(interstitialActivity);
        InterstitialActivity.access$initCloseBtn(interstitialActivity);
    }

    public final void onAdClick() {
        int n3;
        Object object;
        boolean bl2;
        Object object2 = new StringBuilder();
        Object object3 = this.a;
        Object object4 = InterstitialActivity.access$getIJioAdView$p((InterstitialActivity)object3);
        if (object4 != null) {
            object4 = object4.P();
        } else {
            bl2 = false;
            object4 = null;
        }
        String string2 = ": onAdClick() InterstitialActivity";
        j_0.k((StringBuilder)object2, (String)object4, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = InterstitialActivity.access$getIJioAdViewController$p((InterstitialActivity)object3);
        if (object2 != null) {
            object4 = e.d(((InterstitialActivity)object3).getHeaders());
            object2 = (f)object2;
            Intrinsics.checkNotNullParameter(object4, "campaignid");
            string2 = "c";
            object = "type";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object2 = ((f)object2).a;
            ((com.jio.jioads.controller.o)object2).v((String)object4, string2);
        }
        if ((object2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object3)) != null) {
            object4 = JioAdView$AdState.INTERACTED;
            object2 = (V)object2;
            ((V)object2).e((JioAdView$AdState)((Object)object4));
        }
        if ((object2 = InterstitialActivity.access$getJioCallbacks$p((InterstitialActivity)object3)) != null) {
            object2 = (V)object2;
            ((V)object2).a();
        }
        if ((object2 = this.b) != null && (n3 = ((String)object2).length()) != 0 && (object2 = this.c) != null && !(bl2 = object2.isEmpty()) && (object3 = InterstitialActivity.access$getJioVideoView$p((InterstitialActivity)object3)) != null && (object3 = ((s)object3).l0) != null) {
            int n4 = yx_2.o((Iterable)object2, 10);
            object4 = new ArrayList(n4);
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                string2 = (String)object2.next();
                object = new a(string2);
                ((ArrayList)object4).add(object);
            }
            ((y)object3).b((List)object4);
        }
    }
}

