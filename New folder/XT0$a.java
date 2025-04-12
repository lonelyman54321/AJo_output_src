/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class XT0$a
extends FunctionReferenceImpl
implements Function0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke() {
        block100: {
            block101: {
                var1_1 = this;
                var2_2 = (Object[])this.receiver;
                var3_3 /* !! */  = var2_2.e;
                var4_4 = var3_3 /* !! */ .b;
                var5_5 = var3_3 /* !! */ .a;
                var6_6 = ((long[])var5_5).length + -2;
                var7_7 = "visitChildren called on an unattached node";
                var8_8 = 7;
                var9_9 = -9187201950435737472L;
                var11_10 = var2_2.c;
                var12_11 = 8;
                if (var6_6 >= 0) {
                    var13_12 = 0;
                    var14_13 = null;
                    while (true) {
                        if ((var19_16 = (cfr_temp_0 = (var17_15 = ((var15_14 = var5_5[var13_12]) ^ (long)-1) << var8_8 & var15_14 & var9_9) - var9_9) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) {
                            var20_17 = ~(var13_12 - var6_6) >>> 31;
                            var20_17 = 8 - var20_17;
                            var22_19 = null;
                            for (var21_18 = 0; var21_18 < var20_17; ++var21_18) {
                                var23_20 = 255L;
                                var25_21 = var15_14 & var23_20;
                                var27_22 = 128L;
                                cfr_temp_1 = var25_21 - var27_22;
                                var29_23 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var29_23 /* !! */  < 0) {
                                    var19_16 = (var13_12 << 3) + var21_18;
                                    var30_24 /* !! */  = (lu0_0)var4_4[var19_16];
                                    var31_25 = var30_24 /* !! */ .e();
                                    var32_26 = var31_25.m;
                                    if (var32_26 != 0) {
                                        var31_25 = var30_24 /* !! */ .e();
                                        var33_27 /* !! */  = 0;
                                        var34_28 = null;
                                        block2: while (var31_25 != null) {
                                            var8_8 = var31_25 instanceof FocusTargetNode;
                                            if (var8_8 != 0) {
                                                var31_25 = (FocusTargetNode)var31_25;
                                                var11_10.d(var31_25);
                                                while (true) {
                                                    var35_29 /* !! */  = var4_4;
                                                    var36_30 = var5_5;
                                                    break;
                                                }
                                            } else {
                                                if ((var8_8 = var31_25.c & 1024) == 0 || (var8_8 = var31_25 instanceof mo0_0) == 0) ** continue;
                                                var37_31 = var31_25;
                                                var37_31 = ((mo0_0)var31_25).o;
                                                var12_11 = 0;
                                                while (var37_31 != null) {
                                                    var38_32 = var37_31.c & 1024;
                                                    if (var38_32 != 0) {
                                                        var38_32 = 1;
                                                        if (++var12_11 == var38_32) {
                                                            var35_29 /* !! */  = var4_4;
                                                            var36_30 = var5_5;
                                                            var31_25 = var37_31;
                                                        } else {
                                                            if (var34_28 == null) {
                                                                var35_29 /* !! */  = var4_4;
                                                                var36_30 = var5_5;
                                                                var39_33 = 16;
                                                                var5_5 = new LP1$c[var39_33];
                                                                var1_1 = new WR1((Object[])var5_5);
                                                            } else {
                                                                var35_29 /* !! */  = var4_4;
                                                                var36_30 = var5_5;
                                                                var1_1 = var34_28;
                                                            }
                                                            if (var31_25 != null) {
                                                                var1_1.b(var31_25);
                                                                var32_26 = 0;
                                                                var31_25 = null;
                                                            }
                                                            var1_1.b(var37_31);
                                                            var34_28 = var1_1;
                                                        }
                                                    } else {
                                                        var35_29 /* !! */  = var4_4;
                                                        var36_30 = var5_5;
                                                    }
                                                    var37_31 = var37_31.f;
                                                    var1_1 = this;
                                                    var4_4 = var35_29 /* !! */ ;
                                                    var5_5 = var36_30;
                                                }
                                                var35_29 /* !! */  = var4_4;
                                                var36_30 = var5_5;
                                                var38_32 = 1;
                                                if (var12_11 == var38_32) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var1_1 = this;
                                                        var4_4 = var35_29 /* !! */ ;
                                                        var5_5 = var36_30;
                                                        var8_8 = 7;
                                                        var12_11 = 8;
                                                        continue block2;
                                                        break;
                                                    }
                                                }
                                            }
                                            var31_25 = go0.b(var34_28);
                                            ** continue;
                                        }
                                        var35_29 /* !! */  = var4_4;
                                        var36_30 = var5_5;
                                        var1_1 = var30_24 /* !! */ .e();
                                        var38_32 = (int)var1_1.m;
                                        if (var38_32 != 0) {
                                            var39_33 = 16;
                                            var5_5 = new LP1$c[var39_33];
                                            var1_1 = new WR1((Object[])var5_5);
                                            var4_4 = var30_24 /* !! */ .e().f;
                                            if (var4_4 == null) {
                                                var4_4 = var30_24 /* !! */ .e();
                                                go0.a((WR1)var1_1, (LP1$c)var4_4);
                                            } else {
                                                var1_1.b(var4_4);
                                            }
                                            block6: while ((var39_33 = (int)var1_1.l()) != 0) {
                                                var39_33 = var1_1.c - 1;
                                                var4_4 = (LP1$c)var1_1.n(var39_33);
                                                var40_34 = var4_4.d & 1024;
                                                if (var40_34 == 0) {
                                                    go0.a((WR1)var1_1, (LP1$c)var4_4);
                                                    continue;
                                                }
                                                while (var4_4 != null) {
                                                    var40_34 = var4_4.c & 1024;
                                                    if (var40_34 != 0) {
                                                        var40_34 = 0;
                                                        var5_5 = null;
                                                        block8: while (var4_4 != null) {
                                                            var8_8 = var4_4 instanceof FocusTargetNode;
                                                            if (var8_8 != 0) {
                                                                var4_4 = (FocusTargetNode)var4_4;
                                                                var11_10.d(var4_4);
                                                                while (true) {
                                                                    var34_28 = var1_1;
                                                                    break;
                                                                }
                                                            } else {
                                                                if ((var8_8 = ((LP1$c)var4_4).c & 1024) == 0 || (var8_8 = var4_4 instanceof mo0_0) == 0) ** continue;
                                                                var37_31 = var4_4;
                                                                var37_31 = ((mo0_0)var4_4).o;
                                                                var12_11 = 0;
                                                                while (var37_31 != null) {
                                                                    var32_26 = var37_31.c & 1024;
                                                                    if (var32_26 != 0) {
                                                                        var32_26 = 1;
                                                                        if (++var12_11 == var32_26) {
                                                                            var34_28 = var1_1;
                                                                            var4_4 = var37_31;
                                                                        } else {
                                                                            if (var5_5 == null) {
                                                                                var5_5 = new WR1;
                                                                                var34_28 = var1_1;
                                                                                var32_26 = 16;
                                                                                var1_1 = new LP1$c[var32_26];
                                                                                var5_5(var1_1);
                                                                            } else {
                                                                                var34_28 = var1_1;
                                                                            }
                                                                            if (var4_4 != null) {
                                                                                var5_5.b(var4_4);
                                                                                var39_33 = 0;
                                                                                var4_4 = null;
                                                                            }
                                                                            var5_5.b(var37_31);
                                                                        }
                                                                    } else {
                                                                        var34_28 = var1_1;
                                                                    }
                                                                    var37_31 = var37_31.f;
                                                                    var1_1 = var34_28;
                                                                }
                                                                var34_28 = var1_1;
                                                                var38_32 = 1;
                                                                if (var12_11 == var38_32) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        var1_1 = var34_28;
                                                                        continue block8;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            var4_4 = go0.b((WR1)var5_5);
                                                            ** continue;
                                                        }
                                                        continue block6;
                                                    }
                                                    var34_28 = var1_1;
                                                    var4_4 = var4_4.f;
                                                }
                                            }
                                        } else {
                                            var2_2 = var7_7.toString();
                                            var1_1 = new IllegalStateException((String)var2_2);
                                            throw var1_1;
                                        }
lbl177:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                }
                                var35_29 /* !! */  = var4_4;
                                var36_30 = var5_5;
                                ** continue;
                                var38_32 = 8;
                                var15_14 >>= var38_32;
                                var1_1 = this;
                                var4_4 = var35_29 /* !! */ ;
                                var5_5 = var36_30;
                                var8_8 = 7;
                                var12_11 = 8;
                                var9_9 = -9187201950435737472L;
                            }
                            var35_29 /* !! */  = var4_4;
                            var36_30 = var5_5;
                            var38_32 = 8;
                            if (var20_17 != var38_32) break;
                        } else {
                            var35_29 /* !! */  = var4_4;
                            var36_30 = var5_5;
                        }
                        if (var13_12 == var6_6) break;
                        ++var13_12;
                        var1_1 = this;
                        var4_4 = var35_29 /* !! */ ;
                        var5_5 = var36_30;
                        var8_8 = 7;
                        var12_11 = 8;
                        var9_9 = -9187201950435737472L;
                    }
                }
                var3_3 /* !! */ .e();
                var1_1 = var2_2.d;
                var4_4 = var1_1.b;
                var5_5 = var1_1.a;
                var6_6 = ((long[])var5_5).length + -2;
                var14_13 = var2_2.f;
                if (var6_6 < 0) break block101;
                var41_35 = 0;
                while (true) {
                    block108: {
                        block102: {
                            var42_36 = var5_5[var41_35];
                            var44_37 = var42_36 ^ (long)-1;
                            var12_11 = 7;
                            var44_37 = var44_37 << var12_11 & var42_36;
                            var46_38 = -9187201950435737472L;
                            cfr_temp_2 = (var44_37 &= var46_38) - var46_38;
                            var33_27 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                            if (var33_27 /* !! */  == false) break block102;
                            var21_18 = ~(var41_35 - var6_6) >>> 31;
                            var8_8 = 8;
                            var12_11 = 8 - var21_18;
                            var22_19 = null;
                            for (var21_18 = 0; var21_18 < var12_11; ++var21_18) {
                                block103: {
                                    block105: {
                                        block104: {
                                            var48_39 = var42_36 & 255L;
                                            var9_9 = 128L;
                                            cfr_temp_3 = var48_39 - var9_9;
                                            var8_8 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                            if (var8_8 >= 0) break block103;
                                            var8_8 = (var41_35 << 3) + var21_18;
                                            var37_31 = (nt0_0)var4_4[var8_8];
                                            var31_25 = var37_31.e();
                                            var32_26 = var31_25.m;
                                            if (var32_26 != 0) break block104;
                                            var31_25 = uu0_1.Inactive;
                                            var37_31.L0((tu0_0)var31_25);
                                            break block103;
                                        }
                                        var31_25 = var37_31.e();
                                        var33_27 /* !! */  = 1;
                                        var19_16 = 0;
                                        var30_24 /* !! */  = null;
                                        var35_29 /* !! */  = null;
                                        var50_40 = false;
                                        var36_30 = null;
                                        block15: while (var31_25 != null) {
                                            var51_41 = var4_4;
                                            var39_33 = var31_25 instanceof FocusTargetNode;
                                            if (var39_33 != 0) {
                                                var31_25 = (FocusTargetNode)var31_25;
                                                if (var30_24 /* !! */  != null) {
                                                    var50_40 = true;
                                                }
                                                if ((var39_33 = (int)var11_10.a(var31_25)) != 0) {
                                                    var14_13.d(var31_25);
                                                    var33_27 /* !! */  = 0;
                                                    var34_28 = null;
                                                }
                                                var52_42 /* !! */  = var2_2;
                                                var53_43 = var3_3 /* !! */ ;
                                                var54_44 = var5_5;
                                                var30_24 /* !! */  = var31_25;
                                            } else {
                                                var39_33 = ((LP1$c)var31_25).c & 1024;
                                                if (var39_33 != 0 && (var39_33 = var31_25 instanceof mo0_0) != 0) {
                                                    var4_4 = var31_25;
                                                    var4_4 = ((mo0_0)var31_25).o;
                                                    var54_44 = var5_5;
                                                    var40_34 = 0;
                                                    var5_5 = null;
                                                    while (var4_4 != null) {
                                                        var53_43 = var3_3 /* !! */ ;
                                                        var55_45 = var4_4.c & 1024;
                                                        if (var55_45 != 0) {
                                                            var55_45 = 1;
                                                            if (++var40_34 == var55_45) {
                                                                var52_42 /* !! */  = var2_2;
                                                                var31_25 = var4_4;
                                                            } else {
                                                                if (var35_29 /* !! */  == null) {
                                                                    var52_42 /* !! */  = var2_2;
                                                                    var56_46 = var40_34;
                                                                    var40_34 = 16;
                                                                    var2_2 = new LP1$c[var40_34];
                                                                    var3_3 /* !! */  = new WR1((Object[])var2_2);
                                                                } else {
                                                                    var52_42 /* !! */  = var2_2;
                                                                    var56_46 = var40_34;
                                                                    var3_3 /* !! */  = var35_29 /* !! */ ;
                                                                }
                                                                if (var31_25 != null) {
                                                                    var3_3 /* !! */ .b(var31_25);
                                                                    var32_26 = 0;
                                                                    var31_25 = null;
                                                                }
                                                                var3_3 /* !! */ .b(var4_4);
                                                                var35_29 /* !! */  = var3_3 /* !! */ ;
                                                                var40_34 = var56_46;
                                                            }
                                                        } else {
                                                            var52_42 /* !! */  = var2_2;
                                                        }
                                                        var4_4 = var4_4.f;
                                                        var3_3 /* !! */  = var53_43;
                                                        var2_2 = var52_42 /* !! */ ;
                                                    }
                                                    var52_42 /* !! */  = var2_2;
                                                    var53_43 = var3_3 /* !! */ ;
                                                    var57_47 = 1;
                                                    if (var40_34 == var57_47) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            var4_4 = var51_41;
                                                            var5_5 = var54_44;
                                                            var3_3 /* !! */  = var53_43;
                                                            var2_2 = var52_42 /* !! */ ;
                                                            continue block15;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    var52_42 /* !! */  = var2_2;
                                                    var53_43 = var3_3 /* !! */ ;
                                                    var54_44 = var5_5;
                                                }
                                            }
                                            var31_25 = go0.b((WR1)var35_29 /* !! */ );
                                            ** continue;
                                        }
                                        var52_42 /* !! */  = var2_2;
                                        var53_43 = var3_3 /* !! */ ;
                                        var51_41 = var4_4;
                                        var54_44 = var5_5;
                                        var2_2 = var37_31.e();
                                        var57_47 = (int)var2_2.m;
                                        if (var57_47 == 0) break block105;
                                        var55_45 = 16;
                                        var4_4 = new LP1$c[var55_45];
                                        var2_2 = new WR1((Object[])var4_4);
                                        var3_3 /* !! */  = var37_31.e().f;
                                        if (var3_3 /* !! */  == null) {
                                            var3_3 /* !! */  = var37_31.e();
                                            go0.a((WR1)var2_2, (LP1$c)var3_3 /* !! */ );
                                        } else {
                                            var2_2.b(var3_3 /* !! */ );
                                        }
                                        block18: while ((var55_45 = (int)var2_2.l()) != 0) {
                                            var55_45 = var2_2.c - 1;
                                            var3_3 /* !! */  = (LP1$c)var2_2.n(var55_45);
                                            var39_33 = var3_3 /* !! */ .d & 1024;
                                            if (var39_33 == 0) {
                                                go0.a((WR1)var2_2, (LP1$c)var3_3 /* !! */ );
                                                while (true) {
                                                    var35_29 /* !! */  = var2_2;
                                                    var57_47 = 16;
                                                    var40_34 = 1;
                                                    continue block18;
                                                    break;
                                                }
                                            }
                                            while (true) {
                                                block106: {
                                                    if (var3_3 /* !! */  == null) ** continue;
                                                    var39_33 = var3_3 /* !! */ .c & 1024;
                                                    if (var39_33 == 0) break block106;
                                                    var39_33 = 0;
                                                    var4_4 = null;
                                                    block21: while (var3_3 /* !! */  != null) {
                                                        block99: {
                                                            block107: {
                                                                var40_34 = var3_3 /* !! */  instanceof FocusTargetNode;
                                                                if (var40_34 != 0) {
                                                                    var3_3 /* !! */  = (FocusTargetNode)var3_3 /* !! */ ;
                                                                    if (var30_24 /* !! */  != null) {
                                                                        var50_40 = true;
                                                                    }
                                                                    if ((var40_34 = (int)var11_10.a(var3_3 /* !! */ )) != 0) {
                                                                        var14_13.d(var3_3 /* !! */ );
                                                                        var33_27 /* !! */  = 0;
                                                                        var34_28 = null;
                                                                    }
                                                                    var35_29 /* !! */  = var2_2;
                                                                    var30_24 /* !! */  = var3_3 /* !! */ ;
lbl368:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var57_47 = 16;
                                                                        var40_34 = 1;
                                                                        break block99;
                                                                        break;
                                                                    }
                                                                }
                                                                var40_34 = ((LP1$c)var3_3 /* !! */ ).c & 1024;
                                                                if (var40_34 == 0 || (var40_34 = var3_3 /* !! */  instanceof mo0_0) == 0) break block107;
                                                                var5_5 = var3_3 /* !! */ ;
                                                                var5_5 = ((mo0_0)var3_3 /* !! */ ).o;
                                                                var32_26 = 0;
                                                                var31_25 = null;
                                                                while (var5_5 != null) {
                                                                    var35_29 /* !! */  = var2_2;
                                                                    var57_47 = var5_5.c & 1024;
                                                                    if (var57_47 == 0) ** GOTO lbl385
                                                                    var57_47 = 1;
                                                                    if (++var32_26 == var57_47) {
                                                                        var3_3 /* !! */  = var5_5;
lbl385:
                                                                        // 2 sources

                                                                        var57_47 = 16;
                                                                    } else {
                                                                        if (var4_4 == null) {
                                                                            var58_48 = var32_26;
                                                                            var57_47 = 16;
                                                                            var31_25 = new LP1$c[var57_47];
                                                                            var4_4 = new WR1(var31_25);
                                                                        } else {
                                                                            var58_48 = var32_26;
                                                                            var57_47 = 16;
                                                                        }
                                                                        if (var3_3 /* !! */  != null) {
                                                                            var4_4.b(var3_3 /* !! */ );
                                                                            var55_45 = 0;
                                                                            var3_3 /* !! */  = null;
                                                                        }
                                                                        var4_4.b(var5_5);
                                                                        var32_26 = var58_48;
                                                                    }
                                                                    var5_5 = var5_5.f;
                                                                    var2_2 = var35_29 /* !! */ ;
                                                                }
                                                                var35_29 /* !! */  = var2_2;
                                                                var57_47 = 16;
                                                                var40_34 = 1;
                                                                if (var32_26 == var40_34) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        var2_2 = var35_29 /* !! */ ;
                                                                        continue block21;
                                                                        break;
                                                                    }
                                                                }
                                                                break block99;
                                                            }
                                                            var35_29 /* !! */  = var2_2;
                                                            ** continue;
                                                        }
                                                        var3_3 /* !! */  = go0.b((WR1)var4_4);
                                                        ** continue;
                                                    }
                                                    continue block18;
                                                }
                                                var35_29 /* !! */  = var2_2;
                                                var57_47 = 16;
                                                var40_34 = 1;
                                                var3_3 /* !! */  = var3_3 /* !! */ .f;
                                            }
                                        }
                                        var57_47 = 16;
                                        var40_34 = 1;
                                        if (var33_27 /* !! */  != false) {
                                            if (var50_40) {
                                                var3_3 /* !! */  = OT0.a((nt0_0)var37_31);
                                            } else if (var30_24 /* !! */  == null || (var3_3 /* !! */  = var30_24 /* !! */ .s1()) == null) {
                                                var3_3 /* !! */  = uu0_1.Inactive;
                                            }
                                            var37_31.L0((tu0_0)var3_3 /* !! */ );
                                        }
lbl434:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var2_2 = var7_7.toString();
                                    var1_1 = new IllegalStateException((String)var2_2);
                                    throw var1_1;
                                }
                                var52_42 /* !! */  = var2_2;
                                var53_43 = var3_3 /* !! */ ;
                                var51_41 = var4_4;
                                var54_44 = var5_5;
                                var57_47 = 16;
                                var40_34 = 1;
                                ** continue;
                                var55_45 = 8;
                                var42_36 >>= var55_45;
                                var4_4 = var51_41;
                                var5_5 = var54_44;
                                var3_3 /* !! */  = var53_43;
                                var2_2 = var52_42 /* !! */ ;
                            }
                            var52_42 /* !! */  = var2_2;
                            var53_43 = var3_3 /* !! */ ;
                            var51_41 = var4_4;
                            var54_44 = var5_5;
                            var57_47 = 16;
                            var55_45 = 8;
                            var40_34 = 1;
                            if (var12_11 != var55_45) break block100;
                            break block108;
                        }
                        var52_42 /* !! */  = var2_2;
                        var53_43 = var3_3 /* !! */ ;
                        var51_41 = var4_4;
                        var54_44 = var5_5;
                        var57_47 = 16;
                        var40_34 = 1;
                    }
                    if (var41_35 != var6_6) {
                        ++var41_35;
                        var4_4 = var51_41;
                        var5_5 = var54_44;
                        var3_3 /* !! */  = var53_43;
                        var2_2 = var52_42 /* !! */ ;
                        continue;
                    }
                    break block100;
                    break;
                }
            }
            var52_42 /* !! */  = var2_2;
            var53_43 = var3_3 /* !! */ ;
        }
        var1_1.e();
        var2_2 = var11_10.b;
        var3_3 /* !! */  = var11_10.a;
        var39_33 = var3_3 /* !! */ .length + -2;
        if (var39_33 >= 0) {
            var40_34 = 0;
            var5_5 = null;
            while (true) {
                var59_49 = var3_3 /* !! */ [var40_34];
                var42_36 = (long)(var59_49 ^ (long)-1);
                var6_6 = 7;
                var42_36 = var42_36 << var6_6 & var59_49;
                var44_37 = -9187201950435737472L;
                cfr_temp_4 = (var42_36 &= var44_37) - var44_37;
                var12_11 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                if (var12_11 != 0) {
                    var61_50 = ~(var40_34 - var39_33) >>> 31;
                    var20_17 = 8;
                    var12_11 = 8 - var61_50;
                    for (var61_50 = 0; var61_50 < var12_11; ++var61_50) {
                        var9_9 = 255L;
                        var23_20 = (long)(var59_49 & var9_9);
                        var62_51 = 128L;
                        cfr_temp_5 = var23_20 - var62_51;
                        var20_17 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var20_17 < 0) {
                            var20_17 = (var40_34 << 3) + var61_50;
                            var64_52 = (FocusTargetNode)var2_2[var20_17];
                            var6_6 = (int)var64_52.m;
                            if (var6_6 != 0) {
                                var65_53 = var64_52.s1();
                                var64_52.v1();
                                var22_19 = var64_52.s1();
                                if (var65_53 != var22_19 || (var6_6 = (int)var14_13.a(var64_52)) != 0) {
                                    OT0.b(var64_52);
                                }
                            }
                        }
                        var59_49 >>= 8;
                        var6_6 = 7;
                        var44_37 = -9187201950435737472L;
                    }
                    var6_6 = 8;
                    var9_9 = 255L;
                    var62_51 = 128L;
                    if (var12_11 != var6_6) break;
                } else {
                    var6_6 = 8;
                    var9_9 = 255L;
                    var62_51 = 128L;
                }
                if (var40_34 == var39_33) break;
                ++var40_34;
            }
        }
        var11_10.e();
        var14_13.e();
        var2_2 = var52_42 /* !! */ ;
        var2_2 = var52_42 /* !! */ .b;
        var2_2.invoke();
        var57_47 = var53_43.b();
        if (var57_47 != 0) {
            var38_32 = (int)var1_1.b();
            if (var38_32 != 0) {
                var38_32 = (int)var11_10.b();
                if (var38_32 != 0) {
                    return Unit.a;
                }
                bh1_1.c("Unprocessed FocusTarget nodes");
                throw null;
            }
            bh1_1.c("Unprocessed FocusEvent nodes");
            throw null;
        }
        bh1_1.c("Unprocessed FocusProperties nodes");
        throw null;
    }
}

