/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.transition;

import android.animation.ValueAnimator;
import com.google.android.material.transition.MaterialContainerTransform;
import com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable;

class MaterialContainerTransform$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ MaterialContainerTransform this$0;
    final /* synthetic */ MaterialContainerTransform$TransitionDrawable val$transitionDrawable;

    public MaterialContainerTransform$1(MaterialContainerTransform materialContainerTransform, MaterialContainerTransform$TransitionDrawable transitionDrawable) {
        this.this$0 = materialContainerTransform;
        this.val$transitionDrawable = transitionDrawable;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable = this.val$transitionDrawable;
        float f5 = valueAnimator.getAnimatedFraction();
        MaterialContainerTransform$TransitionDrawable.access$200(materialContainerTransform$TransitionDrawable, f5);
    }
}

