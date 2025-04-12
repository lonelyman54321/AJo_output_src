/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l$b;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
import java.util.List;

public abstract class RecyclerView$l {
    public RecyclerView$l$b a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void a(RecyclerView$B recyclerView$B) {
        int n3 = recyclerView$B.mFlags;
        boolean bl2 = recyclerView$B.isInvalid();
        if (bl2) {
            return;
        }
        if ((n3 &= 4) == 0) {
            recyclerView$B.getOldPosition();
            recyclerView$B.getAbsoluteAdapterPosition();
        }
    }

    public boolean b(RecyclerView$B recyclerView$B, List object) {
        boolean bl2;
        object = this;
        object = (x)this;
        boolean bl3 = ((x)object).g;
        if (bl3 && !(bl2 = recyclerView$B.isInvalid())) {
            bl2 = false;
            recyclerView$B = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(RecyclerView$B recyclerView$B) {
        Object object = this.a;
        if (object != null) {
            object = (RecyclerView$m)object;
            object.getClass();
            boolean bl2 = true;
            recyclerView$B.setIsRecyclable(bl2);
            RecyclerView$B recyclerView$B2 = recyclerView$B.mShadowedHolder;
            if (recyclerView$B2 != null && (recyclerView$B2 = recyclerView$B.mShadowingHolder) == null) {
                recyclerView$B.mShadowedHolder = null;
            }
            recyclerView$B.mShadowingHolder = null;
            bl2 = recyclerView$B.shouldBeKeptAsChild();
            if (!bl2 && !(bl2 = ((RecyclerView)(object = ((RecyclerView$m)object).a)).removeAnimatingView((View)(recyclerView$B2 = recyclerView$B.itemView))) && (bl2 = recyclerView$B.isTmpDetached())) {
                recyclerView$B = recyclerView$B.itemView;
                bl2 = false;
                recyclerView$B2 = null;
                ((RecyclerView)object).removeDetachedView((View)recyclerView$B, false);
            }
        }
    }

    public abstract void d(RecyclerView$B var1);

    public abstract void e();

    public abstract boolean f();

    public abstract void g();
}

