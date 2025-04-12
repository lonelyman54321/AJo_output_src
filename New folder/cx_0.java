/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from cx
 */
public final class cx_0 {
    static {
        float f5 = 40;
        zs0_1.c(f5, f5);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(String string2, Function1 function1, LP1 lP1, boolean bl2, boolean n3, xm3 xm32, yo1_0 yo1_02, wo1_0 wo1_02, boolean n4, int n7, int n8, EE3 eE3, Function1 function12, wr1_1 wr1_12, ZD object, gx0_2 object2, b30_0 b30_02, int n10, int n14, int n15) {
        u10 u102;
        Object object3;
        Object object4;
        Object object5;
        void var12_15;
        Object object6;
        Object object7;
        void var15_18;
        int n16;
        wo1_0 wo1_03;
        void var13_16;
        int n17;
        void var11_14;
        int n18;
        void var9_12;
        int n19;
        int n20;
        int n21;
        Object object8;
        void var7_10;
        int n22;
        Object object9;
        void var6_9;
        int n24;
        int n25;
        ql3_0 ql3_02;
        void var5_8;
        int n26;
        int n27;
        int n28;
        int n29;
        int n30;
        int n32;
        Object object10;
        int n34;
        int n35;
        int n36;
        int n37;
        Object object11;
        Object object12;
        int n38;
        int n39;
        int n41;
        int n42;
        int n43;
        void var24_27;
        void var19_22;
        int n44;
        void var18_21;
        int bl3;
        void var17_20;
        Function1 function13;
        Object object13;
        block78: {
            int n45;
            int n46;
            block77: {
                block73: {
                    block76: {
                        block75: {
                            block74: {
                                block72: {
                                    block71: {
                                        void var16_19;
                                        object13 = string2;
                                        function13 = function1;
                                        bl3 = var17_20;
                                        n44 = var18_21;
                                        var24_27 = var19_22;
                                        n43 = 128;
                                        n42 = 256;
                                        n41 = 16;
                                        n39 = 32;
                                        n38 = 6;
                                        int n47 = 945255183;
                                        object12 = var16_19;
                                        object11 = var16_19.g(n47);
                                        n37 = var17_20 & 6;
                                        n36 = 2;
                                        if (n37 == 0) {
                                            n37 = (int)(((j30_0)object11).J(string2) ? 1 : 0);
                                            n37 = n37 != 0 ? 4 : 2;
                                            n37 |= bl3;
                                        } else {
                                            n37 = var17_20;
                                        }
                                        n35 = bl3 & 0x30;
                                        if (n35 == 0) {
                                            n35 = (int)(((j30_0)object11).x(function13) ? 1 : 0);
                                            n35 = n35 != 0 ? 32 : 16;
                                            n37 |= n35;
                                        }
                                        if ((n34 = bl3 & 0x180) == 0) {
                                            object10 = lP1;
                                            n35 = (int)(((j30_0)object11).J(lP1) ? 1 : 0);
                                            n35 = n35 != 0 ? 256 : 128;
                                            n37 |= n35;
                                        } else {
                                            object10 = lP1;
                                        }
                                        n35 = var24_27 & 8;
                                        if (n35 != 0) {
                                            n37 |= 0xC00;
                                        } else {
                                            n32 = bl3 & 0xC00;
                                            if (n32 == 0) {
                                                n32 = (int)(bl2 ? 1 : 0);
                                                n30 = (int)(((j30_0)object11).a(bl2) ? 1 : 0);
                                                n30 = n30 != 0 ? 2048 : 1024;
                                            }
                                        }
                                        n32 = (int)(bl2 ? 1 : 0);
                                        break block71;
                                        n37 |= n30;
                                    }
                                    n30 = var24_27 & 0x10;
                                    if (n30 != 0) {
                                        n37 |= 0x6000;
                                    } else {
                                        n41 = bl3 & 0x6000;
                                        if (n41 == 0) {
                                            n41 = n29;
                                            n28 = (int)(((j30_0)object11).a(n29 != 0) ? 1 : 0);
                                            n28 = n28 != 0 ? 16384 : 8192;
                                        }
                                    }
                                    n41 = n29;
                                    break block72;
                                    n37 |= n28;
                                }
                                n28 = var24_27 & 0x20;
                                n27 = 65536;
                                int n48 = 131072;
                                n26 = 196608;
                                if (n28 != 0) {
                                    n37 |= n26;
                                    ql3_02 = var5_8;
                                } else {
                                    n25 = bl3 & n26;
                                    ql3_02 = var5_8;
                                    if (n25 == 0) {
                                        n24 = (int)(((j30_0)object11).J(var5_8) ? 1 : 0);
                                        n24 = n24 != 0 ? 131072 : 65536;
                                        n37 |= n24;
                                    }
                                }
                                n24 = var24_27 & 0x40;
                                n46 = 0x180000;
                                if (n24 != 0) {
                                    n37 |= n46;
                                    object9 = var6_9;
                                } else {
                                    n46 = bl3 & n46;
                                    object9 = var6_9;
                                    if (n46 == 0) {
                                        n22 = ((j30_0)object11).J(var6_9);
                                        n22 = n22 != 0 ? 0x100000 : 524288;
                                        n37 |= n22;
                                    }
                                }
                                n22 = 0xC00000;
                                if ((n43 &= var24_27) != 0) {
                                    n37 |= n22;
                                    object8 = var7_10;
                                } else {
                                    n22 = bl3 & n22;
                                    object8 = var7_10;
                                    if (n22 == 0) {
                                        n21 = ((j30_0)object11).J(var7_10);
                                        n21 = n21 != 0 ? 0x800000 : 0x400000;
                                        n37 |= n21;
                                    }
                                }
                                n21 = 0x6000000;
                                if ((n42 &= var24_27) != 0) {
                                    n37 |= n21;
                                    n19 = n20;
                                } else {
                                    n21 = bl3 & n21;
                                    n19 = n20;
                                    if (n21 == 0) {
                                        n45 = (int)(((j30_0)object11).a(n20 != 0) ? 1 : 0);
                                        n45 = n45 != 0 ? 0x4000000 : 0x2000000;
                                        n37 |= n45;
                                    }
                                }
                                n45 = bl3 & 0x30000000;
                                if (n45 != 0) break block73;
                                n38 = var24_27 & 0x200;
                                if (n38 != 0) break block74;
                                n38 = var9_12;
                                n45 = (int)(((j30_0)object11).c((int)var9_12) ? 1 : 0);
                                if (n45 == 0) break block75;
                                n45 = 0x20000000;
                                break block76;
                            }
                            n38 = var9_12;
                        }
                        n45 = 0x10000000;
                    }
                    n37 |= n45;
                    break block77;
                }
                n38 = var9_12;
            }
            n38 = 1024;
            n32 = var24_27 & 0x400;
            n22 = 6;
            if (n32 != 0) {
                n36 = n44 | 6;
            } else {
                n21 = n44 & 6;
                n38 = n18;
                if (n21 == 0) {
                    n45 = (int)(((j30_0)object11).c(n18) ? 1 : 0);
                    if (n45 != 0) {
                        n36 = 4;
                    }
                    n36 = n44 | n36;
                } else {
                    n36 = n44;
                }
            }
            n38 = 2048;
            n34 = var24_27 & 0x800;
            if (n34 != 0) {
                n36 |= 0x30;
            } else {
                n46 = n44 & 0x30;
                object8 = var11_14;
                if (n46 == 0) {
                    n45 = (int)(((j30_0)object11).J(var11_14) ? 1 : 0);
                    int n49 = n45 != 0 ? 32 : 16;
                    n36 |= n49;
                }
            }
            n38 = n36;
            n19 = n36 | 0x180;
            n17 = 8192;
            n41 = var24_27 & 0x2000;
            if (n41 != 0) {
                n19 = n36 | 0xD80;
            } else {
                n38 = n44 & 0xC00;
                if (n38 == 0) {
                    object8 = var13_16;
                    n36 = (int)(((j30_0)object11).J(var13_16) ? 1 : 0);
                    n46 = n36 != 0 ? 2048 : 1024;
                    n19 |= n46;
                } else {
                    object8 = var13_16;
                }
            }
            n17 = 16384;
            n38 = var24_27 & 0x4000;
            if (n38 != 0) {
                n19 |= 0x6000;
            } else {
                n17 = n44 & 0x6000;
                if (n17 == 0) {
                    object9 = wo1_03;
                    n36 = (int)(((j30_0)object11).J(wo1_03) ? 1 : 0);
                    n16 = n36 != 0 ? 16384 : 8192;
                }
            }
            object9 = wo1_03;
            break block78;
            n19 |= n16;
        }
        n16 = var24_27 & 0x8000;
        if (n16 != 0) {
            n19 |= n26;
            object9 = var15_18;
        } else {
            n36 = n44 & n26;
            object9 = var15_18;
            if (n36 == 0) {
                n36 = (int)(((j30_0)object11).x(var15_18) ? 1 : 0);
                if (n36 != 0) {
                    n27 = 131072;
                }
                n19 |= n27;
            }
        }
        n36 = 306783379;
        n17 = n37 & n36;
        n39 = 306783378;
        if (n17 == n39 && (n17 = 0x12493 & n19) == (n39 = 74898) && (n17 = (int)(((j30_0)object11).h() ? 1 : 0)) != 0) {
            ((j30_0)object11).D();
            n32 = (int)(bl2 ? 1 : 0);
            n34 = n29;
            object7 = var5_8;
            object9 = var6_9;
            object6 = var7_10;
            n42 = n20;
            n41 = var9_12;
            n39 = n18;
            object12 = var11_14;
            object5 = var12_15;
            object4 = var13_16;
            object3 = wo1_03;
            u102 = var15_18;
        } else {
            int n50;
            long l2;
            Object object14;
            Object object15;
            Object object16;
            Object object17;
            u10 u103;
            Object object18;
            Object object19;
            cx$a cx$a;
            Object object20;
            ((j30_0)object11).r0();
            n17 = 1;
            n39 = bl3 & 1;
            if (n39 != 0 && (n39 = (int)(((j30_0)object11).c0() ? 1 : 0)) == 0) {
                ((j30_0)object11).D();
                n38 = var24_27 & 0x200;
                if (n38 != 0) {
                    n38 = -1879048193;
                    n37 &= n38;
                }
                n39 = (int)(bl2 ? 1 : 0);
                n38 = n29;
                object20 = var5_8;
                object10 = var6_9;
                object6 = var7_10;
                n42 = n20;
                n41 = n18;
                cx$a = var12_15;
                object19 = var13_16;
                object18 = wo1_03;
                u103 = var15_18;
                n17 = n37;
                n18 = var9_12;
                object12 = var11_14;
            } else {
                void var3_6;
                Object object21;
                n39 = n35 != 0 ? 1 : (int)(bl2 ? 1 : 0);
                n35 = n30 != 0 ? 0 : n29;
                object17 = n28 != 0 ? xm3.d : var5_8;
                object16 = n24 != 0 ? yo1_0.g : var6_9;
                object6 = n43 != 0 ? wo1_0.g : var7_10;
                n42 = n42 != 0 ? 0 : n20;
                n17 = var24_27 & 0x200;
                if (n17 != 0) {
                    n17 = n42 != 0 ? 1 : -1 >>> 1;
                    n36 = -1879048193;
                    n37 &= n36;
                } else {
                    n17 = var9_12;
                }
                n32 = n32 != 0 ? 1 : n18;
                object10 = n34 != 0 ? EE3$a.a : var11_14;
                object15 = cx$a.c;
                if (n41 != 0) {
                    n41 = 0;
                    object14 = null;
                } else {
                    object14 = var13_16;
                }
                if (n38 != 0) {
                    int n51 = n32;
                    object21 = object10;
                    long l3 = OX.b;
                    object8 = new i93_0(l3);
                } else {
                    int n52 = n32;
                    object21 = object10;
                    object8 = wo1_03;
                }
                if (n16 != 0) {
                    object20 = C10.a;
                    object18 = object8;
                    u103 = object20;
                } else {
                    u103 = var15_18;
                    object18 = object8;
                }
                n18 = n17;
                object19 = object14;
                n17 = n37;
                cx$a = object15;
                n38 = n35;
                object20 = object17;
                object10 = object16;
                n41 = var3_6;
                object12 = object21;
            }
            ((j30_0)object11).U();
            int n54 = n41;
            object14 = ((j30_0)object11).v();
            object5 = b30$a.a;
            if (object14 == object5) {
                l2 = 0L;
                n50 = n38;
                n38 = 6;
                object14 = new ql3_0((String)object13, l2, n38);
                object14 = J83.g(object14);
                ((j30_0)object11).o(object14);
            } else {
                n50 = n38;
            }
            object14 = (tr1_0)object14;
            object8 = (ql3_0)object14.getValue();
            l2 = ((ql3_0)object8).b;
            int n55 = n39;
            wo1_03 = object6;
            Object object22 = object20;
            var15_18 = object12;
            n32 = 6;
            n37 = 0;
            object12 = null;
            object6 = new Sl(n32, (String)object13, null);
            object8 = ((ql3_0)object8).c;
            ql3_02 = new ql3_0((Sl)object6, l2, (mm3)object8);
            n38 = (int)(((j30_0)object11).J(ql3_02) ? 1 : 0);
            object20 = ((j30_0)object11).v();
            if (n38 != 0 || object20 == object5) {
                object20 = new cx$b(ql3_02, (tr1_0)object14);
                ((j30_0)object11).o(object20);
            }
            object20 = (Function0)object20;
            object8 = ly0_0.a;
            ((j30_0)object11).q((Function0)object20);
            n38 = n17 & 0xE;
            n32 = 4;
            if (n38 == n32) {
                n38 = 1;
            } else {
                n38 = 0;
                object8 = null;
            }
            object20 = ((j30_0)object11).v();
            if (n38 != 0 || object20 == object5) {
                object20 = J83.g(string2);
                ((j30_0)object11).o(object20);
            }
            object20 = (tr1_0)object20;
            object10.getClass();
            n43 = ((yo1_0)object10).a;
            object8 = new xo1_1(n43);
            n44 = -1;
            n43 = (int)(xo1_1.a(n43, n44) ? 1 : 0);
            if (n43 != 0) {
                n38 = 0;
                object8 = null;
            }
            if (object8 != null) {
                n38 = ((xo1_1)object8).a;
            } else {
                n38 = 0;
                object8 = null;
            }
            object6 = ((yo1_0)object10).b;
            n43 = object6 != null ? (int)(((Boolean)object6).booleanValue() ? 1 : 0) : 1;
            n37 = ((yo1_0)object10).c;
            object3 = new zo1_0(n37);
            n44 = 0;
            object4 = null;
            n37 = (int)(zo1_0.a(n37, 0) ? 1 : 0);
            if (n37 != 0) {
                bl3 = 0;
                object3 = null;
            }
            n37 = object3 != null ? ((zo1_0)object3).a : 1;
            n44 = ((yo1_0)object10).d;
            object3 = new Qe1(n44);
            int n56 = Qe1.a(n44, -1);
            if (n56 != 0) {
                bl3 = 0;
                object3 = null;
            }
            n56 = object3 != null ? ((Qe1)object3).a : 1;
            object4 = ((yo1_0)object10).f;
            if (object4 == null) {
                object4 = iw1.c;
            }
            n29 = n42;
            n20 = n56;
            Se1 se1 = new Se1(n42 != 0, n38, n43 != 0, n37, n56, (iw1)object4);
            n38 = 1;
            boolean bl4 = n42 ^ true;
            n56 = n42 != 0 ? 1 : n54;
            n26 = n42 != 0 ? 1 : n18;
            n43 = ((j30_0)object11).J(object20);
            n37 = n17 & 0x70;
            n44 = 32;
            if (n37 == n44) {
                n37 = 1;
            } else {
                n37 = 0;
                object12 = null;
            }
            n38 = n43 | n37;
            object6 = ((j30_0)object11).v();
            if (n38 != 0 || object6 == object5) {
                object6 = new cx$c(function13, (tr1_0)object14, (tr1_0)object20);
                ((j30_0)object11).o(object6);
            }
            object15 = object6;
            object15 = (Function1)object6;
            n38 = n17 & 0x380;
            n32 = n17 >> 6 & 0x1C00;
            n38 |= n32;
            n32 = n19 << 9;
            n41 = n32 & 0xE000;
            n38 |= n41;
            n41 = n32 & 0x70000;
            n38 |= n41;
            n43 = 0x380000 & n32;
            n38 |= n43;
            n43 = 0x1C00000;
            int n57 = n38 | (n32 &= n43);
            n38 = n17 >> 15 & 0x380;
            n32 = n17 & 0x1C00;
            n38 |= n32;
            n32 = 0xE000 & n17;
            n38 |= n32;
            n32 = 0x70000 & n19;
            int n58 = n38 | n32;
            object17 = var15_18;
            object16 = cx$a;
            n25 = n56;
            n22 = n55;
            n21 = n50;
            o90.a(ql3_02, (Function1)object15, lP1, (xm3)object22, (EE3)var15_18, cx$a, (wr1_1)object19, (ZD)object18, bl4, n26, n56, se1, wo1_03, n55 != 0, n50 != 0, u103, (b30_0)object11, n57, n58);
            n41 = n18;
            n39 = n54;
            n32 = n55;
            object6 = wo1_03;
            object12 = var15_18;
            object9 = object10;
            object5 = cx$a;
            object4 = object19;
            object3 = object18;
            u102 = u103;
            object7 = object22;
            n34 = n50;
        }
        object11 = ((j30_0)object11).X();
        if (object11 != null) {
            object8 = object13;
            Object object23 = object13;
            object13 = string2;
            function13 = function1;
            Object object24 = object11;
            object11 = lP1;
            n16 = var19_22;
            object13 = object8 = new cx$d(string2, function1, lP1, n32 != 0, n34 != 0, (xm3)object7, (yo1_0)object9, (wo1_0)object6, n42 != 0, n41, n39, (EE3)object12, (Function1)object5, (wr1_1)object4, (ZD)object3, u102, (int)var17_20, (int)var18_21, (int)var19_22);
            object8 = object24;
            ((CF2)object24).d = object23;
        }
    }
}

