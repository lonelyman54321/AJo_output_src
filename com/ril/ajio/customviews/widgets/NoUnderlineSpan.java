/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.text.TextPaint
 *  android.text.style.UnderlineSpan
 */
package com.ril.ajio.customviews.widgets;

import android.os.Parcel;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;

public class NoUnderlineSpan
extends UnderlineSpan {
    public NoUnderlineSpan() {
    }

    public NoUnderlineSpan(Parcel parcel) {
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}

