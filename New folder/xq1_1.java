/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/*
 * Renamed from Xq1
 */
public final class xq1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ qr1_0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ mk2_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ mr1_2 h;
    public final /* synthetic */ zp$l i;
    public final /* synthetic */ zp$e j;
    public final /* synthetic */ i90_0 k;
    public final /* synthetic */ T01 l;

    public xq1_1(qr1_0 qr1_02, mk2_0 mk2_02, boolean bl2, hn1_2 hn1_22, mr1_2 mr1_22, zp$l zp$l, zp$e zp$e, c80 c802, T01 t01) {
        this.c = qr1_02;
        this.d = true;
        this.e = mk2_02;
        this.f = bl2;
        this.g = hn1_22;
        this.h = mr1_22;
        this.i = zp$l;
        this.j = zp$e;
        this.k = c802;
        this.l = t01;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block120: {
            block121: {
                block111: {
                    block113: {
                        block110: {
                            block112: {
                                block109: {
                                    block108: {
                                        var3_3 /* !! */  = this;
                                        var4_4 = var1_1 /* !! */ ;
                                        var4_4 = (es1)var1_1 /* !! */ ;
                                        var5_5 = var2_2;
                                        var6_6 = ((c60)var2_2).a;
                                        var8_7 = this.c;
                                        var5_5 = var8_7.q;
                                        var9_8 = var8_7.b;
                                        var5_5.getValue();
                                        var10_9 = this.d;
                                        var11_10 /* !! */  = var10_9 != 0 ? pg2_0.Vertical : pg2_0.Horizontal;
                                        QS.a(var6_6, var11_10 /* !! */ );
                                        var11_10 /* !! */  = var3_3 /* !! */ .e;
                                        if (var10_9 != 0) {
                                            var12_11 /* !! */  = var4_4.getLayoutDirection();
                                            var13_12 = var11_10 /* !! */ .calculateLeftPadding-u2uoSUM(var12_11 /* !! */ );
                                            var14_13 = var4_4.e0(var13_12);
                                        } else {
                                            var12_11 /* !! */  = var4_4.getLayoutDirection();
                                            var13_12 = androidx.compose.foundation.layout.h.c((mk2_0)var11_10 /* !! */ , var12_11 /* !! */ );
                                            var14_13 = var4_4.e0(var13_12);
                                        }
                                        if (var10_9 != 0) {
                                            var15_14 /* !! */  = var4_4.getLayoutDirection();
                                            var16_15 = var11_10 /* !! */ .calculateRightPadding-u2uoSUM((bp1_0)var15_14 /* !! */ );
                                            var17_16 = var4_4.e0(var16_15);
                                        } else {
                                            var15_14 /* !! */  = var4_4.getLayoutDirection();
                                            var16_15 = androidx.compose.foundation.layout.h.b((mk2_0)var11_10 /* !! */ , (bp1_0)var15_14 /* !! */ );
                                            var17_16 = var4_4.e0(var16_15);
                                        }
                                        var18_17 = var11_10 /* !! */ .calculateTopPadding-D9Ej5fM();
                                        var19_18 = var4_4.e0(var18_17);
                                        var20_19 = var11_10 /* !! */ .calculateBottomPadding-D9Ej5fM();
                                        var21_20 = var4_4.e0(var20_19);
                                        var22_21 = var19_18 + var21_20;
                                        var23_22 = var14_13 + var17_16;
                                        var24_23 = var10_9 != 0 ? var22_21 : var23_22;
                                        var25_24 = var3_3 /* !! */ .f;
                                        if (var10_9 != 0 && var25_24 == 0) {
                                            var17_16 = var19_18;
                                        } else if (var10_9 != 0 && var25_24 != 0) {
                                            var17_16 = var21_20;
                                        } else if (var10_9 == 0 && var25_24 == 0) {
                                            var17_16 = var14_13;
                                        }
                                        var26_25 = var24_23 - var17_16;
                                        var21_20 = -var23_22;
                                        var24_23 = -var22_21;
                                        var27_26 /* !! */  = var8_7;
                                        var28_27 /* !! */  = var9_8;
                                        var29_28 = f60.k(var21_20, var24_23, var6_6);
                                        var11_10 /* !! */  = var3_3 /* !! */ .g.invoke();
                                        var31_29 /* !! */  = var11_10 /* !! */ ;
                                        var31_29 /* !! */  = (kq1_1)var11_10 /* !! */ ;
                                        var11_10 /* !! */  = var31_29 /* !! */ .h();
                                        var32_30 /* !! */  = var3_3 /* !! */ .h.a(var6_6, (Vo0)var4_4);
                                        var33_32 = var17_16;
                                        var15_14 /* !! */  = (dr1_0[])var32_30 /* !! */ .a;
                                        var17_16 = var15_14 /* !! */ .length;
                                        var34_33 = var29_28;
                                        var36_34 = var11_10 /* !! */ .i;
                                        var37_35 = 0;
                                        var9_8 = null;
                                        if (var17_16 != var36_34) {
                                            var11_10 /* !! */ .i = var17_16;
                                            var8_7 = var11_10 /* !! */ .b;
                                            var8_7.clear();
                                            var38_36 = var17_16;
                                            var15_14 /* !! */  = new pr1$a(0, 0);
                                            var8_7.add(var15_14 /* !! */ );
                                            var11_10 /* !! */ .c = 0;
                                            var11_10 /* !! */ .d = 0;
                                            var11_10 /* !! */ .e = 0;
                                            var17_16 = -1;
                                            var16_15 = 0.0f / 0.0f;
                                            var11_10 /* !! */ .f = var17_16;
                                            var15_14 /* !! */  = var11_10 /* !! */ .g;
                                            var15_14 /* !! */ .clear();
                                        } else {
                                            var38_36 = var17_16;
                                        }
                                        var8_7 = var3_3 /* !! */ .j;
                                        var15_14 /* !! */  = var3_3 /* !! */ .i;
                                        if (var10_9 != 0) {
                                            if (var15_14 /* !! */  == null) {
                                                var40_38 = "null verticalArrangement when isVertical == true".toString();
                                                var32_30 /* !! */  = new IllegalArgumentException(var40_38);
                                                throw var32_30 /* !! */ ;
                                            }
                                            var39_37 = var15_14 /* !! */ .a();
                                        } else {
                                            if (var8_7 == null) {
                                                var3_3 /* !! */  = "null horizontalArrangement when isVertical == false".toString();
                                                var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                                                throw var32_30 /* !! */ ;
                                            }
                                            var39_37 = var8_7.a();
                                        }
                                        var41_40 = var4_4.e0(var39_37);
                                        var37_35 = var31_29 /* !! */ .getItemCount();
                                        var42_41 = var10_9 != 0 ? c60.h(var6_6) - var22_21 : c60.i(var6_6) - var23_22;
                                        var43_42 = var6_6;
                                        var45_43 = var42_41;
                                        if (var25_24 != 0 && var42_41 <= 0) {
                                            if (var10_9 == 0) {
                                                var14_13 += var42_41;
                                            }
                                            if (var10_9 != 0) {
                                                var19_18 += var45_43;
                                            }
                                            var46_44 = Ti1.a(var14_13, var19_18);
                                        } else {
                                            var46_44 = Ti1.a(var14_13, var19_18);
                                        }
                                        var49_46 = var3_3 /* !! */ .c;
                                        var14_13 = (int)var3_3 /* !! */ .f;
                                        var5_5 = var48_45;
                                        var50_47 = var11_10 /* !! */ ;
                                        var11_10 /* !! */  = var31_29 /* !! */ ;
                                        var12_11 /* !! */  = var4_4;
                                        var51_48 = var33_32;
                                        var52_49 = var15_14 /* !! */ ;
                                        var53_50 = var38_36;
                                        var17_16 = var41_40;
                                        var54_51 = var25_24;
                                        var40_39 = var31_29 /* !! */ ;
                                        var24_23 = var14_13;
                                        var55_52 = var23_22;
                                        var23_22 = var33_32;
                                        var56_53 = var22_21;
                                        var22_21 = var26_25;
                                        var57_54 = var8_7;
                                        var58_55 = var37_35;
                                        var33_32 = var45_43;
                                        var59_56 = var27_26 /* !! */ ;
                                        var3_3 /* !! */  = var28_27 /* !! */ ;
                                        var60_57 = var34_33;
                                        var29_28 = var46_44;
                                        var48_45 = new uq1_1((kq1_1)var31_29 /* !! */ , (es1)var4_4, var41_40, (qr1_0)var49_46, (boolean)var14_13, var51_48, var26_25, var46_44);
                                        var63_59 = var62_58;
                                        var64_60 = var32_30 /* !! */ ;
                                        var38_36 = var37_35;
                                        var42_41 = var41_40;
                                        var65_61 = var50_47;
                                        var62_58 = new vq1_0((lr1_1)var32_30 /* !! */ , var37_35, var41_40, (uq1_1)var48_45, (pr1_0)var50_47);
                                        var5_5 = var50_47;
                                        var32_30 /* !! */  = new wq1_0((pr1_0)var50_47, (vq1_0)var62_58);
                                        var11_10 /* !! */  = v83$a.a();
                                        if (var11_10 /* !! */  != null) {
                                            var12_11 /* !! */  = var11_10 /* !! */ .f();
                                        } else {
                                            var14_13 = 0;
                                            var13_12 = 0.0f;
                                            var12_11 /* !! */  = null;
                                        }
                                        var15_14 /* !! */  = v83$a.b((v83_0)var11_10 /* !! */ );
                                        try {
                                            var49_46 = var3_3 /* !! */ .a;
                                            var19_18 = var49_46.o();
                                            var31_29 /* !! */  = var3_3 /* !! */ .d;
                                            var24_23 = vn3_0.b(var19_18, (wr1_0)var40_39, var31_29 /* !! */ );
                                            if (var19_18 != var24_23) {
                                                var8_7 = var3_3 /* !! */ .a;
                                                var8_7.e(var24_23);
                                                var8_7 = var3_3 /* !! */ .e;
                                                var8_7.d(var19_18);
                                            }
                                            var37_35 = var58_55;
                                            if (var24_23 < var58_55 || var58_55 <= 0) break block108;
                                            var19_18 = 1;
                                            var18_17 = 1.4E-45f;
                                            var66_62 = var58_55 + -1;
                                            var66_62 = var5_5.c(var66_62);
                                            var36_34 = 0;
                                            var8_7 = null;
                                            break block109;
                                        }
                                        catch (Throwable var32_31) {
                                            break block110;
                                        }
                                    }
                                    var10_9 = var5_5.c(var24_23);
                                    var3_3 /* !! */  = var3_3 /* !! */ .b;
                                    var36_34 = var3_3 /* !! */ .o();
                                    var66_62 = var10_9;
                                }
                                var5_5 = Unit.a;
                                v83$a.e((v83_0)var11_10 /* !! */ , (v83_0)var15_14 /* !! */ , (Function1)var12_11 /* !! */ );
                                var5_5 = var59_56.o;
                                var11_10 /* !! */  = var59_56.l;
                                var31_29 /* !! */  = Fr1.a((wr1_0)var40_39, (ws1_0)var5_5, (Br1)var11_10 /* !! */ );
                                var18_17 = var59_56.e;
                                var5_5 = var12_11 /* !! */ ;
                                var11_10 /* !! */  = var4_4;
                                var67_63 = var12_11 /* !! */ ;
                                var68_64 = var43_42;
                                var70_65 = var18_17;
                                var19_18 = var55_52;
                                var64_60 = var31_29 /* !! */ ;
                                var24_23 = var56_53;
                                var12_11 /* !! */  = new tq1_2((es1)var4_4, var43_42, var55_52, var56_53);
                                var21_20 = var51_48;
                                if (var51_48 < 0) {
                                    var3_3 /* !! */  = "negative beforeContentPadding".toString();
                                    var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                                    throw var32_30 /* !! */ ;
                                }
                                if (var26_25 < 0) {
                                    var3_3 /* !! */  = "negative afterContentPadding".toString();
                                    var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                                    throw var32_30 /* !! */ ;
                                }
                                var31_29 /* !! */  = var59_56.k;
                                var12_11 /* !! */  = this;
                                var19_18 = (int)this.d;
                                var15_14 /* !! */  = this.k;
                                var5_5 = this.l;
                                var71_66 = 0xFFFFFFFFL;
                                var73_67 = 32;
                                var65_61 = var32_30 /* !! */ ;
                                var74_68 = var66_62;
                                var75_69 = 0L;
                                if (var37_35 > 0) break block112;
                                var23_22 = c60.k(var60_57);
                                var36_34 = c60.j(var60_57);
                                var77_70 = new ArrayList<E>();
                                var78_72 = var40_39.a();
                                var40_39 = var15_14 /* !! */ ;
                                var40_39 = (c80)var15_14 /* !! */ ;
                                var79_74 = null;
                                var57_54 = null;
                                var80_76 = null;
                                var81_78 = null;
                                var82_80 = var31_29 /* !! */ ;
                                var83_82 = var23_22;
                                var55_52 = var36_34;
                                var54_51 = var53_50;
                                var84_84 = var40_39;
                                var85_86 = var5_5;
                                var31_29 /* !! */ .d(0, var23_22, var36_34, var77_70, var78_72, (hs1_0)var48_45, (boolean)var19_18, false, var53_50, false, 0, 0, (c80)var40_39, (T01)var5_5);
                                var68_64 = var31_29 /* !! */ .b();
                                var86_88 = bj1.b(var68_64, var75_69);
                                if (var86_88 == 0) {
                                    var75_69 = var68_64 >> var73_67;
                                    var86_88 = f60.h((int)var75_69, var60_57);
                                    var66_62 = (int)(var68_64 &= var71_66);
                                    var36_34 = f60.g(var66_62, var60_57);
                                    var23_22 = var86_88;
                                }
                                var32_30 /* !! */  = var23_22;
                                var3_3 /* !! */  = var36_34;
                                var5_5 = ar1_2.c;
                                var31_29 /* !! */  = var32_30 /* !! */  = var67_63.invoke(var32_30 /* !! */ , var3_3 /* !! */ , var5_5);
                                var31_29 /* !! */  = (bl1_0)var32_30 /* !! */ ;
                                var32_30 /* !! */  = mz0_2.a;
                                var87_90 = -var21_20;
                                var88_92 = var33_32 + var26_25;
                                var3_3 /* !! */  = var19_18 != 0 ? pg2_0.Vertical : pg2_0.Horizontal;
                                var28_27 /* !! */  = var3_3 /* !! */ ;
                                var5_5 = var3_3 /* !! */ ;
                                var17_16 = 0;
                                var16_15 = 0.0f;
                                var15_14 /* !! */  = null;
                                var19_18 = 0;
                                var18_17 = 0.0f;
                                var49_46 = null;
                                var21_20 = 0;
                                var20_19 = 0.0f;
                                var11_10 /* !! */  = null;
                                var14_13 = 0;
                                var13_12 = 0.0f;
                                var12_11 /* !! */  = null;
                                var23_22 = 0;
                                var62_58 = null;
                                var89_94 = false;
                                var27_26 /* !! */  = null;
                                var67_63 = var40_39;
                                var8_7 = var4_4;
                                var37_35 = var53_50;
                                var4_4 = var65_61;
                                var40_39 = var59_56;
                                var59_56 = var32_30 /* !! */ ;
                                var32_30 /* !! */  = var3_3 /* !! */  = new cr1_0(null, 0, false, 0.0f, (bl1_0)var31_29 /* !! */ , false, (c80)var67_63, (Vo0)var8_7, var53_50, (Function1)var65_61, (List)var32_30 /* !! */ , var87_90, var88_92, 0, (pg2_0)var28_27 /* !! */ , var26_25, var41_40);
                                var3_3 /* !! */  = var40_39;
                                ** GOTO lbl877
                            }
                            var40_39 = var59_56;
                            var14_13 = Math.round(var18_17);
                            if (var66_62 == 0 && (var36_34 -= var14_13) < 0) {
                                var14_13 += var36_34;
                                var36_34 = 0;
                                var8_7 = null;
                            }
                            var59_56 = new fp_2();
                            var86_89 = -var21_20;
                            if (var41_40 < 0) {
                                var66_62 = var41_40;
                            } else {
                                var66_62 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var36_34 += (var66_62 += var86_89);
                            while (var36_34 < 0 && var74_68 > 0) {
                                var79_75 = var5_5;
                                var88_93 = 1;
                                var10_9 = var74_68 + -1;
                                var80_77 = var15_14 /* !! */ ;
                                var15_14 /* !! */  = var62_58.c(var10_9);
                                var51_48 = var86_89;
                                var32_30 /* !! */  = null;
                                var59_56.add(0, var15_14 /* !! */ );
                                var17_16 = var15_14 /* !! */ .h;
                                var36_34 += var17_16;
                                var74_68 = var10_9;
                                var15_14 /* !! */  = var80_77;
                            }
                            var51_48 = var86_89;
                            var79_75 = var5_5;
                            var80_77 = var15_14 /* !! */ ;
                            var86_89 = 0;
                            var32_30 /* !! */  = null;
                            if (var36_34 < var66_62) {
                                var14_13 += var36_34;
                                var36_34 = var66_62;
                            }
                            var36_34 -= var66_62;
                            var90_96 = var33_32 + var26_25;
                            if (var90_96 < 0) {
                                var10_9 = 0;
                                var91_97 = 0.0f;
                                var5_5 = null;
                            } else {
                                var10_9 = var90_96;
                            }
                            var17_16 = -var36_34;
                            var81_79 = var31_29 /* !! */ ;
                            var55_52 = var74_68;
                            var83_83 = 0;
                            var92_98 = 0.0f;
                            var50_47 = null;
                            break block113;
                        }
                        v83$a.e((v83_0)var11_10 /* !! */ , (v83_0)var15_14 /* !! */ , (Function1)var12_11 /* !! */ );
                        throw var32_31;
                    }
                    while (var86_89 < (var24_23 = var59_56.c)) {
                        if (var17_16 >= var10_9) {
                            var59_56.c(var86_89);
                            var83_83 = 1;
                            var92_98 = 1.4E-45f;
                            continue;
                        }
                        ++var55_52;
                        var31_29 /* !! */  = var93_99 = var59_56.get(var86_89);
                        var31_29 /* !! */  = (er1_0)var93_99;
                        var24_23 = var31_29 /* !! */ .h;
                        var17_16 += var24_23;
                        var24_23 = 1;
                        var86_89 += var24_23;
                    }
                    var94_100 = var83_83;
                    var24_23 = var55_52;
                    while (true) {
                        block119: {
                            block118: {
                                block117: {
                                    block115: {
                                        block116: {
                                            block114: {
                                                var32_30 /* !! */  = "<this>";
                                                if (var24_23 >= var37_35 || var17_16 >= var10_9 && var17_16 > 0 && (var83_83 = (int)var59_56.isEmpty()) == 0) break block114;
                                                var83_83 = var10_9;
                                                var5_5 = var62_58.c(var24_23);
                                                var96_102 = var67_63;
                                                var67_63 = var5_5.b;
                                                var95_101 = var40_39;
                                                var25_24 = ((Object)var67_63).length;
                                                if (var25_24 != 0) break block115;
                                                break block116;
                                            }
                                            var95_101 = var40_39;
                                            var96_102 = var67_63;
                                            var66_62 = 1;
                                            var25_24 = var33_32;
                                            break;
                                        }
                                        var25_24 = var33_32;
                                        var66_62 = 1;
                                        break;
                                    }
                                    var25_24 = var5_5.h;
                                    if ((var17_16 += var25_24) > var66_62) break block117;
                                    Intrinsics.checkNotNullParameter(var67_63, (String)var32_30 /* !! */ );
                                    var55_52 = var66_62;
                                    var66_62 = ((Object)var67_63).length;
                                    if (var66_62 == 0) {
                                        var32_30 /* !! */  = new NoSuchElementException("Array is empty.");
                                        throw var32_30 /* !! */ ;
                                    }
                                    Intrinsics.checkNotNullParameter(var67_63, (String)var32_30 /* !! */ );
                                    var86_89 = ((Object)var67_63).length;
                                    var66_62 = 1;
                                    var32_30 /* !! */  = var67_63[var86_89 -= var66_62];
                                    var86_89 = var32_30 /* !! */ .a;
                                    var22_21 = var37_35 + -1;
                                    if (var86_89 == var22_21) break block118;
                                    var86_89 = var24_23 + 1;
                                    var36_34 -= var25_24;
                                    var74_68 = var86_89;
                                    var66_62 = 1;
                                    var94_100 = 1;
                                    break block119;
                                }
                                var55_52 = var66_62;
                            }
                            var59_56.addLast(var5_5);
                            var66_62 = 1;
                        }
                        var24_23 += var66_62;
                        var10_9 = var83_83;
                        var66_62 = var55_52;
                        var67_63 = var96_102;
                        var40_39 = var95_101;
                    }
                    if (var17_16 >= var25_24) ** GOTO lbl-1000
                    var10_9 = var25_24 - var17_16;
                    var36_34 -= var10_9;
                    var17_16 += var10_9;
                    while (var36_34 < var21_20 && var74_68 > 0) {
                        var24_23 = var74_68 + -1;
                        var3_3 /* !! */  = var62_58.c(var24_23);
                        var22_21 = 0;
                        var97_103 = 0.0f;
                        var67_63 = null;
                        var59_56.add(0, var3_3 /* !! */ );
                        var66_62 = var3_3 /* !! */ .h;
                        var36_34 += var66_62;
                        var74_68 = var24_23;
                        var66_62 = 1;
                    }
                    var14_13 += var10_9;
                    if (var36_34 < 0) {
                        var14_13 += var36_34;
                        var66_62 = var17_16 += var36_34;
                        var36_34 = 0;
                        var8_7 = null;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var66_62 = var17_16;
                    }
                    var10_9 = Math.round(var70_65);
                    if (var10_9 < 0) {
                        var10_9 = -1;
                        var91_97 = 0.0f / 0.0f;
                    } else if (var10_9 > 0) {
                        var10_9 = 1;
                        var91_97 = 1.4E-45f;
                    } else {
                        var10_9 = 0;
                        var91_97 = 0.0f;
                        var5_5 = null;
                    }
                    if (var14_13 < 0) {
                        var17_16 = -1;
                        var16_15 = 0.0f / 0.0f;
                    } else if (var14_13 > 0) {
                        var17_16 = 1;
                        var16_15 = 1.4E-45f;
                    } else {
                        var17_16 = 0;
                        var16_15 = 0.0f;
                        var15_14 /* !! */  = null;
                    }
                    var97_103 = var10_9 == var17_16 && (var10_9 = Math.abs(Math.round(var70_65))) >= (var17_16 = Math.abs(var14_13)) ? (var91_97 = (float)var14_13) : var70_65;
                    if (var36_34 < 0) {
                        var3_3 /* !! */  = "negative initial offset".toString();
                        var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                        throw var32_30 /* !! */ ;
                    }
                    var10_9 = -var36_34;
                    var12_11 /* !! */  = (er1_0)var59_56.first();
                    var15_14 /* !! */  = (dr1_0)tp_2.A(var12_11 /* !! */ .b);
                    if (var15_14 /* !! */  != null) {
                        var24_23 = var17_16 = var15_14 /* !! */ .a;
                    } else {
                        var24_23 = 0;
                        var31_29 /* !! */  = null;
                    }
                    var15_14 /* !! */  = (er1_0)var59_56.g();
                    if (var15_14 /* !! */  == null || (var15_14 /* !! */  = var15_14 /* !! */ .b) == null) ** GOTO lbl-1000
                    Intrinsics.checkNotNullParameter(var15_14 /* !! */ , (String)var32_30 /* !! */ );
                    var86_89 = var15_14 /* !! */ .length;
                    if (var86_89 == 0) {
                        var86_89 = 0;
                        var32_30 /* !! */  = null;
                    } else {
                        var86_89 = var15_14 /* !! */ .length;
                        var88_93 = 1;
                        var32_30 /* !! */  = var15_14 /* !! */ [var86_89 += -1];
                    }
                    if (var32_30 /* !! */  != null) {
                        var86_89 = var32_30 /* !! */ .a;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var86_89 = 0;
                        var32_30 /* !! */  = null;
                    }
                    var17_16 = var64_60.size();
                    var1_1 /* !! */  = var12_11 /* !! */ ;
                    var74_68 = var36_34;
                    var14_13 = 0;
                    var13_12 = 0.0f;
                    var12_11 /* !! */  = null;
                    var70_65 = 0.0f;
                    var63_59 = null;
                    while (true) {
                        var8_7 = var62_58.f;
                        if (var14_13 >= var17_16) break;
                        var98_104 = var17_16;
                        var15_14 /* !! */  = var64_60;
                        var64_60 = (Number)var64_60.get(var14_13);
                        var99_105 = var97_103;
                        var22_21 = var64_60.intValue();
                        if (var22_21 >= 0 && var22_21 < var24_23) {
                            var100_106 = var24_23;
                            var24_23 = var8_7.i;
                            var24_23 = var8_7.e(var22_21);
                            var8_7 = null;
                            var101_107 = var62_58.a(0, var24_23);
                            var36_34 = var48_45.c;
                            var56_53 = 0;
                            var77_71 = null;
                            var50_47 = var48_45;
                            var55_52 = var22_21;
                            var31_29 /* !! */  = var48_45.c(var22_21, 0, var24_23, var36_34, var101_107);
                            if (var63_59 == null) {
                                var63_59 = new ArrayList();
                            }
                            var67_63 = var63_59;
                            var63_59.add(var31_29 /* !! */ );
                        } else {
                            var100_106 = var24_23;
                        }
                        var24_23 = 1;
                        var14_13 += var24_23;
                        var24_23 = var100_106;
                        var97_103 = var99_105;
                        var64_60 = var15_14 /* !! */ ;
                        var17_16 = var98_104;
                    }
                    var99_105 = var97_103;
                    var15_14 /* !! */  = var64_60;
                    var100_106 = var24_23;
                    if (var63_59 == null) {
                        var63_59 = mz0_2.a;
                    }
                    var67_63 = var63_59;
                    var14_13 = var15_14 /* !! */ .size();
                    var63_59 = var4_4;
                    var24_23 = 0;
                    var31_29 /* !! */  = null;
                    var4_4 = null;
                    for (var103_108 = 0; var103_108 < var14_13; var103_108 += var14_13) {
                        var50_47 = (Number)var15_14 /* !! */ .get(var103_108);
                        var58_55 = var14_13;
                        var14_13 = var50_47.intValue();
                        var84_85 = var15_14 /* !! */ ;
                        var88_93 = 1;
                        var17_16 = var86_89 + 1;
                        if (var17_16 <= var14_13 && var14_13 < var37_35) {
                            var17_16 = var8_7.i;
                            var17_16 = var8_7.e(var14_13);
                            var85_87 = var8_7;
                            var8_7 = null;
                            var101_107 = var62_58.a(0, var17_16);
                            var36_34 = var48_45.c;
                            var56_53 = 0;
                            var77_71 = null;
                            var50_47 = var48_45;
                            var55_52 = var14_13;
                            var12_11 /* !! */  = var48_45.c(var14_13, 0, var17_16, var36_34, var101_107);
                            if (var31_29 /* !! */  == null) {
                                var31_29 /* !! */  = new ArrayList();
                            }
                            var31_29 /* !! */ .add(var12_11 /* !! */ );
                        } else {
                            var85_87 = var8_7;
                        }
                        var14_13 = 1;
                        var13_12 = 1.4E-45f;
                        var14_13 = var58_55;
                        var15_14 /* !! */  = var84_85;
                        var8_7 = var85_87;
                    }
                    if (var31_29 /* !! */  == null) {
                        var31_29 /* !! */  = mz0_2.a;
                    }
                    var62_58 = var31_29 /* !! */ ;
                    if (var21_20 <= 0 && var41_40 >= 0) {
                        var8_7 = var1_1 /* !! */ ;
                        var103_108 = var74_68;
                    } else {
                        var21_20 = var59_56.c;
                        var12_11 /* !! */  = var1_1 /* !! */ ;
                        var36_34 = var74_68;
                        var17_16 = 0;
                        var16_15 = 0.0f;
                        var15_14 /* !! */  = null;
                        while (var17_16 < var21_20) {
                            var31_29 /* !! */  = (er1_0)var59_56.get(var17_16);
                            var24_23 = var31_29 /* !! */ .h;
                            if (var36_34 == 0 || var24_23 > var36_34 || var17_16 == (var103_108 = xx_2.h((List)var59_56))) break;
                            var36_34 -= var24_23;
                            var14_13 = 1;
                            var13_12 = 1.4E-45f;
                            var12_11 /* !! */  = (er1_0)var59_56.get(var17_16 += var14_13);
                        }
                        var103_108 = var36_34;
                        var8_7 = var12_11 /* !! */ ;
                    }
                    if (var19_18 != 0) {
                        var24_23 = var21_20 = c60.i(var60_57);
                        var68_64 = var60_57;
                    } else {
                        var68_64 = var60_57;
                        var24_23 = var21_20 = f60.h(var66_62, var60_57);
                    }
                    var21_20 = var19_18 != 0 ? f60.g(var66_62, var68_64) : c60.h(var68_64);
                    var58_55 = var21_20;
                    var1_1 /* !! */  = var8_7;
                    var36_34 = var19_18 != 0 ? var21_20 : var24_23;
                    var21_20 = Math.min(var36_34, var25_24);
                    if (var66_62 < var21_20) {
                        var21_20 = 1;
                        var20_19 = 1.4E-45f;
                    } else {
                        var21_20 = 0;
                        var20_19 = 0.0f;
                        var11_10 /* !! */  = null;
                    }
                    if (var21_20 != 0 && var10_9 != 0) {
                        var3_3 /* !! */  = "non-zero firstLineScrollOffset".toString();
                        var32_30 /* !! */  = new IllegalStateException((String)var3_3 /* !! */ );
                        throw var32_30 /* !! */ ;
                    }
                    var89_95 = var10_9;
                    var10_9 = var59_56.a();
                    var104_109 = var68_64;
                    var13_12 = 0.0f;
                    var12_11 /* !! */  = null;
                    var17_16 = 0;
                    var16_15 = 0.0f;
                    var15_14 /* !! */  = null;
                    for (var14_13 = 0; var14_13 < var10_9; var17_16 += var10_9, ++var14_13) {
                        var28_27 /* !! */  = var59_56.get(var14_13);
                        var74_68 = var10_9;
                        var5_5 = var28_27 /* !! */ ;
                        var5_5 = ((er1_0)var28_27 /* !! */ ).b;
                        var10_9 = ((dr1_0[])var5_5).length;
                        var91_97 = 1.4E-45f;
                        var10_9 = var74_68;
                    }
                    var12_11 /* !! */  = new ArrayList(var17_16);
                    if (var21_20 != 0) {
                        var10_9 = (int)var67_63.isEmpty();
                        if (var10_9 != 0 && (var10_9 = (int)var62_58.isEmpty()) != 0) {
                            var17_16 = var59_56.a();
                            var11_10 /* !! */  = (pg2_0)new int[var17_16];
                            var91_97 = 0.0f;
                            var5_5 = null;
                            break block111;
                        } else {
                            var3_3 /* !! */  = "no items".toString();
                            var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                            throw var32_30 /* !! */ ;
                        }
                    }
                    var107_111 = var86_89;
                    var106_110 = var25_24;
                    var40_39 = var12_11 /* !! */ ;
                    var108_112 = var19_18;
                    var28_27 /* !! */  = var63_59;
                    var109_113 = var100_106;
                    var63_59 = var79_75;
                    var110_114 = var104_109;
                    var79_75 = var80_77;
                    var64_60 = var81_79;
                    var86_89 = var58_55;
                    var58_55 = var37_35;
                    var37_35 = var24_23;
                    var10_9 = var67_63.size();
                    var21_20 = -1;
                    var20_19 = 0.0f / 0.0f;
                    if ((var10_9 += var21_20) < 0) break block120;
                    var14_13 = var89_95;
                    break block121;
                }
                for (var10_9 = 0; var10_9 < var17_16; ++var10_9) {
                    if (var54_51 == 0) {
                        var28_27 /* !! */  = var12_11 /* !! */ ;
                        var88_93 = 1;
                        var14_13 = var10_9;
                    } else {
                        var89_95 = var17_16 - var10_9;
                        var88_93 = 1;
                        var28_27 /* !! */  = var12_11 /* !! */ ;
                        var14_13 = var89_95 += -1;
                    }
                    var14_13 = ((er1_0)var59_56.get((int)var14_13)).g;
                    var11_10 /* !! */ [var10_9] = (pg2_0)var14_13;
                    var12_11 /* !! */  = var28_27 /* !! */ ;
                }
                var28_27 /* !! */  = var12_11 /* !! */ ;
                var88_93 = 1;
                var12_11 /* !! */  = (bp1_0)new int[var17_16];
                var91_97 = 0.0f;
                var5_5 = null;
                for (var10_9 = 0; var10_9 < var17_16; ++var10_9) {
                    var89_95 = 0;
                    var27_26 /* !! */  = null;
                    var12_11 /* !! */ [var10_9] = (bp1_0)false;
                    var88_93 = 1;
                }
                if (var19_18 != 0) {
                    var5_5 = var52_49;
                    if (var52_49 == null) {
                        var3_3 /* !! */  = "null verticalArrangement".toString();
                        var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                        throw var32_30 /* !! */ ;
                    }
                    var106_110 = var25_24;
                    var40_39 = var63_59;
                    var52_49.c((Vo0)var63_59, var36_34, (int[])var11_10 /* !! */ , (int[])var12_11 /* !! */ );
                    var107_111 = var86_89;
                    var82_81 /* !! */  = var12_11 /* !! */ ;
                    var108_112 = var19_18;
                    var109_113 = var100_106;
                    var63_59 = var79_75;
                    var110_114 = var104_109;
                    var79_75 = var80_77;
                    var64_60 = var81_79;
                    var86_89 = var58_55;
                    var83_83 = var17_16;
                    var58_55 = var37_35;
                    var37_35 = var24_23;
                    var112_115 /* !! */  = var28_27 /* !! */ ;
                    var28_27 /* !! */  = var40_39;
                    var40_39 = var112_115 /* !! */ ;
                } else {
                    var106_110 = var25_24;
                    var40_39 = var63_59;
                    if (var57_54 == null) {
                        var3_3 /* !! */  = "null horizontalArrangement".toString();
                        var32_30 /* !! */  = new IllegalArgumentException((String)var3_3 /* !! */ );
                        throw var32_30 /* !! */ ;
                    }
                    var27_26 /* !! */  = bp1_0.Ltr;
                    var63_59 = var79_75;
                    var5_5 = var57_54;
                    var107_111 = var86_89;
                    var113_116 /* !! */  = var11_10 /* !! */ ;
                    var86_89 = var58_55;
                    var11_10 /* !! */  = var40_39;
                    var82_81 /* !! */  = var12_11 /* !! */ ;
                    var110_114 = var104_109;
                    var112_115 /* !! */  = var28_27 /* !! */ ;
                    var28_27 /* !! */  = var40_39;
                    var40_39 = var112_115 /* !! */ ;
                    var14_13 = var36_34;
                    var83_83 = var17_16;
                    var79_75 = var80_77;
                    var15_14 /* !! */  = var113_116 /* !! */ ;
                    var108_112 = var19_18;
                    var49_46 = var27_26 /* !! */ ;
                    var58_55 = var37_35;
                    var109_113 = var100_106;
                    var64_60 = var81_79;
                    var37_35 = var24_23;
                    var31_29 /* !! */  = var12_11 /* !! */ ;
                    var57_54.b((Vo0)var11_10 /* !! */ , var36_34, (int[])var113_116 /* !! */ , (bp1_0)var27_26 /* !! */ , (int[])var12_11 /* !! */ );
                }
                var5_5 = tp_2.B((int[])var82_81 /* !! */ );
                if (var54_51 != 0) {
                    var5_5 = kotlin.ranges.f.k((IntRange)var5_5);
                }
                var21_20 = var5_5.a;
                var14_13 = var5_5.b;
                var10_9 = var5_5.c;
                if (var10_9 > 0 && var21_20 <= var14_13 || var10_9 < 0 && var14_13 <= var21_20) {
                    while (true) {
                        var17_16 = (int)var82_81 /* !! */ [var21_20];
                        if (var54_51 == 0) {
                            var19_18 = var21_20;
                        } else {
                            var19_18 = var83_83 - var21_20;
                            var24_23 = 1;
                            var19_18 -= var24_23;
                        }
                        var49_46 = (er1_0)var59_56.get(var19_18);
                        if (var54_51 != 0) {
                            var17_16 = var36_34 - var17_16;
                            var24_23 = var49_46.g;
                            var17_16 -= var24_23;
                        }
                        var15_14 /* !! */  = var49_46.a(var17_16, var37_35, var86_89);
                        var19_18 = var15_14 /* !! */ .length;
                        var31_29 /* !! */  = null;
                        for (var24_23 = 0; var24_23 < var19_18; ++var24_23) {
                            var89_95 = var19_18;
                            var49_46 = var15_14 /* !! */ [var24_23];
                            var40_39.add(var49_46);
                            var18_17 = 1.4E-45f;
                        }
                        if (var21_20 == var14_13) break;
                        var21_20 += var10_9;
                    }
                }
                while (true) {
                    var18_17 = var99_105;
                    var10_9 = (int)var99_105;
                    var11_10 /* !! */  = var48_45.a;
                    var78_73 = var11_10 /* !! */ .a();
                    var8_7 = var79_75;
                    var8_7 = (c80)var79_75;
                    var57_54 = null;
                    var82_81 /* !! */  = var64_60;
                    var83_83 = var37_35;
                    var55_52 = var86_89;
                    var77_71 = var40_39;
                    var54_51 = var53_50;
                    var84_85 = var8_7;
                    var85_87 = var63_59;
                    var64_60.d(var10_9, var37_35, var86_89, (ArrayList)var40_39, var78_73, (hs1_0)var48_45, (boolean)var108_112, false, var53_50, false, var103_108, var66_62, (c80)var8_7, (T01)var63_59);
                    var114_117 = var64_60.b();
                    var68_64 = 0L;
                    var14_13 = (int)bj1.b(var114_117, var68_64);
                    if (var14_13 == 0) {
                        var24_23 = var108_112 != 0 ? var86_89 : var37_35;
                        var68_64 = var114_117 >> var73_67;
                        var17_16 = (int)var68_64;
                        var14_13 = Math.max(var37_35, var17_16);
                        var6_6 = var110_114;
                        var14_13 = f60.h(var14_13, var110_114);
                        var21_20 = (int)(var114_117 &= var71_66);
                        var86_89 = Math.max(var86_89, var21_20);
                        var21_20 = f60.g(var86_89, var110_114);
                        var86_89 = var108_112 != 0 ? var21_20 : var14_13;
                        if (var86_89 != var24_23) {
                            var10_9 = var40_39.size();
                            var9_8 = null;
                            for (var37_35 = 0; var37_35 < var10_9; var37_35 += var17_16) {
                                var15_14 /* !! */  = (dr1_0)var40_39.get(var37_35);
                                var15_14 /* !! */ .r = var86_89;
                                var15_14 /* !! */ .t = var24_23 = var15_14 /* !! */ .h + var86_89;
                                var17_16 = 1;
                                var16_15 = 1.4E-45f;
                            }
                        }
                        var17_16 = 1;
                        var16_15 = 1.4E-45f;
                        var24_23 = var14_13;
                    } else {
                        var17_16 = 1;
                        var16_15 = 1.4E-45f;
                        var21_20 = var86_89;
                        var24_23 = var37_35;
                    }
                    var37_35 = var58_55 + -1;
                    var86_89 = var107_111;
                    if (var107_111 != var37_35) ** GOTO lbl-1000
                    var10_9 = var106_110;
                    if (var66_62 <= var106_110) {
                        var17_16 = 0;
                        var16_15 = 0.0f;
                        var15_14 /* !! */  = null;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var17_16 = 1;
                        var16_15 = 1.4E-45f;
                    }
                    var3_3 /* !! */  = var24_23;
                    var5_5 = var21_20;
                    var48_45 = var95_101;
                    var12_11 /* !! */  = var95_101.p;
                    var11_10 /* !! */  = new br1_1((ArrayList)var40_39, (tr1_0)var12_11 /* !! */ );
                    var12_11 /* !! */  = var96_102;
                    var31_29 /* !! */  = var3_3 /* !! */  = var96_102.invoke(var3_3 /* !! */ , var5_5, (Object)var11_10 /* !! */ );
                    var31_29 /* !! */  = (bl1_0)var3_3 /* !! */ ;
                    var66_62 = (int)var67_63.isEmpty();
                    if (var66_62 != 0 && (var66_62 = (int)var62_58.isEmpty()) != 0) {
                        var59_56 = var40_39;
                    } else {
                        var10_9 = var40_39.size();
                        var3_3 /* !! */  = new ArrayList(var10_9);
                        var10_9 = var40_39.size();
                        var9_8 = null;
                        for (var37_35 = 0; var37_35 < var10_9; var37_35 += var21_20) {
                            var11_10 /* !! */  = var40_39.get(var37_35);
                            var12_11 /* !! */  = var11_10 /* !! */ ;
                            var12_11 /* !! */  = (dr1_0)var11_10 /* !! */ ;
                            var14_13 = var12_11 /* !! */ .a;
                            var23_22 = var109_113;
                            if (var109_113 <= var14_13 && var14_13 <= var86_89) {
                                var3_3 /* !! */ .add(var11_10 /* !! */ );
                            }
                            var21_20 = 1;
                            var20_19 = 1.4E-45f;
                            var109_113 = var23_22;
                        }
                        var59_56 = var3_3 /* !! */ ;
                    }
                    var32_30 /* !! */  = var108_112 != 0 ? pg2_0.Vertical : pg2_0.Horizontal;
                    var5_5 = var3_3 /* !! */ ;
                    var11_10 /* !! */  = var1_1 /* !! */ ;
                    var14_13 = var103_108;
                    var23_22 = var94_100;
                    var67_63 = var8_7;
                    var8_7 = var28_27 /* !! */ ;
                    var25_24 = var58_55;
                    var37_35 = var53_50;
                    var4_4 = var65_61;
                    var1_1 /* !! */  = var3_3 /* !! */ ;
                    var3_3 /* !! */  = var48_45;
                    var87_91 = var51_48;
                    var88_93 = var90_96;
                    var89_95 = var58_55;
                    var28_27 /* !! */  = var32_30 /* !! */ ;
                    var5_5((er1_0)var11_10 /* !! */ , var103_108, (boolean)var17_16, var18_17, (bl1_0)var31_29 /* !! */ , (boolean)var94_100, (c80)var67_63, (Vo0)var8_7, var53_50, (Function1)var65_61, (List)var59_56, var51_48, var90_96, var58_55, (pg2_0)var32_30 /* !! */ , var26_25, var41_40);
                    var32_30 /* !! */  = var5_5;
lbl877:
                    // 2 sources

                    var25_24 = 0;
                    var40_39 = null;
                    var3_3 /* !! */ .f((cr1_0)var32_30 /* !! */ , false);
                    return var32_30 /* !! */ ;
                }
            }
            while (true) {
                var17_16 = var10_9 + -1;
                var5_5 = (dr1_0)var67_63.get(var10_9);
                var19_18 = var5_5.q;
                var14_13 -= var19_18;
                var19_18 = 0;
                var18_17 = 0.0f;
                var49_46 = null;
                var5_5.h(var14_13, 0, var37_35, var86_89);
                var40_39.add(var5_5);
                if (var17_16 < 0) break;
                var10_9 = var17_16;
            }
        }
        var10_9 = var59_56.a();
        var21_20 = var89_95;
        var13_12 = 0.0f;
        var12_11 /* !! */  = null;
        for (var14_13 = 0; var14_13 < var10_9; var21_20 += var17_16, ++var14_13) {
            var15_14 /* !! */  = (er1_0)var59_56.get(var14_13);
            var49_46 = var15_14 /* !! */ .a(var21_20, var37_35, var86_89);
            var24_23 = ((dr1_0[])var49_46).length;
            var8_7 = null;
            for (var36_34 = 0; var36_34 < var24_23; ++var36_34) {
                var89_95 = var10_9;
                var5_5 = var49_46[var36_34];
                var40_39.add(var5_5);
                var91_97 = 1.4E-45f;
            }
            var89_95 = var10_9;
            var91_97 = 1.4E-45f;
            var17_16 = var15_14 /* !! */ .h;
        }
        var10_9 = var62_58.size();
        var14_13 = 0;
        var13_12 = 0.0f;
        var12_11 /* !! */  = null;
        while (true) {
            if (var14_13 >= var10_9) ** continue;
            var15_14 /* !! */  = (dr1_0)var62_58.get(var14_13);
            var19_18 = 0;
            var18_17 = 0.0f;
            var49_46 = null;
            var15_14 /* !! */ .h(var21_20, 0, var37_35, var86_89);
            var40_39.add(var15_14 /* !! */ );
            var17_16 = var15_14 /* !! */ .q;
            var21_20 += var17_16;
            var17_16 = 1;
            var16_15 = 1.4E-45f;
            var14_13 += var17_16;
        }
    }
}

