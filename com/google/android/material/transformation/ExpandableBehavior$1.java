/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package com.google.android.material.transformation;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.transformation.ExpandableBehavior;

class ExpandableBehavior$1
implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ExpandableBehavior this$0;
    final /* synthetic */ View val$child;
    final /* synthetic */ ExpandableWidget val$dep;
    final /* synthetic */ int val$expectedState;

    public ExpandableBehavior$1(ExpandableBehavior expandableBehavior, View view, int n3, ExpandableWidget expandableWidget) {
        this.this$0 = expandableBehavior;
        this.val$child = view;
        this.val$expectedState = n3;
        this.val$dep = expandableWidget;
    }

    public boolean onPreDraw() {
        this.val$child.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        ExpandableBehavior expandableBehavior = this.this$0;
        int n3 = ExpandableBehavior.access$000(expandableBehavior);
        int n4 = this.val$expectedState;
        if (n3 == n4) {
            ExpandableWidget expandableWidget;
            expandableBehavior = this.this$0;
            ExpandableWidget expandableWidget2 = expandableWidget = this.val$dep;
            expandableWidget2 = (View)expandableWidget;
            View view = this.val$child;
            n4 = (int)(expandableWidget.isExpanded() ? 1 : 0);
            expandableBehavior.onExpandedStateChange((View)expandableWidget2, view, n4 != 0, false);
        }
        return false;
    }
}

