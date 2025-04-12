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

class ExtendedFloatingActionButton$ShowStrategy
extends BaseMotionStrategy {
    final /* synthetic */ ExtendedFloatingActionButton this$0;

    public ExtendedFloatingActionButton$ShowStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.this$0 = extendedFloatingActionButton;
        super(extendedFloatingActionButton, animatorTracker);
    }

    public int getDefaultMotionSpecResource() {
        return R$animator.mtrl_extended_fab_show_motion_spec;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        ExtendedFloatingActionButton.access$702(this.this$0, 0);
    }

    public void onAnimationStart(Animator animator2) {
        super.onAnimationStart(animator2);
        this.this$0.setVisibility(0);
        ExtendedFloatingActionButton.access$702(this.this$0, 2);
    }

    public void onChange(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        if (extendedFloatingActionButton$OnChangedCallback != null) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
            extendedFloatingActionButton$OnChangedCallback.onShown(extendedFloatingActionButton);
        }
    }

    public void performNow() {
        this.this$0.setVisibility(0);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        float f5 = 1.0f;
        extendedFloatingActionButton.setAlpha(f5);
        this.this$0.setScaleY(f5);
        this.this$0.setScaleX(f5);
    }

    public boolean shouldCancel() {
        return ExtendedFloatingActionButton.access$800(this.this$0);
    }
}

