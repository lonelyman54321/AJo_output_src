/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transition.TransitionUtils;

class FadeProvider$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float val$endFraction;
    final /* synthetic */ float val$endValue;
    final /* synthetic */ float val$startFraction;
    final /* synthetic */ float val$startValue;
    final /* synthetic */ View val$view;

    public FadeProvider$1(View view, float f5, float f6, float f7, float f8) {
        this.val$view = view;
        this.val$startValue = f5;
        this.val$endValue = f6;
        this.val$startFraction = f7;
        this.val$endFraction = f8;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        View view = this.val$view;
        float f6 = this.val$startValue;
        float f7 = this.val$endValue;
        float f8 = this.val$startFraction;
        float f11 = this.val$endFraction;
        f5 = TransitionUtils.lerp(f6, f7, f8, f11, f5);
        view.setAlpha(f5);
    }
}

