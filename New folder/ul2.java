/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

public final class ul2
extends Lambda
implements Function2 {
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ pg2_0 d;
    public final /* synthetic */ mk2_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ ok2_0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ Nc$c k;
    public final /* synthetic */ int l;
    public final /* synthetic */ t83 m;
    public final /* synthetic */ i90_0 n;

    public ul2(hm0_0 hm0_02, pg2_0 pg2_02, mk2_0 mk2_02, boolean bl2, float f5, ok2_0 ok2_02, hn1_2 hn1_22, Function0 function0, Nc$c nc$c, int n3, t83 t832, c80 c802) {
        this.c = hm0_02;
        this.d = pg2_02;
        this.e = mk2_02;
        this.f = bl2;
        this.g = f5;
        this.h = ok2_02;
        this.i = hn1_22;
        this.j = function0;
        this.k = nc$c;
        this.l = n3;
        this.m = t832;
        this.n = c802;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block134: {
            block135: {
                block136: {
                    block131: {
                        block130: {
                            var3_3 = this;
                            var4_4 = var1_1 /* !! */ ;
                            var4_4 = (es1)var1_1 /* !! */ ;
                            var5_5 = var2_2 /* !! */ ;
                            var6_6 = ((c60)var2_2 /* !! */ ).a;
                            var8_7 = this.c;
                            var8_7.B.getValue();
                            var9_8 = pg2_0.Vertical;
                            var5_5 = this.d;
                            if (var5_5 == var9_8) {
                                var10_9 = 1;
                                var11_10 = 1.4E-45f;
                            } else {
                                var10_9 = 0;
                                var11_10 = 0.0f;
                                var12_11 /* !! */  = null;
                            }
                            var13_12 /* !! */  = var10_9 != 0 ? var9_8 : pg2_0.Horizontal;
                            QS.a(var6_6, var13_12 /* !! */ );
                            var13_12 /* !! */  = var3_3.e;
                            if (var10_9 != 0) {
                                var14_13 /* !! */  = var4_4.getLayoutDirection();
                                var15_14 = var13_12 /* !! */ .calculateLeftPadding-u2uoSUM(var14_13 /* !! */ );
                                var16_15 = var4_4.e0(var15_14);
                            } else {
                                var14_13 /* !! */  = var4_4.getLayoutDirection();
                                var15_14 = androidx.compose.foundation.layout.h.c((mk2_0)var13_12 /* !! */ , var14_13 /* !! */ );
                                var16_15 = var4_4.e0(var15_14);
                            }
                            if (var10_9 != 0) {
                                var17_16 /* !! */  = var4_4.getLayoutDirection();
                                var18_17 = var13_12 /* !! */ .calculateRightPadding-u2uoSUM(var17_16 /* !! */ );
                                var19_18 = var4_4.e0(var18_17);
                            } else {
                                var17_16 /* !! */  = var4_4.getLayoutDirection();
                                var18_17 = androidx.compose.foundation.layout.h.b((mk2_0)var13_12 /* !! */ , var17_16 /* !! */ );
                                var19_18 = var4_4.e0(var18_17);
                            }
                            var20_19 = var13_12 /* !! */ .calculateTopPadding-D9Ej5fM();
                            var21_20 = var4_4.e0(var20_19);
                            var22_21 = var13_12 /* !! */ .calculateBottomPadding-D9Ej5fM();
                            var23_22 = var4_4.e0(var22_21);
                            var24_23 = var21_20 + var23_22;
                            var25_24 = var16_15 + var19_18;
                            var26_25 = var10_9 != 0 ? var24_23 : var25_24;
                            var27_26 = var3_3.f;
                            if (var10_9 != 0 && var27_26 == 0) {
                                var19_18 = var21_20;
                            } else if (var10_9 != 0 && var27_26 != 0) {
                                var19_18 = var23_22;
                            } else if (var10_9 == 0 && var27_26 == 0) {
                                var19_18 = var16_15;
                            }
                            var28_27 = var26_25 - var19_18;
                            var23_22 = -var25_24;
                            var29_28 = -var24_23;
                            var2_2 /* !! */  = var9_8;
                            var26_25 = var19_18;
                            var30_29 = f60.k(var23_22, var29_28, var6_6);
                            var8_7.p = var4_4;
                            var22_21 = var3_3.g;
                            var29_28 = var4_4.e0(var22_21);
                            var23_22 = var10_9 != 0 ? c60.h(var6_6) - var24_23 : c60.i(var6_6) - var25_24;
                            if (var27_26 != 0 && var23_22 <= 0) {
                                if (var10_9 == 0) {
                                    var16_15 += var23_22;
                                }
                                if (var10_9 != 0) {
                                    var21_20 += var23_22;
                                }
                                var32_30 = Ti1.a(var16_15, var21_20);
                            } else {
                                var32_30 = Ti1.a(var16_15, var21_20);
                            }
                            var34_31 = var3_3.h;
                            var27_26 = var34_31.a((Vo0)var4_4, var23_22);
                            if (var27_26 < 0) {
                                var34_31 = var2_2 /* !! */ ;
                                var35_33 = 0;
                            } else {
                                var35_33 = var27_26;
                                var34_31 = var2_2 /* !! */ ;
                            }
                            var10_9 = var5_5 == var34_31 ? c60.i(var30_29) : var35_33;
                            var36_34 = var5_5 != var34_31 ? c60.h(var30_29) : var35_33;
                            var21_20 = 5;
                            var20_19 = 7.0E-45f;
                            var8_7.y = var37_35 = f60.b(var10_9, var36_34, var21_20);
                            var5_5 = var3_3.i.invoke();
                            var14_13 /* !! */  = var5_5;
                            var14_13 /* !! */  = (nl2_0)var5_5;
                            var5_5 = var3_3.m;
                            var12_11 /* !! */  = v83$a.a();
                            if (var12_11 /* !! */  != null) {
                                var39_36 = var12_11 /* !! */ .f();
                                var40_37 = var23_22;
                                var41_38 /* !! */  = var39_36;
                            } else {
                                var40_37 = var23_22;
                                var21_20 = 0;
                                var20_19 = 0.0f;
                                var41_38 /* !! */  = null;
                            }
                            var13_12 /* !! */  = v83$a.b((v83_0)var12_11 /* !! */ );
                            var42_39 /* !! */  = var34_31;
                            var27_26 = var8_7.j();
                            var43_40 = var30_29;
                            var9_8 = var8_7.c;
                            var17_16 /* !! */  = var9_8.e;
                            var19_18 = vn3_0.b(var27_26, (wr1_0)var14_13 /* !! */ , (Object)var17_16 /* !! */ );
                            if (var27_26 == var19_18) break block130;
                            var45_41 = var24_23;
                            var46_42 /* !! */  = var9_8.b;
                            var46_42 /* !! */ .e(var19_18);
                            var9_8 = var9_8.f;
                            var9_8.d(var27_26);
                        }
                        var45_41 = var24_23;
                        var8_7.j();
                        var47_43 = var8_7.k();
                        var8_7.m();
                        var5_5.getClass();
                        var24_23 = 0;
                        var46_42 /* !! */  = null;
                        var48_44 = (float)false;
                        var36_34 = var35_33 + var29_28;
                        var49_45 = var36_34;
                        var47_43 *= var49_45;
                        var47_43 = var48_44 - var47_43;
                        try {
                            var27_26 = ok1_1.b(var47_43);
                            var46_42 /* !! */  = Unit.a;
                            var12_11 /* !! */  = var8_7.z;
                            var13_12 /* !! */  = var8_7.u;
                        }
                        catch (Throwable var34_32) {
                            throw var34_32;
                        }
                        finally {
                            v83$a.e((v83_0)var12_11 /* !! */ , (v83_0)var13_12 /* !! */ , (Function1)var41_38 /* !! */ );
                        }
                        var46_42 /* !! */  = Fr1.a((wr1_0)var14_13 /* !! */ , (ws1_0)var12_11 /* !! */ , (Br1)var13_12 /* !! */ );
                        var21_20 = ((Number)var3_3.j.invoke()).intValue();
                        var50_46 = var36_34;
                        var5_5 = var13_12 /* !! */ ;
                        var12_11 /* !! */  = var4_4;
                        var51_47 = var27_26;
                        var52_48 = var8_7;
                        var27_26 = var40_37;
                        var8_7 = var13_12 /* !! */ ;
                        var23_22 = var25_24;
                        var53_49 /* !! */  = var14_13 /* !! */ ;
                        var16_15 = var45_41;
                        var13_12 /* !! */  = new tl2((es1)var4_4, var6_6, var25_24, var45_41);
                        if (var26_25 < 0) break block134;
                        if (var28_27 < 0) break block135;
                        if (var36_34 < 0) {
                            var25_24 = 0;
                            var54_50 = null;
                        } else {
                            var25_24 = var36_34;
                        }
                        var14_13 /* !! */  = var3_3.d;
                        var23_22 = var3_3.l;
                        var55_51 = var3_3.m;
                        var56_52 = var3_3.n;
                        if (var21_20 <= 0) {
                            var57_53 = mz0_2.a;
                            var10_9 = var26_25;
                            var36_34 = -var26_25;
                            var27_26 += var28_27;
                            var10_9 = c60.k(var43_40);
                            var12_11 /* !! */  = var10_9;
                            var58_55 = c60.j(var43_40);
                            var9_8 = var58_55;
                            var17_16 /* !! */  = pl2_0.c;
                            var12_11 /* !! */  = var8_7.invoke(var12_11 /* !! */ , var9_8, (Object)var17_16 /* !! */ );
                            var59_57 = var12_11 /* !! */ ;
                            var59_57 = (bl1_0)var12_11 /* !! */ ;
                            var60_59 = var56_52;
                            var60_59 = (c80)var56_52;
                            var61_61 = var29_28;
                            var53_49 /* !! */  = var14_13 /* !! */ ;
                            var62_63 = var23_22;
                            var63_65 = var55_51;
                            var12_11 /* !! */  = new vl2(var57_53, var35_33, var29_28, var28_27, (pg2_0)var14_13 /* !! */ , var36_34, var27_26, var23_22, (t83)var55_51, (bl1_0)var59_57, (c80)var60_59);
                            var41_38 /* !! */  = var52_48;
lbl187:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var10_9 = var26_25;
                        var5_5 = var42_39 /* !! */ ;
                        if (var14_13 /* !! */  == var42_39 /* !! */ ) {
                            var26_25 = c60.i(var43_40);
                            var64_67 = var55_51;
                            var65_68 = var26_25;
                        } else {
                            var64_67 = var55_51;
                            var65_68 = var35_33;
                        }
                        if (var14_13 /* !! */  != var5_5) {
                            var36_34 = c60.h(var43_40);
                            var42_39 /* !! */  = var56_52;
lbl201:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var42_39 /* !! */  = var56_52;
                        var36_34 = var35_33;
                        ** while (true)
                        var66_69 /* !! */  = 5;
                        var67_70 = 7.0E-45f;
                        var68_71 = f60.b(var65_68, var36_34, var66_69 /* !! */ );
                        while (var19_18 > 0 && var51_47 > 0) {
                            var19_18 += -1;
                            var51_47 -= var25_24;
                        }
                        var51_47 *= -1;
                        if (var19_18 >= var21_20) {
                            var36_34 = 1;
                            var19_18 = var21_20 + -1;
                            var51_47 = 0;
                            var60_60 /* !! */  = null;
                        }
                        var55_51 = new fp_2();
                        var66_69 /* !! */  = -var10_9;
                        if (var29_28 < 0) {
                            var36_34 = var29_28;
                        } else {
                            var36_34 = 0;
                            var5_5 = null;
                        }
                        var70_72 = var27_26;
                        var63_66 = var8_7;
                        var71_73 = var51_47 += (var36_34 += var66_69 /* !! */ );
                        var27_26 = 0;
                        var47_43 = 0.0f;
                        var34_31 = null;
                        var51_47 = var29_28;
                        while (true) {
                            var72_74 = var3_3.k;
                            var73_75 = var25_24;
                            var25_24 = (int)var3_3.f;
                            if (var71_73 >= 0 || var19_18 <= 0) break;
                            var74_76 = var19_18 + -1;
                            var75_77 /* !! */  = var4_4.getLayoutDirection();
                            var19_18 = var36_34;
                            var5_5 = var4_4;
                            var76_78 = var10_9;
                            var10_9 = var74_76;
                            var3_3 = var55_51;
                            var77_79 = var66_69 /* !! */ ;
                            var6_6 = var68_71;
                            var78_80 = var23_22;
                            var13_12 /* !! */  = var53_49 /* !! */ ;
                            var79_81 = var43_40;
                            var81_82 /* !! */  = var14_13 /* !! */ ;
                            var82_83 = var48_44;
                            var83_84 = var76_78;
                            var84_85 = var4_4;
                            var85_86 = var36_34;
                            var17_16 /* !! */  = var14_13 /* !! */ ;
                            var86_87 = var21_20;
                            var41_38 /* !! */  = var72_74;
                            var1_1 /* !! */  = var46_42 /* !! */ ;
                            var72_74 = null;
                            var46_42 /* !! */  = var75_77 /* !! */ ;
                            var61_62 = var36_34;
                            var85_86 = var73_75;
                            var87_88 = var51_47;
                            var85_86 = 0;
                            var29_28 = var35_33;
                            var5_5 = sl2_0.a((es1)var4_4, var74_76, var68_71, (nl2_0)var53_49 /* !! */ , var32_30, (pg2_0)var14_13 /* !! */ , (Nc$c)var41_38 /* !! */ , var75_77 /* !! */ , (boolean)var25_24, var35_33);
                            var55_51.add(0, var5_5);
                            var36_34 = var5_5.k;
                            var27_26 = Math.max(var27_26, var36_34);
                            var71_73 += var73_75;
                            var46_42 /* !! */  = var1_1 /* !! */ ;
                            var36_34 = var19_18;
                            var25_24 = var73_75;
                            var19_18 = var74_76;
                            var10_9 = var76_78;
                            var3_3 = this;
                        }
                        var83_84 = var10_9;
                        var3_3 = var55_51;
                        var77_79 = var66_69 /* !! */ ;
                        var78_80 = var23_22;
                        var86_87 = var21_20;
                        var1_1 /* !! */  = var46_42 /* !! */ ;
                        var84_85 = var4_4;
                        var79_81 = var43_40;
                        var87_88 = var51_47;
                        var85_86 = 0;
                        var4_4 = null;
                        var81_82 /* !! */  = var14_13 /* !! */ ;
                        var82_83 = var48_44;
                        var24_23 = var36_34;
                        if (var71_73 >= var36_34) {
                            var36_34 = var71_73;
                        }
                        var36_34 -= var24_23;
                        var71_73 = var70_72 + var28_27;
                        if (var71_73 < 0) {
                            var21_20 = 0;
                            var20_19 = 0.0f;
                            var41_38 /* !! */  = null;
                        } else {
                            var21_20 = var71_73;
                        }
                        var10_9 = -var36_34;
                        var23_22 = var19_18;
                        var65_68 = 0;
                        var88_89 = 0.0f;
                        var55_51 = null;
                        var66_69 /* !! */  = 0;
                        var67_70 = 0.0f;
                        var56_52 = null;
                        while (var65_68 < (var16_15 = var3_3.c)) {
                            if (var10_9 >= var21_20) {
                                var3_3.c(var65_68);
                                var66_69 /* !! */  = 1;
                                var67_70 = 1.4E-45f;
                                continue;
                            }
                            var16_15 = 1;
                            var15_14 = 1.4E-45f;
                            var23_22 += var16_15;
                            var10_9 += var73_75;
                            var65_68 += var16_15;
                        }
                        var51_47 = var36_34;
                        var16_15 = var23_22;
                        var61_62 = var19_18;
                        var58_56 = var86_87;
                        var19_18 = var10_9;
                        var86_87 = var66_69 /* !! */ ;
                        while (var16_15 < var58_56) {
                            if (var19_18 >= var21_20 && var19_18 > 0 && (var36_34 = (int)var3_3.isEmpty()) == 0) {
                                var10_9 = var27_26;
                                var85_86 = var58_56;
                                var74_76 = var25_24;
                                var89_90 = var72_74;
                                var90_91 = var71_73;
                                var27_26 = var70_72;
                                var72_74 = var3_3;
                                var71_73 = var16_15;
                                var91_92 = var19_18;
                                break block131;
                            }
                            var92_93 /* !! */  = var84_85.getLayoutDirection();
                            var5_5 = var84_85;
                            var10_9 = var16_15;
                            var6_6 = var68_71;
                            var13_12 /* !! */  = var53_49 /* !! */ ;
                            var85_86 = var58_56;
                            var90_91 = var71_73;
                            var71_73 = var16_15;
                            var93_94 = var3_3;
                            var91_92 = var19_18;
                            var17_16 /* !! */  = var81_82 /* !! */ ;
                            var94_95 = var21_20;
                            var41_38 /* !! */  = var72_74;
                            var95_96 = var27_26;
                            var27_26 = var24_23;
                            var46_42 /* !! */  = var92_93 /* !! */ ;
                            var74_76 = var25_24;
                            var89_90 = var72_74;
                            var29_28 = var35_33;
                            var5_5 = sl2_0.a((es1)var84_85, var16_15, var68_71, (nl2_0)var53_49 /* !! */ , var32_30, (pg2_0)var81_82 /* !! */ , (Nc$c)var72_74, var92_93 /* !! */ , (boolean)var25_24, var35_33);
                            var21_20 = var58_56 + -1;
                            var25_24 = var16_15 == var21_20 ? var35_33 : var73_75;
                            var19_18 = var91_92 + var25_24;
                            if (var19_18 <= var27_26 && var71_73 != var21_20) {
                                var16_15 = var71_73 + 1;
                                var51_47 -= var73_75;
                                var61_62 = var16_15;
                                var72_74 = var93_94;
                                var86_87 = 1;
                            } else {
                                var91_92 = var5_5.k;
                                var10_9 = var95_96;
                                var91_92 = Math.max(var95_96, var91_92);
                                var72_74 = var93_94;
                                var93_94.addLast(var5_5);
                                var95_96 = var91_92;
                            }
                            var16_15 = var71_73 + 1;
                            var24_23 = var27_26;
                            var3_3 = var72_74;
                            var58_56 = var85_86;
                            var25_24 = var74_76;
                            var71_73 = var90_91;
                            var21_20 = var94_95;
                            var27_26 = var95_96;
                            var72_74 = var89_90;
                            var85_86 = 0;
                            var4_4 = null;
                        }
                        var10_9 = var27_26;
                        var85_86 = var58_56;
                        var74_76 = var25_24;
                        var89_90 = var72_74;
                        var90_91 = var71_73;
                        var72_74 = var3_3;
                        var71_73 = var16_15;
                        var91_92 = var19_18;
                        var27_26 = var70_72;
                    }
                    if (var91_92 < var27_26) {
                        var23_22 = var27_26 - var91_92;
                        var91_92 += var23_22;
                        var25_24 = var10_9;
                        var21_20 = var83_84;
                        for (var24_23 = var51_47 -= var23_22; var24_23 < var21_20 && var61_62 > 0; var24_23 += var73_75) {
                            var60_60 /* !! */  = var84_85.getLayoutDirection();
                            var5_5 = var84_85;
                            var10_9 = var61_62 += -1;
                            var6_6 = var68_71;
                            var13_12 /* !! */  = var53_49 /* !! */ ;
                            var17_16 /* !! */  = var81_82 /* !! */ ;
                            var96_97 = var21_20;
                            var41_38 /* !! */  = var89_90;
                            var83_84 = var24_23;
                            var46_42 /* !! */  = var60_60 /* !! */ ;
                            var94_95 = var71_73;
                            var71_73 = var25_24;
                            var25_24 = var74_76;
                            var70_72 = var27_26;
                            var34_31 = var72_74;
                            var29_28 = var35_33;
                            var5_5 = sl2_0.a((es1)var84_85, var61_62, var68_71, (nl2_0)var53_49 /* !! */ , var32_30, (pg2_0)var81_82 /* !! */ , (Nc$c)var89_90, var60_60 /* !! */ , (boolean)var74_76, var35_33);
                            var10_9 = 0;
                            var11_10 = 0.0f;
                            var12_11 /* !! */  = null;
                            var72_74.add(0, var5_5);
                            var36_34 = var5_5.k;
                            var25_24 = Math.max(var71_73, var36_34);
                            var71_73 = var94_95;
                        }
                        var70_72 = var27_26;
                        var96_97 = var21_20;
                        var83_84 = var24_23;
                        var34_31 = var72_74;
                        var94_95 = var71_73;
                        var71_73 = var25_24;
                        if (var24_23 < 0) {
                            var91_92 = var19_18 = var91_92 + var24_23;
                            var29_28 = 0;
                            var72_74 = null;
                        } else {
                            var29_28 = var24_23;
                        }
                    } else {
                        var70_72 = var27_26;
                        var34_31 = var72_74;
                        var94_95 = var71_73;
                        var96_97 = var83_84;
                        var71_73 = var10_9;
                        var29_28 = var51_47;
                    }
                    if (var29_28 < 0) break block136;
                    var25_24 = -var29_28;
                    var5_5 = (fl1_1)var34_31.first();
                    var24_23 = var87_88;
                    if (var96_97 <= 0 && var87_88 >= 0) {
                        var21_20 = var73_75;
                        var73_75 = var29_28;
                        var72_74 = var5_5;
                    } else {
                        block132: {
                            var10_9 = var34_31.c;
                            var65_68 = var29_28;
                            var29_28 = 0;
                            var72_74 = null;
                            while (var29_28 < var10_9 && var65_68 != 0) {
                                var21_20 = var73_75;
                                if (var73_75 <= var65_68 && var29_28 != (var66_69 /* !! */  = xx_2.h((List)var34_31))) {
                                    var65_68 -= var73_75;
                                    var36_34 = 1;
                                    var5_5 = (fl1_1)var34_31.get(var29_28 += var36_34);
                                    continue;
                                }
                                break block132;
                            }
                            var21_20 = var73_75;
                        }
                        var72_74 = var5_5;
                        var73_75 = var65_68;
                    }
                    var5_5 = var17_16 /* !! */ ;
                    var12_11 /* !! */  = var84_85;
                    var6_6 = var68_71;
                    var13_12 /* !! */  = var53_49 /* !! */ ;
                    var51_47 = var71_73;
                    var8_7 = var17_16 /* !! */ ;
                    var17_16 /* !! */  = var81_82 /* !! */ ;
                    var97_98 = var21_20;
                    var41_38 /* !! */  = var89_90;
                    var98_99 = var24_23;
                    var24_23 = var74_76;
                    var99_100 = var25_24;
                    var25_24 = var35_33;
                    var5_5((es1)var84_85, var68_71, (nl2_0)var53_49 /* !! */ , var32_30, (pg2_0)var81_82 /* !! */ , (Nc$c)var89_90, (boolean)var74_76, var35_33);
                    var36_34 = var61_62 - var78_80;
                    var12_11 /* !! */  = null;
                    var36_34 = Math.max(0, var36_34);
                    var10_9 = 1;
                    var11_10 = 1.4E-45f;
                    var65_68 = var61_62 + -1;
                    var21_20 = 0;
                    var20_19 = 0.0f;
                    var41_38 /* !! */  = null;
                    if (var36_34 <= var65_68) {
                        while (true) {
                            if (var41_38 /* !! */  == null) {
                                var41_38 /* !! */  = var12_11 /* !! */  = new ArrayList();
                            }
                            var12_11 /* !! */  = var65_68;
                            var12_11 /* !! */  = var8_7.invoke(var12_11 /* !! */ );
                            var41_38 /* !! */ .add(var12_11 /* !! */ );
                            if (var65_68 == var36_34) break;
                            var65_68 += -1;
                        }
                    }
                    var10_9 = var1_1 /* !! */ .size();
                    var88_89 = 0.0f;
                    var55_51 = null;
                    for (var65_68 = 0; var65_68 < var10_9; var65_68 += var66_69 /* !! */ ) {
                        var54_50 = var1_1 /* !! */ ;
                        var56_52 = (Number)var1_1 /* !! */ .get(var65_68);
                        var66_69 /* !! */  = var56_52.intValue();
                        if (var66_69 /* !! */  < var36_34) {
                            if (var41_38 /* !! */  == null) {
                                var41_38 /* !! */  = new ArrayList();
                            }
                            var56_52 = var66_69 /* !! */ ;
                            var56_52 = var8_7.invoke(var56_52);
                            var41_38 /* !! */ .add(var56_52);
                        }
                        var66_69 /* !! */  = 1;
                        var67_70 = 1.4E-45f;
                        var1_1 /* !! */  = var54_50;
                    }
                    var54_50 = var1_1 /* !! */ ;
                    if (var41_38 /* !! */  == null) {
                        var41_38 /* !! */  = mz0_2.a;
                    }
                    var8_7 = var41_38 /* !! */ ;
                    var36_34 = var41_38 /* !! */ .size();
                    var24_23 = var51_47;
                    var11_10 = 0.0f;
                    var12_11 /* !! */  = null;
                    for (var10_9 = 0; var10_9 < var36_34; var10_9 += var65_68) {
                        var55_51 = (fl1_1)var8_7.get(var10_9);
                        var65_68 = var55_51.k;
                        var24_23 = Math.max(var24_23, var65_68);
                        var65_68 = 1;
                        var88_89 = 1.4E-45f;
                    }
                    var21_20 = ((fl1_1)var34_31.last()).a;
                    var5_5 = var17_16 /* !! */ ;
                    var12_11 /* !! */  = var84_85;
                    var6_6 = var68_71;
                    var13_12 /* !! */  = var53_49 /* !! */ ;
                    var100_101 = var91_92;
                    var3_3 = var17_16 /* !! */ ;
                    var17_16 /* !! */  = var81_82 /* !! */ ;
                    var101_102 = var21_20;
                    var41_38 /* !! */  = var89_90;
                    var51_47 = var24_23;
                    var24_23 = var74_76;
                    var1_1 /* !! */  = var54_50;
                    var25_24 = var35_33;
                    var5_5((es1)var84_85, var68_71, (nl2_0)var53_49 /* !! */ , var32_30, (pg2_0)var81_82 /* !! */ , (Nc$c)var89_90, (boolean)var74_76, var35_33);
                    var36_34 = 1;
                    var10_9 = var85_86 + -1;
                    var10_9 = Math.min(var21_20 += var78_80, var10_9);
                    var21_20 = var101_102 + 1;
                    if (var21_20 <= var10_9) {
                        var36_34 = var21_20;
                        var21_20 = 0;
                        var20_19 = 0.0f;
                        var41_38 /* !! */  = null;
                        while (true) {
                            if (var41_38 /* !! */  == null) {
                                var41_38 /* !! */  = var55_51 = new ArrayList();
                            }
                            var55_51 = var36_34;
                            var55_51 = var3_3.invoke(var55_51);
                            var41_38 /* !! */ .add(var55_51);
                            var65_68 = 1;
                            var88_89 = 1.4E-45f;
                            if (var36_34 != var10_9) {
                                var36_34 += var65_68;
                                continue;
                            }
                            break;
                        }
                    } else {
                        var65_68 = 1;
                        var88_89 = 1.4E-45f;
                        var21_20 = 0;
                        var20_19 = 0.0f;
                        var41_38 /* !! */  = null;
                    }
                    var36_34 = var1_1 /* !! */ .size();
                    var67_70 = 0.0f;
                    var56_52 = null;
                    for (var66_69 /* !! */  = 0; var66_69 /* !! */  < var36_34; var66_69 /* !! */  += var65_68) {
                        var13_12 /* !! */  = var1_1 /* !! */ ;
                        var58_56 = var10_9 + 1;
                        var14_13 /* !! */  = (Number)var1_1 /* !! */ .get(var66_69 /* !! */ );
                        var16_15 = var14_13 /* !! */ .intValue();
                        if (var58_56 <= var16_15 && var16_15 < var85_86) {
                            if (var41_38 /* !! */  == null) {
                                var41_38 /* !! */  = new ArrayList();
                            }
                            var55_51 = var16_15;
                            var55_51 = var3_3.invoke(var55_51);
                            var41_38 /* !! */ .add(var55_51);
                        }
                        var65_68 = 1;
                        var88_89 = 1.4E-45f;
                        var1_1 /* !! */  = var13_12 /* !! */ ;
                    }
                    if (var41_38 /* !! */  == null) {
                        var41_38 /* !! */  = mz0_2.a;
                    }
                    var91_92 = var41_38 /* !! */ .size();
                    var24_23 = var51_47;
                    var5_5 = null;
                    for (var36_34 = 0; var36_34 < var91_92; var36_34 += var10_9) {
                        var12_11 /* !! */  = (fl1_1)var41_38 /* !! */ .get(var36_34);
                        var10_9 = var12_11 /* !! */ .k;
                        var24_23 = Math.max(var24_23, var10_9);
                        var10_9 = 1;
                        var11_10 = 1.4E-45f;
                    }
                    var3_3 = var34_31.first();
                    var91_92 = (int)Intrinsics.areEqual(var72_74, var3_3);
                    if (var91_92 != 0 && (var91_92 = (int)var8_7.isEmpty()) != 0 && (var91_92 = (int)var41_38 /* !! */ .isEmpty()) != 0) {
                        var91_92 = 1;
                    } else {
                        var91_92 = 0;
                        var3_3 = null;
                    }
                    var5_5 = pg2_0.Vertical;
                    var9_8 = var81_82 /* !! */ ;
                    if (var81_82 /* !! */  == var5_5) {
                        var66_69 /* !! */  = var24_23;
lbl625:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var66_69 /* !! */  = var100_101;
                    ** while (true)
                    var102_103 = var79_81;
                    var19_18 = f60.h(var66_69 /* !! */ , var79_81);
                    if (var9_8 == var5_5) {
                        var24_23 = var100_101;
                    }
                    var24_23 = f60.g(var24_23, var102_103);
                    var25_24 = var70_72;
                    var16_15 = var9_8 == var5_5 ? var24_23 : var19_18;
                    var36_34 = Math.min(var16_15, var25_24);
                    var23_22 = var100_101;
                    if (var100_101 < var36_34) {
                        var36_34 = 1;
                    } else {
                        var36_34 = 0;
                        var5_5 = null;
                    }
                    var10_9 = var99_100;
                    if (var36_34 != 0 && var99_100 != 0) {
                        var34_31 = hj0_0.a(var99_100, "non-zero pagesScrollOffset=");
                        var34_31 = var34_31.toString();
                        var3_3 = new IllegalStateException((String)var34_31);
                        throw var3_3;
                    }
                    var65_68 = var34_31.a();
                    var100_101 = var8_7.size() + var65_68;
                    var65_68 = var41_38 /* !! */ .size() + var100_101;
                    var56_52 = new ArrayList(var65_68);
                    if (var36_34 == 0) ** GOTO lbl743
                    var36_34 = (int)var8_7.isEmpty();
                    if (var36_34 != 0 && (var36_34 = (int)var41_38 /* !! */ .isEmpty()) != 0) {
                        var65_68 = var34_31.a();
                        var12_11 /* !! */  = new int[var65_68];
                        var5_5 = null;
                        for (var36_34 = 0; var36_34 < var65_68; ++var36_34) {
                            var12_11 /* !! */ [var36_34] = var35_33;
                        }
                        var5_5 = new int[var65_68];
                        var1_1 /* !! */  = var56_52;
                        var67_70 = 0.0f;
                        var56_52 = null;
                        for (var66_69 /* !! */  = 0; var66_69 /* !! */  < var65_68; ++var66_69 /* !! */ ) {
                            var70_72 = var65_68;
                            var88_89 = 0.0f;
                            var55_51 = null;
                            var5_5[var66_69 /* !! */ ] = false;
                        }
                        var70_72 = var65_68;
                        var100_101 = var23_22;
                        var56_52 = var84_85;
                        var65_68 = var98_99;
                        var22_21 = var84_85.D0(var98_99);
                        var87_88 = var98_99;
                        var40_37 = var25_24;
                        var60_60 /* !! */  = var72_74;
                        var25_24 = 0;
                        var54_50 = null;
                        var29_28 = 0;
                        var72_74 = null;
                        var55_51 = new zp$i(var22_21, false, null);
                        var13_12 /* !! */  = pg2_0.Vertical;
                        if (var9_8 == var13_12 /* !! */ ) {
                            var55_51.c((Vo0)var84_85, var16_15, (int[])var12_11 /* !! */ , (int[])var5_5);
                            var54_50 = var1_1 /* !! */ ;
                            var62_64 = var70_72;
                            var72_74 = var5_5;
                            var104_104 = var9_8;
                            var58_56 = var23_22;
                            var61_62 = var98_99;
                            var100_101 = var16_15;
                        } else {
                            var13_12 /* !! */  = bp1_0.Ltr;
                            var72_74 = var5_5;
                            var5_5 = var55_51;
                            var57_54 /* !! */  = var12_11 /* !! */ ;
                            var12_11 /* !! */  = var84_85;
                            var62_64 = var70_72;
                            var61_62 = var98_99;
                            var65_68 = var16_15;
                            var54_50 = var1_1 /* !! */ ;
                            var56_52 = var57_54 /* !! */ ;
                            var104_104 = var9_8;
                            var58_56 = var23_22;
                            var100_101 = var16_15;
                            var14_13 /* !! */  = var72_74;
                            var55_51.b((Vo0)var84_85, var16_15, (int[])var57_54 /* !! */ , (bp1_0)var13_12 /* !! */ , (int[])var72_74);
                        }
                        var5_5 = tp_2.B((int[])var72_74);
                        if (var74_76 != 0) {
                            var5_5 = kotlin.ranges.f.k((IntRange)var5_5);
                        }
                        var10_9 = var5_5.a;
                        var65_68 = var5_5.b;
                        var36_34 = var5_5.c;
                        if (var36_34 > 0 && var10_9 <= var65_68 || var36_34 < 0 && var65_68 <= var10_9) {
                            while (true) {
                                var66_69 /* !! */  = (int)var72_74[var10_9];
                                if (var74_76 == 0) {
                                    var23_22 = var10_9;
                                } else {
                                    var23_22 = var62_64 - var10_9;
                                    var16_15 = 1;
                                    var15_14 = 1.4E-45f;
                                    var23_22 -= var16_15;
                                }
                                var13_12 /* !! */  = (fl1_1)var34_31.get(var23_22);
                                if (var74_76 != 0) {
                                    var16_15 = var100_101 - var66_69 /* !! */ ;
                                    var66_69 /* !! */  = var13_12 /* !! */ .b;
                                    var66_69 /* !! */  = var16_15 - var66_69 /* !! */ ;
                                }
                                var13_12 /* !! */ .b(var66_69 /* !! */ , var19_18, var24_23);
                                var54_50.add((Object)var13_12 /* !! */ );
                                if (var10_9 != var65_68) {
                                    var10_9 += var36_34;
                                    continue;
                                }
                                break;
                            }
                        }
                    } else {
                        var3_3 = "No extra pages".toString();
                        var34_31 = new IllegalArgumentException((String)var3_3);
                        throw var34_31;
lbl743:
                        // 1 sources

                        var104_104 = var9_8;
                        var40_37 = var25_24;
                        var60_60 /* !! */  = var72_74;
                        var61_62 = var98_99;
                        var54_50 = var56_52;
                        var58_56 = var23_22;
                        var36_34 = var8_7.size();
                        var65_68 = var10_9;
                        var72_74 = null;
                        for (var29_28 = 0; var29_28 < var36_34; var29_28 += var66_69 /* !! */ ) {
                            var56_52 = (fl1_1)var8_7.get(var29_28);
                            var56_52.b(var65_68 -= var50_46, var19_18, var24_23);
                            var54_50.add(var56_52);
                            var66_69 /* !! */  = 1;
                            var67_70 = 1.4E-45f;
                        }
                        var66_69 /* !! */  = 1;
                        var67_70 = 1.4E-45f;
                        var36_34 = var34_31.a();
                        var72_74 = null;
                        for (var29_28 = 0; var29_28 < var36_34; var29_28 += var66_69 /* !! */ ) {
                            var55_51 = (fl1_1)var34_31.get(var29_28);
                            var55_51.b(var10_9, var19_18, var24_23);
                            var54_50.add(var55_51);
                            var10_9 += var50_46;
                        }
                        var36_34 = var41_38 /* !! */ .size();
                        var72_74 = null;
                        for (var29_28 = 0; var29_28 < var36_34; var29_28 += var66_69 /* !! */ ) {
                            var55_51 = (fl1_1)var41_38 /* !! */ .get(var29_28);
                            var55_51.b(var10_9, var19_18, var24_23);
                            var54_50.add(var55_51);
                            var10_9 += var50_46;
                        }
                    }
                    if (var91_92 != 0) {
                        var3_3 = var54_50;
                    } else {
                        var36_34 = var54_50.size();
                        var3_3 = new ArrayList(var36_34);
                        var36_34 = var54_50.size();
                        var72_74 = null;
                        for (var29_28 = 0; var29_28 < var36_34; var29_28 += var10_9) {
                            var55_51 = var12_11 /* !! */  = var54_50.get(var29_28);
                            var55_51 = (fl1_1)var12_11 /* !! */ ;
                            var66_69 /* !! */  = var55_51.a;
                            var13_12 /* !! */  = (fl1_1)var34_31.first();
                            var23_22 = var13_12 /* !! */ .a;
                            if (var66_69 /* !! */  >= var23_22) {
                                var56_52 = (fl1_1)var34_31.last();
                                var65_68 = var55_51.a;
                                var66_69 /* !! */  = var56_52.a;
                                if (var65_68 <= var66_69 /* !! */ ) {
                                    var3_3.add(var12_11 /* !! */ );
                                }
                            }
                            var10_9 = 1;
                            var11_10 = 1.4E-45f;
                        }
                    }
                    var36_34 = (int)var8_7.isEmpty();
                    if (var36_34 != 0) {
                        var5_5 = mz0_2.a;
                    } else {
                        var10_9 = var54_50.size();
                        var5_5 = new ArrayList(var10_9);
                        var10_9 = var54_50.size();
                        var72_74 = null;
                        for (var29_28 = 0; var29_28 < var10_9; var29_28 += var65_68) {
                            var56_52 = var55_51 = var54_50.get(var29_28);
                            var56_52 = (fl1_1)var55_51;
                            var66_69 /* !! */  = var56_52.a;
                            var13_12 /* !! */  = (fl1_1)var34_31.first();
                            var23_22 = var13_12 /* !! */ .a;
                            if (var66_69 /* !! */  < var23_22) {
                                var5_5.add(var55_51);
                            }
                            var65_68 = 1;
                            var88_89 = 1.4E-45f;
                        }
                    }
                    var10_9 = (int)var41_38 /* !! */ .isEmpty();
                    if (var10_9 != 0) {
                        var34_31 = mz0_2.a;
                    } else {
                        var65_68 = var54_50.size();
                        var12_11 /* !! */  = new ArrayList(var65_68);
                        var65_68 = var54_50.size();
                        var72_74 = null;
                        for (var29_28 = 0; var29_28 < var65_68; var29_28 += var66_69 /* !! */ ) {
                            var56_52 = var54_50.get(var29_28);
                            var13_12 /* !! */  = var56_52;
                            var13_12 /* !! */  = (fl1_1)var56_52;
                            var23_22 = var13_12 /* !! */ .a;
                            var14_13 /* !! */  = (fl1_1)var34_31.last();
                            var16_15 = var14_13 /* !! */ .a;
                            if (var23_22 > var16_15) {
                                var12_11 /* !! */ .add(var56_52);
                            }
                            var66_69 /* !! */  = 1;
                            var67_70 = 1.4E-45f;
                        }
                        var34_31 = var12_11 /* !! */ ;
                    }
                    var12_11 /* !! */  = pg2_0.Vertical;
                    var10_9 = (int)var3_3.isEmpty();
                    if (var10_9 != 0) {
                        var16_15 = 1;
                        var15_14 = 1.4E-45f;
                        var21_20 = 0;
                        var20_19 = 0.0f;
                        var41_38 /* !! */  = null;
                    } else {
                        var12_11 /* !! */  = var55_51 = var3_3.get(0);
                        var12_11 /* !! */  = (fl1_1)var55_51;
                        var10_9 = var12_11 /* !! */ .m;
                        var64_67.getClass();
                        var11_10 = -Math.abs((float)var10_9 - var82_83);
                        var66_69 /* !! */  = xx_2.h((List)var3_3);
                        var23_22 = 1;
                        var22_21 = 1.4E-45f;
                        if (var23_22 <= var66_69 /* !! */ ) {
                            var13_12 /* !! */  = var55_51;
                            var88_89 = var11_10;
                            var10_9 = 1;
                            var11_10 = 1.4E-45f;
                            while (true) {
                                var14_13 /* !! */  = var3_3.get(var10_9);
                                var41_38 /* !! */  = var14_13 /* !! */ ;
                                var41_38 /* !! */  = (fl1_1)var14_13 /* !! */ ;
                                var21_20 = var41_38 /* !! */ .m;
                                var20_19 = -Math.abs((float)var21_20 - var82_83);
                                var29_28 = Float.compare(var88_89, var20_19);
                                if (var29_28 < 0) {
                                    var13_12 /* !! */  = var14_13 /* !! */ ;
                                    var88_89 = var20_19;
                                }
                                var16_15 = 1;
                                var15_14 = 1.4E-45f;
                                if (var10_9 == var66_69 /* !! */ ) break;
                                var10_9 += var16_15;
                            }
                            var41_38 /* !! */  = var13_12 /* !! */ ;
                        } else {
                            var16_15 = 1;
                            var15_14 = 1.4E-45f;
                            var41_38 /* !! */  = var55_51;
                        }
                    }
                    var12_11 /* !! */  = var41_38 /* !! */ ;
                    var12_11 /* !! */  = (fl1_1)var41_38 /* !! */ ;
                    var64_67.getClass();
                    if (var12_11 /* !! */  != null) {
                        var29_28 = var12_11 /* !! */ .m;
                        var65_68 = var97_98;
                    } else {
                        var65_68 = var97_98;
                        var29_28 = 0;
                        var72_74 = null;
                    }
                    if (var65_68 == 0) {
                        var65_68 = 0;
                        var88_89 = 0.0f;
                        var55_51 = null;
                    } else {
                        var66_69 /* !! */  = 0;
                        var56_52 = null;
                        var29_28 = 0 - var29_28;
                        var67_70 = var29_28;
                        var88_89 = var65_68;
                        var67_70 /= var88_89;
                        var65_68 = -1090519040;
                        var23_22 = 0x3F000000;
                        var22_21 = 0.5f;
                        var88_89 = kotlin.ranges.f.f(var67_70, -0.5f, var22_21);
                    }
                    var56_52 = var19_18;
                    var13_12 /* !! */  = Integer.valueOf(var24_23);
                    var41_38 /* !! */  = var52_48;
                    var46_42 /* !! */  = var52_48.A;
                    var17_16 /* !! */  = new ol2_0(var54_50, (tr1_0)var46_42 /* !! */ );
                    var46_42 /* !! */  = var63_66;
                    var56_52 = (bl1_0)var63_66.invoke(var56_52, (Object)var13_12 /* !! */ , (Object)var17_16 /* !! */ );
                    var23_22 = var94_95;
                    if (var94_95 >= var85_86) {
                        var23_22 = var40_37;
                        if (var58_56 <= var40_37) {
                            var16_15 = 0;
                            var15_14 = 0.0f;
                            var14_13 /* !! */  = null;
                        }
                    }
                    var93_94 = var42_39 /* !! */ ;
                    var93_94 = (c80)var42_39 /* !! */ ;
                    var57_54 /* !! */  = var3_3;
                    var53_49 /* !! */  = var104_104;
                    var62_64 = var74_76;
                    var45_41 = var78_80;
                    var59_58 /* !! */  = var60_60 /* !! */ ;
                    var60_60 /* !! */  = var12_11 /* !! */ ;
                    var105_105 = var73_75;
                    var73_75 = var16_15;
                    var92_93 /* !! */  = var64_67;
                    var75_77 /* !! */  = var56_52;
                    var76_78 = var86_87;
                    var13_12 /* !! */  = new vl2((List)var3_3, var35_33, var61_62, var28_27, (pg2_0)var104_104, var77_79, var90_91, (boolean)var74_76, var78_80, (fl1_1)var59_58 /* !! */ , (fl1_1)var12_11 /* !! */ , var88_89, var105_105, (boolean)var16_15, var64_67, (bl1_0)var56_52, (boolean)var86_87, (List)var5_5, (List)var34_31, (c80)var93_94);
                    var12_11 /* !! */  = var13_12 /* !! */ ;
                    ** while (true)
                    var27_26 = 0;
                    var47_43 = 0.0f;
                    var34_31 = null;
                    var41_38 /* !! */ .h((vl2)var12_11 /* !! */ , false);
                    return var12_11 /* !! */ ;
                }
                var3_3 = "invalid currentFirstPageScrollOffset".toString();
                var34_31 = new IllegalArgumentException((String)var3_3);
                throw var34_31;
            }
            var3_3 = "negative afterContentPadding".toString();
            var34_31 = new IllegalArgumentException((String)var3_3);
            throw var34_31;
        }
        var3_3 = "negative beforeContentPadding".toString();
        var34_31 = new IllegalArgumentException((String)var3_3);
        throw var34_31;
    }
}

