/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f;

public final class CoordinatorLayout$a
implements T72 {
    public final /* synthetic */ CoordinatorLayout a;

    public CoordinatorLayout$a(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final f onApplyWindowInsets(View view, f f5) {
        return this.a.setWindowInsets(f5);
    }
}

