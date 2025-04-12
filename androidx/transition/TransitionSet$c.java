/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.f;

public final class TransitionSet$c
extends f {
    public TransitionSet a;

    public final void onTransitionEnd(Transition transition2) {
        int n3;
        TransitionSet transitionSet = this.a;
        transitionSet.c = n3 = transitionSet.c + -1;
        if (n3 == 0) {
            n3 = 0;
            transitionSet.d = false;
            transitionSet.end();
        }
        transition2.removeListener(this);
    }

    public final void onTransitionStart(Transition transition2) {
        transition2 = this.a;
        boolean bl2 = ((TransitionSet)transition2).d;
        if (!bl2) {
            transition2.start();
            ((TransitionSet)transition2).d = bl2 = true;
        }
    }
}

