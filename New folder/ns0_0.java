/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nS0
 */
public final class ns0_0
implements YR0 {
    public final float a;
    public final wa3_0 b;

    public ns0_0() {
        this(0.0f, 0.0f, 7);
    }

    public ns0_0(float f5, float f6, float f7) {
        double d2;
        float f8;
        wa3_0 wa3_02;
        this.a = f7;
        wa3_02.a = f8 = 1.0f;
        wa3_02.b = d2 = Math.sqrt(50.0);
        wa3_02.g = f8;
        int n3 = 0;
        f8 = 0.0f;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (f12 >= 0) {
            float f14;
            float f15;
            wa3_02.g = f5;
            f5 = 0.0f;
            IllegalArgumentException illegalArgumentException = null;
            wa3_02.c = false;
            if ((n3 = (f15 = (f14 = (float)(d2 *= d2)) - 0.0f) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1)) > 0) {
                double d5;
                wa3_02.b = d5 = Math.sqrt(f6);
                wa3_02.c = false;
                this.b = wa3_02;
                return;
            }
            illegalArgumentException = new IllegalArgumentException("Spring stiffness constant must be positive.");
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Damping ratio must be non-negative");
        throw illegalArgumentException;
    }

    public /* synthetic */ ns0_0(float f5, float f6, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 1.0f;
        }
        if ((n3 &= 2) != 0) {
            f6 = 1500.0f;
        }
        this(f5, f6, 0.01f);
    }

    public final JA3 b(Vs3 object) {
        object = new OA3(this);
        return object;
    }

    public final float c(float f5, float f6, float f7) {
        return 0.0f;
    }

    public final float d(long l2, float f5, float f6, float f7) {
        wa3_0 wa3_02 = this.b;
        wa3_02.a = f6;
        return Float.intBitsToFloat((int)(wa3_02.a(f5, f7, l2 /= 1000000L) >> 32));
    }

    public final float e(long l2, float f5, float f6, float f7) {
        wa3_0 wa3_02 = this.b;
        wa3_02.a = f6;
        return Float.intBitsToFloat((int)(wa3_02.a(f5, f7, l2 /= 1000000L) & 0xFFFFFFFFL));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long f(float var1_1, float var2_2, float var3_3) {
        block25: {
            block26: {
                block31: {
                    block28: {
                        block30: {
                            block29: {
                                block27: {
                                    var4_4 = this.b;
                                    var5_5 = var4_4.b;
                                    var5_5 *= var5_5;
                                    var7_6 = (float)var5_5;
                                    var8_7 = var4_4.g;
                                    var9_8 = var1_1 - var2_2;
                                    var10_9 = this.a;
                                    var9_8 /= var10_9;
                                    var10_9 = var3_3 / var10_9;
                                    cfr_temp_0 = var8_7 - 0.0f;
                                    var11_10 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                    if (var11_10 /* !! */  != false) break block27;
                                    var12_11 = 9223372036854L;
                                    var14_12 = 4.5569512622224E-311;
                                    break block25;
                                }
                                var16_14 = var7_6;
                                var14_13 = var8_7;
                                var18_15 = var10_9;
                                var20_16 = var9_8;
                                var22_17 = 1.0f;
                                var23_18 = var22_17;
                                var25_19 = 2.0;
                                var27_20 = var14_13 * var25_19;
                                var29_21 = Math.sqrt(var16_14);
                                var27_20 *= var29_21;
                                var29_21 = var27_20 * var27_20;
                                var31_22 = 4.0;
                                var16_14 = -var27_20;
                                var27_20 = 0.0;
                                cfr_temp_1 = (var29_21 -= (var16_14 *= var31_22)) - var27_20;
                                var33_23 /* !! */  = (double)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                                if (var33_23 /* !! */  < 0) {
                                    var35_25 = Math.abs(var29_21);
                                    var37_26 = var23_18;
                                    var23_18 = Math.sqrt(var35_25);
                                    var34_24 = new P00(var27_20, var23_18);
                                } else {
                                    var37_26 = var23_18;
                                    var23_18 = Math.sqrt(var29_21);
                                    var34_24 = new P00(var23_18, var27_20);
                                }
                                var23_18 = var34_24.a + var16_14;
                                var35_25 = 0.5;
                                var34_24.a = var23_18 *= var35_25;
                                var34_24.b = var23_18 = var34_24.b * var35_25;
                                if (var33_23 /* !! */  < 0) {
                                    var29_21 = Math.abs(var29_21);
                                    var40_28 = var34_24;
                                    var41_29 = Math.sqrt(var29_21);
                                    var39_27 = new P00(var27_20, var41_29);
                                } else {
                                    var40_28 = var34_24;
                                    var41_29 = Math.sqrt(var29_21);
                                    var39_27 = new P00(var41_29, var27_20);
                                }
                                var41_29 = var39_27.a;
                                var43_30 = -1;
                                var27_20 = var43_30;
                                var41_29 *= var27_20;
                                var44_31 = var14_13;
                                var46_32 = var39_27.b * var27_20;
                                var39_27.a = var41_29 = (var41_29 + var16_14) * var35_25;
                                var39_27.b = var46_32 *= var35_25;
                                var48_33 = 0L;
                                var46_32 = 0.0;
                                var50_34 /* !! */  = var20_16 == var46_32 ? 0 : (var20_16 < var46_32 ? -1 : 1);
                                if (var50_34 /* !! */  == false && (var11_10 /* !! */  = (float)(var18_15 == var46_32 ? 0 : (var18_15 < var46_32 ? -1 : 1))) == false) {
                                    var48_33 = 0L;
                                    var46_32 = 0.0;
lbl69:
                                    // 2 sources

                                    while (true) {
                                        var12_11 = var48_33;
                                        break block25;
                                        break;
                                    }
                                }
                                if (var50_34 /* !! */  < 0) {
                                    var18_15 = -var18_15;
                                }
                                var46_32 = Math.abs(var20_16);
                                var50_34 /* !! */  = (double)true;
                                var7_6 = 1.4E-45f;
                                var27_20 = 1.0;
                                cfr_temp_2 = var44_31 - var27_20;
                                var43_30 = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                if (var43_30 <= 0) break block28;
                                var51_35 = var40_28.a;
                                var53_36 = var39_27.a;
                                var35_25 = var51_35 * var46_32 - var18_15;
                                var18_15 = var51_35 - var53_36;
                                var41_29 = var35_25 / var18_15;
                                var20_16 = Math.log(Math.abs(var37_26 / (var46_32 -= var41_29))) / var51_35;
                                var35_25 = Math.log(Math.abs(var37_26 / var41_29));
                                var55_37 = var18_15;
                                var57_39 = var35_25 / var53_36;
                                var59_40 = Double.isInfinite(var20_16);
                                var59_40 = var59_40 == 0 && (var59_40 = Double.isNaN(var20_16)) == 0 ? 1 : 0;
                                if ((var59_40 ^= var50_34 /* !! */ ) != 0) {
                                    var20_16 = var57_39;
                                } else {
                                    var59_40 = (int)Double.isInfinite(var57_39);
                                    var59_40 = var59_40 == 0 && (var59_40 = (int)Double.isNaN(var57_39)) == 0 ? 1 : 0;
                                    if ((var50_34 /* !! */  = (double)(var50_34 /* !! */  ^ var59_40)) == false) {
                                        var20_16 = Math.max(var20_16, var57_39);
                                    }
                                }
                                var57_39 = var46_32 * var51_35;
                                var60_41 = -var41_29 * var53_36;
                                var60_41 = Math.log(var57_39 / var60_41);
                                var35_25 = var53_36 - var51_35;
                                var50_34 /* !! */  = (double)Double.isNaN(var60_41 /= var35_25);
                                if (var50_34 /* !! */  != false || (var50_34 /* !! */  = (cfr_temp_3 = var60_41 - (var62_42 = 0.0)) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1)) <= 0) break block29;
                                var50_34 /* !! */  = (double)(var60_41 == var62_42 ? 0 : (var60_41 > var62_42 ? 1 : -1));
                                if (var50_34 /* !! */  <= 0) ** GOTO lbl-1000
                                var35_25 = Math.exp(var51_35 * var60_41) * var46_32;
                                cfr_temp_4 = (var60_41 = -(Math.exp(var60_41 * var53_36) * var41_29 + var35_25)) - var37_26;
                                var50_34 /* !! */  = (double)(cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1));
                                if (var50_34 /* !! */  < 0) {
                                    var60_41 = 0.0;
                                    cfr_temp_5 = var41_29 - var60_41;
                                    var50_34 /* !! */  = (double)(cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1));
                                    if (var50_34 /* !! */  > 0 && (var50_34 /* !! */  = var46_32 == var60_41 ? 0 : (var46_32 < var60_41 ? -1 : 1)) < 0) {
                                        var60_41 = var37_26;
                                        var62_42 = 0.0;
                                    } else {
                                        var62_42 = var20_16;
                                        var60_41 = var37_26;
                                    }
                                    var60_41 = var5_5 = -var60_41;
                                    var20_16 = var62_42;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var60_41 = var37_26;
                                    var5_5 = -(var41_29 * var53_36 * var53_36);
                                    var62_42 = var57_39 * var51_35;
                                    var5_5 = Math.log(var5_5 / var62_42);
                                    var62_42 = var55_37;
                                    var20_16 = var5_5 / var55_37;
                                }
                                break block30;
                            }
                            var60_41 = var37_26;
                            var60_41 = -var37_26;
                        }
                        var62_42 = Math.exp(var51_35 * var20_16) * var57_39;
                        var35_25 = var41_29 * var53_36;
                        var62_42 = Math.abs(Math.exp(var53_36 * var20_16) * var35_25 + var62_42);
                        var37_26 = 1.0E-4;
                        var50_34 /* !! */  = var62_42 == var37_26 ? 0 : (var62_42 < var37_26 ? -1 : 1);
                        if (var50_34 /* !! */  >= 0) {
                            var11_10 /* !! */  = (float)false;
                            var62_42 = 0.001;
                            var64_44 = 1.7976931348623157E308;
                            while ((var50_34 /* !! */  = var64_44 == var62_42 ? 0 : (var64_44 > var62_42 ? 1 : -1)) > 0) {
                                var50_34 /* !! */  = 100;
                                var7_6 = 1.4E-43f;
                                if (var11_10 /* !! */  < var50_34 /* !! */ ) {
                                    ++var11_10 /* !! */ ;
                                    var62_42 = var51_35 * var20_16;
                                    var37_26 = Math.exp(var62_42) * var46_32;
                                    var44_31 = var53_36 * var20_16;
                                    var64_44 = Math.exp(var44_31) * var41_29 + var37_26 + var60_41;
                                    var62_42 = Math.exp(var62_42) * var57_39;
                                    var37_26 = Math.exp(var44_31) * var35_25 + var62_42;
                                    var62_42 = var20_16 - (var64_44 /= var37_26);
                                    var64_44 = Math.abs(var20_16 - var62_42);
                                    var20_16 = var62_42;
                                    var62_42 = 0.001;
                                    continue;
                                }
                                break block26;
                            }
                        }
                        break block26;
                    }
                    var20_16 = var37_26;
                    var66_46 /* !! */  = (double)(var44_31 == var27_20 ? 0 : (var44_31 < var27_20 ? -1 : 1));
                    if (var66_46 /* !! */  >= 0) break block31;
                    var16_14 = var40_28.a;
                    var23_18 = var16_14 * var46_32;
                    var18_15 -= var23_18;
                    var23_18 = var40_28.b;
                    var18_15 /= var23_18;
                    var46_32 *= var46_32;
                    var18_15 = var18_15 * var18_15 + var46_32;
                    var46_32 = Math.sqrt(var18_15);
                    var23_18 = var37_26 / var46_32;
                    var46_32 = Math.log(var23_18);
                    var20_16 = var46_32 / var16_14;
                    break block26;
                }
                var23_18 = var40_28.a;
                var25_19 = var23_18 * var46_32;
                var27_20 = Math.log(Math.abs(var37_26 / var46_32)) / var23_18;
                var37_26 = var35_25 = Math.log(Math.abs(var37_26 / (var18_15 -= var25_19)));
                for (var66_46 /* !! */  = (double)false; var66_46 /* !! */  < (var43_30 = 6); ++var66_46 /* !! */ ) {
                    var37_26 = Math.log(Math.abs(var37_26 / var23_18));
                    var37_26 = var35_25 - var37_26;
                }
                var16_14 = var37_26 / var23_18;
                var67_47 = Double.isInfinite(var27_20);
                var67_47 = var67_47 == false && (var67_47 = Double.isNaN(var27_20)) == false;
                if (var67_47 ^= true) {
                    var27_20 = var16_14;
                } else {
                    var67_47 = Double.isInfinite(var16_14);
                    var67_47 = var67_47 == false && (var67_47 = Double.isNaN(var16_14)) == false;
                    if (!(var67_47 ^= true)) {
                        var27_20 = Math.max(var27_20, var16_14);
                    }
                }
                var16_14 = -(var25_19 + var18_15);
                var35_25 = var23_18 * var18_15;
                var16_14 /= var35_25;
                var35_25 = var23_18 * var16_14;
                var37_26 = Math.exp(var35_25) * var46_32;
                var44_31 = var18_15 * var16_14;
                var35_25 = Math.exp(var35_25) * var44_31;
                var68_48 = var20_16;
                var5_5 = var35_25 + var37_26;
                var70_49 = Double.isNaN(var16_14);
                if (var70_49 != 0 || (var70_49 = (cfr_temp_6 = var16_14 - (var62_43 = 0.0)) == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1)) <= 0) ** GOTO lbl213
                var70_49 = (int)(var16_14 == var62_43 ? 0 : (var16_14 > var62_43 ? 1 : -1));
                if (var70_49 > 0 && (var70_49 = (int)((cfr_temp_7 = (var5_5 = -var5_5) - var20_16) == 0.0 ? 0 : (cfr_temp_7 < 0.0 ? -1 : 1))) < 0) {
                    var50_34 /* !! */  = (double)(var18_15 == var62_43 ? 0 : (var18_15 < var62_43 ? -1 : 1));
                    if (var50_34 /* !! */  < 0 && (var50_34 /* !! */  = var46_32 == var62_43 ? 0 : (var46_32 > var62_43 ? 1 : -1)) > 0) {
                        var27_20 = var62_43;
                    }
lbl213:
                    // 4 sources

                    var5_5 = var68_48;
                    var5_5 = -var68_48;
                } else {
                    var5_5 = var68_48;
                    var71_50 = -(2.0 / var23_18);
                    var27_20 = var46_32 / var18_15;
                    var27_20 = var71_50 - var27_20;
                }
                var71_50 = 0.001;
                var64_45 = 1.7976931348623157E308;
                for (var66_46 /* !! */  = (double)false; (var43_30 = (int)(var64_45 == var71_50 ? 0 : (var64_45 > var71_50 ? 1 : -1))) > 0 && var66_46 /* !! */  < (var43_30 = 100); ++var66_46 /* !! */ ) {
                    var62_43 = var18_15 * var27_20 + var46_32;
                    var35_25 = var23_18 * var27_20;
                    var37_26 = Math.exp(var35_25) * var62_43 + var5_5;
                    var55_38 = var46_32;
                    var70_49 = 1;
                    var10_9 = 1.4E-45f;
                    var46_32 = var70_49;
                    var46_32 = (var35_25 + var46_32) * var18_15 + var25_19;
                    var62_43 = Math.exp(var35_25) * var46_32;
                    var46_32 = var27_20 - (var37_26 /= var62_43);
                    var64_45 = Math.abs(var27_20 - var46_32);
                    var27_20 = var46_32;
                    var71_50 = 0.001;
                    var46_32 = var55_38;
                }
                var20_16 = var27_20;
            }
            var46_32 = 1000.0;
            var48_33 = (long)(var20_16 *= var46_32);
            ** while (true)
        }
        return var12_11 * 1000000L;
    }
}

