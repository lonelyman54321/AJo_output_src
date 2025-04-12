/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.transition.Transition;
import androidx.transition.Transition$i;

public final class d
implements Transition$i {
    public final /* synthetic */ Runnable a;

    public d(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition transition2) {
        this.a.run();
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
        this.onTransitionEnd(transition2);
    }

    public final void onTransitionPause(Transition transition2) {
    }

    public final void onTransitionResume(Transition transition2) {
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

