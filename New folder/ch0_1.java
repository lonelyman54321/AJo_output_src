/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import com.ril.ajio.services.data.fleek.explore_brands.Hotspot;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from CH0
 */
public final class ch0_1
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ ExploreBrandsPageModel b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ yT1 f;

    public ch0_1(p83_0 p83_02, ExploreBrandsPageModel exploreBrandsPageModel, ft1_2 ft1_22, dr0_0 dr0_02, Activity activity, yT1 yT12) {
        this.a = p83_02;
        this.b = exploreBrandsPageModel;
        this.c = ft1_22;
        this.d = dr0_02;
        this.e = activity;
        this.f = yT12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block47: {
            var5_5 = this;
            var6_6 = 1;
            var7_7 = 0;
            var8_8 = null;
            var9_9 = var1_1;
            var9_9 = (wr1_2)var1_1;
            var10_10 = var2_2;
            var10_10 = (Number)var2_2;
            var11_11 = var10_10.intValue();
            var12_12 = var3_3;
            var12_12 = (b30_0)var3_3;
            var13_13 = var4_4;
            var13_13 = (Number)var4_4;
            var14_14 = var13_13.intValue();
            var15_15 = "$this$items";
            Intrinsics.checkNotNullParameter(var9_9, (String)var15_15);
            var16_16 = var14_14 & 112;
            var17_17 = 16;
            var18_18 = 32;
            var19_19 = 4.5E-44f;
            if (var16_16 == 0) {
                var16_16 = (int)var12_12.c(var11_11);
                var16_16 = var16_16 != 0 ? 32 : 16;
                var14_14 |= var16_16;
            }
            if ((var16_16 = var14_14 & 721) == (var20_20 = 144) && (var16_16 = (int)var12_12.h()) != 0) {
                var12_12.D();
lbl27:
                // 5 sources

                while (true) {
                    var21_21 = var5_5;
                    break block47;
                    break;
                }
            }
            var22_25 = var5_5.a;
            if (var22_25 != null) {
                var22_25 = (Component)var22_25.get(var11_11);
            } else {
                var20_20 = 0;
                var22_25 = null;
            }
            if (var22_25 != null && (var23_26 = var22_25.getType()) != null) {
                var23_26 = StringsKt.m0((CharSequence)var23_26).toString();
            } else {
                var24_27 = false;
                var23_26 = null;
            }
            if (!(var24_27 = Intrinsics.areEqual(var23_26, var25_28 = "INSERT"))) ** GOTO lbl27
            var23_26 = var22_25.getTemplate();
            if (var23_26 == null) ** GOTO lbl-1000
            var26_29 = var23_26.hashCode();
            var27_30 = var5_5.f;
            var28_31 /* !! */  = var5_5.e;
            var29_32 = var5_5.d;
            var30_33 = var5_5.b;
            switch (var26_29) lbl-1000:
            // 6 sources

            {
                default: lbl-1000:
                // 2 sources

                {
                    var21_21 = var5_5;
                    var5_5 = var12_12;
                    ** GOTO lbl-1000
                }
                case 1330665771: {
                    var21_21 = "INSERT_CATEGORY-CAROUSEL_DEFAULT";
                    var6_6 = var23_26.equals(var21_21);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = -1249981337;
                    var12_12.K(var6_6);
                    var15_15 = var30_33.getBaseValue();
                    var31_34 = new fh0_1((Component)var22_25, var11_11, var28_31 /* !! */ , (dr0_0)var29_32);
                    var21_21 = new gh0_1((Component)var22_25, var11_11, (dr0_0)var29_32);
                    var26_29 = 72;
                    var32_40 = 1.01E-43f;
                    var13_13 = var22_25;
                    var22_25 = var21_21;
                    var23_26 = var12_12;
                    tw2_1.a((Component)var13_13, (BaseValue)var15_15, var31_34, (gh0_1)var21_21, (b30_0)var12_12, var26_29);
                    var12_12.E();
                    ** GOTO lbl27
                }
                case 789733849: {
                    var9_9 = "INSERT_RESOURCE-LIST_DEFAULT";
                    var16_16 = (int)var23_26.equals(var9_9);
                    if (var16_16 == 0) ** GOTO lbl-1000
                    var12_12.K(-1246084761);
                    var15_15 = var30_33.getBaseValue();
                    var12_12.K(1760922245);
                    var16_16 = var14_14 & 112;
                    if (var16_16 != var18_18) {
                        var6_6 = 0;
                        var21_21 = null;
                    }
                    var8_8 = var12_12.v();
                    if (var6_6 != 0 || var8_8 == (var21_21 = b30$a.a)) {
                        var8_8 = new hh0_1(var11_11);
                        var12_12.o(var8_8);
                    }
                    var31_35 = var8_8;
                    var31_35 = (Function2)var8_8;
                    var12_12.E();
                    var21_21 = new ih0_0((dr0_0)var29_32, (yT1)var27_30);
                    var23_26 = new Object();
                    var25_28 = new Object((Component)var22_25, var11_11, (dr0_0)var29_32);
                    var33_42 = 24648;
                    var13_13 = var22_25;
                    var22_25 = var21_21;
                    var27_30 = var12_12;
                    iG0.d((Component)var13_13, (BaseValue)var15_15, (Function2)var31_35, (ih0_0)var21_21, (ch0_2)var23_26, (nh0_0)var25_28, (b30_0)var12_12, var33_42);
                    var12_12.E();
                    ** GOTO lbl27
                }
                case 503604013: {
                    var13_13 = "INSERT_SINGLE-BANNER_DEFAULT";
                    var14_14 = (int)var23_26.equals(var13_13);
                    if (var14_14 != 0) ** GOTO lbl132
                    ** GOTO lbl-1000
                }
                case -203968466: {
                    var21_21 = "INSERT_BRAND-CAROUSEL_DEFAULT";
                    var6_6 = var23_26.equals(var21_21);
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var6_6 = -1243018520;
                    var12_12.K(var6_6);
                    var31_36 = var30_33.getBaseValue();
                    var21_21 = new uh0_0((dr0_0)var29_32, var28_31 /* !! */ );
                    var23_26 = new vh0_1(var28_31 /* !! */ , (dr0_0)var29_32, (ExploreBrandsPageModel)var30_33);
                    var25_28 = new Object((dr0_0)var29_32, var28_31 /* !! */ );
                    var8_8 = new xh0_0((Component)var22_25, var11_11, (dr0_0)var29_32, (yT1)var27_30);
                    var9_9 = new yh0_1((Component)var22_25, var11_11, (dr0_0)var29_32);
                    var30_33 = new zh0_1((dr0_0)var29_32);
                    var28_31 /* !! */  = var5_5.c;
                    var34_43 = 576;
                    var13_13 = var5_5.a;
                    var15_15 = var22_25;
                    var22_25 = var21_21;
                    var27_30 = var8_8;
                    var29_32 = var9_9;
                    var21_21 = var12_12;
                    eg0_0.b((p83_0)var13_13, (Component)var15_15, var31_36, (Function1)var22_25, (Function2)var23_26, (gx0_2)var25_28, (Function2)var8_8, (ft1_2)var28_31 /* !! */ , (Function2)var9_9, (Function2)var30_33, (b30_0)var12_12, var34_43);
                    var12_12.E();
                    ** continue;
                }
                case -1586353347: {
                    var13_13 = "INSERT_BANNER-CAROUSEL_DEFAULT";
                    var14_14 = (int)var23_26.equals(var13_13);
                    if (var14_14 == 0) ** GOTO lbl-1000
lbl132:
                    // 2 sources

                    var14_14 = -1229253094;
                    var12_12.K(var14_14);
                    var13_13 = var30_33.getBaseValue();
                    var19_19 = uq0_0.o;
                    x20_0.b(var19_19, (b30_0)var12_12);
                    var29_32.getClass();
                    Intrinsics.checkNotNullParameter(var22_25, "component");
                    var31_37 = new ArrayList();
                    var26_29 = hv3_0.F();
                    var17_17 = mz3_0.d(var17_17);
                    var35_47 = 2;
                    hv3_0.a.getClass();
                    var17_17 = hv3_0.E();
                    var23_26 = new ScreenInfo(var26_29 -= (var17_17 *= 2), var17_17);
                    if (var13_13 != null) {
                        var25_28 = var13_13.getResolutionHeight();
                    } else {
                        var26_29 = 0;
                        var32_41 = 0.0f;
                        var25_28 = null;
                    }
                    if (var13_13 != null) {
                        var13_13 = var13_13.getResolutionWidth();
                    } else {
                        var14_14 = 0;
                        var13_13 = null;
                    }
                    var15_15 = new BaseValue((Float)var25_28, (Float)var13_13);
                    var13_13 = var22_25.getSubcomponents();
                    if (var13_13 == null) ** GOTO lbl311
                    var13_13 = var13_13.listIterator();
                    while (true) {
                        var25_28 = var13_13;
                        var25_28 = (ob3_2)var13_13;
                        var34_44 = var25_28.hasNext();
                        if (var34_44 == 0) ** GOTO lbl311
                        var25_28 = var25_28.next();
                        var34_44 = var7_7 + 1;
                        if (var7_7 < 0) break;
                        if ((var25_28 = (Subcomponent)var25_28) != null) {
                            var36_48 = var21_22;
                            var37_49 = null;
                            var38_50 = null;
                            var39_51 = null;
                            var40_52 = null;
                            var41_53 = null;
                            var42_54 = null;
                            var43_55 = null;
                            var44_56 = null;
                            var45_57 = -1 >>> 4;
                            var21_22 = new Banner(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var45_57, null);
                            var36_48 = var25_28.getMedia();
                            if (var36_48 != null) {
                                var9_9 = var36_48 = var36_48.getUrl();
                            } else {
                                var16_16 = 0;
                                var9_9 = null;
                            }
                            var21_22.setBannerUrl((String)var9_9);
                            var9_9 = var25_28.getStyle();
                            var30_33 = "PERCENTAGE";
                            if (var9_9 == null || (var9_9 = var9_9.getUnit()) == null) {
                                var9_9 = var30_33;
                            }
                            if ((var16_16 = (int)Intrinsics.areEqual(var9_9, var30_33)) != 0) {
                                var9_9 = var25_28.getStyle();
                                if (var9_9 != null) {
                                    var9_9 = var9_9.getHeight();
                                } else {
                                    var16_16 = 0;
                                    var9_9 = null;
                                }
                                var21_22.setHeight((Double)var9_9);
                                var9_9 = var25_28.getStyle();
                                if (var9_9 != null) {
                                    var9_9 = var9_9.getWidth();
                                } else {
                                    var16_16 = 0;
                                    var9_9 = null;
                                }
                                var21_22.setWidth((Double)var9_9);
                            } else {
                                var9_9 = az3_0.a;
                                var9_9 = var25_28.getStyle();
                                if (var9_9 != null) {
                                    var9_9 = var9_9.getWidth();
                                } else {
                                    var16_16 = 0;
                                    var9_9 = null;
                                }
                                var30_33 = var25_28.getStyle();
                                if (var30_33 != null) {
                                    var30_33 = var30_33.getHeight();
                                } else {
                                    var35_47 = 0;
                                    var30_33 = null;
                                }
                                var9_9 = az3_0.d((Double)var9_9, (Double)var30_33, (BaseValue)var15_15);
                                var30_33 = var9_9.getHeight();
                                var21_22.setHeight((Double)var30_33);
                                var46_58 = var9_9.getWidth();
                                var9_9 = var46_58;
                                var21_22.setWidth((Double)var9_9);
                            }
                            var9_9 = var25_28.getHotspots();
                            if (var9_9 != null) {
                                var35_47 = yx_2.o((Iterable)var9_9, 10);
                                var25_28 = new Object(var35_47);
                                var9_9 = var9_9.listIterator();
                                while (true) {
                                    var30_33 = var9_9;
                                    var30_33 = (ob3_2)var9_9;
                                    var48_59 = var30_33.hasNext();
                                    if (!var48_59) break;
                                    var30_33 = (Hotspot)var30_33.next();
                                    var3_3 = var9_9;
                                    if (var30_33 != null && (var36_48 = var30_33.getMetaData()) != null) {
                                        var36_48 = var36_48.getEvent();
                                        var4_4 = var13_13;
                                        var44_56 = var12_12;
                                        var13_13 = var36_48;
                                        var49_60 = (double)false;
                                        var50_61 = 0.0f;
                                        var5_5 = null;
lbl250:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var4_4 = var13_13;
                                    var44_56 = var12_12;
                                    var49_60 = (double)false;
                                    var50_61 = 0.0f;
                                    var5_5 = null;
                                    var14_14 = 0;
                                    var13_13 = null;
                                    ** continue;
                                    var51_62 = 2;
                                    var9_9 = new HotSpotMetaData((String)var13_13, null, var51_62, null);
                                    var37_49 = var30_33 != null ? (var13_13 = var30_33.getType()) : null;
                                    var38_50 = var30_33 != null ? (var13_13 = var30_33.getHeight()) : null;
                                    var39_51 = var30_33 != null ? (var13_13 = var30_33.getHotspotUrl()) : null;
                                    var40_52 = var30_33 != null ? (var13_13 = var30_33.getWidth()) : null;
                                    var41_53 = var30_33 != null ? (var13_13 = var30_33.getX()) : null;
                                    var42_54 = var30_33 != null ? (var13_13 = var30_33.getY()) : null;
                                    var43_55 = var30_33 != null ? (var13_13 = var30_33.getQuery()) : null;
                                    var36_48 = var5_5;
                                    var5_5 = new com.ril.ajio.kmm.shared.model.home.Hotspot((String)var37_49, (Double)var38_50, (String)var39_51, (Double)var40_52, (Double)var41_53, (Double)var42_54, (String)var43_55, (HotSpotMetaData)var9_9);
                                    var25_28.add(var5_5);
                                    var5_5 = this;
                                    var9_9 = var3_3;
                                    var13_13 = var4_4;
                                    var12_12 = var44_56;
                                }
                                var4_4 = var13_13;
                                var44_56 = var12_12;
                                var51_62 = 2;
                            } else {
                                var4_4 = var13_13;
                                var44_56 = var12_12;
                                var51_62 = 2;
                                var26_29 = 0;
                                var32_41 = 0.0f;
                                var25_28 = null;
                            }
                            var21_22.setHotspots((List)var25_28);
                            var5_5 = var21_22.getWidth();
                            var46_58 = 0.0;
                            var52_63 = var5_5 != null ? var5_5.doubleValue() : var46_58;
                            var49_60 = var52_63 == var46_58 ? 0 : (var52_63 > var46_58 ? 1 : -1);
                            if (var49_60 > 0 && (var49_60 = (cfr_temp_0 = (var52_63 = (var5_5 = var21_22.getHeight()) != null ? var5_5.doubleValue() : var46_58) - var46_58) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1)) > 0) {
                                var5_5 = new BannerData$Builder();
                                var5_5 = var5_5.build((Banner)var21_22, (ScreenInfo)var23_26, (BaseValue)var15_15, var7_7);
                                var31_37.add(var5_5);
                            }
                        } else {
                            var4_4 = var13_13;
                            var44_56 = var12_12;
                            var51_62 = 2;
                        }
                        var5_5 = this;
                        var13_13 = var4_4;
                        var7_7 = var34_44;
                        var12_12 = var44_56;
                        var6_6 = 1;
                        var35_47 = 2;
                    }
                    xx_2.n();
                    throw null;
lbl311:
                    // 2 sources

                    var44_56 = var12_12;
                    var32_41 = uq0_0.h;
                    var50_61 = uq0_0.x;
                    var21_22 = new bh0_1((Component)var22_25, (yT1)var27_30, var11_11, var28_31 /* !! */ );
                    var15_15 = new YG0((Component)var22_25, (yT1)var27_30, var11_11);
                    var8_8 = new zg0_0((Component)var22_25, var11_11, (dr0_0)var29_32);
                    var35_47 = 14376968;
                    var51_62 = 0;
                    var12_12 = null;
                    var24_27 = true;
                    var54_64 = true;
                    var13_13 = var31_37;
                    var31_37 = var21_22;
                    var22_25 = var8_8;
                    var29_32 = var44_56;
                    var5_5 = var44_56;
                    jv_1.b(var13_13, (Function1)var15_15, (g71_0)var21_22, (Function1)var8_8, var24_27, var32_41, var54_64, var50_61, (b30_0)var44_56, var35_47, 0);
                    var44_56.E();
                    var21_22 = this;
                    break block47;
                }
                case -1680298408: {
                    var5_5 = var12_12;
                    var21_23 = "INSERT_BRAND-CAROUSEL_RESOURCE-ONLY";
                    var6_6 = var23_26.equals(var21_23);
                    if (var6_6 != 0) ** GOTO lbl338
                    var21_23 = this;
                    ** GOTO lbl-1000
lbl338:
                    // 1 sources

                    var6_6 = -1256960801;
                    var12_12.K(var6_6);
                    var31_38 = var30_33.getBaseValue();
                    var21_23 = new rg0_0((dr0_0)var29_32, var28_31 /* !! */ );
                    var23_26 = new TG0(var28_31 /* !! */ , (dr0_0)var29_32, (ExploreBrandsPageModel)var30_33);
                    var25_28 = new Object((dr0_0)var29_32, var28_31 /* !! */ );
                    var8_8 = new bh0_2((Component)var22_25, var11_11, (dr0_0)var29_32, (yT1)var27_30);
                    var9_9 = new dh0_0((Component)var22_25, var11_11, (dr0_0)var29_32);
                    var30_33 = new eh0_0((dr0_0)var29_32);
                    var10_10 = this;
                    var28_31 /* !! */  = this.c;
                    var34_45 = 576;
                    var13_13 = this.a;
                    var15_15 = var22_25;
                    var22_25 = var21_23;
                    var27_30 = var8_8;
                    var29_32 = var9_9;
                    eg0_0.b((p83_0)var13_13, (Component)var15_15, var31_38, (Function1)var21_23, (Function2)var23_26, (gx0_2)var25_28, (Function2)var8_8, (ft1_2)var28_31 /* !! */ , (Function2)var9_9, (Function2)var30_33, (b30_0)var12_12, var34_45);
                    var12_12.E();
                    var21_23 = this;
                    break block47;
                }
                case -2096310552: 
            }
            var21_24 = var5_5;
            var5_5 = var12_12;
            var9_9 = "INSERT_BRAND-CAROUSEL_MEDIA-ONLY";
            var16_16 = (int)var23_26.equals(var9_9);
            if (var16_16 != 0) {
                var16_16 = -1236140240;
                var12_12.K(var16_16);
                var31_39 = var30_33.getBaseValue();
                var9_9 = new ah0_0(0, var28_31 /* !! */ , var29_32);
                var23_26 = new SG0(var28_31 /* !! */ , (dr0_0)var29_32, (ExploreBrandsPageModel)var30_33);
                var25_28 = new Object((dr0_0)var29_32, var28_31 /* !! */ );
                var8_8 = new VG0((Component)var22_25, var11_11, (dr0_0)var29_32, (yT1)var27_30);
                var30_33 = new WG0((Component)var22_25, var11_11, (dr0_0)var29_32);
                var10_10 = new XG0((dr0_0)var29_32);
                var28_31 /* !! */  = var21_24.c;
                var34_46 = 576;
                var13_13 = var21_24.a;
                var15_15 = var22_25;
                var22_25 = var9_9;
                var27_30 = var8_8;
                var29_32 = var30_33;
                var30_33 = var10_10;
                eg0_0.b((p83_0)var13_13, (Component)var15_15, var31_39, (Function1)var9_9, (Function2)var23_26, (gx0_2)var25_28, (Function2)var8_8, (ft1_2)var28_31 /* !! */ , (Function2)var29_32, (Function2)var10_10, (b30_0)var12_12, var34_46);
                var12_12.E();
            } else lbl-1000:
            // 3 sources

            {
                var7_7 = -1222198672;
                var5_5.K(var7_7);
                var5_5.E();
            }
        }
        return Unit.a;
    }
}

