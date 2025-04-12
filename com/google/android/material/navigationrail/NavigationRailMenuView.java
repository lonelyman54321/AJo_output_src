/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigationrail.NavigationRailItemView;

public class NavigationRailMenuView
extends NavigationBarMenuView {
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams;
        int n3;
        this.itemMinimumHeight = n3 = -1;
        this.layoutParams = layoutParams = new FrameLayout.LayoutParams(n3, -2);
        layoutParams.gravity = 49;
        this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int n3, int n4, int n7) {
        n7 = Math.max(1, n7);
        n4 /= n7;
        n7 = this.itemMinimumHeight;
        int n8 = -1;
        if (n7 == n8) {
            n7 = View.MeasureSpec.getSize((int)n3);
        }
        return View.MeasureSpec.makeMeasureSpec((int)Math.min(n7, n4), (int)0);
    }

    private int measureChildHeight(View view, int n3, int n4) {
        int n7;
        int n8 = view.getVisibility();
        if (n8 != (n7 = 8)) {
            view.measure(n3, n4);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int n3, int n4, int n7, View view) {
        n4 = view == null ? this.makeSharedHeightSpec(n3, n4, n7) : View.MeasureSpec.makeMeasureSpec((int)view.getMeasuredHeight(), (int)0);
        n7 = this.getChildCount();
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            View view2 = this.getChildAt(i3);
            if (view2 == view) continue;
            int n10 = this.measureChildHeight(view2, n3, n4);
            n8 += n10;
        }
        return n8;
    }

    private int measureShiftingChildHeights(int n3, int n4, int n7) {
        int n8;
        int n10 = this.getSelectedItemPosition();
        View view = this.getChildAt(n10);
        if (view != null) {
            n8 = this.makeSharedHeightSpec(n3, n4, n7);
            n8 = this.measureChildHeight(view, n3, n8);
            n4 -= n8;
            n7 += -1;
        } else {
            n8 = 0;
        }
        n3 = this.measureSharedChildHeights(n3, n4, n7, view);
        return n8 + n3;
    }

    public NavigationBarItemView createNavigationBarItemView(Context context) {
        NavigationRailItemView navigationRailItemView = new NavigationRailItemView(context);
        return navigationRailItemView;
    }

    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    public boolean isTopGravity() {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        int n3 = layoutParams.gravity & 0x70;
        int n4 = 48;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            layoutParams = null;
        }
        return n3 != 0;
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        n3 = this.getChildCount();
        n8 -= n4;
        n4 = 0;
        n10 = 0;
        for (n7 = 0; n7 < n3; ++n7) {
            int n14;
            View view = this.getChildAt(n7);
            int n15 = view.getVisibility();
            if (n15 == (n14 = 8)) continue;
            n15 = view.getMeasuredHeight() + n10;
            view.layout(0, n10, n8, n15);
            n10 = n15;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void onMeasure(int var1_1, int var2_2) {
        var3_3 = View.MeasureSpec.getSize((int)var2_2);
        var4_4 = this.getMenu().getVisibleItems();
        var5_5 = var4_4.size();
        if (var5_5 <= (var6_6 = 1)) ** GOTO lbl-1000
        var6_6 = this.getLabelVisibilityMode();
        if ((var6_6 = (int)this.isShifting(var6_6, var5_5)) != 0) {
            var3_3 = this.measureShiftingChildHeights(var1_1, var3_3, var5_5);
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = 0;
            var3_3 = this.measureSharedChildHeights(var1_1, var3_3, var5_5, null);
        }
        var1_1 = View.MeasureSpec.getSize((int)var1_1);
        var2_2 = View.resolveSizeAndState((int)var3_3, (int)var2_2, (int)0);
        this.setMeasuredDimension(var1_1, var2_2);
    }

    public void setItemMinimumHeight(int n3) {
        int n4 = this.itemMinimumHeight;
        if (n4 != n3) {
            this.itemMinimumHeight = n3;
            this.requestLayout();
        }
    }

    public void setMenuGravity(int n3) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        int n4 = layoutParams.gravity;
        if (n4 != n3) {
            layoutParams.gravity = n3;
            this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
    }
}

