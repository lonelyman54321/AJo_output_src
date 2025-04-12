/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/*
 * Renamed from yD3
 */
public final class yd3_0
extends AnimatorListenerAdapter {
    public final /* synthetic */ BD3 a;
    public final /* synthetic */ View b;

    public yd3_0(BD3 bD3, View view) {
        this.a = bD3;
        this.b = view;
    }

    public final void onAnimationCancel(Animator animator2) {
        this.a.onAnimationCancel();
    }

    public final void onAnimationEnd(Animator animator2) {
        this.a.onAnimationEnd();
    }

    public final void onAnimationStart(Animator animator2) {
        this.a.a();
    }
}

