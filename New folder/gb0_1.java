/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import java.io.Serializable;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gb0
 */
public final class gb0_1 {
    public static final void a(String string2, st_1 st_12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(string2, "buttonText");
        Object object2 = "onButtonClicked";
        Intrinsics.checkNotNullParameter(st_12, (String)object2);
        object = object.g(1553693064);
        int n4 = n3 & 0xE;
        boolean bl2 = true;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x70;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n3 & 0x380) == 0) {
            n7 = (int)(((j30_0)object).x(st_12) ? 1 : 0);
            n7 = n7 != 0 ? 256 : 128;
            n4 |= n7;
        }
        n7 = n4 & 0x2DB;
        int n8 = 146;
        float f5 = 2.05E-43f;
        if (n7 == n8 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object3 = LP1$a.b;
            f5 = 12;
            object3 = h.e((LP1)object3, f5);
            n8 = 1065353216;
            f5 = 1.0f;
            LP1 lP1 = j.c((LP1)object3, f5);
            n7 = n4 & 0xE | 0x180;
            int n10 = n4 & 0x70;
            n4 = n4 << 6 & 0xE000;
            int n14 = (n7 |= n10) | n4;
            n10 = 0;
            long l2 = 0L;
            int n15 = 40;
            object3 = string2;
            pe_1.a(bl2, string2, lP1, null, st_12, l2, (b30_0)object, n14, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ab0_2(string2, st_12, n3);
        }
    }

    public static final void b(ob0_1 ob0_12, boolean n3, boolean bl2, String string2, long l2, String string3, String string4, long l3, long l4, tt_2 tt_22, b30_0 b30_02, int n4) {
        int n7 = n4;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "desc");
        Intrinsics.checkNotNullParameter(string4, "buttonText");
        Intrinsics.checkNotNullParameter(tt_22, "onButtonClicked");
        int n8 = 2061628022;
        Object object = b30_02;
        Object object2 = b30_02.g(n8);
        object = j.c(LP1$a.b, 1.0f);
        int n10 = 80;
        float f5 = n10;
        object = j.d((LP1)object, f5);
        long l7 = OX.f;
        Object object3 = fg2_1.a;
        object = a.b((LP1)object, l7, (i13)object3);
        object3 = HA.e(Nc$a.h, false);
        int n14 = ((j30_0)object2).P;
        Object object4 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        N20.W.getClass();
        Serializable serializable = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C((Function0)((Object)serializable));
            } else {
                ((j30_0)object2).n();
            }
            serializable = N20$a.e;
            Ow3.a((b30_0)object2, object3, (Function2)((Object)serializable));
            object3 = N20$a.d;
            Ow3.a((b30_0)object2, object4, (Function2)object3);
            object3 = N20$a.f;
            boolean bl4 = ((j30_0)object2).O;
            if (bl4 || !(bl4 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), serializable = Integer.valueOf(n14)))) {
                rk_0.a(n14, (j30_0)object2, n14, (N20$a$a)object3);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object2, object, (Function2)object3);
            int n15 = n7 & 0x70 | 8;
            n10 = n7 & 0x380;
            n15 |= n10;
            n10 = n7 & 0x1C00;
            n15 |= n10;
            n10 = 0xE000 & n7;
            n15 |= n10;
            n10 = 0x70000 & n7;
            n15 |= n10;
            n10 = 0x380000 & n7;
            n15 |= n10;
            n10 = 0x1C00000 & n7;
            n15 |= n10;
            n10 = 0xE000000 & n7;
            n15 |= n10;
            f5 = 1.5845633E29f;
            n10 = 0x70000000 & n7;
            int n16 = n15 | n10;
            Object object5 = ob0_12;
            gb0_1.d(ob0_12, n3 != 0, bl2, string2, l2, string3, string4, l3, l4, tt_22, (b30_0)object2, n16);
            n15 = 1;
            ((j30_0)object2).T(n15 != 0);
            object5 = ((j30_0)object2).X();
            if (object5 != null) {
                za0_1 za0_12;
                object2 = za0_12;
                n15 = n3;
                n10 = (int)(bl2 ? 1 : 0);
                l7 = l2;
                n7 = n4;
                za0_12 = new za0_1(ob0_12, n3 != 0, bl2, string2, l2, string3, string4, l3, l4, tt_22, n4);
                ((CF2)object5).d = za0_12;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void c(st_1 st_12, b30_0 object, int n3) {
        block11: {
            Object object2;
            block10: {
                int n4;
                int n7;
                int n8;
                block9: {
                    object2 = "onSignInButtonClicked";
                    Intrinsics.checkNotNullParameter(st_12, (String)object2);
                    object = object.g(-439761083);
                    n8 = n3 & 0xE;
                    n7 = 2;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).x(st_12) ? 1 : 0);
                        n8 = n8 != 0 ? 4 : 2;
                        n8 |= n3;
                    } else {
                        n8 = n3;
                    }
                    n4 = n8 & 0xB;
                    if (n4 != n7 || (n7 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block9;
                    ((j30_0)object).D();
                    break block10;
                }
                Object object3 = j.c(LP1$a.b, 1.0f);
                n4 = 80;
                float f5 = n4;
                object3 = j.d((LP1)object3, f5);
                long l2 = OX.f;
                Object object4 = fg2_1.a;
                object3 = a.b((LP1)object3, l2, (i13)object4);
                Object object5 = HA.e(Nc$a.h, false);
                int n10 = ((j30_0)object).P;
                object4 = ((j30_0)object).P();
                object3 = a30_0.c((b30_0)object, (LP1)object3);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block11;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object5, (Function2)((Object)serializable));
                object5 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object5);
                object5 = N20$a.f;
                boolean bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), serializable = Integer.valueOf(n10)))) {
                    rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object, object3, (Function2)object5);
                n7 = R$string.login_signup;
                object3 = nk_0.f((b30_0)object, n7);
                n8 = n8 << 6 & 0x380 | 6;
                gb0_1.a((String)object3, st_12, (b30_0)object, n8);
                n8 = 1;
                ((j30_0)object).T(n8 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new ya0_1(st_12, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void d(ob0_1 ob0_12, boolean bl2, boolean bl3, String string2, long l2, String string3, String string4, long l3, long l4, tt_2 tt_22, b30_0 b30_02, int n3) {
        int n4;
        int n7;
        int n8;
        Object object;
        int n10;
        int n14;
        ol0 ol02;
        boolean bl4;
        Object object2;
        Object object3;
        int n15;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        Object object12;
        Object object13;
        Object object14;
        block24: {
            Object object15;
            block23: {
                float f5;
                int n16;
                Xp1$a xp1$a;
                int n17;
                int n18;
                zp$c zp$c;
                Object object16;
                float f6;
                int n19;
                Object object17;
                block21: {
                    block22: {
                        block20: {
                            object14 = ob0_12;
                            object13 = tt_22;
                            Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
                            object12 = string2;
                            Intrinsics.checkNotNullParameter(string2, "title");
                            object11 = string3;
                            Intrinsics.checkNotNullParameter(string3, "desc");
                            object10 = string4;
                            Intrinsics.checkNotNullParameter(string4, "buttonText");
                            Intrinsics.checkNotNullParameter(tt_22, "onButtonClicked");
                            int n20 = 554614597;
                            object9 = b30_02;
                            object8 = b30_02.g(n20);
                            object9 = ((j30_0)object8).v();
                            object17 = b30$a.a;
                            if (object9 == object17) {
                                object9 = Qx2.a(ly0_0.f(f.a, (b30_0)object8), (j30_0)object8);
                            }
                            object9 = ((Q30)object9).a;
                            object7 = LP1$a.b;
                            n19 = 1065353216;
                            f6 = 1.0f;
                            object16 = j.c((LP1)object7, f6);
                            zp$c = zp.d;
                            object15 = Nc$a.k;
                            n18 = 54;
                            object6 = iQ2.a(zp$c, (Gx$b)object15, (b30_0)object8, n18);
                            n17 = ((j30_0)object8).P;
                            object5 = ((j30_0)object8).P();
                            object16 = a30_0.c((b30_0)object8, (LP1)object16);
                            object4 = N20.W;
                            object4.getClass();
                            xp1$a = N20$a.b;
                            object12 = ((j30_0)object8).a;
                            boolean bl5 = object12 instanceof mp;
                            if (!bl5) {
                                s20.a();
                                throw null;
                            }
                            ((j30_0)object8).A();
                            bl5 = ((j30_0)object8).O;
                            if (bl5) {
                                ((j30_0)object8).C(xp1$a);
                            } else {
                                ((j30_0)object8).n();
                            }
                            object11 = N20$a.e;
                            Ow3.a((b30_0)object8, object6, (Function2)object11);
                            object6 = N20$a.d;
                            Ow3.a((b30_0)object8, object5, (Function2)object6);
                            object5 = N20$a.f;
                            n16 = ((j30_0)object8).O;
                            if (n16 != 0) break block20;
                            object10 = ((j30_0)object8).v();
                            object4 = object6;
                            object6 = n17;
                            n16 = Intrinsics.areEqual(object10, object6);
                            if (n16 != 0) break block21;
                            break block22;
                        }
                        object4 = object6;
                    }
                    rk_0.a(n17, (j30_0)object8, n17, (N20$a$a)object5);
                }
                object10 = N20$a.c;
                Ow3.a((b30_0)object8, object16, (Function2)object10);
                object16 = mq2_0.a;
                float f7 = 16;
                float f8 = 4;
                int n21 = 10;
                b30$a$a b30$a$a = object17;
                float f11 = f7;
                object17 = object4;
                object6 = object7;
                float f12 = f8;
                n15 = 16;
                f8 = f7;
                object4 = null;
                object3 = null;
                int n22 = n21;
                object6 = h.i((LP1)object7, f7, 0.0f, f12, 0.0f, n21);
                n17 = 1053609165;
                f8 = 0.4f;
                object6 = ((mq2_0)object16).a((LP1)object6, f8, true);
                object2 = new bb0_2(0);
                object13 = null;
                Object object18 = object16;
                int n24 = 6;
                int n25 = 0;
                float f14 = 0.0f;
                object6 = d.b((LP1)object6, false, null, (Function0)object2, n24);
                object14 = Nc$a.m;
                object14 = oZ.a(zp$c, (Gx$a)object14, (b30_0)object8, n24);
                n24 = ((j30_0)object8).P;
                object2 = ((j30_0)object8).P();
                object6 = a30_0.c((b30_0)object8, (LP1)object6);
                bl4 = object12 instanceof mp;
                if (!bl4) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object8).A();
                bl4 = ((j30_0)object8).O;
                if (bl4) {
                    ((j30_0)object8).C(xp1$a);
                } else {
                    ((j30_0)object8).n();
                }
                Ow3.a((b30_0)object8, object14, (Function2)object11);
                Ow3.a((b30_0)object8, object2, (Function2)object17);
                n25 = ((j30_0)object8).O;
                if (n25 != 0 || (n25 = Intrinsics.areEqual(object14 = ((j30_0)object8).v(), object13 = Integer.valueOf(n24))) == 0) {
                    rk_0.a(n24, (j30_0)object8, n24, (N20$a$a)object5);
                }
                Ow3.a((b30_0)object8, object6, (Function2)object10);
                n25 = 8;
                f14 = n25;
                f12 = 0.0f;
                ol02 = null;
                object3 = null;
                n17 = 0;
                f8 = 0.0f;
                object2 = null;
                n22 = 13;
                object6 = object7;
                object14 = h.i((LP1)object7, 0.0f, f14, 0.0f, 0.0f, n22);
                n24 = 54;
                object16 = iQ2.a(zp$c, (Gx$b)object15, (b30_0)object8, n24);
                int n26 = ((j30_0)object8).P;
                object15 = ((j30_0)object8).P();
                object14 = a30_0.c((b30_0)object8, (LP1)object14);
                n14 = object12 instanceof mp;
                if (n14 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object8).A();
                n14 = ((j30_0)object8).O;
                if (n14 != 0) {
                    ((j30_0)object8).C(xp1$a);
                } else {
                    ((j30_0)object8).n();
                }
                Ow3.a((b30_0)object8, object16, (Function2)object11);
                Ow3.a((b30_0)object8, object15, (Function2)object17);
                n10 = ((j30_0)object8).O;
                if (n10 != 0 || (n10 = Intrinsics.areEqual(object17 = ((j30_0)object8).v(), object12 = Integer.valueOf(n26))) == 0) {
                    rk_0.a(n26, (j30_0)object8, n26, (N20$a$a)object5);
                }
                Ow3.a((b30_0)object8, object14, (Function2)object10);
                long l7 = Em3.f(n15);
                object = tv0_0.o;
                n25 = n3 >> 9;
                n10 = n25 & 0xE | 0x30C00;
                n14 = n3 >> 6;
                n19 = n14 & 0x380;
                int n27 = n10 | n19;
                n17 = 0;
                f8 = 0.0f;
                object2 = null;
                int n28 = 0;
                n15 = 0;
                long l8 = 0L;
                long l12 = 0L;
                int n29 = 131026;
                object6 = string2;
                long l14 = l2;
                Ll3.b(string2, null, l2, l7, null, (tv0_0)object, null, l8, null, null, l12, 0, false, 0, 0, null, null, (b30_0)object8, n27, 0, n29);
                n10 = 1200814619;
                float f15 = 75252.21f;
                ((j30_0)object8).K(n10);
                if (bl2) {
                    n10 = R$drawable.ic_info;
                    n19 = 0;
                    f6 = 0.0f;
                    object5 = null;
                    object6 = km2.a(n10, (b30_0)object8, 0);
                    object9 = (c80)object9;
                    object11 = ob0_12;
                    object17 = new cb0_2((c80)object9, ob0_12);
                    n8 = 7;
                    f5 = 9.8E-45f;
                    n16 = 0;
                    object10 = null;
                    object9 = d.b((LP1)object7, false, null, (Function0)object17, n8);
                    n10 = 5;
                    f15 = n10;
                    object4 = h.e((LP1)object9, f15);
                    n22 = 0;
                    n28 = 0;
                    object2 = "";
                    f12 = 0.0f;
                    ol02 = null;
                    object3 = null;
                    n15 = 56;
                    n7 = 120;
                    object = object8;
                    Pd1.a((im2)object6, (String)object2, (LP1)object4, null, null, 0.0f, null, (b30_0)object8, n15, n7);
                } else {
                    object11 = ob0_12;
                }
                n8 = 0;
                f5 = 0.0f;
                object9 = null;
                ((j30_0)object8).T(false);
                ((j30_0)object8).T(true);
                n8 = 12;
                long l15 = Em3.f(n8);
                object = tv0_0.m;
                long l16 = xx_1.g;
                object4 = null;
                f12 = 0.0f;
                n17 = 0;
                f8 = 0.0f;
                object6 = object7;
                object2 = h.i((LP1)object7, 0.0f, 0.0f, 0.0f, f11, 7);
                n10 = n3 >> 15;
                n19 = n10 & 0xE;
                n18 = 200112;
                n27 = n19 | n18;
                n15 = 0;
                l8 = 0L;
                l12 = 0L;
                n29 = 131024;
                object6 = string3;
                l14 = l16;
                l7 = l15;
                Ll3.b(string3, (LP1)object2, l16, l15, null, (tv0_0)object, null, l8, null, null, l12, 0, false, 0, 0, null, null, (b30_0)object8, n27, 0, n29);
                n19 = 1;
                f6 = Float.MIN_VALUE;
                ((j30_0)object8).T(n19 != 0);
                f5 = n8;
                object9 = j.c(h.e((LP1)object7, f5), 1.0f);
                object10 = object18;
                object9 = ((mq2_0)object18).a((LP1)object9, 0.6f, n19 != 0);
                n22 = n3 >> 21 & 0xE;
                n28 = 14;
                l14 = 0L;
                object3 = object8;
                ol02 = GE.a(l3, l14, (b30_0)object8, n22, n28);
                ((j30_0)object8).K(399648156);
                n4 = n3 & 0x70000000;
                n16 = 0x30000000;
                n24 = 0x20000000;
                object15 = tt_22;
                bl4 = true;
                if ((n4 ^= n16) > n24 && (n4 = (int)(((j30_0)object8).J(tt_22) ? 1 : 0)) != 0 || (n4 = n3 & n16) == n24) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object7 = null;
                }
                object5 = ((j30_0)object8).v();
                if (n4 != 0) break block23;
                object7 = b30$a$a;
                if (object5 != b30$a$a) break block24;
            }
            n4 = 0;
            object7 = null;
            object5 = new db0_2(object15, 0);
            ((j30_0)object8).o(object5);
        }
        object3 = object5;
        object3 = (Function0)object5;
        n4 = 0;
        object7 = null;
        ((j30_0)object8).T(false);
        n10 = n10 & 0x70 | (n14 &= 0xE);
        n14 = 458752;
        n15 = n10 | (n25 &= n14);
        n7 = 0;
        object2 = string4;
        object4 = object9;
        object = object8;
        pe_1.a(bl3, string4, (LP1)object9, ol02, (Function0)object3, l4, (b30_0)object8, n15, 0);
        ((j30_0)object8).T(bl4);
        object2 = ((j30_0)object8).X();
        if (object2 != null) {
            object8 = object6;
            object14 = ob0_12;
            n8 = (int)(bl2 ? 1 : 0);
            n10 = (int)(bl3 ? 1 : 0);
            object12 = string2;
            object11 = string3;
            object10 = string4;
            object13 = tt_22;
            ((CF2)object2).d = object6 = new eb0_1(ob0_12, bl2, bl3, string2, l2, string3, string4, l3, l4, tt_22, n3);
        }
    }
}

