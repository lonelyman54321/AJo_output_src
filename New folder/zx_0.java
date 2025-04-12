/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZX
 */
public final class zx_0
implements lv_2 {
    public static final zx_0 a;

    static {
        zx_0 zx_02;
        a = zx_02 = new Object();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final long b(float var0, float var1_1, float var2_2, float var3_3, py_1 var4_4) {
        block44: {
            block45: {
                block43: {
                    block54: {
                        block53: {
                            block52: {
                                block50: {
                                    block51: {
                                        block49: {
                                            block47: {
                                                block48: {
                                                    block46: {
                                                        var5_5 = var4_4;
                                                        var6_6 = 1;
                                                        var7_7 = 1.4E-45f;
                                                        var8_8 = 31;
                                                        var9_9 = 4.3E-44f;
                                                        var10_10 = var4_4.d();
                                                        var11_11 = 16;
                                                        var12_12 = 32;
                                                        var13_13 = 0.5f;
                                                        var14_14 = 1.0f;
                                                        var15_15 = 0.0f;
                                                        if (var10_10 != 0) {
                                                            cfr_temp_0 = var3_3 - 0.0f;
                                                            var16_16 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                                            if (var16_16 /* !! */  < 0) {
                                                                var16_16 /* !! */  = (float)false;
                                                                var17_18 = 0.0f;
                                                                var5_5 = null;
                                                            } else {
                                                                var17_18 = var3_3;
                                                            }
                                                            var6_6 = var17_18 == var14_14 ? 0 : (var17_18 > var14_14 ? 1 : -1);
                                                            if (var6_6 > 0) {
                                                                var16_16 /* !! */  = 1065353216;
                                                                var17_18 = 1.0f;
                                                            }
                                                            var6_6 = 1132396544;
                                                            var7_7 = 255.0f;
                                                            var17_18 = var17_18 * var7_7 + var13_13;
                                                            var16_16 /* !! */  = (int)var17_18 << 24;
                                                            cfr_temp_1 = var0 - 0.0f;
                                                            var8_8 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                            if (var8_8 < 0) {
                                                                var8_8 = 0;
                                                                var9_9 = 0.0f;
                                                            } else {
                                                                var9_9 = var0;
                                                            }
                                                            var10_10 = (int)(var9_9 == var14_14 ? 0 : (var9_9 > var14_14 ? 1 : -1));
                                                            if (var10_10 > 0) {
                                                                var8_8 = 1065353216;
                                                                var9_9 = 1.0f;
                                                            }
                                                            var9_9 = var9_9 * var7_7 + var13_13;
                                                            var8_8 = (int)var9_9 << var11_11;
                                                            var16_16 /* !! */  = var16_16 /* !! */  | var8_8;
                                                            cfr_temp_2 = var1_1 - 0.0f;
                                                            var8_8 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                                                            if (var8_8 < 0) {
                                                                var8_8 = 0;
                                                                var9_9 = 0.0f;
                                                            } else {
                                                                var9_9 = var1_1;
                                                            }
                                                            var10_10 = (int)(var9_9 == var14_14 ? 0 : (var9_9 > var14_14 ? 1 : -1));
                                                            if (var10_10 > 0) {
                                                                var8_8 = 1065353216;
                                                                var9_9 = 1.0f;
                                                            }
                                                            var9_9 = var9_9 * var7_7 + var13_13;
                                                            var8_8 = (int)var9_9 << 8;
                                                            var16_16 /* !! */  = var16_16 /* !! */  | var8_8;
                                                            cfr_temp_3 = var2_2 - 0.0f;
                                                            var8_8 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                                                            if (var8_8 >= 0) {
                                                                var15_15 = var2_2;
                                                            }
                                                            var8_8 = (int)(var15_15 == var14_14 ? 0 : (var15_15 > var14_14 ? 1 : -1));
                                                            if (var8_8 <= 0) {
                                                                var14_14 = var15_15;
                                                            }
                                                            var6_6 = (int)(var14_14 * var7_7 + var13_13);
                                                            var18_20 = var16_16 /* !! */  | var6_6;
                                                            var8_8 = OX.m;
                                                            return var18_20 <<= var12_12;
                                                        }
                                                        var10_10 = ay_0.e;
                                                        var20_22 = var4_4.b >> var12_12;
                                                        var10_10 = (int)var20_22;
                                                        var22_23 = 3;
                                                        if (var10_10 != var22_23) break block44;
                                                        var22_23 = var4_4.c;
                                                        var10_10 = -1;
                                                        if (var22_23 == var10_10) break block45;
                                                        var10_10 = 0;
                                                        var23_24 = var4_4.c(0);
                                                        var24_25 = var4_4.b(0);
                                                        var25_26 /* !! */  = (float)(var0 == var23_24 ? 0 : (var0 < var23_24 ? -1 : 1));
                                                        if (var25_26 /* !! */  >= 0) {
                                                            var23_24 = var0;
                                                        }
                                                        var25_26 /* !! */  = var23_24 == var24_25 ? 0 : (var23_24 > var24_25 ? 1 : -1);
                                                        if (var25_26 /* !! */  <= 0) {
                                                            var24_25 = var23_24;
                                                        }
                                                        var26_27 = Float.floatToRawIntBits(var24_25);
                                                        var27_28 = var26_27 >>> 31;
                                                        var25_26 /* !! */  = var26_27 >>> 23;
                                                        var28_29 = 255;
                                                        var25_26 /* !! */  = var25_26 /* !! */  & var28_29;
                                                        var29_30 = 0x7FFFFF;
                                                        var30_31 = var26_27 & var29_30;
                                                        var31_32 = 0x800000;
                                                        var10_10 = -10;
                                                        if (var25_26 /* !! */  != var28_29) break block46;
                                                        if (var30_31 != 0) {
                                                            var26_27 = 512;
                                                            var23_24 = 7.17E-43f;
                                                        } else {
                                                            var26_27 = 0;
                                                            var23_24 = 0.0f;
                                                        }
                                                        var25_26 /* !! */  = 31;
                                                        var32_33 = 4.3E-44f;
                                                        break block47;
                                                    }
                                                    if ((var25_26 /* !! */  += -112) < var8_8) break block48;
                                                    var26_27 = 0;
                                                    var23_24 = 0.0f;
                                                    var25_26 /* !! */  = 49;
                                                    var32_33 = 6.9E-44f;
                                                    break block47;
                                                }
                                                if (var25_26 /* !! */  > 0) ** GOTO lbl127
                                                if (var25_26 /* !! */  >= var10_10) {
                                                    var26_27 = var30_31 | var31_32;
                                                    var25_26 /* !! */  = 1 - var25_26 /* !! */ ;
                                                    if ((var25_26 /* !! */  = (float)((var26_27 >>= var25_26 /* !! */ ) & 4096)) != false) {
                                                        var26_27 += 8192;
                                                    }
                                                    var26_27 >>= 13;
lbl120:
                                                    // 2 sources

                                                    while (true) {
                                                        var25_26 /* !! */  = (float)false;
                                                        var32_33 = 0.0f;
                                                        break;
                                                    }
                                                } else {
                                                    var26_27 = 0;
                                                    var23_24 = 0.0f;
                                                    ** continue;
lbl127:
                                                    // 1 sources

                                                    var30_31 >>= 13;
                                                    if ((var26_27 &= 4096) != 0) {
                                                        var26_27 = (var25_26 /* !! */  << 10 | var30_31) + var6_6;
                                                        var26_27 |= (var27_28 <<= 15);
lbl131:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var26_27 = var30_31;
                                                }
                                            }
                                            var27_28 <<= 15;
                                            var26_27 |= (var27_28 |= (var25_26 /* !! */  <<= 10));
                                            ** while (true)
                                            var26_27 = (short)var26_27;
                                            var24_25 = var5_5.c(var6_6);
                                            var32_33 = var5_5.b(var6_6);
                                            var30_31 = (int)(var1_1 == var24_25 ? 0 : (var1_1 < var24_25 ? -1 : 1));
                                            if (var30_31 >= 0) {
                                                var24_25 = var1_1;
                                            }
                                            var30_31 = (int)(var24_25 == var32_33 ? 0 : (var24_25 > var32_33 ? 1 : -1));
                                            if (var30_31 <= 0) {
                                                var32_33 = var24_25;
                                            }
                                            var27_28 = Float.floatToRawIntBits(var32_33);
                                            var25_26 /* !! */  = var27_28 >>> 31;
                                            var30_31 = var27_28 >>> 23 & var28_29;
                                            var33_34 = var27_28 & var29_30;
                                            if (var30_31 != var28_29) break block49;
                                            if (var33_34 != 0) {
                                                var27_28 = 512;
                                                var24_25 = 7.17E-43f;
                                            } else {
                                                var27_28 = 0;
                                                var24_25 = 0.0f;
                                            }
                                            var30_31 = 31;
                                            var34_35 = 4.3E-44f;
                                            break block50;
                                        }
                                        if ((var30_31 += -112) < var8_8) break block51;
                                        var27_28 = 0;
                                        var24_25 = 0.0f;
                                        var30_31 = 49;
                                        var34_35 = 6.9E-44f;
                                        break block50;
                                    }
                                    if (var30_31 > 0) ** GOTO lbl183
                                    if (var30_31 >= var10_10) {
                                        var27_28 = var33_34 | var31_32;
                                        var30_31 = 1 - var30_31;
                                        if ((var30_31 = (var27_28 >>= var30_31) & 4096) != 0) {
                                            var27_28 += 8192;
                                        }
                                        var27_28 >>= 13;
lbl176:
                                        // 2 sources

                                        while (true) {
                                            var30_31 = 0;
                                            var34_35 = 0.0f;
                                            break;
                                        }
                                    } else {
                                        var27_28 = 0;
                                        var24_25 = 0.0f;
                                        ** continue;
lbl183:
                                        // 1 sources

                                        var33_34 >>= 13;
                                        if ((var27_28 &= 4096) != 0) {
                                            var27_28 = (var30_31 << 10 | var33_34) + var6_6;
                                            var27_28 |= (var25_26 /* !! */  <<= 15);
lbl187:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var27_28 = var33_34;
                                    }
                                }
                                var25_26 /* !! */  <<= 15;
                                var25_26 /* !! */  = var25_26 /* !! */  | (var30_31 <<= 10);
                                var27_28 |= var25_26 /* !! */ ;
                                ** while (true)
                                var27_28 = (short)var27_28;
                                var25_26 /* !! */  = 2;
                                var32_33 = 2.8E-45f;
                                var34_35 = var5_5.c((int)var25_26 /* !! */ );
                                var17_19 = var5_5.b((int)var25_26 /* !! */ );
                                var25_26 /* !! */  = var2_2 == var34_35 ? 0 : (var2_2 < var34_35 ? -1 : 1);
                                if (var25_26 /* !! */  >= 0) {
                                    var34_35 = var2_2;
                                }
                                var25_26 /* !! */  = var34_35 == var17_19 ? 0 : (var34_35 > var17_19 ? 1 : -1);
                                if (var25_26 /* !! */  <= 0) {
                                    var17_19 = var34_35;
                                }
                                var16_17 = Float.floatToRawIntBits(var17_19);
                                var25_26 /* !! */  = var16_17 >>> 31;
                                var30_31 = var16_17 >>> 23 & var28_29;
                                var29_30 &= var16_17;
                                if (var30_31 != var28_29) break block52;
                                if (var29_30 == 0) break block53;
                                var10_10 = 512;
                                break block43;
                            }
                            if ((var30_31 += -112) < var8_8) break block54;
                            var8_8 = 49;
                            var9_9 = 6.9E-44f;
                        }
lbl219:
                        // 2 sources

                        while (true) {
                            var10_10 = 0;
                            break block43;
                            break;
                        }
                    }
                    if (var30_31 > 0) ** GOTO lbl236
                    if (var30_31 >= var10_10) {
                        var16_17 = var29_30 | var31_32;
                        var6_6 -= var30_31;
                        if ((var6_6 = (var16_17 >>= var6_6) & 4096) != 0) {
                            var16_17 += 8192;
                        }
                        var10_10 = var16_17 >>= 13;
                        var8_8 = 0;
                        var9_9 = 0.0f;
                    } else {
                        var8_8 = 0;
                        var9_9 = 0.0f;
                        ** continue;
lbl236:
                        // 1 sources

                        var10_10 = var29_30 >> 13;
                        if ((var16_17 &= 4096) != 0) {
                            var16_17 = (var30_31 << 10 | var10_10) + var6_6;
                            var6_6 = (int)(var25_26 /* !! */  << 15);
                            var16_17 |= var6_6;
lbl241:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var8_8 = var30_31;
                    }
                }
                var16_17 = (int)(var25_26 /* !! */  << 15);
                var6_6 = var8_8 << 10;
                var16_17 = var16_17 | var6_6 | var10_10;
                ** while (true)
                var16_17 = (short)var16_17;
                cfr_temp_4 = var3_3 - 0.0f;
                var6_6 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                if (var6_6 >= 0) {
                    var15_15 = var3_3;
                }
                var6_6 = (int)(var15_15 == var14_14 ? 0 : (var15_15 > var14_14 ? 1 : -1));
                if (var6_6 <= 0) {
                    var14_14 = var15_15;
                }
                var6_6 = (int)(var14_14 * 1023.0f + var13_13);
                var35_36 = var26_27;
                var37_37 = (char)-1;
                var35_36 = (var35_36 & var37_37) << 48;
                var39_38 = ((long)var27_28 & var37_37) << var12_12;
                var35_36 |= var39_38;
                var41_39 = ((long)var16_17 & var37_37) << var11_11;
                var18_21 = ((long)var6_6 & 1023L) << 6 | (var35_36 |= var41_39);
                var35_36 = (long)var22_23 & (long)63;
                var8_8 = OX.m;
                return var18_21 |= var35_36;
            }
            var5_5 = new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
            throw var5_5;
        }
        var5_5 = new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        throw var5_5;
    }

    public static final long c(int n3) {
        long l2 = n3;
        n3 = OX.m;
        return l2 <<= 32;
    }

    public static final long d(long l2) {
        return l2 <<= 32;
    }

    /*
     * Unable to fully structure code
     */
    public static final long e(float var0, float var1_1, float var2_2, float var3_3, py_1 var4_4) {
        block28: {
            block29: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                var5_5 = var3_3;
                                var6_6 = 31;
                                var7_7 = 4.3E-44f;
                                var8_8 = var4_4.d();
                                var9_9 = 32;
                                var10_10 = 16;
                                var11_11 = 0.5f;
                                if (var8_8 != 0) {
                                    var7_7 = 255.0f;
                                    var12_12 = (int)(var3_3 * var7_7 + var11_11) << 24;
                                    var8_8 = (int)(var0 * var7_7 + var11_11) << var10_10;
                                    var12_12 |= var8_8;
                                    var8_8 = (int)(var1_1 * var7_7 + var11_11) << 8;
                                    var6_6 = (int)(var7_7 * var2_2 + var11_11);
                                    var13_14 = (var12_12 |= var8_8) | var6_6;
                                    var8_8 = OX.m;
                                    return var13_14 <<= var9_9;
                                }
                                var8_8 = Float.floatToRawIntBits(var0);
                                var15_16 = var8_8 >>> 31;
                                var16_17 = var8_8 >>> 23;
                                var17_18 = 255;
                                var16_17 &= var17_18;
                                var18_19 = 0x7FFFFF;
                                var19_20 = var8_8 & var18_19;
                                var20_21 = 0x800000;
                                var21_22 = -10;
                                var22_23 = 512;
                                var23_24 = 0;
                                if (var16_17 != var17_18) break block24;
                                var8_8 = var19_20 != 0 ? 512 : 0;
                                var16_17 = 31;
                                break block25;
                            }
                            if ((var16_17 += -112) < var6_6) break block26;
                            var8_8 = 0;
                            var16_17 = 49;
                            break block25;
                        }
                        if (var16_17 > 0) ** GOTO lbl52
                        if (var16_17 >= var21_22) {
                            var8_8 = var19_20 | var20_21;
                            var16_17 = 1 - var16_17;
                            if ((var16_17 = (var8_8 >>= var16_17) & 4096) != 0) {
                                var8_8 += 8192;
                            }
                            var8_8 >>= 13;
lbl47:
                            // 2 sources

                            while (true) {
                                var16_17 = 0;
                                break;
                            }
                        } else {
                            var8_8 = 0;
                            ** continue;
lbl52:
                            // 1 sources

                            var19_20 >>= 13;
                            if ((var8_8 &= 4096) != 0) {
                                var8_8 = (var16_17 << 10 | var19_20) + 1;
                                var8_8 |= (var15_16 <<= 15);
lbl56:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var8_8 = var19_20;
                        }
                    }
                    var15_16 <<= 15;
                    var8_8 |= (var15_16 |= (var16_17 <<= 10));
                    ** while (true)
                    var8_8 = (short)var8_8;
                    var15_16 = Float.floatToRawIntBits(var1_1);
                    var16_17 = var15_16 >>> 31;
                    var19_20 = var15_16 >>> 23 & var17_18;
                    var24_25 = var15_16 & var18_19;
                    if (var19_20 != var17_18) break block27;
                    var15_16 = var24_25 != 0 ? 512 : 0;
                    var19_20 = 31;
                    break block28;
                }
                if ((var19_20 += -112) < var6_6) break block29;
                var15_16 = 0;
                var19_20 = 49;
                break block28;
            }
            if (var19_20 > 0) ** GOTO lbl90
            if (var19_20 >= var21_22) {
                var15_16 = var24_25 | var20_21;
                var19_20 = 1 - var19_20;
                if ((var19_20 = (var15_16 >>= var19_20) & 4096) != 0) {
                    var15_16 += 8192;
                }
                var15_16 >>= 13;
lbl85:
                // 2 sources

                while (true) {
                    var19_20 = 0;
                    break;
                }
            } else {
                var15_16 = 0;
                ** continue;
lbl90:
                // 1 sources

                var24_25 >>= 13;
                if ((var15_16 &= 4096) != 0) {
                    var15_16 = (var19_20 << 10 | var24_25) + 1;
                    var15_16 |= (var16_17 <<= 15);
lbl94:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var15_16 = var24_25;
            }
        }
        var16_17 <<= 15;
        var15_16 |= (var16_17 |= (var19_20 <<= 10));
        ** while (true)
        var15_16 = (short)var15_16;
        var16_17 = Float.floatToRawIntBits(var2_2);
        var19_20 = var16_17 >>> 31;
        var25_26 = var16_17 >>> 23 & var17_18;
        var18_19 &= var16_17;
        if (var25_26 == var17_18) {
            if (var18_19 == 0) {
                var22_23 = 0;
            }
            var23_24 = var22_23;
        } else if ((var25_26 += -112) >= var6_6) {
            var6_6 = 49;
            var7_7 = 6.9E-44f;
        } else if (var25_26 <= 0) {
            if (var25_26 >= var21_22) {
                var6_6 = var18_19 | var20_21;
                var16_17 = 1 - var25_26;
                if ((var16_17 = (var6_6 >>= var16_17) & 4096) != 0) {
                    var6_6 += 8192;
                }
                var23_24 = var6_6 >>= 13;
            }
            var6_6 = 0;
            var7_7 = 0.0f;
        } else {
            var23_24 = var18_19 >> 13;
            var6_6 = var16_17 & 4096;
            if (var6_6 != 0) {
                var6_6 = (var25_26 << 10 | var23_24) + 1;
                var16_17 = var19_20 << 15;
                var6_6 |= var16_17;
lbl131:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var6_6 = var25_26;
        }
        var16_17 = var19_20 << 15;
        var6_6 = var6_6 << 10 | var16_17 | var23_24;
        ** while (true)
        var6_6 = (short)var6_6;
        var5_5 = Math.min(var5_5, 1.0f);
        var12_13 = (int)(Math.max(0.0f, var5_5) * 1023.0f + var11_11);
        var26_27 = var8_8;
        var28_28 = (char)-1;
        var26_27 = (var26_27 & var28_28) << 48;
        var30_29 = ((long)var15_16 & var28_28) << var9_9 | var26_27;
        var32_30 = ((long)var6_6 & var28_28) << var10_10;
        var34_31 = var30_29 | var32_30;
        var36_32 = ((long)var12_13 & 1023L) << 6;
        var13_15 = var34_31 | var36_32;
        var30_29 = (long)var4_4.c & (long)63;
        var8_8 = OX.m;
        return var13_15 |= var30_29;
    }

    public static final long f(long l2, long l3) {
        py_1 py_12 = OX.f(l3);
        l2 = OX.a(l2, py_12);
        float f5 = OX.d(l3);
        float f6 = OX.d(l2);
        float f7 = 1.0f - f6;
        float f8 = f5 * f7 + f6;
        float f11 = OX.h(l2);
        float f12 = OX.h(l3);
        float f14 = 0.0f;
        float f15 = f8 - 0.0f;
        Object object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        f12 = object == false ? 0.0f : (f12 * f5 * f7 + (f11 *= f6)) / f8;
        f11 = OX.g(l2);
        float f16 = OX.g(l3);
        f16 = object == false ? 0.0f : (f16 * f5 * f7 + (f11 *= f6)) / f8;
        float f17 = OX.e(l2);
        float f18 = OX.e(l3);
        if (object != false) {
            f18 = f18 * f5 * f7 + (f17 *= f6);
            f14 = f18 / f8;
        }
        py_1 py_13 = OX.f(l3);
        return zx_0.e(f12, f16, f14, f8, py_13);
    }

    public static final long g(long l2, long l3, float f5) {
        float f6;
        q72_0 q72_02 = eZ.t;
        l2 = OX.a(l2, q72_02);
        long l4 = OX.a(l3, q72_02);
        float f7 = OX.d(l2);
        float f8 = OX.h(l2);
        float f11 = OX.g(l2);
        float f12 = OX.e(l2);
        float f14 = OX.d(l4);
        float f15 = OX.h(l4);
        float f16 = OX.g(l4);
        float f17 = OX.e(l4);
        float f18 = 0.0f;
        float f19 = f5 - 0.0f;
        Object object = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = 0.0f;
        }
        if ((object = (f6 = f5 - (f18 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
            f5 = 1.0f;
        }
        f18 = LK1.c(f8, f15, f5);
        f8 = LK1.c(f11, f16, f5);
        f12 = LK1.c(f12, f17, f5);
        f14 = LK1.c(f7, f14, f5);
        l2 = zx_0.e(f18, f8, f12, f14, q72_02);
        py_1 py_12 = OX.f(l3);
        return OX.a(l2, py_12);
    }

    public static final float h(long l2) {
        Object object = OX.f(l2);
        long l3 = ((py_1)object).b;
        long l4 = ay_0.a;
        boolean bl2 = ay_0.a(l3, l4);
        if (bl2) {
            float f5;
            String string2 = "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb";
            Intrinsics.checkNotNull(object, string2);
            object = (gp2_0)object;
            float f6 = OX.h(l2);
            double d2 = f6;
            object = ((gp2_0)object).p;
            d2 = ((qk0_0)object).c(d2);
            float f7 = OX.g(l2);
            double d5 = f7;
            d5 = ((qk0_0)object).c(d5);
            double d7 = OX.e(l2);
            d7 = ((qk0_0)object).c(d7);
            double d9 = 0.7152;
            d5 = d5 * d9 + (d2 *= 0.2126);
            double d12 = 0.0722;
            d7 = d7 * d12 + d5;
            float f8 = (float)d7;
            float f11 = 0.0f;
            Object var23_15 = null;
            float f12 = f8 - 0.0f;
            float f14 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (f14 < 0) {
                f8 = 0.0f;
                Object var25_18 = null;
            }
            if ((f14 = (f5 = f8 - (f11 = 1.0f)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
                f8 = 1.0f;
            }
            return f8;
        }
        CharSequence charSequence = new StringBuilder("The specified color must be encoded in an RGB color space. The supplied color space is ");
        Object object2 = ay_0.b(((py_1)object).b);
        charSequence.append(object2);
        charSequence = charSequence.toString();
        object2 = new IllegalArgumentException((String)charSequence);
        throw object2;
    }

    public static final int i(long l2) {
        Object object = eZ.a;
        object = eZ.c;
        l2 = OX.a(l2, (py_1)object) >>> 32;
        object = mt3_0.b;
        return (int)l2;
    }

    public void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).f;
        ks2_2 ks2_22 = ib1_2.f;
        y03_0 y03_02 = new y03_0((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, y03_02);
    }
}

