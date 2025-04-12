/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public final class Ws1
implements Ts1,
bl1_0 {
    public final xs1_0 a;
    public int b;
    public boolean c;
    public float d;
    public final float e;
    public final boolean f;
    public final i90_0 g;
    public final Vo0 h;
    public final long i;
    public final List j;
    public final int k;
    public final int l;
    public final int m;
    public final pg2_0 n;
    public final int o;
    public final int p;
    public final /* synthetic */ bl1_0 q;

    public Ws1() {
        throw null;
    }

    public Ws1(xs1_0 xs1_02, int n3, boolean bl2, float f5, bl1_0 bl1_02, float f6, boolean bl3, c80 c802, Vo0 vo0, long l2, List list, int n4, int n7, int n8, pg2_0 pg2_02, int n10, int n14) {
        this.a = xs1_02;
        this.b = n3;
        this.c = bl2;
        this.d = f5;
        this.e = f6;
        this.f = bl3;
        this.g = c802;
        this.h = vo0;
        this.i = l2;
        this.j = list;
        this.k = n4;
        this.l = n7;
        this.m = n8;
        this.n = pg2_02;
        this.o = n10;
        this.p = n14;
        this.q = bl1_02;
    }

    public final pg2_0 a() {
        return this.n;
    }

    public final long b() {
        bl1_0 bl1_02 = this.q;
        int n3 = bl1_02.getWidth();
        int n4 = bl1_02.getHeight();
        return dj1.a(n3, n4);
    }

    public final int c() {
        return this.o;
    }

    public final int d() {
        return this.l;
    }

    public final int e() {
        return -this.k;
    }

    public final int f() {
        return this.k;
    }

    public final int g() {
        return this.m;
    }

    public final int getHeight() {
        return this.q.getHeight();
    }

    public final int getWidth() {
        return this.q.getWidth();
    }

    public final int h() {
        return this.p;
    }

    public final List i() {
        return this.j;
    }

    public final void j() {
        this.q.j();
    }

    public final Function1 k() {
        return this.q.k();
    }

    public final boolean l(int n3, boolean bl2) {
        boolean bl3;
        block12: {
            float f5;
            int n4;
            int n7;
            xs1_0 xs1_02;
            int n8;
            List list;
            int n10;
            boolean bl4;
            int n14;
            Ws1 ws1;
            block14: {
                int n15;
                xs1_0 xs1_03;
                block13: {
                    ws1 = this;
                    n14 = n3;
                    bl4 = this.f;
                    bl3 = false;
                    if (bl4 || (n10 = (list = this.j).isEmpty()) != 0 || (xs1_03 = this.a) == null) break block12;
                    n10 = xs1_03.s;
                    n8 = this.b - n3;
                    if (n8 < 0 || n8 >= n10) break block12;
                    xs1_03 = (xs1_0)CollectionsKt.L(list);
                    xs1_02 = (xs1_0)CollectionsKt.S(list);
                    n7 = xs1_03.u;
                    if (n7 != 0 || (n7 = xs1_02.u) != 0) break block12;
                    n7 = this.l;
                    n15 = this.k;
                    if (n3 >= 0) break block13;
                    n4 = xs1_03.p;
                    n10 = xs1_03.s;
                    n4 = n4 + n10 - n15;
                    n10 = xs1_02.p;
                    n8 = xs1_02.s;
                    n10 = n10 + n8 - n7;
                    if ((n10 = Math.min(n4, n10)) <= (n8 = -n3)) break block12;
                    break block14;
                }
                n10 = xs1_03.p;
                n15 -= n10;
                n10 = xs1_02.p;
                if ((n10 = Math.min(n15, n7 -= n10)) <= n3) break block12;
            }
            ws1.b = n10 = ws1.b - n14;
            n10 = list.size();
            n8 = 0;
            xs1_02 = null;
            while (true) {
                n7 = 1;
                if (n8 >= n10) break;
                xs1_0 xs1_04 = (xs1_0)list.get(n8);
                n4 = (int)(xs1_04.u ? 1 : 0);
                if (n4 == 0) {
                    int n16;
                    xs1_04.p = n4 = xs1_04.p + n14;
                    int[] nArray = xs1_04.y;
                    int n17 = nArray.length;
                    int n18 = 0;
                    Object object = null;
                    while (true) {
                        int n19;
                        n16 = xs1_04.c;
                        if (n18 >= n17) break;
                        if (n16 != 0 && (n19 = n18 % 2) == n7 || n16 == 0 && (n16 = n18 % 2) == 0) {
                            nArray[n18] = n16 = nArray[n18] + n14;
                        }
                        ++n18;
                    }
                    if (bl2) {
                        List list2 = xs1_04.b;
                        n7 = list2.size();
                        nArray = null;
                        for (n4 = 0; n4 < n7; ++n4) {
                            long l2;
                            Object object2 = xs1_04.n;
                            object = xs1_04.l;
                            if ((object2 = ((LazyLayoutItemAnimator)object2).a(n4, object)) == null) continue;
                            long l3 = ((Gr1)object2).l;
                            n18 = 32;
                            if (n16 != 0) {
                                l2 = l3 >> n18;
                                n18 = (int)l2;
                            } else {
                                l2 = l3 >> n18;
                                n18 = (int)l2 + n14;
                            }
                            l2 = 0xFFFFFFFFL;
                            int n20 = n16 != 0 ? (int)(l3 &= l2) + n14 : (int)(l3 &= l2);
                            ((Gr1)object2).l = l3 = Ti1.a(n18, n20);
                        }
                    }
                }
                ++n8;
            }
            ws1.d = f5 = (float)n14;
            bl4 = ws1.c;
            if (!bl4 && n14 > 0) {
                ws1.c = n7;
            }
            bl3 = true;
        }
        return bl3;
    }

    public final Map p() {
        return this.q.p();
    }
}

