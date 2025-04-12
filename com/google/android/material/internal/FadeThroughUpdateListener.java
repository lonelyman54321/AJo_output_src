/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.FadeThroughUtils;

public class FadeThroughUpdateListener
implements ValueAnimator.AnimatorUpdateListener {
    private final float[] alphas;
    private final View fadeInView;
    private final View fadeOutView;

    public FadeThroughUpdateListener(View object, View view) {
        this.fadeOutView = object;
        this.fadeInView = view;
        object = new float[2];
        this.alphas = (float[])object;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5;
        int n3;
        float f6 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        float[] fArray = this.alphas;
        FadeThroughUtils.calculateFadeOutAndInAlphas(f6, fArray);
        valueAnimator = this.fadeOutView;
        if (valueAnimator != null) {
            fArray = this.alphas;
            n3 = 0;
            f5 = fArray[0];
            valueAnimator.setAlpha(f5);
        }
        if ((valueAnimator = this.fadeInView) != null) {
            fArray = this.alphas;
            n3 = 1;
            f5 = fArray[n3];
            valueAnimator.setAlpha(f5);
        }
    }
}

