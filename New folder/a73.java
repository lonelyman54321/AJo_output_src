/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class a73
extends MetricAffectingSpan {
    public final float a;

    public a73(float f5) {
        this.a = f5;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float f5 = textPaint.getTextSkewX();
        float f6 = this.a;
        textPaint.setTextSkewX(f5 += f6);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        float f5 = textPaint.getTextSkewX();
        float f6 = this.a;
        textPaint.setTextSkewX(f5 += f6);
    }
}

