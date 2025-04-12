/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

class HideBottomViewOnScrollBehavior$1
extends AnimatorListenerAdapter {
    final /* synthetic */ HideBottomViewOnScrollBehavior this$0;

    public HideBottomViewOnScrollBehavior$1(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.this$0 = hideBottomViewOnScrollBehavior;
    }

    public void onAnimationEnd(Animator animator2) {
        HideBottomViewOnScrollBehavior.access$002(this.this$0, null);
    }
}

