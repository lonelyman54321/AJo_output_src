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

class SlideDistanceProvider$2
extends AnimatorListenerAdapter {
    final /* synthetic */ float val$originalTranslation;
    final /* synthetic */ View val$view;

    public SlideDistanceProvider$2(View view, float f5) {
        this.val$view = view;
        this.val$originalTranslation = f5;
    }

    public void onAnimationEnd(Animator animator2) {
        animator2 = this.val$view;
        float f5 = this.val$originalTranslation;
        animator2.setTranslationY(f5);
    }
}

