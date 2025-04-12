/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.transformation.FabTransformationBehavior;

class FabTransformationBehavior$3
extends AnimatorListenerAdapter {
    final /* synthetic */ FabTransformationBehavior this$0;
    final /* synthetic */ CircularRevealWidget val$circularRevealChild;
    final /* synthetic */ Drawable val$icon;

    public FabTransformationBehavior$3(FabTransformationBehavior fabTransformationBehavior, CircularRevealWidget circularRevealWidget, Drawable drawable2) {
        this.this$0 = fabTransformationBehavior;
        this.val$circularRevealChild = circularRevealWidget;
        this.val$icon = drawable2;
    }

    public void onAnimationEnd(Animator animator2) {
        this.val$circularRevealChild.setCircularRevealOverlayDrawable(null);
    }

    public void onAnimationStart(Animator object) {
        object = this.val$circularRevealChild;
        Drawable drawable2 = this.val$icon;
        object.setCircularRevealOverlayDrawable(drawable2);
    }
}

