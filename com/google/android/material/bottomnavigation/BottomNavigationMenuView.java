/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.d;
import com.google.android.material.R$dimen;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

public class BottomNavigationMenuView
extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List tempChildWidths;

    public BottomNavigationMenuView(Context object) {
        super((Context)object);
        int n3;
        super();
        this.tempChildWidths = object;
        int n4 = -2;
        super(n4, n4);
        object.gravity = 17;
        this.setLayoutParams((ViewGroup.LayoutParams)object);
        object = this.getResources();
        n4 = R$dimen.design_bottom_navigation_item_max_width;
        this.inactiveItemMaxWidth = n4 = object.getDimensionPixelSize(n4);
        n4 = R$dimen.design_bottom_navigation_item_min_width;
        this.inactiveItemMinWidth = n4 = object.getDimensionPixelSize(n4);
        n4 = R$dimen.design_bottom_navigation_active_item_max_width;
        this.activeItemMaxWidth = n4 = object.getDimensionPixelSize(n4);
        n4 = R$dimen.design_bottom_navigation_active_item_min_width;
        this.activeItemMinWidth = n3 = object.getDimensionPixelSize(n4);
    }

    public NavigationBarItemView createNavigationBarItemView(Context context) {
        BottomNavigationItemView bottomNavigationItemView = new BottomNavigationItemView(context);
        return bottomNavigationItemView;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        n3 = 1;
        int n14 = this.getChildCount();
        n8 -= n4;
        n10 -= n7;
        n4 = 0;
        int n15 = 0;
        for (n7 = 0; n7 < n14; n7 += n3) {
            int n16;
            View view = this.getChildAt(n7);
            int n17 = view.getVisibility();
            if (n17 == (n16 = 8)) continue;
            n17 = this.getLayoutDirection();
            if (n17 == n3) {
                n17 = n8 - n15;
                n16 = view.getMeasuredWidth();
                n16 = n17 - n16;
                view.layout(n16, 0, n17, n10);
            } else {
                n17 = view.getMeasuredWidth() + n15;
                view.layout(n15, 0, n17, n10);
            }
            int n18 = view.getMeasuredWidth();
            n15 += n18;
        }
    }

    public void onMeasure(int n3, int n4) {
        Object object;
        View view;
        Object object2 = this.getMenu();
        n3 = View.MeasureSpec.getSize((int)n3);
        object2 = ((d)object2).getVisibleItems();
        int n7 = ((ArrayList)object2).size();
        int n8 = this.getChildCount();
        List list = this.tempChildWidths;
        list.clear();
        n4 = View.MeasureSpec.getSize((int)n4);
        int n10 = 0x40000000;
        int n14 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n10);
        int n15 = this.getLabelVisibilityMode();
        n15 = (int)(this.isShifting(n15, n7) ? 1 : 0);
        int n16 = 8;
        int n17 = 0;
        int n18 = 1;
        if (n15 != 0 && (n15 = (int)(this.isItemHorizontalTranslationEnabled() ? 1 : 0)) != 0) {
            n15 = this.getSelectedItemPosition();
            view = this.getChildAt(n15);
            int n19 = this.activeItemMinWidth;
            int n20 = view.getVisibility();
            if (n20 != n16) {
                n20 = this.activeItemMaxWidth;
                int n21 = -1 << -1;
                n20 = View.MeasureSpec.makeMeasureSpec((int)n20, (int)n21);
                view.measure(n20, n14);
                n20 = view.getMeasuredWidth();
                n19 = Math.max(n19, n20);
            }
            if ((n15 = view.getVisibility()) != n16) {
                n15 = 1;
            } else {
                n15 = 0;
                view = null;
            }
            n7 -= n15;
            n15 = this.inactiveItemMinWidth * n7;
            n15 = n3 - n15;
            n20 = this.activeItemMaxWidth;
            n19 = Math.min(n19, n20);
            n15 = Math.min(n15, n19);
            n3 -= n15;
            if (n7 != 0) {
                n18 = n7;
            }
            n18 = n3 / n18;
            n19 = this.inactiveItemMaxWidth;
            n18 = Math.min(n18, n19);
            n3 -= (n7 *= n18);
            object2 = null;
            for (n7 = 0; n7 < n8; ++n7) {
                object = this.getChildAt(n7);
                n19 = object.getVisibility();
                if (n19 != n16) {
                    n19 = this.getSelectedItemPosition();
                    n19 = n7 == n19 ? n15 : n18;
                    if (n3 > 0) {
                        ++n19;
                        n3 += -1;
                    }
                } else {
                    n19 = 0;
                    object = null;
                }
                List list2 = this.tempChildWidths;
                object = n19;
                list2.add(object);
            }
        } else {
            if (n7 != 0) {
                n18 = n7;
            }
            n15 = n3 / n18;
            n18 = this.activeItemMaxWidth;
            n15 = Math.min(n15, n18);
            n3 -= (n7 *= n15);
            object2 = null;
            for (n7 = 0; n7 < n8; ++n7) {
                Object object3 = this.getChildAt(n7);
                n18 = object3.getVisibility();
                if (n18 != n16) {
                    if (n3 > 0) {
                        n18 = n15 + 1;
                        n3 += -1;
                    } else {
                        n18 = n15;
                    }
                } else {
                    n18 = 0;
                    object3 = null;
                }
                object = this.tempChildWidths;
                object3 = n18;
                object.add(object3);
            }
        }
        n3 = 0;
        while (n17 < n8) {
            object2 = this.getChildAt(n17);
            n15 = object2.getVisibility();
            if (n15 != n16) {
                n15 = View.MeasureSpec.makeMeasureSpec((int)((Integer)this.tempChildWidths.get(n17)), (int)n10);
                object2.measure(n15, n14);
                view = object2.getLayoutParams();
                view.width = n18 = object2.getMeasuredWidth();
                n3 = n7 = object2.getMeasuredWidth() + n3;
            }
            ++n17;
        }
        this.setMeasuredDimension(n3, n4);
    }

    public void setItemHorizontalTranslationEnabled(boolean bl2) {
        this.itemHorizontalTranslationEnabled = bl2;
    }
}

