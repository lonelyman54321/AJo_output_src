/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.transformation.ExpandableBehavior$1;
import java.util.List;

public abstract class ExpandableBehavior
extends CoordinatorLayout$Behavior {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED;
    private int currentState = 0;

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ int access$000(ExpandableBehavior expandableBehavior) {
        return expandableBehavior.currentState;
    }

    private boolean didStateChange(boolean n3) {
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != 0) {
            int n7;
            n3 = this.currentState;
            if (n3 == 0 || n3 == (n7 = 2)) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = this.currentState;
        if (n3 == n4) {
            bl2 = true;
        }
        return bl2;
    }

    public static ExpandableBehavior from(View object, Class clazz) {
        boolean bl2 = (object = object.getLayoutParams()) instanceof CoordinatorLayout$e;
        if (bl2) {
            object = ((CoordinatorLayout$e)((Object)object)).a;
            bl2 = object instanceof ExpandableBehavior;
            if (bl2) {
                return (ExpandableBehavior)clazz.cast(object);
            }
            object = new IllegalArgumentException("The view is not associated with ExpandableBehavior");
            throw object;
        }
        object = new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        throw object;
    }

    public ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view) {
        List list = coordinatorLayout.getDependencies(view);
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view2 = (View)list.get(i3);
            boolean bl2 = this.layoutDependsOn(coordinatorLayout, view, view2);
            if (!bl2) continue;
            return (ExpandableWidget)view2;
        }
        return null;
    }

    public abstract boolean layoutDependsOn(CoordinatorLayout var1, View var2, View var3);

    public boolean onDependentViewChanged(CoordinatorLayout object, View view, View object2) {
        object2 = (ExpandableWidget)object2;
        int n3 = object2.isExpanded();
        if ((n3 = this.didStateChange(n3 != 0)) != 0) {
            n3 = object2.isExpanded();
            boolean bl2 = true;
            n3 = n3 != 0 ? 1 : 2;
            this.currentState = n3;
            object = object2;
            object = (View)object2;
            boolean bl3 = object2.isExpanded();
            return this.onExpandedStateChange((View)object, view, bl3, bl2);
        }
        return false;
    }

    public abstract boolean onExpandedStateChange(View var1, View var2, boolean var3, boolean var4);

    public boolean onLayoutChild(CoordinatorLayout object, View view, int n3) {
        n3 = (int)(view.isLaidOut() ? 1 : 0);
        if (n3 == 0 && (object = this.findExpandableWidget((CoordinatorLayout)object, view)) != null) {
            n3 = (int)(object.isExpanded() ? 1 : 0);
            if ((n3 = (int)(this.didStateChange(n3 != 0) ? 1 : 0)) != 0) {
                n3 = (int)(object.isExpanded() ? 1 : 0);
                n3 = n3 != 0 ? 1 : 2;
                this.currentState = n3;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                ExpandableBehavior$1 expandableBehavior$1 = new ExpandableBehavior$1(this, view, n3, (ExpandableWidget)object);
                viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)expandableBehavior$1);
            }
        }
        return false;
    }
}

