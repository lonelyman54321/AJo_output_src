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

public final class g
extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView$B a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ DefaultItemAnimator d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, DefaultItemAnimator defaultItemAnimator, RecyclerView$B recyclerView$B) {
        this.d = defaultItemAnimator;
        this.a = recyclerView$B;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator2) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator object) {
        this.c.setListener(null);
        object = this.d;
        RecyclerView$B recyclerView$B = this.a;
        ((RecyclerView$l)object).c(recyclerView$B);
        ((DefaultItemAnimator)object).o.remove(recyclerView$B);
        ((DefaultItemAnimator)object).m();
    }

    public final void onAnimationStart(Animator animator2) {
        this.d.getClass();
    }
}

