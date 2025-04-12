/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1;
import com.google.android.material.shape.MaterialShapeDrawable;

abstract class FloatingActionButtonImpl$ShadowAnimatorImpl
extends AnimatorListenerAdapter
implements ValueAnimator.AnimatorUpdateListener {
    private float shadowSizeEnd;
    private float shadowSizeStart;
    final /* synthetic */ FloatingActionButtonImpl this$0;
    private boolean validValues;

    private FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl floatingActionButtonImpl) {
        this.this$0 = floatingActionButtonImpl;
    }

    public /* synthetic */ FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl floatingActionButtonImpl, FloatingActionButtonImpl$1 floatingActionButtonImpl$1) {
        this(floatingActionButtonImpl);
    }

    public abstract float getTargetShadowSize();

    public void onAnimationEnd(Animator object) {
        object = this.this$0;
        float f5 = (int)this.shadowSizeEnd;
        ((FloatingActionButtonImpl)object).updateShapeElevation(f5);
        this.validValues = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object object;
        boolean bl2 = this.validValues;
        if (!bl2) {
            float f5;
            object = this.this$0.shapeDrawable;
            if (object == null) {
                bl2 = false;
                f5 = 0.0f;
                object = null;
            } else {
                f5 = ((MaterialShapeDrawable)object).getElevation();
            }
            this.shadowSizeStart = f5;
            this.shadowSizeEnd = f5 = this.getTargetShadowSize();
            bl2 = true;
            f5 = Float.MIN_VALUE;
            this.validValues = bl2;
        }
        object = this.this$0;
        float f6 = this.shadowSizeStart;
        float f7 = this.shadowSizeEnd - f6;
        float f8 = (int)(valueAnimator.getAnimatedFraction() * f7 + f6);
        ((FloatingActionButtonImpl)object).updateShapeElevation(f8);
    }
}

