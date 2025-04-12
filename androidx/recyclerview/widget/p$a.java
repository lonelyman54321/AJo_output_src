/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.p;

public final class p$a
extends RecyclerView$h {
    public final /* synthetic */ p a;

    public p$a(p p2) {
        this.a = p2;
    }

    public final void onChanged() {
        int n3;
        Object object = this.a;
        ((p)object).e = n3 = ((p)object).c.getItemCount();
        object = (e)((p)object).d;
        ((e)object).a.notifyDataSetChanged();
        ((e)object).a();
    }

    public final void onItemRangeChanged(int n3, int n4) {
        p p2 = this.a;
        Object object = (e)p2.d;
        int n7 = ((e)object).b(p2);
        object = ((e)object).a;
        ((RecyclerView$f)object).notifyItemRangeChanged(n3 += n7, n4, null);
    }

    public final void onItemRangeChanged(int n3, int n4, Object object) {
        p p2 = this.a;
        Object object2 = (e)p2.d;
        int n7 = ((e)object2).b(p2);
        object2 = ((e)object2).a;
        ((RecyclerView$f)object2).notifyItemRangeChanged(n3 += n7, n4, object);
    }

    public final void onItemRangeInserted(int n3, int n4) {
        RecyclerView$f$a recyclerView$f$a;
        Object object;
        int n7;
        p p2 = this.a;
        p2.e = n7 = p2.e + n4;
        Object object2 = (e)p2.d;
        int n8 = ((e)object2).b(p2);
        object2 = ((e)object2).a;
        ((RecyclerView$f)object2).notifyItemRangeInserted(n3 += n8, n4);
        n3 = p2.e;
        if (n3 > 0 && (object = p2.c.getStateRestorationPolicy()) == (recyclerView$f$a = RecyclerView$f$a.PREVENT_WHEN_EMPTY)) {
            object = (e)p2.d;
            ((e)object).a();
        }
    }

    public final void onItemRangeMoved(int n3, int n4, int n7) {
        e e2;
        int n8 = 1;
        if (n7 != n8) {
            n8 = 0;
            e2 = null;
        }
        B41.a(n8 != 0, "moving more than 1 item is not supported in RecyclerView");
        p p2 = this.a;
        e2 = (e)p2.d;
        n7 = e2.b(p2);
        e2.a.notifyItemMoved(n3 += n7, n4 += n7);
    }

    public final void onItemRangeRemoved(int n3, int n4) {
        RecyclerView$f$a recyclerView$f$a;
        Object object;
        int n7;
        p p2 = this.a;
        p2.e = n7 = p2.e - n4;
        Object object2 = (e)p2.d;
        int n8 = ((e)object2).b(p2);
        object2 = ((e)object2).a;
        ((RecyclerView$f)object2).notifyItemRangeRemoved(n3 += n8, n4);
        n3 = p2.e;
        n4 = 1;
        if (n3 < n4 && (object = p2.c.getStateRestorationPolicy()) == (recyclerView$f$a = RecyclerView$f$a.PREVENT_WHEN_EMPTY)) {
            object = (e)p2.d;
            ((e)object).a();
        }
    }

    public final void onStateRestorationPolicyChanged() {
        ((e)this.a.d).a();
    }
}

