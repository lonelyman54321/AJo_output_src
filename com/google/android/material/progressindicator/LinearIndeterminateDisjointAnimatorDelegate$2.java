/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;

class LinearIndeterminateDisjointAnimatorDelegate$2
extends AnimatorListenerAdapter {
    final /* synthetic */ LinearIndeterminateDisjointAnimatorDelegate this$0;

    public LinearIndeterminateDisjointAnimatorDelegate$2(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
        this.this$0 = linearIndeterminateDisjointAnimatorDelegate;
    }

    public void onAnimationEnd(Animator object) {
        super.onAnimationEnd(object);
        this.this$0.cancelAnimatorImmediately();
        object = this.this$0;
        Mj mj = object.animatorCompleteCallback;
        if (mj != null) {
            object = object.drawable;
            mj.onAnimationEnd((Drawable)object);
        }
    }
}

