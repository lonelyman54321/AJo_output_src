/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Of0
 */
public final class of0_1 {
    public static final float a = 0.0f;
    public static final Qs3 b;

    static {
        ne0_1 ne0_12 = ex0_0.a;
        b = Hl.c(250, 0, ne0_12, 2);
    }

    public static final void a(float f5, int n3, int n4, long l2, long l3, u10 u102, b30_0 b30_02, gx0_2 gx0_22, LP1 lP1, Function2 function2) {
        Object object;
        int n7;
        Function2 function22;
        long l4;
        int n8;
        int n10 = n4;
        long l7 = l2;
        Object object2 = u102;
        Object object3 = "tabs";
        Intrinsics.checkNotNullParameter(u102, (String)object3);
        j30_0 j30_02 = b30_02.g(1203034172);
        int n14 = n4 & 0xE;
        if (n14 == 0) {
            n14 = (int)(j30_02.c(n3) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n10;
        } else {
            n14 = n4;
        }
        int n15 = n10 & 0x70;
        Object object4 = lP1;
        if (n15 == 0) {
            n15 = (int)(j30_02.J(lP1) ? 1 : 0);
            n15 = n15 != 0 ? 32 : 16;
            n14 |= n15;
        }
        if ((n15 = n10 & 0x380) == 0) {
            n15 = (int)(j30_02.d(l7) ? 1 : 0);
            n15 = n15 != 0 ? 256 : 128;
            n14 |= n15;
        }
        if ((n15 = n10 & 0x1C00) == 0) {
            n14 |= 0x400;
        }
        if ((n15 = 0xE000 & n10) == 0) {
            n15 = (int)(j30_02.b(f5) ? 1 : 0);
            n15 = n15 != 0 ? 16384 : 8192;
            n14 |= n15;
        }
        if ((n15 = 0x70000 & n10) == 0) {
            n15 = (int)(j30_02.x(gx0_22) ? 1 : 0);
            n15 = n15 != 0 ? 131072 : 65536;
            n14 |= n15;
        }
        if ((n15 = 0x380000 & n10) == 0) {
            n15 = (int)(j30_02.x(function2) ? 1 : 0);
            n15 = n15 != 0 ? 0x100000 : 524288;
            n14 |= n15;
        }
        if ((n15 = 0x1C00000 & n10) == 0) {
            n15 = (int)(j30_02.x(object2) ? 1 : 0);
            n15 = n15 != 0 ? 0x800000 : 0x400000;
            n14 |= n15;
        }
        if ((n15 = 0x16DB6DB & n14) == (n8 = 0x492492) && (n15 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            l4 = l3;
            object2 = j30_02;
        } else {
            int n16;
            long l8;
            j30_02.r0();
            n15 = n10 & 1;
            if (n15 != 0 && (n15 = (int)(j30_02.c0() ? 1 : 0)) == 0) {
                j30_02.D();
                l8 = l3;
                n16 = n14 &= 0xFFFFE3FF;
            } else {
                long l12 = mz_0.b(l7, j30_02);
                n16 = n14 &= 0xFFFFE3FF;
                l8 = l12;
            }
            j30_02.U();
            object3 = function22;
            object2 = function22;
            int n17 = n16;
            function22 = new nf0_2(f5, u102, function2, n3, gx0_22);
            object2 = v10.c(1422349432, function22, j30_02);
            n7 = n16 >> 3 & 0xE;
            n14 = 0x180000;
            n17 = n16 & 0x380 | (n7 |= n14);
            n7 = 0;
            n15 = 0;
            int n18 = 50;
            object3 = lP1;
            l4 = l2;
            object = object2;
            object4 = j30_02;
            object2 = j30_02;
            jg3_0.a(lP1, null, l2, l8, null, 0.0f, (u10)object, j30_02, n17, n18);
            l4 = l8;
        }
        object = ((j30_0)object2).X();
        if (object != null) {
            object2 = object4;
            n7 = n3;
            n10 = n4;
            function22 = u102;
            ((CF2)object).d = object4 = new jf0_2(f5, n3, n4, l2, l4, u102, gx0_22, lP1, function2);
        }
    }
}

