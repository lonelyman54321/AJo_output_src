/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailMenuView;
import com.google.android.material.navigationrail.NavigationRailView$1;
import com.google.android.material.resources.MaterialResources;

public class NavigationRailView
extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = 255;
    private View headerView;
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingStartSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;
    private final int topMargin;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.navigationRailStyle;
        this(context, attributeSet, n3);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int n3) {
        int n4 = R$style.Widget_MaterialComponents_NavigationRailView;
        this(context, attributeSet, n3, n4);
    }

    public NavigationRailView(Context context, AttributeSet object, int n3, int n4) {
        super(context, (AttributeSet)object, n3, n4);
        Boolean bl2;
        int n7;
        float f5 = 0.0f;
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        context = this.getResources();
        int n8 = R$dimen.mtrl_navigation_rail_margin;
        this.topMargin = n7 = context.getDimensionPixelSize(n8);
        context = this.getContext();
        int[] nArray = R$styleable.NavigationRailView;
        int[] nArray2 = new int[]{};
        object = ThemeEnforcement.obtainTintedStyledAttributes(context, (AttributeSet)object, nArray, n3, n4, nArray2);
        n3 = R$styleable.NavigationRailView_headerLayout;
        TypedArray typedArray = ((Tn3)object).b;
        n3 = typedArray.getResourceId(n3, 0);
        if (n3 != 0) {
            this.addHeaderView(n3);
        }
        n3 = R$styleable.NavigationRailView_menuGravity;
        typedArray = ((Tn3)object).b;
        n8 = 49;
        float f6 = 6.9E-44f;
        n3 = typedArray.getInt(n3, n8);
        this.setMenuGravity(n3);
        n3 = R$styleable.NavigationRailView_itemMinHeight;
        n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.NavigationRailView_itemMinHeight;
            n8 = -1;
            f6 = 0.0f / 0.0f;
            n3 = typedArray.getDimensionPixelSize(n3, n8);
            this.setItemMinimumHeight(n3);
        }
        n3 = R$styleable.NavigationRailView_paddingTopSystemWindowInsets;
        if ((n3 = (int)(typedArray.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.NavigationRailView_paddingTopSystemWindowInsets;
            n3 = (int)(typedArray.getBoolean(n3, false) ? 1 : 0);
            this.paddingTopSystemWindowInsets = bl2 = Boolean.valueOf(n3 != 0);
        }
        n3 = R$styleable.NavigationRailView_paddingBottomSystemWindowInsets;
        if ((n3 = (int)(typedArray.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.NavigationRailView_paddingBottomSystemWindowInsets;
            n3 = (int)(typedArray.getBoolean(n3, false) ? 1 : 0);
            this.paddingBottomSystemWindowInsets = bl2 = Boolean.valueOf(n3 != 0);
        }
        n3 = R$styleable.NavigationRailView_paddingStartSystemWindowInsets;
        if ((n3 = (int)(typedArray.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.NavigationRailView_paddingStartSystemWindowInsets;
            n3 = (int)(typedArray.getBoolean(n3, false) ? 1 : 0);
            this.paddingStartSystemWindowInsets = bl2 = Boolean.valueOf(n3 != 0);
        }
        bl2 = this.getResources();
        n4 = R$dimen.m3_navigation_rail_item_padding_top_with_large_font;
        n3 = bl2.getDimensionPixelOffset(n4);
        typedArray = this.getResources();
        n8 = R$dimen.m3_navigation_rail_item_padding_bottom_with_large_font;
        n4 = typedArray.getDimensionPixelOffset(n8);
        f5 = MaterialResources.getFontScale(context);
        f6 = 1.0f;
        f5 -= f6;
        f5 = AnimationUtils.lerp(0.0f, f6, 0.3f, f6, f5);
        float f7 = AnimationUtils.lerp(this.getItemPaddingTop(), n3, f5);
        f5 = AnimationUtils.lerp(this.getItemPaddingBottom(), n4, f5);
        n3 = Math.round(f7);
        this.setItemPaddingTop(n3);
        n7 = Math.round(f5);
        this.setItemPaddingBottom(n7);
        ((Tn3)object).g();
        this.applyWindowInsets();
    }

    public static /* synthetic */ Boolean access$000(NavigationRailView navigationRailView) {
        return navigationRailView.paddingTopSystemWindowInsets;
    }

    public static /* synthetic */ boolean access$100(NavigationRailView navigationRailView, Boolean bl2) {
        return navigationRailView.shouldApplyWindowInsetPadding(bl2);
    }

    public static /* synthetic */ Boolean access$200(NavigationRailView navigationRailView) {
        return navigationRailView.paddingBottomSystemWindowInsets;
    }

    public static /* synthetic */ Boolean access$300(NavigationRailView navigationRailView) {
        return navigationRailView.paddingStartSystemWindowInsets;
    }

    private void applyWindowInsets() {
        NavigationRailView$1 navigationRailView$1 = new NavigationRailView$1(this);
        ViewUtils.doOnApplyWindowInsets((View)this, navigationRailView$1);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView)this.getMenuView();
    }

    private boolean isHeaderViewVisible() {
        int n3;
        int n4;
        View view = this.headerView;
        if (view != null && (n4 = view.getVisibility()) != (n3 = 8)) {
            n4 = 1;
        } else {
            n4 = 0;
            view = null;
        }
        return n4 != 0;
    }

    private int makeMinWidthSpec(int n3) {
        int n4;
        int n7 = this.getSuggestedMinimumWidth();
        int n8 = View.MeasureSpec.getMode((int)n3);
        if (n8 != (n4 = 0x40000000) && n7 > 0) {
            n8 = this.getPaddingLeft();
            int n10 = this.getPaddingRight() + n8 + n7;
            n3 = View.MeasureSpec.makeMeasureSpec((int)Math.min(View.MeasureSpec.getSize((int)n3), n10), (int)n4);
        }
        return n3;
    }

    private boolean shouldApplyWindowInsetPadding(Boolean object) {
        boolean bl2;
        if (object != null) {
            bl2 = (Boolean)object;
        } else {
            object = ViewCompat.a;
            bl2 = this.getFitsSystemWindows();
        }
        return bl2;
    }

    public void addHeaderView(int n3) {
        View view = LayoutInflater.from((Context)this.getContext()).inflate(n3, (ViewGroup)this, false);
        this.addHeaderView(view);
    }

    public void addHeaderView(View view) {
        this.removeHeaderView();
        this.headerView = view;
        int n3 = -2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n3, n3);
        layoutParams.gravity = 49;
        layoutParams.topMargin = n3 = this.topMargin;
        this.addView(view, 0, (ViewGroup.LayoutParams)layoutParams);
    }

    public NavigationRailMenuView createNavigationBarMenuView(Context context) {
        NavigationRailMenuView navigationRailMenuView = new NavigationRailMenuView(context);
        return navigationRailMenuView;
    }

    public View getHeaderView() {
        return this.headerView;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView)this.getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return this.getNavigationRailMenuView().getMenuGravity();
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        NavigationRailMenuView navigationRailMenuView = this.getNavigationRailMenuView();
        n3 = (int)(this.isHeaderViewVisible() ? 1 : 0);
        n4 = 0;
        if (n3 != 0) {
            View view = this.headerView;
            n3 = view.getBottom();
            n7 = this.topMargin;
            n3 += n7;
            n7 = navigationRailMenuView.getTop();
            if (n7 < n3) {
                n4 = n3 - n7;
            }
        } else {
            n3 = (int)(navigationRailMenuView.isTopGravity() ? 1 : 0);
            if (n3 != 0) {
                n4 = this.topMargin;
            }
        }
        if (n4 > 0) {
            n3 = navigationRailMenuView.getLeft();
            n7 = navigationRailMenuView.getTop() + n4;
            n8 = navigationRailMenuView.getRight();
            int n10 = navigationRailMenuView.getBottom() + n4;
            navigationRailMenuView.layout(n3, n7, n8, n10);
        }
    }

    public void onMeasure(int n3, int n4) {
        n3 = this.makeMinWidthSpec(n3);
        super.onMeasure(n3, n4);
        n4 = (int)(this.isHeaderViewVisible() ? 1 : 0);
        if (n4 != 0) {
            n4 = this.getMeasuredHeight();
            int n7 = this.headerView.getMeasuredHeight();
            n4 -= n7;
            n7 = this.topMargin;
            n4 -= n7;
            n7 = -1 << -1;
            n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n7);
            NavigationRailMenuView navigationRailMenuView = this.getNavigationRailMenuView();
            this.measureChild((View)navigationRailMenuView, n3, n4);
        }
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            this.removeView(view);
            view = null;
            this.headerView = null;
        }
    }

    public void setItemMinimumHeight(int n3) {
        ((NavigationRailMenuView)this.getMenuView()).setItemMinimumHeight(n3);
    }

    public void setMenuGravity(int n3) {
        this.getNavigationRailMenuView().setMenuGravity(n3);
    }
}

