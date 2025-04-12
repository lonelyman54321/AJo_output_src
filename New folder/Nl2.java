/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.RecyclerView$h;

public final class Nl2
extends RecyclerView$h {
    public final /* synthetic */ Ql2 a;

    public Nl2(Ql2 ql2) {
        this.a = ql2;
    }

    public final void onItemRangeInserted(int n3, int n4) {
        boolean bl2;
        RecyclerView$f$a recyclerView$f$a;
        Ql2 ql2 = this.a;
        RecyclerView$f$a recyclerView$f$a2 = ql2.getStateRestorationPolicy();
        if (recyclerView$f$a2 == (recyclerView$f$a = RecyclerView$f$a.PREVENT) && !(bl2 = ql2.a)) {
            recyclerView$f$a2 = RecyclerView$f$a.ALLOW;
            ql2.setStateRestorationPolicy(recyclerView$f$a2);
        }
        ql2.unregisterAdapterDataObserver(this);
        super.onItemRangeInserted(n3, n4);
    }
}

