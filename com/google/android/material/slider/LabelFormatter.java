/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.slider;

public interface LabelFormatter {
    public static final int LABEL_FLOATING = 0;
    public static final int LABEL_GONE = 2;
    public static final int LABEL_VISIBLE = 3;
    public static final int LABEL_WITHIN_BOUNDS = 1;

    public String getFormattedValue(float var1);
}

