/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.Animator;
import android.animation.ValueAnimator;

/*
 * Renamed from kA3
 */
public final class ka3_2
implements e53_0,
Animator.AnimatorListener,
ValueAnimator.AnimatorUpdateListener {
    public ValueAnimator a;
    public f53_0 b;

    public final void onAnimationCancel(Animator animator2) {
        this.b.c();
    }

    public final void onAnimationEnd(Animator animator2) {
        this.b.c();
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
        this.b.a();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f53_0 f53_02 = this.b;
        float f5 = valueAnimator.getAnimatedFraction();
        f53_02.b(f5);
    }
}

