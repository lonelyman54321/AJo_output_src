/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$2;

class CTInAppNativeHalfInterstitialFragment$2$3
implements Runnable {
    public final /* synthetic */ CTInAppNativeHalfInterstitialFragment$2 a;

    public CTInAppNativeHalfInterstitialFragment$2$3(CTInAppNativeHalfInterstitialFragment$2 cTInAppNativeHalfInterstitialFragment$2) {
        this.a = cTInAppNativeHalfInterstitialFragment$2;
    }

    public final void run() {
        CTInAppNativeHalfInterstitialFragment$2 cTInAppNativeHalfInterstitialFragment$2 = this.a;
        int n3 = cTInAppNativeHalfInterstitialFragment$2.b.getMeasuredWidth() / 2;
        CloseImageView closeImageView = cTInAppNativeHalfInterstitialFragment$2.b;
        float f5 = cTInAppNativeHalfInterstitialFragment$2.c.j.getRight() - n3;
        closeImageView.setX(f5);
        closeImageView = cTInAppNativeHalfInterstitialFragment$2.b;
        float f6 = cTInAppNativeHalfInterstitialFragment$2.c.j.getTop() - n3;
        closeImageView.setY(f6);
    }
}

