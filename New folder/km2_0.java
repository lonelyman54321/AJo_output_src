/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from KM2
 */
public final class km2_0 {
    public static final void a(String string2, b30_0 object, int n3) {
        Object object2 = "htmlText";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object = object.g(-1336617372);
        int n4 = n3 & 0xE;
        int n7 = 2;
        int n8 = 4;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object3;
            Object object4;
            boolean bl2;
            ((j30_0)object).K(-1183931608);
            n7 = 0;
            Object object5 = null;
            n10 = 1;
            if ((n4 &= 0xE) == n8) {
                bl2 = true;
            } else {
                bl2 = false;
                object4 = null;
            }
            Object object6 = ((j30_0)object).v();
            b30$a$a b30$a$a = b30$a.a;
            if (bl2 || object6 == b30$a$a) {
                bl2 = false;
                object4 = null;
                object6 = new hm2_1(string2, 0);
                ((j30_0)object).o(object6);
            }
            object4 = object6;
            object4 = (Function1)object6;
            ((j30_0)object).T(false);
            int n14 = -1183925648;
            ((j30_0)object).K(n14);
            if (n4 != n8) {
                n10 = 0;
                object3 = null;
            }
            object2 = ((j30_0)object).v();
            if (n10 != 0 || object2 == b30$a$a) {
                object2 = new im2_0(string2);
                ((j30_0)object).o(object2);
            }
            object3 = object2;
            object3 = (Function1)object2;
            ((j30_0)object).T(false);
            int n15 = 2;
            n8 = 0;
            n14 = 0;
            object6 = null;
            object5 = object4;
            object4 = object;
            b.a((Function1)object5, null, (Function1)object3, (b30_0)object, 0, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new jm2_0(string2, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void b(qz1_2 var0, SelectedOrderItem var1_1, b30_0 var2_2, int var3_3) {
        block40: {
            block44: {
                block45: {
                    block39: {
                        block48: {
                            block47: {
                                block46: {
                                    block42: {
                                        block43: {
                                            block41: {
                                                var4_4 = var0;
                                                var5_5 = var1_1;
                                                var6_6 = "viewModel";
                                                Intrinsics.checkNotNullParameter(var0, (String)var6_6);
                                                var7_7 = -1274705795 != 0;
                                                var8_8 = -1.2436244E-7f;
                                                var9_9 = var2_2;
                                                var10_10 = var2_2.g((int)var7_7);
                                                var11_11 = null;
                                                if (var1_1 != null && (var6_6 = var1_1.getCartEntry()) != null && (var6_6 = var6_6.getReturnExchangeCtaMessageList()) != null) {
                                                    var12_12 = var7_7 = (boolean)var6_6.isExchangeable();
                                                } else {
                                                    var12_12 = false;
                                                    var13_13 = null;
                                                }
                                                var14_14 = var5_5 != null && (var6_6 = var1_1.getCartEntry()) != null && (var6_6 = var6_6.getReturnExchangeCtaMessageList()) != null ? (var7_7 = (boolean)var6_6.isReturnable()) : false;
                                                if (var5_5 != null && (var6_6 = var1_1.getCartEntry()) != null && (var6_6 = var6_6.getReturnExchangeCtaMessageList()) != null && (var6_6 = var6_6.getIsReturnWindowExpired()) != null) {
                                                    var7_7 = var6_6.booleanValue();
                                                } else {
                                                    var7_7 = false;
                                                    var8_8 = 0.0f;
                                                    var6_6 = null;
                                                }
                                                var16_16 = var5_5 != null && (var15_15 = var1_1.getCartEntry()) != null && (var15_15 = var15_15.getReturnExchangeCtaMessageList()) != null ? (var15_15 = var15_15.getTopHeader()) : null;
                                                if (var5_5 != null && (var15_15 = var1_1.getCartEntry()) != null && (var15_15 = var15_15.getReturnExchangeCtaMessageList()) != null) {
                                                    var17_17 = var15_15 = var15_15.getTopLinkURL();
                                                } else {
                                                    var18_18 = false;
                                                    var17_17 = null;
                                                }
                                                if (var5_5 != null && (var15_15 = var1_1.getCartEntry()) != null && (var15_15 = var15_15.getReturnExchangeCtaMessageList()) != null) {
                                                    var19_19 = var15_15 = var15_15.getExchangeMessage();
                                                } else {
                                                    var20_20 = false;
                                                    var19_19 = null;
                                                }
                                                if (var5_5 != null && (var15_15 = var1_1.getCartEntry()) != null && (var15_15 = var15_15.getReturnExchangeCtaMessageList()) != null) {
                                                    var21_21 = var15_15 = var15_15.getReturnMessage();
                                                } else {
                                                    var22_22 = false;
                                                    var21_21 = null;
                                                }
                                                var23_23 = var7_7 == false && (var14_14 != false || var12_12 != false);
                                                var15_15 = AndroidCompositionLocals_androidKt.b;
                                                var15_15 = var10_10.j((H30)var15_15);
                                                var24_24 = var15_15 instanceof Activity;
                                                if (var24_24 != 0) {
                                                    var25_25 = var15_15 = (Activity)var15_15;
                                                } else {
                                                    var26_26 = 0;
                                                    var25_25 = null;
                                                }
                                                var27_27 = LP1$a.b;
                                                var28_28 = 1.0f;
                                                var15_15 = j.c((LP1)var27_27, var28_28);
                                                var29_29 = 16;
                                                var30_30 = var29_29;
                                                var31_31 = 5;
                                                var32_32 = var31_31;
                                                var15_15 = h.h((LP1)var15_15, var30_30, var30_30, var30_30, var32_32);
                                                var33_33 = zp.c;
                                                var34_34 = Nc$a.m;
                                                var33_33 = oZ.a((zp$l)var33_33, (Gx$a)var34_34, var10_10, 0);
                                                var35_35 = var10_10.P;
                                                var11_11 = var10_10.P();
                                                var15_15 = a30_0.c(var10_10, (LP1)var15_15);
                                                N20.W.getClass();
                                                var36_36 = var25_25;
                                                var25_25 = N20$a.b;
                                                var4_4 = var10_10.a;
                                                var37_37 = var19_19;
                                                var20_20 = var4_4 instanceof mp;
                                                if (!var20_20) break block40;
                                                var10_10.A();
                                                var20_20 = var10_10.O;
                                                if (var20_20) {
                                                    var10_10.C((Function0)var25_25);
                                                } else {
                                                    var10_10.n();
                                                }
                                                var19_19 = N20$a.e;
                                                Ow3.a(var10_10, var33_33, (Function2)var19_19);
                                                var33_33 = N20$a.d;
                                                Ow3.a(var10_10, var11_11, (Function2)var33_33);
                                                var11_11 = N20$a.f;
                                                var38_38 = var21_21;
                                                var22_22 = var10_10.O;
                                                if (var22_22) break block41;
                                                var21_21 = var10_10.v();
                                                var39_39 = var17_17;
                                                var17_17 = var35_35;
                                                var22_22 = Intrinsics.areEqual(var21_21, var17_17);
                                                if (var22_22) break block42;
                                                break block43;
                                            }
                                            var39_39 = var17_17;
                                        }
                                        rk_0.a(var35_35, var10_10, var35_35, (N20$a$a)var11_11);
                                    }
                                    var17_17 = N20$a.c;
                                    Ow3.a(var10_10, var15_15, (Function2)var17_17);
                                    var40_40 = 1065353216 != 0;
                                    var41_41 = 1.0f;
                                    var34_34 = j.c((LP1)var27_27, var41_41);
                                    var15_15 = zp.f;
                                    var21_21 = Nc$a.k;
                                    var42_42 = var27_27;
                                    var43_43 = 7.6E-44f;
                                    var15_15 = iQ2.a((zp$e)var15_15, (Gx$b)var21_21, var10_10, 54);
                                    var24_24 = var10_10.P;
                                    var44_44 = var21_21;
                                    var21_21 = var10_10.P();
                                    var34_34 = a30_0.c(var10_10, (LP1)var34_34);
                                    var45_45 = var4_4 instanceof mp;
                                    if (!var45_45) break block44;
                                    var10_10.A();
                                    var45_45 = var10_10.O;
                                    if (var45_45) {
                                        var10_10.C((Function0)var25_25);
                                    } else {
                                        var10_10.n();
                                    }
                                    Ow3.a(var10_10, var15_15, (Function2)var19_19);
                                    Ow3.a(var10_10, var21_21, (Function2)var33_33);
                                    var45_45 = var10_10.O;
                                    if (var45_45 || !(var45_45 = Intrinsics.areEqual(var5_5 = var10_10.v(), var15_15 = Integer.valueOf(var24_24)))) {
                                        rk_0.a(var24_24, var10_10, var24_24, (N20$a$a)var11_11);
                                    }
                                    Ow3.a(var10_10, var34_34, (Function2)var17_17);
                                    var45_45 = 14 != 0;
                                    var46_46 = Em3.f((int)var45_45);
                                    var5_5 = y20_0.a;
                                    var48_47 = tv0_0.o;
                                    var21_21 = var33_33;
                                    var24_24 = 1065353216;
                                    var43_43 = 1.0f;
                                    var49_48 = var43_43;
                                    var51_49 = 0.0;
                                    var35_35 = (int)(var49_48 == var51_49 ? 0 : (var49_48 > var51_49 ? 1 : -1));
                                    if (var35_35 <= 0) break block45;
                                    var41_41 = f.c(var43_43, 3.4028235E38f);
                                    var35_35 = 1;
                                    var28_28 = 1.4E-45f;
                                    var33_33 = new LayoutWeightElement(var41_41, (boolean)var35_35);
                                    var53_50 = 1772550;
                                    var15_15 = "Return & Exchange";
                                    var54_51 = 0L;
                                    var56_52 = var42_42;
                                    var57_53 = var54_51;
                                    var59_54 = false;
                                    var60_55 = var25_25;
                                    var26_26 = 0;
                                    var25_25 = null;
                                    var61_56 = 0L;
                                    var42_42 = null;
                                    var63_57 = 0L;
                                    var65_58 = 130964;
                                    var66_59 = var21_21;
                                    var22_22 = true;
                                    var67_60 = var19_19;
                                    var68_61 = var37_37;
                                    var69_62 = var38_38;
                                    var70_63 = var44_44;
                                    var71_64 = var46_46;
                                    var73_65 = var17_17;
                                    var17_17 = var48_47;
                                    var37_37 = var10_10;
                                    Ll3.b((String)var15_15, (LP1)var33_33, var54_51, var46_46, null, var48_47, (RU0)var5_5, var61_56, null, null, var63_57, 0, false, 0, 0, null, null, var10_10, var53_50, 0, var65_58);
                                    var40_40 = 1983511698 != 0;
                                    var41_41 = 9.430641E32f;
                                    var10_10.K((int)var40_40);
                                    var18_18 = 12 != 0;
                                    if (var16_16 == null || !(var40_40 = var16_16.length())) ** GOTO lbl-1000
                                    var15_15 = var39_39;
                                    if (var39_39 == null || (var31_31 = var39_39.length()) == 0) lbl-1000:
                                    // 2 sources

                                    {
                                        var74_66 = var30_30;
                                        var9_9 = var56_52;
                                    } else {
                                        var57_53 = xx_1.h;
                                        var71_64 = Em3.f((int)var18_18);
                                        var17_17 = var36_36;
                                        var33_33 = new yj0_1(1, var36_36, var39_39);
                                        var40_40 = 7 != 0;
                                        var41_41 = 9.8E-45f;
                                        var74_66 = var30_30;
                                        var9_9 = var56_52;
                                        var18_18 = false;
                                        var33_33 = d.b(var56_52, false, null, (Function0)var33_33, (int)var40_40);
                                        var53_50 = 1772928;
                                        var26_26 = 0;
                                        var25_25 = null;
                                        var61_56 = 0L;
                                        var42_42 = null;
                                        var63_57 = 0L;
                                        var65_58 = 130960;
                                        var15_15 = var16_16;
                                        var17_17 = var48_47;
                                        Ll3.b((String)var16_16, (LP1)var33_33, var57_53, var71_64, null, var48_47, (RU0)var5_5, var61_56, null, null, var63_57, 0, false, 0, 0, null, null, var10_10, var53_50, 0, var65_58);
                                    }
                                    var5_5 = null;
                                    var10_10.T(false);
                                    var45_45 = true;
                                    var10_10.T(var45_45);
                                    var40_40 = 10 != 0;
                                    var41_41 = (float)var40_40;
                                    var15_15 = j.d((LP1)var9_9, var41_41);
                                    var31_31 = 1065353216;
                                    var32_32 = 1.0f;
                                    var15_15 = j.c((LP1)var15_15, var32_32);
                                    Q93.b(var10_10, (LP1)var15_15);
                                    if (!var14_14 && !var12_12) {
                                        var7_7 = R$drawable.order_return_not_available_icon;
                                        var40_40 = R$drawable.ic_exchange_not_available;
lbl205:
                                        // 4 sources

                                        while (true) {
                                            var18_18 = var40_40;
                                            break block39;
                                            break;
                                        }
                                    }
                                    if (!var14_14 || var12_12) break block46;
                                    var7_7 = var7_7 != false ? R$drawable.ic_return_expired : R$drawable.order_return_available_icon;
                                    var40_40 = R$drawable.ic_exchange_not_available;
                                    ** GOTO lbl205
                                }
                                if (var14_14 || !var12_12) break block47;
                                var40_40 = R$drawable.order_return_not_available_icon;
                                var7_7 = var7_7 != false ? R$drawable.ic_exchange_expired : R$drawable.ic_exchange_available;
                                var18_18 = var7_7;
                                var7_7 = var40_40;
                                break block39;
                            }
                            if (!var7_7) break block48;
                            var7_7 = R$drawable.ic_return_expired;
                            var40_40 = R$drawable.ic_exchange_expired;
                            ** GOTO lbl205
                        }
                        var7_7 = R$drawable.order_return_available_icon;
                        var40_40 = R$drawable.ic_exchange_available;
                        ** while (true)
                    }
                    var40_40 = 1459516701 != 0;
                    var41_41 = 1.39889476E14f;
                    var10_10.K((int)var40_40);
                    var35_35 = 48;
                    var28_28 = 6.7E-44f;
                    var19_19 = var69_62;
                    if (var69_62 == null || !(var40_40 = var69_62.length())) {
                        var75_67 = var14_14;
                        var59_54 = var12_12;
                        var76_68 = var18_18;
                        var5_5 = var60_55;
                        var77_69 = var66_59;
                        var78_70 = var67_60;
                        var6_6 = var70_63;
                        var13_13 = var73_65;
                        var14_14 = 8 != 0;
                    } else {
                        var15_15 = zp.a;
                        var27_27 = var70_63;
                        var15_15 = iQ2.a((zp$e)var15_15, (Gx$b)var70_63, var10_10, var35_35);
                        var31_31 = var10_10.P;
                        var34_34 = var10_10.P();
                        var25_25 = a30_0.c(var10_10, (LP1)var9_9);
                        var45_45 = var4_4 instanceof mp;
                        if (var45_45) {
                            var10_10.A();
                            var45_45 = var10_10.O;
                            if (var45_45) {
                                var5_5 = var60_55;
                                var10_10.C((Function0)var60_55);
lbl259:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var5_5 = var60_55;
                            var10_10.n();
                            ** continue;
                            var79_71 = var18_18;
                            var17_17 = var67_60;
                            Ow3.a(var10_10, var15_15, (Function2)var67_60);
                            var15_15 = var66_59;
                            Ow3.a(var10_10, var34_34, (Function2)var66_59);
                            var35_35 = (int)var10_10.O;
                            if (var35_35 == 0 && (var35_35 = (int)Intrinsics.areEqual(var34_34 = var10_10.v(), var21_21 = Integer.valueOf(var31_31))) != 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            rk_0.a(var31_31, var10_10, var31_31, (N20$a$a)var11_11);
                            ** continue;
                            var21_21 = var73_65;
                            Ow3.a(var10_10, var25_25, (Function2)var73_65);
                            var31_31 = 0;
                            var6_6 = km2.a((int)var7_7, var10_10, 0);
                            var32_32 = 20;
                            var34_34 = j.h((LP1)var9_9, var32_32);
                            var80_72 = OX.l;
                            var82_73 = 3512;
                            var77_69 = var15_15;
                            var15_15 = var6_6;
                            var6_6 = var27_27;
                            var27_27 = var34_34;
                            var83_74 = var80_72;
                            var25_25 = var73_65;
                            var21_21 = var10_10;
                            var75_67 = var14_14;
                            var59_54 = var12_12;
                            var13_13 = var73_65;
                            var14_14 = 8 != 0;
                            var26_26 = var82_73;
                            var78_70 = var17_17;
                            var76_68 = var79_71;
                            var18_18 = false;
                            var17_17 = null;
                            rc1_0.b((im2)var15_15, "Return Status", (LP1)var34_34, var80_72, var10_10, var82_73, 0);
                            var41_41 = (float)var14_14;
                            var15_15 = j.k((LP1)var9_9, var41_41);
                            Q93.b(var10_10, (LP1)var15_15);
                            var33_33 = var19_19;
                            km2_0.a((String)var19_19, var10_10, 0);
                            var10_10.T(true);
                            var40_40 = 12 != 0;
                            var41_41 = (float)var40_40;
                            var15_15 = j.d((LP1)var9_9, var41_41);
                            Q93.b(var10_10, (LP1)var15_15);
                        } else {
                            s20.a();
                            throw null;
                        }
                    }
                    var40_40 = false;
                    var41_41 = 0.0f;
                    var15_15 = null;
                    var10_10.T(false);
                    var40_40 = 1459535045 != 0;
                    var41_41 = 1.4004336E14f;
                    var10_10.K((int)var40_40);
                    var17_17 = var68_61;
                    if (var68_61 == null || !(var40_40 = var68_61.length())) {
                        var11_11 = null;
                    } else {
                        var15_15 = zp.a;
                        var31_31 = 48;
                        var32_32 = 6.7E-44f;
                        var6_6 = iQ2.a((zp$e)var15_15, (Gx$b)var6_6, var10_10, var31_31);
                        var40_40 = var10_10.P;
                        var33_33 = var10_10.P();
                        var27_27 = a30_0.c(var10_10, (LP1)var9_9);
                        var85_75 = var4_4 instanceof mp;
                        if (var85_75 != 0) {
                            var10_10.A();
                            var85_75 = (int)var10_10.O;
                            if (var85_75 != 0) {
                                var10_10.C((Function0)var5_5);
lbl337:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var10_10.n();
                            ** continue;
                            var4_4 = var78_70;
                            Ow3.a(var10_10, var6_6, (Function2)var78_70);
                            var6_6 = var77_69;
                            Ow3.a(var10_10, var33_33, (Function2)var77_69);
                            var7_7 = var10_10.O;
                            if (var7_7 || !(var7_7 = (boolean)Intrinsics.areEqual(var6_6 = var10_10.v(), var4_4 = Integer.valueOf((int)var40_40)))) {
                                rk_0.a((int)var40_40, var10_10, (int)var40_40, (N20$a$a)var11_11);
                            }
                            Ow3.a(var10_10, var27_27, (Function2)var13_13);
                            var40_40 = var76_68;
                            var15_15 = km2.a((int)var76_68, var10_10, 0);
                            var8_8 = 20;
                            var27_27 = j.h((LP1)var9_9, var8_8);
                            var83_74 = OX.l;
                            var33_33 = "Exchange Status";
                            var26_26 = 3512;
                            var21_21 = var10_10;
                            var13_13 = var17_17;
                            var18_18 = false;
                            var17_17 = null;
                            rc1_0.b((im2)var15_15, (String)var33_33, (LP1)var27_27, var83_74, var10_10, var26_26, 0);
                            var8_8 = (float)var14_14;
                            var6_6 = j.k((LP1)var9_9, var8_8);
                            Q93.b(var10_10, (LP1)var6_6);
                            var11_11 = null;
                            km2_0.a((String)var13_13, var10_10, 0);
                            var7_7 = true;
                            var10_10.T(var7_7);
                            var8_8 = var74_66;
                            var6_6 = j.d((LP1)var9_9, var74_66);
                            Q93.b(var10_10, (LP1)var6_6);
                        } else {
                            s20.a();
                            throw null;
                        }
                    }
                    var10_10.T(false);
                    var7_7 = 1459552988 != 0;
                    var8_8 = 1.4019387E14f;
                    var10_10.K((int)var7_7);
                    if (var23_23) {
                        var85_75 = 72;
                        var6_6 = var0;
                        var9_9 = var1_1;
                        var14_14 = var75_67;
                        var12_12 = var59_54;
                        var45_45 = false;
                        var5_5 = null;
                        var11_11 = var10_10;
                        var15_15 = var10_10;
                        ap3_0.a(var0, var1_1, var75_67, var59_54, var10_10, var85_75);
lbl389:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var15_15 = var10_10;
                    var45_45 = false;
                    var5_5 = null;
                    ** while (true)
                    var7_7 = true;
                    var8_8 = 1.4E-45f;
                    var6_6 = fn0_2.a((j30_0)var15_15, false, var7_7);
                    if (var6_6 != null) {
                        var13_13 = var1_1;
                        var6_6.d = var9_9 = new gm2_1(var0, var1_1, var3_3);
                    }
                    return;
                }
                var6_6 = g9_0.a(1.0f, "invalid weight ", "; must be greater than zero");
                var6_6 = var6_6.toString();
                var9_9 = new IllegalArgumentException((String)var6_6);
                throw var9_9;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

