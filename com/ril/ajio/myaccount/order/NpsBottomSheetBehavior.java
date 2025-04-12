/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.ril.ajio.myaccount.order;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class NpsBottomSheetBehavior
extends BottomSheetBehavior {
    public NpsBottomSheetBehavior() {
    }

    public NpsBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f6) {
        return false;
    }

    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int[] nArray) {
    }

    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3) {
        return false;
    }

    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}

