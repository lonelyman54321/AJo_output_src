/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class Cq1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(G11$a g11$a, LP1 lP1, qr1_0 qr1_02, mk2_0 mk2_02, boolean bl2, zp$l zp$l, zp$e zp$e, TR0 tR0, boolean bl3, Function1 function1, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        boolean bl4;
        Object object4;
        Object object5;
        Object object6;
        int n7;
        float f5;
        int n8;
        Object object7;
        int n10;
        int n14;
        Object object8;
        int n15;
        int n16;
        int n17;
        int n18;
        G11$a g11$a2;
        block37: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            g11$a2 = g11$a;
                            n18 = n3;
                            n17 = 1;
                            n16 = 2;
                            n15 = 32;
                            int n19 = 1485410512;
                            b30_0 b30_03 = b30_02;
                            object8 = b30_02.g(n19);
                            n14 = n3 & 6;
                            if (n14 == 0) {
                                n14 = ((j30_0)object8).J(g11$a) ? 1 : 0;
                                n14 = n14 != 0 ? 4 : 2;
                                n14 |= n18;
                            } else {
                                n14 = n3;
                            }
                            n16 = n4 & 2;
                            if (n16 == 0) break block33;
                            n14 |= 0x30;
                            break block34;
                        }
                        n10 = n18 & 0x30;
                        if (n10 != 0) break block34;
                        object7 = lP1;
                        n8 = ((j30_0)object8).J(lP1) ? 1 : 0;
                        if (n8 == 0) break block35;
                        n8 = 32;
                        f5 = 4.5E-44f;
                        break block36;
                    }
                    object7 = lP1;
                    break block37;
                }
                n8 = 16;
                f5 = 2.2E-44f;
            }
            n14 |= n8;
        }
        n8 = n18 & 0x180;
        if (n8 == 0) {
            n14 |= 0x80;
        }
        if ((n7 = n4 & 8) != 0) {
            n14 |= 0xC00;
            object6 = mk2_02;
        } else {
            n8 = n18 & 0xC00;
            object6 = mk2_02;
            if (n8 == 0) {
                n8 = ((j30_0)object8).J(mk2_02) ? 1 : 0;
                if (n8 != 0) {
                    n8 = 2048;
                    f5 = 2.87E-42f;
                } else {
                    n8 = 1024;
                    f5 = 1.435E-42f;
                }
                n14 |= n8;
            }
        }
        n14 |= 0x6000;
        int n20 = 196608;
        n8 = n18 & n20;
        if (n8 == 0) {
            n8 = n4 & 0x20;
            object5 = zp$l;
            if (n8 == 0 && (n8 = (int)(((j30_0)object8).J(zp$l) ? 1 : 0)) != 0) {
                n8 = 131072;
                f5 = 1.83671E-40f;
            } else {
                n8 = 65536;
                f5 = 9.1835E-41f;
            }
            n14 |= n8;
        } else {
            object5 = zp$l;
        }
        f5 = 2.204052E-39f;
        n8 = 0x180000 | n14;
        int n21 = 0xC00000 & n18;
        if (n21 == 0) {
            f5 = 8.081524E-39f;
            n8 = 0x580000 | n14;
        }
        n14 = 0x6000000 | n8;
        f5 = 4.656613E-10f;
        n8 = 0x30000000 & n18;
        Object object9 = function1;
        if (n8 == 0) {
            n8 = ((j30_0)object8).x(function1) ? 1 : 0;
            if (n8 != 0) {
                n8 = 0x20000000;
                f5 = 1.0842022E-19f;
            } else {
                n8 = 0x10000000;
                f5 = 2.524355E-29f;
            }
            n14 |= n8;
        }
        n21 = n14;
        n14 = 0x12492493 & n14;
        n8 = 306783378;
        f5 = 6.3469493E-28f;
        if (n14 == n8 && (n14 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
            qr1_0 qr1_03 = qr1_02;
            n14 = bl2 ? 1 : 0;
            object4 = zp$e;
            object9 = tR0;
            bl4 = bl3;
            object3 = object7;
            object7 = object5;
            object2 = object6;
        } else {
            void var19_24;
            void var32_41;
            Object object10;
            Object object11;
            Object object12;
            ((j30_0)object8).r0();
            n14 = n18 & 1;
            object4 = b30$a.a;
            int n22 = -29360129;
            int n24 = -459649;
            n17 = 0;
            object = null;
            if (n14 != 0 && (n14 = (int)(((j30_0)object8).c0() ? 1 : 0)) == 0) {
                ((j30_0)object8).D();
                n16 = n21 & 0xFFFFFC7F;
                n14 = n4 & 0x20;
                if (n14 != 0) {
                    n16 = n21 & n24;
                }
                qr1_0 qr1_04 = qr1_02;
                object9 = zp$e;
                bl4 = bl3;
                n7 = n16 &= n22;
                object12 = object4;
                object2 = object6;
                n16 = bl2 ? 1 : 0;
                object4 = tR0;
            } else {
                object3 = n16 != 0 ? LP1$a.b : object7;
                cr1_0 cr1_02 = sr1.a;
                Object[] objectArray = new Object[]{};
                object7 = qr1_0.t;
                int n25 = ((j30_0)object8).c(0);
                int n26 = ((j30_0)object8).c(0);
                object11 = ((j30_0)object8).v();
                if ((n25 |= n26) != 0 || object11 == object4) {
                    object11 = new tr1_2(0, 0);
                    ((j30_0)object8).o(object11);
                }
                object11 = (Function0)object11;
                n25 = 4;
                boolean bl5 = false;
                object10 = null;
                object12 = object4;
                object4 = object11;
                n20 = n21;
                object2 = object8;
                object9 = null;
                qr1_0 qr1_05 = (qr1_0)wi2_0.b(objectArray, (ds2_0)object7, (Function0)object11, (b30_0)object8, 0, n25);
                n10 = n21 & 0xFFFFFC7F;
                if (n7 != 0) {
                    f5 = 0.0f;
                    object2 = new nk2_0(f5, f5, f5, f5);
                } else {
                    object2 = object6;
                }
                n8 = n4 & 0x20;
                if (n8 != 0) {
                    object7 = zp.c;
                    n8 = n20 & n24;
                } else {
                    n8 = n10;
                    object7 = zp$l;
                }
                object9 = zp.a;
                object5 = Ta3.a((b30_0)object8);
                n7 = ((j30_0)object8).J(object5) ? 1 : 0;
                object6 = ((j30_0)object8).v();
                if (n7 != 0 || object6 == object12) {
                    object6 = new nl0_0((vi0_0)object5);
                    ((j30_0)object8).o(object6);
                }
                object5 = object6;
                object5 = (nl0_0)object6;
                n7 = n8 &= n22;
                object4 = object5;
                bl4 = true;
                object5 = object7;
                object7 = object3;
                n16 = 0;
                object3 = null;
            }
            ((j30_0)object8).U();
            int n27 = n7 & 0xE;
            n20 = n7 >> 15 & 0x70;
            n27 |= n20;
            n20 = n7 >> 3;
            n17 = n20 & 0x380 | n27;
            n27 = n17 & 0xE ^ 6;
            n15 = 4;
            if (n27 > n15 && (n27 = (int)(((j30_0)object8).J(g11$a2) ? 1 : 0)) != 0 || (n27 = n17 & 6) == n15) {
                n15 = 1;
            } else {
                n15 = 0;
                Object var32_38 = null;
            }
            n27 = n17 & 0x70 ^ 0x30;
            n18 = 32;
            n18 = n27 > n18 && (n18 = (int)(((j30_0)object8).J(object9) ? 1 : 0)) != 0 ? 1 : 0;
            n15 |= n18;
            n18 = n17 & 0x380 ^ 0x180;
            n27 = 256;
            if (n18 > n27 && (n18 = (int)(((j30_0)object8).J(object2) ? 1 : 0)) != 0 || (n17 &= 0x180) == n27) {
                n17 = 1;
            } else {
                n17 = 0;
                object = null;
            }
            Object object13 = ((j30_0)object8).v();
            if ((n17 |= n15) != 0 || object13 == object12) {
                object = new bq1_1((mk2_0)object2, g11$a2, (zp$e)object9);
                l11_0 l11_02 = new l11_0((bq1_1)object);
                ((j30_0)object8).o(l11_02);
            }
            object6 = var32_41;
            object6 = (mr1_2)var32_41;
            n17 = n20 & 0xE | 0x30000;
            n15 = n7 & 0x1C00;
            n17 |= n15;
            n15 = 0xE000 & n7;
            n17 |= n15;
            n15 = 0x1C00000 & n20;
            n17 |= n15;
            n15 = n7 << 9;
            n18 = 0xE000000 & n15;
            n17 |= n18;
            n18 = 0x70000000;
            int n28 = n17 | (n15 &= n18);
            n17 = n7 >> 27;
            int n29 = n17 & 0xE;
            object12 = object7;
            void var48_60 = var19_24;
            object11 = object2;
            n22 = n16;
            object10 = object9;
            Yq1.a((LP1)object7, (qr1_0)var19_24, (mr1_2)object6, (mk2_0)object2, n16 != 0, (TR0)object4, bl4, (zp$l)object5, (zp$e)object9, function1, (b30_0)object8, n28, n29);
            void var32_42 = var19_24;
            n14 = n16;
            object3 = object7;
            object7 = object5;
            object9 = object4;
            object4 = object10;
        }
        CF2 cF2 = ((j30_0)object8).X();
        if (cF2 != null) {
            void var32_43;
            object = object6;
            g11$a2 = g11$a;
            object8 = object2;
            object2 = object9;
            object5 = function1;
            n18 = n3;
            cF2.d = object6 = new aq1_2(g11$a, (LP1)object3, (qr1_0)var32_43, (mk2_0)object8, n14 != 0, (zp$l)object7, (zp$e)object4, (TR0)object9, bl4, function1, n3, n4);
        }
    }
}

