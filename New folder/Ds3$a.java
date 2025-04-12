/*
 * Decompiled with CFR 0.152.
 */
public final class Ds3$a
implements Kx$f {
    public final On3 a;
    public final Xm2 b;
    public final int c;
    public final int d;

    public Ds3$a(int n3, On3 on3, int n4) {
        Xm2 xm2;
        this.c = n3;
        this.a = on3;
        this.d = n4;
        this.b = xm2 = new Xm2();
    }

    public final Kx$e a(il0_0 il0_02, long l2) {
        Object object;
        block10: {
            long l3;
            Object object2;
            int n3;
            long l4;
            Ds3$a ds3$a = this;
            Object object3 = il0_02;
            long l7 = il0_02.d;
            int n4 = this.d;
            long l8 = n4;
            long l12 = il0_02.c - l7;
            l8 = Math.min(l8, l12);
            int n7 = (int)l8;
            Xm2 xm2 = this.b;
            xm2.F(n7);
            byte[] byArray = xm2.a;
            int n8 = 0;
            object = null;
            il0_02.b(byArray, 0, n7, false);
            int n10 = xm2.c;
            long l14 = l4 = (long)-1;
            long l15 = -9223372036854775807L;
            while (true) {
                byte by2;
                int n14;
                if ((n14 = xm2.a()) < (n3 = 188)) break;
                object2 = xm2.a;
                for (n3 = xm2.b; n3 < n10 && (by2 = object2[n3]) != (n8 = 71); ++n3) {
                }
                n8 = n3 + 188;
                if (n8 > n10) {
                    break;
                }
                n7 = ds3$a.c;
                l4 = Hs3.a(xm2, n3, n7);
                long l16 = l4 - (l3 = -9223372036854775807L);
                Object object4 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object4 != false) {
                    Object object5 = ds3$a.a;
                    long l17 = (l4 = ((On3)object5).b(l4)) - l2;
                    object4 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                    if (object4 > 0) {
                        n10 = (int)(l15 == l3 ? 0 : (l15 < l3 ? -1 : 1));
                        if (n10 == 0) {
                            n4 = -1;
                            object3 = object;
                            object = new Kx$e(n4, l4, l7);
                        } else {
                            long l18 = l7 + l14;
                            long l19 = -9223372036854775807L;
                            object5 = object;
                            object = new Kx$e(0, l19, l18);
                        }
                        break block10;
                    }
                    long l20 = 100000L + l4;
                    long l21 = l20 - l2;
                    Object object6 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                    if (object6 > 0) {
                        long l22 = n3;
                        long l23 = l7 + l22;
                        object4 = 0;
                        object5 = null;
                        l14 = -9223372036854775807L;
                        object = object3;
                        object3 = new Kx$e(0, l14, l23);
                        break block10;
                    }
                    l20 = n3;
                    l15 = l4;
                    l14 = l20;
                }
                xm2.I(n8);
                l4 = n8;
            }
            long l24 = -9223372036854775807L;
            n8 = l15 == l24 ? 0 : (l15 < l24 ? -1 : 1);
            if (n8 != 0) {
                l3 = l7 + l4;
                n3 = -2;
                object2 = object;
                object = new Kx$e(n3, l15, l3);
            } else {
                object = Kx$e.d;
            }
        }
        return object;
    }

    public final void b() {
        byte[] byArray = gz3.f;
        Xm2 xm2 = this.b;
        xm2.getClass();
        int n3 = byArray.length;
        xm2.G(n3, byArray);
    }
}

