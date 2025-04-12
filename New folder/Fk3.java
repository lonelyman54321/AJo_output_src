/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.layout.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class Fk3 {
    public static final float a = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, Function2 function2, u10 u102, u10 u103, u10 u104, u10 u105, boolean n3, float f5, mk2_0 mk2_02, b30_0 b30_02, int n4) {
        Object object;
        float f6;
        Object object2 = lP1;
        Object object3 = function2;
        Object object4 = u102;
        Object object5 = u103;
        Object object6 = u104;
        Object object7 = u105;
        int n7 = n3;
        float f7 = f5;
        Object object8 = mk2_02;
        int n8 = n4;
        int n10 = -2112507061;
        Object object9 = b30_02;
        Object object10 = b30_02.g(n10);
        int n14 = n4 & 6;
        if (n14 == 0) {
            n14 = ((j30_0)object10).J(lP1) ? 1 : 0;
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n8;
        } else {
            n14 = n4;
        }
        int n15 = n8 & 0x30;
        if (n15 == 0) {
            n15 = ((j30_0)object10).x(object3) ? 1 : 0;
            if (n15 != 0) {
                n15 = 32;
                f6 = 4.5E-44f;
            } else {
                n15 = 16;
                f6 = 2.2E-44f;
            }
            n14 |= n15;
        }
        if ((n15 = n8 & 0x180) == 0) {
            n15 = ((j30_0)object10).x(object4) ? 1 : 0;
            if (n15 != 0) {
                n15 = 256;
                f6 = 3.59E-43f;
            } else {
                n15 = 128;
                f6 = 1.8E-43f;
            }
            n14 |= n15;
        }
        if ((n15 = n8 & 0xC00) == 0) {
            n15 = ((j30_0)object10).x(object5) ? 1 : 0;
            if (n15 != 0) {
                n15 = 2048;
                f6 = 2.87E-42f;
            } else {
                n15 = 1024;
                f6 = 1.435E-42f;
            }
            n14 |= n15;
        }
        if ((n15 = n8 & 0x6000) == 0) {
            n15 = ((j30_0)object10).x(object6) ? 1 : 0;
            if (n15 != 0) {
                n15 = 16384;
                f6 = 2.2959E-41f;
            } else {
                n15 = 8192;
                f6 = 1.148E-41f;
            }
            n14 |= n15;
        }
        f6 = 2.75506E-40f;
        n15 = 0x30000 & n8;
        if (n15 == 0) {
            n15 = ((j30_0)object10).x(object7) ? 1 : 0;
            if (n15 != 0) {
                n15 = 131072;
                f6 = 1.83671E-40f;
            } else {
                n15 = 65536;
                f6 = 9.1835E-41f;
            }
            n14 |= n15;
        }
        f6 = 2.204052E-39f;
        n15 = 0x180000 & n8;
        int n16 = 0x100000;
        if (n15 == 0) {
            n15 = ((j30_0)object10).a(n7 != 0) ? 1 : 0;
            if (n15 != 0) {
                n15 = 0x100000;
                f6 = 1.469368E-39f;
            } else {
                n15 = 524288;
                f6 = 7.34684E-40f;
            }
            n14 |= n15;
        }
        f6 = 1.7632415E-38f;
        n15 = 0xC00000 & n8;
        int n17 = 0x800000;
        if (n15 == 0) {
            n15 = ((j30_0)object10).b(f7) ? 1 : 0;
            if (n15 != 0) {
                n15 = 0x800000;
                f6 = Float.MIN_NORMAL;
            } else {
                n15 = 0x400000;
                f6 = 5.877472E-39f;
            }
            n14 |= n15;
        }
        f6 = 2.4074124E-35f;
        n15 = 0x6000000 & n8;
        if (n15 == 0) {
            n15 = ((j30_0)object10).J(object8) ? 1 : 0;
            if (n15 != 0) {
                n15 = 0x4000000;
                f6 = 1.5046328E-36f;
            } else {
                n15 = 0x2000000;
                f6 = 9.403955E-38f;
            }
            n14 |= n15;
        }
        f6 = 1.4777644E-37f;
        n15 = 0x2492493 & n14;
        int n18 = 0x2492492;
        if (n15 == n18 && (n15 = (int)(((j30_0)object10).h() ? 1 : 0)) != 0) {
            ((j30_0)object10).D();
            u10 u106 = object4;
        } else {
            float f8;
            float f11;
            float f12;
            int n19;
            Object object11;
            LP1 lP12;
            float f14;
            Object object12;
            f6 = 5.142788E-39f;
            n15 = 0x380000 & n14;
            if (n15 == n16) {
                n15 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n15 = 0;
                f6 = 0.0f;
                object12 = null;
            }
            n16 = 0x1C00000 & n14;
            if (n16 == n17) {
                n16 = 1;
            } else {
                n16 = 0;
                object = null;
            }
            n15 |= n16;
            n16 = 0xE000000 & n14;
            n17 = 0x4000000;
            if (n16 == n17) {
                n16 = 1;
            } else {
                n16 = 0;
                object = null;
            }
            object = ((j30_0)object10).v();
            if ((n15 |= n16) != 0 || object == (object12 = b30$a.a)) {
                object = new gk3_0(n7 != 0, f7, (mk2_0)object8);
                ((j30_0)object10).o(object);
            }
            object = (gk3_0)object;
            object12 = O30.l;
            object12 = (bp1_0)((Object)((j30_0)object10).j((H30)object12));
            n17 = ((j30_0)object10).P;
            Object object13 = ((j30_0)object10).P();
            Object object14 = a30_0.c((b30_0)object10, (LP1)object2);
            N20.W.getClass();
            object2 = N20$a.b;
            mp mp2 = ((j30_0)object10).a;
            n8 = mp2 instanceof mp;
            if (n8 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n8 = ((j30_0)object10).O ? 1 : 0;
            if (n8 != 0) {
                ((j30_0)object10).C((Function0)object2);
            } else {
                ((j30_0)object10).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object10, object, n20$a$b);
            object = N20$a.d;
            Ow3.a((b30_0)object10, object13, (Function2)object);
            object13 = N20$a.f;
            boolean bl2 = ((j30_0)object10).O;
            if (bl2 || !(bl2 = Intrinsics.areEqual(object3 = ((j30_0)object10).v(), object4 = Integer.valueOf(n17)))) {
                rk_0.a(n17, (j30_0)object10, n17, (N20$a$a)object13);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object10, object14, (Function2)object3);
            object4 = Nc$a.e;
            LP1$a lP1$a = LP1$a.b;
            if (object6 != null) {
                n7 = 69542167;
                f14 = 1.9410851E-36f;
                ((j30_0)object10).K(n7);
                object14 = androidx.compose.ui.layout.a.b("Leading");
                lP12 = lk3_0.d;
                object14 = kp1_0.a((up1_0)object14, lP12);
                lP12 = null;
                object5 = HA.e((Nc)object4, false);
                n17 = ((j30_0)object10).P;
                object8 = ((j30_0)object10).P();
                object14 = a30_0.c((b30_0)object10, (LP1)object14);
                object11 = object12;
                n15 = mp2 instanceof mp;
                if (n15 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object10).A();
                n15 = ((j30_0)object10).O ? 1 : 0;
                if (n15 != 0) {
                    ((j30_0)object10).C((Function0)object2);
                } else {
                    ((j30_0)object10).n();
                }
                Ow3.a((b30_0)object10, object5, n20$a$b);
                Ow3.a((b30_0)object10, object8, (Function2)object);
                n19 = ((j30_0)object10).O ? 1 : 0;
                if (n19 != 0 || (n19 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object10).v(), object8 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                    rk_0.a(n17, (j30_0)object10, n17, (N20$a$a)object13);
                }
                Ow3.a((b30_0)object10, object14, (Function2)object3);
                object5 = n14 >> 12 & 0xE;
                ((u10)object6).invoke(object10, object5);
                ((j30_0)object10).T(true);
                n19 = 0;
                f12 = 0.0f;
                object5 = null;
                ((j30_0)object10).T(false);
            } else {
                object11 = object12;
                n19 = 0;
                f12 = 0.0f;
                object5 = null;
                n7 = 69783378;
                f14 = 1.9843502E-36f;
                ((j30_0)object10).K(n7);
                ((j30_0)object10).T(false);
            }
            if (object7 != null) {
                n19 = 69825941;
                f12 = 1.9919846E-36f;
                ((j30_0)object10).K(n19);
                object5 = androidx.compose.ui.layout.a.b("Trailing");
                object14 = lk3_0.d;
                object5 = kp1_0.a((up1_0)object5, (LP1)object14);
                f14 = 0.0f;
                object14 = null;
                object4 = HA.e((Nc)object4, false);
                n7 = ((j30_0)object10).P;
                object8 = ((j30_0)object10).P();
                object5 = a30_0.c((b30_0)object10, (LP1)object5);
                n15 = mp2 instanceof mp;
                if (n15 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object10).A();
                n15 = ((j30_0)object10).O ? 1 : 0;
                if (n15 != 0) {
                    ((j30_0)object10).C((Function0)object2);
                } else {
                    ((j30_0)object10).n();
                }
                Ow3.a((b30_0)object10, object4, n20$a$b);
                Ow3.a((b30_0)object10, object8, (Function2)object);
                boolean bl3 = ((j30_0)object10).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object10).v(), object8 = Integer.valueOf(n7)))) {
                    rk_0.a(n7, (j30_0)object10, n7, (N20$a$a)object13);
                }
                Ow3.a((b30_0)object10, object5, (Function2)object3);
                object4 = n14 >> 15 & 0xE;
                ((u10)object7).invoke(object10, object4);
                ((j30_0)object10).T(true);
                bl3 = false;
                f11 = 0.0f;
                object4 = null;
                ((j30_0)object10).T(false);
            } else {
                boolean bl4 = false;
                f11 = 0.0f;
                object4 = null;
                n19 = 70069074;
                f12 = 2.0355944E-36f;
                ((j30_0)object10).K(n19);
                ((j30_0)object10).T(false);
            }
            object8 = mk2_02;
            object12 = object11;
            f12 = h.c(mk2_02, (bp1_0)((Object)object11));
            f14 = h.b(mk2_02, (bp1_0)((Object)object11));
            if (object6 != null) {
                f6 = lk3_0.c;
                f12 -= f6;
                f6 = 0.0f;
                f12 = f.a(f12, f6);
            }
            float f15 = f12;
            if (object7 != null) {
                f12 = lk3_0.c;
                f14 -= f12;
                f12 = 0.0f;
                f8 = f11 = f.a(f14, f12);
            } else {
                f8 = f14;
            }
            int n20 = 10;
            object4 = h.i(lP1$a, f15, 0.0f, f8, 0.0f, n20);
            object5 = u103;
            if (u103 != null) {
                ((j30_0)object10).K(70826807);
                object14 = kp1_0.a((up1_0)androidx.compose.ui.layout.a.b("Hint"), (LP1)object4);
                n15 = n14 >> 6 & 0x70;
                object12 = n15;
                u103.invoke(object14, object10, object12);
                n7 = 0;
                f14 = 0.0f;
                object14 = null;
                ((j30_0)object10).T(false);
            } else {
                n7 = 0;
                f14 = 0.0f;
                object14 = null;
                n15 = 70914258;
                f6 = 2.1871918E-36f;
                ((j30_0)object10).K(n15);
                ((j30_0)object10).T(false);
            }
            object14 = Nc$a.a;
            object12 = u102;
            if (u102 != null) {
                n17 = 70948761;
                ((j30_0)object10).K(n17);
                lP12 = kp1_0.a((up1_0)androidx.compose.ui.layout.a.b("Label"), (LP1)object4);
                f12 = 0.0f;
                object5 = null;
                object6 = HA.e((Nc)object14, false);
                n19 = ((j30_0)object10).P;
                object7 = ((j30_0)object10).P();
                lP12 = a30_0.c((b30_0)object10, lP12);
                boolean bl5 = mp2 instanceof mp;
                if (!bl5) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object10).A();
                bl5 = ((j30_0)object10).O;
                if (bl5) {
                    ((j30_0)object10).C((Function0)object2);
                } else {
                    ((j30_0)object10).n();
                }
                Ow3.a((b30_0)object10, object6, n20$a$b);
                Ow3.a((b30_0)object10, object7, (Function2)object);
                boolean bl6 = ((j30_0)object10).O;
                if (bl6 || !(bl6 = Intrinsics.areEqual(object6 = ((j30_0)object10).v(), object7 = Integer.valueOf(n19)))) {
                    rk_0.a(n19, (j30_0)object10, n19, (N20$a$a)object13);
                }
                Ow3.a((b30_0)object10, lP12, (Function2)object3);
                object5 = n14 >> 6 & 0xE;
                ((u10)object12).invoke(object10, object5);
                ((j30_0)object10).T(true);
                n19 = 0;
                f12 = 0.0f;
                object5 = null;
                ((j30_0)object10).T(false);
            } else {
                n19 = 0;
                f12 = 0.0f;
                object5 = null;
                int n21 = 71034290;
                ((j30_0)object10).K(n21);
                ((j30_0)object10).T(false);
            }
            object5 = (up1_0)androidx.compose.ui.layout.a.b("TextField");
            object4 = kp1_0.a((LP1)object5, (LP1)object4);
            f12 = Float.MIN_VALUE;
            object6 = HA.e((Nc)object14, true);
            n19 = ((j30_0)object10).P;
            object7 = ((j30_0)object10).P();
            object4 = a30_0.c((b30_0)object10, (LP1)object4);
            n7 = mp2 instanceof mp;
            if (n7 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n7 = ((j30_0)object10).O ? 1 : 0;
            if (n7 != 0) {
                ((j30_0)object10).C((Function0)object2);
            } else {
                ((j30_0)object10).n();
            }
            Ow3.a((b30_0)object10, object6, n20$a$b);
            Ow3.a((b30_0)object10, object7, (Function2)object);
            boolean bl7 = ((j30_0)object10).O;
            if (bl7 || !(bl7 = Intrinsics.areEqual(object2 = ((j30_0)object10).v(), object6 = Integer.valueOf(n19)))) {
                rk_0.a(n19, (j30_0)object10, n19, (N20$a$a)object13);
            }
            Ow3.a((b30_0)object10, object4, (Function2)object3);
            object2 = n14 >> 3 & 0xE;
            object3 = function2;
            function2.invoke(object10, object2);
            bl7 = true;
            ((j30_0)object10).T(bl7);
            ((j30_0)object10).T(bl7);
        }
        object9 = ((j30_0)object10).X();
        if (object9 != null) {
            object10 = object;
            object2 = lP1;
            object3 = function2;
            object4 = u102;
            object5 = u103;
            object6 = u104;
            object7 = u105;
            n7 = n3;
            f7 = f5;
            object8 = mk2_02;
            n8 = n4;
            ((CF2)object9).d = object = new Ek3(lP1, function2, u102, u103, u104, u105, n3 != 0, f5, mk2_02, n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final int b(int n3, boolean bl2, int n4, int n7, int n8, int n10, long l2, float f5, mk2_0 mk2_02) {
        void var6_8;
        void var4_6;
        void var3_5;
        float f6;
        int n14;
        void var5_7;
        void var9_10;
        void var8_9;
        float f7 = a * var8_9;
        float f8 = var9_10.calculateTopPadding-D9Ej5fM() * var8_9;
        float f11 = var9_10.calculateBottomPadding-D9Ej5fM() * var8_9;
        n3 = Math.max(n3, (int)var5_7);
        if (bl2) {
            f6 = (float)n14 + f7;
            float f12 = n3;
            f6 = f6 + f12 + f11;
        } else {
            float f14 = n3;
            f6 = (f8 += f14) + f11;
        }
        n3 = ok1_1.b(f6);
        int n15 = Math.max((int)var3_5, (int)var4_6);
        n14 = c60.j((long)var6_8);
        int n16 = Math.max(n15, n14);
        return Math.max(n3, n16);
    }
}

