/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.widget.TextView;

public final class b$d {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int n3, int n4, int n7, int n8) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(n3, n4, n7, n8);
    }

    public static void c(TextView textView, int[] nArray, int n3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n3);
    }

    public static boolean d(TextView textView, String string2) {
        return textView.setFontVariationSettings(string2);
    }
}

