/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Paint
 */
import android.animation.ValueAnimator;
import android.graphics.Paint;
import in.juspay.hypernfc.Wave;

/*
 * Renamed from gF3
 */
public final class gf3_1
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Wave a;
    public final /* synthetic */ Paint b;

    public /* synthetic */ gf3_1(Wave wave, Paint paint) {
        this.a = wave;
        this.b = paint;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Wave wave = this.a;
        Paint paint = this.b;
        Wave.a(wave, paint, valueAnimator);
    }
}

