/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 */
import android.graphics.Path;
import java.util.ArrayList;

public final class rn2 {
    public static boolean a(rn2$a[] rn2$aArray, rn2$a[] rn2$aArray2) {
        if (rn2$aArray != null && rn2$aArray2 != null) {
            int n3 = rn2$aArray.length;
            int n4 = rn2$aArray2.length;
            if (n3 != n4) {
                return false;
            }
            for (n3 = 0; n3 < (n4 = rn2$aArray.length); ++n3) {
                float[] fArray;
                Object object = rn2$aArray[n3];
                int n7 = ((rn2$a)object).a;
                rn2$a rn2$a = rn2$aArray2[n3];
                char c2 = rn2$a.a;
                if (n7 == c2 && (n4 = ((Object)(object = (Object)((rn2$a)object).b)).length) == (n7 = (fArray = rn2$a.b).length)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static float[] b(int n3, float[] fArray) {
        if (n3 >= 0) {
            int n4 = fArray.length;
            if (n4 >= 0) {
                n4 = Math.min(n3, n4);
                float[] fArray2 = new float[n3];
                System.arraycopy(fArray, 0, fArray2, 0, n4);
                return fArray2;
            }
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
            throw arrayIndexOutOfBoundsException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static rn2$a[] c(String var0) {
        var1_1 = var0;
        var2_3 /* !! */  = new ArrayList<rn2$a>();
        var3_4 = 0;
        var4_5 = null;
        var5_6 = 1;
        var6_7 = 0;
        var7_8 = null;
        while (var5_6 < (var8_9 = var0.length())) {
            block23: {
                block25: {
                    block24: {
                        block21: {
                            block20: {
                                block19: {
                                    block22: {
                                        block17: {
                                            block18: {
                                                while (true) {
                                                    var8_9 = var0.length();
                                                    var9_10 = 69;
                                                    var10_11 = 101;
                                                    if (var5_6 >= var8_9 || ((var12_13 = ((var8_9 = (int)var1_1.charAt(var5_6)) + -90) * (var11_12 = var8_9 + -65)) <= 0 || (var12_13 = (var8_9 + -122) * (var11_12 = var8_9 + -97)) <= 0) && var8_9 != var10_11 && var8_9 != var9_10) break;
                                                    ++var5_6;
                                                }
                                                var7_8 = var1_1.substring(var6_7, var5_6).trim();
                                                var8_9 = (int)var7_8.isEmpty();
                                                if (var8_9 != 0) break block23;
                                                var8_9 = var7_8.charAt(0);
                                                if (var8_9 == (var11_12 = 122) || (var8_9 = (int)var7_8.charAt(0)) == (var11_12 = 90)) break block24;
                                                try {
                                                    var8_9 = var7_8.length();
                                                    var13_14 = new float[var8_9];
                                                    var11_12 = var7_8.length();
                                                    var12_13 = 1;
                                                    var14_15 = 0;
lbl27:
                                                    // 2 sources

                                                    while (var12_13 < var11_12) {
                                                        var15_16 = var12_13;
                                                        var16_17 = false;
                                                        var17_18 = false;
                                                        var18_19 = false;
                                                        var19_20 = false;
lbl33:
                                                        // 2 sources

                                                        while (var15_16 < (var20_21 = var7_8.length())) {
                                                            var20_21 = var7_8.charAt(var15_16);
                                                            if (var20_21 == (var3_4 = 32)) break block17;
                                                            if (var20_21 != var9_10 && var20_21 != var10_11) {
                                                                break block18;
                                                            }
                                                            ** GOTO lbl61
                                                        }
                                                        break block19;
                                                    }
                                                    break block20;
                                                }
                                                catch (NumberFormatException var1_2) {
                                                    break block21;
                                                }
                                            }
                                            switch (var20_21) {
                                                default: {
                                                    ** GOTO lbl59
                                                }
                                                case 46: {
                                                    if (var17_18) ** GOTO lbl52
                                                    var16_17 = false;
                                                    var17_18 = true;
                                                    break block22;
lbl52:
                                                    // 2 sources

                                                    while (true) {
                                                        var16_17 = false;
                                                        var18_19 = true;
                                                        var19_20 = true;
                                                        break block22;
                                                        break;
                                                    }
                                                }
                                                case 45: {
                                                    if (var15_16 != var12_13 && !var16_17) ** continue;
lbl59:
                                                    // 2 sources

                                                    var16_17 = false;
                                                    break block22;
                                                }
lbl61:
                                                // 1 sources

                                                var16_17 = true;
                                                break block22;
                                                case 44: 
                                            }
                                        }
                                        var16_17 = false;
                                        var18_19 = true;
                                    }
                                    if (var18_19) break block19;
                                    ++var15_16;
                                    var3_4 = 0;
                                    var4_5 = null;
                                    ** GOTO lbl33
                                }
                                if (var12_13 < var15_16) {
                                    var3_4 = var14_15 + 1;
                                    var21_22 /* !! */  = (float[])var7_8.substring(var12_13, var15_16);
                                    var13_14[var14_15] = var22_23 = Float.parseFloat((String)var21_22 /* !! */ );
                                    var14_15 = var3_4;
                                }
                                var12_13 = var19_20 != false ? var15_16 : var15_16 + 1;
                                var3_4 = 0;
                                var4_5 = null;
                                ** GOTO lbl27
                            }
                            var21_22 /* !! */  = rn2.b(var14_15, var13_14);
                            var3_4 = 0;
                            var4_5 = null;
                            break block25;
                        }
                        var4_5 = cP.a("error in parsing \"", var7_8, "\"");
                        var2_3 /* !! */  = new ArrayList<rn2$a>((String)var4_5, (Throwable)var1_2);
                        throw var2_3 /* !! */ ;
                    }
                    var21_22 /* !! */  = new float[]{};
                }
                var6_7 = var7_8.charAt(0);
                var4_5 = new rn2$a((char)var6_7, var21_22 /* !! */ );
                var2_3 /* !! */ .add((rn2$a)var4_5);
            }
            var3_4 = var5_6 + 1;
            var6_7 = var5_6;
            var5_6 = var3_4;
            var3_4 = 0;
            var4_5 = null;
        }
        var3_4 = 1;
        if ((var5_6 -= var6_7) == var3_4 && var6_7 < (var3_4 = var0.length())) {
            var23_24 = var1_1.charAt(var6_7);
            var3_4 = 0;
            var4_5 = null;
            var21_22 /* !! */  = new float[]{};
            var24_25 = new rn2$a(var23_24, var21_22 /* !! */ );
            var2_3 /* !! */ .add(var24_25);
        } else {
            var3_4 = 0;
            var4_5 = null;
        }
        var1_1 = new rn2$a[]{};
        return var2_3 /* !! */ .toArray(var1_1);
    }

    public static Path d(String string2) {
        Path path = new Path();
        Object object = rn2.c(string2);
        try {
            rn2.f(object, path);
            return path;
        }
        catch (RuntimeException runtimeException) {
            string2 = "Error in parsing ".concat(string2);
            object = new RuntimeException(string2, runtimeException);
            throw object;
        }
    }

    public static rn2$a[] e(rn2$a[] rn2$aArray) {
        int n3;
        int n4 = rn2$aArray.length;
        rn2$a[] rn2$aArray2 = new rn2$a[n4];
        for (int i3 = 0; i3 < (n3 = rn2$aArray.length); ++i3) {
            rn2$a rn2$a;
            rn2$a rn2$a2 = rn2$aArray[i3];
            rn2$aArray2[i3] = rn2$a = new rn2$a(rn2$a2);
        }
        return rn2$aArray2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void f(rn2$a[] var0, Path var1_1) {
        var2_2 = var0;
        var3_3 = var1_1;
        var4_4 = 6;
        var5_5 = 8.4E-45f;
        var6_6 = new float[var4_4];
        var7_7 = var0.length;
        var8_8 = 109;
        var9_9 = 1.53E-43f;
        var10_10 = 0;
        while (var10_10 < var7_7) {
            var11_11 = var2_2[var10_10];
            var12_12 = var11_11.a;
            var13_13 = var6_6[0];
            var14_14 = 1;
            var15_15 = var6_6[var14_14];
            var16_16 = 2;
            var17_17 = var6_6[var16_16];
            var18_18 = 3;
            var19_19 = var6_6[var18_18];
            var20_20 = 4;
            var21_21 = var6_6[var20_20];
            var22_22 = 5;
            var23_23 = var6_6[var22_22];
            switch (var12_12) lbl-1000:
            // 2 sources

            {
                default: {
                    var24_24 = 2;
                    break;
                }
                case 90: 
                case 122: {
                    var1_1.close();
                    var3_3.moveTo(var21_21, var23_23);
                    var13_13 = var21_21;
                    var17_17 = var21_21;
                    var15_15 = var23_23;
                    var19_19 = var23_23;
                    ** GOTO lbl-1000
                }
                case 81: 
                case 83: 
                case 113: 
                case 115: {
                    var24_24 = 4;
                    break;
                }
                case 72: 
                case 86: 
                case 104: 
                case 118: {
                    var24_24 = 1;
                    break;
                }
                case 67: 
                case 99: {
                    var24_24 = 6;
                    break;
                }
                case 65: 
                case 97: {
                    var24_24 = 7;
                }
            }
            var25_25 = var21_21;
            var26_26 = var23_23;
            var23_23 = var13_13;
            var21_21 = var15_15;
            var27_27 = 0;
            var15_15 = 0.0f;
            while (var27_27 < (var4_4 = (var28_28 = var11_11.b).length)) {
                block31: {
                    block32: {
                        block33: {
                            block34: {
                                block35: {
                                    block36: {
                                        block37: {
                                            block38: {
                                                block39: {
                                                    block40: {
                                                        block41: {
                                                            block42: {
                                                                block52: {
                                                                    block43: {
                                                                        block44: {
                                                                            block51: {
                                                                                block50: {
                                                                                    block45: {
                                                                                        block46: {
                                                                                            block49: {
                                                                                                block47: {
                                                                                                    block48: {
                                                                                                        var4_4 = 65;
                                                                                                        var5_5 = 9.1E-44f;
                                                                                                        if (var12_12 == var4_4) break block32;
                                                                                                        var4_4 = 67;
                                                                                                        var5_5 = 9.4E-44f;
                                                                                                        if (var12_12 == var4_4) break block33;
                                                                                                        var29_29 = 72;
                                                                                                        var30_30 = 1.01E-43f;
                                                                                                        if (var12_12 == var29_29) break block34;
                                                                                                        var29_29 = 81;
                                                                                                        var30_30 = 1.14E-43f;
                                                                                                        if (var12_12 == var29_29) break block35;
                                                                                                        var4_4 = 86;
                                                                                                        var5_5 = 1.2E-43f;
                                                                                                        if (var12_12 == var4_4) break block36;
                                                                                                        var4_4 = 97;
                                                                                                        var5_5 = 1.36E-43f;
                                                                                                        if (var12_12 == var4_4) break block37;
                                                                                                        var4_4 = 99;
                                                                                                        var5_5 = 1.39E-43f;
                                                                                                        if (var12_12 == var4_4) break block38;
                                                                                                        var4_4 = 104;
                                                                                                        var5_5 = 1.46E-43f;
                                                                                                        if (var12_12 == var4_4) break block39;
                                                                                                        var4_4 = 113;
                                                                                                        var5_5 = 1.58E-43f;
                                                                                                        if (var12_12 == var4_4) break block40;
                                                                                                        var29_29 = 118;
                                                                                                        var30_30 = 1.65E-43f;
                                                                                                        if (var12_12 == var29_29) break block41;
                                                                                                        var29_29 = 76;
                                                                                                        var30_30 = 1.06E-43f;
                                                                                                        if (var12_12 == var29_29) break block42;
                                                                                                        var29_29 = 77;
                                                                                                        var30_30 = 1.08E-43f;
                                                                                                        if (var12_12 == var29_29) break block43;
                                                                                                        var29_29 = 115;
                                                                                                        var30_30 = 1.61E-43f;
                                                                                                        var4_4 = 83;
                                                                                                        var5_5 = 1.16E-43f;
                                                                                                        var31_31 = 0x40000000;
                                                                                                        var32_32 = 2.0f;
                                                                                                        if (var12_12 == var4_4) break block44;
                                                                                                        var4_4 = 84;
                                                                                                        var5_5 = 1.18E-43f;
                                                                                                        if (var12_12 == var4_4) break block45;
                                                                                                        var4_4 = 108;
                                                                                                        var5_5 = 1.51E-43f;
                                                                                                        if (var12_12 == var4_4) break block46;
                                                                                                        var4_4 = 109;
                                                                                                        var5_5 = 1.53E-43f;
                                                                                                        if (var12_12 == var4_4) break block47;
                                                                                                        if (var12_12 == var29_29) break block48;
                                                                                                        var4_4 = 116;
                                                                                                        var5_5 = 1.63E-43f;
                                                                                                        if (var12_12 != var4_4) {
                                                                                                            var33_33 = var27_27;
lbl111:
                                                                                                            // 9 sources

                                                                                                            while (true) {
                                                                                                                var34_34 = var12_12;
                                                                                                                var31_31 = var10_10;
                                                                                                                var35_35 = var7_7;
lbl115:
                                                                                                                // 4 sources

                                                                                                                while (true) {
                                                                                                                    var36_36 = var11_11;
                                                                                                                    break block31;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var29_29 = 113;
                                                                                                        var30_30 = 1.58E-43f;
                                                                                                        if (var8_8 == var29_29 || var8_8 == var4_4) ** GOTO lbl-1000
                                                                                                        var4_4 = 81;
                                                                                                        var5_5 = 1.14E-43f;
                                                                                                        if (var8_8 == var4_4) ** GOTO lbl-1000
                                                                                                        var4_4 = 84;
                                                                                                        var5_5 = 1.18E-43f;
                                                                                                        if (var8_8 != var4_4) {
                                                                                                            var8_8 = 0;
                                                                                                            var9_9 = 0.0f;
                                                                                                            var29_29 = 0;
                                                                                                            var30_30 = 0.0f;
                                                                                                        } else lbl-1000:
                                                                                                        // 3 sources

                                                                                                        {
                                                                                                            var30_30 = var23_23 - var17_17;
                                                                                                            var9_9 = var21_21 - var19_19;
                                                                                                        }
                                                                                                        var17_17 = var28_28[var27_27];
                                                                                                        var37_37 = var27_27 + 1;
                                                                                                        var5_5 = var28_28[var37_37];
                                                                                                        var3_3.rQuadTo(var30_30, var9_9, var17_17, var5_5);
                                                                                                        var30_30 += var23_23;
                                                                                                        var17_17 = var28_28[var27_27];
                                                                                                        var23_23 += var17_17;
                                                                                                        var13_13 = var28_28[var37_37];
                                                                                                        var19_19 = var9_9 += (var21_21 += var13_13);
                                                                                                        var33_33 = var27_27;
                                                                                                        var34_34 = var12_12;
                                                                                                        var31_31 = var10_10;
                                                                                                        var35_35 = var7_7;
                                                                                                        var17_17 = var30_30;
                                                                                                        ** GOTO lbl115
                                                                                                    }
                                                                                                    var4_4 = 99;
                                                                                                    var5_5 = 1.39E-43f;
                                                                                                    if (var8_8 == var4_4 || var8_8 == var29_29) ** GOTO lbl-1000
                                                                                                    var4_4 = 67;
                                                                                                    var5_5 = 9.4E-44f;
                                                                                                    if (var8_8 == var4_4) ** GOTO lbl-1000
                                                                                                    var4_4 = 83;
                                                                                                    var5_5 = 1.16E-43f;
                                                                                                    if (var8_8 != var4_4) {
                                                                                                        var38_38 = 0;
                                                                                                        var17_17 = 0.0f;
                                                                                                        var39_39 = false;
                                                                                                        var40_40 = 0.0f;
                                                                                                    } else lbl-1000:
                                                                                                    // 3 sources

                                                                                                    {
                                                                                                        var9_9 = var23_23 - var17_17;
                                                                                                        var17_17 = var21_21 - var19_19;
                                                                                                        var40_40 = var9_9;
                                                                                                    }
                                                                                                    var19_19 = var28_28[var27_27];
                                                                                                    var4_4 = var27_27 + 1;
                                                                                                    var30_30 = var28_28[var4_4];
                                                                                                    var41_41 = var27_27 + 2;
                                                                                                    var42_42 = var28_28[var41_41];
                                                                                                    var43_43 = var27_27 + 3;
                                                                                                    var44_44 = var28_28[var43_43];
                                                                                                    var45_45 = var28_28;
                                                                                                    var13_13 = var40_40;
                                                                                                    var33_33 = var27_27;
                                                                                                    var15_15 = var17_17;
                                                                                                    var17_17 = var19_19;
                                                                                                    var19_19 = var30_30;
                                                                                                    var30_30 = var21_21;
                                                                                                    var21_21 = var42_42;
                                                                                                    var46_46 = var23_23;
                                                                                                    var23_23 = var44_44;
                                                                                                    var1_1.rCubicTo(var40_40, var15_15, var17_17, var19_19, var42_42, var44_44);
                                                                                                    var9_9 = var28_28[var27_27];
                                                                                                    var23_23 = var46_46 + var9_9;
                                                                                                    var9_9 = var28_28[var4_4];
                                                                                                    var21_21 = var30_30 + var9_9;
                                                                                                    var9_9 = var28_28[var41_41];
                                                                                                    var46_46 += var9_9;
                                                                                                    var9_9 = var28_28[var43_43] + var30_30;
lbl192:
                                                                                                    // 3 sources

                                                                                                    while (true) {
                                                                                                        var19_19 = var21_21;
                                                                                                        var17_17 = var23_23;
                                                                                                        var34_34 = var12_12;
                                                                                                        var31_31 = var10_10;
                                                                                                        var35_35 = var7_7;
                                                                                                        var23_23 = var46_46;
                                                                                                        var21_21 = var9_9;
                                                                                                        ** GOTO lbl115
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var45_45 = var28_28;
                                                                                                var33_33 = var27_27;
                                                                                                var30_30 = var21_21;
                                                                                                var46_46 = var23_23;
                                                                                                var9_9 = var28_28[var27_27];
                                                                                                var23_23 += var9_9;
                                                                                                var46_46 = var28_28[++var27_27];
                                                                                                var21_21 += var46_46;
                                                                                                if (var33_33 <= 0) break block49;
                                                                                                var3_3.rLineTo(var9_9, var46_46);
                                                                                                ** GOTO lbl111
                                                                                            }
                                                                                            var3_3.rMoveTo(var9_9, var46_46);
lbl215:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var26_26 = var21_21;
                                                                                                var25_25 = var23_23;
                                                                                                ** GOTO lbl111
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var45_45 = var28_28;
                                                                                        var33_33 = var27_27;
                                                                                        var30_30 = var21_21;
                                                                                        var46_46 = var23_23;
                                                                                        var9_9 = var28_28[var27_27];
                                                                                        var13_13 = var28_28[++var27_27];
                                                                                        var3_3.rLineTo(var9_9, var13_13);
                                                                                        var9_9 = var28_28[var33_33];
                                                                                        var23_23 += var9_9;
                                                                                        var46_46 = var28_28[var27_27];
                                                                                        var21_21 += var46_46;
                                                                                        ** GOTO lbl111
                                                                                    }
                                                                                    var45_45 = var28_28;
                                                                                    var33_33 = var27_27;
                                                                                    var30_30 = var21_21;
                                                                                    var46_46 = var23_23;
                                                                                    var47_47 = 113;
                                                                                    var13_13 = 1.58E-43f;
                                                                                    if (var8_8 == var47_47) break block50;
                                                                                    var47_47 = 116;
                                                                                    var13_13 = 1.63E-43f;
                                                                                    if (var8_8 == var47_47) break block50;
                                                                                    var47_47 = 81;
                                                                                    var13_13 = 1.14E-43f;
                                                                                    if (var8_8 == var47_47) break block50;
                                                                                    var47_47 = 84;
                                                                                    var13_13 = 1.18E-43f;
                                                                                    if (var8_8 != var47_47) break block51;
                                                                                }
                                                                                var23_23 = var46_46 * var32_32 - var17_17;
                                                                                var21_21 = var30_30 * var32_32 - var19_19;
                                                                            }
                                                                            var46_46 = var45_45[var33_33];
                                                                            var27_27 = var33_33 + 1;
                                                                            var9_9 = var45_45[var27_27];
                                                                            var3_3.quadTo(var23_23, var21_21, var46_46, var9_9);
                                                                            var46_46 = var45_45[var33_33];
                                                                            var9_9 = var45_45[var27_27];
                                                                            ** GOTO lbl192
                                                                        }
                                                                        var45_45 = var28_28;
                                                                        var33_33 = var27_27;
                                                                        var5_5 = var21_21;
                                                                        var46_46 = var23_23;
                                                                        var47_47 = 99;
                                                                        var13_13 = 1.39E-43f;
                                                                        if (var8_8 == var47_47 || var8_8 == var29_29) ** GOTO lbl-1000
                                                                        var47_47 = 67;
                                                                        var13_13 = 9.4E-44f;
                                                                        if (var8_8 == var47_47) ** GOTO lbl-1000
                                                                        var47_47 = 83;
                                                                        var13_13 = 1.16E-43f;
                                                                        if (var8_8 != var47_47) {
                                                                            var13_13 = var23_23;
                                                                            var15_15 = var21_21;
                                                                        } else lbl-1000:
                                                                        // 3 sources

                                                                        {
                                                                            var23_23 = var46_46 * var32_32 - var17_17;
                                                                            var15_15 = var21_21 = var5_5 * var32_32 - var19_19;
                                                                            var13_13 = var23_23;
                                                                        }
                                                                        var17_17 = var45_45[var33_33];
                                                                        var48_48 = var33_33 + 1;
                                                                        var19_19 = var45_45[var48_48];
                                                                        var4_4 = var33_33 + 2;
                                                                        var21_21 = var45_45[var4_4];
                                                                        var29_29 = var33_33 + 3;
                                                                        var23_23 = var45_45[var29_29];
                                                                        var1_1.cubicTo(var13_13, var15_15, var17_17, var19_19, var21_21, var23_23);
                                                                        var9_9 = var45_45[var33_33];
                                                                        var46_46 = var45_45[var48_48];
                                                                        var23_23 = var45_45[var4_4];
                                                                        var21_21 = var45_45[var29_29];
                                                                        var19_19 = var46_46;
                                                                        var17_17 = var9_9;
                                                                        ** GOTO lbl111
                                                                    }
                                                                    var45_45 = var28_28;
                                                                    var33_33 = var27_27;
                                                                    var23_23 = var28_28[var27_27];
                                                                    var21_21 = var28_28[++var27_27];
                                                                    if (var33_33 <= 0) break block52;
                                                                    var3_3.lineTo(var23_23, var21_21);
                                                                    ** GOTO lbl111
                                                                }
                                                                var3_3.moveTo(var23_23, var21_21);
                                                                ** continue;
                                                            }
                                                            var45_45 = var28_28;
                                                            var33_33 = var27_27;
                                                            var46_46 = var28_28[var27_27];
                                                            var9_9 = var28_28[++var27_27];
                                                            var3_3.lineTo(var46_46, var9_9);
                                                            var23_23 = var28_28[var33_33];
                                                            var21_21 = var28_28[var27_27];
                                                            ** GOTO lbl111
                                                        }
                                                        var45_45 = var28_28;
                                                        var33_33 = var27_27;
                                                        var5_5 = var21_21;
                                                        var46_46 = var23_23;
                                                        var9_9 = var28_28[var27_27];
                                                        var47_47 = 0;
                                                        var13_13 = 0.0f;
                                                        var28_28 = null;
                                                        var3_3.rLineTo(0.0f, var9_9);
                                                        var9_9 = var45_45[var27_27];
                                                        var21_21 += var9_9;
                                                        ** GOTO lbl111
                                                    }
                                                    var45_45 = var28_28;
                                                    var33_33 = var27_27;
                                                    var5_5 = var21_21;
                                                    var46_46 = var23_23;
                                                    var9_9 = var28_28[var27_27];
                                                    var13_13 = var28_28[++var27_27];
                                                    var38_38 = var33_33 + 2;
                                                    var19_19 = var28_28[var38_38];
                                                    var49_49 = var33_33 + 3;
                                                    var23_23 = var28_28[var49_49];
                                                    var3_3.rQuadTo(var9_9, var13_13, var19_19, var23_23);
                                                    var9_9 = var28_28[var33_33];
                                                    var23_23 = var46_46 + var9_9;
                                                    var9_9 = var28_28[var27_27] + var21_21;
                                                    var13_13 = var28_28[var38_38];
                                                    var46_46 += var13_13;
                                                    var13_13 = var28_28[var49_49];
                                                    var21_21 += var13_13;
                                                    var19_19 = var9_9;
                                                    var17_17 = var23_23;
                                                    var34_34 = var12_12;
                                                    var31_31 = var10_10;
                                                    var35_35 = var7_7;
                                                    var23_23 = var46_46;
                                                    ** continue;
                                                }
                                                var45_45 = var28_28;
                                                var33_33 = var27_27;
                                                var5_5 = var21_21;
                                                var46_46 = var23_23;
                                                var9_9 = var28_28[var27_27];
                                                var47_47 = 0;
                                                var13_13 = 0.0f;
                                                var28_28 = null;
                                                var3_3.rLineTo(var9_9, 0.0f);
                                                var9_9 = var45_45[var27_27];
                                                var23_23 += var9_9;
                                                ** continue;
                                            }
                                            var45_45 = var28_28;
                                            var33_33 = var27_27;
                                            var5_5 = var21_21;
                                            var46_46 = var23_23;
                                            var13_13 = var28_28[var27_27];
                                            var15_15 = var28_28[++var27_27];
                                            var29_29 = var33_33 + 2;
                                            var17_17 = var28_28[var29_29];
                                            var39_39 = var33_33 + 3;
                                            var19_19 = var28_28[var39_39];
                                            var41_41 = var33_33 + 4;
                                            var21_21 = var28_28[var41_41];
                                            var35_35 = var33_33 + 5;
                                            var23_23 = var28_28[var35_35];
                                            var1_1.rCubicTo(var13_13, var15_15, var17_17, var19_19, var21_21, var23_23);
                                            var9_9 = var28_28[var29_29];
                                            var23_23 = var46_46 + var9_9;
                                            var9_9 = var28_28[var39_39];
                                            var21_21 = var5_5 + var9_9;
                                            var9_9 = var28_28[var41_41];
                                            var46_46 += var9_9;
                                            var9_9 = var28_28[var35_35] + var5_5;
                                            ** continue;
                                        }
                                        var45_45 = var28_28;
                                        var33_33 = var27_27;
                                        var5_5 = var21_21;
                                        var46_46 = var23_23;
                                        var29_29 = var27_27 + 5;
                                        var17_17 = var28_28[var29_29] + var23_23;
                                        var41_41 = var27_27 + 6;
                                        var19_19 = var28_28[var41_41] + var21_21;
                                        var21_21 = var28_28[var27_27];
                                        var23_23 = var28_28[++var27_27];
                                        var27_27 = var33_33 + 2;
                                        var42_42 = var28_28[var27_27];
                                        var27_27 = var33_33 + 3;
                                        var9_9 = var28_28[var27_27];
                                        var47_47 = 0;
                                        var13_13 = 0.0f;
                                        var28_28 = null;
                                        cfr_temp_0 = var9_9 - 0.0f;
                                        var8_8 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var8_8 != 0) {
                                            var39_39 = true;
                                            var40_40 = 1.4E-45f;
                                        } else {
                                            var39_39 = false;
                                            var40_40 = 0.0f;
                                        }
                                        var27_27 = var33_33 + 4;
                                        var9_9 = var45_45[var27_27];
                                        cfr_temp_1 = var9_9 - 0.0f;
                                        var8_8 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                        var43_43 = var8_8 != 0 ? 1 : 0;
                                        var13_13 = var46_46;
                                        var15_15 = var5_5;
                                        var34_34 = var12_12;
                                        var50_50 = var42_42;
                                        var35_35 = var7_7;
                                        var36_36 = var11_11;
                                        var51_51 = var39_39;
                                        var31_31 = var10_10;
                                        var10_10 = var43_43;
                                        rn2$a.a(var1_1, var46_46, var5_5, var17_17, var19_19, var21_21, var23_23, var42_42, var39_39, (boolean)var43_43);
                                        var9_9 = var45_45[var29_29];
                                        var23_23 = var46_46 + var9_9;
                                        var46_46 = var45_45[var41_41];
                                        var21_21 = var5_5 + var46_46;
lbl436:
                                        // 2 sources

                                        while (true) {
                                            var19_19 = var21_21;
                                            var17_17 = var23_23;
                                            break block31;
                                            break;
                                        }
                                    }
                                    var45_45 = var28_28;
                                    var33_33 = var27_27;
                                    var46_46 = var23_23;
                                    var34_34 = var12_12;
                                    var31_31 = var10_10;
                                    var35_35 = var7_7;
                                    var36_36 = var11_11;
                                    var9_9 = var28_28[var27_27];
                                    var3_3.lineTo(var23_23, var9_9);
                                    var21_21 = var28_28[var27_27];
                                    break block31;
                                }
                                var45_45 = var28_28;
                                var33_33 = var27_27;
                                var34_34 = var12_12;
                                var31_31 = var10_10;
                                var35_35 = var7_7;
                                var36_36 = var11_11;
                                var46_46 = var28_28[var27_27];
                                var9_9 = var28_28[++var27_27];
                                var47_47 = var33_33 + 2;
                                var17_17 = var28_28[var47_47];
                                var37_37 = var33_33 + 3;
                                var21_21 = var28_28[var37_37];
                                var3_3.quadTo(var46_46, var9_9, var17_17, var21_21);
                                var46_46 = var28_28[var33_33];
                                var9_9 = var28_28[var27_27];
                                var23_23 = var28_28[var47_47];
                                var21_21 = var28_28[var37_37];
lbl470:
                                // 2 sources

                                while (true) {
                                    var17_17 = var46_46;
                                    var19_19 = var9_9;
                                    break block31;
                                    break;
                                }
                            }
                            var45_45 = var28_28;
                            var33_33 = var27_27;
                            var5_5 = var21_21;
                            var34_34 = var12_12;
                            var31_31 = var10_10;
                            var35_35 = var7_7;
                            var36_36 = var11_11;
                            var46_46 = var28_28[var27_27];
                            var3_3.lineTo(var46_46, var21_21);
                            var23_23 = var28_28[var27_27];
                            break block31;
                        }
                        var45_45 = var28_28;
                        var33_33 = var27_27;
                        var34_34 = var12_12;
                        var31_31 = var10_10;
                        var35_35 = var7_7;
                        var36_36 = var11_11;
                        var13_13 = var28_28[var27_27];
                        var15_15 = var28_28[++var27_27];
                        var48_48 = var33_33 + 2;
                        var17_17 = var28_28[var48_48];
                        var12_12 = var33_33 + 3;
                        var19_19 = var28_28[var12_12];
                        var51_51 = var33_33 + 4;
                        var21_21 = var28_28[var51_51];
                        var10_10 = var33_33 + 5;
                        var23_23 = var28_28[var10_10];
                        var1_1.cubicTo(var13_13, var15_15, var17_17, var19_19, var21_21, var23_23);
                        var23_23 = var28_28[var51_51];
                        var21_21 = var28_28[var10_10];
                        var46_46 = var28_28[var48_48];
                        var9_9 = var28_28[var12_12];
                        ** continue;
                    }
                    var45_45 = var28_28;
                    var33_33 = var27_27;
                    var5_5 = var21_21;
                    var46_46 = var23_23;
                    var34_34 = var12_12;
                    var31_31 = var10_10;
                    var35_35 = var7_7;
                    var36_36 = var11_11;
                    var29_29 = var27_27 + 5;
                    var17_17 = var28_28[var29_29];
                    var41_41 = var27_27 + 6;
                    var19_19 = var28_28[var41_41];
                    var21_21 = var28_28[var27_27];
                    var23_23 = var28_28[++var27_27];
                    var27_27 = var33_33 + 2;
                    var50_50 = var28_28[var27_27];
                    var27_27 = var33_33 + 3;
                    var9_9 = var28_28[var27_27];
                    var47_47 = 0;
                    var13_13 = 0.0f;
                    var28_28 = null;
                    cfr_temp_2 = var9_9 - 0.0f;
                    var8_8 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                    if (var8_8 != 0) {
                        var51_51 = true;
                    } else {
                        var51_51 = false;
                        var11_11 = null;
                    }
                    var27_27 = var33_33 + 4;
                    var9_9 = var45_45[var27_27];
                    cfr_temp_3 = var9_9 - 0.0f;
                    var8_8 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                    var10_10 = var8_8 != 0 ? 1 : 0;
                    var13_13 = var46_46;
                    var15_15 = var5_5;
                    rn2$a.a(var1_1, var46_46, var5_5, var17_17, var19_19, var21_21, var23_23, var50_50, var51_51, (boolean)var10_10);
                    var23_23 = var45_45[var29_29];
                    var21_21 = var45_45[var41_41];
                    ** continue;
                }
                var27_27 = var33_33 + var24_24;
                var2_2 = var0;
                var11_11 = var36_36;
                var7_7 = var35_35;
                var8_8 = var34_34;
                var12_12 = var34_34;
                var10_10 = var31_31;
                var4_4 = 6;
                var5_5 = 8.4E-45f;
            }
            var5_5 = var21_21;
            var46_46 = var23_23;
            var31_31 = var10_10++;
            var35_35 = var7_7;
            var36_36 = var11_11;
            var6_6[0] = var23_23;
            var6_6[var14_14] = var21_21;
            var6_6[var16_16] = var17_17;
            var6_6[var18_18] = var19_19;
            var6_6[var20_20] = var25_25;
            var6_6[var22_22] = var26_26;
            var8_8 = var11_11.a;
            var2_2 = var0;
            var4_4 = 6;
            var5_5 = 8.4E-45f;
        }
    }
}

