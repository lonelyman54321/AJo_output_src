/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.transition.Transition;
import androidx.transition.f;

public final class TransitionSet$a
extends f {
    public final /* synthetic */ Transition a;

    public TransitionSet$a(Transition transition2) {
        this.a = transition2;
    }

    public final void onTransitionEnd(Transition transition2) {
        this.a.runAnimators();
        transition2.removeListener(this);
    }
}

