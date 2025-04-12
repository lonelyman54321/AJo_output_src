/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class ScaleProvider$1
extends AnimatorListenerAdapter {
    final /* synthetic */ float val$originalScaleX;
    final /* synthetic */ float val$originalScaleY;
    final /* synthetic */ View val$view;

    public ScaleProvider$1(View view, float f5, float f6) {
        this.val$view = view;
        this.val$originalScaleX = f5;
        this.val$originalScaleY = f6;
    }

    public void onAnimationEnd(Animator animator2) {
        animator2 = this.val$view;
        float f5 = this.val$originalScaleX;
        animator2.setScaleX(f5);
        animator2 = this.val$view;
        f5 = this.val$originalScaleY;
        animator2.setScaleY(f5);
    }
}

