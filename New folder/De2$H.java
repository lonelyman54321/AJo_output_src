/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  org.json.JSONArray
 */
import android.app.Activity;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.OrderDetailFunctionalRepo;
import com.ril.ajio.services.data.Order.CancelledRefundDetailInfo;
import com.ril.ajio.services.data.Order.RefundDetailsObj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class De2$H
implements gx0_2 {
    public final /* synthetic */ CancelledRefundDetailInfo a;
    public final /* synthetic */ qz1_2 b;

    public De2$H(CancelledRefundDetailInfo cancelledRefundDetailInfo, qz1_2 qz1_22) {
        this.a = cancelledRefundDetailInfo;
        this.b = qz1_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        block32: {
            block39: {
                block31: {
                    block34: {
                        block33: {
                            block30: {
                                var4_4 = this;
                                var5_5 = null;
                                var6_6 = var1_1;
                                var6_6 = (PA)var1_1;
                                var7_7 = var2_2;
                                var7_7 = (b30_0)var2_2;
                                var8_8 = var3_3;
                                var8_8 = (Number)var3_3;
                                var9_9 = var8_8.intValue();
                                var10_10 = "$this$BoxWithConstraints";
                                Intrinsics.checkNotNullParameter(var6_6, (String)var10_10);
                                var11_11 = var9_9 & 81;
                                var12_12 = 16;
                                if (var11_11 != var12_12 || (var11_11 = (int)var7_7.h()) == 0) break block30;
                                var7_7.D();
                                break block31;
                            }
                            var6_6 = LP1$a.b;
                            var8_8 = zp.c;
                            var10_10 = Nc$a.m;
                            var8_8 = oZ.a((zp$l)var8_8, (Gx$a)var10_10, (b30_0)var7_7, 0);
                            var13_13 = var7_7.F();
                            var14_14 = var7_7.m();
                            var15_15 = a30_0.c((b30_0)var7_7, (LP1)var6_6);
                            N20.W.getClass();
                            var16_16 = N20$a.b;
                            var17_17 = var7_7.i();
                            var18_18 = var17_17 instanceof mp;
                            var19_19 = 0.0f;
                            var20_20 = null;
                            if (var18_18 == 0) break block32;
                            var7_7.A();
                            var18_18 = var7_7.e();
                            if (var18_18 != 0) {
                                var7_7.C((Function0)var16_16);
                            } else {
                                var7_7.n();
                            }
                            var16_16 = N20$a.e;
                            Ow3.a((b30_0)var7_7, var8_8, (Function2)var16_16);
                            var8_8 = N20$a.d;
                            Ow3.a((b30_0)var7_7, var14_14, (Function2)var8_8);
                            var8_8 = N20$a.f;
                            var21_21 = var7_7.e();
                            if (var21_21 != 0 || (var21_21 = Intrinsics.areEqual(var14_14 = var7_7.v(), var16_16 = Integer.valueOf(var13_13))) == 0) {
                                re0_0.a(var13_13, (b30_0)var7_7, var13_13, (N20$a$a)var8_8);
                            }
                            var8_8 = N20$a.c;
                            Ow3.a((b30_0)var7_7, var15_15, (Function2)var8_8);
                            var16_16 = var4_4.a;
                            if (var16_16 != null) {
                                var8_8 = var16_16.getTotalRefund();
                            } else {
                                var9_9 = 0;
                                var8_8 = null;
                                var22_22 = 0.0f;
                            }
                            var13_13 = 1713878733;
                            var23_23 = 1.9800182E23f;
                            var7_7.K(var13_13);
                            var21_21 = 12;
                            if (var8_8 == null) {
                                var24_24 = var16_16;
                                var2_2 = var7_7;
                                var25_25 = 12;
                            } else {
                                var26_26 = var8_8.doubleValue();
                                var22_22 = (float)var26_26;
                                var8_8 = qz2_0.p(var22_22);
                                var8_8 = kp1_0.c("Total Refund \u20b9", (String)var8_8);
                                var13_13 = 14;
                                var28_27 = Em3.f(var13_13);
                                var30_28 = tv0_0.o;
                                var31_29 = xx_1.e;
                                var23_23 = (float)false;
                                var33_30 = var21_21;
                                var10_10 = h.h((LP1)var6_6, var23_23, var23_23, var23_23, var33_30);
                                var34_31 = 131024;
                                var18_18 = 0;
                                var35_32 = 0.0f;
                                var17_17 = null;
                                var36_33 = null;
                                var37_34 = 0L;
                                var39_35 = 0;
                                var33_30 = 0.0f;
                                var15_15 = null;
                                var20_20 = null;
                                var19_19 = 0.0f;
                                var40_36 = 0L;
                                var42_37 = 0;
                                var43_38 = 0;
                                var44_39 = null;
                                var45_40 = null;
                                var46_41 = 200112;
                                var25_25 = 12;
                                var47_42 = var31_29;
                                var24_24 = var16_16;
                                var49_43 = var28_27;
                                var2_2 = var7_7;
                                var7_7 = var30_28;
                                var30_28 = var2_2;
                                Ll3.b((String)var8_8, (LP1)var10_10, var31_29, var28_27, null, (tv0_0)var7_7, null, var37_34, null, null, var40_36, 0, false, 0, 0, null, null, (b30_0)var2_2, var46_41, 0, var34_31);
                                var8_8 = Unit.a;
                            }
                            var2_2.E();
                            if (var24_24 != null) {
                                var8_8 = var24_24.getCanceledRefundMessage();
                            } else {
                                var9_9 = 0;
                                var22_22 = 0.0f;
                                var8_8 = null;
                            }
                            var13_13 = 1713891753;
                            var23_23 = 1.9823637E23f;
                            var7_7 = var2_2;
                            var2_2.K(var13_13);
                            var12_12 = 8;
                            if (var8_8 != null) {
                                var28_27 = Em3.f(var25_25);
                                var30_28 = tv0_0.m;
                                var47_42 = xx_1.e;
                                var23_23 = (float)false;
                                var51_44 = var12_12;
                                var35_32 = 12;
                                var10_10 = h.h((LP1)var6_6, var23_23, var51_44, var23_23, var35_32);
                                var34_31 = 131024;
                                var18_18 = 0;
                                var35_32 = 0.0f;
                                var17_17 = null;
                                var36_33 = null;
                                var37_34 = 0L;
                                var52_45 = 0;
                                var51_44 = 0.0f;
                                var16_16 = null;
                                var25_25 = 12;
                                var20_20 = null;
                                var19_19 = 0.0f;
                                var40_36 = 0L;
                                var42_37 = 0;
                                var43_38 = 0;
                                var44_39 = null;
                                var45_40 = null;
                                var46_41 = 200112;
                                var49_43 = var28_27;
                                var7_7 = var30_28;
                                var30_28 = var2_2;
                                Ll3.b((String)var8_8, (LP1)var10_10, var47_42, var28_27, null, (tv0_0)var7_7, null, var37_34, null, null, var40_36, 0, false, 0, 0, null, null, (b30_0)var2_2, var46_41, 0, var34_31);
                                var8_8 = Unit.a;
                            }
                            var2_2.E();
                            var49_43 = Em3.f(var25_25);
                            var7_7 = tv0_0.o;
                            var47_42 = xx_1.e;
                            var22_22 = (float)false;
                            var13_13 = 8;
                            var23_23 = 1.1E-44f;
                            var19_19 = var13_13;
                            var53_46 = 12;
                            var10_10 = h.h((LP1)var6_6, var22_22, var19_19, var22_22, var53_46);
                            var34_31 = 131024;
                            var8_8 = "Refund Credit Mode";
                            var18_18 = 0;
                            var35_32 = 0.0f;
                            var17_17 = null;
                            var36_33 = null;
                            var54_47 = var53_46;
                            var37_34 = 0L;
                            var55_48 = 0;
                            var56_49 = 12;
                            var57_50 = var19_19;
                            var20_20 = null;
                            var19_19 = 0.0f;
                            var40_36 = 0L;
                            var42_37 = 0;
                            var43_38 = 0;
                            var44_39 = null;
                            var45_40 = null;
                            var46_41 = 200118;
                            var30_28 = var2_2;
                            Ll3.b((String)var8_8, (LP1)var10_10, var47_42, var49_43, null, (tv0_0)var7_7, null, var37_34, null, null, var40_36, 0, false, 0, 0, null, null, (b30_0)var2_2, var46_41, 0, var34_31);
                            if (var24_24 != null) {
                                var20_20 = var24_24.getRefundDetailsObj();
                            } else {
                                var19_19 = 0.0f;
                                var20_20 = null;
                            }
                            var9_9 = 1713911801;
                            var22_22 = 1.9859752E23f;
                            var36_33 = var2_2;
                            var2_2.K(var9_9);
                            var8_8 = "\u20b9";
                            if (var20_20 != null) break block33;
                            var5_5 = var8_8;
                            break block34;
                        }
                        var13_13 = 1713912589;
                        var23_23 = 1.9861172E23f;
                        var2_2.K(var13_13);
                        var44_39 = var20_20.iterator();
                        while ((var13_13 = (int)var44_39.hasNext()) != 0) {
                            block36: {
                                block38: {
                                    block37: {
                                        block35: {
                                            var10_10 = (RefundDetailsObj)var44_39.next();
                                            var14_14 = var10_10.getMop();
                                            var39_35 = 1713915543;
                                            var33_30 = 1.9866493E23f;
                                            var36_33.K(var39_35);
                                            if (var14_14 != null) break block35;
                                            var5_5 = var8_8;
                                            var2_2 = var36_33;
                                            break block36;
                                        }
                                        var15_15 = OrderDetailFunctionalRepo.INSTANCE;
                                        var58_51 = var15_15.getDisplayNameForMop((String)var14_14);
                                        var20_20 = var15_15.getDisplayIconForMop((String)var14_14);
                                        var59_52 = var15_15.getDisplayIconDescForMop((String)var14_14);
                                        var10_10 = var10_10.getAmount();
                                        var21_21 = 409366957;
                                        var36_33.K(var21_21);
                                        if (var10_10 != null) break block37;
                                        var5_5 = var8_8;
                                        var2_2 = var36_33;
                                        break block38;
                                    }
                                    if (var20_20 == null) ** GOTO lbl-1000
                                    var14_14 = R$drawable.ic_ajio_cash;
                                    var21_21 = (int)var20_20.equals(var14_14);
                                    var39_35 = 1;
                                    var33_30 = 1.4E-45f;
                                    if (var21_21 == var39_35) {
                                        var36_33.K(-1296882235);
                                        var60_53 = var10_10.doubleValue();
                                        var23_23 = (float)var60_53;
                                        var10_10 = qz2_0.l(Float.valueOf(var23_23));
                                        var10_10 = kp1_0.c((String)var8_8, (String)var10_10);
                                        var21_21 = R$string.acc_icon_ajio_cash_icon;
                                        var59_52 = nk_0.f((b30_0)var36_33, var21_21);
                                        var43_38 = 3900;
                                        var47_42 = 0L;
                                        var12_12 = 0;
                                        var52_45 = 0;
                                        var51_44 = 0.0f;
                                        var16_16 = null;
                                        var62_54 = 0L;
                                        var55_48 = 0;
                                        var45_40 = var20_20;
                                        var20_20 = null;
                                        var19_19 = 0.0f;
                                        var42_37 = 0;
                                        var5_5 = var8_8;
                                        var8_8 = var58_51;
                                        var2_2 = var36_33;
                                        var36_33 = var45_40;
                                        var58_51 = var2_2;
                                        de2_0.t((String)var8_8, (String)var10_10, var47_42, false, false, var62_54, (Integer)var45_40, var59_52, null, false, null, null, (b30_0)var2_2, 0, 0, var43_38);
                                        var2_2.E();
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var5_5 = var8_8;
                                        var2_2 = var36_33;
                                        var45_40 = var20_20;
                                        var9_9 = -1296482490;
                                        var36_33.K(var9_9);
                                        var26_26 = var10_10.doubleValue();
                                        var22_22 = (float)var26_26;
                                        var8_8 = qz2_0.l(Float.valueOf(var22_22));
                                        var10_10 = kp1_0.c((String)var5_5, (String)var8_8);
                                        var43_38 = 3900;
                                        var47_42 = 0L;
                                        var12_12 = 0;
                                        var52_45 = 0;
                                        var51_44 = 0.0f;
                                        var16_16 = null;
                                        var62_54 = 0L;
                                        var19_19 = 0.0f;
                                        var20_20 = null;
                                        var55_48 = 0;
                                        var42_37 = 0;
                                        var8_8 = var58_51;
                                        var36_33 = var45_40;
                                        var58_51 = var2_2;
                                        de2_0.t((String)var8_8, (String)var10_10, var47_42, false, false, var62_54, (Integer)var45_40, var59_52, null, false, null, null, (b30_0)var2_2, 0, 0, var43_38);
                                        var2_2.E();
                                    }
                                    var8_8 = Unit.a;
                                }
                                var2_2.E();
                            }
                            var2_2.E();
                            var36_33 = var2_2;
                            var8_8 = var5_5;
                            var5_5 = null;
                        }
                        var5_5 = var8_8;
                        var2_2 = var36_33;
                        var36_33.E();
                        var8_8 = Unit.a;
                    }
                    var2_2.E();
                    if (var24_24 != null) {
                        var20_20 = var24_24.getTotalRefund();
                    } else {
                        var19_19 = 0.0f;
                        var20_20 = null;
                    }
                    var8_8 = qz2_0.k((Double)var20_20);
                    var5_5 = kp1_0.c((String)var5_5, (String)var8_8);
                    var64_55 = xx_1.g;
                    var26_26 = 0.5;
                    var66_56 = (float)var26_26;
                    var36_33 = var6_6;
                    var19_19 = var57_50;
                    var8_8 = h.i((LP1)var6_6, 0.0f, var54_47, 0.0f, var57_50, 5);
                    var33_30 = var66_56;
                    var16_16 = var2_2;
                    var67_57 = 8;
                    var66_56 = 1.1E-44f;
                    Rr0.a((LP1)var8_8, var64_55, var33_30, 0.0f, (b30_0)var2_2, 438, var67_57);
                    var9_9 = R$string.total;
                    var17_17 = var2_2;
                    var8_8 = nk_0.f((b30_0)var2_2, var9_9);
                    var68_58 = xx_1.e;
                    var43_38 = 4032;
                    var52_45 = 1;
                    var51_44 = 1.4E-45f;
                    var20_20 = null;
                    var42_37 = 224640;
                    var10_10 = var5_5;
                    var47_42 = var68_58;
                    var5_5 = var2_2;
                    var62_54 = var68_58;
                    var58_51 = var2_2;
                    de2_0.t((String)var8_8, (String)var10_10, var68_58, true, (boolean)var52_45, var68_58, null, null, null, false, null, null, (b30_0)var2_2, var42_37, 0, var43_38);
                    var9_9 = 16;
                    var22_22 = 2.2E-44f;
                    var19_19 = var9_9;
                    var55_48 = 5;
                    var53_46 = 0.0f;
                    var59_52 = null;
                    var8_8 = h.i((LP1)var6_6, 0.0f, var54_47, 0.0f, var19_19, var55_48);
                    var12_12 = 0;
                    var18_18 = 438;
                    var35_32 = 6.14E-43f;
                    var67_57 = 8;
                    var66_56 = 1.1E-44f;
                    Rr0.a((LP1)var8_8, var64_55, var33_30, 0.0f, (b30_0)var2_2, var18_18, var67_57);
                    var8_8 = AndroidCompositionLocals_androidKt.b;
                    var8_8 = var2_2.j((H30)var8_8);
                    var13_13 = var8_8 instanceof Activity;
                    if (var13_13 != 0) {
                        var20_20 = var8_8;
                        var7_7 = var20_20 = (Activity)var8_8;
                    } else {
                        var67_57 = 0;
                        var66_56 = 0.0f;
                        var7_7 = null;
                    }
                    var9_9 = 1065353216;
                    var22_22 = 1.0f;
                    var8_8 = j.c((LP1)var6_6, var22_22);
                    var10_10 = zp.f;
                    var14_14 = Nc$a.j;
                    var12_12 = 6;
                    var10_10 = iQ2.a((zp$e)var10_10, (Gx$b)var14_14, (b30_0)var5_5, var12_12);
                    var21_21 = var5_5.F();
                    var15_15 = var5_5.m();
                    var8_8 = a30_0.c((b30_0)var5_5, (LP1)var8_8);
                    N20.W.getClass();
                    var16_16 = N20$a.b;
                    var17_17 = var5_5.i();
                    var18_18 = var17_17 instanceof mp;
                    if (var18_18 == 0) break block39;
                    var5_5.A();
                    var18_18 = (int)var5_5.e();
                    if (var18_18 != 0) {
                        var5_5.C((Function0)var16_16);
                    } else {
                        var5_5.n();
                    }
                    var16_16 = N20$a.e;
                    Ow3.a((b30_0)var5_5, var10_10, (Function2)var16_16);
                    var10_10 = N20$a.d;
                    Ow3.a((b30_0)var5_5, var15_15, (Function2)var10_10);
                    var10_10 = N20$a.f;
                    var39_35 = (int)var5_5.e();
                    if (var39_35 != 0 || (var39_35 = (int)Intrinsics.areEqual(var15_15 = var5_5.v(), var16_16 = Integer.valueOf(var21_21))) == 0) {
                        re0_0.a(var21_21, (b30_0)var5_5, var21_21, (N20$a$a)var10_10);
                    }
                    var10_10 = N20$a.c;
                    Ow3.a((b30_0)var5_5, var8_8, (Function2)var10_10);
                    var9_9 = 409427056;
                    var22_22 = 2.990272E-24f;
                    var5_5.K(var9_9);
                    if (var24_24 != null) {
                        var20_20 = var24_24.getRefundDetailsObj();
                    } else {
                        var19_19 = 0.0f;
                        var20_20 = null;
                    }
                    var8_8 = var4_4.b;
                    var8_8.getClass();
                    var52_45 = 7;
                    var51_44 = 9.8E-45f;
                    if (var20_20 != null) {
                        var8_8 = h40_0.a;
                        var8_8 = z40_0.Companion;
                        var8_8 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var8_8).a.d("refund_mop_list").optJSONArray("ajio_cash");
                        var10_10 = var20_20.iterator();
                        while ((var21_21 = (int)var10_10.hasNext()) != 0) {
                            var14_14 = ((RefundDetailsObj)var10_10.next()).getMop();
                            if (var14_14 == null || (var21_21 = (int)mz3_0.x((String)var14_14, (JSONArray)var8_8)) == 0) continue;
                            var9_9 = R$string.transfer_ajio_cash_bank;
                            var8_8 = nk_0.f((b30_0)var5_5, var9_9);
                            var70_59 = Em3.f(var56_49);
                            var47_42 = xx_1.h;
                            var53_46 = 0.0f;
                            var59_52 = null;
                            var36_33 = var6_6;
                            var10_10 = h.i((LP1)var6_6, 0.0f, 0.0f, var57_50, 0.0f, 11);
                            var17_17 = new af2_1((Activity)var7_7);
                            var10_10 = d.b((LP1)var10_10, false, null, (Function0)var17_17, var52_45);
                            var30_28 = tv0_0.o;
                            var34_31 = 131024;
                            var18_18 = 0;
                            var35_32 = 0.0f;
                            var17_17 = null;
                            var36_33 = null;
                            var37_34 = 0L;
                            var55_48 = 0;
                            var20_20 = null;
                            var19_19 = 0.0f;
                            var40_36 = 0L;
                            var42_37 = 0;
                            var43_38 = 0;
                            var44_39 = null;
                            var45_40 = null;
                            var46_41 = 200064;
                            var49_43 = var70_59;
                            var72_60 = var7_7;
                            var7_7 = var30_28;
                            var30_28 = var5_5;
                            Ll3.b((String)var8_8, (LP1)var10_10, var47_42, var70_59, null, (tv0_0)var7_7, null, var37_34, null, null, var40_36, 0, false, 0, 0, null, null, (b30_0)var5_5, var46_41, 0, var34_31);
                            break;
                        }
                    } else {
                        var72_60 = var7_7;
                    }
                    var5_5.E();
                    var9_9 = R$string.refund_policy;
                    var8_8 = nk_0.f((b30_0)var5_5, var9_9);
                    var49_43 = Em3.f(var56_49);
                    var47_42 = xx_1.h;
                    var53_46 = 0.0f;
                    var59_52 = null;
                    var55_48 = 11;
                    var19_19 = 0.0f;
                    var36_33 = var6_6;
                    var6_6 = h.i((LP1)var6_6, 0.0f, 0.0f, var57_50, 0.0f, var55_48);
                    var10_10 = j.c;
                    var6_6 = var6_6.then((LP1)var10_10);
                    var20_20 = var72_60;
                    var10_10 = new bf2_1(var72_60, 0);
                    var67_57 = 0;
                    var66_56 = 0.0f;
                    var10_10 = d.b((LP1)var6_6, false, null, (Function0)var10_10, 7);
                    var7_7 = tv0_0.o;
                    var11_11 = 6;
                    var20_20 = new Cj3(var11_11);
                    var34_31 = 130512;
                    var18_18 = 0;
                    var35_32 = 0.0f;
                    var17_17 = null;
                    var36_33 = null;
                    var37_34 = 0L;
                    var40_36 = 0L;
                    var42_37 = 0;
                    var43_38 = 0;
                    var44_39 = null;
                    var45_40 = null;
                    var46_41 = 200064;
                    var30_28 = var5_5;
                    Ll3.b((String)var8_8, (LP1)var10_10, var47_42, var49_43, null, (tv0_0)var7_7, null, var37_34, null, (Cj3)var20_20, var40_36, 0, false, 0, 0, null, null, (b30_0)var5_5, var46_41, 0, var34_31);
                    var5_5.p();
                    var5_5.p();
                }
                return Unit.a;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

