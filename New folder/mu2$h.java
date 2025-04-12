/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.ViewGroup
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

public final class mu2$h
extends AnimatorListenerAdapter {
    public final /* synthetic */ mu2 a;

    public mu2$h(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationEnd(Animator animator2) {
        animator2 = this.a.f;
        if (animator2 != null) {
            int n3 = 4;
            animator2.setVisibility(n3);
        }
    }

    public final void onAnimationStart(Animator object) {
        object = this.a;
        ViewGroup viewGroup = object.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            viewGroup = object.h;
            int n3 = viewGroup.getWidth();
            float f5 = n3;
            viewGroup.setTranslationX(f5);
            object = object.h;
            int n4 = object.getWidth();
            object.scrollTo(n4, 0);
        }
    }
}

