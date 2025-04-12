/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class StaggeredGridLayoutManager$a {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public StaggeredGridLayoutManager$a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        this.a();
    }

    public final void a() {
        int n3;
        this.a = n3 = -1;
        this.b = -1 << -1;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] nArray = this.f;
        if (nArray != null) {
            Arrays.fill(nArray, n3);
        }
    }
}

