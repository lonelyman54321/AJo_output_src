/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pY1
 */
public final class py1_1
extends GridLayoutManager$b {
    public final /* synthetic */ oy1_1 c;

    public py1_1(oy1_1 oy1_12) {
        this.c = oy1_12;
    }

    public final int c(int n3) {
        Object object = this.c;
        Object object2 = ((oy1_1)object).s;
        RecyclerView$f recyclerView$f = null;
        object2 = object2 != null ? ((RecyclerView)object2).getAdapter() : null;
        int n4 = 1;
        if (object2 == null) {
            return n4;
        }
        object = ((oy1_1)object).s;
        if (object != null) {
            recyclerView$f = ((RecyclerView)object).getAdapter();
        }
        Intrinsics.checkNotNull(recyclerView$f);
        n3 = recyclerView$f.getItemViewType(n3);
        int n7 = 3;
        if (n3 == n7 || n3 == (n7 = 8)) {
            n4 = 2;
        }
        return n4;
    }
}

