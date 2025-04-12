/*
 * Decompiled with CFR 0.152.
 */
public final class RB2$a
implements Kx$f {
    public final On3 a;
    public final Xm2 b;

    public RB2$a(On3 object) {
        this.a = object;
        this.b = object = new Xm2();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Kx$e a(il0_0 il0_02, long l2) {
        long l3;
        RB2$a rB2$a = this;
        Object object = il0_02;
        long l4 = il0_02.d;
        long l7 = il0_02.c - l4;
        long l8 = 20000L;
        l7 = Math.min(l8, l7);
        int n3 = (int)l7;
        Xm2 xm2 = this.b;
        xm2.F(n3);
        byte[] byArray = xm2.a;
        Object object2 = null;
        il0_02.b(byArray, 0, n3, false);
        int n4 = -1;
        long l12 = l3 = -9223372036854775807L;
        int n7 = -1;
        while (true) {
            block12: {
                byte[] byArray2;
                int n8;
                int n10;
                int n14;
                int n15;
                int n16;
                block15: {
                    block10: {
                        block16: {
                            block14: {
                                block13: {
                                    block11: {
                                        if ((n16 = xm2.a()) < (n15 = 4)) break block10;
                                        byte[] byArray3 = xm2.a;
                                        n16 = RB2.d(xm2.b, byArray3);
                                        n14 = 1;
                                        n10 = 442;
                                        if (n16 != n10) {
                                            xm2.J(n14);
                                            continue;
                                        }
                                        xm2.J(n15);
                                        long l14 = SB2.c(xm2);
                                        n4 = (int)(l14 == l3 ? 0 : (l14 < l3 ? -1 : 1));
                                        if (n4 != 0) {
                                            object = rB2$a.a;
                                            long l15 = (l14 = ((On3)object).b(l14)) - l2;
                                            n4 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                                            if (n4 > 0) {
                                                n4 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
                                                if (n4 == 0) {
                                                    int n17 = -1;
                                                    object = object2;
                                                    l3 = l14;
                                                    return new Kx$e(n17, l14, l4);
                                                }
                                                long l16 = n7;
                                                long l17 = l4 + l16;
                                                n16 = 0;
                                                Object var24_22 = null;
                                                long l18 = -9223372036854775807L;
                                                object2 = object;
                                                object = new Kx$e(0, l18, l17);
                                                return object;
                                            }
                                            l8 = 100000L + l14;
                                            long l19 = l8 - l2;
                                            n4 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                                            if (n4 > 0) {
                                                n4 = xm2.b;
                                                long l20 = n4;
                                                long l21 = l4 + l20;
                                                n16 = 0;
                                                Object var24_23 = null;
                                                long l22 = -9223372036854775807L;
                                                object2 = object;
                                                object = new Kx$e(0, l22, l21);
                                                return object;
                                            }
                                            n7 = n4 = xm2.b;
                                            l12 = l14;
                                        }
                                        n4 = xm2.c;
                                        n16 = xm2.a();
                                        if (n16 >= (n8 = 10)) break block11;
                                        xm2.I(n4);
                                        break block12;
                                    }
                                    xm2.J(9);
                                    n16 = xm2.w() & 7;
                                    n8 = xm2.a();
                                    if (n8 >= n16) break block13;
                                    xm2.I(n4);
                                    break block12;
                                }
                                xm2.J(n16);
                                n16 = xm2.a();
                                if (n16 >= n15) break block14;
                                xm2.I(n4);
                                break block12;
                            }
                            byte[] byArray4 = xm2.a;
                            n16 = RB2.d(xm2.b, byArray4);
                            if (n16 != (n8 = 443)) break block15;
                            xm2.J(n15);
                            n16 = xm2.C();
                            n8 = xm2.a();
                            if (n8 >= n16) break block16;
                            xm2.I(n4);
                            break block12;
                        }
                        xm2.J(n16);
                        break block15;
                    }
                    Object object3 = l12 == l3 ? 0 : (l12 < l3 ? -1 : 1);
                    if (object3 == false) return Kx$e.d;
                    long l23 = n4;
                    long l24 = l4 + l23;
                    n15 = -2;
                    Kx$e kx$e = object2;
                    return new Kx$e(n15, l12, l24);
                }
                while ((n16 = xm2.a()) >= n15 && (n16 = RB2.d(n8 = xm2.b, byArray2 = xm2.a)) != n10 && n16 != (n8 = 441) && (n16 >>>= 8) == n14) {
                    xm2.J(n15);
                    n16 = xm2.a();
                    n8 = 2;
                    if (n16 < n8) {
                        xm2.I(n4);
                        break;
                    }
                    n16 = xm2.C();
                    n8 = xm2.c;
                    int n18 = xm2.b + n16;
                    n16 = Math.min(n8, n18);
                    xm2.I(n16);
                }
            }
            n4 = xm2.b;
        }
    }

    public final void b() {
        byte[] byArray = gz3.f;
        Xm2 xm2 = this.b;
        xm2.getClass();
        int n3 = byArray.length;
        xm2.G(n3, byArray);
    }
}

