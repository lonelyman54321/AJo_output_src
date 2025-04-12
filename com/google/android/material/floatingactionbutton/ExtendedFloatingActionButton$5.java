/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback;
import com.google.android.material.floatingactionbutton.MotionStrategy;

class ExtendedFloatingActionButton$5
extends AnimatorListenerAdapter {
    private boolean cancelled;
    final /* synthetic */ ExtendedFloatingActionButton this$0;
    final /* synthetic */ ExtendedFloatingActionButton.OnChangedCallback val$callback;
    final /* synthetic */ MotionStrategy val$strategy;

    public ExtendedFloatingActionButton$5(ExtendedFloatingActionButton extendedFloatingActionButton, MotionStrategy motionStrategy, ExtendedFloatingActionButton.OnChangedCallback onChangedCallback) {
        this.this$0 = extendedFloatingActionButton;
        this.val$strategy = motionStrategy;
        this.val$callback = onChangedCallback;
    }

    public void onAnimationCancel(Animator animator2) {
        this.cancelled = true;
        this.val$strategy.onAnimationCancel();
    }

    public void onAnimationEnd(Animator object) {
        object = this.val$strategy;
        object.onAnimationEnd();
        boolean bl2 = this.cancelled;
        if (!bl2) {
            object = this.val$strategy;
            ExtendedFloatingActionButton.OnChangedCallback onChangedCallback = this.val$callback;
            object.onChange(onChangedCallback);
        }
    }

    public void onAnimationStart(Animator animator2) {
        this.val$strategy.onAnimationStart(animator2);
        this.cancelled = false;
    }
}

