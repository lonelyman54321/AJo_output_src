/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference0Impl;

public final class Ps1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, ft1_2 ft1_22, mk2_0 mk2_02, boolean bl2, boolean bl3, TR0 tR0, boolean n3, int n4, Nc$b object, zp$l zp$l, Nc$c nc$c, zp$e zp$e, Function1 function1, b30_0 b30_02, int n7, int n8, int n10) {
        int n14;
        Object object2;
        int n15;
        Object object3;
        Object object4;
        Object object5;
        int n16;
        Object object6;
        int n17;
        int n18;
        int n19;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        block67: {
            Object object12;
            Object object13;
            void var70_85;
            Object object14;
            int n20;
            int n21;
            Object object15;
            Object object16;
            Object object17;
            int n22;
            int n24;
            Object object18;
            Object object19;
            int n25;
            int n26;
            int n27;
            block69: {
                block68: {
                    Object object20;
                    void var54_65;
                    int n28;
                    int n29;
                    int n30;
                    int n32;
                    int n34;
                    int n35;
                    int n36;
                    boolean bl4;
                    boolean bl5;
                    block66: {
                        int n37;
                        block65: {
                            int n38;
                            object11 = lP1;
                            object10 = ft1_22;
                            object9 = mk2_02;
                            bl5 = bl2;
                            bl4 = bl3;
                            object8 = function1;
                            n27 = n7;
                            n26 = n8;
                            n25 = n10;
                            object7 = b30_02;
                            object19 = b30_02.g(620764179);
                            n36 = n7 & 6;
                            if (n36 == 0) {
                                n36 = ((j30_0)object19).J(lP1) ? 1 : 0;
                                n36 = n36 != 0 ? 4 : 2;
                                n36 |= n27;
                            } else {
                                n36 = n7;
                            }
                            n19 = n27 & 0x30;
                            if (n19 == 0) {
                                n19 = ((j30_0)object19).J(object10) ? 1 : 0;
                                n19 = n19 != 0 ? 32 : 16;
                                n36 |= n19;
                            }
                            n19 = n27 & 0x180;
                            n18 = 128;
                            if (n19 == 0) {
                                n19 = ((j30_0)object19).J(object9) ? 1 : 0;
                                n19 = n19 != 0 ? 256 : 128;
                                n36 |= n19;
                            }
                            if ((n19 = n27 & 0xC00) == 0) {
                                n19 = ((j30_0)object19).a(bl5) ? 1 : 0;
                                n19 = n19 != 0 ? 2048 : 1024;
                                n36 |= n19;
                            }
                            if ((n19 = n27 & 0x6000) == 0) {
                                n19 = ((j30_0)object19).a(bl4) ? 1 : 0;
                                n19 = n19 != 0 ? 16384 : 8192;
                                n36 |= n19;
                            }
                            if ((n19 = 0x30000 & n27) == 0) {
                                object18 = tR0;
                                n24 = ((j30_0)object19).J(tR0) ? 1 : 0;
                                n24 = n24 != 0 ? 131072 : 65536;
                                n36 |= n24;
                            } else {
                                object18 = tR0;
                            }
                            n24 = 0x180000;
                            int n39 = n27 & n24;
                            n17 = n3;
                            if (n39 == 0) {
                                n35 = ((j30_0)object19).a(n3 != 0) ? 1 : 0;
                                n35 = n35 != 0 ? 0x100000 : 524288;
                                n36 |= n35;
                            }
                            n35 = 0xC00000;
                            n34 = n36 | n35;
                            n32 = n25 & 0x100;
                            n30 = 0x6000000;
                            if (n32 != 0) {
                                n34 = n36 | 0x6C00000;
                            } else {
                                n36 = n27 & n30;
                                if (n36 == 0) {
                                    object6 = object;
                                    n38 = ((j30_0)object19).J(object);
                                    n38 = n38 != 0 ? 0x4000000 : 0x2000000;
                                }
                            }
                            object6 = object;
                            break block65;
                            n34 |= n38;
                        }
                        n22 = n25 & 0x200;
                        n29 = 0x30000000;
                        if (n22 != 0) {
                            n34 |= n29;
                            object17 = zp$l;
                        } else {
                            int n41 = n27 & n29;
                            object17 = zp$l;
                            if (n41 == 0) {
                                n37 = ((j30_0)object19).J(zp$l);
                                n37 = n37 != 0 ? 0x20000000 : 0x10000000;
                                n34 |= n37;
                            }
                        }
                        n27 = n34;
                        n36 = n25 & 0x400;
                        if (n36 != 0) {
                            n34 = n26 | 6;
                            object18 = nc$c;
                        } else {
                            n34 = n26 & 6;
                            object18 = nc$c;
                            if (n34 == 0) {
                                n34 = ((j30_0)object19).J(nc$c) ? 1 : 0;
                                n34 = n34 != 0 ? 4 : 2;
                                n34 = n26 | n34;
                            } else {
                                n34 = n26;
                            }
                        }
                        n19 = n25 & 0x800;
                        if (n19 != 0) {
                            n34 |= 0x30;
                            object16 = zp$e;
                        } else {
                            n37 = n26 & 0x30;
                            object16 = zp$e;
                            if (n37 == 0) {
                                n37 = ((j30_0)object19).J(zp$e) ? 1 : 0;
                                n28 = n37 != 0 ? 32 : 16;
                                n34 |= n28;
                            }
                        }
                        n17 = n26 & 0x180;
                        if (n17 == 0) {
                            n17 = ((j30_0)object19).x(object8) ? 1 : 0;
                            if (n17 != 0) {
                                n18 = 256;
                            }
                            n34 |= n18;
                        }
                        n17 = n34;
                        n18 = 306783379;
                        n16 = n27 & n18;
                        n25 = 306783378;
                        if (n16 != n25 || (n16 = n34 & 0x93) != (n25 = 146) || (n16 = (int)(((j30_0)object19).h() ? 1 : 0)) == 0) break block66;
                        ((j30_0)object19).D();
                        object5 = object;
                        object4 = zp$l;
                        Nc$c nc$c2 = nc$c;
                        object3 = zp$e;
                        object8 = object10;
                        object10 = object19;
                        n15 = n4;
                        break block67;
                    }
                    n16 = 0;
                    object17 = null;
                    if (n32 != 0) {
                        n25 = 0;
                        object5 = null;
                    } else {
                        object5 = object;
                    }
                    if (n22 != 0) {
                        n22 = 0;
                        Object var54_63 = null;
                    } else {
                        zp$l zp$l2 = zp$l;
                    }
                    if (n36 != 0) {
                        n32 = 0;
                        object7 = null;
                    } else {
                        object7 = nc$c;
                    }
                    if (n19 == 0) {
                        object17 = zp$e;
                    }
                    n18 = n27 >> 3 & 0xE;
                    n36 = n17 >> 3 & 0x70;
                    n36 = n18 | n36;
                    object18 = J83.j(object8, (b30_0)object19);
                    n26 = n36 & 0xE ^ 6;
                    n28 = 0;
                    n34 = 1;
                    int n42 = 4;
                    if (n26 > n42 && (n26 = (int)(((j30_0)object19).J(object10) ? 1 : 0)) != 0 || (n36 &= 6) == n42) {
                        n36 = 1;
                    } else {
                        n36 = 0;
                        object6 = null;
                    }
                    object4 = ((j30_0)object19).v();
                    object8 = b30$a.a;
                    if (n36 != 0 || object4 == object8) {
                        object6 = new Object();
                        n26 = -1 >>> 1;
                        ((xr1_2)object6).a = object11 = Pv2.b(n26);
                        ((xr1_2)object6).b = object11 = Pv2.b(n26);
                        J83.i();
                        object11 = vf_1.b;
                        object4 = new Ns1((tr1_0)object18);
                        object18 = J83.d((I83)object11, (Function0)object4);
                        J83.i();
                        object4 = new Os1((mp0)object18, (ft1_2)object10, (xr1_2)object6);
                        mp0 mp02 = J83.d((I83)object11, (Function0)object4);
                        Class<ib3_0> clazz = ib3_0.class;
                        String string2 = "value";
                        String string3 = "getValue()Ljava/lang/Object;";
                        object4 = new PropertyReference0Impl((Object)mp02, clazz, string2, string3, 0);
                        ((j30_0)object19).o(object4);
                    }
                    object11 = object4;
                    object11 = (hn1_2)object4;
                    n36 = n27 >> 9 & 0x70;
                    n19 = (n36 = n18 | n36) & 0xE ^ 6;
                    n26 = 4;
                    if (n19 > n26 && (n19 = (int)(((j30_0)object19).J(object10) ? 1 : 0)) != 0 || (n19 = n36 & 6) == n26) {
                        n19 = 1;
                    } else {
                        n19 = 0;
                        object18 = null;
                    }
                    int n43 = n36 & 0x70;
                    n26 = n43 ^ 0x30;
                    object15 = object11;
                    int n44 = 32;
                    if (n26 > n44 && (n26 = (int)(((j30_0)object19).a(bl4) ? 1 : 0)) != 0 || (n36 &= 0x30) == n44) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    object6 = ((j30_0)object19).v();
                    if ((n44 |= n19) != 0 || object6 == object8) {
                        object6 = new bs1_1((ft1_2)object10, bl4);
                        ((j30_0)object19).o(object6);
                    }
                    object11 = object6;
                    object11 = (zs1_0)object6;
                    object6 = ((j30_0)object19).v();
                    if (object6 == object8) {
                        object6 = Qx2.a(ly0_0.f(kotlin.coroutines.f.a, (b30_0)object19), (j30_0)object19);
                    }
                    object6 = ((Q30)object6).a;
                    object18 = O30.e;
                    object4 = object18 = ((j30_0)object19).j((H30)object18);
                    object4 = (T01)object18;
                    object18 = O30.t;
                    object18 = (Boolean)((j30_0)object19).j((H30)object18);
                    n19 = (Boolean)object18 ^ 1;
                    object = object11;
                    n44 = n27 & 0x1C00;
                    n43 = n27 & (char)-16;
                    int n45 = n27 >> 6;
                    n21 = n45 & 0x70000;
                    n43 |= n21;
                    n21 = 0x380000;
                    n43 |= (n45 &= n21);
                    n45 = 0x1C00000;
                    int n46 = (n17 <<= 21) & n45;
                    n43 |= n46;
                    n46 = 0xE000000;
                    n17 &= n46;
                    n17 = n43 | n17;
                    n43 = 0x70000000;
                    n20 = n27 & n43;
                    n17 |= n20;
                    n20 = n17 & 0x70;
                    int n47 = n27;
                    n27 = n20 ^ 0x30;
                    n20 = n44;
                    n44 = 32;
                    if (n27 > n44 && (n27 = (int)(((j30_0)object19).J(object10) ? 1 : 0)) != 0 || (n27 = n17 & 0x30) == n44) {
                        n27 = 1;
                    } else {
                        n27 = 0;
                        Object var51_54 = null;
                    }
                    n44 = n17 & 0x380 ^ 0x180;
                    int n48 = 256;
                    if (n44 > n48 && (n44 = (int)(((j30_0)object19).J(object9) ? 1 : 0)) != 0 || (n44 = n17 & 0x180) == n48) {
                        n48 = 1;
                    } else {
                        n48 = 0;
                        object10 = null;
                    }
                    n48 |= n27;
                    n44 = n17 & 0x1C00 ^ 0xC00;
                    n27 = 2048;
                    if (n44 > n27 && (n44 = (int)(((j30_0)object19).a(bl5) ? 1 : 0)) != 0 || (n44 = n17 & 0xC00) == n27) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    n48 |= n44;
                    n44 = 0xE000 & n17 ^ 0x6000;
                    n27 = 16384;
                    if (n44 > n27 && (n44 = (int)(((j30_0)object19).a(bl4) ? 1 : 0)) != 0 || (n44 = n17 & 0x6000) == n27) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    n48 |= n44;
                    n44 = n17 & n21 ^ n24;
                    n27 = 0x100000;
                    if (n44 > n27 && (n44 = (int)(((j30_0)object19).J(object5) ? 1 : 0)) != 0 || (n44 = n17 & n24) == n27) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    n48 |= n44;
                    n44 = n17 & n45 ^ n35;
                    n27 = 0x800000;
                    if (n44 > n27 && (n44 = (int)(((j30_0)object19).J(object7) ? 1 : 0)) != 0 || (n44 = n17 & n35) == n27) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    n48 |= n44;
                    n44 = n17 & n46 ^ n30;
                    n27 = 0x4000000;
                    if (n44 > n27 && (n44 = (int)(((j30_0)object19).J(object17) ? 1 : 0)) != 0 || (n44 = n17 & n30) == n27) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    n48 |= n44;
                    n44 = n17 & n43 ^ n29;
                    n27 = 0x20000000;
                    if (n44 > n27 && (n44 = (int)(((j30_0)object19).J(var54_65) ? 1 : 0)) != 0 || (n44 = n17 & n29) == n27) {
                        n44 = 1;
                    } else {
                        n44 = 0;
                        object11 = null;
                    }
                    n48 |= n44;
                    n44 = ((j30_0)object19).J(object4) ? 1 : 0;
                    n48 |= n44;
                    n44 = ((j30_0)object19).a(n19 != 0);
                    object11 = ((j30_0)object19).v();
                    n27 = 0;
                    Object var51_55 = null;
                    if ((n48 |= n44) == 0 && object11 != object8) {
                        n24 = n47;
                        object14 = object7;
                        var70_85 = var54_65;
                        object3 = object17;
                        object10 = object19;
                        object13 = object5;
                        object20 = object8;
                        zp$l = null;
                    } else {
                        object10 = object6;
                        object10 = (c80)object6;
                        object6 = object11;
                        object14 = object7;
                        object7 = ft1_22;
                        n24 = n19;
                        n19 = bl3 ? 1 : 0;
                        object16 = mk2_02;
                        var70_85 = var54_65;
                        n22 = bl2 ? 1 : 0;
                        object3 = object17;
                        object17 = object15;
                        j30_0 j30_02 = object19;
                        object19 = var54_65;
                        object13 = object5;
                        object5 = object3;
                        n26 = n24;
                        n24 = n47;
                        zp$l = null;
                        n27 = 0;
                        Object var51_56 = null;
                        object20 = object8;
                        object8 = object10;
                        object2 = object13;
                        object9 = object14;
                        object11 = new ss1_1(ft1_22, bl3, mk2_02, bl2, (hn1_2)object15, (zp$l)var54_65, (zp$e)object3, n26 != 0, 0, (c80)object10, (T01)object4, (Nc$b)object13, (Nc$c)object14);
                        object10 = j30_02;
                        j30_02.o(object11);
                    }
                    object11 = (Function2)object11;
                    object6 = bl3 ? pg2_0.Vertical : pg2_0.Horizontal;
                    object8 = ft1_22;
                    object12 = object6;
                    object6 = ft1_22.l;
                    object6 = lP1.then((LP1)object6);
                    object7 = ft1_22.m;
                    object6 = object6.then((LP1)object7);
                    object7 = object15;
                    object18 = object;
                    object16 = object12;
                    n22 = n3;
                    n16 = bl2 ? 1 : 0;
                    object6 = f.a((LP1)object6, (hn1_2)object15, (zs1_0)object, (pg2_0)((Object)object12), n3 != 0, bl2);
                    n32 = n24 >> 18 & 0x70;
                    n32 = n18 | n32;
                    n19 = n32 & 0xE ^ 6;
                    n17 = 4;
                    if (n19 > n17 && (n19 = (int)(((j30_0)object10).J(ft1_22) ? 1 : 0)) != 0 || (n19 = n32 & 6) == n17) {
                        n19 = 1;
                    } else {
                        n19 = 0;
                        object18 = null;
                    }
                    n32 = n32 & 0x70 ^ 0x30;
                    n17 = 32;
                    boolean bl6 = false;
                    object2 = null;
                    if (n32 > n17 && (n32 = (int)(((j30_0)object10).c(0) ? 1 : 0)) != 0) {
                        n28 = 1;
                    }
                    n32 = n19 | n28;
                    object18 = ((j30_0)object10).v();
                    if (n32 != 0) break block68;
                    object7 = object20;
                    if (object18 != object20) break block69;
                }
                object18 = new gs1_1((ft1_2)object8, 0);
                ((j30_0)object10).o(object18);
            }
            object7 = object18;
            object7 = (gs1_1)object18;
            object18 = O30.l;
            Object object21 = object18 = ((j30_0)object10).j((H30)object18);
            bp1_0 bp1_02 = (bp1_0)((Object)object18);
            n19 = 0x200 | n20;
            n17 = n24 & n21;
            n26 = n19 | n17;
            object18 = ((ft1_2)object8).o;
            n17 = bl2 ? 1 : 0;
            object17 = object12;
            n15 = n3;
            object5 = object10;
            object6 = Dr1.a((LP1)object6, (Er1)object7, (Br1)object18, bl2, bp1_02, (pg2_0)((Object)object12), n3 != 0, (b30_0)object10, n26);
            object7 = ((ft1_2)object8).n.k;
            object6 = object6.then((LP1)object7);
            n14 = 64;
            n25 = 0;
            object19 = ((ft1_2)object8).g;
            object7 = ft1_22;
            object18 = object12;
            n17 = n3;
            n22 = bl2 ? 1 : 0;
            object17 = tR0;
            object4 = object10;
            n27 = n14;
            object18 = hU2.a((LP1)object6, ft1_22, (pg2_0)((Object)object12), n3 != 0, bl2, tR0, (wr1_1)object19, null, (b30_0)object10, n14);
            object16 = ((ft1_2)object8).p;
            object7 = object15;
            Object object22 = object11;
            object17 = object10;
            ds1_0.a((hn1_2)object15, (LP1)object18, (xs1)object16, (Function2)object11, (b30_0)object10, 0);
            Object object23 = object14;
            object4 = var70_85;
            object5 = object13;
            n15 = 0;
            object19 = null;
        }
        object9 = ((j30_0)object10).X();
        if (object9 != null) {
            void var51_60;
            object10 = object2;
            object11 = lP1;
            object6 = ft1_22;
            object7 = mk2_02;
            n19 = bl2 ? 1 : 0;
            n17 = bl3 ? 1 : 0;
            TR0 tR02 = tR0;
            n16 = n3;
            object8 = object3;
            int n49 = n7;
            n14 = n8;
            n18 = n10;
            object11 = object2 = new Ps1$a(lP1, ft1_22, mk2_02, bl2, bl3, tR0, n3 != 0, n15, (Nc$b)object5, (zp$l)object4, (Nc$c)var51_60, (zp$e)object3, function1, n7, n8, n10);
            object10 = object9;
            ((CF2)object9).d = object2;
        }
    }
}

