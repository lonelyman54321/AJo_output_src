/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;

public final class TB2
implements eI0 {
    public final On3 a;
    public final SparseArray b;
    public final Xm2 c;
    public final SB2 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public RB2 i;
    public gi0_0 j;
    public boolean k;

    public TB2() {
        Object object = new On3(0L);
        this.a = object;
        this.c = object = new Xm2(4096);
        object = new SparseArray();
        this.b = object;
        this.d = object = new SB2();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        long l2;
        boolean bl2;
        boolean bl3;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        long l14;
        Object object;
        Object object2;
        long l15;
        boolean bl4;
        TB2 tB2 = this;
        Object object3 = pw2;
        ct3.h(this.j);
        Object object4 = fi0_02;
        object4 = (il0_0)fi0_02;
        long l16 = ((il0_0)object4).c;
        int n3 = 4;
        int n4 = 0;
        On3 on3 = null;
        int n7 = 3;
        int n8 = 442;
        Object object5 = this.d;
        long l17 = -1;
        long l18 = l16 == l17 ? 0 : (l16 < l17 ? -1 : 1);
        if (l18 != false && !(bl4 = ((SB2)object5).c)) {
            int n10;
            boolean bl5 = ((SB2)object5).e;
            Xm2 xm2 = ((SB2)object5).b;
            long l19 = 20000L;
            if (!bl5) {
                long l20;
                int n14;
                block42: {
                    fi0_0 fi0_03 = fi0_02;
                    fi0_03 = (il0_0)fi0_02;
                    l16 = ((il0_0)fi0_03).c;
                    l19 = Math.min(l19, l16);
                    int n15 = (int)l19;
                    long l21 = n15;
                    l21 = ((il0_0)fi0_03).d;
                    long l22 = l21 - (l16 -= l21);
                    Object object6 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                    if (object6 != false) {
                        pw2.a = l16;
                        return 1;
                    }
                    xm2.F(n15);
                    ((il0_0)fi0_03).f = 0;
                    object3 = xm2.a;
                    ((il0_0)fi0_03).b((byte[])object3, 0, n15, false);
                    n14 = xm2.b;
                    for (n10 = xm2.c - n3; n10 >= n14; n10 += -1) {
                        byte[] byArray = xm2.a;
                        int n16 = SB2.b(n10, byArray);
                        if (n16 != n8) continue;
                        n16 = n10 + 4;
                        xm2.I(n16);
                        l20 = SB2.c(xm2);
                        l19 = -9223372036854775807L;
                        long l23 = l20 == l19 ? 0 : (l20 < l19 ? -1 : 1);
                        if (l23 == false) {
                            continue;
                        }
                        break block42;
                    }
                    l20 = -9223372036854775807L;
                }
                ((SB2)object5).g = l20;
                n14 = 1;
                ((SB2)object5).e = n14;
                return 0;
            }
            long l24 = ((SB2)object5).g;
            l16 = -9223372036854775807L;
            long l25 = l24 - l16;
            Object object7 = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
            if (object7 == false) {
                object3 = fi0_02;
                object3 = (il0_0)fi0_02;
                ((SB2)object5).a((il0_0)object3);
                return n4;
            }
            n10 = ((SB2)object5).d;
            if (n10 == 0) {
                int n17;
                long l26;
                block43: {
                    int n18;
                    object4 = fi0_02;
                    object4 = (il0_0)fi0_02;
                    l26 = ((il0_0)object4).c;
                    l26 = Math.min(l19, l26);
                    int n19 = (int)l26;
                    l19 = ((il0_0)object4).d;
                    l16 = 0;
                    long l27 = l19 - l16;
                    Object object8 = l27 == 0L ? 0 : (l27 < 0L ? -1 : 1);
                    if (object8 != false) {
                        pw2.a = l16;
                        return 1;
                    }
                    xm2.F(n19);
                    ((il0_0)object4).f = 0;
                    object3 = xm2.a;
                    ((il0_0)object4).b((byte[])object3, 0, n19, false);
                    n10 = xm2.c;
                    for (n17 = xm2.b; n17 < (n18 = n10 + -3); ++n17) {
                        byte[] byArray = xm2.a;
                        n18 = SB2.b(n17, byArray);
                        if (n18 != n8) continue;
                        n18 = n17 + 4;
                        xm2.I(n18);
                        l26 = SB2.c(xm2);
                        l19 = -9223372036854775807L;
                        long l28 = l26 == l19 ? 0 : (l26 < l19 ? -1 : 1);
                        if (l28 == false) {
                            continue;
                        }
                        break block43;
                    }
                    l26 = -9223372036854775807L;
                }
                ((SB2)object5).f = l26;
                n17 = 1;
                ((SB2)object5).d = n17;
                return 0;
            }
            long l29 = ((SB2)object5).f;
            long l30 = -9223372036854775807L;
            long l31 = l29 - l30;
            Object object9 = l31 == 0L ? 0 : (l31 < 0L ? -1 : 1);
            if (object9 == false) {
                object3 = fi0_02;
                object3 = (il0_0)fi0_02;
                ((SB2)object5).a((il0_0)object3);
                return n4;
            } else {
                On3 on32 = ((SB2)object5).a;
                l29 = on32.b(l29);
                long l34 = ((SB2)object5).g;
                ((SB2)object5).h = l30 = on32.c(l34) - l29;
                object3 = fi0_02;
                object3 = (il0_0)fi0_02;
                ((SB2)object5).a((il0_0)object3);
            }
            return n4;
        }
        int n20 = tB2.k;
        if (n20 == 0) {
            tB2.k = n20 = 1;
            long l35 = ((SB2)object5).h;
            l15 = -9223372036854775807L;
            long l36 = l35 - l15;
            Object object10 = l36 == 0L ? 0 : (l36 < 0L ? -1 : 1);
            if (object10 != false) {
                object2 = new Object();
                object = ((SB2)object5).a;
                RB2$a rB2$a = new RB2$a((On3)object);
                l14 = l35 + 1L;
                int n21 = 1000;
                long l37 = 0L;
                long l38 = 188L;
                object = object4;
                object5 = rB2$a;
                l12 = l14;
                l8 = l16;
                l14 = l16;
                l16 = l38;
                tB2.i = object4 = new Kx((Kx$d)object2, rB2$a, l35, l12, l37, l8, l38, n21);
                object = tB2.j;
                object4 = ((Kx)object4).a;
                object.h((dx2_1)object4);
            } else {
                l14 = l16;
                object4 = tB2.j;
                object = new dX2$b(l35);
                object4.h((dx2_1)object);
            }
        } else {
            l14 = l16;
        }
        object4 = tB2.i;
        if (object4 != null && (object = ((Kx)object4).c) != null) {
            object = fi0_02;
            object = (il0_0)fi0_02;
            return ((Kx)object4).a((il0_0)object, (Pw2)object3);
        }
        object3 = fi0_02;
        object3 = (il0_0)fi0_02;
        n20 = 0;
        object4 = null;
        ((il0_0)object3).f = 0;
        if (l18 != false) {
            long l39 = ((il0_0)object3).h();
            l16 = l14 - l39;
        } else {
            l16 = l17;
        }
        int n22 = -1;
        long l41 = l16 == l17 ? 0 : (l16 < l17 ? -1 : 1);
        if (l41 != false && (l7 = (l4 = l16 - (l3 = (long)4)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
            return n22;
        }
        object2 = tB2.c;
        object5 = ((Xm2)object2).a;
        int n24 = 4;
        boolean bl6 = true;
        int n25 = ((il0_0)object3).b((byte[])object5, 0, n24, bl6);
        if (n25 == 0) {
            return n22;
        }
        ((Xm2)object2).I(0);
        n25 = ((Xm2)object2).i();
        int n26 = 441;
        if (n25 == n26) {
            return n22;
        }
        int n27 = 442;
        if (n25 == n27) {
            object = ((Xm2)object2).a;
            ((il0_0)object3).b((byte[])object, 0, 10, false);
            ((Xm2)object2).I(9);
            int n28 = (((Xm2)object2).w() & 7) + 14;
            ((il0_0)object3).j(n28);
            return 0;
        }
        int n29 = 443;
        int n30 = 2;
        int n32 = 6;
        if (n25 == n29) {
            object = ((Xm2)object2).a;
            ((il0_0)object3).b((byte[])object, 0, n30, false);
            ((Xm2)object2).I(0);
            int n34 = ((Xm2)object2).C() + n32;
            ((il0_0)object3).j(n34);
            return 0;
        }
        int n35 = n25 & 0xFFFFFF00;
        int n36 = 8;
        int n37 = n35 >> n36;
        n7 = 1;
        if (n37 != n7) {
            ((il0_0)object3).j(n7);
            return 0;
        }
        int n38 = n25 & 0xFF;
        SparseArray sparseArray = tB2.b;
        Object object11 = (TB2$a)sparseArray.get(n38);
        n3 = (int)(tB2.e ? 1 : 0);
        if (n3 == 0) {
            boolean bl7;
            boolean bl8;
            if (object11 == null) {
                n3 = 189;
                if (n38 == n3) {
                    object5 = new v1_0();
                    n3 = 1;
                    tB2.f = n3;
                    tB2.h = l8 = ((il0_0)object3).d;
                } else {
                    n3 = n25 & 0xE0;
                    n4 = 192;
                    if (n3 == n4) {
                        object5 = new dq1_0(null, 0);
                        n3 = 1;
                        tB2.f = n3;
                        tB2.h = l8 = ((il0_0)object3).d;
                    } else {
                        n3 = 224;
                        if ((n25 &= 0xF0) == n3) {
                            object5 = new d21(null);
                            n3 = 1;
                            tB2.g = n3;
                            tB2.h = l8 = ((il0_0)object3).d;
                        } else {
                            n25 = 0;
                            object5 = null;
                        }
                    }
                }
                if (object5 != null) {
                    n3 = 256;
                    object11 = new Gs3$d(n38, n3);
                    Object object12 = tB2.j;
                    object5.e((gi0_0)object12, (Gs3$d)object11);
                    object12 = tB2.a;
                    object11 = new TB2$a((qy0_0)object5, (On3)object12);
                    sparseArray.put(n38, object11);
                }
            }
            if ((bl8 = tB2.f) && (bl7 = tB2.g)) {
                l8 = tB2.h;
                l16 = 8192L;
                l8 += l16;
            } else {
                l8 = 0x100000L;
            }
            l16 = ((il0_0)object3).d;
            long l42 = l16 == l8 ? 0 : (l16 < l8 ? -1 : 1);
            if (l42 > 0) {
                boolean bl9;
                tB2.e = bl9 = true;
                object = tB2.j;
                object.j();
            }
        }
        object = ((Xm2)object2).a;
        ((il0_0)object3).b((byte[])object, 0, n30, false);
        ((Xm2)object2).I(0);
        int n39 = ((Xm2)object2).C() + n32;
        if (object11 == null) {
            ((il0_0)object3).j(n39);
            return 0;
        }
        ((Xm2)object2).F(n39);
        object5 = ((Xm2)object2).a;
        ((il0_0)object3).e((byte[])object5, 0, n39, false);
        ((Xm2)object2).I(n32);
        object3 = ((TB2$a)object11).c;
        object = ((Vm2)object3).a;
        n25 = 3;
        ((Xm2)object2).g(0, (byte[])object, n25);
        ((Vm2)object3).m(0);
        ((Vm2)object3).o(n36);
        ((TB2$a)object11).d = bl3 = ((Vm2)object3).f();
        ((TB2$a)object11).e = bl2 = ((Vm2)object3).f();
        ((Vm2)object3).o(n32);
        int n41 = ((Vm2)object3).g(n36);
        byte[] byArray = ((Vm2)object3).a;
        ((Xm2)object2).g(0, byArray, n41);
        ((Vm2)object3).m(0);
        ((TB2$a)object11).g = l12 = 0L;
        boolean bl10 = ((TB2$a)object11).d;
        if (bl10) {
            ((Vm2)object3).o(n24);
            l12 = ((Vm2)object3).g(n25);
            int n42 = 30;
            l12 <<= n42;
            int n43 = 1;
            ((Vm2)object3).o(n43);
            n7 = 15;
            l8 = ((Vm2)object3).g(n7) << n7;
            l12 |= l8;
            ((Vm2)object3).o(n43);
            l8 = ((Vm2)object3).g(n7);
            l12 |= l8;
            ((Vm2)object3).o(n43);
            n3 = (int)(((TB2$a)object11).f ? 1 : 0);
            on3 = ((TB2$a)object11).b;
            if (n3 == 0 && (n3 = (int)(((TB2$a)object11).e ? 1 : 0)) != 0) {
                ((Vm2)object3).o(n24);
                l16 = (long)((Vm2)object3).g(n25) << n42;
                ((Vm2)object3).o(n43);
                int n44 = ((Vm2)object3).g(n7) << n7;
                l15 = (long)n44 | l16;
                ((Vm2)object3).o(n43);
                n25 = ((Vm2)object3).g(n7);
                l16 = n25;
                ((Vm2)object3).o(n43);
                on3.b(l15 |= l16);
                ((TB2$a)object11).f = n43;
            }
            ((TB2$a)object11).g = l2 = on3.b(l12);
        }
        l2 = ((TB2$a)object11).g;
        object = ((TB2$a)object11).a;
        object.f(n24, l2);
        object.a((Xm2)object2);
        boolean bl11 = false;
        object3 = null;
        object.d(false);
        object4 = ((Xm2)object2).a;
        n20 = ((Object)object4).length;
        ((Xm2)object2).H(n20);
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        int n3 = 14;
        byte[] byArray = new byte[n3];
        fi0_02 = (il0_0)fi0_02;
        boolean bl2 = false;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        n3 = (byArray[0] & 0xFF) << 24;
        int n4 = 1;
        int n7 = (byArray[n4] & 0xFF) << 16;
        n3 |= n7;
        n7 = 2;
        int n8 = byArray[n7] & 0xFF;
        int n10 = 8;
        n3 |= (n8 <<= n10);
        n8 = 3;
        int n14 = byArray[n8] & 0xFF;
        n3 |= n14;
        n14 = 442;
        if (n14 != n3) {
            return false;
        }
        n3 = 4;
        n14 = byArray[n3] & 0xC4;
        int n15 = 68;
        if (n14 != n15) {
            return false;
        }
        n14 = byArray[6] & n3;
        if (n14 != n3) {
            return false;
        }
        n14 = byArray[n10] & n3;
        if (n14 != n3) {
            return false;
        }
        n3 = byArray[9] & n4;
        if (n3 != n4) {
            return false;
        }
        n3 = byArray[12] & n8;
        if (n3 != n8) {
            return false;
        }
        n3 = byArray[13] & 7;
        ((il0_0)fi0_02).l(n3, false);
        ((il0_0)fi0_02).b(byArray, 0, n8, false);
        int n16 = (byArray[0] & 0xFF) << 16;
        n3 = (byArray[n4] & 0xFF) << n10;
        n16 |= n3;
        n3 = byArray[n7] & 0xFF;
        if (n4 == (n16 |= n3)) {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        int n3;
        Object object;
        Object object2 = this.a;
        long l4 = ((On3)object2).e();
        boolean bl2 = true;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        boolean bl3 = object3 == false;
        if (!bl3) {
            long l12;
            long l14;
            l4 = ((On3)object2).d();
            long l15 = l4 - l7;
            object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object3 == false || (object3 = (l14 = l4 - (l7 = 0L)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false || (l12 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) == false) {
                bl2 = false;
                object = null;
            }
            bl3 = bl2;
        }
        if (bl3) {
            ((On3)object2).g(l3);
        }
        if ((object2 = this.i) != null) {
            ((Kx)object2).c(l3);
        }
        object2 = null;
        for (int i3 = 0; i3 < (n3 = (object = this.b).size()); ++i3) {
            object = (TB2$a)object.valueAt(i3);
            ((TB2$a)object).f = false;
            object = ((TB2$a)object).a;
            object.c();
        }
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.j = gi0_02;
    }

    public final void release() {
    }
}

