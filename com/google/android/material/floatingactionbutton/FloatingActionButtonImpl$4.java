/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Matrix
 */
package com.google.android.material.floatingactionbutton;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;

class FloatingActionButtonImpl$4
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ FloatingActionButtonImpl this$0;
    final /* synthetic */ Matrix val$matrix;
    final /* synthetic */ float val$startAlpha;
    final /* synthetic */ float val$startImageMatrixScale;
    final /* synthetic */ float val$startScaleX;
    final /* synthetic */ float val$startScaleY;
    final /* synthetic */ float val$targetIconScale;
    final /* synthetic */ float val$targetOpacity;
    final /* synthetic */ float val$targetScale;

    public FloatingActionButtonImpl$4(FloatingActionButtonImpl floatingActionButtonImpl, float f5, float f6, float f7, float f8, float f11, float f12, float f14, Matrix matrix) {
        this.this$0 = floatingActionButtonImpl;
        this.val$startAlpha = f5;
        this.val$targetOpacity = f6;
        this.val$startScaleX = f7;
        this.val$targetScale = f8;
        this.val$startScaleY = f11;
        this.val$startImageMatrixScale = f12;
        this.val$targetIconScale = f14;
        this.val$matrix = matrix;
    }

    public void onAnimationUpdate(ValueAnimator object) {
        float f5 = ((Float)object.getAnimatedValue()).floatValue();
        Object object2 = this.this$0.view;
        float f6 = this.val$startAlpha;
        float f7 = this.val$targetOpacity;
        f6 = AnimationUtils.lerp(f6, f7, 0.0f, 0.2f, f5);
        object2.setAlpha(f6);
        object2 = this.this$0.view;
        f6 = this.val$startScaleX;
        f7 = this.val$targetScale;
        f6 = AnimationUtils.lerp(f6, f7, f5);
        ((FloatingActionButton)object2).setScaleX(f6);
        object2 = this.this$0.view;
        f6 = this.val$startScaleY;
        f7 = this.val$targetScale;
        f6 = AnimationUtils.lerp(f6, f7, f5);
        ((FloatingActionButton)object2).setScaleY(f6);
        object2 = this.this$0;
        f6 = this.val$startImageMatrixScale;
        f7 = this.val$targetIconScale;
        f6 = AnimationUtils.lerp(f6, f7, f5);
        FloatingActionButtonImpl.access$202((FloatingActionButtonImpl)object2, f6);
        object2 = this.this$0;
        f6 = this.val$startImageMatrixScale;
        f7 = this.val$targetIconScale;
        f5 = AnimationUtils.lerp(f6, f7, f5);
        Matrix matrix = this.val$matrix;
        FloatingActionButtonImpl.access$300((FloatingActionButtonImpl)object2, f5, matrix);
        object = this.this$0.view;
        object2 = this.val$matrix;
        object.setImageMatrix((Matrix)object2);
    }
}

