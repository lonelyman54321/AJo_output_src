/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from l93
 */
public final class l93_0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public l93_0(int n3, int n4, float f5, float f6, int n7) {
        int n8;
        this.a = n3;
        this.b = n4;
        this.c = f5;
        this.d = f6;
        f5 = n3;
        f6 = n7;
        this.e = f5 /= f6;
        this.f = n8 = n3 / 400;
        this.g = n3 /= 65;
        this.h = n3 *= 2;
        short[] sArray = new short[n3];
        this.i = sArray;
        sArray = new short[n3 * n4];
        this.j = sArray;
        sArray = new short[n3 * n4];
        this.l = sArray;
        short[] sArray2 = new short[n3 * n4];
        this.n = sArray2;
    }

    public static void e(int n3, int n4, short[] sArray, int n7, short[] sArray2, int n8, short[] sArray3, int n10) {
        for (int i3 = 0; i3 < n4; ++i3) {
            int n14 = n7 * n4 + i3;
            int n15 = n10 * n4 + i3;
            int n16 = n8 * n4 + i3;
            for (int i8 = 0; i8 < n3; ++i8) {
                short s7 = sArray2[n16];
                int n17 = (n3 - i8) * s7;
                sArray[n14] = s7 = (short)((sArray3[n15] * i8 + n17) / n3);
                n14 += n4;
                n16 += n4;
                n15 += n4;
            }
        }
    }

    public final void a(short[] sArray, int n3, int n4) {
        int n7;
        short[] sArray2 = this.l;
        int n8 = this.m;
        this.l = sArray2 = this.c(sArray2, n8, n4);
        n8 = this.b;
        n3 *= n8;
        int n10 = this.m * n8;
        System.arraycopy(sArray, n3, sArray2, n10, n8 *= n4);
        this.m = n7 = this.m + n4;
    }

    public final void b(short[] sArray, int n3, int n4) {
        int n7 = this.h / n4;
        int n8 = this.b;
        n4 *= n8;
        n3 *= n8;
        n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            short[] sArray2 = null;
            int n10 = 0;
            for (int i8 = 0; i8 < n4; ++i8) {
                int n14 = a60.a(i3, n4, n3, i8);
                n14 = sArray[n14];
                n10 += n14;
            }
            n10 /= n4;
            sArray2 = this.i;
            sArray2[i3] = n10 = (int)((short)n10);
        }
    }

    public final short[] c(short[] sArray, int n3, int n4) {
        int n7 = sArray.length;
        int n8 = this.b;
        if ((n3 += n4) <= (n7 /= n8)) {
            return sArray;
        }
        n7 = (n7 * 3 / 2 + n4) * n8;
        return Arrays.copyOf(sArray, n7);
    }

    public final int d(short[] sArray, int n3, int n4, int n7) {
        int n8 = this.b;
        n3 *= n8;
        n8 = 0;
        int n10 = 255;
        int n14 = 1;
        int n15 = 0;
        int n16 = 0;
        while (n4 <= n7) {
            int n17;
            int n18;
            int n19 = 0;
            for (n18 = 0; n18 < n4; ++n18) {
                n17 = n3 + n18;
                n17 = sArray[n17];
                int n20 = n3 + n4 + n18;
                n20 = sArray[n20];
                n17 = Math.abs(n17 - n20);
                n19 += n17;
            }
            n18 = n19 * n15;
            n17 = n14 * n4;
            if (n18 < n17) {
                n15 = n4;
                n14 = n19;
            }
            if ((n18 = n19 * n10) > (n17 = n16 * n4)) {
                n10 = n4;
                n16 = n19;
            }
            ++n4;
        }
        this.u = n14 /= n15;
        this.v = n16 /= n10;
        return n15;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f() {
        block33: {
            var1_1 = this;
            var2_2 = this.m;
            var3_3 = this.c;
            var4_4 = this.d;
            var5_5 = var3_3 / var4_4;
            var3_3 = this.e * var4_4;
            var7_6 = 4607182463836013682L;
            var9_7 = 1.00001;
            var11_8 = this.a;
            var12_9 = this.b;
            var13_10 = 0;
            var14_11 = 1;
            var15_12 /* !! */  = (double)(var5_5 == var9_7 ? 0 : (var5_5 > var9_7 ? 1 : -1));
            if (var15_12 /* !! */  > 0) break block33;
            var7_6 = 4607182328728024861L;
            var9_7 = 0.99999;
            cfr_temp_0 = var5_5 - var9_7;
            var15_12 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
            if (var15_12 /* !! */  < 0) break block33;
            var16_13 = this.j;
            var17_14 = this.k;
            this.a(var16_13, 0, var17_14);
            this.k = 0;
lbl24:
            // 2 sources

            while (true) {
                var18_17 = var2_2;
                var19_18 = var11_8;
                ** GOTO lbl181
                break;
            }
        }
        ** while ((var20_15 = var1_1.k) < (var21_16 = var1_1.h))
lbl30:
        // 1 sources

        var22_19 = 0;
        while (true) {
            block34: {
                if ((var15_12 /* !! */  = (double)var1_1.r) > 0) {
                    var15_12 /* !! */  = Math.min(var21_16, (int)var15_12 /* !! */ );
                    var23_20 = var1_1.j;
                    var1_1.a(var23_20, var22_19, (int)var15_12 /* !! */ );
                    var1_1.r = var24_21 = var1_1.r - var15_12 /* !! */ ;
                    var22_19 += var15_12 /* !! */ ;
                    var18_17 = var2_2;
                    var19_18 = var11_8;
                } else {
                    var25_22 = var1_1.j;
                    var24_21 = 4000;
                    var24_21 = var11_8 > var24_21 ? var11_8 / 4000 : 1;
                    var26_23 = var1_1.g;
                    var27_24 = var1_1.f;
                    if (var12_9 == var14_11 && var24_21 == var14_11) {
                        var15_12 /* !! */  = var1_1.d(var25_22, var22_19, var27_24, var26_23);
                        var18_17 = var2_2;
                        var19_18 = var11_8;
                    } else {
                        var1_1.b(var25_22, var22_19, var24_21);
                        var14_11 = var27_24 / var24_21;
                        var19_18 = var11_8;
                        var11_8 = var26_23 / var24_21;
                        var18_17 = var2_2;
                        var28_25 = var1_1.i;
                        var11_8 = var1_1.d(var28_25, 0, var14_11, var11_8);
                        var14_11 = 1;
                        if (var24_21 != var14_11) {
                            var11_8 *= var24_21;
                            var14_11 = var11_8 - (var24_21 *= 4);
                            var11_8 += var24_21;
                            if (var14_11 >= var27_24) {
                                var27_24 = var14_11;
                            }
                            if (var11_8 > var26_23) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var26_23 = var11_8;
                            ** continue;
                            var11_8 = 1;
                            var4_4 = 1.4E-45f;
                            if (var12_9 == var11_8) {
                                var15_12 /* !! */  = var1_1.d(var25_22, var22_19, var27_24, var26_23);
                            } else {
                                var1_1.b(var25_22, var22_19, var11_8);
                                var15_12 /* !! */  = var1_1.d(var28_25, 0, var27_24, var26_23);
                            }
                        } else {
                            var15_12 /* !! */  = var11_8;
                        }
                    }
                    var2_2 = var1_1.u;
                    var11_8 = var1_1.v;
                    if (var2_2 == 0 || (var14_11 = var1_1.s) == 0 || var11_8 > (var24_21 = var2_2 * 3) || (var11_8 = var2_2 * 2) <= (var24_21 = var1_1.t * 3)) {
                        var14_11 = (int)var15_12 /* !! */ ;
                    }
                    var1_1.t = var2_2;
                    var1_1.s = (int)var15_12 /* !! */ ;
                    var29_26 = 2.0;
                    var31_27 = 0x3FF0000000000000L;
                    var33_28 = 1.0;
                    cfr_temp_1 = var5_5 - var33_28;
                    var2_2 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1));
                    if (var2_2 > 0) {
                        var28_25 = var1_1.j;
                        var11_8 = (int)(var5_5 == var29_26 ? 0 : (var5_5 > var29_26 ? 1 : -1));
                        if (var11_8 >= 0) {
                            var29_26 = var14_11;
                            var33_28 = var5_5 - var33_28;
                            var29_26 /= var33_28;
                            var33_28 = var1_1.w;
                            var31_27 = Math.round(var29_26 += var33_28);
                            var11_8 = (int)var31_27;
                            var33_28 = var11_8;
                            var1_1.w = var29_26 -= var33_28;
                        } else {
                            var33_28 = var14_11;
                            var29_26 = (var29_26 - var5_5) * var33_28;
                            var33_28 = var5_5 - 1.0;
                            var29_26 /= var33_28;
                            var33_28 = var1_1.w;
                            var31_27 = Math.round(var29_26 += var33_28);
                            var1_1.r = var11_8 = (int)var31_27;
                            var33_28 = var11_8;
                            var1_1.w = var29_26 -= var33_28;
                            var11_8 = var14_11;
                        }
                        var25_22 = var1_1.l;
                        var24_21 = var1_1.m;
                        var35_29 = var1_1.c(var25_22, var24_21, var11_8);
                        var1_1.l = var35_29;
                        var27_24 = var1_1.m;
                        var36_30 = var22_19 + var14_11;
                        var24_21 = var1_1.b;
                        var15_12 /* !! */  = var11_8;
                        var37_31 = var22_19;
                        var38_32 = var22_19;
                        l93_0.e(var11_8, var24_21, var35_29, var27_24, var28_25, var22_19, var28_25, var36_30);
                        var1_1.m = var2_2 = var1_1.m + var11_8;
                        var22_19 = var14_11 = var14_11 + var11_8 + var22_19;
                    } else {
                        var37_31 = var22_19;
                        var28_25 = var1_1.j;
                        var31_27 = 4602678819172646912L;
                        var33_28 = 0.5;
                        cfr_temp_2 = var5_5 - var33_28;
                        var11_8 = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1));
                        if (var11_8 < 0) {
                            var29_26 = (double)var14_11 * var5_5;
                            var33_28 = 1.0 - var5_5;
                            var29_26 /= var33_28;
                            var33_28 = var1_1.w;
                            var31_27 = Math.round(var29_26 += var33_28);
                            var11_8 = (int)var31_27;
                            var33_28 = var11_8;
                            var1_1.w = var29_26 -= var33_28;
                        } else {
                            var33_28 = var14_11;
                            var29_26 *= var5_5;
                            var39_33 = 1.0;
                            var29_26 = (var29_26 - var39_33) * var33_28;
                            var33_28 = var39_33 - var5_5;
                            var29_26 /= var33_28;
                            var33_28 = var1_1.w;
                            var31_27 = Math.round(var29_26 += var33_28);
                            var1_1.r = var11_8 = (int)var31_27;
                            var33_28 = var11_8;
                            var1_1.w = var29_26 -= var33_28;
                            var11_8 = var14_11;
                        }
                        var25_22 = var1_1.l;
                        var24_21 = var1_1.m;
                        var22_19 = var14_11 + var11_8;
                        var25_22 = var1_1.c(var25_22, var24_21, var22_19);
                        var1_1.l = var25_22;
                        var24_21 = var37_31 * var12_9;
                        var26_23 = var1_1.m * var12_9;
                        var27_24 = var14_11 * var12_9;
                        System.arraycopy(var28_25, var24_21, var25_22, var26_23, var27_24);
                        var35_29 = var1_1.l;
                        var27_24 = var1_1.m + var14_11;
                        var38_32 = var37_31 + var14_11;
                        var24_21 = var1_1.b;
                        var15_12 /* !! */  = var11_8;
                        var14_11 = var22_19;
                        var36_30 = var37_31;
                        l93_0.e(var11_8, var24_21, var35_29, var27_24, var28_25, var38_32, var28_25, var37_31);
                        var1_1.m = var2_2 = var1_1.m + var22_19;
                        var22_19 = var37_31 + var11_8;
                    }
                }
                var2_2 = var22_19 + var21_16;
                if (var2_2 <= var20_15) break block34;
                var2_2 = var1_1.k - var22_19;
                var41_35 = var1_1.j;
                var42_36 = var2_2 * var12_9;
                System.arraycopy(var41_35, var22_19 *= var12_9, var41_35, 0, var42_36);
                var1_1.k = var2_2;
lbl181:
                // 2 sources

                var43_37 = 1.0f;
                var2_2 = (int)(var3_3 == var43_37 ? 0 : (var3_3 > var43_37 ? 1 : -1));
                if (var2_2 != 0) {
                    var2_2 = var1_1.m;
                    var11_8 = var18_17;
                    if (var2_2 != var18_17) {
                        var2_2 = var19_18;
                        var44_38 = (float)var19_18 / var3_3;
                        var45_39 = (long)var44_38;
                        var47_40 = var19_18;
                        while (true) {
                            var7_6 = 0L;
                            var9_7 = 0.0;
                            var14_11 = (int)(var45_39 == var7_6 ? 0 : (var45_39 < var7_6 ? -1 : 1));
                            if (var14_11 == 0 || (var14_11 = (int)(var47_40 == var7_6 ? 0 : (var47_40 < var7_6 ? -1 : 1))) == 0 || (var27_24 = (int)((cfr_temp_3 = (var51_42 = var45_39 % (var49_41 = (long)2)) - var7_6) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) != 0 || (var27_24 = (int)((cfr_temp_4 = (var51_42 = var47_40 % var49_41) - var7_6) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1))) != 0) break;
                            var45_39 /= var49_41;
                            var47_40 /= var49_41;
                        }
                        var20_15 = var1_1.m - var11_8;
                        var53_43 = var1_1.n;
                        var14_11 = var1_1.o;
                        var1_1.n = var53_43 = var1_1.c(var53_43, var14_11, var20_15);
                        var54_34 = var1_1.l;
                        var15_12 /* !! */  = var11_8 * var12_9;
                        var24_21 = var1_1.o * var12_9;
                        var26_23 = var20_15 * var12_9;
                        System.arraycopy(var54_34, (int)var15_12 /* !! */ , var53_43, var24_21, var26_23);
                        var1_1.m = var11_8;
                        var1_1.o = var11_8 = var1_1.o + var20_15;
                        var4_4 = 0.0f;
                        var41_35 = null;
                        for (var11_8 = 0; var11_8 < (var21_16 = (var20_15 = var1_1.o) + -1); ++var11_8) {
                            while (true) {
                                var20_15 = var1_1.p;
                                var21_16 = 1;
                                var49_41 = var20_15 += var21_16;
                                var51_42 = var49_41 * var45_39;
                                var27_24 = var1_1.q;
                                var55_44 = var27_24;
                                var57_45 = var55_44 * var47_40;
                                cfr_temp_5 = var51_42 - var57_45;
                                var36_30 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                if (var36_30 <= 0) break;
                                var59_46 = var1_1.l;
                                var14_11 = var1_1.m;
                                var1_1.l = var59_46 = var1_1.c(var59_46, var14_11, var21_16);
                                var59_46 = null;
                                for (var20_15 = 0; var20_15 < var12_9; ++var20_15) {
                                    var53_43 = var1_1.l;
                                    var14_11 = var1_1.m * var12_9 + var20_15;
                                    var25_22 = var1_1.n;
                                    var24_21 = var11_8 * var12_9 + var20_15;
                                    var26_23 = var25_22[var24_21];
                                    var15_12 /* !! */  = var25_22[var24_21 += var12_9];
                                    var55_44 = (long)var1_1.q * var47_40;
                                    var24_21 = var1_1.p;
                                    var60_47 = (long)var24_21 * var45_39;
                                    var36_30 = 1;
                                    var62_48 = var47_40;
                                    var47_40 = (long)(++var24_21) * var45_39;
                                    var55_44 = var47_40 - var55_44;
                                    var47_40 -= var60_47;
                                    var60_47 = (long)var26_23 * var55_44;
                                    var51_42 = var47_40 - var55_44;
                                    var55_44 = (long)var15_12 /* !! */ ;
                                    var51_42 = (var51_42 * var55_44 + var60_47) / var47_40;
                                    var53_43[var14_11] = var2_2 = (int)((short)var51_42);
                                    var47_40 = var62_48;
                                    var13_10 = 0;
                                }
                                var62_48 = var47_40;
                                var2_2 = var1_1.q;
                                var13_10 = 1;
                                var1_1.q = var2_2 += var13_10;
                                var1_1.m = var2_2 = var1_1.m + var13_10;
                                var13_10 = 0;
                            }
                            var62_48 = var47_40;
                            var13_10 = 1;
                            var1_1.p = var20_15;
                            var2_2 = (int)(var49_41 == var47_40 ? 0 : (var49_41 < var47_40 ? -1 : 1));
                            if (var2_2 == 0) {
                                var2_2 = 0;
                                var43_37 = 0.0f;
                                var28_25 = null;
                                var1_1.p = 0;
                                var64_49 = (int)(var55_44 == var45_39 ? 0 : (var55_44 < var45_39 ? -1 : 1));
                                if (var64_49 == 0) {
                                    var14_11 = 1;
                                } else {
                                    var14_11 = 0;
                                    var54_34 = null;
                                }
                                ct3.f((boolean)var14_11);
                                var1_1.q = 0;
                            }
                            var47_40 = var62_48;
                            var13_10 = 0;
                        }
                        if (var21_16 != 0) {
                            var28_25 = var1_1.n;
                            var64_49 = var21_16 * var12_9;
                            var20_15 = (var20_15 - var21_16) * var12_9;
                            var14_11 = 0;
                            var54_34 = null;
                            System.arraycopy(var28_25, var64_49, var28_25, 0, var20_15);
                            var1_1.o = var2_2 = var1_1.o - var21_16;
                        }
                    }
                }
                return;
            }
            var54_34 = null;
            var11_8 = var19_18;
            var2_2 = var18_17;
            var13_10 = 0;
            var14_11 = 1;
        }
    }
}

