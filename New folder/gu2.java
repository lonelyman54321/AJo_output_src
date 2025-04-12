/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;

public final class gu2
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ mu2 a;

    public /* synthetic */ gu2(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        mu2 mu22 = this.a;
        mu22.getClass();
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        mu22.a(f5);
    }
}

