/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;

public final class pB2 {
    public static final float a = 40;
    public static final ne0_1 b;

    static {
        float f5 = 0.2f;
        ne0_1 ne0_12 = new ne0_1(f5, 0.0f, 0.8f);
        float f6 = 0.4f;
        ne0_12 = new ne0_1(f6, 0.0f, 1.0f);
        new ne0_1(0.0f, 0.0f, 0.65f);
        new ne0_1(0.1f, 0.0f, 0.45f);
        b = ne0_12 = new ne0_1(f6, 0.0f, f5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, long l2, float f5, long l3, int n3, b30_0 b30_02, int n4, int n7) {
        Object object;
        Object object2;
        Object object3;
        long l4;
        Object object4;
        int n8;
        float f6;
        int n10;
        float f7;
        Object object5;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        j30_0 j30_02;
        Object object6;
        float f8;
        int n19;
        int n20;
        long l7;
        block26: {
            l7 = l2;
            n20 = n4;
            n19 = 4;
            f8 = 5.6E-45f;
            object6 = b30_02;
            j30_02 = b30_02.g(-1119119072);
            n18 = 1;
            n17 = n7 & 1;
            n16 = 2;
            if (n17 != 0) {
                n14 = n15 = n4 | 6;
                object5 = lP1;
            } else {
                n15 = n4 & 6;
                if (n15 == 0) {
                    object5 = lP1;
                    n14 = (int)(j30_02.J(lP1) ? 1 : 0);
                    if (n14 != 0) {
                        n14 = 4;
                        f7 = 5.6E-45f;
                    } else {
                        n14 = 2;
                        f7 = 2.8E-45f;
                    }
                    n14 |= n20;
                } else {
                    object5 = lP1;
                    n14 = n4;
                }
            }
            n10 = n20 & 0x30;
            if (n10 == 0) {
                n10 = (int)(j30_02.d(l7) ? 1 : 0);
                if (n10 != 0) {
                    n10 = 32;
                    f6 = 4.5E-44f;
                } else {
                    n10 = 16;
                    f6 = 2.2E-44f;
                }
                n14 |= n10;
            }
            if ((n19 = n7 & 4) != 0) {
                n14 |= 0x180;
            } else {
                n10 = n20 & 0x180;
                if (n10 == 0) {
                    f6 = f5;
                    n8 = (int)(j30_02.b(f5) ? 1 : 0);
                    n8 = n8 != 0 ? 256 : 128;
                }
            }
            f6 = f5;
            break block26;
            n14 |= n8;
        }
        n8 = n14 | 0xC00;
        int n21 = n20 & 0x6000;
        if (n21 == 0) {
            n8 = n14 | 0x2C00;
        }
        if ((n14 = n8 & 0x2493) == (n21 = 9362) && (n14 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            n21 = n3;
            object4 = object5;
            f7 = f6;
            l4 = l3;
        } else {
            Object object7;
            float f11;
            int n22;
            long l8;
            j30_02.r0();
            n14 = n20 & 1;
            n21 = -57345;
            if (n14 != 0 && (n14 = (int)(j30_02.c0() ? 1 : 0)) == 0) {
                j30_02.D();
                n19 = n8 & n21;
                l8 = l3;
                n22 = n3;
                n21 = n19;
                object3 = object5;
                f11 = f6;
            } else {
                object6 = n17 != 0 ? LP1$a.b : object5;
                f8 = n19 != 0 ? oB2.a : f6;
                long l12 = OX.k;
                n10 = n8 & n21;
                f11 = f8;
                object3 = object6;
                l8 = l12;
                n21 = n10;
                n22 = 2;
            }
            j30_02.U();
            object6 = O30.f;
            object6 = (Vo0)j30_02.j((H30)object6);
            float f12 = object6.J0(f11);
            Vg1$a vg1$a = null;
            int n24 = 26;
            Object object8 = object7;
            object7 = new re3_1(f12, 0.0f, n22, 0, null, n24);
            object8 = bh1_0.c(j30_02);
            n10 = 0;
            f6 = 0.0f;
            object5 = 0;
            Object object9 = 5;
            object6 = IntCompanionObject.INSTANCE;
            Ws3 ws3 = ya3_0.b;
            object6 = ex0_0.c;
            Object object10 = Hl.a(Hl.c(6660, 0, (cx0_0)object6, n16));
            int n25 = 16;
            int n26 = 33208;
            object4 = object6;
            object6 = object8;
            Object object11 = ws3;
            re3_1 re3_12 = object7;
            object7 = object10;
            f12 = f11;
            Object object12 = j30_02;
            int n27 = n21;
            object12 = bh1_0.b((vg1_0)object8, (Number)object5, (Number)object9, ws3, (Ug1)object10, null, j30_02, n26, n25);
            object2 = null;
            object11 = Hl.a(Hl.c(1332, 0, (cx0_0)object4, n16));
            n18 = 4536;
            object7 = j30_02;
            n21 = n18;
            Vg1$a vg1$a2 = bh1_0.a((vg1_0)object8, 0.0f, 286.0f, (Ug1)object11, j30_02, n18);
            object5 = new Go1$b();
            pB2$c.c.invoke(object5);
            object6 = new go1_1((Go1$b)object5);
            object11 = Hl.a((xw0_1)object6);
            object6 = object8;
            object10 = bh1_0.a((vg1_0)object8, 0.0f, 290.0f, (Ug1)object11, j30_02, n18);
            object5 = new Go1$b();
            object9 = pB2$d.c;
            ((pB2$d)object9).invoke(object5);
            object6 = new go1_1((Go1$b)object5);
            object11 = Hl.a((xw0_1)object6);
            object5 = null;
            object6 = object8;
            Object object13 = bh1_0.a((vg1_0)object8, 0.0f, 290.0f, (Ug1)object11, j30_02, n18);
            object4 = tb2_0.c;
            n17 = 1;
            object4 = CY2.b((LP1)object3, n17 != 0, (Function1)object4);
            float f14 = a;
            object11 = j.h((LP1)object4, f14);
            n18 = n27;
            n15 = n27 & 0x1C00;
            n14 = 2048;
            f7 = 2.87E-42f;
            if (n15 == n14) {
                object9 = re3_12;
                n15 = 1;
                f14 = Float.MIN_VALUE;
            } else {
                object9 = re3_12;
                n15 = 0;
                f14 = 0.0f;
                object5 = null;
            }
            n8 = (int)(j30_02.x(object9) ? 1 : 0);
            n15 |= n8;
            n8 = (int)(j30_02.J(object12) ? 1 : 0);
            n15 |= n8;
            n8 = (int)(j30_02.J(object10) ? 1 : 0);
            n15 |= n8;
            n8 = (int)(j30_02.J(object13) ? 1 : 0);
            n15 |= n8;
            n8 = (int)(j30_02.J(vg1$a2) ? 1 : 0);
            n15 |= n8;
            n8 = n18 & 0x380;
            n17 = 256;
            if (n8 == n17) {
                n17 = 1;
            } else {
                n17 = 0;
                object6 = null;
            }
            n17 |= n15;
            n15 = n18 & 0x70 ^ 0x30;
            n8 = 32;
            if (n15 > n8 && (n15 = (int)(j30_02.d(l7) ? 1 : 0)) != 0 || (n18 &= 0x30) == n8) {
                n18 = 1;
            } else {
                n18 = 0;
                object4 = null;
            }
            object6 = j30_02.v();
            if ((n18 |= n17) == 0 && object6 != (object4 = b30$a.a)) {
                object8 = object3;
                object = object11;
                n20 = 0;
            } else {
                object8 = object3;
                object3 = object7;
                object5 = object9;
                f7 = f12;
                object = object11;
                l4 = l2;
                vg1$a = object13;
                object13 = object12;
                object12 = object10;
                object10 = vg1$a;
                n20 = 0;
                object2 = vg1$a2;
                object7 = new pB2$a(l8, (re3_1)object9, f12, l2, (Vg1$a)object13, (Vg1$a)object12, vg1$a, vg1$a2);
                j30_02.o(object7);
                object6 = object7;
            }
            object6 = (Function1)object6;
            AL.a((LP1)object, (Function1)object6, j30_02, 0);
            l4 = l8;
            object4 = object8;
            f7 = f12;
            n21 = n22;
        }
        object2 = j30_02.X();
        if (object2 != null) {
            object3 = object;
            object = new pB2$b((LP1)object4, l2, f7, l4, n21, n4, n7);
            ((CF2)object2).d = object;
        }
    }

    public static final void b(Kt0 kt0, float f5, float f6, long l2, re3_1 re3_12) {
        float f7 = 2;
        float f8 = re3_12.a / f7;
        float f11 = C63.d(kt0.l());
        long l3 = h72.a(f8, f8);
        long l4 = bo1_1.a(f11 -= (f7 *= f8), f11);
        Jt0.b(kt0, l2, f5, f6, l3, l4, 0.0f, re3_12, 832);
    }
}

