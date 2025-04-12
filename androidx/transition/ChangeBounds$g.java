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
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;

public final class ChangeBounds$g
extends AnimatorListenerAdapter
implements Transition$i {
    public final View a;
    public final Rect b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;

    public ChangeBounds$g(View view, Rect rect, boolean bl2, Rect rect2, boolean bl3, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        this.a = view;
        this.b = rect;
        this.c = bl2;
        this.d = rect2;
        this.e = bl3;
        this.f = n3;
        this.g = n4;
        this.h = n7;
        this.i = n8;
        this.j = n10;
        this.k = n14;
        this.l = n15;
        this.m = n16;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.onAnimationEnd(animator2, false);
    }

    public final void onAnimationEnd(Animator animator2, boolean bl2) {
        int n3 = this.n;
        if (n3 != 0) {
            return;
        }
        n3 = 0;
        animator2 = null;
        if (bl2) {
            boolean bl3 = this.c;
            if (!bl3) {
                animator2 = this.b;
            }
        } else {
            boolean bl4 = this.e;
            if (!bl4) {
                animator2 = this.d;
            }
        }
        View view = this.a;
        view.setClipBounds((Rect)animator2);
        if (bl2) {
            n3 = this.h;
            int n4 = this.i;
            int n7 = this.f;
            int n8 = this.g;
            ee3_0.a(view, n7, n8, n3, n4);
        } else {
            n3 = this.l;
            int n10 = this.m;
            int n14 = this.j;
            int n15 = this.k;
            ee3_0.a(view, n14, n15, n3, n10);
        }
    }

    public final void onAnimationStart(Animator animator2) {
        this.onAnimationStart(animator2, false);
    }

    public final void onAnimationStart(Animator animator2, boolean bl2) {
        int n3 = this.h;
        int n4 = this.f;
        n3 -= n4;
        int n7 = this.l;
        int n8 = this.j;
        n3 = Math.max(n3, n7 -= n8);
        n7 = this.i;
        int n10 = this.g;
        n7 -= n10;
        int n14 = this.m;
        int n15 = this.k;
        n7 = Math.max(n7, n14 -= n15);
        if (bl2) {
            n4 = n8;
        }
        if (bl2) {
            n10 = n15;
        }
        View view = this.a;
        ee3_0.a(view, n4, n10, n3 += n4, n7 += n10);
        animator2 = bl2 ? this.d : this.b;
        view.setClipBounds((Rect)animator2);
    }

    public final void onTransitionCancel(Transition transition2) {
        this.n = true;
    }

    public final void onTransitionEnd(Transition transition2) {
        throw null;
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
    }

    public final void onTransitionPause(Transition transition2) {
        transition2 = this.a;
        Rect rect = transition2.getClipBounds();
        int n3 = R$id.transition_clip;
        transition2.setTag(n3, rect);
        boolean bl2 = this.e;
        if (bl2) {
            bl2 = false;
            rect = null;
        } else {
            rect = this.d;
        }
        transition2.setClipBounds(rect);
    }

    public final void onTransitionResume(Transition transition2) {
        int n3 = R$id.transition_clip;
        View view = this.a;
        transition2 = (Rect)view.getTag(n3);
        int n4 = R$id.transition_clip;
        view.setTag(n4, null);
        view.setClipBounds((Rect)transition2);
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

