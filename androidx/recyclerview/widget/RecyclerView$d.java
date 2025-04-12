/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c$b;

public final class RecyclerView$d
implements c$b {
    public final /* synthetic */ RecyclerView a;

    public RecyclerView$d(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(int n3) {
        RecyclerView recyclerView = this.a;
        View view = recyclerView.getChildAt(n3);
        if (view != null) {
            recyclerView.dispatchChildDetached(view);
            view.clearAnimation();
        }
        recyclerView.removeViewAt(n3);
    }
}

