/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.slider;

import com.google.android.material.slider.LabelFormatter;
import java.util.Locale;

public final class BasicLabelFormatter
implements LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    public String getFormattedValue(float f5) {
        int n3 = 1;
        float f6 = 1.0E12f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object >= 0) {
            Locale locale = Locale.US;
            Float f8 = Float.valueOf(f5 / f6);
            Object[] objectArray = new Object[n3];
            objectArray[0] = f8;
            return String.format(locale, "%.1fT", objectArray);
        }
        f6 = 1.0E9f;
        float f11 = f5 - f6;
        object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object >= 0) {
            Locale locale = Locale.US;
            Float f12 = Float.valueOf(f5 / f6);
            Object[] objectArray = new Object[n3];
            objectArray[0] = f12;
            return String.format(locale, "%.1fB", objectArray);
        }
        f6 = 1000000.0f;
        float f14 = f5 - f6;
        object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (object >= 0) {
            Locale locale = Locale.US;
            Float f15 = Float.valueOf(f5 / f6);
            Object[] objectArray = new Object[n3];
            objectArray[0] = f15;
            return String.format(locale, "%.1fM", objectArray);
        }
        f6 = 1000.0f;
        float f16 = f5 - f6;
        object = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (object >= 0) {
            Locale locale = Locale.US;
            Float f17 = Float.valueOf(f5 / f6);
            Object[] objectArray = new Object[n3];
            objectArray[0] = f17;
            return String.format(locale, "%.1fK", objectArray);
        }
        Locale locale = Locale.US;
        Float f18 = Float.valueOf(f5);
        Object[] objectArray = new Object[n3];
        objectArray[0] = f18;
        return String.format(locale, "%.0f", objectArray);
    }
}

