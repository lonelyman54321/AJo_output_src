/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from ut0
 */
public final class ut0_1 {
    /*
     * Unable to fully structure code
     */
    public static final void a(qz1_2 var0, String var1_1, String var2_2, String var3_3, String var4_4, ArrayList var5_5, boolean var6_6, ReturnOrderTracker var7_7, Boolean var8_8, Boolean var9_9, ReturnOrderTracker var10_10, CartEntry var11_11, b30_0 var12_12, int var13_13, int var14_14, int var15_15) {
        block58: {
            block71: {
                block57: {
                    block67: {
                        block74: {
                            block72: {
                                block73: {
                                    block69: {
                                        block70: {
                                            block55: {
                                                block62: {
                                                    block68: {
                                                        block63: {
                                                            block65: {
                                                                block66: {
                                                                    block64: {
                                                                        block60: {
                                                                            block61: {
                                                                                block59: {
                                                                                    block56: {
                                                                                        var16_16 = var4_4;
                                                                                        var17_17 = var6_6;
                                                                                        var18_18 = var13_13;
                                                                                        var19_19 = var15_15;
                                                                                        var20_20 = 128;
                                                                                        var21_21 = 1.8E-43f;
                                                                                        var22_22 = 256;
                                                                                        var23_23 = 3.59E-43f;
                                                                                        var24_24 = "viewModel";
                                                                                        var25_25 = var0;
                                                                                        Intrinsics.checkNotNullParameter(var0, (String)var24_24);
                                                                                        var26_26 = -1.02534854E30f;
                                                                                        var27_27 = var12_12;
                                                                                        var28_28 = var12_12.g(-246476473);
                                                                                        var29_29 = var15_15 & 2;
                                                                                        if (var29_29 != 0) {
                                                                                            var31_31 = var30_30 = var13_13 | 48;
                                                                                            var27_27 = var1_1;
                                                                                        } else {
                                                                                            var30_30 = var13_13 & 112;
                                                                                            if (var30_30 == 0) {
                                                                                                var27_27 = var1_1;
                                                                                                var31_31 = (int)var28_28.J(var1_1);
                                                                                                var31_31 = var31_31 != 0 ? 32 : 16;
                                                                                                var31_31 |= var18_18;
                                                                                            } else {
                                                                                                var27_27 = var1_1;
                                                                                                var31_31 = var13_13;
                                                                                            }
                                                                                        }
                                                                                        var32_32 = var19_19 & 4;
                                                                                        if (var32_32 != 0) {
                                                                                            var31_31 |= 384;
                                                                                            while (true) {
                                                                                                var33_34 = var2_2;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            if ((var34_33 = var18_18 & 896) != 0) ** continue;
                                                                                            var33_34 = var2_2;
                                                                                            var35_35 = (int)var28_28.J(var2_2);
                                                                                            var35_35 = var35_35 != 0 ? 256 : 128;
                                                                                            var31_31 |= var35_35;
                                                                                        }
                                                                                        var35_35 = var19_19 & 8;
                                                                                        if (var35_35 != 0) {
                                                                                            var31_31 |= 3072;
                                                                                            while (true) {
                                                                                                var36_37 = var3_3;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            if (var37_36 = var18_18 & 7168) ** continue;
                                                                                            var36_37 = var3_3;
                                                                                            var38_38 = var28_28.J(var3_3);
                                                                                            var38_38 = var38_38 != 0 ? 2048 : 1024;
                                                                                            var31_31 |= var38_38;
                                                                                        }
                                                                                        var39_39 = 57344;
                                                                                        var38_38 = var18_18 & var39_39;
                                                                                        if (var38_38 == 0) {
                                                                                            var38_38 = (int)var28_28.J(var16_16);
                                                                                            var38_38 = var38_38 != 0 ? 16384 : 8192;
                                                                                            var31_31 |= var38_38;
                                                                                        }
                                                                                        if ((var38_38 = var18_18 & 0x380000) == 0) {
                                                                                            var38_38 = (int)var28_28.a((boolean)var17_17);
                                                                                            var38_38 = var38_38 != 0 ? 0x100000 : 524288;
                                                                                            var31_31 |= var38_38;
                                                                                        }
                                                                                        if ((var20_20 &= var19_19) != 0) {
                                                                                            var38_38 = 0x400000;
                                                                                            var31_31 |= var38_38;
                                                                                        }
                                                                                        var40_40 = 0xE000000;
                                                                                        if ((var22_22 &= var19_19) != 0) {
                                                                                            var38_38 = 0x6000000;
                                                                                            var31_31 |= var38_38;
                                                                                            var41_41 = var8_8;
                                                                                        } else {
                                                                                            var38_38 = var18_18 & var40_40;
                                                                                            var41_41 = var8_8;
                                                                                            if (var38_38 == 0) {
                                                                                                var38_38 = (int)var28_28.J(var8_8);
                                                                                                var38_38 = var38_38 != 0 ? 0x4000000 : 0x2000000;
                                                                                                var31_31 |= var38_38;
                                                                                            }
                                                                                        }
                                                                                        var42_42 = 0x70000000;
                                                                                        var38_38 = var18_18 & var42_42;
                                                                                        var43_43 = var9_9;
                                                                                        if (var38_38 == 0) {
                                                                                            var44_44 = var28_28.J(var9_9);
                                                                                            var44_44 = var44_44 != 0 ? 0x20000000 : 0x10000000;
                                                                                            var31_31 |= var44_44;
                                                                                        }
                                                                                        var45_45 = 3233;
                                                                                        var46_46 = 4.53E-42f;
                                                                                        var30_30 = var19_19 & 3233;
                                                                                        if (var30_30 != var45_45) break block56;
                                                                                        var46_46 = 6.691058E16f;
                                                                                        var45_45 = 1533916881 & var31_31;
                                                                                        var30_30 = 306783376;
                                                                                        var47_47 = 6.3469484E-28f;
                                                                                        if (var45_45 != var30_30) break block56;
                                                                                        var45_45 = var14_14 & 91;
                                                                                        var30_30 = 18;
                                                                                        var47_47 = 2.5E-44f;
                                                                                        if (var45_45 != var30_30 || (var45_45 = (int)var28_28.h()) == 0) break block56;
                                                                                        var28_28.D();
                                                                                        var48_48 = var1_1;
                                                                                        var24_24 = var33_34;
                                                                                        var43_43 = var28_28;
                                                                                        var25_25 = var41_41;
                                                                                        var27_27 = var36_37;
                                                                                        var28_28 = var7_7;
                                                                                        break block57;
                                                                                    }
                                                                                    var43_43 = "";
                                                                                    var27_27 = var29_29 != 0 ? var43_43 : var1_1;
                                                                                    if (var32_32 != 0) {
                                                                                        var33_34 = var43_43;
                                                                                    }
                                                                                    var49_49 = var35_35 != 0 ? var43_43 : var36_37;
                                                                                    if (var20_20 != 0) {
                                                                                        var37_36 = false;
                                                                                        var36_37 = null;
                                                                                    } else {
                                                                                        var36_37 = var7_7;
                                                                                    }
                                                                                    if (var22_22 != 0) {
                                                                                        var50_50 = Boolean.FALSE;
                                                                                        var51_51 = var50_50;
                                                                                    } else {
                                                                                        var51_51 = var41_41;
                                                                                    }
                                                                                    var50_50 = LP1$a.b;
                                                                                    var48_48 = zp.a;
                                                                                    var24_24 = Nc$a.j;
                                                                                    var32_32 = 0;
                                                                                    var48_48 = iQ2.a((zp$e)var48_48, (Gx$b)var24_24, (b30_0)var28_28, 0);
                                                                                    var29_29 = var28_28.P;
                                                                                    var52_52 = var28_28.P();
                                                                                    var41_41 = a30_0.c((b30_0)var28_28, (LP1)var50_50);
                                                                                    var53_53 = N20.W;
                                                                                    var53_53.getClass();
                                                                                    var43_43 = N20$a.b;
                                                                                    var25_25 = var28_28.a;
                                                                                    var19_19 = var25_25 instanceof mp;
                                                                                    if (var19_19 == 0) break block58;
                                                                                    var28_28.A();
                                                                                    var19_19 = (int)var28_28.O;
                                                                                    if (var19_19 != 0) {
                                                                                        var28_28.C((Function0)var43_43);
                                                                                    } else {
                                                                                        var28_28.n();
                                                                                    }
                                                                                    var54_54 = N20$a.e;
                                                                                    Ow3.a((b30_0)var28_28, var48_48, (Function2)var54_54);
                                                                                    var48_48 = N20$a.d;
                                                                                    Ow3.a((b30_0)var28_28, var52_52, (Function2)var48_48);
                                                                                    var52_52 = N20$a.f;
                                                                                    var18_18 = (int)var28_28.O;
                                                                                    if (var18_18 != 0) break block59;
                                                                                    var55_55 = var28_28.v();
                                                                                    var2_2 = var33_34;
                                                                                    var33_34 = var29_29;
                                                                                    var34_33 = (int)Intrinsics.areEqual(var55_55, var33_34);
                                                                                    if (var34_33 != 0) break block60;
                                                                                    break block61;
                                                                                }
                                                                                var2_2 = var33_34;
                                                                            }
                                                                            rk_0.a(var29_29, (j30_0)var28_28, var29_29, (N20$a$a)var52_52);
                                                                        }
                                                                        var24_24 = N20$a.c;
                                                                        Ow3.a((b30_0)var28_28, var41_41, (Function2)var24_24);
                                                                        var34_33 = var27_27.hashCode();
                                                                        var41_41 = Nc$a.m;
                                                                        var55_55 = fg2_1.a;
                                                                        var56_56 = var31_31;
                                                                        var57_57 = 0x200200;
                                                                        var58_58 = 0x1C00000;
                                                                        var59_59 = 458752;
                                                                        var31_31 = -1008851410;
                                                                        if (var34_33 == var31_31) break block62;
                                                                        var31_31 = 112785;
                                                                        if (var34_33 == var31_31) break block63;
                                                                        var31_31 = 98619139;
                                                                        if (var34_33 == var31_31) break block64;
                                                                        var60_60 = var28_28;
                                                                        var61_61 = var36_37;
                                                                        var62_63 = 1;
                                                                        var36_37 = var27_27;
                                                                        break block55;
                                                                    }
                                                                    var63_64 = "green";
                                                                    var31_31 = (int)var27_27.equals(var63_64);
                                                                    if (var31_31 == 0) break block65;
                                                                    var31_31 = 1503875780;
                                                                    var28_28.K(var31_31);
                                                                    var34_33 = 1;
                                                                    var63_64 = new p0(var34_33);
                                                                    var63_64 = CY2.b((LP1)var50_50, (boolean)var34_33, (Function1)var63_64);
                                                                    var33_34 = zp.c;
                                                                    var64_65 = var27_27;
                                                                    var47_47 = 0.0f;
                                                                    var27_27 = null;
                                                                    var33_34 = oZ.a((zp$l)var33_34, (Gx$a)var41_41, (b30_0)var28_28, 0);
                                                                    var30_30 = var28_28.P;
                                                                    var41_41 = var28_28.P();
                                                                    var63_64 = a30_0.c((b30_0)var28_28, (LP1)var63_64);
                                                                    var65_66 = var25_25 instanceof mp;
                                                                    if (!var65_66) break block66;
                                                                    var28_28.A();
                                                                    var65_66 = var28_28.O;
                                                                    if (var65_66) {
                                                                        var28_28.C((Function0)var43_43);
                                                                    } else {
                                                                        var28_28.n();
                                                                    }
                                                                    Ow3.a((b30_0)var28_28, var33_34, (Function2)var54_54);
                                                                    Ow3.a((b30_0)var28_28, var41_41, (Function2)var48_48);
                                                                    var45_45 = (int)var28_28.O;
                                                                    if (var45_45 != 0 || (var45_45 = (int)Intrinsics.areEqual(var43_43 = var28_28.v(), var48_48 = Integer.valueOf(var30_30))) == 0) {
                                                                        rk_0.a(var30_30, (j30_0)var28_28, var30_30, (N20$a$a)var52_52);
                                                                    }
                                                                    Ow3.a((b30_0)var28_28, var63_64, (Function2)var24_24);
                                                                    if (var17_17 != 0) {
                                                                        var28_28.K(-1279342931);
                                                                        var43_43 = km2.a(R$drawable.ic_status_delivered_order_detail, (b30_0)var28_28, 0);
                                                                        var24_24 = new ot0_1(0);
                                                                        var66_70 = CY2.a((LP1)var50_50, (Function1)var24_24);
                                                                        var20_20 = 1;
                                                                        var21_21 = 1.4E-45f;
                                                                        var23_23 = var20_20;
                                                                        var67_71 = 14;
                                                                        var50_50 = h.i((LP1)var66_70, var23_23, 0.0f, 0.0f, 0.0f, var67_71);
                                                                        var23_23 = -7;
                                                                        var29_29 = -5;
                                                                        var26_26 = var29_29;
                                                                        var50_50 = g.c((LP1)var50_50, var23_23, var26_26);
                                                                        var22_22 = 25;
                                                                        var23_23 = var22_22;
                                                                        var50_50 = j.h((LP1)var50_50, var23_23);
                                                                        var48_48 = SP2.a;
                                                                        var50_50 = QV.a((LP1)var50_50, (i13)var48_48);
                                                                        var68_73 = OX.k;
                                                                        var66_70 = a.b((LP1)var50_50, var68_73, (i13)var55_55);
                                                                        var70_76 = false;
                                                                        var71_82 = "";
                                                                        var72_87 = null;
                                                                        var73_88 = null;
                                                                        var74_89 = 56;
                                                                        var75_94 = 120;
                                                                        var53_53 = var43_43;
                                                                        Pd1.a((im2)var43_43, var71_82, (LP1)var66_70, null, null, 0.0f, null, (b30_0)var28_28, var74_89, var75_94);
                                                                        var45_45 = 0;
                                                                        var46_46 = 0.0f;
                                                                        var43_43 = null;
                                                                        var28_28.T(false);
                                                                        var27_27 = var64_65;
                                                                        var76_99 = false;
                                                                        var41_41 = null;
                                                                        var19_19 = 1;
                                                                    } else {
                                                                        var45_45 = -1278624940;
                                                                        var46_46 = -9.393867E-8f;
                                                                        var28_28.K(var45_45);
                                                                        var43_43 = new Object();
                                                                        var48_48 = CY2.a((LP1)var50_50, (Function1)var43_43);
                                                                        var19_19 = 1;
                                                                        var26_26 = var19_19;
                                                                        var31_31 = 0;
                                                                        var63_64 = null;
                                                                        var32_32 = 0;
                                                                        var52_52 = null;
                                                                        var30_30 = 0;
                                                                        var47_47 = 0.0f;
                                                                        var34_33 = 14;
                                                                        var43_43 = h.i((LP1)var48_48, var26_26, 0.0f, 0.0f, 0.0f, var34_33);
                                                                        var21_21 = 10;
                                                                        var43_43 = j.h((LP1)var43_43, var21_21);
                                                                        var50_50 = SP2.a;
                                                                        var43_43 = QV.a((LP1)var43_43, (i13)var50_50);
                                                                        var20_20 = R$color.accent_color_2;
                                                                        var77_102 = oy_0.a((b30_0)var28_28, var20_20);
                                                                        var43_43 = a.b((LP1)var43_43, var77_102, (i13)var55_55);
                                                                        var76_100 = false;
                                                                        var41_41 = null;
                                                                        HA.a((LP1)var43_43, (b30_0)var28_28, 0);
                                                                        var28_28.T(false);
                                                                        var27_27 = var64_65;
                                                                    }
                                                                    var43_43 = ut0_1.b((ReturnOrderTracker)var36_37, (String)var27_27, (String)var16_16);
                                                                    if (var36_37 != null) {
                                                                        var50_50 = var36_37.isActive();
                                                                        var48_48 = Boolean.TRUE;
                                                                        var29_29 = var20_20 = (int)Intrinsics.areEqual(var50_50, var48_48);
                                                                    } else {
                                                                        var29_29 = 0;
                                                                        var26_26 = 0.0f;
                                                                        var24_24 = null;
                                                                    }
                                                                    var25_25 = (boolean)var6_6;
                                                                    var20_20 = var56_56 >> 9 & 112 | var57_57;
                                                                    var22_22 = var56_56 << 6;
                                                                    var31_31 = var22_22 & var39_39;
                                                                    var20_20 |= var31_31;
                                                                    var31_31 = var22_22 & var59_59;
                                                                    var20_20 |= var31_31;
                                                                    var31_31 = var56_56 >> 3 & var58_58;
                                                                    var20_20 |= var31_31;
                                                                    var22_22 = var56_56 & var42_42;
                                                                    var18_18 = (var20_20 |= (var22_22 &= var40_40)) | var22_22;
                                                                    var35_35 = 72;
                                                                    var50_50 = var4_4;
                                                                    var48_48 = var5_5;
                                                                    var33_34 = var27_27;
                                                                    var27_27 = var2_2;
                                                                    var63_64 = var49_49;
                                                                    var52_52 = var36_37;
                                                                    var79_106 = var33_34;
                                                                    var33_34 = var51_51;
                                                                    var3_3 = var28_28;
                                                                    var28_28 = var25_25;
                                                                    var25_25 = var9_9;
                                                                    var41_41 = var10_10;
                                                                    var54_54 = var36_37;
                                                                    var36_37 = var11_11;
                                                                    var61_62 = var52_52;
                                                                    var54_54 = var3_3;
                                                                    var17_17 = var35_35;
                                                                    ht0_1.f((String)var43_43, var4_4, var5_5, (boolean)var29_29, (String)var2_2, (String)var49_49, (ReturnOrderTracker)var52_52, var51_51, (Boolean)var28_28, var9_9, var10_10, var11_11, (b30_0)var3_3, var18_18, var35_35);
                                                                    var60_60 = var3_3;
                                                                    var37_36 = true;
                                                                    var3_3.T(var37_36);
                                                                    var80_108 = false;
                                                                    var28_28 = null;
                                                                    var3_3.T(false);
                                                                    var43_43 = Unit.a;
                                                                    var73_88 = var2_2;
                                                                    var43_43 = var3_3;
                                                                    var72_87 = var79_106;
                                                                    var66_70 = var52_52;
                                                                    var62_63 = 1;
                                                                    break block67;
                                                                }
                                                                s20.a();
                                                                throw null;
                                                            }
                                                            var60_60 = var28_28;
                                                            var61_61 = var36_37;
                                                            var36_37 = var27_27;
lbl334:
                                                            // 2 sources

                                                            while (true) {
                                                                var62_63 = 1;
                                                                break block55;
                                                                break;
                                                            }
                                                        }
                                                        var79_107 = var27_27;
                                                        var60_60 = var28_28;
                                                        var61_61 = var36_37;
                                                        var80_109 = 0;
                                                        var28_28 = null;
                                                        var37_36 = true;
                                                        var27_27 = "red";
                                                        var33_34 = var79_107;
                                                        var30_30 = (int)var79_107.equals(var27_27);
                                                        if (var30_30 == 0) {
                                                            var36_37 = var79_107;
                                                            ** continue;
                                                        }
                                                        var30_30 = 1508907235;
                                                        var47_47 = 8.4476697E15f;
                                                        var60_60.K(var30_30);
                                                        var27_27 = new q0((int)var37_36);
                                                        var27_27 = CY2.b((LP1)var50_50, var37_36, (Function1)var27_27);
                                                        var63_64 = oZ.a(zp.c, (Gx$a)var41_41, (b30_0)var60_60, 0);
                                                        var76_101 = var60_60.P;
                                                        var36_37 = var60_60.P();
                                                        var27_27 = a30_0.c((b30_0)var60_60, (LP1)var27_27);
                                                        var65_67 = var25_25 instanceof mp;
                                                        if (!var65_67) break block68;
                                                        var60_60.A();
                                                        var65_67 = var60_60.O;
                                                        if (var65_67) {
                                                            var60_60.C((Function0)var43_43);
                                                        } else {
                                                            var60_60.n();
                                                        }
                                                        Ow3.a((b30_0)var60_60, var63_64, (Function2)var54_54);
                                                        Ow3.a((b30_0)var60_60, var36_37, (Function2)var48_48);
                                                        var45_45 = (int)var60_60.O;
                                                        if (var45_45 != 0 || (var45_45 = (int)Intrinsics.areEqual(var43_43 = var60_60.v(), var48_48 = Integer.valueOf(var76_101))) == 0) {
                                                            rk_0.a(var76_101, (j30_0)var60_60, var76_101, (N20$a$a)var52_52);
                                                        }
                                                        Ow3.a((b30_0)var60_60, var27_27, (Function2)var24_24);
                                                        if (var6_6 != 0) {
                                                            var46_46 = -1.2997971E-7f;
                                                            var60_60.K(-1274310515);
                                                            var45_45 = R$drawable.ic_status_cancelled_order_detail;
                                                            var43_43 = km2.a(var45_45, (b30_0)var60_60, 0);
                                                            var29_29 = 1;
                                                            var48_48 = new r0(var29_29);
                                                            var66_70 = CY2.a((LP1)var50_50, (Function1)var48_48);
                                                            var21_21 = var29_29;
                                                            var67_72 = 14;
                                                            var50_50 = h.i((LP1)var66_70, var21_21, 0.0f, 0.0f, 0.0f, var67_72);
                                                            var23_23 = -7;
                                                            var29_29 = -5;
                                                            var26_26 = var29_29;
                                                            var50_50 = g.c((LP1)var50_50, var23_23, var26_26);
                                                            var22_22 = 25;
                                                            var23_23 = var22_22;
                                                            var50_50 = j.h((LP1)var50_50, var23_23);
                                                            var48_48 = SP2.a;
                                                            var50_50 = QV.a((LP1)var50_50, (i13)var48_48);
                                                            var68_74 = OX.k;
                                                            var66_70 = a.b((LP1)var50_50, var68_74, (i13)var55_55);
                                                            var70_77 = false;
                                                            var71_83 = "";
                                                            var72_87 = null;
                                                            var73_88 = null;
                                                            var74_90 = 56;
                                                            var75_95 = 120;
                                                            var53_53 = var43_43;
                                                            Pd1.a((im2)var43_43, var71_83, (LP1)var66_70, null, null, 0.0f, null, (b30_0)var60_60, var74_90, var75_95);
                                                            var60_60.T(false);
                                                            var55_55 = var61_61;
                                                            var37_36 = true;
                                                        } else {
                                                            var45_45 = -1273592524;
                                                            var60_60.K(var45_45);
                                                            var43_43 = new Object();
                                                            var53_53 = CY2.a((LP1)var50_50, (Function1)var43_43);
                                                            var37_36 = true;
                                                            var46_46 = (float)var37_36;
                                                            var72_87 = null;
                                                            var73_88 = null;
                                                            var44_44 = 0;
                                                            var66_70 = null;
                                                            var70_78 = 14;
                                                            var43_43 = h.i((LP1)var53_53, var46_46, 0.0f, 0.0f, 0.0f, var70_78);
                                                            var21_21 = 10;
                                                            var43_43 = j.h((LP1)var43_43, var21_21);
                                                            var50_50 = SP2.a;
                                                            var43_43 = QV.a((LP1)var43_43, (i13)var50_50);
                                                            var20_20 = R$color.accent_color_1;
                                                            var77_103 = oy_0.a((b30_0)var60_60, var20_20);
                                                            var43_43 = a.b((LP1)var43_43, var77_103, (i13)var55_55);
                                                            HA.a((LP1)var43_43, (b30_0)var60_60, 0);
                                                            var60_60.T(false);
                                                            var55_55 = var61_61;
                                                        }
                                                        var43_43 = ut0_1.b((ReturnOrderTracker)var55_55, (String)var33_34, (String)var16_16);
                                                        if (var55_55 != null) {
                                                            var50_50 = var55_55.isActive();
                                                            var48_48 = Boolean.TRUE;
                                                            var29_29 = var20_20 = (int)Intrinsics.areEqual(var50_50, var48_48);
                                                        } else {
                                                            var29_29 = 0;
                                                            var26_26 = 0.0f;
                                                            var24_24 = null;
                                                        }
                                                        var25_25 = (boolean)var6_6;
                                                        var20_20 = var56_56 >> 9 & 112 | var57_57;
                                                        var22_22 = var56_56 << 6;
                                                        var30_30 = var22_22 & var39_39;
                                                        var20_20 |= var30_30;
                                                        var30_30 = var22_22 & var59_59;
                                                        var20_20 |= var30_30;
                                                        var30_30 = var56_56 >> 3 & var58_58;
                                                        var20_20 |= var30_30;
                                                        var22_22 = var56_56 & var42_42;
                                                        var35_35 = (var20_20 |= (var22_22 &= var40_40)) | var22_22;
                                                        var38_38 = 72;
                                                        var50_50 = var4_4;
                                                        var48_48 = var5_5;
                                                        var27_27 = var2_2;
                                                        var63_64 = var49_49;
                                                        var52_52 = var55_55;
                                                        var54_54 = var33_34;
                                                        var33_34 = var51_51;
                                                        var76_101 = 0;
                                                        var28_28 = var25_25;
                                                        var25_25 = var9_9;
                                                        var16_16 = null;
                                                        var41_41 = var10_10;
                                                        var62_63 = 1;
                                                        var36_37 = var11_11;
                                                        var81_112 = var54_54;
                                                        var54_54 = var60_60;
                                                        var61_61 = var55_55;
                                                        var18_18 = var35_35;
                                                        var17_17 = var38_38;
                                                        ht0_1.f((String)var43_43, var4_4, var5_5, (boolean)var29_29, (String)var2_2, (String)var49_49, (ReturnOrderTracker)var55_55, var51_51, (Boolean)var28_28, var9_9, var10_10, var11_11, (b30_0)var60_60, var35_35, var38_38);
                                                        var60_60.T((boolean)var62_63);
                                                        var45_45 = 0;
                                                        var46_46 = 0.0f;
                                                        var60_60.T(false);
                                                        var43_43 = Unit.a;
                                                        var73_88 = var2_2;
                                                        var43_43 = var60_60;
                                                        var66_70 = var55_55;
                                                        var72_87 = var81_112;
                                                        break block67;
                                                    }
                                                    s20.a();
                                                    throw null;
                                                }
                                                var81_113 = var27_27;
                                                var60_60 = var28_28;
                                                var61_61 = var36_37;
                                                var62_63 = 1;
                                                var27_27 = "orange";
                                                var36_37 = var81_113;
                                                var30_30 = (int)var81_113.equals(var27_27);
                                                if (var30_30 != 0) break block69;
                                            }
                                            var30_30 = 1510940308;
                                            var47_47 = 1.0071136E16f;
                                            var60_60.K(var30_30);
                                            var27_27 = new Object();
                                            var27_27 = CY2.b((LP1)var50_50, (boolean)var62_63, (Function1)var27_27);
                                            var63_64 = zp.c;
                                            var33_34 = null;
                                            var63_64 = oZ.a((zp$l)var63_64, (Gx$a)var41_41, (b30_0)var60_60, 0);
                                            var34_33 = var60_60.F();
                                            var28_28 = var60_60.P();
                                            var27_27 = a30_0.c((b30_0)var60_60, (LP1)var27_27);
                                            var65_68 = var25_25 instanceof mp;
                                            if (!var65_68) break block70;
                                            var60_60.A();
                                            var65_68 = var60_60.O;
                                            if (var65_68) {
                                                var60_60.C((Function0)var43_43);
                                            } else {
                                                var60_60.n();
                                            }
                                            Ow3.a((b30_0)var60_60, var63_64, (Function2)var54_54);
                                            Ow3.a((b30_0)var60_60, var28_28, (Function2)var48_48);
                                            var45_45 = (int)var60_60.O;
                                            if (var45_45 != 0 || (var45_45 = (int)Intrinsics.areEqual(var43_43 = var60_60.v(), var48_48 = Integer.valueOf(var34_33))) == 0) {
                                                rk_0.a(var34_33, (j30_0)var60_60, var34_33, (N20$a$a)var52_52);
                                            }
                                            Ow3.a((b30_0)var60_60, var27_27, (Function2)var24_24);
                                            var45_45 = R$drawable.return_refund_inactive_circle;
                                            var48_48 = null;
                                            var53_53 = km2.a(var45_45, (b30_0)var60_60, 0);
                                            var43_43 = new mt0_1(0);
                                            var24_24 = CY2.a((LP1)var50_50, (Function1)var43_43);
                                            var47_47 = var62_63;
                                            var32_32 = 0;
                                            var52_52 = null;
                                            var34_33 = 0;
                                            var33_34 = null;
                                            var31_31 = 0;
                                            var63_64 = null;
                                            var80_109 = 14;
                                            var43_43 = h.i((LP1)var24_24, var47_47, 0.0f, 0.0f, 0.0f, var80_109);
                                            var21_21 = 10;
                                            var43_43 = j.k(j.d((LP1)var43_43, var21_21), var21_21);
                                            var77_104 = OX.k;
                                            var66_70 = a.b((LP1)var43_43, var77_104, (i13)var55_55);
                                            var70_79 = false;
                                            var74_91 = 56;
                                            var75_96 = 120;
                                            Pd1.a((im2)var53_53, "", (LP1)var66_70, null, null, 0.0f, null, (b30_0)var60_60, var74_91, var75_96);
                                            var82_114 = (boolean)var6_6;
                                            var45_45 = var56_56 << 6;
                                            var20_20 = var45_45 & var39_39;
                                            var23_23 = 2.943834E-39f;
                                            var20_20 |= 2100790;
                                            var22_22 = var45_45 & var59_59;
                                            var20_20 |= var22_22;
                                            var22_22 = var56_56 >> 3 & var58_58;
                                            var45_45 = var45_45 & var40_40 | (var20_20 |= var22_22);
                                            var20_20 = var56_56 & var42_42;
                                            var83_115 = var45_45 | var20_20;
                                            var71_84 = "";
                                            var53_53 = "";
                                            var42_42 = 72;
                                            var66_70 = var5_5;
                                            var73_88 = var2_2;
                                            ht0_1.f((String)var53_53, var71_84, var5_5, false, (String)var2_2, (String)var49_49, (ReturnOrderTracker)var61_61, var51_51, var82_114, var9_9, var10_10, var11_11, (b30_0)var60_60, var83_115, var42_42);
                                            var60_60.T((boolean)var62_63);
                                            var30_30 = 0;
                                            var47_47 = 0.0f;
                                            var27_27 = null;
                                            var60_60.T(false);
                                            var43_43 = Unit.a;
                                            var72_87 = var36_37;
                                            var43_43 = var60_60;
                                            var66_70 = var61_61;
                                            break block67;
                                        }
                                        s20.a();
                                        throw null;
                                    }
                                    var47_47 = 0.0f;
                                    var27_27 = null;
                                    var31_31 = 1505958639;
                                    var28_28.K(var31_31);
                                    var63_64 = new qt0_1(0);
                                    var63_64 = CY2.b((LP1)var50_50, (boolean)var62_63, (Function1)var63_64);
                                    var33_34 = oZ.a(zp.c, (Gx$a)var41_41, (b30_0)var28_28, 0);
                                    var30_30 = var28_28.P;
                                    var28_28 = var28_28.P();
                                    var63_64 = a30_0.c((b30_0)var60_60, (LP1)var63_64);
                                    var65_69 = var25_25 instanceof mp;
                                    if (!var65_69) break block71;
                                    var60_60.A();
                                    var65_69 = var60_60.O;
                                    if (var65_69) {
                                        var60_60.C((Function0)var43_43);
                                    } else {
                                        var60_60.n();
                                    }
                                    Ow3.a((b30_0)var60_60, var33_34, (Function2)var54_54);
                                    Ow3.a((b30_0)var60_60, var28_28, (Function2)var48_48);
                                    var45_45 = (int)var60_60.O;
                                    if (var45_45 != 0 || (var45_45 = (int)Intrinsics.areEqual(var43_43 = var60_60.v(), var48_48 = Integer.valueOf(var30_30))) == 0) {
                                        rk_0.a(var30_30, (j30_0)var60_60, var30_30, (N20$a$a)var52_52);
                                    }
                                    Ow3.a((b30_0)var60_60, var63_64, (Function2)var24_24);
                                    var54_54 = var2_2;
                                    if (var6_6 == 0) break block72;
                                    if (var2_2 != null && (var45_45 = (int)var2_2.equalsIgnoreCase((String)(var43_43 = "CANCELLED"))) == var62_63) break block73;
                                    if (var54_54 != null) {
                                        var43_43 = StringsKt.m0((CharSequence)var54_54).toString();
                                    } else {
                                        var45_45 = 0;
                                        var46_46 = 0.0f;
                                        var43_43 = null;
                                    }
                                    var48_48 = "DELIVERY FAILED";
                                    var45_45 = (int)b.i((String)var43_43, (String)var48_48, (boolean)var62_63);
                                    if (var45_45 == 0) break block72;
                                }
                                var60_60.K(-1277143729);
                                var43_43 = km2.a(R$drawable.ic_status_cancelled_order_detail, (b30_0)var60_60, 0);
                                var48_48 = new Object();
                                var24_24 = CY2.a((LP1)var50_50, (Function1)var48_48);
                                var47_47 = var62_63;
                                var32_32 = 0;
                                var52_52 = null;
                                var34_33 = 0;
                                var33_34 = null;
                                var31_31 = 0;
                                var63_64 = null;
                                var80_110 = 14;
                                var50_50 = h.i((LP1)var24_24, var47_47, 0.0f, 0.0f, 0.0f, var80_110);
                                var23_23 = -7;
                                var29_29 = -5;
                                var26_26 = var29_29;
                                var50_50 = g.c((LP1)var50_50, var23_23, var26_26);
                                var22_22 = 25;
                                var23_23 = var22_22;
                                var50_50 = j.h((LP1)var50_50, var23_23);
                                var48_48 = SP2.a;
                                var50_50 = QV.a((LP1)var50_50, (i13)var48_48);
                                var68_75 = OX.k;
                                var66_70 = a.b((LP1)var50_50, var68_75, (i13)var55_55);
                                var70_80 = false;
                                var71_85 = "";
                                var72_87 = null;
                                var73_88 = null;
                                var74_92 = 56;
                                var75_97 = 120;
                                var53_53 = var43_43;
                                Pd1.a((im2)var43_43, var71_85, (LP1)var66_70, null, null, 0.0f, null, (b30_0)var60_60, var74_92, var75_97);
                                var45_45 = 0;
                                var46_46 = 0.0f;
                                var43_43 = null;
                                var60_60.T(false);
lbl644:
                                // 3 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var45_45 = 0;
                            var46_46 = 0.0f;
                            var43_43 = null;
                            if (var6_6 == 0) break block74;
                            var23_23 = -1.0972177E-7f;
                            var60_60.K(-1276403666);
                            var22_22 = R$drawable.ic_status_exchange_order_detail;
                            var48_48 = km2.a(var22_22, (b30_0)var60_60, 0);
                            var43_43 = new Object();
                            var24_24 = CY2.a((LP1)var50_50, (Function1)var43_43);
                            var47_47 = var62_63;
                            var32_32 = 0;
                            var52_52 = null;
                            var34_33 = 0;
                            var33_34 = null;
                            var31_31 = 0;
                            var63_64 = null;
                            var80_111 = 14;
                            var43_43 = h.i((LP1)var24_24, var47_47, 0.0f, 0.0f, 0.0f, var80_111);
                            var21_21 = -7;
                            var29_29 = -5;
                            var26_26 = var29_29;
                            var43_43 = g.c((LP1)var43_43, var21_21, var26_26);
                            var20_20 = 25;
                            var21_21 = var20_20;
                            var43_43 = j.h((LP1)var43_43, var21_21);
                            var50_50 = SP2.a;
                            var43_43 = QV.a((LP1)var43_43, (i13)var50_50);
                            var84_116 = OX.k;
                            var66_70 = a.b((LP1)var43_43, var84_116, (i13)var55_55);
                            var70_81 = false;
                            var71_86 = "";
                            var72_87 = null;
                            var73_88 = null;
                            var74_93 = 56;
                            var75_98 = 120;
                            var53_53 = var48_48;
                            Pd1.a((im2)var48_48, var71_86, (LP1)var66_70, null, null, 0.0f, null, (b30_0)var60_60, var74_93, var75_98);
                            var45_45 = 0;
                            var46_46 = 0.0f;
                            var43_43 = null;
                            var60_60.T(false);
                            ** GOTO lbl644
                        }
                        var45_45 = -1275686481;
                        var46_46 = -1.14817674E-7f;
                        var60_60.K(var45_45);
                        var43_43 = new Object();
                        var48_48 = CY2.a((LP1)var50_50, (Function1)var43_43);
                        var26_26 = var62_63;
                        var31_31 = 0;
                        var63_64 = null;
                        var32_32 = 0;
                        var52_52 = null;
                        var30_30 = 0;
                        var47_47 = 0.0f;
                        var27_27 = null;
                        var34_33 = 14;
                        var43_43 = h.i((LP1)var48_48, var26_26, 0.0f, 0.0f, 0.0f, var34_33);
                        var21_21 = 10;
                        var43_43 = j.h((LP1)var43_43, var21_21);
                        var50_50 = SP2.a;
                        var43_43 = QV.a((LP1)var43_43, (i13)var50_50);
                        var20_20 = R$color.new_accent_color_43;
                        var77_105 = oy_0.a((b30_0)var60_60, var20_20);
                        var43_43 = a.b((LP1)var43_43, var77_105, (i13)var55_55);
                        var20_20 = 0;
                        var21_21 = 0.0f;
                        var50_50 = null;
                        HA.a((LP1)var43_43, (b30_0)var60_60, 0);
                        var60_60.T(false);
                        ** while (true)
                        var55_55 = var4_4;
                        var41_41 = var61_61;
                        var65_69 = false;
                        var25_25 = null;
                        var43_43 = ut0_1.b((ReturnOrderTracker)var61_61, (String)var36_37, var4_4);
                        if (var61_61 != null) {
                            var50_50 = var61_61.isActive();
                            var48_48 = Boolean.TRUE;
                            var29_29 = var20_20 = (int)Intrinsics.areEqual(var50_50, var48_48);
                        } else {
                            var29_29 = 0;
                            var26_26 = 0.0f;
                            var24_24 = null;
                        }
                        var28_28 = (boolean)var6_6;
                        var20_20 = var56_56 >> 9 & 112 | var57_57;
                        var22_22 = var56_56 << 6;
                        var30_30 = var22_22 & var39_39;
                        var20_20 |= var30_30;
                        var30_30 = var22_22 & var59_59;
                        var20_20 |= var30_30;
                        var30_30 = var56_56 >> 3 & var58_58;
                        var20_20 |= var30_30;
                        var22_22 = var56_56 & var42_42;
                        var35_35 = (var20_20 |= (var22_22 &= var40_40)) | var22_22;
                        var38_38 = 72;
                        var50_50 = var4_4;
                        var48_48 = var5_5;
                        var27_27 = var54_54;
                        var63_64 = var49_49;
                        var52_52 = var41_41;
                        var33_34 = var51_51;
                        var25_25 = var9_9;
                        var66_70 = var41_41;
                        var41_41 = var10_10;
                        var72_87 = var36_37;
                        var36_37 = var11_11;
                        var73_88 = var54_54;
                        var54_54 = var60_60;
                        var18_18 = var35_35;
                        var17_17 = var38_38;
                        ht0_1.f((String)var43_43, var4_4, var5_5, (boolean)var29_29, (String)var27_27, (String)var49_49, (ReturnOrderTracker)var52_52, var51_51, (Boolean)var28_28, var9_9, var10_10, var11_11, (b30_0)var60_60, var35_35, var38_38);
                        var43_43 = var60_60;
                        var60_60.T((boolean)var62_63);
                        var20_20 = 0;
                        var21_21 = 0.0f;
                        var60_60.T(false);
                        var50_50 = Unit.a;
                    }
                    var43_43.T((boolean)var62_63);
                    var28_28 = var66_70;
                    var48_48 = var72_87;
                    var24_24 = var73_88;
                    var27_27 = var49_49;
                    var25_25 = var51_51;
                }
                var16_16 = var43_43.X();
                if (var16_16 != null) {
                    var43_43 = var60_60;
                    var50_50 = var0;
                    var63_64 = var4_4;
                    var52_52 = var5_5;
                    var34_33 = var6_6;
                    var41_41 = var9_9;
                    var36_37 = var10_10;
                    var54_54 = var11_11;
                    var18_18 = var13_13;
                    var17_17 = var14_14;
                    var62_63 = var15_15;
                    var50_50 = var60_60 = new nt0_1(var0, (String)var48_48, (String)var24_24, (String)var27_27, var4_4, var5_5, (boolean)var6_6, (ReturnOrderTracker)var28_28, (Boolean)var25_25, var9_9, var10_10, var11_11, var13_13, var14_14, var15_15);
                    var43_43 = var16_16;
                    var16_16.d = var60_60;
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }

    public static final String b(ReturnOrderTracker serializable, String string2, String string3) {
        if (serializable != null) {
            int n3;
            Object object = ((ReturnOrderTracker)serializable).isActive();
            Object object2 = Boolean.TRUE;
            boolean bl2 = Intrinsics.areEqual(object, object2);
            object2 = "orange";
            if (bl2) {
                int n4;
                string3 = ((ReturnOrderTracker)serializable).getActiveBar();
                if (string3 != null && (n4 = string3.length()) != 0) {
                    boolean bl3;
                    boolean bl4;
                    string3 = ((ReturnOrderTracker)serializable).getActiveBar();
                    n4 = (int)(b.i(string3, (String)(object = "RED"), bl4 = true) ? 1 : 0);
                    if (n4 != 0) {
                        return "red";
                    }
                    string3 = ((ReturnOrderTracker)serializable).getActiveBar();
                    n4 = (int)(b.i(string3, (String)(object = "ORANGE"), bl4) ? 1 : 0);
                    if (n4 == 0 && ((serializable = ((ReturnOrderTracker)serializable).getSubStatus()) == null || (bl3 = serializable.isEmpty()))) {
                        return string2;
                    }
                    return object2;
                }
            } else if (string3 != null && (n3 = string3.length()) != 0) {
                return object2;
            }
        }
        return string2;
    }
}

