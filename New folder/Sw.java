/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class Sw
extends MetricAffectingSpan {
    public final float a;

    public Sw(float f5) {
        this.a = f5;
    }

    public final void updateDrawState(TextPaint textPaint) {
        int n3 = textPaint.baselineShift;
        float f5 = textPaint.ascent();
        float f6 = this.a;
        int n4 = (int)Math.ceil(f5 * f6);
        textPaint.baselineShift = n3 += n4;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        int n3 = textPaint.baselineShift;
        float f5 = textPaint.ascent();
        float f6 = this.a;
        int n4 = (int)Math.ceil(f5 * f6);
        textPaint.baselineShift = n3 += n4;
    }
}

