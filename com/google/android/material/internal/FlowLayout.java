/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.google.android.material.R$styleable;

public class FlowLayout
extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine = false;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.loadFromAttributes(context, attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        this.loadFromAttributes(context, attributeSet);
    }

    private static int getMeasuredDimension(int n3, int n4, int n7) {
        int n8 = -1 << -1;
        if (n4 != n8) {
            n8 = 0x40000000;
            if (n4 != n8) {
                return n7;
            }
            return n3;
        }
        return Math.min(n7, n3);
    }

    private void loadFromAttributes(Context context, AttributeSet attributeSet) {
        context = context.getTheme();
        int[] nArray = R$styleable.FlowLayout;
        context = context.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n3 = R$styleable.FlowLayout_lineSpacing;
        this.lineSpacing = n3 = context.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.FlowLayout_itemSpacing;
        this.itemSpacing = n3 = context.getDimensionPixelSize(n3, 0);
        context.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(View object) {
        int n3 = R$id.row_index_key;
        if ((n3 = (object = object.getTag(n3)) instanceof Integer) == 0) {
            return -1;
        }
        return (Integer)object;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        int n14;
        n3 = 1;
        n7 = this.getChildCount();
        if (n7 == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = n3;
        n7 = this.getLayoutDirection();
        n7 = n7 == n3 ? 1 : 0;
        int n15 = n7 != 0 ? this.getPaddingRight() : this.getPaddingLeft();
        int n16 = n7 != 0 ? this.getPaddingLeft() : this.getPaddingRight();
        int n17 = this.getPaddingTop();
        n8 = n8 - n4 - n16;
        int n18 = n15;
        n4 = n17;
        for (n16 = 0; n16 < (n14 = this.getChildCount()); n16 += n3) {
            Integer n19;
            int n20;
            View view = this.getChildAt(n16);
            int n21 = view.getVisibility();
            if (n21 == (n20 = 8)) {
                n21 = R$id.row_index_key;
                n20 = -1;
                n19 = n20;
                view.setTag(n21, (Object)n19);
                continue;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            n20 = layoutParams instanceof ViewGroup.MarginLayoutParams;
            if (n20 != 0) {
                layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
                n20 = layoutParams.getMarginStart();
                n21 = layoutParams.getMarginEnd();
            } else {
                n21 = 0;
                layoutParams = null;
                n20 = 0;
                n19 = null;
            }
            int n22 = n18 + n20;
            int n24 = view.getMeasuredWidth() + n22;
            n22 = (int)(this.singleLine ? 1 : 0);
            if (n22 == 0 && n24 > n8) {
                n4 = this.lineSpacing + n17;
                this.rowCount = n17 = this.rowCount + n3;
                n18 = n15;
            }
            n17 = R$id.row_index_key;
            Integer n25 = this.rowCount - n3;
            view.setTag(n17, (Object)n25);
            n17 = n18 + n20;
            n22 = view.getMeasuredWidth() + n17;
            n24 = view.getMeasuredHeight() + n4;
            if (n7 != 0) {
                n17 = n8 - n22;
                n22 = n8 - n18 - n20;
                view.layout(n17, n4, n22, n24);
            } else {
                view.layout(n17, n4, n22, n24);
            }
            n17 = view.getMeasuredWidth() + (n20 += n21);
            n14 = this.itemSpacing;
            n18 += (n17 += n14);
            n17 = n24;
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7;
        FlowLayout flowLayout = this;
        int n8 = View.MeasureSpec.getSize((int)n3);
        int n10 = View.MeasureSpec.getMode((int)n3);
        int n14 = View.MeasureSpec.getSize((int)n4);
        int n15 = View.MeasureSpec.getMode((int)n4);
        int n16 = -1 << -1;
        n16 = n10 != n16 && n10 != (n16 = 0x40000000) ? -1 >>> 1 : n8;
        int n17 = this.getPaddingLeft();
        int n18 = this.getPaddingTop();
        int n19 = this.getPaddingRight();
        n16 -= n19;
        int n20 = n18;
        int n21 = 0;
        for (int i3 = 0; i3 < (n7 = this.getChildCount()); ++i3) {
            int n22;
            int n24;
            View view = flowLayout.getChildAt(i3);
            int n25 = view.getVisibility();
            if (n25 == (n24 = 8)) {
                n25 = n3;
                n24 = n4;
                continue;
            }
            n25 = n3;
            n24 = n4;
            flowLayout.measureChild(view, n3, n4);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            n19 = layoutParams instanceof ViewGroup.MarginLayoutParams;
            if (n19 != 0) {
                layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
                n19 = layoutParams.leftMargin;
                n22 = layoutParams.rightMargin;
            } else {
                n19 = 0;
                n22 = 0;
                layoutParams = null;
            }
            int n26 = n17 + n19;
            int n27 = view.getMeasuredWidth();
            int n28 = n17;
            n17 = n27 + n26;
            if (n17 > n16 && (n17 = (int)(this.isSingleLine() ? 1 : 0)) == 0) {
                n17 = this.getPaddingLeft();
                n20 = flowLayout.lineSpacing + n18;
            } else {
                n17 = n28;
            }
            n18 = n17 + n19;
            n18 = view.getMeasuredWidth() + n18;
            n26 = view.getMeasuredHeight() + n20;
            if (n18 > n21) {
                n21 = n18;
            }
            n18 = view.getMeasuredWidth() + (n19 += n22);
            n19 = flowLayout.itemSpacing;
            n18 = n18 + n19 + n17;
            n17 = this.getChildCount() + -1;
            if (i3 == n17) {
                n21 += n22;
            }
            n17 = n18;
            n18 = n26;
        }
        n16 = this.getPaddingRight() + n21;
        n17 = this.getPaddingBottom() + n18;
        n8 = FlowLayout.getMeasuredDimension(n8, n10, n16);
        n10 = FlowLayout.getMeasuredDimension(n14, n15, n17);
        flowLayout.setMeasuredDimension(n8, n10);
    }

    public void setItemSpacing(int n3) {
        this.itemSpacing = n3;
    }

    public void setLineSpacing(int n3) {
        this.lineSpacing = n3;
    }

    public void setSingleLine(boolean bl2) {
        this.singleLine = bl2;
    }
}

