/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

class RecyclerView$1
implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public RecyclerView$1(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.a;
        boolean bl2 = recyclerView.mFirstLayoutComplete;
        if (bl2 && !(bl2 = recyclerView.isLayoutRequested())) {
            bl2 = recyclerView.mIsAttached;
            if (!bl2) {
                recyclerView.requestLayout();
                return;
            }
            bl2 = recyclerView.mLayoutSuppressed;
            if (bl2) {
                recyclerView.mLayoutWasDefered = true;
                return;
            }
            recyclerView.consumePendingUpdateOperations();
        }
    }
}

