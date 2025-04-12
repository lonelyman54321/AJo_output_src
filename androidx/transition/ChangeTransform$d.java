/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.graphics.Matrix
 *  android.view.View
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.transition.ChangeTransform;
import androidx.transition.ChangeTransform$e;
import androidx.transition.ChangeTransform$f;
import androidx.transition.R$id;

public final class ChangeTransform$d
extends AnimatorListenerAdapter {
    public boolean a;
    public final Matrix b;
    public final boolean c;
    public final boolean d;
    public final View e;
    public final ChangeTransform$f f;
    public final ChangeTransform$e g;
    public final Matrix h;

    public ChangeTransform$d(View view, ChangeTransform$f f5, ChangeTransform$e changeTransform$e, Matrix matrix, boolean bl2, boolean bl3) {
        Matrix matrix2;
        this.b = matrix2 = new Matrix();
        this.c = bl2;
        this.d = bl3;
        this.e = view;
        this.f = f5;
        this.g = changeTransform$e;
        this.h = matrix;
    }

    public final void onAnimationCancel(Animator animator2) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator object) {
        float f5;
        int n3 = this.a;
        ChangeTransform$f changeTransform$f = this.f;
        View view = this.e;
        if (n3 == 0) {
            n3 = this.c;
            if (n3 != 0 && (n3 = (int)(this.d ? 1 : 0)) != 0) {
                object = this.b;
                Matrix matrix = this.h;
                object.set(matrix);
                int n4 = R$id.transition_transform;
                view.setTag(n4, object);
                changeTransform$f.getClass();
                object = ChangeTransform.d;
                f5 = changeTransform$f.a;
                view.setTranslationX(f5);
                f5 = changeTransform$f.b;
                view.setTranslationY(f5);
                object = ViewCompat.a;
                f5 = changeTransform$f.c;
                ViewCompat$c.q(view, f5);
                f5 = changeTransform$f.d;
                view.setScaleX(f5);
                f5 = changeTransform$f.e;
                view.setScaleY(f5);
                f5 = changeTransform$f.f;
                view.setRotationX(f5);
                f5 = changeTransform$f.g;
                view.setRotationY(f5);
                f5 = changeTransform$f.h;
                view.setRotation(f5);
            } else {
                n3 = R$id.transition_transform;
                view.setTag(n3, null);
                n3 = R$id.parent_matrix;
                view.setTag(n3, null);
            }
        }
        ee3_0.a.e(view, null);
        changeTransform$f.getClass();
        object = ChangeTransform.d;
        f5 = changeTransform$f.a;
        view.setTranslationX(f5);
        f5 = changeTransform$f.b;
        view.setTranslationY(f5);
        object = ViewCompat.a;
        f5 = changeTransform$f.c;
        ViewCompat$c.q(view, f5);
        f5 = changeTransform$f.d;
        view.setScaleX(f5);
        f5 = changeTransform$f.e;
        view.setScaleY(f5);
        f5 = changeTransform$f.f;
        view.setRotationX(f5);
        f5 = changeTransform$f.g;
        view.setRotationY(f5);
        f5 = changeTransform$f.h;
        view.setRotation(f5);
    }

    public final void onAnimationPause(Animator object) {
        object = this.g.a;
        Object object2 = this.b;
        object2.set((Matrix)object);
        int n3 = R$id.transition_transform;
        View view = this.e;
        view.setTag(n3, object2);
        object = this.f;
        object.getClass();
        object2 = ChangeTransform.d;
        float f5 = ((ChangeTransform$f)object).a;
        view.setTranslationX(f5);
        f5 = ((ChangeTransform$f)object).b;
        view.setTranslationY(f5);
        object2 = ViewCompat.a;
        f5 = ((ChangeTransform$f)object).c;
        ViewCompat$c.q(view, f5);
        f5 = ((ChangeTransform$f)object).d;
        view.setScaleX(f5);
        f5 = ((ChangeTransform$f)object).e;
        view.setScaleY(f5);
        f5 = ((ChangeTransform$f)object).f;
        view.setRotationX(f5);
        f5 = ((ChangeTransform$f)object).g;
        view.setRotationY(f5);
        float f6 = ((ChangeTransform$f)object).h;
        view.setRotation(f6);
    }

    public final void onAnimationResume(Animator view) {
        view = ChangeTransform.d;
        view = this.e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ViewCompat$c.q(view, 0.0f);
        float f5 = 1.0f;
        view.setScaleX(f5);
        view.setScaleY(f5);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}

