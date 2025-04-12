/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.OverScroller
 */
package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.HeaderBehavior;

class HeaderBehavior$FlingRunnable
implements Runnable {
    private final View layout;
    private final CoordinatorLayout parent;
    final /* synthetic */ HeaderBehavior this$0;

    public HeaderBehavior$FlingRunnable(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
        this.this$0 = headerBehavior;
        this.parent = coordinatorLayout;
        this.layout = view;
    }

    public void run() {
        Object object = this.layout;
        if (object != null && (object = this.this$0.scroller) != null) {
            boolean bl2 = object.computeScrollOffset();
            if (bl2) {
                object = this.this$0;
                Object object2 = this.parent;
                View view = this.layout;
                OverScroller overScroller = ((HeaderBehavior)object).scroller;
                int n3 = overScroller.getCurrY();
                ((HeaderBehavior)object).setHeaderTopBottomOffset((CoordinatorLayout)object2, view, n3);
                object = this.layout;
                object2 = ViewCompat.a;
                object.postOnAnimation((Runnable)this);
            } else {
                object = this.this$0;
                CoordinatorLayout coordinatorLayout = this.parent;
                View view = this.layout;
                ((HeaderBehavior)object).onFlingFinished(coordinatorLayout, view);
            }
        }
    }
}

