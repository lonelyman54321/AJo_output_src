/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;

public final class OU
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ QU.a a;
    public final /* synthetic */ QU b;

    public OU(QU qU, QU.a a2) {
        this.b = qU;
        this.a = a2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        QU qU = this.b;
        ((Object)((Object)qU)).getClass();
        QU.a a2 = this.a;
        QU.d(f5, a2);
        qU.a(f5, a2, false);
        qU.invalidateSelf();
    }
}

