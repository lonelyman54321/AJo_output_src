/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.ItemTouchHelper$e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l;
import java.util.ArrayList;

class ItemTouchHelper$4
implements Runnable {
    public final /* synthetic */ ItemTouchHelper$e a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ItemTouchHelper c;

    public ItemTouchHelper$4(ItemTouchHelper itemTouchHelper, ItemTouchHelper$e e2, int n3) {
        this.c = itemTouchHelper;
        this.a = e2;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        int n3;
        Object object = this.c;
        Object object2 = ((ItemTouchHelper)object).r;
        if (object2 == null) return;
        boolean bl2 = ((RecyclerView)object2).isAttachedToWindow();
        if (!bl2) return;
        object2 = this.a;
        int n4 = ((ItemTouchHelper$e)object2).k;
        if (n4 != 0) return;
        object2 = ((ItemTouchHelper$e)object2).e;
        n4 = ((RecyclerView$B)object2).getAbsoluteAdapterPosition();
        if (n4 == (n3 = -1)) return;
        Object object3 = ((ItemTouchHelper)object).r.getItemAnimator();
        if (object3 == null || (n4 = (int)(((RecyclerView$l)object3).f() ? 1 : 0)) == 0) {
            object3 = ((ItemTouchHelper)object).p;
            n3 = ((ArrayList)object3).size();
            int n7 = 0;
            while (true) {
                if (n7 >= n3) {
                    object = ((ItemTouchHelper)object).m;
                    n4 = this.b;
                    ((ItemTouchHelper$c)object).onSwiped((RecyclerView$B)object2, n4);
                    return;
                }
                ItemTouchHelper$e itemTouchHelper$e = (ItemTouchHelper$e)((ArrayList)object3).get(n7);
                boolean bl3 = itemTouchHelper$e.l;
                if (!bl3) break;
                ++n7;
            }
        }
        object = ((ItemTouchHelper)object).r;
        object.post((Runnable)this);
    }
}

