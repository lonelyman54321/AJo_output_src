/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroupOverlay
 *  android.view.ViewParent
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import androidx.transition.Visibility;

public final class Visibility$b
extends AnimatorListenerAdapter
implements Transition$i {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ Visibility e;

    public Visibility$b(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.e = visibility;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void a() {
        int n3 = R$id.save_overlay_view;
        this.c.setTag(n3, null);
        ViewGroupOverlay viewGroupOverlay = this.a.getOverlay();
        View view = this.b;
        viewGroupOverlay.remove(view);
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.a();
    }

    public final void onAnimationEnd(Animator animator2, boolean bl2) {
        if (!bl2) {
            this.a();
        }
    }

    public final void onAnimationPause(Animator animator2) {
        animator2 = this.a.getOverlay();
        View view = this.b;
        animator2.remove(view);
    }

    public final void onAnimationResume(Animator object) {
        object = this.b;
        ViewParent viewParent = object.getParent();
        if (viewParent == null) {
            viewParent = this.a.getOverlay();
            viewParent.add((View)object);
        } else {
            object = this.e;
            ((Transition)object).cancel();
        }
    }

    public final void onAnimationStart(Animator animator2, boolean bl2) {
        if (bl2) {
            boolean bl3;
            animator2 = this.c;
            int n3 = R$id.save_overlay_view;
            View view = this.b;
            animator2.setTag(n3, (Object)view);
            animator2 = this.a.getOverlay();
            animator2.add(view);
            this.d = bl3 = true;
        }
    }

    public final void onTransitionCancel(Transition transition2) {
        boolean bl2 = this.d;
        if (bl2) {
            this.a();
        }
    }

    public final void onTransitionEnd(Transition transition2) {
        transition2.removeListener(this);
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
        transition2.removeListener(this);
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

