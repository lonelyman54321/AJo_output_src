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
import androidx.recyclerview.widget.DefaultItemAnimator$a;
import androidx.recyclerview.widget.RecyclerView$B;
import java.util.ArrayList;

public final class j
extends AnimatorListenerAdapter {
    public final /* synthetic */ DefaultItemAnimator$a a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ DefaultItemAnimator d;

    public j(DefaultItemAnimator defaultItemAnimator, DefaultItemAnimator$a defaultItemAnimator$a, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = defaultItemAnimator;
        this.a = defaultItemAnimator$a;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationEnd(Animator object) {
        this.b.setListener(null);
        Object object2 = this.c;
        object2.setAlpha(1.0f);
        object2.setTranslationX(0.0f);
        object2.setTranslationY(0.0f);
        object = this.a;
        object2 = object.b;
        DefaultItemAnimator defaultItemAnimator = this.d;
        defaultItemAnimator.c((RecyclerView$B)object2);
        object2 = defaultItemAnimator.r;
        object = object.b;
        ((ArrayList)object2).remove(object);
        defaultItemAnimator.m();
    }

    public final void onAnimationStart(Animator animator2) {
        RecyclerView$B cfr_ignored_0 = this.a.b;
        this.d.getClass();
    }
}

