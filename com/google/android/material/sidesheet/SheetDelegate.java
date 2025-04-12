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

abstract class SheetDelegate {
    public abstract int calculateInnerMargin(ViewGroup.MarginLayoutParams var1);

    public abstract float calculateSlideOffset(int var1);

    public abstract int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams var1);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract int getMaxViewPositionHorizontal();

    public abstract int getMinViewPositionHorizontal();

    public abstract int getOuterEdge(View var1);

    public abstract int getParentInnerEdge(CoordinatorLayout var1);

    public abstract int getSheetEdge();

    public abstract boolean isExpandingOutwards(float var1);

    public abstract boolean isReleasedCloseToInnerEdge(View var1);

    public abstract boolean isSwipeSignificant(float var1, float var2);

    public abstract boolean shouldHide(View var1, float var2);

    public abstract void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams var1, int var2);

    public abstract void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams var1, int var2, int var3);
}

