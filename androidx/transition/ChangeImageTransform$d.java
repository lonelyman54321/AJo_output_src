/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ObjectAnimator
 *  android.graphics.Matrix
 *  android.widget.ImageView
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;

public final class ChangeImageTransform$d
extends AnimatorListenerAdapter
implements Transition$i {
    public final ImageView a;
    public final Matrix b;
    public final Matrix c;
    public boolean d = true;

    public ChangeImageTransform$d(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.a = imageView;
        this.b = matrix;
        this.c = matrix2;
    }

    public final void onAnimationEnd(Animator animator2) {
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator2, boolean bl2) {
        this.d = bl2;
    }

    public final void onAnimationPause(Animator animator2) {
        animator2 = (Matrix)((ObjectAnimator)animator2).getAnimatedValue();
        int n3 = R$id.transition_image_transform;
        ImageView imageView = this.a;
        imageView.setTag(n3, (Object)animator2);
        animator2 = this.c;
        Pe1.a(imageView, (Matrix)animator2);
    }

    public final void onAnimationResume(Animator animator2) {
        ImageView imageView = this.a;
        int n3 = R$id.transition_image_transform;
        animator2 = (Matrix)imageView.getTag(n3);
        if (animator2 != null) {
            Pe1.a(imageView, (Matrix)animator2);
            n3 = R$id.transition_image_transform;
            imageView.setTag(n3, null);
        }
    }

    public final void onAnimationStart(Animator animator2) {
        this.d = false;
    }

    public final void onAnimationStart(Animator animator2, boolean bl2) {
        this.d = false;
    }

    public final void onTransitionCancel(Transition transition2) {
    }

    public final void onTransitionEnd(Transition transition2) {
        throw null;
    }

    public final void onTransitionEnd(Transition transition2, boolean bl2) {
    }

    public final void onTransitionPause(Transition transition2) {
        int n3 = this.d;
        if (n3 != 0) {
            n3 = R$id.transition_image_transform;
            ImageView imageView = this.a;
            Matrix matrix = this.b;
            imageView.setTag(n3, (Object)matrix);
            transition2 = this.c;
            Pe1.a(imageView, (Matrix)transition2);
        }
    }

    public final void onTransitionResume(Transition transition2) {
        ImageView imageView = this.a;
        int n3 = R$id.transition_image_transform;
        transition2 = (Matrix)imageView.getTag(n3);
        if (transition2 != null) {
            Pe1.a(imageView, (Matrix)transition2);
            n3 = R$id.transition_image_transform;
            imageView.setTag(n3, null);
        }
    }

    public final void onTransitionStart(Transition transition2) {
        throw null;
    }

    public final void onTransitionStart(Transition transition2, boolean bl2) {
    }
}

