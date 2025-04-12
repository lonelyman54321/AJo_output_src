/*
 * Decompiled with CFR 0.152.
 */
package com.willy.ratingbar;

import com.willy.ratingbar.PartialView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public final class a {
    public static DecimalFormat a;

    public static float a(PartialView partialView, float f5, float f6) {
        float f7;
        Cloneable cloneable = a;
        if (cloneable == null) {
            Cloneable cloneable2 = Locale.ENGLISH;
            cloneable = new DecimalFormatSymbols((Locale)cloneable2);
            char c2 = '.';
            f7 = 6.4E-44f;
            ((DecimalFormatSymbols)cloneable).setDecimalSeparator(c2);
            String string2 = "#.##";
            cloneable2 = new DecimalFormat(string2, (DecimalFormatSymbols)cloneable);
            a = cloneable2;
        }
        cloneable = a;
        f7 = partialView.getLeft();
        f6 -= f7;
        f7 = partialView.getWidth();
        double d2 = f6 / f7;
        f6 = (float)Math.round(Float.parseFloat(((NumberFormat)cloneable).format(d2)) / f5) * f5;
        float f8 = ((Integer)partialView.getTag()).intValue();
        f5 = 1.0f - f6;
        double d5 = f8 - f5;
        return Float.parseFloat(((NumberFormat)cloneable).format(d5));
    }
}

