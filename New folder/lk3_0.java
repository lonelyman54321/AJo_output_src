/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from lk3
 */
public final class lk3_0 {
    public static final long a = f60.a(0, 0, 0, 0);
    public static final float b = 16;
    public static final float c = 12;
    public static final LP1 d;

    static {
        LP1$a lP1$a = LP1$a.b;
        float f5 = 48;
        d = j.a(lP1$a, f5, f5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void a(pl3 pl32, String string2, Function2 function2, EE3 eE3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean n3, boolean bl2, boolean bl3, wr1_1 wr1_12, mk2_0 mk2_02, i13 i132, ln0 ln02, Function2 function26, b30_0 b30_02, int n4, int n7) {
        int n8;
        Object object;
        Object object2;
        Object object3;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        Object object4;
        Object object5 = string2;
        EE3 eE32 = eE3;
        Object object6 = function22;
        boolean bl4 = bl2;
        boolean bl5 = bl3;
        Object object7 = wr1_12;
        Object object8 = ln02;
        int n19 = n4;
        int n20 = n7;
        Object object9 = b30_02;
        j30_0 j30_02 = b30_02.g(341783750);
        int n21 = n4 & 6;
        if (n21 == 0) {
            n21 = (int)(j30_02.J((Object)pl32) ? 1 : 0);
            n21 = n21 != 0 ? 4 : 2;
            n21 |= n19;
        } else {
            n21 = n4;
        }
        int n22 = n19 & 0x30;
        if (n22 == 0) {
            n22 = (int)(j30_02.J(object5) ? 1 : 0);
            n22 = n22 != 0 ? 32 : 16;
            n21 |= n22;
        }
        n22 = n19 & 0x180;
        int n24 = 128;
        if (n22 == 0) {
            object4 = function2;
            n18 = j30_02.x(function2);
            n18 = n18 != 0 ? 256 : 128;
            n21 |= n18;
        } else {
            object4 = function2;
        }
        int n25 = n19 & 0xC00;
        int n26 = 1024;
        if (n25 == 0) {
            n25 = (int)(j30_02.J(eE32) ? 1 : 0);
            n25 = n25 != 0 ? 2048 : 1024;
            n21 |= n25;
        }
        n25 = n19 & 0x6000;
        int n27 = 8192;
        if (n25 == 0) {
            n25 = (int)(j30_02.x(object6) ? 1 : 0);
            n25 = n25 != 0 ? 16384 : 8192;
            n21 |= n25;
        }
        n25 = 196608;
        int n28 = n19 & n25;
        int n29 = 65536;
        if (n28 == 0) {
            n17 = j30_02.x(function23);
            n17 = n17 != 0 ? 131072 : 65536;
            n21 |= n17;
        }
        n17 = n19 & 0x180000;
        object9 = function24;
        if (n17 == 0) {
            n16 = j30_02.x(function24);
            n16 = n16 != 0 ? 0x100000 : 524288;
            n21 |= n16;
        }
        n16 = n19 & 0xC00000;
        Object object10 = function25;
        if (n16 == 0) {
            n15 = j30_02.x(function25);
            n15 = n15 != 0 ? 0x800000 : 0x400000;
            n21 |= n15;
        }
        if ((n15 = n19 & 0x6000000) == 0) {
            n15 = (int)(j30_02.a(n3 != 0) ? 1 : 0);
            n15 = n15 != 0 ? 0x4000000 : 0x2000000;
            n21 |= n15;
        }
        if ((n15 = n19 & 0x30000000) == 0) {
            n15 = (int)(j30_02.a(bl4) ? 1 : 0);
            n15 = n15 != 0 ? 0x20000000 : 0x10000000;
            n21 |= n15;
        }
        if ((n15 = n20 & 6) == 0) {
            n15 = (int)(j30_02.a(bl5) ? 1 : 0);
            n18 = n15 != 0 ? 4 : 2;
            n18 = n20 | n18;
        } else {
            n18 = n20;
        }
        n15 = n20 & 0x30;
        if (n15 == 0) {
            n15 = (int)(j30_02.J(object7) ? 1 : 0);
            n14 = n15 != 0 ? 32 : 16;
            n18 |= n14;
        }
        if ((n10 = n20 & 0x180) == 0) {
            object9 = mk2_02;
            n14 = (int)(j30_02.J(mk2_02) ? 1 : 0);
            if (n14 != 0) {
                n24 = 256;
            }
            n18 |= n24;
        } else {
            object9 = mk2_02;
        }
        n10 = n20 & 0xC00;
        if (n10 == 0) {
            object9 = i132;
            n24 = (int)(j30_02.J(i132) ? 1 : 0);
            if (n24 != 0) {
                n26 = 2048;
            }
            n18 |= n26;
        } else {
            object9 = i132;
        }
        n10 = n20 & 0x6000;
        if (n10 == 0) {
            n10 = (int)(j30_02.J(object8) ? 1 : 0);
            if (n10 != 0) {
                n27 = 16384;
            }
            n18 |= n27;
        }
        if ((n10 = 0x30000 & n20) == 0) {
            object9 = function26;
            n24 = (int)(j30_02.x(function26) ? 1 : 0);
            if (n24 != 0) {
                n29 = 131072;
            }
            n18 |= n29;
        } else {
            object9 = function26;
        }
        n24 = 306783379;
        n10 = n21 & n24;
        n25 = 306783378;
        if (n10 == n25 && (n10 = n18 & 0x12493) == (n25 = 74898) && (n10 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object6 = j30_02;
        } else {
            long l2;
            int n30;
            Object object11;
            n10 = n21 & 0x70;
            n24 = 1;
            n25 = 32;
            if (n10 == n25) {
                n10 = 1;
            } else {
                n10 = 0;
                object9 = null;
            }
            n25 = 2048;
            if ((n21 &= 0x1C00) == n25) {
                n21 = 1;
            } else {
                n21 = 0;
                object3 = null;
            }
            object9 = j30_02.v();
            if ((n21 |= n10) != 0 || object9 == (object3 = b30$a.a)) {
                n10 = 0;
                n25 = 6;
                object3 = new Sl(n25, (String)object5, null);
                object9 = eE32;
                ((de3_0)eE32).getClass();
                object10 = i72$a.a;
                object9 = new dr3((Sl)object3, (i72)object10);
                j30_02.o(object9);
            }
            object9 = (dr3)object9;
            object10 = ((dr3)object9).a.a;
            n21 = n18 >> 3 & 0xE;
            object3 = (Boolean)UT0.a((wr1_1)object7, j30_02, n21).getValue();
            object3 = (n21 = (int)(((Boolean)object3).booleanValue() ? 1 : 0)) != 0 ? Yh1.Focused : ((n21 = ((String)object10).length()) == 0 ? Yh1.UnfocusedEmpty : Yh1.UnfocusedNotEmpty);
            object9 = object3;
            object3 = new lk3$c((ln0)object8, bl4, bl5, (wr1_1)object7);
            object2 = Bt3.b;
            object = object11 = j30_02.j((H30)object2);
            object = (At3)object11;
            object5 = ((At3)object).g;
            object11 = object10;
            long l3 = ((xm3)object5).b();
            long l4 = OX.l;
            n25 = (int)(OX.c(l3, l4) ? 1 : 0);
            object = ((At3)object).l;
            n14 = n25 != 0 && (n25 = (int)(OX.c(l3 = ((xm3)object).b(), l4) ? 1 : 0)) == 0 || (n30 = OX.c(l3 = ((xm3)object5).b(), l4)) == 0 && (bl4 = OX.c(l2 = ((xm3)object).b(), l4)) ? 1 : 0;
            object = ol3.a;
            n30 = 1578865765;
            j30_02.K(n30);
            object5 = ((At3)j30_02.j((H30)object2)).l;
            l3 = ((xm3)object5).b();
            l4 = 16;
            if (n14 != 0) {
                j30_02.K(-1572851052);
                n30 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
                if (n30 != 0) {
                    n30 = 0;
                    object5 = null;
                } else {
                    n30 = 0;
                    object5 = null;
                    object10 = 0;
                    object10 = (OX)((lk3$c)object3).invoke(object9, j30_02, object10);
                    l3 = ((OX)object10).a;
                }
            } else {
                n30 = 0;
                object5 = null;
                n8 = 780548205;
                j30_02.K(n8);
            }
            j30_02.T(false);
            long l7 = l3;
            j30_02.T(false);
            n30 = 1578871879;
            j30_02.K(n30);
            object2 = ((At3)j30_02.j((H30)object2)).g;
            l3 = ((xm3)object2).b();
            if (n14 != 0) {
                j30_02.K(-1572659596);
                l4 = 16;
                bl5 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (bl5) {
                    bl5 = false;
                    object2 = null;
                } else {
                    bl5 = false;
                    object2 = null;
                    object5 = 0;
                    object5 = (OX)((lk3$c)object3).invoke(object9, j30_02, object5);
                    l3 = ((OX)object5).a;
                }
            } else {
                bl5 = false;
                object2 = null;
                n30 = 780554381;
                j30_02.K(n30);
            }
            j30_02.T(false);
            long l8 = l3;
            j30_02.T(false);
            if (object6 != null) {
                bl5 = true;
            }
            Object object12 = object3;
            object3 = object5;
            Object object13 = object9;
            object9 = function22;
            object4 = object11;
            object10 = function23;
            object6 = j30_02;
            object8 = function25;
            object7 = i132;
            object11 = function2;
            n18 = n3;
            object5 = new lk3$a_0(function22, function23, (String)object4, ln02, bl2, bl3, wr1_12, function24, function25, i132, pl32, function2, n3 != 0, mk2_02, n14 != 0, function26);
            n21 = 225557475;
            object8 = v10.c(n21, (fx0_2)object5, j30_02);
            n24 = 0x1B0000;
            object9 = object;
            object10 = object13;
            n19 = (int)(bl5 ? 1 : 0);
            object7 = j30_02;
            ((ol3)object).a((Yh1)((Object)object13), l7, l8, (lk3$c)object12, bl5, (u10)object8, j30_02, n24);
        }
        object7 = ((j30_0)object6).X();
        if (object7 != null) {
            object2 = object8;
            object = pl32;
            object5 = string2;
            object6 = function2;
            eE32 = eE3;
            object3 = function22;
            object9 = function23;
            object10 = function24;
            object4 = function25;
            n8 = n3;
            Object object14 = object8;
            object8 = i132;
            Object object15 = object7;
            object7 = ln02;
            n18 = n7;
            ((lk3$b)object2)(pl32, string2, function2, eE3, function22, function23, function24, function25, n3 != 0, bl2, bl3, wr1_12, mk2_02, i132, ln02, function26, n4, n7);
            object = object2;
            object2 = object15;
            ((CF2)object15).d = object14;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(long l2, xm3 xm32, Float f5, Function2 function2, b30_0 b30_02, int n3, int n4) {
        CF2 cF2;
        Function2 function22;
        void var18_21;
        int n7;
        int n8;
        int n10;
        int n14;
        xm3 xm33;
        int n15;
        int n16;
        int n17;
        Object object;
        Object object2;
        int n18;
        Function2 function23;
        block17: {
            block16: {
                function23 = function2;
                n18 = n3;
                int n19 = -399493340;
                object2 = b30_02;
                object = b30_02.g(n19);
                n17 = n3 & 6;
                if (n17 == 0) {
                    n17 = (int)(((j30_0)object).d(l2) ? 1 : 0);
                    n17 = n17 != 0 ? 4 : 2;
                    n17 |= n18;
                } else {
                    n17 = n3;
                }
                n16 = n4 & 2;
                if (n16 != 0) {
                    n17 |= 0x30;
                } else {
                    n15 = n18 & 0x30;
                    if (n15 == 0) {
                        xm33 = xm32;
                        n14 = (int)(((j30_0)object).J(xm32) ? 1 : 0);
                        n14 = n14 != 0 ? 32 : 16;
                    }
                }
                xm33 = xm32;
                break block16;
                n17 |= n14;
            }
            n14 = n4 & 4;
            if (n14 != 0) {
                n17 |= 0x180;
            } else {
                n10 = n18 & 0x180;
                if (n10 == 0) {
                    Float f6 = f5;
                    n8 = (int)(((j30_0)object).J(f5) ? 1 : 0);
                    n8 = n8 != 0 ? 256 : 128;
                }
            }
            Float f7 = f5;
            break block17;
            n17 |= n8;
        }
        n8 = n18 & 0xC00;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).x(function23) ? 1 : 0);
            n8 = n8 != 0 ? 2048 : 1024;
            n17 |= n8;
        }
        if ((n8 = n17 & 0x493) == (n7 = 1170) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n8 = 0;
            if (n16 != 0) {
                n15 = 0;
                xm33 = null;
            }
            if (n14 != 0) {
                n10 = 0;
                Object var18_22 = null;
            }
            function22 = new lk3$e(l2, (Float)var18_21, function23);
            function22 = v10.c(494684590, function22, (b30_0)object);
            n14 = 0;
            cF2 = null;
            if (xm33 != null) {
                n8 = 2115969060;
                ((j30_0)object).K(n8);
                n17 = n17 >> 3 & 0xE | 0x30;
                Ll3.a(xm33, function22, (b30_0)object, n17);
            } else {
                ((j30_0)object).K(2115970696);
                n17 = 6;
                object2 = n17;
                ((u10)function22).invoke(object, object2);
            }
            ((j30_0)object).T(false);
        }
        object2 = xm33;
        function22 = var18_21;
        cF2 = ((j30_0)object).X();
        if (cF2 != null) {
            lk3$d lk3$d;
            object = lk3$d;
            function23 = function2;
            n18 = n3;
            n15 = n4;
            lk3$d = new lk3$d(l2, xm33, (Float)((Object)function22), function2, n3, n4);
            cF2.d = lk3$d;
        }
    }

    public static final Object c(Qj1 object) {
        object = object.B();
        boolean bl2 = object instanceof Ep1;
        Object object2 = null;
        object = bl2 ? (Ep1)object : null;
        if (object != null) {
            object2 = object.r0();
        }
        return object2;
    }

    public static final int d(Ns2 ns2) {
        int n3;
        if (ns2 != null) {
            n3 = ns2.b;
        } else {
            n3 = 0;
            ns2 = null;
        }
        return n3;
    }

    public static final int e(Ns2 ns2) {
        int n3;
        if (ns2 != null) {
            n3 = ns2.a;
        } else {
            n3 = 0;
            ns2 = null;
        }
        return n3;
    }
}

