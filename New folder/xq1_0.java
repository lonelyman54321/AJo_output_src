/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from xq1
 */
public final class xq1_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, ft1_2 ft1_22, mk2_0 mk2_02, boolean bl2, zp$l zp$l, Nc$b nc$b, TR0 tR0, boolean bl3, Function1 function1, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n7;
        int n8;
        Object object5;
        Object object6;
        float f5;
        int n10;
        Object object7;
        int n14;
        Object object8;
        int n15;
        int n16;
        int n17;
        Object object9;
        Object object10;
        int n18;
        block31: {
            block27: {
                block30: {
                    block29: {
                        block28: {
                            int n19;
                            block26: {
                                block25: {
                                    block21: {
                                        block24: {
                                            block23: {
                                                block22: {
                                                    n18 = n3;
                                                    int n20 = -740714857;
                                                    object10 = b30_02;
                                                    object9 = b30_02.g(n20);
                                                    n17 = n4 & 1;
                                                    if (n17 != 0) {
                                                        n15 = n16 = n3 | 6;
                                                        object8 = lP1;
                                                    } else {
                                                        n16 = n3 & 6;
                                                        if (n16 == 0) {
                                                            object8 = lP1;
                                                            n15 = (int)(((j30_0)object9).J(lP1) ? 1 : 0);
                                                            n15 = n15 != 0 ? 4 : 2;
                                                            n15 |= n18;
                                                        } else {
                                                            object8 = lP1;
                                                            n15 = n3;
                                                        }
                                                    }
                                                    n14 = n18 & 0x30;
                                                    if (n14 != 0) break block21;
                                                    n14 = n4 & 2;
                                                    if (n14 != 0) break block22;
                                                    object7 = ft1_22;
                                                    n10 = (int)(((j30_0)object9).J(ft1_22) ? 1 : 0);
                                                    if (n10 == 0) break block23;
                                                    n10 = 32;
                                                    f5 = 4.5E-44f;
                                                    break block24;
                                                }
                                                object7 = ft1_22;
                                            }
                                            n10 = 16;
                                            f5 = 2.2E-44f;
                                        }
                                        n15 |= n10;
                                        break block25;
                                    }
                                    object7 = ft1_22;
                                }
                                n10 = n4 & 4;
                                if (n10 != 0) {
                                    n15 |= 0x180;
                                } else {
                                    int n21 = n18 & 0x180;
                                    if (n21 == 0) {
                                        object6 = mk2_02;
                                        n19 = ((j30_0)object9).J(mk2_02);
                                        n19 = n19 != 0 ? 256 : 128;
                                    }
                                }
                                object6 = mk2_02;
                                break block26;
                                n15 |= n19;
                            }
                            n15 |= 0xC00;
                            n19 = n18 & 0x6000;
                            if (n19 != 0) break block27;
                            n19 = n4 & 0x10;
                            if (n19 != 0) break block28;
                            object5 = zp$l;
                            n8 = (int)(((j30_0)object9).J(zp$l) ? 1 : 0);
                            if (n8 == 0) break block29;
                            n8 = 16384;
                            break block30;
                        }
                        object5 = zp$l;
                    }
                    n8 = 8192;
                }
                n15 |= n8;
                break block31;
            }
            object5 = zp$l;
        }
        n8 = 0x30000 | n15;
        int n22 = 0x180000 & n18;
        if (n22 == 0) {
            n8 = 0xB0000 | n15;
        }
        n15 = 0xC00000 | n8;
        n8 = 0x6000000 & n18;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object9).x(function1) ? 1 : 0);
            n8 = n8 != 0 ? 0x4000000 : 0x2000000;
            n15 |= n8;
        }
        if ((n8 = 0x2492493 & n15) == (n7 = 0x2492492) && (n8 = (int)(((j30_0)object9).h() ? 1 : 0)) != 0) {
            ((j30_0)object9).D();
            n8 = (int)(bl3 ? 1 : 0);
            object10 = object8;
            object8 = object7;
            object4 = object6;
            object3 = object5;
            n14 = (int)(bl2 ? 1 : 0);
            object6 = nc$b;
            object5 = tR0;
        } else {
            Object object11;
            ((j30_0)object9).r0();
            n8 = n18 & 1;
            n7 = -3670017;
            int n24 = -57345;
            if (n8 != 0 && (n8 = (int)(((j30_0)object9).c0() ? 1 : 0)) == 0) {
                ((j30_0)object9).D();
                n17 = n4 & 2;
                if (n17 != 0) {
                    n15 &= 0xFFFFFF8F;
                }
                if ((n17 = n4 & 0x10) != 0) {
                    n15 &= n24;
                }
                n17 = n15 & n7;
                object11 = tR0;
                n15 = (int)(bl3 ? 1 : 0);
                n7 = n17;
                object10 = object8;
                object3 = object5;
                n16 = (int)(bl2 ? 1 : 0);
                object5 = nc$b;
            } else {
                object10 = n17 != 0 ? LP1$a.b : object8;
                n16 = n4 & 2;
                if (n16 != 0) {
                    object8 = jt1.a((b30_0)object9);
                    n15 &= 0xFFFFFF8F;
                    object7 = object8;
                }
                n16 = 0;
                object8 = null;
                if (n10 != 0) {
                    f5 = 0.0f;
                    object6 = new nk2_0(f5, f5, f5, f5);
                }
                if ((n10 = n4 & 0x10) != 0) {
                    object3 = zp.c;
                    n15 &= n24;
                } else {
                    object3 = object5;
                }
                object5 = Nc$a.m;
                object11 = Ta3.a((b30_0)object9);
                n24 = (int)(((j30_0)object9).J(object11) ? 1 : 0);
                object2 = ((j30_0)object9).v();
                if (n24 != 0 || object2 == (object = b30$a.a)) {
                    object2 = new nl0_0((vi0_0)object11);
                    ((j30_0)object9).o(object2);
                }
                object11 = object2;
                object11 = (nl0_0)object2;
                n7 = n15 & n7;
                n15 = 1;
            }
            ((j30_0)object9).U();
            n24 = n7 & 0xE | 0x6000;
            int n25 = n7 & 0x70;
            n24 |= n25;
            n25 = n7 & 0x380;
            n24 |= n25;
            n25 = n7 & 0x1C00;
            n24 |= n25;
            n25 = n7 >> 3 & 0x380000;
            n24 |= n25;
            n25 = n7 << 9 & 0xE000000;
            n24 |= n25;
            n25 = n7 << 15 & 0x70000000;
            int n26 = n24 | n25;
            n7 = n7 >> 18 & 0x380;
            boolean bl4 = true;
            int n27 = 3200;
            object = object7;
            object2 = object6;
            Ps1.a((LP1)object10, (ft1_2)object7, (mk2_0)object6, n16 != 0, bl4, (TR0)object11, n15 != 0, 0, (Nc$b)object5, (zp$l)object3, null, null, function1, (b30_0)object9, n26, n7, n27);
            n14 = n16;
            object8 = object7;
            n8 = n15;
            object4 = object6;
            object6 = object5;
            object5 = object11;
        }
        object = ((j30_0)object9).X();
        if (object != null) {
            object9 = object2;
            n18 = n3;
            n7 = n4;
            ((CF2)object).d = object2 = new xq1$a((LP1)object10, (ft1_2)object8, (mk2_0)object4, n14 != 0, (zp$l)object3, (Nc$b)object6, (TR0)object5, n8 != 0, function1, n3, n4);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(LP1 lP1, ft1_2 ft1_22, mk2_0 mk2_02, boolean bl2, zp$e zp$e, Nc$c nc$c, TR0 tR0, boolean bl3, Function1 function1, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n7;
        int n8;
        Object object5;
        int n10;
        Object object6;
        Object object7;
        float f5;
        int n14;
        Object object8;
        int n15;
        Object object9;
        int n16;
        int n17;
        int n18;
        Object object10;
        Object object11;
        int n19;
        block35: {
            block34: {
                block30: {
                    void var28_31;
                    block33: {
                        block32: {
                            block31: {
                                int n20;
                                block29: {
                                    block28: {
                                        block24: {
                                            block27: {
                                                block26: {
                                                    block25: {
                                                        n19 = n3;
                                                        int n21 = -1724297413;
                                                        object11 = b30_02;
                                                        object10 = b30_02.g(n21);
                                                        n18 = n4 & 1;
                                                        if (n18 != 0) {
                                                            n16 = n17 = n3 | 6;
                                                            object9 = lP1;
                                                        } else {
                                                            n17 = n3 & 6;
                                                            if (n17 == 0) {
                                                                object9 = lP1;
                                                                n16 = (int)(((j30_0)object10).J(lP1) ? 1 : 0);
                                                                n16 = n16 != 0 ? 4 : 2;
                                                                n16 |= n19;
                                                            } else {
                                                                object9 = lP1;
                                                                n16 = n3;
                                                            }
                                                        }
                                                        n15 = n19 & 0x30;
                                                        if (n15 != 0) break block24;
                                                        n15 = n4 & 2;
                                                        if (n15 != 0) break block25;
                                                        object8 = ft1_22;
                                                        n14 = (int)(((j30_0)object10).J(ft1_22) ? 1 : 0);
                                                        if (n14 == 0) break block26;
                                                        n14 = 32;
                                                        f5 = 4.5E-44f;
                                                        break block27;
                                                    }
                                                    object8 = ft1_22;
                                                }
                                                n14 = 16;
                                                f5 = 2.2E-44f;
                                            }
                                            n16 |= n14;
                                            break block28;
                                        }
                                        object8 = ft1_22;
                                    }
                                    n14 = n4 & 4;
                                    if (n14 != 0) {
                                        n16 |= 0x180;
                                    } else {
                                        int n22 = n19 & 0x180;
                                        if (n22 == 0) {
                                            object7 = mk2_02;
                                            n20 = ((j30_0)object10).J(mk2_02);
                                            n20 = n20 != 0 ? 256 : 128;
                                        }
                                    }
                                    object7 = mk2_02;
                                    break block29;
                                    n16 |= n20;
                                }
                                n16 |= 0xC00;
                                n20 = n19 & 0x6000;
                                if (n20 != 0) break block30;
                                n20 = n4 & 0x10;
                                if (n20 != 0) break block31;
                                object6 = zp$e;
                                boolean bl4 = ((j30_0)object10).J(zp$e);
                                if (!bl4) break block32;
                                int n24 = 16384;
                                break block33;
                            }
                            object6 = zp$e;
                        }
                        int n25 = 8192;
                    }
                    n16 |= var28_31;
                    break block34;
                }
                object6 = zp$e;
            }
            n10 = n4 & 0x20;
            int n26 = 196608;
            if (n10 != 0) {
                n16 |= n26;
            } else {
                int n27 = n26 & n19;
                if (n27 == 0) {
                    object5 = nc$c;
                    n8 = (int)(((j30_0)object10).J(nc$c) ? 1 : 0);
                    n8 = n8 != 0 ? 131072 : 65536;
                }
            }
            object5 = nc$c;
            break block35;
            n16 |= n8;
        }
        n8 = 0x180000 & n19;
        if (n8 == 0) {
            n8 = 524288;
            n16 |= n8;
        }
        n16 |= 0xC00000;
        n8 = 0x6000000 & n19;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object10).x(function1) ? 1 : 0);
            n8 = n8 != 0 ? 0x4000000 : 0x2000000;
            n16 |= n8;
        }
        if ((n8 = 0x2492493 & n16) == (n7 = 0x2492492) && (n8 = (int)(((j30_0)object10).h() ? 1 : 0)) != 0) {
            ((j30_0)object10).D();
            boolean bl5 = bl3;
            object11 = object9;
            object9 = object8;
            object4 = object7;
            object3 = object6;
            object7 = object5;
            n15 = (int)(bl2 ? 1 : 0);
            object6 = tR0;
        } else {
            void var29_41;
            Object object12;
            Object object13;
            ((j30_0)object10).r0();
            n8 = n19 & 1;
            n7 = -3670017;
            int n28 = -57345;
            if (n8 != 0 && (n8 = (int)(((j30_0)object10).c0() ? 1 : 0)) == 0) {
                ((j30_0)object10).D();
                n18 = n4 & 2;
                if (n18 != 0) {
                    n16 &= 0xFFFFFF8F;
                }
                if ((n18 = n4 & 0x10) != 0) {
                    n16 &= n28;
                }
                n18 = n16 & n7;
                object13 = tR0;
                n16 = n18;
                object11 = object9;
                object3 = object6;
                object6 = object5;
                n17 = (int)(bl2 ? 1 : 0);
                boolean bl6 = bl3;
            } else {
                object11 = n18 != 0 ? LP1$a.b : object9;
                n17 = n4 & 2;
                if (n17 != 0) {
                    object9 = jt1.a((b30_0)object10);
                    n16 &= 0xFFFFFF8F;
                    object8 = object9;
                }
                n17 = 0;
                object9 = null;
                if (n14 != 0) {
                    f5 = 0.0f;
                    object7 = new nk2_0(f5, f5, f5, f5);
                }
                if ((n14 = n4 & 0x10) != 0) {
                    object3 = zp.a;
                    n16 &= n28;
                } else {
                    object3 = object6;
                }
                object6 = n10 != 0 ? Nc$a.j : object5;
                object13 = Ta3.a((b30_0)object10);
                boolean bl7 = ((j30_0)object10).J(object13);
                object12 = ((j30_0)object10).v();
                if (bl7 || object12 == (object5 = b30$a.a)) {
                    object12 = new nl0_0((vi0_0)object13);
                    ((j30_0)object10).o(object12);
                }
                object13 = object12;
                object13 = (nl0_0)object12;
                n16 &= n7;
                boolean bl8 = true;
            }
            ((j30_0)object10).U();
            n8 = n16 & 0xE | 0x6000;
            n7 = n16 & 0x70;
            n8 |= n7;
            n7 = n16 & 0x380;
            n8 |= n7;
            n7 = n16 & 0x1C00;
            n8 |= n7;
            n7 = n16 >> 3;
            n28 = 0x380000;
            int n29 = n8 | (n7 &= n28);
            n8 = n16 >> 15 & 0xE;
            n7 = n16 >> 9 & 0x70;
            n16 = n16 >> 18 & 0x380;
            int n30 = (n8 |= n7) | n16;
            int n32 = 896;
            object12 = object11;
            object2 = object8;
            object = object7;
            Ps1.a((LP1)object11, (ft1_2)object8, (mk2_0)object7, n17 != 0, false, (TR0)object13, (boolean)var29_41, 0, null, null, (Nc$c)object6, (zp$e)object3, function1, (b30_0)object10, n29, n30, n32);
            object4 = object7;
            object7 = object6;
            object6 = object13;
            void var28_34 = var29_41;
            n15 = n17;
            object9 = object8;
        }
        object2 = ((j30_0)object10).X();
        if (object2 != null) {
            void var28_35;
            object10 = object;
            object5 = function1;
            n19 = n3;
            n8 = n4;
            object = new xq1$b((LP1)object11, (ft1_2)object9, (mk2_0)object4, n15 != 0, (zp$e)object3, (Nc$c)object7, (TR0)object6, (boolean)var28_35, function1, n3, n4);
            ((CF2)object2).d = object;
        }
    }
}

