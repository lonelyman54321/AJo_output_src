/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PE
 */
public final class pe_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(boolean bl2, String string2, LP1 lP1, ol0 ol02, Function0 function0, long l2, b30_0 b30_02, int n3, int n4) {
        Object object;
        oe_1 oe_12;
        Object object2;
        long l3;
        Object object3;
        j30_0 j30_02;
        int n7;
        long l4;
        int n8;
        int n10;
        ol0 ol03;
        int n14;
        int n15;
        j30_0 j30_03;
        Object object4;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        Function0 function02;
        String string3;
        block25: {
            block24: {
                block20: {
                    block23: {
                        block22: {
                            block21: {
                                string3 = string2;
                                LP1 lP12 = lP1;
                                function02 = function0;
                                n20 = n3;
                                n19 = 1;
                                n18 = 32;
                                n17 = 8;
                                Intrinsics.checkNotNullParameter(string2, "buttonText");
                                Intrinsics.checkNotNullParameter(lP1, "modifier");
                                Intrinsics.checkNotNullParameter(function0, "onButtonClicked");
                                n16 = 192283483;
                                object4 = b30_02;
                                j30_03 = b30_02.g(n16);
                                n15 = n3 & 0xE;
                                if (n15 == 0) {
                                    n15 = (int)(j30_03.a(bl2) ? 1 : 0);
                                    n15 = n15 != 0 ? 4 : 2;
                                    n15 |= n20;
                                } else {
                                    n15 = n3;
                                }
                                n14 = n20 & 0x70;
                                if (n14 == 0) {
                                    n14 = (int)(j30_03.J(string3) ? 1 : 0);
                                    n14 = n14 != 0 ? 32 : 16;
                                    n15 |= n14;
                                }
                                if ((n14 = n20 & 0x380) == 0) {
                                    n14 = (int)(j30_03.J(lP12) ? 1 : 0);
                                    n14 = n14 != 0 ? 256 : 128;
                                    n15 |= n14;
                                }
                                if ((n14 = n20 & 0x1C00) != 0) break block20;
                                n14 = n4 & 8;
                                if (n14 != 0) break block21;
                                ol03 = ol02;
                                n10 = (int)(j30_03.J(ol02) ? 1 : 0);
                                if (n10 == 0) break block22;
                                n10 = 2048;
                                break block23;
                            }
                            ol03 = ol02;
                        }
                        n10 = 1024;
                    }
                    n15 |= n10;
                    break block24;
                }
                ol03 = ol02;
            }
            n8 = 57344;
            n10 = n20 & n8;
            if (n10 == 0) {
                n10 = (int)(j30_03.x(function02) ? 1 : 0);
                n10 = n10 != 0 ? 16384 : 8192;
                n15 |= n10;
            }
            if ((n18 = n4 & 0x20) != 0) {
                n10 = 196608;
                n15 |= n10;
            } else {
                n10 = 0x70000 & n20;
                if (n10 == 0) {
                    l4 = l2;
                    n7 = (int)(j30_03.d(l2) ? 1 : 0);
                    n7 = n7 != 0 ? 131072 : 65536;
                }
            }
            l4 = l2;
            break block25;
            n15 |= n7;
        }
        n7 = n15;
        n15 = 0x5B6DB & n15;
        int n21 = 74898;
        if (n15 == n21 && (n15 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            j30_02 = j30_03;
            object3 = ol03;
            l3 = l4;
        } else {
            int n22;
            long l7;
            Object object5;
            j30_03.r0();
            n15 = n20 & 1;
            if (n15 != 0 && (n15 = (int)(j30_03.c0() ? 1 : 0)) == 0) {
                j30_03.D();
                n18 = n4 & 8;
                if (n18 != 0) {
                    n7 &= 0xFFFFE3FF;
                }
                object5 = ol03;
                l7 = l4;
                n22 = 16384;
            } else {
                long l8;
                n15 = n4 & 8;
                if (n15 != 0) {
                    object4 = GE.a;
                    long l12 = xx_1.e;
                    int n24 = 14;
                    long l14 = 0L;
                    n21 = 6;
                    l4 = l14;
                    n19 = n7;
                    n22 = 16384;
                    object4 = GE.a(l12, l14, j30_03, n21, n24);
                    n7 &= 0xFFFFE3FF;
                } else {
                    n19 = n7;
                    n22 = 16384;
                    object4 = ol03;
                }
                l7 = n18 != 0 ? (l8 = OX.f) : l2;
                object5 = object4;
            }
            j30_03.U();
            object4 = SP2.a(n17);
            j30_03.K(127072460);
            n19 = n7 & n8;
            if (n19 == n22) {
                n19 = 1;
            } else {
                n19 = 0;
                object3 = null;
            }
            object2 = j30_03.v();
            if (n19 == 0 && object2 != (object3 = b30$a.a)) {
                n19 = 0;
                object3 = null;
            } else {
                n19 = 0;
                object3 = null;
                object2 = new ne_1(function02, 0);
                j30_03.o(object2);
            }
            object2 = (Function0)object2;
            j30_03.T(false);
            object3 = new PE$a(string3, l7);
            u10 u102 = v10.c(-1855086229, (fx0_2)object3, j30_03);
            n19 = n7 >> 3 & 0x70 | 0x30000000;
            n18 = n7 << 6 & 0x380;
            n19 |= n18;
            n18 = n7 << 12 & 0x1C00000;
            int n25 = n19 | n18;
            n14 = 0;
            ol03 = null;
            oe_12 = null;
            n17 = 0;
            n10 = 0;
            int n26 = 344;
            object3 = lP1;
            n18 = (int)(bl2 ? 1 : 0);
            j30_02 = j30_03;
            n16 = 0;
            j30_03 = null;
            object = object5;
            n20 = n26;
            ME.a((Function0)object2, lP1, bl2, null, null, (i13)object4, null, (ol0)object5, null, u102, j30_02, n25, n26);
            object3 = object5;
            l3 = l7;
        }
        object = j30_02.X();
        if (object != null) {
            oe_1 oe_13 = oe_12;
            string3 = string2;
            object2 = lP1;
            n15 = n3;
            n14 = n4;
            oe_12 = new oe_1(bl2, string2, lP1, (ol0)object3, function0, l3, n3, n4);
            ((CF2)object).d = oe_12;
        }
    }
}

