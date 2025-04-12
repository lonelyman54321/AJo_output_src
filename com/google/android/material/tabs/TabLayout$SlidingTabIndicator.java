/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabIndicatorInterpolator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1;

class TabLayout$SlidingTabIndicator
extends LinearLayout {
    ValueAnimator indicatorAnimator;
    private int layoutDirection;
    final /* synthetic */ TabLayout this$0;

    public TabLayout$SlidingTabIndicator(TabLayout tabLayout, Context context) {
        this.this$0 = tabLayout;
        super(context);
        this.layoutDirection = -1;
        this.setWillNotDraw(false);
    }

    public static /* synthetic */ void access$100(TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator) {
        tabLayout$SlidingTabIndicator.jumpIndicatorToSelectedPosition();
    }

    public static /* synthetic */ void access$1800(TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator, View view, View view2, float f5) {
        tabLayout$SlidingTabIndicator.tweenIndicatorPosition(view, view2, f5);
    }

    private void jumpIndicatorToIndicatorPosition() {
        TabLayout tabLayout = this.this$0;
        int n3 = tabLayout.indicatorPosition;
        int n4 = -1;
        if (n3 == n4) {
            tabLayout.indicatorPosition = n3 = tabLayout.getSelectedTabPosition();
        }
        int n7 = this.this$0.indicatorPosition;
        this.jumpIndicatorToPosition(n7);
    }

    private void jumpIndicatorToPosition(int n3) {
        TabLayout tabLayout;
        block2: {
            block3: {
                tabLayout = this.this$0;
                int n4 = TabLayout.access$1600(tabLayout);
                if (n4 == 0) break block2;
                tabLayout = this.this$0.getTabSelectedIndicator().getBounds();
                n4 = ((Rect)tabLayout).left;
                int n7 = -1;
                if (n4 != n7) break block3;
                tabLayout = this.this$0.getTabSelectedIndicator().getBounds();
                n4 = ((Rect)tabLayout).right;
                if (n4 == n7) break block2;
            }
            return;
        }
        tabLayout = this.getChildAt(n3);
        TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.access$1700(this.this$0);
        TabLayout tabLayout2 = this.this$0;
        Drawable drawable2 = tabLayout2.tabSelectedIndicator;
        tabIndicatorInterpolator.setIndicatorBoundsForTab(tabLayout2, (View)tabLayout, drawable2);
        this.this$0.indicatorPosition = n3;
    }

    private void jumpIndicatorToSelectedPosition() {
        int n3 = this.this$0.getSelectedTabPosition();
        this.jumpIndicatorToPosition(n3);
    }

    private void tweenIndicatorPosition(View object, View view, float f5) {
        int n3;
        if (object != null && (n3 = object.getWidth()) > 0) {
            TabLayout tabLayout = this.this$0;
            TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.access$1700(tabLayout);
            TabLayout tabLayout2 = this.this$0;
            Drawable drawable2 = tabLayout2.tabSelectedIndicator;
            tabIndicatorInterpolator.updateIndicatorForOffset(tabLayout2, (View)object, view, f5, drawable2);
        } else {
            object = this.this$0.tabSelectedIndicator;
            view = object.getBounds();
            int n4 = view.top;
            Rect rect = this.this$0.tabSelectedIndicator.getBounds();
            int n7 = rect.bottom;
            n3 = -1;
            object.setBounds(n3, n4, n3, n7);
        }
        object = ViewCompat.a;
        this.postInvalidateOnAnimation();
    }

    private void updateOrRecreateIndicatorAnimation(boolean bl2, int n3, int n4) {
        TabLayout tabLayout = this.this$0;
        int n7 = tabLayout.indicatorPosition;
        if (n7 == n3) {
            return;
        }
        int n8 = tabLayout.getSelectedTabPosition();
        tabLayout = this.getChildAt(n8);
        View view = this.getChildAt(n3);
        if (view == null) {
            this.jumpIndicatorToSelectedPosition();
            return;
        }
        TabLayout tabLayout2 = this.this$0;
        tabLayout2.indicatorPosition = n3;
        TabLayout$SlidingTabIndicator$1 tabLayout$SlidingTabIndicator$1 = new TabLayout$SlidingTabIndicator$1(this, (View)tabLayout, view);
        if (bl2) {
            ValueAnimator valueAnimator;
            this.indicatorAnimator = valueAnimator = new ValueAnimator();
            tabLayout = TabLayout.access$1900(this.this$0);
            valueAnimator.setInterpolator((TimeInterpolator)tabLayout);
            long l2 = n4;
            valueAnimator.setDuration(l2);
            n4 = 2;
            float[] fArray = new float[n4];
            fArray[0] = 0.0f;
            fArray[1] = 1.0f;
            valueAnimator.setFloatValues(fArray);
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)tabLayout$SlidingTabIndicator$1);
            valueAnimator.start();
        } else {
            this.indicatorAnimator.removeAllUpdateListeners();
            ValueAnimator valueAnimator = this.indicatorAnimator;
            valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)tabLayout$SlidingTabIndicator$1);
        }
    }

    public void animateIndicatorToPosition(int n3, int n4) {
        int n7;
        Object object = this.indicatorAnimator;
        if (object != null && (n7 = object.isRunning()) != 0) {
            object = this.this$0;
            n7 = object.indicatorPosition;
            if (n7 != n3) {
                object = this.indicatorAnimator;
                object.cancel();
            }
        }
        this.updateOrRecreateIndicatorAnimation(true, n3, n4);
    }

    public boolean childrenNeedLayout() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            int n4 = view.getWidth();
            if (n4 > 0) continue;
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        int n3;
        Rect rect = this.this$0.tabSelectedIndicator.getBounds();
        int n4 = rect.height();
        if (n4 < 0) {
            rect = this.this$0.tabSelectedIndicator;
            n4 = rect.getIntrinsicHeight();
        }
        TabLayout tabLayout = this.this$0;
        int n7 = tabLayout.tabIndicatorGravity;
        if (n7 != 0) {
            n3 = 1;
            int n8 = 2;
            if (n7 != n3) {
                n3 = 0;
                if (n7 != n8) {
                    n4 = 3;
                    if (n7 != n4) {
                        n4 = 0;
                        rect = null;
                    } else {
                        n4 = this.getHeight();
                    }
                }
            } else {
                n3 = (this.getHeight() - n4) / 2;
                n7 = this.getHeight() + n4;
                n4 = n7 / 2;
            }
        } else {
            n7 = this.getHeight();
            n3 = n7 - n4;
            n4 = this.getHeight();
        }
        if ((n7 = (tabLayout = this.this$0.tabSelectedIndicator.getBounds()).width()) > 0) {
            tabLayout = this.this$0.tabSelectedIndicator.getBounds();
            Drawable drawable2 = this.this$0.tabSelectedIndicator;
            int n10 = ((Rect)tabLayout).left;
            n7 = ((Rect)tabLayout).right;
            drawable2.setBounds(n10, n3, n7, n4);
            rect = this.this$0.tabSelectedIndicator;
            rect.draw(canvas);
        }
        super.draw(canvas);
    }

    /*
     * WARNING - void declaration
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        boolean bl3;
        void var5_7;
        void var4_6;
        boolean bl4;
        int n10;
        super.onLayout(bl2, n10, (int)(bl4 ? 1 : 0), (int)var4_6, (int)var5_7);
        Object object = this.indicatorAnimator;
        if (object != null && (bl3 = object.isRunning())) {
            object = this.this$0;
            int n14 = ((TabLayout)((Object)object)).getSelectedTabPosition();
            n10 = -1;
            bl4 = false;
            this.updateOrRecreateIndicatorAnimation(false, n14, n10);
        } else {
            this.jumpIndicatorToIndicatorPosition();
        }
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        int n7 = View.MeasureSpec.getMode((int)n3);
        int n8 = 0x40000000;
        if (n7 != n8) {
            return;
        }
        TabLayout tabLayout = this.this$0;
        n8 = tabLayout.tabGravity;
        int n10 = 2;
        int n14 = 1;
        if (n8 == n14 || (n7 = tabLayout.mode) == n10) {
            int n15;
            int n16;
            int n17;
            n7 = this.getChildCount();
            n8 = 0;
            float f5 = 0.0f;
            Context context = null;
            int n18 = 0;
            for (n17 = 0; n17 < n7; ++n17) {
                View view = this.getChildAt(n17);
                n16 = view.getVisibility();
                if (n16 != 0) continue;
                n15 = view.getMeasuredWidth();
                n18 = Math.max(n18, n15);
            }
            if (n18 <= 0) {
                return;
            }
            context = this.getContext();
            float f6 = 2.2E-44f;
            f5 = ViewUtils.dpToPx(context, 16);
            n17 = (int)f5;
            n15 = n18 * n7;
            n16 = this.getMeasuredWidth();
            if (n15 <= (n16 -= (n17 *= 2))) {
                n10 = 0;
                while (n8 < n7) {
                    float f7;
                    context = (LinearLayout.LayoutParams)this.getChildAt(n8).getLayoutParams();
                    n15 = context.width;
                    n16 = 0;
                    if (n15 != n18 || (n15 = (int)((f7 = (f6 = context.weight) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0) {
                        context.width = n18;
                        context.weight = 0.0f;
                        n10 = 1;
                    }
                    ++n8;
                }
                n14 = n10;
            } else {
                tabLayout = this.this$0;
                tabLayout.tabGravity = 0;
                tabLayout.updateTabViews(false);
            }
            if (n14 != 0) {
                super.onMeasure(n3, n4);
            }
        }
    }

    public void onRtlPropertiesChanged(int n3) {
        super.onRtlPropertiesChanged(n3);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 < n7 && (n4 = this.layoutDirection) != n3) {
            this.requestLayout();
            this.layoutDirection = n3;
        }
    }

    public void setIndicatorPositionFromTabPosition(int n3, float f5) {
        boolean bl2;
        int n4;
        TabLayout tabLayout = this.this$0;
        float f6 = (float)n3 + f5;
        tabLayout.indicatorPosition = n4 = Math.round(f6);
        tabLayout = this.indicatorAnimator;
        if (tabLayout != null && (bl2 = tabLayout.isRunning())) {
            tabLayout = this.indicatorAnimator;
            tabLayout.cancel();
        }
        tabLayout = this.getChildAt(n3);
        View view = this.getChildAt(++n3);
        this.tweenIndicatorPosition((View)tabLayout, view, f5);
    }

    public void setSelectedIndicatorHeight(int n3) {
        Rect rect = this.this$0.tabSelectedIndicator.getBounds();
        Drawable drawable2 = this.this$0.tabSelectedIndicator;
        int n4 = rect.left;
        int n7 = rect.right;
        drawable2.setBounds(n4, 0, n7, n3);
        this.requestLayout();
    }
}

