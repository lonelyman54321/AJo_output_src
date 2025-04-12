/*
 * Decompiled with CFR 0.152.
 */
public final class Jt0 {
    public static final /* synthetic */ int a;

    public static long a(long l2, long l3) {
        float f5 = C63.d(l2);
        float f6 = e72.d(l3);
        float f7 = C63.b(l2);
        float f8 = e72.e(l3);
        return bo1_1.a(f5 -= f6, f7 -= f8);
    }

    public static /* synthetic */ void b(Kt0 kt0, long l2, float f5, float f6, long l3, long l4, float f7, Qt0 qt0, int n3) {
        float f8;
        int n4 = n3 & 0x40;
        if (n4 != 0) {
            n4 = 1065353216;
            f8 = 1.0f;
        } else {
            f8 = f7;
        }
        kt0.M(l2, f5, f6, l3, l4, f8, qt0, null, 3);
    }

    public static /* synthetic */ void c(Kt0 kt0, long l2, float f5, long l3, int n3) {
        long l4;
        int n4 = n3 & 4;
        long l7 = n4 != 0 ? (l4 = kt0.X0()) : l3;
        rM0 rM02 = rM0.a;
        kt0.D(l2, f5, l7, 1.0f, rM02, null, 3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ void d(Kt0 kt0, hd1_0 hd1_02, long l2, long l3, long l4, float f5, TX tX, int n3, int n4) {
        int n7;
        int n8;
        rM0 rM02;
        float f6;
        long l7;
        int n10 = n4;
        int n14 = n4 & 2;
        long l8 = n14 != 0 ? (l7 = 0L) : l2;
        n14 = n10 & 0x10;
        long l12 = n14 != 0 ? l3 : l4;
        n14 = n10 & 0x20;
        if (n14 != 0) {
            n14 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        n14 = n10 & 0x40;
        if (n14 != 0) {
            rM02 = rM0.a;
        } else {
            n14 = 0;
            rM02 = null;
        }
        rM0 rM03 = rM02;
        n14 = n10 & 0x100;
        if (n14 != 0) {
            n14 = 3;
            n8 = 3;
        } else {
            n14 = 0;
            rM02 = null;
            n8 = 0;
        }
        if ((n10 &= 0x200) != 0) {
            n10 = 1;
            n7 = 1;
        } else {
            n7 = n3;
        }
        kt0.t0(hd1_02, l8, l3, 0L, l12, f6, rM03, tX, n8, n7);
    }

    public static /* synthetic */ void e(Kt0 kt0, hd1_0 hd1_02, ay_1 ay_12) {
        rM0 rM02 = rM0.a;
        kt0.S0(hd1_02, 0L, 1.0f, rM02, ay_12, 3);
    }

    public static /* synthetic */ void f(Kt0 kt0, long l2, long l3, long l4) {
        kt0.Y(l2, l3, l4, 0.0f, 0, null, 1.0f, null, 3);
    }

    public static /* synthetic */ void g(Kt0 kt0, gn2 gn22, ZD zD, float f5, re3_1 qt0, int n3) {
        int n4;
        float f6;
        int n7;
        int n8 = n3 & 4;
        if (n8 != 0) {
            n7 = 1065353216;
            f5 = 1.0f;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        n7 = n3 & 8;
        if (n7 != 0) {
            qt0 = rM0.a;
        }
        re3_1 re3_12 = qt0;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n7 = 3;
            f5 = 4.2E-45f;
            n4 = 3;
        } else {
            n7 = 0;
            f5 = 0.0f;
            n4 = 0;
        }
        kt0.T0(gn22, zD, f6, re3_12, null, n4);
    }

    public static /* synthetic */ void h(Kt0 kt0, gn2 gn22, long l2, float f5, re3_1 qt0, int n3) {
        float f6;
        int n4;
        int n7 = n3 & 4;
        if (n7 != 0) {
            n4 = 1065353216;
            f5 = 1.0f;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        n4 = n3 & 8;
        if (n4 != 0) {
            qt0 = rM0.a;
        }
        kt0.v0(gn22, l2, f6, qt0, null, 3);
    }

    public static /* synthetic */ void i(Kt0 kt0, ZD zD, long l2, long l3, float f5, Qt0 qt0, int n3) {
        Qt0 qt02;
        float f6;
        long l4;
        int n4 = n3 & 2;
        long l7 = n4 != 0 ? (l4 = 0L) : l2;
        n4 = n3 & 4;
        long l8 = n4 != 0 ? (l4 = Jt0.a(kt0.l(), l7)) : l3;
        n4 = n3 & 8;
        if (n4 != 0) {
            n4 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        n4 = n3 & 0x10;
        if (n4 != 0) {
            rM0 rM02 = rM0.a;
            qt02 = rM02;
        } else {
            qt02 = qt0;
        }
        kt0.d1(zD, l7, l8, f6, qt02, null, 3);
    }

    public static /* synthetic */ void j(Kt0 kt0, long l2, long l3, float f5, TX tX, int n3) {
        int n4;
        TX tX3;
        float f6;
        long l4;
        int n7 = n3 & 4;
        long l7 = 0L;
        long l8 = n7 != 0 ? (l4 = Jt0.a(kt0.l(), l7)) : l3;
        n7 = n3 & 8;
        if (n7 != 0) {
            n7 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        rM0 rM02 = rM0.a;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n7 = 0;
            tX3 = null;
        } else {
            tX3 = tX;
        }
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n7 = 3;
            n4 = 3;
        } else {
            n7 = 0;
            n4 = 0;
        }
        kt0.U0(l2, l7, l8, f6, rM02, tX3, n4);
    }

    public static void k(Kt0 kt0, ZD zD, long l2, long l3, long l4, Qt0 qt0, int n3) {
        Qt0 qt02;
        long l7;
        int n4 = n3 & 2;
        long l8 = n4 != 0 ? (l7 = 0L) : l2;
        n4 = n3 & 4;
        long l12 = n4 != 0 ? (l7 = Jt0.a(kt0.l(), l8)) : l3;
        n4 = n3 & 0x20;
        if (n4 != 0) {
            rM0 rM02 = rM0.a;
            qt02 = rM02;
        } else {
            qt02 = qt0;
        }
        kt0.g0(zD, l8, l12, l4, 1.0f, qt02, null, 3);
    }

    public static void l(Kt0 kt0, long l2, long l3, long l4, long l7, Qt0 qt0, int n3) {
        long l8;
        int n4 = n3 & 2;
        long l12 = n4 != 0 ? (l8 = 0L) : l3;
        n4 = n3 & 4;
        long l14 = n4 != 0 ? (l8 = Jt0.a(kt0.l(), l12)) : l4;
        n4 = n3 & 8;
        long l15 = n4 != 0 ? (l8 = r90_0.a) : l7;
        kt0.Q0(l2, l12, l14, l15, qt0, 1.0f, null, 3);
    }
}

