/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

class FabTransformationScrimBehavior$1
extends AnimatorListenerAdapter {
    final /* synthetic */ FabTransformationScrimBehavior this$0;
    final /* synthetic */ View val$child;
    final /* synthetic */ boolean val$expanded;

    public FabTransformationScrimBehavior$1(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean bl2, View view) {
        this.this$0 = fabTransformationScrimBehavior;
        this.val$expanded = bl2;
        this.val$child = view;
    }

    public void onAnimationEnd(Animator animator2) {
        boolean bl2 = this.val$expanded;
        if (!bl2) {
            animator2 = this.val$child;
            int n3 = 4;
            animator2.setVisibility(n3);
        }
    }

    public void onAnimationStart(Animator animator2) {
        boolean bl2 = this.val$expanded;
        if (bl2) {
            animator2 = this.val$child;
            animator2.setVisibility(0);
        }
    }
}

