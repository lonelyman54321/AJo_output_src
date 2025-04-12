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
 * Renamed from bu1
 */
public final class bu1_0
extends MetricAffectingSpan {
    public final float a;

    public bu1_0(float f5) {
        this.a = f5;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float f5 = textPaint.getTextSize();
        float f6 = textPaint.getTextScaleX() * f5;
        f5 = 0.0f;
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            f5 = this.a / f6;
            textPaint.setLetterSpacing(f5);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        float f5 = textPaint.getTextSize();
        float f6 = textPaint.getTextScaleX() * f5;
        f5 = 0.0f;
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object != false) {
            f5 = this.a / f6;
            textPaint.setLetterSpacing(f5);
        }
    }
}

