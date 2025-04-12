/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;

public final class Fade$a
extends AnimatorListenerAdapter
implements Transition$i {
    public final View a;
    public boolean b = false;

    public Fade$a(View view) {
        this.a = view;
    }

    public final void onAnimationCancel(Animator animator2) {
        ee3_0.b(this.a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator2) {
        this.onAnimationEnd(animator2, false);
    }

    public final void onAnimationEnd(Animator object, boolean bl2) {
        float f5;
        int n3 = this.b;
        View view = this.a;
        if (n3 != 0) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
            view.setLayerType(0, null);
        }
        if (!bl2) {
            n3 = 1065353216;
            f5 = 1.0f;
            ee3_0.b(view, f5);
            object = ee3_0.a;
            object.getClass();
        }
    }

    public final void onAnimationStart(Animator animator2) {
        animator2 = this.a;
        int n3 = animator2.hasOverlappingRendering();
        if (n3 != 0 && (n3 = animator2.getLayerType()) == 0) {
            this.b = true;
            n3 = 2;
            animator2.setLayerType(n3, null);
        }
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition transition2) {
        throw null;
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
    }

    public final void onTransitionPause(Transition transition2) {
        float f5;
        Object object;
        transition2 = this.a;
        int n3 = transition2.getVisibility();
        if (n3 == 0) {
            object = ee3_0.a;
            f5 = ((ge3_0)object).a((View)transition2);
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        int n4 = R$id.transition_pause_alpha;
        object = Float.valueOf(f5);
        transition2.setTag(n4, object);
    }

    public final void onTransitionResume(Transition transition2) {
        int n3 = R$id.transition_pause_alpha;
        this.a.setTag(n3, null);
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

