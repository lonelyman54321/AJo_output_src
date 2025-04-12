/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout
extends ViewGroup {
    private int baseline = -1;

    public BaselineLayout(Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public int getBaseline() {
        return this.baseline;
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        n3 = this.getChildCount();
        n7 = this.getPaddingLeft();
        n8 -= n4;
        n4 = this.getPaddingRight();
        n8 = n8 - n4 - n7;
        n4 = this.getPaddingTop();
        for (n10 = 0; n10 < n3; ++n10) {
            int n14;
            View view = this.getChildAt(n10);
            int n15 = view.getVisibility();
            if (n15 == (n14 = 8)) continue;
            n15 = view.getMeasuredWidth();
            n14 = view.getMeasuredHeight();
            int n16 = (n8 - n15) / 2 + n7;
            int n17 = this.baseline;
            int n18 = -1;
            if (n17 != n18 && (n17 = view.getBaseline()) != n18) {
                n17 = this.baseline + n4;
                n18 = view.getBaseline();
                n17 -= n18;
            } else {
                n17 = n4;
            }
            view.layout(n16, n17, n15 += n16, n14 += n17);
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7;
        int n8 = this.getChildCount();
        int n10 = -1;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = -1;
        int n18 = -1;
        for (n7 = 0; n7 < n8; ++n7) {
            int n19;
            View view = this.getChildAt(n7);
            int n20 = view.getVisibility();
            if (n20 == (n19 = 8)) continue;
            this.measureChild(view, n3, n4);
            n20 = view.getBaseline();
            if (n20 != n10) {
                n17 = Math.max(n17, n20);
                n19 = view.getMeasuredHeight() - n20;
                n18 = Math.max(n18, n19);
            }
            n20 = view.getMeasuredWidth();
            n15 = Math.max(n15, n20);
            n20 = view.getMeasuredHeight();
            n14 = Math.max(n14, n20);
            int n21 = view.getMeasuredState();
            n16 = View.combineMeasuredStates((int)n16, (int)n21);
        }
        if (n17 != n10) {
            n8 = this.getPaddingBottom();
            n8 = Math.max(n18, n8) + n17;
            n14 = Math.max(n14, n8);
            this.baseline = n17;
        }
        n8 = this.getSuggestedMinimumHeight();
        n8 = Math.max(n14, n8);
        n7 = this.getSuggestedMinimumWidth();
        n3 = View.resolveSizeAndState((int)Math.max(n15, n7), (int)n3, (int)n16);
        n7 = n16 << 16;
        n4 = View.resolveSizeAndState((int)n8, (int)n4, (int)n7);
        this.setMeasuredDimension(n3, n4);
    }
}

