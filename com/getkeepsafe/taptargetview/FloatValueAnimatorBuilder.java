/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.getkeepsafe.taptargetview;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$1;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$2;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$EndListener;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$UpdateListener;

class FloatValueAnimatorBuilder {
    final ValueAnimator animator;
    FloatValueAnimatorBuilder$EndListener endListener;

    public FloatValueAnimatorBuilder() {
        this(false);
    }

    public FloatValueAnimatorBuilder(boolean bl2) {
        int n3 = 2;
        if (bl2) {
            Object object = new float[n3];
            object[0] = 1.0f;
            object[1] = 0.0f;
            object = ValueAnimator.ofFloat((float[])object);
            this.animator = (ValueAnimator)object;
        } else {
            Object object = new float[n3];
            object[0] = 0.0f;
            object[1] = 1.0f;
            object = ValueAnimator.ofFloat((float[])object);
            this.animator = (ValueAnimator)object;
        }
    }

    public ValueAnimator build() {
        FloatValueAnimatorBuilder$EndListener floatValueAnimatorBuilder$EndListener = this.endListener;
        if (floatValueAnimatorBuilder$EndListener != null) {
            floatValueAnimatorBuilder$EndListener = this.animator;
            FloatValueAnimatorBuilder$2 floatValueAnimatorBuilder$2 = new FloatValueAnimatorBuilder$2(this);
            floatValueAnimatorBuilder$EndListener.addListener((Animator.AnimatorListener)floatValueAnimatorBuilder$2);
        }
        return this.animator;
    }

    public FloatValueAnimatorBuilder delayBy(long l2) {
        this.animator.setStartDelay(l2);
        return this;
    }

    public FloatValueAnimatorBuilder duration(long l2) {
        this.animator.setDuration(l2);
        return this;
    }

    public FloatValueAnimatorBuilder interpolator(TimeInterpolator timeInterpolator) {
        this.animator.setInterpolator(timeInterpolator);
        return this;
    }

    public FloatValueAnimatorBuilder onEnd(FloatValueAnimatorBuilder$EndListener floatValueAnimatorBuilder$EndListener) {
        this.endListener = floatValueAnimatorBuilder$EndListener;
        return this;
    }

    public FloatValueAnimatorBuilder onUpdate(FloatValueAnimatorBuilder$UpdateListener floatValueAnimatorBuilder$UpdateListener) {
        ValueAnimator valueAnimator = this.animator;
        FloatValueAnimatorBuilder$1 floatValueAnimatorBuilder$1 = new FloatValueAnimatorBuilder$1(this, floatValueAnimatorBuilder$UpdateListener);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)floatValueAnimatorBuilder$1);
        return this;
    }

    public FloatValueAnimatorBuilder repeat(int n3) {
        this.animator.setRepeatCount(n3);
        return this;
    }
}

