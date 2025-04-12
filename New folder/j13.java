/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

public final class j13 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean a(Cg2 var0, float var1_1, float var2_2, gn2 var3_3, gn2 var4_4) {
        block15: {
            block9: {
                block11: {
                    block12: {
                        block14: {
                            block13: {
                                block10: {
                                    var5_5 = var0;
                                    var6_6 = var1_1;
                                    var7_7 = var2_2;
                                    var8_8 = var3_3;
                                    var9_9 = var4_4;
                                    var10_10 /* !! */  = var0 instanceof Cg2$b;
                                    var11_11 /* !! */  = 0;
                                    var12_12 = 0.0f;
                                    if (var10_10 /* !! */  == 0) break block10;
                                    var5_5 = ((Cg2$b)var0).a;
                                    var13_13 = var5_5.a;
                                    cfr_temp_0 = var13_13 - var1_1;
                                    var14_15 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                    if (var14_15 /* !! */  <= 0 && (var15_17 = (cfr_temp_1 = var1_1 - (var13_13 = var5_5.c)) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) < 0 && (var15_17 = (cfr_temp_2 = (var6_6 = var5_5.b) - var2_2) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1)) <= 0 && (var17_23 = (cfr_temp_3 = var2_2 - (var16_18 = var5_5.d)) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1)) < 0) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var11_11 /* !! */  = 1;
                                            var12_12 = 1.4E-45f;
                                            ** GOTO lbl115
                                            break;
                                        }
                                    }
                                    break block9;
                                }
                                var10_10 /* !! */  = var0 instanceof Cg2$c;
                                if (var10_10 /* !! */  == 0) break block11;
                                var5_5 = ((Cg2$c)var0).a;
                                var18_25 = var5_5.a;
                                cfr_temp_4 = var1_1 - var18_25;
                                var10_10 /* !! */  = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                                if (var10_10 /* !! */  < 0 || (var19_26 = (cfr_temp_5 = var1_1 - (var18_25 = var5_5.c)) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1)) >= 0 || (var21_28 = (cfr_temp_6 = var2_2 - (var20_27 = var5_5.b)) == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1)) < 0 || (var23_30 = (cfr_temp_7 = var2_2 - (var22_29 = var5_5.d)) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1)) >= 0) break block9;
                                var24_31 = var5_5.e;
                                var12_12 = r90_0.b(var24_31);
                                var26_32 = var5_5.f;
                                var28_33 = r90_0.b(var26_32) + var12_12;
                                cfr_temp_8 = var28_33 - (var12_12 = var5_5.b());
                                var11_11 /* !! */  = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 < 0.0f ? -1 : 1));
                                if (var11_11 /* !! */  > 0) break block12;
                                var29_34 = var5_5.h;
                                var12_12 = r90_0.b(var29_34);
                                var31_35 = var5_5.g;
                                var33_36 = r90_0.b(var31_35) + var12_12;
                                cfr_temp_9 = var33_36 - (var12_12 = var5_5.b());
                                var11_11 /* !! */  = (int)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 < 0.0f ? -1 : 1));
                                if (var11_11 /* !! */  > 0) break block12;
                                var12_12 = r90_0.c(var24_31);
                                var33_36 = r90_0.c(var29_34) + var12_12;
                                cfr_temp_10 = var33_36 - (var12_12 = var5_5.a());
                                var11_11 /* !! */  = (int)(cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 < 0.0f ? -1 : 1));
                                if (var11_11 /* !! */  > 0) break block12;
                                var12_12 = r90_0.c(var26_32);
                                var33_36 = r90_0.c(var31_35) + var12_12;
                                cfr_temp_11 = var33_36 - (var12_12 = var5_5.a());
                                var11_11 /* !! */  = (int)(cfr_temp_11 == 0.0f ? 0 : (cfr_temp_11 < 0.0f ? -1 : 1));
                                if (var11_11 /* !! */  > 0) break block12;
                                var13_14 = r90_0.b(var24_31);
                                var34_37 = var5_5.a;
                                var12_12 = var13_14 + var34_37;
                                var35_38 = r90_0.c(var24_31) + var20_27;
                                var13_14 = r90_0.b(var26_32);
                                var36_39 = var18_25 - var13_14;
                                var37_40 = r90_0.c(var26_32) + var20_27;
                                var13_14 = r90_0.b(var31_35);
                                var18_25 -= var13_14;
                                var13_14 = r90_0.c(var31_35);
                                var38_41 = var22_29 - var13_14;
                                var13_14 = r90_0.c(var29_34);
                                var20_27 = var22_29 - var13_14;
                                var13_14 = r90_0.b(var29_34);
                                var34_37 += var13_14;
                                var14_16 /* !! */  = (float)(var1_1 == var12_12 ? 0 : (var1_1 < var12_12 ? -1 : 1));
                                if (var14_16 /* !! */  < 0 && (var14_16 /* !! */  = var2_2 == var35_38 ? 0 : (var2_2 < var35_38 ? -1 : 1)) < 0) {
                                    var39_42 = var5_5.e;
                                    var16_19 = var1_1;
                                    var6_6 = var2_2;
                                    var34_37 = var12_12;
                                    var18_25 = var35_38;
                                    var17_24 = j13.c(var1_1, var2_2, var39_42, var12_12, var35_38);
lbl75:
                                    // 4 sources

                                    while (true) {
                                        var11_11 /* !! */  = (int)var17_24;
                                        break block9;
                                        break;
                                    }
                                }
                                var14_16 /* !! */  = (float)(var6_6 == var34_37 ? 0 : (var6_6 < var34_37 ? -1 : 1));
                                if (var14_16 /* !! */  >= 0 || (var14_16 /* !! */  = var7_7 == var20_27 ? 0 : (var7_7 > var20_27 ? 1 : -1)) <= 0) break block13;
                                var41_45 = var5_5.h;
                                var16_20 = var1_1;
                                var6_6 = var2_2;
                                var18_25 = var20_27;
                                var17_24 = j13.c(var1_1, var2_2, var41_45, var34_37, var20_27);
                                ** GOTO lbl75
                            }
                            var14_16 /* !! */  = (float)(var6_6 == var36_39 ? 0 : (var6_6 > var36_39 ? 1 : -1));
                            if (var14_16 /* !! */  <= 0 || (var14_16 /* !! */  = var7_7 == var37_40 ? 0 : (var7_7 < var37_40 ? -1 : 1)) >= 0) break block14;
                            var39_43 = var5_5.f;
                            var16_21 = var1_1;
                            var6_6 = var2_2;
                            var34_37 = var36_39;
                            var18_25 = var37_40;
                            var17_24 = j13.c(var1_1, var2_2, var39_43, var36_39, var37_40);
                            ** GOTO lbl75
                        }
                        ** while ((var14_16 /* !! */  = var6_6 == var18_25 ? 0 : (var6_6 > var18_25 ? 1 : -1)) <= 0 || (var14_16 /* !! */  = var7_7 == var38_41 ? 0 : (var7_7 > var38_41 ? 1 : -1)) <= 0)
lbl98:
                        // 1 sources

                        var39_44 = var5_5.g;
                        var16_22 = var1_1;
                        var6_6 = var2_2;
                        var34_37 = var18_25;
                        var18_25 = var38_41;
                        var17_24 = j13.c(var1_1, var2_2, var39_44, var34_37, var38_41);
                        ** while (true)
                    }
                    var43_46 /* !! */  = var9_9 == null ? ni.a() : var9_9;
                    fn2.a(var43_46 /* !! */ , (NP2)var5_5);
                    var11_11 /* !! */  = (int)j13.b(var43_46 /* !! */ , var6_6, var7_7, var8_8, var9_9);
                    break block9;
                }
                var10_10 /* !! */  = var0 instanceof Cg2$a;
                if (var10_10 /* !! */  == 0) break block15;
                var5_5 = ((Cg2$a)var0).a;
                var11_11 /* !! */  = j13.b((gn2)var5_5, var1_1, var2_2, var3_3, var4_4);
            }
            return (boolean)var11_11 /* !! */ ;
        }
        var5_5 = new NoWhenBranchMatchedException();
        throw var5_5;
    }

    public static final boolean b(gn2 gn22, float f5, float f6, gn2 gn23, gn2 gn24) {
        float f7 = 0.005f;
        float f8 = f5 - f7;
        float f11 = f6 - f7;
        aG2 aG22 = new aG2(f8, f11, f5 += f7, f6 += f7);
        if (gn23 == null) {
            gn23 = ni.a();
        }
        gn2$a gn2$a = gn2$a.CounterClockwise;
        gn23.m(aG22, gn2$a);
        if (gn24 == null) {
            gn24 = ni.a();
        }
        int n3 = 1;
        gn24.p(gn22, gn23, n3);
        int n4 = gn24.isEmpty();
        gn24.reset();
        gn23.reset();
        return (n4 ^ n3) != 0;
    }

    public static final boolean c(float f5, float f6, long l2, float f7, float f8) {
        float f11;
        float f12;
        f5 -= f7;
        f6 -= f8;
        f7 = r90_0.b(l2);
        float f14 = r90_0.c(l2);
        f5 *= f5;
        f7 *= f7;
        f5 /= f7;
        f6 *= f6;
        if ((f12 = (f11 = (f6 = f6 / (f14 *= f14) + f5) - (f5 = 1.0f)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) <= 0) {
            f12 = 1.0f;
            f5 = Float.MIN_VALUE;
        } else {
            f12 = 0.0f;
            f5 = 0.0f;
        }
        return (boolean)f12;
    }
}

