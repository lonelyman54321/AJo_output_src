/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l;
import java.util.ArrayList;

public abstract class x
extends RecyclerView$l {
    public boolean g;

    public x() {
        long l2;
        ArrayList arrayList;
        this.a = null;
        this.b = arrayList = new ArrayList();
        this.c = l2 = (long)120;
        this.d = l2;
        this.e = l2 = 250L;
        this.f = l2;
        this.g = true;
    }

    public abstract void h(RecyclerView$B var1);

    public abstract boolean i(RecyclerView$B var1, RecyclerView$B var2, int var3, int var4, int var5, int var6);

    public abstract boolean j(RecyclerView$B var1, int var2, int var3, int var4, int var5);

    public abstract void k(RecyclerView$B var1);
}

