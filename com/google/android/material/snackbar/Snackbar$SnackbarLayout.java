/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;

public final class Snackbar$SnackbarLayout
extends BaseTransientBottomBar$SnackbarBaseLayout {
    public Snackbar$SnackbarLayout(Context context) {
        super(context);
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = this.getChildCount();
        n4 = this.getMeasuredWidth();
        int n7 = this.getPaddingLeft();
        n4 -= n7;
        n7 = this.getPaddingRight();
        n4 -= n7;
        for (n7 = 0; n7 < n3; ++n7) {
            View view = this.getChildAt(n7);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int n8 = layoutParams.width;
            int n10 = -1;
            if (n8 != n10) continue;
            n8 = 0x40000000;
            n10 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n8);
            int n14 = view.getMeasuredHeight();
            n8 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)n8);
            view.measure(n10, n8);
        }
    }
}

