/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import com.google.android.material.appbar.ViewOffsetBehavior;
import java.util.List;

abstract class HeaderScrollingViewBehavior
extends ViewOffsetBehavior {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        Rect rect;
        this.tempRect1 = rect = new Rect();
        this.tempRect2 = rect = new Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super();
        this.tempRect1 = context;
        super();
        this.tempRect2 = context;
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int n3) {
        if (n3 == 0) {
            n3 = 0x800033;
        }
        return n3;
    }

    public abstract View findFirstDependency(List var1);

    public final int getOverlapPixelsForOffset(View view) {
        int n3 = this.overlayTop;
        int n4 = 0;
        if (n3 != 0) {
            float f5 = this.getOverlapRatioForOffset(view);
            n3 = this.overlayTop;
            float f6 = n3;
            int n7 = (int)(f5 *= f6);
            n4 = PK1.b(n7, 0, n3);
        }
        return n4;
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int n3) {
        List list = coordinatorLayout.getDependencies(view);
        if ((list = this.findFirstDependency(list)) != null) {
            int n4;
            CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
            Rect rect = this.tempRect1;
            int n7 = coordinatorLayout.getPaddingLeft();
            int n8 = coordinatorLayout$e.leftMargin;
            n7 += n8;
            n8 = list.getBottom();
            int n10 = coordinatorLayout$e.topMargin;
            n8 += n10;
            n10 = coordinatorLayout.getWidth();
            int n14 = coordinatorLayout.getPaddingRight();
            n10 -= n14;
            n14 = coordinatorLayout$e.rightMargin;
            n10 -= n14;
            n14 = coordinatorLayout.getHeight();
            int n15 = list.getBottom() + n14;
            n14 = coordinatorLayout.getPaddingBottom();
            n15 -= n14;
            n14 = coordinatorLayout$e.bottomMargin;
            rect.set(n7, n8, n10, n15 -= n14);
            f f5 = coordinatorLayout.getLastWindowInsets();
            if (f5 != null) {
                n4 = coordinatorLayout.getFitsSystemWindows();
                if (n4 != 0 && (n4 = view.getFitsSystemWindows()) == 0) {
                    n4 = rect.left;
                    rect.left = n8 = f5.b() + n4;
                    n4 = rect.right;
                    n7 = f5.c();
                    rect.right = n4 -= n7;
                }
            }
            coordinatorLayout = this.tempRect2;
            n7 = HeaderScrollingViewBehavior.resolveGravity(coordinatorLayout$e.c);
            n8 = view.getMeasuredWidth();
            n10 = view.getMeasuredHeight();
            n15 = n3;
            Gravity.apply((int)n7, (int)n8, (int)n10, (Rect)rect, (Rect)coordinatorLayout, (int)n3);
            n3 = this.getOverlapPixelsForOffset((View)list);
            int n16 = ((Rect)coordinatorLayout).left;
            n7 = ((Rect)coordinatorLayout).top - n3;
            n8 = ((Rect)coordinatorLayout).right;
            n10 = ((Rect)coordinatorLayout).bottom - n3;
            view.layout(n16, n7, n8, n10);
            n4 = ((Rect)coordinatorLayout).top;
            int n17 = list.getBottom();
            this.verticalLayoutGap = n4 -= n17;
        } else {
            super.layoutChild(coordinatorLayout, view, n3);
            boolean bl2 = false;
            coordinatorLayout = null;
            this.verticalLayoutGap = 0;
        }
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, int n7, int n8) {
        block10: {
            float f5;
            int n10;
            int n14;
            int n15;
            block9: {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                n15 = layoutParams.height;
                n14 = -1;
                if (n15 == n14) break block9;
                n10 = -2;
                f5 = 0.0f / 0.0f;
                if (n15 != n10) break block10;
            }
            List list = coordinatorLayout.getDependencies(view);
            if ((list = this.findFirstDependency(list)) != null) {
                int n16;
                int n17;
                Object object;
                if ((n7 = View.MeasureSpec.getSize((int)n7)) > 0) {
                    object = ViewCompat.a;
                    n17 = list.getFitsSystemWindows();
                    if (n17 != 0 && (object = coordinatorLayout.getLastWindowInsets()) != null) {
                        n16 = ((f)object).d();
                        n17 = ((f)object).a() + n16;
                        n7 += n17;
                    }
                } else {
                    n7 = coordinatorLayout.getHeight();
                }
                n17 = this.getScrollRange((View)list);
                n7 += n17;
                n10 = list.getMeasuredHeight();
                n17 = (int)(this.shouldHeaderOverlapScrollingChild() ? 1 : 0);
                if (n17 != 0) {
                    n10 = -n10;
                    f5 = n10;
                    view.setTranslationY(f5);
                } else {
                    n17 = 0;
                    object = null;
                    view.setTranslationY(0.0f);
                    n7 -= n10;
                }
                n15 = n15 == n14 ? 0x40000000 : -1 << -1;
                int n18 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n15);
                list = view;
                n17 = n3;
                n16 = n4;
                coordinatorLayout.onMeasureChild(view, n3, n4, n18, n8);
                return true;
            }
        }
        return false;
    }

    public final void setOverlayTop(int n3) {
        this.overlayTop = n3;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }
}

