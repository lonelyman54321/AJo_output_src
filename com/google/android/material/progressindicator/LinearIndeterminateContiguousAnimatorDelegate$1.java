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
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate;

class LinearIndeterminateContiguousAnimatorDelegate$1
extends AnimatorListenerAdapter {
    final /* synthetic */ LinearIndeterminateContiguousAnimatorDelegate this$0;

    public LinearIndeterminateContiguousAnimatorDelegate$1(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
        this.this$0 = linearIndeterminateContiguousAnimatorDelegate;
    }

    public void onAnimationRepeat(Animator object) {
        super.onAnimationRepeat(object);
        object = this.this$0;
        int n3 = LinearIndeterminateContiguousAnimatorDelegate.access$000((LinearIndeterminateContiguousAnimatorDelegate)object);
        int n4 = 1;
        n3 += n4;
        int n7 = LinearIndeterminateContiguousAnimatorDelegate.access$100((LinearIndeterminateContiguousAnimatorDelegate)this.this$0).indicatorColors.length;
        LinearIndeterminateContiguousAnimatorDelegate.access$002((LinearIndeterminateContiguousAnimatorDelegate)object, n3 %= n7);
        LinearIndeterminateContiguousAnimatorDelegate.access$202(this.this$0, n4 != 0);
    }
}

