/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;

/*
 * Renamed from x1
 */
public final class x1_0
implements eI0 {
    public final y1_0 a;
    public final Xm2 b;
    public boolean c;

    public x1_0() {
        Object object = new y1_0(null, 0);
        this.a = object;
        this.b = object = new Xm2(16384);
    }

    public final int a(fi0_0 fi0_02, Pw2 object) {
        int n3;
        object = this.b;
        Object object2 = ((Xm2)object).a;
        int n4 = 16384;
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
                n3 = n4;
                block1: while (true) {
                    int n14 = 0;
                    fi0_02 = null;
                    while (true) {
                        byArray = xm2.a;
                        n8 = 7;
                        ((il0_0)fi0_03).b(byArray, 0, n8, false);
                        xm2.I(0);
                        n7 = xm2.C();
                        int n15 = 44096;
                        int n16 = 44097;
                        if (n7 != n15 && n7 != n16) {
                            ((il0_0)fi0_03).f = 0;
                            n7 = 8192;
                            if ((n14 = ++n3 - n4) >= n7) {
                                return false;
                            }
                            ((il0_0)fi0_03).l(n3, false);
                            continue block1;
                        }
                        n15 = 1;
                        int n17 = 4;
                        if ((n14 += n15) >= n17) {
                            return n15 != 0;
                        }
                        byte[] byArray2 = xm2.a;
                        int n18 = byArray2.length;
                        int n19 = -1;
                        if (n18 < n8) {
                            n18 = -1;
                        } else {
                            n18 = (byArray2[2] & 0xFF) << 8;
                            int n20 = byArray2[n10] & 0xFF;
                            if ((n18 |= n20) == (n20 = (int)((char)-1))) {
                                n17 = (byArray2[n17] & 0xFF) << 16;
                                n18 = (byArray2[5] & 0xFF) << 8;
                                n17 |= n18;
                                n15 = byArray2[6] & 0xFF;
                                n18 = n17 | n15;
                            } else {
                                n8 = 4;
                            }
                            if (n7 == n16) {
                                n8 += 2;
                            }
                            n18 += n8;
                        }
                        if (n18 == n19) {
                            return false;
                        }
                        ((il0_0)fi0_03).l(n18 += -7, false);
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

