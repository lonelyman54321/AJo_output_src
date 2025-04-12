/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 */
package com.ril.ajio.notifications;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class AspectFitImageView
extends AppCompatImageView {
    public AspectFitImageView(Context context) {
        super(context);
    }

    public AspectFitImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AspectFitImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onMeasure(int n3, int n4) {
        try {
            Drawable drawable2 = this.getDrawable();
            if (drawable2 == null) {
                boolean bl2 = false;
                drawable2 = null;
                this.setMeasuredDimension(0, 0);
                return;
            }
            int n7 = View.MeasureSpec.getSize((int)n3);
            int n8 = View.MeasureSpec.getSize((int)n4);
            if (n8 == 0 && n7 == 0) {
                this.setMeasuredDimension(n7, n8);
                return;
            }
            if (n8 == 0) {
                n8 = drawable2.getIntrinsicHeight() * n7;
                int n10 = drawable2.getIntrinsicWidth();
                this.setMeasuredDimension(n7, n8 /= n10);
                return;
            }
            if (n7 == 0) {
                n7 = drawable2.getIntrinsicWidth() * n8;
                int n14 = drawable2.getIntrinsicHeight();
                this.setMeasuredDimension(n7 /= n14, n8);
                return;
            }
            this.setMeasuredDimension(n7, n8);
            return;
        }
        catch (Exception exception) {
            super.onMeasure(n3, n4);
        }
    }
}

