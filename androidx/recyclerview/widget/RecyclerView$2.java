/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;

class RecyclerView$2
implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public RecyclerView$2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.a;
        RecyclerView$l recyclerView$l = recyclerView.mItemAnimator;
        if (recyclerView$l != null) {
            recyclerView$l.g();
        }
        recyclerView.mPostedAnimatorRunner = false;
    }
}

