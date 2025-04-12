/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewTreeObserver
 */
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from qd
 */
public final class qd_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(yT1 yT12, dr0_0 dr0_02, String string2, i i3, b30_0 b30_02, int n3) {
        int n4;
        boolean bl2;
        yT1 yT13 = yT12;
        dr0_0 dr0_03 = dr0_02;
        Object object = string2;
        Object object2 = i3;
        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(string2, "uuid");
        Intrinsics.checkNotNullParameter(i3, "lifecycle");
        int n7 = -600876399;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n7);
        object3 = (HD)dr0_02.C.getValue();
        Object object5 = AnalyticsManager.Companion;
        Object object6 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
        Object object7 = "brand directory screen";
        ((GTMEvents)object6).setScreenName((String)object7);
        ((AnalyticsManager$Companion)object5).getInstance().getNewEEcommerceEventsRevamp().setCurrentScreen((String)object7);
        ((AnalyticsManager$Companion)object5).getInstance().getNewEEcommerceEventsRevamp().setCurrentScreenType((String)object7);
        object5 = Unit.a;
        int n8 = 2;
        boolean bl3 = false;
        N20$a$b n20$a$b = null;
        object6 = new qg3_2(n8, null);
        ly0_0.d((b30_0)object4, object5, (Function2)object6);
        boolean bl4 = Intrinsics.areEqual(dr0_02.v, string2);
        boolean bl5 = true;
        dr0_02.w = bl4 ^= bl5;
        object6 = "<set-?>";
        Intrinsics.checkNotNullParameter(string2, (String)object6);
        dr0_02.v = string2;
        ((j30_0)object4).K(-731021658);
        bl4 = ((j30_0)object4).J(i3);
        object7 = ((j30_0)object4).v();
        if (bl4 || object7 == (object6 = b30$a.a)) {
            object7 = new ad_1(dr0_03);
            ((j30_0)object4).o(object7);
        }
        object7 = (n)object7;
        int n10 = 0;
        ((j30_0)object4).T(false);
        object6 = new hd_1((i)object2, (n)object7);
        ly0_0.b(object2, (Function1)object6, (b30_0)object4);
        object6 = j.c;
        long l2 = nz_1.a;
        object7 = fg2_1.a;
        object7 = a.b((LP1)object6, l2, (i13)object7);
        Gx gx = Nc$a.e;
        Object object8 = HA.e(gx, false);
        int n14 = ((j30_0)object4).P;
        Object object9 = ((j30_0)object4).P();
        object7 = a30_0.c((b30_0)object4, (LP1)object7);
        N20$a n20$a = N20.W;
        n20$a.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object4).a;
        bl3 = mp2 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        ((j30_0)object4).A();
        bl3 = ((j30_0)object4).O;
        if (bl3) {
            ((j30_0)object4).C(xp1$a);
        } else {
            ((j30_0)object4).n();
        }
        n20$a$b = N20$a.e;
        Ow3.a((b30_0)object4, object8, n20$a$b);
        object8 = N20$a.d;
        Ow3.a((b30_0)object4, object9, (Function2)object8);
        object9 = N20$a.f;
        boolean bl6 = ((j30_0)object4).O;
        if (bl6 || !(bl2 = Intrinsics.areEqual(object = ((j30_0)object4).v(), object2 = Integer.valueOf(n14)))) {
            rk_0.a(n14, (j30_0)object4, n14, (N20$a$a)object9);
        }
        object = N20$a.c;
        Ow3.a((b30_0)object4, object7, (Function2)object);
        object2 = HD$c.a;
        boolean bl7 = Intrinsics.areEqual(object3, object2);
        if (bl7) {
            int n15 = 1266768072;
            ((j30_0)object4).K(n15);
            object = new qd$b(null, dr0_03);
            ly0_0.d((b30_0)object4, object5, (Function2)object);
            bl7 = false;
            object2 = null;
            ((j30_0)object4).T(false);
        } else {
            bl7 = false;
            object2 = null;
            object5 = HD$b.a;
            int n16 = Intrinsics.areEqual(object3, object5);
            if (n16 != 0) {
                n4 = 1267032130;
                ((j30_0)object4).K(n4);
                object3 = Nc$a.n;
                object5 = zp.d;
                n8 = 54;
                object3 = oZ.a((zp$l)object5, (Gx$a)object3, (b30_0)object4, n8);
                n16 = ((j30_0)object4).P;
                object7 = ((j30_0)object4).P();
                object6 = a30_0.c((b30_0)object4, (LP1)object6);
                boolean bl8 = mp2 instanceof mp;
                if (!bl8) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object4).A();
                bl8 = ((j30_0)object4).O;
                if (bl8) {
                    ((j30_0)object4).C(xp1$a);
                } else {
                    ((j30_0)object4).n();
                }
                Ow3.a((b30_0)object4, object3, n20$a$b);
                Ow3.a((b30_0)object4, object7, (Function2)object8);
                n4 = (int)(((j30_0)object4).O ? 1 : 0);
                if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object4).v(), object7 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                    rk_0.a(n16, (j30_0)object4, n16, (N20$a$a)object9);
                }
                Ow3.a((b30_0)object4, object6, (Function2)object);
                long l3 = nz_1.h;
                long l4 = 0L;
                object8 = null;
                n4 = 0;
                object3 = null;
                n8 = 0;
                object7 = null;
                int n17 = 48;
                n10 = 29;
                pB2.a(null, l3, 0.0f, l4, 0, (b30_0)object4, n17, n10);
                boolean bl9 = true;
                ((j30_0)object4).T(bl9);
                ((j30_0)object4).T(false);
            } else {
                n16 = object3 instanceof HD.a;
                if (n16 != 0) {
                    n4 = 1267422761;
                    ((j30_0)object4).K(n4);
                    object3 = HA.e(gx, false);
                    n16 = ((j30_0)object4).P;
                    object7 = ((j30_0)object4).P();
                    object6 = a30_0.c((b30_0)object4, (LP1)object6);
                    boolean bl10 = mp2 instanceof mp;
                    if (!bl10) {
                        s20.a();
                        throw null;
                    }
                    ((j30_0)object4).A();
                    bl10 = ((j30_0)object4).O;
                    if (bl10) {
                        ((j30_0)object4).C(xp1$a);
                    } else {
                        ((j30_0)object4).n();
                    }
                    Ow3.a((b30_0)object4, object3, n20$a$b);
                    Ow3.a((b30_0)object4, object7, (Function2)object8);
                    n4 = (int)(((j30_0)object4).O ? 1 : 0);
                    if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object4).v(), object7 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                        rk_0.a(n16, (j30_0)object4, n16, (N20$a$a)object9);
                    }
                    Ow3.a((b30_0)object4, object6, (Function2)object);
                    object = new id_1(dr0_03);
                    rB0.a((Function0)object, (b30_0)object4, 0);
                    boolean bl11 = true;
                    ((j30_0)object4).T(bl11);
                    ((j30_0)object4).T(false);
                } else {
                    boolean bl12 = object3 instanceof HD$d;
                    if (!bl12) {
                        ((j30_0)object4).K(-97684918);
                        ((j30_0)object4).T(false);
                        object4 = new NoWhenBranchMatchedException();
                        throw object4;
                    }
                    ((j30_0)object4).K(1267742619);
                    int n18 = 72;
                    object3 = (HD$d)object3;
                    qd_0.b(yT13, dr0_03, (HD$d)object3, (b30_0)object4, n18);
                    ((j30_0)object4).T(false);
                }
            }
        }
        boolean bl13 = true;
        ((j30_0)object4).T(bl13);
        object5 = ((j30_0)object4).X();
        if (object5 != null) {
            object4 = object6;
            yT13 = yT12;
            dr0_03 = dr0_02;
            object = string2;
            object2 = i3;
            n4 = n3;
            ((CF2)object5).d = object6 = new jd_2(yT12, dr0_02, string2, i3, n3);
        }
    }

    public static final void b(yT1 yT12, dr0_0 dr0_02, HD$d hD$d, b30_0 b30_02, int n3) {
        cd_0 cd_02;
        yT1 yT13 = yT12;
        dr0_0 dr0_03 = dr0_02;
        HD$d hD$d2 = hD$d;
        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(hD$d, "state");
        Object object = b30_02;
        Object object2 = b30_02.g(2144161486);
        p83_0 p83_02 = hD$d.a;
        ft1_2 ft1_22 = jt1.a((b30_0)object2);
        int n4 = 1737682707;
        ((j30_0)object2).K(n4);
        Object object3 = ((j30_0)object2).v();
        object = b30$a.a;
        if (object3 == object) {
            object3 = new kd_2(dr0_02, ft1_22);
            object3 = J83.e((Function0)object3);
            ((j30_0)object2).o(object3);
        }
        object3 = (ib3_0)object3;
        int n7 = 0;
        object = null;
        ((j30_0)object2).T(false);
        Object object4 = object3.getValue();
        Object object5 = null;
        Object object6 = new rd_2((ib3_0)object3, dr0_03, null);
        ly0_0.d((b30_0)object2, object4, (Function2)object6);
        object3 = dr0_03.M0;
        int n8 = 8;
        object4 = J83.b((jb3_2)object3, (b30_0)object2, n8);
        object3 = AndroidCompositionLocals_androidKt.b;
        object3 = zv0_2.b((Context)((j30_0)object2).j((H30)object3));
        boolean bl2 = object3 instanceof Activity;
        if (bl2) {
            object5 = object3 = (Activity)object3;
        }
        qd_0.d((b30_0)object2, 0);
        object3 = new sd_1(dr0_03, yT13);
        n7 = 480607785;
        u10 u102 = v10.c(n7, (fx0_2)object3, (b30_0)object2);
        long l2 = OX.b;
        object3 = cd_02;
        object = object4;
        object4 = dr0_02;
        object6 = yT12;
        cd_02 = new cd_0((tr1_0)object, dr0_02, p83_02, ft1_22, yT12, (Activity)object5);
        n4 = -1606575408;
        u10 u103 = v10.c(n4, cd_02, (b30_0)object2);
        long l3 = 0L;
        int n10 = 384;
        cd_02 = null;
        long l4 = 0L;
        long l7 = 0L;
        long l8 = 0L;
        int n14 = 0xC30000;
        int n15 = 98299;
        object3 = object2;
        object2 = u102;
        HS2.a(null, null, u102, null, null, null, 0, false, null, false, null, 0.0f, l4, l7, l8, l2, l3, u103, (b30_0)object3, n10, n14, n15);
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            n8 = n3;
            ((CF2)object3).d = object = new ld_2(yT13, dr0_03, hD$d2, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(BrandItemData brandItemData, xd_1 xd_12, yd_1 yd_12, b30_0 object, int n3) {
        Object object2;
        Object object3 = brandItemData;
        Object object4 = xd_12;
        Object object5 = yd_12;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(brandItemData, "brandsData");
        Intrinsics.checkNotNullParameter(xd_12, "onItemClick");
        Intrinsics.checkNotNullParameter(yd_12, "onFollowClicked");
        int n7 = -1345719971;
        Object object6 = object;
        Object object7 = object.g(n7);
        LP1$a lP1$a = LP1$a.b;
        long l2 = OX.b;
        Object object8 = fg2_1.a;
        object6 = j.m(a.b(lP1$a, l2, (i13)object8));
        int n8 = 1065353216;
        float f5 = 1.0f;
        object8 = j.c((LP1)object6, f5);
        float f6 = uq0_0.o;
        Object object9 = null;
        int n10 = 0;
        int n14 = 10;
        float f7 = f6;
        float f8 = f6;
        object8 = h.i((LP1)object8, f6, 0.0f, f6, 0.0f, n14);
        Object object10 = new bd_1(xd_12, brandItemData);
        object8 = x20_0.d((LP1)object8, (Function0)object10);
        Object object11 = zp.a;
        object10 = Nc$a.j;
        Object object12 = null;
        object10 = iQ2.a((zp$e)object11, (Gx$b)object10, (b30_0)object7, 0);
        int n15 = ((j30_0)object7).P;
        Object object13 = ((j30_0)object7).P();
        object8 = a30_0.c((b30_0)object7, (LP1)object8);
        N20.W.getClass();
        Object object14 = N20$a.b;
        Object object15 = ((j30_0)object7).a;
        int n16 = object15 instanceof mp;
        mp mp2 = object15;
        if (n16 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        n16 = ((j30_0)object7).O;
        if (n16 != 0) {
            ((j30_0)object7).C((Function0)object14);
        } else {
            ((j30_0)object7).n();
        }
        object12 = N20$a.e;
        Ow3.a((b30_0)object7, object10, (Function2)object12);
        object10 = N20$a.d;
        Ow3.a((b30_0)object7, object13, (Function2)object10);
        object13 = N20$a.f;
        n10 = ((j30_0)object7).O;
        if (n10 != 0 || (n8 = (int)(Intrinsics.areEqual(object15 = ((j30_0)object7).v(), object2 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
            rk_0.a(n15, (j30_0)object7, n15, (N20$a$a)object13);
        }
        object2 = N20$a.c;
        Ow3.a((b30_0)object7, object8, (Function2)object2);
        int n17 = 1065353216;
        float f11 = 1.0f;
        object8 = j.c(lP1$a, f11);
        n15 = 0;
        n10 = 0;
        int n18 = 5;
        Object object16 = object10;
        object10 = object8;
        object8 = object13;
        f8 = f6;
        object5 = object12;
        int n19 = 0;
        f6 = 0.0f;
        object6 = null;
        n16 = n18;
        object10 = h.i((LP1)object10, 0.0f, f8, 0.0f, f8, n18);
        object9 = Nc$a.k;
        f8 = 6.7E-44f;
        object9 = iQ2.a((zp$e)object11, (Gx$b)object9, (b30_0)object7, 48);
        int n20 = ((j30_0)object7).P;
        object15 = ((j30_0)object7).P();
        object10 = a30_0.c((b30_0)object7, (LP1)object10);
        object11 = mp2;
        n14 = mp2 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        n14 = (int)(((j30_0)object7).O ? 1 : 0);
        if (n14 != 0) {
            object12 = object14;
            ((j30_0)object7).C((Function0)object14);
        } else {
            object12 = object14;
            ((j30_0)object7).n();
        }
        Ow3.a((b30_0)object7, object9, (Function2)object5);
        object14 = object16;
        Ow3.a((b30_0)object7, object15, (Function2)object16);
        n15 = (int)(((j30_0)object7).O ? 1 : 0);
        if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object9 = ((j30_0)object7).v(), object15 = Integer.valueOf(n20)) ? 1 : 0)) == 0) {
            rk_0.a(n20, (j30_0)object7, n20, (N20$a$a)object8);
        }
        Ow3.a((b30_0)object7, object10, (Function2)object2);
        object10 = new cd_1((xd_1)object4, (BrandItemData)object3);
        object10 = x20_0.d(lP1$a, (Function0)object10);
        object9 = brandItemData.getLogo();
        String string2 = "";
        if (object9 == null) {
            object9 = string2;
        }
        f8 = uq0_0.z;
        long l3 = 0L;
        String string3 = "Brand Image";
        int n21 = 0;
        long l4 = 0L;
        int n22 = 27648;
        int n24 = 996;
        object6 = object10;
        object10 = object2;
        object2 = object9;
        object9 = object8;
        object15 = object10;
        f7 = f8;
        object13 = object8;
        object9 = string3;
        Object object17 = object8;
        object13 = null;
        Object object18 = object10;
        Object object19 = object14;
        Lambda lambda = object12;
        n16 = 0;
        object12 = null;
        object = lP1$a;
        long l7 = 0L;
        int n25 = n24;
        ov3.e((LP1)object6, (String)object2, false, f8, string3, false, l4, 0.0f, l7, l3, (b30_0)object7, n22, n24);
        f7 = uq0_0.k;
        n17 = 0;
        f11 = 0.0f;
        object8 = null;
        n15 = 0;
        object9 = null;
        n20 = 10;
        f8 = 1.4E-44f;
        object6 = lP1$a;
        f5 = f7;
        object6 = h.i(lP1$a, f7, 0.0f, f7, 0.0f, n20);
        n8 = 1058642330;
        f5 = 0.6f;
        double d2 = f5;
        long l8 = 0L;
        double d5 = 0.0;
        n10 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (n10 <= 0) {
            object3 = g9_0.a(f5, "invalid weight ", "; must be greater than zero");
            object3 = object3.toString();
            object4 = new IllegalArgumentException((String)object3);
            throw object4;
        }
        int n26 = 0x7F7FFFFF;
        f7 = Float.MAX_VALUE;
        f5 = f.c(f5, f7);
        n16 = 1;
        object8 = new LayoutWeightElement(f5, n16 != 0);
        object6 = object6.then((LP1)object8);
        object2 = zp.c;
        object8 = Nc$a.m;
        n15 = 0;
        object9 = null;
        object2 = oZ.a((zp$l)object2, (Gx$a)object8, (b30_0)object7, 0);
        n17 = ((j30_0)object7).P;
        object10 = ((j30_0)object7).P();
        object6 = a30_0.c((b30_0)object7, (LP1)object6);
        object13 = object11;
        n20 = object11 instanceof mp;
        if (n20 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        n20 = (int)(((j30_0)object7).O ? 1 : 0);
        if (n20 != 0) {
            object13 = lambda;
            ((j30_0)object7).C((Function0)((Object)lambda));
        } else {
            ((j30_0)object7).n();
        }
        Ow3.a((b30_0)object7, object2, (Function2)object5);
        object5 = object19;
        Ow3.a((b30_0)object7, object10, (Function2)object19);
        boolean bl2 = ((j30_0)object7).O;
        if (bl2 || !(bl2 = Intrinsics.areEqual(object5 = ((j30_0)object7).v(), object2 = Integer.valueOf(n17)))) {
            object5 = object17;
            rk_0.a(n17, (j30_0)object7, n17, (N20$a$a)object17);
        }
        object5 = object18;
        Ow3.a((b30_0)object7, object6, (Function2)object18);
        object5 = brandItemData.getName();
        object6 = object5 == null ? string2 : object5;
        long l12 = oj3_2.d;
        long l14 = OX.f;
        object5 = y20_0.a;
        object14 = object2;
        object2 = new tv0_0(700);
        object2 = new dd_1((xd_1)object4, (BrandItemData)object3);
        object13 = object;
        object2 = x20_0.d((LP1)object, (Function0)object2);
        l8 = l12;
        object12 = object5;
        Ll3.b((String)object6, (LP1)object2, l14, l12, null, (tv0_0)object14, (RU0)object5, 0L, null, null, 0L, 2, false, 1, 0, null, null, (b30_0)object7, 1772928, 3120, 120720);
        f11 = uq0_0.e;
        n26 = 0;
        f7 = 0.0f;
        object10 = null;
        n15 = 0;
        object9 = null;
        n8 = 0;
        f5 = 0.0f;
        n20 = 13;
        f8 = 1.8E-44f;
        object6 = object;
        object2 = h.i((LP1)object, 0.0f, f11, 0.0f, 0.0f, n20);
        object6 = brandItemData.getTagsFromList();
        l8 = oj3_2.b;
        l14 = nz_1.b;
        object14 = object15;
        n16 = 400;
        object15 = new tv0_0(n16);
        n24 = 1772592;
        n10 = 0;
        object15 = null;
        l7 = 0L;
        int n27 = 0;
        mp2 = null;
        l3 = 0L;
        n25 = 2;
        string2 = null;
        n21 = 1;
        int n28 = 3120;
        int n29 = 120720;
        Ll3.b((String)object6, (LP1)object2, l14, l8, null, (tv0_0)object14, (RU0)object5, l7, null, null, l3, n25, false, n21, 0, null, null, (b30_0)object7, n24, n28, n29);
        bl2 = true;
        ((j30_0)object7).T(bl2);
        n19 = brandItemData.isFollowed();
        object2 = b30$a.a;
        n17 = 256;
        f11 = 3.59E-43f;
        if (n19 != 0) {
            n19 = -1396120198;
            f6 = -5.709819E-12f;
            ((j30_0)object7).K(n19);
            object6 = j.o((LP1)object);
            f7 = -2.2588393E17f;
            ((j30_0)object7).K(-599220209);
            n26 = n4 & 0x380 ^ 0x180;
            object11 = yd_12;
            if (n26 > n17 && (n26 = (int)(((j30_0)object7).J(yd_12) ? 1 : 0)) != 0 || (n26 = n4 & 0x180) == n17) {
                n16 = 1;
            } else {
                n16 = 0;
                object12 = null;
            }
            object8 = ((j30_0)object7).v();
            if (n16 != 0 || object8 == object2) {
                n8 = 0;
                f5 = 0.0f;
                object2 = null;
                object8 = new ed_1(object11, 0);
                ((j30_0)object7).o(object8);
            }
            object8 = (Function0)object8;
            lP1$a = null;
            ((j30_0)object7).T(false);
            n8 = 390;
            f5 = 5.47E-43f;
            n26 = 0;
            f7 = 0.0f;
            object10 = null;
            ov3.d((LP1)object6, null, (Function0)object8, (b30_0)object7, n8);
            ((j30_0)object7).T(false);
        } else {
            object11 = yd_12;
            lP1$a = null;
            ((j30_0)object7).K(-1395852947);
            object9 = j.o((LP1)object);
            object13 = tv0_0.o;
            f6 = -2.2604801E17f;
            ((j30_0)object7).K(-599210658);
            n19 = n4 & 0x380 ^ 0x180;
            if (n19 > n17 && (n19 = (int)(((j30_0)object7).J(yd_12) ? 1 : 0)) != 0 || (n19 = n4 & 0x180) == n17) {
                n16 = 1;
            } else {
                n16 = 0;
                object12 = null;
            }
            object6 = ((j30_0)object7).v();
            if (n16 != 0 || object6 == object2) {
                n8 = 0;
                f5 = 0.0f;
                object2 = null;
                object6 = new fd_1(object11, 0);
                ((j30_0)object7).o(object6);
            }
            object12 = object6;
            object12 = (Function0)object6;
            ((j30_0)object7).T(false);
            n14 = 0;
            object14 = null;
            mp2 = null;
            n19 = 0;
            f6 = 0.0f;
            object6 = null;
            object2 = "+ Follow";
            n17 = 0;
            f11 = 0.0f;
            object8 = null;
            n26 = 0;
            f7 = 0.0f;
            object10 = null;
            n10 = 0;
            object15 = null;
            n18 = 717;
            object5 = null;
            lP1$a = null;
            object11 = object7;
            n27 = 221232;
            ov3.f(false, (String)object2, 0.0f, 0.0f, (LP1)object9, (tv0_0)object13, 0.0f, null, (Function0)object12, false, (b30_0)object7, n27, n18);
            ((j30_0)object7).T(false);
            bl2 = true;
        }
        object5 = fn0_2.a((j30_0)object7, bl2, bl2);
        if (object5 != null) {
            object6 = yd_12;
            ((CF2)object5).d = object7 = new gd_1((BrandItemData)object3, (xd_1)object4, yd_12, n4);
        }
    }

    public static final void d(b30_0 object, int n3) {
        Object object2;
        int n4 = -90617707;
        object = object.g(n4);
        if (n3 == 0 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = AndroidCompositionLocals_androidKt.f;
            object2 = (View)((j30_0)object).j((H30)object2);
            ViewTreeObserver viewTreeObserver = object2.getViewTreeObserver();
            nd_1 nd_12 = new nd_1(viewTreeObserver, (View)object2);
            ly0_0.b(viewTreeObserver, nd_12, (b30_0)object);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new od_2(n3);
        }
    }

    public static final void e(int n3, b30_0 b30_02, dr0_0 dr0_02, yT1 yT12) {
        dr0_0 dr0_03 = dr0_02;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
        int n4 = 1628671111;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = AndroidCompositionLocals_androidKt.b;
        object = zv0_2.b((Context)((j30_0)object2).j((H30)object));
        int n7 = object instanceof Activity;
        object = n7 != 0 ? (Activity)object : null;
        long l2 = OX.b;
        long l3 = OX.f;
        u10 u102 = y10.b;
        fd_0 fd_02 = new fd_0((Activity)object, dr0_03, yT13);
        u10 u103 = v10.c(-2072837683, fd_02, (b30_0)object2);
        object = null;
        n7 = 221574;
        int n8 = 74;
        Km.c(0.0f, n7, n8, l2, l3, u102, (b30_0)object2, null, null, u103);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n7 = n3;
            ((CF2)object2).d = object = new md_2(dr0_03, yT13, n3);
        }
    }
}

