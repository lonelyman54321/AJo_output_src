/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.Transition$i;

public final class Visibility$a
extends AnimatorListenerAdapter
implements Transition$i {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f = false;

    public Visibility$a(View view, int n3) {
        boolean bl2;
        this.a = view;
        this.b = n3;
        view = (ViewGroup)view.getParent();
        this.c = view;
        this.d = bl2 = true;
        this.a(bl2);
    }

    public final void a(boolean bl2) {
        ViewGroup viewGroup;
        boolean bl3 = this.d;
        if (bl3 && (bl3 = this.e) != bl2 && (viewGroup = this.c) != null) {
            this.e = bl2;
            VC3.a(viewGroup, bl2);
        }
    }

    public final void onAnimationCancel(Animator animator2) {
        this.f = true;
    }

    public final void onAnimationEnd(Animator animator2) {
        boolean bl2 = this.f;
        if (!bl2) {
            animator2 = this.a;
            int n3 = this.b;
            ee3_0.c((View)animator2, n3);
            animator2 = this.c;
            if (animator2 != null) {
                animator2.invalidate();
            }
        }
        this.a(false);
    }

    public final void onAnimationEnd(Animator animator2, boolean bl2) {
        if (!bl2) {
            boolean bl3 = this.f;
            if (!bl3) {
                animator2 = this.a;
                int n3 = this.b;
                ee3_0.c((View)animator2, n3);
                animator2 = this.c;
                if (animator2 != null) {
                    animator2.invalidate();
                }
            }
            bl3 = false;
            animator2 = null;
            this.a(false);
        }
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2, boolean bl2) {
        if (bl2) {
            animator2 = this.a;
            bl2 = false;
            ee3_0.c((View)animator2, 0);
            animator2 = this.c;
            if (animator2 != null) {
                animator2.invalidate();
            }
        }
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition transition2) {
        transition2.removeListener(this);
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
        transition2.removeListener(this);
    }

    public final void onTransitionPause(Transition transition2) {
        transition2 = null;
        this.a(false);
        boolean bl2 = this.f;
        if (!bl2) {
            transition2 = this.a;
            int n3 = this.b;
            ee3_0.c((View)transition2, n3);
        }
    }

    public final void onTransitionResume(Transition transition2) {
        this.a(true);
        boolean bl2 = this.f;
        if (!bl2) {
            transition2 = this.a;
            ee3_0.c((View)transition2, 0);
        }
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

