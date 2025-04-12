/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import androidx.compose.foundation.layout.j;
import androidx.compose.ui.graphics.a;
import com.google.accompanist.swiperefresh.SlingshotKt;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorSizes;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class SwipeRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final SwipeRefreshIndicatorSizes DefaultSizes;
    private static final SwipeRefreshIndicatorSizes LargeSizes;

    static {
        SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes;
        float f5 = 40;
        float f6 = (float)7.5;
        float f7 = (float)2.5;
        float f8 = 10;
        float f11 = 5;
        SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes2 = swipeRefreshIndicatorSizes;
        DefaultSizes = swipeRefreshIndicatorSizes = new SwipeRefreshIndicatorSizes(f5, f6, f7, f8, f11, null);
        float f12 = 56;
        float f14 = 11;
        float f15 = 3;
        float f16 = 12;
        float f17 = 6;
        LargeSizes = swipeRefreshIndicatorSizes2 = new SwipeRefreshIndicatorSizes(f12, f14, f15, f16, f17, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void SwipeRefreshIndicator-_UAkqwU(SwipeRefreshState var0, float var1_1, LP1 var2_2, boolean var3_3, boolean var4_4, boolean var5_5, long var6_6, long var8_7, i13 var10_8, float var11_9, boolean var12_10, float var13_11, b30_0 var14_12, int var15_13, int var16_14, int var17_15) {
        block88: {
            block87: {
                block86: {
                    block82: {
                        block85: {
                            block84: {
                                block83: {
                                    var18_16 = var1_1;
                                    var19_17 = var15_13;
                                    var20_18 = var17_15;
                                    Intrinsics.checkNotNullParameter(var0, "state");
                                    var21_19 = 373456677;
                                    var22_20 = var14_12;
                                    var23_21 = var14_12.g(var21_19);
                                    var24_22 = var17_15 & 1;
                                    if (var24_22 != 0) {
                                        var24_22 = var15_13 | 6;
                                    } else {
                                        var24_22 = var15_13 & 14;
                                        if (var24_22 == 0) {
                                            var24_22 = (int)var23_21.J(var0);
                                            if (var24_22 != 0) {
                                                var24_22 = 4;
                                                var25_23 = 5.6E-45f;
                                            } else {
                                                var24_22 = 2;
                                                var25_23 = 2.8E-45f;
                                            }
                                            var24_22 |= var19_17;
                                        } else {
                                            var24_22 = var15_13;
                                        }
                                    }
                                    var26_24 = var20_18 & 2;
                                    if (var26_24 != 0) {
                                        var24_22 |= 48;
                                    } else {
                                        var26_24 = var19_17 & 112;
                                        if (var26_24 == 0) {
                                            var26_24 = (int)var23_21.b(var18_16);
                                            if (var26_24 != 0) {
                                                var26_24 = 32;
                                                var27_25 = 4.5E-44f;
                                            } else {
                                                var26_24 = 16;
                                                var27_25 = 2.2E-44f;
                                            }
                                            var24_22 |= var26_24;
                                        }
                                    }
                                    var26_24 = var20_18 & 4;
                                    if (var26_24 != 0) {
                                        var24_22 |= 384;
                                        while (true) {
                                            var28_27 = var2_2;
                                            break;
                                        }
                                    } else {
                                        if ((var29_26 = var19_17 & 896) != 0) ** continue;
                                        var28_27 = var2_2;
                                        var30_28 = (int)var23_21.J(var2_2);
                                        var30_28 = var30_28 != 0 ? 256 : 128;
                                        var24_22 |= var30_28;
                                    }
                                    var30_28 = var20_18 & 8;
                                    if (var30_28 != 0) {
                                        var24_22 |= 3072;
                                        while (true) {
                                            var31_29 = (int)var3_3;
                                            break;
                                        }
                                    } else {
                                        if ((var31_29 = var19_17 & 7168) != 0) ** continue;
                                        var31_29 = (int)var3_3;
                                        var32_30 = (int)var23_21.a(var3_3);
                                        if (var32_30 != 0) {
                                            var32_30 = 2048;
                                            var33_31 = 2.87E-42f;
                                        } else {
                                            var32_30 = 1024;
                                            var33_31 = 1.435E-42f;
                                        }
                                        var24_22 |= var32_30;
                                    }
                                    var32_30 = var20_18 & 16;
                                    var34_32 = 57344;
                                    if (var32_30 != 0) {
                                        var24_22 |= 24576;
                                        var35_33 = var4_4;
                                    } else {
                                        var36_34 = var19_17 & var34_32;
                                        var35_33 = var4_4;
                                        if (var36_34 == 0) {
                                            var36_34 = (int)var23_21.a((boolean)var4_4);
                                            var36_34 = var36_34 != 0 ? 16384 : 8192;
                                            var24_22 |= var36_34;
                                        }
                                    }
                                    var36_34 = var20_18 & 32;
                                    if (var36_34 != 0) {
                                        var37_35 = 196608;
                                        var24_22 |= var37_35;
                                    } else {
                                        var37_35 = var19_17 & 458752;
                                        if (var37_35 == 0) {
                                            var38_36 = var23_21.a(var5_5);
                                            if (var38_36 != 0) {
                                                var38_36 = 131072;
                                                var39_37 = 1.83671E-40f;
                                            } else {
                                                var38_36 = 65536;
                                                var39_37 = 9.1835E-41f;
                                            }
                                            var24_22 |= var38_36;
                                        }
                                    }
                                    var39_37 = 5.142788E-39f;
                                    var38_36 = var19_17 & 0x380000;
                                    if (var38_36 == 0) {
                                        var38_36 = var20_18 & 64;
                                        var40_38 = var6_6;
                                        var42_39 = var38_36 == 0 && (var42_39 = (int)var23_21.d(var6_6)) != 0 ? 0x100000 : 524288;
                                        var24_22 |= var42_39;
                                    } else {
                                        var40_38 = var6_6;
                                    }
                                    var42_39 = var19_17 & 0x1C00000;
                                    if (var42_39 == 0) {
                                        var43_40 = var20_18 & 128;
                                        var44_41 = var26_24;
                                        var45_42 = var8_7;
                                        var47_43 = var43_40 == 0 && (var47_43 = (int)var23_21.d(var8_7)) != 0 ? 0x800000 : 0x400000;
                                        var24_22 |= var47_43;
                                    } else {
                                        var44_41 = var26_24;
                                        var45_42 = var8_7;
                                    }
                                    var47_43 = var19_17 & 0xE000000;
                                    if (var47_43 != 0) break block82;
                                    var43_40 = var20_18 & 256;
                                    if (var43_40 != 0) break block83;
                                    var48_44 = var10_8;
                                    var49_45 = (int)var23_21.J(var10_8);
                                    if (var49_45 == 0) break block84;
                                    var49_45 = 0x4000000;
                                    var50_46 = 1.5046328E-36f;
                                    break block85;
                                }
                                var48_44 = var10_8;
                            }
                            var49_45 = 0x2000000;
                            var50_46 = 9.403955E-38f;
                        }
                        var24_22 |= var49_45;
                        break block86;
                    }
                    var48_44 = var10_8;
                }
                var51_47 = var20_18 & 512;
                if (var51_47 != 0) {
                    var49_45 = 0x30000000;
                    var50_46 = 4.656613E-10f;
                    var24_22 |= var49_45;
                    var52_48 = var11_9;
                } else {
                    var50_46 = 1.5845633E29f;
                    var49_45 = var19_17 & 0x70000000;
                    var52_48 = var11_9;
                    if (var49_45 == 0) {
                        var49_45 = (int)var23_21.b(var11_9);
                        if (var49_45 != 0) {
                            var49_45 = 0x20000000;
                            var50_46 = 1.0842022E-19f;
                        } else {
                            var49_45 = 0x10000000;
                            var50_46 = 2.524355E-29f;
                        }
                        var24_22 |= var49_45;
                    }
                }
                var35_33 = var20_18 & 1024;
                if (var35_33 != 0) {
                    var49_45 = var16_14 | 6;
                    var53_49 = var12_10;
                } else {
                    var49_45 = var16_14 & 14;
                    var53_49 = var12_10;
                    if (var49_45 == 0) {
                        var26_24 = (int)var23_21.a((boolean)var12_10);
                        if (var26_24 != 0) {
                            var26_24 = 4;
                            var27_25 = 5.6E-45f;
                        } else {
                            var26_24 = 2;
                            var27_25 = 2.8E-45f;
                        }
                        var49_45 = var16_14 | var26_24;
                    } else {
                        var49_45 = var16_14;
                    }
                }
                var26_24 = var20_18 & 2048;
                if (var26_24 != 0) {
                    var49_45 |= 48;
                } else {
                    var54_50 = var16_14 & 112;
                    if (var54_50 == 0) {
                        var54_50 = (int)var23_21.b(var13_11);
                        var37_35 = var54_50 != 0 ? 32 : 16;
                        var49_45 |= var37_35;
                    }
                }
                var37_35 = 1533916891;
                var53_49 = var24_22 & var37_35;
                var55_51 = 306783378;
                var56_52 = 6.3469493E-28f;
                if (var53_49 != var55_51) break block87;
                var53_49 = var49_45 & 91;
                var55_51 = 18;
                var56_52 = 2.5E-44f;
                if (var53_49 != var55_51 || (var53_49 = (int)var23_21.h()) == 0) break block87;
                var23_21.D();
                var53_49 = var4_4;
                var26_24 = (int)var5_5;
                var40_38 = var6_6;
                var33_31 = var11_9;
                var57_53 = var13_11;
                var22_20 = var28_27;
                var35_33 = var31_29;
                var58_54 = var48_44;
                var59_55 = var8_7;
                var43_40 = var12_10;
                break block88;
            }
            var23_21.r0();
            var53_49 = var19_17 & 1;
            var37_35 = -234881025;
            var49_45 = -29360129;
            var50_46 = -6.380294E37f;
            var54_50 = -3670017;
            if (var53_49 != 0 && (var53_49 = (int)var23_21.c0()) == 0) {
                var23_21.D();
                var51_47 = var20_18 & 64;
                if (var51_47 != 0) {
                    var24_22 &= var54_50;
                }
                if ((var51_47 = var20_18 & 128) != 0) {
                    var24_22 &= var49_45;
                }
                if ((var51_47 = var20_18 & 256) != 0) {
                    var24_22 &= var37_35;
                }
                var51_47 = var4_4;
                var30_28 = (int)var5_5;
                var61_56 = var8_7;
                var35_33 = var12_10;
                var27_25 = var13_11;
                var32_30 = var24_22;
                var63_57 /* !! */  = var28_27;
                var64_58 = var48_44;
                var65_59 = var6_6;
                var25_23 = var11_9;
            } else {
                var63_57 /* !! */  = var44_41 != 0 ? LP1$a.b : var28_27;
                if (var30_28 != 0) {
                    var31_29 = 1;
                }
                if (var32_30 != 0) {
                    var29_26 = 0;
                    var28_27 = null;
                } else {
                    var29_26 = var4_4;
                }
                var30_28 = var36_34 != 0 ? 1 : (int)var5_5;
                var32_30 = var20_18 & 64;
                if (var32_30 != 0) {
                    var67_60 = mz_0.a;
                    var67_60 = (lZ)var23_21.j((H30)var67_60);
                    var68_61 = var67_60.h();
                    var24_22 &= var54_50;
                    var70_62 = var29_26;
                    var65_59 = var68_61;
                } else {
                    var70_62 = var29_26;
                    var65_59 = var6_6;
                }
                var32_30 = var20_18 & 128;
                if (var32_30 != 0) {
                    var61_56 = mz_0.b(var65_59, (b30_0)var23_21);
                    var24_22 &= var49_45;
                } else {
                    var61_56 = var8_7;
                }
                var32_30 = var20_18 & 256;
                if (var32_30 != 0) {
                    var67_60 = B13.a;
                    var67_60 = ((A13)var23_21.j((H30)var67_60)).a;
                    var55_51 = 50;
                    var56_52 = var55_51;
                    var48_44 = new eq2_1(var56_52);
                    var64_58 = var67_60.b((eq2_1)var48_44, (eq2_1)var48_44, (eq2_1)var48_44, (eq2_1)var48_44);
                    var24_22 &= var37_35;
                } else {
                    var64_58 = var48_44;
                }
                if (var51_47 != 0) {
                    var51_47 = 16;
                    var71_63 = var51_47;
                } else {
                    var71_63 = var11_9;
                }
                if (var35_33 != 0) {
                    var35_33 = 0;
                    var52_48 = 0.0f;
                    var72_64 = null;
                } else {
                    var35_33 = var12_10;
                }
                if (var26_24 != 0) {
                    var26_24 = 6;
                    var27_25 = var26_24;
lbl277:
                    // 2 sources

                    while (true) {
                        var32_30 = var24_22;
                        var25_23 = var71_63;
                        var51_47 = var70_62;
                        break;
                    }
                } else {
                    var27_25 = var13_11;
                    ** continue;
                }
            }
            var23_21.U();
            if (var35_33 != 0) {
                var48_44 = SwipeRefreshIndicatorKt.LargeSizes;
lbl287:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var48_44 = SwipeRefreshIndicatorKt.DefaultSizes;
            ** while (true)
            var73_65 = var48_44;
            var48_44 = O30.f;
            var74_66 = var23_21.j((H30)var48_44);
            var44_41 = var35_33;
            var72_64 = var74_66;
            var72_64 = (Vo0)var74_66;
            var52_48 = var72_64.J0(var18_16);
            var75_67 = var74_66 = var23_21.j((H30)var48_44);
            var75_67 = (Vo0)var74_66;
            var39_37 = var27_25;
            var27_25 = var73_65.getSize-D9Ej5fM();
            var76_68 = var75_67.e0(var27_25);
            var77_69 = (Vo0)var23_21.j((H30)var48_44);
            var27_25 = var77_69.J0(var25_23);
            var78_70 = var0.getIndicatorOffset();
            var50_46 = var25_23;
            var79_71 = SlingshotKt.rememberUpdatedSlingshot(var78_70, var52_48, var76_68, (b30_0)var23_21, 0);
            var24_22 = 1303400880;
            var25_23 = 3.6976794E8f;
            var23_21.u(var24_22);
            var22_20 = var23_21.v();
            var48_44 = b30$a.a;
            if (var22_20 == var48_44) {
                var24_22 = 0;
                var25_23 = 0.0f;
                var22_20 = J83.g(Float.valueOf(0.0f));
                var23_21.o(var22_20);
            }
            var22_20 = (tr1_0)var22_20;
            var2_2 = var48_44;
            var48_44 = null;
            var23_21.T(false);
            var78_70 = 3.6976912E8f;
            var23_21.u(1303400917);
            var43_40 = var0.isSwipeInProgress();
            if (var43_40 != 0) {
                var27_25 = var79_71.getOffset();
                SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$5((tr1_0)var22_20, var27_25);
                var80_72 = var2_2;
                var26_24 = 0;
                var27_25 = 0.0f;
                var77_69 = null;
            } else {
                var48_44 = var0.isRefreshing();
                var78_70 = 3.69779E8f;
                var23_21.u(1303401226);
                var43_40 = var32_30 & 14;
                var20_18 = 4;
                var57_53 = 5.6E-45f;
                if (var43_40 == var20_18) {
                    var80_72 = var2_2;
                    var81_73 = true;
                } else {
                    var80_72 = var2_2;
                    var81_73 = false;
                    var82_74 /* !! */  = null;
                }
                var83_75 = var23_21.c(var76_68);
                var81_73 |= var83_75;
                var83_75 = var23_21.b(var27_25);
                var84_76 = var23_21.v();
                if ((var81_73 |= var83_75) || var84_76 == var80_72) {
                    var81_73 = false;
                    var82_74 /* !! */  = null;
                    var2_2 = var84_76;
                    var4_4 = var76_68;
                    var84_76 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(var0, var76_68, var27_25, (tr1_0)var22_20, null);
                    var23_21.o(var84_76);
                }
                var84_76 = (Function2)var84_76;
                var26_24 = 0;
                var27_25 = 0.0f;
                var77_69 = null;
                var23_21.T(false);
                ly0_0.d((b30_0)var23_21, var48_44, (Function2)var84_76);
            }
            var23_21.T(false);
            var43_40 = (int)var0.isRefreshing();
            if (var43_40 != 0) ** GOTO lbl-1000
            var78_70 = SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$4((tr1_0)var22_20);
            var19_17 = 0x3F000000;
            var85_77 = 0.5f;
            cfr_temp_0 = var78_70 - var85_77;
            var43_40 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var43_40 > 0) lbl-1000:
            // 2 sources

            {
                var78_70 = var39_37;
            } else {
                var78_70 = (float)false;
            }
            var27_25 = var73_65.getSize-D9Ej5fM();
            var77_69 = j.h(var63_57 /* !! */ , var27_25);
            var85_77 = 3.6979693E8f;
            var23_21.u(1303401786);
            var19_17 = (int)var23_21.c(var76_68);
            var82_74 /* !! */  = var63_57 /* !! */ ;
            var53_49 = var32_30 & var34_32;
            var11_9 = var78_70;
            var43_40 = 16384;
            var78_70 = 2.2959E-41f;
            if (var53_49 == var43_40) {
                var53_49 = 1;
            } else {
                var53_49 = 0;
                var63_57 /* !! */  = null;
            }
            var53_49 |= var19_17;
            var43_40 = var32_30 & 14;
            var19_17 = 4;
            var85_77 = 5.6E-45f;
            if (var43_40 == var19_17) {
                var43_40 = 1;
                var78_70 = 1.4E-45f;
            } else {
                var43_40 = 0;
                var78_70 = 0.0f;
                var48_44 = null;
            }
            var53_49 |= var43_40;
            var43_40 = (int)var23_21.b(var52_48);
            var48_44 = var23_21.v();
            if ((var53_49 |= var43_40) != 0 || var48_44 == var80_72) {
                var2_2 = var48_44;
                var3_3 = var76_68;
                var4_4 = var51_47;
                var48_44 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1(var76_68, (boolean)var51_47, var0, var52_48, (tr1_0)var22_20);
                var23_21.o(var48_44);
            }
            var48_44 = (Function1)var48_44;
            var76_68 = 0;
            var18_16 = 0.0f;
            var23_21.T(false);
            var75_67 = a.a((LP1)var77_69, (Function1)var48_44);
            var2_2 = var22_20;
            var4_4 = var30_28;
            var6_6 = var61_56;
            var10_8 = var79_71;
            var22_20 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3((SwipeRefreshIndicatorSizes)var73_65, (boolean)var30_28, var0, var61_56, (boolean)var31_29, var52_48, var79_71);
            var52_48 = 1.19844995E30f;
            var22_20 = v10.b((b30_0)var23_21, 1903298153, (Lambda)var22_20);
            var35_33 = var32_30 >> 21 & 112 | 0x180000;
            var53_49 = var32_30 >> 12 & 896;
            var35_33 |= var53_49;
            var45_42 = 0L;
            var32_30 = 0;
            var67_60 = null;
            var78_70 = 3.4E-44f;
            var2_2 = var75_67;
            var6_6 = var45_42;
            var10_8 = var22_20;
            var12_10 = var35_33;
            var86_78 = 24;
            var13_11 = var78_70;
            jg3_0.a((LP1)var75_67, var64_58, var65_59, var45_42, null, var11_9, (u10)var22_20, (b30_0)var23_21, var35_33, var86_78);
            var53_49 = var51_47;
            var26_24 = var30_28;
            var35_33 = var31_29;
            var57_53 = var39_37;
            var43_40 = var44_41;
            var33_31 = var50_46;
            var22_20 = var82_74 /* !! */ ;
            var58_54 = var64_58;
            var40_38 = var65_59;
            var59_55 = var61_56;
        }
        var84_76 = var23_21.X();
        if (var84_76 != null) {
            var23_21 = var75_67;
            var18_16 = var1_1;
            var19_17 = var15_13;
            var34_32 = var16_14;
            var36_34 = var17_15;
            var75_67 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4(var0, var1_1, (LP1)var22_20, (boolean)var35_33, (boolean)var53_49, (boolean)var26_24, var40_38, var59_55, var58_54, var33_31, (boolean)var43_40, var57_53, var15_13, var16_14, var17_15);
            var23_21 = var84_76;
            var84_76.d = var75_67;
        }
    }

    private static final float SwipeRefreshIndicator__UAkqwU$lambda$4(tr1_0 tr1_02) {
        return ((Number)tr1_02.getValue()).floatValue();
    }

    private static final void SwipeRefreshIndicator__UAkqwU$lambda$5(tr1_0 tr1_02, float f5) {
        Float f6 = Float.valueOf(f5);
        tr1_02.setValue(f6);
    }

    public static final /* synthetic */ float access$SwipeRefreshIndicator__UAkqwU$lambda$4(tr1_0 tr1_02) {
        return SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$4(tr1_02);
    }

    public static final /* synthetic */ void access$SwipeRefreshIndicator__UAkqwU$lambda$5(tr1_0 tr1_02, float f5) {
        SwipeRefreshIndicatorKt.SwipeRefreshIndicator__UAkqwU$lambda$5(tr1_02, f5);
    }
}

