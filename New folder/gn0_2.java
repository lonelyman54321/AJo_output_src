/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.bonanza.model.IFilter;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gN0
 */
public final class gn0_2 {
    public static final void a(ob0_1 ob0_12, yT1 yT12, b30_0 b30_02, int n3) {
        Object object;
        Object object2 = ob0_12;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n4 = 1196939415;
        Object object3 = b30_02;
        j30_0 j30_02 = b30_02.g(n4);
        Object object4 = object = ob0_12.m.getValue();
        object4 = (p83_0)object;
        Object object5 = object = ob0_12.n.getValue();
        object5 = (IFilter)object;
        object = j30_02.v();
        object3 = b30$a.a;
        if (object == object3) {
            object = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        i90_0 i90_02 = ((Q30)object).a;
        LP1$a lP1$a = LP1$a.b;
        object = j.c;
        float f5 = 80;
        Object object6 = null;
        int n7 = 7;
        object = h.i((LP1)object, 0.0f, 0.0f, 0.0f, f5, n7);
        object3 = Nc$a.a;
        boolean bl2 = false;
        Object object7 = null;
        object3 = HA.e((Nc)object3, false);
        int n8 = j30_02.P;
        Object object8 = j30_02.P();
        object = a30_0.c(j30_02, (LP1)object);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = j30_02.a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            Object object9;
            j30_02.A();
            bl3 = j30_02.O;
            if (bl3) {
                j30_02.C(xp1$a);
            } else {
                j30_02.n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a(j30_02, object3, n20$a$b);
            object3 = N20$a.d;
            Ow3.a(j30_02, object8, (Function2)object3);
            object8 = N20$a.f;
            boolean bl4 = j30_02.O;
            if (bl4 || !(bl2 = Intrinsics.areEqual(object9 = j30_02.v(), object7 = Integer.valueOf(n8)))) {
                rk_0.a(n8, j30_02, n8, (N20$a$a)object8);
            }
            object7 = N20$a.c;
            Ow3.a(j30_02, object, (Function2)object7);
            object = zp.a;
            object6 = Nc$a.j;
            bl4 = false;
            object = iQ2.a((zp$e)object, (Gx$b)object6, j30_02, 0);
            n8 = j30_02.P;
            object9 = j30_02.P();
            object2 = a30_0.c(j30_02, lP1$a);
            boolean bl5 = mp2 instanceof mp;
            if (bl5) {
                j30_02.A();
                bl5 = j30_02.O;
                if (bl5) {
                    j30_02.C(xp1$a);
                } else {
                    j30_02.n();
                }
                Ow3.a(j30_02, object, n20$a$b);
                Ow3.a(j30_02, object9, (Function2)object3);
                n4 = (int)(j30_02.O ? 1 : 0);
                if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object = j30_02.v(), object3 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    rk_0.a(n8, j30_02, n8, (N20$a$a)object8);
                }
                Ow3.a(j30_02, object2, (Function2)object7);
                object2 = mq2_0.a;
                bl5 = true;
                object = ((mq2_0)object2).a(lP1$a, 0.35f, bl5);
                object3 = object4;
                object7 = object5;
                object6 = ob0_12;
                object8 = j30_02;
                gn0_2.d((LP1)object, (p83_0)object4, (IFilter)object5, ob0_12, j30_02, 4608);
                object = ((mq2_0)object2).a(lP1$a, 0.65f, bl5);
                n7 = 4608;
                gn0_2.c((LP1)object, (p83_0)object4, (IFilter)object5, ob0_12, j30_02, n7);
                j30_02.T(bl5);
                j30_02.T(bl5);
                n4 = 584;
                i90_02 = (c80)i90_02;
                object3 = ob0_12;
                gn0_2.b(n4, j30_02, (c80)i90_02, ob0_12, yT13);
                object = Boolean.TRUE;
                n8 = 0;
                object6 = null;
                object7 = new gN0$a(ob0_12, null);
                ly0_0.d(j30_02, object, (Function2)object7);
                object = j30_02.X();
                if (object != null) {
                    n8 = 0;
                    object6 = null;
                    ((CF2)object).d = object7 = new ym0_2(ob0_12, n3, 0, yT13);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void b(int n3, b30_0 b30_02, c80 c802, ob0_1 ob0_12, yT1 yT12) {
        Object object = c802;
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Intrinsics.checkNotNullParameter(c802, "coroutineScope");
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n4 = 439147014;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n4);
        object2 = Nc$a.h;
        LP1$a lP1$a = LP1$a.b;
        Object object4 = j.c;
        float f5 = 4;
        object4 = h.i((LP1)object4, 0.0f, 0.0f, 0.0f, f5, 7);
        Object object5 = null;
        object2 = HA.e((Nc)object2, false);
        int n7 = ((j30_0)object3).P;
        Object object6 = ((j30_0)object3).P();
        object4 = a30_0.c((b30_0)object3, (LP1)object4);
        N20.W.getClass();
        Object object7 = N20$a.b;
        mp mp2 = ((j30_0)object3).a;
        int n8 = mp2 instanceof mp;
        Object object8 = null;
        if (n8 != 0) {
            Object object9;
            Object object10;
            ((j30_0)object3).A();
            n8 = ((j30_0)object3).O;
            if (n8 != 0) {
                ((j30_0)object3).C((Function0)object7);
            } else {
                ((j30_0)object3).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object3, object2, n20$a$b);
            object2 = N20$a.d;
            Ow3.a((b30_0)object3, object6, (Function2)object2);
            object6 = N20$a.f;
            int n10 = ((j30_0)object3).O;
            if (n10 != 0 || (n10 = Intrinsics.areEqual(object10 = ((j30_0)object3).v(), object9 = Integer.valueOf(n7))) == 0) {
                rk_0.a(n7, (j30_0)object3, n7, (N20$a$a)object6);
            }
            object5 = N20$a.c;
            Ow3.a((b30_0)object3, object4, (Function2)object5);
            object4 = Nc$a.k;
            object10 = zp.g;
            int n14 = 54;
            float f6 = 7.6E-44f;
            object4 = iQ2.a((zp$e)object10, (Gx$b)object4, (b30_0)object3, n14);
            n10 = ((j30_0)object3).P;
            object9 = ((j30_0)object3).P();
            Object object11 = a30_0.c((b30_0)object3, lP1$a);
            int n15 = mp2 instanceof mp;
            if (n15 != 0) {
                ((j30_0)object3).A();
                n15 = ((j30_0)object3).O;
                if (n15 != 0) {
                    ((j30_0)object3).C((Function0)object7);
                } else {
                    ((j30_0)object3).n();
                }
                Ow3.a((b30_0)object3, object4, n20$a$b);
                Ow3.a((b30_0)object3, object9, (Function2)object2);
                int n16 = ((j30_0)object3).O;
                if (n16 != 0 || (n16 = Intrinsics.areEqual(object2 = ((j30_0)object3).v(), object4 = Integer.valueOf(n10))) == 0) {
                    rk_0.a(n10, (j30_0)object3, n10, (N20$a$a)object6);
                }
                Ow3.a((b30_0)object3, object11, (Function2)object5);
                object11 = mq2_0.a;
                n16 = R$string.clear_filters;
                object8 = nk_0.f((b30_0)object3, n16);
                f6 = 8;
                object2 = j.c(h.e(lP1$a, f6), 1.0f);
                n8 = 1;
                float f7 = n8;
                long l2 = OX.b;
                object5 = SP2.a(f6);
                object2 = gz.a((LP1)object2, f7, l2, (i13)object5);
                f7 = 0.45f;
                LP1 lP1 = ((mq2_0)object11).a((LP1)object2, f7, n8 != 0);
                object2 = GE.a;
                long l3 = OX.f;
                int n17 = 6;
                float f8 = 8.4E-45f;
                object7 = object3;
                n15 = n17;
                f5 = f8;
                n8 = 14;
                object6 = GE.a(l3, 0L, (b30_0)object3, n17, n8);
                object7 = new zm0_2((c80)object, ob0_13);
                int n18 = 196614;
                object4 = object8;
                object5 = lP1;
                object8 = object3;
                n10 = n18;
                pe_1.a(true, (String)object4, lP1, (ol0)object6, (Function0)object7, l2, (b30_0)object3, n18, 0);
                n16 = R$string.apply_filters;
                object8 = nk_0.f((b30_0)object3, n16);
                object = j.c(h.e(lP1$a, f6), 1.0f);
                boolean bl2 = true;
                object = ((mq2_0)object11).a((LP1)object, 0.65f, bl2);
                n8 = 14;
                long l4 = 0L;
                object7 = object3;
                object6 = GE.a(l2, l4, (b30_0)object3, n17, n8);
                object11 = c802;
                object7 = new an0_2(c802, ob0_13, yT13);
                n14 = 0;
                f6 = 0.0f;
                object9 = null;
                n16 = 1;
                n10 = 196614;
                object4 = object8;
                object5 = object;
                object8 = object3;
                pe_1.a(n16 != 0, (String)object4, (LP1)object, (ol0)object6, (Function0)object7, l3, (b30_0)object3, n10, 0);
                object = fn0_2.a((j30_0)object3, bl2, bl2);
                if (object != null) {
                    n16 = n3;
                    ((CF2)object).d = object3 = new bn0_2(n3, c802, ob0_13, yT13);
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final void c(LP1 lP1, p83_0 p83_02, IFilter iFilter, ob0_1 ob0_12, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(p83_02, "filters");
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n4 = -1242387131;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        Object object3 = jt1.a((b30_0)object2);
        object = j.c;
        object = lP1.then((LP1)object);
        long l2 = OX.f;
        Object object4 = fg2_1.a;
        LP1 lP12 = a.b((LP1)object, l2, (i13)object4);
        float f5 = 4;
        int n7 = 14;
        object4 = h.i(lP12, f5, 0.0f, 0.0f, 0.0f, n7);
        object = null;
        en0_2 en0_22 = new en0_2(iFilter, 0, ob0_12, p83_02);
        vm0_1 vm0_12 = null;
        lP12 = null;
        f5 = 0.0f;
        int n8 = 252;
        xq1_0.a((LP1)object4, (ft1_2)object3, null, false, null, null, null, false, en0_22, (b30_0)object2, 0, n8);
        object3 = ((j30_0)object2).X();
        if (object3 != null) {
            object2 = vm0_12;
            object = iFilter;
            vm0_12 = new vm0_1(lP1, p83_02, iFilter, ob0_12, n3);
            ((CF2)object3).d = vm0_12;
        }
    }

    public static final void d(LP1 lP1, p83_0 p83_02, IFilter iFilter, ob0_1 ob0_12, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(p83_02, "filters");
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n4 = -1646464730;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        Object object3 = jt1.a((b30_0)object2);
        object = j.c;
        object = lP1.then((LP1)object);
        long l2 = xx_1.m;
        Object object4 = fg2_1.a;
        LP1 lP12 = a.b((LP1)object, l2, (i13)object4);
        float f5 = 4;
        int n7 = 14;
        object4 = h.i(lP12, f5, 0.0f, 0.0f, 0.0f, n7);
        object = null;
        cn0_2 cn0_22 = new cn0_2(p83_02, 0, iFilter, ob0_12);
        dn0_2 dn0_22 = null;
        lP12 = null;
        f5 = 0.0f;
        int n8 = 252;
        xq1_0.a((LP1)object4, (ft1_2)object3, null, false, null, null, null, false, cn0_22, (b30_0)object2, 0, n8);
        object3 = ((j30_0)object2).X();
        if (object3 != null) {
            object2 = dn0_22;
            object = iFilter;
            dn0_22 = new dn0_2(lP1, p83_02, iFilter, ob0_12, n3);
            ((CF2)object3).d = dn0_22;
        }
    }

    public static final void e(ob0_1 ob0_12, yT1 yT12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n4 = -1282236388;
        object = object.g(n4);
        Object object2 = ((j30_0)object).v();
        b30$a$a b30$a$a = b30$a.a;
        if (object2 == b30$a$a) {
            object2 = Qx2.a(ly0_0.f(f.a, (b30_0)object), (j30_0)object);
        }
        object2 = ((Q30)object2).a;
        int bl2 = R$string.coupon_filters_title;
        String string2 = nk_0.f((b30_0)object, bl2);
        object2 = (c80)object2;
        WM0 wM0 = new WM0((c80)object2, ob0_12, yT12);
        object2 = new gN0$e(ob0_12, yT12);
        u10 u102 = v10.c(2017534987, (fx0_2)object2, (b30_0)object);
        boolean bl3 = true;
        int n7 = 1572934;
        int n8 = 12;
        ro3_0.c(bl3, ob0_12, null, null, string2, wM0, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new xm0_1(ob0_12, yT12, n3);
        }
    }
}

