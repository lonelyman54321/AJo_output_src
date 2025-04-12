/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView$B;

public final class DefaultItemAnimator$a {
    public RecyclerView$B a;
    public RecyclerView$B b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChangeInfo{oldHolder=");
        RecyclerView$B recyclerView$B = this.a;
        stringBuilder.append(recyclerView$B);
        stringBuilder.append(", newHolder=");
        recyclerView$B = this.b;
        stringBuilder.append(recyclerView$B);
        stringBuilder.append(", fromX=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", fromY=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", toX=");
        n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", toY=");
        n3 = this.f;
        return tu.a(stringBuilder, n3, '}');
    }
}

