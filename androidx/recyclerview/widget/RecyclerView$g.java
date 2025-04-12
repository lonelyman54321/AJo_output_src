/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Observable
 */
package androidx.recyclerview.widget;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.ArrayList;

public final class RecyclerView$g
extends Observable {
    public final boolean a() {
        return this.mObservers.isEmpty() ^ true;
    }

    public final void b() {
        ArrayList arrayList = this.mObservers;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$h recyclerView$h = (RecyclerView$h)this.mObservers.get(i3);
            recyclerView$h.onChanged();
        }
    }

    public final void c(int n3, int n4) {
        ArrayList arrayList = this.mObservers;
        int n7 = arrayList.size();
        int n8 = 1;
        n7 -= n8;
        while (n7 >= 0) {
            RecyclerView$h recyclerView$h = (RecyclerView$h)this.mObservers.get(n7);
            recyclerView$h.onItemRangeMoved(n3, n4, n8);
            n7 += -1;
        }
    }

    public final void d(int n3, int n4, Object object) {
        ArrayList arrayList = this.mObservers;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$h recyclerView$h = (RecyclerView$h)this.mObservers.get(i3);
            recyclerView$h.onItemRangeChanged(n3, n4, object);
        }
    }

    public final void e(int n3, int n4) {
        ArrayList arrayList = this.mObservers;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$h recyclerView$h = (RecyclerView$h)this.mObservers.get(i3);
            recyclerView$h.onItemRangeInserted(n3, n4);
        }
    }

    public final void f(int n3, int n4) {
        ArrayList arrayList = this.mObservers;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$h recyclerView$h = (RecyclerView$h)this.mObservers.get(i3);
            recyclerView$h.onItemRangeRemoved(n3, n4);
        }
    }

    public final void g() {
        ArrayList arrayList = this.mObservers;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$h recyclerView$h = (RecyclerView$h)this.mObservers.get(i3);
            recyclerView$h.onStateRestorationPolicyChanged();
        }
    }
}

