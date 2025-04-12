/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.jio.jioads.native;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.controller.f;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.util.Utility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

public final class q
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdController c;

    public q(NativeAdController nativeAdController) {
        this.c = nativeAdController;
        super(0);
    }

    public final Object invoke() {
        int n3;
        int n4 = 0;
        float f5 = 0.0f;
        Object object = null;
        int n7 = 1;
        NativeAdController nativeAdController = this.c;
        Object object2 = NativeAdController.access$getAdContainer$p(nativeAdController);
        if (object2 != null) {
            object2.removeAllViews();
        }
        object2 = NativeAdController.access$getIJioAdView$p(nativeAdController).y();
        Object object3 = Boolean.TRUE;
        Intrinsics.areEqual(object2, object3);
        object3 = NativeAdController.access$getIJioAdView$p(nativeAdController).Y();
        object2 = new RelativeLayout((Context)object3);
        object3 = (f)NativeAdController.access$getIJioAdViewController$p(nativeAdController);
        String string2 = "wh";
        object3 = ((f)object3).a(string2);
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object3 = ((f)NativeAdController.access$getIJioAdViewController$p(nativeAdController)).a(string2);
            Utility utility = Utility.INSTANCE;
            int n8 = 120;
            Object object4 = new char[n7];
            object4[0] = n8;
            object4 = (String)StringsKt.Z((CharSequence)object3, object4).get(0);
            float f6 = Float.parseFloat((String)object4);
            int n10 = utility.convertDpToPixel(f6);
            char[] cArray = new char[n7];
            cArray[0] = n8;
            object = (String)StringsKt.Z((CharSequence)object3, cArray).get(n7);
            f5 = Float.parseFloat((String)object);
            n4 = utility.convertDpToPixel(f5);
            string2 = new RelativeLayout.LayoutParams(n10, n4);
        } else {
            object = new StringBuilder();
            object3 = NativeAdController.access$getIJioAdView$p(nativeAdController).P();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(": setWebView: Vertical Ad so considering Device width and Height");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = Utility.INSTANCE;
            object3 = NativeAdController.access$getIJioAdView$p(nativeAdController).Y();
            object = ((Utility)object).getScreenHeightAndWidth((Context)object3);
            object3 = (String)tp_2.A((Object[])object);
            n3 = Integer.parseInt((String)object3);
            object = (String)tp_2.E(n7, (Object[])object);
            n4 = Integer.parseInt((String)object);
            string2 = new RelativeLayout.LayoutParams(n4, n3);
        }
        n4 = 13;
        f5 = 1.8E-44f;
        n7 = -1;
        string2.addRule(n4, n7);
        object2.setLayoutParams((ViewGroup.LayoutParams)string2);
        object = NativeAdController.access$getWebView$p(nativeAdController);
        object2.addView((View)object);
        object = NativeAdController.access$getAdContainer$p(nativeAdController);
        if (object != null) {
            object.addView((View)object2);
        }
        return Unit.a;
    }
}

