/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.Spanned
 */
package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

class MaxInputValidator
implements InputFilter {
    private int max;

    public MaxInputValidator(int n3) {
        this.max = n3;
    }

    public CharSequence filter(CharSequence charSequence, int n3, int n4, Spanned spanned, int n7, int n8) {
        StringBuilder stringBuilder;
        try {
            stringBuilder = new StringBuilder((CharSequence)spanned);
        }
        catch (NumberFormatException numberFormatException) {}
        charSequence = charSequence.subSequence(n3, n4);
        charSequence = charSequence.toString();
        stringBuilder.replace(n7, n8, (String)charSequence);
        charSequence = stringBuilder.toString();
        int n10 = Integer.parseInt((String)charSequence);
        n3 = this.max;
        if (n10 <= n3) {
            return null;
        }
        return "";
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int n3) {
        this.max = n3;
    }
}

