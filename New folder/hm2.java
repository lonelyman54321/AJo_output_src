/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.text.Spanned
 *  android.text.TextPaint
 *  android.text.style.MetricAffectingSpan
 */
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class hm2 {
    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int n3, int n4) {
        int n7;
        CharSequence charSequence2;
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence3 = charSequence;
        int n8 = n3;
        int n10 = n4;
        boolean bl2 = charSequence instanceof Spanned;
        if (bl2) {
            charSequence2 = charSequence;
            charSequence2 = (Spanned)charSequence;
            n7 = n3 + -1;
            Class<MetricAffectingSpan> clazz = MetricAffectingSpan.class;
            if ((n7 = charSequence2.nextSpanTransition(n7, n4, clazz)) != n4) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint3 = new TextPaint();
                while (n8 < n10) {
                    int n14;
                    int n15 = charSequence2.nextSpanTransition(n8, n10, clazz);
                    MetricAffectingSpan[] metricAffectingSpanArray = (MetricAffectingSpan[])charSequence2.getSpans(n8, n15, clazz);
                    textPaint3.set(textPaint2);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArray) {
                        int n16 = charSequence2.getSpanStart(metricAffectingSpan);
                        if (n16 == (n14 = charSequence2.getSpanEnd(metricAffectingSpan))) continue;
                        metricAffectingSpan.updateMeasureState(textPaint3);
                    }
                    n14 = Build.VERSION.SDK_INT;
                    int n17 = 29;
                    if (n14 >= n17) {
                        em2.a((Paint)textPaint3, charSequence3, n8, n15, rect2);
                    } else {
                        String string2 = ((Object)charSequence).toString();
                        textPaint3.getTextBounds(string2, n8, n15, rect2);
                    }
                    n8 = rect.right;
                    rect.right = n14 = rect2.width() + n8;
                    n8 = rect.top;
                    n14 = rect2.top;
                    rect.top = n8 = Math.min(n8, n14);
                    n8 = rect.bottom;
                    n14 = rect2.bottom;
                    rect.bottom = n8 = Math.max(n8, n14);
                    n8 = n15;
                }
                return rect;
            }
        }
        charSequence2 = new Rect();
        int n18 = Build.VERSION.SDK_INT;
        n7 = 29;
        if (n18 >= n7) {
            em2.a((Paint)textPaint2, charSequence3, n8, n10, (Rect)charSequence2);
        } else {
            charSequence3 = ((Object)charSequence).toString();
            textPaint2.getTextBounds((String)charSequence3, n8, n10, (Rect)charSequence2);
        }
        return charSequence2;
    }
}

