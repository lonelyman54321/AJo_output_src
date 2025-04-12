/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FloatCompanionObject;

public final class ol3 {
    public static final ol3 a;

    static {
        ol3 ol32;
        a = ol32 = new Object();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Yh1 var1_1, long var2_2, long var4_3, lk3$c var6_4, boolean var7_5, u10 var8_6, b30_0 var9_7, int var10_8) {
        block29: {
            block31: {
                block30: {
                    block28: {
                        var11_9 /* !! */  = var1_1;
                        var12_10 = var6_4;
                        var13_11 = var7_5;
                        var14_12 = var10_8;
                        var15_13 = 3072;
                        var16_14 = 1988729962;
                        var17_15 = var9_7.g(var16_14);
                        var18_16 = var10_8 & 6;
                        var19_17 = 2;
                        var20_18 = 2.8E-45f;
                        if (var18_16 == 0) {
                            var18_16 = (int)var17_15.J((Object)var1_1);
                            var18_16 = var18_16 != 0 ? 4 : 2;
                            var18_16 |= var14_12;
                        } else {
                            var18_16 = var10_8;
                        }
                        var21_19 = var14_12 & 48;
                        if (var21_19 == 0) {
                            var22_20 = var17_15.d(var2_2);
                            var22_20 = var22_20 != 0 ? 32 : 16;
                            var18_16 |= var22_20;
                        }
                        if ((var22_20 = var14_12 & 384) == 0) {
                            var22_20 = (int)var17_15.d(var4_3);
                            var22_20 = var22_20 != 0 ? 256 : 128;
                            var18_16 |= var22_20;
                        }
                        if ((var22_20 = var14_12 & 3072) == 0) {
                            var22_20 = (int)var17_15.x(var12_10);
                            var22_20 = var22_20 != 0 ? 2048 : 1024;
                            var18_16 |= var22_20;
                        }
                        if ((var22_20 = var14_12 & 24576) == 0) {
                            var22_20 = (int)var17_15.a(var13_11);
                            var22_20 = var22_20 != 0 ? 16384 : 8192;
                            var18_16 |= var22_20;
                        }
                        if ((var22_20 = 196608 & var14_12) == 0) {
                            var23_21 = var17_15.x(var8_6);
                            var23_21 = var23_21 != 0 ? 131072 : 65536;
                            var18_16 |= var23_21;
                        }
                        if ((var23_21 = 74899 & var18_16) != (var24_22 = 74898) || (var23_21 = (int)var17_15.h()) == 0) break block28;
                        var17_15.D();
                        break block29;
                    }
                    var23_21 = var18_16 & 14 | 48;
                    var25_23 /* !! */  = null;
                    var26_24 /* !! */  = yr3.d((Object)var11_9 /* !! */ , "TextFieldInputState", (b30_0)var17_15, var23_21, 0);
                    var27_25 = FloatCompanionObject.INSTANCE;
                    var28_26 = ya3_0.a;
                    var27_25 = var26_24 /* !! */ .a;
                    var29_27 /* !! */  = (Yh1)var27_25.a();
                    var17_15.K(-1158004136);
                    var30_28 = ol3$a.$EnumSwitchMapping$0;
                    var31_29 = var29_27 /* !! */ .ordinal();
                    var15_13 = var30_28[var31_29];
                    var32_30 = 0.0f;
                    var33_31 = 1;
                    var34_32 = 1.4E-45f;
                    if (var15_13 == var33_31) ** GOTO lbl-1000
                    if (var15_13 != var19_17) {
                        var19_17 = 3;
                        var20_18 = 4.2E-45f;
                        ** if (var15_13 != var19_17) goto lbl-1000
                    }
                    ** GOTO lbl69
lbl-1000:
                    // 2 sources

                    {
                        var15_13 = 0;
                        var35_33 = null;
                        var19_17 = 1065353216;
                        var20_18 = 1.0f;
                        ** GOTO lbl74
                    }
lbl-1000:
                    // 1 sources

                    {
                        var35_34 = new NoWhenBranchMatchedException();
                        throw var35_34;
lbl69:
                        // 1 sources

                        var15_13 = 0;
                        var35_33 = null;
                        var19_17 = 0;
                        var20_18 = 0.0f;
                        var36_35 = null;
                    }
lbl74:
                    // 2 sources

                    var17_15.T(false);
                    var35_33 = Float.valueOf(var20_18);
                    var36_35 = var26_24 /* !! */ .d;
                    var37_36 = (Yh1)var36_35.getValue();
                    var34_32 = -0.0019093258f;
                    var17_15.K(-1158004136);
                    var33_31 = var37_36.ordinal();
                    var33_31 = var30_28[var33_31];
                    var38_37 = 1;
                    var39_38 = 1.4E-45f;
                    if (var33_31 == var38_37) break block30;
                    var38_37 = 2;
                    var39_38 = 2.8E-45f;
                    if (var33_31 == var38_37) ** GOTO lbl100
                    var38_37 = 3;
                    var39_38 = 4.2E-45f;
                    if (var33_31 == var38_37) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var33_31 = 0;
                            var34_32 = 0.0f;
                            var25_23 /* !! */  = null;
                            var31_29 = 1065353216;
                            var40_39 = 1.0f;
                            ** GOTO lbl113
                            break;
                        }
                    } else {
                        var35_33 = new NoWhenBranchMatchedException();
                        throw var35_33;
lbl100:
                        // 1 sources

                        var38_37 = 3;
                        var39_38 = 4.2E-45f;
                        var33_31 = 0;
                        var34_32 = 0.0f;
                        var25_23 /* !! */  = null;
                        var31_29 = 0;
                        var40_39 = 0.0f;
                        var29_27 /* !! */  = null;
                    }
                    break block31;
                }
                var38_37 = 3;
                var39_38 = 4.2E-45f;
                ** while (true)
            }
            var17_15.T(false);
            var29_27 /* !! */  = Float.valueOf(var40_39);
            var11_9 /* !! */  = var26_24 /* !! */ .f();
            var41_40 /* !! */  = 0;
            var11_9 /* !! */  = (un0_0)ll3_0.c.invoke((Object)var11_9 /* !! */ , var17_15, var41_40 /* !! */ );
            var21_19 = 196608;
            var42_41 = var27_25;
            var27_25 = var26_24 /* !! */ ;
            var37_36 = var26_24 /* !! */ ;
            var26_24 /* !! */  = var35_33;
            var15_13 = 1;
            var25_23 /* !! */  = var29_27 /* !! */ ;
            var43_42 /* !! */  = var11_9 /* !! */ ;
            var44_43 /* !! */  = var28_26;
            var29_27 /* !! */  = var17_15;
            var45_44 = var21_19;
            var11_9 /* !! */  = yr3.b((gr3)var27_25, var35_33, (Object)var25_23 /* !! */ , (un0_0)var11_9 /* !! */ , var28_26, (b30_0)var17_15, var21_19);
            var27_25 = (Yh1)var42_41.a();
            var24_22 = -1376159017;
            var17_15.K(var24_22);
            var23_21 = var27_25.ordinal();
            var23_21 = var30_28[var23_21];
            if (var23_21 == var15_13) ** GOTO lbl153
            var33_31 = 2;
            var34_32 = 2.8E-45f;
            if (var23_21 == var33_31) ** GOTO lbl152
            var33_31 = 3;
            var34_32 = 4.2E-45f;
            if (var23_21 == var33_31) {
                while (true) {
                    var23_21 = 0;
                    var27_25 = null;
                    var33_31 = 0;
                    var34_32 = 0.0f;
                    var25_23 /* !! */  = null;
                    break;
                }
            } else {
                var35_33 = new NoWhenBranchMatchedException();
                throw var35_33;
lbl152:
                // 1 sources

                if (var13_11) ** continue;
lbl153:
                // 2 sources

                var23_21 = 0;
                var27_25 = null;
                var33_31 = 1065353216;
                var34_32 = 1.0f;
            }
            var17_15.T(false);
            var25_23 /* !! */  = Float.valueOf(var34_32);
            var27_25 = (Yh1)var36_35.getValue();
            var17_15.K(var24_22);
            var23_21 = var27_25.ordinal();
            var23_21 = var30_28[var23_21];
            if (var23_21 == var15_13) ** GOTO lbl175
            var24_22 = 2;
            if (var23_21 == var24_22) ** GOTO lbl174
            var24_22 = 3;
            if (var23_21 == var24_22) {
                while (true) {
                    var23_21 = 0;
                    var27_25 = null;
                    break;
                }
            } else {
                var35_33 = new NoWhenBranchMatchedException();
                throw var35_33;
lbl174:
                // 1 sources

                if (var13_11) ** continue;
lbl175:
                // 2 sources

                var23_21 = 0;
                var27_25 = null;
                var32_30 = 1.0f;
            }
            var17_15.T(false);
            var43_42 /* !! */  = Float.valueOf(var32_30);
            var26_24 /* !! */  = var37_36.f();
            var44_43 /* !! */  = 0;
            var44_43 /* !! */  = var27_25 = nl3_0.c.invoke(var26_24 /* !! */ , var17_15, var44_43 /* !! */ );
            var44_43 /* !! */  = (un0_0)var27_25;
            var27_25 = var37_36;
            var26_24 /* !! */  = var25_23 /* !! */ ;
            var25_23 /* !! */  = var43_42 /* !! */ ;
            var43_42 /* !! */  = var44_43 /* !! */ ;
            var44_43 /* !! */  = var28_26;
            var29_27 /* !! */  = var17_15;
            var45_44 = var21_19;
            var44_43 /* !! */  = yr3.b((gr3)var37_36, var26_24 /* !! */ , (Object)var25_23 /* !! */ , (un0_0)var43_42 /* !! */ , var28_26, (b30_0)var17_15, var21_19);
            var27_25 = (Yh1)var36_35.getValue();
            var24_22 = -1490209928;
            var17_15.K(var24_22);
            var23_21 = var27_25.ordinal();
            var23_21 = var30_28[var23_21];
            if (var23_21 == var15_13) {
                var46_45 = var2_2;
lbl199:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var46_45 = var4_3;
            ** while (true)
            var23_21 = 0;
            var27_25 = null;
            var17_15.T(false);
            var27_25 = OX.f(var46_45);
            var33_31 = (int)var17_15.J(var27_25);
            var43_42 /* !! */  = var17_15.v();
            var41_40 /* !! */  = b30$a.a;
            if (var33_31 != 0 || var43_42 /* !! */  == var41_40 /* !! */ ) {
                var25_23 /* !! */  = kZ.a;
                var27_25 = var25_23 /* !! */ .invoke(var27_25);
                var43_42 /* !! */  = var27_25;
                var43_42 /* !! */  = (Vs3)var27_25;
                var17_15.o((Object)var43_42 /* !! */ );
            }
            var29_27 /* !! */  = var43_42 /* !! */ ;
            var29_27 /* !! */  = (Vs3)var43_42 /* !! */ ;
            var27_25 = (Yh1)var42_41.a();
            var17_15.K(var24_22);
            var23_21 = var27_25.ordinal();
            var23_21 = var30_28[var23_21];
            if (var23_21 == var15_13) {
                var46_45 = var2_2;
lbl224:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var46_45 = var4_3;
            ** while (true)
            var23_21 = 0;
            var27_25 = null;
            var17_15.T(false);
            var27_25 = new OX(var46_45);
            var25_23 /* !! */  = (Yh1)var36_35.getValue();
            var17_15.K(var24_22);
            var24_22 = var25_23 /* !! */ .ordinal();
            var24_22 = var30_28[var24_22];
            if (var24_22 == var15_13) {
                var48_46 = var2_2;
lbl238:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var48_46 = var4_3;
            ** while (true)
            var15_13 = 0;
            var35_33 = null;
            var17_15.T(false);
            var43_42 /* !! */  = new OX(var48_46);
            var26_24 /* !! */  = var37_36.f();
            var25_23 /* !! */  = Integer.valueOf(0);
            var35_33 = (un0_0)ml3_0.c.invoke(var26_24 /* !! */ , var17_15, (Object)var25_23 /* !! */ );
            var26_24 /* !! */  = var27_25;
            var27_25 = var37_36;
            var25_23 /* !! */  = var43_42 /* !! */ ;
            var43_42 /* !! */  = var35_33;
            var35_33 = var44_43 /* !! */ ;
            var44_43 /* !! */  = var29_27 /* !! */ ;
            var29_27 /* !! */  = var17_15;
            var45_44 = 196608;
            var44_43 /* !! */  = yr3.b((gr3)var37_36, var26_24 /* !! */ , (Object)var25_23 /* !! */ , (un0_0)var43_42 /* !! */ , (Vs3)var44_43 /* !! */ , (b30_0)var17_15, var45_44);
            var23_21 = var18_16 & 7168 | 384;
            var26_24 /* !! */  = var36_35.getValue();
            var25_23 /* !! */  = Integer.valueOf(var23_21 >> 6 & 112);
            var48_46 = ((OX)var12_10.invoke((Object)var26_24 /* !! */ , (Object)var17_15, (Object)var25_23 /* !! */ )).a;
            var26_24 /* !! */  = OX.f(var48_46);
            var33_31 = (int)var17_15.J(var26_24 /* !! */ );
            var43_42 /* !! */  = var17_15.v();
            if (var33_31 != 0 || var43_42 /* !! */  == var41_40 /* !! */ ) {
                var41_40 /* !! */  = kZ.a.invoke(var26_24 /* !! */ );
                var43_42 /* !! */  = var41_40 /* !! */ ;
                var43_42 /* !! */  = (Vs3)var41_40 /* !! */ ;
                var17_15.o((Object)var43_42 /* !! */ );
            }
            var41_40 /* !! */  = var43_42 /* !! */ ;
            var41_40 /* !! */  = (Vs3)var43_42 /* !! */ ;
            var23_21 <<= 3;
            var50_47 = 57344;
            var23_21 &= var50_47;
            var24_22 = 3072;
            var23_21 |= var24_22;
            var42_41 = var42_41.a();
            var23_21 = var23_21 >> 9 & 112;
            var26_24 /* !! */  = var23_21;
            var26_24 /* !! */  = var12_10.invoke(var42_41, var17_15, var26_24 /* !! */ );
            var36_35 = var36_35.getValue();
            var42_41 = var23_21;
            var25_23 /* !! */  = var12_10.invoke(var36_35, var17_15, var42_41);
            var36_35 = var37_36.f();
            var42_41 = 0;
            var36_35 = kl3_0.c.invoke(var36_35, var17_15, var42_41);
            var43_42 /* !! */  = var36_35;
            var43_42 /* !! */  = (un0_0)var36_35;
            var45_44 = 196608;
            var27_25 = var37_36;
            var36_35 = var44_43 /* !! */ ;
            var44_43 /* !! */  = var41_40 /* !! */ ;
            var29_27 /* !! */  = var17_15;
            var41_40 /* !! */  = yr3.b((gr3)var37_36, var26_24 /* !! */ , (Object)var25_23 /* !! */ , (un0_0)var43_42 /* !! */ , (Vs3)var41_40 /* !! */ , (b30_0)var17_15, var45_44);
            var39_38 = ((Number)var11_9 /* !! */ .j.getValue()).floatValue();
            var26_24 /* !! */  = Float.valueOf(var39_38);
            var46_45 = ((OX)var36_35.j.getValue()).a;
            var11_9 /* !! */  = new OX(var46_45);
            var36_35 = (OX)var41_40 /* !! */ .j.getValue();
            var51_48 = var36_35.a;
            var43_42 /* !! */  = new OX(var51_48);
            var35_33 = (Number)var35_33.j.getValue();
            var44_43 /* !! */  = Float.valueOf(var35_33.floatValue());
            var15_13 = var18_16 >> 3 & var50_47;
            var53_49 = var15_13;
            var27_25 = var8_6;
            var25_23 /* !! */  = var11_9 /* !! */ ;
            var8_6.invoke(var26_24 /* !! */ , (Object)var11_9 /* !! */ , (Object)var43_42 /* !! */ , var44_43 /* !! */ , var17_15, var53_49);
        }
        var27_25 = var17_15.X();
        if (var27_25 != null) {
            var35_33 = var26_24 /* !! */ ;
            var17_15 = this;
            var11_9 /* !! */  = var1_1;
            var12_10 = var6_4;
            var13_11 = var7_5;
            var14_12 = var10_8;
            var27_25.d = var26_24 /* !! */  = new jl3_0(this, var1_1, var2_2, var4_3, var6_4, var7_5, var8_6, var10_8);
        }
    }
}

