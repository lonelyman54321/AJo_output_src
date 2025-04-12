/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.jio.jioads.native;

import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdController c;

    public o(NativeAdController nativeAdController) {
        this.c = nativeAdController;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object;
        Object object2 = this.c;
        ViewGroup viewGroup = NativeAdController.access$getAdContainer$p((NativeAdController)object2);
        if (viewGroup != null) {
            object = NativeAdController.access$getWebView$p((NativeAdController)object2);
            viewGroup.removeView((View)object);
        }
        if ((viewGroup = NativeAdController.access$getWebView$p((NativeAdController)object2)) != null && (object = (bl2 = (object = viewGroup.getParent()) instanceof ViewGroup) ? (ViewGroup)object : null) != null) {
            object.removeView((View)viewGroup);
        }
        if ((viewGroup = NativeAdController.access$getAdContainer$p((NativeAdController)object2)) != null) {
            viewGroup.removeAllViews();
        }
        if ((object2 = NativeAdController.access$getJioNativeAdView$p((NativeAdController)object2)) != null) {
            boolean bl3 = true;
            ((NativeAdViewRenderer)object2).setViewUpdate$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl3);
        }
        return Unit.a;
    }
}

