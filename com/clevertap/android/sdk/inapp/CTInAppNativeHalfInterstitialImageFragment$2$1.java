/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$2;

class CTInAppNativeHalfInterstitialImageFragment$2$1
implements Runnable {
    public final /* synthetic */ CTInAppNativeHalfInterstitialImageFragment$2 a;

    public CTInAppNativeHalfInterstitialImageFragment$2$1(CTInAppNativeHalfInterstitialImageFragment$2 var1_1) {
        this.a = var1_1;
    }

    public final void run() {
        CTInAppNativeHalfInterstitialImageFragment$2 cTInAppNativeHalfInterstitialImageFragment$2 = this.a;
        int n3 = cTInAppNativeHalfInterstitialImageFragment$2.a.getMeasuredWidth() / 2;
        CloseImageView closeImageView = cTInAppNativeHalfInterstitialImageFragment$2.a;
        float f5 = cTInAppNativeHalfInterstitialImageFragment$2.b.j.getRight() - n3;
        closeImageView.setX(f5);
        closeImageView = cTInAppNativeHalfInterstitialImageFragment$2.a;
        float f6 = cTInAppNativeHalfInterstitialImageFragment$2.b.j.getTop() - n3;
        closeImageView.setY(f6);
    }
}

