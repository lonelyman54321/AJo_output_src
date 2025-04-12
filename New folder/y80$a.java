/*
 * Decompiled with CFR 0.152.
 */
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class y80$a {
    /*
     * Unable to fully structure code
     */
    public static int a(String var0, int var1_1, int var2_2, boolean var3_3) {
        while (var1_1 < var2_2) {
            var4_4 = var0.charAt(var1_1);
            if (var4_4 < (var5_5 = 32) && var4_4 != (var5_5 = 9) || var4_4 >= (var5_5 = 127)) ** GOTO lbl-1000
            var5_5 = 48;
            var6_6 = 58;
            if (!(var5_5 <= var4_4 && var4_4 < var6_6 || (var5_5 = 97) <= var4_4 && var4_4 < (var5_5 = 123) || (var5_5 = 65) <= var4_4 && var4_4 < (var5_5 = 91) || var4_4 == var6_6)) {
                var4_4 = 0;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 1;
            }
            var5_5 = var3_3 ^ 1;
            if (var4_4 == var5_5) {
                return var1_1;
            }
            ++var1_1;
        }
        return var2_2;
    }

    /*
     * Unable to fully structure code
     */
    public static long b(int var0, String var1_1) {
        var2_2 = y80$a.a((String)var1_1, 0, var0, false);
        var3_3 = y80_0.m.matcher((CharSequence)var1_1);
        var4_4 = -1;
        var5_5 = -1;
        var6_6 = -1;
        var7_7 = -1;
        var8_8 = -1;
        var9_9 = -1;
        var10_10 = -1;
        while (true) {
            block16: {
                block15: {
                    var11_11 = 1;
                    var12_12 = 2;
                    if (var2_2 >= var0) break;
                    var13_13 = var2_2 + 1;
                    var13_13 = y80$a.a((String)var1_1, var13_13, var0, (boolean)var11_11);
                    var3_3.region(var2_2, var13_13);
                    var14_14 = "matcher.group(1)";
                    if (var6_6 != var4_4) break block15;
                    var15_15 = y80_0.m;
                    var16_16 = (var15_15 = var3_3.usePattern((Pattern)var15_15)).matches();
                    if (!var16_16) break block15;
                    var17_17 = var3_3.group(var11_11);
                    Intrinsics.checkNotNullExpressionValue(var17_17, (String)var14_14);
                    var6_6 = Integer.parseInt(var17_17);
                    var14_14 = var3_3.group(var12_12);
                    var18_18 = "matcher.group(2)";
                    Intrinsics.checkNotNullExpressionValue(var14_14, var18_18);
                    var9_9 = Integer.parseInt((String)var14_14);
                    var2_2 = 3;
                    var14_14 = var3_3.group(var2_2);
                    var19_19 = "matcher.group(3)";
                    Intrinsics.checkNotNullExpressionValue(var14_14, var19_19);
                    var10_10 = Integer.parseInt((String)var14_14);
                    break block16;
                }
                if (var7_7 != var4_4) ** GOTO lbl-1000
                var20_20 = y80_0.l;
                var12_12 = (int)(var20_20 = var3_3.usePattern((Pattern)var20_20)).matches();
                if (var12_12 != 0) {
                    var21_21 = var3_3.group(var11_11);
                    Intrinsics.checkNotNullExpressionValue(var21_21, (String)var14_14);
                    var7_7 = Integer.parseInt(var21_21);
                } else if (var8_8 == var4_4 && (var16_16 = (var15_15 = var3_3.usePattern((Pattern)(var20_20 = y80_0.k))).matches())) {
                    var22_22 = var3_3.group(var11_11);
                    Intrinsics.checkNotNullExpressionValue(var22_22, (String)var14_14);
                    var14_14 = Locale.US;
                    var15_15 = "this as java.lang.String).toLowerCase(locale)";
                    var14_14 = zn0_1.a((Locale)var14_14, "US", var22_22, (Locale)var14_14, (String)var15_15);
                    var22_22 = var20_20.pattern();
                    var23_23 = "MONTH_PATTERN.pattern()";
                    Intrinsics.checkNotNullExpressionValue(var22_22, var23_23);
                    var11_11 = 6;
                    var2_2 = StringsKt.O(var22_22, (String)var14_14, 0, false, var11_11);
                    var8_8 = var2_2 / 4;
                } else if (var5_5 == var4_4) {
                    var20_20 = y80_0.j;
                    var12_12 = (int)(var20_20 = var3_3.usePattern((Pattern)var20_20)).matches();
                    if (var12_12 != 0) {
                        var24_24 = var3_3.group(var11_11);
                        Intrinsics.checkNotNullExpressionValue(var24_24, (String)var14_14);
                        var5_5 = Integer.parseInt(var24_24);
                    }
                }
            }
            var2_2 = y80$a.a((String)var1_1, ++var13_13, var0, false);
        }
        var0 = 70;
        if (var0 <= var5_5 && var5_5 < (var25_25 = 100)) {
            var5_5 += 1900;
        }
        if (var5_5 >= 0 && var5_5 < var0) {
            var5_5 += 2000;
        }
        var0 = 1601;
        var1_1 = "Failed requirement.";
        if (var5_5 >= var0) {
            if (var8_8 != var4_4) {
                if (var11_11 <= var7_7 && var7_7 < (var0 = 32)) {
                    if (var6_6 >= 0 && var6_6 < (var0 = 24)) {
                        if (var9_9 >= 0 && var9_9 < (var0 = 60)) {
                            if (var10_10 >= 0 && var10_10 < var0) {
                                var1_1 = ez3.e;
                                var26_26 = new GregorianCalendar((TimeZone)var1_1);
                                var26_26.setLenient(false);
                                var26_26.set(var11_11, var5_5);
                                var26_26.set(var12_12, var8_8 -= var11_11);
                                var26_26.set(5, var7_7);
                                var26_26.set(11, var6_6);
                                var26_26.set(12, var9_9);
                                var26_26.set(13, var10_10);
                                var26_26.set(14, 0);
                                return var26_26.getTimeInMillis();
                            }
                            var1_1 = var1_1.toString();
                            var26_27 = new IllegalArgumentException((String)var1_1);
                            throw var26_27;
                        }
                        var1_1 = var1_1.toString();
                        var26_28 = new IllegalArgumentException((String)var1_1);
                        throw var26_28;
                    }
                    var1_1 = var1_1.toString();
                    var26_29 = new IllegalArgumentException((String)var1_1);
                    throw var26_29;
                }
                var1_1 = var1_1.toString();
                var26_30 = new IllegalArgumentException((String)var1_1);
                throw var26_30;
            }
            var1_1 = var1_1.toString();
            var26_31 = new IllegalArgumentException((String)var1_1);
            throw var26_31;
        }
        var1_1 = var1_1.toString();
        var26_32 = new IllegalArgumentException((String)var1_1);
        throw var26_32;
    }
}

