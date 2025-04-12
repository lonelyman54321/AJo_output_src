/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from zS0
 */
public final class zs0_0 {
    public static final float a = 56;
    public static final float b = 48;
    public static final float c = 12;
    public static final float d = 20;

    public static final void a(u10 u102, Function0 function0, LP1 lP1, Function2 function2, wr1_1 wr1_12, i13 i132, long l2, long l3, Rl0 rl0, b30_0 b30_02, int n3) {
        int n4;
        Object object;
        Object object2;
        Object object3;
        long l4;
        long l7;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        float f5;
        u10 u103 = u102;
        int n7 = -1555720195;
        Object object8 = b30_02;
        Object object9 = b30_02.g(n7);
        int n8 = n3 & 6;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object9).x(u102) ? 1 : 0);
            if (n8 != 0) {
                n8 = 4;
                f5 = 5.6E-45f;
            } else {
                n8 = 2;
                f5 = 2.8E-45f;
            }
            n8 = n3 | n8;
        } else {
            n8 = n3;
        }
        int n10 = n3 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object9).x(function0) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        n10 = n8 | 0x6D80;
        float f6 = 2.75506E-40f;
        int n14 = n3 & 0x30000;
        if (n14 == 0) {
            n10 = 0x16D80 | n8;
        }
        f5 = 2.204052E-39f;
        n8 = n3 & 0x180000;
        if (n8 == 0) {
            n8 = 524288;
            f5 = 7.34684E-40f;
            n10 |= n8;
        }
        n8 = 0xC00000;
        f5 = 1.7632415E-38f;
        n14 = n3 & n8;
        if (n14 == 0) {
            n14 = 0x400000;
            f6 = 5.877472E-39f;
            n10 |= n14;
        }
        f6 = 2.4074124E-35f;
        n14 = n3 & 0x6000000;
        if (n14 == 0) {
            n14 = 0x2000000;
            f6 = 9.403955E-38f;
            n10 |= n14;
        }
        f6 = 1.4777644E-37f;
        n14 = 0x2492493 & n10;
        int n15 = 0x2492492;
        if (n14 == n15 && (n14 = (int)(((j30_0)object9).h() ? 1 : 0)) != 0) {
            ((j30_0)object9).D();
            object7 = lP1;
            object6 = function2;
            object5 = wr1_12;
            object4 = i132;
            l7 = l2;
            l4 = l3;
            object3 = rl0;
        } else {
            int n16;
            Object object10;
            long l8;
            long l12;
            Object object11;
            wr1_1 wr1_13;
            ((j30_0)object9).r0();
            n14 = n3 & 1;
            n15 = -268369921;
            if (n14 != 0 && (n14 = (int)(((j30_0)object9).c0() ? 1 : 0)) == 0) {
                ((j30_0)object9).D();
                n10 &= n15;
                object2 = lP1;
                object = function2;
                wr1_13 = wr1_12;
                object11 = i132;
                l12 = l2;
                l8 = l3;
                object10 = rl0;
            } else {
                object6 = LP1$a.b;
                object4 = B13.a;
                object4 = ((A13)((j30_0)object9).j((H30)object4)).a;
                int n17 = 50;
                float f7 = n17;
                Object object12 = new eq2_1(f7);
                object4 = ((q90_0)object4).b((eq2_1)object12, (eq2_1)object12, (eq2_1)object12, (eq2_1)object12);
                object12 = mz_0.a;
                object12 = (lZ)((j30_0)object9).j((H30)object12);
                l7 = ((lZ)object12).g();
                l4 = mz_0.b(l7, (b30_0)object9);
                int n18 = 6;
                float f8 = n18;
                n4 = 12;
                float f11 = n4;
                n16 = 8;
                float f12 = n16;
                float f14 = n16;
                boolean bl2 = object9.b(f8);
                boolean bl3 = object9.b(f11);
                bl2 |= bl3;
                bl3 = object9.b(f12);
                bl2 |= bl3;
                bl3 = object9.b(f14);
                object8 = object9.v();
                if ((bl2 |= bl3) || object8 == (object5 = b30$a.a)) {
                    object8 = new Rl0(f8, f11, f12, f14);
                    object9.o(object8);
                }
                object8 = (Rl0)object8;
                n10 &= 0xF000FFFF;
                n15 = 0;
                object5 = null;
                object10 = object8;
                object2 = object6;
                n16 = 0;
                object = null;
                f14 = 0.0f;
                bl2 = false;
                wr1_13 = null;
                object11 = object4;
                l12 = l7;
                l8 = l4;
            }
            ((j30_0)object9).U();
            f5 = b;
            n14 = 2143289344;
            f6 = 0.0f / 0.0f;
            object6 = j.j((LP1)object2, f5, f5, f6, f6);
            object8 = new ss0_1(u103, (Function2)object);
            object3 = v10.c(1418981691, (fx0_2)object8, (b30_0)object9);
            n8 = n10 >> 3 & 0xE;
            n15 = 0xC00000;
            n10 = n10 >> 6 & 0x380;
            int n19 = (n8 |= n15) | n10;
            object8 = function0;
            object7 = object6;
            object6 = wr1_13;
            object5 = object11;
            n16 = n19;
            zs0_0.b(function0, (LP1)object7, wr1_13, (i13)object11, l12, l8, (Rl0)object10, (u10)object3, (b30_0)object9, n19);
            object7 = object2;
            object5 = wr1_13;
            object4 = object11;
            l7 = l12;
            l4 = l8;
            object3 = object10;
            object6 = object;
        }
        object = ((j30_0)object9).X();
        if (object != null) {
            object9 = object2;
            u103 = u102;
            object8 = function0;
            n4 = n3;
            ((CF2)object).d = object2 = new ts0_1(u102, function0, (LP1)object7, (Function2)object6, (wr1_1)object5, (i13)object4, l7, l4, (Rl0)object3, n3);
        }
    }

    public static final void b(Function0 function0, LP1 lP1, wr1_1 wr1_12, i13 i132, long l2, long l3, Rl0 rl0, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Function2 function2;
        Object object2;
        Object object3 = lP1;
        wr1_1 wr1_13 = wr1_12;
        long l4 = l3;
        Object object4 = rl0;
        Object object5 = u102;
        int n4 = n3;
        Object object6 = b30_02;
        Object object7 = b30_02.g(1028985328);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object7).x(function0) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n8 = n4 & 0x30;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object7).J(object3) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n4 & 0x180) == 0) {
            n8 = (int)(((j30_0)object7).J(wr1_13) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n4 & 0xC00) == 0) {
            n8 = (int)(((j30_0)object7).J(i132) ? 1 : 0);
            n8 = n8 != 0 ? 2048 : 1024;
            n7 |= n8;
        }
        if ((n8 = n4 & 0x6000) == 0) {
            n8 = (int)(((j30_0)object7).d(l2) ? 1 : 0);
            n8 = n8 != 0 ? 16384 : 8192;
            n7 |= n8;
        }
        if ((n8 = 0x30000 & n4) == 0) {
            n8 = (int)(((j30_0)object7).d(l4) ? 1 : 0);
            n8 = n8 != 0 ? 131072 : 65536;
            n7 |= n8;
        }
        if ((n8 = 0x180000 & n4) == 0) {
            n8 = (int)(((j30_0)object7).J(object4) ? 1 : 0);
            n8 = n8 != 0 ? 0x100000 : 524288;
            n7 |= n8;
        }
        if ((n8 = 0xC00000 & n4) == 0) {
            n8 = (int)(((j30_0)object7).x(object5) ? 1 : 0);
            n8 = n8 != 0 ? 0x800000 : 0x400000;
            n7 |= n8;
        }
        n8 = 0x492493 & n7;
        int n10 = 0x492492;
        float f5 = 6.71711E-39f;
        if (n8 == n10 && (n8 = (int)(((j30_0)object7).h() ? 1 : 0)) != 0) {
            ((j30_0)object7).D();
            object2 = object7;
        } else {
            Object object8;
            Object object9;
            ((j30_0)object7).r0();
            n8 = n4 & 1;
            if (n8 != 0 && (n8 = (int)(((j30_0)object7).c0() ? 1 : 0)) == 0) {
                ((j30_0)object7).D();
            }
            ((j30_0)object7).U();
            n8 = 0;
            object6 = null;
            if (wr1_13 == null) {
                n10 = -1991754265;
                f5 = -2.410323E-33f;
                ((j30_0)object7).K(n10);
                object9 = ((j30_0)object7).v();
                object8 = b30$a.a;
                if (object9 == object8) {
                    object9 = new xr1_1();
                    ((j30_0)object7).o(object9);
                }
                object9 = (wr1_1)object9;
                ((j30_0)object7).T(false);
                object8 = object9;
            } else {
                n10 = 628485872;
                f5 = 2.1331318E-16f;
                ((j30_0)object7).K(n10);
                ((j30_0)object7).T(false);
                object8 = wr1_13;
            }
            object9 = us0_1.c;
            object6 = CY2.b((LP1)object3, false, (Function1)object9);
            n10 = n7 >> 15 & 0x70;
            f5 = ((xs0_0)((Rl0)object4).a((wr1_1)object8, (b30_0)object7, (int)n10).b.getValue()).a;
            object3 = new xs0_1(l4, (u10)object5);
            int n14 = 1972871863;
            function2 = v10.c(n14, (fx0_2)object3, (b30_0)object7);
            int n15 = n7 & 0xE | 0x30000000;
            int n16 = n7 & 0x1C00;
            n15 |= n16;
            n16 = 0xE000 & n7;
            n15 |= n16;
            n16 = 0x70000 & n7;
            int n17 = n15 | n16;
            n15 = 0;
            n16 = 0;
            object3 = null;
            int n18 = 68;
            float f6 = f5;
            n10 = 0;
            object9 = null;
            f5 = 0.0f;
            object = object8;
            object8 = i132;
            object2 = object7;
            object7 = null;
            object5 = object;
            object4 = function2;
            jg3_0.b(function0, (LP1)object6, false, i132, l2, l3, null, f6, (wr1_1)object, (u10)function2, (b30_0)object2, n17, n18);
        }
        object7 = ((j30_0)object2).X();
        if (object7 != null) {
            ys0_1 ys0_12;
            function2 = ys0_12;
            object = function0;
            object3 = lP1;
            wr1_13 = wr1_12;
            ys0_12 = new ys0_1(function0, lP1, wr1_12, i132, l2, l3, rl0, u102, n3);
            ((CF2)object7).d = ys0_12;
        }
    }
}

