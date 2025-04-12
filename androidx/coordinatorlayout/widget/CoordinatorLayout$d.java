/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$OnHierarchyChangeListener
 */
package androidx.coordinatorlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class CoordinatorLayout$d
implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout a;

    public CoordinatorLayout$d(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        int n3 = 2;
        CoordinatorLayout coordinatorLayout = this.a;
        coordinatorLayout.onChildViewsChanged(n3);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}

