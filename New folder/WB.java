/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.brand_page.Layout;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class WB {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(String var0, dr0_0 var1_1, yT1 var2_2, f23_0 var3_3, b30_0 var4_4, int var5_5) {
        block27: {
            block38: {
                block36: {
                    block37: {
                        block35: {
                            block32: {
                                block33: {
                                    block26: {
                                        block34: {
                                            block31: {
                                                block29: {
                                                    block30: {
                                                        block28: {
                                                            var6_6 = var0;
                                                            var7_7 = var1_1;
                                                            var8_8 = var2_2;
                                                            Intrinsics.checkNotNullParameter(var1_1, "fleekViewModel");
                                                            Intrinsics.checkNotNullParameter(var2_2, "fleekAppNavigationController");
                                                            var9_9 = var3_3;
                                                            Intrinsics.checkNotNullParameter(var3_3, "sharedFleekViewModel");
                                                            var10_10 = -956477788;
                                                            var11_11 = var4_4;
                                                            var12_12 = var4_4.g(var10_10);
                                                            var13_13 = AndroidCompositionLocals_androidKt.b;
                                                            var13_13 = zv0_2.b((Context)var12_12.j((H30)var13_13));
                                                            var14_14 = var13_13 instanceof Activity;
                                                            var15_15 = 0;
                                                            var16_16 = null;
                                                            if (var14_14 != 0) {
                                                                var13_13 = (Activity)var13_13;
                                                            } else {
                                                                var10_10 = 0;
                                                                var13_13 = null;
                                                            }
                                                            var11_11 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                            var17_17 = "brand screen";
                                                            var11_11.setScreenName((String)var17_17);
                                                            var11_11 = var7_7.H;
                                                            if (var11_11 != null) {
                                                                var11_11 = (ud_1)var11_11.getValue();
                                                            } else {
                                                                var14_14 = 0;
                                                                var11_11 = null;
                                                            }
                                                            var17_17 = (ff2_1)var7_7.J.getValue();
                                                            var18_18 = (p83_0)var7_7.X.getValue();
                                                            var19_19 /* !! */  = ov3.z(var12_12);
                                                            var20_20 = new WB$a(var19_19 /* !! */ , var7_7, null);
                                                            ly0_0.d(var12_12, (Object)var19_19 /* !! */ , (Function2)var20_20);
                                                            var19_19 /* !! */  = uD$c.a;
                                                            var21_21 = Intrinsics.areEqual(var11_11, (Object)var19_19 /* !! */ );
                                                            if (var21_21 != 0) {
                                                                var20_20 = var12_12.X();
                                                                if (var20_20 != null) {
                                                                    var13_13 = var22_22;
                                                                    var11_11 = var0;
                                                                    var16_16 = var1_1;
                                                                    var17_17 = var2_2;
                                                                    var18_18 = var3_3;
                                                                    var21_21 = var5_5;
                                                                    var22_22 = new db_0(var0, var1_1, var2_2, var3_3, var5_5);
                                                                    var20_20.d = var22_22;
                                                                }
                                                                return;
                                                            }
                                                            var19_19 /* !! */  = j.c;
                                                            var23_24 = nz_1.a;
                                                            var25_25 = fg2_1.a;
                                                            var20_20 = a.b((LP1)var19_19 /* !! */ , var23_24, (i13)var25_25);
                                                            var22_23 = Nc$a.a;
                                                            var25_25 = HA.e((Nc)var22_23, false);
                                                            var26_26 = var12_12.P;
                                                            var27_27 = var12_12.P();
                                                            var20_20 = a30_0.c(var12_12, (LP1)var20_20);
                                                            var28_28 = N20.W;
                                                            var28_28.getClass();
                                                            var16_16 = N20$a.b;
                                                            var9_9 = var12_12.a;
                                                            var29_29 = var18_18;
                                                            var30_30 = var9_9 instanceof mp;
                                                            if (!var30_30) break block27;
                                                            var12_12.A();
                                                            var30_30 = var12_12.O;
                                                            if (var30_30) {
                                                                var12_12.C((Function0)var16_16);
                                                            } else {
                                                                var12_12.n();
                                                            }
                                                            var18_18 = N20$a.e;
                                                            Ow3.a(var12_12, var25_25, (Function2)var18_18);
                                                            var25_25 = N20$a.d;
                                                            Ow3.a(var12_12, var27_27, (Function2)var25_25);
                                                            var27_27 = N20$a.f;
                                                            var31_31 = var12_12.O;
                                                            if (var31_31) break block28;
                                                            var8_8 = var12_12.v();
                                                            var32_32 = var25_25;
                                                            var25_25 = var26_26;
                                                            var33_33 = Intrinsics.areEqual(var8_8, var25_25);
                                                            if (var33_33 != 0) break block29;
                                                            break block30;
                                                        }
                                                        var32_32 = var25_25;
                                                    }
                                                    rk_0.a(var26_26, var12_12, var26_26, (N20$a$a)var27_27);
                                                }
                                                var25_25 = N20$a.c;
                                                Ow3.a(var12_12, var20_20, (Function2)var25_25);
                                                var12_12.K(388900190);
                                                var20_20 = ff2$b_0.a;
                                                var34_34 = Intrinsics.areEqual(var17_17, var20_20);
                                                if (!var34_34) break block31;
                                                var17_17 = Unit.a;
                                                var26_26 = 0;
                                                var20_20 = new WB$b(var7_7, var6_6, null);
                                                ly0_0.d(var12_12, var17_17, (Function2)var20_20);
                                                break block32;
                                            }
                                            var34_34 = var17_17 instanceof ff2$c_0;
                                            if (!var34_34) break block33;
                                            var17_17 = ((ff2$c_0)var17_17).a;
                                            if (var17_17 != null && (var20_20 = var17_17.getLayout()) != null && (var20_20 = var20_20.getComponents()) != null && (var20_20 = (Component)CollectionsKt.firstOrNull((List)var20_20)) != null) {
                                                var20_20 = var20_20.getSubcomponents();
                                            } else {
                                                var34_34 = false;
                                                var20_20 = null;
                                            }
                                            if (var17_17 != null && (var17_17 = var17_17.getLayout()) != null && (var17_17 = var17_17.getComponents()) != null) {
                                                var17_17 = (Component)CollectionsKt.firstOrNull((List)var17_17);
                                            } else {
                                                var35_35 = false;
                                                var17_17 = null;
                                            }
                                            if (var20_20 == null) break block34;
                                            var26_26 = var7_7.p0;
                                            var8_8 = var7_7.K0;
                                            if (var26_26 == 0) {
                                                var8_8.setValue(var20_20);
lbl120:
                                                // 3 sources

                                                while (true) {
                                                    var34_34 = true;
                                                    break block26;
                                                    break;
                                                }
                                            }
                                            if ((var8_8 = (p83_0)var8_8.getValue()) == null) ** GOTO lbl120
                                            var8_8.addAll((Collection)var20_20);
                                            ** while (true)
                                        }
                                        var7_7.Z = var34_34 = true;
                                    }
                                    var20_20 = var17_17;
                                    var35_35 = false;
                                    var17_17 = null;
                                    break block35;
                                }
                                var7_7.Z = var34_34 = true;
                            }
                            var35_35 = false;
                            var17_17 = null;
                            var34_34 = false;
                            var20_20 = null;
                        }
                        var12_12.T(false);
                        var17_17 = uD$d.a;
                        var35_35 = Intrinsics.areEqual(var11_11, var17_17);
                        if (var35_35) {
                            var14_14 = -827686649;
                            var12_12.K(var14_14);
                            var11_11 = Unit.a;
                            var16_16 = new WB$c(null, var7_7, (Activity)var13_13, var6_6);
                            ly0_0.d(var12_12, var11_11, (Function2)var16_16);
                            var35_35 = false;
                            var17_17 = null;
                            var12_12.T(false);
lbl154:
                            // 3 sources

                            while (true) {
                                var8_8 = var2_2;
lbl156:
                                // 3 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
                        }
                        var35_35 = false;
                        var17_17 = null;
                        var8_8 = uD$b.a;
                        var31_31 = Intrinsics.areEqual(var11_11, var8_8);
                        if (!var31_31) break block36;
                        var10_10 = -827436479;
                        var12_12.K(var10_10);
                        var13_13 = HA.e((Nc)var22_23, false);
                        var14_14 = var12_12.P;
                        var17_17 = var12_12.P();
                        var19_19 /* !! */  = a30_0.c(var12_12, (LP1)var19_19 /* !! */ );
                        var34_34 = var9_9 instanceof mp;
                        if (!var34_34) break block37;
                        var12_12.A();
                        var34_34 = var12_12.O;
                        if (var34_34) {
                            var12_12.C((Function0)var16_16);
                        } else {
                            var12_12.n();
                        }
                        Ow3.a(var12_12, var13_13, (Function2)var18_18);
                        var13_13 = var32_32;
                        Ow3.a(var12_12, var17_17, (Function2)var32_32);
                        var10_10 = (int)var12_12.O;
                        if (var10_10 != 0 || (var10_10 = (int)Intrinsics.areEqual(var13_13 = var12_12.v(), var16_16 = Integer.valueOf(var14_14))) == 0) {
                            rk_0.a(var14_14, var12_12, var14_14, (N20$a$a)var27_27);
                        }
                        Ow3.a(var12_12, (Object)var19_19 /* !! */ , (Function2)var25_25);
                        var15_15 = 0;
                        var16_16 = null;
                        xB.a(var12_12, 0);
                        var10_10 = 1;
                        var12_12.T((boolean)var10_10);
                        var12_12.T(false);
                        ** GOTO lbl154
                    }
                    s20.a();
                    throw null;
                }
                var15_15 = 0;
                var16_16 = null;
                var35_35 = var11_11 instanceof ud_2.a_0;
                if (var35_35) {
                    var14_14 = -827209404;
                    var12_12.K(var14_14);
                    var11_11 = new eb_1(var7_7, (Activity)var13_13, var6_6);
                    rB0.a((Function0)var11_11, var12_12, 0);
                    var12_12.T(false);
                    ** continue;
                }
                var10_10 = var11_11 instanceof uD$e;
                if (var10_10 == 0) break block38;
                var10_10 = -826910440;
                var12_12.K(var10_10);
                var13_13 = var11_11;
                var13_13 = ((uD$e)var11_11).a;
                if (var13_13 != null) {
                    var16_16 = var13_13.getLayout();
                } else {
                    var15_15 = 0;
                    var16_16 = null;
                }
                if (var16_16 == null) {
                    var12_12.K(-826814557);
                    var8_8 = var2_2;
                    var13_13 = new fb_1(var2_2);
                    var14_14 = 0;
                    var11_11 = null;
                    rB0.e((Function0)var13_13, var12_12, 0);
                    var12_12.T(false);
                    var10_10 = 0;
                    var13_13 = null;
                } else {
                    var8_8 = var2_2;
                    var12_12.K(-826608159);
                    var10_10 = var5_5 << 9 & 7168;
                    var15_15 = 2359880;
                    var33_33 = var10_10 | var15_15;
                    var13_13 = var11_11;
                    var13_13 = (uD$e)var11_11;
                    var11_11 = var1_1;
                    var16_16 = var2_2;
                    var17_17 = var0;
                    var18_18 = var29_29;
                    var19_19 /* !! */  = var20_20;
                    var20_20 = var3_3;
                    var22_23 = var12_12;
                    WB.b((uD$e)var13_13, var1_1, var2_2, var0, (p83_0)var29_29, (Component)var19_19 /* !! */ , var3_3, var12_12, var33_33);
                    var10_10 = 0;
                    var13_13 = null;
                    var12_12.T(false);
                }
                var12_12.T(false);
                ** GOTO lbl156
            }
            var8_8 = var2_2;
            var10_10 = 0;
            var13_13 = null;
            var14_14 = -826220070;
            var12_12.K(var14_14);
            var12_12.T(false);
            ** while (true)
            var10_10 = 1;
            var12_12.T((boolean)var10_10);
            var20_20 = var12_12.X();
            if (var20_20 != null) {
                var13_13 = var22_23;
                var11_11 = var0;
                var16_16 = var1_1;
                var17_17 = var2_2;
                var18_18 = var3_3;
                var21_21 = var5_5;
                var20_20.d = var22_23 = new gb_2(var0, var1_1, var2_2, var3_3, var5_5);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(uD$e uD$e, dr0_0 dr0_02, yT1 yT12, String string2, p83_0 p83_02, Component component, f23_0 f23_02, b30_0 b30_02, int n3) {
        Object object = uD$e;
        Object object2 = dr0_02;
        Object object3 = p83_02;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(uD$e, "state");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Object object4 = yT12;
        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
        Object object5 = f23_02;
        Intrinsics.checkNotNullParameter(f23_02, "sharedFleekViewModel");
        int n7 = -1544597059;
        Object object6 = b30_02;
        Object object7 = b30_02.g(n7);
        Object object8 = ((j30_0)object7).v();
        object6 = b30$a.a;
        if (object8 == object6) {
            object8 = Qx2.a(ly0_0.f(f.a, (b30_0)object7), (j30_0)object7);
        }
        object8 = (Q30)object8;
        Object object9 = ((Q30)object8).a;
        Object object10 = new Ref$ObjectRef();
        n7 = object instanceof uD$e;
        if (n7 != 0) {
            ((Ref$ObjectRef)object10).element = object8 = ((uD$e)object).a;
        }
        n7 = -791032405;
        ((j30_0)object7).K(n7);
        object8 = ((j30_0)object7).v();
        if (object8 == object6) {
            object8 = ((dr0_0)object2).D0;
            ((j30_0)object7).o(object8);
        }
        Object object11 = object8;
        object11 = (tr1_0)object8;
        n7 = 0;
        object8 = null;
        ((j30_0)object7).T(false);
        Object object12 = jt1.a((b30_0)object7);
        Object object13 = (BrandPageModel)((Ref$ObjectRef)object10).element;
        object13 = object13 != null && (object13 = ((BrandPageModel)object13).getLayout()) != null ? ((Layout)object13).getComponents() : null;
        Object object14 = AndroidCompositionLocals_androidKt.b;
        object14 = zv0_2.b((Context)((j30_0)object7).j((H30)object14));
        int n8 = object14 instanceof Activity;
        Object object15 = n8 != 0 ? (object14 = (Activity)object14) : null;
        Object object16 = new yp0_0();
        object14 = (p83_0)((dr0_0)object2).K0.getValue();
        Object object17 = AndroidCompositionLocals_androidKt.a;
        Object object18 = object17 = ((j30_0)object7).j((H30)object17);
        object18 = (Configuration)object17;
        Object object19 = dr0_0.y(dr0_0.q((List)object13));
        String string3 = dr0_0.r(dr0_0.q((List)object13));
        String string4 = dr0_0.z(dr0_0.q((List)object13));
        object17 = dr0_0.q((List)object13);
        boolean bl2 = dr0_0.E((Component)object17);
        if (object3 != null) {
            n8 = p83_02.size();
        } else {
            n8 = 0;
            object17 = null;
        }
        object17 = J83.j(n8, (b30_0)object7).getValue();
        ((j30_0)object7).K(-791001152);
        n7 = 0xE000 & n4 ^ 0x6000;
        int n10 = 16384;
        if (n7 > n10 && (n7 = (int)(((j30_0)object7).J(object3) ? 1 : 0)) != 0 || (n7 = n4 & 0x6000) == n10) {
            n7 = 1;
        } else {
            n7 = 0;
            object8 = null;
        }
        n10 = (int)(((j30_0)object7).J(object13) ? 1 : 0);
        Object object20 = ((j30_0)object7).v();
        if ((n7 |= n10) != 0 || object20 == object6) {
            n7 = 0;
            object8 = null;
            object20 = new xb_1((p83_0)object3, (p83_0)object13, null);
            ((j30_0)object7).o(object20);
        }
        object20 = (Function2)object20;
        ((j30_0)object7).T(false);
        ly0_0.d((b30_0)object7, object17, (Function2)object20);
        object20 = new Ref$ObjectRef();
        object8 = LP1$a.b;
        float f5 = 1.0f;
        LP1 lP1 = j.c((LP1)object8, f5);
        object8 = object6;
        object17 = object9;
        object17 = (c80)object9;
        object9 = object6;
        object6 = object12;
        object12 = object8;
        object9 = object13;
        object13 = object8;
        object12 = object14;
        object14 = object8;
        object13 = object20;
        object20 = dr0_02;
        object2 = object8;
        object14 = p83_02;
        Ref$ObjectRef ref$ObjectRef = object10;
        object10 = f23_02;
        object = object7;
        object7 = ref$ObjectRef;
        object5 = object15;
        object4 = object16;
        object3 = object19;
        object15 = string2;
        object16 = string4;
        object19 = component;
        ((pd_2)object8)((ft1_2)object6, (p83_0)object9, (p83_0)object12, (Ref$ObjectRef)object13, dr0_02, p83_02, f23_02, ref$ObjectRef, (Activity)object5, (c80)object17, (yp0_0)object4, yT12, (String)object3, string2, string4, (Configuration)object18, component, bl2, (tr1_0)object11, string3);
        n7 = 1526069011;
        object13 = v10.c(n7, (fx0_2)object8, (b30_0)object);
        object9 = null;
        object12 = null;
        int n14 = 3078;
        int n15 = 6;
        object6 = lP1;
        object20 = object;
        OA.a(lP1, null, false, (u10)object13, (b30_0)object, n14, n15);
        object10 = ((j30_0)object).X();
        if (object10 != null) {
            object2 = object7;
            object = uD$e;
            object8 = dr0_02;
            object6 = yT12;
            object9 = string2;
            object12 = p83_02;
            object13 = component;
            object20 = f23_02;
            n14 = n3;
            ((CF2)object10).d = object7 = new hb_1(uD$e, dr0_02, yT12, string2, p83_02, component, f23_02, n3);
        }
    }

    public static final void c(p83_0 p83_02, int n3, ft1_2 ft1_22, p83_0 p83_03, qc_1 qc_12, v9_0 v9_02, b30_0 object, int n4) {
        block29: {
            int n7;
            int n8;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            block28: {
                kb_1 kb_12;
                float f5;
                int n10;
                int n14;
                int n15;
                float f6;
                Object object9;
                Object object10;
                block27: {
                    object10 = p83_02;
                    ft1_2 ft1_23 = ft1_22;
                    p83_0 p83_04 = p83_03;
                    qc_1 qc_13 = qc_12;
                    int n16 = n4;
                    object9 = null;
                    Intrinsics.checkNotNullParameter(p83_02, "components");
                    Intrinsics.checkNotNullParameter(ft1_22, "lazyListState");
                    Intrinsics.checkNotNullParameter(p83_03, "bannerDataList");
                    object8 = "onBannerClick";
                    Intrinsics.checkNotNullParameter(qc_12, (String)object8);
                    f6 = -1.01535996E-4f;
                    object7 = object;
                    object6 = object.g(-1194004551);
                    n15 = n4 & 0xE;
                    if (n15 == 0) {
                        n15 = (int)(((j30_0)object6).J(p83_02) ? 1 : 0);
                        if (n15 != 0) {
                            n15 = 4;
                            f6 = 5.6E-45f;
                        } else {
                            n15 = 2;
                            f6 = 2.8E-45f;
                        }
                        n15 |= n16;
                    } else {
                        n15 = n4;
                    }
                    n14 = n16 & 0x70;
                    n10 = n3;
                    if (n14 == 0) {
                        n14 = (int)(((j30_0)object6).c(n3) ? 1 : 0);
                        if (n14 != 0) {
                            n14 = 32;
                            f5 = 4.5E-44f;
                        } else {
                            n14 = 16;
                            f5 = 2.2E-44f;
                        }
                        n15 |= n14;
                    }
                    if ((n14 = n16 & 0x380) == 0) {
                        n14 = (int)(((j30_0)object6).J(ft1_23) ? 1 : 0);
                        if (n14 != 0) {
                            n14 = 256;
                            f5 = 3.59E-43f;
                        } else {
                            n14 = 128;
                            f5 = 1.8E-43f;
                        }
                        n15 |= n14;
                    }
                    if ((n14 = n16 & 0x1C00) == 0) {
                        n14 = (int)(((j30_0)object6).J(p83_04) ? 1 : 0);
                        if (n14 != 0) {
                            n14 = 2048;
                            f5 = 2.87E-42f;
                        } else {
                            n14 = 1024;
                            f5 = 1.435E-42f;
                        }
                        n15 |= n14;
                    }
                    f5 = 8.0356E-41f;
                    n14 = 0xE000 & n16;
                    if (n14 == 0) {
                        n14 = (int)(((j30_0)object6).x(qc_13) ? 1 : 0);
                        if (n14 != 0) {
                            n14 = 16384;
                            f5 = 2.2959E-41f;
                        } else {
                            n14 = 8192;
                            f5 = 1.148E-41f;
                        }
                        n15 |= n14;
                    }
                    n14 = 9362;
                    f5 = 1.3119E-41f;
                    if ((n15 &= 0xB6DB) != n14 || (n15 = (int)(((j30_0)object6).h() ? 1 : 0)) == 0) break block27;
                    ((j30_0)object6).D();
                    object7 = object6;
                    break block28;
                }
                Object object11 = jt1.a((b30_0)object6);
                n15 = hv3_0.F();
                f5 = x20_0.b(uq0_0.v, (b30_0)object6);
                n14 = (int)f5;
                int n17 = n15 - n14;
                object8 = h40_0.a;
                BaseValue baseValue = h40_0.w();
                hv3_0.a.getClass();
                n15 = hv3_0.E();
                object5 = new ScreenInfo(n17, n15);
                object4 = LP1$a.b;
                n15 = 1065353216;
                f6 = 1.0f;
                Object object12 = j.m(j.c((LP1)object4, f6));
                float f7 = uq0_0.o;
                int n18 = 7;
                object7 = h.i((LP1)object12, 0.0f, 0.0f, 0.0f, f7, n18);
                object3 = zp.c;
                object8 = Nc$a.m;
                object8 = oZ.a((zp$l)object3, (Gx$a)object8, (b30_0)object6, 0);
                int n19 = ((j30_0)object6).P;
                object9 = ((j30_0)object6).P();
                object7 = a30_0.c((b30_0)object6, (LP1)object7);
                N20.W.getClass();
                object12 = object11;
                object11 = N20$a.b;
                object2 = ((j30_0)object6).a;
                n10 = object2 instanceof mp;
                if (n10 == 0) break block29;
                ((j30_0)object6).A();
                n10 = (int)(((j30_0)object6).O ? 1 : 0);
                if (n10 != 0) {
                    ((j30_0)object6).C((Function0)object11);
                } else {
                    ((j30_0)object6).n();
                }
                object11 = N20$a.e;
                Ow3.a((b30_0)object6, object8, (Function2)object11);
                object8 = N20$a.d;
                Ow3.a((b30_0)object6, object9, (Function2)object8);
                object8 = N20$a.f;
                n8 = (int)(((j30_0)object6).O ? 1 : 0);
                if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object11 = ((j30_0)object6).v(), object2 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                    rk_0.a(n19, (j30_0)object6, n19, (N20$a$a)object8);
                }
                object8 = N20$a.c;
                Ow3.a((b30_0)object6, object7, (Function2)object8);
                object9 = c.a((LP1)object4, 1.0f);
                zp$i zp$i = zp.g(uq0_0.h);
                object8 = kb_12;
                object7 = p83_03;
                object3 = p83_02;
                object2 = object4;
                object = object12;
                object11 = ft1_22;
                object10 = object4;
                object2 = object12;
                Object object13 = object6;
                object6 = qc_12;
                kb_12 = new kb_1(p83_03, baseValue, (ScreenInfo)object5, n17, p83_02, n3, ft1_22, (ft1_2)object12, qc_12);
                n18 = 0;
                int n20 = 24582;
                int n21 = 236;
                object12 = object9;
                xq1_0.b((LP1)object9, (ft1_2)object, null, false, zp$i, null, null, false, kb_12, (b30_0)object13, n20, n21);
                f6 = 2.0026323E-19f;
                object7 = object13;
                ((j30_0)object13).K(543976921);
                n15 = p83_03.size();
                n7 = 1;
                if (n15 > n7) {
                    n15 = 543978571;
                    f6 = 2.0028456E-19f;
                    ((j30_0)object13).K(n15);
                    object8 = ((j30_0)object13).v();
                    object5 = b30$a.a;
                    if (object8 == object5) {
                        object5 = object;
                        n17 = 0;
                        object8 = new lb_0(object, 0);
                        object8 = J83.e((Function0)object8);
                        ((j30_0)object13).o(object8);
                    } else {
                        n17 = 0;
                    }
                    object8 = (ib3_0)object8;
                    ((j30_0)object7).T(false);
                    float f8 = uq0_0.e;
                    object5 = h.e((LP1)object10, f8);
                    Q93.b((b30_0)object7, (LP1)object5);
                    int n22 = p83_03.size();
                    object8 = (Number)object8.getValue();
                    n15 = ((Number)object8).intValue();
                    jv_1.a(n22, n15, (b30_0)object7, 0);
                } else {
                    n17 = 0;
                }
                ((j30_0)object7).T(false);
                ((j30_0)object7).T(n7 != 0);
            }
            object2 = ((j30_0)object7).X();
            if (object2 != null) {
                object8 = object6;
                object7 = p83_02;
                n7 = n3;
                object5 = ft1_22;
                object3 = qc_12;
                object4 = v9_02;
                n8 = n4;
                ((CF2)object2).d = object6 = new MB(p83_02, n3, ft1_22, p83_03, qc_12, v9_02, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    /*
     * Exception decompiling
     */
    public static final void d(Product var0, Function2 var1_1, b30_0 var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:760)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static final void e(String string2, Component component, Product product, dr0_0 dr0_02, Activity activity, c80 c802, yp0_0 yp0_02, b30_0 b30_02, int n3) {
        int n4 = 364097151;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = "";
        Object object3 = string2 == null ? object : string2;
        Object object4 = component.getHeading();
        if (object4 == null) {
            object4 = object;
        }
        Object object5 = new ib_0(activity, dr0_02, c802, yp0_02);
        int n7 = n3 & 0xE;
        int n8 = 36864;
        int n10 = n7 | n8;
        object = object3;
        object3 = object4;
        object4 = product;
        WB.f((String)object, (String)object3, product, dr0_02, (ib_0)object5, (b30_0)object2, n10);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            object3 = object;
            object4 = string2;
            object5 = product;
            ((CF2)object2).d = object = new JB(string2, component, product, dr0_02, activity, c802, yp0_02, n3);
        }
    }

    public static final void f(String string2, String string3, Product product, dr0_0 dr0_02, ib_0 ib_02, b30_0 b30_02, int n3) {
        block19: {
            block20: {
                Object[] objectArray;
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                block18: {
                    String string4;
                    int n4;
                    Object object8;
                    j30_0 j30_02;
                    int n7;
                    Object object9;
                    Object object10;
                    int n8;
                    float f5;
                    boolean bl2;
                    ib_0 ib_03;
                    dr0_0 dr0_03;
                    Product product2;
                    block17: {
                        product2 = product;
                        dr0_03 = dr0_02;
                        ib_03 = ib_02;
                        bl2 = false;
                        f5 = 0.0f;
                        object7 = null;
                        n8 = 1;
                        object6 = mq2_0.a;
                        Intrinsics.checkNotNullParameter(object6, "<this>");
                        object10 = string2;
                        Intrinsics.checkNotNullParameter(string2, "brandName");
                        object9 = string3;
                        Intrinsics.checkNotNullParameter(string3, "heading");
                        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
                        Intrinsics.checkNotNullParameter(ib_02, "onItemWishlist");
                        n7 = 1305746788;
                        object5 = b30_02;
                        j30_02 = b30_02.g(n7);
                        object8 = LP1$a.b;
                        object4 = AndroidCompositionLocals_androidKt.b;
                        object4 = zv0_2.b((Context)j30_02.j((H30)object4));
                        n4 = object4 instanceof Activity;
                        string4 = null;
                        if (n4 != 0) {
                            object4 = (Activity)object4;
                        } else {
                            n7 = 0;
                            object4 = null;
                        }
                        if (product2 != null) break block17;
                        object6 = j30_02;
                        break block18;
                    }
                    n4 = 1065353216;
                    float f6 = 1.0f;
                    object6 = ((mq2_0)object6).a((LP1)object8, f6, n8 != 0);
                    object3 = new cb_0((Activity)object4, product2, dr0_03);
                    object6 = x20_0.d((LP1)object6, (Function0)object3);
                    object4 = HA.e(Nc$a.a, false);
                    int n10 = j30_02.P;
                    object2 = j30_02.P();
                    object6 = a30_0.c(j30_02, (LP1)object6);
                    N20.W.getClass();
                    object = N20$a.b;
                    Object object11 = j30_02.a;
                    n8 = object11 instanceof mp;
                    if (n8 == 0) break block19;
                    j30_02.A();
                    n8 = j30_02.O;
                    if (n8 != 0) {
                        j30_02.C((Function0)object);
                    } else {
                        j30_02.n();
                    }
                    objectArray = N20$a.e;
                    Ow3.a(j30_02, object4, (Function2)objectArray);
                    object4 = N20$a.d;
                    Ow3.a(j30_02, object2, (Function2)object4);
                    object2 = N20$a.f;
                    bl2 = j30_02.O;
                    if (bl2 || (n4 = (int)(Intrinsics.areEqual(object7 = j30_02.v(), object5 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                        rk_0.a(n10, j30_02, n10, (N20$a$a)object2);
                    }
                    object5 = N20$a.c;
                    Ow3.a(j30_02, object6, (Function2)object5);
                    int n14 = 1065353216;
                    float f7 = 1.0f;
                    Object object12 = j.m(j.c((LP1)object8, f7));
                    float f8 = uq0_0.u;
                    int n15 = 13;
                    object6 = h.i((LP1)object12, 0.0f, f8, 0.0f, 0.0f, n15);
                    f5 = uq0_0.e;
                    object3 = SP2.a(f5);
                    object6 = QV.a((LP1)object6, (i13)object3);
                    long l2 = nz_1.a;
                    object3 = fg2_1.a;
                    object6 = a.b((LP1)object6, l2, (i13)object3);
                    object3 = zp.c;
                    object10 = Nc$a.m;
                    object3 = oZ.a((zp$l)object3, (Gx$a)object10, j30_02, 0);
                    int n16 = j30_02.P;
                    object9 = j30_02.P();
                    object6 = a30_0.c(j30_02, (LP1)object6);
                    boolean bl3 = object11 instanceof mp;
                    if (!bl3) break block20;
                    j30_02.A();
                    bl3 = j30_02.O;
                    if (bl3) {
                        j30_02.C((Function0)object);
                    } else {
                        j30_02.n();
                    }
                    Ow3.a(j30_02, object3, (Function2)objectArray);
                    Ow3.a(j30_02, object9, (Function2)object4);
                    n7 = (int)(j30_02.O ? 1 : 0);
                    if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object4 = j30_02.v(), object3 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                        rk_0.a(n16, j30_02, n16, (N20$a$a)object2);
                    }
                    Ow3.a(j30_02, object6, (Function2)object5);
                    j30_02.K(346634500);
                    f7 = 6.42848E-40f;
                    n14 = n3 & 0x70000;
                    n7 = 196608;
                    n4 = 131072;
                    f6 = 1.83671E-40f;
                    if ((n14 ^= n7) > n4 && (n14 = (int)(j30_02.J(ib_03) ? 1 : 0)) != 0 || (n14 = n3 & n7) == n4) {
                        n14 = 1;
                        f7 = Float.MIN_VALUE;
                    } else {
                        n14 = 0;
                        f7 = 0.0f;
                        object6 = null;
                    }
                    object4 = j30_02.v();
                    if (n14 != 0 || object4 == (object6 = b30$a.a)) {
                        object4 = new NB(ib_03);
                        j30_02.o(object4);
                    }
                    object4 = (Function2)object4;
                    n14 = 0;
                    f7 = 0.0f;
                    j30_02.T(false);
                    n8 = 8;
                    WB.d(product2, (Function2)object4, j30_02, n8);
                    object6 = AndroidCompositionLocals_androidKt.a;
                    object4 = object6 = j30_02.j((H30)object6);
                    object4 = (Configuration)object6;
                    float f11 = uq0_0.h;
                    n15 = 12;
                    object12 = object8;
                    f8 = f11;
                    object9 = h.i((LP1)object8, f11, f11, 0.0f, 0.0f, n15);
                    object6 = object11;
                    object5 = product;
                    object3 = dr0_02;
                    object2 = string2;
                    object = string3;
                    object11 = new OB((Configuration)object4, product, dr0_02, string2, string3);
                    object11 = androidx.compose.ui.layout.c.a((LP1)object9, (Function1)object11);
                    object6 = product.getFnlColorVariantData();
                    object4 = "";
                    if (object6 == null || (object6 = ((ProductFnlColorVariantData)object6).getBrandName()) == null) {
                        object6 = object4;
                    }
                    long l3 = OX.f;
                    long l4 = oj3_2.c;
                    int n17 = 700;
                    object2 = new tv0_0(n17);
                    int n18 = 28032;
                    int n19 = 224;
                    object9 = object8;
                    object8 = object6;
                    object6 = j30_02;
                    ov3.j((LP1)object11, (String)object8, l4, l3, (tv0_0)object2, null, 0, null, j30_02, n18, n19);
                    n15 = 12;
                    object12 = object9;
                    f8 = f5;
                    object11 = h.i((LP1)object9, f11, f5, 0.0f, 0.0f, n15);
                    object2 = product.getName();
                    object8 = object2 == null ? object4 : object2;
                    l3 = nz_1.b;
                    int n20 = 400;
                    object4 = new tv0_0(n20);
                    n15 = 0;
                    n18 = 24966;
                    n19 = 224;
                    ov3.j((LP1)object11, (String)object8, l4, l3, (tv0_0)object4, null, 0, null, (b30_0)object6, n18, n19);
                    WB.g(product2, (b30_0)object6, n8);
                    n7 = R$string.plp_offer_price;
                    object2 = product.getOfferPrice();
                    if (object2 != null) {
                        string4 = ((Price)object2).getValue();
                    }
                    object2 = qz2_0.s(mz3_0.h(string4));
                    objectArray = new Object[1];
                    bl2 = false;
                    f5 = 0.0f;
                    object7 = null;
                    objectArray[0] = object2;
                    object8 = hv3_0.L(n7, objectArray);
                    object12 = object9;
                    f8 = f11;
                    object11 = h.i((LP1)object9, f11, f11, 0.0f, 0.0f, 12);
                    l3 = nz_1.w;
                    object4 = new tv0_0(n17);
                    n15 = 0;
                    n18 = 28038;
                    n19 = 224;
                    ov3.j((LP1)object11, (String)object8, l4, l3, (tv0_0)object4, null, 0, null, (b30_0)object6, n18, n19);
                    n7 = 1;
                    ((j30_0)object6).T(n7 != 0);
                    ((j30_0)object6).T(n7 != 0);
                    object4 = Unit.a;
                }
                object7 = ((j30_0)object6).X();
                if (object7 != null) {
                    object6 = objectArray;
                    object4 = string2;
                    object5 = string3;
                    object3 = product;
                    object2 = dr0_02;
                    object = ib_02;
                    objectArray = new PB(string2, string3, product, dr0_02, ib_02, n3);
                    ((CF2)object7).d = objectArray;
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void g(Product var0, b30_0 var1_1, int var2_2) {
        block16: {
            block17: {
                var3_3 = var0;
                Intrinsics.checkNotNullParameter(var0, "product");
                var4_4 = 140528212;
                var5_5 = var1_1;
                var6_6 = var1_1.g(var4_4);
                var5_5 = var0.getPrice();
                if (var5_5 == null) break block16;
                var7_7 = LP1$a.b;
                var8_8 = 1065353216;
                var9_9 = 1.0f;
                var10_10 = j.c(var7_7, var9_9);
                var11_11 = uq0_0.h;
                var12_12 = 0;
                var13_13 = 12;
                var14_14 = var11_11;
                var15_15 = var11_11;
                var5_5 = h.i((LP1)var10_10, var11_11, var11_11, 0.0f, 0.0f, var13_13);
                var10_10 = zp.a;
                var16_16 = Nc$a.j;
                var17_17 = 0;
                var10_10 = iQ2.a((zp$e)var10_10, (Gx$b)var16_16, (b30_0)var6_6, 0);
                var18_18 = var6_6.P;
                var19_19 = var6_6.P();
                var5_5 = a30_0.c((b30_0)var6_6, (LP1)var5_5);
                N20.W.getClass();
                var20_20 /* !! */  = N20$a.b;
                var21_21 = var6_6.a;
                var22_22 = var21_21 instanceof mp;
                if (!var22_22) break block17;
                var6_6.A();
                var22_22 = var6_6.O;
                if (var22_22) {
                    var6_6.C(var20_20 /* !! */ );
                } else {
                    var6_6.n();
                }
                var20_20 /* !! */  = N20$a.e;
                Ow3.a((b30_0)var6_6, var10_10, (Function2)var20_20 /* !! */ );
                var10_10 = N20$a.d;
                Ow3.a((b30_0)var6_6, var19_19, (Function2)var10_10);
                var10_10 = N20$a.f;
                var23_23 = var6_6.O;
                if (var23_23 || !(var23_23 = Intrinsics.areEqual(var19_19 = var6_6.v(), var20_20 /* !! */  = Integer.valueOf(var18_18)))) {
                    rk_0.a(var18_18, (j30_0)var6_6, var18_18, (N20$a$a)var10_10);
                }
                var10_10 = N20$a.c;
                Ow3.a((b30_0)var6_6, var5_5, (Function2)var10_10);
                var5_5 = var0.getPrice();
                var24_24 = "";
                if (var5_5 == null || (var5_5 = var5_5.getFormattedValue()) == null) {
                    var5_5 = var24_24;
                }
                var10_10 = qz2_0.s(mz3_0.h((String)var5_5));
                var25_25 = OX.f;
                var27_26 = oj3_2.c;
                var29_27 = new tv0_0(700);
                var30_28 = null;
                var8_8 = 0;
                var9_9 = 0.0f;
                var31_29 = 28032;
                var32_30 = 225;
                var33_31 = var27_26;
                var35_32 = var25_25;
                var37_33 = var31_29;
                var38_34 = false;
                var3_3 = null;
                var17_17 = var32_30;
                ov3.j(null, (String)var10_10, var27_26, var25_25, var29_27, null, 0, null, (b30_0)var6_6, var31_29, var32_30);
                var5_5 = var0.getWasPriceData();
                var17_17 = 1;
                if (var5_5 == null) ** GOTO lbl-1000
                var10_10 = var5_5.getValue();
                var18_18 = 0;
                var14_14 = 0.0f;
                var16_16 = null;
                if (var10_10 != null) {
                    var39_35 = Float.parseFloat((String)var10_10);
                } else {
                    var40_36 = 0;
                    var39_35 = 0.0f;
                    var10_10 = null;
                }
                var19_19 = var0.getPrice();
                if (var19_19 != null && (var19_19 = var19_19.getValue()) != null) {
                    var14_14 = Float.parseFloat((String)var19_19);
                }
                if ((var40_36 = Float.compare(var39_35, var14_14)) > 0) {
                    var10_10 = qz2_0.s(mz3_0.h(var5_5.getValue()));
                    var16_16 = new SpannableString((CharSequence)var10_10);
                    var19_19 = new StrikethroughSpan();
                    var40_36 = var10_10.length();
                    var12_12 = 33;
                    var16_16.setSpan(var19_19, 0, var40_36, var12_12);
                    var5_5 = qz2_0.g(var0.getPrice(), (Price)var5_5);
                    var10_10 = var16_16.toString();
                    var16_16 = var0.getDiscountPercent();
                    var18_18 = (int)TextUtils.isEmpty((CharSequence)var16_16);
                    if (var18_18 == 0) {
                        var5_5 = String.valueOf(var0.getDiscountPercent());
lbl96:
                        // 2 sources

                        while (true) {
                            var41_37 = var5_5;
                            var24_24 = var10_10;
                            var8_8 = 1;
                            var9_9 = 1.4E-45f;
                            var32_30 = 1;
                            break;
                        }
                    } else {
                        var18_18 = (int)TextUtils.isEmpty((CharSequence)var5_5);
                        if (var18_18 == 0) {
                            var16_16 = "% OFF";
                            var5_5 = Ft2.a((String)var5_5, (String)var16_16);
                            ** continue;
                        }
                        var41_37 = var24_24;
                        var8_8 = 1;
                        var9_9 = 1.4E-45f;
                        var32_30 = 0;
                        var24_24 = var10_10;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var41_37 = var24_24;
                    var8_8 = 0;
                    var9_9 = 0.0f;
                    var5_5 = null;
                    var32_30 = 0;
                }
                var40_36 = -719928829;
                var39_35 = -1.0360001E13f;
                var6_6.K(var40_36);
                if (var8_8 != 0) {
                    var23_23 = false;
                    var15_15 = 0.0f;
                    var19_19 = null;
                    var22_22 = false;
                    var21_21 = null;
                    var13_13 = 10;
                    var10_10 = var7_7;
                    var14_14 = var11_11;
                    var5_5 = h.i(var7_7, var11_11, 0.0f, var11_11, 0.0f, var13_13);
                    var35_32 = nz_1.b;
                    var40_36 = 400;
                    var39_35 = 5.6E-43f;
                    var29_27 = new tv0_0(var40_36);
                    var30_28 = Jj3.d;
                    var37_33 = 12607878;
                    var42_38 = 96;
                    var11_11 = 1.35E-43f;
                    var10_10 = var24_24;
                    var33_31 = var27_26;
                    var17_17 = var42_38;
                    ov3.j((LP1)var5_5, (String)var24_24, var27_26, var35_32, var29_27, null, 0, var30_28, (b30_0)var6_6, var37_33, var42_38);
                }
                var6_6.T(false);
                var8_8 = -719915210;
                var9_9 = -1.0374282E13f;
                var6_6.K(var8_8);
                if (var32_30 != 0) {
                    var15_15 = uq0_0.c;
                    var12_12 = 0;
                    var20_20 /* !! */  = null;
                    var22_22 = false;
                    var21_21 = null;
                    var18_18 = 0;
                    var14_14 = 0.0f;
                    var16_16 = null;
                    var13_13 = 13;
                    var10_10 = var7_7;
                    var5_5 = h.i(var7_7, 0.0f, var15_15, 0.0f, 0.0f, var13_13);
                    var33_31 = oj3_2.a;
                    var40_36 = 700;
                    var39_35 = 9.81E-43f;
                    var29_27 = new tv0_0(var40_36);
                    var30_28 = null;
                    var37_33 = 28038;
                    var17_17 = 224;
                    var10_10 = var41_37;
                    var35_32 = var25_25;
                    ov3.j((LP1)var5_5, (String)var41_37, var33_31, var25_25, var29_27, null, 0, null, (b30_0)var6_6, var37_33, var17_17);
                }
                var6_6.T(false);
                var38_34 = true;
                var6_6.T(var38_34);
                break block16;
            }
            s20.a();
            throw null;
        }
        if ((var3_3 = var6_6.X()) != null) {
            var5_5 = var0;
            var40_36 = var2_2;
            var3_3.d = var6_6 = new tb_0(var2_2, var0);
        }
    }
}

