/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

public final class Transition$c
extends AnimatorListenerAdapter {
    public final /* synthetic */ Transition a;

    public Transition$c(Transition transition2) {
        this.a = transition2;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.a.end();
        animator2.removeListener((Animator.AnimatorListener)this);
    }
}

