/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.jio.jioads.adinterfaces;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.companionads.f;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Y
implements o {
    public Integer a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ q_0 c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ JioAdView$JioAdCompanion e;
    public final /* synthetic */ JioCompanionListener f;
    public final /* synthetic */ Ref$IntRef g;
    public final /* synthetic */ f h;
    public final /* synthetic */ Ref$IntRef i;
    public final /* synthetic */ JioAdView j;
    public final /* synthetic */ WebView k;

    public Y(Ref$ObjectRef ref$ObjectRef, q_0 q_02, Ref$IntRef ref$IntRef, JioAdView$JioAdCompanion jioAdView$JioAdCompanion, JioCompanionListener jioCompanionListener, Ref$IntRef ref$IntRef2, f f5, Ref$IntRef ref$IntRef3, JioAdView jioAdView, WebView webView) {
        this.b = ref$ObjectRef;
        this.c = q_02;
        this.d = ref$IntRef;
        this.e = jioAdView$JioAdCompanion;
        this.f = jioCompanionListener;
        this.g = ref$IntRef2;
        this.h = f5;
        this.i = ref$IntRef3;
        this.j = jioAdView;
        this.k = webView;
    }

    public final void a(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(string3, "failingUrl");
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void b(Constants$AdTouchEvents constants$AdTouchEvents) {
        Intrinsics.checkNotNullParameter((Object)constants$AdTouchEvents, "adTouchEvents");
    }

    public final void b(String object) {
        Object object2;
        float f5;
        Object object3;
        Object object4 = "url";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object = this.d;
        int n3 = ((Ref$IntRef)object).element;
        int n4 = 1;
        ((Ref$IntRef)object).element = n3 += n4;
        object = this.f;
        String string2 = "message";
        JioAdView$JioAdCompanion jioAdView$JioAdCompanion = this.e;
        if (n3 > n4) {
            object4 = new StringBuilder();
            object3 = jioAdView$JioAdCompanion.getAdSlotId();
            ((StringBuilder)object4).append((String)object3);
            object3 = ": firing companion change";
            ((StringBuilder)object4).append((String)object3);
            Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            if (object != null) {
                object.onCompanionChange(jioAdView$JioAdCompanion);
            }
        } else if (object != null) {
            object.onCompanionRender(jioAdView$JioAdCompanion);
        }
        object = this.h;
        n3 = ((f)object).e;
        object3 = this.g;
        ((Ref$IntRef)object3).element = n3;
        int n7 = -1;
        if (n3 == n7) {
            n3 = -1;
            f5 = 0.0f / 0.0f;
        } else {
            Utility utility = Utility.INSTANCE;
            f5 = n3;
            n3 = utility.convertDpToPixel(f5);
        }
        ((Ref$IntRef)object3).element = n3;
        int n8 = ((f)object).f;
        object4 = this.i;
        ((Ref$IntRef)object4).element = n8;
        if (n8 != n7) {
            object2 = Utility.INSTANCE;
            float f6 = n8;
            n7 = object2.convertDpToPixel(f6);
        }
        ((Ref$IntRef)object4).element = n7;
        n4 = ((Ref$IntRef)object3).element;
        n3 = ((Ref$IntRef)object4).element;
        object = new RelativeLayout.LayoutParams(n4, n3);
        object.addRule(17);
        n3 = 13;
        f5 = 1.8E-44f;
        object.addRule(n3);
        object4 = this.j;
        object3 = ((JioAdView)object4).getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = jioAdView$JioAdCompanion.getContainer();
        n4 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n4 != 0 && (object3 = ((JioAdView)object4).getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (object3 = ((JioAdView)object4).getCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null && (object3 = ((JioAdView)object4).getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            object3 = ((JioAdView)object4).getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Intrinsics.checkNotNull(object3);
            n4 = object3.getChildCount();
            if (n4 > 0) {
                object3 = ((JioAdView)object4).getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Intrinsics.checkNotNull(object3);
                n7 = 0;
                object2 = null;
                object3 = object3.getChildAt(0);
                ((JioAdView)object4).setCurrentChildView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((View)object3);
                ((JioAdView)object4).setCompanionDetached$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(false);
                ((JioAdView)object4).pauseAd();
            }
        }
        jioAdView$JioAdCompanion.getContainer().removeAllViews();
        object4 = jioAdView$JioAdCompanion.getContainer();
        object3 = this.k;
        object4.addView((View)object3, (ViewGroup.LayoutParams)object);
        object = new StringBuilder();
        object4 = jioAdView$JioAdCompanion.getAdSlotId();
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(": added companion on jioAdView");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void onAdClick() {
        Object object = this.a;
        Object object2 = this.b;
        Object object3 = (List)((Ref$ObjectRef)object2).element;
        Integer n3 = null;
        if (object3 != null) {
            int n4 = object3.hashCode();
            object3 = n4;
        } else {
            boolean bl2 = false;
            object3 = null;
        }
        int n7 = Intrinsics.areEqual(object, object3);
        if (n7 == 0) {
            object = (List)((Ref$ObjectRef)object2).element;
            if (object != null) {
                n7 = object.hashCode();
                n3 = n7;
            }
            this.a = n3;
            object = this.c;
            if (object != null) {
                object2 = (List)((Ref$ObjectRef)object2).element;
                object.b((List)object2);
            }
        }
    }
}

