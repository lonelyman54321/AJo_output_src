/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  android.widget.LinearLayout$LayoutParams
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout$ChildScrollEffect;
import com.google.android.material.appbar.AppBarLayout$CompressChildScrollEffect;

public class AppBarLayout$LayoutParams
extends LinearLayout.LayoutParams {
    static final int COLLAPSIBLE_FLAGS = 10;
    static final int FLAG_QUICK_RETURN = 5;
    static final int FLAG_SNAP = 17;
    public static final int SCROLL_EFFECT_COMPRESS = 1;
    public static final int SCROLL_EFFECT_NONE = 0;
    public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
    public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
    public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
    public static final int SCROLL_FLAG_NO_SCROLL = 0;
    public static final int SCROLL_FLAG_SCROLL = 1;
    public static final int SCROLL_FLAG_SNAP = 16;
    public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
    private AppBarLayout$ChildScrollEffect scrollEffect;
    int scrollFlags = 1;
    Interpolator scrollInterpolator;

    public AppBarLayout$LayoutParams(int n3, int n4) {
        super(n3, n4);
    }

    public AppBarLayout$LayoutParams(int n3, int n4, float f5) {
        super(n3, n4, f5);
    }

    public AppBarLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] nArray = R$styleable.AppBarLayout_Layout;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
        int n3 = R$styleable.AppBarLayout_Layout_layout_scrollFlags;
        this.scrollFlags = n3 = attributeSet.getInt(n3, 0);
        n3 = R$styleable.AppBarLayout_Layout_layout_scrollEffect;
        n3 = attributeSet.getInt(n3, 0);
        this.setScrollEffect(n3);
        n3 = R$styleable.AppBarLayout_Layout_layout_scrollInterpolator;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            n3 = attributeSet.getResourceId(n3, 0);
            context = AnimationUtils.loadInterpolator((Context)context, (int)n3);
            this.scrollInterpolator = context;
        }
        attributeSet.recycle();
    }

    public AppBarLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AppBarLayout$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public AppBarLayout$LayoutParams(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AppBarLayout$LayoutParams(AppBarLayout$LayoutParams appBarLayout$LayoutParams) {
        super((LinearLayout.LayoutParams)appBarLayout$LayoutParams);
        AppBarLayout$ChildScrollEffect appBarLayout$ChildScrollEffect;
        int n3;
        this.scrollFlags = n3 = appBarLayout$LayoutParams.scrollFlags;
        this.scrollEffect = appBarLayout$ChildScrollEffect = appBarLayout$LayoutParams.scrollEffect;
        appBarLayout$LayoutParams = appBarLayout$LayoutParams.scrollInterpolator;
        this.scrollInterpolator = appBarLayout$LayoutParams;
    }

    private AppBarLayout$ChildScrollEffect createScrollEffectFromInt(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            return null;
        }
        AppBarLayout$CompressChildScrollEffect appBarLayout$CompressChildScrollEffect = new AppBarLayout$CompressChildScrollEffect();
        return appBarLayout$CompressChildScrollEffect;
    }

    public AppBarLayout$ChildScrollEffect getScrollEffect() {
        return this.scrollEffect;
    }

    public int getScrollFlags() {
        return this.scrollFlags;
    }

    public Interpolator getScrollInterpolator() {
        return this.scrollInterpolator;
    }

    public boolean isCollapsible() {
        int n3 = this.scrollFlags;
        int n4 = n3 & 1;
        int n7 = 1;
        if (n4 != n7 || (n3 &= 0xA) == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public void setScrollEffect(int n3) {
        AppBarLayout$ChildScrollEffect appBarLayout$ChildScrollEffect;
        this.scrollEffect = appBarLayout$ChildScrollEffect = this.createScrollEffectFromInt(n3);
    }

    public void setScrollEffect(AppBarLayout$ChildScrollEffect appBarLayout$ChildScrollEffect) {
        this.scrollEffect = appBarLayout$ChildScrollEffect;
    }

    public void setScrollFlags(int n3) {
        this.scrollFlags = n3;
    }

    public void setScrollInterpolator(Interpolator interpolator2) {
        this.scrollInterpolator = interpolator2;
    }
}

