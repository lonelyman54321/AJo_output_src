/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from Jc2
 */
public final class jc2_1
implements gx0_2 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ CartEntry c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ SelectedOrderItem e;
    public final /* synthetic */ Function0 f;

    public jc2_1(Ref$IntRef ref$IntRef, Product product, CartEntry cartEntry, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, ad2_1 ad2_12) {
        this.a = ref$IntRef;
        this.b = product;
        this.c = cartEntry;
        this.d = qz1_22;
        this.e = selectedOrderItem;
        this.f = ad2_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        block28: {
            block27: {
                block26: {
                    var4_4 = this;
                    var5_5 = var1_1;
                    var5_5 = (PA)var1_1;
                    var6_6 = var2_2;
                    var6_6 = (b30_0)var2_2;
                    var7_7 = var3_3;
                    var7_7 = (Number)var3_3;
                    var8_8 = var7_7.intValue();
                    var9_9 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(var5_5, (String)var9_9);
                    var10_10 = var8_8 & 81;
                    var11_11 = 16;
                    if (var10_10 != var11_11 || (var10_10 = (int)var6_6.h()) == 0) break block26;
                    var6_6.D();
                    break block27;
                }
                var5_5 = LP1$a.b;
                var7_7 = zp.c;
                var9_9 = Nc$a.m;
                var12_12 = 0;
                var13_13 = 0.0f;
                var7_7 = oZ.a((zp$l)var7_7, (Gx$a)var9_9, (b30_0)var6_6, 0);
                var14_14 = var6_6.F();
                var15_15 = var6_6.m();
                var16_16 = a30_0.c((b30_0)var6_6, (LP1)var5_5);
                N20.W.getClass();
                var17_17 = N20$a.b;
                var18_18 = var6_6.i();
                var19_19 = var18_18 instanceof mp;
                var20_20 = 0;
                var21_21 = null;
                if (!var19_19) break block28;
                var6_6.A();
                var19_19 = var6_6.e();
                if (var19_19) {
                    var6_6.C((Function0)var17_17);
                } else {
                    var6_6.n();
                }
                var17_17 = N20$a.e;
                Ow3.a((b30_0)var6_6, var7_7, (Function2)var17_17);
                var7_7 = N20$a.d;
                Ow3.a((b30_0)var6_6, var15_15, (Function2)var7_7);
                var7_7 = N20$a.f;
                var22_22 = var6_6.e();
                if (var22_22 || !(var22_22 = Intrinsics.areEqual(var15_15 = var6_6.v(), var17_17 = Integer.valueOf(var14_14)))) {
                    re0_0.a(var14_14, (b30_0)var6_6, var14_14, (N20$a$a)var7_7);
                }
                var7_7 = N20$a.c;
                Ow3.a((b30_0)var6_6, var16_16, (Function2)var7_7);
                var8_8 = R$string.product_total;
                var7_7 = nk_0.f((b30_0)var6_6, var8_8);
                var23_23 = Em3.f(var11_11);
                var25_24 = tv0_0.o;
                var26_25 = xx_1.e;
                var28_26 = 8;
                var18_18 = var5_5;
                var22_22 = false;
                var29_27 = 0.0f;
                var20_20 = 7;
                var9_9 = h.i((LP1)var5_5, 0.0f, 0.0f, 0.0f, var28_26, var20_20);
                var30_28 = var26_25;
                var1_1 = var6_6;
                var6_6 = var25_24;
                var25_24 = var1_1;
                Ll3.b((String)var7_7, (LP1)var9_9, var26_25, var23_23, null, (tv0_0)var6_6, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (b30_0)var1_1, 200112, 0, 131024);
                var6_6 = var4_4.a;
                var8_8 = var6_6.element;
                var32_29 = var4_4.b;
                var9_9 = var32_29.getName();
                var15_15 = new StringBuilder();
                var15_15.append(var8_8);
                var15_15.append(" x ");
                var15_15.append((String)var9_9);
                var7_7 = var15_15.toString();
                var23_23 = Em3.f(12);
                var25_24 = tv0_0.m;
                var30_28 = xx_1.v;
                var33_30 = 3.4E-44f;
                var28_26 = var13_13 = (float)24;
                var9_9 = h.i((LP1)var5_5, 0.0f, 0.0f, 0.0f, var13_13, 7);
                var34_31 = 131024;
                var35_32 = 0;
                var36_33 = 0L;
                var38_34 = 0L;
                var40_35 = 200112;
                var41_36 = var32_29;
                var42_37 = var13_13;
                var43_38 = var6_6;
                var6_6 = var25_24;
                var25_24 = var1_1;
                Ll3.b((String)var7_7, (LP1)var9_9, var30_28, var23_23, null, (tv0_0)var6_6, null, var36_33, null, null, var38_34, 0, false, 0, 0, null, null, (b30_0)var1_1, var40_35, 0, var34_31);
                var8_8 = R$string.original_price;
                var17_17 = var1_1;
                var7_7 = nk_0.f((b30_0)var1_1, var8_8);
                var6_6 = var43_38;
                var14_14 = var43_38.element;
                var9_9 = var14_14;
                var15_15 = var4_4.c;
                var16_16 = var32_29;
                var9_9 = BN2.g((CartEntry)var15_15, (Product)var32_29, (Integer)var9_9);
                var44_39 = xx_1.A;
                var46_40 = 4056;
                var11_11 = 0;
                var32_29 = null;
                var12_12 = 0;
                var13_13 = 0.0f;
                var19_19 = false;
                var18_18 = null;
                var47_41 = 0;
                var48_42 = null;
                var28_26 = 0.0f;
                var20_20 = 0;
                var21_21 = null;
                var49_43 = 196992;
                var50_44 = var15_15;
                var30_28 = var26_25;
                var51_45 = var44_39;
                var53_46 = var1_1;
                de2_0.t((String)var7_7, (String)var9_9, var26_25, false, false, var44_39, null, null, null, false, null, null, (b30_0)var1_1, var49_43, 0, var46_40);
                var17_17 = var43_38;
                var7_7 = var43_38.element;
                var54_47 = 1;
                var9_9 = var41_36;
                var9_9 = BN2.e((CartEntry)var15_15, var41_36, (Integer)var7_7, (boolean)var54_47);
                var55_48 = 4.949118E-28f;
                var16_16 = var1_1;
                var1_1.K(303880196);
                var8_8 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                if (var8_8 == 0) {
                    var8_8 = R$string.discount;
                    var7_7 = nk_0.f((b30_0)var1_1, var8_8);
                    var56_49 = xx_1.t;
                    var46_40 = 4056;
                    var11_11 = 0;
                    var32_29 = null;
                    var12_12 = 0;
                    var13_13 = 0.0f;
                    var19_19 = false;
                    var18_18 = null;
                    var47_41 = 0;
                    var48_42 = null;
                    var28_26 = 0.0f;
                    var20_20 = 0;
                    var21_21 = null;
                    var49_43 = 196992;
                    var30_28 = var56_49;
                    var58_50 = var43_38;
                    de2_0.t((String)var7_7, (String)var9_9, var56_49, false, false, var44_39, null, null, null, false, null, null, (b30_0)var1_1, var49_43, 0, var46_40);
                } else {
                    var58_50 = var43_38;
                }
                var1_1.E();
                var17_17 = var4_4.d;
                var17_17.getClass();
                var7_7 = qz1_2.p((CartEntry)var50_44);
                var14_14 = 303893226;
                var33_30 = 4.9553917E-28f;
                var6_6 = var1_1;
                var1_1.K(var14_14);
                var8_8 = (int)TextUtils.isEmpty((CharSequence)var7_7);
                if (var8_8 == 0) {
                    var8_8 = R$string.coupon_savings;
                    var7_7 = nk_0.f((b30_0)var1_1, var8_8);
                    var9_9 = qz1_2.p((CartEntry)var50_44);
                    var30_28 = xx_1.t;
                    var46_40 = 4056;
                    var11_11 = 0;
                    var32_29 = null;
                    var12_12 = 0;
                    var13_13 = 0.0f;
                    var19_19 = false;
                    var18_18 = null;
                    var47_41 = 0;
                    var48_42 = null;
                    var28_26 = 0.0f;
                    var20_20 = 0;
                    var21_21 = null;
                    var49_43 = 196992;
                    var25_24 = var17_17;
                    var51_45 = var44_39;
                    var53_46 = var1_1;
                    de2_0.t((String)var7_7, (String)var9_9, var30_28, false, false, var44_39, null, null, null, false, null, null, (b30_0)var1_1, var49_43, 0, var46_40);
                } else {
                    var25_24 = var17_17;
                }
                var1_1.E();
                var17_17 = var58_50;
                var8_8 = var58_50.element;
                var40_35 = 0;
                var9_9 = var4_4.e;
                if (var9_9 != null) {
                    var15_15 = var9_9.getCartEntry();
                    if (var15_15 != null) {
                        var15_15 = var9_9.getCartEntry();
                        if (var15_15 != null) {
                            var21_21 = var15_15.getMultiItemPromoAmt();
                        } else {
                            var20_20 = 0;
                            var21_21 = null;
                        }
                        var29_27 = mz3_0.J((String)var21_21) + 0.0f;
                    } else {
                        var22_22 = false;
                        var29_27 = 0.0f;
                        var15_15 = null;
                    }
                    var16_16 = var9_9.getCartEntry();
                    if (var16_16 != null && (var59_51 = (cfr_temp_0 = var29_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) > 0) {
                        var16_16 = var9_9.getCartEntry();
                        var54_47 = var16_16 != null && (var16_16 = var16_16.getOrderTotalQuantity()) != null ? var16_16.intValue() : 1;
                        var60_52 = var54_47;
                        var29_27 /= var60_52;
                        var55_48 = var8_8;
                        var29_27 *= var55_48;
                    }
                } else {
                    var22_22 = false;
                    var29_27 = 0.0f;
                    var15_15 = null;
                }
                var15_15 = qz2_0.q(var29_27);
                var55_48 = 4.9626655E-28f;
                var6_6 = var1_1;
                var1_1.K(303908333);
                var8_8 = (int)TextUtils.isEmpty((CharSequence)var15_15);
                if (var8_8 != 0) ** GOTO lbl-1000
                if (var9_9 != null && (var7_7 = var9_9.getCartEntry()) != null) {
                    var7_7 = var9_9.getCartEntry();
                    if (var7_7 != null) {
                        var21_21 = var7_7.getMultiItemPromoAmt();
                    } else {
                        var20_20 = 0;
                        var21_21 = null;
                    }
                    var55_48 = mz3_0.J((String)var21_21) + 0.0f;
                } else {
                    var8_8 = 0;
                    var55_48 = 0.0f;
                    var7_7 = null;
                }
                var8_8 = (int)((cfr_temp_1 = var55_48 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                if (var8_8 > 0) {
                    var8_8 = R$string.promo_savings;
                    var7_7 = nk_0.f((b30_0)var6_6, var8_8);
                    var61_53 = xx_1.t;
                    var46_40 = 4056;
                    var11_11 = 0;
                    var32_29 = null;
                    var12_12 = 0;
                    var13_13 = 0.0f;
                    var19_19 = false;
                    var18_18 = null;
                    var47_41 = 0;
                    var48_42 = null;
                    var28_26 = 0.0f;
                    var20_20 = 0;
                    var21_21 = null;
                    var49_43 = 196992;
                    var9_9 = var15_15;
                    var30_28 = var61_53;
                    var63_54 = var17_17;
                    var1_1 = var6_6;
                    var51_45 = var44_39;
                    var53_46 = var6_6;
                    de2_0.t((String)var7_7, (String)var15_15, var61_53, false, false, var44_39, null, null, null, false, null, null, (b30_0)var6_6, var49_43, 0, var46_40);
                } else lbl-1000:
                // 2 sources

                {
                    var63_54 = var17_17;
                    var1_1 = var6_6;
                }
                var1_1.E();
                var17_17 = var63_54;
                var7_7 = var63_54.element;
                var6_6 = var50_44;
                var9_9 = BN2.a((CartEntry)var50_44, (Integer)var7_7);
                var55_48 = 4.971215E-28f;
                var15_15 = var1_1;
                var1_1.K(303926090);
                var8_8 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                if (var8_8 == 0) {
                    var8_8 = R$string.bank_discount;
                    var7_7 = nk_0.f((b30_0)var1_1, var8_8);
                    Intrinsics.checkNotNull(var9_9);
                    var61_53 = xx_1.t;
                    var46_40 = 4056;
                    var11_11 = 0;
                    var32_29 = null;
                    var12_12 = 0;
                    var13_13 = 0.0f;
                    var19_19 = false;
                    var18_18 = null;
                    var47_41 = 0;
                    var48_42 = null;
                    var28_26 = 0.0f;
                    var20_20 = 0;
                    var21_21 = null;
                    var49_43 = 196992;
                    var30_28 = var61_53;
                    var64_55 = var63_54;
                    var65_56 = var50_44;
                    var51_45 = var44_39;
                    var53_46 = var1_1;
                    de2_0.t((String)var7_7, (String)var9_9, var61_53, false, false, var44_39, null, null, null, false, null, null, (b30_0)var1_1, var49_43, 0, var46_40);
                } else {
                    var64_55 = var63_54;
                    var65_56 = var50_44;
                }
                var1_1.E();
                var7_7 = cp_1.Companion;
                var7_7.getClass();
                var8_8 = (int)cp$a.w();
                if (var8_8 == 0 && (var8_8 = (int)cp$a.v()) == 0) {
                    var7_7 = var64_55;
                    var12_12 = 0;
                    var13_13 = 0.0f;
                } else {
                    var7_7 = var64_55;
                    var12_12 = 1;
                    var13_13 = 1.4E-45f;
                }
                var9_9 = var7_7.element;
                var15_15 = var65_56;
                var53_46 = BN2.d((CartEntry)var65_56, (Integer)var9_9);
                var14_14 = var7_7.element;
                var9_9 = var14_14;
                var33_30 = BN2.b((CartEntry)var65_56, (Integer)var9_9);
                cfr_temp_2 = var33_30 - 0.0f;
                var59_51 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                var9_9 = var59_51 > 0 ? String.valueOf(qz2_0.u(var33_30)) : "";
                var16_16 = Unit.a;
                var35_32 = 0;
                var17_17 = null;
                var32_29 = new ic2_2((CartEntry)var15_15, null);
                var21_21 = var1_1;
                ly0_0.d((b30_0)var1_1, var16_16, (Function2)var32_29);
                var59_51 = 303958687;
                var60_52 = 4.98691E-28f;
                var1_1.K((int)var59_51);
                if (var12_12 != 0 && (var59_51 = (float)var9_9.length()) != false) {
                    var16_16 = var15_15.getConvenienceFee();
                    Intrinsics.checkNotNullExpressionValue(var16_16, "getConvenienceFee(...)");
                    var15_15 = var15_15.getOrderTotalQuantity();
                    var32_29 = "getOrderTotalQuantity(...)";
                    Intrinsics.checkNotNullExpressionValue(var15_15, (String)var32_29);
                    var11_11 = var15_15.intValue();
                    var12_12 = var7_7.element;
                    var35_32 = 576;
                    var7_7 = var9_9;
                    var9_9 = var16_16;
                    var15_15 = var25_24;
                    var59_51 = var11_11;
                    var11_11 = var12_12;
                    de2_0.u((String)var7_7, (ConvenienceFeePriceSplitUp)var16_16, (qz1_2)var25_24, (int)var59_51, var12_12, (b30_0)var1_1, var35_32);
                }
                var21_21.E();
                var8_8 = R$string.product_total;
                var7_7 = nk_0.f((b30_0)var21_21, var8_8);
                Intrinsics.checkNotNull(var53_46);
                var46_40 = 4068;
                var30_28 = 0L;
                var11_11 = 1;
                var12_12 = 1;
                var13_13 = 1.4E-45f;
                var51_45 = 0L;
                var19_19 = false;
                var18_18 = null;
                var47_41 = 0;
                var28_26 = 0.0f;
                var14_14 = 0;
                var33_30 = 0.0f;
                var1_1 = var21_21;
                var20_20 = 0;
                var21_21 = null;
                var49_43 = 27648;
                var9_9 = var53_46;
                var53_46 = var1_1;
                de2_0.t((String)var7_7, (String)var9_9, var30_28, (boolean)var11_11, (boolean)var12_12, var51_45, null, null, null, false, null, null, (b30_0)var1_1, var49_43, 0, var46_40);
                var8_8 = R$string.od_okay;
                var48_42 = var1_1;
                var9_9 = nk_0.f((b30_0)var1_1, var8_8);
                var55_48 = 16;
                var29_27 = var42_37;
                var5_5 = h.h((LP1)var5_5, var55_48, var42_37, var55_48, var55_48);
                var55_48 = 1.0f;
                var15_15 = j.c((LP1)var5_5, var55_48);
                var10_10 = 303987101;
                var1_1.K(var10_10);
                var5_5 = var4_4.f;
                var8_8 = (int)var1_1.J(var5_5);
                var16_16 = var1_1.v();
                if (var8_8 != 0 || var16_16 == (var7_7 = b30$a.a)) {
                    var5_5 = (ad2_1)var5_5;
                    var8_8 = 1;
                    var55_48 = 1.4E-45f;
                    var16_16 = new ib0_0(var5_5, var8_8);
                    var48_42.o(var16_16);
                }
                var32_29 = var16_16;
                var32_29 = (Function0)var16_16;
                var48_42.E();
                var47_41 = 105;
                var8_8 = 0;
                var55_48 = 0.0f;
                var7_7 = null;
                var59_51 = (float)false;
                var60_52 = 0.0f;
                var16_16 = null;
                var66_57 = 0L;
                var54_47 = 0;
                var6_6 = null;
                var18_18 = var48_42;
                vb2.a(false, (String)var9_9, (LP1)var15_15, null, (Function0)var32_29, var66_57, null, (b30_0)var48_42, 0, var47_41);
                var48_42.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

