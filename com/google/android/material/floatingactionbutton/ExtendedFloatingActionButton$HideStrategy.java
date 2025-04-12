/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import com.google.android.material.R$animator;
import com.google.android.material.floatingactionbutton.AnimatorTracker;
import com.google.android.material.floatingactionbutton.BaseMotionStrategy;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback;

class ExtendedFloatingActionButton$HideStrategy
extends BaseMotionStrategy {
    private boolean isCancelled;
    final /* synthetic */ ExtendedFloatingActionButton this$0;

    public ExtendedFloatingActionButton$HideStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.this$0 = extendedFloatingActionButton;
        super(extendedFloatingActionButton, animatorTracker);
    }

    public int getDefaultMotionSpecResource() {
        return R$animator.mtrl_extended_fab_hide_motion_spec;
    }

    public void onAnimationCancel() {
        super.onAnimationCancel();
        this.isCancelled = true;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n3 = 0;
        ExtendedFloatingActionButton.access$702(extendedFloatingActionButton, 0);
        boolean bl2 = this.isCancelled;
        if (!bl2) {
            extendedFloatingActionButton = this.this$0;
            n3 = 8;
            extendedFloatingActionButton.setVisibility(n3);
        }
    }

    public void onAnimationStart(Animator animator2) {
        super.onAnimationStart(animator2);
        this.isCancelled = false;
        this.this$0.setVisibility(0);
        ExtendedFloatingActionButton.access$702(this.this$0, 1);
    }

    public void onChange(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        if (extendedFloatingActionButton$OnChangedCallback != null) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
            extendedFloatingActionButton$OnChangedCallback.onHidden(extendedFloatingActionButton);
        }
    }

    public void performNow() {
        this.this$0.setVisibility(8);
    }

    public boolean shouldCancel() {
        return ExtendedFloatingActionButton.access$900(this.this$0);
    }
}

