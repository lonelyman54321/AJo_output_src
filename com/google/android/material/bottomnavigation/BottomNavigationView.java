/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView$1;
import com.google.android.material.bottomnavigation.BottomNavigationView$OnNavigationItemReselectedListener;
import com.google.android.material.bottomnavigation.BottomNavigationView$OnNavigationItemSelectedListener;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarPresenter;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationView
extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.bottomNavigationStyle;
        this(context, attributeSet, n3);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int n3) {
        int n4 = R$style.Widget_Design_BottomNavigationView;
        this(context, attributeSet, n3, n4);
    }

    public BottomNavigationView(Context context, AttributeSet object, int n3, int n4) {
        super(context, (AttributeSet)object, n3, n4);
        context = this.getContext();
        int[] nArray = R$styleable.BottomNavigationView;
        int[] nArray2 = new int[]{};
        object = ThemeEnforcement.obtainTintedStyledAttributes(context, (AttributeSet)object, nArray, n3, n4, nArray2);
        n3 = R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled;
        TypedArray typedArray = ((Tn3)object).b;
        boolean bl2 = true;
        n3 = (int)(typedArray.getBoolean(n3, bl2) ? 1 : 0);
        this.setItemHorizontalTranslationEnabled(n3 != 0);
        n3 = R$styleable.BottomNavigationView_android_minHeight;
        typedArray = ((Tn3)object).b;
        n3 = (int)(typedArray.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.BottomNavigationView_android_minHeight;
            n3 = typedArray.getDimensionPixelSize(n3, 0);
            this.setMinimumHeight(n3);
        }
        n3 = R$styleable.BottomNavigationView_compatShadowEnabled;
        if ((n3 = (int)(typedArray.getBoolean(n3, bl2) ? 1 : 0)) != 0 && (n3 = (int)(this.shouldDrawCompatibilityTopDivider() ? 1 : 0)) != 0) {
            this.addCompatibilityTopDivider(context);
        }
        ((Tn3)object).g();
        this.applyWindowInsets();
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        int n3 = R$color.design_bottom_navigation_shadow_color;
        int n4 = t70.getColor(context, n3);
        view.setBackgroundColor(n4);
        Resources resources = this.getResources();
        int n7 = R$dimen.design_bottom_navigation_shadow_height;
        n3 = resources.getDimensionPixelSize(n7);
        context = new FrameLayout.LayoutParams(-1, n3);
        view.setLayoutParams((ViewGroup.LayoutParams)context);
        this.addView(view);
    }

    private void applyWindowInsets() {
        BottomNavigationView$1 bottomNavigationView$1 = new BottomNavigationView$1(this);
        ViewUtils.doOnApplyWindowInsets((View)this, bottomNavigationView$1);
    }

    private int makeMinHeightSpec(int n3) {
        int n4;
        int n7 = this.getSuggestedMinimumHeight();
        int n8 = View.MeasureSpec.getMode((int)n3);
        if (n8 != (n4 = 0x40000000) && n7 > 0) {
            n8 = this.getPaddingTop();
            int n10 = this.getPaddingBottom() + n8 + n7;
            n3 = View.MeasureSpec.makeMeasureSpec((int)Math.min(View.MeasureSpec.getSize((int)n3), n10), (int)n4);
        }
        return n3;
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    public NavigationBarMenuView createNavigationBarMenuView(Context context) {
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context);
        return bottomNavigationMenuView;
    }

    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView)this.getMenuView()).isItemHorizontalTranslationEnabled();
    }

    public void onMeasure(int n3, int n4) {
        n4 = this.makeMinHeightSpec(n4);
        super.onMeasure(n3, n4);
    }

    public void setItemHorizontalTranslationEnabled(boolean bl2) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView)this.getMenuView();
        boolean bl3 = bottomNavigationMenuView.isItemHorizontalTranslationEnabled();
        if (bl3 != bl2) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(bl2);
            NavigationBarPresenter navigationBarPresenter = this.getPresenter();
            bottomNavigationMenuView = null;
            navigationBarPresenter.updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(BottomNavigationView$OnNavigationItemReselectedListener bottomNavigationView$OnNavigationItemReselectedListener) {
        this.setOnItemReselectedListener(bottomNavigationView$OnNavigationItemReselectedListener);
    }

    public void setOnNavigationItemSelectedListener(BottomNavigationView$OnNavigationItemSelectedListener bottomNavigationView$OnNavigationItemSelectedListener) {
        this.setOnItemSelectedListener(bottomNavigationView$OnNavigationItemSelectedListener);
    }
}

