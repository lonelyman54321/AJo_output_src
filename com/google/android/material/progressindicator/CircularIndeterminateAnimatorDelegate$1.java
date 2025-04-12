/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate;

class CircularIndeterminateAnimatorDelegate$1
extends AnimatorListenerAdapter {
    final /* synthetic */ CircularIndeterminateAnimatorDelegate this$0;

    public CircularIndeterminateAnimatorDelegate$1(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
        this.this$0 = circularIndeterminateAnimatorDelegate;
    }

    public void onAnimationRepeat(Animator object) {
        super.onAnimationRepeat(object);
        object = this.this$0;
        int n3 = CircularIndeterminateAnimatorDelegate.access$000((CircularIndeterminateAnimatorDelegate)object) + 4;
        int n4 = CircularIndeterminateAnimatorDelegate.access$100((CircularIndeterminateAnimatorDelegate)this.this$0).indicatorColors.length;
        CircularIndeterminateAnimatorDelegate.access$002((CircularIndeterminateAnimatorDelegate)object, n3 %= n4);
    }
}

