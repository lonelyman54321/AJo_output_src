/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$raw;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t92
 */
public final class t92_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(int n3, b30_0 object, dr0_0 dr0_02, yT1 yT12) {
        Integer n4;
        Object object2;
        int n7;
        Object object3;
        Object object4;
        Xp1$a xp1$a;
        Object object5;
        int n8;
        int n10;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        int n14;
        int n15;
        Object object12;
        int n16;
        int n17;
        Object object13;
        Object object14;
        Object object15;
        Object object16;
        float f5;
        boolean bl2;
        Object object17;
        dr0_0 dr0_03;
        block27: {
            block28: {
                block26: {
                    dr0_03 = dr0_02;
                    object17 = yT12;
                    bl2 = true;
                    f5 = Float.MIN_VALUE;
                    Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
                    Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
                    object16 = object;
                    object15 = object.g(-641060038);
                    object14 = AnalyticsManager.Companion;
                    object16 = ((AnalyticsManager$Companion)object14).getInstance().getGtmEvents();
                    object13 = "onboarding screen";
                    ((GTMEvents)object16).setScreenName((String)object13);
                    ((AnalyticsManager$Companion)object14).getInstance().getNewEEcommerceEventsRevamp().setCurrentScreen((String)object13);
                    ((AnalyticsManager$Companion)object14).getInstance().getNewEEcommerceEventsRevamp().setCurrentScreenType((String)object13);
                    object14 = Unit.a;
                    n17 = 2;
                    n16 = 0;
                    object12 = null;
                    object16 = new qg3_2(n17, null);
                    ly0_0.d((b30_0)object15, object14, (Function2)object16);
                    object14 = dr0_02.w0;
                    object16 = "fleek_onboarding";
                    ((sw_0)object14).putPreference((String)object16, bl2);
                    object14 = h40_0.a;
                    object14 = h40_0.W();
                    n15 = ((ArrayList)object14).size();
                    ((j30_0)object15).K(360347297);
                    n14 = ((j30_0)object15).c(n15);
                    object13 = ((j30_0)object15).v();
                    object11 = b30$a.a;
                    if (n14 != 0 || object13 == object11) {
                        object13 = new qa2_2(n15);
                        ((j30_0)object15).o(object13);
                    }
                    object13 = (Function0)object13;
                    n14 = 0;
                    object16 = null;
                    ((j30_0)object15).T(false);
                    object13 = El2.b((Function0)object13, (b30_0)object15);
                    object10 = new p92_0(null, (hm0_0)object13, dr0_03);
                    ly0_0.d((b30_0)object15, object13, (Function2)object10);
                    object10 = ((j30_0)object15).v();
                    if (object10 == object11) {
                        object10 = Qx2.a(ly0_0.f(f.a, (b30_0)object15), (j30_0)object15);
                    }
                    object10 = ((Q30)object10).a;
                    object9 = new bq0_1();
                    object8 = Nc$a.n;
                    object7 = zp.d;
                    object6 = LP1$a.b;
                    n10 = 54;
                    object8 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object15, n10);
                    n8 = ((j30_0)object15).P;
                    object5 = ((j30_0)object15).P();
                    object12 = a30_0.c((b30_0)object15, (LP1)object6);
                    N20.W.getClass();
                    xp1$a = N20$a.b;
                    object4 = object9;
                    object9 = ((j30_0)object15).a;
                    n14 = object9 instanceof mp;
                    if (n14 == 0) {
                        s20.a();
                        throw null;
                    }
                    ((j30_0)object15).A();
                    n14 = ((j30_0)object15).O;
                    if (n14 != 0) {
                        ((j30_0)object15).C(xp1$a);
                    } else {
                        ((j30_0)object15).n();
                    }
                    object16 = N20$a.e;
                    Ow3.a((b30_0)object15, object8, (Function2)object16);
                    object8 = N20$a.d;
                    Ow3.a((b30_0)object15, object5, (Function2)object8);
                    object5 = N20$a.f;
                    object3 = object10;
                    n7 = ((j30_0)object15).O;
                    if (n7 != 0) break block26;
                    object10 = ((j30_0)object15).v();
                    object2 = object6;
                    object6 = n8;
                    n7 = Intrinsics.areEqual(object10, object6);
                    if (n7 != 0) break block27;
                    break block28;
                }
                object2 = object6;
            }
            rk_0.a(n8, (j30_0)object15, n8, (N20$a$a)object5);
        }
        object10 = N20$a.c;
        Ow3.a((b30_0)object15, object12, (Function2)object10);
        object12 = j.c;
        Object object18 = Nc$a.a;
        object6 = null;
        object18 = HA.e((Nc)object18, false);
        int n18 = ((j30_0)object15).P;
        zp$c zp$c = object7;
        object7 = ((j30_0)object15).P();
        object12 = a30_0.c((b30_0)object15, (LP1)object12);
        boolean bl3 = object9 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        ((j30_0)object15).A();
        bl3 = ((j30_0)object15).O;
        if (bl3) {
            ((j30_0)object15).C(xp1$a);
        } else {
            ((j30_0)object15).n();
        }
        Ow3.a((b30_0)object15, object18, (Function2)object16);
        Ow3.a((b30_0)object15, object7, (Function2)object8);
        bl3 = ((j30_0)object15).O;
        if (bl3 || !(bl3 = Intrinsics.areEqual(object17 = ((j30_0)object15).v(), object18 = Integer.valueOf(n18)))) {
            rk_0.a(n18, (j30_0)object15, n18, (N20$a$a)object5);
        }
        Ow3.a((b30_0)object15, object12, (Function2)object10);
        object17 = d.a;
        n16 = -1019723211;
        ((j30_0)object15).K(n16);
        object12 = ((j30_0)object15).v();
        if (object12 == object11) {
            object11 = Boolean.TRUE;
            object12 = J83.g(object11);
            ((j30_0)object15).o(object12);
        }
        object12 = (tr1_0)object12;
        ((j30_0)object15).T(false);
        object11 = new q92_0(dr0_03, (tr1_0)object12);
        u10 u102 = v10.c(-1879836840, (fx0_2)object11, (b30_0)object15);
        int n19 = 0;
        object7 = object8;
        Object object19 = object5;
        n18 = 0;
        Object object20 = object8;
        Object object21 = zp$c;
        boolean bl4 = false;
        int n20 = 0;
        float f6 = 0.0f;
        Object object22 = object9;
        bq0_1 bq0_12 = object4;
        int n21 = 0;
        zp$c = null;
        float f7 = 0.0f;
        int n22 = 3072;
        int n24 = 8190;
        object11 = object10;
        Object object23 = object3;
        object10 = object13;
        object3 = object15;
        jl2.a((hm0_0)object13, null, null, null, 0, 0.0f, null, null, false, false, null, null, null, u102, (b30_0)object15, 0, n22, n24);
        n7 = 1065353216;
        float f8 = 1.0f;
        object6 = object2;
        object7 = j.c((LP1)object2, f8);
        float f11 = uq0_0.D;
        object4 = null;
        int n25 = 0;
        float f12 = 0.0f;
        object2 = null;
        object9 = null;
        int n26 = 7;
        float f14 = 9.8E-45f;
        object10 = h.i((LP1)object7, 0.0f, 0.0f, 0.0f, f11, n26);
        object8 = Nc$a.h;
        object10 = ((d)object17).a((LP1)object10, (Nc)object8);
        object8 = Nc$a.l;
        object18 = object21;
        n10 = 54;
        object8 = iQ2.a((zp$e)object21, (Gx$b)object8, (b30_0)object15, n10);
        n8 = ((j30_0)object15).P;
        object5 = ((j30_0)object15).P();
        object10 = a30_0.c((b30_0)object15, (LP1)object10);
        object7 = object22;
        boolean bl5 = object22 instanceof mp;
        if (!bl5) {
            s20.a();
            throw null;
        }
        ((j30_0)object15).A();
        bl5 = ((j30_0)object15).O;
        if (bl5) {
            ((j30_0)object15).C(xp1$a);
        } else {
            ((j30_0)object15).n();
        }
        Ow3.a((b30_0)object15, object8, (Function2)object16);
        object16 = object20;
        Ow3.a((b30_0)object15, object5, (Function2)object20);
        n14 = ((j30_0)object15).O;
        if (n14 != 0 || (n14 = Intrinsics.areEqual(object16 = ((j30_0)object15).v(), n4 = Integer.valueOf(n8))) == 0) {
            object16 = object19;
            rk_0.a(n8, (j30_0)object15, n8, (N20$a$a)object19);
        }
        Ow3.a((b30_0)object15, object10, (Function2)object11);
        ((j30_0)object15).K(-478503191);
        object16 = null;
        for (n14 = 0; n14 < n15; n14 += n20) {
            n20 = ((Cl2)object13).j();
            long l2 = n20 == n14 ? nz_1.n : nz_1.o;
            f14 = uq0_0.n;
            n21 = 0;
            f11 = 0.0f;
            zp$c = null;
            f7 = 0.0f;
            n25 = 0;
            f12 = 0.0f;
            object2 = null;
            n19 = 11;
            object4 = object6;
            object11 = h.i((LP1)object6, 0.0f, 0.0f, f14, 0.0f, n19);
            object8 = SP2.a;
            object11 = QV.a((LP1)object11, (i13)object8);
            object8 = fg2_1.a;
            object11 = a.b((LP1)object11, l2, (i13)object8);
            f5 = uq0_0.h;
            object11 = j.h((LP1)object11, f5);
            bl2 = false;
            f5 = 0.0f;
            Object var26_30 = null;
            HA.a((LP1)object11, (b30_0)object15, 0);
            n20 = 1;
            f6 = Float.MIN_VALUE;
        }
        f6 = Float.MIN_VALUE;
        bl2 = false;
        f5 = 0.0f;
        Object var26_31 = null;
        ((j30_0)object15).T(false);
        ((j30_0)object15).T(true);
        n15 = -1019655271;
        ((j30_0)object15).K(n15);
        object14 = h40_0.a;
        object16 = "is_onboarding_auto_scroll";
        Intrinsics.checkNotNullParameter(object16, "key");
        object14 = h40_0.D0();
        n20 = (int)(object14.has((String)object16) ? 1 : 0);
        if (n20 != 0) {
            n15 = (int)(object14.getBoolean((String)object16) ? 1 : 0);
        } else {
            n15 = 0;
            object14 = null;
        }
        if (n15 != 0) {
            object14 = Unit.a;
            bl2 = false;
            f5 = 0.0f;
            Object var26_32 = null;
            object16 = new r92_0(null, (hm0_0)object13, dr0_03);
            ly0_0.d((b30_0)object15, object14, (Function2)object16);
        } else {
            bl2 = false;
            f5 = 0.0f;
            Object var26_33 = null;
        }
        n14 = 0;
        object16 = null;
        ((j30_0)object15).T(false);
        ((j30_0)object15).K(-1019632166);
        object14 = (Boolean)object12.getValue();
        n15 = (int)(((Boolean)object14).booleanValue() ? 1 : 0);
        if (n15 != 0) {
            object11 = j.c;
            n15 = R$raw.onboarding_screen_shimmer;
            n7 = 4528;
            f8 = 6.345E-42f;
            n16 = 0;
            n8 = 0;
            object18 = null;
            object16 = object11;
            object5 = object13;
            object13 = dr0_02;
            n20 = 0;
            object11 = null;
            f6 = 0.0f;
            object12 = object15;
            object9 = object15;
            ov3.o(n15, (LP1)object16, dr0_02, null, (b30_0)object15, n7);
        } else {
            object5 = object13;
            object9 = object15;
            n8 = 0;
            object18 = null;
        }
        ((j30_0)object9).T(false);
        object14 = Nc$a.c;
        object4 = ((d)object17).a((LP1)object6, (Nc)object14);
        f14 = uq0_0.o;
        n25 = 0;
        f12 = 0.0f;
        object2 = null;
        f7 = 0.0f;
        n19 = 9;
        f11 = f14;
        object14 = h.i((LP1)object4, 0.0f, f14, f14, 0.0f, n19);
        long l3 = nz_1.r;
        f6 = uq0_0.d;
        object11 = SP2.a(f6);
        object14 = a.b((LP1)object14, l3, (i13)object11);
        object15 = yT12;
        object11 = bq0_12;
        object16 = new l92_0(yT12, bq0_12, dr0_03, (hm0_0)object5);
        n16 = 7;
        object14 = androidx.compose.foundation.d.b((LP1)object14, false, null, (Function0)object16, n16);
        object16 = zp.a;
        object13 = Nc$a.j;
        object16 = iQ2.a((zp$e)object16, (Gx$b)object13, (b30_0)object9, 0);
        n17 = ((j30_0)object9).P;
        object10 = ((j30_0)object9).P();
        object14 = a30_0.c((b30_0)object9, (LP1)object14);
        N20.W.getClass();
        object8 = N20$a.b;
        bl4 = object7 instanceof mp;
        if (!bl4) {
            s20.a();
            throw null;
        }
        ((j30_0)object9).A();
        bl4 = ((j30_0)object9).O;
        if (bl4) {
            ((j30_0)object9).C((Function0)object8);
        } else {
            ((j30_0)object9).n();
        }
        object8 = N20$a.e;
        Ow3.a((b30_0)object9, object16, (Function2)object8);
        object16 = N20$a.d;
        Ow3.a((b30_0)object9, object10, (Function2)object16);
        object16 = N20$a.f;
        n7 = (int)(((j30_0)object9).O ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object10 = ((j30_0)object9).v(), object8 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
            rk_0.a(n17, (j30_0)object9, n17, (N20$a$a)object16);
        }
        object16 = N20$a.c;
        Ow3.a((b30_0)object9, object14, (Function2)object16);
        n15 = R$string.login_skip;
        object10 = nk_0.f((b30_0)object9, n15);
        long l4 = OX.f;
        long l7 = oj3_2.c;
        object13 = y20_0.a;
        float f15 = uq0_0.h;
        f7 = uq0_0.e;
        n26 = 0;
        object4 = object6;
        f12 = f15;
        f11 = f7;
        object8 = h.i((LP1)object6, f15, f7, 0.0f, f7, 4);
        int n27 = 1576368;
        object = object9;
        long l8 = 0L;
        long l12 = 0L;
        n22 = 0;
        n24 = 0;
        int n28 = 130992;
        object21 = object5;
        object14 = object6;
        object2 = object13;
        Ll3.b((String)object10, (LP1)object8, l4, l7, null, null, (RU0)object13, l8, null, null, l12, 0, false, 0, 0, null, null, (b30_0)object9, n27, 0, n28);
        object10 = km2.a(R$drawable.skip_arrow, (b30_0)object9, 0);
        object13 = Nc$a.k;
        object8 = new VerticalAlignElement((Gx$b)object13);
        f12 = uq0_0.g;
        object4 = object8;
        f14 = f15;
        object18 = h.i((LP1)object8, f12, 0.0f, f15, 0.0f, 10);
        object4 = object9;
        Pd1.a((im2)object10, "skip arrow", (LP1)object18, null, null, 0.0f, null, (b30_0)object9, 56, 120);
        ((j30_0)object9).T(true);
        n17 = R$drawable.next_arrow;
        object10 = km2.a(n17, (b30_0)object9, 0);
        object13 = Nc$a.i;
        object4 = ((d)object17).a((LP1)object6, (Nc)object13);
        f14 = uq0_0.u;
        f7 = uq0_0.s;
        object2 = null;
        zp$c = null;
        n19 = 3;
        object17 = h.i((LP1)object4, 0.0f, 0.0f, f14, f7, n19);
        object13 = object23;
        object13 = (c80)object23;
        object14 = object8;
        n8 = 0;
        object16 = object5;
        object12 = dr0_02;
        object7 = object15;
        object15 = yT12;
        object8 = new m92_0((hm0_0)object5, (c80)object13, (bq0_1)object11, dr0_02, yT12);
        object18 = androidx.compose.foundation.d.b((LP1)object17, false, null, (Function0)object8, 7);
        n15 = 0;
        object16 = null;
        object8 = "next arrow button";
        n10 = 0;
        object5 = null;
        n18 = 0;
        object6 = null;
        n25 = 56;
        f12 = 7.8E-44f;
        n21 = 120;
        f11 = 1.68E-43f;
        object13 = object7;
        bl4 = false;
        object7 = null;
        object14 = object9;
        bl5 = false;
        object9 = null;
        object4 = object;
        Pd1.a((im2)object10, (String)object8, (LP1)object18, null, null, 0.0f, null, (b30_0)object, n25, n21);
        n14 = 1;
        object14 = fn0_2.a((j30_0)object, n14 != 0, n14 != 0);
        if (object14 != null) {
            n20 = n3;
            ((CF2)object14).d = object16 = new n92_0((yT1)object13, dr0_03, n3);
        }
    }
}

