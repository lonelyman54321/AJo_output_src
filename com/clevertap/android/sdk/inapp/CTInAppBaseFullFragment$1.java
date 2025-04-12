/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;

class CTInAppBaseFullFragment$1
implements Runnable {
    public final /* synthetic */ CloseImageView a;
    public final /* synthetic */ RelativeLayout b;

    public CTInAppBaseFullFragment$1(RelativeLayout relativeLayout, CloseImageView closeImageView) {
        this.a = closeImageView;
        this.b = relativeLayout;
    }

    public final void run() {
        CloseImageView closeImageView = this.a;
        int n3 = closeImageView.getMeasuredWidth() / 2;
        RelativeLayout relativeLayout = this.b;
        float f5 = relativeLayout.getRight() - n3;
        closeImageView.setX(f5);
        float f6 = relativeLayout.getTop() - n3;
        closeImageView.setY(f6);
    }
}

