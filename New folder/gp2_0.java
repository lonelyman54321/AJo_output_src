/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gP2
 */
public final class gp2_0
extends py_1 {
    public static final ei1_0 r;
    public final SF3 d;
    public final float e;
    public final float f;
    public final Lq3 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final js0_0 k;
    public final gP2$c l;
    public final zz_0 m;
    public final js0_0 n;
    public final gp2$b_0 o;
    public final qk0_0 p;
    public final boolean q;

    static {
        ei1_0 ei1_02;
        r = ei1_02 = new Object();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public gp2_0(String string2, float[] fArray, SF3 sF3, double d2, float f5, float f6, int n3) {
        void var15_14;
        Lq3 lq3;
        double d5 = d2;
        Object object = r;
        double d7 = 1.0;
        double d9 = d2 - d7;
        Object object2 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object2 == false) {
            ei1_0 ei1_02 = object;
        } else {
            dP2 dP22;
            dP2 dP23 = dP22 = new dP2(d2);
        }
        if (object2 != false) {
            super(d5);
        }
        ei1_0 ei1_03 = object;
        object = lq3;
        d5 = d2;
        lq3 = new Lq3(d2, 1.0, 0.0, 0.0, 0.0);
        this(string2, fArray, sF3, null, (js0_0)var15_14, ei1_03, f5, f6, lq3, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public gp2_0(String string2, float[] fArray, SF3 sF3, Lq3 lq3, int n3) {
        Object object;
        double d2;
        double d5 = lq3.f;
        double d7 = 0.0;
        double d9 = lq3.g;
        Object object2 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
        if (object2 == false && (d2 = d9 == d7 ? 0 : (d9 < d7 ? -1 : 1)) == false) {
            super(lq3);
        } else {
            object = new wo2_0(lq3);
        }
        wo2_0 wo2_02 = object;
        if (object2 == false && (d2 = d9 == d7 ? 0 : (d9 < d7 ? -1 : 1)) == false) {
            super(lq3);
        } else {
            super(lq3);
        }
        o60_0 o60_02 = object;
        object = this;
        this(string2, fArray, sF3, null, wo2_02, (js0_0)((Object)o60_02), 0.0f, 1.0f, lq3, n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gp2_0(String var1_1, float[] var2_2, SF3 var3_3, float[] var4_4, js0_0 var5_5, js0_0 var6_6, float var7_7, float var8_8, Lq3 var9_9, int var10_10) {
        block18: {
            block21: {
                block16: {
                    block17: {
                        block20: {
                            block19: {
                                var11_11 = this;
                                var12_12 /* !! */  = var2_2;
                                var13_13 = var3_3;
                                var14_14 = var4_4;
                                var15_15 = var5_5;
                                var16_16 = var6_6;
                                var17_17 = var7_7;
                                var18_18 = var8_8;
                                var19_19 = var10_10;
                                var20_20 = 9;
                                var21_21 = 1.3E-44f;
                                var22_22 = 0;
                                var23_23 = 0.0f;
                                var24_24 = 5;
                                var25_25 = 6;
                                var26_26 = 8.4E-45f;
                                var27_27 = 1;
                                var28_28 = 1.4E-45f;
                                var29_29 = ay_0.a;
                                var31_30 = var1_1;
                                super(var1_1, var29_29, var10_10);
                                this.d = var3_3;
                                this.e = var7_7;
                                this.f = var8_8;
                                var31_30 = var9_9;
                                this.g = var9_9;
                                this.k = var5_5;
                                this.l = var31_30 = new gP2$c(this);
                                this.m = var31_30 = new zz_0(this);
                                this.n = var6_6;
                                this.o = var31_30 = new gp2$b_0(this);
                                this.p = var31_30 = new qk0_0(this);
                                var32_31 = var2_2.length;
                                if (var32_31 != var25_25 && (var32_31 = var2_2.length) != var20_20) {
                                    var12_12 /* !! */  = (float[])new IllegalArgumentException;
                                    super("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
                                    throw var12_12 /* !! */ ;
                                }
                                var32_31 = (int)(var17_17 == var18_18 ? 0 : (var17_17 > var18_18 ? 1 : -1));
                                if (var32_31 >= 0) break block18;
                                var31_30 = new float[var25_25];
                                var33_32 = var12_12 /* !! */ .length;
                                if (var33_32 == var20_20) {
                                    var34_33 = var12_12 /* !! */ [0];
                                    var35_34 = var12_12 /* !! */ [var27_27];
                                    var36_35 = var34_33 + var35_34;
                                    var37_36 = var12_12 /* !! */ [2];
                                    var31_30[0] = var34_33 /= (var36_35 += var37_36);
                                    var31_30[var27_27] = var35_34 /= var36_35;
                                    var33_32 = 3;
                                    var35_34 = var12_12 /* !! */ [var33_32];
                                    var38_37 = 4;
                                    var36_35 = var12_12 /* !! */ [var38_37];
                                    var39_38 = var35_34 + var36_35;
                                    var37_36 = var12_12 /* !! */ [var24_24];
                                    var40_39 = 2;
                                    var31_30[var40_39] = var35_34 /= (var39_38 += var37_36);
                                    var31_30[var33_32] = var36_35 /= var39_38;
                                    var34_33 = var12_12 /* !! */ [var25_25];
                                    var41_40 = 7;
                                    var36_35 = var12_12 /* !! */ [var41_40];
                                    var35_34 = var34_33 + var36_35;
                                    var42_41 = 8;
                                    var43_42 = 1.1E-44f;
                                    var44_43 = var12_12 /* !! */ [var42_41];
                                    var34_33 /= (var35_34 += var44_43);
                                    var45_44 = 4;
                                    var44_43 = 5.6E-45f;
                                    var31_30[var45_44] = var34_33;
                                    var31_30[var24_24] = var36_35 /= var35_34;
                                } else {
                                    Intrinsics.checkNotNullParameter(var12_12 /* !! */ , "<this>");
                                    var46_45 = "destination";
                                    Intrinsics.checkNotNullParameter(var31_30, var46_45);
                                    System.arraycopy(var12_12 /* !! */ , 0, var31_30, 0, var25_25);
                                }
                                var11_11.h = (float[])var31_30;
                                var45_44 = 1065353216;
                                var44_43 = 1.0f;
                                if (var14_14 != null) break block19;
                                var47_46 /* !! */  = var31_30[0];
                                var34_33 = (float)var31_30[var27_27];
                                var36_35 = (float)var31_30[2];
                                var37_36 = (float)var31_30[3];
                                var48_47 /* !! */  = var31_30[4];
                                var35_34 = (float)var31_30[var24_24];
                                var26_26 = var27_27;
                                var49_48 = (var26_26 - var47_46 /* !! */ ) / var34_33;
                                var50_49 = (var26_26 - var36_35) / var37_36;
                                var51_50 = (var26_26 - var48_47 /* !! */ ) / var35_34;
                                var28_28 = var13_13.a;
                                var26_26 -= var28_28;
                                var23_23 = var13_13.b;
                                var26_26 /= var23_23;
                                var52_51 /* !! */  = var47_46 /* !! */  / var34_33;
                                var53_52 = var36_35 / var37_36;
                                var54_53 = var48_47 /* !! */  / var35_34;
                                var28_28 /= var23_23;
                                var26_26 -= var49_48;
                                var23_23 = var53_52 - var52_51 /* !! */ ;
                                var26_26 *= var23_23;
                                var53_52 = (var28_28 -= var52_51 /* !! */ ) * (var50_49 -= var49_48);
                                var26_26 -= var53_52;
                                var51_50 = (var51_50 - var49_48) * var23_23;
                                var21_21 = (float)(var54_53 - var52_51 /* !! */ );
                                var28_28 = qy_1.a(var26_26 /= (var51_50 -= (var50_49 *= var21_21)), var21_21, var28_28, var23_23);
                                var21_21 = var44_43 - var28_28 - var26_26;
                                var23_23 = var21_21 / var34_33;
                                var50_49 = var28_28 / var37_36;
                                var51_50 = var26_26 / var35_34;
                                var52_51 /* !! */  = (reference)(var23_23 * var47_46 /* !! */ );
                                var47_46 /* !! */  = (reference)((var44_43 - var47_46 /* !! */  - var34_33) * var23_23);
                                var23_23 = var50_49 * var36_35;
                                var34_33 = (var44_43 - var36_35 - var37_36) * var50_49;
                                var36_35 = var51_50 * var48_47 /* !! */ ;
                                var37_36 = (var44_43 - var48_47 /* !! */  - var35_34) * var51_50;
                                var41_40 = 9;
                                var35_34 = 1.3E-44f;
                                var55_54 = new float[var41_40];
                                var55_54[0] = (float)var52_51 /* !! */ ;
                                var56_55 = 1;
                                var48_47 /* !! */  = 1.4E-45f;
                                var55_54[var56_55] = var21_21;
                                var20_20 = 2;
                                var21_21 = 2.8E-45f;
                                var55_54[var20_20] = (float)var47_46 /* !! */ ;
                                var55_54[3] = var23_23;
                                var55_54[4] = var28_28;
                                var55_54[var24_24] = var34_33;
                                var55_54[6] = var36_35;
                                var55_54[7] = var26_26;
                                var57_56 /* !! */  = (reference)8;
                                var47_46 /* !! */  = (reference)1.1E-44f;
                                var55_54[var57_56 /* !! */ ] = var37_36;
                                var11_11.i = var55_54;
                                break block20;
                            }
                            var25_25 = var14_14.length;
                            var27_27 = 9;
                            var28_28 = 1.3E-44f;
                            if (var25_25 != var27_27) break block21;
                            var11_11.i = var14_14;
                        }
                        var14_14 = ry_0.e(var11_11.i);
                        var11_11.j = var14_14;
                        var47_46 /* !! */  = (reference)gp2$a_0.a((float[])var31_30);
                        var58_58 = eZ.a;
                        var58_58 = eZ.b;
                        var26_26 = gp2$a_0.a(var58_58);
                        var47_46 /* !! */  /= var26_26;
                        var25_25 = 0x3F666666;
                        var26_26 = 0.9f;
                        var57_56 /* !! */  = var47_46 /* !! */  == var26_26 ? 0 : (var47_46 /* !! */  > var26_26 ? 1 : -1);
                        if (var57_56 /* !! */  <= 0) ** GOTO lbl-1000
                        var14_14 = eZ.a;
                        var58_58 = null;
                        var21_21 = (float)var31_30[0];
                        var23_23 = var14_14[0];
                        var21_21 -= var23_23;
                        var25_25 = 1;
                        var34_33 = (float)var31_30[var25_25];
                        var35_34 = var14_14[var25_25];
                        var34_33 -= var35_34;
                        var25_25 = 2;
                        var43_42 = (float)var31_30[var25_25];
                        var59_59 = var14_14[var25_25];
                        var43_42 -= var59_59;
                        var25_25 = 3;
                        var59_59 = (float)var31_30[var25_25];
                        var36_35 = var14_14[var25_25];
                        var59_59 -= var36_35;
                        var25_25 = 4;
                        var60_60 = var31_30[var25_25];
                        var36_35 = var14_14[var25_25];
                        var60_60 -= var36_35;
                        var37_36 = (float)var31_30[var24_24];
                        var48_47 /* !! */  = var14_14[var24_24];
                        var37_36 -= var48_47 /* !! */ ;
                        var61_61 = new float[6];
                        var45_44 = 0;
                        var44_43 = 0.0f;
                        var12_12 /* !! */  = null;
                        var61_61[0] = var21_21;
                        var20_20 = 1;
                        var21_21 = 1.4E-45f;
                        var61_61[var20_20] = var34_33;
                        var61_61[2] = var43_42;
                        var33_32 = 3;
                        var61_61[var33_32] = var59_59;
                        var61_61[var25_25] = (float)var60_60;
                        var61_61[var24_24] = var37_36;
                        var26_26 = var61_61[0];
                        var34_33 = var61_61[var20_20];
                        var26_26 = gp2$a_0.b(var26_26, var34_33, var23_23 -= var36_35, var35_34 -= var48_47 /* !! */ );
                        var22_22 = 0;
                        var23_23 = 0.0f;
                        cfr_temp_0 = var26_26 - 0.0f;
                        var25_25 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var25_25 < 0) ** GOTO lbl-1000
                        var26_26 = var14_14[0];
                        var33_32 = 2;
                        var35_34 = var14_14[var33_32];
                        var26_26 -= var35_34;
                        var35_34 = var14_14[var20_20];
                        var42_41 = 3;
                        var43_42 = 4.2E-45f;
                        var59_59 = var14_14[var42_41];
                        var34_33 = var61_61[0];
                        var44_43 = var61_61[var20_20];
                        cfr_temp_1 = (var44_43 = gp2$a_0.b(var26_26, var35_34 -= var59_59, var34_33, var44_43)) - 0.0f;
                        var45_44 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                        if (var45_44 < 0) ** GOTO lbl-1000
                        var45_44 = 2;
                        var44_43 = 2.8E-45f;
                        var26_26 = var61_61[var45_44];
                        var23_23 = var61_61[var42_41];
                        var34_33 = var14_14[var45_44];
                        var41_40 = 0;
                        var55_54 = null;
                        var59_59 = var14_14[0];
                        var34_33 -= var59_59;
                        var35_34 = var14_14[var42_41];
                        var59_59 = var14_14[var20_20];
                        var26_26 = gp2$a_0.b(var26_26, var23_23, var34_33, var35_34 -= var59_59);
                        var20_20 = 0;
                        var21_21 = 0.0f;
                        cfr_temp_2 = var26_26 - 0.0f;
                        var25_25 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                        if (var25_25 < 0) ** GOTO lbl-1000
                        var26_26 = var14_14[var45_44];
                        var22_22 = 4;
                        var23_23 = 5.6E-45f;
                        var34_33 = var14_14[var22_22];
                        var26_26 -= var34_33;
                        var34_33 = var14_14[var42_41];
                        var35_34 = var14_14[var24_24];
                        var34_33 -= var35_34;
                        var35_34 = var61_61[var45_44];
                        var44_43 = var61_61[var42_41];
                        cfr_temp_3 = (var44_43 = gp2$a_0.b(var26_26, var34_33, var35_34, var44_43)) - 0.0f;
                        var45_44 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                        if (var45_44 < 0) ** GOTO lbl-1000
                        var44_43 = var61_61[var22_22];
                        var26_26 = var61_61[var24_24];
                        var21_21 = var14_14[var22_22];
                        var33_32 = 2;
                        var34_33 = var14_14[var33_32];
                        var21_21 -= var34_33;
                        var34_33 = var14_14[var24_24];
                        var35_34 = var14_14[var42_41];
                        var44_43 = gp2$a_0.b(var44_43, var26_26, var21_21, var34_33 -= var35_34);
                        var25_25 = 0;
                        var26_26 = 0.0f;
                        var58_58 = null;
                        cfr_temp_4 = var44_43 - 0.0f;
                        var45_44 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                        if (var45_44 >= 0) {
                            var44_43 = var14_14[var22_22];
                            var56_55 = 0;
                            var48_47 /* !! */  = 0.0f;
                            var21_21 = var14_14[0];
                            var44_43 -= var21_21;
                            var21_21 = var14_14[var24_24];
                            var33_32 = 1;
                            var34_33 = 1.4E-45f;
                            var47_46 /* !! */  = (reference)var14_14[var33_32];
                            var28_28 = var61_61[var24_24];
                            cfr_temp_5 = (var44_43 = gp2$a_0.b(var44_43, var21_21 -= var47_46 /* !! */ , (float)(var47_46 /* !! */  = (reference)var61_61[var22_22]), var28_28)) - 0.0f;
                            var45_44 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1));
                            if (var45_44 < 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                        } else lbl-1000:
                        // 6 sources

                        {
                            var56_55 = 0;
                            var48_47 /* !! */  = 0.0f;
                            ** continue;
                            var45_44 = 0;
                            var44_43 = 0.0f;
                            var12_12 /* !! */  = null;
                            cfr_temp_6 = var17_17 - 0.0f;
                            var57_56 /* !! */  = (reference)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1));
                        }
                        if (var19_19 == 0) {
                            while (true) {
                                var22_22 = 1;
                                var23_23 = 1.4E-45f;
                                break block16;
                                break;
                            }
                        }
                        var12_12 /* !! */  = eZ.a;
                        if (var31_30 == var12_12 /* !! */ ) {
                            while (true) {
                                break block17;
                                break;
                            }
                        }
                        var57_56 /* !! */  = (reference)false;
                        var47_46 /* !! */  = (reference)0.0f;
                        var14_14 = null;
                        var19_19 = 6;
                        while (true) {
                            if (var57_56 /* !! */  >= var19_19) ** continue;
                            var26_26 = (float)var31_30[var57_56 /* !! */ ];
                            var28_28 = var12_12 /* !! */ [var57_56 /* !! */ ];
                            var25_25 = Float.compare(var26_26, var28_28);
                            if (var25_25 != 0) {
                                var26_26 = (float)var31_30[var57_56 /* !! */ ];
                                var28_28 = var12_12 /* !! */ [var57_56 /* !! */ ];
                                var26_26 = Math.abs(var26_26 - var28_28);
                                var27_27 = 981668463;
                                var28_28 = 0.001f;
                                cfr_temp_7 = var26_26 - var28_28;
                                var25_25 = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1));
                                if (var25_25 > 0) lbl-1000:
                                // 5 sources

                                {
                                    while (true) {
                                        var22_22 = 0;
                                        var23_23 = 0.0f;
                                        break block16;
                                        break;
                                    }
                                }
                            }
                            var25_25 = 1;
                            var26_26 = 1.4E-45f;
                            var57_56 /* !! */  += var25_25;
                        }
                    }
                    var25_25 = 1;
                    var26_26 = 1.4E-45f;
                    var12_12 /* !! */  = (float[])ed1_0.d;
                    var45_44 = (int)ry_0.c((SF3)var13_13, (SF3)var12_12 /* !! */ );
                    if (var45_44 == 0) ** GOTO lbl-1000
                    var44_43 = 0.0f;
                    var12_12 /* !! */  = null;
                    cfr_temp_8 = var17_17 - 0.0f;
                    var45_44 = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 < 0.0f ? -1 : 1));
                    if (var45_44 != 0 || (var45_44 = (int)((cfr_temp_9 = var18_18 - (var44_43 = 1.0f)) == 0.0f ? 0 : (cfr_temp_9 < 0.0f ? -1 : 1))) != 0) ** GOTO lbl-1000
                    var12_12 /* !! */  = eZ.a;
                    var12_12 /* !! */  = (float[])eZ.c;
                    var62_62 = 0.0;
                    while (true) {
                        if ((var19_19 = (int)((cfr_temp_10 = var62_62 - (var64_63 = 1.0)) == 0.0 ? 0 : (cfr_temp_10 < 0.0 ? -1 : 1))) > 0) ** continue;
                        var66_64 = var12_12 /* !! */ .k;
                        var67_65 = var15_15.c(var62_62);
                        var69_66 = var66_64.c(var62_62);
                        var64_63 = Math.abs(var67_65 -= var69_66);
                        cfr_temp_11 = var64_63 - (var69_66 = 0.001);
                        var19_19 = (int)(cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 < 0.0 ? -1 : 1));
                        if (var19_19 > 0) ** GOTO lbl-1000
                        var66_64 = var12_12 /* !! */ .n;
                        var67_65 = var16_16.c(var62_62);
                        var71_67 = var66_64.c(var62_62);
                        var64_63 = Math.abs(var67_65 -= var71_67);
                        cfr_temp_12 = var64_63 - var69_66;
                        var19_19 = (int)(cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 < 0.0 ? -1 : 1));
                        if (var19_19 <= 0) ** break;
                        ** continue;
                        var64_63 = 0.00392156862745098;
                        var62_62 += var64_63;
                    }
                }
                var11_11.q = var22_22;
                return;
            }
            var12_12 /* !! */  = (float[])new IllegalArgumentException;
            var13_13 = new StringBuilder("Transform must have 9 entries! Has ");
            var57_57 = var14_14.length;
            var13_13.append(var57_57);
            var13_13 = var13_13.toString();
            super((String)var13_13);
            throw var12_12 /* !! */ ;
        }
        var12_12 /* !! */  = (float[])new IllegalArgumentException;
        var13_13 = new StringBuilder("Invalid range: min=");
        var13_13.append(var17_17);
        var13_13.append(", max=");
        var13_13.append(var18_18);
        var13_13.append("; min must be strictly < max");
        var13_13 = var13_13.toString();
        super((String)var13_13);
        throw var12_12 /* !! */ ;
    }

    public final float[] a(float[] fArray) {
        float f5;
        ry_0.h(this.j, fArray);
        double d2 = fArray[0];
        zz_0 zz_02 = this.m;
        fArray[0] = f5 = (float)zz_02.c(d2);
        int n3 = 1;
        d2 = fArray[n3];
        fArray[n3] = f5 = (float)zz_02.c(d2);
        n3 = 2;
        d2 = fArray[n3];
        fArray[n3] = f5 = (float)zz_02.c(d2);
        return fArray;
    }

    public final float b(int n3) {
        return this.f;
    }

    public final float c(int n3) {
        return this.e;
    }

    public final boolean d() {
        return this.q;
    }

    public final long e(float f5, float f6, float f7) {
        double d2 = f5;
        qk0_0 qk0_02 = this.p;
        float f8 = (float)qk0_02.c(d2);
        double d5 = f6;
        f6 = (float)qk0_02.c(d5);
        d5 = f7;
        f5 = (float)qk0_02.c(d5);
        float[] fArray = this.i;
        float f11 = fArray[0] * f8;
        float f12 = fArray[3] * f6 + f11;
        f11 = fArray[6] * f5 + f12;
        f12 = fArray[1] * f8;
        f8 = fArray[4] * f6 + f12;
        f6 = fArray[7] * f5 + f8;
        long l2 = Float.floatToRawIntBits(f11);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = false;
        if (object != null && (object3 = gp2_0.class) == (object2 = object.getClass())) {
            int n3 = super.equals(object);
            if (n3 == 0) {
                return false;
            }
            object = (gp2_0)object;
            float f5 = ((gp2_0)object).e;
            float f6 = this.e;
            n3 = Float.compare(f5, f6);
            if (n3 != 0) {
                return false;
            }
            f5 = ((gp2_0)object).f;
            f6 = this.f;
            n3 = Float.compare(f5, f6);
            if (n3 != 0) {
                return false;
            }
            object2 = this.d;
            object3 = ((gp2_0)object).d;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object2 = this.h;
            object3 = ((gp2_0)object).h;
            n3 = (int)(Arrays.equals((float[])object2, (float[])object3) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object2 = ((gp2_0)object).g;
            object3 = this.g;
            if (object3 != null) {
                return Intrinsics.areEqual(object3, object2);
            }
            if (object2 == null) {
                return bl2;
            }
            js0_0 js0_02 = this.k;
            object2 = ((gp2_0)object).k;
            bl2 = Intrinsics.areEqual(js0_02, object2);
            if (bl2) {
                js0_02 = this.n;
                object = ((gp2_0)object).n;
                bl3 = Intrinsics.areEqual(js0_02, object);
            }
        }
        return bl3;
    }

    public final float[] f(float[] fArray) {
        float f5;
        double d2 = fArray[0];
        qk0_0 qk0_02 = this.p;
        fArray[0] = f5 = (float)qk0_02.c(d2);
        int n3 = 1;
        d2 = fArray[n3];
        fArray[n3] = f5 = (float)qk0_02.c(d2);
        n3 = 2;
        d2 = fArray[n3];
        fArray[n3] = f5 = (float)qk0_02.c(d2);
        ry_0.h(this.i, fArray);
        return fArray;
    }

    public final float g(float f5, float f6, float f7) {
        double d2 = f5;
        qk0_0 qk0_02 = this.p;
        float f8 = (float)qk0_02.c(d2);
        double d5 = f6;
        f6 = (float)qk0_02.c(d5);
        d5 = f7;
        f5 = (float)qk0_02.c(d5);
        float[] fArray = this.i;
        float f11 = fArray[2] * f8;
        f8 = fArray[5] * f6 + f11;
        return fArray[8] * f5 + f8;
    }

    public final long h(float f5, float f6, float f7, float f8, py_1 py_12) {
        float[] fArray = this.j;
        float f11 = fArray[0] * f5;
        float f12 = fArray[3] * f6 + f11;
        f11 = fArray[6] * f7 + f12;
        f12 = fArray[1] * f5;
        float f14 = fArray[4] * f6 + f12;
        f12 = fArray[7] * f7 + f14;
        f14 = fArray[2] * f5;
        f5 = fArray[5] * f6 + f14;
        f6 = fArray[8] * f7 + f5;
        double d2 = f11;
        zz_0 zz_02 = this.m;
        f7 = (float)zz_02.c(d2);
        d2 = f12;
        float f15 = (float)zz_02.c(d2);
        double d5 = f6;
        f5 = (float)zz_02.c(d5);
        return zx_0.b(f7, f15, f5, f8, py_12);
    }

    public final int hashCode() {
        Lq3 lq3;
        int n3;
        int n4 = super.hashCode() * 31;
        int n7 = (this.d.hashCode() + n4) * 31;
        Object object = this.h;
        n4 = (Arrays.hashCode((float[])object) + n7) * 31;
        n7 = 0;
        js0_0 js0_02 = null;
        float f5 = this.e;
        boolean bl2 = false;
        float f6 = f5 - 0.0f;
        Object object2 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object2 == false) {
            n3 = 0;
            f5 = 0.0f;
            lq3 = null;
        } else {
            n3 = Float.floatToIntBits(f5);
        }
        n4 = (n4 + n3) * 31;
        f5 = this.f;
        float f7 = f5 - 0.0f;
        bl2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (!bl2) {
            n3 = 0;
            f5 = 0.0f;
            lq3 = null;
        } else {
            n3 = Float.floatToIntBits(f5);
        }
        n4 = (n4 + n3) * 31;
        lq3 = this.g;
        if (lq3 != null) {
            n7 = lq3.hashCode();
        }
        n4 += n7;
        if (lq3 == null) {
            js0_02 = this.k;
            n7 = (js0_02.hashCode() + (n4 *= 31)) * 31;
            object = this.n;
            n4 = object.hashCode() + n7;
        }
        return n4;
    }
}

