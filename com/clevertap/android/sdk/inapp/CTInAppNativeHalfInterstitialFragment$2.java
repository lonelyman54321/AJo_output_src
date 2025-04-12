/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$2$1;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$2$2;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$2$3;
import com.clevertap.android.sdk.inapp.CTInAppNotification;

class CTInAppNativeHalfInterstitialFragment$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ CloseImageView b;
    public final /* synthetic */ CTInAppNativeHalfInterstitialFragment c;

    public CTInAppNativeHalfInterstitialFragment$2(CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment, FrameLayout frameLayout, CloseImageView closeImageView) {
        this.c = cTInAppNativeHalfInterstitialFragment;
        this.a = frameLayout;
        this.b = closeImageView;
    }

    public final void onGlobalLayout() {
        FrameLayout frameLayout = this.a;
        int n3 = R$id.half_interstitial_relative_layout;
        frameLayout = (RelativeLayout)frameLayout.findViewById(n3);
        Object object = (FrameLayout.LayoutParams)frameLayout.getLayoutParams();
        CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment = this.c;
        CTInAppNotification cTInAppNotification = cTInAppNativeHalfInterstitialFragment.e;
        int n4 = cTInAppNotification.t;
        int n7 = 17;
        float f5 = 1.3f;
        if (n4 != 0 && (n4 = cTInAppNativeHalfInterstitialFragment.Va()) != 0) {
            float f6 = (float)frameLayout.getMeasuredHeight() * f5;
            object.width = n4 = (int)f6;
            object.gravity = n7;
            frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
            frameLayout = new Handler();
            object = new CTInAppNativeHalfInterstitialFragment$2$3(this);
            frameLayout.post((Runnable)object);
        } else {
            n4 = cTInAppNativeHalfInterstitialFragment.Va();
            if (n4 != 0) {
                n4 = 140;
                int n8 = cTInAppNativeHalfInterstitialFragment.Sa(n4);
                int n10 = 100;
                int n14 = cTInAppNativeHalfInterstitialFragment.Sa(n10);
                n4 = cTInAppNativeHalfInterstitialFragment.Sa(n4);
                n10 = cTInAppNativeHalfInterstitialFragment.Sa(n10);
                object.setMargins(n8, n14, n4, n10);
                n4 = frameLayout.getMeasuredHeight();
                n8 = cTInAppNativeHalfInterstitialFragment.Sa(130);
                object.height = n4 -= n8;
                float f7 = (float)n4 * f5;
                object.width = n4 = (int)f7;
                object.gravity = n7;
                frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
                frameLayout = new Handler();
                object = new CTInAppNativeHalfInterstitialFragment$2$1(this);
                frameLayout.post((Runnable)object);
            } else {
                object.width = n4 = (int)((float)frameLayout.getMeasuredHeight() * f5);
                n4 = 1;
                float f8 = Float.MIN_VALUE;
                object.gravity = n4;
                frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
                frameLayout = new Handler();
                object = new CTInAppNativeHalfInterstitialFragment$2$2(this);
                frameLayout.post((Runnable)object);
            }
        }
        cTInAppNativeHalfInterstitialFragment.j.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

