/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.layout.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class Jg2 {
    public static final float a = 4;

    static {
        Em3.f(8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, Function2 function2, u10 u102, u10 u103, u10 u104, u10 u105, boolean n3, float f5, Function1 function1, u10 u106, mk2_0 mk2_02, b30_0 object, int n4, int n7) {
        Object object2;
        Object object3;
        void var13_16;
        int n8;
        void var12_15;
        Object object4 = lP1;
        Object object5 = function2;
        Object object6 = u102;
        u10 u107 = u103;
        Object object7 = u104;
        u10 u108 = u105;
        int n10 = n3;
        float f6 = f5;
        Function1 function12 = function1;
        Object object8 = u106;
        mk2_0 mk2_03 = mk2_02;
        int n14 = var12_15;
        int n15 = -2049536174;
        Object object9 = object.g(n15);
        int n16 = var12_15 & 6;
        if (n16 == 0) {
            n16 = ((j30_0)object9).J(lP1) ? 1 : 0;
            n16 = n16 != 0 ? 4 : 2;
            n16 |= n14;
        } else {
            n16 = var12_15;
        }
        int n17 = n14 & 0x30;
        if (n17 == 0) {
            n17 = ((j30_0)object9).x(object5) ? 1 : 0;
            n17 = n17 != 0 ? 32 : 16;
            n16 |= n17;
        }
        if ((n8 = n14 & 0x180) == 0) {
            n8 = ((j30_0)object9).x(object6) ? 1 : 0;
            n8 = n8 != 0 ? 256 : 128;
            n16 |= n8;
        }
        if ((n8 = n14 & 0xC00) == 0) {
            n8 = ((j30_0)object9).x(u107) ? 1 : 0;
            n8 = n8 != 0 ? 2048 : 1024;
            n16 |= n8;
        }
        if ((n8 = n14 & 0x6000) == 0) {
            n8 = ((j30_0)object9).x(object7) ? 1 : 0;
            n8 = n8 != 0 ? 16384 : 8192;
            n16 |= n8;
        }
        if ((n8 = 0x30000 & n14) == 0) {
            n8 = ((j30_0)object9).x(u108) ? 1 : 0;
            n8 = n8 != 0 ? 131072 : 65536;
            n16 |= n8;
        }
        if ((n8 = 0x180000 & n14) == 0) {
            n8 = ((j30_0)object9).a(n10 != 0) ? 1 : 0;
            n8 = n8 != 0 ? 0x100000 : 524288;
            n16 |= n8;
        }
        if ((n8 = 0xC00000 & n14) == 0) {
            n8 = ((j30_0)object9).b(f6) ? 1 : 0;
            n8 = n8 != 0 ? 0x800000 : 0x400000;
            n16 |= n8;
        }
        if ((n8 = 0x6000000 & n14) == 0) {
            n8 = ((j30_0)object9).x(function12) ? 1 : 0;
            n8 = n8 != 0 ? 0x4000000 : 0x2000000;
            n16 |= n8;
        }
        if ((n8 = 0x30000000 & n14) == 0) {
            n8 = ((j30_0)object9).x(object8) ? 1 : 0;
            n8 = n8 != 0 ? 0x20000000 : 0x10000000;
            n16 |= n8;
        }
        if ((n8 = var13_16 & 6) == 0) {
            n8 = ((j30_0)object9).J(mk2_03) ? 1 : 0;
            n8 = n8 != 0 ? 4 : 2;
            n8 = var13_16 | n8;
        } else {
            n8 = var13_16;
        }
        int n18 = 306783379;
        int n19 = n16 & n18;
        n14 = 306783378;
        if (n19 == n14 && (n14 = n8 & 3) == (n19 = 2) && (n14 = (int)(((j30_0)object9).h() ? 1 : 0)) != 0) {
            ((j30_0)object9).D();
            object7 = u107;
            Function2 function22 = object5;
        } else {
            boolean bl2;
            Object object10;
            int n20;
            float f7;
            float f8;
            void var11_14;
            float f11;
            boolean bl3;
            float f12;
            b30$a$a b30$a$a;
            Object object11;
            n14 = 0xE000000 & n16;
            n19 = 0x4000000;
            if (n14 == n19) {
                n14 = 1;
            } else {
                n14 = 0;
                object11 = null;
            }
            n19 = 0x380000 & n16;
            int n21 = 0x100000;
            float f14 = 1.469368E-39f;
            if (n19 == n21) {
                n21 = 1;
                f14 = Float.MIN_VALUE;
            } else {
                n21 = 0;
                f14 = 0.0f;
                Object var17_22 = null;
            }
            n21 |= n14;
            n14 = 0x1C00000 & n16;
            n19 = 0x800000;
            if (n14 == n19) {
                n14 = 1;
            } else {
                n14 = 0;
                object11 = null;
            }
            n21 |= n14;
            n14 = n8 & 0xE;
            n19 = 4;
            if (n14 == n19) {
                n14 = 1;
            } else {
                n14 = 0;
                object11 = null;
            }
            object11 = ((j30_0)object9).v();
            if ((n21 |= n14) != 0 || object11 == (b30$a$a = b30$a.a)) {
                object11 = new Kg2(function12, n10 != 0, f6, mk2_03);
                ((j30_0)object9).o(object11);
            }
            object11 = (Kg2)object11;
            vc3_1 vc3_12 = O30.l;
            bp1_0 bp1_02 = (bp1_0)((Object)((j30_0)object9).j(vc3_12));
            n19 = ((j30_0)object9).P;
            object3 = ((j30_0)object9).P();
            Object object12 = a30_0.c((b30_0)object9, (LP1)object4);
            N20.W.getClass();
            object4 = N20$a.b;
            mp mp2 = ((j30_0)object9).a;
            boolean bl4 = mp2 instanceof mp;
            if (!bl4) {
                s20.a();
                throw null;
            }
            ((j30_0)object9).A();
            bl4 = ((j30_0)object9).O;
            if (bl4) {
                ((j30_0)object9).C((Function0)object4);
            } else {
                ((j30_0)object9).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object9, object11, n20$a$b);
            object11 = N20$a.d;
            Ow3.a((b30_0)object9, object3, (Function2)object11);
            object3 = N20$a.f;
            int n22 = ((j30_0)object9).O;
            if (n22 != 0 || (n22 = Intrinsics.areEqual(object5 = ((j30_0)object9).v(), object6 = Integer.valueOf(n19))) == 0) {
                rk_0.a(n19, (j30_0)object9, n19, (N20$a$a)object3);
            }
            object5 = N20$a.c;
            Ow3.a((b30_0)object9, object12, (Function2)object5);
            int n24 = n16 >> 27 & 0xE;
            object6 = n24;
            ((u10)object8).invoke(object9, object6);
            object6 = Nc$a.e;
            LP1$a lP1$a = LP1$a.b;
            if (object7 != null) {
                Object object13;
                n10 = -988654503;
                f12 = -2341.2717f;
                ((j30_0)object9).K(n10);
                object12 = androidx.compose.ui.layout.a.b("Leading");
                object2 = lk3_0.d;
                object12 = kp1_0.a((up1_0)object12, (LP1)object2);
                object2 = null;
                object8 = HA.e((Nc)object6, false);
                n19 = ((j30_0)object9).P;
                bp1_0 bp1_03 = bp1_02;
                rq2_1 rq2_12 = ((j30_0)object9).P();
                object12 = a30_0.c((b30_0)object9, (LP1)object12);
                bl3 = mp2 instanceof mp;
                if (!bl3) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object9).A();
                bl3 = ((j30_0)object9).O;
                if (bl3) {
                    ((j30_0)object9).C((Function0)object4);
                } else {
                    ((j30_0)object9).n();
                }
                Ow3.a((b30_0)object9, object8, n20$a$b);
                Ow3.a((b30_0)object9, rq2_12, (Function2)object11);
                n21 = ((j30_0)object9).O ? 1 : 0;
                if (n21 != 0 || (n21 = (int)(Intrinsics.areEqual(object13 = ((j30_0)object9).v(), object8 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                    rk_0.a(n19, (j30_0)object9, n19, (N20$a$a)object3);
                }
                Ow3.a((b30_0)object9, object12, (Function2)object5);
                Integer n25 = n16 >> 12 & 0xE;
                ((u10)object7).invoke(object9, n25);
                ((j30_0)object9).T(true);
                n21 = 0;
                f14 = 0.0f;
                Object var17_32 = null;
                ((j30_0)object9).T(false);
            } else {
                bp1_0 bp1_04 = bp1_02;
                n21 = 0;
                f14 = 0.0f;
                Object var17_33 = null;
                n10 = -988413292;
                f12 = -2400.1611f;
                ((j30_0)object9).K(n10);
                ((j30_0)object9).T(false);
            }
            if (u108 != null) {
                n21 = -988370729;
                f14 = -2410.5525f;
                ((j30_0)object9).K(n21);
                LP1 lP12 = androidx.compose.ui.layout.a.b("Trailing");
                object12 = lk3_0.d;
                LP1 lP13 = kp1_0.a((up1_0)lP12, (LP1)object12);
                f12 = 0.0f;
                object12 = null;
                object6 = HA.e((Nc)object6, false);
                n10 = ((j30_0)object9).P;
                object8 = ((j30_0)object9).P();
                LP1 lP14 = a30_0.c((b30_0)object9, lP13);
                bl3 = mp2 instanceof mp;
                if (!bl3) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object9).A();
                bl3 = ((j30_0)object9).O;
                if (bl3) {
                    ((j30_0)object9).C((Function0)object4);
                } else {
                    ((j30_0)object9).n();
                }
                Ow3.a((b30_0)object9, object6, n20$a$b);
                Ow3.a((b30_0)object9, object8, (Function2)object11);
                n24 = ((j30_0)object9).O ? 1 : 0;
                if (n24 != 0 || (n24 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object9).v(), object8 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                    rk_0.a(n10, (j30_0)object9, n10, (N20$a$a)object3);
                }
                Ow3.a((b30_0)object9, lP14, (Function2)object5);
                object6 = n16 >> 15 & 0xE;
                u108.invoke(object9, object6);
                ((j30_0)object9).T(true);
                n24 = 0;
                f11 = 0.0f;
                object6 = null;
                ((j30_0)object9).T(false);
            } else {
                n24 = 0;
                f11 = 0.0f;
                object6 = null;
                n21 = -988127596;
                f14 = -2469.9111f;
                ((j30_0)object9).K(n21);
                ((j30_0)object9).T(false);
            }
            mk2_03 = mk2_02;
            void var17_39 = var11_14;
            f12 = h.c(mk2_02, (bp1_0)var11_14);
            f14 = h.b(mk2_02, (bp1_0)var11_14);
            if (object7 != null) {
                f8 = lk3_0.c;
                f12 -= f8;
                f8 = 0.0f;
                f12 = f.a(f12, f8);
            }
            float f15 = f12;
            if (u108 != null) {
                f12 = lk3_0.c;
                f14 -= f12;
                f12 = 0.0f;
                f7 = f11 = f.a(f14, f12);
            } else {
                f7 = f14;
            }
            int n26 = 10;
            object6 = h.i(lP1$a, f15, 0.0f, f7, 0.0f, n26);
            u10 u109 = u102;
            if (u102 != null) {
                ((j30_0)object9).K(-987369863);
                object12 = kp1_0.a((up1_0)androidx.compose.ui.layout.a.b("Hint"), (LP1)object6);
                n20 = n16 >> 3 & 0x70;
                object8 = n20;
                u102.invoke(object12, object9, object8);
                n10 = 0;
                f12 = 0.0f;
                object12 = null;
                ((j30_0)object9).T(false);
            } else {
                n10 = 0;
                f12 = 0.0f;
                object12 = null;
                n20 = -987282412;
                f8 = -2676.255f;
                ((j30_0)object9).K(n20);
                ((j30_0)object9).T(false);
            }
            object6 = kp1_0.a((up1_0)androidx.compose.ui.layout.a.b("TextField"), (LP1)object6);
            object12 = Nc$a.a;
            f8 = Float.MIN_VALUE;
            object2 = HA.e((Nc)object12, true);
            n20 = ((j30_0)object9).P;
            rq2_1 rq2_13 = ((j30_0)object9).P();
            object6 = a30_0.c((b30_0)object9, (LP1)object6);
            boolean bl5 = mp2 instanceof mp;
            if (!bl5) {
                s20.a();
                throw null;
            }
            ((j30_0)object9).A();
            bl5 = ((j30_0)object9).O;
            if (bl5) {
                ((j30_0)object9).C((Function0)object4);
            } else {
                ((j30_0)object9).n();
            }
            Ow3.a((b30_0)object9, object2, n20$a$b);
            Ow3.a((b30_0)object9, rq2_13, (Function2)object11);
            n21 = ((j30_0)object9).O ? 1 : 0;
            if (n21 != 0 || (n21 = (int)(Intrinsics.areEqual(object10 = ((j30_0)object9).v(), object7 = Integer.valueOf(n20)) ? 1 : 0)) == 0) {
                rk_0.a(n20, (j30_0)object9, n20, (N20$a$a)object3);
            }
            Ow3.a((b30_0)object9, object6, (Function2)object5);
            object6 = n16 >> 3 & 0xE;
            Function2 function23 = function2;
            function2.invoke(object9, object6);
            n24 = 1;
            f11 = Float.MIN_VALUE;
            ((j30_0)object9).T(n24 != 0);
            object7 = u103;
            if (u103 != null) {
                n24 = -987052578;
                f11 = -2732.3667f;
                ((j30_0)object9).K(n24);
                object6 = androidx.compose.ui.layout.a.b("Label");
                f8 = 0.0f;
                object8 = null;
                object12 = HA.e((Nc)object12, false);
                n20 = ((j30_0)object9).P;
                object2 = ((j30_0)object9).P();
                object6 = a30_0.c((b30_0)object9, (LP1)object6);
                boolean bl6 = mp2 instanceof mp;
                if (!bl6) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object9).A();
                bl6 = ((j30_0)object9).O;
                if (bl6) {
                    ((j30_0)object9).C((Function0)object4);
                } else {
                    ((j30_0)object9).n();
                }
                Ow3.a((b30_0)object9, object12, n20$a$b);
                Ow3.a((b30_0)object9, object2, (Function2)object11);
                bl2 = ((j30_0)object9).O;
                if (bl2 || !(bl2 = Intrinsics.areEqual(object4 = ((j30_0)object9).v(), object12 = Integer.valueOf(n20)))) {
                    rk_0.a(n20, (j30_0)object9, n20, (N20$a$a)object3);
                }
                Ow3.a((b30_0)object9, object6, (Function2)object5);
                object4 = n16 >> 9 & 0xE;
                ((u10)object7).invoke(object9, object4);
                ((j30_0)object9).T(true);
                bl2 = false;
                object4 = null;
                ((j30_0)object9).T(false);
            } else {
                bl2 = false;
                object4 = null;
                n22 = -986969932;
                ((j30_0)object9).K(n22);
                ((j30_0)object9).T(false);
            }
            bl2 = true;
            ((j30_0)object9).T(bl2);
        }
        object2 = ((j30_0)object9).X();
        if (object2 != null) {
            object9 = object3;
            object4 = lP1;
            object5 = function2;
            object6 = u102;
            u10 u1010 = u103;
            object7 = u104;
            u108 = u105;
            n10 = n3;
            f6 = f5;
            Function1 function13 = function1;
            object8 = u106;
            mk2_03 = mk2_02;
            n14 = var12_15;
            n16 = var13_16;
            object3 = new hg2_1(lP1, function2, u102, u103, u104, u105, n3 != 0, f5, function1, u106, mk2_02, (int)var12_15, (int)var13_16);
            ((CF2)object2).d = object3;
        }
    }

    public static final int b(int n3, int n4, int n7, int n8, int n10, float f5, long l2, float f6, mk2_0 mk2_02) {
        int n14 = LK1.d(n8, 0, f5);
        n10 = Math.max(n10, n14);
        n7 = Math.max(n7, n10);
        float f7 = mk2_02.calculateTopPadding-D9Ej5fM() * f6;
        float f8 = (float)n8 / 2.0f;
        f8 = Math.max(f7, f8);
        f8 = LK1.c(f7, f8, f5);
        f7 = mk2_02.calculateBottomPadding-D9Ej5fM() * f6;
        float f11 = n7;
        f8 = f8 + f11 + f7;
        n7 = c60.j(l2);
        n8 = ok1_1.b(f8);
        n4 = Math.max(n4, n8);
        n3 = Math.max(n3, n4);
        return Math.max(n7, n3);
    }

    public static final int c(int n3, int n4, int n7, int n8, int n10, float f5, long l2, float f6, mk2_0 mk2_02) {
        n10 = Math.max(LK1.d(n8, 0, f5), n10);
        n7 = Math.max(n7, n10) + n3 + n4;
        bp1_0 bp1_02 = bp1_0.Ltr;
        float f7 = mk2_02.calculateLeftPadding-u2uoSUM(bp1_02);
        float f8 = (mk2_02.calculateRightPadding-u2uoSUM(bp1_02) + f7) * f6;
        n3 = ok1_1.b(((float)n8 + f8) * f5);
        n4 = c60.k(l2);
        n3 = Math.max(n3, n4);
        return Math.max(n7, n3);
    }
}

