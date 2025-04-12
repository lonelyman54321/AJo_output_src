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
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.f;

class CTInAppNativeInterstitialFragment$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ CloseImageView b;
    public final /* synthetic */ f c;

    public CTInAppNativeInterstitialFragment$1(f f5, FrameLayout frameLayout, CloseImageView closeImageView) {
        this.c = f5;
        this.a = frameLayout;
        this.b = closeImageView;
    }

    public final void onGlobalLayout() {
        f f5 = this.c;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)f5.o.getLayoutParams();
        CTInAppNotification cTInAppNotification = f5.e;
        boolean bl2 = cTInAppNotification.t;
        FrameLayout frameLayout = this.a;
        CloseImageView closeImageView = this.b;
        if (bl2 && (bl2 = f5.Va())) {
            cTInAppNotification = f5.o;
            f5.Za((RelativeLayout)cTInAppNotification, layoutParams, frameLayout, closeImageView);
        } else {
            bl2 = f5.Va();
            if (bl2) {
                cTInAppNotification = f5.o;
                f5.Ya((RelativeLayout)cTInAppNotification, layoutParams, frameLayout, closeImageView);
            } else {
                int n3;
                cTInAppNotification = f5.o;
                float f6 = cTInAppNotification.getMeasuredWidth();
                float f7 = 1.78f;
                layoutParams.height = n3 = (int)(f6 *= f7);
                cTInAppNotification.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                CTInAppBaseFullFragment.Ua((RelativeLayout)cTInAppNotification, closeImageView);
            }
        }
        f5.o.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

