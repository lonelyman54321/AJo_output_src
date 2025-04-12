/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TM0
 */
public final class tm0_1 {
    public static final void a(Function0 function0, Function0 function02, b30_0 b30_02, int n3) {
        block20: {
            Object object;
            int n4;
            Object object2;
            Function0 function03;
            Object object3;
            block19: {
                int n7;
                float f5;
                int n8;
                int n10;
                Object object4;
                int n14;
                block18: {
                    object3 = function0;
                    function03 = function02;
                    n14 = n3;
                    Intrinsics.checkNotNullParameter(function0, "onReset");
                    Intrinsics.checkNotNullParameter(function02, "onApplyFilter");
                    int n15 = 1952809456;
                    object4 = b30_02;
                    object2 = b30_02.g(n15);
                    n4 = n3 & 0xE;
                    n10 = 4;
                    if (n4 == 0) {
                        n4 = (int)(((j30_0)object2).x(function0) ? 1 : 0);
                        n4 = n4 != 0 ? 4 : 2;
                        n4 |= n14;
                    } else {
                        n4 = n3;
                    }
                    n8 = n14 & 0x70;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object2).x(function03) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 32;
                            f5 = 4.5E-44f;
                        } else {
                            n8 = 16;
                            f5 = 2.2E-44f;
                        }
                        n4 |= n8;
                    }
                    n7 = n4;
                    n8 = 18;
                    f5 = 2.5E-44f;
                    if ((n4 &= 0x5B) != n8 || (n4 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block18;
                    ((j30_0)object2).D();
                    break block19;
                }
                Object object5 = LP1$a.b;
                long l2 = OX.f;
                object4 = fg2_1.a;
                Object object6 = a.b((LP1)object5, l2, (i13)object4);
                float f6 = 48;
                n4 = 8;
                f5 = n4;
                int n16 = 5;
                float f7 = f5;
                object4 = h.i((LP1)object6, 0.0f, f6, 0.0f, f5, n16);
                object6 = Nc$a.k;
                float f8 = 12;
                Object object7 = zp.g(f8);
                int n17 = 54;
                object6 = iQ2.a((zp$e)object7, (Gx$b)object6, (b30_0)object2, n17);
                int n18 = ((j30_0)object2).P;
                Object object8 = ((j30_0)object2).P();
                object4 = a30_0.c((b30_0)object2, (LP1)object4);
                N20.W.getClass();
                Object object9 = N20$a.b;
                Object object10 = ((j30_0)object2).a;
                boolean bl2 = object10 instanceof mp;
                if (!bl2) break block20;
                ((j30_0)object2).A();
                bl2 = ((j30_0)object2).O;
                if (bl2) {
                    ((j30_0)object2).C((Function0)object9);
                } else {
                    ((j30_0)object2).n();
                }
                object9 = N20$a.e;
                Ow3.a((b30_0)object2, object6, (Function2)object9);
                object6 = N20$a.d;
                Ow3.a((b30_0)object2, object8, (Function2)object6);
                object6 = N20$a.f;
                n17 = (int)(((j30_0)object2).O ? 1 : 0);
                if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object8 = ((j30_0)object2).v(), object9 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                    rk_0.a(n18, (j30_0)object2, n18, (N20$a$a)object6);
                }
                object6 = N20$a.c;
                Ow3.a((b30_0)object2, object4, (Function2)object6);
                mq2_0 mq2_02 = mq2_0.a;
                double d2 = 0.5;
                f7 = (float)d2;
                long l3 = xx_1.e;
                object6 = oz_0.a(l3, f7);
                n18 = 1;
                f8 = Float.MIN_VALUE;
                object4 = mq2_02.a((LP1)object5, 0.7f, n18 != 0);
                LP1 lP1 = j.d((LP1)object4, f6);
                rp2_0 rp2_02 = SP2.a(f5);
                ((j30_0)object2).K(1618635332);
                n4 = n7 & 0xE;
                if (n4 == n10) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object4 = null;
                }
                Object object11 = ((j30_0)object2).v();
                LP1$a lP1$a = object5;
                object5 = b30$a.a;
                if (n4 != 0 || object11 == object5) {
                    object11 = new lm0_2((Function0)object3);
                    ((j30_0)object2).o(object11);
                }
                object4 = object11;
                object4 = (Function0)object11;
                ((j30_0)object2).T(false);
                u10 u102 = S10.a;
                int n19 = 806879232;
                int n20 = 412;
                object11 = lP1;
                float f11 = f5;
                n8 = 0;
                f5 = 0.0f;
                rp2_0 rp2_03 = rp2_02;
                object8 = null;
                object9 = u102;
                object10 = object2;
                n16 = n19;
                object = object5;
                object3 = lP1$a;
                int n21 = n20;
                ME.b((Function0)object4, lP1, false, rp2_02, (nz)object6, null, null, u102, (b30_0)object2, n19, n20);
                object9 = oz_0.a(l3, f7);
                n17 = 14;
                long l4 = 0L;
                n18 = 6;
                f8 = 8.4E-45f;
                l2 = l4;
                object6 = object2;
                object7 = GE.a(l3, l4, (b30_0)object2, n18, n17);
                object11 = mq2_02;
                n21 = 1;
                object3 = mq2_02.a(lP1$a, 1.0f, n21 != 0);
                object11 = j.d((LP1)object3, f6);
                rp2_03 = SP2.a(f11);
                ((j30_0)object2).K(1618652842);
                int n22 = n7 & 0x70;
                n4 = 32;
                if (n22 == n4) {
                    n22 = 1;
                } else {
                    n22 = 0;
                    object3 = null;
                }
                object4 = ((j30_0)object2).v();
                if (n22 || object4 == object) {
                    n22 = 0;
                    object3 = null;
                    object4 = new mm0_0(function03, 0);
                    ((j30_0)object2).o(object4);
                }
                object4 = (Function0)object4;
                ((j30_0)object2).T(false);
                object3 = S10.b;
                n8 = 0;
                f5 = 0.0f;
                n17 = 0;
                object8 = null;
                n16 = 806879232;
                n14 = 284;
                object6 = object9;
                object9 = object3;
                object10 = object2;
                n22 = 1;
                n21 = n14;
                ME.b((Function0)object4, (LP1)object11, false, rp2_03, (nz)object6, (ol0)object7, null, (u10)object3, (b30_0)object2, n16, n14);
                ((j30_0)object2).T(n22 != 0);
            }
            object3 = ((j30_0)object2).X();
            if (object3 != null) {
                object2 = function0;
                n4 = n3;
                object = new dm0_2(function0, function03, n3);
                ((CF2)object3).d = object;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(yh0_0 yh0_02, u02_0 u02_02, w93_0 w93_02, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(yh0_02, "viewModel");
        Intrinsics.checkNotNullParameter(u02_02, "onApplyFilter");
        Intrinsics.checkNotNullParameter(w93_02, "onResetFilter");
        int n4 = -164374294;
        Object object = b30_02.g(n4);
        cm0_2 cm0_22 = new cm0_2(yh0_02, w93_02, u02_02);
        em0_1 em0_12 = null;
        int n7 = 255;
        xq1_0.a(null, null, null, false, null, null, null, false, cm0_22, (b30_0)object, 0, n7);
        CF2 cF2 = ((j30_0)object).X();
        if (cF2 != null) {
            object = em0_12;
            em0_12 = new em0_1(yh0_02, u02_02, w93_02, n3, 0);
            cF2.d = em0_12;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(yh0_0 yh0_02, b30_0 b30_02, int n3) {
        long l2;
        yh0_0 yh0_03 = yh0_02;
        Intrinsics.checkNotNullParameter(yh0_02, "viewModel");
        int n4 = -1324551798;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        int n7 = 121877155;
        ((j30_0)object2).K(n7);
        object = ((j30_0)object2).v();
        Object object3 = b30$a.a;
        if (object == object3) {
            object = yh0_02.k;
            ((j30_0)object2).o(object);
        }
        object = (tr1_0)object;
        int n8 = 0;
        Object object4 = null;
        ((j30_0)object2).T(false);
        LP1$a lP1$a = LP1$a.b;
        long l3 = OX.f;
        object3 = fg2_1.a;
        Object object5 = a.b(lP1$a, l3, (i13)object3);
        int n10 = 24;
        float f5 = 3.4E-44f;
        float f6 = n10;
        boolean bl2 = false;
        float f7 = 0.0f;
        Object object6 = null;
        tv0_0 tv0_02 = null;
        int n14 = 13;
        Object object7 = h.i((LP1)object5, 0.0f, f6, 0.0f, 0.0f, n14);
        Object object8 = Nc$a.k;
        Object object9 = zp.d;
        int n15 = 54;
        object8 = iQ2.a((zp$e)object9, (Gx$b)object8, (b30_0)object2, n15);
        int n16 = ((j30_0)object2).P;
        Object object10 = ((j30_0)object2).P();
        object7 = a30_0.c((b30_0)object2, (LP1)object7);
        N20.W.getClass();
        object5 = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        int n17 = mp2 instanceof mp;
        if (n17 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n17 = ((j30_0)object2).O;
        if (n17 != 0) {
            ((j30_0)object2).C((Function0)object5);
        } else {
            ((j30_0)object2).n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object2, object8, n20$a$b);
        object8 = N20$a.d;
        Ow3.a((b30_0)object2, object10, (Function2)object8);
        object10 = N20$a.f;
        n8 = ((j30_0)object2).O;
        if (n8 != 0 || (n8 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object6 = Integer.valueOf(n16))) == 0) {
            rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object10);
        }
        object9 = N20$a.c;
        Ow3.a((b30_0)object2, object7, (Function2)object9);
        n10 = 4;
        f5 = n10;
        object4 = h.e(lP1$a, f5);
        f7 = 20;
        object4 = j.h((LP1)object4, f7);
        long l4 = l3;
        l3 = 4602678819172646912L;
        double d2 = 0.5;
        float f8 = (float)d2;
        object6 = object9;
        Object object11 = object10;
        long l7 = xx_1.e;
        Object object12 = object9;
        object6 = SP2.a(f5);
        Object object13 = gz.a((LP1)object4, f8, l7, (i13)object6);
        object7 = SP2.a(f5);
        object7 = a.b(QV.a((LP1)object13, (i13)object7), l7, (i13)object3);
        object13 = new fm0_1(yh0_03, (tr1_0)object);
        n8 = 7;
        long l8 = l7;
        n16 = 0;
        bl2 = false;
        f7 = 0.0f;
        object7 = d.b((LP1)object7, false, null, (Function0)object13, n8);
        object13 = (Boolean)object.getValue();
        object9 = Boolean.TRUE;
        int n18 = Intrinsics.areEqual(object13, object9);
        object6 = lP1$a;
        long l12 = n18 != 0 ? l7 : l4;
        object3 = a.b((LP1)object7, l12, (i13)object3);
        object7 = Nc$a.a;
        f8 = 0.0f;
        object13 = null;
        object7 = HA.e((Nc)object7, false);
        n18 = ((j30_0)object2).P;
        object10 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        n8 = mp2 instanceof mp;
        if (n8 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n8 = (int)(((j30_0)object2).O ? 1 : 0);
        if (n8 != 0) {
            ((j30_0)object2).C((Function0)object5);
        } else {
            ((j30_0)object2).n();
        }
        Ow3.a((b30_0)object2, object7, n20$a$b);
        Ow3.a((b30_0)object2, object10, (Function2)object8);
        n10 = (int)(((j30_0)object2).O ? 1 : 0);
        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object7 = ((j30_0)object2).v(), object8 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
            rk_0.a(n18, (j30_0)object2, n18, (N20$a$a)object11);
        }
        object7 = object12;
        Ow3.a((b30_0)object2, object3, (Function2)object12);
        int n19 = 1455728147;
        float f11 = 1.0810878E14f;
        ((j30_0)object2).K(n19);
        object = (Boolean)object.getValue();
        n7 = (int)(Intrinsics.areEqual(object, object9) ? 1 : 0);
        if (n7 != 0) {
            object = rs_1.a();
            f11 = 2;
            object4 = object6;
            object7 = h.e((LP1)object6, f11);
            n15 = 0;
            object10 = null;
            n19 = 0;
            f11 = 0.0f;
            object3 = null;
            n16 = 3504;
            l3 = l4;
            object8 = object2;
            l2 = l8;
            rc1_0.a((Ke1)object, null, (LP1)object7, l4, (b30_0)object2, n16, 0);
        } else {
            object4 = object6;
            l2 = l8;
        }
        n7 = 0;
        object = null;
        ((j30_0)object2).T(false);
        bl2 = true;
        f7 = Float.MIN_VALUE;
        ((j30_0)object2).T(bl2);
        object = AndroidCompositionLocals_androidKt.b;
        object = ((Context)((j30_0)object2).j((H30)object)).getResources();
        n19 = R$string.review_with_photos;
        object10 = object.getString(n19);
        Intrinsics.checkNotNullExpressionValue(object10, "getString(...)");
        long l14 = Em3.f(12);
        tv0_02 = tv0_0.m;
        n7 = 7;
        f5 = n7;
        object8 = null;
        n18 = 0;
        f8 = 0.0f;
        object13 = null;
        n16 = 14;
        object3 = object4;
        object = h.i((LP1)object4, f5, 0.0f, 0.0f, 0.0f, n16);
        n8 = 0;
        object4 = null;
        l4 = 0L;
        int n20 = 28038;
        int n21 = 96;
        float f12 = 1.35E-43f;
        object3 = object10;
        object11 = tv0_02;
        n15 = 0;
        object10 = null;
        l12 = l4;
        object5 = object2;
        n17 = n21;
        f6 = f12;
        mm3_0.a((LP1)object, (String)object3, l2, tv0_02, l14, null, l4, (b30_0)object2, n20, n21);
        ((j30_0)object2).T(bl2);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n19 = n3;
            ((CF2)object2).d = object = new gm0_1(yh0_03, n3);
        }
    }

    public static final void d(yh0_0 yh0_02, b30_0 b30_02, int n3) {
        yh0_0 yh0_03 = yh0_02;
        Intrinsics.checkNotNullParameter(yh0_02, "viewModel");
        int n4 = 252165412;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        LP1$a lP1$a = LP1$a.b;
        object = j.c;
        long l2 = OX.f;
        Object object3 = fg2_1.a;
        object = a.b((LP1)object, l2, (i13)object3);
        Object object4 = zp.c;
        Gx$a gx$a = Nc$a.m;
        boolean bl2 = false;
        object4 = oZ.a((zp$l)object4, gx$a, (b30_0)object2, 0);
        int n7 = ((j30_0)object2).P;
        object3 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        N20.W.getClass();
        Object object5 = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C((Function0)object5);
            } else {
                ((j30_0)object2).n();
            }
            object5 = N20$a.e;
            Ow3.a((b30_0)object2, object4, (Function2)object5);
            object4 = N20$a.d;
            Ow3.a((b30_0)object2, object3, (Function2)object4);
            object4 = N20$a.f;
            bl2 = ((j30_0)object2).O;
            if (bl2 || !(bl2 = Intrinsics.areEqual(object3 = ((j30_0)object2).v(), object5 = Integer.valueOf(n7)))) {
                rk_0.a(n7, (j30_0)object2, n7, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object2, object, (Function2)object4);
            object = AndroidCompositionLocals_androidKt.b;
            object = ((Context)((j30_0)object2).j((H30)object)).getResources();
            int n8 = R$string.filters;
            String string2 = object.getString(n8);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            long l3 = xx_1.e;
            long l4 = Em3.f(16);
            float f5 = 7;
            object = lP1$a;
            object = h.i(lP1$a, f5, 0.0f, 0.0f, 0.0f, 14);
            long l7 = 0L;
            int n10 = 104;
            object4 = string2;
            int n14 = 24966;
            mm3_0.a((LP1)object, string2, l3, null, l4, null, l7, (b30_0)object2, n14, n10);
            float f6 = 8;
            object = h.e(lP1$a, f6);
            Q93.b((b30_0)object2, (LP1)object);
            object4 = jt1.a((b30_0)object2);
            object5 = zp.g(6);
            f6 = 4;
            object = h.e(lP1$a, f6);
            jm0_2 jm0_22 = new jm0_2(yh0_03, 0);
            string2 = null;
            n7 = 0;
            gx$a = null;
            bl2 = false;
            object3 = null;
            bl3 = false;
            mp2 = null;
            int n15 = 24582;
            n14 = 236;
            xq1_0.b((LP1)object, (ft1_2)object4, null, false, (zp$e)object5, null, null, false, jm0_22, (b30_0)object2, n15, n14);
            boolean bl4 = true;
            f6 = Float.MIN_VALUE;
            ((j30_0)object2).T(bl4);
            object2 = ((j30_0)object2).X();
            if (object2 != null) {
                n8 = n3;
                ((CF2)object2).d = object = new km0_1(yh0_03, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void e(yh0_0 yh0_02, b30_0 b30_02, int n3) {
        long l2;
        yh0_0 yh0_03 = yh0_02;
        Intrinsics.checkNotNullParameter(yh0_02, "viewModel");
        int n4 = -1316046726;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        int n7 = -950568493;
        ((j30_0)object2).K(n7);
        object = ((j30_0)object2).v();
        Object object3 = b30$a.a;
        if (object == object3) {
            object = yh0_02.l;
            ((j30_0)object2).o(object);
        }
        object = (tr1_0)object;
        int n8 = 0;
        Object object4 = null;
        ((j30_0)object2).T(false);
        LP1$a lP1$a = LP1$a.b;
        long l3 = OX.f;
        object3 = fg2_1.a;
        Object object5 = a.b(lP1$a, l3, (i13)object3);
        int n10 = 8;
        float f5 = 1.1E-44f;
        float f6 = n10;
        boolean bl2 = false;
        float f7 = 0.0f;
        Object object6 = null;
        tv0_0 tv0_02 = null;
        int n14 = 13;
        Object object7 = h.i((LP1)object5, 0.0f, f6, 0.0f, 0.0f, n14);
        Object object8 = Nc$a.k;
        Object object9 = zp.d;
        int n15 = 54;
        object8 = iQ2.a((zp$e)object9, (Gx$b)object8, (b30_0)object2, n15);
        int n16 = ((j30_0)object2).P;
        Object object10 = ((j30_0)object2).P();
        object7 = a30_0.c((b30_0)object2, (LP1)object7);
        N20.W.getClass();
        object5 = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        int n17 = mp2 instanceof mp;
        if (n17 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n17 = ((j30_0)object2).O;
        if (n17 != 0) {
            ((j30_0)object2).C((Function0)object5);
        } else {
            ((j30_0)object2).n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object2, object8, n20$a$b);
        object8 = N20$a.d;
        Ow3.a((b30_0)object2, object10, (Function2)object8);
        object10 = N20$a.f;
        n8 = ((j30_0)object2).O;
        if (n8 != 0 || (n8 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object6 = Integer.valueOf(n16))) == 0) {
            rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object10);
        }
        object9 = N20$a.c;
        Ow3.a((b30_0)object2, object7, (Function2)object9);
        n10 = 4;
        f5 = n10;
        object4 = h.e(lP1$a, f5);
        f7 = 20;
        object4 = j.h((LP1)object4, f7);
        long l4 = l3;
        l3 = 4602678819172646912L;
        double d2 = 0.5;
        float f8 = (float)d2;
        object6 = object9;
        Object object11 = object10;
        long l7 = xx_1.e;
        Object object12 = object9;
        object6 = SP2.a(f5);
        Object object13 = gz.a((LP1)object4, f8, l7, (i13)object6);
        object7 = SP2.a(f5);
        object7 = a.b(QV.a((LP1)object13, (i13)object7), l7, (i13)object3);
        object13 = new hm0_1(yh0_03, (tr1_0)object);
        n8 = 7;
        long l8 = l7;
        n16 = 0;
        bl2 = false;
        f7 = 0.0f;
        object7 = d.b((LP1)object7, false, null, (Function0)object13, n8);
        object13 = (Boolean)object.getValue();
        object9 = Boolean.TRUE;
        int n18 = Intrinsics.areEqual(object13, object9);
        object6 = lP1$a;
        long l12 = n18 != 0 ? l7 : l4;
        object3 = a.b((LP1)object7, l12, (i13)object3);
        object7 = Nc$a.a;
        f8 = 0.0f;
        object13 = null;
        object7 = HA.e((Nc)object7, false);
        n18 = ((j30_0)object2).P;
        object10 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        n8 = mp2 instanceof mp;
        if (n8 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n8 = (int)(((j30_0)object2).O ? 1 : 0);
        if (n8 != 0) {
            ((j30_0)object2).C((Function0)object5);
        } else {
            ((j30_0)object2).n();
        }
        Ow3.a((b30_0)object2, object7, n20$a$b);
        Ow3.a((b30_0)object2, object10, (Function2)object8);
        n10 = (int)(((j30_0)object2).O ? 1 : 0);
        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object7 = ((j30_0)object2).v(), object8 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
            rk_0.a(n18, (j30_0)object2, n18, (N20$a$a)object11);
        }
        object7 = object12;
        Ow3.a((b30_0)object2, object3, (Function2)object12);
        int n19 = -588340918;
        float f11 = -5.3734707E17f;
        ((j30_0)object2).K(n19);
        object = (Boolean)object.getValue();
        n7 = (int)(Intrinsics.areEqual(object, object9) ? 1 : 0);
        if (n7 != 0) {
            object = rs_1.a();
            f11 = 2;
            object4 = object6;
            object7 = h.e((LP1)object6, f11);
            n15 = 0;
            object10 = null;
            n19 = 0;
            f11 = 0.0f;
            object3 = null;
            n16 = 3504;
            l3 = l4;
            object8 = object2;
            l2 = l8;
            rc1_0.a((Ke1)object, null, (LP1)object7, l4, (b30_0)object2, n16, 0);
        } else {
            object4 = object6;
            l2 = l8;
        }
        n7 = 0;
        object = null;
        ((j30_0)object2).T(false);
        bl2 = true;
        f7 = Float.MIN_VALUE;
        ((j30_0)object2).T(bl2);
        object = AndroidCompositionLocals_androidKt.b;
        object = ((Context)((j30_0)object2).j((H30)object)).getResources();
        n19 = R$string.verified_purchase;
        object10 = object.getString(n19);
        Intrinsics.checkNotNullExpressionValue(object10, "getString(...)");
        long l14 = Em3.f(12);
        tv0_02 = tv0_0.m;
        n7 = 7;
        f5 = n7;
        object8 = null;
        n18 = 0;
        f8 = 0.0f;
        object13 = null;
        n16 = 14;
        object3 = object4;
        object = h.i((LP1)object4, f5, 0.0f, 0.0f, 0.0f, n16);
        n8 = 0;
        object4 = null;
        l4 = 0L;
        int n20 = 28038;
        int n21 = 96;
        float f12 = 1.35E-43f;
        object3 = object10;
        object11 = tv0_02;
        n15 = 0;
        object10 = null;
        l12 = l4;
        object5 = object2;
        n17 = n21;
        f6 = f12;
        mm3_0.a((LP1)object, (String)object3, l2, tv0_02, l14, null, l4, (b30_0)object2, n20, n21);
        ((j30_0)object2).T(bl2);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n19 = n3;
            ((CF2)object2).d = object = new im0_1(yh0_03, n3);
        }
    }
}

