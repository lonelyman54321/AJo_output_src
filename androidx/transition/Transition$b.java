/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

public final class Transition$b
extends AnimatorListenerAdapter {
    public final /* synthetic */ Jp a;
    public final /* synthetic */ Transition b;

    public Transition$b(Transition transition2, Jp jp) {
        this.b = transition2;
        this.a = jp;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.a.remove(animator2);
        this.b.mCurrentAnimators.remove(animator2);
    }

    public final void onAnimationStart(Animator animator2) {
        this.b.mCurrentAnimators.add(animator2);
    }
}

