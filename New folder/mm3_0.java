/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mm3
 */
public final class mm3_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, String string2, long l2, tv0_0 tv0_02, long l3, RU0 rU0, long l4, b30_0 b30_02, int n3, int n4) {
        long l7;
        Object object;
        Object object2;
        long l8;
        long l12;
        int n7;
        int n8;
        long l14;
        int n10;
        int n14;
        Object object3;
        int n15;
        long l15;
        int n16;
        int n17;
        int n18;
        int n19;
        Object object4;
        Object object5;
        Object object6;
        int n20;
        block26: {
            block25: {
                block24: {
                    String string3 = string2;
                    n20 = n3;
                    object6 = "value";
                    Intrinsics.checkNotNullParameter(string2, (String)object6);
                    object5 = b30_02;
                    object4 = b30_02.g(-790702585);
                    n19 = n4 & 1;
                    if (n19 != 0) {
                        n17 = n18 = n3 | 6;
                        object5 = lP1;
                    } else {
                        n18 = n3 & 0xE;
                        if (n18 == 0) {
                            object5 = lP1;
                            n17 = (int)(((j30_0)object4).J(lP1) ? 1 : 0);
                            n17 = n17 != 0 ? 4 : 2;
                            n17 |= n20;
                        } else {
                            object5 = lP1;
                            n17 = n3;
                        }
                    }
                    n16 = n20 & 0x70;
                    if (n16 == 0) {
                        n16 = (int)(((j30_0)object4).J(string3) ? 1 : 0);
                        n16 = n16 != 0 ? 32 : 16;
                        n17 |= n16;
                    }
                    if ((n16 = n4 & 4) != 0) {
                        n17 |= 0x180;
                    } else {
                        int n21 = n20 & 0x380;
                        if (n21 == 0) {
                            l15 = l2;
                            n15 = (int)(((j30_0)object4).d(l2) ? 1 : 0);
                            n15 = n15 != 0 ? 256 : 128;
                        }
                    }
                    l15 = l2;
                    break block24;
                    n17 |= n15;
                }
                n15 = n4 & 8;
                if (n15 != 0) {
                    n17 |= 0xC00;
                } else {
                    int n22 = n20 & 0x1C00;
                    if (n22 == 0) {
                        object3 = tv0_02;
                        n14 = (int)(((j30_0)object4).J(tv0_02) ? 1 : 0);
                        n14 = n14 != 0 ? 2048 : 1024;
                    }
                }
                object3 = tv0_02;
                break block25;
                n17 |= n14;
            }
            n14 = n4 & 0x10;
            if (n14 != 0) {
                n17 |= 0x6000;
            } else {
                n10 = 0xE000 & n20;
                if (n10 == 0) {
                    l14 = l3;
                    n8 = (int)(((j30_0)object4).d(l3) ? 1 : 0);
                    n8 = n8 != 0 ? 16384 : 8192;
                }
            }
            l14 = l3;
            break block26;
            n17 |= n8;
        }
        n8 = 0x30000 | n17;
        int n24 = n4 & 0x40;
        int n25 = 0x380000;
        if (n24 != 0) {
            n8 = 0x1B0000 | n17;
        } else {
            n17 = n20 & n25;
            if (n17 == 0) {
                n7 = (int)(((j30_0)object4).d(l4) ? 1 : 0);
                n7 = n7 != 0 ? 0x100000 : 524288;
                n8 |= n7;
            }
        }
        n7 = 2995931;
        n18 = n8 & n7;
        n17 = 599186;
        if (n18 == n17 && (n18 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object5 = lP1;
            l12 = l4;
            l8 = l15;
            object2 = object3;
            object = object4;
            l7 = l14;
            object4 = rU0;
        } else {
            long l16;
            long l17;
            long l18;
            Object object7 = n19 != 0 ? (object6 = LP1$a.b) : lP1;
            long l19 = n16 != 0 ? (l18 = xx_1.H) : l15;
            Object object8 = n15 != 0 ? (object6 = tv0_0.o) : object3;
            if (n14 != 0) {
                n19 = 10;
                l17 = l18 = Em3.f(n19);
            } else {
                l17 = l14;
            }
            av0_0 av0_02 = y20_0.a;
            if (n24 != 0) {
                n19 = 0;
                object6 = null;
                l16 = l18 = Em3.f(0);
            } else {
                l16 = l4;
            }
            n19 = n8 >> 3;
            n18 = n19 & 0xE;
            n17 = n8 << 3;
            n16 = n17 & 0x70;
            n18 |= n16;
            n16 = n8 & 0x380;
            n19 = n19 & 0x1C00 | (n18 |= n16);
            n18 = n8 << 6;
            n16 = 458752;
            n19 |= (n18 &= n16);
            n18 = n17 & n25;
            n19 |= n18;
            n18 = 0x1C00000 & n17;
            int n26 = n19 | n18;
            n15 = 0;
            n14 = 0;
            n10 = 0;
            long l20 = 0L;
            n24 = 0;
            n25 = 0;
            n7 = 0;
            int n27 = 130832;
            object6 = string2;
            object5 = object7;
            l15 = l17;
            object3 = object8;
            object = object4;
            object4 = av0_02;
            l12 = l16;
            Ll3.b(string2, (LP1)object7, l19, l17, null, (tv0_0)object8, av0_02, l16, null, null, l20, 0, false, 0, 0, null, null, (b30_0)object, n26, 0, n27);
            l8 = l19;
            object2 = object8;
            l7 = l17;
        }
        CF2 cF2 = ((j30_0)object).X();
        if (cF2 != null) {
            km3_0 km3_02;
            object6 = km3_02;
            n14 = n3;
            n10 = n4;
            km3_02 = new km3_0((LP1)object5, string2, l8, (tv0_0)object2, l7, (RU0)object4, l12, n3, n4);
            cF2.d = km3_02;
        }
    }
}

