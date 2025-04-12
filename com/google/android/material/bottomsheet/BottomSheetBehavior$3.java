/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;

class BottomSheetBehavior$3
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BottomSheetBehavior this$0;

    public BottomSheetBehavior$3(BottomSheetBehavior bottomSheetBehavior) {
        this.this$0 = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator object) {
        object = (Float)object.getAnimatedValue();
        float f5 = ((Float)object).floatValue();
        MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.access$200(this.this$0);
        if (materialShapeDrawable != null) {
            materialShapeDrawable = BottomSheetBehavior.access$200(this.this$0);
            materialShapeDrawable.setInterpolation(f5);
        }
    }
}

