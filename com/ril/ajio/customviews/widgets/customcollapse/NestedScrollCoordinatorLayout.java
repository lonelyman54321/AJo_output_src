/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets.customcollapse;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class NestedScrollCoordinatorLayout
extends CoordinatorLayout
implements uU1 {
    private vU1 mChildHelper;

    public NestedScrollCoordinatorLayout(Context object) {
        super((Context)object);
        super((View)this);
        this.mChildHelper = object;
        this.setNestedScrollingEnabled(true);
    }

    public NestedScrollCoordinatorLayout(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        super((View)this);
        this.mChildHelper = object;
        this.setNestedScrollingEnabled(true);
    }

    public NestedScrollCoordinatorLayout(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        super((View)this);
        this.mChildHelper = object;
        this.setNestedScrollingEnabled(true);
    }

    public boolean dispatchNestedFling(float f5, float f6, boolean bl2) {
        return this.mChildHelper.a(f5, f6, bl2);
    }

    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.mChildHelper.b(f5, f6);
    }

    public boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2) {
        return this.mChildHelper.c(n3, n4, nArray, nArray2, 0);
    }

    public boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2, int n7) {
        return this.mChildHelper.c(n3, n4, nArray, nArray2, n7);
    }

    public boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray) {
        return this.mChildHelper.e(n3, n4, n7, n8, nArray, 0, null);
    }

    public boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray, int n10) {
        return this.mChildHelper.e(n3, n4, n7, n8, nArray, n10, null);
    }

    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.g(0);
    }

    public boolean hasNestedScrollingParent(int n3) {
        return this.mChildHelper.g(n3);
    }

    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.d;
    }

    public boolean onNestedFling(View view, float f5, float f6, boolean bl2) {
        boolean bl3 = super.onNestedFling(view, f5, f6, bl2);
        boolean bl4 = this.dispatchNestedFling(f5, f6, bl2);
        if (!bl4 && !bl3) {
            bl3 = false;
            view = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }

    public boolean onNestedPreFling(View view, float f5, float f6) {
        boolean bl2 = super.onNestedPreFling(view, f5, f6);
        boolean bl3 = this.dispatchNestedPreFling(f5, f6);
        if (!bl3 && !bl2) {
            bl2 = false;
            view = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public void onNestedPreScroll(View view, int n3, int n4, int[] nArray) {
        this.dispatchNestedPreScroll(n3, n4, nArray, null);
        int n7 = nArray[1];
        if (n7 == 0) {
            super.onNestedPreScroll(view, n3, n4, nArray, 0);
        }
    }

    public void onNestedPreScroll(View view, int n3, int n4, int[] nArray, int n7) {
        this.dispatchNestedPreScroll(n3, n4, nArray, null, n7);
        int n8 = nArray[1];
        if (n8 == 0) {
            super.onNestedPreScroll(view, n3, n4, nArray, n7);
        }
    }

    public void onNestedScroll(View view, int n3, int n4, int n7, int n8) {
        super.onNestedScroll(view, n3, n4, n7, n8);
        this.dispatchNestedScroll(n3, n4, n7, n8, null);
    }

    public void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10) {
        super.onNestedScroll(view, n3, n4, n7, n8, n10);
        this.dispatchNestedScroll(n3, n4, n7, n8, null, n10);
    }

    public boolean onStartNestedScroll(View view, View view2, int n3) {
        boolean bl2 = super.onStartNestedScroll(view, view2, n3);
        boolean bl3 = this.startNestedScroll(n3);
        if (!bl3 && !bl2) {
            bl2 = false;
            view = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean onStartNestedScroll(View view, View view2, int n3, int n4) {
        boolean bl2 = super.onStartNestedScroll(view, view2, n3, n4);
        boolean bl3 = this.startNestedScroll(n3, n4);
        if (!bl3 && !bl2) {
            bl2 = false;
            view = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public void onStopNestedScroll(View view) {
        super.onStopNestedScroll(view);
        this.stopNestedScroll();
    }

    public void onStopNestedScroll(View view, int n3) {
        super.onStopNestedScroll(view, n3);
        this.stopNestedScroll(n3);
    }

    public void setNestedScrollingEnabled(boolean bl2) {
        this.mChildHelper.h(bl2);
    }

    public boolean startNestedScroll(int n3) {
        return this.mChildHelper.i(n3, 0);
    }

    public boolean startNestedScroll(int n3, int n4) {
        return this.mChildHelper.i(n3, n4);
    }

    public void stopNestedScroll() {
        this.mChildHelper.j(0);
    }

    public void stopNestedScroll(int n3) {
        this.mChildHelper.j(n3);
    }
}

