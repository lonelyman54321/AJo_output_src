/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class mu2$g
extends AnimatorListenerAdapter {
    public final /* synthetic */ mu2 a;

    public mu2$g(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.a.i(0);
    }

    public final void onAnimationStart(Animator animator2) {
        this.a.i(4);
    }
}

