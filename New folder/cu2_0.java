/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
import android.animation.ValueAnimator;
import android.view.View;

/*
 * Renamed from cu2
 */
public final class cu2_0
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ mu2 a;

    public /* synthetic */ cu2_0(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        mu2 mu22 = this.a;
        mu22.getClass();
        object = (Float)object.getAnimatedValue();
        float f5 = ((Float)object).floatValue();
        View view = mu22.b;
        if (view != null) {
            view.setAlpha(f5);
        }
        if ((view = mu22.c) != null) {
            view.setAlpha(f5);
        }
        if ((mu22 = mu22.e) != null) {
            mu22.setAlpha(f5);
        }
    }
}

