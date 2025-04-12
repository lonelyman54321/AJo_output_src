/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.util.HashMap;
import java.util.Map;

public final class ExpandedProductResultParser
extends ResultParser {
    private static String findAIvalue(int n3, String charSequence) {
        int n4;
        int n7 = ((String)charSequence).charAt(n3);
        if (n7 != (n4 = 40)) {
            return null;
        }
        String string2 = ((String)charSequence).substring(++n3);
        charSequence = new StringBuilder();
        for (n7 = 0; n7 < (n4 = string2.length()); ++n7) {
            int n8;
            n4 = string2.charAt(n7);
            if (n4 == (n8 = 41)) {
                return ((StringBuilder)charSequence).toString();
            }
            n8 = 48;
            if (n4 >= n8 && n4 <= (n8 = 57)) {
                ((StringBuilder)charSequence).append((char)n4);
                continue;
            }
            return null;
        }
        return ((StringBuilder)charSequence).toString();
    }

    private static String findValue(int n3, String string2) {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = string2.substring(n3);
        string2 = null;
        for (char c3 = '\u0000'; c3 < (c2 = string3.length()); ++c3) {
            char c5;
            c2 = string3.charAt(c3);
            if (c2 == (c5 = '(')) {
                String string4 = ExpandedProductResultParser.findAIvalue(c3, string3);
                if (string4 != null) break;
                stringBuilder.append(c5);
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ExpandedProductParsedResult parse(Result var1_1) {
        var2_2 = 4;
        var3_3 = 3;
        var4_4 /* !! */  = var1_1.getBarcodeFormat();
        if (var4_4 /* !! */  != (var5_5 = BarcodeFormat.RSS_EXPANDED)) {
            return null;
        }
        var6_6 = ResultParser.getMassagedText(var1_1);
        var4_4 /* !! */  = new HashMap();
        var7_7 = null;
        var8_8 = null;
        var9_9 = null;
        var10_10 = null;
        var11_11 = null;
        var12_12 = null;
        var13_13 = null;
        var14_14 = null;
        var15_15 = null;
        var16_16 = null;
        var17_17 = null;
        var18_18 = null;
        var19_19 = null;
        var20_20 = 0;
        var5_5 = null;
        block50: while (var20_20 < (var21_21 = var6_6.length())) {
            var22_22 = ExpandedProductResultParser.findAIvalue(var20_20, var6_6);
            if (var22_22 == null) {
                return null;
            }
            var23_23 = var22_22.length() + 2;
            var20_20 = var23_23 + var20_20;
            var24_24 = ExpandedProductResultParser.findValue(var20_20, var6_6);
            var20_20 = var24_24.length() + var20_20;
            var25_25 = -1;
            var26_26 = var22_22.hashCode();
            switch (var26_26) {
                default: {
                    break;
                }
                case 1575750: {
                    var27_27 = "3933";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 34;
                    break;
                }
                case 1575749: {
                    var27_27 = "3932";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 33;
                    break;
                }
                case 1575748: {
                    var27_27 = "3931";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 32;
                    break;
                }
                case 1575747: {
                    var27_27 = "3930";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 31;
                    break;
                }
                case 1575719: {
                    var27_27 = "3923";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 30;
                    break;
                }
                case 1575718: {
                    var27_27 = "3922";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 29;
                    break;
                }
                case 1575717: {
                    var27_27 = "3921";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 28;
                    break;
                }
                case 1575716: {
                    var27_27 = "3920";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 27;
                    break;
                }
                case 1568936: {
                    var27_27 = "3209";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 26;
                    break;
                }
                case 1568935: {
                    var27_27 = "3208";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 25;
                    break;
                }
                case 1568934: {
                    var27_27 = "3207";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 24;
                    break;
                }
                case 1568933: {
                    var27_27 = "3206";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 23;
                    break;
                }
                case 1568932: {
                    var27_27 = "3205";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 22;
                    break;
                }
                case 1568931: {
                    var27_27 = "3204";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 21;
                    break;
                }
                case 1568930: {
                    var27_27 = "3203";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 20;
                    break;
                }
                case 1568929: {
                    var27_27 = "3202";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 19;
                    break;
                }
                case 1568928: {
                    var27_27 = "3201";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 18;
                    break;
                }
                case 1568927: {
                    var27_27 = "3200";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 17;
                    break;
                }
                case 1567975: {
                    var27_27 = "3109";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 16;
                    break;
                }
                case 1567974: {
                    var27_27 = "3108";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 15;
                    break;
                }
                case 1567973: {
                    var27_27 = "3107";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 14;
                    break;
                }
                case 1567972: {
                    var27_27 = "3106";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 13;
                    break;
                }
                case 1567971: {
                    var27_27 = "3105";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 12;
                    break;
                }
                case 1567970: {
                    var27_27 = "3104";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 11;
                    break;
                }
                case 1567969: {
                    var27_27 = "3103";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 10;
                    break;
                }
                case 1567968: {
                    var27_27 = "3102";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 9;
                    break;
                }
                case 1567967: {
                    var27_27 = "3101";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 8;
                    break;
                }
                case 1567966: {
                    var27_27 = "3100";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 7;
                    break;
                }
                case 1574: {
                    var27_27 = "17";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 6;
                    break;
                }
                case 1572: {
                    var27_27 = "15";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 5;
                    break;
                }
                case 1570: {
                    var27_27 = "13";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 4;
                    break;
                }
                case 1568: {
                    var27_27 = "11";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 3;
                    break;
                }
                case 1567: {
                    var27_27 = "10";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 2;
                    break;
                }
                case 1537: {
                    var27_27 = "01";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 1;
                    break;
                }
                case 1536: {
                    var27_27 = "00";
                    var28_28 = (int)var22_22.equals(var27_27);
                    if (var28_28 == 0) break;
                    var25_25 = 0;
                }
            }
            switch (var25_25) {
                default: {
                    var4_4 /* !! */ .put(var22_22, var24_24);
                    continue block50;
                }
                case 31: 
                case 32: 
                case 33: 
                case 34: {
                    var28_28 = var24_24.length();
                    if (var28_28 < var2_2) {
                        return null;
                    }
                    var17_17 = var24_24.substring(var3_3);
                    var28_28 = 0;
                    var27_27 = null;
                    var19_19 = var24_24.substring(0, var3_3);
                    var18_18 = var22_22.substring(var3_3);
                    continue block50;
                }
                case 27: 
                case 28: 
                case 29: 
                case 30: {
                    var28_28 = 0;
                    var27_27 = null;
                    var18_18 = var22_22.substring(var3_3);
                    var17_17 = var24_24;
                    continue block50;
                }
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    var28_28 = 0;
                    var27_27 = null;
                    var16_16 = var22_22.substring(var3_3);
                    var15_15 = "LB";
lbl271:
                    // 2 sources

                    while (true) {
                        var14_14 = var24_24;
                        continue block50;
                        break;
                    }
                }
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: {
                    var28_28 = 0;
                    var27_27 = null;
                    var16_16 = var22_22.substring(var3_3);
                    var15_15 = "KG";
                    ** continue;
                }
                case 6: {
                    var13_13 = var24_24;
                    continue block50;
                }
                case 5: {
                    var12_12 = var24_24;
                    continue block50;
                }
                case 4: {
                    var11_11 = var24_24;
                    continue block50;
                }
                case 3: {
                    var10_10 = var24_24;
                    continue block50;
                }
                case 2: {
                    var9_9 = var24_24;
                    continue block50;
                }
                case 1: {
                    var7_7 = var24_24;
                    continue block50;
                }
                case 0: 
            }
            var8_8 = var24_24;
        }
        var22_22 = var29_29;
        var29_29 = new ExpandedProductParsedResult(var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, var12_12, var13_13, var14_14, var15_15, var16_16, var17_17, var18_18, var19_19, (Map)var4_4 /* !! */ );
        return var29_29;
    }
}

