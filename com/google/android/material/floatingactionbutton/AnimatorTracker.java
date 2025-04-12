/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

class AnimatorTracker {
    private Animator currentAnimator;

    public void cancelCurrent() {
        Animator animator2 = this.currentAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void clear() {
        this.currentAnimator = null;
    }

    public void onNextAnimationStart(Animator animator2) {
        this.cancelCurrent();
        this.currentAnimator = animator2;
    }
}

