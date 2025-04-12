/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.a$a_0;
import androidx.recyclerview.widget.a$b_0;

public final class RecyclerView$e
implements a$a_0 {
    public final /* synthetic */ RecyclerView a;

    public RecyclerView$e(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(a$b_0 object) {
        int n3 = ((a$b_0)object).a;
        int n4 = 1;
        RecyclerView recyclerView = this.a;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 4;
                if (n3 != n7) {
                    n7 = 8;
                    if (n3 == n7) {
                        RecyclerView$o recyclerView$o = recyclerView.mLayout;
                        n7 = ((a$b_0)object).b;
                        int n8 = ((a$b_0)object).d;
                        recyclerView$o.onItemsMoved(recyclerView, n7, n8, n4);
                    }
                } else {
                    RecyclerView$o recyclerView$o = recyclerView.mLayout;
                    n4 = ((a$b_0)object).b;
                    n7 = ((a$b_0)object).d;
                    object = ((a$b_0)object).c;
                    recyclerView$o.onItemsUpdated(recyclerView, n4, n7, object);
                }
            } else {
                RecyclerView$o recyclerView$o = recyclerView.mLayout;
                n4 = ((a$b_0)object).b;
                int n10 = ((a$b_0)object).d;
                recyclerView$o.onItemsRemoved(recyclerView, n4, n10);
            }
        } else {
            RecyclerView$o recyclerView$o = recyclerView.mLayout;
            n4 = ((a$b_0)object).b;
            int n14 = ((a$b_0)object).d;
            recyclerView$o.onItemsAdded(recyclerView, n4, n14);
        }
    }
}

