/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class mu2$i
extends AnimatorListenerAdapter {
    public final /* synthetic */ mu2 a;

    public mu2$i(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationEnd(Animator animator2) {
        animator2 = this.a.h;
        if (animator2 != null) {
            int n3 = 4;
            animator2.setVisibility(n3);
        }
    }

    public final void onAnimationStart(Animator animator2) {
        animator2 = this.a.f;
        if (animator2 != null) {
            animator2.setVisibility(0);
        }
    }
}

