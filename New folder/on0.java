/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 */
import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.media3.ui.DefaultTimeBar;

public final class on0
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DefaultTimeBar a;

    public /* synthetic */ on0(DefaultTimeBar defaultTimeBar) {
        this.a = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5;
        DefaultTimeBar defaultTimeBar = this.a;
        defaultTimeBar.getClass();
        defaultTimeBar.F = f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator = defaultTimeBar.a;
        defaultTimeBar.invalidate((Rect)valueAnimator);
    }
}

