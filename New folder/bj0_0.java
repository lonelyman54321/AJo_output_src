/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from BJ0
 */
public final class bj0_0 {
    /*
     * Unable to fully structure code
     */
    public static final void a(LP1 var0, boolean var1_1, boolean var2_2, Subcomponent var3_3, SubcomponentsOwner var4_4, BaseValue var5_5, boolean var6_6, Function0 var7_7, Function0 var8_8, Function0 var9_9, gx0_2 var10_10, ft1_2 var11_11, p83_0 var12_12, int var13_13, Function1 var14_14, Function2 var15_15, b30_0 var16_16, int var17_17, int var18_18, int var19_19) {
        block59: {
            block63: {
                block66: {
                    block65: {
                        block68: {
                            block73: {
                                block57: {
                                    block74: {
                                        block70: {
                                            block71: {
                                                block72: {
                                                    block69: {
                                                        block67: {
                                                            block64: {
                                                                block61: {
                                                                    block62: {
                                                                        block60: {
                                                                            block58: {
                                                                                var20_20 = var3_3;
                                                                                var21_21 = var4_4;
                                                                                var22_22 = var10_10;
                                                                                var23_23 = var12_12;
                                                                                var24_24 = var13_13;
                                                                                var25_25 = var14_14;
                                                                                var26_26 = var15_15;
                                                                                var27_27 = var18_18;
                                                                                var28_28 = var7_7;
                                                                                Intrinsics.checkNotNullParameter(var7_7, "onFollowButtonClicked");
                                                                                var29_29 = var8_8;
                                                                                Intrinsics.checkNotNullParameter(var8_8, "onShareClicked");
                                                                                var30_30 = var9_9;
                                                                                Intrinsics.checkNotNullParameter(var9_9, "onLikeClicked");
                                                                                Intrinsics.checkNotNullParameter(var10_10, "onBrandClicked");
                                                                                var31_31 = var11_11;
                                                                                Intrinsics.checkNotNullParameter(var11_11, "listState");
                                                                                Intrinsics.checkNotNullParameter(var12_12, "components");
                                                                                Intrinsics.checkNotNullParameter(var14_14, "onItemClicked");
                                                                                Intrinsics.checkNotNullParameter(var15_15, "sendImpression");
                                                                                var32_32 = -2073569489;
                                                                                var33_33 = var16_16;
                                                                                var34_34 = var16_16.g(var32_32);
                                                                                var35_35 = LP1$a.b;
                                                                                var36_36 = var19_19 & 2;
                                                                                var37_37 = var36_36 != 0 ? 0 : var1_1;
                                                                                var36_36 = var19_19 & 64;
                                                                                var38_38 = var36_36 != 0 ? 1 : var6_6;
                                                                                var33_33 = AndroidCompositionLocals_androidKt.a;
                                                                                var40_40 = var39_39 = var34_34.j((H30)var33_33);
                                                                                var40_40 = (Configuration)var39_39;
                                                                                var41_41 = uq0_0.k;
                                                                                var42_42 = 0;
                                                                                var43_43 = 0;
                                                                                var44_44 = 0;
                                                                                var45_45 = null;
                                                                                var46_46 = 13;
                                                                                var39_39 = var35_35;
                                                                                var29_29 = h.i((LP1)var35_35, 0.0f, var41_41, 0.0f, 0.0f, var46_46);
                                                                                var34_34.K(2095317326);
                                                                                var47_47 = var33_33;
                                                                                var36_36 = var27_27 & 57344 ^ 24576;
                                                                                var48_48 = 16384;
                                                                                var49_49 = 2.2959E-41f;
                                                                                if (var36_36 <= var48_48 || (var50_50 = (int)var34_34.J(var25_25)) == 0) break block58;
                                                                                var50_50 = var36_36;
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            var50_50 = var36_36;
                                                                            var36_36 = var27_27 & 24576;
                                                                            if (var36_36 == var48_48) lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                var36_36 = 1;
                                                                                var51_51 = 1.4E-45f;
                                                                            } else {
                                                                                var36_36 = 0;
                                                                                var51_51 = 0.0f;
                                                                                var33_33 = null;
                                                                            }
                                                                            var48_48 = var27_27 & 7168 ^ 3072;
                                                                            var52_52 = 2048;
                                                                            var53_53 = 2.87E-42f;
                                                                            if (var48_48 > var52_52 && (var44_44 = var34_34.c(var24_24)) != 0 || (var54_54 = var27_27 & 3072) == var52_52) {
                                                                                var54_54 = 1;
                                                                            } else {
                                                                                var54_54 = 0;
                                                                                var31_31 = null;
                                                                            }
                                                                            var31_31 = var34_34.v();
                                                                            var23_23 = b30$a.a;
                                                                            if ((var36_36 |= var54_54) != 0 || var31_31 == var23_23) {
                                                                                var31_31 = new wj0_1(var24_24, (Function1)var25_25);
                                                                                var34_34.o(var31_31);
                                                                            }
                                                                            var31_31 = (Function0)var31_31;
                                                                            var51_51 = 0.0f;
                                                                            var33_33 = null;
                                                                            var34_34.T(false);
                                                                            var29_29 = x20_0.d((LP1)var29_29, (Function0)var31_31);
                                                                            var31_31 = Nc$a.a;
                                                                            var30_30 = HA.e((Nc)var31_31, false);
                                                                            var36_36 = var34_34.P;
                                                                            var45_45 = var31_31;
                                                                            var31_31 = var34_34.P();
                                                                            var29_29 = a30_0.c((b30_0)var34_34, (LP1)var29_29);
                                                                            var55_55 = N20.W;
                                                                            var55_55.getClass();
                                                                            var56_56 = var48_48;
                                                                            var28_28 = N20$a.b;
                                                                            var25_25 = var34_34.a;
                                                                            var27_27 = var25_25 instanceof mp;
                                                                            if (var27_27 == 0) break block59;
                                                                            var34_34.A();
                                                                            var27_27 = (int)var34_34.O;
                                                                            if (var27_27 != 0) {
                                                                                var34_34.C((Function0)var28_28);
                                                                            } else {
                                                                                var34_34.n();
                                                                            }
                                                                            var57_57 = N20$a.e;
                                                                            Ow3.a((b30_0)var34_34, var30_30, (Function2)var57_57);
                                                                            var30_30 = N20$a.d;
                                                                            Ow3.a((b30_0)var34_34, var31_31, (Function2)var30_30);
                                                                            var31_31 = N20$a.f;
                                                                            var24_24 = (int)var34_34.O;
                                                                            if (var24_24 != 0) break block60;
                                                                            var58_58 = var34_34.v();
                                                                            var59_59 = var23_23;
                                                                            var23_23 = var36_36;
                                                                            var24_24 = (int)Intrinsics.areEqual(var58_58, var23_23);
                                                                            if (var24_24 != 0) break block61;
                                                                            break block62;
                                                                        }
                                                                        var59_59 = var23_23;
                                                                    }
                                                                    rk_0.a(var36_36, (j30_0)var34_34, var36_36, (N20$a$a)var31_31);
                                                                }
                                                                var58_58 = N20$a.c;
                                                                Ow3.a((b30_0)var34_34, var29_29, (Function2)var58_58);
                                                                var60_60 = 1065353216;
                                                                var61_61 = 1.0f;
                                                                var23_23 = j.c((LP1)var35_35, var61_61);
                                                                var62_62 = var28_28;
                                                                var63_63 = nz_1.a;
                                                                var33_33 = fg2_1.a;
                                                                var29_29 = a.b((LP1)var23_23, var63_63, (i13)var33_33);
                                                                var49_49 = uq0_0.o;
                                                                var29_29 = h.f((LP1)var29_29, var49_49, var49_49);
                                                                var23_23 = new xj0_1((Subcomponent)var20_20, (Configuration)var40_40, (Function2)var26_26);
                                                                var40_40 = c.a((LP1)var29_29, (Function1)var23_23);
                                                                var29_29 = zp.c;
                                                                var23_23 = Nc$a.m;
                                                                var26_26 = null;
                                                                var29_29 = oZ.a((zp$l)var29_29, (Gx$a)var23_23, (b30_0)var34_34, 0);
                                                                var65_64 = var34_34.P;
                                                                var23_23 = var34_34.P();
                                                                var40_40 = a30_0.c((b30_0)var34_34, (LP1)var40_40);
                                                                var55_55 = var33_33;
                                                                var36_36 = var25_25 instanceof mp;
                                                                if (var36_36 == 0) break block63;
                                                                var34_34.A();
                                                                var36_36 = (int)var34_34.O;
                                                                if (var36_36 != 0) {
                                                                    var33_33 = var28_28;
                                                                    var34_34.C((Function0)var28_28);
                                                                } else {
                                                                    var33_33 = var28_28;
                                                                    var34_34.n();
                                                                }
                                                                Ow3.a((b30_0)var34_34, var29_29, (Function2)var57_57);
                                                                Ow3.a((b30_0)var34_34, var23_23, (Function2)var30_30);
                                                                var60_60 = (int)var34_34.O;
                                                                if (var60_60 != 0 || (var60_60 = (int)Intrinsics.areEqual(var29_29 = var34_34.v(), var23_23 = Integer.valueOf(var65_64))) == 0) {
                                                                    rk_0.a(var65_64, (j30_0)var34_34, var65_64, (N20$a$a)var31_31);
                                                                }
                                                                Ow3.a((b30_0)var34_34, var40_40, (Function2)var58_58);
                                                                var66_65 = -1355542732;
                                                                var67_66 = -1.6376306E-10f;
                                                                var34_34.K(var66_65);
                                                                if (var21_21 == null) {
                                                                    var21_21 = var47_47;
                                                                    var47_47 = var58_58;
                                                                    var22_22 = var33_33;
                                                                    var58_58 = var35_35;
                                                                    var68_67 = var31_31;
                                                                    var29_29 = var30_30;
                                                                    var69_68 = var50_50;
                                                                    var40_40 = var45_45;
                                                                    var70_69 = var55_55;
lbl164:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var40_40 = var4_4.getName();
                                                                var29_29 = var4_4.getLogo();
                                                                if (var20_20 != null) {
                                                                    var26_26 = var3_3.getDescription();
                                                                } else {
                                                                    var65_64 = 0;
                                                                    var26_26 = null;
                                                                }
                                                                var62_62 = var33_33;
                                                                var51_51 = 0.0f;
                                                                var33_33 = null;
                                                                var23_23 = new yj0_1(0, var22_22, var21_21);
                                                                var36_36 = var17_17 >> 6;
                                                                var42_42 = 516110;
                                                                var43_43 = var36_36 & var42_42;
                                                                var21_21 = var47_47;
                                                                var70_69 = var55_55;
                                                                var22_22 = var62_62;
                                                                var69_68 = var50_50;
                                                                var36_36 = var2_2;
                                                                var47_47 = var58_58;
                                                                var58_58 = var35_35;
                                                                var35_35 = var40_40;
                                                                var68_67 = var31_31;
                                                                var40_40 = var45_45;
                                                                var31_31 = var29_29;
                                                                var29_29 = var30_30;
                                                                var30_30 = var26_26;
                                                                var50_50 = var38_38;
                                                                var45_45 = var7_7;
                                                                var55_55 = var23_23;
                                                                ov3.k((boolean)var2_2, (String)var35_35, (String)var31_31, (String)var26_26, (boolean)var38_38, var7_7, (Function0)var23_23, (b30_0)var34_34, var43_43);
                                                                ** while (true)
                                                                var65_64 = 0;
                                                                var26_26 = null;
                                                                var34_34.T(false);
                                                                if (var20_20 != null && (var26_26 = var3_3.getPostMedia()) != null) {
                                                                    var26_26 = (Media)CollectionsKt.firstOrNull((List)var26_26);
                                                                } else {
                                                                    var65_64 = 0;
                                                                    var26_26 = null;
                                                                }
                                                                var52_52 = -1355526175;
                                                                var53_53 = -1.6399283E-10f;
                                                                var34_34.K(var52_52);
                                                                if (var26_26 != null) break block64;
                                                                var26_26 = var5_5;
                                                                var22_22 = var12_12;
                                                                var71_70 = var13_13;
                                                                var23_23 = var14_14;
                                                                var27_27 = var18_18;
                                                                var60_60 = 0;
                                                                var61_61 = 0.0f;
                                                                var29_29 = null;
                                                                break block65;
                                                            }
                                                            var21_21 = (Configuration)var34_34.j((H30)var21_21);
                                                            var23_23 = var21_21.screenWidthDp;
                                                            var53_53 = x20_0.c((Integer)var23_23);
                                                            var52_52 = (int)var53_53;
                                                            var21_21 = var21_21.screenHeightDp;
                                                            var72_72 = x20_0.c((Integer)var21_21);
                                                            var73_73 = (int)var72_72;
                                                            var36_36 = (int)x20_0.b(var49_49, (b30_0)var34_34);
                                                            var52_52 -= var36_36;
                                                            var36_36 = -1178879505;
                                                            var51_51 = -3.580595E-4f;
                                                            var34_34.K(var36_36);
                                                            var33_33 = var34_34.v();
                                                            var30_30 = var59_59;
                                                            if (var33_33 == var59_59) {
                                                                var33_33 = new ScreenInfo(var52_52, var73_73);
                                                                var34_34.o(var33_33);
                                                            }
                                                            var33_33 = (ScreenInfo)var33_33;
                                                            var74_74 = 0;
                                                            var35_35 = null;
                                                            var34_34.T(false);
                                                            if (var37_37 != 0) {
                                                                var35_35 = "PIXEL";
                                                            } else {
                                                                var35_35 = var26_26.getMetadata();
                                                                if (var35_35 == null || (var35_35 = var35_35.getUnit()) == null) {
                                                                    var35_35 = "PERCENTAGE";
                                                                }
                                                            }
                                                            var54_54 = -1178869477;
                                                            var34_34.K(var54_54);
                                                            var31_31 = var34_34.v();
                                                            if (var31_31 == var30_30) {
                                                                var31_31 = az3_0.a;
                                                                var31_31 = var26_26.getMetadata();
                                                                if (var31_31 != null) {
                                                                    var31_31 = var31_31.getWidth();
                                                                } else {
                                                                    var54_54 = 0;
                                                                    var31_31 = null;
                                                                }
                                                                var39_39 = var26_26.getMetadata();
                                                                if (var39_39 != null) {
                                                                    var39_39 = var39_39.getHeight();
                                                                    var59_59 = var26_26;
                                                                    var20_20 = var39_39;
lbl263:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var59_59 = var26_26;
                                                                var75_75 = 0;
                                                                var20_20 = null;
                                                                var76_76 = 0.0f;
                                                                ** continue;
                                                                var26_26 = var5_5;
                                                                var31_31 = az3_0.c((String)var35_35, (Double)var31_31, (Double)var20_20, var5_5, (ScreenInfo)var33_33);
                                                                var34_34.o(var31_31);
                                                            } else {
                                                                var59_59 = var26_26;
                                                                var26_26 = var5_5;
                                                            }
                                                            var31_31 = (ScreenInfo)var31_31;
                                                            var75_75 = -1178860077;
                                                            var76_76 = -3.5862494E-4f;
                                                            var36_36 = 0;
                                                            var51_51 = 0.0f;
                                                            var33_33 = null;
                                                            var20_20 = wg2_2.a((j30_0)var34_34, false, var75_75);
                                                            if (var20_20 == var30_30) {
                                                                var76_76 = var31_31.getHeight();
                                                                var36_36 = 0;
                                                                var51_51 = 0.0f;
                                                                var33_33 = null;
                                                                cfr_temp_0 = var76_76 - 0.0f;
                                                                var75_75 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                                if (var75_75 > 0) {
                                                                    var75_75 = var31_31.getWidth();
                                                                    var76_76 = var75_75;
                                                                    var36_36 = var31_31.getHeight();
                                                                    var51_51 = var36_36;
                                                                    var76_76 /= var51_51;
                                                                } else {
                                                                    var75_75 = 1071877689;
                                                                    var76_76 = 1.7777778f;
                                                                }
                                                                var20_20 = Float.valueOf(var76_76);
                                                                var34_34.o(var20_20);
                                                            }
                                                            var20_20 = (Number)var20_20;
                                                            var76_76 = var20_20.floatValue();
                                                            var51_51 = 0.0f;
                                                            var33_33 = null;
                                                            var34_34.T(false);
                                                            var75_75 = (int)((float)var52_52 / var76_76);
                                                            var53_53 = x20_0.e((b30_0)var34_34, var75_75);
                                                            var77_77 = var73_73;
                                                            var79_78 = 0.6;
                                                            var73_73 = (int)(var77_77 *= var79_78);
                                                            var72_72 = x20_0.e((b30_0)var34_34, var73_73);
                                                            var36_36 = Float.compare(var53_53, var72_72);
                                                            if (var36_36 > 0) {
                                                                var53_53 = var72_72;
                                                            }
                                                            var81_79 = j.c((LP1)var58_58, 1.0f);
                                                            var82_80 = 13;
                                                            var28_28 = h.i(var81_79, 0.0f, var49_49, 0.0f, 0.0f, var82_80);
                                                            var72_72 = 0.0f;
                                                            var21_21 = null;
                                                            var40_40 = HA.e((Nc)var40_40, false);
                                                            var73_73 = var34_34.P;
                                                            var33_33 = var34_34.P();
                                                            var28_28 = a30_0.c((b30_0)var34_34, (LP1)var28_28);
                                                            var71_71 = var25_25 instanceof mp;
                                                            if (var71_71 == 0) break block66;
                                                            var34_34.A();
                                                            var71_71 = var34_34.O;
                                                            if (var71_71 != 0) {
                                                                var34_34.C((Function0)var22_22);
                                                            } else {
                                                                var34_34.n();
                                                            }
                                                            Ow3.a((b30_0)var34_34, var40_40, (Function2)var57_57);
                                                            Ow3.a((b30_0)var34_34, var33_33, (Function2)var29_29);
                                                            var66_65 = (int)var34_34.O;
                                                            if (var66_65 == 0 && (var66_65 = (int)Intrinsics.areEqual(var40_40 = var34_34.v(), var29_29 = Integer.valueOf(var73_73))) != 0) lbl-1000:
                                                            // 2 sources

                                                            {
                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var40_40 = var68_67;
                                                            rk_0.a(var73_73, (j30_0)var34_34, var73_73, (N20$a$a)var68_67);
                                                            ** while (true)
                                                            var40_40 = var47_47;
                                                            Ow3.a((b30_0)var34_34, var28_28, (Function2)var47_47);
                                                            var40_40 = d.a;
                                                            var35_35 = var59_59.getUrl();
                                                            var60_60 = 995474482;
                                                            var61_61 = 0.0032613394f;
                                                            var34_34.K(var60_60);
                                                            if (var35_35 != null) break block67;
                                                            var22_22 = var12_12;
                                                            var71_71 = var13_13;
                                                            var23_23 = var14_14;
                                                            var27_27 = var18_18;
                                                            var60_60 = 0;
                                                            var61_61 = 0.0f;
                                                            var29_29 = null;
                                                            break block68;
                                                        }
                                                        var29_29 = var59_59.getType();
                                                        var28_28 = "VIDEO";
                                                        if (var29_29 == null) break block69;
                                                        var73_73 = var29_29.hashCode();
                                                        if (var73_73 == (var27_27 = 70564)) break block70;
                                                        var27_27 = 69775675;
                                                        if (var73_73 == var27_27) break block71;
                                                        var27_27 = 81665115;
                                                        if (var73_73 == var27_27) break block72;
                                                    }
lbl368:
                                                    // 2 sources

                                                    while (true) {
                                                        var22_22 = var12_12;
                                                        var71_71 = var13_13;
                                                        var27_27 = var18_18;
                                                        var20_20 = var30_30;
                                                        var60_60 = 0;
                                                        var61_61 = 0.0f;
                                                        var29_29 = null;
                                                        var73_73 = 2048;
                                                        var72_72 = 2.87E-42f;
                                                        break block57;
                                                        break;
                                                    }
                                                }
                                                ** while ((var60_60 = (int)var29_29.equals((Object)var28_28)) == 0)
lbl381:
                                                // 1 sources

                                                var34_34.K(-712108356);
                                                var60_60 = 1065353216;
                                                var61_61 = 1.0f;
                                                var29_29 = j.d(j.c((LP1)var58_58, var61_61), var53_53);
                                                var83_81 = nz_1.l;
                                                var25_25 = var70_69;
                                                var33_33 = a.b((LP1)var29_29, var83_81, (i13)var70_69);
                                                var22_22 = var12_12;
                                                var71_71 = var13_13;
                                                var73_73 = 2048;
                                                var72_72 = 2.87E-42f;
                                                var29_29 = (Component)CollectionsKt.N(var13_13, var12_12);
                                                if (var29_29 != null && (var29_29 = var29_29.getUuid()) != null) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var29_29 = "0";
                                                ** while (true)
                                                var31_31 = var29_29;
                                                var29_29 = var59_59.getThumbnailUrl();
                                                if (var29_29 == null) {
                                                    var29_29 = "";
                                                }
                                                var27_27 = var18_18;
                                                var60_60 = var18_18 >> 3 & 112 | 3072;
                                                var52_52 = var18_18 << 9;
                                                var74_74 = 57344;
                                                var46_46 = var60_60 | (var52_52 &= var74_74);
                                                var44_44 = 0;
                                                var45_45 = null;
                                                var35_35 = var12_12;
                                                var23_23 = var30_30;
                                                var85_82 = true;
                                                var39_39 = var11_11;
                                                var86_83 = var75_75;
                                                Fs.a((LP1)var33_33, var12_12, (String)var31_31, var85_82, var11_11, false, var75_75, (String)var29_29, (b30_0)var34_34, var46_46);
                                                var60_60 = 0;
                                                var61_61 = 0.0f;
                                                var34_34.T(false);
                                                var29_29 = Unit.a;
                                                var20_20 = var30_30;
                                                break block73;
                                            }
                                            var22_22 = var12_12;
                                            var71_71 = var13_13;
                                            var27_27 = var18_18;
                                            var20_20 = var30_30;
                                            var73_73 = 2048;
                                            var72_72 = 2.87E-42f;
                                            var33_33 = "IMAGE";
                                            var60_60 = (int)var29_29.equals(var33_33);
                                            if (var60_60 == 0) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var60_60 = 0;
                                                    var61_61 = 0.0f;
                                                    var29_29 = null;
                                                    break block57;
                                                    break;
                                                }
                                            }
                                            break block74;
                                        }
                                        var22_22 = var12_12;
                                        var71_71 = var13_13;
                                        var27_27 = var18_18;
                                        var20_20 = var30_30;
                                        var73_73 = 2048;
                                        var72_72 = 2.87E-42f;
                                        ** while ((var60_60 = (int)var29_29.equals((Object)(var33_33 = "GIF"))) == 0)
                                    }
                                    var34_34.K(-712780870);
                                    var33_33 = j.d(j.c((LP1)var58_58, 1.0f), var53_53);
                                    var31_31 = i70$a.a;
                                    var30_30 = SP2.a(uq0_0.h);
                                    var42_42 = 32;
                                    var50_50 = 0;
                                    var39_39 = null;
                                    var86_83 = 3456;
                                    var45_45 = var34_34;
                                    AF2.a((LP1)var33_33, var35_35, (i70_0)var31_31, (rp2_0)var30_30, false, (b30_0)var34_34, var86_83, var42_42);
                                    var60_60 = 0;
                                    var61_61 = 0.0f;
                                    var29_29 = null;
                                    var34_34.T(false);
                                    var23_23 = Unit.a;
                                    break block73;
                                }
                                var52_52 = -711335867;
                                var53_53 = -2.1148564E13f;
                                var34_34.K(var52_52);
                                var34_34.T(false);
                                var29_29 = Unit.a;
                            }
                            var60_60 = 995528648;
                            var61_61 = 0.003273951f;
                            var34_34.K(var60_60);
                            var29_29 = var3_3.getResources();
                            if (var29_29 == null) ** GOTO lbl-1000
                            var29_29 = (Collection)var29_29;
                            var60_60 = (int)var29_29.isEmpty();
                            var52_52 = 1;
                            var53_53 = 1.4E-45f;
                            if ((var60_60 ^= var52_52) == var52_52) {
                                var29_29 = Nc$a.g;
                                var31_31 = var40_40.a((LP1)var58_58, (Nc)var29_29);
                                var40_40 = var59_59.getType();
                                var60_60 = 0;
                                var61_61 = 0.0f;
                                var29_29 = null;
                                var66_65 = (int)b.i((String)var40_40, (String)var28_28, false);
                                var67_66 = var66_65 != 0 ? uq0_0.v : uq0_0.h;
                                var50_50 = 0;
                                var39_39 = null;
                                var44_44 = 0;
                                var45_45 = null;
                                var42_42 = 6;
                                var40_40 = h.i((LP1)var31_31, var41_41, 0.0f, 0.0f, var67_66, var42_42);
                                var29_29 = var3_3.getResources();
                                if (var29_29 != null) {
                                    var36_36 = var29_29.size();
                                } else {
                                    var36_36 = 0;
                                    var51_51 = 0.0f;
                                    var33_33 = null;
                                }
                                var61_61 = -1.4835825E13f;
                                var34_34.K(-715660351);
                                var60_60 = var69_68;
                                var48_48 = 16384;
                                var49_49 = 2.2959E-41f;
                                var23_23 = var14_14;
                                if (var69_68 > var48_48 && (var60_60 = (int)var34_34.J(var14_14)) != 0 || (var60_60 = var27_27 & 24576) == var48_48) {
                                    var48_48 = var56_56;
                                    var60_60 = 1;
                                    var61_61 = 1.4E-45f;
                                } else {
                                    var48_48 = var56_56;
                                    var60_60 = 0;
                                    var61_61 = 0.0f;
                                    var29_29 = null;
                                }
                                if (var48_48 > var73_73 && (var48_48 = (int)var34_34.c(var71_71)) != 0 || (var48_48 = var27_27 & 3072) == var73_73) {
                                    var48_48 = 1;
                                    var49_49 = 1.4E-45f;
                                } else {
                                    var48_48 = 0;
                                    var49_49 = 0.0f;
                                    var28_28 = null;
                                }
                                var28_28 = var34_34.v();
                                if ((var60_60 |= var48_48) != 0 || var28_28 == var20_20) {
                                    var28_28 = new zj0_2(var71_71, (Function1)var23_23);
                                    var34_34.o(var28_28);
                                }
                                var28_28 = (Function0)var28_28;
                                var60_60 = 0;
                                var61_61 = 0.0f;
                                var29_29 = null;
                                var34_34.T(false);
                                xA2.c((LP1)var40_40, (Function0)var28_28, var36_36, (b30_0)var34_34, 0);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var23_23 = var14_14;
                                var60_60 = 0;
                                var61_61 = 0.0f;
                                var29_29 = null;
                            }
                            var34_34.T(false);
                        }
                        var34_34.T(false);
                        var66_65 = 1;
                        var67_66 = 1.4E-45f;
                        var34_34.T((boolean)var66_65);
                        var40_40 = Unit.a;
                    }
                    var34_34.T(false);
                    if (var3_3 != null) {
                        var36_36 = var66_65 = (int)var3_3.isLiked();
                    } else {
                        var36_36 = 0;
                        var51_51 = 0.0f;
                        var33_33 = null;
                    }
                    if (var3_3 != null && (var40_40 = var3_3.getLikesCount()) != null) {
                        var66_65 = var40_40.intValue();
                    } else {
                        var66_65 = 0;
                        var67_66 = 0.0f;
                        var40_40 = null;
                    }
                    var35_35 = String.valueOf(var66_65);
                    var66_65 = var17_17 >> 18 & 8064;
                    var31_31 = var8_8;
                    var30_30 = var9_9;
                    var39_39 = var34_34;
                    var44_44 = var66_65;
                    ov3.n((boolean)var36_36, (String)var35_35, var8_8, var9_9, (b30_0)var34_34, var66_65);
                    var66_65 = 1;
                    var67_66 = 1.4E-45f;
                    var30_30 = fn0_2.a((j30_0)var34_34, (boolean)var66_65, (boolean)var66_65);
                    if (var30_30 != null) {
                        var40_40 = var31_31;
                        var34_34 = var58_58;
                        var60_60 = var37_37;
                        var48_48 = var2_2;
                        var20_20 = var3_3;
                        var21_21 = var4_4;
                        var57_57 = var5_5;
                        var65_64 = var38_38;
                        var25_25 = var7_7;
                        var58_58 = var8_8;
                        var23_23 = var9_9;
                        var22_22 = var10_10;
                        var33_33 = var11_11;
                        var35_35 = var12_12;
                        var54_54 = var13_13;
                        var87_84 = var30_30;
                        var30_30 = var14_14;
                        var39_39 = var15_15;
                        var44_44 = var17_17;
                        var86_83 = var18_18;
                        var42_42 = var19_19;
                        var34_34 = var31_31 = new aj0_2((LP1)var34_34, (boolean)var37_37, (boolean)var2_2, var3_3, var4_4, var5_5, (boolean)var38_38, var7_7, var8_8, var9_9, var10_10, var11_11, var12_12, var13_13, var14_14, var15_15, var17_17, var18_18, var19_19);
                        var40_40 = var87_84;
                        var87_84.d = var31_31;
                    }
                    return;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

