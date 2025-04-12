/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.getkeepsafe.taptargetview;

import android.animation.ValueAnimator;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$UpdateListener;

class FloatValueAnimatorBuilder$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ FloatValueAnimatorBuilder this$0;
    final /* synthetic */ FloatValueAnimatorBuilder$UpdateListener val$listener;

    public FloatValueAnimatorBuilder$1(FloatValueAnimatorBuilder floatValueAnimatorBuilder, FloatValueAnimatorBuilder$UpdateListener updateListener) {
        this.this$0 = floatValueAnimatorBuilder;
        this.val$listener = updateListener;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FloatValueAnimatorBuilder$UpdateListener floatValueAnimatorBuilder$UpdateListener = this.val$listener;
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        floatValueAnimatorBuilder$UpdateListener.onUpdate(f5);
    }
}

