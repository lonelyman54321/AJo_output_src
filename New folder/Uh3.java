/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.layout.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Uh3 {
    public static final float a = 48;
    public static final float b = 72;
    public static final float c = 16;
    public static final float d = 14;
    public static final float e = 6;
    public static final long f = Em3.f(20);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(boolean bl2, ip_0 ip_02, LP1 lP1, boolean bl3, Function2 function2, Function2 function22, wr1_1 wr1_12, long l2, long l3, b30_0 b30_02, int n3) {
        Object object;
        long l4;
        long l7;
        wr1_1 wr1_13;
        Object object2;
        int n4;
        int n7;
        float f5;
        int n8;
        Function2 function23 = function2;
        int n10 = n3;
        int n14 = -1486097588;
        Object object3 = b30_02.g(n14);
        int n15 = n3 & 6;
        if (n15 == 0) {
            n15 = (int)(bl2 ? 1 : 0);
            n8 = (int)(((j30_0)object3).a(bl2) ? 1 : 0);
            if (n8 != 0) {
                n8 = 4;
                f5 = 5.6E-45f;
            } else {
                n8 = 2;
                f5 = 2.8E-45f;
            }
            n8 |= n10;
        } else {
            n15 = (int)(bl2 ? 1 : 0);
            n8 = n3;
        }
        int n16 = n10 & 0x30;
        if (n16 == 0) {
            n7 = ((j30_0)object3).x(ip_02);
            n7 = n7 != 0 ? 32 : 16;
            n8 |= n7;
        }
        if ((n7 = n10 & 0x180) == 0) {
            n4 = ((j30_0)object3).J(lP1);
            n4 = n4 != 0 ? 256 : 128;
            n8 |= n4;
        }
        n8 |= 0xC00;
        n4 = n10 & 0x6000;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object3).x(function23) ? 1 : 0);
            n4 = n4 != 0 ? 16384 : 8192;
            n8 |= n4;
        }
        n4 = 0x1B0000 | n8;
        int n17 = 0xC00000;
        int n18 = n10 & n17;
        if (n18 == 0) {
            n4 = 0x5B0000 | n8;
        }
        f5 = 2.4074124E-35f;
        n8 = 0x6000000 & n10;
        if (n8 == 0) {
            n8 = 0x2000000;
            f5 = 9.403955E-38f;
            n4 |= n8;
        }
        f5 = 1.4777644E-37f;
        n8 = 0x2492493 & n4;
        n18 = 0x2492492;
        if (n8 == n18 && (n8 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
            n4 = (int)(bl3 ? 1 : 0);
            object2 = function22;
            wr1_13 = wr1_12;
            l7 = l2;
            l4 = l3;
        } else {
            void var32_29;
            int n19;
            ((j30_0)object3).r0();
            n8 = n10 & 1;
            n18 = -264241153;
            int n20 = 0;
            Object var32_28 = null;
            if (n8 != 0 && (n8 = (int)(((j30_0)object3).c0() ? 1 : 0)) == 0) {
                ((j30_0)object3).D();
                n8 = n4 & n18;
                n4 = (int)(bl3 ? 1 : 0);
                wr1_13 = wr1_12;
                l7 = l2;
                l4 = l3;
                n19 = n8;
                object = function22;
            } else {
                double d2;
                double d5;
                double d7;
                double d9;
                object = w60_0.a;
                OX oX = (OX)((j30_0)object3).j((H30)object);
                l7 = oX.a;
                long l8 = ((OX)((j30_0)object3).j((H30)object)).a;
                object = mz_0.a;
                object = (lZ)((j30_0)object3).j((H30)object);
                n8 = (int)(((lZ)object).i() ? 1 : 0);
                double d12 = 0.5;
                if (n8 != 0 ? (n8 = (int)((d9 = (d7 = (double)(f5 = zx_0.h(l8))) - d12) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1))) > 0 : (n8 = (int)((d5 = (d2 = (double)(f5 = zx_0.h(l8))) - d12) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1))) < 0) {
                    n8 = 1060991140;
                    f5 = 0.74f;
                } else {
                    n8 = 1058642330;
                    f5 = 0.6f;
                }
                l8 = OX.b(l7, f5);
                n8 = n4 & n18;
                n4 = 1;
                n18 = 0;
                wr1_13 = null;
                l4 = l8;
                n19 = n8;
                n8 = 0;
                object = null;
                f5 = 0.0f;
            }
            ((j30_0)object3).U();
            Object var42_39 = null;
            if (function23 == null) {
                int n21 = 1041201080;
                ((j30_0)object3).K(n21);
            } else {
                n20 = 1041201081;
                ((j30_0)object3).K(n20);
                ph3_2 ph3_22 = new ph3_2(function23);
                int n22 = -1729014781;
                u10 u102 = v10.c(n22, ph3_22, (b30_0)object3);
            }
            ((j30_0)object3).T(false);
            lh3_2 lh3_22 = new lh3_2((u10)var32_29, (Function2)object);
            u10 u103 = v10.c(-178151495, lh3_22, (b30_0)object3);
            n20 = n19 & 0xE;
            n17 |= n20;
            n20 = n19 & 0x70;
            n17 |= n20;
            n20 = n19 & 0x380;
            n17 |= n20;
            n20 = n19 & 0x1C00;
            n17 |= n20;
            n20 = n19 >> 6 & 0xE000;
            int n24 = n17 | n20;
            n19 = (int)(bl2 ? 1 : 0);
            ip_0 ip_03 = ip_02;
            Uh3.b(bl2, ip_02, lP1, n4 != 0, wr1_13, l7, l4, u103, (b30_0)object3, n24);
            object2 = object;
        }
        CF2 cF2 = ((j30_0)object3).X();
        if (cF2 != null) {
            mh3_2 mh3_22;
            object3 = mh3_22;
            n15 = (int)(bl2 ? 1 : 0);
            object = ip_02;
            n7 = n4;
            function23 = function2;
            Function2 function24 = object2;
            object2 = wr1_13;
            long l12 = l7;
            l7 = l4;
            n10 = n3;
            mh3_22 = new mh3_2(bl2, ip_02, lP1, n4 != 0, function2, function24, wr1_13, l12, l4, n3);
            cF2.d = mh3_22;
        }
    }

    public static final void b(boolean bl2, ip_0 ip_02, LP1 lP1, boolean bl3, wr1_1 wr1_12, long l2, long l3, u10 u102, b30_0 b30_02, int n3) {
        Function2 function2;
        Object object;
        int n4 = n3;
        int n7 = 713679175;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n7);
        int n8 = n3 & 6;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object3).a(bl2) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n4;
        } else {
            n8 = n3;
        }
        int n10 = n4 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object3).x(ip_02) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n10 = n4 & 0x180) == 0) {
            n10 = (int)(((j30_0)object3).J(lP1) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n8 |= n10;
        }
        if ((n10 = n4 & 0xC00) == 0) {
            n10 = (int)(((j30_0)object3).a(bl3) ? 1 : 0);
            n10 = n10 != 0 ? 2048 : 1024;
            n8 |= n10;
        }
        if ((n10 = n4 & 0x6000) == 0) {
            n10 = (int)(((j30_0)object3).J(wr1_12) ? 1 : 0);
            n10 = n10 != 0 ? 16384 : 8192;
            n8 |= n10;
        }
        if ((n10 = 0x30000 & n4) == 0) {
            n10 = (int)(((j30_0)object3).d(l2) ? 1 : 0);
            n10 = n10 != 0 ? 131072 : 65536;
            n8 |= n10;
        }
        if ((n10 = 0x180000 & n4) == 0) {
            n10 = (int)(((j30_0)object3).d(l3) ? 1 : 0);
            n10 = n10 != 0 ? 0x100000 : 524288;
            n8 |= n10;
        }
        if ((n10 = 0xC00000 & n4) == 0) {
            n10 = (int)(((j30_0)object3).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 0x800000 : 0x400000;
            n8 |= n10;
        }
        int n14 = n8;
        n10 = 0x492492;
        if ((n8 &= 0x492493) == n10 && (n8 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            ((j30_0)object3).r0();
            n8 = n4 & 1;
            if (n8 != 0 && (n8 = (int)(((j30_0)object3).c0() ? 1 : 0)) == 0) {
                ((j30_0)object3).D();
            }
            ((j30_0)object3).U();
            int n15 = n14 >> 9 & 0x380 | 6;
            int n16 = 2;
            Object object4 = vp2_0.a(true, 0.0f, l2, (b30_0)object3, n15, n16);
            object = ip_02;
            function2 = u102;
            object2 = new nh3_1(lP1, bl2, wr1_12, (Lg1)object4, bl3, ip_02, u102);
            object4 = v10.c(-1237246709, (fx0_2)object2, (b30_0)object3);
            n8 = n14 >> 15;
            n10 = n8 & 0xE | 0xC00;
            n8 = n8 & 0x70 | n10;
            n10 = n14 << 6 & 0x380;
            int n17 = n8 | n10;
            Uh3.c(l2, l3, bl2, (u10)object4, (b30_0)object3, n17);
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            object3 = function2;
            n8 = (int)(bl2 ? 1 : 0);
            n4 = n3;
            function2 = new oh3_1(bl2, ip_02, lP1, bl3, wr1_12, l2, l3, u102, n3);
            ((CF2)object).d = function2;
        }
    }

    public static final void c(long l2, long l3, boolean bl2, u10 u102, b30_0 b30_02, int n3) {
        MB2[] mB2Array;
        Object object;
        int n4;
        u10 u103 = u102;
        int n7 = n3;
        int n8 = 0;
        int n10 = -405571117;
        j30_0 j30_02 = b30_02.g(n10);
        int n14 = n3 & 6;
        int n15 = 2;
        float f5 = 2.8E-45f;
        long l4 = l2;
        if (n14 == 0) {
            n14 = (int)(j30_02.d(l2) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n7;
        } else {
            n14 = n3;
        }
        int n16 = n7 & 0x30;
        long l7 = l3;
        if (n16 == 0) {
            n16 = (int)(j30_02.d(l3) ? 1 : 0);
            n16 = n16 != 0 ? 32 : 16;
            n14 |= n16;
        }
        if ((n16 = n7 & 0x180) == 0) {
            n16 = (int)(j30_02.a(bl2) ? 1 : 0);
            n16 = n16 != 0 ? 256 : 128;
            n14 |= n16;
        }
        if ((n16 = n7 & 0xC00) == 0) {
            n16 = (int)(j30_02.x(u103) ? 1 : 0);
            n16 = n16 != 0 ? 2048 : 1024;
            n14 |= n16;
        }
        if ((n16 = n14 & 0x493) == (n4 = 1170) && (n16 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            Object object2;
            object = bl2;
            n4 = (n14 >>= 6) & 0xE;
            object = yr3.d(object, null, j30_02, n4, n15);
            mB2Array = ((gr3)object).d;
            Object object3 = (Boolean)mB2Array.getValue();
            boolean bl3 = (Boolean)object3;
            int n17 = 1445938070;
            float f6 = 4.8176204E13f;
            j30_02.K(n17);
            long l8 = bl3 ? l4 : l7;
            j30_02.T(false);
            object3 = OX.f(l8);
            boolean bl4 = j30_02.J(object3);
            Object object4 = j30_02.v();
            if (bl4 || object4 == (object2 = b30$a.a)) {
                object4 = (Vs3)kZ.a.invoke(object3);
                j30_02.o(object4);
            }
            object2 = object4;
            object2 = (Vs3)object4;
            object4 = (Boolean)((gr3)object).a.a();
            n15 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
            j30_02.K(n17);
            Object object5 = object2;
            long l12 = n15 != 0 ? l4 : l7;
            j30_02.T(false);
            object3 = new OX(l12);
            mB2Array = (Boolean)mB2Array.getValue();
            n4 = (int)(mB2Array.booleanValue() ? 1 : 0);
            n15 = 1445938070;
            f5 = 4.8176204E13f;
            j30_02.K(n15);
            l12 = n4 != 0 ? l4 : l7;
            j30_02.T(false);
            object4 = new OX(l12);
            mB2Array = ((gr3)object).f();
            Object object6 = 0;
            mB2Array = th3_2.c.invoke(mB2Array, j30_02, object6);
            object6 = mB2Array;
            object6 = (un0_0)mB2Array;
            mB2Array = object3;
            object3 = object4;
            object2 = object5;
            object4 = yr3.b((gr3)object, mB2Array, object4, (un0_0)object6, (Vs3)object5, j30_02, 0);
            object = w60_0.a;
            long l14 = ((OX)((gr3$d)object4).j.getValue()).a;
            n17 = 1065353216;
            f6 = 1.0f;
            l14 = OX.b(l14, f6);
            object6 = new OX(l14);
            object = ((nw0_1)object).c(object6);
            mB2Array = s60_0.a;
            long l15 = ((OX)((gr3$d)object4).j.getValue()).a;
            f5 = OX.d(l15);
            object4 = Float.valueOf(f5);
            object4 = mB2Array.c(object4);
            n4 = 2;
            mB2Array = new MB2[n4];
            mB2Array[0] = object;
            mB2Array[1] = object4;
            n8 = n14 & 0x70;
            n14 = 8;
            L30.b(mB2Array, u103, j30_02, n8 |= n14);
        }
        object = j30_02.X();
        if (object != null) {
            u103 = u102;
            n7 = n3;
            mB2Array = new sh3_1(l2, l3, bl2, u102, n3);
            ((CF2)object).d = mB2Array;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void d(u10 u102, Function2 function2, b30_0 b30_02, int n3) {
        Object object;
        int n4;
        u10 u103 = u102;
        Function2 function22 = function2;
        int n7 = n3;
        int n8 = 1249848471;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n8);
        int n10 = n3 & 6;
        int n14 = 2;
        int n15 = 4;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object3).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n16 = n7 & 0x30;
        int n17 = 32;
        if (n16 == 0) {
            n16 = (int)(((j30_0)object3).x(function22) ? 1 : 0);
            n16 = n16 != 0 ? 32 : 16;
            n10 |= n16;
        }
        if ((n16 = n10 & 0x13) == (n4 = 18) && (n16 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            int n18;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            n16 = n10 & 0xE;
            if (n16 == n15) {
                n15 = 1;
            } else {
                n15 = 0;
                object8 = null;
            }
            int n19 = n10 & 0x70;
            if (n19 == n17) {
                n17 = 1;
            } else {
                n17 = 0;
                object7 = null;
            }
            object7 = ((j30_0)object3).v();
            if ((n15 |= n17) != 0 || object7 == (object8 = b30$a.a)) {
                object7 = new qh3_0(u103, function22);
                ((j30_0)object3).o(object7);
            }
            object7 = (al1_1)object7;
            object8 = LP1$a.b;
            n19 = ((j30_0)object3).P;
            Object object9 = ((j30_0)object3).P();
            object8 = a30_0.c((b30_0)object3, (LP1)object8);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = ((j30_0)object3).a;
            boolean bl2 = mp2 instanceof mp;
            if (!bl2) {
                s20.a();
                throw null;
            }
            ((j30_0)object3).A();
            bl2 = ((j30_0)object3).O;
            if (bl2) {
                ((j30_0)object3).C(xp1$a);
            } else {
                ((j30_0)object3).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object3, object7, n20$a$b);
            object7 = N20$a.d;
            Ow3.a((b30_0)object3, object9, (Function2)object7);
            object9 = N20$a.f;
            n4 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object3).v(), object5 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                rk_0.a(n19, (j30_0)object3, n19, (N20$a$a)object9);
            }
            object6 = N20$a.c;
            Ow3.a((b30_0)object3, object8, (Function2)object6);
            object8 = Nc$a.a;
            if (u103 != null) {
                int n20 = -238754006;
                ((j30_0)object3).K(n20);
                object5 = androidx.compose.ui.layout.a.b("text");
                float f5 = c;
                n7 = 0;
                object = h.g((LP1)object5, f5, 0.0f, n14);
                object4 = null;
                object5 = HA.e((Nc)object8, false);
                n14 = ((j30_0)object3).P;
                rq2_1 rq2_12 = ((j30_0)object3).P();
                object = a30_0.c((b30_0)object3, (LP1)object);
                n18 = n10;
                n10 = mp2 instanceof mp;
                if (n10 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object3).A();
                n10 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n10 != 0) {
                    ((j30_0)object3).C(xp1$a);
                } else {
                    ((j30_0)object3).n();
                }
                Ow3.a((b30_0)object3, object5, n20$a$b);
                Ow3.a((b30_0)object3, rq2_12, (Function2)object7);
                n10 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object2 = ((j30_0)object3).v(), object5 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                    rk_0.a(n14, (j30_0)object3, n14, (N20$a$a)object9);
                }
                Ow3.a((b30_0)object3, object, (Function2)object6);
                object = n16;
                u103.invoke(object3, object);
                ((j30_0)object3).T(true);
                n7 = 0;
                object = null;
                ((j30_0)object3).T(false);
            } else {
                n18 = n10;
                n7 = 0;
                object = null;
                n10 = -238605051;
                ((j30_0)object3).K(n10);
                ((j30_0)object3).T(false);
            }
            if (function22 != null) {
                n10 = -238572036;
                ((j30_0)object3).K(n10);
                object2 = androidx.compose.ui.layout.a.b("icon");
                object4 = HA.e((Nc)object8, false);
                n7 = ((j30_0)object3).P;
                object8 = ((j30_0)object3).P();
                object2 = a30_0.c((b30_0)object3, (LP1)object2);
                n16 = mp2 instanceof mp;
                if (n16 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object3).A();
                n16 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n16 != 0) {
                    ((j30_0)object3).C(xp1$a);
                } else {
                    ((j30_0)object3).n();
                }
                Ow3.a((b30_0)object3, object4, n20$a$b);
                Ow3.a((b30_0)object3, object8, (Function2)object7);
                n14 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object4 = ((j30_0)object3).v(), object8 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                    rk_0.a(n7, (j30_0)object3, n7, (N20$a$a)object9);
                }
                Ow3.a((b30_0)object3, object2, (Function2)object6);
                object = n18 >> 3 & 0xE;
                function22.invoke(object3, object);
                ((j30_0)object3).T(true);
                n7 = 0;
                object = null;
                ((j30_0)object3).T(false);
            } else {
                n10 = -238501883;
                ((j30_0)object3).K(n10);
                ((j30_0)object3).T(false);
            }
            n7 = 1;
            ((j30_0)object3).T(n7 != 0);
        }
        object = ((j30_0)object3).X();
        if (object != null) {
            n10 = n3;
            ((CF2)object).d = object3 = new rh3_2(u103, function22, n3);
        }
    }
}

