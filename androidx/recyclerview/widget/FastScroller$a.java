/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;

public final class FastScroller$a
extends RecyclerView$s {
    public final /* synthetic */ FastScroller a;

    public FastScroller$a(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        float f5;
        RecyclerView recyclerView2;
        n3 = recyclerView.computeHorizontalScrollOffset();
        int n7 = recyclerView.computeVerticalScrollOffset();
        FastScroller fastScroller = this.a;
        RecyclerView recyclerView3 = fastScroller.s;
        int n8 = recyclerView3.computeVerticalScrollRange();
        int n10 = fastScroller.r;
        int n14 = n8 - n10;
        int n15 = fastScroller.a;
        float f6 = 0.0f;
        int n16 = 1;
        if (n14 > 0 && n10 >= n15) {
            n14 = 1;
        } else {
            n14 = 0;
            recyclerView2 = null;
        }
        fastScroller.t = n14;
        recyclerView2 = fastScroller.s;
        n14 = recyclerView2.computeHorizontalScrollRange();
        int n17 = fastScroller.q;
        int n18 = n14 - n17;
        if (n18 > 0 && n17 >= n15) {
            n15 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n15 = 0;
            f5 = 0.0f;
        }
        fastScroller.u = n15;
        n18 = (int)(fastScroller.t ? 1 : 0);
        if (n18 == 0 && n15 == 0) {
            n7 = fastScroller.v;
            if (n7 != 0) {
                fastScroller.i(0);
            }
        } else {
            float f7;
            n15 = 0x40000000;
            f5 = 2.0f;
            if (n18 != 0) {
                f7 = n7;
                f6 = n10;
                float f8 = (f6 / f5 + f7) * f6;
                f7 = n8;
                fastScroller.l = n7 = (int)(f8 /= f7);
                n7 = n10 * n10 / n8;
                fastScroller.k = n7 = Math.min(n10, n7);
            }
            if ((n7 = (int)(fastScroller.u ? 1 : 0)) != 0) {
                f7 = n3;
                float f11 = n17;
                float f12 = (f11 / f5 + f7) * f11;
                f7 = n14;
                fastScroller.o = n7 = (int)(f12 /= f7);
                n7 = n17 * n17 / n14;
                fastScroller.n = n7 = Math.min(n17, n7);
            }
            if ((n7 = fastScroller.v) == 0 || n7 == n16) {
                fastScroller.i(n16);
            }
        }
    }
}

