/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SheetDelegate;
import com.google.android.material.sidesheet.SheetUtils;
import com.google.android.material.sidesheet.SideSheetBehavior;

final class LeftSheetDelegate
extends SheetDelegate {
    final SideSheetBehavior sheetBehavior;

    public LeftSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    public int calculateInnerMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    public float calculateSlideOffset(int n3) {
        float f5 = this.getHiddenOffset();
        float f6 = (float)this.getExpandedOffset() - f5;
        return ((float)n3 - f5) / f6;
    }

    public int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    public int getExpandedOffset() {
        int n3 = this.sheetBehavior.getParentInnerEdge();
        int n4 = this.sheetBehavior.getInnerMargin() + n3;
        return Math.max(0, n4);
    }

    public int getHiddenOffset() {
        int n3 = -this.sheetBehavior.getChildWidth();
        int n4 = this.sheetBehavior.getInnerMargin();
        return n3 - n4;
    }

    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getInnerMargin();
    }

    public int getMinViewPositionHorizontal() {
        return -this.sheetBehavior.getChildWidth();
    }

    public int getOuterEdge(View view) {
        int n3 = view.getRight();
        return this.sheetBehavior.getInnerMargin() + n3;
    }

    public int getParentInnerEdge(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    public int getSheetEdge() {
        return 1;
    }

    public boolean isExpandingOutwards(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public boolean isReleasedCloseToInnerEdge(View view) {
        int n3 = view.getRight();
        int n4 = this.getExpandedOffset();
        int n7 = this.getHiddenOffset();
        if (n3 < (n4 = (n4 - n7) / 2)) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3;
    }

    public boolean isSwipeSignificant(float f5, float f6) {
        SideSheetBehavior sideSheetBehavior;
        float f7;
        int n3;
        int n4 = SheetUtils.isSwipeMostlyHorizontal(f5, f6);
        if (n4 != 0 && (n3 = (f7 = (f5 = Math.abs(f5)) - (f6 = (float)(n4 = (sideSheetBehavior = this.sheetBehavior).getSignificantVelocityThreshold()))) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n3 != 0;
    }

    public boolean shouldHide(View view, float f5) {
        SideSheetBehavior sideSheetBehavior;
        float f6 = view.getLeft();
        SideSheetBehavior sideSheetBehavior2 = this.sheetBehavior;
        float f7 = sideSheetBehavior2.getHideFriction() * f5 + f6;
        f6 = Math.abs(f7);
        float f8 = f6 - (f5 = (sideSheetBehavior = this.sheetBehavior).getHideThreshold());
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
            view = null;
        }
        return (boolean)object;
    }

    public void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams, int n3) {
        marginLayoutParams.leftMargin = n3;
    }

    public void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int n3, int n4) {
        SideSheetBehavior sideSheetBehavior = this.sheetBehavior;
        int n7 = sideSheetBehavior.getParentWidth();
        if (n3 <= n7) {
            marginLayoutParams.leftMargin = n4;
        }
    }
}

