/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.graphics.Rect
 *  android.view.View
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.ChangeClipBounds;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;

public final class ChangeClipBounds$a
extends AnimatorListenerAdapter
implements Transition$i {
    public final Rect a;
    public final Rect b;
    public final View c;

    public ChangeClipBounds$a(View view, Rect rect, Rect rect2) {
        this.c = view;
        this.a = rect;
        this.b = rect2;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.onAnimationEnd(animator2, false);
    }

    public final void onAnimationEnd(Animator animator2, boolean bl2) {
        animator2 = this.c;
        if (!bl2) {
            Rect rect = this.b;
            animator2.setClipBounds(rect);
        } else {
            Rect rect = this.a;
            animator2.setClipBounds(rect);
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
        transition2 = this.c;
        Rect rect = transition2.getClipBounds();
        if (rect == null) {
            rect = ChangeClipBounds.b;
        }
        int n3 = R$id.transition_clip;
        transition2.setTag(n3, rect);
        rect = this.b;
        transition2.setClipBounds(rect);
    }

    public final void onTransitionResume(Transition transition2) {
        int n3 = R$id.transition_clip;
        View view = this.c;
        transition2 = (Rect)view.getTag(n3);
        view.setClipBounds((Rect)transition2);
        n3 = R$id.transition_clip;
        view.setTag(n3, null);
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

