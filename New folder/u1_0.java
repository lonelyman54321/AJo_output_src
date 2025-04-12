/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;

/*
 * Renamed from u1
 */
public final class u1_0
implements eI0 {
    public final v1_0 a;
    public final Xm2 b;
    public boolean c;

    public u1_0() {
        Object object = new v1_0();
        this.a = object;
        this.b = object = new Xm2(2786);
    }

    public final int a(fi0_0 fi0_02, Pw2 object) {
        int n3;
        object = this.b;
        Object object2 = ((Xm2)object).a;
        int n4 = 2786;
        int n7 = ((il0_0)(fi0_02 = (il0_0)fi0_02)).read((byte[])object2, 0, n4);
        if (n7 == (n3 = -1)) {
            return n3;
        }
        ((Xm2)object).I(0);
        ((Xm2)object).H(n7);
        n7 = (int)(this.c ? 1 : 0);
        object2 = this.a;
        if (n7 == 0) {
            long l2;
            object2.m = l2 = 0L;
            n7 = 1;
            this.c = n7;
        }
        object2.a((Xm2)object);
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        int n3 = 10;
        Xm2 xm2 = new Xm2(n3);
        int n4 = 0;
        while (true) {
            byte[] byArray = xm2.a;
            fi0_0 fi0_03 = fi0_02;
            fi0_03 = (il0_0)fi0_02;
            ((il0_0)fi0_03).b(byArray, 0, n3, false);
            xm2.I(0);
            int n7 = xm2.z();
            int n8 = 0x494433;
            int n10 = 3;
            if (n7 != n8) {
                ((il0_0)fi0_03).f = 0;
                ((il0_0)fi0_03).l(n4, false);
                n7 = n4;
                block1: while (true) {
                    int n14 = 0;
                    fi0_02 = null;
                    while (true) {
                        byte[] byArray2 = xm2.a;
                        int n15 = 6;
                        ((il0_0)fi0_03).b(byArray2, 0, n15, false);
                        xm2.I(0);
                        n8 = xm2.C();
                        int n16 = 2935;
                        if (n8 != n16) {
                            ((il0_0)fi0_03).f = 0;
                            n8 = 8192;
                            if ((n14 = ++n7 - n4) >= n8) {
                                return false;
                            }
                            ((il0_0)fi0_03).l(n7, false);
                            continue block1;
                        }
                        n8 = 1;
                        n16 = 4;
                        if ((n14 += n8) >= n16) {
                            return n8 != 0;
                        }
                        byte[] byArray3 = xm2.a;
                        int n17 = byArray3.length;
                        int n18 = -1;
                        if (n17 < n15) {
                            n16 = -1;
                        } else {
                            n17 = (byArray3[5] & 0xF8) >> n10;
                            if (n17 > n3) {
                                n15 = 2;
                                n16 = (byArray3[n15] & 7) << 8;
                                int n19 = byArray3[n10] & 0xFF;
                                n16 = ((n16 | n19) + n8) * 2;
                            } else {
                                n8 = byArray3[n16];
                                n15 = (n8 & 0xC0) >> 6;
                                n16 = w1_0.a(n15, n8 &= 0x3F);
                            }
                        }
                        if (n16 == n18) {
                            return false;
                        }
                        ((il0_0)fi0_03).l(n16 += -6, false);
                    }
                    break;
                }
            }
            xm2.J(n10);
            n7 = xm2.v();
            n8 = n7 + 10;
            n4 += n8;
            ((il0_0)fi0_03).l(n7, false);
        }
    }

    public final void c(long l2, long l3) {
        this.c = false;
        this.a.c();
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        Object object = new Gs3$d(0, 1);
        this.a.e(gi0_02, (Gs3$d)object);
        gi0_02.j();
        object = new dX2$b(-9223372036854775807L);
        gi0_02.h((dx2_1)object);
    }

    public final void release() {
    }
}

