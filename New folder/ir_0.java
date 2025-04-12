/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from iR
 */
public final class ir_0 {
    public static void a(long l2, Xm2 xm2, wp3[] wp3Array) {
        int n3;
        int n4;
        while ((n4 = xm2.a()) > (n3 = 1)) {
            int n7;
            int n8;
            int n10;
            int n14;
            int n15;
            String string2;
            block12: {
                n4 = 0;
                string2 = null;
                n15 = 0;
                do {
                    n14 = xm2.a();
                    n10 = 255;
                    n8 = -1;
                    if (n14 == 0) {
                        n14 = -1;
                        break block12;
                    }
                    n14 = xm2.w();
                    n15 += n14;
                } while (n14 == n10);
                n14 = n15;
            }
            n15 = 0;
            do {
                if ((n7 = xm2.a()) == 0) {
                    n15 = -1;
                    break;
                }
                n7 = xm2.w();
                n15 += n7;
            } while (n7 == n10);
            n10 = xm2.b + n15;
            if (n15 != n8 && n15 <= (n8 = xm2.a())) {
                n8 = 4;
                if (n14 == n8 && n15 >= (n14 = 8)) {
                    int n16;
                    n15 = xm2.w();
                    n14 = xm2.C();
                    n7 = n14 == (n8 = 49) ? xm2.i() : 0;
                    int n17 = xm2.w();
                    int n18 = 47;
                    if (n14 == n18) {
                        xm2.J(n3);
                    }
                    n15 = n15 == (n16 = 181) && (n14 == n8 || n14 == n18) && n17 == (n15 = 3) ? 1 : 0;
                    if (n14 == n8) {
                        n14 = 1195456820;
                        if (n7 != n14) {
                            n3 = 0;
                        }
                        n15 &= n3;
                    }
                    if (n15 != 0) {
                        ir_0.b(l2, xm2, wp3Array);
                    }
                }
            } else {
                string2 = "Skipping remainder of malformed SEI NAL unit.";
                Cx.f(string2);
                n10 = xm2.c;
            }
            xm2.I(n10);
        }
    }

    public static void b(long l2, Xm2 xm2, wp3[] wp3Array) {
        Xm2 xm22 = xm2;
        wp3[] wp3Array2 = wp3Array;
        int n3 = xm2.w();
        int n4 = n3 & 0x40;
        if (n4 != 0) {
            n3 &= 0x1F;
            n4 = 1;
            xm2.J(n4);
            n3 *= 3;
            int n7 = xm2.b;
            int n8 = wp3Array.length;
            for (int i3 = 0; i3 < n8; ++i3) {
                wp3 wp32 = wp3Array2[i3];
                xm22.I(n7);
                wp32.f(n3, xm22);
                long l3 = -9223372036854775807L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                boolean bl2 = l4 != false;
                ct3.f(bl2);
                l4 = 1;
                l3 = l2;
                wp32.a(l2, (int)l4, n3, 0, null);
            }
        }
    }
}

