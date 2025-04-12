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
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;

class LinearIndeterminateDisjointAnimatorDelegate$1
extends AnimatorListenerAdapter {
    final /* synthetic */ LinearIndeterminateDisjointAnimatorDelegate this$0;

    public LinearIndeterminateDisjointAnimatorDelegate$1(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
        this.this$0 = linearIndeterminateDisjointAnimatorDelegate;
    }

    public void onAnimationRepeat(Animator object) {
        super.onAnimationRepeat(object);
        object = this.this$0;
        int n3 = LinearIndeterminateDisjointAnimatorDelegate.access$000((LinearIndeterminateDisjointAnimatorDelegate)object);
        int n4 = 1;
        n3 += n4;
        int n7 = LinearIndeterminateDisjointAnimatorDelegate.access$100((LinearIndeterminateDisjointAnimatorDelegate)this.this$0).indicatorColors.length;
        LinearIndeterminateDisjointAnimatorDelegate.access$002((LinearIndeterminateDisjointAnimatorDelegate)object, n3 %= n7);
        LinearIndeterminateDisjointAnimatorDelegate.access$202(this.this$0, n4 != 0);
    }
}

