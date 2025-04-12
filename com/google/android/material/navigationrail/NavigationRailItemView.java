/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View$MeasureSpec
 */
package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.navigation.NavigationBarItemView;

final class NavigationRailItemView
extends NavigationBarItemView {
    public NavigationRailItemView(Context context) {
        super(context);
    }

    public int getItemDefaultMarginResId() {
        return R$dimen.mtrl_navigation_rail_icon_margin;
    }

    public int getItemLayoutResId() {
        return R$layout.mtrl_navigation_rail_item;
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = View.MeasureSpec.getMode((int)n4);
        if (n3 == 0) {
            n3 = View.MeasureSpec.getSize((int)n4);
            n3 = Math.max(this.getMeasuredHeight(), n3);
            n4 = this.getMeasuredWidthAndState();
            this.setMeasuredDimension(n4, n3);
        }
    }
}

