/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebView
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.webkit.WebView;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioCompanionListener;
import com.jio.jioads.adinterfaces.Y;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.common.b;
import com.jio.jioads.companionads.f;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.interstitial.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Z
implements Runnable {
    public final /* synthetic */ JioAdView$JioAdCompanion a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ WebView f;
    public final /* synthetic */ b g;
    public final /* synthetic */ q_0 h;
    public final /* synthetic */ JioCompanionListener i;
    public final /* synthetic */ Ref$IntRef j;
    public final /* synthetic */ Ref$IntRef k;
    public final /* synthetic */ JioAdView l;

    public /* synthetic */ Z(JioAdView$JioAdCompanion jioAdView$JioAdCompanion, ArrayList arrayList, Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, Context context, WebView webView, b b2, q_0 q_02, JioCompanionListener jioCompanionListener, Ref$IntRef ref$IntRef2, Ref$IntRef ref$IntRef3, JioAdView jioAdView) {
        this.a = jioAdView$JioAdCompanion;
        this.b = arrayList;
        this.c = ref$IntRef;
        this.d = ref$ObjectRef;
        this.e = context;
        this.f = webView;
        this.g = b2;
        this.h = q_02;
        this.i = jioCompanionListener;
        this.j = ref$IntRef2;
        this.k = ref$IntRef3;
        this.l = jioAdView;
    }

    public final void run() {
        Z z5 = this;
        JioAdView$JioAdCompanion jioAdView$JioAdCompanion = this.a;
        Intrinsics.checkNotNullParameter(jioAdView$JioAdCompanion, "this$0");
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "$currentCompanionAdCount");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$clickTrackingList");
        Context context = this.e;
        Intrinsics.checkNotNullParameter(context, "$mcontext");
        WebView webView = this.f;
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Ref$IntRef ref$IntRef = this.j;
        Intrinsics.checkNotNullParameter(ref$IntRef, "$width");
        Ref$IntRef ref$IntRef2 = this.k;
        Intrinsics.checkNotNullParameter(ref$IntRef2, "$height");
        Object object3 = new StringBuilder();
        Object object4 = jioAdView$JioAdCompanion.getAdSlotId();
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append(": companion web view on main loop");
        object3 = ((StringBuilder)object3).toString();
        Object object5 = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = this.b;
        if (object4 != null) {
            int n3 = object4.isEmpty();
            int n4 = 1;
            if ((n3 ^= n4) == n4 && (n3 = ((ArrayList)object4).size()) > (n4 = ((Ref$IntRef)object).element)) {
                JioAdView jioAdView;
                Object object6;
                object4 = ((ArrayList)object4).get(n4);
                Object object7 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                Object object8 = object4;
                object8 = (f)object4;
                object4 = jioAdView$JioAdCompanion.getAdSlotId();
                int n7 = ((String)object4).length();
                if (n7 > 0) {
                    object4 = new StringBuilder();
                    object7 = jioAdView$JioAdCompanion.getAdSlotId();
                    ((StringBuilder)object4).append((String)object7);
                    ((StringBuilder)object4).append(": found companion web view on adslotid");
                    Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object5);
                    ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = ((f)object8).g;
                    object7 = jioAdView$JioAdCompanion.getAdSlotId();
                    object4 = (List)((HashMap)object4).get(object7);
                } else {
                    object4 = new StringBuilder();
                    object7 = jioAdView$JioAdCompanion.getAdSlotId();
                    ((StringBuilder)object4).append((String)object7);
                    ((StringBuilder)object4).append(": found companion web view on size ");
                    object7 = jioAdView$JioAdCompanion.getDisplaySize().getDynamicSize();
                    ((StringBuilder)object4).append((String)object7);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object5);
                    ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = ((f)object8).g;
                    object7 = jioAdView$JioAdCompanion.getDisplaySize().getDynamicSize();
                    object4 = (List)((HashMap)object4).get(object7);
                }
                ((Ref$ObjectRef)object2).element = object4;
                object7 = z5.h;
                JioCompanionListener jioCompanionListener = z5.i;
                JioAdView jioAdView2 = z5.l;
                object4 = object6;
                Object object9 = object3;
                object3 = object6;
                object6 = object8;
                String string2 = object5;
                object5 = jioAdView;
                jioAdView = jioAdView2;
                object8 = webView;
                object4 = new Y((Ref$ObjectRef)object2, (q_0)object7, (Ref$IntRef)object, jioAdView$JioAdCompanion, jioCompanionListener, ref$IntRef, (f)object6, ref$IntRef2, jioAdView2, webView);
                object4 = z5.g;
                ((x)object5)(context, webView, (o)object3, (b)object4);
                object3 = new StringBuilder("loadingCompanionData: ");
                object4 = object6;
                object2 = ((f)object6).c;
                object = object9;
                object7 = string2;
                d90_0.b((StringBuilder)object3, (String)object2, string2, (JioAds$Companion)object9);
                object3 = ((f)object6).c;
                if (object3 == null) {
                    object3 = "";
                }
                ((x)object5).c((String)object3);
            }
        }
    }
}

