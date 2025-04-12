/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData$Builder;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import com.ril.ajio.services.data.fleek.feedModel.Hotspot;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FK0
 */
public final class fk0_1
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ f23_0 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ FeedEngineData e;
    public final /* synthetic */ ft1_2 f;
    public final /* synthetic */ i90_0 g;
    public final /* synthetic */ ib3_0 h;
    public final /* synthetic */ yT1 i;
    public final /* synthetic */ yp0_0 j;

    public fk0_1(p83_0 p83_02, Activity activity, f23_0 f23_02, dr0_0 dr0_02, FeedEngineData feedEngineData, ft1_2 ft1_22, c80 c802, ib3_0 ib3_02, yT1 yT12, yp0_0 yp0_02) {
        this.a = p83_02;
        this.b = activity;
        this.c = f23_02;
        this.d = dr0_02;
        this.e = feedEngineData;
        this.f = ft1_22;
        this.g = c802;
        this.h = ib3_02;
        this.i = yT12;
        this.j = yp0_02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3, Object var4_4) {
        block88: {
            block87: {
                var5_5 = this;
                var6_6 = var1_1;
                var6_6 = (wr1_2)var1_1;
                var7_7 = var2_2;
                var7_7 = (Number)var2_2;
                var8_8 = var7_7.intValue();
                var9_9 = var3_3;
                var9_9 = (b30_0)var3_3;
                var10_10 = var4_4;
                var10_10 = (Number)var4_4;
                var11_11 = var10_10.intValue();
                var12_12 = "$this$items";
                Intrinsics.checkNotNullParameter(var6_6, (String)var12_12);
                var13_13 = var11_11 & 112;
                var14_14 = 32;
                if (var13_13 == 0) {
                    var13_13 = (int)var9_9.c(var8_8);
                    var13_13 = var13_13 != 0 ? 32 : 16;
                    var11_11 |= var13_13;
                }
                var13_13 = var11_11;
                var15_15 = 144;
                var16_16 = 2.02E-43f;
                if ((var11_11 &= 721) != var15_15 || (var11_11 = (int)var9_9.h()) == 0) break block87;
                var9_9.D();
                break block88;
            }
            var10_10 = var5_5.a;
            if (var10_10 != null) {
                var17_17 = var10_10 = (Component)var10_10.get(var8_8);
            } else {
                var18_18 = 0;
                var17_17 = null;
            }
            if (var17_17 != null) {
                var10_10 = var17_17.getType();
            } else {
                var11_11 = 0;
                var19_19 = 0.0f;
                var10_10 = null;
            }
            if (var10_10 == null) ** GOTO lbl-1000
            var15_15 = var10_10.hashCode();
            var20_20 = LP1$a.b;
            var21_21 = b30$a.a;
            var22_22 = var5_5.g;
            var23_23 = var5_5.b;
            var24_24 /* !! */  = var5_5.e;
            var25_25 = var5_5.j;
            var26_26 = var5_5.i;
            var12_12 = var5_5.d;
            var27_27 = var25_25;
            var28_28 = 0;
            var25_25 = null;
            switch (var15_15) lbl-1000:
            // 3 sources

            {
                default: lbl-1000:
                // 2 sources

                {
                    var25_25 = var9_9;
                    break;
                }
                case 79233237: {
                    var12_12 = "STORY";
                    var11_11 = (int)var10_10.equals(var12_12);
                    if (var11_11 == 0) ** GOTO lbl-1000
                    var11_11 = 2146657552;
                    var19_19 = 0.0f / 0.0f;
                    var9_9.K(var11_11);
                    var10_10 = var17_17.getSubType();
                    var12_12 = "TOP-STORIES";
                    var29_29 = Intrinsics.areEqual(var10_10, var12_12);
                    if (var29_29 != 0) {
                        var9_9.K(2146718746);
                        var30_32 = var17_17.getSubcomponent();
                        var19_19 = 1.0f;
                        var31_36 = androidx.compose.foundation.layout.j.c((LP1)var20_20, var19_19);
                        var29_29 = R$drawable.bg_box_pattern;
                        var32_40 = km2.a(var29_29, (b30_0)var9_9, 0);
                        var33_44 = i70$a.d;
                        var34_47 = 0.0f;
                        var35_50 = null;
                        var36_54 = 54;
                        var37_56 = false;
                        var38_60 = null;
                        var39_64 = false;
                        var40_68 = null;
                        var41_72 = androidx.compose.ui.draw.b.a(var31_36, var32_40, null, var33_44, 0.0f, null, var36_54);
                        var42_76 = uq0_0.h;
                        var43_78 = null;
                        var44_81 = 5;
                        var45_83 = null;
                        var25_25 = androidx.compose.foundation.layout.h.i(var41_72, 0.0f, var42_76, 0.0f, var42_76, var44_81);
                        var10_10 = androidx.compose.foundation.layout.j.c((LP1)var20_20, var19_19);
                        var46_87 = uq0_0.o;
                        var16_16 = uq0_0.e;
                        var24_24 /* !! */  = androidx.compose.foundation.layout.h.f((LP1)var10_10, var16_16, var46_87);
                        var22_22 = (c80)var22_22;
                        var26_26 = var5_5.d;
                        var23_23 = new sj0_0((c80)var22_22, var8_8, (dr0_0)var26_26);
                        var13_13 = var13_13 << 9 & 57344;
                        var10_10 = dr0_0.Companion;
                        var11_11 = 0x8000038;
                        var19_19 = 3.8518856E-34f;
                        var47_90 = var13_13 | var11_11;
                        var10_10 = var5_5.c;
                        var13_13 = 8;
                        var12_12 = "TOP_STORIES";
                        var15_15 = 0;
                        var16_16 = 0.0f;
                        var48_92 = null;
                        var49_97 = var8_8;
                        var22_22 = var25_25;
                        var17_17 = var9_9;
                        var25_25 = var9_9;
                        var50_101 = var13_13;
                        yd3_2.b((f23_0)var10_10, (String)var12_12, var30_32, false, var8_8, (Function2)var23_23, (LP1)var24_24 /* !! */ , (LP1)var22_22, (dr0_0)var26_26, (b30_0)var9_9, var47_90, var13_13);
                        var9_9.E();
                    } else {
                        var25_25 = var9_9;
                        var12_12 = "INTERNAL_SCROLL-STORIES";
                        var11_11 = (int)Intrinsics.areEqual(var10_10, var12_12);
                        if (var11_11 != 0) {
                            var9_9.K(-2145571917);
                            var48_93 = new Object();
                            var22_22 = (c80)var22_22;
                            var23_23 = var5_5.d;
                            var21_21 = new xj0_0((c80)var22_22, var8_8, (dr0_0)var23_23);
                            var13_13 = var13_13 << 3 & 896;
                            var10_10 = dr0_0.Companion;
                            var51_103 = var13_13 | 18902080;
                            var24_24 /* !! */  = var5_5.c;
                            var11_11 = 0;
                            var19_19 = 0.0f;
                            var10_10 = null;
                            var12_12 = var17_17;
                            var14_14 = var8_8;
                            var22_22 = var9_9;
                            gd_0.a(null, (Component)var17_17, var8_8, var48_93, (xj0_0)var21_21, (dr0_0)var23_23, (f23_0)var24_24 /* !! */ , (b30_0)var9_9, var51_103);
                            var9_9.E();
                        } else {
                            var13_13 = -2143789169;
                            var9_9.K(var13_13);
                            var9_9.E();
                        }
                    }
                    var25_25.E();
                    break block88;
                }
                case 2461856: {
                    var12_12 = "POST";
                    var11_11 = (int)var10_10.equals(var12_12);
                    if (var11_11 == 0) ** GOTO lbl-1000
                    var11_11 = -2142889425;
                    var19_19 = -6.437878E-39f;
                    var9_9.K(var11_11);
                    var10_10 = var17_17.getTemplate();
                    if (var10_10 == null) ** GOTO lbl155
                    var29_30 = var10_10.hashCode();
                    if (var29_30 == (var14_14 = -1548197280)) ** GOTO lbl288
                    var14_14 = -1400188426;
                    if (var29_30 == var14_14) ** GOTO lbl162
                    var14_14 = 662407343;
                    if (var29_30 == var14_14) ** GOTO lbl158
lbl155:
                    // 3 sources

                    while (true) {
                        var25_25 = var9_9;
                        ** GOTO lbl-1000
                        break;
                    }
lbl158:
                    // 1 sources

                    var12_12 = "POST_MEDIA-WITH-RESOURCE_DEFAULT";
                    var11_11 = (int)var10_10.equals(var12_12);
                    if (var11_11 != 0) ** GOTO lbl166
                    ** GOTO lbl155
lbl162:
                    // 1 sources

                    var12_12 = "POST_MEDIA-ONLY_DEFAULT";
                    var11_11 = (int)var10_10.equals(var12_12);
                    if (var11_11 != 0) ** break;
                    ** continue;
lbl166:
                    // 2 sources

                    var11_11 = -2143080230;
                    var19_19 = -6.170503E-39f;
                    var9_9.K(var11_11);
                    var23_23 = var17_17.getPostId();
                    var21_21 = Unit.a;
                    var52_106 = false;
                    var31_37 = null;
                    var30_33 = var22_22;
                    var30_33 = (c80)var22_22;
                    var12_12 = var5_5.h;
                    var32_41 = var5_5.d;
                    var10_10 = var48_94;
                    var25_25 = var48_94;
                    var15_15 = var8_8;
                    var53_108 = var21_21;
                    var21_21 = var32_41;
                    var2_2 = var23_23;
                    var32_41 = var24_24 /* !! */ ;
                    var24_24 /* !! */  = var17_17;
                    var54_109 = var22_22;
                    var55_112 = 0;
                    var22_22 = null;
                    var48_94 = new ek0_2((ib3_0)var12_12, (c80)var30_33, var8_8, (dr0_0)var21_21, (String)var23_23, (Component)var17_17, null);
                    var10_10 = var53_108;
                    ly0_0.d((b30_0)var9_9, var53_108, (Function2)var48_94);
                    var25_25 = var17_17.getSubComponentsOwner();
                    if (var25_25 != null) {
                        var28_28 = var25_25.isUserFollowing();
                    } else {
                        var28_28 = 0;
                        var25_25 = null;
                    }
                    var10_10 = var17_17.getSubComponentsOwner();
                    if (var10_10 != null) {
                        var56_115 = var10_10 = var10_10.getId();
                    } else {
                        var44_82 = 0;
                        var56_115 = null;
                    }
                    var10_10 = var17_17.getSubComponentsOwner();
                    if (var10_10 != null) {
                        var21_21 = var10_10 = var10_10.getName();
                    } else {
                        var49_98 = false;
                        var21_21 = null;
                    }
                    var10_10 = var17_17.getSubcomponent();
                    if (var10_10 != null && (var10_10 = (Subcomponent)CollectionsKt.firstOrNull((List)var10_10)) != null) {
                        var11_11 = (int)var10_10.isLiked();
                    } else {
                        var11_11 = 0;
                        var19_19 = 0.0f;
                        var10_10 = null;
                    }
                    var12_12 = var17_17.getSubcomponent();
                    var53_108 = var12_12 != null ? (var12_12 = (Subcomponent)CollectionsKt.firstOrNull((List)var12_12)) : null;
                    var12_12 = var17_17.getSubComponentsOwner();
                    var57_116 = var20_20;
                    var20_20 = var12_12;
                    var12_12 = var32_41.getBaseValue();
                    var22_22 = var9_9;
                    var9_9 = var12_12;
                    var32_41 = var35_51 /* !! */ ;
                    var12_12 = var5_5.b;
                    var24_24 /* !! */  = var5_5.d;
                    var30_33 = var5_5.e;
                    var33_45 = var12_12;
                    var38_61 = var24_24 /* !! */ ;
                    var39_65 = var28_28;
                    var58_118 = var21_21;
                    var41_73 = var17_17;
                    var45_84 = var30_33;
                    var59_121 = var56_115;
                    var35_51 /* !! */  = new yj0_0((Activity)var12_12, (dr0_0)var24_24 /* !! */ , (boolean)var28_28, (String)var21_21, (Component)var17_17, (FeedEngineData)var30_33, (String)var56_115);
                    var35_51 /* !! */  = var48_94;
                    var23_23 = var2_2;
                    var48_94 = new zj0_1((dr0_0)var24_24 /* !! */ , (Component)var17_17, (String)var2_2, (String)var21_21);
                    var33_45 = var38_61;
                    var40_69 = var12_12;
                    var58_118 = var24_24 /* !! */ ;
                    var45_84 = var21_21;
                    var59_121 = var17_17;
                    var43_79 = var30_33;
                    var38_61 = new ArrayList<Object>((Activity)var12_12, (dr0_0)var24_24 /* !! */ , (boolean)var11_11, (String)var21_21, (Component)var17_17, (FeedEngineData)var30_33, (String)var2_2, (String)var56_115);
                    var38_61 = var10_10;
                    var23_23 = var27_27;
                    var45_84 = var10_10 = new bk0_2((dr0_0)var24_24 /* !! */ , (yT1)var26_26, (yp0_0)var27_27);
                    var30_33 = var24_24 /* !! */ ;
                    var48_94 = var17_17;
                    var59_121 = var10_10 = new ck0_1((Activity)var12_12, (dr0_0)var24_24 /* !! */ , (Component)var17_17, (String)var21_21, var8_8);
                    var12_12 = var54_109;
                    var12_12 = (c80)var54_109;
                    var10_10 = new lj0_2((c80)var12_12, (Component)var17_17, var8_8, (dr0_0)var24_24 /* !! */ );
                    var44_82 = var13_13 << 6 & 7168;
                    var40_69 = var5_5.f;
                    var60_124 = 67;
                    var13_13 = 0;
                    var23_23 = var22_22;
                    var22_22 = null;
                    var52_106 = false;
                    var58_118 = var6_6 = var5_5.a;
                    var61_125 = 299008;
                    var42_77 = 4.19E-40f;
                    var51_104 = var28_28;
                    var17_17 = var53_108;
                    var43_79 = var23_23;
                    bj0_0.a(null, false, (boolean)var28_28, (Subcomponent)var53_108, (SubcomponentsOwner)var20_20, (BaseValue)var9_9, false, (Function0)var32_41, var35_51 /* !! */ , (Function0)var33_45, var38_61, (ft1_2)var40_69, (p83_0)var6_6, var8_8, (Function1)var45_84, (Function2)var10_10, (b30_0)var23_23, var61_125, var44_82, var60_124);
                    var34_48 = uq0_0.k;
                    var32_41 = null;
                    var39_65 = 13;
                    var62_126 = false;
                    var33_45 = null;
                    var37_57 = false;
                    var38_61 = null;
                    var31_37 = var57_116;
                    var10_10 = androidx.compose.foundation.layout.h.i((LP1)var57_116, 0.0f, var34_48, 0.0f, 0.0f, var39_65);
                    var63_129 = nz_1.v;
                    var16_16 = uq0_0.b;
                    var49_98 = false;
                    var21_21 = null;
                    var24_24 /* !! */  = null;
                    var55_112 = 8;
                    var25_25 = var23_23;
                    Rr0.a((LP1)var10_10, var63_129, var16_16, 0.0f, (b30_0)var23_23, 0, var55_112);
                    var23_23.E();
                    ** GOTO lbl387
lbl288:
                    // 1 sources

                    var54_110 = var22_22;
                    var25_25 = var9_9;
                    var23_23 = var27_27;
                    var6_6 = "POST_RESOURCE-CAROUSEL";
                    var13_13 = (int)var10_10.equals(var6_6);
                    if (var13_13 != 0) {
                        var13_13 = -2130683640;
                        var9_9.K(var13_13);
                        var6_6 = var17_17.getPostId();
                        var20_20 = Unit.a;
                        var55_113 = false;
                        var22_22 = null;
                        var30_34 = var54_110;
                        var30_34 = (c80)var54_110;
                        var12_12 = var5_5.h;
                        var21_21 = var5_5.d;
                        var10_10 = var9_9;
                        var15_15 = var8_8;
                        var7_7 = var27_27;
                        var23_23 = var6_6;
                        var24_24 /* !! */  = var17_17;
                        var9_9 = new yk0_2((ib3_0)var12_12, (c80)var30_34, var8_8, (dr0_0)var21_21, (String)var6_6, (Component)var17_17, null);
                        ly0_0.d((b30_0)var25_25, var20_20, (Function2)var9_9);
                        var10_10 = var17_17.getSubComponentsOwner();
                        if (var10_10 != null) {
                            var11_11 = (int)var10_10.isUserFollowing();
                        } else {
                            var11_11 = 0;
                            var19_19 = 0.0f;
                            var10_10 = null;
                        }
                        var12_12 = var17_17.getSubComponentsOwner();
                        var45_85 = var12_12 != null ? (var12_12 = var12_12.getId()) : null;
                        var12_12 = var17_17.getSubcomponent();
                        if (var12_12 != null && (var12_12 = (Subcomponent)CollectionsKt.firstOrNull((List)var12_12)) != null) {
                            var29_30 = (int)var12_12.isLiked();
                        } else {
                            var29_30 = 0;
                            var46_88 = 0.0f;
                            var12_12 = null;
                        }
                        var30_34 = var17_17.getSubComponentsOwner();
                        if (var30_34 != null) {
                            var30_34 = var30_34.getName();
                        } else {
                            var14_14 = 0;
                            var30_34 = null;
                        }
                        var48_95 = var17_17.getSubcomponent();
                        if (var48_95 != null) {
                            var48_95 = (Subcomponent)CollectionsKt.firstOrNull((List)var48_95);
                        } else {
                            var15_15 = 0;
                            var16_16 = 0.0f;
                            var48_95 = null;
                        }
                        var24_24 /* !! */  = var17_17.getSubComponentsOwner();
                        var21_21 = var5_5.b;
                        var9_9 = var5_5.d;
                        var23_23 = var5_5.e;
                        var31_38 = var22_22;
                        var32_42 = var21_21;
                        var35_52 = var9_9;
                        var62_127 = var11_11;
                        var38_62 = var30_34;
                        var40_70 = var17_17;
                        var58_119 /* !! */  = var23_23;
                        var41_74 = var45_85;
                        var22_22 = new ek0_1((Activity)var21_21, (dr0_0)var9_9, (boolean)var11_11, (String)var30_34, (Component)var17_17, (FeedEngineData)var23_23, (String)var45_85);
                        var20_20 = new dk0_1((dr0_0)var9_9, (Component)var17_17, (String)var6_6, (String)var30_34);
                        var31_38 = var59_122;
                        var62_127 = var29_30;
                        var41_74 = var6_6;
                        var59_122 = new nk0_2((Activity)var21_21, (dr0_0)var9_9, (boolean)var29_30, (String)var30_34, (Component)var17_17, (FeedEngineData)var23_23, (String)var6_6, (String)var45_85);
                        var6_6 = new qk0_2((String)var30_34, (dr0_0)var9_9, (yT1)var26_26, (yp0_0)var7_7);
                        var7_7 = new rk0_2((dr0_0)var9_9, (Activity)var21_21, (Component)var17_17);
                        var26_26 = new sk0_2((dr0_0)var9_9, (Activity)var21_21, (Component)var17_17);
                        var32_42 = new Object();
                        var12_12 = dr0_0.Companion;
                        var37_58 = 3136;
                        var39_66 = 50;
                        var29_30 = 0;
                        var46_88 = 0.0f;
                        var12_12 = null;
                        var49_99 = false;
                        var21_21 = null;
                        var23_23 = null;
                        var62_127 = 4608;
                        var30_34 = var48_95;
                        var48_95 = var24_24 /* !! */ ;
                        var24_24 /* !! */  = var22_22;
                        var22_22 = var20_20;
                        var31_38 = var26_26;
                        var26_26 = var59_122;
                        var17_17 = var6_6;
                        var20_20 = var7_7;
                        var35_52 = var25_25;
                        ZA2.a((boolean)var11_11, null, (Subcomponent)var30_34, (SubcomponentsOwner)var48_95, false, false, var24_24 /* !! */ , (Function0)var22_22, var59_122, (Function2)var6_6, (Function2)var7_7, (dr0_0)var9_9, (Function0)var31_38, (Function1)var32_42, (b30_0)var25_25, var62_127, var37_58, var39_66);
                        var25_25.E();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var13_13 = -2118496145;
                        var25_25.K(var13_13);
                        var25_25.E();
                    }
lbl387:
                    // 3 sources

                    var25_25.E();
                    break block88;
                }
                case -68645975: {
                    var25_25 = var9_9;
                    var12_12 = "SEEN_POSTS_DIVIDER";
                    var11_11 = (int)var10_10.equals(var12_12);
                    if (var11_11 == 0) break;
                    var9_9.K(-2107272998);
                    var19_19 = 1.8679673E-26f;
                    var9_9.K(347668121);
                    var11_11 = var13_13 & 112;
                    if (var11_11 == var14_14) {
                        var52_107 = true;
                    } else {
                        var52_107 = false;
                        var31_39 = null;
                    }
                    var10_10 = var25_25.v();
                    if (var52_107 || var10_10 == var21_21) {
                        var10_10 = new wj0_0(var8_8);
                        var25_25.o(var10_10);
                    }
                    var10_10 = (Function0)var10_10;
                    var25_25.E();
                    var13_13 = var13_13 >> 3 & 14;
                    var12_12 = var5_5.f;
                    ov3.m(var8_8, (ft1_2)var12_12, (Function0)var10_10, (b30_0)var25_25, var13_13);
                    var13_13 = 0;
                    var6_6 = null;
                    sx2_1.a((b30_0)var25_25, 0);
                    var25_25.E();
                    break block88;
                }
                case -429709356: {
                    var25_25 = var9_9;
                    var6_6 = "ADDRESS";
                    var13_13 = (int)var10_10.equals(var6_6);
                    if (var13_13 == 0) break;
                    var13_13 = 346329456;
                    var9_9.K(var13_13);
                    if (var23_23 != null) {
                        var6_6 = dr0_0.Companion;
                        var13_13 = 72;
                        gk0_1.c((Activity)var23_23, (dr0_0)var12_12, (b30_0)var9_9, var13_13);
                    }
                    var25_25.E();
                    break block88;
                }
                case -2130463047: {
                    var32_43 = var24_24 /* !! */ ;
                    var54_111 = var22_22;
                    var25_25 = var9_9;
                    var30_35 = var27_27;
                    var13_13 = 0;
                    var6_6 = null;
                    var48_96 = "INSERT";
                    var11_11 = (int)var10_10.equals(var48_96);
                    if (var11_11 == 0) break;
                    var11_11 = -2117958884;
                    var19_19 = -7.145248E-38f;
                    var9_9.K(var11_11);
                    var10_10 = var17_17.getTemplate();
                    if (var10_10 == null) ** GOTO lbl735
                    var15_15 = var10_10.hashCode();
                    var24_24 /* !! */  = "INSERT_SINGLE-BANNER_DEFAULT";
                    switch (var15_15) {
                        default: {
                            ** GOTO lbl735
                        }
                        case 503604013: {
                            var11_11 = (int)var10_10.equals(var24_24 /* !! */ );
                            if (var11_11 != 0) break;
                            ** GOTO lbl735
                        }
                        case 270515684: {
                            var6_6 = "INSERT_RESOURCE-CAROUSEL_FEED";
                            var13_13 = (int)var10_10.equals(var6_6);
                            if (var13_13 == 0) ** GOTO lbl735
                            var13_13 = -2116146624;
                            var9_9.K(var13_13);
                            var6_6 = var17_17.getSubComponentsOwner();
                            if (var6_6 != null) {
                                var6_6 = var6_6.getName();
                            } else {
                                var13_13 = 0;
                                var6_6 = null;
                            }
                            var7_7 = new wk0_2((String)var6_6, (dr0_0)var12_12, (yT1)var26_26);
                            var13_13 = 512;
                            var11_11 = 0;
                            var19_19 = 0.0f;
                            var10_10 = null;
                            AF2.b(null, (wk0_2)var7_7, (Component)var17_17, (b30_0)var25_25, var13_13);
                            var25_25.E();
                            ** GOTO lbl739
                        }
                        case -113175988: {
                            var6_6 = "INSERT_RESOURCE-ONLY_CATEGORY-DEFAULT";
                            var13_13 = (int)var10_10.equals(var6_6);
                            if (var13_13 == 0) ** GOTO lbl735
                            var13_13 = -2118061494;
                            var9_9.K(var13_13);
                            var6_6 = var17_17.getSubComponentsOwner();
                            if (var6_6 != null) {
                                var6_6 = var6_6.getName();
                            } else {
                                var13_13 = 0;
                                var6_6 = null;
                            }
                            var22_22 = var54_111;
                            var22_22 = (c80)var54_111;
                            var7_7 = new uk0_2((c80)var22_22, (Component)var17_17);
                            var48_96 = new vk0_2((String)var6_6, (dr0_0)var12_12, (yT1)var26_26, (yp0_0)var30_35);
                            var11_11 = 8;
                            var19_19 = 1.1E-44f;
                            var21_21 = var5_5.f;
                            var12_12 = var25_25;
                            var30_35 = var7_7;
                            var23_23 = var17_17;
                            np_0.b(var11_11, (b30_0)var25_25, (uk0_2)var7_7, var48_96, (ft1_2)var21_21, (Component)var17_17);
                            var25_25.E();
                            ** GOTO lbl739
                        }
                        case -1586353347: {
                            var30_35 = "INSERT_BANNER-CAROUSEL_DEFAULT";
                            var11_11 = (int)var10_10.equals(var30_35);
                            if (var11_11 == 0) ** GOTO lbl735
                        }
                    }
                    var25_25.K(-2115015403);
                    var19_19 = x20_0.b(uq0_0.o, (b30_0)var25_25);
                    var11_11 = (int)var19_19;
                    var30_35 = var17_17.getTemplate();
                    var14_14 = (int)Intrinsics.areEqual(var30_35, var24_24 /* !! */ );
                    if (var14_14 != 0) {
                        var11_11 = 0;
                        var19_19 = 0.0f;
                        var10_10 = null;
                    }
                    var14_14 = 347419217;
                    var25_25.K(var14_14);
                    var30_35 = var25_25.v();
                    if (var30_35 != var21_21) ** GOTO lbl706
                    var30_35 = var32_43.getBaseValue();
                    var12_12.getClass();
                    Intrinsics.checkNotNullParameter(var17_17, "component");
                    var48_96 = new ArrayList();
                    if (var11_11 == 0) {
                        var11_11 = 0;
                        var19_19 = 0.0f;
                        var10_10 = null;
                    } else {
                        var19_19 = 2.2E-44f;
                        var11_11 = mz3_0.d(16) * 2;
                    }
                    var51_105 = hv3_0.F() - var11_11;
                    hv3_0.a.getClass();
                    var11_11 = hv3_0.E();
                    var22_22 = new ScreenInfo(var51_105, var11_11);
                    if (var30_35 != null) {
                        var26_26 = var30_35.getResolutionHeight();
                    } else {
                        var51_105 = 0;
                        var26_26 = null;
                    }
                    if (var30_35 != null) {
                        var30_35 = var30_35.getResolutionWidth();
                    } else {
                        var14_14 = 0;
                        var30_35 = null;
                    }
                    var10_10 = new BaseValue((Float)var26_26, (Float)var30_35);
                    var30_35 = var17_17.getSubcomponent();
                    if (var30_35 == null) ** GOTO lbl702
                    var30_35 = var30_35.listIterator();
                    while (true) {
                        var26_26 = var30_35;
                        var26_26 = (ob3_2)var30_35;
                        var47_91 = (int)var26_26.hasNext();
                        if (var47_91 == 0) ** GOTO lbl702
                        var26_26 = var26_26.next();
                        var47_91 = 1;
                        var50_102 = var13_13 + 1;
                        if (var13_13 < 0) break;
                        if ((var26_26 = (Subcomponent)var26_26) != null) {
                            var57_117 = var20_20;
                            var65_130 = -1 >>> 4;
                            var20_20 = new Banner(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var65_130, null);
                            var32_43 = var26_26.getMedia();
                            if (var32_43 != null) {
                                var32_43 = var32_43.getUrl();
                                var24_24 /* !! */  = var32_43;
                            } else {
                                var24_24 /* !! */  = null;
                            }
                            var20_20.setBannerUrl((String)var24_24 /* !! */ );
                            var24_24 /* !! */  = var26_26.getStyle();
                            var5_5 = "PERCENTAGE";
                            if (var24_24 /* !! */  == null || (var24_24 /* !! */  = var24_24 /* !! */ .getUnit()) == null) {
                                var24_24 /* !! */  = var5_5;
                            }
                            if (var66_131 = Intrinsics.areEqual(var24_24 /* !! */ , var5_5)) {
                                var5_5 = var26_26.getStyle();
                                if (var5_5 != null) {
                                    var5_5 = var5_5.getHeight();
                                } else {
                                    var66_131 = false;
                                    var67_134 = 0.0f;
                                    var5_5 = null;
                                }
                                var20_20.setHeight((Double)var5_5);
                                var5_5 = var26_26.getStyle();
                                if (var5_5 != null) {
                                    var5_5 = var5_5.getWidth();
                                } else {
                                    var66_131 = false;
                                    var67_134 = 0.0f;
                                    var5_5 = null;
                                }
                                var20_20.setWidth((Double)var5_5);
                            } else {
                                var5_5 = az3_0.a;
                                var5_5 = var26_26.getStyle();
                                if (var5_5 != null) {
                                    var5_5 = var5_5.getWidth();
                                } else {
                                    var66_131 = false;
                                    var67_134 = 0.0f;
                                    var5_5 = null;
                                }
                                var24_24 /* !! */  = var26_26.getStyle();
                                var24_24 /* !! */  = var24_24 /* !! */  != null ? var24_24 /* !! */ .getHeight() : null;
                                var5_5 = az3_0.d((Double)var5_5, (Double)var24_24 /* !! */ , (BaseValue)var10_10);
                                var24_24 /* !! */  = var5_5.getHeight();
                                var20_20.setHeight((Double)var24_24 /* !! */ );
                                var68_137 = var5_5.getWidth();
                                var5_5 = var68_137;
                                var20_20.setWidth((Double)var5_5);
                            }
                            var5_5 = var26_26.getHotspots();
                            if (var5_5 != null) {
                                var5_5 = (Iterable)var5_5;
                                var51_105 = yx_2.o((Iterable)var5_5, 10);
                                var24_24 /* !! */  = new ArrayList<Object>(var51_105);
                                var5_5 = var5_5.iterator();
                                while ((var51_105 = (int)var5_5.hasNext()) != 0) {
                                    var26_26 = (Hotspot)var5_5.next();
                                    var3_3 = var5_5;
                                    if (var26_26 != null && (var32_43 = var26_26.getMetadata()) != null) {
                                        var32_43 = var32_43.getEvent();
                                        var43_80 = var12_12;
                                        var4_4 = var30_35;
                                        var70_138 = var50_102;
                                        var30_35 = var32_43;
                                        var29_31 = 2;
                                        var46_89 = 2.8E-45f;
lbl622:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var43_80 = var12_12;
                                    var4_4 = var30_35;
                                    var70_138 = var50_102;
                                    var29_31 = 2;
                                    var46_89 = 2.8E-45f;
                                    var14_14 = 0;
                                    var30_35 = null;
                                    ** continue;
                                    var50_102 = 0;
                                    var9_9 = null;
                                    var5_5 = new HotSpotMetaData((String)var30_35, null, var29_31, null);
                                    if (var26_26 != null) {
                                        var35_53 = var9_9 = var26_26.getType();
                                    } else {
                                        var34_49 = 0.0f;
                                        var35_53 = null;
                                    }
                                    if (var26_26 != null) {
                                        var33_46 = var9_9 = var26_26.getHeight();
                                    } else {
                                        var62_128 = false;
                                        var33_46 = null;
                                    }
                                    if (var26_26 != null) {
                                        var38_63 = var9_9 = var26_26.getHotspotUrl();
                                    } else {
                                        var37_59 = false;
                                        var38_63 = null;
                                    }
                                    if (var26_26 != null) {
                                        var40_71 = var9_9 = var26_26.getWidth();
                                    } else {
                                        var39_67 = false;
                                        var40_71 = null;
                                    }
                                    if (var26_26 != null) {
                                        var58_120 = var9_9 = var26_26.getX();
                                    } else {
                                        var36_55 = false;
                                        var58_120 = null;
                                    }
                                    var41_75 = var26_26 != null ? (var9_9 = var26_26.getY()) : null;
                                    var45_86 = var26_26 != null ? (var26_26 = var26_26.getQuery()) : null;
                                    var32_43 = var30_35;
                                    var59_123 = var5_5;
                                    var30_35 = new com.ril.ajio.kmm.shared.model.home.Hotspot((String)var35_53, (Double)var33_46, (String)var38_63, (Double)var40_71, (Double)var58_120, (Double)var41_75, (String)var45_86, (HotSpotMetaData)var5_5);
                                    var24_24 /* !! */ .add(var30_35);
                                    var50_102 = var70_138;
                                    var5_5 = var3_3;
                                    var30_35 = var4_4;
                                    var12_12 = var43_80;
                                }
                                var43_80 = var12_12;
                                var4_4 = var30_35;
                                var70_138 = var50_102;
                                var29_31 = 2;
                                var46_89 = 2.8E-45f;
                            } else {
                                var43_80 = var12_12;
                                var4_4 = var30_35;
                                var70_138 = var50_102;
                                var29_31 = 2;
                                var46_89 = 2.8E-45f;
                                var24_24 /* !! */  = null;
                            }
                            var20_20.setHotspots(var24_24 /* !! */ );
                            var5_5 = new BannerData$Builder();
                            var5_5 = var5_5.build((Banner)var20_20, (ScreenInfo)var22_22, (BaseValue)var10_10, var13_13);
                            var48_96.add(var5_5);
                        } else {
                            var43_80 = var12_12;
                            var4_4 = var30_35;
                            var70_138 = var50_102;
                            var29_31 = 2;
                            var46_89 = 2.8E-45f;
                        }
                        var5_5 = this;
                        var13_13 = var70_138;
                        var30_35 = var4_4;
                        var12_12 = var43_80;
                    }
                    xx_2.n();
                    throw null;
lbl702:
                    // 2 sources

                    var43_80 = var12_12;
                    var25_25.o(var48_96);
                    var30_35 = var48_96;
                    ** GOTO lbl707
lbl706:
                    // 1 sources

                    var43_80 = var12_12;
lbl707:
                    // 2 sources

                    var10_10 = var30_35;
                    var10_10 = (ArrayList)var30_35;
                    var25_25.E();
                    var67_134 = uq0_0.w;
                    var13_13 = 347538569;
                    var25_25.K(var13_13);
                    var6_6 = var25_25.v();
                    if (var6_6 == var21_21) {
                        var6_6 = new bk0_1((Activity)var23_23, (ArrayList)var10_10, var8_8);
                        var25_25.o(var6_6);
                    }
                    var30_35 = var6_6;
                    var30_35 = (bk0_1)var6_6;
                    var25_25.E();
                    var12_12 = new tj0_1(var8_8, (ArrayList)var10_10);
                    var22_22 = var54_111;
                    var22_22 = (c80)var54_111;
                    var6_6 = var43_80;
                    var48_96 = new vj0_1((c80)var22_22, (Component)var17_17, var8_8, (dr0_0)var43_80);
                    var18_18 = 24968;
                    var47_91 = 192;
                    var49_100 = true;
                    var24_24 /* !! */  = null;
                    var55_114 = false;
                    var22_22 = null;
                    var26_26 = var25_25;
                    jv_1.b((ArrayList)var10_10, (Function1)var12_12, (g71_0)var30_35, (Function1)var48_96, var49_100, var67_134, false, 0.0f, (b30_0)var25_25, var18_18, var47_91);
                    var25_25.E();
                    ** GOTO lbl739
lbl735:
                    // 6 sources

                    var66_132 = -2107391697;
                    var67_135 = -1.6732767E-37f;
                    var25_25.K(var66_132);
                    var25_25.E();
lbl739:
                    // 4 sources

                    var25_25.E();
                    break block88;
                }
            }
            var66_133 = -2106950257;
            var67_136 = -1.7227638E-37f;
            var25_25.K(var66_133);
            var25_25.E();
        }
        return Unit.a;
    }
}

