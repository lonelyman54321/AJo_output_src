/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EG0
 */
public final class eg0_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, String string2, long l2, long l3, tv0_0 tv0_02, b30_0 b30_02, int n3, int n4) {
        kg0_2 kg0_22;
        Object object;
        j30_0 j30_02;
        int n7;
        tv0_0 tv0_03;
        int n8;
        int n10;
        int n14;
        int n15;
        j30_0 j30_03;
        Object object2;
        Object object3;
        Object object4;
        block13: {
            object4 = string2;
            int n16 = n3;
            object3 = "text";
            Intrinsics.checkNotNullParameter(string2, (String)object3);
            object2 = b30_02;
            j30_03 = b30_02.g(-1465409750);
            n15 = n4 & 1;
            if (n15 != 0) {
                n10 = n14 = n3 | 6;
                object2 = lP1;
            } else {
                n14 = n3 & 0xE;
                if (n14 == 0) {
                    object2 = lP1;
                    n10 = (int)(j30_03.J(lP1) ? 1 : 0);
                    n10 = n10 != 0 ? 4 : 2;
                    n10 |= n16;
                } else {
                    object2 = lP1;
                    n10 = n3;
                }
            }
            n8 = n16 & 0x70;
            if (n8 == 0) {
                n8 = (int)(j30_03.J(object4) ? 1 : 0);
                n8 = n8 != 0 ? 32 : 16;
                n10 |= n8;
            }
            if ((n8 = n16 & 0x380) == 0) {
                n8 = (int)(j30_03.d(l2) ? 1 : 0);
                n8 = n8 != 0 ? 256 : 128;
                n10 |= n8;
            }
            if ((n8 = n16 & 0x1C00) == 0) {
                n8 = (int)(j30_03.d(l3) ? 1 : 0);
                n8 = n8 != 0 ? 2048 : 1024;
                n10 |= n8;
            }
            if ((n8 = n4 & 0x10) != 0) {
                n10 |= 0x6000;
            } else {
                int n17 = 0xE000 & n16;
                if (n17 == 0) {
                    tv0_03 = tv0_02;
                    n7 = (int)(j30_03.J(tv0_02) ? 1 : 0);
                    n7 = n7 != 0 ? 16384 : 8192;
                }
            }
            tv0_03 = tv0_02;
            break block13;
            n10 |= n7;
        }
        n7 = 0xB6DB & n10;
        int n18 = 9362;
        if (n7 == n18 && (n7 = (int)(j30_03.h() ? 1 : 0)) != 0) {
            j30_03.D();
            j30_02 = j30_03;
            object = tv0_03;
        } else {
            Object object5 = n15 != 0 ? (object3 = LP1$a.b) : object2;
            Object object6 = n8 != 0 ? (object3 = tv0_0.o) : tv0_03;
            Object object7 = y20_0.a;
            n15 = n10 >> 3;
            n14 = n15 & 0xE | 0x180000;
            n8 = (n10 <<= 3) & 0x70;
            n15 = n15 & 0x380 | (n14 |= n8);
            n14 = n10 & 0x1C00;
            n15 |= n14;
            n14 = 0x70000 & n10;
            int n19 = n15 | n14;
            n7 = 0;
            long l4 = 0L;
            n15 = 0;
            kg0_22 = null;
            long l7 = 0L;
            int n20 = 2;
            int n21 = 1;
            int n22 = 3120;
            int n24 = 120720;
            object3 = string2;
            object2 = object5;
            j30_02 = j30_03;
            object = object6;
            object4 = object7;
            object7 = j30_03;
            Ll3.b(string2, (LP1)object5, l3, l2, null, (tv0_0)object6, (RU0)object4, l4, null, null, l7, n20, false, n21, 0, null, null, j30_03, n19, n22, n24);
        }
        CF2 cF2 = j30_02.X();
        if (cF2 != null) {
            object3 = kg0_22;
            n18 = n4;
            kg0_22 = new kg0_2((LP1)object2, string2, l2, l3, (tv0_0)object, n3, n4);
            cF2.d = kg0_22;
        }
    }

    public static final void b(p83_0 p83_02, Component component, BaseValue baseValue, Function1 function1, Function2 function2, gx0_2 gx0_22, Function2 function22, ft1_2 ft1_22, Function2 function23, Function2 function24, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(function1, "onViewAllClick");
        Function2 function25 = function2;
        Intrinsics.checkNotNullParameter(function2, "onFollowClick");
        Intrinsics.checkNotNullParameter(gx0_22, "onProductClick");
        Intrinsics.checkNotNullParameter(function22, "onBrandClicked");
        Intrinsics.checkNotNullParameter(ft1_22, "listStateColumn");
        Intrinsics.checkNotNullParameter(function23, "sendImpression");
        Intrinsics.checkNotNullParameter(function24, "sendProductImpression");
        int n4 = 416985596;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = LP1$a.b;
        float f5 = 1.0f;
        Object object3 = j.c((LP1)object, f5);
        long l2 = nz_1.a;
        Object object4 = fg2_1.a;
        Object object5 = a.b((LP1)object3, l2, (i13)object4);
        float f6 = uq0_0.x;
        ft1_2 ft1_23 = null;
        LP1 lP1 = null;
        LP1 lP12 = null;
        int n7 = 7;
        object3 = h.i((LP1)object5, 0.0f, 0.0f, 0.0f, f6, n7);
        Object object6 = zp.c;
        Object object7 = Nc$a.m;
        object6 = oZ.a((zp$l)object6, (Gx$a)object7, (b30_0)object2, 0);
        int n8 = ((j30_0)object2).P;
        object4 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        N20.W.getClass();
        Object object8 = N20$a.b;
        Object object9 = ((j30_0)object2).a;
        int n10 = object9 instanceof mp;
        if (n10 != 0) {
            lg0_1 lg0_12;
            ((j30_0)object2).A();
            n10 = ((j30_0)object2).O;
            if (n10 != 0) {
                ((j30_0)object2).C((Function0)object8);
            } else {
                ((j30_0)object2).n();
            }
            object9 = N20$a.e;
            Ow3.a((b30_0)object2, object6, (Function2)object9);
            object9 = N20$a.d;
            Ow3.a((b30_0)object2, object4, (Function2)object9);
            object9 = N20$a.f;
            boolean bl2 = ((j30_0)object2).O;
            if (bl2 || !(bl2 = Intrinsics.areEqual(object6 = ((j30_0)object2).v(), object4 = Integer.valueOf(n8)))) {
                rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object9);
            }
            object9 = N20$a.c;
            Ow3.a((b30_0)object2, object3, (Function2)object9);
            object9 = component.getHeading();
            if (object9 == null) {
                object9 = "";
            }
            object5 = object9;
            float f7 = uq0_0.o;
            lP12 = h.g((LP1)object, f7, 0.0f, 2);
            object9 = new tv0_0(400);
            long l3 = oj3_2.i;
            av0_0 av0_02 = y20_0.b;
            long l4 = nz_1.b;
            object3 = new nV0(1);
            int n14 = 1772592;
            long l7 = 0L;
            long l8 = 0L;
            int n15 = 130944;
            Ll3.b((String)object5, lP12, l4, l3, (nV0)object3, (tv0_0)object9, av0_02, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n14, 0, n15);
            object9 = AndroidCompositionLocals_androidKt.a;
            double d2 = ((Configuration)((j30_0)object2).j((H30)object9)).screenWidthDp;
            double d5 = 0.73;
            double d7 = d2 * d5;
            ft1_23 = jt1.a((b30_0)object2);
            n10 = 1065353216;
            f5 = 1.0f;
            object9 = j.m(j.c((LP1)object, f5));
            int n16 = 13;
            boolean bl3 = true;
            lP1 = h.i((LP1)object9, 0.0f, f7, 0.0f, 0.0f, n16);
            object = lg0_12;
            object9 = component;
            object7 = gx0_22;
            object4 = ft1_23;
            object8 = baseValue;
            function25 = function23;
            lg0_12 = new lg0_1(component, d7, gx0_22, ft1_23, baseValue, ft1_22, p83_02, function22, function2, function1, function23, function24);
            object8 = null;
            object3 = null;
            bl2 = false;
            f7 = 0.0f;
            object6 = null;
            n8 = 0;
            object7 = null;
            object4 = null;
            int n17 = 6;
            int n18 = 252;
            object = lP1;
            object9 = ft1_23;
            xq1_0.b(lP1, ft1_23, null, false, null, null, null, false, lg0_12, (b30_0)object2, n17, n18);
            ((j30_0)object2).T(bl3);
            object2 = ((j30_0)object2).X();
            if (object2 != null) {
                object = function25;
                object9 = p83_02;
                object3 = component;
                object6 = baseValue;
                object7 = function1;
                object4 = function2;
                object8 = gx0_22;
                n18 = n3;
                ((CF2)object2).d = function25 = new mg0_2(p83_02, component, baseValue, function1, function2, gx0_22, function22, ft1_22, function23, function24, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    public static final void c(double var0, BaseValue var2_1, Subcomponent var3_2, ft1_2 var4_3, p83_0 var5_4, ft1_2 var6_5, p83_0 var7_6, Component var8_7, b30_0 var9_8, int var10_9) {
        block17: {
            block15: {
                block16: {
                    var11_10 = var3_2;
                    var12_11 = var10_9;
                    var13_12 = -418762369;
                    var14_13 = var9_8.g(var13_12);
                    var15_14 = (float)var0;
                    var16_15 = x20_0.b(var15_14, (b30_0)var14_13);
                    var17_16 = (int)var16_15;
                    var18_17 = uq0_0.o;
                    var19_18 = x20_0.b(var18_17, (b30_0)var14_13);
                    var20_19 = (int)var19_18;
                    var22_21 = hv3_0.a;
                    var22_21.getClass();
                    var23_22 = hv3_0.E();
                    var21_20 = new ScreenInfo(var17_16 -= var20_19, var23_22);
                    if (var3_2 == null || (var22_21 = var3_2.getResourceOwner()) == null || (var22_21 = var22_21.getMetadata()) == null || (var22_21 = var22_21.getUnit()) == null) {
                        var22_21 = "PERCENTAGE";
                    }
                    var24_23 = az3_0.a;
                    var25_24 = 0;
                    var26_25 = 0.0f;
                    var24_23 = null;
                    if (var11_10 != null && (var27_26 = var3_2.getResourceOwner()) != null && (var27_26 = var27_26.getMetadata()) != null && (var27_26 = var27_26.getBrandPageHeaderWidth()) != null) {
                        var27_26 = je3_2.d((String)var27_26);
                    } else {
                        var28_27 = 0;
                        var27_26 = null;
                    }
                    if (var11_10 != null && (var29_28 = var3_2.getResourceOwner()) != null && (var29_28 = var29_28.getMetadata()) != null && (var29_28 = var29_28.getBrandPageHeaderHeight()) != null) {
                        var29_28 = je3_2.d((String)var29_28);
                        var30_29 = var2_1;
                    } else {
                        var30_29 = var2_1;
                        var29_28 = null;
                    }
                    var21_20 = az3_0.c((String)var22_21, (Double)var27_26, (Double)var29_28, (BaseValue)var30_29, (ScreenInfo)var21_20);
                    var31_30 = var21_20.getHeight();
                    var28_27 = 0;
                    var27_26 = null;
                    cfr_temp_0 = var31_30 - 0.0f;
                    var23_22 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var23_22 > 0) {
                        var23_22 = var21_20.getWidth();
                        var31_30 = var23_22;
                        var20_19 = var21_20.getHeight();
                        var19_18 = var20_19;
                        var31_30 /= var19_18;
                    } else {
                        var23_22 = 1071877689;
                        var31_30 = 1.7777778f;
                    }
                    var16_15 = (float)var17_16 / var31_30;
                    var17_16 = (int)var16_15;
                    if (var11_10 != null && (var21_20 = var3_2.getResourceOwner()) != null && (var21_20 = var21_20.getMetadata()) != null) {
                        var21_20 = var21_20.getBrandPageHeaderMediaType();
                    } else {
                        var20_19 = 0;
                        var21_20 = null;
                        var19_18 = 0.0f;
                    }
                    var23_22 = 0;
                    var31_30 = 0.0f;
                    var22_21 = null;
                    if (var21_20 == null) ** GOTO lbl-1000
                    var28_27 = var21_20.hashCode();
                    var29_28 = LP1$a.b;
                    var32_31 = 70564;
                    if (var28_27 == var32_31) break block15;
                    var32_31 = 69775675;
                    if (var28_27 == var32_31) break block16;
                    var32_31 = 81665115;
                    if (var28_27 != var32_31 || (var20_19 = (int)var21_20.equals(var27_26 = "VIDEO")) == 0) ** GOTO lbl-1000
                    var20_19 = 1265119013;
                    var19_18 = 1.5216421E7f;
                    var14_13.K(var20_19);
                    if (var8_7 != null) {
                        var21_20 = var8_7.getUuid();
                    } else {
                        var20_19 = 0;
                        var21_20 = null;
                        var19_18 = 0.0f;
                    }
                    var33_32 = j.k((LP1)var29_28, var15_14);
                    var26_25 = x20_0.e((b30_0)var14_13, var17_16);
                    var29_28 = j.d((LP1)var33_32, var26_25);
                    var15_14 = uq0_0.k;
                    var34_33 = 2;
                    var35_35 = null;
                    var36_37 = var15_14;
                    var33_32 = h.i((LP1)var29_28, var18_17, 0.0f, var18_17, var15_14, var34_33);
                    var37_39 = nz_1.l;
                    var29_28 = fg2_1.a;
                    var30_29 = a.b((LP1)var33_32, var37_39, (i13)var29_28);
                    var39_40 = var3_2.getUuid();
                    var33_32 = var3_2.getResourceOwner();
                    if (var33_32 == null || (var33_32 = var33_32.getImageUrl()) == null) {
                        var33_32 = "";
                    }
                    var40_42 = var12_11 >> 18 & 14;
                    var25_24 = var12_11 >> 9 & 896;
                    var40_42 |= var25_24;
                    var25_24 = var12_11 & 7168;
                    var41_44 = var40_42 | var25_24;
                    var29_28 = var7_6;
                    var42_46 = var21_20;
                    var35_35 = var6_5;
                    var34_33 = var17_16;
                    var43_47 = var14_13;
                    vs_1.a(var7_6, (String)var21_20, var6_5, var4_3, (LP1)var30_29, var17_16, var39_40, (String)var33_32, (b30_0)var14_13, var41_44);
                    var14_13.T(false);
                    break block17;
                }
                var24_23 = "IMAGE";
                var20_19 = (int)var21_20.equals(var24_23);
                if (var20_19 != 0) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            var24_23 = "GIF";
            var20_19 = (int)var21_20.equals(var24_23);
            if (var20_19 != 0) lbl-1000:
            // 2 sources

            {
                var20_19 = 1264078901;
                var19_18 = 1.4176309E7f;
                var14_13.K(var20_19);
                var33_32 = j.k((LP1)var29_28, var15_14);
                var16_15 = x20_0.e((b30_0)var14_13, var17_16);
                var29_28 = j.d((LP1)var33_32, var16_15);
                var36_38 = uq0_0.k;
                var33_32 = h.i((LP1)var29_28, var18_17, 0.0f, var18_17, var36_38, 2);
                var16_15 = uq0_0.e;
                var44_49 = SP2.a(var16_15);
                var42_46 = QV.a((LP1)var33_32, (i13)var44_49);
                var29_28 = new og0_2(var11_10);
                var35_36 = fg0_0.a;
                var43_48 = p10_0.a;
                var45_50 = p10_0.b;
                var41_45 = false;
                var46_51 = 0x6000000;
                var18_17 = 0.0f;
                var36_38 = 0.0f;
                var30_29 = null;
                var34_34 = false;
                var39_41 = null;
                var47_52 = 6;
                var48_53 = 760;
                vw_1.b((Function0)var29_28, (LP1)var42_46, var35_36, null, null, null, null, null, var43_48, null, var45_50, (b30_0)var14_13, var46_51, var47_52, var48_53);
                var14_13.T(false);
            } else lbl-1000:
            // 4 sources

            {
                var40_43 = 1265648710;
                var15_14 = 1.5746118E7f;
                var14_13.K(var40_43);
                var14_13.T(false);
            }
        }
        var29_28 = var14_13.X();
        if (var29_28 != null) {
            var14_13 = var42_46;
            var33_32 = var2_1;
            var11_10 = var3_2;
            var44_49 = var4_3;
            var21_20 = var5_4;
            var22_21 = var6_5;
            var24_23 = var7_6;
            var27_26 = var8_7;
            var12_11 = var10_9;
            var42_46 = new pg0_2(var0, var2_1, var3_2, var4_3, var5_4, var6_5, var7_6, var8_7, var10_9);
            var29_28.d = var42_46;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void d(Subcomponent subcomponent, double d2, gx0_2 gx0_22, Function0 function0, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        Object object4 = subcomponent;
        gx0_2 gx0_23 = gx0_22;
        Object object5 = function0;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(gx0_22, "onProductClick");
        Intrinsics.checkNotNullParameter(function0, "onViewAllClick");
        int n7 = -1745775668;
        Object object6 = b30_02;
        j30_0 j30_02 = b30_02.g(n7);
        if (subcomponent != null && (object6 = subcomponent.getResources()) != null) {
            int n8 = ((p83_0)object6).isEmpty();
            int n10 = 1;
            if ((n8 ^= n10) == n10) {
                Object object7;
                Object object8;
                int n14;
                object6 = LP1$a.b;
                float f5 = uq0_0.o;
                float f6 = uq0_0.e;
                float f7 = uq0_0.m;
                object3 = h.h((LP1)object6, f5, f6, f5, f7);
                object2 = zp.a;
                f7 = uq0_0.h;
                Object object9 = zp.g(f7);
                Object object10 = Nc$a.j;
                int n15 = 6;
                object9 = iQ2.a((zp$e)object9, (Gx$b)object10, j30_02, n15);
                int n16 = j30_02.P;
                Object object11 = j30_02.P();
                object3 = a30_0.c(j30_02, (LP1)object3);
                N20.W.getClass();
                object = N20$a.b;
                Object object12 = j30_02.a;
                n10 = object12 instanceof mp;
                int n17 = 0;
                if (n10 == 0) {
                    s20.a();
                    throw null;
                }
                j30_02.A();
                n10 = j30_02.O;
                if (n10 != 0) {
                    j30_02.C((Function0)object);
                } else {
                    j30_02.n();
                }
                Object object13 = N20$a.e;
                Ow3.a(j30_02, object9, (Function2)object13);
                object9 = N20$a.d;
                Ow3.a(j30_02, object11, (Function2)object9);
                object11 = N20$a.f;
                float f8 = f6;
                int n18 = j30_02.O;
                if (n18 != 0 || (n14 = Intrinsics.areEqual(object8 = j30_02.v(), object5 = Integer.valueOf(n16))) == 0) {
                    rk_0.a(n16, j30_02, n16, (N20$a$a)object11);
                }
                object5 = N20$a.c;
                Ow3.a(j30_02, object3, (Function2)object5);
                object8 = mq2_0.a;
                f5 = 1.0f;
                object3 = ((mq2_0)object8).a((LP1)object6, f5, true);
                object2 = zp.g(f7);
                n16 = 6;
                object2 = iQ2.a((zp$e)object2, (Gx$b)object10, j30_02, n16);
                int n19 = j30_02.P;
                Object object14 = j30_02.P();
                object3 = a30_0.c(j30_02, (LP1)object3);
                n4 = object12 instanceof mp;
                if (n4 == 0) {
                    s20.a();
                    throw null;
                }
                j30_02.A();
                n4 = (int)(j30_02.O ? 1 : 0);
                if (n4 != 0) {
                    j30_02.C((Function0)object);
                } else {
                    j30_02.n();
                }
                Ow3.a(j30_02, object2, (Function2)object13);
                Ow3.a(j30_02, object14, (Function2)object9);
                n4 = (int)(j30_02.O ? 1 : 0);
                if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object7 = j30_02.v(), object2 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                    rk_0.a(n19, j30_02, n19, (N20$a$a)object11);
                }
                Ow3.a(j30_02, object3, (Function2)object5);
                n4 = 1061662228;
                float f11 = 0.78f;
                object7 = ((mq2_0)object8).a((LP1)object6, f11, true);
                object3 = new EG0$b((Subcomponent)object4, gx0_23);
                object10 = v10.c(854179909, (fx0_2)object3, j30_02);
                int n20 = 3072;
                int n21 = 6;
                object3 = object7;
                object7 = object9;
                object9 = null;
                object14 = object12;
                object12 = j30_02;
                Object object15 = object14;
                n16 = n20;
                object4 = object11;
                int n22 = n21;
                OA.a((LP1)object3, null, false, (u10)object10, j30_02, n20, n21);
                f5 = 0.22f;
                boolean bl2 = true;
                object3 = j.m(((mq2_0)object8).a((LP1)object6, f5, bl2));
                object2 = Nc$a.k;
                object3 = ((mq2_0)object8).b((LP1)object3, (Gx$b)object2);
                f7 = 1.421797E9f;
                j30_02.K(1319730637);
                n18 = n3;
                int n24 = n3 & 0x1C00 ^ 0xC00;
                int n25 = 2048;
                object14 = function0;
                if (n24 > n25 && (n24 = (int)(j30_02.J(function0) ? 1 : 0)) != 0 || (n24 = n18 & 0xC00) == n25) {
                    n24 = 1;
                    f7 = Float.MIN_VALUE;
                } else {
                    n24 = 0;
                    f7 = 0.0f;
                    object2 = null;
                }
                object9 = j30_02.v();
                if (n24 == 0 && object9 != (object2 = b30$a.a)) {
                    n24 = 0;
                    f7 = 0.0f;
                    object2 = null;
                } else {
                    n24 = 0;
                    f7 = 0.0f;
                    object2 = null;
                    object9 = new qg0_2(object14, 0);
                    j30_02.o(object9);
                }
                object9 = (Function0)object9;
                j30_02.T(false);
                object3 = x20_0.d((LP1)object3, (Function0)object9);
                object2 = zp.d;
                object9 = Nc$a.n;
                n19 = 54;
                object2 = oZ.a((zp$l)object2, (Gx$a)object9, j30_02, n19);
                n25 = j30_02.P;
                object10 = j30_02.P();
                object3 = a30_0.c(j30_02, (LP1)object3);
                object11 = object15;
                n22 = object15 instanceof mp;
                if (n22 == 0) {
                    s20.a();
                    throw null;
                }
                j30_02.A();
                n22 = (int)(j30_02.O ? 1 : 0);
                if (n22 != 0) {
                    j30_02.C((Function0)object);
                } else {
                    j30_02.n();
                }
                Ow3.a(j30_02, object2, (Function2)object13);
                Ow3.a(j30_02, object10, (Function2)object7);
                boolean bl3 = j30_02.O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object = j30_02.v(), object7 = Integer.valueOf(n25)))) {
                    rk_0.a(n25, j30_02, n25, (N20$a$a)object4);
                }
                Ow3.a(j30_02, object3, (Function2)object5);
                object = subcomponent.getCta();
                if (object == null || (object = ((Cta)object).getText()) == null) {
                    object = "View All";
                }
                object3 = object;
                long l2 = oj3_2.b;
                object5 = new tv0_0(700);
                object13 = y20_0.a;
                long l3 = nz_1.c;
                int n26 = 1772592;
                n22 = 0;
                object11 = null;
                long l4 = 0L;
                n21 = 0;
                long l7 = 0L;
                int n27 = 2;
                int n28 = 1;
                int n29 = 3120;
                int n30 = 120720;
                object2 = object6;
                object8 = object5;
                boolean bl4 = true;
                Ll3.b((String)object, (LP1)object6, l3, l2, null, (tv0_0)object5, (RU0)object13, l4, null, null, l7, n27, false, n28, 0, null, null, j30_02, n26, n29, n30);
                n14 = R$drawable.fleek_arrow;
                f11 = 0.0f;
                object5 = km2.a(n14, j30_02, 0);
                n4 = R$string.acc_right_arrow_icon;
                object7 = hv3_0.K(n4);
                n24 = 0;
                f7 = 0.0f;
                object3 = object6;
                object9 = h.i((LP1)object6, 0.0f, f8, 0.0f, 0.0f, 13);
                n16 = 0;
                object14 = null;
                n19 = 0;
                object10 = null;
                boolean bl5 = false;
                object12 = null;
                n10 = 392;
                n17 = 120;
                object3 = object5;
                object2 = object7;
                object8 = j30_02;
                Pd1.a((im2)object5, (String)object7, (LP1)object9, null, null, 0.0f, null, j30_02, n10, n17);
                j30_02.T(bl4);
                j30_02.T(bl4);
                j30_02.T(bl4);
            }
        }
        if ((object3 = j30_02.X()) != null) {
            object = object2;
            object4 = subcomponent;
            gx0_23 = gx0_22;
            object5 = function0;
            n4 = n3;
            object2 = new rg0_1(subcomponent, d2, gx0_22, function0, n3);
            ((CF2)object3).d = object2;
        }
    }
}

