/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;

class StaggeredGridLayoutManager$1
implements Runnable {
    public final /* synthetic */ StaggeredGridLayoutManager a;

    public StaggeredGridLayoutManager$1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = staggeredGridLayoutManager;
    }

    public final void run() {
        this.a.b();
    }
}

