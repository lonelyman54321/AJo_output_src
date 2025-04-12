/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.bonanza.model.ICoupon;
import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Qt
 */
public final class qt_0 {
    public static final void a(ob0_1 ob0_12, yT1 yT12, b30_0 b30_02, int n3) {
        lt_2 lt_22;
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n4 = 221023936;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(n4);
        Object object2 = j30_02.v();
        object = b30$a.a;
        if (object2 == object) {
            object2 = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        object2 = ((Q30)object2).a;
        Object object3 = jt1.a(j30_02);
        Object object4 = object = ob0_13.c.getValue();
        object4 = (p83_0)object;
        Intrinsics.checkNotNullParameter(object4, "availableCoupons");
        int n7 = 2;
        Object object5 = CollectionsKt.p0((Iterable)object4, n7, n7, true);
        Object object6 = object = ob0_13.d.getValue();
        object6 = (p83_0)object;
        Object object7 = object = ob0_13.f.getValue();
        object7 = (p83_0)object;
        int n8 = ((Number)ob0_13.g.getValue()).intValue();
        int n10 = ((Number)ob0_13.h.getValue()).intValue();
        boolean bl2 = (Boolean)ob0_13.e.getValue();
        boolean bl3 = (Boolean)ob0_13.i.getValue();
        boolean bl4 = (Boolean)ob0_13.k.getValue();
        Object object8 = object = ob0_13.l.getValue();
        object8 = (Boolean)object;
        boolean bl5 = (Boolean)object8;
        boolean bl6 = (Boolean)ob0_13.o.getValue();
        boolean bl7 = (Boolean)ob0_13.q.getValue();
        Object object9 = object = ob0_13.r.getValue();
        object9 = (Boolean)object;
        boolean bl8 = (Boolean)object9;
        ob0_13.n.setValue(null);
        LP1 lP1 = LP1$a.b;
        float f5 = 80;
        int n14 = 7;
        object = h.i(lP1, 0.0f, 0.0f, 0.0f, f5, n14);
        float f6 = 1.0f;
        object = j.c((LP1)object, f6);
        long l2 = OX.f;
        Object object10 = fg2_1.a;
        lP1 = a.b((LP1)object, l2, (i13)object10);
        Object object11 = object2;
        object11 = (c80)object2;
        object2 = lt_22;
        n7 = (int)(bl2 ? 1 : 0);
        object10 = yT12;
        Object object12 = object9;
        object9 = object3;
        lt_22 = new lt_2(bl2, (p83_0)object6, (ArrayList)object5, (c80)object11, ob0_12, yT12, (p83_0)object4, (ft1_2)object3);
        object2 = null;
        n7 = 0;
        f5 = 0.0f;
        object = null;
        object6 = null;
        int n15 = 6;
        int n16 = 252;
        object9 = object8;
        object8 = lP1;
        int n17 = n8;
        Object object13 = object3;
        boolean bl9 = true;
        object4 = object3;
        object3 = null;
        lP1 = null;
        xq1_0.a((LP1)object8, (ft1_2)object13, null, false, null, null, null, false, lt_22, j30_02, n15, n16);
        n4 = ((ft1_2)object13).h();
        j30_0 j30_03 = null;
        if (n4 <= 0 || !bl2) {
            bl9 = false;
            object5 = null;
        }
        object2 = bl9;
        object = ob0_13.j;
        ((h83_0)object).setValue(object2);
        j30_02.K(1452165978);
        n4 = 8;
        if (bl3) {
            object = ob0_12.h();
            qt_0.c(ob0_13, n17, (Integer)object, j30_02, n4);
        }
        j30_02.T(false);
        n7 = 1452173670;
        f5 = 7.829167E13f;
        j30_02.K(n7);
        if (bl6) {
            qt_0.e(ob0_13, j30_02, n4);
        }
        j30_02.T(false);
        int n18 = 0x1000040;
        n4 = (int)(bl7 ? 1 : 0);
        object = ob0_12;
        object5 = object7;
        object13 = object4;
        object4 = object11;
        object3 = object9;
        object9 = j30_02;
        j30_03 = j30_02;
        qt_0.b(bl7, ob0_12, bl2, (p83_0)object7, n10, n17, bl3, (c80)object11, j30_02, n18);
        j30_02.K(1452186091);
        n4 = 0;
        object2 = null;
        if (bl4) {
            qt_0.k(j30_02, 0);
        }
        j30_03.T(false);
        n7 = 1452188452;
        f5 = 7.841567E13f;
        j30_03.K(n7);
        if (bl5) {
            object6 = null;
            object = new Qt$f((ft1_2)object13, ob0_13, null);
            ly0_0.d(j30_03, object3, (Function2)object);
        } else {
            object6 = null;
        }
        j30_03.T(false);
        if (bl8) {
            object2 = new Qt$g((ft1_2)object13, ob0_13, null);
            object = object12;
            ly0_0.d(j30_03, object12, (Function2)object2);
        }
        if ((object2 = j30_03.X()) != null) {
            ((CF2)object2).d = object = new mt_2(ob0_13, yT13, n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(boolean bl2, ob0_1 ob0_12, boolean bl3, p83_0 p83_02, int n3, int n4, boolean n7, c80 c802, b30_0 object, int n8) {
        void var19_31;
        int n10;
        Object object2;
        ob0_1 ob0_13 = ob0_12;
        int n14 = n7;
        Object object3 = c802;
        int n15 = 1;
        CF2 cF2 = null;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Object object4 = p83_02;
        Intrinsics.checkNotNullParameter(p83_02, "selectedCouponsList");
        Intrinsics.checkNotNullParameter(c802, "coroutineScope");
        int n16 = 1833994666;
        Object object5 = object;
        Object object6 = object.g(n16);
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
        Object object7 = ((j30_0)object6).j(vc3_12);
        boolean bl4 = object7 instanceof Activity;
        boolean bl5 = false;
        Object object8 = null;
        if (bl4) {
            Activity activity = (Activity)object7;
        } else {
            boolean bl6 = false;
            Object var19_28 = null;
        }
        object5 = j.c;
        Object object9 = HA.e(Nc$a.h, false);
        int n17 = ((j30_0)object6).P;
        Object object10 = ((j30_0)object6).P();
        object5 = a30_0.c((b30_0)object6, (LP1)object5);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object6).a;
        int n18 = mp2 instanceof mp;
        if (n18 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object6).A();
        bl5 = ((j30_0)object6).O;
        if (bl5) {
            ((j30_0)object6).C(xp1$a);
        } else {
            ((j30_0)object6).n();
        }
        object8 = N20$a.e;
        Ow3.a((b30_0)object6, object9, (Function2)object8);
        object8 = N20$a.d;
        Ow3.a((b30_0)object6, object10, (Function2)object8);
        object8 = N20$a.f;
        int n19 = ((j30_0)object6).O;
        if (n19 != 0 || (n19 = Intrinsics.areEqual(object9 = ((j30_0)object6).v(), object10 = Integer.valueOf(n17))) == 0) {
            rk_0.a(n17, (j30_0)object6, n17, (N20$a$a)object8);
        }
        object8 = N20$a.c;
        Ow3.a((b30_0)object6, object5, (Function2)object8);
        if (!bl3) {
            void var19_29;
            int n20 = 1297213656;
            ((j30_0)object6).K(n20);
            object5 = new st_1((c80)object3, ob0_13, (Activity)var19_29);
            gb0_1.c((st_1)object5, (b30_0)object6, 0);
            ((j30_0)object6).T(false);
            j30_0 j30_02 = object6;
        } else {
            void var20_49;
            void var27_65;
            long l2;
            long l3;
            long l4;
            Object object11;
            ((j30_0)object6).K(1297754265);
            int n21 = R$string.select_coupons_title;
            String string2 = nk_0.f((b30_0)object6, n21);
            long l7 = xx_1.e;
            n19 = R$string.select_coupons_unlock_desc;
            object9 = nk_0.f((b30_0)object6, n19);
            n17 = R$string.unlock_coupons;
            object2 = nk_0.f((b30_0)object6, n17);
            long l8 = xx_1.j;
            long l12 = xx_1.c;
            ((j30_0)object6).K(318969977);
            n18 = p83_02.isEmpty() ^ n15;
            if (n18 != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                int n22 = R$string.remaining_bbs_coins;
                String string3 = nk_0.f((b30_0)object6, n22);
                object9 = n3;
                Object[] objectArray = new Object[n15];
                objectArray[0] = object9;
                object9 = "format(...)";
                String string4 = xh2_0.a(objectArray, n15, string3, (String)object9);
                n18 = R$string.coupons_selected;
                String string5 = nk_0.f((b30_0)object6, n18);
                object11 = n4;
                object = string4;
                Object[] objectArray2 = new Object[n15];
                objectArray2[0] = object11;
                String string6 = xh2_0.a(objectArray2, n15, string5, (String)object9);
                l4 = OX.f;
                object9 = object;
                String string7 = string6;
                l3 = l7;
                boolean bl7 = true;
            } else {
                Object object12 = object9;
                l3 = l8;
                l4 = l12;
                object9 = string2;
                boolean bl8 = false;
                Object var19_38 = null;
            }
            ((j30_0)object6).T(false);
            n10 = 318982977;
            ((j30_0)object6).K(n10);
            if (n14 != 0) {
                n17 = R$string.confirm;
                object2 = nk_0.f((b30_0)object6, n17);
            }
            object11 = object2;
            ((j30_0)object6).T(false);
            if (bl2) {
                long l14 = xx_1.q;
                l3 = l8;
                bl5 = false;
                object8 = null;
                l2 = l14;
                boolean bl9 = true;
            } else {
                void var16_22;
                l2 = l7;
                l12 = l4;
                boolean bl10 = false;
                object5 = null;
                bl5 = var16_22;
            }
            tt_2 tt_22 = new tt_2(n14 != 0, ob0_13, (c80)object3);
            int n24 = 8;
            ob0_1 ob0_14 = ob0_12;
            tt_2 tt_23 = tt_22;
            void var26_59 = var27_65;
            Object object13 = object11;
            object = object6;
            object3 = object6;
            n14 = n24;
            gb0_1.b(ob0_12, (boolean)var20_49, bl5, (String)object9, l2, (String)var26_59, (String)object11, l3, l12, tt_23, (b30_0)object6, n24);
            Object object14 = object6;
            boolean bl11 = false;
            object5 = null;
            ((j30_0)object6).T(false);
        }
        boolean bl12 = true;
        var19_31.T(bl12);
        cF2 = var19_31.X();
        if (cF2 != null) {
            Object object15 = object4;
            boolean bl13 = bl2;
            object8 = ob0_12;
            n19 = (int)(bl3 ? 1 : 0);
            object2 = p83_02;
            n18 = n7;
            object6 = c802;
            n10 = n8;
            cF2.d = object4 = new ut_1(bl2, ob0_12, bl3, p83_02, n3, n4, n7 != 0, c802, n8);
        }
    }

    public static final void c(ob0_1 ob0_12, int n3, Integer n4, b30_0 object, int n7) {
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n8 = -213678951;
        object = object.g(n8);
        Object object2 = LP1$a.b;
        long l2 = xx_1.p;
        fG2$a fG2$a = fg2_1.a;
        object2 = a.b((LP1)object2, l2, fG2$a);
        Object object3 = j.c;
        object2 = object2.then((LP1)object3);
        object3 = new qt_2(ob0_12);
        int n10 = 7;
        object3 = d.b((LP1)object2, false, null, (Function0)object3, n10);
        Gx gx = Nc$a.h;
        object2 = new Qt$h(ob0_12, n3, n4);
        u10 u102 = v10.c(376103939, (fx0_2)object2, (b30_0)object);
        int n14 = 4;
        fG2$a = null;
        int n15 = 3120;
        OA.a((LP1)object3, gx, false, u102, (b30_0)object, n15, n14);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new rt_2(ob0_12, n3, n4, n7);
        }
    }

    public static final void d(String string2, String string3, long l2, b30_0 b30_02, int n3) {
        block17: {
            Object object;
            Object object2;
            Object object3;
            int n4;
            Object object4;
            Object object5;
            block16: {
                long l3;
                int n7;
                long l4;
                float f5;
                float f6;
                int n8;
                int n10;
                int n14;
                j30_0 j30_02;
                block15: {
                    object5 = string2;
                    object4 = string3;
                    n4 = n3;
                    Intrinsics.checkNotNullParameter(string2, "title");
                    object3 = "desc";
                    Intrinsics.checkNotNullParameter(string3, (String)object3);
                    object2 = b30_02;
                    j30_02 = b30_02.g(-1653898431);
                    n14 = n3 & 0xE;
                    if (n14 == 0) {
                        n14 = (int)(j30_02.J(string2) ? 1 : 0);
                        n14 = n14 != 0 ? 4 : 2;
                        n14 |= n4;
                    } else {
                        n14 = n3;
                    }
                    n10 = n4 & 0x70;
                    n8 = 16;
                    f6 = 2.2E-44f;
                    if (n10 == 0) {
                        n10 = (int)(j30_02.J(object4) ? 1 : 0);
                        if (n10 != 0) {
                            n10 = 32;
                            f5 = 4.5E-44f;
                        } else {
                            n10 = 16;
                            f5 = 2.2E-44f;
                        }
                        n14 |= n10;
                    }
                    n10 = n4 & 0x380;
                    l4 = l2;
                    if (n10 == 0) {
                        n10 = (int)(j30_02.d(l2) ? 1 : 0);
                        if (n10 != 0) {
                            n10 = 256;
                            f5 = 3.59E-43f;
                        } else {
                            n10 = 128;
                            f5 = 1.8E-43f;
                        }
                        n14 |= n10;
                    }
                    if ((n10 = n14 & 0x2DB) != (n7 = 146) || (n10 = (int)(j30_02.h() ? 1 : 0)) == 0) break block15;
                    j30_02.D();
                    object2 = j30_02;
                    break block16;
                }
                LP1$a lP1$a = LP1$a.b;
                n10 = 1065353216;
                f5 = 1.0f;
                LP1 lP1 = j.c(lP1$a, f5);
                f6 = n8;
                int n15 = 13;
                object2 = h.i(lP1, 0.0f, f6, 0.0f, 0.0f, n15);
                object = zp.f;
                Gx$b gx$b = Nc$a.j;
                int n16 = 6;
                object = iQ2.a((zp$e)object, gx$b, j30_02, n16);
                int n17 = j30_02.P;
                Object object6 = j30_02.P();
                object2 = a30_0.c(j30_02, (LP1)object2);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = j30_02.a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block17;
                j30_02.A();
                bl2 = j30_02.O;
                if (bl2) {
                    j30_02.C((Function0)((Object)serializable));
                } else {
                    j30_02.n();
                }
                serializable = N20$a.e;
                Ow3.a(j30_02, object, (Function2)((Object)serializable));
                object = N20$a.d;
                Ow3.a(j30_02, object6, (Function2)object);
                object = N20$a.f;
                n16 = (int)(j30_02.O ? 1 : 0);
                if (n16 != 0 || (n16 = (int)(Intrinsics.areEqual(object6 = j30_02.v(), serializable = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                    rk_0.a(n17, j30_02, n17, (N20$a$a)object);
                }
                object = N20$a.c;
                Ow3.a(j30_02, object2, (Function2)object);
                int n18 = 14;
                long l7 = Em3.f(n18);
                Object object7 = tv0_0.m;
                long l8 = xx_1.e;
                lP1 = lP1$a;
                object2 = h.i(lP1$a, f6, 0.0f, 0.0f, 0.0f, 14);
                int n19 = n14 & 0xE | 0x30DB0;
                l4 = l3 = 0L;
                object3 = string2;
                b30_02 = j30_02;
                object5 = object7;
                object7 = j30_02;
                Ll3.b(string2, (LP1)object2, l8, l7, null, (tv0_0)object5, null, 0L, null, null, l3, 0, false, 0, 0, null, null, j30_02, n19, 0, 131024);
                l7 = Em3.f(n18);
                object7 = tv0_0.n;
                n4 = 0;
                n16 = 11;
                object4 = lP1$a;
                object2 = h.i(lP1$a, 0.0f, 0.0f, f6, 0.0f, n16);
                int n20 = n14 >> 3 & 0xE;
                n8 = 199728;
                f6 = 2.79879E-40f;
                n19 = (n20 |= n8) | (n14 &= 0x380);
                n15 = 0;
                n7 = 0;
                object = null;
                n17 = 0;
                gx$b = null;
                long l12 = 0L;
                bl2 = false;
                mp2 = null;
                lP1$a = null;
                l4 = 0L;
                lP1 = null;
                int n21 = 131024;
                object3 = string3;
                object5 = object7;
                object7 = j30_02;
                Ll3.b(string3, (LP1)object2, l2, l7, null, (tv0_0)object5, null, l12, null, null, l4, 0, false, 0, 0, null, null, j30_02, n19, 0, n21);
                n14 = 1;
                object2 = j30_02;
                j30_02.T(n14 != 0);
            }
            object = ((j30_0)object2).X();
            if (object != null) {
                object3 = object5;
                object4 = string3;
                n4 = n3;
                ((CF2)object).d = object5 = new ht_2(l2, string2, string3, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void e(ob0_1 ob0_12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n4 = 1632452000;
        object = object.g(n4);
        Object object2 = ob0_12.s;
        if (object2 == null) {
            if ((object = ((j30_0)object).X()) != null) {
                ((CF2)object).d = object2 = new nt_2(ob0_12, n3);
            }
            return;
        }
        LP1 lP1 = LP1$a.b;
        long l2 = xx_1.p;
        Object object3 = fg2_1.a;
        lP1 = a.b(lP1, l2, (i13)object3);
        Object object4 = j.c;
        lP1 = lP1.then((LP1)object4);
        object4 = new ot_1(ob0_12);
        int n7 = 7;
        lP1 = d.b(lP1, false, null, (Function0)object4, n7);
        object4 = Nc$a.h;
        Qt$i qt$i = new Qt$i(ob0_12, (DisplayMessageInfo)object2);
        n4 = 1747203958;
        object3 = v10.c(n4, qt$i, (b30_0)object);
        int n8 = 4;
        qt$i = null;
        int n10 = 3120;
        OA.a(lP1, (Nc)object4, false, (u10)object3, (b30_0)object, n10, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new pt_2(ob0_12, n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void f(String string2, boolean bl2, b30_0 b30_02, int n3, int n4) {
        void var14_23;
        Object object;
        j30_0 j30_02;
        float f5;
        int n7;
        int n8;
        float f6;
        int n10;
        int n14;
        j30_0 j30_03;
        Object object2;
        int n15;
        int n16;
        Object object3;
        block15: {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            object3 = string2;
                            n16 = n3;
                            n15 = n4;
                            object2 = b30_02;
                            j30_03 = b30_02.g(-1541778735);
                            n14 = n3 & 0xE;
                            n10 = 4;
                            f6 = 5.6E-45f;
                            if (n14 == 0) {
                                n14 = (int)(j30_03.J(string2) ? 1 : 0);
                                n14 = n14 != 0 ? 4 : 2;
                                n14 |= n16;
                            } else {
                                n14 = n3;
                            }
                            n8 = n15 & 2;
                            if (n8 == 0) break block11;
                            n14 |= 0x30;
                            break block12;
                        }
                        int n17 = n16 & 0x70;
                        if (n17 != 0) break block12;
                        boolean bl3 = bl2;
                        n7 = (int)(j30_03.a(bl2) ? 1 : 0);
                        if (n7 == 0) break block13;
                        n7 = 32;
                        f5 = 4.5E-44f;
                        break block14;
                    }
                    boolean bl4 = bl2;
                    break block15;
                }
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n14 |= n7;
        }
        n7 = n14 & 0x5B;
        int n18 = 18;
        if (n7 == n18 && (n7 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            j30_02 = j30_03;
        } else {
            long l2;
            void var13_16;
            if (n8 != 0) {
                boolean bl5 = false;
            } else {
                void var14_20;
                void var13_15 = var14_20;
            }
            if (object3 == null) {
                CF2 cF2 = j30_03.X();
                if (cF2 != null) {
                    cF2.d = object2 = new gt_1((String)object3, n16, n15, (boolean)var13_16);
                }
                return;
            }
            int n19 = 12;
            float f7 = 1.7E-44f;
            long l3 = Em3.f(n19);
            if (var13_16 != false) {
                l2 = xx_1.g;
                int n20 = 0x3F000000;
                f7 = 0.5f;
                l2 = OX.b(l2, f7);
            } else {
                l2 = xx_1.g;
            }
            Object object4 = tv0_0.m;
            Object object5 = j.c(LP1$a.b, 1.0f);
            f6 = n10;
            f5 = 1.0f;
            object2 = h.f((LP1)object5, f5, f6);
            object5 = new Cj3(3);
            int n21 = (n14 &= 0xE) | 0x30C00;
            n7 = 0;
            f5 = 0.0f;
            n18 = 0;
            long l4 = 0L;
            long l7 = 0L;
            int n22 = 2;
            int n24 = 1;
            int n25 = 3120;
            int n26 = 120272;
            object = string2;
            j30_02 = j30_03;
            tv0_0 tv0_02 = object4;
            object3 = object5;
            object4 = j30_03;
            Ll3.b(string2, (LP1)object2, l2, l3, null, tv0_02, null, l4, null, (Cj3)object5, l7, n22, false, n24, 0, null, null, j30_03, n21, n25, n26);
            var14_23 = var13_16;
        }
        object = j30_02.X();
        if (object != null) {
            n15 = n3;
            ((CF2)object).d = object2 = new jt_2(string2, n3, n4, (boolean)var14_23);
        }
    }

    public static final void g(ob0_1 ob0_12, boolean bl2, ICoupon iCoupon, LP1 lP1, tt_0 tt_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(iCoupon, "coupon");
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(tt_02, "onCheckBoxPressed");
        object = object.g(-292939551);
        int n4 = R$string.login_signup_to_unlock_coupons;
        Object object2 = nk_0.f((b30_0)object, n4);
        Object object3 = tt_02;
        fx0_2 fx0_22 = new cu_1(iCoupon, bl2, tt_02, (String)object2, ob0_12);
        int n7 = 912954807;
        object3 = v10.c(n7, fx0_22, (b30_0)object);
        n4 = n3 >> 9 & 0xE;
        int n8 = n4 | 0xC00;
        int n10 = 6;
        object2 = object;
        OA.a(lP1, null, false, (u10)object3, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            it_1 it_12;
            fx0_22 = it_12;
            object3 = lP1;
            object2 = tt_02;
            n8 = n3;
            it_12 = new it_1(ob0_12, bl2, iCoupon, lP1, tt_02, n3);
            ((CF2)object).d = it_12;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void h(String string2, boolean bl2, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        j30_0 j30_02;
        float f5;
        int n7;
        int n8;
        float f6;
        int n10;
        int n14;
        int n15;
        j30_0 j30_03;
        Object object3;
        int n16;
        int n17;
        Object object4;
        block14: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            object4 = string2;
                            n17 = n3;
                            n16 = n4;
                            object3 = b30_02;
                            j30_03 = b30_02.g(-1947068519);
                            n15 = n3 & 0xE;
                            if (n15 == 0) {
                                n15 = (int)(j30_03.J(string2) ? 1 : 0);
                                n15 = n15 != 0 ? 4 : 2;
                                n15 |= n17;
                            } else {
                                n15 = n3;
                            }
                            n14 = n16 & 2;
                            n10 = 16;
                            f6 = 2.2E-44f;
                            if (n14 == 0) break block10;
                            n15 |= 0x30;
                            break block11;
                        }
                        n8 = n17 & 0x70;
                        if (n8) break block11;
                        n8 = (int)(bl2 ? 1 : 0);
                        n7 = (int)(j30_03.a(bl2) ? 1 : 0);
                        if (n7 == 0) break block12;
                        n7 = 32;
                        f5 = 4.5E-44f;
                        break block13;
                    }
                    n8 = (int)(bl2 ? 1 : 0);
                    break block14;
                }
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n15 |= n7;
        }
        n7 = n15 & 0x5B;
        int n18 = 18;
        if (n7 == n18 && (n7 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            j30_02 = j30_03;
        } else {
            long l2;
            if (n14 != 0) {
                n14 = 0;
                object3 = null;
                n8 = 0;
            }
            if (object4 == null) {
                CF2 cF2 = j30_03.X();
                if (cF2 != null) {
                    cF2.d = object3 = new kt_0((String)object4, n17, n16, n8 != 0);
                }
                return;
            }
            long l3 = Em3.f(n10);
            if (n8) {
                l2 = xx_1.n;
                n7 = 0x3F000000;
                f5 = 0.5f;
                l2 = OX.b(l2, f5);
            } else {
                l2 = xx_1.n;
            }
            Object object5 = tv0_0.o;
            object3 = LP1$a.b;
            n10 = 1065353216;
            f6 = 1.0f;
            object3 = j.c((LP1)object3, f6);
            object2 = new Cj3(3);
            int n19 = (n15 &= 0xE) | 0x30C30;
            n7 = 0;
            f5 = 0.0f;
            n18 = 0;
            long l4 = 0L;
            long l7 = 0L;
            int n20 = 1;
            int n21 = 3072;
            int n22 = 122320;
            object = string2;
            j30_02 = j30_03;
            tv0_0 tv0_02 = object5;
            object4 = object2;
            object5 = j30_03;
            Ll3.b(string2, (LP1)object3, l2, l3, null, tv0_02, null, l4, null, (Cj3)object2, l7, 0, false, n20, 0, null, null, j30_03, n19, n21, n22);
        }
        object = j30_02.X();
        if (object != null) {
            object2 = string2;
            n16 = n3;
            ((CF2)object).d = object3 = new lt_0(string2, n3, n4, n8 != 0);
        }
    }

    public static final void i(boolean bl2, ICoupon iCoupon, tt_0 tt_02, b30_0 b30_02, int n3) {
        boolean bl3 = bl2;
        ICoupon iCoupon2 = iCoupon;
        tt_0 tt_03 = tt_02;
        int n4 = n3;
        boolean bl4 = true;
        int n7 = 0;
        float f5 = 0.0f;
        Object object = null;
        Intrinsics.checkNotNullParameter(iCoupon, "coupon");
        Intrinsics.checkNotNullParameter(tt_02, "onCheckBoxPressed");
        int n8 = 1145401444;
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(n8);
        int n10 = R$string.login_signup_to_unlock_coupons;
        Object object3 = nk_0.f(j30_02, n10);
        LP1$a lP1$a = LP1$a.b;
        n10 = 1065353216;
        float f6 = 1.0f;
        object2 = j.c(lP1$a, f6);
        int n14 = 2;
        float f7 = n14;
        object2 = h.e((LP1)object2, f7);
        Object object4 = Nc$a.k;
        zp$c zp$c = zp.d;
        int n15 = 54;
        object4 = iQ2.a(zp$c, (Gx$b)object4, j30_02, n15);
        int n16 = j30_02.P;
        Object object5 = j30_02.P();
        object2 = a30_0.c(j30_02, (LP1)object2);
        N20.W.getClass();
        Object object6 = N20$a.b;
        Object object7 = j30_02.a;
        int n17 = object7 instanceof mp;
        String string2 = null;
        if (n17 != 0) {
            Object object8;
            j30_02.A();
            n17 = j30_02.O;
            if (n17 != 0) {
                j30_02.C((Function0)object6);
            } else {
                j30_02.n();
            }
            object6 = N20$a.e;
            Ow3.a(j30_02, object4, (Function2)object6);
            object4 = N20$a.d;
            Ow3.a(j30_02, object5, (Function2)object4);
            object4 = N20$a.f;
            n15 = (int)(j30_02.O ? 1 : 0);
            if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object5 = j30_02.v(), object6 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, j30_02, n16, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a(j30_02, object2, (Function2)object4);
            boolean bl5 = iCoupon.isSelected();
            LP1 lP1 = h.e(lP1$a, f7);
            long l2 = xx_1.e;
            int n18 = 54;
            object5 = j30_02;
            object6 = SS.a(l2, l2, j30_02, n18, 28);
            f6 = -2.3867338E-12f;
            j30_02.K(-1406667885);
            n10 = n4 & 0xE ^ 6;
            n17 = 4;
            if (n10 > n17 && (n10 = (int)(j30_02.a(bl3) ? 1 : 0)) != 0 || (n10 = n4 & 6) == n17) {
                n10 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f6 = 0.0f;
                object2 = null;
            }
            n14 = n4 & 0x380 ^ 0x180;
            int n19 = 256;
            if (n14 > n19 && (n14 = (int)(j30_02.J(tt_03) ? 1 : 0)) != 0 || (n14 = n4 & 0x180) == n19) {
                n14 = 1;
                f7 = Float.MIN_VALUE;
            } else {
                n14 = 0;
                f7 = 0.0f;
                object8 = null;
            }
            n10 |= n14;
            n14 = (int)(j30_02.J(object3) ? 1 : 0);
            object8 = j30_02.v();
            if ((n10 |= n14) != 0 || object8 == (object2 = b30$a.a)) {
                object8 = new kt_1(bl3, tt_03, (String)object3);
                j30_02.o(object8);
            }
            object8 = (Function1)object8;
            j30_02.T(false);
            n16 = 0;
            zp$c = null;
            n15 = 0;
            object5 = null;
            int n20 = 384;
            n10 = (int)(bl5 ? 1 : 0);
            object4 = lP1;
            object7 = j30_02;
            VS.a(bl5, (Function1)object8, lP1, false, null, (RS)object6, j30_02, n20);
            object2 = StringCompanionObject.INSTANCE;
            n10 = R$string.remaining_bbs_coins;
            object2 = nk_0.f(j30_02, n10);
            object8 = iCoupon.getCouponValue();
            if (object8 != null) {
                string2 = object8.getAmount();
            }
            object8 = new Object[bl4];
            object8[0] = string2;
            object = "format(...)";
            object2 = xh2_0.a(object8, (int)(bl4 ? 1 : 0), (String)object2, (String)object);
            long l3 = Em3.f(12);
            object3 = tv0_0.o;
            n7 = 4;
            f5 = n7;
            object8 = h.e(lP1$a, f5);
            int n21 = 200112;
            n17 = 0;
            object7 = null;
            lP1$a = null;
            long l4 = 0L;
            lP1 = null;
            long l7 = 0L;
            int n22 = 1;
            int n24 = 3072;
            int n25 = 122832;
            Ll3.b((String)object2, (LP1)object8, l2, l3, null, (tv0_0)object3, null, l4, null, null, l7, 0, false, n22, 0, null, null, j30_02, n21, n24, n25);
            j30_02.T(bl4);
            CF2 cF2 = j30_02.X();
            if (cF2 != null) {
                cF2.d = object = new vt_1(bl3, iCoupon2, tt_03, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void j(ob0_1 ob0_12, String string2, boolean bl2, b30_0 b30_02, int n3, int n4) {
        long l2;
        ob0_1 ob0_13 = ob0_12;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n7 = -1021815589;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        int n8 = n4 & 4;
        LP1 lP1 = null;
        boolean bl3 = n8 != 0 ? false : bl2;
        object = AndroidCompositionLocals_androidKt.b;
        object = ((j30_0)object2).j((H30)object);
        int n10 = object instanceof Activity;
        if (n10 != 0) {
            object = (Activity)object;
        } else {
            n8 = 0;
            object = null;
        }
        Object object3 = ((j30_0)object2).v();
        Object object4 = b30$a.a;
        if (object3 == object4) {
            object3 = Qx2.a(ly0_0.f(f.a, (b30_0)object2), (j30_0)object2);
        }
        object3 = ((Q30)object3).a;
        int n14 = R$string.view_products;
        object4 = nk_0.f((b30_0)object2, n14);
        int n15 = 14;
        long l3 = Em3.f(n15);
        if (bl3) {
            l2 = xx_1.h;
            float f5 = 0.5f;
            l2 = OX.b(l2, f5);
        } else {
            l2 = xx_1.h;
        }
        tv0_0 tv0_02 = tv0_0.n;
        LP1 lP12 = j.c(LP1$a.b, 1.0f);
        n15 = 6;
        float f6 = n15;
        int n16 = 13;
        Object object5 = h.i(lP12, 0.0f, f6, 0.0f, 0.0f, n16);
        object3 = (c80)object3;
        mt_0 mt_02 = new mt_0((c80)object3, string2, (Activity)object, ob0_13);
        lP1 = d.b((LP1)object5, false, null, mt_02, 7);
        n8 = 3;
        object5 = new Cj3(n8);
        int n17 = 199680;
        mt_02 = null;
        lP12 = null;
        long l4 = 0L;
        long l7 = 0L;
        int n18 = 1;
        int n19 = 3072;
        int n20 = 122320;
        object = object4;
        Ll3.b((String)object4, lP1, l2, l3, null, tv0_02, null, l4, null, (Cj3)object5, l7, 0, false, n18, 0, null, null, (b30_0)object2, n17, n19, n20);
        object4 = ((j30_0)object2).X();
        if (object4 != null) {
            object2 = object5;
            ob0_13 = ob0_12;
            object = string2;
            n10 = n3;
            ((CF2)object4).d = object5 = new nt_0(ob0_12, string2, bl3, n3, n4);
        }
    }

    public static final void k(b30_0 b30_02, int n3) {
        block9: {
            Object object;
            Object object2;
            int n4;
            block8: {
                boolean bl2;
                block7: {
                    n4 = n3;
                    int n7 = 224917804;
                    object2 = b30_02;
                    object = b30_02.g(n7);
                    if (n3 != 0 || !(bl2 = ((j30_0)object).h())) break block7;
                    ((j30_0)object).D();
                    break block8;
                }
                object2 = "ajio_loader.json";
                Intrinsics.checkNotNullParameter(object2, "assetName");
                Object object3 = new fC1$a((String)object2);
                int n8 = 6;
                ec1_0 ec1_02 = sI2.c((fc1_0)object3, (b30_0)object, n8);
                object2 = (QB1)ec1_02.getValue();
                float f5 = 1.25f;
                int n10 = -1 >>> 1;
                object2 = nk_0.a((QB1)object2, false, f5, n10, (b30_0)object, 926);
                object3 = LP1$a.b;
                Object object4 = j.c;
                long l2 = xx_1.r;
                Object object5 = fg2_1.a;
                object4 = a.b((LP1)object4, l2, (i13)object5);
                Object object6 = new Object();
                boolean bl3 = false;
                object5 = null;
                object4 = d.b((LP1)object4, false, null, (Function0)object6, n8);
                object6 = HA.e(Nc$a.e, false);
                int n14 = ((j30_0)object).P;
                Object object7 = ((j30_0)object).P();
                object4 = a30_0.c((b30_0)object, (LP1)object4);
                N20.W.getClass();
                Xp1$a xp1$a = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl4 = mp2 instanceof mp;
                if (!bl4) break block9;
                ((j30_0)object).A();
                bl3 = ((j30_0)object).O;
                if (bl3) {
                    ((j30_0)object).C(xp1$a);
                } else {
                    ((j30_0)object).n();
                }
                object5 = N20$a.e;
                Ow3.a((b30_0)object, object6, (Function2)object5);
                object6 = N20$a.d;
                Ow3.a((b30_0)object, object7, (Function2)object6);
                object6 = N20$a.f;
                bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = ((j30_0)object).v(), object7 = Integer.valueOf(n14)))) {
                    rk_0.a(n14, (j30_0)object, n14, (N20$a$a)object6);
                }
                object6 = N20$a.c;
                Ow3.a((b30_0)object, object4, (Function2)object6);
                Object object8 = object4 = ec1_02.getValue();
                object8 = (QB1)object4;
                float f6 = ((Number)object2.getValue()).floatValue();
                float f7 = 50;
                object4 = j.i((LP1)object3, f7, f7);
                int n15 = 392;
                n10 = 0;
                object6 = null;
                n14 = 0;
                bl3 = false;
                object5 = null;
                n8 = 0;
                object7 = null;
                ec1_02 = null;
                xp1$a = null;
                bl4 = false;
                mp2 = null;
                object2 = object8;
                object8 = object;
                HB1.a((QB1)object2, f6, (LP1)object4, false, false, false, false, null, false, null, null, null, false, false, null, (b30_0)object, n15, 0);
                bl2 = true;
                f7 = Float.MIN_VALUE;
                ((j30_0)object).T(bl2);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new pt_1(n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void l(int n3, b30_0 b30_02, c80 c802, ob0_1 ob0_12, yT1 yT12) {
        c80 c803 = c802;
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Intrinsics.checkNotNullParameter(c802, "coroutineScope");
        int n4 = -1156171331;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = AndroidCompositionLocals_androidKt.b;
        object = ((j30_0)object2).j((H30)object);
        int n7 = object instanceof Activity;
        object = n7 != 0 ? (Activity)object : null;
        String string2 = ob0_12.i();
        int n8 = R$drawable.ic_bonanza_coin;
        int n10 = R$string.logged_in_view_coins_desc;
        String string3 = nk_0.f((b30_0)object2, n10);
        int n14 = R$string.how_does_it_work;
        String string4 = nk_0.f((b30_0)object2, n14);
        int n15 = R$string.view_t_and_s;
        String string5 = nk_0.f((b30_0)object2, n15);
        wt_1 wt_12 = new wt_1(c803, ob0_13, yT13);
        xt_2 xt_22 = new xt_2(c803, ob0_13, (Activity)object);
        int n16 = 72;
        object = string2;
        n7 = n8;
        String string6 = string3;
        n10 = 0;
        string3 = null;
        ob0_0.a(string2, n8, string6, null, string4, string5, null, wt_12, xt_22, (b30_0)object2, 0, n16);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n7 = n3;
            ((CF2)object2).d = object = new yt_2(n3, c803, ob0_13, yT13);
        }
    }

    public static final void m(int n3, b30_0 b30_02, c80 c802, ob0_1 ob0_12, yT1 yT12) {
        c80 c803 = c802;
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Intrinsics.checkNotNullParameter(c802, "coroutineScope");
        int n4 = -880401098;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = AndroidCompositionLocals_androidKt.b;
        object = ((j30_0)object2).j((H30)object);
        int n7 = object instanceof Activity;
        object = n7 != 0 ? (Activity)object : null;
        n7 = R$string.login_signup_to_view_coins;
        String string2 = nk_0.f((b30_0)object2, n7);
        int n8 = R$drawable.ic_bonanza_coin;
        int n10 = R$string.login_signup_view_coins_desc;
        String string3 = nk_0.f((b30_0)object2, n10);
        int n14 = R$string.login_signup;
        String string4 = nk_0.f((b30_0)object2, n14);
        int n15 = R$string.how_does_it_work;
        String string5 = nk_0.f((b30_0)object2, n15);
        int n16 = R$string.view_t_and_s;
        Object object3 = nk_0.f((b30_0)object2, n16);
        Function0 function0 = new at_2(c803, ob0_13, (Activity)object);
        Function0 function02 = new bt_2(c803, ob0_13, yT13);
        Object object4 = new ct_2(c803, ob0_13, (Activity)object);
        object = string2;
        n7 = n8;
        String string6 = string3;
        string3 = string4;
        string4 = string5;
        string5 = object3;
        object3 = function0;
        function0 = function02;
        function02 = object4;
        object4 = object2;
        ob0_0.a(string2, n8, string6, string3, string4, string5, (Function0)object3, function0, function02, (b30_0)object2, 0, 0);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n7 = n3;
            ((CF2)object2).d = object = new dt_1(n3, c803, ob0_13, yT13);
        }
    }

    public static final void n(float f5, b30_0 object, int n3) {
        Object object2;
        object = object.g(585216236);
        int n4 = n3 & 0xE;
        int n7 = 2;
        float f6 = 2.8E-45f;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).b(f5) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 0xB) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = LP1$a.b;
            long l2 = xx_1.m;
            fG2$a fG2$a = fg2_1.a;
            object2 = a.b((LP1)object2, l2, fG2$a);
            n7 = 1065353216;
            f6 = 1.0f;
            object2 = j.d(j.c((LP1)object2, f6), f5);
            Q93.b((b30_0)object, (LP1)object2);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new zt_2(f5, n3);
        }
    }
}

