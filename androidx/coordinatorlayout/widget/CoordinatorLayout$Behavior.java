/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$BaseSavedState
 */
package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.f;

public abstract class CoordinatorLayout$Behavior {
    public CoordinatorLayout$Behavior() {
    }

    public CoordinatorLayout$Behavior(Context context, AttributeSet attributeSet) {
    }

    public static Object getTag(View view) {
        return ((CoordinatorLayout$e)view.getLayoutParams()).r;
    }

    public static void setTag(View view, Object object) {
        ((CoordinatorLayout$e)view.getLayoutParams()).r = object;
    }

    public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
        float f5 = this.getScrimOpacity(coordinatorLayout, view);
        view = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
            coordinatorLayout = null;
        }
        return (boolean)object;
    }

    public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
        return -16777216;
    }

    public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public f onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, f f5) {
        return f5;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout$e coordinatorLayout$e) {
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int n3) {
        return false;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, int n7, int n8) {
        return false;
    }

    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f6, boolean bl2) {
        return false;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f6) {
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int[] nArray) {
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int[] nArray, int n7) {
        if (n7 == 0) {
            this.onNestedPreScroll(coordinatorLayout, view, view2, n3, n4, nArray);
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int n7, int n8) {
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int n7, int n8, int n10) {
        if (n10 == 0) {
            this.onNestedScroll(coordinatorLayout, view, view2, n3, n4, n7, n8);
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        int n14;
        nArray[0] = n14 = nArray[0] + n7;
        int n15 = 1;
        nArray[n15] = n14 = nArray[n15] + n8;
        this.onNestedScroll(coordinatorLayout, view, view2, n3, n4, n7, n8, n10);
    }

    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3) {
    }

    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3, int n4) {
        if (n4 == 0) {
            this.onNestedScrollAccepted(coordinatorLayout, view, view2, view3, n3);
        }
    }

    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean bl2) {
        return false;
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3) {
        return false;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3, int n4) {
        if (n4 == 0) {
            return this.onStartNestedScroll(coordinatorLayout, view, view2, view3, n3);
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3) {
        if (n3 == 0) {
            this.onStopNestedScroll(coordinatorLayout, view, view2);
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}

