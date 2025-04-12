/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class OA {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, Nc nc, boolean bl2, u10 u102, b30_0 b30_02, int n3, int n4) {
        Object object;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object2;
        int n16;
        Object object3;
        int n17;
        Object object4;
        Object object5;
        int n18;
        u10 u103;
        block21: {
            void var14_25;
            block20: {
                void var14_22;
                u103 = u102;
                n18 = n3;
                int n19 = 1781813501;
                object5 = b30_02;
                object4 = b30_02.g(n19);
                n17 = n4 & 1;
                if (n17 != 0) {
                    int n20;
                    int n21 = n20 = n3 | 6;
                    object3 = lP1;
                } else {
                    int n22 = n3 & 6;
                    if (n22 == 0) {
                        void var14_19;
                        object3 = lP1;
                        boolean bl3 = ((j30_0)object4).J(lP1);
                        if (bl3) {
                            int n24 = 4;
                        } else {
                            int n25 = 2;
                        }
                        int n26 = var14_19 | n18;
                    } else {
                        object3 = lP1;
                        int n27 = n3;
                    }
                }
                n16 = n4 & 2;
                if (n16 != 0) {
                    int n28 = var14_22 | 0x30;
                } else {
                    int n29 = n18 & 0x30;
                    if (n29 == 0) {
                        object2 = nc;
                        n15 = ((j30_0)object4).J(nc) ? 1 : 0;
                        n15 = n15 != 0 ? 32 : 16;
                    }
                }
                object2 = nc;
                break block20;
                int n30 = var14_22 | n15;
            }
            n15 = n4 & 4;
            if (n15 != 0) {
                int n32 = var14_25 | 0x180;
            } else {
                n14 = n18 & 0x180;
                if (!n14) {
                    n14 = bl2 ? 1 : 0;
                    n10 = ((j30_0)object4).a(bl2) ? 1 : 0;
                    n10 = n10 != 0 ? 256 : 128;
                }
            }
            n14 = bl2 ? 1 : 0;
            break block21;
            int n34 = var14_25 | n10;
        }
        n10 = n18 & 0xC00;
        int n35 = 2048;
        if (n10 == 0) {
            void var14_28;
            n10 = ((j30_0)object4).x(u103) ? 1 : 0;
            n10 = n10 != 0 ? 2048 : 1024;
            n8 = var14_28 | n10;
        }
        if ((n10 = n8 & 0x493) == (n7 = 1170) && (n10 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
            ((j30_0)object4).D();
            object5 = object3;
            object3 = object2;
        } else {
            object5 = n17 != 0 ? LP1$a.b : object3;
            object3 = n16 != 0 ? Nc$a.a : object2;
            n16 = 0;
            if (n15 != 0) {
                n14 = 0;
            }
            object2 = HA.e((Nc)object3, n14 != 0);
            n15 = n8 & 0x1C00;
            if (n15 == n35) {
                n15 = 1;
            } else {
                n15 = 0;
                object = null;
            }
            n10 = ((j30_0)object4).J(object2) ? 1 : 0;
            Object object6 = ((j30_0)object4).v();
            if ((n15 |= n10) != 0 || object6 == (object = b30$a.a)) {
                object6 = new ma_0((al1_1)object2, u103);
                ((j30_0)object4).o(object6);
            }
            object6 = (Function2)object6;
            int n36 = n8 & 0xE;
            tf3.a((LP1)object5, (Function2)object6, (b30_0)object4, n36, 0);
        }
        int n37 = n14;
        object2 = ((j30_0)object4).X();
        if (object2 != null) {
            object4 = object;
            u103 = u102;
            n18 = n3;
            n16 = n4;
            object = new na_0((LP1)object5, (Nc)object3, n14 != 0, u102, n3, n4);
            ((CF2)object2).d = object;
        }
    }
}

