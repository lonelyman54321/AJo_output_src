/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

class FabTransformationBehavior$2
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ FabTransformationBehavior this$0;
    final /* synthetic */ View val$child;

    public FabTransformationBehavior$2(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.this$0 = fabTransformationBehavior;
        this.val$child = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.val$child.invalidate();
    }
}

