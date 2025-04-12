/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageView
extends AppCompatImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = this.getMeasuredWidth();
        n4 = this.getMeasuredWidth();
        this.setMeasuredDimension(n3, n4);
    }
}

