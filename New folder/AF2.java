/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class AF2 {
    /*
     * WARNING - void declaration
     */
    public static final void a(LP1 lP1, Object object, i70_0 i70_02, rp2_0 rp2_02, boolean bl2, b30_0 b30_02, int n3, int n4) {
        void var15_18;
        Object object2;
        Object object3;
        LP1 lP12 = lP1;
        Object object4 = object;
        i70_0 i70_03 = i70_02;
        rp2_0 rp2_03 = rp2_02;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(object, "imageModel");
        Intrinsics.checkNotNullParameter(i70_02, "contentScale");
        Intrinsics.checkNotNullParameter(rp2_02, "shape");
        int n8 = -1412381217;
        Object object5 = b30_02.g(n8);
        int bl3 = n4 & 0x20;
        u10 u102 = null;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        int n10 = -1204175974;
        ((j30_0)object5).K(n10);
        Object object6 = ((j30_0)object5).v();
        Object object7 = b30$a.a;
        if (object6 == object7) {
            object6 = J83.g(Boolean.TRUE);
            ((j30_0)object5).o(object6);
        }
        Object object8 = object6;
        object8 = (tr1_0)object6;
        ((j30_0)object5).T(false);
        FillElement fillElement = j.c;
        object6 = lP12.then(fillElement);
        ((j30_0)object5).K(-1204170575);
        int n14 = n7 & 0xE ^ 6;
        int n15 = 1;
        float f5 = Float.MIN_VALUE;
        int n16 = 4;
        if (n14 > n16 && (n14 = (int)(((j30_0)object5).J(lP12) ? 1 : 0)) != 0 || (n14 = n7 & 6) == n16) {
            n14 = 1;
        } else {
            n14 = 0;
            object3 = null;
        }
        n16 = 0xE000 & n7 ^ 0x6000;
        int n17 = 16384;
        if (n16 > n17 && (n16 = (int)(((j30_0)object5).J(rp2_03) ? 1 : 0)) != 0 || (n16 = n7 & 0x6000) == n17) {
            n16 = 1;
        } else {
            n16 = 0;
            object2 = null;
        }
        object2 = ((j30_0)object5).v();
        if ((n14 |= n16) != 0 || object2 == object7) {
            object2 = new jf2_1(lP12, rp2_03);
            ((j30_0)object5).o(object2);
        }
        object2 = (Function1)object2;
        ((j30_0)object5).T(false);
        object3 = x20_0.a((LP1)object6, n15 != 0, (Function1)object2, null);
        object6 = Nc$a.e;
        he1_2 he1_22 = new he1_2((Gx)object6, null, i70_03, 122);
        int n18 = 1;
        object6 = new fe2_1(object4, n18);
        rf2_1 rf2_12 = rf2_1.a;
        u10 u103 = d20_0.a;
        object7 = new sf2_0((tr1_0)object8);
        u10 u104 = v10.c(-508610016, (fx0_2)object7, (b30_0)object5);
        int n19 = 0x6000000;
        int n20 = 6;
        int n21 = 728;
        object7 = object3;
        object3 = rf2_12;
        n15 = 0;
        rf2_12 = null;
        f5 = 0.0f;
        n16 = 0;
        object2 = null;
        FillElement fillElement2 = fillElement;
        fillElement = null;
        Object object9 = object8;
        object8 = null;
        u102 = u103;
        u103 = null;
        vw_1.b((Function0)object6, (LP1)object7, (Function2)object3, null, null, he1_22, null, null, u102, null, u104, (b30_0)object5, n19, n20, n21);
        if (var15_18 != false && (n10 = (int)(((Boolean)(object6 = (Boolean)object9.getValue())).booleanValue() ? 1 : 0)) != 0) {
            object6 = fillElement2;
            object6 = lP12.then(fillElement2);
            long l2 = nz_1.i;
            n15 = 1058642330;
            f5 = 0.6f;
            l2 = OX.b(l2, f5);
            object6 = QV.a(a.b((LP1)object6, l2, rp2_03), rp2_03);
            n18 = 0;
            object7 = null;
            HA.a((LP1)object6, (b30_0)object5, 0);
        }
        if ((object7 = ((j30_0)object5).X()) != null) {
            object5 = object3;
            lP12 = lP1;
            object4 = object;
            i70_03 = i70_02;
            rp2_03 = rp2_02;
            n7 = n3;
            n10 = n4;
            ((CF2)object7).d = object3 = new mf2_1(lP1, object, i70_02, rp2_02, (boolean)var15_18, n3, n4);
        }
    }

    public static final void b(LP1 lP1, wk0_2 wk0_22, Component component, b30_0 b30_02, int n3) {
        wk0_2 wk0_23 = wk0_22;
        Component component2 = component;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(wk0_22, "onItemClick");
        Object object = "component";
        Intrinsics.checkNotNullParameter(component, (String)object);
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(1280698244);
        LP1$a lP1$a = LP1$a.b;
        object2 = component.getSubcomponent();
        j30_02.K(-382184534);
        boolean bl2 = j30_02.J(object2);
        Object object3 = j30_02.v();
        if (bl2 || object3 == (object = b30$a.a)) {
            int n7 = 4;
            object3 = new ia_2(object2, n7);
            j30_02.o(object3);
        }
        object3 = (Function0)object3;
        boolean bl3 = false;
        j30_02.T(false);
        Object object4 = El2.b((Function0)object3, j30_02);
        object3 = AndroidCompositionLocals_androidKt.a;
        object3 = (Configuration)j30_02.j((H30)object3);
        int n8 = ((Configuration)object3).screenWidthDp;
        double d2 = (double)n8 * 0.75;
        float f5 = (float)d2;
        long l2 = 4605380978949069210L;
        double d5 = 0.8;
        float f6 = (float)(d2 *= d5);
        float f7 = f5 - f6;
        Object object5 = new zl2(5);
        Object object6 = yk2_0.a((hm0_0)object4, (zl2)object5, j30_02, 0, 28);
        float f8 = uq0_0.o;
        int n10 = 13;
        float f11 = 1.8E-44f;
        object5 = lP1$a;
        float f12 = f8;
        float f14 = f8;
        f8 = f11;
        object5 = h.i(lP1$a, 0.0f, f12, 0.0f, 0.0f, n10);
        float f15 = 1.0f;
        object5 = j.c((LP1)object5, f15);
        long l3 = nz_1.a;
        Object object7 = fg2_1.a;
        object5 = a.b((LP1)object5, l3, (i13)object7);
        Object object8 = zp.c;
        Object object9 = Nc$a.m;
        object = oZ.a((zp$l)object8, (Gx$a)object9, j30_02, 0);
        int n14 = j30_02.P;
        object9 = j30_02.P();
        object5 = a30_0.c(j30_02, (LP1)object5);
        N20.W.getClass();
        object7 = N20$a.b;
        Object object10 = j30_02.a;
        boolean bl4 = object10 instanceof mp;
        if (bl4) {
            j30_02.A();
            bl4 = j30_02.O;
            if (bl4) {
                j30_02.C((Function0)object7);
            } else {
                j30_02.n();
            }
            object7 = N20$a.e;
            Ow3.a(j30_02, object, (Function2)object7);
            object = N20$a.d;
            Ow3.a(j30_02, object9, (Function2)object);
            object = N20$a.f;
            boolean bl5 = j30_02.O;
            if (bl5 || !(bl5 = Intrinsics.areEqual(object9 = j30_02.v(), object7 = Integer.valueOf(n14)))) {
                rk_0.a(n14, j30_02, n14, (N20$a$a)object);
            }
            object = N20$a.c;
            Ow3.a(j30_02, object5, (Function2)object);
            object = component.getHeading();
            if (object == null) {
                object = "";
            }
            object8 = object;
            int n15 = n4 & 0xE;
            long l4 = 0L;
            l2 = 0L;
            d5 = 0.0;
            object5 = lP1$a;
            Object object11 = j30_02;
            AF2.d(lP1$a, (String)object, l2, l4, 0, j30_02, n15);
            object8 = h.f(lP1$a, f14, f14);
            object7 = object;
            object = new ok2$b_0(f5);
            f8 = uq0_0.k;
            object = object5;
            object11 = object4;
            object4 = wk0_22;
            object10 = j30_02;
            object5 = new zf2_2((p83_0)object2, f5, wk0_22, f7, f6);
            u10 u102 = v10.c(-1643977060, (fx0_2)object5, j30_02);
            int n16 = 196608;
            bl5 = false;
            f12 = 0.0f;
            object9 = null;
            object2 = j30_02;
            bl4 = false;
            object10 = null;
            object3 = lP1$a;
            f6 = 0.0f;
            n15 = 0;
            f7 = 0.0f;
            int n17 = 3072;
            int n18 = 8020;
            object5 = object11;
            object11 = object6;
            object6 = j30_02;
            jl2.a((hm0_0)object5, (LP1)object8, null, (ok2_0)object7, 0, f8, null, (pi3_0)object11, false, false, null, null, null, u102, j30_02, n16, n17, n18);
            boolean bl6 = true;
            j30_02.T(bl6);
            object = j30_02.X();
            if (object != null) {
                ((CF2)object).d = object2 = new of2_1(lP1$a, wk0_23, component2, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(LP1 lP1, String string2, long l2, int n3, tv0_0 tv0_02, RU0 rU0, long l3, int n4, int n7, b30_0 b30_02, int n8, int n10) {
        Object object;
        Object object2;
        int n14;
        int n15;
        int n16;
        long l4;
        int n17;
        int n18;
        int n19;
        int n20;
        Object object3;
        Object object4;
        int n21;
        Object object5;
        block14: {
            object5 = string2;
            n21 = n8;
            object4 = "text";
            Intrinsics.checkNotNullParameter(string2, (String)object4);
            object3 = b30_02.g(976753910);
            n20 = n8 & 0xE;
            n19 = 2;
            if (n20 == 0) {
                n20 = (int)(((j30_0)object3).J(lP1) ? 1 : 0);
                n20 = n20 != 0 ? 4 : 2;
                n20 |= n21;
            } else {
                n20 = n8;
            }
            n18 = n21 & 0x70;
            if (n18 == 0) {
                n18 = (int)(((j30_0)object3).J(object5) ? 1 : 0);
                n18 = n18 != 0 ? 32 : 16;
                n20 |= n18;
            }
            if ((n18 = n10 & 4) != 0) {
                n20 |= 0x180;
            } else {
                n17 = n21 & 0x380;
                if (n17 == 0) {
                    l4 = l2;
                    n16 = (int)(((j30_0)object3).d(l2) ? 1 : 0);
                    n16 = n16 != 0 ? 256 : 128;
                }
            }
            l4 = l2;
            break block14;
            n20 |= n16;
        }
        n16 = n21 & 0x1C00;
        if (n16 == 0) {
            n20 |= 0x400;
        }
        if ((n16 = 0xE000 & n21) == 0) {
            n15 = ((j30_0)object3).J(tv0_02);
            n15 = n15 != 0 ? 16384 : 8192;
            n20 |= n15;
        }
        n20 |= 0x30000;
        n15 = 0x380000;
        int n22 = n21 & n15;
        if (n22 == 0) {
            n22 = (int)(((j30_0)object3).d(l3) ? 1 : 0);
            n22 = n22 != 0 ? 0x100000 : 524288;
            n20 |= n22;
        }
        if ((n22 = 0xB6DB6DB & (n20 |= 0x6C00000)) == (n14 = 0x2492492) && (n22 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
            n16 = n3;
            n22 = n4;
            n14 = n7;
            object2 = object3;
            object3 = rU0;
        } else {
            long l7;
            int n24;
            long l8;
            int n25;
            int n26;
            RU0 rU02;
            ((j30_0)object3).r0();
            n22 = n21 & 1;
            if (n22 != 0 && (n22 = (int)(((j30_0)object3).c0() ? 1 : 0)) == 0) {
                ((j30_0)object3).D();
                n20 &= 0xFFFFE3FF;
                rU02 = rU0;
                n26 = n4;
                n25 = n7;
                l8 = l4;
                n24 = n3;
            } else {
                l7 = n18 != 0 ? oj3_2.c : l4;
                n20 &= 0xFFFFE3FF;
                av0_0 av0_02 = y20_0.a;
                n22 = 1;
                n14 = 0;
                l8 = l7;
                rU02 = av0_02;
                n24 = 0;
                av0_02 = null;
                n26 = 1;
                n25 = 2;
            }
            ((j30_0)object3).U();
            object = new nV0(n24);
            n19 = n20 >> 3 & 0xE;
            n17 = n20 << 3;
            n22 = n17 & 0x70;
            n19 |= n22;
            n22 = n20 >> 12;
            n14 = n22 & 0x380;
            n19 |= n14;
            n14 = n17 & 0x1C00;
            n19 |= n14;
            n14 = 0x70000 & n17;
            int n27 = (n19 |= n14) | (n17 &= n15);
            n20 = n20 >> 21 & 0x70;
            n19 = n22 & 0x1C00;
            int n28 = n20 | n19;
            long l12 = 0L;
            long l14 = 0L;
            int n29 = 120704;
            object4 = string2;
            l7 = l3;
            object2 = object3;
            object3 = tv0_02;
            Ll3.b(string2, lP1, l3, l8, (nV0)object, tv0_02, rU02, l12, null, null, l14, n25, false, n26, 0, null, null, (b30_0)object2, n27, n28, n29);
            l4 = l8;
            object3 = rU02;
            n22 = n26;
            n14 = n25;
            n16 = n24;
        }
        CF2 cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object4 = object5;
            object = string2;
            cF2.d = object5 = new qf2_1(lP1, string2, l4, n16, tv0_02, (RU0)object3, l3, n22, n14, n8, n10);
        }
    }

    public static final void d(LP1 lP1, String string2, long l2, long l3, int n3, b30_0 b30_02, int n4) {
        Object object;
        int n7;
        Object object2;
        int n8;
        long l4;
        long l7;
        float f5;
        LP1 lP12 = lP1;
        Object object3 = string2;
        int n10 = n4;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        String string3 = "title";
        Intrinsics.checkNotNullParameter(string2, string3);
        Object object4 = b30_02;
        Object object5 = b30_02.g(938556444);
        int n14 = n4 & 0xE;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object5).J(lP1) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n10;
        } else {
            n14 = n4;
        }
        int n15 = n10 & 0x70;
        if (n15 == 0) {
            n15 = (int)(((j30_0)object5).J(object3) ? 1 : 0);
            if (n15 != 0) {
                n15 = 32;
                f5 = 4.5E-44f;
            } else {
                n15 = 16;
                f5 = 2.2E-44f;
            }
            n14 |= n15;
        }
        n15 = n14 | 0x180;
        int n16 = n10 & 0x1C00;
        if (n16 == 0) {
            n15 = n14 | 0x580;
        }
        if ((n14 = 0xE000 & n10) == 0) {
            n15 |= 0x2000;
        }
        n14 = 0xB6DB & n15;
        n16 = 9362;
        float f6 = 1.3119E-41f;
        if (n14 == n16 && (n14 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
            l7 = l2;
            l4 = l3;
            n8 = n3;
            object2 = object5;
        } else {
            long l8;
            long l12;
            ((j30_0)object5).r0();
            n14 = n10 & 1;
            n16 = -64513;
            f6 = 0.0f / 0.0f;
            if (n14 != 0 && (n14 = (int)(((j30_0)object5).c0() ? 1 : 0)) == 0) {
                ((j30_0)object5).D();
                n14 = n15 & n16;
                l12 = l2;
                l8 = l3;
                n7 = n3;
            } else {
                l4 = oj3_2.i;
                long l14 = nz_1.b;
                n14 = n15 & n16;
                n15 = 1;
                f5 = Float.MIN_VALUE;
                l12 = l4;
                l8 = l14;
                n7 = 1;
            }
            ((j30_0)object5).U();
            Object object6 = y20_0.b;
            tv0_0 tv0_02 = tv0_0.e;
            n15 = 1065353216;
            f5 = 1.0f;
            object4 = j.c(lP12, f5);
            f6 = uq0_0.o;
            n3 = 0;
            int n17 = 8;
            object4 = h.i((LP1)object4, f6, f6, f6, 0.0f, n17);
            nV0 nV02 = new nV0(n7);
            n16 = n14 >> 3 & 0xE;
            int n18 = 0x1B0000;
            n14 = n14 << 3 & 0x1C00;
            int n19 = (n16 |= n18) | n14;
            long l15 = 0L;
            long l16 = 0L;
            int n20 = 130944;
            string3 = string2;
            object2 = nV02;
            object2 = object5;
            object5 = tv0_02;
            object = object6;
            object6 = object2;
            Ll3.b(string2, (LP1)object4, l8, l12, nV02, tv0_02, (RU0)object, l15, null, null, l16, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
            l7 = l12;
            l4 = l8;
            n8 = n7;
        }
        object5 = ((j30_0)object2).X();
        if (object5 != null) {
            object3 = object;
            lP12 = lP1;
            string3 = string2;
            n7 = n4;
            object = new pf2_0(lP1, string2, l7, l4, n8, n4);
            ((CF2)object5).d = object;
        }
    }

    public static final void e(String string2, int n3, b30_0 object, int n4) {
        Object object2 = "thumbnailUrl";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object = object.g(-61694676);
        int n7 = n4 & 0xE;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n4;
        }
        int n8 = n4 & 0x70;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).c(n3) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        n8 = n7 & 0x5B;
        int n10 = 18;
        float f5 = 2.5E-44f;
        if (n8 == n10 && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            LP1 lP1 = LP1$a.b;
            n10 = 1065353216;
            lP1 = j.c(lP1, 1.0f);
            f5 = n3;
            lP1 = j.d(lP1, f5);
            i70$a$a i70$a$a = i70$a.a;
            f5 = uq0_0.e;
            rp2_0 rp2_02 = SP2.a(f5);
            n7 = n7 << 3 & 0x70;
            int n14 = n7 | 0xD80;
            int n15 = 32;
            AF2.a(lP1, string2, i70$a$a, rp2_02, false, (b30_0)object, n14, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new nf2_2(string2, n3, n4);
        }
    }
}

