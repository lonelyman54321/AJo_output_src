/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.ViewOffsetHelper;

class ViewOffsetBehavior
extends CoordinatorLayout$Behavior {
    private int tempLeftRightOffset = 0;
    private int tempTopBottomOffset = 0;
    private ViewOffsetHelper viewOffsetHelper;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getLeftAndRightOffset() {
        int n3;
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            n3 = viewOffsetHelper.getLeftAndRightOffset();
        } else {
            n3 = 0;
            viewOffsetHelper = null;
        }
        return n3;
    }

    public int getTopAndBottomOffset() {
        int n3;
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            n3 = viewOffsetHelper.getTopAndBottomOffset();
        } else {
            n3 = 0;
            viewOffsetHelper = null;
        }
        return n3;
    }

    public boolean isHorizontalOffsetEnabled() {
        boolean bl2;
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null && (bl2 = viewOffsetHelper.isHorizontalOffsetEnabled())) {
            bl2 = true;
        } else {
            bl2 = false;
            viewOffsetHelper = null;
        }
        return bl2;
    }

    public boolean isVerticalOffsetEnabled() {
        boolean bl2;
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null && (bl2 = viewOffsetHelper.isVerticalOffsetEnabled())) {
            bl2 = true;
        } else {
            bl2 = false;
            viewOffsetHelper = null;
        }
        return bl2;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int n3) {
        coordinatorLayout.onLayoutChild(view, n3);
    }

    public boolean onLayoutChild(CoordinatorLayout object, View view, int n3) {
        ViewOffsetHelper viewOffsetHelper;
        this.layoutChild((CoordinatorLayout)object, view, n3);
        object = this.viewOffsetHelper;
        if (object == null) {
            this.viewOffsetHelper = object = new ViewOffsetHelper(view);
        }
        this.viewOffsetHelper.onViewLayout();
        object = this.viewOffsetHelper;
        ((ViewOffsetHelper)object).applyOffsets();
        int n4 = this.tempTopBottomOffset;
        view = null;
        if (n4 != 0) {
            viewOffsetHelper = this.viewOffsetHelper;
            viewOffsetHelper.setTopAndBottomOffset(n4);
            this.tempTopBottomOffset = 0;
        }
        if ((n4 = this.tempLeftRightOffset) != 0) {
            viewOffsetHelper = this.viewOffsetHelper;
            viewOffsetHelper.setLeftAndRightOffset(n4);
            this.tempLeftRightOffset = 0;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean bl2) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setHorizontalOffsetEnabled(bl2);
        }
    }

    public boolean setLeftAndRightOffset(int n3) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setLeftAndRightOffset(n3);
        }
        this.tempLeftRightOffset = n3;
        return false;
    }

    public boolean setTopAndBottomOffset(int n3) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setTopAndBottomOffset(n3);
        }
        this.tempTopBottomOffset = n3;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean bl2) {
        ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setVerticalOffsetEnabled(bl2);
        }
    }
}

