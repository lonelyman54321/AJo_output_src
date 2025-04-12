/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.c$a_0;
import androidx.recyclerview.widget.p$a;
import androidx.recyclerview.widget.p$b;
import androidx.recyclerview.widget.z$d;

public final class p {
    public final be3_0 a;
    public final z.d b;
    public final RecyclerView$f c;
    public final p$b d;
    public int e;

    public p(RecyclerView$f recyclerView$f, p$b object, C c2, z.d d2) {
        int n3;
        p$a p$a = new p$a(this);
        this.c = recyclerView$f;
        this.d = object;
        c2.getClass();
        this.a = object = new c$a_0(c2, this);
        this.b = d2;
        this.e = n3 = recyclerView$f.getItemCount();
        recyclerView$f.registerAdapterDataObserver(p$a);
    }
}

