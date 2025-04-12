/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class CoordinatorLayout$f
implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout a;

    public CoordinatorLayout$f(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.a.onChildViewsChanged(0);
        return true;
    }
}

