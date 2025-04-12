/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.CTInAppNotification;

class CTInAppNativeInterstitialImageFragment$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ CloseImageView b;
    public final /* synthetic */ CTInAppNativeInterstitialImageFragment c;

    public CTInAppNativeInterstitialImageFragment$2(CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment, FrameLayout frameLayout, CloseImageView closeImageView) {
        this.c = cTInAppNativeInterstitialImageFragment;
        this.a = frameLayout;
        this.b = closeImageView;
    }

    public final void onGlobalLayout() {
        CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = this.c;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)cTInAppNativeInterstitialImageFragment.j.getLayoutParams();
        CTInAppNotification cTInAppNotification = cTInAppNativeInterstitialImageFragment.e;
        boolean bl2 = cTInAppNotification.t;
        FrameLayout frameLayout = this.a;
        CloseImageView closeImageView = this.b;
        if (bl2 && (bl2 = cTInAppNativeInterstitialImageFragment.Va())) {
            cTInAppNotification = cTInAppNativeInterstitialImageFragment.j;
            cTInAppNativeInterstitialImageFragment.bb((RelativeLayout)cTInAppNotification, layoutParams, frameLayout, closeImageView);
        } else {
            bl2 = cTInAppNativeInterstitialImageFragment.Va();
            if (bl2) {
                cTInAppNotification = cTInAppNativeInterstitialImageFragment.j;
                cTInAppNativeInterstitialImageFragment.ab((RelativeLayout)cTInAppNotification, layoutParams, frameLayout, closeImageView);
            } else {
                int n3;
                cTInAppNotification = cTInAppNativeInterstitialImageFragment.j;
                float f5 = cTInAppNotification.getMeasuredHeight();
                float f6 = 1.78f;
                layoutParams.width = n3 = (int)(f5 * f6);
                n3 = 1;
                f5 = Float.MIN_VALUE;
                layoutParams.gravity = n3;
                cTInAppNotification.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                CTInAppBaseFullFragment.Ua((RelativeLayout)cTInAppNotification, closeImageView);
            }
        }
        cTInAppNativeInterstitialImageFragment.j.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

