/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class yt3
extends MetricAffectingSpan {
    public final Typeface a;

    public yt3(Typeface typeface) {
        this.a = typeface;
    }

    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.a;
        textPaint.setTypeface(typeface);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.a;
        textPaint.setTypeface(typeface);
    }
}

