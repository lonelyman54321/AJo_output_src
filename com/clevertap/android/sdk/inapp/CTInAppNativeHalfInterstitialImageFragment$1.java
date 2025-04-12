/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.CTInAppNotification;

class CTInAppNativeHalfInterstitialImageFragment$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ CloseImageView a;
    public final /* synthetic */ CTInAppNativeHalfInterstitialImageFragment b;

    public CTInAppNativeHalfInterstitialImageFragment$1(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment, CloseImageView closeImageView) {
        this.b = cTInAppNativeHalfInterstitialImageFragment;
        this.a = closeImageView;
    }

    public final void onGlobalLayout() {
        CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)cTInAppNativeHalfInterstitialImageFragment.j.getLayoutParams();
        CTInAppNotification cTInAppNotification = cTInAppNativeHalfInterstitialImageFragment.e;
        boolean bl2 = cTInAppNotification.t;
        CloseImageView closeImageView = this.a;
        if (bl2 && (bl2 = cTInAppNativeHalfInterstitialImageFragment.Va())) {
            cTInAppNotification = cTInAppNativeHalfInterstitialImageFragment.j;
            CTInAppBaseFullFragment.Wa((RelativeLayout)cTInAppNotification, layoutParams, closeImageView);
        } else {
            bl2 = cTInAppNativeHalfInterstitialImageFragment.Va();
            if (bl2) {
                cTInAppNotification = cTInAppNativeHalfInterstitialImageFragment.j;
                cTInAppNativeHalfInterstitialImageFragment.Xa((RelativeLayout)cTInAppNotification, layoutParams, closeImageView);
            } else {
                cTInAppNotification = cTInAppNativeHalfInterstitialImageFragment.j;
                CTInAppBaseFullFragment.Wa((RelativeLayout)cTInAppNotification, layoutParams, closeImageView);
            }
        }
        cTInAppNativeHalfInterstitialImageFragment.j.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

