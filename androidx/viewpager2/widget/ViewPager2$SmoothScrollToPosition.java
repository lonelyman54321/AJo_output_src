/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

class ViewPager2$SmoothScrollToPosition
implements Runnable {
    public final int a;
    public final RecyclerView b;

    public ViewPager2$SmoothScrollToPosition(RecyclerView recyclerView, int n3) {
        this.a = n3;
        this.b = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.b;
        int n3 = this.a;
        recyclerView.smoothScrollToPosition(n3);
    }
}

