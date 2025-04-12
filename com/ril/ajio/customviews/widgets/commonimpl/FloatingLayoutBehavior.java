/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.LinearLayout
 */
package com.ril.ajio.customviews.widgets.commonimpl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;

public class FloatingLayoutBehavior
extends CoordinatorLayout$Behavior {
    public FloatingLayoutBehavior() {
    }

    public FloatingLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        return super.onDependentViewChanged(coordinatorLayout, (View)linearLayout, view);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view, View view2, int n3, int n4) {
        boolean bl2;
        int n7 = 2;
        if (n3 != n7 && !(bl2 = super.onStartNestedScroll(coordinatorLayout, (View)linearLayout, view, view2, n3, n4))) {
            bl2 = false;
            coordinatorLayout = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

