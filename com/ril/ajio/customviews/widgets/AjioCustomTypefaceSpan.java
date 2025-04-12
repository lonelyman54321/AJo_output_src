/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.text.style.TypefaceSpan
 */
package com.ril.ajio.customviews.widgets;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class AjioCustomTypefaceSpan
extends TypefaceSpan {
    private final Typeface newType;

    public AjioCustomTypefaceSpan(String string2, Typeface typeface) {
        super(string2);
        this.newType = typeface;
    }

    private static void applyCustomTypeFace(Paint paint, Typeface typeface) {
        float f5;
        int n3;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            n3 = 0;
            f5 = 0.0f;
            typeface2 = null;
        } else {
            n3 = typeface2.getStyle();
        }
        if (typeface != null) {
            int n4 = ~typeface.getStyle();
            if ((n4 = (n3 &= n4) & 1) != 0) {
                n4 = 1;
                paint.setFakeBoldText(n4 != 0);
            }
            if ((n3 &= 2) != 0) {
                n3 = -1098907648;
                f5 = -0.25f;
                paint.setTextSkewX(f5);
            }
            paint.setTypeface(typeface);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.newType;
        AjioCustomTypefaceSpan.applyCustomTypeFace((Paint)textPaint, typeface);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.newType;
        AjioCustomTypefaceSpan.applyCustomTypeFace((Paint)textPaint, typeface);
    }
}

