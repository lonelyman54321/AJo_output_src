/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from SS2
 */
public final class ss2_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ lg3_0 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ gx0_2 j;

    public ss2_1(Function2 function2, u10 u102, Function2 function22, int n3, boolean bl2, lg3_0 lg3_02, Function2 function23, u10 u103) {
        this.c = function2;
        this.d = u102;
        this.e = function22;
        this.f = n3;
        this.g = bl2;
        this.h = lg3_02;
        this.i = function23;
        this.j = u103;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block56: {
            block54: {
                block51: {
                    block55: {
                        block53: {
                            block52: {
                                block50: {
                                    var3_3 = this;
                                    var4_4 = var1_1;
                                    var4_4 = (xf3_1)var1_1;
                                    var5_5 = var2_2;
                                    var6_6 = ((c60)var2_2).a;
                                    var8_7 = c60.i(var6_6);
                                    var9_8 = c60.h(var6_6);
                                    var10_9 = 0;
                                    var11_10 /* !! */  = null;
                                    var12_11 = 10;
                                    var13_12 = 0;
                                    var14_13 = null;
                                    var15_14 = null;
                                    var6_6 = c60.b(var6_6, 0, 0, 0, 0, var12_11);
                                    var5_5 = US2.TopBar;
                                    var16_15 /* !! */  = this.c;
                                    var5_5 = var4_4.w(var5_5, var16_15 /* !! */ );
                                    var18_17 = var5_5.size();
                                    var17_16 = new ArrayList<Ns2>(var18_17);
                                    var18_17 = var5_5.size();
                                    var20_19 = 0.0f;
                                    var21_20 = null;
                                    for (var19_18 = 0; var19_18 < var18_17; ++var19_18) {
                                        var22_21 /* !! */  = ((xk1_0)var5_5.get(var19_18)).Q(var6_6);
                                        var17_16.add(var22_21 /* !! */ );
                                    }
                                    var23_22 = var17_16.isEmpty();
                                    var10_9 = 1;
                                    if (var23_22 != 0) {
                                        var23_22 = 0;
                                        var5_5 = null;
                                    } else {
                                        var21_20 = var5_5 = var17_16.get(0);
                                        var21_20 = (Ns2)var5_5;
                                        var19_18 = var21_20.b;
                                        var24_23 = xx_2.h(var17_16);
                                        if (var10_9 <= var24_23) {
                                            var25_24 = 1;
                                            while (true) {
                                                var15_14 = var17_16.get(var25_24);
                                                var26_25 = var15_14;
                                                var26_25 = (Ns2)var15_14;
                                                var12_11 = var26_25.b;
                                                if (var19_18 < var12_11) {
                                                    var5_5 = var15_14;
                                                    var19_18 = var12_11;
                                                }
                                                if (var25_24 == var24_23) break;
                                                ++var25_24;
                                            }
                                        }
                                    }
                                    var5_5 = (Ns2)var5_5;
                                    var27_26 = var5_5 != null ? (var23_22 = var5_5.b) : 0;
                                    var5_5 = US2.Snackbar;
                                    var21_20 = var3_3.d;
                                    var5_5 = var4_4.w(var5_5, (Function2)var21_20);
                                    var19_18 = var5_5.size();
                                    var15_14 = new ArrayList<Object>(var19_18);
                                    var19_18 = var5_5.size();
                                    var24_23 = 0;
                                    var28_27 = 0.0f;
                                    var22_21 /* !! */  = null;
                                    while (true) {
                                        var29_28 = var3_3.h;
                                        if (var24_23 >= var19_18) break;
                                        var26_25 = (xk1_0)var5_5.get(var24_23);
                                        var16_15 /* !! */  = var4_4.getLayoutDirection();
                                        var18_17 = var29_28.d((Vo0)var4_4, (bp1_0)var16_15 /* !! */ );
                                        var11_10 /* !! */  = var4_4.getLayoutDirection();
                                        var10_9 = var29_28.b((Vo0)var4_4, var11_10 /* !! */ );
                                        var25_24 = var29_28.c((Vo0)var4_4);
                                        var18_17 = -var18_17 - var10_9;
                                        var25_24 = -var25_24;
                                        var30_29 = f60.k(var18_17, var25_24, var6_6);
                                        var16_15 /* !! */  = var26_25.Q(var30_29);
                                        var15_14.add(var16_15 /* !! */ );
                                        ++var24_23;
                                        var13_12 = 0;
                                        var14_13 = null;
                                        var10_9 = 1;
                                    }
                                    var23_22 = (int)var15_14.isEmpty();
                                    if (var23_22 != 0) {
                                        var18_17 = 0;
                                        var32_30 = 0.0f;
                                        var16_15 /* !! */  = null;
                                    } else {
                                        var16_15 /* !! */  = var15_14.get(0);
                                        var5_5 = var16_15 /* !! */ ;
                                        var5_5 = (Ns2)var16_15 /* !! */ ;
                                        var23_22 = var5_5.b;
                                        var19_18 = xx_2.h(var15_14);
                                        var24_23 = 1;
                                        var28_27 = 1.4E-45f;
                                        if (var24_23 <= var19_18) {
                                            var22_21 /* !! */  = var16_15 /* !! */ ;
                                            var18_17 = var23_22;
                                            var23_22 = 1;
                                            while (true) {
                                                var14_13 = var15_14.get(var23_22);
                                                var11_10 /* !! */  = var14_13;
                                                var11_10 /* !! */  = (Ns2)var14_13;
                                                var10_9 = var11_10 /* !! */ .b;
                                                if (var18_17 < var10_9) {
                                                    var22_21 /* !! */  = var14_13;
                                                    var18_17 = var10_9;
                                                }
                                                if (var23_22 == var19_18) break;
                                                ++var23_22;
                                            }
                                            var16_15 /* !! */  = var22_21 /* !! */ ;
                                        }
                                    }
                                    var16_15 /* !! */  = (Ns2)var16_15 /* !! */ ;
                                    if (var16_15 /* !! */  != null) {
                                        var23_22 = var16_15 /* !! */ .b;
                                    } else {
                                        var23_22 = 0;
                                        var5_5 = null;
                                    }
                                    var16_15 /* !! */  = US2.Fab;
                                    var21_20 = var3_3.e;
                                    var16_15 /* !! */  = var4_4.w(var16_15 /* !! */ , (Function2)var21_20);
                                    var19_18 = var16_15 /* !! */ .size();
                                    var26_25 = new ArrayList(var19_18);
                                    var19_18 = var16_15 /* !! */ .size();
                                    var28_27 = 0.0f;
                                    var22_21 /* !! */  = null;
                                    for (var24_23 = 0; var24_23 < var19_18; ++var24_23) {
                                        var14_13 = (xk1_0)var16_15 /* !! */ .get(var24_23);
                                        var11_10 /* !! */  = var4_4.getLayoutDirection();
                                        var10_9 = var29_28.d((Vo0)var4_4, var11_10 /* !! */ );
                                        var33_31 = var16_15 /* !! */ ;
                                        var16_15 /* !! */  = var4_4.getLayoutDirection();
                                        var18_17 = var29_28.b((Vo0)var4_4, (bp1_0)var16_15 /* !! */ );
                                        var34_32 = var19_18;
                                        var19_18 = var29_28.c((Vo0)var4_4);
                                        var10_9 = -var10_9 - var18_17;
                                        var18_17 = -var19_18;
                                        var35_33 = f60.k(var10_9, var18_17, var6_6);
                                        var16_15 /* !! */  = var14_13.Q(var35_33);
                                        var26_25.add(var16_15 /* !! */ );
                                        var16_15 /* !! */  = var33_31;
                                        var19_18 = var34_32;
                                    }
                                    var18_17 = (int)var26_25.isEmpty();
                                    var19_18 = 1;
                                    var20_19 = 1.4E-45f;
                                    if ((var18_17 ^= var19_18) == 0) break block52;
                                    var18_17 = (int)var26_25.isEmpty();
                                    if (var18_17 != 0) {
                                        var24_23 = 0;
                                        var28_27 = 0.0f;
                                        var22_21 /* !! */  = null;
                                    } else {
                                        var32_30 = 0.0f;
                                        var22_21 /* !! */  = var26_25.get(0);
                                        var16_15 /* !! */  = var22_21 /* !! */ ;
                                        var16_15 /* !! */  = var22_21 /* !! */ ;
                                        var18_17 = var16_15 /* !! */ .a;
                                        var10_9 = 1;
                                        var13_12 = xx_2.h(var26_25);
                                        if (var10_9 <= var13_12) {
                                            var11_10 /* !! */  = var22_21 /* !! */ ;
                                            var24_23 = var18_17;
                                            var18_17 = 1;
                                            var32_30 = 1.4E-45f;
                                            while (true) {
                                                var21_20 = var33_31 = var26_25.get(var18_17);
                                                var21_20 = (Ns2)var33_31;
                                                var19_18 = var21_20.a;
                                                if (var24_23 < var19_18) {
                                                    var24_23 = var19_18;
                                                    var11_10 /* !! */  = var33_31;
                                                }
                                                if (var18_17 == var13_12) break;
                                                ++var18_17;
                                            }
                                            var22_21 /* !! */  = var11_10 /* !! */ ;
                                        }
                                    }
                                    if (var22_21 /* !! */  != null) {
                                        var18_17 = var22_21 /* !! */ .a;
                                    } else {
                                        var18_17 = 0;
                                        var32_30 = 0.0f;
                                        var16_15 /* !! */  = null;
                                    }
                                    var19_18 = (int)var26_25.isEmpty();
                                    if (var19_18 != 0) {
                                        var24_23 = 0;
                                        var28_27 = 0.0f;
                                        var22_21 /* !! */  = null;
                                    } else {
                                        var20_19 = 0.0f;
                                        var22_21 /* !! */  = var26_25.get(0);
                                        var21_20 = var22_21 /* !! */ ;
                                        var21_20 = var22_21 /* !! */ ;
                                        var19_18 = var21_20.b;
                                        var10_9 = 1;
                                        var13_12 = xx_2.h(var26_25);
                                        if (var10_9 <= var13_12) {
                                            var11_10 /* !! */  = var22_21 /* !! */ ;
                                            var24_23 = var19_18;
                                            var19_18 = 1;
                                            var20_19 = 1.4E-45f;
                                            while (true) {
                                                var33_31 = var26_25.get(var19_18);
                                                var37_34 /* !! */  = var11_10 /* !! */ ;
                                                var11_10 /* !! */  = var33_31;
                                                var11_10 /* !! */  = (Ns2)var33_31;
                                                var10_9 = var11_10 /* !! */ .b;
                                                if (var24_23 < var10_9) {
                                                    var24_23 = var10_9;
                                                    var11_10 /* !! */  = var33_31;
                                                } else {
                                                    var11_10 /* !! */  = var37_34 /* !! */ ;
                                                }
                                                if (var19_18 == var13_12) break;
                                                ++var19_18;
                                            }
                                            var22_21 /* !! */  = var11_10 /* !! */ ;
                                        }
                                    }
                                    if (var22_21 /* !! */  != null) {
                                        var19_18 = var22_21 /* !! */ .b;
                                    } else {
                                        var19_18 = 0;
                                        var20_19 = 0.0f;
                                        var21_20 = null;
                                    }
                                    if (var18_17 == 0 || var19_18 == 0) break block52;
                                    var24_23 = var3_3.f;
                                    if (var24_23 != 0) ** GOTO lbl235
                                    var22_21 /* !! */  = var4_4.getLayoutDirection();
                                    if (var22_21 /* !! */  == (var14_13 = bp1_0.Ltr)) {
                                        var32_30 = HS2.b;
                                        var18_17 = var4_4.e0(var32_30);
                                    } else {
                                        var28_27 = HS2.b;
                                        var24_23 = var4_4.e0(var28_27);
lbl231:
                                        // 2 sources

                                        while (true) {
                                            var24_23 = var8_7 - var24_23;
                                            var18_17 = var24_23 - var18_17;
                                            break block50;
                                            break;
                                        }
lbl235:
                                        // 1 sources

                                        var13_12 = 2;
                                        if (var24_23 == var13_12) {
                                            var22_21 /* !! */  = var4_4.getLayoutDirection();
                                            if (var22_21 /* !! */  == (var14_13 = bp1_0.Ltr)) {
                                                var28_27 = HS2.b;
                                                var24_23 = var4_4.e0(var28_27);
                                                ** continue;
                                            }
                                            var32_30 = HS2.b;
                                            var18_17 = var4_4.e0(var32_30);
                                        } else {
                                            var18_17 = var8_7 - var18_17;
                                            var24_23 = 2;
                                            var28_27 = 2.8E-45f;
                                            var18_17 /= var24_23;
                                        }
                                    }
                                }
                                var22_21 /* !! */  = new mI0(var18_17, var19_18);
                                var11_10 /* !! */  = var22_21 /* !! */ ;
                                break block53;
                            }
                            var10_9 = 0;
                            var11_10 /* !! */  = null;
                        }
                        var16_15 /* !! */  = US2.BottomBar;
                        var22_21 /* !! */  = var3_3.i;
                        var21_20 = new rs2_0((mI0)var11_10 /* !! */ , (Function2)var22_21 /* !! */ );
                        var13_12 = 424088350;
                        var38_35 = var8_7;
                        var8_7 = 1;
                        var22_21 /* !! */  = new u10(var13_12, var21_20, (boolean)var8_7);
                        var16_15 /* !! */  = var4_4.w(var16_15 /* !! */ , (Function2)var22_21 /* !! */ );
                        var19_18 = var16_15 /* !! */ .size();
                        var14_13 = new ArrayList(var19_18);
                        var19_18 = var16_15 /* !! */ .size();
                        var28_27 = 0.0f;
                        var22_21 /* !! */  = null;
                        for (var24_23 = 0; var24_23 < var19_18; ++var24_23) {
                            var39_36 /* !! */  = ((xk1_0)var16_15 /* !! */ .get(var24_23)).Q(var6_6);
                            var14_13.add(var39_36 /* !! */ );
                        }
                        var18_17 = (int)var14_13.isEmpty();
                        if (var18_17 != 0) {
                            var18_17 = 0;
                            var32_30 = 0.0f;
                            var16_15 /* !! */  = null;
                        } else {
                            var39_36 /* !! */  = null;
                            var16_15 /* !! */  = var14_13.get(0);
                            var21_20 = var16_15 /* !! */ ;
                            var21_20 = (Ns2)var16_15 /* !! */ ;
                            var19_18 = var21_20.b;
                            var8_7 = 1;
                            var24_23 = xx_2.h((List)var14_13);
                            if (var8_7 <= var24_23) {
                                var8_7 = 1;
                                while (true) {
                                    var37_34 /* !! */  = var14_13.get(var8_7);
                                    var40_37 = var16_15 /* !! */ ;
                                    var16_15 /* !! */  = var37_34 /* !! */ ;
                                    var16_15 /* !! */  = (Ns2)var37_34 /* !! */ ;
                                    var18_17 = var16_15 /* !! */ .b;
                                    if (var19_18 < var18_17) {
                                        var19_18 = var18_17;
                                        var16_15 /* !! */  = var37_34 /* !! */ ;
                                    } else {
                                        var16_15 /* !! */  = var40_37;
                                    }
                                    if (var8_7 == var24_23) break;
                                    ++var8_7;
                                }
                            }
                        }
                        var16_15 /* !! */  = (Ns2)var16_15 /* !! */ ;
                        if (var16_15 /* !! */  != null) {
                            var18_17 = var16_15 /* !! */ .b;
                            var16_15 /* !! */  = Integer.valueOf(var18_17);
                            var41_38 = var16_15 /* !! */ ;
                        } else {
                            var41_38 = null;
                        }
                        if (var11_10 /* !! */  == null) break block54;
                        var18_17 = var11_10 /* !! */ .b;
                        if (var41_38 == null) {
                            var20_19 = HS2.b;
                            var19_18 = var4_4.e0(var20_19) + var18_17;
                            var18_17 = var29_28.c((Vo0)var4_4);
lbl317:
                            // 3 sources

                            while (true) {
                                break block51;
                                break;
                            }
                        }
                        var19_18 = (int)var3_3.g;
                        if (var19_18 == 0) break block55;
                        var19_18 = var41_38.intValue();
                        var24_23 = 2;
                        var28_27 = 2.8E-45f;
                        var18_17 /= var24_23;
                        ** GOTO lbl317
                    }
                    var19_18 = var41_38.intValue() + var18_17;
                    var32_30 = HS2.b;
                    var18_17 = var4_4.e0(var32_30);
                    ** while (true)
                }
                var16_15 /* !! */  = Integer.valueOf(var18_17 += var19_18);
                var42_39 /* !! */  = var16_15 /* !! */ ;
                break block56;
            }
            var42_39 /* !! */  = null;
        }
        if (var23_22 != 0) {
            var18_17 = var42_39 /* !! */  != null ? var42_39 /* !! */  : (var41_38 != null ? var41_38.intValue() : var29_28.c((Vo0)var4_4));
            var43_40 = var23_22 += var18_17;
        } else {
            var43_40 = 0;
        }
        var44_41 = var9_8 - var27_26;
        var39_36 /* !! */  = US2.MainContent;
        var45_42 = var5_5 = var3_3.j;
        var45_42 = (u10)var5_5;
        var16_15 /* !! */  = var3_3.h;
        var5_5 = var29_28;
        var21_20 = var4_4;
        var22_21 /* !! */  = var17_16;
        var3_3 = var29_28;
        var29_28 = var14_13;
        var46_43 = var9_8;
        var47_44 = var14_13;
        var48_45 = var38_35;
        var14_13 = var39_36 /* !! */ ;
        var39_36 /* !! */  = var45_42;
        var5_5((lg3_0)var16_15 /* !! */ , (xf3_1)var4_4, var17_16, (ArrayList)var29_28, (Integer)var41_38, (u10)var45_42);
        var32_30 = -2.2568728E18f;
        var19_18 = 1;
        var20_19 = 1.4E-45f;
        var5_5 = new u10(-570781649, var3_3, (boolean)var19_18);
        var3_3 = var4_4.w(var14_13, (Function2)var5_5);
        var18_17 = var3_3.size();
        var5_5 = new ArrayList(var18_17);
        var18_17 = var3_3.size();
        var14_13 = null;
        for (var13_12 = 0; var13_12 < var18_17; ++var13_12) {
            var21_20 = (xk1_0)var3_3.get(var13_12);
            var34_32 = 0;
            var45_42 = null;
            var49_46 = 7;
            var37_34 /* !! */  = null;
            var40_37 = null;
            var50_47 = c60.b(var6_6, 0, 0, 0, var44_41, var49_46);
            var21_20 = var21_20.Q(var50_47);
            var5_5.add(var21_20);
        }
        var16_15 /* !! */  = var47_44;
        var14_13 = var3_3;
        var22_21 /* !! */  = var11_10 /* !! */ ;
        var11_10 /* !! */  = var5_5;
        var5_5 = var26_25;
        var26_25 = var47_44;
        var38_35 = var27_26;
        var34_32 = var46_43;
        var40_37 = var41_38;
        var3_3 = new ps2_0((ArrayList)var11_10 /* !! */ , var17_16, var15_14, (ArrayList)var47_44, (ArrayList)var5_5, var27_26, var46_43, var43_40, (Integer)var41_38, (mI0)var22_21 /* !! */ , var42_39 /* !! */ );
        var18_17 = var46_43;
        var23_22 = var48_45;
        return cl1_0.a((dl1_1)var4_4, var48_45, var46_43, (Function1)var3_3);
    }
}

