/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ItemTouchHelper$4;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.ItemTouchHelper$e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import java.util.ArrayList;

public final class ItemTouchHelper$b
extends ItemTouchHelper$e {
    public final /* synthetic */ int n;
    public final /* synthetic */ RecyclerView$B o;
    public final /* synthetic */ ItemTouchHelper p;

    public ItemTouchHelper$b(ItemTouchHelper itemTouchHelper, RecyclerView$B recyclerView$B, int n3, int n4, float f5, float f6, float f7, float f8, int n7, RecyclerView$B recyclerView$B2) {
        this.p = itemTouchHelper;
        this.n = n7;
        this.o = recyclerView$B2;
        super(recyclerView$B, n4, f5, f6, f7, f8);
    }

    public final void onAnimationEnd(Animator object) {
        super.onAnimationEnd((Animator)object);
        int n3 = this.k;
        if (n3 != 0) {
            return;
        }
        n3 = this.n;
        RecyclerView$B recyclerView$B = this.o;
        ItemTouchHelper itemTouchHelper = this.p;
        if (n3 <= 0) {
            object = itemTouchHelper.m;
            RecyclerView recyclerView = itemTouchHelper.r;
            ((ItemTouchHelper$c)object).clearView(recyclerView, recyclerView$B);
        } else {
            boolean bl2;
            Object object2 = itemTouchHelper.a;
            Object object3 = recyclerView$B.itemView;
            ((ArrayList)object2).add(object3);
            this.h = bl2 = true;
            if (n3 > 0) {
                object2 = itemTouchHelper.r;
                object3 = new ItemTouchHelper$4(itemTouchHelper, this, n3);
                object2.post((Runnable)object3);
            }
        }
        object = itemTouchHelper.w;
        recyclerView$B = recyclerView$B.itemView;
        if (object == recyclerView$B) {
            itemTouchHelper.n((View)recyclerView$B);
        }
    }
}

