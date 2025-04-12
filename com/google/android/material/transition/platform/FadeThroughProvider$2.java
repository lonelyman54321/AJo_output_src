/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class FadeThroughProvider$2
extends AnimatorListenerAdapter {
    final /* synthetic */ float val$originalAlpha;
    final /* synthetic */ View val$view;

    public FadeThroughProvider$2(View view, float f5) {
        this.val$view = view;
        this.val$originalAlpha = f5;
    }

    public void onAnimationEnd(Animator animator2) {
        animator2 = this.val$view;
        float f5 = this.val$originalAlpha;
        animator2.setAlpha(f5);
    }
}

