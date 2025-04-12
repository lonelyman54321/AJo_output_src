/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$FontMetricsInt
 *  android.text.style.LineHeightSpan
 */
import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/*
 * Renamed from xu1
 */
public final class xu1_0
implements LineHeightSpan {
    public final float a;

    public xu1_0(float f5) {
        this.a = f5;
    }

    public final void chooseHeight(CharSequence charSequence, int n3, int n4, int n7, int n8, Paint.FontMetricsInt fontMetricsInt) {
        int n10 = fontMetricsInt.descent;
        n3 = fontMetricsInt.ascent;
        if ((n10 -= n3) <= 0) {
            return;
        }
        n3 = (int)Math.ceil(this.a);
        float f5 = (float)n3 * 1.0f;
        float f6 = n10;
        double d2 = fontMetricsInt.descent;
        double d5 = f5 /= f6;
        fontMetricsInt.descent = n10 = (int)Math.ceil(d2 * d5);
        fontMetricsInt.ascent = n10 -= n3;
    }
}

