/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.lazy.layout.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from Ss1
 */
public final class ss1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ mk2_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ zp$l h;
    public final /* synthetic */ zp$e i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ i90_0 l;
    public final /* synthetic */ T01 m;
    public final /* synthetic */ Nc$b n;
    public final /* synthetic */ Nc$c o;

    public ss1_1(ft1_2 ft1_22, boolean bl2, mk2_0 mk2_02, boolean bl3, hn1_2 hn1_22, zp$l zp$l, zp$e zp$e, boolean bl4, int n3, c80 c802, T01 t01, Nc$b nc$b, Nc$c nc$c) {
        this.c = ft1_22;
        this.d = bl2;
        this.e = mk2_02;
        this.f = bl3;
        this.g = hn1_22;
        this.h = zp$l;
        this.i = zp$e;
        this.j = bl4;
        this.k = n3;
        this.l = c802;
        this.m = t01;
        this.n = nc$b;
        this.o = nc$c;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block160: {
            block161: {
                block162: {
                    block165: {
                        block164: {
                            block169: {
                                block170: {
                                    block168: {
                                        block166: {
                                            block153: {
                                                block151: {
                                                    block163: {
                                                        block159: {
                                                            block157: {
                                                                block158: {
                                                                    var3_3 = this;
                                                                    var4_4 /* !! */  = var1_1;
                                                                    var4_4 /* !! */  = (es1)var1_1;
                                                                    var5_5 /* !! */  = var2_2 /* !! */ ;
                                                                    var6_6 = ((c60)var2_2 /* !! */ ).a;
                                                                    var8_7 /* !! */  = this.c;
                                                                    var5_5 /* !! */  = var8_7 /* !! */ .s;
                                                                    var5_5 /* !! */ .getValue();
                                                                    var9_8 = var8_7 /* !! */ .b;
                                                                    var10_9 = var9_8 != 0 || (var9_8 = var4_4 /* !! */ .W()) != 0;
                                                                    var9_8 = var3_3.d;
                                                                    var11_10 /* !! */  = var9_8 != 0 ? pg2_0.Vertical : pg2_0.Horizontal;
                                                                    QS.a(var6_6, var11_10 /* !! */ );
                                                                    var11_10 /* !! */  = var3_3.e;
                                                                    if (var9_8 != 0) {
                                                                        var12_11 /* !! */  = var4_4 /* !! */ .getLayoutDirection();
                                                                        var13_12 = var11_10 /* !! */ .calculateLeftPadding-u2uoSUM(var12_11 /* !! */ );
                                                                        var14_13 = var4_4 /* !! */ .e0(var13_12);
                                                                    } else {
                                                                        var12_11 /* !! */  = var4_4 /* !! */ .getLayoutDirection();
                                                                        var13_12 = androidx.compose.foundation.layout.h.c((mk2_0)var11_10 /* !! */ , var12_11 /* !! */ );
                                                                        var14_13 = var4_4 /* !! */ .e0(var13_12);
                                                                    }
                                                                    if (var9_8 != 0) {
                                                                        var15_14 = var4_4 /* !! */ .getLayoutDirection();
                                                                        var16_15 = var11_10 /* !! */ .calculateRightPadding-u2uoSUM((bp1_0)var15_14);
                                                                        var17_16 = var4_4 /* !! */ .e0(var16_15);
                                                                    } else {
                                                                        var15_14 = var4_4 /* !! */ .getLayoutDirection();
                                                                        var16_15 = androidx.compose.foundation.layout.h.b((mk2_0)var11_10 /* !! */ , (bp1_0)var15_14);
                                                                        var17_16 = var4_4 /* !! */ .e0(var16_15);
                                                                    }
                                                                    var18_17 = var11_10 /* !! */ .calculateTopPadding-D9Ej5fM();
                                                                    var19_18 = var4_4 /* !! */ .e0(var18_17);
                                                                    var20_19 = var11_10 /* !! */ .calculateBottomPadding-D9Ej5fM();
                                                                    var21_20 = var4_4 /* !! */ .e0(var20_19);
                                                                    var22_21 = var19_18 + var21_20;
                                                                    var23_22 = var14_13 + var17_16;
                                                                    var24_23 = var9_8 != 0 ? var22_21 : var23_22;
                                                                    var25_24 = var3_3.f;
                                                                    if (var9_8 != 0 && var25_24 == 0) {
                                                                        var17_16 = var19_18;
                                                                    } else if (var9_8 != 0 && var25_24 != 0) {
                                                                        var17_16 = var21_20;
                                                                    } else if (var9_8 == 0 && var25_24 == 0) {
                                                                        var17_16 = var14_13;
                                                                    }
                                                                    var26_25 = var24_23 - var17_16;
                                                                    var21_20 = -var23_22;
                                                                    var24_23 = -var22_21;
                                                                    var27_26 = var9_8;
                                                                    var28_27 = f60.k(var21_20, var24_23, var6_6);
                                                                    var11_10 /* !! */  = var3_3.g.invoke();
                                                                    var30_28 /* !! */  = var11_10 /* !! */ ;
                                                                    var30_28 /* !! */  = (Ks1)var11_10 /* !! */ ;
                                                                    var11_10 /* !! */  = var30_28 /* !! */ .f();
                                                                    var31_29 = c60.i(var28_27);
                                                                    var32_30 = var17_16;
                                                                    var17_16 = c60.h(var28_27);
                                                                    var33_31 = var28_27;
                                                                    var11_10 /* !! */ .a.e(var31_29);
                                                                    var11_10 /* !! */ .b.e(var17_16);
                                                                    var35_32 /* !! */  = var3_3.i;
                                                                    var36_33 = "null verticalArrangement when isVertical == true";
                                                                    var37_34 = var3_3.h;
                                                                    if (var9_8 == 0) break block157;
                                                                    if (var37_34 == null) break block158;
                                                                    var38_35 = var37_34.a();
                                                                    break block159;
                                                                }
                                                                var35_32 /* !! */  = var36_33.toString();
                                                                var39_36 = new IllegalArgumentException((String)var35_32 /* !! */ );
                                                                throw var39_36;
                                                            }
                                                            if (var35_32 /* !! */  == null) break block160;
                                                            var38_35 = var35_32 /* !! */ .a();
                                                        }
                                                        var40_40 = var4_4 /* !! */ .e0(var38_35);
                                                        var17_16 = var30_28 /* !! */ .getItemCount();
                                                        if (var27_26 != 0) {
                                                            var9_8 = c60.h(var6_6) - var22_21;
lbl82:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var9_8 = c60.i(var6_6) - var23_22;
                                                        ** while (true)
                                                        var21_20 = var9_8;
                                                        if (var25_24 != 0 && var9_8 <= 0) {
                                                            if (var27_26 == 0) {
                                                                var14_13 += var9_8;
                                                            }
                                                            if (var27_26 != 0) {
                                                                var19_18 += var21_20;
                                                            }
                                                            var41_41 = Ti1.a(var14_13, var19_18);
                                                        } else {
                                                            var41_41 = Ti1.a(var14_13, var19_18);
                                                        }
                                                        var14_13 = (int)var3_3.f;
                                                        var5_5 /* !! */  = var3_3.c;
                                                        var27_26 = var17_16;
                                                        var17_16 = (int)var3_3.d;
                                                        var44_43 = var37_34;
                                                        var37_34 = var3_3.n;
                                                        var45_44 = var8_7 /* !! */ ;
                                                        var8_7 /* !! */  = var3_3.o;
                                                        var46_45 = var33_31;
                                                        var48_46 = var5_5 /* !! */ ;
                                                        var5_5 /* !! */  = var43_42 /* !! */ ;
                                                        var49_47 = var35_32 /* !! */ ;
                                                        var50_48 = var21_20;
                                                        var51_49 = var14_13;
                                                        var52_50 = var32_30;
                                                        var32_30 = var27_26;
                                                        var53_51 = var43_42 /* !! */ ;
                                                        var43_42 /* !! */  = var30_28 /* !! */ ;
                                                        var54_52 = var25_24;
                                                        var39_37 /* !! */  = var30_28 /* !! */ ;
                                                        var30_28 /* !! */  = var4_4 /* !! */ ;
                                                        var55_53 = var23_22;
                                                        var23_22 = var27_26;
                                                        var56_54 = var22_21;
                                                        var22_21 = var40_40;
                                                        var57_55 = var44_43;
                                                        var1_1 = var45_44;
                                                        var58_56 = var6_6;
                                                        var60_57 = var14_13;
                                                        var61_58 = var52_50;
                                                        var62_59 = var4_4 /* !! */ ;
                                                        var63_60 = var26_25;
                                                        var5_5 /* !! */ (var33_31, (boolean)var17_16, (Ks1)var43_42 /* !! */ , (es1)var4_4 /* !! */ , var27_26, var40_40, (Nc$b)var37_34, (Nc$c)var8_7 /* !! */ , (boolean)var14_13, var52_50, var26_25, var41_41, (ft1_2)var48_46);
                                                        var5_5 /* !! */  = v83$a.a();
                                                        if (var5_5 /* !! */  != null) {
                                                            var11_10 /* !! */  = var5_5 /* !! */ .f();
                                                        } else {
                                                            var21_20 = 0;
                                                            var20_19 = 0.0f;
                                                            var11_10 /* !! */  = null;
                                                        }
                                                        var12_11 /* !! */  = v83$a.b((v83_0)var5_5 /* !! */ );
                                                        var17_16 = var1_1.h();
                                                        var4_4 /* !! */  = var1_1;
                                                        var43_42 /* !! */  = var1_1.d;
                                                        var30_28 /* !! */  = var43_42 /* !! */ .d;
                                                        var22_21 = vn3_0.b(var17_16, (wr1_0)var39_37 /* !! */ , var30_28 /* !! */ );
                                                        if (var17_16 != var22_21) {
                                                            var30_28 /* !! */  = var43_42 /* !! */ .a;
                                                            var30_28 /* !! */ .e(var22_21);
                                                            var43_42 /* !! */  = var43_42 /* !! */ .e;
                                                            var43_42 /* !! */ .d(var17_16);
                                                        }
                                                        var31_29 = var4_4 /* !! */ .i();
                                                        var15_14 = Unit.a;
                                                        var5_5 /* !! */  = var4_4 /* !! */ .r;
                                                        var11_10 /* !! */  = var4_4 /* !! */ .o;
                                                        var8_7 /* !! */  = Fr1.a((wr1_0)var39_37 /* !! */ , (ws1_0)var5_5 /* !! */ , (Br1)var11_10 /* !! */ );
                                                        var9_8 = (int)var62_59.W();
                                                        if (var9_8 == 0 && var10_9) {
                                                            var5_5 /* !! */  = (Number)var4_4 /* !! */ .w.b.getValue();
                                                            var38_35 = var5_5 /* !! */ .floatValue();
lbl156:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var38_35 = var4_4 /* !! */ .h;
                                                        ** while (true)
                                                        var64_61 = var38_35;
                                                        var9_8 = (int)var3_3.j;
                                                        if (var9_8 != 0) {
                                                            var5_5 /* !! */  = var39_37 /* !! */ .g();
lbl164:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var5_5 /* !! */  = mz0_2.a;
                                                        ** while (true)
                                                        var65_62 /* !! */  = var5_5 /* !! */ ;
                                                        var24_23 = (int)var62_59.W();
                                                        var43_42 /* !! */  = var4_4 /* !! */ .c;
                                                        var5_5 /* !! */  = var12_11 /* !! */ ;
                                                        var11_10 /* !! */  = var62_59;
                                                        var66_63 = var12_11 /* !! */ ;
                                                        var67_64 = var58_56;
                                                        var27_26 = var31_29;
                                                        var37_34 = var43_42 /* !! */ ;
                                                        var19_18 = var55_53;
                                                        var69_65 = var24_23;
                                                        var24_23 = var56_54;
                                                        var12_11 /* !! */  = new qs1_1((es1)var62_59, var58_56, var55_53, var56_54);
                                                        var21_20 = var52_50;
                                                        if (var52_50 < 0) break block161;
                                                        if (var26_25 < 0) break block162;
                                                        var30_28 /* !! */  = var4_4 /* !! */ .n;
                                                        var19_18 = (int)var3_3.d;
                                                        var15_14 = var3_3.l;
                                                        var12_11 /* !! */  = var3_3.m;
                                                        var70_66 = 0xFFFFFFFFL;
                                                        var52_50 = 32;
                                                        var72_67 = var65_62 /* !! */ ;
                                                        var73_68 = var4_4 /* !! */ ;
                                                        var74_69 = 0L;
                                                        var9_8 = var32_30;
                                                        if (var32_30 > 0) break block163;
                                                        var9_8 = c60.k(var46_45);
                                                        var22_21 = c60.j(var46_45);
                                                        var36_33 = new ArrayList<E>();
                                                        var76_70 = var39_37 /* !! */ .a();
                                                        var37_34 = var15_14;
                                                        var37_34 = (c80)var15_14;
                                                        var51_49 = 0;
                                                        var77_72 = null;
                                                        var78_74 = 1;
                                                        var54_52 = 0;
                                                        var55_53 = 0;
                                                        var79_76 = var30_28 /* !! */ ;
                                                        var80_78 = var22_21;
                                                        var81_80 = var53_51;
                                                        var82_82 = var19_18;
                                                        var83_84 = var69_65;
                                                        var84_86 /* !! */  = var12_11 /* !! */ ;
                                                        var30_28 /* !! */ .d(0, var9_8, var22_21, var36_33, var76_70, (hs1_0)var53_51, (boolean)var19_18, (boolean)var69_65, var78_74, var10_9, 0, 0, (c80)var37_34, (T01)var12_11 /* !! */ );
                                                        var25_24 = var69_65;
                                                        if (var69_65 == 0 && (var25_24 = (int)bj1.b(var67_64 = var30_28 /* !! */ .b(), var74_69)) == 0) {
                                                            var25_24 = (int)(var67_64 >> var52_50);
                                                            var9_8 = f60.h(var25_24, var46_45);
                                                            var25_24 = (int)(var67_64 &= var70_66);
                                                            var22_21 = f60.g(var25_24, var46_45);
                                                        }
                                                        var39_37 /* !! */  = var9_8;
                                                        var5_5 /* !! */  = var22_21;
                                                        var12_11 /* !! */  = us1_0.c;
                                                        var39_37 /* !! */  = var66_63.invoke(var39_37 /* !! */ , var5_5 /* !! */ , (Object)var12_11 /* !! */ );
                                                        var30_28 /* !! */  = var39_37 /* !! */ ;
                                                        var30_28 /* !! */  = (bl1_0)var39_37 /* !! */ ;
                                                        var4_4 /* !! */  = mz0_2.a;
                                                        var25_24 = -var21_20;
                                                        var51_49 = var50_48 + var26_25;
                                                        if (var19_18 != 0) {
                                                            var35_32 /* !! */  = pg2_0.Vertical;
lbl230:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var35_32 /* !! */  = pg2_0.Horizontal;
                                                        ** while (true)
                                                        var85_88 = var35_32 /* !! */ ;
                                                        var5_5 /* !! */  = var35_32 /* !! */ ;
                                                        var22_21 = 0;
                                                        var86_90 = null;
                                                        var11_10 /* !! */  = var53_51;
                                                        var6_6 = var53_51.c;
                                                        var21_20 = 0;
                                                        var20_19 = 0.0f;
                                                        var11_10 /* !! */  = null;
                                                        var14_13 = 0;
                                                        var13_12 = 0.0f;
                                                        var12_11 /* !! */  = null;
                                                        var17_16 = 0;
                                                        var16_15 = 0.0f;
                                                        var15_14 = null;
                                                        var19_18 = 0;
                                                        var18_17 = 0.0f;
                                                        var43_42 /* !! */  = null;
                                                        var23_22 = 0;
                                                        var66_63 = null;
                                                        var48_46 = null;
                                                        var8_7 /* !! */  = var62_59;
                                                        var87_92 = var73_68;
                                                        var27_26 = var25_24;
                                                        var88_94 = var40_40;
                                                        var35_32 /* !! */  = new Ws1(null, 0, false, 0.0f, (bl1_0)var30_28 /* !! */ , 0.0f, false, (c80)var37_34, (Vo0)var62_59, var6_6, var4_4 /* !! */ , var25_24, var51_49, 0, (pg2_0)var85_88, var26_25, var40_40);
                                                        var44_43 = var62_59;
                                                        var89_96 /* !! */  = var73_68;
                                                        var25_24 = 0;
                                                        var90_97 = 0.0f;
                                                        var39_37 /* !! */  = null;
                                                        break block164;
                                                    }
                                                    var74_69 = var46_45;
                                                    var25_24 = var69_65;
                                                    var87_93 = var4_4 /* !! */ ;
                                                    var91_99 = var53_51;
                                                    var53_51 = var5_5 /* !! */ ;
                                                    var66_63 = var91_99;
                                                    if (var22_21 >= var32_30) {
                                                        var51_49 = 1;
                                                        var22_21 = var32_30 + -1;
                                                        var27_26 = 0;
                                                        var79_77 = null;
                                                    }
                                                    var51_49 = Math.round(var64_61);
                                                    if (var22_21 == 0 && (var27_26 -= var51_49) < 0) {
                                                        var51_49 += var27_26;
                                                        var32_30 = var22_21;
                                                        var27_26 = 0;
                                                        var79_77 = null;
                                                    } else {
                                                        var32_30 = var22_21;
                                                    }
                                                    var86_91 = new fp_2();
                                                    var48_46 = var30_28 /* !! */ ;
                                                    var24_23 = -var21_20;
                                                    var81_81 /* !! */  = var12_11 /* !! */ ;
                                                    if (var40_40 < 0) {
                                                        var88_95 = var40_40;
                                                    } else {
                                                        var88_95 = 0;
                                                        var76_71 /* !! */  = null;
                                                    }
                                                    var14_13 = var24_23 + var88_95;
                                                    var76_71 /* !! */  = var15_14;
                                                    var82_83 = var24_23;
                                                    var17_16 = 0;
                                                    var16_15 = 0.0f;
                                                    var15_14 = null;
                                                    var27_26 = var32_30;
                                                    for (var24_23 = var27_26 += var14_13; var24_23 < 0 && var27_26 > 0; var24_23 += var61_58) {
                                                        var92_100 = var74_69;
                                                        var83_85 = 1;
                                                        var94_101 = 1.4E-45f;
                                                        var61_58 = var27_26 + -1;
                                                        var4_4 /* !! */  = ys1_0.c((rs1_1)var66_63, var61_58);
                                                        var32_30 = var61_58;
                                                        var65_62 /* !! */  = null;
                                                        var86_91.add(0, var4_4 /* !! */ );
                                                        var61_58 = var4_4 /* !! */ .t;
                                                        var17_16 = Math.max(var17_16, var61_58);
                                                        var61_58 = var4_4 /* !! */ .s;
                                                        var27_26 = var32_30;
                                                    }
                                                    var92_100 = var74_69;
                                                    if (var24_23 < var14_13) {
                                                        var51_49 += var24_23;
                                                        var24_23 = var14_13;
                                                    }
                                                    var61_58 = var51_49;
                                                    var24_23 -= var14_13;
                                                    var69_65 = var50_48 + var26_25;
                                                    var51_49 = var17_16;
                                                    if (var69_65 < 0) {
                                                        var63_60 = 0;
                                                        var95_102 = 0.0f;
                                                        var4_4 /* !! */  = null;
                                                    } else {
                                                        var63_60 = var69_65;
                                                    }
                                                    var17_16 = -var24_23;
                                                    var56_54 = var19_18;
                                                    var32_30 = var24_23;
                                                    var55_53 = var27_26;
                                                    var24_23 = 0;
                                                    var30_28 /* !! */  = null;
                                                    var83_85 = 0;
                                                    var94_101 = 0.0f;
                                                    var45_44 = null;
                                                    while (var24_23 < (var19_18 = var86_91.c)) {
                                                        if (var17_16 >= var63_60) {
                                                            var86_91.c(var24_23);
                                                            var83_85 = 1;
                                                            var94_101 = 1.4E-45f;
                                                            continue;
                                                        }
                                                        ++var55_53;
                                                        var84_87 /* !! */  = var86_91.get(var24_23);
                                                        var43_42 /* !! */  = var84_87 /* !! */ ;
                                                        var43_42 /* !! */  = (xs1_0)var84_87 /* !! */ ;
                                                        var19_18 = var43_42 /* !! */ .s;
                                                        var17_16 += var19_18;
                                                        var19_18 = 1;
                                                        var18_17 = 1.4E-45f;
                                                        var24_23 += var19_18;
                                                    }
                                                    var24_23 = var32_30;
                                                    var2_2 /* !! */  = var37_34;
                                                    var19_18 = var51_49;
                                                    var96_103 = var83_85;
                                                    var31_29 = var55_53;
                                                    while (true) {
                                                        if (var31_29 >= var9_8 || var17_16 >= var63_60 && var17_16 > 0 && (var51_49 = (int)var86_91.isEmpty()) == 0) break;
                                                        var51_49 = var63_60;
                                                        var4_4 /* !! */  = ys1_0.c((rs1_1)var66_63, var31_29);
                                                        var45_44 = var8_7 /* !! */ ;
                                                        var97_104 = var4_4 /* !! */ .s;
                                                        var98_105 = var14_13;
                                                        if ((var17_16 += var97_104) > var14_13) ** GOTO lbl-1000
                                                        var55_53 = 1;
                                                        var14_13 = var9_8 + -1;
                                                        if (var31_29 != var14_13) {
                                                            var14_13 = var31_29 + 1;
                                                            var24_23 -= var97_104;
                                                            var27_26 = var14_13;
                                                            var14_13 = 1;
                                                            var13_12 = 1.4E-45f;
                                                            var96_103 = 1;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var14_13 = var4_4 /* !! */ .t;
                                                            var14_13 = Math.max(var19_18, var14_13);
                                                            var86_91.addLast(var4_4 /* !! */ );
                                                            var19_18 = var14_13;
                                                            var14_13 = 1;
                                                            var13_12 = 1.4E-45f;
                                                        }
                                                        var31_29 += var14_13;
                                                        var63_60 = var51_49;
                                                        var8_7 /* !! */  = var45_44;
                                                        var14_13 = var98_105;
                                                    }
                                                    var45_44 = var8_7 /* !! */ ;
                                                    var14_13 = 1;
                                                    var13_12 = 1.4E-45f;
                                                    if (var17_16 >= var50_48) ** GOTO lbl422
                                                    var97_104 = var50_48 - var17_16;
                                                    var24_23 -= var97_104;
                                                    var17_16 += var97_104;
                                                    while (var24_23 < var21_20 && var27_26 > 0) {
                                                        var63_60 = var27_26 + -1;
                                                        var12_11 /* !! */  = ys1_0.c((rs1_1)var66_63, var63_60);
                                                        var27_26 = var63_60;
                                                        var95_102 = 0.0f;
                                                        var4_4 /* !! */  = null;
                                                        var86_91.add(0, (Object)var12_11 /* !! */ );
                                                        var63_60 = var12_11 /* !! */ .t;
                                                        var19_18 = Math.max(var19_18, var63_60);
                                                        var14_13 = var12_11 /* !! */ .s;
                                                        var24_23 += var14_13;
                                                        var14_13 = 1;
                                                        var13_12 = 1.4E-45f;
                                                    }
                                                    var97_104 += var61_58;
                                                    if (var24_23 < 0) {
                                                        var17_16 += var24_23;
                                                        var14_13 = var97_104 += var24_23;
                                                        var24_23 = 0;
                                                        var30_28 /* !! */  = null;
lbl417:
                                                        // 2 sources

                                                        while (true) {
                                                            var97_104 = var17_16;
                                                            break;
                                                        }
                                                    } else {
                                                        var14_13 = var97_104;
                                                        ** continue;
lbl422:
                                                        // 1 sources

                                                        var97_104 = var17_16;
                                                        var14_13 = var61_58;
                                                    }
                                                    var17_16 = Math.round(var64_61);
                                                    if (var17_16 < 0) {
                                                        var17_16 = -1;
                                                        var16_15 = 0.0f / 0.0f;
                                                    } else if (var17_16 > 0) {
                                                        var17_16 = 1;
                                                        var16_15 = 1.4E-45f;
                                                    } else {
                                                        var17_16 = 0;
                                                        var16_15 = 0.0f;
                                                        var15_14 = null;
                                                    }
                                                    if (var14_13 < 0) {
                                                        var63_60 = -1;
                                                        var95_102 = 0.0f / 0.0f;
                                                    } else if (var14_13 > 0) {
                                                        var63_60 = 1;
                                                        var95_102 = 1.4E-45f;
                                                    } else {
                                                        var63_60 = 0;
                                                        var95_102 = 0.0f;
                                                        var4_4 /* !! */  = null;
                                                    }
                                                    var95_102 = var17_16 == var63_60 && (var17_16 = Math.abs(Math.round(var64_61))) >= (var63_60 = Math.abs(var14_13)) ? (var16_15 = (float)var14_13) : var64_61;
                                                    var17_16 = 0;
                                                    var16_15 = 0.0f;
                                                    var15_14 = null;
                                                    var99_106 = var25_24 != 0 && var14_13 > var61_58 && (var51_49 = (int)((cfr_temp_0 = var64_61 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1))) <= 0 ? (var13_12 = (float)(var14_13 -= var61_58) + (var64_61 -= var95_102)) : 0.0f;
                                                    if (var24_23 < 0) break block165;
                                                    var14_13 = -var24_23;
                                                    var100_107 = (xs1_0)var86_91.first();
                                                    if (var21_20 <= 0 && var40_40 >= 0) {
                                                        var101_108 = var24_23;
                                                    } else {
                                                        var21_20 = var86_91.c;
                                                        var65_62 /* !! */  = var100_107;
                                                        var60_57 = 0;
                                                        var64_61 = 0.0f;
                                                        var100_107 = null;
                                                        while (var60_57 < var21_20) {
                                                            var77_73 /* !! */  = var86_91.get(var60_57);
                                                            var15_14 = var77_73 /* !! */ ;
                                                            var15_14 = (xs1_0)var77_73 /* !! */ ;
                                                            var17_16 = var15_14.s;
                                                            if (var24_23 == 0 || var17_16 > var24_23) break;
                                                            var51_49 = var21_20;
                                                            var21_20 = xx_2.h(var86_91);
                                                            if (var60_57 == var21_20) break;
                                                            var24_23 -= var17_16;
                                                            var20_19 = 1.4E-45f;
                                                            var11_10 /* !! */  = var86_91.get(++var60_57);
                                                            var65_62 /* !! */  = var11_10 /* !! */ ;
                                                            var65_62 /* !! */  = (xs1_0)var11_10 /* !! */ ;
                                                            var21_20 = var51_49;
                                                            var17_16 = 0;
                                                            var16_15 = 0.0f;
                                                            var15_14 = null;
                                                        }
                                                        var101_108 = var24_23;
                                                        var100_107 = var65_62 /* !! */ ;
                                                    }
                                                    var21_20 = var3_3.k;
                                                    var17_16 = var27_26 - var21_20;
                                                    var30_28 /* !! */  = null;
                                                    var17_16 = Math.max(0, var17_16);
                                                    var24_23 = 1;
                                                    var61_58 = var27_26 + -1;
                                                    if (var17_16 <= var61_58) {
                                                        var24_23 = 0;
                                                        var30_28 /* !! */  = null;
                                                        while (true) {
                                                            if (var30_28 /* !! */  == null) {
                                                                var30_28 /* !! */  = new ArrayList<Object>();
                                                            }
                                                            var3_3 = ys1_0.c((rs1_1)var66_63, var61_58);
                                                            var30_28 /* !! */ .add(var3_3);
                                                            var102_109 = -1;
                                                            if (var61_58 != var17_16) {
                                                                var61_58 += var102_109;
                                                                var3_3 = this;
                                                                continue;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        var102_109 = -1;
                                                        var24_23 = 0;
                                                        var30_28 /* !! */  = null;
                                                    }
                                                    if ((var61_58 = var45_44.size() + var102_109) >= 0) {
                                                        while (true) {
                                                            var27_26 = var61_58 + -1;
                                                            var3_3 = var45_44;
                                                            var65_62 /* !! */  = (Number)var45_44.get(var61_58);
                                                            if ((var61_58 = var65_62 /* !! */ .intValue()) < var17_16) {
                                                                if (var30_28 /* !! */  == null) {
                                                                    var30_28 /* !! */  = new ArrayList<Object>();
                                                                }
                                                                var65_62 /* !! */  = ys1_0.c((rs1_1)var66_63, var61_58);
                                                                var30_28 /* !! */ .add(var65_62 /* !! */ );
                                                            }
                                                            if (var27_26 >= 0) {
                                                                var45_44 = var3_3;
                                                                var61_58 = var27_26;
                                                                var102_109 = -1;
                                                                continue;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        var3_3 = var45_44;
                                                    }
                                                    if (var30_28 /* !! */  == null) {
                                                        var30_28 /* !! */  = mz0_2.a;
                                                    }
                                                    var17_16 = var30_28 /* !! */ .size();
                                                    var65_62 /* !! */  = null;
                                                    for (var61_58 = 0; var61_58 < var17_16; ++var61_58) {
                                                        var79_77 = var30_28 /* !! */ .get(var61_58);
                                                        var51_49 = var17_16;
                                                        var15_14 = var79_77;
                                                        var15_14 = (xs1_0)var79_77;
                                                        var17_16 = var15_14.t;
                                                        var19_18 = Math.max(var19_18, var17_16);
                                                        var16_15 = 1.4E-45f;
                                                        var17_16 = var51_49;
                                                    }
                                                    var16_15 = 1.4E-45f;
                                                    var65_62 /* !! */  = (xs1_0)CollectionsKt.S(var86_91);
                                                    var61_58 = var65_62 /* !! */ .a + var21_20;
                                                    var21_20 = var9_8 + -1;
                                                    var61_58 = Math.min(var61_58, var21_20);
                                                    var15_14 = var79_77 = CollectionsKt.S(var86_91);
                                                    var15_14 = (xs1_0)var79_77;
                                                    var17_16 = var15_14.a;
                                                    var27_26 = 1;
                                                    if (++var17_16 <= var61_58) {
                                                        var51_49 = 0;
                                                        var77_73 /* !! */  = null;
                                                        while (true) {
                                                            if (var77_73 /* !! */  == null) {
                                                                var77_73 /* !! */  = new ArrayList<Object>();
                                                            }
                                                            var83_85 = var19_18;
                                                            var103_110 = var31_29;
                                                            var43_42 /* !! */  = var77_73 /* !! */ ;
                                                            var37_34 = ys1_0.c((rs1_1)var66_63, var17_16);
                                                            var77_73 /* !! */ .add(var37_34);
                                                            if (var17_16 != var61_58) {
                                                                ++var17_16;
                                                                continue;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        var83_85 = var19_18;
                                                        var103_110 = var31_29;
                                                        var19_18 = 0;
                                                        var18_17 = 0.0f;
                                                        var43_42 /* !! */  = null;
                                                    }
                                                    if (var25_24 == 0 || var2_2 /* !! */  == null) break block166;
                                                    var15_14 = var2_2 /* !! */ ;
                                                    var37_34 = var2_2 /* !! */ .j;
                                                    var77_73 /* !! */  = var37_34;
                                                    var77_73 /* !! */  = (Collection)var37_34;
                                                    var51_49 = var77_73 /* !! */ .isEmpty() ^ 1;
                                                    if (var51_49 == 0) break block166;
                                                    var51_49 = var37_34.size() + -1;
                                                    var104_111 = var25_24;
                                                    var2_2 /* !! */  = var43_42 /* !! */ ;
                                                    var25_24 = -1;
                                                    var90_98 = 0.0f / 0.0f;
                                                    for (var19_18 = var51_49; var25_24 < var19_18; var19_18 += var25_24) {
                                                        block167: {
                                                            var39_37 /* !! */  = (Js1)var37_34.get(var19_18);
                                                            var25_24 = var39_37 /* !! */ .getIndex();
                                                            if (var25_24 <= var61_58) break block167;
                                                            if (var19_18 == 0) ** GOTO lbl-1000
                                                            var25_24 = var19_18 + -1;
                                                            var39_37 /* !! */  = (Js1)var37_34.get(var25_24);
                                                            if ((var25_24 = var39_37 /* !! */ .getIndex()) > var61_58) {
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var39_37 /* !! */  = (Js1)var37_34.get(var19_18);
                                                                break block151;
                                                            }
                                                        }
                                                        var25_24 = -1;
                                                        var90_98 = 0.0f / 0.0f;
                                                        var27_26 = 1;
                                                    }
                                                    var25_24 = 0;
                                                    var90_98 = 0.0f;
                                                    var39_37 /* !! */  = null;
                                                }
                                                var43_42 /* !! */  = (Js1)CollectionsKt.S((List)var37_34);
                                                if (var39_37 /* !! */  != null && (var25_24 = var39_37 /* !! */ .getIndex()) <= (var21_20 = Math.min(var31_29 = var43_42 /* !! */ .getIndex(), var21_20))) {
                                                    var37_34 = var2_2 /* !! */ ;
                                                    while (true) {
                                                        var27_26 = var14_13;
                                                        if (var37_34 != null) {
                                                            block152: {
                                                                var14_13 = var37_34.size();
                                                                var105_112 = var97_104;
                                                                var8_7 /* !! */  = null;
                                                                for (var97_104 = 0; var97_104 < var14_13; ++var97_104) {
                                                                    var77_73 /* !! */  = var37_34.get(var97_104);
                                                                    var32_30 = var14_13;
                                                                    var12_11 /* !! */  = var77_73 /* !! */ ;
                                                                    var12_11 /* !! */  = (xs1_0)var77_73 /* !! */ ;
                                                                    var14_13 = var12_11 /* !! */ .a;
                                                                    if (var14_13 != var25_24) {
                                                                        var13_12 = 1.4E-45f;
                                                                        var14_13 = var32_30;
                                                                        continue;
                                                                    }
                                                                    break block152;
                                                                }
                                                                var51_49 = 0;
                                                                var77_73 /* !! */  = null;
                                                            }
                                                            var77_73 /* !! */  = (xs1_0)var77_73 /* !! */ ;
                                                        } else {
                                                            var105_112 = var97_104;
                                                            var51_49 = 0;
                                                            var77_73 /* !! */  = null;
                                                        }
                                                        if (var77_73 /* !! */  == null) {
                                                            if (var37_34 == null) {
                                                                var37_34 = new ArrayList();
                                                            }
                                                            var12_11 /* !! */  = ys1_0.c((rs1_1)var66_63, var25_24);
                                                            var37_34.add(var12_11 /* !! */ );
                                                        }
                                                        if (var25_24 != var21_20) {
                                                            var13_12 = 1.4E-45f;
                                                            ++var25_24;
                                                            var14_13 = var27_26;
                                                            var97_104 = var105_112;
                                                            continue;
                                                        }
                                                        break block153;
                                                        break;
                                                    }
                                                }
                                                var27_26 = var14_13;
                                                var105_112 = var97_104;
                                                var37_34 = var2_2 /* !! */ ;
                                            }
                                            var25_24 = var43_42 /* !! */ .getOffset();
                                            var21_20 = var15_14.l - var25_24;
                                            var25_24 = var43_42 /* !! */ .getSize();
                                            var90_98 = (float)(var21_20 - var25_24) - var95_102;
                                            var20_19 = 0.0f;
                                            var11_10 /* !! */  = null;
                                            cfr_temp_1 = var90_98 - 0.0f;
                                            var21_20 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                            if (var21_20 > 0) {
                                                var21_20 = var43_42 /* !! */ .getIndex();
                                                var14_13 = 1;
                                                var13_12 = 1.4E-45f;
                                                var21_20 += var14_13;
                                                var43_42 /* !! */  = var37_34;
                                                var31_29 = 0;
                                                var37_34 = null;
                                                block27: while (var21_20 < var9_8 && (var14_13 = (int)((cfr_temp_2 = (var13_12 = (float)var31_29) - var90_98) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1))) < 0) {
                                                    if (var21_20 <= var61_58) {
                                                        block154: {
                                                            var14_13 = var86_91.a();
                                                            var16_15 = 0.0f;
                                                            var15_14 = null;
                                                            for (var17_16 = 0; var17_16 < var14_13; var17_16 += var25_24) {
                                                                var8_7 /* !! */  = var86_91.get(var17_16);
                                                                var106_113 = var90_98;
                                                                var39_37 /* !! */  = var8_7 /* !! */ ;
                                                                var39_37 /* !! */  = (xs1_0)var8_7 /* !! */ ;
                                                                var25_24 = var39_37 /* !! */ .a;
                                                                if (var25_24 != var21_20) {
                                                                    var25_24 = 1;
                                                                    continue;
                                                                }
                                                                break block154;
                                                            }
                                                            var106_113 = var90_98;
                                                            var97_104 = 0;
                                                            var8_7 /* !! */  = null;
                                                        }
                                                        var8_7 /* !! */  = (xs1_0)var8_7 /* !! */ ;
                                                        var17_16 = 1;
                                                        var16_15 = 1.4E-45f;
                                                    } else {
                                                        var106_113 = var90_98;
                                                        if (var43_42 /* !! */  != null) {
                                                            block155: {
                                                                var25_24 = var43_42 /* !! */ .size();
                                                                var13_12 = 0.0f;
                                                                var12_11 /* !! */  = null;
                                                                for (var14_13 = 0; var14_13 < var25_24; var14_13 += var17_16) {
                                                                    var8_7 /* !! */  = var15_14 = var43_42 /* !! */ .get(var14_13);
                                                                    var8_7 /* !! */  = (xs1_0)var15_14;
                                                                    var97_104 = var8_7 /* !! */ .a;
                                                                    if (var97_104 == var21_20) {
                                                                        var39_37 /* !! */  = var15_14;
                                                                        var17_16 = 1;
                                                                        var16_15 = 1.4E-45f;
                                                                        break block155;
                                                                    }
                                                                    var17_16 = 1;
                                                                    var16_15 = 1.4E-45f;
                                                                }
                                                                var17_16 = 1;
                                                                var16_15 = 1.4E-45f;
                                                                var25_24 = 0;
                                                                var90_98 = 0.0f;
                                                                var39_37 /* !! */  = null;
                                                            }
                                                            var8_7 /* !! */  = var39_37 /* !! */ ;
                                                            var8_7 /* !! */  = (xs1_0)var39_37 /* !! */ ;
                                                        } else {
                                                            var17_16 = 1;
                                                            var16_15 = 1.4E-45f;
                                                            var97_104 = 0;
                                                            var8_7 /* !! */  = null;
                                                        }
                                                    }
                                                    if (var8_7 /* !! */  != null) {
                                                        var21_20 += var17_16;
                                                        var25_24 = var8_7 /* !! */ .s;
lbl719:
                                                        // 2 sources

                                                        while (true) {
                                                            var31_29 += var25_24;
                                                            var90_98 = var106_113;
                                                            continue block27;
                                                            break;
                                                        }
                                                    }
                                                    if (var43_42 /* !! */  == null) {
                                                        var43_42 /* !! */  = new ArrayList<Object>();
                                                    }
                                                    var39_37 /* !! */  = ys1_0.c((rs1_1)var66_63, var21_20);
                                                    var43_42 /* !! */ .add(var39_37 /* !! */ );
                                                    var90_98 = 1.4E-45f;
                                                    ++var21_20;
                                                    var39_37 /* !! */  = (xs1_0)CollectionsKt.S(var43_42 /* !! */ );
                                                    var25_24 = var39_37 /* !! */ .s;
                                                    ** continue;
                                                }
                                            } else {
                                                var43_42 /* !! */  = var37_34;
                                            }
                                            break block168;
                                        }
                                        var104_111 = var25_24;
                                        var27_26 = var14_13;
                                        var2_2 /* !! */  = var43_42 /* !! */ ;
                                        var105_112 = var97_104;
                                    }
                                    if (var43_42 /* !! */  != null) {
                                        var39_37 /* !! */  = (xs1_0)CollectionsKt.S(var43_42 /* !! */ );
                                        var25_24 = var39_37 /* !! */ .a;
                                        if (var25_24 > var61_58) {
                                            var39_37 /* !! */  = (xs1_0)CollectionsKt.S(var43_42 /* !! */ );
                                            var61_58 = var39_37 /* !! */ .a;
                                        }
                                    }
                                    var25_24 = var3_3.size();
                                    var37_34 = null;
                                    for (var31_29 = 0; var31_29 < var25_24; var31_29 += var21_20) {
                                        var11_10 /* !! */  = (Number)var3_3.get(var31_29);
                                        var21_20 = var11_10 /* !! */ .intValue();
                                        if (var21_20 > var61_58) {
                                            if (var43_42 /* !! */  == null) {
                                                var43_42 /* !! */  = new ArrayList<Object>();
                                            }
                                            var11_10 /* !! */  = ys1_0.c((rs1_1)var66_63, var21_20);
                                            var43_42 /* !! */ .add((Object)var11_10 /* !! */ );
                                        }
                                        var21_20 = 1;
                                        var20_19 = 1.4E-45f;
                                    }
                                    if (var43_42 /* !! */  == null) {
                                        var43_42 /* !! */  = mz0_2.a;
                                    }
                                    var25_24 = var43_42 /* !! */ .size();
                                    var102_109 = var83_85;
                                    var37_34 = null;
                                    for (var31_29 = 0; var31_29 < var25_24; var31_29 += var21_20) {
                                        var11_10 /* !! */  = (xs1_0)var43_42 /* !! */ .get(var31_29);
                                        var21_20 = var11_10 /* !! */ .t;
                                        var102_109 = Math.max(var102_109, var21_20);
                                        var21_20 = 1;
                                        var20_19 = 1.4E-45f;
                                    }
                                    var39_37 /* !! */  = var86_91.first();
                                    var25_24 = (int)Intrinsics.areEqual(var100_107, var39_37 /* !! */ );
                                    if (var25_24 != 0 && (var25_24 = (int)var30_28 /* !! */ .isEmpty()) != 0 && (var25_24 = (int)var43_42 /* !! */ .isEmpty()) != 0) {
                                        var31_29 = 1;
                                    } else {
                                        var31_29 = 0;
                                        var37_34 = null;
                                    }
                                    if (var56_54 != 0) {
                                        var25_24 = var102_109;
                                        var67_64 = var92_100;
                                    } else {
                                        var67_64 = var92_100;
                                        var25_24 = var105_112;
                                    }
                                    var25_24 = f60.h(var25_24, var67_64);
                                    if (var56_54 != 0) {
                                        var102_109 = var105_112;
                                    }
                                    var102_109 = f60.g(var102_109, var67_64);
                                    var97_104 = var56_54 != 0 ? var102_109 : var25_24;
                                    var21_20 = Math.min(var97_104, var50_48);
                                    var61_58 = var105_112;
                                    if (var105_112 < var21_20) {
                                        var21_20 = 1;
                                        var20_19 = 1.4E-45f;
                                    } else {
                                        var21_20 = 0;
                                        var20_19 = 0.0f;
                                        var11_10 /* !! */  = null;
                                    }
                                    if (var21_20 != 0 && var27_26 != 0) {
                                        var3_3 = "non-zero itemsScrollOffset".toString();
                                        var39_37 /* !! */  = new IllegalStateException((String)var3_3);
                                        throw var39_37 /* !! */ ;
                                    }
                                    var107_114 = var100_107;
                                    var51_49 = var86_91.a();
                                    var80_79 = var30_28 /* !! */ .size() + var51_49;
                                    var51_49 = var43_42 /* !! */ .size();
                                    var32_30 = var9_8;
                                    var9_8 = var51_49 + var80_79;
                                    var100_107 = new ArrayList<Object>(var9_8);
                                    if (var21_20 == 0) ** GOTO lbl916
                                    var9_8 = (int)var30_28 /* !! */ .isEmpty();
                                    if (var9_8 == 0 || (var9_8 = (int)var43_42 /* !! */ .isEmpty()) == 0) ** GOTO lbl913
                                    var24_23 = var86_91.a();
                                    var43_42 /* !! */  = (ArrayList<Object>)new int[var24_23];
                                    var38_35 = 0.0f;
                                    var5_5 /* !! */  = null;
                                    for (var9_8 = 0; var9_8 < var24_23; ++var9_8) {
                                        if (var54_52 == 0) {
                                            var21_20 = var9_8;
                                            var27_26 = 1;
                                        } else {
                                            var21_20 = var24_23 - var9_8;
                                            var27_26 = 1;
                                            var21_20 += -1;
                                        }
                                        var11_10 /* !! */  = (xs1_0)var86_91.get(var21_20);
                                        var21_20 = var11_10 /* !! */ .q;
                                        var43_42 /* !! */ [var9_8] = (ArrayList<E>)var21_20;
                                    }
                                    var27_26 = 1;
                                    var11_10 /* !! */  = (pg2_0)new int[var24_23];
                                    var38_35 = 0.0f;
                                    var5_5 /* !! */  = null;
                                    for (var9_8 = 0; var9_8 < var24_23; ++var9_8) {
                                        var11_10 /* !! */ [var9_8] = (pg2_0)false;
                                    }
                                    if (var56_54 == 0) break block169;
                                    var5_5 /* !! */  = var57_55;
                                    if (var57_55 == null) break block170;
                                    var108_115 = var31_29;
                                    var37_34 = var62_59;
                                    var57_55.c((Vo0)var62_59, var97_104, (int[])var43_42 /* !! */ , (int[])var11_10 /* !! */ );
                                    var109_116 = var50_48;
                                    var77_73 /* !! */  = var11_10 /* !! */ ;
                                    var110_117 = var67_64;
                                    var27_26 = var24_23;
                                    var112_118 = var48_46;
                                    var85_89 /* !! */  = var76_71 /* !! */ ;
                                    var84_87 /* !! */  = var81_81 /* !! */ ;
                                    var113_119 = var82_83;
                                    var114_120 = var56_54;
                                    var50_48 = var32_30;
                                    ** GOTO lbl881
                                }
                                var3_3 = var36_33.toString();
                                var39_37 /* !! */  = new IllegalArgumentException((String)var3_3);
                                throw var39_37 /* !! */ ;
                            }
                            var108_115 = var31_29;
                            var37_34 = var62_59;
                            if (var49_47 != null) {
                                var79_77 = bp1_0.Ltr;
                                var109_116 = var50_48;
                                var50_48 = var32_30;
                                var5_5 /* !! */  = var49_47;
                                var77_73 /* !! */  = var11_10 /* !! */ ;
                                var11_10 /* !! */  = var62_59;
                                var110_117 = var67_64;
                                var84_87 /* !! */  = var81_81 /* !! */ ;
                                var14_13 = var97_104;
                                var85_89 /* !! */  = var76_71 /* !! */ ;
                                var15_14 = var43_42 /* !! */ ;
                                var114_120 = var56_54;
                                var43_42 /* !! */  = var79_77;
                                var27_26 = var24_23;
                                var112_118 = var48_46;
                                var113_119 = var82_83;
                                var30_28 /* !! */  = var77_73 /* !! */ ;
                                var49_47.b((Vo0)var62_59, var97_104, (int[])var15_14, (bp1_0)var79_77, (int[])var77_73 /* !! */ );
lbl881:
                                // 2 sources

                                var5_5 /* !! */  = tp_2.B(var77_73 /* !! */ );
                                if (var54_52 != 0) {
                                    var5_5 /* !! */  = kotlin.ranges.f.k(var5_5 /* !! */ );
                                }
                                var21_20 = var5_5 /* !! */ .a;
                                var14_13 = var5_5 /* !! */ .b;
                                var9_8 = var5_5 /* !! */ .c;
                                if (var9_8 > 0 && var21_20 <= var14_13 || var9_8 < 0 && var14_13 <= var21_20) {
                                    while (true) {
                                        var17_16 = (int)var77_73 /* !! */ [var21_20];
                                        if (var54_52 == 0) {
                                            var24_23 = var21_20;
                                        } else {
                                            var24_23 = var27_26 - var21_20;
                                            var19_18 = 1;
                                            var18_17 = 1.4E-45f;
                                            var24_23 -= var19_18;
                                        }
                                        var43_42 /* !! */  = (xs1_0)var86_91.get(var24_23);
                                        if (var54_52 != 0) {
                                            var17_16 = var97_104 - var17_16;
                                            var24_23 = var43_42 /* !! */ .q;
                                            var17_16 -= var24_23;
                                        }
                                        var43_42 /* !! */ .g(var17_16, var25_24, var102_109);
                                        var100_107.add(var43_42 /* !! */ );
                                        if (var21_20 != var14_13) {
                                            var21_20 += var9_8;
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            } else {
                                var3_3 = "null horizontalArrangement when isVertical == false".toString();
                                var39_37 /* !! */  = new IllegalArgumentException((String)var3_3);
                                throw var39_37 /* !! */ ;
lbl913:
                                // 1 sources

                                var3_3 = "no extra items".toString();
                                var39_37 /* !! */  = new IllegalArgumentException((String)var3_3);
                                throw var39_37 /* !! */ ;
lbl916:
                                // 1 sources

                                var110_117 = var67_64;
                                var108_115 = var31_29;
                                var112_118 = var48_46;
                                var85_89 /* !! */  = var76_71 /* !! */ ;
                                var84_87 /* !! */  = var81_81 /* !! */ ;
                                var113_119 = var82_83;
                                var114_120 = var56_54;
                                var37_34 = var62_59;
                                var109_116 = var50_48;
                                var50_48 = var32_30;
                                var9_8 = var30_28 /* !! */ .size();
                                var14_13 = var27_26;
                                var20_19 = 0.0f;
                                var11_10 /* !! */  = null;
                                for (var21_20 = 0; var21_20 < var9_8; var21_20 += var17_16) {
                                    var15_14 = (xs1_0)var30_28 /* !! */ .get(var21_20);
                                    var97_104 = var15_14.s;
                                    var15_14.g(var14_13 -= var97_104, var25_24, var102_109);
                                    var100_107.add(var15_14);
                                    var17_16 = 1;
                                    var16_15 = 1.4E-45f;
                                }
                                var9_8 = var86_91.a();
                                var14_13 = var27_26;
                                var20_19 = 0.0f;
                                var11_10 /* !! */  = null;
                                for (var21_20 = 0; var21_20 < var9_8; var21_20 += var17_16) {
                                    var15_14 = (xs1_0)var86_91.get(var21_20);
                                    var15_14.g(var14_13, var25_24, var102_109);
                                    var100_107.add(var15_14);
                                    var17_16 = var15_14.s;
                                    var14_13 += var17_16;
                                    var17_16 = 1;
                                    var16_15 = 1.4E-45f;
                                }
                                var9_8 = var43_42 /* !! */ .size();
                                var20_19 = 0.0f;
                                var11_10 /* !! */  = null;
                                for (var21_20 = 0; var21_20 < var9_8; var21_20 += var17_16) {
                                    var15_14 = (xs1_0)var43_42 /* !! */ .get(var21_20);
                                    var15_14.g(var14_13, var25_24, var102_109);
                                    var100_107.add(var15_14);
                                    var17_16 = var15_14.s;
                                    var14_13 += var17_16;
                                    var17_16 = 1;
                                    var16_15 = 1.4E-45f;
                                }
                            }
                            var9_8 = (int)var95_102;
                            var11_10 /* !! */  = var66_63.a;
                            var76_71 /* !! */  = var11_10 /* !! */ .a();
                            var8_7 /* !! */  = var85_89 /* !! */ ;
                            var8_7 /* !! */  = (c80)var85_89 /* !! */ ;
                            var78_75 = 1;
                            var79_77 = var112_118;
                            var51_49 = var9_8;
                            var80_79 = var102_109;
                            var36_33 = var100_107;
                            var81_81 /* !! */  = var66_63;
                            var82_83 = var114_120;
                            var83_85 = var104_111;
                            var54_52 = var101_108;
                            var55_53 = var61_58;
                            var112_118.d(var9_8, var25_24, var102_109, var100_107, (d)var76_71 /* !! */ , (hs1_0)var66_63, (boolean)var114_120, (boolean)var104_111, var78_75, var10_9, var101_108, var61_58, (c80)var8_7 /* !! */ , (T01)var84_87 /* !! */ );
                            if (var104_111 == 0 && (var14_13 = (int)bj1.b(var115_121 = var112_118.b(), var67_64 = 0L)) == 0) {
                                var14_13 = var114_120 != 0 ? var102_109 : var25_24;
                                var19_18 = (int)(var115_121 >> var52_50);
                                var25_24 = Math.max(var25_24, var19_18);
                                var25_24 = f60.h(var25_24, var110_117);
                                var21_20 = (int)(var115_121 &= var70_66);
                                var102_109 = f60.g(Math.max(var102_109, var21_20), var110_117);
                                var9_8 = var114_120 != 0 ? var102_109 : var25_24;
                                if (var9_8 != var14_13) {
                                    var21_20 = var100_107.size();
                                    var13_12 = 0.0f;
                                    var12_11 /* !! */  = null;
                                    for (var14_13 = 0; var14_13 < var21_20; var14_13 += var17_16) {
                                        var15_14 = (xs1_0)var100_107.get(var14_13);
                                        var15_14.v = var9_8;
                                        var15_14.x = var19_18 = var15_14.i + var9_8;
                                        var17_16 = 1;
                                        var16_15 = 1.4E-45f;
                                    }
                                }
                            }
                            var72_67.getClass();
                            var9_8 = var103_110;
                            if (var103_110 < var50_48) ** GOTO lbl-1000
                            var9_8 = var109_116;
                            if (var61_58 <= var109_116) {
                                var17_16 = 0;
                                var16_15 = 0.0f;
                                var15_14 = null;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var17_16 = 1;
                                var16_15 = 1.4E-45f;
                            }
                            var39_37 /* !! */  = var25_24;
                            var3_3 = var102_109;
                            var30_28 /* !! */  = var87_93;
                            var11_10 /* !! */  = var87_93.v;
                            var19_18 = var104_111;
                            var14_13 = 0;
                            var13_12 = 0.0f;
                            var12_11 /* !! */  = null;
                            var5_5 /* !! */  = new ArrayList<Object>(var100_107, null, (boolean)var104_111, (tr1_0)var11_10 /* !! */ );
                            var11_10 /* !! */  = var53_51;
                            var39_37 /* !! */  = (bl1_0)var53_51.invoke(var39_37 /* !! */ , var3_3, var5_5 /* !! */ );
                            if (var108_115 != 0) {
                                var3_3 = var100_107;
                            } else {
                                var9_8 = var100_107.size();
                                var3_3 = new ArrayList<Object>(var9_8);
                                var9_8 = var100_107.size();
                                var20_19 = 0.0f;
                                var11_10 /* !! */  = null;
                                for (var21_20 = 0; var21_20 < var9_8; ++var21_20) {
                                    var12_11 /* !! */  = var100_107.get(var21_20);
                                    var43_42 /* !! */  = var12_11 /* !! */ ;
                                    var43_42 /* !! */  = (xs1_0)var12_11 /* !! */ ;
                                    var61_58 = var43_42 /* !! */ .a;
                                    var79_77 = var86_91.first();
                                    var117_122 = var9_8;
                                    var5_5 /* !! */  = var79_77;
                                    var5_5 /* !! */  = (xs1_0)var79_77;
                                    var9_8 = var5_5 /* !! */ .a;
                                    if (var61_58 >= var9_8) {
                                        var5_5 /* !! */  = (xs1_0)var86_91.last();
                                        var19_18 = var43_42 /* !! */ .a;
                                        var9_8 = var5_5 /* !! */ .a;
                                        if (var19_18 <= var9_8) {
                                            var3_3.add((Object)var12_11 /* !! */ );
                                        }
                                    }
                                    var38_35 = 1.4E-45f;
                                    var9_8 = var117_122;
                                }
                            }
                            if (var114_120 != 0) {
                                var5_5 /* !! */  = pg2_0.Vertical;
lbl1055:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var5_5 /* !! */  = pg2_0.Horizontal;
                            ** while (true)
                            var85_89 /* !! */  = var5_5 /* !! */ ;
                            var5_5 /* !! */  = var81_81 /* !! */ ;
                            var6_6 = var66_63.c;
                            var11_10 /* !! */  = var107_114;
                            var86_91 = null;
                            var14_13 = var101_108;
                            var18_17 = var95_102;
                            var4_4 /* !! */  = var30_28 /* !! */ ;
                            var30_28 /* !! */  = var39_37 /* !! */ ;
                            var25_24 = 0;
                            var90_98 = 0.0f;
                            var39_37 /* !! */  = null;
                            var22_21 = var96_103;
                            var44_43 = var37_34;
                            var37_34 = var8_7 /* !! */ ;
                            var8_7 /* !! */  = var44_43;
                            var89_96 /* !! */  = var4_4 /* !! */ ;
                            var4_4 /* !! */  = var3_3;
                            var27_26 = var113_119;
                            var51_49 = var69_65;
                            var88_95 = var40_40;
                            var81_81 /* !! */  = new Ws1((xs1_0)var107_114, var101_108, (boolean)var17_16, var95_102, (bl1_0)var30_28 /* !! */ , var99_106, (boolean)var96_103, (c80)var37_34, (Vo0)var44_43, var6_6, var3_3, var113_119, var69_65, var50_48, (pg2_0)var85_89 /* !! */ , var26_25, var40_40);
                            var35_32 /* !! */  = var81_81 /* !! */ ;
                        }
                        var102_109 = var44_43.W();
                        var5_5 /* !! */  = var89_96 /* !! */ ;
                        var89_96 /* !! */ .g((Ws1)var35_32 /* !! */ , (boolean)var102_109, false);
                        return var35_32 /* !! */ ;
                    }
                    var3_3 = "negative currentFirstItemScrollOffset".toString();
                    var39_37 /* !! */  = new IllegalArgumentException((String)var3_3);
                    throw var39_37 /* !! */ ;
                }
                var3_3 = "invalid afterContentPadding".toString();
                var39_37 /* !! */  = new IllegalArgumentException((String)var3_3);
                throw var39_37 /* !! */ ;
            }
            var3_3 = "invalid beforeContentPadding".toString();
            var39_37 /* !! */  = new IllegalArgumentException((String)var3_3);
            throw var39_37 /* !! */ ;
            finally {
                v83$a.e((v83_0)var5_5 /* !! */ , (v83_0)var12_11 /* !! */ , (Function1)var11_10 /* !! */ );
            }
        }
        var3_3 = "null horizontalAlignment when isVertical == false".toString();
        var39_39 = new IllegalArgumentException((String)var3_3);
        throw var39_39;
    }
}

