/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class AjioAspectRatioImageView
extends AppCompatImageView {
    public AjioAspectRatioImageView(Context context) {
        super(context);
    }

    public AjioAspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AjioAspectRatioImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public void onMeasure(int n3, int n4) {
        Drawable drawable2 = this.getDrawable();
        if (drawable2 != null) {
            int n7 = View.MeasureSpec.getSize((int)n3);
            int n8 = drawable2.getIntrinsicWidth();
            if (n8 > 0) {
                n3 = drawable2.getIntrinsicHeight() * n7 / n8;
                this.setMeasuredDimension(n7, n3);
            } else {
                super.onMeasure(n3, n4);
            }
        } else {
            super.onMeasure(n3, n4);
        }
    }
}

