/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;

public final class StaggeredGridLayoutManager$b {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public StaggeredGridLayoutManager$b(StaggeredGridLayoutManager arrayList, int n3) {
        int n4;
        this.f = arrayList;
        this.a = arrayList = new ArrayList();
        this.b = n4 = -1 << -1;
        this.c = n4;
        this.d = 0;
        this.e = n3;
    }

    public final void a(View view) {
        int n3;
        int n4;
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
        staggeredGridLayoutManager$LayoutParams.a = this;
        Object object = this.a;
        ((ArrayList)object).add(view);
        this.c = n4 = -1 << -1;
        int n7 = ((ArrayList)object).size();
        int n8 = 1;
        if (n7 == n8) {
            this.b = n4;
        }
        if ((n7 = (int)(staggeredGridLayoutManager$LayoutParams.isItemRemoved() ? 1 : 0)) != 0 || (n3 = staggeredGridLayoutManager$LayoutParams.isItemChanged()) != 0) {
            int n10;
            n3 = this.d;
            object = this.f.c;
            this.d = n10 = ((t)object).c(view) + n3;
        }
    }

    public final void b() {
        Object object;
        Object object2 = this.a;
        int n3 = 1;
        object2 = (View)pp_0.a(n3, (ArrayList)object2);
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)object2.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        t t3 = staggeredGridLayoutManager.c;
        this.c = object = t3.b((View)object2);
        object = staggeredGridLayoutManager$LayoutParams.b;
        if (object != 0) {
            object2 = staggeredGridLayoutManager.m;
            int n4 = staggeredGridLayoutManager$LayoutParams.getViewLayoutPosition();
            if ((object2 = ((StaggeredGridLayoutManager$LazySpanLookup)object2).f(n4)) != null && (n4 = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object2).b) == n3) {
                n3 = this.c;
                object2 = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object2).c;
                if (object2 == null) {
                    object = 0;
                    object2 = null;
                } else {
                    n4 = this.e;
                    object = object2[n4];
                }
                this.c = n3 += object;
            }
        }
    }

    public final void c() {
        int n3;
        Object object = this.a;
        Object object2 = 0;
        object = (View)((ArrayList)object).get(0);
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)object.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        t t3 = staggeredGridLayoutManager.c;
        this.b = n3 = t3.e((View)object);
        n3 = (int)(staggeredGridLayoutManager$LayoutParams.b ? 1 : 0);
        if (n3 != 0) {
            int n4;
            object = staggeredGridLayoutManager.m;
            int n7 = staggeredGridLayoutManager$LayoutParams.getViewLayoutPosition();
            if ((object = ((StaggeredGridLayoutManager$LazySpanLookup)object).f(n7)) != null && (n7 = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object).b) == (n4 = -1)) {
                n7 = this.b;
                object = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object).c;
                if (object != null) {
                    object2 = this.e;
                    object2 = object[object2];
                }
                this.b = n7 -= object2;
            }
        }
    }

    public final void d() {
        int n3;
        this.a.clear();
        this.b = n3 = -1 << -1;
        this.c = n3;
        this.d = 0;
    }

    public final int e() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int n3 = staggeredGridLayoutManager.h;
        ArrayList arrayList = this.a;
        if (n3 != 0) {
            n3 = arrayList.size() + -1;
            int n4 = -1;
            n3 = this.g(n3, n4);
        } else {
            n3 = arrayList.size();
            boolean bl2 = false;
            arrayList = null;
            n3 = this.g(0, n3);
        }
        return n3;
    }

    public final int f() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int n3 = staggeredGridLayoutManager.h;
        ArrayList arrayList = this.a;
        if (n3 != 0) {
            n3 = arrayList.size();
            boolean bl2 = false;
            arrayList = null;
            n3 = this.g(0, n3);
        } else {
            n3 = arrayList.size() + -1;
            int n4 = -1;
            n3 = this.g(n3, n4);
        }
        return n3;
    }

    public final int g(int n3, int n4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        t t3 = staggeredGridLayoutManager.c;
        int n7 = t3.k();
        t t4 = staggeredGridLayoutManager.c;
        int n8 = t4.g();
        int n10 = -1;
        int n14 = n4 > n3 ? 1 : -1;
        while (n3 != n4) {
            View view = (View)this.a.get(n3);
            t t7 = staggeredGridLayoutManager.c;
            int n15 = t7.e(view);
            t t9 = staggeredGridLayoutManager.c;
            int n16 = t9.b(view);
            boolean bl2 = false;
            boolean bl3 = n15 <= n8;
            if (n16 >= n7) {
                bl2 = true;
            }
            if (bl3 && bl2 && (n15 < n7 || n16 > n8)) {
                n10 = staggeredGridLayoutManager.getPosition(view);
                break;
            }
            n3 += n14;
        }
        return n10;
    }

    public final int h(int n3) {
        int n4 = this.c;
        int n7 = -1 << -1;
        if (n4 != n7) {
            return n4;
        }
        ArrayList arrayList = this.a;
        n4 = arrayList.size();
        if (n4 == 0) {
            return n3;
        }
        this.b();
        return this.c;
    }

    public final View i(int n3, int n4) {
        int n7 = -1;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        ArrayList arrayList = this.a;
        View view = null;
        if (n4 == n7) {
            n4 = arrayList.size();
            Object var7_7 = null;
            for (n7 = 0; n7 < n4; ++n7) {
                View view2 = (View)arrayList.get(n7);
                int n8 = staggeredGridLayoutManager.h;
                if (!(n8 != 0 && (n8 = staggeredGridLayoutManager.getPosition(view2)) <= n3 || (n8 = staggeredGridLayoutManager.h) == 0 && (n8 = staggeredGridLayoutManager.getPosition(view2)) >= n3 || (n8 = (int)(view2.hasFocusable() ? 1 : 0)) == 0)) {
                    view = view2;
                    continue;
                }
                break;
            }
        } else {
            for (n4 = arrayList.size() + -1; n4 >= 0; n4 += -1) {
                View view3 = (View)arrayList.get(n4);
                int n10 = staggeredGridLayoutManager.h;
                if (!(n10 != 0 && (n10 = staggeredGridLayoutManager.getPosition(view3)) >= n3 || (n10 = staggeredGridLayoutManager.h) == 0 && (n10 = staggeredGridLayoutManager.getPosition(view3)) <= n3 || (n10 = (int)(view3.hasFocusable() ? 1 : 0)) == 0)) {
                    view = view3;
                    continue;
                }
                break;
            }
        }
        return view;
    }

    public final int j(int n3) {
        int n4 = this.b;
        int n7 = -1 << -1;
        if (n4 != n7) {
            return n4;
        }
        ArrayList arrayList = this.a;
        n4 = arrayList.size();
        if (n4 == 0) {
            return n3;
        }
        this.c();
        return this.b;
    }

    public final void k() {
        int n3;
        ArrayList arrayList = this.a;
        int n4 = arrayList.size();
        int n7 = n4 + -1;
        arrayList = (View)arrayList.remove(n7);
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)arrayList.getLayoutParams();
        t t3 = null;
        staggeredGridLayoutManager$LayoutParams.a = null;
        boolean bl2 = staggeredGridLayoutManager$LayoutParams.isItemRemoved();
        if (bl2 || (n7 = (int)(staggeredGridLayoutManager$LayoutParams.isItemChanged() ? 1 : 0)) != 0) {
            n7 = this.d;
            t3 = this.f.c;
            n3 = t3.c((View)arrayList);
            this.d = n7 -= n3;
        }
        n3 = 1;
        n7 = -1 << -1;
        if (n4 == n3) {
            this.b = n7;
        }
        this.c = n7;
    }

    public final void l() {
        ArrayList arrayList = this.a;
        int n3 = 0;
        View view = (View)arrayList.remove(0);
        Object object = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
        ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).a = null;
        int n4 = arrayList.size();
        int n7 = -1 << -1;
        if (n4 == 0) {
            this.c = n7;
        }
        if ((n4 = (int)(((RecyclerView$LayoutParams)((Object)object)).isItemRemoved() ? 1 : 0)) != 0 || (n4 = (int)(((RecyclerView$LayoutParams)((Object)object)).isItemChanged() ? 1 : 0)) != 0) {
            n4 = this.d;
            object = this.f.c;
            n3 = ((t)object).c(view);
            this.d = n4 -= n3;
        }
        this.b = n7;
    }

    public final void m(View view) {
        int n3;
        int n4;
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
        staggeredGridLayoutManager$LayoutParams.a = this;
        Object object = this.a;
        ((ArrayList)object).add(0, view);
        this.b = n4 = -1 << -1;
        int n7 = ((ArrayList)object).size();
        int n8 = 1;
        if (n7 == n8) {
            this.c = n4;
        }
        if ((n7 = (int)(staggeredGridLayoutManager$LayoutParams.isItemRemoved() ? 1 : 0)) != 0 || (n3 = staggeredGridLayoutManager$LayoutParams.isItemChanged()) != 0) {
            int n10;
            n3 = this.d;
            object = this.f.c;
            this.d = n10 = ((t)object).c(view) + n3;
        }
    }
}

