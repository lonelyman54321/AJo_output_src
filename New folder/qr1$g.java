/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class qr1$g
extends Lambda
implements Function1 {
    public final /* synthetic */ qr1_0 c;

    public qr1$g(qr1_0 qr1_02) {
        this.c = qr1_02;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block21: {
            block20: {
                block26: {
                    block22: {
                        block18: {
                            block25: {
                                block24: {
                                    block23: {
                                        block19: {
                                            var2_2 = var1_1;
                                            var2_2 = (Number)var1_1;
                                            var3_3 = -var2_2.floatValue();
                                            var4_4 = this;
                                            var5_5 = this.c;
                                            var6_6 = 0;
                                            var7_7 = null;
                                            cfr_temp_0 = var3_3 - 0.0f;
                                            var8_8 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                            if ((var8_8 /* !! */  >= 0 || (var8_8 /* !! */  = (float)var5_5.d()) != false) && ((var8_8 /* !! */  = (cfr_temp_1 = var3_3 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) <= 0 || (var8_8 /* !! */  = (float)var5_5.c()) != false)) break block19;
                                            var9_9 = false;
                                            var3_3 = 0.0f;
                                            var2_2 = null;
                                            break block20;
                                        }
                                        var10_11 = Math.abs(var5_5.e);
                                        cfr_temp_2 = var10_11 - (var11_12 = 0.5f);
                                        var8_8 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                                        if (var8_8 /* !! */  > 0) break block21;
                                        var5_5.e = var10_11 = var5_5.e + var3_3;
                                        cfr_temp_3 = (var10_11 = Math.abs(var10_11)) - var11_12;
                                        var8_8 /* !! */  = (float)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                                        if (var8_8 /* !! */  <= 0) break block22;
                                        var12_13 = (cr1_0)var5_5.c.getValue();
                                        var13_14 = var5_5.e;
                                        var14_15 = ok1_1.b(var13_14);
                                        var15_16 = var12_13.e;
                                        var16_17 = var5_5.a;
                                        var17_18 = var5_5.n;
                                        if (var15_16 || (var19_20 = (var18_19 = var12_13.i).isEmpty()) != 0 || (var20_21 = var12_13.a) == null || (var21_22 = var12_13.b - var14_15) < 0 || var21_22 >= (var19_20 = var20_21.h)) break block23;
                                        var20_21 = (dr1_0)CollectionsKt.L(var18_19);
                                        var22_23 = (dr1_0)CollectionsKt.S(var18_19);
                                        var23_24 = var20_21.y;
                                        if (var23_24 != 0 || (var23_24 = var22_23.y) != 0) break block23;
                                        var23_24 = var12_13.k;
                                        var24_25 = var12_13.j;
                                        var25_26 = var12_13.m;
                                        if (var14_15 >= 0) break block24;
                                        var26_27 = nr1_0.b((jq1_0)var20_21, var25_26);
                                        var19_20 = var20_21.q;
                                        var26_27 += var19_20;
                                        var19_20 = var26_27 - var24_25;
                                        var24_25 = nr1_0.b(var22_23, var25_26);
                                        var21_22 = var22_23.q;
                                        if ((var19_20 = Math.min(var19_20, var24_25 = var24_25 + var21_22 - var23_24)) > (var21_22 = -var14_15)) break block25;
                                    }
lbl47:
                                    // 2 sources

                                    while (true) {
                                        break block18;
                                        break;
                                    }
                                }
                                var19_20 = nr1_0.b((jq1_0)var20_21, var25_26);
                                var24_25 -= var19_20;
                                var19_20 = nr1_0.b(var22_23, var25_26);
                                ** while ((var19_20 = Math.min((int)var24_25, (int)(var23_24 -= var19_20))) <= var14_15)
                            }
                            var12_13.b = var19_20 = var12_13.b - var14_15;
                            var19_20 = var18_19.size();
                            for (var23_24 = 0; var23_24 < var19_20; ++var23_24) {
                                var28_30 = (dr1_0)var18_19.get(var23_24);
                                var29_31 = var28_30.y;
                                if (var29_31) {
                                    var30_32 = var12_13;
                                    var27_29 = var13_14;
                                    var31_33 = var18_19;
                                    var32_34 = var16_17;
                                    var13_14 = var3_3;
                                } else {
                                    var27_29 = var13_14;
                                    var33_35 = var28_30.v;
                                    var21_22 = (int)var28_30.c;
                                    var35_36 = 32;
                                    if (var21_22 != 0) {
                                        var30_32 = var12_13;
                                        var36_37 = var33_35 >> var35_36;
                                        var8_8 /* !! */  = (int)var36_37;
                                    } else {
                                        var30_32 = var12_13;
                                        var36_37 = var33_35 >> var35_36;
                                        var8_8 /* !! */  = (int)var36_37 + var14_15;
                                    }
                                    var38_38 = 0xFFFFFFFFL;
                                    var6_6 = var21_22 != 0 ? (int)(var33_35 &= var38_38) + var14_15 : (int)(var33_35 &= var38_38);
                                    var28_30.v = var36_37 = Ti1.a((int)var8_8 /* !! */ , var6_6);
                                    var7_7 = var28_30.i;
                                    var6_6 = var7_7.size();
                                    var10_11 = 0.0f;
                                    var12_13 = null;
                                    for (var8_8 /* !! */  = (float)false; var8_8 /* !! */  < var6_6; ++var8_8 /* !! */ ) {
                                        var40_39 = var28_30.l;
                                        var41_40 = var28_30.b;
                                        var40_39 = var40_39.a((int)var8_8 /* !! */ , var41_40);
                                        var13_14 = var3_3;
                                        if (var40_39 != null) {
                                            var42_41 = var40_39.l;
                                            if (var21_22 != 0) {
                                                var31_33 = var18_19;
                                                var32_34 = var16_17;
                                                var44_42 = var42_41 >> var35_36;
                                                var46_43 = (int)var44_42;
                                            } else {
                                                var31_33 = var18_19;
                                                var32_34 = var16_17;
                                                var44_42 = var42_41 >> var35_36;
                                                var46_43 = (int)var44_42 + var14_15;
                                            }
                                            var47_44 = var21_22 != 0 ? (int)(var42_41 &= var38_38) + var14_15 : (int)(var42_41 &= var38_38);
                                            var40_39.l = var42_41 = Ti1.a(var46_43, var47_44);
                                        } else {
                                            var31_33 = var18_19;
                                            var32_34 = var16_17;
                                        }
                                        var4_4 = this;
                                        var3_3 = var13_14;
                                        var16_17 = var32_34;
                                        var18_19 = var31_33;
                                    }
                                    var13_14 = var3_3;
                                    var31_33 = var18_19;
                                    var32_34 = var16_17;
                                }
                                var4_4 = this;
                                var3_3 = var13_14;
                                var13_14 = var27_29;
                                var12_13 = var30_32;
                                var16_17 = var32_34;
                                var18_19 = var31_33;
                                var6_6 = 0;
                                var7_7 = null;
                                var11_12 = 0.5f;
                            }
                            var30_32 = var12_13;
                            var27_29 = var13_14;
                            var32_34 = var16_17;
                            var13_14 = var3_3;
                            var12_13.d = var3_3 = (float)var14_15;
                            var9_10 /* !! */  = (float)var12_13.c;
                            var47_44 = 1;
                            var48_45 = 1.4E-45f;
                            if (var9_10 /* !! */  == false && var14_15 > 0) {
                                var12_13.c = var47_44;
                            }
                            var5_5.f(var12_13, (boolean)var47_44);
                            var2_2 = var5_5.p;
                            A62.d((tr1_0)var2_2);
                            var3_3 = var5_5.e;
                            var3_3 = var27_29 - var3_3;
                            var47_44 = var5_5.g;
                            if (var47_44 != 0) {
                                var4_4 = var32_34;
                                var32_34.c(var17_18, var3_3, var12_13);
                            }
                            break block26;
                        }
                        var27_28 = var13_14;
                        var4_4 = var16_17;
                        var13_14 = var3_3;
                        var2_2 = var5_5.h;
                        if (var2_2 != null) {
                            var2_2.f();
                        }
                        var3_3 = var5_5.e;
                        var3_3 = var27_28 - var3_3;
                        var7_7 = var5_5.g();
                        var8_8 /* !! */  = (float)var5_5.g;
                        if (var8_8 /* !! */  != false) {
                            var4_4.c(var17_18, var3_3, (Zq1)var7_7);
                        }
                        break block26;
                    }
                    var13_14 = var3_3;
                }
                var3_3 = Math.abs(var5_5.e);
                var47_44 = 0x3F000000;
                var48_45 = 0.5f;
                cfr_temp_4 = var3_3 - var48_45;
                var9_10 /* !! */  = (float)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                if (var9_10 /* !! */  <= 0) {
                    var3_3 = var13_14;
                } else {
                    var3_3 = var5_5.e;
                    var3_3 = var13_14 - var3_3;
                    var47_44 = 0;
                    var48_45 = 0.0f;
                    var4_4 = null;
                    var5_5.e = 0.0f;
                }
            }
            return Float.valueOf(-var3_3);
        }
        var2_2 = new StringBuilder("entered drag with non-zero pending scroll: ");
        var48_46 = var5_5.e;
        var2_2.append(var48_46);
        var2_2 = var2_2.toString();
        var2_2 = var2_2.toString();
        var4_4 = new IllegalStateException((String)var2_2);
        throw var4_4;
    }
}

