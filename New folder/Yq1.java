/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference0Impl;

public final class Yq1 {
    /*
     * WARNING - void declaration
     */
    public static final void a(LP1 lP1, qr1_0 qr1_02, mr1_2 mr1_22, mk2_0 mk2_02, boolean bl2, TR0 tR0, boolean n3, zp$l zp$l, zp$e zp$e, Function1 function1, b30_0 b30_02, int n4, int n7) {
        Object object;
        Object object2;
        Object object3;
        int n8;
        int n10;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        LP1 lP12;
        block54: {
            Object object11;
            int n14;
            int n15;
            int n16;
            Object object12;
            Object object13;
            int n17;
            int n18;
            int n19;
            Object object14;
            qr1_0 qr1_03;
            block56: {
                block55: {
                    b30$a$a b30$a$a;
                    int n20;
                    void var33_54;
                    int n21;
                    int n24;
                    int n25;
                    int n26;
                    int n27;
                    boolean bl3;
                    block53: {
                        int n22;
                        int n28;
                        int n29;
                        lP12 = lP1;
                        qr1_03 = qr1_02;
                        object10 = mr1_22;
                        object9 = mk2_02;
                        bl3 = bl2;
                        object8 = zp$l;
                        object14 = zp$e;
                        object7 = function1;
                        n19 = n4;
                        object6 = b30_02;
                        object5 = b30_02.g(-649686062);
                        n27 = n4 & 6;
                        n26 = 2;
                        if (n27 == 0) {
                            n27 = (int)(((j30_0)object5).J(lP1) ? 1 : 0);
                            n27 = n27 != 0 ? 4 : 2;
                            n27 |= n19;
                        } else {
                            n27 = n4;
                        }
                        n18 = n19 & 0x30;
                        if (n18 == 0) {
                            n18 = (int)(((j30_0)object5).J(qr1_03) ? 1 : 0);
                            n18 = n18 != 0 ? 32 : 16;
                            n27 |= n18;
                        }
                        if ((n18 = n19 & 0x180) == 0) {
                            n18 = n19 & 0x200;
                            n18 = n18 == 0 ? (int)(((j30_0)object5).J(object10) ? 1 : 0) : (int)(((j30_0)object5).x(object10) ? 1 : 0);
                            n18 = n18 != 0 ? 256 : 128;
                            n27 |= n18;
                        }
                        if ((n18 = n19 & 0xC00) == 0) {
                            n18 = (int)(((j30_0)object5).J(object9) ? 1 : 0);
                            n18 = n18 != 0 ? 2048 : 1024;
                            n27 |= n18;
                        }
                        if ((n18 = n19 & 0x6000) == 0) {
                            n18 = (int)(((j30_0)object5).a(bl3) ? 1 : 0);
                            n18 = n18 != 0 ? 16384 : 8192;
                            n27 |= n18;
                        }
                        n25 = n19 & 0x30000;
                        n18 = 1;
                        if (n25 == 0) {
                            n25 = (int)(((j30_0)object5).a(n18 != 0) ? 1 : 0);
                            n25 = n25 != 0 ? 131072 : 65536;
                            n27 |= n25;
                        }
                        n25 = 0x180000;
                        int n282 = n19 & n25;
                        object4 = tR0;
                        if (n282 == 0) {
                            n24 = (int)(((j30_0)object5).J(tR0) ? 1 : 0);
                            n24 = n24 != 0 ? 0x100000 : 524288;
                            n27 |= n24;
                        }
                        n24 = 0xC00000;
                        int n292 = n19 & n24;
                        n17 = n3;
                        if (n292 == 0) {
                            void var33_36;
                            boolean n222 = ((j30_0)object5).a(n3 != 0);
                            if (n222) {
                                int n30 = 0x800000;
                            } else {
                                int n32 = 0x400000;
                            }
                            n27 |= var33_36;
                        }
                        if ((n29 = n19 & 0x6000000) == 0) {
                            void var33_41;
                            boolean bl4 = ((j30_0)object5).J(object8);
                            if (bl4) {
                                int n34 = 0x4000000;
                            } else {
                                int n35 = 0x2000000;
                            }
                            n27 |= var33_41;
                        }
                        if ((n28 = n19 & 0x30000000) == 0) {
                            void var33_46;
                            boolean bl5 = ((j30_0)object5).J(object14);
                            if (bl5) {
                                int n36 = 0x20000000;
                            } else {
                                int n37 = 0x10000000;
                            }
                            n27 |= var33_46;
                        }
                        if ((n22 = n7 & 6) == 0) {
                            void var33_51;
                            boolean bl6 = ((j30_0)object5).x(object7);
                            if (bl6) {
                                int n38 = 4;
                            } else {
                                int n39 = 2;
                            }
                            int n41 = n7 | var33_51;
                        } else {
                            int n42 = n7;
                        }
                        n21 = 306783379;
                        n10 = n27 & n21;
                        n8 = 306783378;
                        if (n10 != n8 || (n10 = var33_54 & 3) != n26 || (n26 = (int)(((j30_0)object5).h() ? 1 : 0)) == 0) break block53;
                        ((j30_0)object5).D();
                        object10 = object5;
                        break block54;
                    }
                    ((j30_0)object5).r0();
                    n26 = n19 & 1;
                    object13 = b30$a.a;
                    if (n26 != 0 && (n26 = (int)(((j30_0)object5).c0() ? 1 : 0)) == 0) {
                        ((j30_0)object5).D();
                    }
                    ((j30_0)object5).U();
                    n10 = n27 >> 3;
                    int n43 = n10 & 0xE;
                    n26 = var33_54 << 3 & 0x70;
                    n26 = n43 | n26;
                    object4 = J83.j(object7, (b30_0)object5);
                    n17 = n26 & 0xE ^ 6;
                    boolean bl7 = false;
                    n19 = 4;
                    if (n17 > n19 && (n17 = (int)(((j30_0)object5).J(qr1_03) ? 1 : 0)) != 0 || (n26 &= 6) == n19) {
                        n26 = 1;
                    } else {
                        n26 = 0;
                        object6 = null;
                    }
                    object3 = ((j30_0)object5).v();
                    if (n26 != 0 || object3 == object13) {
                        J83.i();
                        object6 = vf_1.b;
                        object3 = new nq1_1((tr1_0)object4);
                        object4 = J83.d((I83)object6, (Function0)object3);
                        J83.i();
                        object3 = new oq1_2((mp0)object4, qr1_03);
                        mp0 mp02 = J83.d((I83)object6, (Function0)object3);
                        Class<ib3_0> clazz = ib3_0.class;
                        String string2 = "value";
                        String string3 = "getValue()Ljava/lang/Object;";
                        object12 = object3;
                        object3 = new PropertyReference0Impl((Object)mp02, clazz, string2, string3, 0);
                        ((j30_0)object5).o(object3);
                    }
                    object12 = object3;
                    object12 = (hn1_2)object3;
                    n26 = n27 >> 9;
                    n18 = n26 & 0x70;
                    n17 = (n18 = n43 | n18) & 0xE ^ 6;
                    n19 = 4;
                    if (n17 > n19 && (n17 = (int)(((j30_0)object5).J(qr1_03) ? 1 : 0)) != 0 || (n17 = n18 & 6) == n19) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    n21 = n18 & 0x70;
                    n19 = n21 ^ 0x30;
                    n16 = 32;
                    if (n19 > n16 && (n19 = (int)(((j30_0)object5).a(bl3) ? 1 : 0)) != 0 || (n18 &= 0x30) == n16) {
                        n18 = 1;
                    } else {
                        n18 = 0;
                        object4 = null;
                    }
                    object3 = ((j30_0)object5).v();
                    if ((n18 |= n17) != 0 || object3 == object13) {
                        object3 = new bt1_0(qr1_03);
                        ((j30_0)object5).o(object3);
                    }
                    Object object15 = object3;
                    object15 = (bt1_0)object3;
                    object4 = ((j30_0)object5).v();
                    if (object4 == object13) {
                        object4 = Qx2.a(ly0_0.f(kotlin.coroutines.f.a, (b30_0)object5), (j30_0)object5);
                    }
                    object4 = ((Q30)object4).a;
                    object3 = O30.e;
                    object7 = object3 = ((j30_0)object5).j((H30)object3);
                    object7 = (T01)object3;
                    n27 &= 0x7FFF0;
                    n15 = 0x380000;
                    n27 |= (n26 &= n15);
                    n26 = 0x1C00000;
                    n17 = n10 & n26;
                    n19 = 32;
                    if ((n17 = (n27 |= n17) & 0x70 ^ 0x30) > n19 && (n17 = (int)(((j30_0)object5).J(qr1_03) ? 1 : 0)) != 0 || (n17 = n27 & 0x30) == n19) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    n19 = n27 & 0x380 ^ 0x180;
                    n26 = 256;
                    if (n19 > n26 && (n19 = (int)(((j30_0)object5).J(object10) ? 1 : 0)) != 0 || (n19 = n27 & 0x180) == n26) {
                        n26 = 1;
                    } else {
                        n26 = 0;
                        object6 = null;
                    }
                    n26 |= n17;
                    n17 = n27 & 0x1C00 ^ 0xC00;
                    n19 = 2048;
                    if (n17 > n19 && (n17 = (int)(((j30_0)object5).J(object9) ? 1 : 0)) != 0 || (n17 = n27 & 0xC00) == n19) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    n26 |= n17;
                    n17 = 0xE000 & n27 ^ 0x6000;
                    n19 = 16384;
                    if (n17 > n19 && (n17 = (int)(((j30_0)object5).a(bl3) ? 1 : 0)) != 0 || (n17 = n27 & 0x6000) == n19) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    n26 |= n17;
                    n17 = 0x70000 & n27 ^ 0x30000;
                    n19 = 131072;
                    if (n17 > n19 && (n20 = (int)(((j30_0)object5).a((n17 = 1) != 0) ? 1 : 0)) != 0 || (n17 = n27 & (n20 = 196608)) == n19) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    n26 |= n17;
                    n17 = n27 & n15 ^ n25;
                    n19 = 0x100000;
                    if (n17 > n19 && (n17 = (int)(((j30_0)object5).J(object14) ? 1 : 0)) != 0 || (n17 = n27 & n25) == n19) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    n26 |= n17;
                    n17 = 0x1C00000 & n27 ^ n24;
                    n19 = 0x800000;
                    if (n17 > n19 && (n17 = (int)(((j30_0)object5).J(object8) ? 1 : 0)) != 0 || (n27 &= n24) == n19) {
                        n27 = 1;
                    } else {
                        n27 = 0;
                        object2 = null;
                    }
                    n27 |= n26;
                    n26 = (int)(((j30_0)object5).J(object7) ? 1 : 0);
                    object6 = ((j30_0)object5).v();
                    if ((n27 |= n26) == 0 && object6 != object13) {
                        n14 = n10;
                        b30$a$a = object13;
                        object10 = object5;
                        n25 = 1;
                    } else {
                        Object object16 = object4;
                        object16 = (c80)object4;
                        object2 = object;
                        object6 = qr1_02;
                        n25 = 1;
                        object4 = mk2_02;
                        n17 = n10;
                        n10 = (int)(bl2 ? 1 : 0);
                        n14 = n17;
                        object3 = object12;
                        b30$a$a = object13;
                        object13 = mr1_22;
                        object10 = object5;
                        object5 = zp$l;
                        object9 = object;
                        object = zp$e;
                        Object object17 = object7;
                        object7 = object16;
                        object14 = object17;
                        ((xq1_1)object2)(qr1_02, mk2_02, bl2, (hn1_2)object12, mr1_22, zp$l, zp$e, (c80)object16, (T01)object17);
                        ((j30_0)object10).o(object2);
                        object6 = object2;
                    }
                    object9 = object6;
                    object9 = (Function2)object6;
                    object14 = pg2_0.Vertical;
                    object2 = qr1_03.i;
                    object2 = lP12.then((LP1)object2);
                    object6 = qr1_03.j;
                    object2 = object2.then((LP1)object6);
                    object6 = object12;
                    object4 = object15;
                    object11 = object14;
                    n17 = n3;
                    n8 = (int)(bl2 ? 1 : 0);
                    object2 = f.a((LP1)object2, (hn1_2)object12, (zs1_0)object15, (pg2_0)((Object)object14), n3 != 0, bl2);
                    n26 = n43 ^ 6;
                    n18 = 4;
                    if (n26 > n18 && (n26 = (int)(((j30_0)object10).J(qr1_03) ? 1 : 0)) != 0 || (n26 = n14 & 6) == n18) {
                        n18 = 1;
                    } else {
                        n18 = 0;
                        object4 = null;
                    }
                    object6 = ((j30_0)object10).v();
                    if (n18 != 0) break block55;
                    object4 = b30$a$a;
                    if (object6 != b30$a$a) break block56;
                }
                object6 = new zq1_1(qr1_03);
                ((j30_0)object10).o(object6);
            }
            object6 = (zq1_1)object6;
            object4 = O30.l;
            object3 = object4 = ((j30_0)object10).j((H30)object4);
            object3 = (bp1_0)((Object)object4);
            n18 = n14 & 0x1C00 | 0x200;
            n16 = n18 | (n14 &= n15);
            object4 = qr1_03.l;
            n10 = (int)(bl2 ? 1 : 0);
            object13 = object14;
            object = object10;
            object8 = Dr1.a((LP1)object2, (Er1)object6, (Br1)object4, bl2, (bp1_0)((Object)object3), (pg2_0)((Object)object14), n3 != 0, (b30_0)object10, n16);
            object2 = qr1_03.k.k;
            object2 = object8.then((LP1)object2);
            n14 = 64;
            n19 = 0;
            object = null;
            object5 = qr1_03.d;
            object6 = qr1_02;
            object4 = object14;
            n10 = n3;
            n17 = (int)(bl2 ? 1 : 0);
            object13 = tR0;
            object7 = object10;
            object4 = hU2.a((LP1)object2, qr1_02, (pg2_0)((Object)object14), n3 != 0, bl2, tR0, (wr1_1)object5, null, (b30_0)object10, n14);
            object5 = null;
            object11 = qr1_03.m;
            object6 = object12;
            object3 = object9;
            object13 = object10;
            ds1_0.a((hn1_2)object12, (LP1)object4, (xs1)object11, (Function2)object9, (b30_0)object10, 0);
        }
        object10 = ((j30_0)object10).X();
        if (object10 != null) {
            object8 = object9;
            lP12 = lP1;
            object2 = qr1_02;
            object6 = mr1_22;
            object4 = mk2_02;
            n10 = (int)(bl2 ? 1 : 0);
            object3 = tR0;
            n8 = n3;
            object5 = zp$l;
            object = zp$e;
            object7 = function1;
            ((CF2)object10).d = object9 = new sq1_1(lP1, qr1_02, mr1_22, mk2_02, bl2, tR0, n3 != 0, zp$l, zp$e, function1, n4, n7);
        }
    }
}

