/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.adapter;

import androidx.recyclerview.widget.RecyclerView$h;

public abstract class a$b
extends RecyclerView$h {
    public abstract void onChanged();

    public final void onItemRangeChanged(int n3, int n4) {
        this.onChanged();
    }

    public final void onItemRangeChanged(int n3, int n4, Object object) {
        this.onChanged();
    }

    public final void onItemRangeInserted(int n3, int n4) {
        this.onChanged();
    }

    public final void onItemRangeMoved(int n3, int n4, int n7) {
        this.onChanged();
    }

    public final void onItemRangeRemoved(int n3, int n4) {
        this.onChanged();
    }
}

