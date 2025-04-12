/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class YU0
extends MetricAffectingSpan {
    public final String a;

    public YU0(String string2) {
        this.a = string2;
    }

    public final void updateDrawState(TextPaint textPaint) {
        String string2 = this.a;
        textPaint.setFontFeatureSettings(string2);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        String string2 = this.a;
        textPaint.setFontFeatureSettings(string2);
    }
}

