/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import java.util.List;

public class AppBarLayout$ScrollingViewBehavior
extends HeaderScrollingViewBehavior {
    public AppBarLayout$ScrollingViewBehavior() {
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = R$styleable.ScrollingViewBehavior_Layout;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n3 = R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop;
        n3 = context.getDimensionPixelSize(n3, 0);
        this.setOverlayTop(n3);
        context.recycle();
    }

    private static int getAppBarLayoutOffset(AppBarLayout object) {
        object = ((CoordinatorLayout$e)object.getLayoutParams()).a;
        boolean bl2 = object instanceof AppBarLayout$BaseBehavior;
        if (bl2) {
            return ((AppBarLayout$BaseBehavior)object).getTopBottomOffsetForScrollingSibling();
        }
        return 0;
    }

    private void offsetChildAsNeeded(View view, View view2) {
        CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)view2.getLayoutParams()).a;
        int n3 = coordinatorLayout$Behavior instanceof AppBarLayout$BaseBehavior;
        if (n3 != 0) {
            coordinatorLayout$Behavior = (AppBarLayout$BaseBehavior)coordinatorLayout$Behavior;
            n3 = view2.getBottom();
            int n4 = view.getTop();
            int n7 = AppBarLayout$BaseBehavior.access$200((AppBarLayout$BaseBehavior)coordinatorLayout$Behavior) + (n3 -= n4);
            n3 = this.getVerticalLayoutGap();
            n7 += n3;
            int n8 = this.getOverlapPixelsForOffset(view2);
            ViewCompat.m(n7 -= n8, view);
        }
    }

    private void updateLiftedStateIfNeeded(View view, View object) {
        boolean bl2 = object instanceof AppBarLayout;
        if (bl2 && (bl2 = ((AppBarLayout)(object = (AppBarLayout)object)).isLiftOnScroll())) {
            boolean bl3 = ((AppBarLayout)object).shouldLift(view);
            ((AppBarLayout)object).setLiftedState(bl3);
        }
    }

    public AppBarLayout findFirstDependency(List list) {
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = (View)list.get(i3);
            boolean bl2 = view instanceof AppBarLayout;
            if (!bl2) continue;
            return (AppBarLayout)view;
        }
        return null;
    }

    public float getOverlapRatioForOffset(View object) {
        int n3 = object instanceof AppBarLayout;
        if (n3 != 0) {
            int n4;
            object = (AppBarLayout)object;
            n3 = ((AppBarLayout)object).getTotalScrollRange();
            int n7 = ((AppBarLayout)object).getDownNestedPreScrollRange();
            int n8 = AppBarLayout$ScrollingViewBehavior.getAppBarLayoutOffset((AppBarLayout)object);
            if (n7 != 0 && (n4 = n3 + n8) <= n7) {
                return 0.0f;
            }
            if ((n3 -= n7) != 0) {
                float f5 = n8;
                float f6 = n3;
                return f5 / f6 + 1.0f;
            }
        }
        return 0.0f;
    }

    public int getScrollRange(View view) {
        boolean bl2 = view instanceof AppBarLayout;
        if (bl2) {
            return ((AppBarLayout)view).getTotalScrollRange();
        }
        return super.getScrollRange(view);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        this.offsetChildAsNeeded(view, view2);
        this.updateLiftedStateIfNeeded(view, view2);
        return false;
    }

    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean bl2 = view2 instanceof AppBarLayout;
        if (bl2) {
            bl2 = false;
            ViewCompat.s((View)coordinatorLayout, null);
        }
    }

    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean bl2) {
        Object object = coordinatorLayout.getDependencies(view);
        if ((object = this.findFirstDependency((List)object)) != null) {
            Rect rect2 = new Rect(rect);
            int n3 = view.getLeft();
            int bl3 = view.getTop();
            rect2.offset(n3, bl3);
            view = this.tempRect1;
            n3 = coordinatorLayout.getWidth();
            int n4 = coordinatorLayout.getHeight();
            view.set(0, 0, n3, n4);
            n4 = (int)(view.contains(rect2) ? 1 : 0);
            if (n4 == 0) {
                boolean bl4 = bl2 ^ true;
                ((AppBarLayout)object).setExpanded(false, bl4);
                return true;
            }
        }
        return false;
    }
}

