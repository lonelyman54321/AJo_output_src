/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/*
 * Renamed from dr1
 */
public final class dr1_0
implements jq1_0,
gs1_0 {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final bp1_0 f;
    public final int g;
    public final int h;
    public final List i;
    public final long j;
    public final Object k;
    public final LazyLayoutItemAnimator l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public final long u;
    public long v;
    public int w;
    public int x;
    public boolean y;

    public dr1_0() {
        throw null;
    }

    public dr1_0(int n3, Object object, boolean bl2, int n4, int n7, boolean bl3, bp1_0 bp1_02, int n8, int n10, List list, long l2, Object object2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long l3, int n14, int n15) {
        long l4;
        dr1_0 dr1_02 = this;
        List list2 = list;
        int n16 = n3;
        this.a = n3;
        this.b = object;
        n16 = (int)(bl2 ? 1 : 0);
        this.c = bl2;
        n16 = n4;
        this.d = n4;
        n16 = (int)(bl3 ? 1 : 0);
        this.e = bl3;
        this.f = bp1_02;
        n16 = n8;
        this.g = n8;
        n16 = n10;
        this.h = n10;
        this.i = list;
        this.j = l2;
        this.k = object2;
        this.l = lazyLayoutItemAnimator;
        this.m = l3;
        n16 = n14;
        this.n = n14;
        n16 = n15;
        this.o = n15;
        this.r = -1 << -1;
        n16 = list.size();
        int n17 = 0;
        int n18 = 0;
        for (int i3 = 0; i3 < n16; ++i3) {
            Ns2 ns2 = (Ns2)list2.get(i3);
            boolean bl4 = dr1_02.c;
            int n19 = bl4 ? ns2.b : ns2.a;
            n18 = Math.max(n18, n19);
        }
        dr1_02.p = n18;
        int n20 = n18 + n7;
        if (n20 >= 0) {
            n17 = n20;
        }
        dr1_02.q = n17;
        n20 = (int)(dr1_02.c ? 1 : 0);
        if (n20 != 0) {
            n20 = dr1_02.d;
            l4 = dj1.a(n20, n18);
        } else {
            n20 = dr1_02.d;
            l4 = dj1.a(n18, n20);
        }
        dr1_02.u = l4;
        dr1_02.v = 0L;
        dr1_02.w = n20 = -1;
        dr1_02.x = n20;
    }

    public final long a() {
        return this.u;
    }

    public final long b() {
        return this.m;
    }

    public final int c() {
        return this.i.size();
    }

    public final int d() {
        return this.o;
    }

    public final int e() {
        return this.w;
    }

    public final boolean f() {
        return this.c;
    }

    public final int g() {
        return this.x;
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getKey() {
        return this.b;
    }

    public final void h(int n3, int n4, int n7, int n8) {
        this.p(n3, n4, n7, n8, -1, -1);
    }

    public final int i() {
        return this.q;
    }

    public final Object j(int n3) {
        return ((Ns2)this.i.get(n3)).B();
    }

    public final void k() {
        this.y = true;
    }

    public final long l(int n3) {
        return this.v;
    }

    public final int m() {
        return this.n;
    }

    public final long n() {
        return this.v;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int o(long l2) {
        int n3 = this.c;
        if (n3 != 0) {
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
            return (int)l2;
        }
        n3 = 32;
        l2 >>= n3;
        return (int)l2;
    }

    public final void p(int n3, int n4, int n7, int n8, int n10, int n14) {
        bp1_0 bp1_02;
        bp1_0 bp1_03;
        boolean bl2 = this.c;
        int n15 = bl2 ? n8 : n7;
        this.r = n15;
        if (!bl2) {
            n7 = n8;
        }
        if (bl2 && (bp1_03 = this.f) == (bp1_02 = bp1_0.Rtl)) {
            n7 -= n4;
            n4 = this.d;
            n4 = n7 - n4;
        }
        long l2 = bl2 ? Ti1.a(n4, n3) : Ti1.a(n3, n4);
        this.v = l2;
        this.w = n10;
        this.x = n14;
        this.s = n3 = -this.g;
        n3 = this.r;
        n4 = this.h;
        this.t = n3 += n4;
    }
}

