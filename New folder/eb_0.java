/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.focus.c;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from eb
 */
public final class eb_0 {
    public static final void a(yT1 yT12, j7_0 j7_02, CMSNavigation cMSNavigation, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Object object2 = "viewModel";
        Intrinsics.checkNotNullParameter(j7_02, (String)object2);
        int n4 = 936532581;
        object = object.g(n4);
        if (cMSNavigation != null) {
            n4 = 584;
            eb_0.e(yT12, j7_02, cMSNavigation, (b30_0)object, n4);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ua_1(yT12, j7_02, cMSNavigation, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(CMSNavigation cMSNavigation, ib_1 ib_12, jb_2 jb_22, boolean bl2, j7_0 j7_02, b30_0 b30_02, int n3) {
        Object object;
        ib_1 ib_13 = ib_12;
        Intrinsics.checkNotNullParameter(cMSNavigation, "ajioSubCategory");
        Intrinsics.checkNotNullParameter(ib_12, "onCardArrowClick");
        Intrinsics.checkNotNullParameter(jb_22, "onSubCategoryClick");
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        int n4 = -1447938756;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n4);
        object2 = od3_2.a();
        ld3_2 ld3_22 = ld3_2.STORE_AJIOGRAM;
        Object object4 = ld3_22.getStoreId();
        int n7 = Intrinsics.areEqual(object2, object4);
        long l2 = n7 != 0 ? xx_1.g0 : OX.f;
        object2 = od3_2.a();
        String string2 = ld3_22.getStoreId();
        n7 = Intrinsics.areEqual(object2, string2);
        long l3 = n7 != 0 ? OX.f : xx_1.e;
        long l4 = l3;
        object2 = LP1$a.b;
        float f5 = 1.0f;
        Object object5 = j.c((LP1)object2, f5);
        float f6 = 3;
        object5 = h.e((LP1)object5, f6);
        f6 = -2.569203E30f;
        ((j30_0)object3).K(-234768852);
        int n8 = n3 & 0x70 ^ 0x30;
        boolean bl3 = false;
        Object object6 = null;
        int n10 = 32;
        if (n8 > n10 && (n8 = (int)(((j30_0)object3).J(ib_13) ? 1 : 0)) != 0 || (n8 = n3 & 0x30) == n10) {
            n8 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n8 = 0;
            f6 = 0.0f;
            object = null;
        }
        Object object7 = ((j30_0)object3).v();
        if (n8 != 0 || object7 == (object = b30$a.a)) {
            n8 = 0;
            f6 = 0.0f;
            object = null;
            object7 = new ya_1(ib_13, 0);
            ((j30_0)object3).o(object7);
        }
        object7 = (Function0)object7;
        ((j30_0)object3).T(false);
        n8 = 7;
        f6 = 9.8E-45f;
        float f7 = 0.0f;
        object5 = d.b((LP1)object5, false, null, (Function0)object7, n8);
        object = zp.c;
        object7 = Nc$a.m;
        object = oZ.a((zp$l)object, (Gx$a)object7, (b30_0)object3, 0);
        n10 = ((j30_0)object3).P;
        rq2_1 rq2_12 = ((j30_0)object3).P();
        object5 = a30_0.c((b30_0)object3, (LP1)object5);
        N20$a n20$a = N20.W;
        n20$a.getClass();
        Xp1$a xp1$a = N20$a.b;
        object6 = ((j30_0)object3).a;
        bl3 = object6 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        ((j30_0)object3).A();
        bl3 = ((j30_0)object3).O;
        if (bl3) {
            ((j30_0)object3).C(xp1$a);
        } else {
            ((j30_0)object3).n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object3, object, n20$a$b);
        N20$a$d n20$a$d = N20$a.d;
        Ow3.a((b30_0)object3, rq2_12, n20$a$d);
        N20$a$a n20$a$a = N20$a.f;
        n8 = (int)(((j30_0)object3).O ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object = ((j30_0)object3).v(), object6 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
            rk_0.a(n10, (j30_0)object3, n10, n20$a$a);
        }
        N20$a$c n20$a$c = N20$a.c;
        Ow3.a((b30_0)object3, object5, n20$a$c);
        Object var11_18 = null;
        f7 = 0.0f;
        object7 = SP2.a(4);
        f5 = 1.0f;
        object6 = j.c((LP1)object2, f5);
        object5 = j7_02;
        object = cMSNavigation;
        object2 = new cb_1(l2, bl2, j7_02, cMSNavigation, l4);
        n7 = 857326851;
        u10 u102 = v10.c(n7, (fx0_2)object2, (b30_0)object3);
        l3 = 0L;
        n20$a = null;
        int n14 = 1769478;
        int n15 = 28;
        boolean bl4 = true;
        JL.a((LP1)object6, (i13)object7, l3, null, f7, u102, (b30_0)object3, n14, n15);
        ((j30_0)object3).T(bl4);
        object5 = ((j30_0)object3).X();
        if (object5 != null) {
            object3 = object;
            ib_13 = ib_12;
            object2 = jb_22;
            object4 = j7_02;
            ((CF2)object5).d = object = new za_1(cMSNavigation, ib_12, jb_22, bl2, j7_02, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(j7_0 j7_02, CMSNavigation cMSNavigation, b30_0 object, int n3) {
        int n4;
        j7_0 j7_03 = j7_02;
        Object object2 = cMSNavigation;
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        Intrinsics.checkNotNullParameter(cMSNavigation, "ajioSubCategory");
        int n7 = 868024212;
        Object object3 = object;
        Object object4 = object.g(n7);
        object3 = od3_2.a();
        Object object5 = ld3_2.STORE_AJIOGRAM;
        Object object6 = ((ld3_2)((Object)object5)).getStoreId();
        int n8 = Intrinsics.areEqual(object3, object6);
        long l2 = n8 != 0 ? xx_1.g0 : OX.f;
        object3 = od3_2.a();
        String string2 = ((ld3_2)((Object)object5)).getStoreId();
        n8 = Intrinsics.areEqual(object3, string2);
        long l3 = n8 != 0 ? xx_1.h0 : xx_1.m;
        long l4 = l3;
        object3 = od3_2.a();
        object5 = ((ld3_2)((Object)object5)).getStoreId();
        n8 = Intrinsics.areEqual(object3, object5);
        long l7 = n8 != 0 ? OX.f : xx_1.e;
        long l8 = l7;
        n8 = -398392758;
        ((j30_0)object4).K(n8);
        object3 = ((j30_0)object4).v();
        object5 = b30$a.a;
        if (object3 == object5) {
            object3 = cMSNavigation.getChildDetails();
            object3 = (ArrayList)j7_03.c((List)object3);
            object5 = new p83_0();
            ((p83_0)object5).addAll((Collection)object3);
            ((j30_0)object4).o(object5);
            object3 = object5;
        }
        Object object7 = object3;
        object7 = (p83_0)object3;
        int n10 = 0;
        Object object8 = null;
        ((j30_0)object4).T(false);
        n8 = (int)(((p83_0)object7).isEmpty() ? 1 : 0);
        if (n8 == 0) {
            int n14;
            float f5;
            Object object9 = LP1$a.b;
            object3 = fg2_1.a;
            Object object10 = a.b((LP1)object9, l2, (i13)object3);
            int n15 = 7;
            float f6 = n15;
            int n16 = 0;
            int n17 = 0;
            LP1 lP1 = null;
            int n18 = 13;
            object3 = h.i((LP1)object10, 0.0f, f6, 0.0f, 0.0f, n18);
            object5 = zp.c;
            object6 = Nc$a.m;
            object5 = oZ.a((zp$l)object5, (Gx$a)object6, (b30_0)object4, 0);
            int n19 = ((j30_0)object4).P;
            Object object11 = ((j30_0)object4).P();
            object3 = a30_0.c((b30_0)object4, (LP1)object3);
            object10 = N20.W;
            object10.getClass();
            Object object12 = N20$a.b;
            object8 = ((j30_0)object4).a;
            n10 = object8 instanceof mp;
            if (n10 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object4).A();
            n10 = ((j30_0)object4).O;
            if (n10 != 0) {
                ((j30_0)object4).C((Function0)object12);
            } else {
                ((j30_0)object4).n();
            }
            object12 = N20$a.e;
            Ow3.a((b30_0)object4, object5, (Function2)object12);
            object5 = N20$a.d;
            Ow3.a((b30_0)object4, object11, (Function2)object5);
            object5 = N20$a.f;
            boolean bl2 = ((j30_0)object4).O;
            if (bl2 || !(bl2 = Intrinsics.areEqual(object11 = ((j30_0)object4).v(), object12 = Integer.valueOf(n19)))) {
                rk_0.a(n19, (j30_0)object4, n19, (N20$a$a)object5);
            }
            object5 = N20$a.c;
            Ow3.a((b30_0)object4, object3, (Function2)object5);
            n8 = -2140129939;
            ((j30_0)object4).K(n8);
            object3 = xx_2.g((Collection)object7);
            object8 = ((kotlin.ranges.c)object3).d();
            while ((n8 = (int)(((ui1_2)object8).c ? 1 : 0)) != 0) {
                n8 = ((mi1_2)object8).nextInt();
                object12 = object5 = ((p83_0)object7).get(n8);
                object12 = (lq_2)object5;
                n19 = (int)(((lq_2)object12).b ? 1 : 0);
                float f7 = 0.0f;
                n4 = 4;
                float f8 = n4;
                object5 = SP2.a(f8);
                f5 = 1.0f;
                object2 = j.c((LP1)object9, f5);
                object11 = new ab_1(j7_03, (lq_2)object12, (p83_0)object7, n8);
                object = object9;
                object10 = object8;
                int n20 = 7;
                lP1 = d.b((LP1)object2, false, null, (Function0)object11, n20);
                int n21 = 2;
                object2 = h.i(lP1, f6, 0.0f, f6, f6, n21);
                object11 = new eb$a((lq_2)object12, l8, n19 != 0);
                n10 = 268707208;
                object8 = v10.c(n10, (fx0_2)object11, (b30_0)object4);
                n17 = 24;
                n16 = 0x1B0000;
                object3 = object2;
                n14 = n19;
                l2 = l4;
                float f11 = f6;
                string2 = null;
                f6 = 0.0f;
                object9 = object12;
                Object object13 = object;
                object9 = object8;
                object8 = object4;
                long l12 = l8;
                JL.a((LP1)object2, (i13)object5, l4, null, f7, (u10)object9, (b30_0)object4, n16, n17);
                n8 = -2140029110;
                ((j30_0)object4).K(n8);
                if (n19 != 0) {
                    n14 = 72;
                    f5 = 1.01E-43f;
                    object5 = object12;
                    eb_0.d(j7_03, (lq_2)object12, (b30_0)object4, n14);
                }
                n14 = 0;
                f5 = 0.0f;
                object2 = null;
                ((j30_0)object4).T(false);
                object8 = object10;
                object9 = object13;
                f6 = f11;
                l8 = l12;
            }
            object2 = null;
            ((j30_0)object4).T(false);
            n14 = 1;
            f5 = Float.MIN_VALUE;
            ((j30_0)object4).T(n14 != 0);
        }
        if ((object2 = ((j30_0)object4).X()) != null) {
            object3 = cMSNavigation;
            n4 = n3;
            ((CF2)object2).d = object4 = new ra_1(j7_03, cMSNavigation, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final void d(j7_0 j7_02, lq_2 lq_22, b30_0 b30_02, int n3) {
        LP1$a lP1$a;
        fG2$a fG2$a;
        int n4;
        float f5;
        float f6;
        Integer n7;
        j7_0 j7_03 = j7_02;
        lq_2 lq_23 = lq_22;
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        Intrinsics.checkNotNullParameter(lq_22, "subCategory");
        int n8 = -119339740;
        Object object = b30_02;
        Object object2 = b30_02.g(n8);
        object = od3_2.a();
        Object object3 = ld3_2.STORE_AJIOGRAM;
        Object object4 = ((ld3_2)((Object)object3)).getStoreId();
        int n10 = Intrinsics.areEqual(object, object4);
        long l2 = n10 != 0 ? xx_1.g0 : OX.f;
        object = od3_2.a();
        object3 = ((ld3_2)((Object)object3)).getStoreId();
        n10 = Intrinsics.areEqual(object, object3);
        long l3 = n10 != 0 ? OX.f : xx_1.e;
        long l4 = l3;
        Object object5 = LP1$a.b;
        object = j.c;
        Object object6 = fg2_1.a;
        LP1 lP1 = a.b((LP1)object, l2, (i13)object6);
        n10 = 8;
        float f7 = n10;
        int n14 = 7;
        object = h.i(lP1, 0.0f, 0.0f, 0.0f, f7, n14);
        object3 = zp.c;
        object4 = Nc$a.m;
        object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object2, 0);
        int n15 = ((j30_0)object2).P;
        Object object7 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object8 = ((j30_0)object2).a;
        boolean bl2 = object8 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        bl2 = ((j30_0)object2).O;
        if (bl2) {
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object2, object3, n20$a$b);
        object3 = N20$a.d;
        Ow3.a((b30_0)object2, object7, (Function2)object3);
        object3 = N20$a.f;
        int n16 = ((j30_0)object2).O;
        if (n16 != 0 || (n16 = Intrinsics.areEqual(object7 = ((j30_0)object2).v(), n7 = Integer.valueOf(n15))) == 0) {
            rk_0.a(n15, (j30_0)object2, n15, (N20$a$a)object3);
        }
        object3 = N20$a.c;
        Ow3.a((b30_0)object2, object, (Function2)object3);
        object = lq_23.a.getChildDetails();
        if (object != null) {
            object = xx_2.g((Collection)object);
        } else {
            n10 = 0;
            object = null;
            f7 = 0.0f;
        }
        int n17 = -1178392732;
        ((j30_0)object2).K(n17);
        int n18 = 16;
        float f8 = 2.2E-44f;
        if (object != null) {
            object4 = ((kotlin.ranges.c)object).d();
            while ((n10 = (int)(((ui1_2)object4).c ? 1 : 0)) != 0) {
                object = (Number)object4.next();
                n10 = ((Number)object).intValue();
                object3 = lq_23.a.getChildDetails();
                if (object3 != null) {
                    object = (CMSNavigation)object3.get(n10);
                } else {
                    n10 = 0;
                    object = null;
                    f7 = 0.0f;
                }
                if (object == null || (object3 = ((CMSNavigation)object).getName()) == null) {
                    object3 = "";
                }
                n16 = 14;
                long l7 = Em3.f(n16);
                Object object9 = qv0_1.a;
                object7 = new qa_1(lq_23, 0);
                object7 = CY2.b((LP1)object5, false, (Function1)object7);
                object8 = j.c;
                object7 = object7.then((LP1)object8);
                f6 = n18;
                f5 = 24;
                object7 = h.h((LP1)object7, f5, f6, f6, f6);
                object8 = new sa_1(j7_03, (CMSNavigation)object);
                n10 = 7;
                f7 = 9.8E-45f;
                object7 = d.b((LP1)object7, false, null, (Function0)object8, n10);
                object = new Cj3(5);
                int n19 = 1575936;
                bl2 = false;
                f6 = 0.0f;
                object8 = null;
                n4 = 0;
                f5 = 0.0f;
                long l8 = 0L;
                lP1 = null;
                long l12 = 0L;
                n14 = 0;
                int n20 = 130480;
                Object object10 = object;
                object = object3;
                object3 = object7;
                l2 = l4;
                fG2$a = object6;
                object6 = object9;
                lP1$a = object5;
                object5 = object10;
                object9 = object2;
                Ll3.b((String)object, (LP1)object7, l4, l7, null, null, (RU0)object6, l8, null, (Cj3)object10, l12, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
                object6 = fG2$a;
                object5 = lP1$a;
                n18 = 16;
                f8 = 2.2E-44f;
            }
        }
        fG2$a = object6;
        lP1$a = object5;
        n10 = 0;
        f7 = 0.0f;
        object = null;
        ((j30_0)object2).T(false);
        object3 = object5;
        object4 = j.c((LP1)object5, 1.0f);
        n10 = 16;
        f7 = 2.2E-44f;
        f8 = n10;
        bl2 = false;
        f6 = 0.0f;
        object8 = null;
        n4 = 10;
        f5 = 1.4E-44f;
        object = h.i((LP1)object4, f8, 0.0f, f8, 0.0f, n4);
        long l14 = OX.e;
        object7 = object6;
        object = a.b((LP1)object, l14, (i13)object6);
        n17 = 1;
        float f11 = n17;
        object = j.d((LP1)object, f11);
        Q93.b((b30_0)object2, (LP1)object);
        ((j30_0)object2).T(n17 != 0);
        object2 = ((j30_0)object2).X();
        if (object2 == null) return;
        n17 = n3;
        ((CF2)object2).d = object = new ta_1(j7_03, lq_23, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void e(yT1 yT12, j7_0 j7_02, CMSNavigation cMSNavigation, b30_0 object, int n3) {
        Object object2;
        Object object3;
        Object object4 = yT12;
        j7_0 j7_03 = j7_02;
        CMSNavigation cMSNavigation2 = cMSNavigation;
        Intrinsics.checkNotNullParameter(yT12, "navController");
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        Intrinsics.checkNotNullParameter(cMSNavigation, "cmsNavigation");
        float f5 = 187958.86f;
        Object object5 = object;
        j30_0 j30_02 = object.g(1211600311);
        Object object6 = od3_2.a();
        object5 = ld3_2.STORE_AJIOGRAM;
        Object object7 = ((ld3_2)((Object)object5)).getStoreId();
        int n4 = Intrinsics.areEqual(object6, object7);
        long l2 = n4 != 0 ? nz_1.k : OX.f;
        object6 = od3_2.a();
        String string2 = ((ld3_2)((Object)object5)).getStoreId();
        n4 = Intrinsics.areEqual(object6, string2);
        long l3 = n4 != 0 ? OX.f : OX.b;
        object6 = od3_2.a();
        object5 = ((ld3_2)((Object)object5)).getStoreId();
        n4 = Intrinsics.areEqual(object6, object5);
        long l4 = n4 != 0 ? xx_1.U : xx_1.m;
        long l7 = l4;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        n4 = -742112122;
        f5 = -1.6859264E12f;
        j30_02.K(n4);
        object6 = j30_02.v();
        object5 = b30$a.a;
        if (object6 == object5) {
            object6 = cMSNavigation.getName();
            object3 = "/";
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append((String)object6);
            object6 = J83.g(((StringBuilder)object2).toString());
            j30_02.o(object6);
        }
        object6 = (tr1_0)object6;
        int n7 = 0;
        object2 = null;
        j30_02.T(false);
        ref$ObjectRef.element = object6;
        n4 = -742109112;
        f5 = -1.686321E12f;
        j30_02.K(n4);
        object6 = j30_02.v();
        if (object6 == object5) {
            object6 = cMSNavigation.getChildDetails();
            object6 = (ArrayList)j7_03.c((List)object6);
            object3 = new p83_0();
            ((p83_0)object3).addAll((Collection)object6);
            j30_02.o(object3);
            object6 = object3;
        }
        Object object8 = object6;
        object8 = (p83_0)object6;
        j30_02.T(false);
        object3 = LP1$a.b;
        object6 = zp.c;
        object = object8;
        object8 = Nc$a.m;
        object6 = oZ.a((zp$l)object6, (Gx$a)object8, j30_02, 0);
        int n8 = j30_02.P;
        object2 = j30_02.P();
        long l8 = l7;
        Object object9 = a30_0.c(j30_02, (LP1)object3);
        N20.W.getClass();
        Object object10 = N20$a.b;
        object4 = j30_02.a;
        boolean bl2 = object4 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl2 = j30_02.O;
        if (bl2) {
            j30_02.C((Function0)object10);
        } else {
            j30_02.n();
        }
        object4 = N20$a.e;
        Ow3.a(j30_02, object6, (Function2)object4);
        object6 = N20$a.d;
        Ow3.a(j30_02, object2, (Function2)object6);
        object6 = N20$a.f;
        n7 = j30_02.O;
        if (n7 != 0 || (n7 = Intrinsics.areEqual(object2 = j30_02.v(), object4 = Integer.valueOf(n8))) == 0) {
            rk_0.a(n8, j30_02, n8, (N20$a$a)object6);
        }
        object6 = N20$a.c;
        Ow3.a(j30_02, object9, (Function2)object6);
        n4 = 1065353216;
        f5 = 1.0f;
        object2 = j.c((LP1)object3, f5);
        double d2 = 0.5;
        float f6 = (float)d2;
        object2 = j.d((LP1)object2, f6);
        object4 = fg2_1.a;
        object2 = a.b((LP1)object2, l2, (i13)object4);
        Q93.b(j30_02, (LP1)object2);
        n7 = 1611028639;
        j30_02.K(n7);
        object2 = j30_02.v();
        if (object2 == object5) {
            object2 = new ou0_0();
            j30_02.o(object2);
        }
        object8 = object2;
        object8 = (ou0_0)object2;
        j30_02.T(false);
        float f7 = 0.0f;
        Object object11 = SP2.a(f7);
        object6 = j.c((LP1)object3, f5);
        float f8 = 56;
        object6 = c.a(j.d((LP1)object6, f8), (ou0_0)object8);
        boolean bl3 = true;
        object6 = FocusableKt.b((LP1)object6, bl3, 2);
        object5 = new va_1(j7_03, ref$ObjectRef);
        n7 = 0;
        LP1 lP1 = CY2.b((LP1)object6, false, (Function1)object5);
        object6 = object2;
        long l12 = l2;
        object9 = object2;
        object2 = ref$ObjectRef;
        Object object12 = object3;
        object3 = yT12;
        Object object13 = object;
        ((eb$b)object6)(l2, l3, j7_02, ref$ObjectRef, yT12, (ou0_0)object8);
        n4 = 1187323856;
        f5 = 25231.906f;
        object6 = v10.c(n4, (fx0_2)object6, j30_02);
        l12 = 0L;
        int n10 = 0x1B0000;
        int n14 = 28;
        object9 = lP1;
        f6 = f7;
        object10 = object11;
        object = j30_02;
        object3 = ref$ObjectRef;
        object11 = j30_02;
        JL.a(lP1, (i13)object10, l12, null, f7, (u10)object6, j30_02, n10, n14);
        object6 = object12;
        object6 = a.b((LP1)object12, l8, (i13)object4);
        f8 = 8;
        object6 = h.e((LP1)object6, f8);
        object5 = j.c;
        object9 = object6.then((LP1)object5);
        object5 = object13;
        object6 = new wa_1((p83_0)object13, j7_03, ref$ObjectRef);
        object11 = null;
        f7 = 0.0f;
        object10 = null;
        j30_02 = null;
        ref$ObjectRef = null;
        lP1 = null;
        int n15 = 254;
        xq1_0.a((LP1)object9, null, null, false, null, null, null, false, (Function1)object6, (b30_0)object, 0, n15);
        object6 = object;
        boolean bl4 = true;
        f8 = Float.MIN_VALUE;
        ((j30_0)object).T(bl4);
        object6 = ((j30_0)object).X();
        if (object6 != null) {
            object7 = yT12;
            ((CF2)object6).d = object5 = new xa_1(yT12, j7_03, cMSNavigation2, n3);
        }
    }
}

