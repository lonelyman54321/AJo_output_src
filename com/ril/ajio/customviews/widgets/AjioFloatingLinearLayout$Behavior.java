/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.ril.ajio.customviews.widgets.AjioFloatingLinearLayout;

class AjioFloatingLinearLayout$Behavior
extends CoordinatorLayout$Behavior {
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, AjioFloatingLinearLayout ajioFloatingLinearLayout, View view) {
        return view instanceof Snackbar$SnackbarLayout;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, AjioFloatingLinearLayout ajioFloatingLinearLayout, View view) {
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AjioFloatingLinearLayout ajioFloatingLinearLayout, int n3) {
        coordinatorLayout.onLayoutChild((View)ajioFloatingLinearLayout, n3);
        return true;
    }
}

