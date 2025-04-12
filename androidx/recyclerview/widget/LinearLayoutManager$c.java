/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$u;
import java.util.List;

public final class LinearLayoutManager$c {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View object) {
        List list = this.k;
        int n3 = list.size();
        View view = null;
        int n4 = -1 >>> 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            View view2 = ((RecyclerView$B)this.k.get((int)i3)).itemView;
            RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view2.getLayoutParams();
            if (view2 == object || (n7 = recyclerView$LayoutParams.isItemRemoved()) != 0) continue;
            int n8 = recyclerView$LayoutParams.getViewLayoutPosition();
            n7 = this.d;
            n8 -= n7;
            n7 = this.e;
            if ((n8 *= n7) < 0 || n8 >= n4) continue;
            view = view2;
            if (n8 == 0) break;
            n4 = n8;
        }
        if (view == null) {
            int n10;
            this.d = n10 = -1;
        } else {
            int n14;
            object = (RecyclerView$LayoutParams)view.getLayoutParams();
            this.d = n14 = ((RecyclerView$LayoutParams)((Object)object)).getViewLayoutPosition();
        }
    }

    public final View b(RecyclerView$u recyclerView$u) {
        List list = this.k;
        if (list != null) {
            View view;
            block2: {
                int n3 = list.size();
                list = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n4;
                    view = ((RecyclerView$B)this.k.get((int)i3)).itemView;
                    RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
                    int n7 = recyclerView$LayoutParams.isItemRemoved();
                    if (n7 != 0 || (n7 = this.d) != (n4 = recyclerView$LayoutParams.getViewLayoutPosition())) continue;
                    this.a(view);
                    break block2;
                }
                boolean bl2 = false;
                view = null;
            }
            return view;
        }
        int n8 = this.d;
        recyclerView$u = recyclerView$u.m((int)n8, (long)Long.MAX_VALUE).itemView;
        n8 = this.d;
        int n10 = this.e;
        this.d = n8 += n10;
        return recyclerView$u;
    }
}

