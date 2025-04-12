/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.jio.jioads.instream.audio;

import android.view.View;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.m;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements o {
    public final /* synthetic */ j a;

    public e(j j3) {
        this.a = j3;
    }

    public final void a(int n3, String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "description");
        Intrinsics.checkNotNullParameter(object2, "failingUrl");
        j j3 = this.a;
        object2 = j3.b.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        if (object2 != object3) {
            object2 = new StringBuilder();
            object3 = j3.b.P();
            ((StringBuilder)object2).append((String)object3);
            object3 = ": ";
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": while showing companion ad so showing default companion ad");
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = j3.i;
            if (object != null) {
                object.removeAllViews();
            }
            object = null;
            j3.F = null;
            j3.s();
        }
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void b(Constants$AdTouchEvents object) {
        Intrinsics.checkNotNullParameter(object, "adTouchEvents");
        object = new StringBuilder();
        j_0.i(this.a.b, (StringBuilder)object, " :Inside onAdTouch");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        object = this.a;
        Object object2 = ((j)object).b.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        if (object2 != object3) {
            int n3;
            object2 = new StringBuilder();
            object3 = ((j)object).b;
            String string2 = ": companion ad loaded successfully";
            j_0.i((b)object3, (StringBuilder)object2, string2);
            object2 = JioAds.Companion;
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = ((j)object).i;
            if (object3 != null) {
                object3.removeAllViews();
            }
            if ((object3 = ((j)object).F) != null) {
                object2 = ((j)object).i;
                if (object2 != null) {
                    object3 = ((j)object).N;
                    object2.addView((View)object3);
                }
                ((f)((j)object).c).g();
                object2 = ((j)object).N;
                object3 = null;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                ((j)object).O = n3 = 1;
                ((j)object).n();
                object2 = ((j)object).k;
                if (object2 != null) {
                    Intrinsics.checkNotNull(object2);
                    object2.setVisibility(0);
                }
            } else {
                object3 = "jioWebViewController is null....";
                string2 = "message";
                v12.a((String)object3, string2, (JioAds$Companion)object2);
                object2 = ((j)object).i;
                if (object2 != null) {
                    object2.removeAllViews();
                }
                n3 = 0;
                object2 = null;
                ((j)object).F = null;
                ((j)object).s();
            }
            n3 = ((j)object).u;
            ((j)object).k(n3);
        }
    }

    public final void onAdClick() {
        Object object = this.a;
        Object object2 = ((j)object).E;
        Object object3 = ((j)object).b;
        if (object2 != null && (object2 = ((com.jio.jioads.instreamads.vastparser.model.b)object2).i) != null) {
            Object object4;
            int n3 = yx_2.o((Iterable)object2, 10);
            ArrayList<String> arrayList = new ArrayList<String>(n3);
            object2 = object2.iterator();
            while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object4 = ((a)object2.next()).a;
                arrayList.add((String)object4);
            }
            object2 = m.a((b)object3, ": EVENT_CLICK fired Companion Click tracking adId: ");
            object3 = ((j)object).o();
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            object3 = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = ((j)object).z.getValue();
            object4 = object2;
            object4 = (JioEventTracker)object2;
            JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents = JioEventTracker$TrackingEvents.EVENT_CLICK;
            Object object5 = object2;
            object2 = new ArrayList(arrayList);
            boolean bl2 = ((f)((j)object).c).a.a();
            String string2 = ((j)object).M;
            object2 = null;
            Integer n4 = 0;
            b b2 = ((j)object).b;
            boolean bl3 = true;
            String string3 = "";
            int n7 = 10;
            int n8 = 229376;
            JioEventTracker.fireEvents$default((JioEventTracker)object4, jioEventTracker$TrackingEvents, b2, (List)object5, n4, null, bl3, false, string3, false, null, null, null, bl2, n7, string2, null, null, null, n8, null);
        } else {
            com.jio.jioads.audioplayer.b.a((b)object3, ": click tracking url not found for selected companion ad!");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }
}

