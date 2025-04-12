/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment;

class CTInAppNativeHalfInterstitialFragment$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ LayoutInflater a;
    public final /* synthetic */ CloseImageView b;
    public final /* synthetic */ CTInAppNativeHalfInterstitialFragment c;

    public CTInAppNativeHalfInterstitialFragment$1(CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment, LayoutInflater layoutInflater, CloseImageView closeImageView) {
        this.c = cTInAppNativeHalfInterstitialFragment;
        this.a = layoutInflater;
        this.b = closeImageView;
    }

    /*
     * Unable to fully structure code
     */
    public final void onGlobalLayout() {
        var1_1 = this.c;
        var2_2 = (FrameLayout.LayoutParams)var1_1.j.getLayoutParams();
        var3_3 = var1_1.e;
        var4_4 = var3_3.t;
        var5_5 = this.b;
        if (var4_4 != 0 && (var4_4 = var1_1.Va()) != 0) ** GOTO lbl-1000
        var3_3 = var1_1.e;
        var4_4 = var3_3.M;
        if (var4_4 != 0 && (var4_4 = mp0_0.h((Context)(var3_3 = this.a.getContext()))) == (var6_6 = 2)) lbl-1000:
        // 2 sources

        {
            var3_3 = var1_1.j;
            CTInAppBaseFullFragment.Wa((RelativeLayout)var3_3, var2_2, var5_5);
        } else {
            var4_4 = var1_1.Va();
            if (var4_4 != 0) {
                var3_3 = var1_1.j;
                var1_1.Xa((RelativeLayout)var3_3, var2_2, var5_5);
            } else {
                var3_3 = var1_1.j;
                CTInAppBaseFullFragment.Wa((RelativeLayout)var3_3, var2_2, var5_5);
            }
        }
        var1_1.j.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

