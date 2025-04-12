/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.publicsuffix;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;

public final class PublicSuffixDatabase$a {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final String a(byte[] var0, byte[][] var1_1, int var2_2) {
        block13: {
            var3_3 = var0;
            var4_4 /* !! */  = var1_1;
            var5_5 = -1;
            var6_6 = 1;
            var7_7 = var0.length;
            var8_8 = 0;
            block0: while (var8_8 < var7_7) {
                var9_9 = (var8_8 + var7_7) / 2;
                while (true) {
                    var10_10 = 10;
                    if (var9_9 <= var5_5 || (var11_11 = var3_3[var9_9]) == var10_10) break;
                    var9_9 += var5_5;
                }
                var11_11 = var9_9 + 1;
                var12_12 = 1;
                var13_13 = 1.4E-45f;
                while ((var15_15 = var3_3[var14_14 = var11_11 + var12_12]) != var10_10) {
                    var12_12 += var6_6;
                }
                var10_10 = var14_14 - var11_11;
                var15_15 = var2_2;
                var12_12 = 0;
                var13_13 = 0.0f;
                var16_16 = null;
                var17_17 = 0;
                var18_18 = 0;
                var19_19 = null;
                while (true) {
                    if (var12_12 != 0) {
                        var12_12 = 46;
                        var13_13 = 6.4E-44f;
                        var20_20 = 0;
                        var21_21 = 0.0f;
                        var22_22 = null;
                    } else {
                        var22_22 = var4_4 /* !! */ [var15_15];
                        var20_20 = var22_22[var17_17];
                        var23_23 = var20_20 & 255;
                        var20_20 = var12_12;
                        var21_21 = var13_13;
                        var12_12 = var23_23;
                    }
                    var24_24 = var11_11 + var18_18;
                    var5_5 = var3_3[var24_24];
                    if ((var12_12 -= (var5_5 &= 255)) != 0) break;
                    var17_17 += var6_6;
                    if ((var18_18 += var6_6) == var10_10) break;
                    var25_25 /* !! */  = var4_4 /* !! */ [var15_15];
                    var5_5 = var25_25 /* !! */ .length;
                    if (var5_5 == var17_17) {
                        var5_5 = var4_4 /* !! */ .length - var6_6;
                        if (var15_15 == var5_5) break;
                        var15_15 += var6_6;
                        var5_5 = -1;
                        var12_12 = 1;
                        var13_13 = 1.4E-45f;
                        var17_17 = -1;
                        continue;
                    }
                    var12_12 = var20_20;
                    var13_13 = var21_21;
                    var5_5 = -1;
                }
                if (var12_12 < 0) {
                    while (true) {
                        var7_7 = var9_9;
lbl68:
                        // 2 sources

                        while (true) {
                            var5_5 = -1;
                            continue block0;
                            break;
                        }
                        break;
                    }
                }
                if (var12_12 > 0) {
                    while (true) {
                        var8_8 = var14_14 + 1;
                        ** continue;
                        break;
                    }
                }
                var5_5 = var10_10 - var18_18;
                var16_16 = var4_4 /* !! */ [var15_15];
                var12_12 = var16_16.length - var17_17;
                var15_15 += var6_6;
                var17_17 = var4_4 /* !! */ .length;
                while (var15_15 < var17_17) {
                    var19_19 = var4_4 /* !! */ [var15_15];
                    var18_18 = var19_19.length;
                    var12_12 += var18_18;
                    var15_15 += var6_6;
                }
                if (var12_12 < var5_5) ** continue;
                if (var12_12 > var5_5) ** continue;
                var4_4 /* !! */  = (byte[][])StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , "UTF_8");
                var25_25 /* !! */  = (byte[])new String;
                var25_25 /* !! */ (var3_3, var11_11, var10_10, (Charset)var4_4 /* !! */ );
                break block13;
            }
            var5_5 = 0;
            var25_25 /* !! */  = null;
        }
        return var25_25 /* !! */ ;
    }
}

