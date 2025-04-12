/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l;

public final class h
extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView$B a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ DefaultItemAnimator f;

    public h(DefaultItemAnimator defaultItemAnimator, RecyclerView$B recyclerView$B, int n3, View view, int n4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = defaultItemAnimator;
        this.a = recyclerView$B;
        this.b = n3;
        this.c = view;
        this.d = n4;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator2) {
        int n3 = this.b;
        View view = this.c;
        if (n3 != 0) {
            view.setTranslationX(0.0f);
        }
        if ((n3 = this.d) != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator object) {
        this.e.setListener(null);
        object = this.f;
        RecyclerView$B recyclerView$B = this.a;
        ((RecyclerView$l)object).c(recyclerView$B);
        ((DefaultItemAnimator)object).p.remove(recyclerView$B);
        ((DefaultItemAnimator)object).m();
    }

    public final void onAnimationStart(Animator animator2) {
        this.f.getClass();
    }
}

