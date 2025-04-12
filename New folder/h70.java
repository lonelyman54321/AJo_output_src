/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h70
extends LP1$c
implements it0_0,
rp1_1 {
    public im2 n;
    public Nc o;
    public i70_0 p;
    public float q;
    public TX r;

    public final /* synthetic */ void C0() {
    }

    public final boolean g1() {
        return false;
    }

    public final int maxIntrinsicHeight(Rj1 object, Qj1 qj1, int n3) {
        long l2;
        object = this.n;
        long l3 = ((im2)object).getIntrinsicSize-NH-jbRc();
        long l4 = l3 - (l2 = 9205357640488583168L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = f60.b(n3, 0, 13);
            l3 = this.s1(l3);
            object2 = c60.i(l3);
            object2 = qj1.v((int)object2);
            float f5 = n3;
            float f6 = object2;
            long l7 = bo1_1.a(f5, f6);
            l7 = this.r1(l7);
            f5 = C63.b(l7);
            int n4 = ok1_1.b(f5);
            object2 = Math.max(n4, (int)object2);
        } else {
            object2 = qj1.v(n3);
        }
        return (int)object2;
    }

    public final int maxIntrinsicWidth(Rj1 object, Qj1 qj1, int n3) {
        long l2;
        object = this.n;
        long l3 = ((im2)object).getIntrinsicSize-NH-jbRc();
        long l4 = l3 - (l2 = 9205357640488583168L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = f60.b(0, n3, 7);
            l3 = this.s1(l3);
            object2 = c60.h(l3);
            object2 = qj1.P((int)object2);
            float f5 = object2;
            float f6 = n3;
            long l7 = bo1_1.a(f5, f6);
            l7 = this.r1(l7);
            f5 = C63.d(l7);
            int n4 = ok1_1.b(f5);
            object2 = Math.max(n4, (int)object2);
        } else {
            object2 = qj1.P(n3);
        }
        return (int)object2;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        l2 = this.s1(l2);
        object = object.Q(l2);
        int n3 = ((Ns2)object).a;
        int n4 = ((Ns2)object).b;
        l8_0 l8_02 = new l8_0(object, 1);
        return cl1_0.a(dl1_12, n3, n4, l8_02);
    }

    public final int minIntrinsicHeight(Rj1 object, Qj1 qj1, int n3) {
        long l2;
        object = this.n;
        long l3 = ((im2)object).getIntrinsicSize-NH-jbRc();
        long l4 = l3 - (l2 = 9205357640488583168L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = f60.b(n3, 0, 13);
            l3 = this.s1(l3);
            object2 = c60.i(l3);
            object2 = qj1.I((int)object2);
            float f5 = n3;
            float f6 = object2;
            long l7 = bo1_1.a(f5, f6);
            l7 = this.r1(l7);
            f5 = C63.b(l7);
            int n4 = ok1_1.b(f5);
            object2 = Math.max(n4, (int)object2);
        } else {
            object2 = qj1.I(n3);
        }
        return (int)object2;
    }

    public final int minIntrinsicWidth(Rj1 object, Qj1 qj1, int n3) {
        long l2;
        object = this.n;
        long l3 = ((im2)object).getIntrinsicSize-NH-jbRc();
        long l4 = l3 - (l2 = 9205357640488583168L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = f60.b(0, n3, 7);
            l3 = this.s1(l3);
            object2 = c60.h(l3);
            object2 = qj1.N((int)object2);
            float f5 = object2;
            float f6 = n3;
            long l7 = bo1_1.a(f5, f6);
            l7 = this.r1(l7);
            f5 = C63.d(l7);
            int n4 = ok1_1.b(f5);
            object2 = Math.max(n4, (int)object2);
        } else {
            object2 = qj1.N(n3);
        }
        return (int)object2;
    }

    public final void n(E60 e60) {
        long l2 = e60.l();
        long l3 = this.r1(l2);
        Nc nc = this.o;
        int n3 = ok1_1.b(C63.d(l3));
        int n4 = ok1_1.b(C63.b(l3));
        long l4 = dj1.a(n3, n4);
        l2 = e60.l();
        int n7 = ok1_1.b(C63.d(l2));
        n3 = ok1_1.b(C63.b(l2));
        long l7 = dj1.a(n7, n3);
        bp1_0 bp1_02 = e60.getLayoutDirection();
        l2 = nc.a(l4, l7, bp1_02);
        int n8 = (int)(l2 >> 32);
        n4 = (int)(l2 & 0xFFFFFFFFL);
        float f5 = n8;
        float f6 = n4;
        e60.M0().a.g(f5, f6);
        Object object = this.n;
        float f7 = this.q;
        TX tX = this.r;
        ((im2)object).draw-x_KDEd0(e60, l3, f7, tX);
        object = e60.M0().a;
        f5 = -f5;
        f6 = -f6;
        ((yl_0)object).g(f5, f6);
        e60.e1();
    }

    public final long r1(long l2) {
        long l3;
        boolean bl2 = C63.e(l2);
        if (bl2) {
            return 0L;
        }
        im2 im22 = this.n;
        long l4 = im22.getIntrinsicSize-NH-jbRc();
        long l7 = l4 - (l3 = 9205357640488583168L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return l2;
        }
        float f5 = C63.d(l4);
        boolean bl3 = Float.isInfinite(f5);
        if (bl3 || (bl3 = Float.isNaN(f5))) {
            f5 = C63.d(l2);
        }
        float f6 = C63.b(l4);
        boolean bl4 = Float.isInfinite(f6);
        if (bl4 || (bl4 = Float.isNaN(f6))) {
            f6 = C63.b(l2);
        }
        l4 = bo1_1.a(f5, f6);
        i70_0 i70_02 = this.p;
        l3 = i70_02.a(l4, l2);
        float f7 = YS2.a(l3);
        boolean bl5 = Float.isInfinite(f7);
        if (!bl5 && (object = (Object)Float.isNaN(f7)) == false && !(bl5 = Float.isInfinite(f7 = YS2.b(l3))) && (object = (Object)Float.isNaN(f7)) == false) {
            l2 = ZS2.d(l4, l3);
        }
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    public final long s1(long var1_1) {
        var3_2 = c60.g(var1_1);
        var4_3 = c60.f(var1_1);
        if (var3_2 != 0 && var4_3 != 0) {
            return var1_1;
        }
        var5_4 = c60.e(var1_1);
        if (var5_4 != 0 && (var5_4 = c60.d(var1_1)) != 0) {
            var5_4 = 1;
            var6_5 = 1.4E-45f;
        } else {
            var5_4 = 0;
            var6_5 = 0.0f;
        }
        var7_6 = this.n;
        var8_7 = var7_6.getIntrinsicSize-NH-jbRc();
        var10_8 = 9205357640488583168L;
        var12_9 = var8_7 == var10_8 ? 0 : (var8_7 < var10_8 ? -1 : 1);
        if (var12_9 == false) {
            if (var5_4 != 0) {
                var3_2 = c60.i(var1_1);
                var5_4 = c60.h(var1_1);
                return c60.b(var1_1, var3_2, 0, var5_4, 0, 10);
            }
            return var1_1;
        }
        if (var5_4 != 0 && (var3_2 != 0 || var4_3 != 0)) {
            var3_2 = c60.i(var1_1);
            var13_10 = var3_2;
            var4_3 = c60.h(var1_1);
lbl26:
            // 2 sources

            while (true) {
                var14_11 = var4_3;
                break;
            }
        } else {
            var13_10 = C63.d(var8_7);
            var14_11 = C63.b(var8_7);
            var5_4 = (int)Float.isInfinite(var13_10);
            if (var5_4 == 0 && (var5_4 = (int)Float.isNaN(var13_10)) == 0) {
                var5_4 = c60.k(var1_1);
                var6_5 = var5_4;
                var15_12 = c60.i(var1_1);
                var16_13 = var15_12;
                var13_10 = kotlin.ranges.f.f(var13_10, var6_5, var16_13);
            } else {
                var3_2 = c60.k(var1_1);
                var13_10 = var3_2;
            }
            var5_4 = (int)Float.isInfinite(var14_11);
            if (var5_4 == 0 && (var5_4 = (int)Float.isNaN(var14_11)) == 0) {
                var5_4 = c60.j(var1_1);
                var6_5 = var5_4;
                var15_12 = c60.h(var1_1);
                var16_13 = var15_12;
                var14_11 = kotlin.ranges.f.f(var14_11, var6_5, var16_13);
            } else {
                var4_3 = c60.j(var1_1);
                ** continue;
            }
        }
        var17_14 = bo1_1.a(var13_10, var14_11);
        var17_14 = this.r1(var17_14);
        var6_5 = C63.d(var17_14);
        var13_10 = C63.b(var17_14);
        var4_3 = f60.h(ok1_1.b(var6_5), var1_1);
        var5_4 = f60.g(ok1_1.b(var13_10), var1_1);
        var3_2 = var4_3;
        var19_15 = 10;
        return c60.b(var1_1, var4_3, 0, var5_4, 0, var19_15);
    }
}

