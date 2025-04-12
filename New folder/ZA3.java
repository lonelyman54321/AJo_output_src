/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.f;

public final class ZA3 {
    public final boolean a;
    public final ZA3$a b;
    public final int c;
    public final li0_0[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public ZA3(ZA3$a object) {
        this.a = false;
        this.b = object;
        Object[] objectArray = ZA3$b.$EnumSwitchMapping$0;
        int n3 = object.ordinal();
        n3 = objectArray[n3];
        int n4 = 2;
        int n7 = 1;
        int n8 = 3;
        if (n3 != n7) {
            if (n3 == n4) {
                n4 = 3;
            } else {
                throw object;
            }
        }
        this.c = n4;
        n3 = 20;
        objectArray = new li0_0[n3];
        this.d = (li0_0[])objectArray;
        objectArray = new float[n3];
        this.f = objectArray;
        object = new float[n3];
        this.g = (float[])object;
        object = new float[n8];
        this.h = (float[])object;
    }

    public final void a(long l2, float f5) {
        int n3;
        this.e = n3 = (this.e + 1) % 20;
        li0_0[] li0_0Array = this.d;
        li0_0 li0_02 = li0_0Array[n3];
        if (li0_02 == null) {
            li0_02 = new Object();
            li0_02.a = l2;
            li0_02.b = f5;
            li0_0Array[n3] = li0_02;
        } else {
            li0_02.a = l2;
            li0_02.b = f5;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final float b(float var1_1) {
        block21: {
            block22: {
                var2_2 = this;
                var3_3 = var1_1;
                var4_4 /* !! */  = 0;
                var5_5 = 0.0f;
                var6_6 = null;
                cfr_temp_0 = var1_1 - 0.0f;
                var7_7 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var7_7 /* !! */  <= 0) break block21;
                var8_8 = this.d;
                var7_7 /* !! */  = this.e;
                var9_9 = var8_8[var7_7 /* !! */ ];
                if (var9_9 == null) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        continue;
                        break;
                    }
                }
                var12_13 = 0;
                var13_14 = var9_9;
                while (true) {
                    var14_15 = var8_8[var7_7 /* !! */ ];
                    var15_16 = var2_2.a;
                    var16_17 = var2_2.b;
                    var17_18 = var2_2.f;
                    var18_19 = var2_2.g;
                    if (var14_15 == null) {
                        var19_20 = var15_16;
                        break;
                    }
                    var20_21 = var9_9.a;
                    var22_22 = var7_7 /* !! */ ;
                    var23_23 = var14_15.a;
                    var25_24 = var20_21 -= var23_23;
                    var19_20 = var15_16;
                    var26_25 = var13_14.a;
                    var23_23 = Math.abs(var23_23 - var26_25);
                    var5_5 = var23_23;
                    var11_11 = ZA3$a.Lsq2;
                    var13_14 = var16_17 != var11_11 && !var15_16 ? var9_9 : var14_15;
                    var10_10 = 100.0f;
                    var7_7 /* !! */  = var25_24 == var10_10 ? 0 : (var25_24 > var10_10 ? 1 : -1);
                    if (var7_7 /* !! */  > 0) break;
                    var7_7 /* !! */  = 0x42200000;
                    var10_10 = 40.0f;
                    cfr_temp_1 = var5_5 - var10_10;
                    var4_4 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                    if (var4_4 /* !! */  > 0) break;
                    var17_18[var12_13] = var5_5 = var14_15.b;
                    var18_19[var12_13] = var5_5 = -var25_24;
                    var4_4 /* !! */  = 20;
                    var5_5 = 2.8E-44f;
                    if (var22_22 == false) {
                        var7_7 /* !! */  = 20;
                        var10_10 = 2.8E-44f;
lbl51:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var7_7 /* !! */  = var22_22;
                    ** continue;
                    var28_26 = true;
                    var29_27 = 1.4E-45f;
                    var7_7 /* !! */  -= var28_26;
                    if (++var12_13 >= var4_4 /* !! */ ) break;
                    var4_4 /* !! */  = 0;
                    var5_5 = 0.0f;
                    var6_6 = null;
                }
                var4_4 /* !! */  = var2_2.c;
                if (var12_13 < var4_4 /* !! */ ) break block22;
                var6_6 = ZA3$b.$EnumSwitchMapping$0;
                var7_7 /* !! */  = var16_17.ordinal();
                var4_4 /* !! */  = (int)var6_6[var7_7 /* !! */ ];
                var7_7 /* !! */  = 2;
                var10_10 = 2.8E-45f;
                var30_12 = (float)true;
                var31_28 = 1.4E-45f;
                if (var4_4 /* !! */  == var30_12) ** GOTO lbl88
                if (var4_4 /* !! */  == var7_7 /* !! */ ) {
                    var6_6 = var2_2.h;
                    eb3_0.c(var18_19, var17_18, var12_13, (float[])var6_6);
                    try {
                        var5_5 = (float)var6_6[var30_12];
                    }
                    catch (IllegalArgumentException v0) {
                        var4_4 /* !! */  = 0;
                        var5_5 = 0.0f;
                        var6_6 = null;
                    }
                } else {
                    var32_29 = new NoWhenBranchMatchedException();
                    throw var32_29;
lbl88:
                    // 1 sources

                    var5_5 = var18_19[var12_13 -= var30_12];
                    var33_30 = 0.0f;
                    var9_9 = null;
                    for (var30_12 = (float)var12_13; var30_12 > 0; var30_12 += -1) {
                        var34_31 = var30_12 + -1;
                        var29_27 = var18_19[var34_31];
                        cfr_temp_2 = var5_5 - var29_27;
                        var35_32 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                        if (var35_32 /* !! */  != false) {
                            if (var19_20) {
                                var36_33 = -var17_18[var34_31];
                            } else {
                                var37_34 = var17_18[var30_12];
                                var36_33 = var17_18[var34_31];
                                var36_33 = var37_34 - var36_33;
                            }
                            var36_33 /= (var5_5 -= var29_27);
                            var5_5 = Math.signum(var33_30);
                            var37_34 = var7_7 /* !! */ ;
                            var38_35 = Math.abs(var33_30) * var37_34;
                            var39_36 = Math.sqrt(var38_35);
                            var37_34 = (float)var39_36;
                            var5_5 *= var37_34;
                            var5_5 = var36_33 - var5_5;
                            var36_33 = Math.abs(var36_33) * var5_5;
                            var33_30 += var36_33;
                            if (var30_12 == var12_13) {
                                var4_4 /* !! */  = 0x3F000000;
                                var5_5 = 0.5f;
                                var33_30 *= var5_5;
                            }
                        }
                        var5_5 = var29_27;
                    }
                    var5_5 = Math.signum(var33_30);
                    var10_10 = var7_7 /* !! */ ;
                    var31_28 = Math.abs(var33_30) * var10_10;
                    var41_37 = Math.sqrt(var31_28);
                    var10_10 = (float)var41_37;
                    var5_5 *= var10_10;
                }
                var7_7 /* !! */  = 1000;
                var10_10 = var7_7 /* !! */ ;
                var5_5 *= var10_10;
                ** GOTO lbl-1000
            }
            var4_4 /* !! */  = 0;
            var5_5 = 0.0f;
            var6_6 = null;
            ** while (true)
            var7_7 /* !! */  = (float)false;
            var10_10 = 0.0f;
            var11_11 = null;
            cfr_temp_3 = var5_5 - 0.0f;
            var30_12 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
            if (var30_12 == false || (var30_12 = (float)Float.isNaN(var5_5)) != false) {
                var4_4 /* !! */  = 0;
                var5_5 = 0.0f;
                var6_6 = null;
            } else {
                cfr_temp_4 = var5_5 - 0.0f;
                var7_7 /* !! */  = (float)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                if (var7_7 /* !! */  > 0) {
                    var5_5 = kotlin.ranges.f.c(var5_5, var3_3);
                } else {
                    var3_3 = -var3_3;
                    var5_5 = kotlin.ranges.f.a(var5_5, var3_3);
                }
            }
            return var5_5;
        }
        var6_6 = new StringBuilder("maximumVelocity should be a positive value. You specified=");
        var6_6.append(var1_1);
        bh1_1.c(var6_6.toString());
        throw null;
    }
}

