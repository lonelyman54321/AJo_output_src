/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class N41
extends RecyclerView$s {
    public final /* synthetic */ M41 a;

    public N41(M41 m41) {
        this.a = m41;
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        int n7;
        int n8;
        Object object2;
        int n10;
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrolled((RecyclerView)object, n3, n4);
        object = ((RecyclerView)object).getLayoutManager();
        n3 = object instanceof LinearLayoutManager;
        n4 = 0;
        Object object3 = null;
        if (n3 != 0) {
            object = (LinearLayoutManager)object;
        } else {
            n10 = 0;
            object = null;
        }
        if (object != null) {
            n3 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            n8 = ((Number)object2).intValue();
            object = ((LinearLayoutManager)object).findViewByPosition(n8);
        } else {
            n10 = 0;
            object = null;
        }
        n8 = 0;
        string2 = null;
        if (object != null) {
            int n14 = -object.getTop();
            n3 = (Integer)object2;
            n10 = object.getHeight() * n3 + n14;
        } else {
            n10 = 0;
            object = null;
        }
        n3 = 300;
        M41 m41 = this.a;
        if (n10 > n3 && (n7 = m41.O) == 0) {
            Object object4;
            object = m41.i;
            Intrinsics.checkNotNull(object);
            object = ((RecyclerView)object).getLayoutManager();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            object = (LinearLayoutManager)object;
            object2 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            n3 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
            n10 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
            n8 = 1;
            n7 = -1;
            if (n3 != n7 && n10 != n7) {
                object4 = new c(n3, n10, n8);
                object = CollectionsKt.k0((Iterable)object4);
            } else {
                object = mz0_2.a;
            }
            object = ((Iterable)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                int n15;
                object4 = object2 = object.next();
                object4 = (Number)object2;
                n7 = ((Number)object4).intValue();
                l02_0 l02_02 = m41.G;
                if (l02_02 != null) {
                    n7 = l02_02.getItemViewType(n7);
                    object4 = n7;
                } else {
                    n7 = 0;
                    object4 = null;
                }
                if (object4 == null || (n7 = ((Integer)object4).intValue()) != (n15 = 2)) continue;
                object3 = object2;
                break;
            }
            if ((object3 = (Integer)object3) != null) {
                n10 = ((Number)object3).intValue();
                object2 = m41.G;
                if (object2 != null) {
                    object2 = m41.i;
                    Intrinsics.checkNotNull(object2);
                    l02_0.g((RecyclerView)object2, n10);
                }
                m41.F = n10;
            }
            m41.O = n8;
        } else if (n10 <= n3 && (n10 = (int)(m41.O ? 1 : 0)) != 0) {
            object = m41.G;
            if (object != null) {
                n3 = m41.F;
                object3 = m41.i;
                Intrinsics.checkNotNull(object3);
                ((l02_0)object).h((RecyclerView)object3, n3);
            }
            m41.O = false;
            m41.A(false);
        }
    }
}

