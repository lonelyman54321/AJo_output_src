/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class TI$b {
    /*
     * Unable to fully structure code
     */
    public static ti_1 a(m41_0 var0) {
        var1_1 = var0;
        var2_2 = "headers";
        Intrinsics.checkNotNullParameter(var0, (String)var2_2);
        var3_3 = var0.size();
        var4_4 = 1;
        var6_6 = 1;
        var7_7 = 1.4E-45f;
        var8_8 = null;
        var9_9 = false;
        var10_10 = false;
        var11_11 = -1;
        var12_12 = -1;
        var13_13 = false;
        var14_14 = false;
        var15_15 = false;
        var16_16 = -1;
        var17_17 = -1;
        var18_18 = false;
        var19_19 = false;
        var20_20 = false;
        for (var5_5 = 0; var5_5 < var3_3; var5_5 += var26_26) {
            block30: {
                block29: {
                    block28: {
                        var21_21 = var1_1.c(var5_5);
                        var22_22 = var1_1.g(var5_5);
                        var23_23 = "Cache-Control";
                        var24_24 = b.i(var21_21, (String)var23_23, (boolean)var4_4);
                        if (var24_24 == 0) break block28;
                        if (var8_8 != null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var6_6 = 0;
                                var7_7 = 0.0f;
                                ** GOTO lbl40
                                break;
                            }
                        } else {
                            var8_8 = var22_22;
                        }
                        break block29;
                    }
                    var23_23 = "Pragma";
                    var24_24 = b.i(var21_21, (String)var23_23, (boolean)var4_4);
                    if (var24_24 != 0) {
                        ** continue;
                    }
                    break block30;
                }
                var24_24 = 0;
                var23_23 = null;
                block2: while (var24_24 < (var25_25 = var22_22.length())) {
                    block35: {
                        block34: {
                            block33: {
                                block32: {
                                    block31: {
                                        block26: {
                                            block25: {
                                                var25_25 = var22_22.length();
                                                for (var4_4 = var24_24; var4_4 < var25_25; var4_4 += var26_26) {
                                                    var26_26 = var22_22.charAt(var4_4);
                                                    var27_27 = var3_3;
                                                    var2_2 = "=,;";
                                                    if ((var26_26 = (int)StringsKt.G(var2_2, (char)var26_26)) == 0) {
                                                        var26_26 = 1;
                                                        var1_1 = var0;
                                                        continue;
                                                    }
                                                    break block25;
                                                }
                                                var27_27 = var3_3;
                                                var4_4 = var22_22.length();
                                            }
                                            var1_1 = var22_22.substring(var24_24, var4_4);
                                            var2_2 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                                            var1_1 = StringsKt.m0((CharSequence)var1_1).toString();
                                            var24_24 = var22_22.length();
                                            if (var4_4 == var24_24 || (var24_24 = (int)var22_22.charAt(var4_4)) == (var25_25 = 44) || (var24_24 = (int)var22_22.charAt(var4_4)) == (var25_25 = 59)) break block31;
                                            ++var4_4;
                                            var23_23 = ez3.a;
                                            var23_23 = "<this>";
                                            Intrinsics.checkNotNullParameter(var22_22, (String)var23_23);
                                            var24_24 = var22_22.length();
                                            while (var4_4 < var24_24) {
                                                var25_25 = var22_22.charAt(var4_4);
                                                var28_28 = var24_24;
                                                var24_24 = 32;
                                                if (var25_25 != var24_24 && var25_25 != (var24_24 = 9)) {
                                                    var24_24 = 1;
                                                    break block26;
                                                }
                                                ++var4_4;
                                                var24_24 = var28_28;
                                            }
                                            var24_24 = 1;
                                            var4_4 = var22_22.length();
                                        }
                                        var25_25 = var22_22.length();
                                        if (var4_4 >= var25_25) ** GOTO lbl98
                                        var25_25 = var22_22.charAt(var4_4);
                                        var28_28 = var6_6;
                                        var29_29 = var7_7;
                                        var6_6 = 34;
                                        var7_7 = 4.8E-44f;
                                        if (var25_25 == var6_6) {
                                            var23_23 = null;
                                            var25_25 = StringsKt.N(var22_22, (char)var6_6, var4_4 += var24_24, false, 4);
                                            var30_30 = var22_22.substring(var4_4, var25_25);
                                            Intrinsics.checkNotNullExpressionValue(var30_30, (String)var2_2);
                                            var3_3 = 1;
                                            var24_24 = var25_25 += var3_3;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            block27: {
                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl98:
                                                // 1 sources

                                                var28_28 = var6_6;
                                                var29_29 = var7_7;
                                                ** continue;
                                                var24_24 = 0;
                                                var23_23 = null;
                                                var25_25 = var22_22.length();
                                                for (var6_6 = var4_4; var6_6 < var25_25; ++var6_6) {
                                                    var24_24 = var22_22.charAt(var6_6);
                                                    var21_21 = ",;";
                                                    if ((var24_24 = (int)StringsKt.G(var21_21, (char)var24_24)) != 0) {
                                                        var24_24 = 1;
                                                        break block27;
                                                    }
                                                    var24_24 = 0;
                                                    var23_23 = null;
                                                }
                                                var24_24 = 1;
                                                var6_6 = var22_22.length();
                                            }
                                            var30_30 = var22_22.substring(var4_4, var6_6);
                                            Intrinsics.checkNotNullExpressionValue(var30_30, (String)var2_2);
                                            var2_2 = StringsKt.m0(var30_30);
                                            var30_30 = var2_2.toString();
                                            var24_24 = var6_6;
                                        }
                                        break block32;
                                    }
                                    var28_28 = var6_6;
                                    var29_29 = var7_7;
                                    var24_24 = 1;
                                    var24_24 = var4_4 + var24_24;
                                    var4_4 = 0;
                                    var30_30 = null;
                                }
                                var2_2 = "no-cache";
                                var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                                if (var3_3 != 0) {
                                    var1_1 = var0;
                                    var3_3 = var27_27;
                                    var6_6 = var28_28;
                                    var7_7 = var29_29;
                                    var4_4 = 1;
                                    var9_9 = true;
                                    continue;
                                }
                                var2_2 = "no-store";
                                var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                                if (var3_3 != 0) {
                                    var1_1 = var0;
                                    var3_3 = var27_27;
                                    var6_6 = var28_28;
                                    var7_7 = var29_29;
                                    var4_4 = 1;
                                    var10_10 = true;
                                    continue;
                                }
                                var2_2 = "max-age";
                                var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                                if (var3_3 != 0) {
                                    var3_3 = -1;
                                    var11_11 = ez3.y(var3_3, var30_30);
lbl155:
                                    // 5 sources

                                    while (true) {
                                        var1_1 = var0;
                                        var3_3 = var27_27;
                                        var6_6 = var28_28;
                                        var7_7 = var29_29;
                                        var4_4 = 1;
                                        continue block2;
                                        break;
                                    }
                                }
                                var3_3 = -1;
                                var21_21 = "s-maxage";
                                var25_25 = (int)var21_21.equalsIgnoreCase((String)var1_1);
                                if (var25_25 == 0) break block33;
                                var12_12 = ez3.y(var3_3, var30_30);
                                ** GOTO lbl155
                            }
                            var2_2 = "private";
                            var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                            if (var3_3 != 0) {
                                var1_1 = var0;
                                var3_3 = var27_27;
                                var6_6 = var28_28;
                                var7_7 = var29_29;
                                var4_4 = 1;
                                var13_13 = true;
                                continue;
                            }
                            var2_2 = "public";
                            var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                            if (var3_3 != 0) {
                                var1_1 = var0;
                                var3_3 = var27_27;
                                var6_6 = var28_28;
                                var7_7 = var29_29;
                                var4_4 = 1;
                                var14_14 = true;
                                continue;
                            }
                            var2_2 = "must-revalidate";
                            var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                            if (var3_3 != 0) {
                                var1_1 = var0;
                                var3_3 = var27_27;
                                var6_6 = var28_28;
                                var7_7 = var29_29;
                                var4_4 = 1;
                                var15_15 = true;
                                continue;
                            }
                            var2_2 = "max-stale";
                            var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                            if (var3_3 == 0) break block34;
                            var26_26 = -1 >>> 1;
                            var16_16 = ez3.y(var26_26, var30_30);
                            ** GOTO lbl155
                        }
                        var2_2 = "min-fresh";
                        var3_3 = (int)var2_2.equalsIgnoreCase((String)var1_1);
                        if (var3_3 == 0) break block35;
                        var3_3 = -1;
                        var17_17 = ez3.y(var3_3, var30_30);
                        ** GOTO lbl155
                    }
                    var3_3 = -1;
                    var30_30 = "only-if-cached";
                    var4_4 = (int)var30_30.equalsIgnoreCase((String)var1_1);
                    if (var4_4 != 0) {
                        var1_1 = var0;
                        var3_3 = var27_27;
                        var6_6 = var28_28;
                        var7_7 = var29_29;
                        var4_4 = 1;
                        var18_18 = true;
                        continue;
                    }
                    var30_30 = "no-transform";
                    var4_4 = (int)var30_30.equalsIgnoreCase((String)var1_1);
                    if (var4_4 != 0) {
                        var1_1 = var0;
                        var3_3 = var27_27;
                        var6_6 = var28_28;
                        var7_7 = var29_29;
                        var4_4 = 1;
                        var19_19 = true;
                        continue;
                    }
                    var30_30 = "immutable";
                    var26_26 = (int)var30_30.equalsIgnoreCase((String)var1_1);
                    if (var26_26 != 0) ** break;
                    ** continue;
                    var1_1 = var0;
                    var3_3 = var27_27;
                    var6_6 = var28_28;
                    var7_7 = var29_29;
                    var4_4 = 1;
                    var20_20 = true;
                }
                var27_27 = var3_3;
                var28_28 = var6_6;
                var29_29 = var7_7;
lbl248:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var27_27 = var3_3;
            ** continue;
            var3_3 = -1;
            var26_26 = 1;
            var1_1 = var0;
            var3_3 = var27_27;
            var4_4 = 1;
        }
        var31_31 = var6_6 == 0 ? null : var8_8;
        var8_8 = var1_1;
        var1_1 = new ti_1(var9_9, var10_10, var11_11, var12_12, var13_13, var14_14, var15_15, var16_16, var17_17, var18_18, var19_19, var20_20, (String)var31_31);
        return var1_1;
    }
}

