/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.focus.c;
import androidx.navigation.e;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$font;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UE1
 */
public final class ue1_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(CMSNavigation cMSNavigation, ve1_1 ve1_12, boolean bl2, bf1_2 bf1_22, b30_0 object, int n3) {
        void var61_63;
        Object object2;
        int n4;
        Object object3;
        Object object4;
        bf1_2 bf1_23;
        boolean bl3;
        Object object5;
        Object object6;
        block23: {
            float f5;
            float f6;
            int n7;
            int n8;
            float f7;
            Object object7;
            long l2;
            Object object8;
            Object object9;
            float f8;
            int n10;
            int n14;
            av0_0 av0_02;
            u10 u102;
            Object object10;
            int n15;
            int n16;
            mp mp2;
            Object object11;
            Object object12;
            Object object13;
            int n17;
            Object object14;
            Object object15;
            Object object16;
            float f11;
            int n18;
            int n19;
            int n20;
            Object object17;
            float f12;
            float f14;
            float f15;
            int n21;
            Object object18;
            Object object19;
            Object object20;
            float f16;
            block22: {
                block21: {
                    object6 = cMSNavigation;
                    object5 = ve1_12;
                    bl3 = bl2;
                    bf1_23 = bf1_22;
                    f16 = 0.0f;
                    object20 = null;
                    Intrinsics.checkNotNullParameter(cMSNavigation, "category");
                    Intrinsics.checkNotNullParameter(ve1_12, "onCardArrowClick");
                    Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
                    int n22 = -1210861340;
                    object4 = object;
                    object3 = object.g(n22);
                    object19 = LP1$a.b;
                    object18 = j.c;
                    n21 = 8;
                    f15 = 1.1E-44f;
                    f14 = n21;
                    f12 = 0.0f;
                    object17 = null;
                    n20 = 0;
                    n19 = 0;
                    n18 = 7;
                    f11 = 9.8E-45f;
                    object4 = object18;
                    object4 = h.i((LP1)object18, 0.0f, 0.0f, 0.0f, f14, n18);
                    object16 = zp.c;
                    object15 = Nc$a.m;
                    object14 = oZ.a((zp$l)object16, (Gx$a)object15, (b30_0)object3, 0);
                    n17 = ((j30_0)object3).P;
                    object13 = ((j30_0)object3).P();
                    object4 = a30_0.c((b30_0)object3, (LP1)object4);
                    N20.W.getClass();
                    object12 = N20$a.b;
                    object11 = ((j30_0)object3).a;
                    n4 = object11 instanceof mp;
                    mp2 = object11;
                    if (n4 == 0) {
                        s20.a();
                        throw null;
                    }
                    ((j30_0)object3).A();
                    n4 = ((j30_0)object3).O;
                    if (n4 != 0) {
                        ((j30_0)object3).C((Function0)object12);
                    } else {
                        ((j30_0)object3).n();
                    }
                    object20 = N20$a.e;
                    Ow3.a((b30_0)object3, object14, (Function2)object20);
                    object14 = N20$a.d;
                    Ow3.a((b30_0)object3, object13, (Function2)object14);
                    object13 = N20$a.f;
                    n16 = ((j30_0)object3).O;
                    if (n16 != 0 || (n15 = Intrinsics.areEqual(object11 = ((j30_0)object3).v(), object2 = Integer.valueOf(n17))) == 0) {
                        rk_0.a(n17, (j30_0)object3, n17, (N20$a$a)object13);
                    }
                    object2 = N20$a.c;
                    Ow3.a((b30_0)object3, object4, (Function2)object2);
                    f14 = 1.0f;
                    object10 = SP2.a(0.0f);
                    object17 = j.c((LP1)object19, 1.0f);
                    Object object21 = object14;
                    object4 = new ga0_1(1);
                    n19 = 0;
                    object4 = CY2.b((LP1)object17, false, (Function1)object4);
                    object14 = new qe1_1((ve1_1)object5, (CMSNavigation)object6, bl3);
                    u102 = v10.c(-1235137795, (fx0_2)object14, (b30_0)object3);
                    long l3 = 0L;
                    av0_02 = null;
                    n14 = 0x1B0000;
                    n10 = 28;
                    f8 = 3.9E-44f;
                    n17 = 1065353216;
                    f12 = 1.0f;
                    object9 = object21;
                    object14 = object10;
                    object8 = object13;
                    l2 = l3;
                    object7 = mp2;
                    f7 = f14;
                    n16 = 0;
                    object11 = null;
                    f14 = 0.0f;
                    Xp1$a xp1$a = object12;
                    f11 = f7;
                    Gx$a gx$a = object15;
                    object15 = u102;
                    zp$k zp$k = object16;
                    object16 = object3;
                    object = object19;
                    n8 = n14;
                    n7 = n10;
                    f7 = f8;
                    JL.a((LP1)object4, (i13)object10, l3, null, f11, u102, (b30_0)object3, n14, n10);
                    n21 = -451796485;
                    f15 = -4.313077E22f;
                    ((j30_0)object3).K(n21);
                    if (!bl3 || (object19 = cMSNavigation.getChildDetails()) == null) break block21;
                    n21 = (int)(object19.isEmpty() ? 1 : 0);
                    n19 = 1;
                    if ((n21 ^= n19) != n19) break block21;
                    n21 = 16;
                    f15 = 2.2E-44f;
                    f6 = n21;
                    f14 = 0.0f;
                    object11 = null;
                    n18 = 10;
                    f11 = 1.4E-44f;
                    object4 = object18;
                    object4 = h.i((LP1)object18, f6, 0.0f, f6, 0.0f, n18);
                    object15 = gx$a;
                    object14 = zp$k;
                    f12 = 0.0f;
                    object17 = null;
                    object14 = oZ.a(zp$k, gx$a, (b30_0)object3, 0);
                    n17 = ((j30_0)object3).P;
                    object13 = ((j30_0)object3).P();
                    object4 = a30_0.c((b30_0)object3, (LP1)object4);
                    object12 = mp2;
                    n16 = mp2 instanceof mp;
                    if (n16 == 0) {
                        s20.a();
                        throw null;
                    }
                    ((j30_0)object3).A();
                    n16 = ((j30_0)object3).O;
                    if (n16 != 0) {
                        object11 = xp1$a;
                        ((j30_0)object3).C(xp1$a);
                    } else {
                        ((j30_0)object3).n();
                    }
                    Ow3.a((b30_0)object3, object14, (Function2)object20);
                    object20 = object9;
                    Ow3.a((b30_0)object3, object13, (Function2)object9);
                    n4 = (int)(((j30_0)object3).O ? 1 : 0);
                    if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object20 = ((j30_0)object3).v(), object14 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                        object20 = object8;
                        rk_0.a(n17, (j30_0)object3, n17, (N20$a$a)object8);
                    }
                    Ow3.a((b30_0)object3, object4, (Function2)object2);
                    n15 = 1734084845;
                    f5 = 1.0390853E24f;
                    ((j30_0)object3).K(n15);
                    object2 = object19;
                    object2 = xx_2.g((Collection)object19).d();
                    break block22;
                }
                n15 = 0;
                float f17 = 0.0f;
                object2 = null;
                boolean bl4 = true;
                break block23;
            }
            while ((n4 = (int)(((ui1_2)object2).c ? 1 : 0)) != 0) {
                n4 = ((mi1_2)object2).nextInt();
                object20 = (CMSNavigation)object19.get(n4);
                n16 = 0;
                f14 = 0.0f;
                n7 = 10;
                f7 = 1.4E-44f;
                object4 = object;
                object18 = object19;
                object19 = object12;
                n18 = n7;
                f11 = f7;
                object4 = h.i((LP1)object, f6, 0.0f, f6, 0.0f, n7);
                object14 = zp.c;
                f12 = 0.0f;
                object17 = null;
                object14 = oZ.a((zp$l)object14, (Gx$a)object15, (b30_0)object3, 0);
                n17 = ((j30_0)object3).P;
                object13 = ((j30_0)object3).P();
                object4 = a30_0.c((b30_0)object3, (LP1)object4);
                N20.W.getClass();
                object11 = N20$a.b;
                n18 = object12 instanceof mp;
                if (n18 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object3).A();
                n18 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n18 != 0) {
                    ((j30_0)object3).C((Function0)object11);
                } else {
                    ((j30_0)object3).n();
                }
                object12 = N20$a.e;
                Ow3.a((b30_0)object3, object14, (Function2)object12);
                object14 = N20$a.d;
                Ow3.a((b30_0)object3, object13, (Function2)object14);
                object13 = N20$a.f;
                object9 = object2;
                n15 = (int)(((j30_0)object3).O ? 1 : 0);
                if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object2 = ((j30_0)object3).v(), object6 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                    rk_0.a(n17, (j30_0)object3, n17, (N20$a$a)object13);
                }
                object2 = N20$a.c;
                Ow3.a((b30_0)object3, object4, (Function2)object2);
                object6 = object;
                f15 = 1.0f;
                object10 = j.c((LP1)object, f15);
                f12 = 24;
                u102 = null;
                int n24 = 5;
                object17 = h.i((LP1)object10, 0.0f, f12, 0.0f, f12, n24);
                object4 = new le1_0(bf1_23, (CMSNavigation)object20);
                boolean bl5 = 7 != 0;
                f7 = f6;
                bl3 = false;
                f6 = 0.0f;
                object16 = null;
                object5 = d.b((LP1)object17, false, null, (Function0)object4, (int)(bl5 ? 1 : 0));
                LU0[] lU0Array = Nc$a.k;
                object4 = zp.f;
                n17 = 54;
                f12 = 7.6E-44f;
                lU0Array = iQ2.a((zp$e)object4, (Gx$b)lU0Array, (b30_0)object3, n17);
                n21 = ((j30_0)object3).P;
                object17 = ((j30_0)object3).P();
                object5 = a30_0.c((b30_0)object3, (LP1)object5);
                boolean bl6 = object19 instanceof mp;
                if (!bl6) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object3).A();
                bl6 = ((j30_0)object3).O;
                if (bl6) {
                    ((j30_0)object3).C((Function0)object11);
                } else {
                    ((j30_0)object3).n();
                }
                Ow3.a((b30_0)object3, lU0Array, (Function2)object12);
                Ow3.a((b30_0)object3, object17, (Function2)object14);
                bl3 = ((j30_0)object3).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(lU0Array = ((j30_0)object3).v(), object14 = Integer.valueOf(n21)))) {
                    rk_0.a(n21, (j30_0)object3, n21, (N20$a$a)object13);
                }
                Ow3.a((b30_0)object3, object5, (Function2)object2);
                object2 = ((CMSNavigation)object20).getName();
                if (object2 == null) {
                    object2 = "";
                }
                object4 = object2;
                n15 = 14;
                long l4 = Em3.f(n15);
                bl5 = R$font.muli_regular;
                n19 = 0;
                object2 = ZU0.a((int)(bl5 ? 1 : 0), null, 0, n15);
                lU0Array = new LU0[]{object2};
                av0_02 = SU0.a(lU0Array);
                object2 = new tv0_0(400);
                long l7 = 0xFFE0E0E0L;
                long l8 = zx_0.d(l7);
                int n25 = 3;
                long l12 = 0L;
                long l14 = 0L;
                object10 = object5;
                object5 = new xm3(l8, l4, (tv0_0)object2, av0_02, l14, null, n25, l12, 16744408);
                n15 = 3;
                f5 = 4.2E-45f;
                bl3 = false;
                lU0Array = null;
                object14 = j.n((LP1)object6, null, n15);
                object13 = null;
                object17 = new me1_0(object20, 0);
                object14 = CY2.b((LP1)object14, false, (Function1)object17);
                n10 = 0;
                f8 = 0.0f;
                l2 = 0L;
                long l15 = 0L;
                n4 = 0;
                object20 = null;
                object8 = object15;
                bl6 = false;
                f6 = 0.0f;
                object16 = null;
                f16 = f7;
                n7 = 0;
                f7 = 0.0f;
                mp2 = null;
                object7 = object19;
                Object object22 = object18;
                n8 = 0;
                object19 = null;
                long l16 = 0L;
                object10 = null;
                long l17 = 0L;
                n24 = 0;
                av0_02 = null;
                n14 = 0;
                char c2 = (char)-4;
                Ll3.b((String)object4, (LP1)object14, l2, l15, null, null, null, l16, null, null, l17, 0, false, 0, 0, null, (xm3)object5, (b30_0)object3, 0, 0, c2);
                bl5 = R$drawable.ic_category_next;
                n21 = 0;
                f15 = 0.0f;
                object4 = null;
                object5 = km2.a((int)(bl5 ? 1 : 0), (b30_0)object3, 0);
                long l18 = xx_1.X;
                n17 = Build.VERSION.SDK_INT;
                n20 = 29;
                n16 = 5;
                f14 = 7.0E-45f;
                if (n17 >= n20) {
                    object17 = gy_0.a.a(l18, n16);
                } else {
                    n20 = zx_0.i(l18);
                    object12 = Lf.b(n16);
                    object17 = new PorterDuffColorFilter(n20, (PorterDuff.Mode)object12);
                }
                object15 = new ay_1(l18, n16, (ColorFilter)object17);
                object11 = i70$a.b;
                object17 = j.n((LP1)object6, null, n15);
                n20 = 0;
                object13 = null;
                n18 = 0;
                f11 = 0.0f;
                object14 = "";
                n8 = 1597880;
                n7 = 40;
                f7 = 5.6E-44f;
                object4 = object5;
                object16 = object3;
                Pd1.a((im2)object5, (String)object14, (LP1)object17, null, (i70_0)object11, 0.0f, (TX)object15, (b30_0)object3, n8, n7);
                ((j30_0)object3).T(true);
                n15 = 1065353216;
                f5 = 1.0f;
                object5 = j.c((LP1)object6, f5);
                double d2 = 0.5;
                f15 = (float)d2;
                object5 = j.d((LP1)object5, f15);
                l18 = xx_1.W;
                object17 = fg2_1.a;
                object5 = a.b((LP1)object5, l18, (i13)object17);
                Q93.b((b30_0)object3, (LP1)object5);
                bl5 = true;
                ((j30_0)object3).T(bl5);
                object5 = ve1_12;
                bl3 = bl2;
                object = object6;
                f6 = f16;
                object2 = object9;
                object15 = object8;
                object12 = object7;
                object19 = object22;
                object6 = cMSNavigation;
            }
            n15 = 0;
            f5 = 0.0f;
            object2 = null;
            boolean bl7 = true;
            ((j30_0)object3).T(false);
            ((j30_0)object3).T(bl7);
        }
        object3 = fn0_2.a((j30_0)object3, false, (boolean)var61_63);
        if (object3 != null) {
            object2 = object4;
            object6 = cMSNavigation;
            object5 = ve1_12;
            bl3 = bl2;
            bf1_23 = bf1_22;
            n4 = n3;
            ((CF2)object3).d = object4 = new ne1_1(cMSNavigation, ve1_12, bl2, bf1_22, n3);
        }
    }

    public static final void b(e e2, bf1_2 bf1_22, CMSNavigation cMSNavigation, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        Object object3;
        Object object4 = e2;
        bf1_2 bf1_23 = bf1_22;
        CMSNavigation cMSNavigation2 = cMSNavigation;
        Intrinsics.checkNotNullParameter(e2, "navController");
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        int n7 = -1177054226;
        Object object5 = b30_02;
        Object object6 = b30_02.g(n7);
        int n8 = 414227746;
        float f5 = 4.5653597E-24f;
        ((j30_0)object6).K(n8);
        object5 = ((j30_0)object6).v();
        Object object7 = b30$a.a;
        boolean bl2 = false;
        float f6 = 0.0f;
        Object object8 = null;
        if (object5 == object7) {
            if (cMSNavigation != null) {
                object5 = cMSNavigation.getChildDetails();
            } else {
                n8 = 0;
                object5 = null;
                f5 = 0.0f;
            }
            bf1_22.getClass();
            object3 = new ArrayList();
            if (object5 != null) {
                object5 = object5.iterator();
                while ((n4 = object5.hasNext()) != 0) {
                    object2 = (CMSNavigation)object5.next();
                    object = new lq_2((CMSNavigation)object2, false);
                    ((ArrayList)object3).add(object);
                }
            }
            object5 = new p83_0();
            ((p83_0)object5).addAll((Collection)object3);
            ((j30_0)object6).o(object5);
        }
        Iterator iterator = object5;
        iterator = (p83_0)object5;
        ((j30_0)object6).T(false);
        Object object9 = LP1$a.b;
        object5 = j.c;
        long l2 = OX.b;
        object = fg2_1.a;
        object5 = a.b(object5, l2, (i13)object);
        object3 = zp.c;
        object2 = Nc$a.m;
        object3 = oZ.a((zp$l)object3, (Gx$a)object2, (b30_0)object6, 0);
        n4 = ((j30_0)object6).P;
        Object object10 = ((j30_0)object6).P();
        object5 = a30_0.c((b30_0)object6, (LP1)object5);
        N20.W.getClass();
        Object object11 = N20$a.b;
        Object object12 = ((j30_0)object6).a;
        int n10 = object12 instanceof mp;
        if (n10 != 0) {
            ((j30_0)object6).A();
            bl2 = ((j30_0)object6).O;
            if (bl2) {
                ((j30_0)object6).C((Function0)object11);
            } else {
                ((j30_0)object6).n();
            }
            object8 = N20$a.e;
            Ow3.a((b30_0)object6, object3, (Function2)object8);
            object8 = N20$a.d;
            Ow3.a((b30_0)object6, object10, (Function2)object8);
            object8 = N20$a.f;
            boolean bl3 = ((j30_0)object6).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object6).v(), object10 = Integer.valueOf(n4)))) {
                rk_0.a(n4, (j30_0)object6, n4, (N20$a$a)object8);
            }
            object8 = N20$a.c;
            Ow3.a((b30_0)object6, object5, (Function2)object8);
            n10 = 1065353216;
            float f7 = 1.0f;
            object5 = j.c((LP1)object9, f7);
            boolean bl4 = true;
            f6 = (float)bl4;
            object5 = j.d((LP1)object5, f6);
            long l3 = xx_1.m;
            object5 = a.b((LP1)object5, l3, (i13)object);
            Q93.b((b30_0)object6, (LP1)object5);
            n8 = -866082379;
            f5 = -5.8885844E7f;
            ((j30_0)object6).K(n8);
            object5 = ((j30_0)object6).v();
            if (object5 == object7) {
                object5 = new ou0_0();
                ((j30_0)object6).o(object5);
            }
            object5 = (ou0_0)object5;
            ((j30_0)object6).T(false);
            float f8 = 0.0f;
            object7 = SP2.a(f8);
            object8 = FocusableKt.b(c.a(j.c((LP1)object9, f7), (ou0_0)object5), bl4, 2);
            object3 = new ie1_0(cMSNavigation2);
            object8 = CY2.b((LP1)object8, false, (Function1)object3);
            object3 = new ue1$a_0(cMSNavigation2, (e)object4, (ou0_0)object5);
            object10 = v10.c(1263076295, (fx0_2)object3, (b30_0)object6);
            l2 = 0L;
            int n14 = 0x1B0000;
            float f11 = 2.479558E-39f;
            int n15 = 28;
            object5 = object8;
            l3 = l2;
            object11 = object6;
            n10 = n14;
            f7 = f11;
            object4 = object9;
            JL.a((LP1)object8, (i13)object7, l2, null, f8, (u10)object10, (b30_0)object6, n14, n15);
            object5 = new ba_2(1);
            object4 = CY2.b((LP1)object9, false, (Function1)object5);
            f5 = 16;
            object4 = h.e((LP1)object4, f5);
            n8 = 1065353216;
            f5 = 1.0f;
            object5 = j.c((LP1)object4, f5);
            object12 = new je1_0(0, iterator, bf1_23);
            object10 = null;
            bl4 = false;
            object11 = null;
            object7 = null;
            bl2 = false;
            f6 = 0.0f;
            object8 = null;
            bl3 = false;
            object3 = null;
            n4 = 0;
            object2 = null;
            f8 = 0.0f;
            object = null;
            int n16 = 254;
            object9 = object6;
            xq1_0.a((LP1)object5, null, null, false, null, null, null, false, (Function1)object12, (b30_0)object6, 0, n16);
            boolean bl5 = true;
            ((j30_0)object6).T(bl5);
            object4 = ((j30_0)object6).X();
            if (object4 != null) {
                object5 = e2;
                ((CF2)object4).d = object6 = new ke1_0(e2, bf1_23, cMSNavigation2, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

