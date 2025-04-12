/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView$B;

public final class RecyclerView$l$c {
    public int a;
    public int b;

    public final void a(RecyclerView$B recyclerView$B) {
        int n3;
        recyclerView$B = recyclerView$B.itemView;
        this.a = n3 = recyclerView$B.getLeft();
        this.b = n3 = recyclerView$B.getTop();
        recyclerView$B.getRight();
        recyclerView$B.getBottom();
    }
}

