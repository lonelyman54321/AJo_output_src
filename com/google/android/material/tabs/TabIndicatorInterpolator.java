/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$TabView;

class TabIndicatorInterpolator {
    private static final int MIN_INDICATOR_WIDTH = 24;

    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, View view) {
        if (view == null) {
            tabLayout = new RectF();
            return tabLayout;
        }
        boolean bl2 = tabLayout.isTabIndicatorFullWidth();
        if (!bl2 && (bl2 = view instanceof TabLayout$TabView)) {
            return TabIndicatorInterpolator.calculateTabViewContentBounds((TabLayout$TabView)view, 24);
        }
        float f5 = view.getLeft();
        float f6 = view.getTop();
        float f7 = view.getRight();
        float f8 = view.getBottom();
        tabLayout = new RectF(f5, f6, f7, f8);
        return tabLayout;
    }

    public static RectF calculateTabViewContentBounds(TabLayout$TabView tabLayout$TabView, int n3) {
        int n4 = tabLayout$TabView.getContentWidth();
        int n7 = tabLayout$TabView.getContentHeight();
        Context context = tabLayout$TabView.getContext();
        float f5 = ViewUtils.dpToPx(context, n3);
        n3 = (int)f5;
        if (n4 < n3) {
            n4 = n3;
        }
        n3 = tabLayout$TabView.getLeft();
        int n8 = (tabLayout$TabView.getRight() + n3) / 2;
        n3 = tabLayout$TabView.getTop();
        int n10 = (tabLayout$TabView.getBottom() + n3) / 2;
        n3 = n8 - (n4 /= 2);
        n7 /= 2;
        n7 = n10 - n7;
        n4 += n8;
        n8 = n8 / 2 + n10;
        f5 = n3;
        float f6 = n7;
        float f7 = n4;
        float f8 = n8;
        tabLayout$TabView = new RectF(f5, f6, f7, f8);
        return tabLayout$TabView;
    }

    public void setIndicatorBoundsForTab(TabLayout tabLayout, View view, Drawable drawable2) {
        tabLayout = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        int n3 = (int)((RectF)tabLayout).left;
        int n4 = drawable2.getBounds().top;
        int n7 = (int)((RectF)tabLayout).right;
        int n8 = drawable2.getBounds().bottom;
        drawable2.setBounds(n3, n4, n7, n8);
    }

    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable2) {
        view = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        tabLayout = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view2);
        int n3 = (int)view.left;
        int n4 = (int)((RectF)tabLayout).left;
        n3 = AnimationUtils.lerp(n3, n4, f5);
        n4 = drawable2.getBounds().top;
        int n7 = (int)view.right;
        int n8 = (int)((RectF)tabLayout).right;
        n8 = AnimationUtils.lerp(n7, n8, f5);
        n7 = drawable2.getBounds().bottom;
        drawable2.setBounds(n3, n4, n8, n7);
    }
}

