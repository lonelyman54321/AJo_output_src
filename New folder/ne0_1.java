/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ne0
 */
public final class ne0_1
implements cx0_0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ne0_1(float f5, float f6, float f7) {
        float f8;
        ne0_1 ne0_12 = this;
        float f11 = f5;
        float f12 = f6;
        float f14 = f7;
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8 = 1.0f;
        int n3 = Float.isNaN(f5);
        if (n3 == 0 && (n3 = Float.isNaN(f6)) == 0 && (n3 = Float.isNaN(f7)) == 0 && (n3 = Float.isNaN(f8)) == 0) {
            float f15;
            float f16;
            int n4;
            float f17;
            float f18;
            Object object;
            int n7 = 5;
            f11 = 7.0E-45f;
            float[] fArray = new float[n7];
            f14 = 0.0f;
            float f19 = f6 - 0.0f;
            float f20 = 3.0f;
            float f22 = (f8 - f6) * f20;
            double d2 = f19 *= f20;
            double d5 = f22;
            double d7 = 0.0f;
            double d9 = 2.0;
            double d12 = d5 * d9;
            double d13 = d2 - d12 + d7;
            double d14 = 0.0;
            int n8 = 0;
            f20 = 0.0f;
            Object object2 = d13 == d14 ? 0 : (d13 < d14 ? -1 : 1);
            if (object2 == false) {
                object = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
                if (object == false) {
                    object = false;
                    f18 = 0.0f;
                } else {
                    d2 = d12 - d7;
                    f18 = (float)(d2 /= (d12 -= (d7 *= d9)));
                    object = Cx.h(fArray, 0, f18);
                }
            } else {
                d9 = d5 * d5;
                d7 = -Math.sqrt(d9 -= (d7 *= d2));
                d2 = -d2 + d5;
                d5 = -(d7 + d2) / d13;
                f17 = (float)d5;
                n4 = Cx.h(fArray, 0, f17);
                d7 = (d7 - d2) / d13;
                f18 = (float)d7;
                object = Cx.h(fArray, n4, f18) + n4;
                int n10 = 1;
                f16 = Float.MIN_VALUE;
                if (object > n10) {
                    f17 = fArray[0];
                    f15 = fArray[n10];
                    float f23 = f17 - f15;
                    Object object3 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                    if (object3 > 0) {
                        fArray[0] = f15;
                        fArray[n10] = f17;
                    } else {
                        n10 = (int)(f17 == f15 ? 0 : (f17 < f15 ? -1 : 1));
                        if (n10 == 0) {
                            object += -1;
                        }
                    }
                }
            }
            f16 = f22 - f19;
            n4 = 0x40000000;
            f17 = 2.0f;
            f22 = (0.0f - f22) * f17;
            f15 = -(f16 *= f17);
            int n14 = Cx.h(fArray, (int)object, f15 /= (f22 -= f16)) + object;
            f18 = Math.min(0.0f, f8);
            f16 = Math.max(0.0f, f8);
            while (n8 < n14) {
                f15 = fArray[n8];
                float f24 = f12 - f8;
                float f25 = 3.0f;
                f24 = f24 * f25 + f8 - 0.0f;
                float f26 = f12 * f17;
                f26 = (f8 - f26 + 0.0f) * f25;
                f24 = ((f24 * f15 + f26) * f15 + f19) * f15 + 0.0f;
                f18 = Math.min(f18, f24);
                f16 = Math.max(f16, f24);
                ++n8;
            }
            long l2 = Float.floatToRawIntBits(f18);
            long l3 = Float.floatToRawIntBits(f16);
            n3 = 32;
            l2 <<= n3;
            long l4 = 0xFFFFFFFFL;
            ne0_12.e = f14 = Float.intBitsToFloat((int)((l2 |= (l3 &= l4)) >> n3));
            ne0_12.f = f11 = Float.intBitsToFloat((int)(l2 & l4));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
        stringBuilder.append(f11);
        String string2 = ", ";
        stringBuilder.append(string2);
        stringBuilder.append(f12);
        stringBuilder.append(string2);
        stringBuilder.append(f14);
        stringBuilder.append(", 1.0.");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final float a(float var1_1) {
        block33: {
            block28: {
                block44: {
                    block41: {
                        block43: {
                            block42: {
                                block32: {
                                    block39: {
                                        block40: {
                                            block31: {
                                                block30: {
                                                    block34: {
                                                        block38: {
                                                            block29: {
                                                                block35: {
                                                                    block36: {
                                                                        block37: {
                                                                            var2_2 = this;
                                                                            var3_3 = var1_1;
                                                                            var4_4 /* !! */  = 0;
                                                                            var5_5 = 0.0f;
                                                                            var6_6 = null;
                                                                            cfr_temp_0 = var1_1 - 0.0f;
                                                                            var7_7 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                                            if (var7_7 /* !! */  <= 0) break block33;
                                                                            var7_7 /* !! */  = 1065353216;
                                                                            var8_8 = 1.0f;
                                                                            cfr_temp_1 = var1_1 - var8_8;
                                                                            var9_9 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                                            if (var9_9 /* !! */  >= 0) break block33;
                                                                            var10_10 = 0.0f - var1_1;
                                                                            var11_11 = this.a;
                                                                            var12_12 = var11_11 - var1_1;
                                                                            var13_13 = this.c;
                                                                            var14_14 = var13_13 - var1_1;
                                                                            var15_15 = var8_8 - var1_1;
                                                                            var16_16 = var10_10;
                                                                            var18_17 = (double)var12_12 * 2.0;
                                                                            var18_17 = var16_16 - var18_17;
                                                                            var20_18 = var14_14;
                                                                            var18_17 += var20_18;
                                                                            var20_18 = 3.0;
                                                                            var18_17 *= var20_18;
                                                                            var8_8 = var12_12 - var10_10;
                                                                            var22_19 = (double)var8_8 * var20_18;
                                                                            var20_18 = -var10_10;
                                                                            var10_10 = var13_13;
                                                                            var24_20 = var12_12 -= var14_14;
                                                                            var26_21 = 3.0;
                                                                            var24_20 = var24_20 * var26_21 + var20_18;
                                                                            var28_22 = var15_15;
                                                                            var24_20 += var28_22;
                                                                            var28_22 = 0.0;
                                                                            var20_18 = Math.abs(var24_20 - var28_22);
                                                                            var30_23 = 2.0f;
                                                                            var31_24 = 1.0000008f;
                                                                            var32_25 = -8.34465E-7f;
                                                                            var33_26 = 0.0f / 0.0f;
                                                                            var34_27 = 1.0E-7;
                                                                            cfr_temp_2 = var20_18 - var34_27;
                                                                            var36_28 /* !! */  = (double)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1));
                                                                            if (var36_28 /* !! */  >= 0) break block34;
                                                                            var24_20 = Math.abs(var18_17 - var28_22);
                                                                            cfr_temp_3 = var24_20 - var34_27;
                                                                            var37_29 /* !! */  = (double)(cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                                                                            if (var37_29 /* !! */  >= 0) break block35;
                                                                            var24_20 = Math.abs(var22_19 - var28_22);
                                                                            cfr_temp_4 = var24_20 - var34_27;
                                                                            var38_31 /* !! */  = (double)(cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1));
                                                                            if (var38_31 /* !! */  < 0) break block28;
                                                                            var24_20 = -var16_16 / var22_19;
                                                                            var5_5 = (float)var24_20;
                                                                            var7_7 /* !! */  = (float)false;
                                                                            var8_8 = 0.0f;
                                                                            cfr_temp_5 = var5_5 - 0.0f;
                                                                            var39_35 /* !! */  = (float)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1));
                                                                            if (var39_35 /* !! */  >= 0) break block36;
                                                                            var4_4 /* !! */  = (int)(var5_5 == var32_25 ? 0 : (var5_5 > var32_25 ? 1 : -1));
                                                                            if (var4_4 /* !! */  < 0) break block37;
lbl63:
                                                                            // 5 sources

                                                                            while (true) {
                                                                                var4_4 /* !! */  = 0;
                                                                                var5_5 = 0.0f;
                                                                                var6_6 = null;
                                                                                ** GOTO lbl84
                                                                                break;
                                                                            }
                                                                        }
lbl69:
                                                                        // 10 sources

                                                                        while (true) {
                                                                            var4_4 /* !! */  = 2143289344;
                                                                            var5_5 = 0.0f / 0.0f;
                                                                            ** GOTO lbl84
                                                                            break;
                                                                        }
                                                                    }
                                                                    var7_7 /* !! */  = 1065353216;
                                                                    var8_8 = 1.0f;
                                                                    cfr_temp_6 = var5_5 - var8_8;
                                                                    var39_35 /* !! */  = (float)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                                                                    if (var39_35 /* !! */  <= 0) ** GOTO lbl84
                                                                    var4_4 /* !! */  = (int)(var5_5 == var31_24 ? 0 : (var5_5 < var31_24 ? -1 : 1));
                                                                    if (var4_4 /* !! */  > 0) ** GOTO lbl69
lbl81:
                                                                    // 5 sources

                                                                    while (true) {
                                                                        var4_4 /* !! */  = 1065353216;
                                                                        var5_5 = 1.0f;
lbl84:
                                                                        // 8 sources

                                                                        while (true) {
                                                                            var33_26 = var5_5;
                                                                            break block28;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                var24_20 = var22_19 * var22_19;
                                                                var28_22 = 4.0 * var18_17 * var16_16;
                                                                var24_20 = Math.sqrt(var24_20 - var28_22);
                                                                var28_22 = (var24_20 - var22_19) / (var18_17 *= 2.0);
                                                                var14_14 = (float)var28_22;
                                                                var40_41 = 0;
                                                                var15_15 = 0.0f;
                                                                cfr_temp_7 = var14_14 - 0.0f;
                                                                var41_43 /* !! */  = (float)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 < 0.0f ? -1 : 1));
                                                                if (var41_43 /* !! */  >= 0) ** GOTO lbl107
                                                                var38_32 /* !! */  = (float)(var14_14 == var32_25 ? 0 : (var14_14 > var32_25 ? 1 : -1));
                                                                if (var38_32 /* !! */  >= 0) {
                                                                    var38_32 /* !! */  = (float)false;
                                                                    var14_14 = 0.0f;
                                                                } else {
                                                                    while (true) {
                                                                        var38_32 /* !! */  = 2143289344;
                                                                        var14_14 = 0.0f / 0.0f;
                                                                        break block29;
                                                                        break;
                                                                    }
lbl107:
                                                                    // 1 sources

                                                                    var40_41 = 1065353216;
                                                                    var15_15 = 1.0f;
                                                                    cfr_temp_8 = var14_14 - var15_15;
                                                                    var41_43 /* !! */  = (float)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1));
                                                                    if (var41_43 /* !! */  > 0) {
                                                                        if ((var38_32 /* !! */  = var14_14 == var31_24 ? 0 : (var14_14 < var31_24 ? -1 : 1)) > 0) ** continue;
                                                                        var38_32 /* !! */  = 1065353216;
                                                                        var14_14 = 1.0f;
                                                                    }
                                                                }
                                                            }
                                                            var40_41 = (int)Float.isNaN(var14_14);
                                                            if (var40_41 == 0) lbl-1000:
                                                            // 3 sources

                                                            {
                                                                while (true) {
                                                                    var33_26 = var14_14;
                                                                    break block28;
                                                                    break;
                                                                }
                                                            }
                                                            var22_19 = (-var22_19 - var24_20) / var18_17;
                                                            var5_5 = (float)var22_19;
                                                            var7_7 /* !! */  = (float)false;
                                                            var8_8 = 0.0f;
                                                            cfr_temp_9 = var5_5 - 0.0f;
                                                            var39_36 /* !! */  = (float)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 < 0.0f ? -1 : 1));
                                                            if (var39_36 /* !! */  >= 0) break block38;
                                                            var4_4 /* !! */  = (int)(var5_5 == var32_25 ? 0 : (var5_5 > var32_25 ? 1 : -1));
                                                            if (var4_4 /* !! */  < 0) ** GOTO lbl69
                                                            ** GOTO lbl63
                                                        }
                                                        var7_7 /* !! */  = 1065353216;
                                                        var8_8 = 1.0f;
                                                        cfr_temp_10 = var5_5 - var8_8;
                                                        var39_36 /* !! */  = (float)(cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1));
                                                        if (var39_36 /* !! */  <= 0) ** GOTO lbl84
                                                        var4_4 /* !! */  = (int)(var5_5 == var31_24 ? 0 : (var5_5 < var31_24 ? -1 : 1));
                                                        if (var4_4 /* !! */  > 0) ** GOTO lbl69
                                                        ** GOTO lbl81
                                                    }
                                                    var18_17 /= var24_20;
                                                    var16_16 /= var24_20;
                                                    var20_18 = (var22_19 /= var24_20) * 3.0;
                                                    var24_20 = var18_17 * var18_17;
                                                    var20_18 -= var24_20;
                                                    var24_20 = 9.0;
                                                    var20_18 /= var24_20;
                                                    var42_45 = 2.0 * var18_17 * var18_17 * var18_17;
                                                    var24_20 = var24_20 * var18_17 * var22_19;
                                                    var16_16 = (var16_16 * 27.0 + (var42_45 -= var24_20)) / 54.0;
                                                    var22_19 = var16_16 * var16_16;
                                                    var24_20 = var20_18 * var20_18 * var20_18;
                                                    var20_18 = 3.0;
                                                    var18_17 /= var20_18;
                                                    cfr_temp_11 = (var22_19 += var24_20) - var28_22;
                                                    var37_30 /* !! */  = (double)(cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 < 0.0 ? -1 : 1));
                                                    if (var37_30 /* !! */  >= 0) break block39;
                                                    var22_19 = Math.sqrt(-var24_20);
                                                    cfr_temp_12 = (var24_20 = -var16_16 / var22_19) - (var28_22 = -1.0);
                                                    var41_44 /* !! */  = (double)(cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 < 0.0 ? -1 : 1));
                                                    if (var41_44 /* !! */  < 0) {
                                                        var24_20 = var28_22;
                                                    }
                                                    if ((var41_44 /* !! */  = (cfr_temp_13 = var24_20 - (var28_22 = 1.0)) == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1)) > 0) {
                                                        var24_20 = var28_22;
                                                    }
                                                    var24_20 = Math.acos(var24_20);
                                                    var5_5 = LK1.b((float)var22_19) * var30_23;
                                                    var22_19 = var5_5;
                                                    var16_16 = var24_20 / 3.0;
                                                    var28_22 = Math.cos(var16_16) * var22_19 - var18_17;
                                                    var14_14 = (float)var28_22;
                                                    var40_42 = 0;
                                                    var15_15 = 0.0f;
                                                    cfr_temp_14 = var14_14 - 0.0f;
                                                    var41_44 /* !! */  = (double)(cfr_temp_14 == 0.0f ? 0 : (cfr_temp_14 < 0.0f ? -1 : 1));
                                                    if (var41_44 /* !! */  >= 0) ** GOTO lbl185
                                                    var38_33 /* !! */  = (float)(var14_14 == var32_25 ? 0 : (var14_14 > var32_25 ? 1 : -1));
                                                    if (var38_33 /* !! */  >= 0) {
                                                        var38_33 /* !! */  = (float)false;
                                                        var14_14 = 0.0f;
                                                    } else {
                                                        while (true) {
                                                            var38_33 /* !! */  = 2143289344;
                                                            var14_14 = 0.0f / 0.0f;
                                                            break block30;
                                                            break;
                                                        }
lbl185:
                                                        // 1 sources

                                                        var40_42 = 1065353216;
                                                        var15_15 = 1.0f;
                                                        cfr_temp_15 = var14_14 - var15_15;
                                                        var41_44 /* !! */  = (double)(cfr_temp_15 == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1));
                                                        if (var41_44 /* !! */  > 0) {
                                                            if ((var38_33 /* !! */  = var14_14 == var31_24 ? 0 : (var14_14 < var31_24 ? -1 : 1)) > 0) ** continue;
                                                            var38_33 /* !! */  = 1065353216;
                                                            var14_14 = 1.0f;
                                                        }
                                                    }
                                                }
                                                var40_42 = (int)Float.isNaN(var14_14);
                                                if (var40_42 == 0) ** GOTO lbl-1000
                                                var28_22 = 6.283185307179586 + var24_20;
                                                var16_16 = 3.0;
                                                var28_22 = Math.cos(var28_22 / var16_16) * var22_19 - var18_17;
                                                var14_14 = (float)var28_22;
                                                var40_42 = 0;
                                                var15_15 = 0.0f;
                                                cfr_temp_16 = var14_14 - 0.0f;
                                                var41_44 /* !! */  = (double)(cfr_temp_16 == 0.0f ? 0 : (cfr_temp_16 < 0.0f ? -1 : 1));
                                                if (var41_44 /* !! */  >= 0) ** GOTO lbl214
                                                var38_33 /* !! */  = (float)(var14_14 == var32_25 ? 0 : (var14_14 > var32_25 ? 1 : -1));
                                                if (var38_33 /* !! */  >= 0) {
                                                    var38_33 /* !! */  = (float)false;
                                                    var14_14 = 0.0f;
                                                } else {
                                                    while (true) {
                                                        var38_33 /* !! */  = 2143289344;
                                                        var14_14 = 0.0f / 0.0f;
                                                        break block31;
                                                        break;
                                                    }
lbl214:
                                                    // 1 sources

                                                    var40_42 = 1065353216;
                                                    var15_15 = 1.0f;
                                                    cfr_temp_17 = var14_14 - var15_15;
                                                    var41_44 /* !! */  = (double)(cfr_temp_17 == 0.0f ? 0 : (cfr_temp_17 > 0.0f ? 1 : -1));
                                                    if (var41_44 /* !! */  > 0) {
                                                        if ((var38_33 /* !! */  = var14_14 == var31_24 ? 0 : (var14_14 < var31_24 ? -1 : 1)) > 0) ** continue;
                                                        var38_33 /* !! */  = 1065353216;
                                                        var14_14 = 1.0f;
                                                    }
                                                }
                                            }
                                            var40_42 = (int)Float.isNaN(var14_14);
                                            ** while (var40_42 == 0)
lbl225:
                                            // 1 sources

                                            var24_20 += 12.566370614359172;
                                            var28_22 = 3.0;
                                            var24_20 = Math.cos(var24_20 / var28_22) * var22_19 - var18_17;
                                            var5_5 = (float)var24_20;
                                            var7_7 /* !! */  = (float)false;
                                            var8_8 = 0.0f;
                                            cfr_temp_18 = var5_5 - 0.0f;
                                            var39_37 /* !! */  = (float)(cfr_temp_18 == 0.0f ? 0 : (cfr_temp_18 < 0.0f ? -1 : 1));
                                            if (var39_37 /* !! */  >= 0) break block40;
                                            var4_4 /* !! */  = (int)(var5_5 == var32_25 ? 0 : (var5_5 > var32_25 ? 1 : -1));
                                            if (var4_4 /* !! */  < 0) ** GOTO lbl69
                                            ** GOTO lbl63
                                        }
                                        var7_7 /* !! */  = 1065353216;
                                        var8_8 = 1.0f;
                                        cfr_temp_19 = var5_5 - var8_8;
                                        var39_37 /* !! */  = (float)(cfr_temp_19 == 0.0f ? 0 : (cfr_temp_19 > 0.0f ? 1 : -1));
                                        if (var39_37 /* !! */  <= 0) ** GOTO lbl84
                                        var4_4 /* !! */  = (int)(var5_5 == var31_24 ? 0 : (var5_5 < var31_24 ? -1 : 1));
                                        if (var4_4 /* !! */  > 0) ** GOTO lbl69
                                        ** GOTO lbl81
                                    }
                                    if (var37_30 /* !! */  != false) break block41;
                                    var5_5 = -LK1.b((float)var16_16);
                                    var8_8 = var5_5 * var30_23;
                                    var12_12 = (float)var18_17;
                                    var44_46 = 0;
                                    var13_13 = 0.0f;
                                    var45_40 = null;
                                    cfr_temp_20 = (var8_8 -= var12_12) - 0.0f;
                                    var38_34 /* !! */  = (float)(cfr_temp_20 == 0.0f ? 0 : (cfr_temp_20 < 0.0f ? -1 : 1));
                                    if (var38_34 /* !! */  >= 0) ** GOTO lbl266
                                    var7_7 /* !! */  = (float)(var8_8 == var32_25 ? 0 : (var8_8 > var32_25 ? 1 : -1));
                                    if (var7_7 /* !! */  >= 0) {
                                        var7_7 /* !! */  = (float)false;
                                        var8_8 = 0.0f;
                                    } else {
                                        while (true) {
                                            var7_7 /* !! */  = 2143289344;
                                            var8_8 = 0.0f / 0.0f;
                                            break block32;
                                            break;
                                        }
lbl266:
                                        // 1 sources

                                        var44_46 = 1065353216;
                                        var13_13 = 1.0f;
                                        cfr_temp_21 = var8_8 - var13_13;
                                        var38_34 /* !! */  = (float)(cfr_temp_21 == 0.0f ? 0 : (cfr_temp_21 > 0.0f ? 1 : -1));
                                        if (var38_34 /* !! */  > 0) {
                                            if ((var7_7 /* !! */  = var8_8 == var31_24 ? 0 : (var8_8 < var31_24 ? -1 : 1)) > 0) ** continue;
                                            var7_7 /* !! */  = 1065353216;
                                            var8_8 = 1.0f;
                                        }
                                    }
                                }
                                var44_46 = (int)Float.isNaN(var8_8);
                                if (var44_46 != 0) break block42;
                                var33_26 = var8_8;
                                break block28;
                            }
                            var5_5 = -var5_5 - var12_12;
                            var7_7 /* !! */  = (float)false;
                            var8_8 = 0.0f;
                            cfr_temp_22 = var5_5 - 0.0f;
                            var39_38 /* !! */  = (float)(cfr_temp_22 == 0.0f ? 0 : (cfr_temp_22 < 0.0f ? -1 : 1));
                            if (var39_38 /* !! */  >= 0) break block43;
                            var4_4 /* !! */  = (int)(var5_5 == var32_25 ? 0 : (var5_5 > var32_25 ? 1 : -1));
                            if (var4_4 /* !! */  < 0) ** GOTO lbl69
                            ** GOTO lbl63
                        }
                        var7_7 /* !! */  = 1065353216;
                        var8_8 = 1.0f;
                        cfr_temp_23 = var5_5 - var8_8;
                        var39_38 /* !! */  = (float)(cfr_temp_23 == 0.0f ? 0 : (cfr_temp_23 > 0.0f ? 1 : -1));
                        if (var39_38 /* !! */  <= 0) ** GOTO lbl84
                        var4_4 /* !! */  = (int)(var5_5 == var31_24 ? 0 : (var5_5 < var31_24 ? -1 : 1));
                        if (var4_4 /* !! */  > 0) ** GOTO lbl69
                        ** GOTO lbl81
                    }
                    var22_19 = Math.sqrt(var22_19);
                    var24_20 = -var16_16 + var22_19;
                    var12_12 = LK1.b((float)var24_20);
                    var5_5 = LK1.b((float)(var16_16 += var22_19));
                    var22_19 = (double)(var12_12 -= var5_5) - var18_17;
                    var5_5 = (float)var22_19;
                    var7_7 /* !! */  = (float)false;
                    var8_8 = 0.0f;
                    cfr_temp_24 = var5_5 - 0.0f;
                    var39_39 /* !! */  = (float)(cfr_temp_24 == 0.0f ? 0 : (cfr_temp_24 < 0.0f ? -1 : 1));
                    if (var39_39 /* !! */  >= 0) break block44;
                    var4_4 /* !! */  = (int)(var5_5 == var32_25 ? 0 : (var5_5 > var32_25 ? 1 : -1));
                    if (var4_4 /* !! */  < 0) ** GOTO lbl69
                    ** while (true)
                }
                var7_7 /* !! */  = 1065353216;
                var8_8 = 1.0f;
                cfr_temp_25 = var5_5 - var8_8;
                var39_39 /* !! */  = (float)(cfr_temp_25 == 0.0f ? 0 : (cfr_temp_25 > 0.0f ? 1 : -1));
                if (var39_39 /* !! */  > 0) ** break;
                ** while (true)
                var4_4 /* !! */  = (int)(var5_5 == var31_24 ? 0 : (var5_5 < var31_24 ? -1 : 1));
                if (var4_4 /* !! */  <= 0) ** break;
                ** while (true)
                ** while (true)
            }
            var4_4 /* !! */  = Float.isNaN(var33_26);
            var8_8 = var2_2.d;
            var12_12 = var2_2.b;
            if (var4_4 /* !! */  == 0) {
                var5_5 = var12_12 - var8_8 + 0.33333334f;
                var3_3 = var2_2.e;
                cfr_temp_26 = (var5_5 = ((var5_5 * var33_26 + (var8_8 -= (var30_23 *= var12_12))) * var33_26 + var12_12) * 3.0f * var33_26) - var3_3;
                var7_7 /* !! */  = (float)(cfr_temp_26 == 0.0f ? 0 : (cfr_temp_26 < 0.0f ? -1 : 1));
                if (var7_7 /* !! */  < 0) {
                    var5_5 = var3_3;
                }
                if ((var7_7 /* !! */  = (cfr_temp_27 = var5_5 - (var3_3 = var2_2.f)) == 0.0f ? 0 : (cfr_temp_27 > 0.0f ? 1 : -1)) <= 0) {
                    var3_3 = var5_5;
                }
            } else {
                var45_40 = new StringBuilder("The cubic curve with parameters (");
                var45_40.append(var11_11);
                var46_47 = ", ";
                var45_40.append(var46_47);
                var45_40.append(var12_12);
                var45_40.append(var46_47);
                var45_40.append(var10_10);
                var45_40.append(var46_47);
                var45_40.append(var8_8);
                var45_40.append(") has no solution at ");
                var45_40.append(var3_3);
                var47_48 = var45_40.toString();
                var6_6 = new IllegalArgumentException(var47_48);
                throw var6_6;
            }
        }
        return var3_3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ne0_1;
        if (!bl2) return false;
        object = (ne0_1)object;
        float f5 = this.a;
        float f6 = ((ne0_1)object).a;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 != false) return false;
        f6 = this.b;
        f5 = ((ne0_1)object).b;
        float f8 = f6 - f5;
        Object object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object3 != false) return false;
        f6 = this.c;
        f5 = ((ne0_1)object).c;
        float f11 = f6 - f5;
        Object object4 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object4 != false) return false;
        f6 = this.d;
        float f12 = ((ne0_1)object).d;
        float f14 = f6 - f12;
        Object object5 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object5) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        return Float.floatToIntBits(this.d) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CubicBezierEasing(a=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", b=");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", c=");
        f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", d=");
        f5 = this.d;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

