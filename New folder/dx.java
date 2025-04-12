/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.graphics.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class dx {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(Sl sl, LP1 lP1, xm3 xm32, Function1 function1, int n3, boolean n4, int n7, int n8, Map objectArray, gy_1 gy_12, b30_0 b30_02, int n10, int n14) {
        Object object;
        CF2 cF2;
        int n15;
        int n16;
        Object object2;
        Object object3;
        Object object4;
        void var29_43;
        Object object5;
        int n17;
        int n18;
        Sl sl2 = sl;
        int n19 = n7;
        int n20 = n10;
        int n21 = n14;
        int n22 = 128;
        int n24 = 256;
        Object object6 = b30_02;
        Object object7 = b30_02.g(-1064305212);
        int n25 = n10 & 6;
        if (n25 == 0) {
            n25 = (int)(((j30_0)object7).J(sl) ? 1 : 0);
            n25 = n25 != 0 ? 4 : 2;
            n25 |= n20;
        } else {
            n25 = n10;
        }
        int n26 = n20 & 0x30;
        Object object8 = lP1;
        if (n26 == 0) {
            n26 = (int)(((j30_0)object7).J(lP1) ? 1 : 0);
            n26 = n26 != 0 ? 32 : 16;
            n25 |= n26;
        }
        n26 = n20 & 0x180;
        xm3 xm33 = xm32;
        if (n26 == 0) {
            n26 = (int)(((j30_0)object7).J(xm32) ? 1 : 0);
            n26 = n26 != 0 ? 256 : 128;
            n25 |= n26;
        }
        n26 = n20 & 0xC00;
        Object object9 = function1;
        if (n26 == 0) {
            n26 = (int)(((j30_0)object7).x(function1) ? 1 : 0);
            n26 = n26 != 0 ? 2048 : 1024;
            n25 |= n26;
        }
        n26 = n20 & 0x6000;
        int n27 = n3;
        if (n26 == 0) {
            n26 = (int)(((j30_0)object7).c(n3) ? 1 : 0);
            n26 = n26 != 0 ? 16384 : 8192;
            n25 |= n26;
        }
        if ((n26 = 0x30000 & n20) == 0) {
            n26 = n4;
            n18 = ((j30_0)object7).a(n4 != 0);
            n18 = n18 != 0 ? 131072 : 65536;
            n25 |= n18;
        } else {
            n26 = n4;
        }
        n18 = n20 & 0x180000;
        if (n18 == 0) {
            n18 = (int)(((j30_0)object7).c(n19) ? 1 : 0);
            n18 = n18 != 0 ? 0x100000 : 524288;
            n25 |= n18;
        }
        n18 = 0xC00000;
        if ((n22 &= n21) != 0) {
            n25 |= n18;
            n17 = n8;
        } else {
            n18 = n20 & n18;
            n17 = n8;
            if (n18 == 0) {
                n18 = (int)(((j30_0)object7).c(n8) ? 1 : 0);
                n18 = n18 != 0 ? 0x800000 : 0x400000;
                n25 |= n18;
            }
        }
        n18 = 0x6000000;
        if ((n24 &= n21) != 0) {
            n25 |= n18;
            Object[] objectArray2 = objectArray;
        } else {
            n18 = n20 & n18;
            Object[] objectArray3 = objectArray;
            if (n18 == 0) {
                n18 = (int)(((j30_0)object7).x(objectArray) ? 1 : 0);
                n18 = n18 != 0 ? 0x4000000 : 0x2000000;
                n25 |= n18;
            }
        }
        int n28 = n21 & 0x200;
        n18 = 0x30000000;
        if (n28 != 0) {
            n25 |= n18;
            object6 = gy_12;
        } else {
            n18 = n20 & n18;
            object6 = gy_12;
            if (n18 == 0) {
                n18 = (int)(((j30_0)object7).x(gy_12) ? 1 : 0);
                n18 = n18 != 0 ? 0x20000000 : 0x10000000;
                n25 |= n18;
            }
        }
        n18 = 306783379;
        n26 = n25 & n18;
        n27 = 306783378;
        if (n26 == n27 && (n26 = (int)(((j30_0)object7).h() ? 1 : 0)) != 0) {
            ((j30_0)object7).D();
            object5 = gy_12;
            object6 = object7;
            object7 = var29_43;
        } else {
            void var29_49;
            int n29;
            float f5;
            int n30;
            int n32;
            int n34;
            Object object10;
            Object object11;
            nz0_2 nz0_22;
            n22 = n22 != 0 ? 1 : n17;
            if (n24 != 0) {
                object4 = fh1_2.f();
                nz0_22 = object4;
            } else {
                nz0_22 = var29_43;
            }
            gy_1 gy_13 = n28 != 0 ? null : gy_12;
            B41.d(n22, n19);
            object4 = sy2_0.a;
            object4 = (ry2_0)((j30_0)object7).j((H30)object4);
            object5 = b30$a.a;
            if (object4 != null) {
                void var24_29;
                ((j30_0)object7).K(-1584983428);
                object6 = tm3.a;
                long l2 = ((sm3)((j30_0)object7).j((H30)object6)).b;
                Object[] objectArray4 = new Object[1];
                n17 = 0;
                objectArray4[0] = object4;
                object11 = new mx_0((ry2_0)object4);
                object10 = CS2.a;
                n34 = n22;
                long l3 = l2;
                object6 = nx_0.c;
                object3 = new ds2_0((Function2)object11, (Function1)object6);
                n26 = (int)(((j30_0)object7).x(object4) ? 1 : 0);
                object2 = ((j30_0)object7).v();
                if (n26 != 0 || object2 == object5) {
                    object2 = new dx$e((ry2_0)object4);
                    ((j30_0)object7).o(object2);
                }
                object11 = object2;
                object11 = (Function0)object2;
                n32 = 0;
                n30 = 4;
                f5 = 5.6E-45f;
                object6 = objectArray4;
                object2 = object3;
                object9 = object11;
                j30_0 j30_02 = object7;
                object8 = null;
                n22 = 4;
                n17 = n30;
                object6 = (Number)wi2_0.b(objectArray4, (ds2_0)object3, (Function0)object11, (b30_0)object7, 0, n30);
                long l4 = ((Number)object6).longValue();
                n26 = (int)(((j30_0)object7).d(l4) ? 1 : 0);
                n16 = (int)(((j30_0)object7).J(object4) ? 1 : 0);
                n26 |= n16;
                long l7 = l3;
                n16 = (int)(((j30_0)object7).d(l3) ? 1 : 0);
                Object object12 = ((j30_0)object7).v();
                if ((n26 |= n16) != 0 || object12 == object5) {
                    UX2 uX2;
                    object6 = uX2;
                    Object object13 = object4;
                    uX2 = new UX2(l4, (ry2_0)object4, l7);
                    ((j30_0)object7).o(uX2);
                    UX2 uX22 = uX2;
                }
                UX2 uX2 = (UX2)var24_29;
                n24 = 0;
                object4 = null;
                ((j30_0)object7).T(false);
                UX2 uX23 = uX2;
            } else {
                n34 = n22;
                n22 = 4;
                n24 = 0;
                object4 = null;
                n26 = -1584467526;
                ((j30_0)object7).K(n26);
                ((j30_0)object7).T(false);
                Object var29_48 = null;
            }
            object4 = Ul.a;
            object4 = sl2.a;
            n24 = ((String)object4).length();
            object6 = sl2.d;
            if (object6 == null) {
                object8 = null;
                n32 = 0;
            } else {
                block40: {
                    n27 = object6.size();
                    object11 = null;
                    for (n17 = 0; n17 < n27; ++n17) {
                        String string2;
                        object9 = (Sl$b)object6.get(n17);
                        Object object14 = ((Sl$b)object9).a;
                        n16 = object14 instanceof String;
                        if (n16 != 0 && (n16 = (int)(Intrinsics.areEqual(object8 = "androidx.compose.foundation.text.inlineContent", string2 = ((Sl$b)object9).d) ? 1 : 0)) != 0) {
                            n16 = ((Sl$b)object9).b;
                            n15 = ((Sl$b)object9).c;
                            object8 = null;
                            if ((n15 = (int)(Tl.c(0, n24, n16, n15) ? 1 : 0)) == 0) continue;
                            n17 = 1;
                            break block40;
                        }
                        object8 = null;
                    }
                    object8 = null;
                    n17 = 0;
                    object11 = null;
                }
                n32 = n17;
            }
            n24 = (int)(Fj3.a(sl) ? 1 : 0);
            if (n32 == 0 && n24 == 0) {
                n22 = -1584294453;
                ((j30_0)object7).K(n22);
                n30 = 0;
                f5 = 0.0f;
                int n35 = 131071;
                object10 = lP1;
                object3 = a.b(lP1, 0.0f, 0.0f, 0.0f, 0.0f, null, false, n35);
                object4 = O30.i;
                object11 = object4 = ((j30_0)object7).j((H30)object4);
                object11 = (RU0$a)object4;
                n18 = 0;
                object10 = null;
                n29 = n34;
                object4 = sl;
                object6 = function1;
                n27 = n3;
                n15 = n4;
                n16 = n7;
                n32 = 0;
                j30_0 j30_03 = object7;
                object7 = null;
                n28 = 0;
                object5 = null;
                n20 = 0;
                cF2 = null;
                object3 = dx.e((LP1)object3, sl, xm32, function1, n3, n4 != 0, n7, n34, (RU0$a)object11, null, null, (UX2)var29_49, gy_13, null);
                object4 = pz0_0.a;
                object6 = j30_03;
                n25 = j30_03.P;
                object3 = a30_0.c(j30_03, (LP1)object3);
                object2 = j30_03.P();
                N20.W.getClass();
                object9 = N20$a.b;
                mp mp2 = j30_03.a;
                n16 = mp2 instanceof mp;
                if (n16 == 0) {
                    s20.a();
                    throw null;
                }
                j30_03.A();
                n16 = (int)(j30_03.O ? 1 : 0);
                if (n16 != 0) {
                    j30_03.C((Function0)object9);
                } else {
                    j30_03.n();
                }
                object9 = N20$a.e;
                Ow3.a((b30_0)object6, object4, (Function2)object9);
                object4 = N20$a.d;
                Ow3.a((b30_0)object6, object2, (Function2)object4);
                object4 = N20$a.c;
                Ow3.a((b30_0)object6, object3, (Function2)object4);
                object3 = N20$a.f;
                n24 = (int)(((j30_0)object6).O ? 1 : 0);
                if (n24 != 0 || (n24 = (int)(Intrinsics.areEqual(object4 = ((j30_0)object6).v(), object2 = Integer.valueOf(n25)) ? 1 : 0)) == 0) {
                    rk_0.a(n25, (j30_0)object6, n25, (N20$a$a)object3);
                }
                n24 = 1;
                ((j30_0)object6).T(n24 != 0);
                n27 = 0;
                object2 = null;
                ((j30_0)object6).T(false);
            } else {
                object6 = object7;
                n29 = n34;
                n24 = 1;
                n27 = 0;
                object2 = null;
                ((j30_0)object7).K(-1583391888);
                n15 = n25 & 0xE;
                if (n15 != n22) {
                    n24 = 0;
                    object4 = null;
                }
                object3 = ((j30_0)object6).v();
                if (n24 != 0 || object3 == object5) {
                    object3 = J83.g(sl);
                    ((j30_0)object6).o(object3);
                }
                object3 = (tr1_0)object3;
                object10 = object4 = object3.getValue();
                object10 = (Sl)object4;
                object4 = O30.i;
                Object object15 = object4 = ((j30_0)object6).j((H30)object4);
                object15 = (RU0$a)object4;
                n24 = (int)(((j30_0)object6).J(object3) ? 1 : 0);
                object9 = ((j30_0)object6).v();
                if (n24 != 0 || object9 == object5) {
                    object9 = new dx$b((tr1_0)object3);
                    ((j30_0)object6).o(object9);
                }
                Object object16 = object9;
                object16 = (Function1)object9;
                n22 = n25 >> 3 & 0x38E;
                n24 = n25 >> 12 & 0xE000;
                n22 |= n24;
                n24 = n25 << 9 & 0x70000;
                n22 |= n24;
                n24 = n25 << 6;
                n15 = 0x380000 & n24;
                n22 |= n15;
                n15 = 0x1C00000 & n24;
                n22 |= n15;
                n15 = 0xE000000 & n24;
                n22 |= n15;
                n15 = 0x70000000;
                int n36 = n22 | (n24 &= n15);
                n22 = n25 >> 21 & 0x380;
                object = lP1;
                int n37 = n7;
                dx.c(lP1, (Sl)object10, function1, n32 != 0, nz0_22, xm32, n3, n4 != 0, n7, n29, (RU0$a)object15, (UX2)var29_49, gy_13, (Function1)object16, (b30_0)object6, n36, n22);
                ((j30_0)object6).T(false);
            }
            object7 = nz0_22;
            object5 = gy_13;
            n17 = n29;
        }
        cF2 = ((j30_0)object6).X();
        if (cF2 != null) {
            object3 = object;
            object4 = sl;
            object6 = xm32;
            object2 = function1;
            n15 = n3;
            n16 = n4;
            n21 = n14;
            object = new dx$c(sl, lP1, xm32, function1, n3, n4 != 0, n7, n17, (Map)object7, (gy_1)object5, n10, n14);
            cF2.d = object;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(String string2, LP1 lP1, xm3 xm32, Function1 object, int n3, boolean bl2, int n4, int n7, gy_1 gy_12, b30_0 b30_02, int n8, int n10) {
        Object object2;
        Object object3;
        Object object4;
        int n14;
        int n15;
        void var8_10;
        int n16;
        int n17;
        int n18;
        int n19;
        void var6_8;
        int n20;
        void var5_7;
        void var4_6;
        int n21;
        Object object5;
        int n22;
        int n24;
        int n25;
        j30_0 j30_02;
        Object object6;
        int n26;
        int n27;
        int n28;
        int n29;
        void var14_16;
        void var11_13;
        int bl3;
        void var10_12;
        String string3;
        block42: {
            block41: {
                void var9_11;
                string3 = string2;
                bl3 = var10_12;
                var14_16 = var11_13;
                n29 = 128;
                n28 = 16;
                n27 = 32;
                n26 = 6;
                object6 = var9_11;
                j30_02 = var9_11.g(-1186827822);
                n25 = var10_12 & 6;
                if (n25 == 0) {
                    n25 = (int)(j30_02.J(string2) ? 1 : 0);
                    n25 = n25 != 0 ? 4 : 2;
                    n25 |= bl3;
                } else {
                    n25 = var10_12;
                }
                n24 = bl3 & 0x30;
                if (n24 == 0) {
                    n24 = (int)(j30_02.J(lP1) ? 1 : 0);
                    n24 = n24 != 0 ? 32 : 16;
                    n25 |= n24;
                }
                if ((n24 = bl3 & 0x180) == 0) {
                    n24 = (int)(j30_02.J(xm32) ? 1 : 0);
                    n24 = n24 != 0 ? 256 : 128;
                    n25 |= n24;
                }
                if ((n24 = var14_16 & 8) != 0) {
                    n25 |= 0xC00;
                } else {
                    n22 = bl3 & 0xC00;
                    if (n22 == 0) {
                        object5 = object;
                        n21 = j30_02.x(object);
                        n21 = n21 != 0 ? 2048 : 1024;
                    }
                }
                object5 = object;
                break block41;
                n25 |= n21;
            }
            if ((n28 &= var14_16) != 0) {
                n25 |= 0x6000;
            } else {
                n26 = bl3 & 0x6000;
                if (n26 == 0) {
                    n26 = var4_6;
                    n21 = (int)(j30_02.c((int)var4_6) ? 1 : 0);
                    n21 = n21 != 0 ? 16384 : 8192;
                }
            }
            n26 = var4_6;
            break block42;
            n25 |= n21;
        }
        n21 = 196608;
        if ((n27 &= var14_16) != 0) {
            n25 |= n21;
            n20 = var5_7;
        } else {
            n21 = bl3 & n21;
            n20 = var5_7;
            if (n21 == 0) {
                n21 = (int)(j30_02.a((boolean)var5_7) ? 1 : 0);
                n21 = n21 != 0 ? 131072 : 65536;
                n25 |= n21;
            }
        }
        n21 = var14_16 & 0x40;
        int n30 = 0x180000;
        if (n21 != 0) {
            n25 |= n30;
            n19 = var6_8;
        } else {
            n30 = bl3 & n30;
            n19 = var6_8;
            if (n30 == 0) {
                n30 = (int)(j30_02.c((int)var6_8) ? 1 : 0);
                n30 = n30 != 0 ? 0x100000 : 524288;
                n25 |= n30;
            }
        }
        int n32 = n29 & var14_16;
        n30 = 0xC00000;
        if (n32 != 0) {
            n25 |= n30;
        } else {
            n30 = bl3 & n30;
            n17 = n18;
            if (n30 == 0) {
                n16 = j30_02.c(n18);
                n16 = n16 != 0 ? 0x800000 : 0x400000;
                n25 |= n16;
            }
        }
        n17 = 256;
        n30 = 0x6000000;
        if ((n17 &= var14_16) != 0) {
            n25 |= n30;
            void var31_41 = var8_10;
        } else {
            n30 = bl3 & n30;
            void var31_42 = var8_10;
            if (n30 == 0) {
                n30 = (int)(j30_02.x(var8_10) ? 1 : 0);
                n30 = n30 != 0 ? 0x4000000 : 0x2000000;
                n25 |= n30;
            }
        }
        n30 = 38347923;
        n26 = 0x2492492;
        if ((n25 &= n30) == n26 && (n26 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            n25 = var4_6;
            n15 = n18;
            void var33_52 = var8_10;
            n24 = n20;
            n14 = n19;
            Object object7 = object5;
        } else {
            void var33_55;
            int n34;
            void var35_60;
            Object object8;
            int n35;
            Object object9;
            if (n24 != 0) {
                Object var35_58 = null;
            } else {
                Object object10 = object5;
            }
            int n36 = n28 != 0 ? 1 : var4_6;
            if (n27 != 0) {
                n20 = 1;
            }
            if (n21 != 0) {
                n28 = -1 >>> 1;
                n19 = -1 >>> 1;
            }
            n24 = n32 != 0 ? 1 : n18;
            if (n17 != 0) {
                Object var33_53 = null;
            } else {
                void var33_54 = var8_10;
            }
            B41.d(n24, n19);
            object4 = sy2_0.a;
            object4 = (ry2_0)j30_02.j((H30)object4);
            if (object4 != null) {
                n17 = -1589202404;
                j30_02.K(n17);
                object3 = tm3.a;
                object3 = (sm3)j30_02.j((H30)object3);
                long l2 = ((sm3)object3).b;
                Object[] objectArray = new Object[]{object4};
                object2 = new mx_0((ry2_0)object4);
                object5 = CS2.a;
                object9 = nx_0.c;
                object5 = new ds2_0((Function2)object2, (Function1)object9);
                n27 = (int)(j30_02.x(object4) ? 1 : 0);
                object9 = j30_02.v();
                n35 = n24;
                object6 = b30$a.a;
                if (n27 != 0 || object9 == object6) {
                    object9 = new dx$d((ry2_0)object4);
                    j30_02.o(object9);
                }
                object2 = object9;
                object2 = (Function0)object9;
                object9 = null;
                n21 = 4;
                Object[] objectArray2 = objectArray;
                n18 = 0;
                object2 = (Number)wi2_0.b(objectArray, (ds2_0)object5, (Function0)object2, j30_02, 0, n21);
                long l3 = ((Number)object2).longValue();
                n25 = (int)(j30_02.d(l3) ? 1 : 0);
                n22 = (int)(j30_02.J(object4) ? 1 : 0);
                n25 |= n22;
                n22 = (int)(j30_02.d(l2) ? 1 : 0);
                object5 = j30_02.v();
                if ((n25 |= n22) != 0 || object5 == object6) {
                    Object object11 = object5;
                    object5 = new UX2(l3, (ry2_0)object4, l2);
                    j30_02.o(object5);
                }
                object5 = (UX2)object5;
                boolean bl4 = false;
                object4 = null;
                j30_02.T(false);
                object8 = object5;
            } else {
                n35 = n24;
                boolean bl5 = false;
                object4 = null;
                n17 = -1588686502;
                j30_02.K(n17);
                j30_02.T(false);
                object8 = null;
            }
            if (object8 != null || var35_60 != null) {
                n34 = n35;
                int n37 = -1588564052;
                j30_02.K(n37);
                n21 = 0;
                n30 = 0;
                n16 = 0;
                object5 = lP1;
                object5 = a.b(lP1, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071);
                n28 = 6;
                object4 = new Sl(n28, string3, null);
                object3 = O30.i;
                Object object12 = object3 = j30_02.j((H30)object3);
                object12 = (RU0$a)object3;
                n35 = 0;
                int n38 = n34;
                object4 = dx.e((LP1)object5, (Sl)object4, xm32, (Function1)var35_60, n36, n20 != 0, n19, n34, (RU0$a)object12, null, null, object8, (gy_1)var33_55, null);
                n17 = 0;
                object3 = null;
                j30_02.T(false);
            } else {
                int n39 = -1587866335;
                j30_02.K(n39);
                n21 = 0;
                n30 = 0;
                n16 = 0;
                int n41 = 131071;
                object5 = lP1;
                object5 = a.b(lP1, 0.0f, 0.0f, 0.0f, 0.0f, null, false, n41);
                object4 = O30.i;
                object2 = object4 = j30_02.j((H30)object4);
                object2 = (RU0$a)object4;
                object4 = object6;
                object3 = string2;
                n26 = n36;
                bl3 = 0;
                n25 = n20;
                n34 = n35;
                n24 = n19;
                n14 = n35;
                object6 = new TextStringSimpleElement(string2, xm32, (RU0$a)object2, n36, n20 != 0, n19, n35, (gy_1)var33_55);
                object4 = object5.then((LP1)object6);
                n17 = 0;
                object3 = null;
                j30_02.T(false);
            }
            object3 = pz0_0.a;
            n28 = j30_02.P;
            object4 = a30_0.c(j30_02, (LP1)object4);
            object2 = j30_02.P();
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            object9 = j30_02.a;
            n25 = object9 instanceof mp;
            if (n25 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n25 = (int)(j30_02.O ? 1 : 0);
            if (n25 != 0) {
                j30_02.C(xp1$a);
            } else {
                j30_02.n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a(j30_02, object3, n20$a$b);
            object3 = N20$a.d;
            Ow3.a(j30_02, object2, (Function2)object3);
            object3 = N20$a.c;
            Ow3.a(j30_02, object4, (Function2)object3);
            object4 = N20$a.f;
            n17 = (int)(j30_02.O ? 1 : 0);
            if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object3 = j30_02.v(), object2 = Integer.valueOf(n28)) ? 1 : 0)) == 0) {
                rk_0.a(n28, j30_02, n28, (N20$a$a)object4);
            }
            boolean bl6 = true;
            j30_02.T(bl6);
            n24 = n20;
            n14 = n19;
            void var31_49 = var35_60;
            n25 = n36;
            n15 = n34;
        }
        CF2 cF2 = j30_02.X();
        if (cF2 != null) {
            void var31_50;
            void var33_56;
            dx$a dx$a;
            object4 = dx$a;
            object3 = string2;
            object2 = xm32;
            string3 = var33_56;
            bl3 = var10_12;
            var14_16 = var11_13;
            dx$a = new dx$a(string2, lP1, xm32, (Function1)var31_50, n25, n24 != 0, n14, n15, (gy_1)var33_56, (int)var10_12, (int)var11_13);
            cF2.d = dx$a;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void c(LP1 var0, Sl var1_1, Function1 var2_2, boolean var3_3, Map var4_4, xm3 var5_5, int var6_6, boolean var7_7, int var8_8, int var9_9, RU0$a var10_10, UX2 var11_11, gy_1 var12_12, Function1 var13_13, b30_0 var14_14, int var15_15, int var16_16) {
        block66: {
            block63: {
                block65: {
                    block64: {
                        block62: {
                            var17_17 = var1_1;
                            var18_18 = var2_2;
                            var19_19 = var3_3;
                            var20_20 = var4_4;
                            var21_21 = var15_15;
                            var22_22 = var16_16;
                            var23_23 = 645129368;
                            var24_24 = var14_14;
                            var25_25 = var14_14.g(var23_23);
                            var26_26 = var15_15 & 6;
                            if (var26_26 == 0) {
                                var24_24 = var0;
                                var27_27 = (int)var25_25.J(var0);
                                var27_27 = var27_27 != 0 ? 4 : 2;
                                var27_27 |= var21_21;
                            } else {
                                var24_24 = var0;
                                var27_27 = var15_15;
                            }
                            var28_28 = var21_21 & 48;
                            if (var28_28 == 0) {
                                var28_28 = (int)var25_25.J(var17_17);
                                var28_28 = var28_28 != 0 ? 32 : 16;
                                var27_27 |= var28_28;
                            }
                            if ((var28_28 = var21_21 & 384) == 0) {
                                var28_28 = (int)var25_25.x(var18_18);
                                var28_28 = var28_28 != 0 ? 256 : 128;
                                var27_27 |= var28_28;
                            }
                            var28_28 = var21_21 & 3072;
                            var29_29 = 1024;
                            if (var28_28 == 0) {
                                var28_28 = (int)var25_25.a(var19_19);
                                var28_28 = var28_28 != 0 ? 2048 : 1024;
                                var27_27 |= var28_28;
                            }
                            if ((var28_28 = var21_21 & 24576) == 0) {
                                var28_28 = (int)var25_25.x(var20_20);
                                var28_28 = var28_28 != 0 ? 16384 : 8192;
                                var27_27 |= var28_28;
                            }
                            if ((var28_28 = 196608 & var21_21) == 0) {
                                var30_30 = var5_5;
                                var31_31 = var25_25.J(var5_5);
                                var31_31 = var31_31 != 0 ? 131072 : 65536;
                                var27_27 |= var31_31;
                            } else {
                                var30_30 = var5_5;
                            }
                            var31_31 = var21_21 & 0x180000;
                            var32_32 = var6_6;
                            if (var31_31 == 0) {
                                var33_33 = var25_25.c(var6_6);
                                var33_33 = var33_33 != 0 ? 0x100000 : 524288;
                                var27_27 |= var33_33;
                            }
                            if ((var33_33 = var21_21 & 0xC00000) == 0) {
                                var34_34 = var25_25.a(var7_7);
                                var34_34 = var34_34 != 0 ? 0x800000 : 0x400000;
                                var27_27 |= var34_34;
                            }
                            var34_34 = var21_21 & 0x6000000;
                            var35_35 = var8_8;
                            if (var34_34 == 0) {
                                var36_36 = var25_25.c(var8_8);
                                var36_36 = var36_36 != 0 ? 0x4000000 : 0x2000000;
                                var27_27 |= var36_36;
                            }
                            var36_36 = var21_21 & 0x30000000;
                            var37_37 = var9_9;
                            if (var36_36 == 0) {
                                var36_36 = (int)var25_25.c(var9_9);
                                var36_36 = var36_36 != 0 ? 0x20000000 : 0x10000000;
                                var27_27 |= var36_36;
                            }
                            var36_36 = var22_22 & 6;
                            var38_38 = var10_10;
                            if (var36_36 == 0) {
                                var36_36 = (int)var25_25.x(var10_10);
                                var31_31 = var36_36 != 0 ? 4 : 2;
                                var31_31 = var22_22 | var31_31;
                            } else {
                                var31_31 = var22_22;
                            }
                            var36_36 = var22_22 & 48;
                            var39_39 = var11_11;
                            if (var36_36 == 0) {
                                var36_36 = (int)var25_25.x(var11_11);
                                var33_33 = var36_36 != 0 ? 32 : 16;
                                var31_31 |= var33_33;
                            }
                            if ((var40_40 = var22_22 & 384) == 0) {
                                var38_38 = var12_12;
                                var33_33 = (int)var25_25.x(var12_12);
                                var34_34 = var33_33 != 0 ? 256 : 128;
                                var31_31 |= var34_34;
                            } else {
                                var38_38 = var12_12;
                            }
                            var40_40 = var22_22 & 3072;
                            if (var40_40 == 0) {
                                var38_38 = var13_13;
                                var33_33 = (int)var25_25.x(var13_13);
                                if (var33_33 != 0) {
                                    var29_29 = 2048;
                                }
                                var31_31 |= var29_29;
lbl95:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var38_38 = var13_13;
                            ** while (true)
                            var40_40 = var31_31;
                            var29_29 = 306783379;
                            var26_26 = var27_27 & var29_29;
                            var37_37 = 306783378;
                            if (var26_26 != var37_37 || (var40_40 = var31_31 & 1171) != (var26_26 = 1170) || (var40_40 = (int)var25_25.h()) == 0) break block62;
                            var25_25.D();
                            break block63;
                        }
                        var40_40 = (int)Fj3.a(var1_1);
                        var24_24 = b30$a.a;
                        if (var40_40 != 0) {
                            var25_25.K(-619323167);
                            var40_40 = var27_27 & 112;
                            var37_37 = 32;
                            if (var40_40 == var37_37) {
                                var40_40 = 1;
                            } else {
                                var40_40 = 0;
                                var38_38 = null;
                            }
                            var41_41 = var25_25.v();
                            if (var40_40 != 0 || var41_41 == var24_24) {
                                var41_41 = new Yl3(var17_17);
                                var25_25.o(var41_41);
                            }
                            var38_38 = var41_41;
                            var38_38 = (Yl3)var41_41;
                            var37_37 = 0;
                            var41_41 = null;
                            var25_25.T(false);
                        } else {
                            var37_37 = 0;
                            var41_41 = null;
                            var25_25.K(-619265198);
                            var25_25.T(false);
                            var40_40 = 0;
                            var38_38 = null;
                        }
                        var37_37 = (int)Fj3.a(var1_1);
                        if (var37_37 != 0) {
                            var25_25.K(-619074547);
                            var37_37 = var27_27 & 112;
                            var32_32 = 32;
                            if (var37_37 == var32_32) {
                                var37_37 = 1;
                            } else {
                                var37_37 = 0;
                                var41_41 = null;
                            }
                            var32_32 = (int)var25_25.J(var38_38);
                            var42_42 = var25_25.v();
                            if ((var37_37 |= var32_32) != 0 || var42_42 == var24_24) {
                                var42_42 = new kx_0((Yl3)var38_38, var17_17);
                                var25_25.o(var42_42);
                            }
                            var42_42 = (Function0)var42_42;
                            var37_37 = 0;
                            var41_41 = null;
                            var25_25.T(false);
                        } else {
                            var25_25.K(-618966357);
                            var37_37 = var27_27 & 112;
                            var32_32 = 32;
                            if (var37_37 == var32_32) {
                                var37_37 = 1;
                            } else {
                                var37_37 = 0;
                                var41_41 = null;
                            }
                            var42_42 = var25_25.v();
                            if (var37_37 != 0 || var42_42 == var24_24) {
                                var42_42 = new lx_1(var17_17);
                                var25_25.o(var42_42);
                            }
                            var42_42 = (Function0)var42_42;
                            var37_37 = 0;
                            var41_41 = null;
                            var25_25.T(false);
                        }
                        if (!var19_19) break block64;
                        if (var20_20 == null) ** GOTO lbl-1000
                        var41_41 = Ul.a;
                        var37_37 = (int)var4_4.isEmpty();
                        if (var37_37 == 0) {
                            var37_37 = var17_17.a.length();
                            var41_41 = var17_17.c(0, var37_37, "androidx.compose.foundation.text.inlineContent");
                            var30_30 = new ArrayList();
                            var43_43 = new ArrayList();
                            var44_44 = var41_41.size();
                            var45_45 = null;
                            for (var35_35 = 0; var35_35 < var44_44; var35_35 += var47_47) {
                                var46_46 /* !! */  = var41_41.get(var35_35);
                                var14_14 = var41_41;
                                var41_41 = var46_46 /* !! */ ;
                                var41_41 = (Sl$b)var46_46 /* !! */ ;
                                var29_29 = var44_44;
                                var39_39 = var41_41.a;
                                if ((var39_39 = (Eh1)var20_20.get(var39_39)) != null) {
                                    var47_47 = var41_41.b;
                                    var37_37 = var41_41.c;
                                    var22_22 = 0;
                                    var48_48 = null;
                                    var39_39 = new Sl$b(var47_47, var37_37, null);
                                    var30_30.add(var39_39);
                                    var39_39 = new Sl$b(var47_47, var37_37, null);
                                    var43_43.add(var39_39);
                                }
                                var47_47 = 1;
                                var20_20 = var4_4;
                                var41_41 = var14_14;
                                var22_22 = var16_16;
                                var44_44 = var29_29;
                            }
                            var20_20 = new Pair(var30_30, var43_43);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var20_20 = Ul.a;
                        }
                        break block65;
                    }
                    var37_37 = 0;
                    var41_41 = null;
                    var20_20 = new Pair(null, null);
                }
                var49_49 = var41_41 = var20_20.a;
                var49_49 = (List)var41_41;
                var20_20 = (List)var20_20.b;
                if (var19_19) {
                    var37_37 = -618671702;
                    var25_25.K(var37_37);
                    var41_41 = var25_25.v();
                    if (var41_41 == var24_24) {
                        var28_28 = 0;
                        var30_30 = null;
                        var41_41 = J83.g(null);
                        var25_25.o(var41_41);
                    }
                    var48_48 = var41_41;
                    var48_48 = (tr1_0)var41_41;
                    var37_37 = 0;
                    var41_41 = null;
                    var25_25.T(false);
                } else {
                    var37_37 = 0;
                    var41_41 = null;
                    var28_28 = -618591630;
                    var25_25.K(var28_28);
                    var25_25.T(false);
                    var22_22 = 0;
                    var48_48 = null;
                }
                if (var19_19) {
                    var25_25.K(-618506565);
                    var37_37 = (int)var25_25.J(var48_48);
                    var30_30 = var25_25.v();
                    if (var37_37 != 0 || var30_30 == var24_24) {
                        var30_30 = new jx((tr1_0)var48_48);
                        var25_25.o(var30_30);
                    }
                    var30_30 = (Function1)var30_30;
                    var37_37 = 0;
                    var41_41 = null;
                    var25_25.T(false);
                    var50_50 = var30_30;
                } else {
                    var37_37 = 0;
                    var41_41 = null;
                    var28_28 = -618442830;
                    var25_25.K(var28_28);
                    var25_25.T(false);
                    var50_50 = null;
                }
                var36_36 = 0;
                var51_51 = null;
                var31_31 = 0;
                var33_33 = 0;
                var34_34 = 0;
                var52_52 = 131071;
                var46_46 /* !! */  = var0;
                var53_53 = a.b(var0, 0.0f, 0.0f, 0.0f, 0.0f, null, false, var52_52);
                var54_54 = var41_41 = var42_42.invoke();
                var54_54 = (Sl)var41_41;
                var37_37 = (int)var25_25.x(var38_38);
                var32_32 = var27_27 & 896;
                var28_28 = 256;
                if (var32_32 == var28_28) {
                    var32_32 = 1;
                } else {
                    var32_32 = 0;
                    var42_42 = null;
                }
                var42_42 = var25_25.v();
                if ((var37_37 |= var32_32) != 0 || var42_42 == var24_24) {
                    var42_42 = new ex((Yl3)var38_38, var18_18);
                    var25_25.o(var42_42);
                }
                var51_51 = var42_42;
                var51_51 = (Function1)var42_42;
                var52_52 = (int)var7_7;
                var41_41 = dx.e(var53_53, (Sl)var54_54, var5_5, (Function1)var51_51, var6_6, var7_7, var8_8, var9_9, var10_10, (List)var49_49, (Function1)var50_50, var11_11, var12_12, var13_13);
                if (!var19_19) {
                    var25_25.K(-617362851);
                    var32_32 = (int)var25_25.x(var38_38);
                    var30_30 = var25_25.v();
                    if (var32_32 != 0 || var30_30 == var24_24) {
                        var30_30 = new fx_0((Yl3)var38_38);
                        var25_25.o(var30_30);
                    }
                    var30_30 = (Function0)var30_30;
                    var24_24 = new tu1_0((Function0)var30_30);
                    var32_32 = 0;
                    var42_42 = null;
                    var25_25.T(false);
                } else {
                    var25_25.K(-617202116);
                    var32_32 = (int)var25_25.x(var38_38);
                    var30_30 = var25_25.v();
                    if (var32_32 != 0 || var30_30 == var24_24) {
                        var30_30 = new gx_0((Yl3)var38_38);
                        var25_25.o(var30_30);
                    }
                    var30_30 = (Function0)var30_30;
                    var32_32 = (int)var25_25.J(var48_48);
                    var43_43 = var25_25.v();
                    if (var32_32 != 0 || var43_43 == var24_24) {
                        var43_43 = new hx_0((tr1_0)var48_48);
                        var25_25.o(var43_43);
                    }
                    var43_43 = (Function0)var43_43;
                    var24_24 = new hm3_0((Function0)var30_30, (Function0)var43_43);
                    var32_32 = 0;
                    var42_42 = null;
                    var25_25.T(false);
                }
                var32_32 = var25_25.P;
                var30_30 = var25_25.P();
                var41_41 = a30_0.c((b30_0)var25_25, (LP1)var41_41);
                N20.W.getClass();
                var43_43 = N20$a.b;
                var39_39 = var25_25.a;
                var44_44 = var39_39 instanceof mp;
                if (var44_44 == 0) break block66;
                var25_25.A();
                var44_44 = (int)var25_25.O;
                if (var44_44 != 0) {
                    var25_25.C((Function0)var43_43);
                } else {
                    var25_25.n();
                }
                var43_43 = N20$a.e;
                Ow3.a((b30_0)var25_25, var24_24, (Function2)var43_43);
                var24_24 = N20$a.d;
                Ow3.a((b30_0)var25_25, var30_30, (Function2)var24_24);
                var24_24 = N20$a.f;
                var28_28 = (int)var25_25.O;
                if (var28_28 != 0 || (var28_28 = (int)Intrinsics.areEqual(var30_30 = var25_25.v(), var43_43 = Integer.valueOf(var32_32))) == 0) {
                    rk_0.a(var32_32, (j30_0)var25_25, var32_32, (N20$a$a)var24_24);
                }
                var24_24 = N20$a.c;
                Ow3.a((b30_0)var25_25, var41_41, (Function2)var24_24);
                if (var38_38 == null) {
                    var40_40 = -515480539;
                    var25_25.K(var40_40);
                    var26_26 = 0;
                    var24_24 = null;
                    var25_25.T(false);
                } else {
                    var26_26 = 0;
                    var24_24 = null;
                    var37_37 = 537560924;
                    var25_25.K(var37_37);
                    var38_38.a((b30_0)var25_25, 0);
                    var25_25.T(false);
                    var38_38 = Unit.a;
                }
                if (var20_20 == null) {
                    var40_40 = -515428893;
                    var25_25.K(var40_40);
                    var25_25.T(false);
lbl357:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var25_25.K(-515428892);
                var40_40 = var27_27 >> 3 & 14;
                Ul.a(var17_17, (List)var20_20, (b30_0)var25_25, var40_40);
                var38_38 = Unit.a;
                var40_40 = 0;
                var38_38 = null;
                var25_25.T(false);
                ** while (true)
                var40_40 = 1;
                var25_25.T((boolean)var40_40);
            }
            var48_48 = var25_25.X();
            if (var48_48 != null) {
                var38_38 = var45_45;
                var25_25 = var0;
                var17_17 = var1_1;
                var18_18 = var2_2;
                var19_19 = var3_3;
                var20_20 = var4_4;
                var24_24 = var5_5;
                var37_37 = var6_6;
                var32_32 = (int)var7_7;
                var27_27 = var8_8;
                var28_28 = var9_9;
                var43_43 = var10_10;
                var39_39 = var11_11;
                var55_55 = var45_45;
                var45_45 = var12_12;
                var56_56 = var48_48;
                var48_48 = var13_13;
                var21_21 = var15_15;
                var29_29 = var16_16;
                var38_38(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, var12_12, var13_13, var15_15, var16_16);
                var25_25 = var38_38;
                var38_38 = var56_56;
                var56_56.d = var55_55;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final ArrayList d(List list, Function0 arrayList) {
        boolean bl2 = (Boolean)((Object)(arrayList = (Boolean)arrayList.invoke()));
        if (bl2) {
            int n3 = list.size();
            arrayList = new ArrayList<Object>(n3);
            n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                int n7;
                int n8;
                Object object = (xk1_0)list.get(i3);
                Object object2 = object.B();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                object2 = ((pm3)object2).b;
                Object object3 = (Tl3)((Xl3)object2).a.b.getValue();
                if (object3 == null) {
                    object3 = em3_0.c;
                    object2 = new om3(0, 0, (Function0)object3);
                } else {
                    object2 = Yl3.c(((Xl3)object2).b, (Tl3)object3);
                    if (object2 == null) {
                        object3 = fm3_0.c;
                        object2 = new om3(0, 0, (Function0)object3);
                    } else {
                        n8 = ((Sl$b)object2).b;
                        int n10 = ((Sl$b)object2).c;
                        object2 = Wi1.a(((Tl3)object3).k(n8, n10).b());
                        n7 = ((Vi1)object2).c;
                        n8 = ((Vi1)object2).a;
                        n7 -= n8;
                        n8 = ((Vi1)object2).d;
                        n4 = ((Vi1)object2).b;
                        dm3_0 dm3_02 = new dm3_0((Vi1)object2);
                        object2 = new om3(n7, n8 -= n4, dm3_02);
                    }
                }
                n7 = ((om3)object2).a;
                n8 = 262142;
                n4 = Math.min(n7, n8);
                int n14 = -1 >>> 1;
                n7 = n7 == n14 ? -1 >>> 1 : Math.min(n7, n8);
                n8 = n7 == n14 ? n4 : n7;
                n8 = f60.c(n8);
                int n15 = ((om3)object2).b;
                if (n15 != n14) {
                    n14 = Math.min(n8, n15);
                }
                n8 = Math.min(n8, n15);
                long l2 = f60.a(n4, n7, n8, n14);
                object = object.Q(l2);
                object2 = ((om3)object2).c;
                object3 = new Pair(object, object2);
                arrayList.add(object3);
            }
        } else {
            bl2 = false;
            arrayList = null;
        }
        return arrayList;
    }

    public static final LP1 e(LP1 lP1, Sl sl, xm3 xm32, Function1 function1, int n3, boolean bl2, int n4, int n7, RU0$a rU0$a, List list, Function1 function12, UX2 uX2, gy_1 gy_12, Function1 function13) {
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement;
        Object object = uX2;
        if (uX2 == null) {
            Object object2 = object;
            object = new TextAnnotatedStringElement(sl, xm32, rU0$a, function1, n3, bl2, n4, n7, list, function12, gy_12, function13);
            object2 = LP1$a.b;
            return lP1.then((LP1)object2).then((LP1)object);
        }
        LP1 lP12 = selectableTextAnnotatedStringElement;
        selectableTextAnnotatedStringElement = new SelectableTextAnnotatedStringElement(sl, xm32, rU0$a, function1, n3, bl2, n4, n7, list, function12, uX2, gy_12);
        lP12 = uX2.e;
        return lP1.then(lP12).then(selectableTextAnnotatedStringElement);
    }
}

