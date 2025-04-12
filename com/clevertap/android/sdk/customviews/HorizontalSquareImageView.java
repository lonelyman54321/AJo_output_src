/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ImageView
 */
package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class HorizontalSquareImageView
extends ImageView {
    public HorizontalSquareImageView(Context context) {
        super(context);
    }

    public HorizontalSquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalSquareImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = this.getMeasuredHeight();
        this.setMeasuredDimension(n3, n3);
    }
}

