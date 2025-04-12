/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout$LayoutParams
 */
package com.clevertap.android.sdk.inapp;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$2$1;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$2$2;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$2$3;
import com.clevertap.android.sdk.inapp.CTInAppNotification;

class CTInAppNativeHalfInterstitialImageFragment$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ CloseImageView a;
    public final /* synthetic */ CTInAppNativeHalfInterstitialImageFragment b;

    public CTInAppNativeHalfInterstitialImageFragment$2(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment, CloseImageView closeImageView) {
        this.b = cTInAppNativeHalfInterstitialImageFragment;
        this.a = closeImageView;
    }

    public final void onGlobalLayout() {
        CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)cTInAppNativeHalfInterstitialImageFragment.j.getLayoutParams();
        Object object = cTInAppNativeHalfInterstitialImageFragment.e;
        int n3 = ((CTInAppNotification)object).t;
        int n4 = 17;
        float f5 = 1.3f;
        if (n3 != 0 && (n3 = cTInAppNativeHalfInterstitialImageFragment.Va()) != 0) {
            float f6 = (float)cTInAppNativeHalfInterstitialImageFragment.j.getMeasuredHeight() * f5;
            layoutParams.width = n3 = (int)f6;
            layoutParams.gravity = n4;
            cTInAppNativeHalfInterstitialImageFragment.j.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            layoutParams = new Handler();
            object = new CTInAppNativeHalfInterstitialImageFragment$2$3(this);
            layoutParams.post((Runnable)object);
        } else {
            n3 = cTInAppNativeHalfInterstitialImageFragment.Va();
            if (n3 != 0) {
                n3 = 140;
                int n7 = cTInAppNativeHalfInterstitialImageFragment.Sa(n3);
                int n8 = 100;
                int n10 = cTInAppNativeHalfInterstitialImageFragment.Sa(n8);
                n3 = cTInAppNativeHalfInterstitialImageFragment.Sa(n3);
                n8 = cTInAppNativeHalfInterstitialImageFragment.Sa(n8);
                layoutParams.setMargins(n7, n10, n3, n8);
                n3 = cTInAppNativeHalfInterstitialImageFragment.j.getMeasuredHeight();
                n7 = cTInAppNativeHalfInterstitialImageFragment.Sa(130);
                layoutParams.height = n3 -= n7;
                float f7 = (float)n3 * f5;
                layoutParams.width = n3 = (int)f7;
                layoutParams.gravity = n4;
                cTInAppNativeHalfInterstitialImageFragment.j.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                layoutParams = new Handler();
                object = new CTInAppNativeHalfInterstitialImageFragment$2$1(this);
                layoutParams.post((Runnable)object);
            } else {
                layoutParams.width = n3 = (int)((float)cTInAppNativeHalfInterstitialImageFragment.j.getMeasuredHeight() * f5);
                n3 = 1;
                float f8 = Float.MIN_VALUE;
                layoutParams.gravity = n3;
                cTInAppNativeHalfInterstitialImageFragment.j.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                layoutParams = new Handler();
                object = new CTInAppNativeHalfInterstitialImageFragment$2$2(this);
                layoutParams.post((Runnable)object);
            }
        }
        cTInAppNativeHalfInterstitialImageFragment.j.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

