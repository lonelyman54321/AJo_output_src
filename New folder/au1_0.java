/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/*
 * Renamed from au1
 */
public final class au1_0
extends MetricAffectingSpan {
    public final float a;

    public au1_0(float f5) {
        this.a = f5;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float f5 = this.a;
        textPaint.setLetterSpacing(f5);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        float f5 = this.a;
        textPaint.setLetterSpacing(f5);
    }
}

