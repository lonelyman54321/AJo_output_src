/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView$f;

/*
 * Renamed from androidx.recyclerview.widget.b
 */
public final class b_0
implements iv1_0 {
    public final RecyclerView$f a;

    public b_0(RecyclerView$f recyclerView$f) {
        this.a = recyclerView$f;
    }

    public final void a(int n3, int n4) {
        this.a.notifyItemRangeInserted(n3, n4);
    }

    public final void b(int n3, int n4) {
        this.a.notifyItemRangeRemoved(n3, n4);
    }

    public final void c(int n3, int n4, Object object) {
        this.a.notifyItemRangeChanged(n3, n4, object);
    }

    public final void d(int n3, int n4) {
        this.a.notifyItemMoved(n3, n4);
    }
}

