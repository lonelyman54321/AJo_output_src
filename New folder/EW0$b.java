/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 */
import android.transition.Transition;

public final class EW0$b
implements Transition.TransitionListener {
    public final /* synthetic */ Runnable a;

    public EW0$b(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition transition2) {
        this.a.run();
    }

    public final void onTransitionPause(Transition transition2) {
    }

    public final void onTransitionResume(Transition transition2) {
    }

    public final void onTransitionStart(Transition transition2) {
    }
}

