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

public final class i$a
extends AnimatorListenerAdapter
implements Transition$i {
    public final View a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public i$a(View object, View view, float f5, float f6) {
        this.b = object;
        this.a = view;
        this.f = f5;
        this.g = f6;
        int n3 = R$id.transition_position;
        object = (int[])view.getTag(n3);
        this.c = (int[])object;
        if (object != null) {
            n3 = R$id.transition_position;
            f5 = 0.0f;
            view.setTag(n3, null);
        }
    }

    public final void onAnimationCancel(Animator animator2) {
        this.h = true;
        float f5 = this.f;
        View view = this.b;
        view.setTranslationX(f5);
        f5 = this.g;
        view.setTranslationY(f5);
    }

    public final void onAnimationEnd(Animator animator2) {
        this.onAnimationEnd(animator2, false);
    }

    public final void onAnimationEnd(Animator animator2, boolean bl2) {
        if (!bl2) {
            float f5 = this.f;
            View view = this.b;
            view.setTranslationX(f5);
            f5 = this.g;
            view.setTranslationY(f5);
        }
    }

    public final void onTransitionCancel(Transition transition2) {
        this.h = true;
        float f5 = this.f;
        View view = this.b;
        view.setTranslationX(f5);
        f5 = this.g;
        view.setTranslationY(f5);
    }

    public final void onTransitionEnd(Transition transition2) {
        throw null;
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
        int n3 = this.h;
        if (n3 == 0) {
            n3 = R$id.transition_position;
            View view = this.a;
            view.setTag(n3, null);
        }
    }

    public final void onTransitionPause(Transition object) {
        float f5;
        int n3;
        object = this.c;
        if (object == null) {
            n3 = 2;
            f5 = 2.8E-45f;
            object = new int[n3];
            this.c = (int[])object;
        }
        object = this.c;
        View view = this.b;
        view.getLocationOnScreen((int[])object);
        n3 = R$id.transition_position;
        int[] nArray = this.c;
        this.a.setTag(n3, (Object)nArray);
        this.d = f5 = view.getTranslationX();
        this.e = f5 = view.getTranslationY();
        f5 = this.f;
        view.setTranslationX(f5);
        f5 = this.g;
        view.setTranslationY(f5);
    }

    public final void onTransitionResume(Transition transition2) {
        float f5 = this.d;
        View view = this.b;
        view.setTranslationX(f5);
        f5 = this.e;
        view.setTranslationY(f5);
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

