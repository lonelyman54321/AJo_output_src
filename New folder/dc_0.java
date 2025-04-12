/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 */
import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.Hotspot;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from DC
 */
public final class dc_0
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ f23_0 f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ i90_0 i;
    public final /* synthetic */ yp0_0 j;
    public final /* synthetic */ yT1 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Configuration o;

    public dc_0(p83_0 p83_02, Ref$ObjectRef ref$ObjectRef, ft1_2 ft1_22, dr0_0 dr0_02, p83_0 p83_03, f23_0 f23_02, Ref$ObjectRef ref$ObjectRef2, Activity activity, c80 c802, yp0_0 yp0_02, yT1 yT12, String string2, String string3, String string4, Configuration configuration) {
        this.a = p83_02;
        this.b = ref$ObjectRef;
        this.c = ft1_22;
        this.d = dr0_02;
        this.e = p83_03;
        this.f = f23_02;
        this.g = ref$ObjectRef2;
        this.h = activity;
        this.i = c802;
        this.j = yp0_02;
        this.k = yT12;
        this.l = string2;
        this.m = string3;
        this.n = string4;
        this.o = configuration;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block148: {
            block150: {
                block152: {
                    block151: {
                        block149: {
                            block146: {
                                block147: {
                                    var5_5 = this;
                                    var6_6 = "<this>";
                                    var7_7 = 0;
                                    var8_8 = 0.0f;
                                    var9_9 = null;
                                    var10_10 /* !! */  = var1_1 /* !! */ ;
                                    var10_10 /* !! */  = (wr1_2)var1_1 /* !! */ ;
                                    var11_11 = var2_2;
                                    var11_11 = (Number)var2_2;
                                    var12_12 = var11_11.intValue();
                                    var13_13 = var3_3;
                                    var13_13 = (b30_0)var3_3;
                                    var14_14 = var4_4;
                                    var14_14 = (Number)var4_4;
                                    var15_15 = var14_14.intValue();
                                    var16_16 = "$this$items";
                                    Intrinsics.checkNotNullParameter(var10_10 /* !! */ , (String)var16_16);
                                    var17_17 = var15_15 & 112;
                                    if (var17_17 == 0) {
                                        var17_17 = (int)var13_13.c(var12_12);
                                        if (var17_17 != 0) {
                                            var17_17 = 32;
                                            var18_18 = 4.5E-44f;
                                        } else {
                                            var17_17 = 16;
                                            var18_18 = 2.2E-44f;
                                        }
                                        var15_15 |= var17_17;
                                    }
                                    var17_17 = var15_15;
                                    var19_19 = 144;
                                    var20_20 = 2.02E-43f;
                                    if ((var15_15 &= 721) != var19_19 || (var15_15 = (int)var13_13.h()) == 0) break block147;
                                    var13_13.D();
                                    var9_9 = var5_5;
                                    break block148;
                                }
                                var21_21 = var5_5.a;
                                if (var21_21 != null) {
                                    var22_22 = var14_14 = (Component)var21_21.get(var12_12);
                                } else {
                                    var23_23 = 0;
                                    var22_22 = null;
                                }
                                if (var22_22 != null) {
                                    var14_14 = var22_22.getType();
                                } else {
                                    var15_15 = 0;
                                    var24_24 = 0.0f;
                                    var14_14 = null;
                                }
                                var16_16 = "INSERT";
                                var19_19 = (int)Intrinsics.areEqual(var14_14, var16_16);
                                var25_25 = Nc$a.m;
                                var26_26 = LP1$a.b;
                                var27_27 = var5_5.i;
                                var28_28 = var5_5.b;
                                var29_29 = var5_5.h;
                                var30_30 = "";
                                var31_31 = var5_5.d;
                                if (var19_19 == 0) break block149;
                                var17_17 = -1158461805;
                                var18_18 = -0.0018560461f;
                                var13_13.K(var17_17);
                                var10_10 /* !! */  = var22_22.getTemplate();
                                if (var10_10 /* !! */  == null) ** GOTO lbl-1000
                                var15_15 = var10_10 /* !! */ .hashCode();
                                var21_21 = fg2_1.a;
                                var16_16 = var5_5.l;
                                block0 : switch (var15_15) lbl-1000:
                                // 3 sources

                                {
                                    default: lbl-1000:
                                    // 2 sources

                                    {
                                        var28_28 = var5_5;
                                        var29_29 = var13_13;
                                        break;
                                    }
                                    case 1519642508: {
                                        var6_6 = "PRODUCT_CATEGORIES";
                                        var32_32 = var10_10 /* !! */ .equals(var6_6);
                                        if (var32_32 == 0) ** GOTO lbl-1000
                                        var32_32 = -1141581716;
                                        var33_39 = -0.0074720886f;
                                        var13_13.K(var32_32);
                                        var6_6 = new gc_2(var29_29, 0);
                                        var34_46 = 8;
                                        var35_51 = 1.1E-44f;
                                        va_0.a((Component)var22_22, (gc_2)var6_6, (b30_0)var13_13, var34_46);
                                        var13_13.E();
                                        var6_6 = Unit.a;
                                        var28_28 = var5_5;
                                        var29_29 = var13_13;
                                        break block146;
                                    }
                                    case 63921006: {
                                        var31_31 = "PRODUCTS_WITH_CATALOG_LAYOUT";
                                        var34_47 = var10_10 /* !! */ .equals(var31_31);
                                        if (var34_47 == 0) ** GOTO lbl-1000
                                        var13_13.K(-1138298165);
                                        var31_31 = AndroidCompositionLocals_androidKt.a;
                                        var31_31 = (Configuration)var13_13.j((H30)var31_31);
                                        var36_56 = var31_31.screenHeightDp;
                                        var34_47 = var31_31.screenWidthDp;
                                        var35_52 = var34_47;
                                        var37_59 = uq0_0.o + var35_52 - var35_52;
                                        var29_29 = var5_5.e;
                                        if (var29_29 != null && (var17_17 = (int)var29_29.isEmpty()) == 0) ** GOTO lbl103
                                        var29_29 = var5_5;
                                        var6_6 = var13_13;
                                        ** GOTO lbl653
lbl103:
                                        // 1 sources

                                        var17_17 = 1065353216;
                                        var11_11 = androidx.compose.foundation.layout.j.c((LP1)var26_26, 1.0f);
                                        var18_18 = uq0_0.u;
                                        var24_24 = uq0_0.r;
                                        var28_28 = androidx.compose.foundation.layout.h.h((LP1)var11_11, var37_59, var18_18, var37_59, var24_24);
                                        var10_10 /* !! */  = zp.c;
                                        var11_11 = oZ.a((zp$l)var10_10 /* !! */ , (Gx$a)var25_25, (b30_0)var13_13, 0);
                                        var15_15 = var13_13.F();
                                        var16_16 = var13_13.m();
                                        var28_28 = a30_0.c((b30_0)var13_13, (LP1)var28_28);
                                        var38_62 = N20.W;
                                        var38_62.getClass();
                                        var9_9 = N20$a.b;
                                        var2_2 = var25_25;
                                        var25_25 = var13_13.i();
                                        var39_69 = var25_25 instanceof mp;
                                        if (var39_69 == 0) ** GOTO lbl650
                                        var13_13.A();
                                        var39_69 = var13_13.e();
                                        if (var39_69 != 0) {
                                            var13_13.C((Function0)var9_9);
                                        } else {
                                            var13_13.n();
                                        }
                                        var25_25 = N20$a.e;
                                        Ow3.a((b30_0)var13_13, var11_11, (Function2)var25_25);
                                        var11_11 = N20$a.d;
                                        Ow3.a((b30_0)var13_13, var16_16, (Function2)var11_11);
                                        var16_16 = N20$a.f;
                                        var40_73 = var13_13.e();
                                        var3_3 = var25_25;
                                        if (var40_73) ** GOTO lbl141
                                        var25_25 = var13_13.v();
                                        var4_4 = var26_26;
                                        var26_26 = var15_15;
                                        var39_69 = Intrinsics.areEqual(var25_25, var26_26);
                                        if (var39_69 != 0) ** GOTO lbl143
                                        ** GOTO lbl142
lbl141:
                                        // 1 sources

                                        var4_4 = var26_26;
lbl142:
                                        // 2 sources

                                        re0_0.a(var15_15, (b30_0)var13_13, var15_15, (N20$a$a)var16_16);
lbl143:
                                        // 2 sources

                                        var25_25 = N20$a.c;
                                        Ow3.a((b30_0)var13_13, var28_28, (Function2)var25_25);
                                        var28_28 = var22_22.getHeading();
                                        if (var28_28 == null) {
                                            var28_28 = var30_30;
                                        }
                                        var41_79 = oj3_2.i;
                                        var43_80 = nz_1.j;
                                        var45_81 = y20_0.b;
                                        var46_86 = tv0_0.e;
                                        var47_89 = 224640;
                                        var48_90 = 3.14788E-40f;
                                        var49_91 = 129;
                                        var24_24 = 0.0f;
                                        var14_14 = null;
                                        var50_93 = 1;
                                        var51_95 = null;
                                        var26_26 = var16_16;
                                        var16_16 = var28_28;
                                        var28_28 = var2_2;
                                        var52_97 = var3_3;
                                        var53_99 = var4_4;
                                        var54_101 = var25_25;
                                        var55_103 = var26_26;
                                        var56_105 = var41_79;
                                        var2_2 = var22_22;
                                        var58_108 = var21_21;
                                        var59_110 = var43_80;
                                        var3_3 = var13_13;
                                        var13_13 = var46_86;
                                        var38_62 = var45_81;
                                        var61_113 = var50_93;
                                        var62_117 = 0;
                                        var63_122 = 0.0f;
                                        var64_127 = var47_89;
                                        var65_131 = var48_90;
                                        var66_135 = var49_91;
                                        ov3.j(null, (String)var16_16, var41_79, var43_80, (tv0_0)var46_86, var45_81, var50_93, null, (b30_0)var3_3, var47_89, var49_91);
                                        var15_15 = var29_29.size();
                                        var19_19 = 2;
                                        var20_20 = 2.8E-45f;
                                        if (var15_15 > var19_19) {
                                            var15_15 = 1;
                                            var24_24 = 1.4E-45f;
                                        } else {
                                            var15_15 = 0;
                                            var24_24 = 0.0f;
                                            var14_14 = null;
                                        }
                                        var19_19 = var29_29.size();
                                        var39_69 = 4;
                                        var67_139 = 5.6E-45f;
                                        if (var19_19 > var39_69) {
                                            var19_19 = 1;
                                            var20_20 = 1.4E-45f;
                                        } else {
                                            var19_19 = 0;
                                            var20_20 = 0.0f;
                                            var16_16 = null;
                                        }
                                        var39_69 = var29_29.size();
                                        var68_143 = 6;
                                        var69_148 = 8.4E-45f;
                                        if (var39_69 > var68_143) {
                                            var39_69 = 1;
                                            var67_139 = 1.4E-45f;
                                        } else {
                                            var39_69 = 0;
                                            var67_139 = 0.0f;
                                            var25_25 = null;
                                        }
                                        cp_1.Companion.getClass();
                                        cp$a.e().getClass();
                                        var26_26 = "productList";
                                        Intrinsics.checkNotNullParameter(var29_29, (String)var26_26);
                                        Intrinsics.checkNotNullParameter(var29_29, (String)var6_6);
                                        var32_33 = 2;
                                        var33_40 = 2.8E-45f;
                                        var70_153 = 1;
                                        var71_159 = 1.4E-45f;
                                        var29_29 = CollectionsKt.p0((Iterable)var29_29, var32_33, var32_33, (boolean)var70_153);
                                        var23_23 = var29_29.size();
                                        if (var23_23 > var70_153) {
                                            var62_117 = 1;
                                            var63_122 = 1.4E-45f;
                                        } else {
                                            var62_117 = var15_15;
                                            var63_122 = var24_24;
                                        }
                                        var15_15 = var29_29.size();
                                        if (var15_15 > var32_33) {
                                            var32_33 = 1;
                                            var33_40 = 1.4E-45f;
                                        } else {
                                            var32_33 = var19_19;
                                            var33_40 = var20_20;
                                        }
                                        var15_15 = var29_29.size();
                                        var72_163 = 3;
                                        if (var15_15 > var72_163) {
                                            var73_166 = 1;
                                            var74_169 = 1.4E-45f;
                                        } else {
                                            var73_166 = var39_69;
                                            var74_169 = var67_139;
                                        }
                                        var75_174 = nz_1.a;
                                        var22_22 = var53_99;
                                        var26_26 = var58_108;
                                        var25_25 = androidx.compose.foundation.a.b((LP1)var53_99, var75_174, (i13)var58_108);
                                        var13_13 = var3_3;
                                        var72_163 = 0;
                                        var28_28 = oZ.a((zp$l)var10_10 /* !! */ , (Gx$a)var28_28, (b30_0)var3_3, 0);
                                        var17_17 = var3_3.F();
                                        var21_21 = var3_3.m();
                                        var25_25 = a30_0.c((b30_0)var3_3, (LP1)var25_25);
                                        var22_22 = var3_3.i();
                                        var23_23 = var22_22 instanceof mp;
                                        if (var23_23 == 0) ** GOTO lbl647
                                        var3_3.A();
                                        var23_23 = (int)var3_3.e();
                                        if (var23_23 != 0) {
                                            var3_3.C((Function0)var9_9);
lbl261:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var3_3.n();
                                        ** continue;
                                        var22_22 = var52_97;
                                        Ow3.a((b30_0)var13_13, var28_28, (Function2)var52_97);
                                        Ow3.a((b30_0)var13_13, var21_21, var11_11);
                                        var36_56 = (int)var13_13.e();
                                        if (var36_56 == 0 && (var36_56 = (int)Intrinsics.areEqual(var28_28 = var13_13.v(), var21_21 = Integer.valueOf(var17_17))) != 0) {
                                            var28_28 = var55_103;
lbl271:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var28_28 = var55_103;
                                        re0_0.a(var17_17, (b30_0)var13_13, var17_17, var55_103);
                                        ** continue;
                                        var10_10 /* !! */  = var54_101;
                                        Ow3.a((b30_0)var13_13, var25_25, var54_101);
                                        var13_13.K(-1405354398);
                                        var39_69 = 0;
                                        var67_139 = 0.0f;
                                        var25_25 = null;
                                        var21_21 = (List)CollectionsKt.N(0, (List)var29_29);
                                        if (var21_21 != null) {
                                            var39_69 = var21_21.size();
                                        } else {
                                            var39_69 = 0;
                                            var67_139 = 0.0f;
                                            var25_25 = null;
                                        }
                                        var14_14 = androidx.compose.foundation.a.b(ov3.w(var39_69), var75_174, (i13)var26_26);
                                        var20_20 = uq0_0.h;
                                        var16_16 = zp.g(var20_20);
                                        var25_25 = Nc$a.j;
                                        var65_131 = var35_52;
                                        var35_52 = 8.4E-45f;
                                        var16_16 = iQ2.a((zp$e)var16_16, (Gx$b)var25_25, (b30_0)var13_13, 6);
                                        var34_47 = var13_13.F();
                                        var38_62 = var25_25;
                                        var25_25 = var13_13.m();
                                        var14_14 = a30_0.c((b30_0)var13_13, (LP1)var14_14);
                                        var58_108 = var26_26;
                                        var26_26 = var13_13.i();
                                        var70_153 = var26_26 instanceof mp;
                                        if (var70_153 == 0) ** GOTO lbl644
                                        var13_13.A();
                                        var70_153 = (int)var13_13.e();
                                        if (var70_153 != 0) {
                                            var13_13.C((Function0)var9_9);
                                        } else {
                                            var13_13.n();
                                        }
                                        Ow3.a((b30_0)var13_13, var16_16, (Function2)var22_22);
                                        Ow3.a((b30_0)var13_13, var25_25, var11_11);
                                        var7_7 = var13_13.e();
                                        if (var7_7 != 0 || (var7_7 = Intrinsics.areEqual(var9_9 = var13_13.v(), var11_11 = Integer.valueOf(var34_47))) == 0) {
                                            re0_0.a(var34_47, (b30_0)var13_13, var34_47, var28_28);
                                        }
                                        Ow3.a((b30_0)var13_13, var14_14, var10_10 /* !! */ );
                                        var34_47 = -1874066356;
                                        var35_52 = -4.0235216E-29f;
                                        var13_13.K(var34_47);
                                        var11_11 = var5_5.l;
                                        var31_31 = var5_5.d;
                                        var10_10 /* !! */  = var5_5.h;
                                        var28_28 = var5_5.j;
                                        if (var21_21 == null) {
                                            var77_175 = var32_33;
                                            var3_3 = var13_13;
                                            var5_5 = var38_62;
                                            var9_9 = var58_108;
                                            var32_33 = 6;
                                            var33_40 = 8.4E-45f;
                                        } else {
                                            var21_21 = (Iterable)var21_21;
                                            var9_9 = var21_21.iterator();
                                            while ((var15_15 = (int)var9_9.hasNext()) != 0) {
                                                var25_25 = var14_14 = var9_9.next();
                                                var25_25 = (Product)var14_14;
                                                var21_21 = var27_27;
                                                var21_21 = (c80)var27_27;
                                                var61_113 = 19173894;
                                                var14_14 = var11_11;
                                                var16_16 = var2_2;
                                                var22_22 = var38_62;
                                                var46_86 = var9_9;
                                                var9_9 = var58_108;
                                                var26_26 = var31_31;
                                                var5_5 = var38_62;
                                                var22_22 = var10_10 /* !! */ ;
                                                var77_175 = var32_33;
                                                var3_3 = var13_13;
                                                var13_13 = var28_28;
                                                var38_62 = var3_3;
                                                WB.e((String)var11_11, var2_2, (Product)var25_25, (dr0_0)var31_31, var10_10 /* !! */ , (c80)var21_21, (yp0_0)var28_28, (b30_0)var3_3, var61_113);
                                                var13_13 = var3_3;
                                                var38_62 = var5_5;
                                                var9_9 = var46_86;
                                                var5_5 = this;
                                            }
                                            var77_175 = var32_33;
                                            var3_3 = var13_13;
                                            var5_5 = var38_62;
                                            var9_9 = var58_108;
                                            var32_33 = 6;
                                            var33_40 = 8.4E-45f;
                                            var14_14 = Unit.a;
                                        }
                                        var3_3.E();
                                        var3_3.p();
                                        var3_3.E();
                                        var15_15 = -1405308986;
                                        var24_24 = -2.681398E-12f;
                                        var13_13 = var3_3;
                                        var3_3.K(var15_15);
                                        if (var62_117 != 0) {
                                            var15_15 = 1;
                                            var24_24 = 1.4E-45f;
                                            var14_14 = (List)CollectionsKt.N(var15_15, (List)var29_29);
                                            if (var14_14 != null) {
                                                var19_19 = var14_14.size();
                                            } else {
                                                var19_19 = 0;
                                                var20_20 = 0.0f;
                                                var16_16 = null;
                                            }
                                            var16_16 = ov3.w(var19_19);
                                            var56_105 = nz_1.a;
                                            var16_16 = androidx.compose.foundation.a.b((LP1)var16_16, var56_105, (i13)var9_9);
                                            var25_25 = zp.a;
                                            var67_139 = uq0_0.h;
                                            var25_25 = iQ2.a(zp.g(var67_139), (Gx$b)var5_5, (b30_0)var13_13, var32_33);
                                            var70_153 = var13_13.F();
                                            var22_22 = var13_13.m();
                                            var16_16 = a30_0.c((b30_0)var13_13, (LP1)var16_16);
                                            N20.W.getClass();
                                            var21_21 = N20$a.b;
                                            var6_6 = var13_13.i();
                                            var32_33 = var6_6 instanceof mp;
                                            if (var32_33 != 0) {
                                                var13_13.A();
                                                var32_33 = (int)var13_13.e();
                                                if (var32_33 != 0) {
                                                    var13_13.C((Function0)var21_21);
                                                } else {
                                                    var13_13.n();
                                                }
                                                var6_6 = N20$a.e;
                                                Ow3.a((b30_0)var13_13, var25_25, (Function2)var6_6);
                                                var6_6 = N20$a.d;
                                                Ow3.a((b30_0)var13_13, var22_22, (Function2)var6_6);
                                                var6_6 = N20$a.f;
                                                var39_69 = (int)var13_13.e();
                                                if (var39_69 != 0 || (var39_69 = (int)Intrinsics.areEqual(var25_25 = var13_13.v(), var22_22 = Integer.valueOf(var70_153))) == 0) {
                                                    re0_0.a(var70_153, (b30_0)var13_13, var70_153, (N20$a$a)var6_6);
                                                }
                                                var6_6 = N20$a.c;
                                                Ow3.a((b30_0)var13_13, var16_16, (Function2)var6_6);
                                                var32_33 = -1874020820;
                                                var33_40 = -4.0372246E-29f;
                                                var13_13.K(var32_33);
                                                if (var14_14 == null) {
                                                    var3_3 = var13_13;
                                                } else {
                                                    var14_14 = (Iterable)var14_14;
                                                    var6_6 = var14_14.iterator();
                                                    while ((var15_15 = (int)var6_6.hasNext()) != 0) {
                                                        var25_25 = var14_14 = var6_6.next();
                                                        var25_25 = (Product)var14_14;
                                                        var21_21 = var27_27;
                                                        var21_21 = (c80)var27_27;
                                                        var61_113 = 19173894;
                                                        var14_14 = var11_11;
                                                        var16_16 = var2_2;
                                                        var26_26 = var31_31;
                                                        var22_22 = var10_10 /* !! */ ;
                                                        var3_3 = var13_13;
                                                        var13_13 = var28_28;
                                                        var38_62 = var3_3;
                                                        WB.e((String)var11_11, var2_2, (Product)var25_25, (dr0_0)var31_31, var10_10 /* !! */ , (c80)var21_21, (yp0_0)var28_28, (b30_0)var3_3, var61_113);
                                                        var13_13 = var3_3;
                                                    }
                                                    var3_3 = var13_13;
                                                    var6_6 = Unit.a;
                                                }
                                                var3_3.E();
                                                var3_3.p();
                                            } else {
                                                s20.a();
                                                throw null;
                                            }
                                        }
                                        var3_3.E();
                                        var32_33 = -1405263454;
                                        var33_40 = -2.6912713E-12f;
                                        var13_13 = var3_3;
                                        var3_3.K(var32_33);
                                        if (var77_175 != 0) {
                                            var32_33 = 2;
                                            var33_40 = 2.8E-45f;
                                            var6_6 = (List)CollectionsKt.N(var32_33, (List)var29_29);
                                            if (var6_6 != null) {
                                                var15_15 = var6_6.size();
                                            } else {
                                                var15_15 = 0;
                                                var24_24 = 0.0f;
                                                var14_14 = null;
                                            }
                                            var14_14 = ov3.w(var15_15);
                                            var78_176 = nz_1.a;
                                            var14_14 = androidx.compose.foundation.a.b((LP1)var14_14, var78_176, (i13)var9_9);
                                            var16_16 = zp.a;
                                            var20_20 = uq0_0.h;
                                            var16_16 = zp.g(var20_20);
                                            var67_139 = 8.4E-45f;
                                            var16_16 = iQ2.a((zp$e)var16_16, (Gx$b)var5_5, (b30_0)var13_13, 6);
                                            var39_69 = var13_13.F();
                                            var26_26 = var13_13.m();
                                            var14_14 = a30_0.c((b30_0)var13_13, (LP1)var14_14);
                                            N20.W.getClass();
                                            var22_22 = N20$a.b;
                                            var21_21 = var13_13.i();
                                            var72_163 = var21_21 instanceof mp;
                                            if (var72_163 != 0) {
                                                var13_13.A();
                                                var72_163 = (int)var13_13.e();
                                                if (var72_163 != 0) {
                                                    var13_13.C((Function0)var22_22);
                                                } else {
                                                    var13_13.n();
                                                }
                                                var22_22 = N20$a.e;
                                                Ow3.a((b30_0)var13_13, var16_16, (Function2)var22_22);
                                                var16_16 = N20$a.d;
                                                Ow3.a((b30_0)var13_13, var26_26, (Function2)var16_16);
                                                var16_16 = N20$a.f;
                                                var70_153 = (int)var13_13.e();
                                                if (var70_153 != 0 || (var70_153 = (int)Intrinsics.areEqual(var26_26 = var13_13.v(), var22_22 = Integer.valueOf(var39_69))) == 0) {
                                                    re0_0.a(var39_69, (b30_0)var13_13, var39_69, (N20$a$a)var16_16);
                                                }
                                                var16_16 = N20$a.c;
                                                Ow3.a((b30_0)var13_13, var14_14, (Function2)var16_16);
                                                var15_15 = -1873975412;
                                                var24_24 = -4.050889E-29f;
                                                var13_13.K(var15_15);
                                                if (var6_6 == null) {
                                                    var3_3 = var13_13;
                                                } else {
                                                    var6_6 = ((Iterable)var6_6).iterator();
                                                    while ((var15_15 = (int)var6_6.hasNext()) != 0) {
                                                        var25_25 = var14_14 = var6_6.next();
                                                        var25_25 = (Product)var14_14;
                                                        var21_21 = var27_27;
                                                        var21_21 = (c80)var27_27;
                                                        var61_113 = 19173894;
                                                        var14_14 = var11_11;
                                                        var16_16 = var2_2;
                                                        var26_26 = var31_31;
                                                        var22_22 = var10_10 /* !! */ ;
                                                        var3_3 = var13_13;
                                                        var13_13 = var28_28;
                                                        var38_62 = var3_3;
                                                        WB.e((String)var11_11, var2_2, (Product)var25_25, (dr0_0)var31_31, var10_10 /* !! */ , (c80)var21_21, (yp0_0)var28_28, (b30_0)var3_3, var61_113);
                                                        var13_13 = var3_3;
                                                    }
                                                    var3_3 = var13_13;
                                                    var6_6 = Unit.a;
                                                }
                                                var3_3.E();
                                                var3_3.p();
                                            } else {
                                                s20.a();
                                                throw null;
                                            }
                                        }
                                        var3_3.E();
                                        var32_33 = -1405218042;
                                        var33_40 = -2.7011184E-12f;
                                        var13_13 = var3_3;
                                        var3_3.K(var32_33);
                                        if (var73_166 == 0) ** GOTO lbl600
                                        var32_33 = 3;
                                        var33_40 = 4.2E-45f;
                                        var6_6 = (List)CollectionsKt.N(var32_33, (List)var29_29);
                                        if (var6_6 != null) {
                                            var80_178 = var6_6.size();
                                        } else {
                                            var80_178 = 0;
                                            var29_29 = null;
                                        }
                                        var29_29 = ov3.w(var80_178);
                                        var75_174 = nz_1.a;
                                        var29_29 = androidx.compose.foundation.a.b((LP1)var29_29, var75_174, (i13)var9_9);
                                        var9_9 = zp.a;
                                        var8_8 = uq0_0.h;
                                        var9_9 = zp.g(var8_8);
                                        var15_15 = 6;
                                        var24_24 = 8.4E-45f;
                                        var5_5 = iQ2.a((zp$e)var9_9, (Gx$b)var5_5, (b30_0)var13_13, var15_15);
                                        var7_7 = var13_13.F();
                                        var14_14 = var13_13.m();
                                        var29_29 = a30_0.c((b30_0)var13_13, (LP1)var29_29);
                                        N20.W.getClass();
                                        var16_16 = N20$a.b;
                                        var25_25 = var13_13.i();
                                        var39_69 = var25_25 instanceof mp;
                                        if (var39_69 != 0) {
                                            var13_13.A();
                                            var39_69 = (int)var13_13.e();
                                            if (var39_69 != 0) {
                                                var13_13.C((Function0)var16_16);
                                            } else {
                                                var13_13.n();
                                            }
                                            var16_16 = N20$a.e;
                                            Ow3.a((b30_0)var13_13, var5_5, (Function2)var16_16);
                                            var5_5 = N20$a.d;
                                            Ow3.a((b30_0)var13_13, var14_14, (Function2)var5_5);
                                            var5_5 = N20$a.f;
                                            var15_15 = (int)var13_13.e();
                                            if (var15_15 != 0 || (var15_15 = (int)Intrinsics.areEqual(var14_14 = var13_13.v(), var16_16 = Integer.valueOf(var7_7))) == 0) {
                                                re0_0.a(var7_7, (b30_0)var13_13, var7_7, (N20$a$a)var5_5);
                                            }
                                            var5_5 = N20$a.c;
                                            Ow3.a((b30_0)var13_13, var29_29, (Function2)var5_5);
                                            var81_179 = -1873929876;
                                            var82_185 = -4.064592E-29f;
                                            var13_13.K(var81_179);
                                            if (var6_6 == null) {
                                                var6_6 = var13_13;
                                            } else {
                                                var6_6 = (Iterable)var6_6;
                                                var5_5 = var6_6.iterator();
                                                while ((var32_33 = var5_5.hasNext()) != 0) {
                                                    var25_25 = var6_6 = var5_5.next();
                                                    var25_25 = (Product)var6_6;
                                                    var21_21 = var27_27;
                                                    var21_21 = (c80)var27_27;
                                                    var61_113 = 19173894;
                                                    var14_14 = var11_11;
                                                    var16_16 = var2_2;
                                                    var26_26 = var31_31;
                                                    var22_22 = var10_10 /* !! */ ;
                                                    var6_6 = var13_13;
                                                    var13_13 = var28_28;
                                                    var38_62 = var6_6;
                                                    WB.e((String)var11_11, var2_2, (Product)var25_25, (dr0_0)var31_31, var10_10 /* !! */ , (c80)var21_21, (yp0_0)var28_28, (b30_0)var6_6, var61_113);
                                                    var13_13 = var6_6;
                                                }
                                                var6_6 = var13_13;
                                                var5_5 = Unit.a;
                                            }
                                            var6_6.E();
                                            var6_6.p();
                                        } else {
                                            s20.a();
                                            throw null;
lbl600:
                                            // 1 sources

                                            var6_6 = var3_3;
                                        }
                                        var6_6.E();
                                        var6_6.p();
                                        var81_179 = 50;
                                        var82_185 = var81_179;
                                        var29_29 = var53_99;
                                        var7_7 = 1065353216;
                                        var8_8 = 1.0f;
                                        var14_14 = androidx.compose.foundation.layout.j.c((LP1)var53_99, var8_8);
                                        var67_139 = uq0_0.v;
                                        var19_19 = 0;
                                        var20_20 = 0.0f;
                                        var72_163 = 13;
                                        var70_153 = 0;
                                        var23_23 = 0;
                                        var22_22 = androidx.compose.foundation.layout.h.i((LP1)var14_14, 0.0f, var67_139, 0.0f, 0.0f, var72_163);
                                        var21_21 = tv0_0.h;
                                        var69_148 = uq0_0.e;
                                        var29_29 = this;
                                        var14_14 = this.n;
                                        var25_25 = var27_27;
                                        var25_25 = (c80)var27_27;
                                        var9_9 = var83_192;
                                        var16_16 = var31_31;
                                        var26_26 = var28_28;
                                        var83_192 = new lc_1(var10_10 /* !! */ , (String)var11_11, (String)var14_14, (dr0_0)var31_31, (c80)var25_25, (yp0_0)var28_28);
                                        var34_47 = 807103536;
                                        var35_52 = 5.6542415E-10f;
                                        var66_135 = 129;
                                        var15_15 = 0;
                                        var24_24 = 0.0f;
                                        var14_14 = null;
                                        var16_16 = "View All";
                                        var40_73 = false;
                                        var38_62 = null;
                                        var62_117 = 1;
                                        var63_122 = 1.4E-45f;
                                        var67_139 = var65_131;
                                        var71_159 = var82_185;
                                        var64_127 = var34_47;
                                        var65_131 = var35_52;
                                        ov3.f(false, var16_16, var67_139, var82_185, (LP1)var22_22, (tv0_0)var21_21, var69_148, null, var83_192, (boolean)var62_117, (b30_0)var6_6, var34_47, var66_135);
                                        var6_6.p();
                                        ** GOTO lbl653
lbl644:
                                        // 1 sources

                                        var29_29 = var5_5;
                                        s20.a();
                                        throw null;
lbl647:
                                        // 1 sources

                                        var29_29 = var5_5;
                                        s20.a();
                                        throw null;
lbl650:
                                        // 1 sources

                                        var29_29 = var5_5;
                                        s20.a();
                                        throw null;
lbl653:
                                        // 2 sources

                                        var6_6.E();
                                        var5_5 = Unit.a;
lbl655:
                                        // 2 sources

                                        while (true) {
                                            var28_28 = var29_29;
                                            var29_29 = var6_6;
                                            break block146;
                                            break;
                                        }
                                    }
                                    case -1584289601: {
                                        var29_29 = var5_5;
                                        var2_2 = var22_22;
                                        var6_6 = var13_13;
                                        var5_5 = "BRAND_COVER";
                                        var81_180 = (int)var10_10 /* !! */ .equals(var5_5);
                                        if (var81_180 == 0) {
                                            var28_28 = var29_29;
lbl667:
                                            // 2 sources

                                            while (true) {
                                                var29_29 = var6_6;
                                                break block0;
                                                break;
                                            }
                                        }
                                        var81_180 = -1159191018;
                                        var82_186 = -0.0017711546f;
                                        var13_13.K(var81_180);
                                        var5_5 = var22_22.getSubcomponents();
                                        if (var5_5 != null && (var5_5 = (Subcomponent)CollectionsKt.firstOrNull((List)var5_5)) != null) {
                                            var31_31 = var5_5.getResourceOwner();
                                        } else {
                                            var34_48 = false;
                                            var35_53 = 0.0f;
                                            var31_31 = null;
                                        }
                                        var28_28.element = var31_31;
                                        var5_5 = var27_27;
                                        var5_5 = (c80)var27_27;
                                        var31_31 = var29_29.h;
                                        var25_25 = var29_29.d;
                                        var27_27 = var29_29.g;
                                        var28_28 = var29_29.j;
                                        var38_63 = var26_26;
                                        var83_193 = var31_31;
                                        var45_82 = var5_5;
                                        var46_87 = var2_2;
                                        var84_198 = var28_28;
                                        var26_26 = new ac_1((Activity)var31_31, (dr0_0)var25_25, (Ref$ObjectRef)var27_27, (c80)var5_5, (Component)var2_2, (yp0_0)var28_28);
                                        var27_27 = var29_29.k;
                                        var22_22 = new rc_2((Activity)var31_31, (dr0_0)var25_25, (yT1)var27_27);
                                        var31_31 = var29_29.l;
                                        var27_27 = var29_29.m;
                                        var38_63 = var21_21;
                                        var83_193 = var25_25;
                                        var45_82 = var28_28;
                                        var46_87 = var31_31;
                                        var84_198 = var27_27;
                                        var21_21 = new sc_1((dr0_0)var25_25, (Component)var2_2, (c80)var5_5, (yp0_0)var28_28, (String)var31_31, (String)var27_27);
                                        var40_74 = 576;
                                        var14_14 = var29_29.c;
                                        var16_16 = var2_2;
                                        var13_13 = var6_6;
                                        lB.b((ft1_2)var14_14, (Component)var2_2, (dr0_0)var25_25, (ac_1)var26_26, (rc_2)var22_22, (sc_1)var21_21, (b30_0)var6_6, var40_74);
                                        var6_6.E();
                                        var5_5 = Unit.a;
                                        ** continue;
                                    }
                                    case -1586353347: {
                                        var2_2 = var22_22;
                                        var6_6 = var13_13;
                                        var27_27 = "INSERT_BANNER-CAROUSEL_DEFAULT";
                                        var85_200 = var10_10 /* !! */ .equals(var27_27);
                                        if (var85_200 == 0) {
                                            var28_28 = var5_5;
                                            ** continue;
                                        }
                                        var85_200 = -1148729293;
                                        var86_203 = -0.0041437387f;
                                        var13_13.K(var85_200);
                                        var27_27 = h40_0.a;
                                        var27_27 = h40_0.w();
                                        var37_60 = uq0_0.o;
                                        x20_0.b(var37_60, (b30_0)var13_13);
                                        var31_31.getClass();
                                        var9_9 = var22_22;
                                        Intrinsics.checkNotNullParameter(var22_22, "component");
                                        var14_14 = new ArrayList();
                                        var36_57 = hv3_0.F();
                                        var18_18 = 2.2E-44f;
                                        var17_17 = mz3_0.d(16);
                                        var67_140 = 2.8E-45f;
                                        var25_25 = hv3_0.a;
                                        var25_25.getClass();
                                        var39_70 = hv3_0.E();
                                        var10_10 /* !! */  = new ScreenInfo(var36_57 -= (var17_17 *= 2), var39_70);
                                        var28_28 = var22_22.getSubcomponents();
                                        if (var28_28 == null) ** GOTO lbl910
                                        var28_28 = var28_28.listIterator();
                                        var39_70 = 0;
                                        var67_140 = 0.0f;
                                        var25_25 = null;
                                        while (true) {
                                            var26_26 = var28_28;
                                            var26_26 = (ob3_2)var28_28;
                                            var23_23 = var26_26.hasNext();
                                            if (var23_23 == 0) ** GOTO lbl910
                                            var26_26 = var26_26.next();
                                            var23_23 = 1;
                                            var72_164 = var39_70 + 1;
                                            if (var39_70 < 0) break;
                                            if ((var26_26 = (Subcomponent)var26_26) != null) {
                                                var30_30 = var13_13;
                                                var87_205 = null;
                                                var49_92 = false;
                                                var88_206 = null;
                                                var50_94 = false;
                                                var89_207 = null;
                                                var51_96 = null;
                                                var53_100 = null;
                                                var52_98 = null;
                                                var55_104 = null;
                                                var54_102 = null;
                                                var58_109 = null;
                                                var90_208 = -1 >>> 4;
                                                var13_13 = new Banner(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var90_208, null);
                                                var38_64 = var26_26.getMedia();
                                                if (var38_64 != null) {
                                                    var22_22 = var38_64 = var38_64.getUrl();
                                                } else {
                                                    var23_23 = 0;
                                                    var22_22 = null;
                                                }
                                                var13_13.setBannerUrl((String)var22_22);
                                                var22_22 = az3_0.a;
                                                var22_22 = var26_26.getMedia();
                                                if (var22_22 != null && (var22_22 = var22_22.getMetadata()) != null) {
                                                    var22_22 = var22_22.getWidth();
                                                } else {
                                                    var23_23 = 0;
                                                    var22_22 = null;
                                                }
                                                var38_64 = var26_26.getMedia();
                                                if (var38_64 != null && (var38_64 = var38_64.getMetadata()) != null) {
                                                    var38_64 = var38_64.getHeight();
                                                    var1_1 /* !! */  = var28_28;
                                                    var28_28 = var38_64;
                                                } else {
                                                    var1_1 /* !! */  = var28_28;
                                                    var36_57 = 0;
                                                    var37_60 = 0.0f;
                                                    var28_28 = null;
                                                }
                                                var28_28 = az3_0.d((Double)var22_22, (Double)var28_28, (BaseValue)var27_27);
                                                var22_22 = var28_28.getHeight();
                                                var13_13.setHeight((Double)var22_22);
                                                var91_209 = var28_28.getWidth();
                                                var28_28 = var91_209;
                                                var13_13.setWidth((Double)var28_28);
                                                var28_28 = var26_26.getHotspots();
                                                if (var28_28 != null) {
                                                    var28_28 = (Iterable)var28_28;
                                                    var23_23 = yx_2.o((Iterable)var28_28, 10);
                                                    var26_26 = new ArrayList(var23_23);
                                                    var28_28 = var28_28.iterator();
                                                    while ((var23_23 = (int)var28_28.hasNext()) != 0) {
                                                        var22_22 = (com.ril.ajio.services.data.fleek.feedModel.Hotspot)var28_28.next();
                                                        var2_2 = var28_28;
                                                        if (var22_22 != null && (var38_64 = var22_22.getMetaData()) != null) {
                                                            var38_64 = var38_64.getEvent();
                                                            var4_4 = var6_6;
                                                            var93_210 = var72_164;
                                                            var21_21 = var38_64;
                                                            var81_181 = 2;
                                                            var82_187 = 2.8E-45f;
                                                            var32_34 = false;
                                                            var33_41 = 0.0f;
                                                            var6_6 = null;
                                                        } else {
                                                            var4_4 = var6_6;
                                                            var93_210 = var72_164;
                                                            var81_181 = 2;
                                                            var82_187 = 2.8E-45f;
                                                            var32_34 = false;
                                                            var33_41 = 0.0f;
                                                            var6_6 = null;
                                                            var72_164 = 0;
                                                            var21_21 = null;
                                                        }
                                                        var28_28 = new HotSpotMetaData((String)var21_21, null, var81_181, null);
                                                        var5_5 = az3_0.a;
                                                        if (var22_22 != null) {
                                                            var5_5 = var22_22.getWidth();
                                                        } else {
                                                            var81_181 = 0;
                                                            var82_187 = 0.0f;
                                                            var5_5 = null;
                                                        }
                                                        if (var22_22 != null) {
                                                            var6_6 = var22_22.getHeight();
                                                        } else {
                                                            var32_34 = false;
                                                            var33_41 = 0.0f;
                                                            var6_6 = null;
                                                        }
                                                        var5_5 = az3_0.d((Double)var5_5, (Double)var6_6, (BaseValue)var27_27);
                                                        var87_205 = var22_22 != null ? (var21_21 = var22_22.getType()) : null;
                                                        var91_209 = var5_5.getHeight();
                                                        var88_206 = var91_209;
                                                        if (var22_22 != null) {
                                                            var89_207 = var21_21 = var22_22.getHotspotUrl();
                                                        } else {
                                                            var50_94 = false;
                                                            var89_207 = null;
                                                        }
                                                        var91_209 = var5_5.getWidth();
                                                        var51_96 = var91_209;
                                                        if (var22_22 != null) {
                                                            var5_5 = var22_22.getX();
                                                            var53_100 = var5_5;
                                                        } else {
                                                            var53_100 = null;
                                                        }
                                                        if (var22_22 != null) {
                                                            var5_5 = var22_22.getY();
                                                            var52_98 = var5_5;
                                                        } else {
                                                            var52_98 = null;
                                                        }
                                                        if (var22_22 != null) {
                                                            var5_5 = var22_22.getQuery();
                                                            var55_104 = var5_5;
                                                        } else {
                                                            var55_104 = null;
                                                        }
                                                        var30_30 = var6_6;
                                                        var54_102 = var28_28;
                                                        var6_6 = new Hotspot((String)var87_205, var88_206, (String)var89_207, var51_96, (Double)var53_100, (Double)var52_98, (String)var55_104, (HotSpotMetaData)var28_28);
                                                        var26_26.add(var6_6);
                                                        var5_5 = this;
                                                        var28_28 = var2_2;
                                                        var72_164 = var93_210;
                                                        var6_6 = var4_4;
                                                    }
                                                    var4_4 = var6_6;
                                                    var93_210 = var72_164;
                                                } else {
                                                    var4_4 = var6_6;
                                                    var93_210 = var72_164;
                                                    var70_154 = false;
                                                    var71_160 = 0.0f;
                                                    var26_26 = null;
                                                }
                                                var13_13.setHotspots((List)var26_26);
                                                var5_5 = var13_13.getWidth();
                                                var94_211 = 0L;
                                                var96_213 = 0.0;
                                                var98_214 = var5_5 != null ? var5_5.doubleValue() : var96_213;
                                                var36_57 = (int)(var98_214 == var96_213 ? 0 : (var98_214 > var96_213 ? 1 : -1));
                                                if (var36_57 > 0 && (var36_57 = (int)((cfr_temp_0 = (var98_214 = (var5_5 = var13_13.getHeight()) != null ? var5_5.doubleValue() : var96_213) - var96_213) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1))) > 0) {
                                                    var5_5 = new BannerData$Builder();
                                                    var5_5 = var5_5.build((Banner)var13_13, (ScreenInfo)var10_10 /* !! */ , (BaseValue)var27_27, var39_70);
                                                    var14_14.add(var5_5);
                                                }
                                            } else {
                                                var4_4 = var6_6;
                                                var1_1 /* !! */  = var28_28;
                                                var93_210 = var72_164;
                                            }
                                            var5_5 = this;
                                            var28_28 = var1_1 /* !! */ ;
                                            var39_70 = var93_210;
                                            var6_6 = var4_4;
                                        }
                                        xx_2.n();
                                        throw null;
lbl910:
                                        // 2 sources

                                        var4_4 = var6_6;
                                        var25_25 = new CC((Activity)var29_29, (ArrayList)var14_14, (String)var16_16, var12_12);
                                        var5_5 = new ec_0(var12_12, (String)var16_16, (ArrayList)var14_14);
                                        var26_26 = new fc_1((Component)var9_9, (String)var16_16, var12_12, (dr0_0)var31_31);
                                        var62_118 = 8;
                                        var63_123 = 1.1E-44f;
                                        var73_167 = 240;
                                        var74_170 = 3.36E-43f;
                                        var23_23 = 0;
                                        var22_22 = null;
                                        var72_164 = 0;
                                        var21_21 = null;
                                        var68_144 = false;
                                        var69_149 = 0.0f;
                                        var13_13 = null;
                                        var40_75 = false;
                                        var38_64 = null;
                                        var16_16 = var5_5;
                                        var83_194 = var6_6;
                                        jv_1.b((ArrayList)var14_14, (Function1)var5_5, (g71_0)var25_25, (Function1)var26_26, false, 0.0f, false, 0.0f, (b30_0)var6_6, var62_118, var73_167);
                                        var6_6.E();
                                        var5_5 = Unit.a;
                                        var28_28 = this;
                                        var29_29 = var6_6;
                                        break block146;
                                    }
                                    case -1860977241: {
                                        var28_28 = var25_25;
                                        var5_5 = var26_26;
                                        var9_9 = var22_22;
                                        var4_4 = var13_13;
                                        var6_6 = "PRODUCTS_WITH_HORIZONTAL_LAYOUT";
                                        var32_35 = var10_10 /* !! */ .equals(var6_6);
                                        if (var32_35 == 0) {
                                            var28_28 = this;
                                            var29_29 = var13_13;
                                            break;
                                        }
                                        var32_35 = -1154825288;
                                        var29_29 = var13_13;
                                        var13_13.K(var32_35);
                                        var33_42 = uq0_0.o;
                                        var18_18 = uq0_0.h;
                                        var100_215 = uq0_0.s;
                                        var10_10 /* !! */  = androidx.compose.foundation.layout.h.h((LP1)var26_26, var33_42, var18_18, var33_42, var100_215);
                                        var11_11 = zp.c;
                                        var15_15 = 0;
                                        var24_24 = 0.0f;
                                        var28_28 = oZ.a((zp$l)var11_11, (Gx$a)var25_25, (b30_0)var13_13, 0);
                                        var12_12 = var13_13.F();
                                        var14_14 = var13_13.m();
                                        var10_10 /* !! */  = a30_0.c((b30_0)var13_13, (LP1)var10_10 /* !! */ );
                                        N20.W.getClass();
                                        var25_25 = N20$a.b;
                                        var26_26 = var13_13.i();
                                        var70_155 = var26_26 instanceof mp;
                                        if (!var70_155) ** GOTO lbl1065
                                        var13_13.A();
                                        var70_155 = var13_13.e();
                                        if (var70_155) {
                                            var13_13.C((Function0)var25_25);
                                        } else {
                                            var13_13.n();
                                        }
                                        var25_25 = N20$a.e;
                                        Ow3.a((b30_0)var29_29, var28_28, (Function2)var25_25);
                                        var28_28 = N20$a.d;
                                        Ow3.a((b30_0)var29_29, var14_14, (Function2)var28_28);
                                        var28_28 = N20$a.f;
                                        var15_15 = (int)var29_29.e();
                                        if (var15_15 != 0 || (var15_15 = (int)Intrinsics.areEqual(var14_14 = var29_29.v(), var25_25 = Integer.valueOf(var12_12))) == 0) {
                                            re0_0.a(var12_12, (b30_0)var29_29, var12_12, (N20$a$a)var28_28);
                                        }
                                        var28_28 = N20$a.c;
                                        Ow3.a((b30_0)var29_29, var10_10 /* !! */ , (Function2)var28_28);
                                        var61_114 = 0;
                                        var83_195 = null;
                                        var66_136 = 11;
                                        var62_119 = 0;
                                        var63_124 = 0.0f;
                                        var64_128 = 0;
                                        var65_132 = 0.0f;
                                        var45_83 = null;
                                        var38_65 = var5_5;
                                        var74_171 = var33_42;
                                        var14_14 = androidx.compose.foundation.layout.h.i((LP1)var5_5, 0.0f, 0.0f, var33_42, 0.0f, var66_136);
                                        var5_5 = var9_9.getHeading();
                                        if (var5_5 == null) {
                                            var5_5 = var30_30;
                                        }
                                        var56_106 = oj3_2.i;
                                        var59_111 = nz_1.j;
                                        var38_65 = y20_0.b;
                                        var13_13 = tv0_0.e;
                                        var64_128 = 224646;
                                        var65_132 = 3.14796E-40f;
                                        var66_136 = 128;
                                        var61_114 = 1;
                                        var62_119 = 0;
                                        var63_124 = 0.0f;
                                        var6_6 = var16_16;
                                        var16_16 = var5_5;
                                        ov3.j((LP1)var14_14, (String)var5_5, var56_106, var59_111, (tv0_0)var13_13, (RU0)var38_65, var61_114, null, (b30_0)var29_29, var64_128, var66_136);
                                        var5_5 = var9_9.getSubcomponents();
                                        if (var5_5 != null) {
                                            var5_5 = (Subcomponent)CollectionsKt.firstOrNull((List)var5_5);
                                        } else {
                                            var81_182 = false;
                                            var82_188 = 0.0f;
                                            var5_5 = null;
                                        }
                                        var36_58 = 1955238357;
                                        var37_61 = 8.782895E31f;
                                        var29_29.K(var36_58);
                                        if (var5_5 == null) {
                                            var28_28 = this;
                                        } else {
                                            var28_28 = var9_9.getSubcomponents();
                                            var10_10 /* !! */  = var9_9.getSubcomponents();
                                            if (var10_10 /* !! */  != null) {
                                                var17_17 = var10_10 /* !! */ .size();
                                            } else {
                                                var17_17 = 0;
                                                var18_18 = 0.0f;
                                                var10_10 /* !! */  = null;
                                            }
                                            var31_31.getClass();
                                            var16_16 = dr0_0.d((p83_0)var28_28, var17_17);
                                            var5_5 = var5_5.getCta();
                                            if (var5_5 != null) {
                                                var14_14 = var5_5 = var5_5.getText();
                                            } else {
                                                var15_15 = 0;
                                                var24_24 = 0.0f;
                                                var14_14 = null;
                                            }
                                            var27_27 = (c80)var27_27;
                                            var28_28 = this;
                                            var5_5 = this.h;
                                            var10_10 /* !! */  = this.j;
                                            var38_65 = var26_26;
                                            var83_195 = var5_5;
                                            var45_83 = var10_10 /* !! */ ;
                                            var46_88 = var9_9;
                                            var26_26 = new tc_2((Activity)var5_5, (dr0_0)var31_31, (c80)var27_27, (yp0_0)var10_10 /* !! */ , (Component)var9_9);
                                            var22_22 = new Object();
                                            var21_21 = new cc_2((Activity)var5_5, (dr0_0)var31_31, (c80)var27_27, (yp0_0)var10_10 /* !! */ );
                                            var13_13 = new dc_1((dr0_0)var31_31, (String)var6_6, (Component)var9_9);
                                            var39_71 = true;
                                            var67_141 = 1.4E-45f;
                                            var62_119 = 16802240;
                                            var63_124 = 2.358002E-38f;
                                            var38_65 = var31_31;
                                            var83_195 = var29_29;
                                            xA2.b((String)var14_14, (List)var16_16, var39_71, (Function1)var26_26, (Function2)var22_22, (Function2)var21_21, (Function1)var13_13, (dr0_0)var31_31, (b30_0)var29_29, var62_119);
                                            var5_5 = Unit.a;
                                        }
                                        var29_29.E();
                                        var29_29.p();
                                        var29_29.E();
                                        var5_5 = Unit.a;
                                        break block146;
lbl1065:
                                        // 1 sources

                                        var28_28 = this;
                                        s20.a();
                                        throw null;
                                    }
                                    case -2096310552: {
                                        var28_28 = var5_5;
                                        var5_5 = var26_26;
                                        var101_218 = var22_22;
                                        var9_9 = var21_21;
                                        var29_29 = var13_13;
                                        var6_6 = "INSERT_BRAND-CAROUSEL_MEDIA-ONLY";
                                        var32_36 = var10_10 /* !! */ .equals(var6_6);
                                        if (var32_36 == 0) break;
                                        var32_36 = -1422280088;
                                        var33_43 = -6.5983894E-13f;
                                        var13_13.K(var32_36);
                                        var6_6 = var22_22.getSubcomponents();
                                        if (var6_6 != null) {
                                            var6_6 = (Subcomponent)CollectionsKt.firstOrNull((List)var6_6);
                                        } else {
                                            var32_36 = 0;
                                            var33_43 = 0.0f;
                                            var6_6 = null;
                                        }
                                        if (var6_6 != null) {
                                            var34_49 = -1422274898;
                                            var35_54 = -6.601203E-13f;
                                            var29_29.K(var34_49);
                                            var31_31 = var6_6.getMedia();
                                            if (var31_31 != null) {
                                                var31_31 = var31_31.getUrl();
                                            } else {
                                                var34_49 = 0;
                                                var35_54 = 0.0f;
                                                var31_31 = null;
                                            }
                                            if (var31_31 != null && (var34_49 = var31_31.length()) != 0) {
                                                var31_31 = h40_0.a;
                                                var31_31 = h40_0.w();
                                                var85_201 = hv3_0.F();
                                                var18_18 = uq0_0.o;
                                                var100_216 = x20_0.b(var18_18, (b30_0)var29_29);
                                                var12_12 = (int)var100_216;
                                                hv3_0.a.getClass();
                                                var15_15 = hv3_0.E();
                                                var11_11 = new ScreenInfo(var85_201 -= var12_12, var15_15);
                                                var14_14 = az3_0.a;
                                                var14_14 = var6_6.getMedia();
                                                if (var14_14 != null && (var14_14 = var14_14.getMetadata()) != null) {
                                                    var14_14 = var14_14.getWidth();
                                                } else {
                                                    var15_15 = 0;
                                                    var24_24 = 0.0f;
                                                    var14_14 = null;
                                                }
                                                var16_16 = var6_6.getMedia();
                                                if (var16_16 != null && (var16_16 = var16_16.getMetadata()) != null) {
                                                    var16_16 = var16_16.getHeight();
                                                } else {
                                                    var19_19 = 0;
                                                    var20_20 = 0.0f;
                                                    var16_16 = null;
                                                }
                                                var25_25 = "PIXEL";
                                                var31_31 = az3_0.c((String)var25_25, (Double)var14_14, (Double)var16_16, (BaseValue)var31_31, (ScreenInfo)var11_11);
                                                var100_216 = var31_31.getHeight();
                                                var15_15 = 0;
                                                var24_24 = 0.0f;
                                                var14_14 = null;
                                                cfr_temp_1 = var100_216 - 0.0f;
                                                var12_12 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                                if (var12_12 > 0) {
                                                    var12_12 = var31_31.getWidth();
                                                    var100_216 = var12_12;
                                                    var34_49 = var31_31.getHeight();
                                                    var35_54 = var34_49;
                                                    var100_216 /= var35_54;
                                                } else {
                                                    var12_12 = 1071877689;
                                                    var100_216 = 1.7777778f;
                                                }
                                                var70_156 = (int)((float)var85_201 / var100_216);
                                                var5_5 = androidx.compose.foundation.layout.j.c((LP1)var5_5, 1.0f);
                                                var34_49 = 2;
                                                var5_5 = androidx.compose.foundation.layout.h.g((LP1)var5_5, var18_18, 0.0f, var34_49);
                                                var35_54 = x20_0.e((b30_0)var29_29, var70_156);
                                                var5_5 = androidx.compose.foundation.layout.j.d((LP1)var5_5, var35_54);
                                                var102_220 = nz_1.l;
                                                var16_16 = androidx.compose.foundation.a.b((LP1)var5_5, var102_220, (i13)var9_9);
                                                var5_5 = var6_6.getMedia();
                                                var25_25 = var5_5 != null && (var5_5 = var5_5.getUrl()) != null ? var5_5 : var30_30;
                                                var68_145 = 24576;
                                                var69_150 = 3.4438E-41f;
                                                var40_76 = false;
                                                var38_66 = null;
                                                var14_14 = var28_28.c;
                                                var23_23 = 1;
                                                var21_21 = var29_29;
                                                cc3_1.b((ft1_2)var14_14, (LP1)var16_16, (String)var25_25, var70_156, (boolean)var23_23, (b30_0)var29_29, var68_145, 0);
                                            }
                                            var29_29.E();
                                        }
                                        var29_29.E();
                                        var5_5 = Unit.a;
                                        break block146;
                                    }
                                }
                                var81_180 = -1127431084;
                                var82_189 = -0.02499596f;
                                var29_29.K(var81_180);
                                var29_29.E();
                                var5_5 = Unit.a;
                            }
                            var29_29.E();
                            var9_9 = var28_28;
                            break block148;
                        }
                        var9_9 = var5_5;
                        var16_16 = var25_25;
                        var5_5 = var26_26;
                        var101_219 = var22_22;
                        var25_25 = "POST";
                        var15_15 = (int)Intrinsics.areEqual(var14_14, var25_25);
                        if (var15_15 == 0) break block150;
                        var15_15 = -1126907184;
                        var24_24 = -0.0259718f;
                        var13_13.K(var15_15);
                        var14_14 = var22_22.getTemplate();
                        var25_25 = "STORIES";
                        var39_72 = Intrinsics.areEqual(var14_14, var25_25);
                        if (!var39_72) break block151;
                        var15_15 = -1127015312;
                        var24_24 = -0.025770396f;
                        var13_13.K(var15_15);
                        var14_14 = var22_22.getSubcomponents();
                        var16_16 = var9_9.f.c;
                        var28_28 = (ResourceOwner)var28_28.element;
                        var31_31.getClass();
                        var28_28 = dr0_0.f((p83_0)var14_14, (ArrayList)var16_16, (ResourceOwner)var28_28);
                        var22_22 = new ArrayList();
                        var28_28 = var28_28.listIterator();
                        while (true) {
                            var14_14 = var28_28;
                            var14_14 = (ob3_2)var28_28;
                            var19_19 = (int)var14_14.hasNext();
                            if (var19_19 == 0) break;
                            var14_14 = var14_14.next();
                            var16_16 = var14_14;
                            var16_16 = (Subcomponent)var14_14;
                            if (var16_16 != null) {
                                var16_16 = var16_16.isPinned();
                                var25_25 = Boolean.FALSE;
                                var19_19 = (int)Intrinsics.areEqual(var16_16, var25_25);
                            } else {
                                var19_19 = 0;
                                var20_20 = 0.0f;
                                var16_16 = null;
                            }
                            if (var19_19 == 0) continue;
                            var22_22.add(var14_14);
                        }
                        var28_28 = var101_219.getSubcomponents();
                        var16_16 = var28_28 != null && (var28_28 = (Subcomponent)CollectionsKt.firstOrNull((List)var28_28)) != null && (var28_28 = var28_28.getUuid()) != null ? var28_28 : var30_30;
                        var25_25 = new p83_0();
                        CollectionsKt.h0(var22_22, (Collection)var25_25);
                        var27_27 = (c80)var27_27;
                        var28_28 = new mc_2((c80)var27_27, var12_12, (dr0_0)var31_31);
                        var86_204 = uq0_0.j;
                        var62_120 = false;
                        var74_172 = 0.0f;
                        var38_67 = var5_5;
                        var84_199 = androidx.compose.foundation.layout.h.i((LP1)var5_5, var86_204, 0.0f, 0.0f, 0.0f, 14);
                        var61_115 = false;
                        var66_137 = 13;
                        var63_125 = var86_204;
                        var38_67 = androidx.compose.foundation.layout.h.i((LP1)var5_5, 0.0f, var86_204, 0.0f, 0.0f, var66_137);
                        var85_202 = var17_17 << 9 & 57344;
                        var17_17 = 148376584;
                        var18_18 = 1.3002856E-33f;
                        var73_168 = var85_202 | var17_17;
                        var14_14 = var9_9.f;
                        var64_129 = 0;
                        var65_133 = 0.0f;
                        var45_84 = null;
                        var70_157 = 1;
                        var71_161 = 1.4E-45f;
                        var27_27 = var9_9.d;
                        var10_10 /* !! */  = var22_22;
                        var23_23 = var12_12;
                        var11_11 = var21_21;
                        var21_21 = var28_28;
                        var28_28 = var13_13;
                        var13_13 = var84_199;
                        var83_196 = var27_27;
                        yd3_2.b((f23_0)var14_14, (String)var16_16, (p83_0)var25_25, (boolean)var70_157, var12_12, (Function2)var21_21, var84_199, (LP1)var38_67, (dr0_0)var27_27, (b30_0)var28_28, var73_168, 0);
                        var86_204 = 1.0f;
                        var14_14 = androidx.compose.foundation.layout.j.c((LP1)var5_5, var86_204);
                        var85_202 = (int)var22_22.isEmpty();
                        var10_10 /* !! */  = new Object();
                        Intrinsics.checkNotNullParameter(var14_14, (String)var6_6);
                        var6_6 = "ifTrue";
                        Intrinsics.checkNotNullParameter(var10_10 /* !! */ , (String)var6_6);
                        if (var85_202 != 0) {
                            var6_6 = (LP1)var10_10 /* !! */ .invoke(var5_5);
                            var6_6 = var14_14.then((LP1)var6_6);
lbl1262:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        Intrinsics.checkNotNullParameter(var5_5, "$this$conditional");
                        var63_125 = uq0_0.r;
                        var65_133 = uq0_0.s;
                        var61_115 = false;
                        var83_196 = null;
                        var73_168 = 0;
                        var74_172 = 0.0f;
                        var66_137 = 5;
                        var38_67 = var5_5;
                        var6_6 = androidx.compose.foundation.layout.h.i((LP1)var5_5, 0.0f, var63_125, 0.0f, var65_133, var66_137);
                        var6_6 = var14_14.then((LP1)var6_6);
                        ** while (true)
                        var14_14 = var6_6;
                        var78_177 = OX.f;
                        var32_37 = 1045220557;
                        var33_44 = 0.2f;
                        var78_177 = OX.b(var78_177, var33_44);
                        var71_161 = uq0_0.b;
                        var23_23 = 0;
                        var22_22 = null;
                        var68_146 = 432;
                        var69_151 = 6.05E-43f;
                        var40_77 = 8;
                        var21_21 = var28_28;
                        Rr0.a((LP1)var6_6, var78_177, var71_161, 0.0f, (b30_0)var28_28, var68_146, var40_77);
                        var6_6 = (BrandPageModel)var9_9.g.element;
                        if (var6_6 != null && (var6_6 = var6_6.getLayout()) != null) {
                            var6_6 = var6_6.getSearchEnabled();
                            var27_27 = Boolean.TRUE;
                            var32_37 = (int)Intrinsics.areEqual(var6_6, var27_27);
                        } else {
                            var32_37 = 0;
                            var33_44 = 0.0f;
                            var6_6 = null;
                        }
                        if (var32_37 != 0) {
                            var6_6 = dr0_0.q((List)var11_11);
                            var85_202 = 1065353216;
                            var10_10 /* !! */  = androidx.compose.foundation.layout.j.c((LP1)var5_5, 1.0f);
                            var20_20 = uq0_0.o;
                            var39_72 = false;
                            var25_25 = null;
                            var70_157 = 10;
                            var71_161 = 1.4E-44f;
                            var15_15 = 0;
                            var24_24 = 0.0f;
                            var100_217 = var20_20;
                            var5_5 = androidx.compose.foundation.layout.h.i((LP1)var10_10 /* !! */ , var20_20, 0.0f, var20_20, 0.0f, var70_157);
                            var86_204 = uq0_0.x;
                            var5_5 = androidx.compose.foundation.layout.j.d((LP1)var5_5, var86_204);
                            var10_10 /* !! */  = var9_9.o;
                            var12_12 = 0;
                            var100_217 = 0.0f;
                            var11_11 = null;
                            var27_27 = new oc_1(0, var10_10 /* !! */ , var31_31);
                            var5_5 = androidx.compose.ui.layout.c.a((LP1)var5_5, (Function1)var27_27);
                            var27_27 = new pc_2((dr0_0)var31_31, (Activity)var29_29, (Component)var6_6);
                            var14_14 = x20_0.d((LP1)var5_5, (Function0)var27_27);
                            var5_5 = dr0_0.y((Component)var6_6);
                            var6_6 = "Search in ";
                            var16_16 = kp1_0.c((String)var6_6, (String)var5_5);
                            var94_212 = oj3_2.b;
                            var67_142 = uq0_0.e;
                            var72_165 = false;
                            var21_21 = null;
                            var64_129 = 3456;
                            var65_133 = 4.843E-42f;
                            var104_221 = 0L;
                            var106_222 = 0L;
                            ov3.t((LP1)var14_14, (String)var16_16, var67_142, var94_212, 0.0f, var104_221, var106_222, (b30_0)var28_28, var64_129);
                        }
                        var28_28.E();
                        break block152;
                    }
                    var28_28 = var13_13;
                    var6_6 = "NEW_POSTS";
                    var32_38 = Intrinsics.areEqual(var14_14, var6_6);
                    if (var32_38 == 0) ** GOTO lbl1439
                    var32_38 = -1421610803;
                    var33_45 = -6.9612095E-13f;
                    var13_13.K(var32_38);
                    var6_6 = var22_22.getSubcomponents();
                    if (var6_6 == null) ** GOTO lbl1435
                    var34_50 = 1065353216;
                    var35_55 = 1.0f;
                    var25_25 = androidx.compose.foundation.layout.j.c((LP1)var26_26, var35_55);
                    var74_173 = uq0_0.o;
                    var68_147 = 0;
                    var69_152 = 0.0f;
                    var13_13 = null;
                    var40_78 = 10;
                    var23_23 = 0;
                    var22_22 = null;
                    var71_162 = var74_173;
                    var31_31 = androidx.compose.foundation.layout.h.i((LP1)var25_25, var74_173, 0.0f, var74_173, 0.0f, var40_78);
                    var29_29 = zp.c;
                    var24_24 = 0.0f;
                    var14_14 = null;
                    var29_29 = oZ.a((zp$l)var29_29, (Gx$a)var16_16, (b30_0)var28_28, 0);
                    var15_15 = var28_28.F();
                    var16_16 = var28_28.m();
                    var31_31 = a30_0.c((b30_0)var28_28, (LP1)var31_31);
                    N20.W.getClass();
                    var25_25 = N20$a.b;
                    var26_26 = var28_28.i();
                    var70_158 = var26_26 instanceof mp;
                    if (var70_158) {
                        var28_28.A();
                        var70_158 = var28_28.e();
                        if (var70_158) {
                            var28_28.C((Function0)var25_25);
                        } else {
                            var28_28.n();
                        }
                        var25_25 = N20$a.e;
                        Ow3.a((b30_0)var28_28, var29_29, (Function2)var25_25);
                        var29_29 = N20$a.d;
                        Ow3.a((b30_0)var28_28, var16_16, (Function2)var29_29);
                        var29_29 = N20$a.f;
                        var19_19 = (int)var28_28.e();
                        if (var19_19 != 0 || (var19_19 = (int)Intrinsics.areEqual(var16_16 = var28_28.v(), var25_25 = Integer.valueOf(var15_15))) == 0) {
                            re0_0.a(var15_15, (b30_0)var28_28, var15_15, (N20$a$a)var29_29);
                        }
                        var29_29 = N20$a.c;
                        Ow3.a((b30_0)var28_28, var31_31, (Function2)var29_29);
                        var61_116 = 0;
                        var83_197 = null;
                        var66_138 = 11;
                        var62_121 = false;
                        var63_126 = 0.0f;
                        var64_130 = 0;
                        var65_134 = 0.0f;
                        var45_85 = null;
                        var38_68 = var5_5;
                        var14_14 = androidx.compose.foundation.layout.h.i((LP1)var5_5, 0.0f, 0.0f, var74_173, 0.0f, var66_138);
                        var5_5 = var101_219.getHeading();
                        var16_16 = var5_5 == null ? var30_30 : var5_5;
                        var56_107 = oj3_2.i;
                        var59_112 = nz_1.j;
                        var38_68 = y20_0.b;
                        var13_13 = tv0_0.e;
                        var64_130 = 224646;
                        var65_134 = 3.14796E-40f;
                        var66_138 = 128;
                        var61_116 = 1;
                        var62_121 = false;
                        var63_126 = 0.0f;
                        ov3.j((LP1)var14_14, (String)var16_16, var56_107, var59_112, (tv0_0)var13_13, (RU0)var38_68, var61_116, null, (b30_0)var28_28, var64_130, var66_138);
                        var26_26 = var27_27;
                        var26_26 = (c80)var27_27;
                        var31_31 = var9_9.h;
                        var22_22 = var9_9.d;
                        var27_27 = var9_9.a;
                        var29_29 = var9_9.j;
                        var13_13 = var9_9.l;
                        var14_14 = var5_5;
                        var16_16 = var31_31;
                        var25_25 = var101_219;
                        var21_21 = var27_27;
                        var68_147 = var12_12;
                        var38_68 = var29_29;
                        var83_197 = var6_6;
                        var5_5 = new qc_1((Activity)var31_31, (Component)var101_219, (c80)var26_26, (dr0_0)var22_22, (p83_0)var27_27, var12_12, (yp0_0)var29_29, (p83_0)var6_6, (String)var13_13);
                        var21_21 = new v9_0(var31_31);
                        var40_78 = var17_17 & 112;
                        var25_25 = var9_9.c;
                        var14_14 = var27_27;
                        var19_19 = var12_12;
                        var26_26 = var6_6;
                        var22_22 = var5_5;
                        var13_13 = var28_28;
                        WB.c((p83_0)var27_27, var12_12, (ft1_2)var25_25, (p83_0)var6_6, (qc_1)var5_5, (v9_0)var21_21, (b30_0)var28_28, var40_78);
                        var28_28.p();
                        var5_5 = Unit.a;
lbl1435:
                        // 2 sources

                        var28_28.E();
                    } else {
                        s20.a();
                        throw null;
lbl1439:
                        // 1 sources

                        var81_183 = -1113863500;
                        var82_190 = -0.07607022f;
                        var13_13.K(var81_183);
                        var13_13.E();
                    }
                }
                var28_28.E();
                break block148;
            }
            var28_28 = var13_13;
            var81_184 = -1113779180;
            var82_191 = -0.07669845f;
            var13_13.K(var81_184);
            var13_13.E();
        }
        return Unit.a;
    }
}

