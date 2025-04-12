/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;

public final class RecyclerView$c
implements sq0_0 {
    public final /* synthetic */ RecyclerView a;

    public RecyclerView$c(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(float f5) {
        int n3;
        RecyclerView recyclerView = this.a;
        RecyclerView$o recyclerView$o = recyclerView.mLayout;
        int n4 = recyclerView$o.canScrollVertically();
        if (n4 != 0) {
            n4 = (int)f5;
            n3 = 0;
            f5 = 0.0f;
        } else {
            recyclerView$o = recyclerView.mLayout;
            n4 = (int)(recyclerView$o.canScrollHorizontally() ? 1 : 0);
            if (n4 == 0) return false;
            n3 = (int)f5;
            n4 = 0;
            recyclerView$o = null;
        }
        if (n3 == 0 && n4 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(n3, n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float b() {
        float f5;
        RecyclerView recyclerView = this.a;
        RecyclerView$o recyclerView$o = recyclerView.mLayout;
        boolean bl2 = recyclerView$o.canScrollVertically();
        if (bl2) {
            f5 = recyclerView.mScaledVerticalScrollFactor;
            return -f5;
        }
        recyclerView$o = recyclerView.mLayout;
        bl2 = recyclerView$o.canScrollHorizontally();
        if (!bl2) return 0.0f;
        f5 = recyclerView.mScaledHorizontalScrollFactor;
        return -f5;
    }

    public final void c() {
        this.a.stopScroll();
    }
}

