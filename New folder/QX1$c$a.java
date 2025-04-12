/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import com.ril.ajio.data.database.entity.CartEntity;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class QX1$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wx1_1 c;

    public QX1$c$a(fs0_2 fs0_22, ArrayList arrayList, wx1_1 wx1_12) {
        this.a = fs0_22;
        this.b = arrayList;
        this.c = wx1_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block29: {
            block30: {
                block26: {
                    block27: {
                        block28: {
                            var3_3 = this;
                            var4_4 = var2_2;
                            var5_5 = null;
                            var6_6 = 1;
                            var7_7 = var2_2 instanceof QX1$c$a$a;
                            if (!var7_7) ** GOTO lbl-1000
                            var8_8 = var2_2;
                            var8_8 = (QX1$c$a$a)var2_2;
                            var9_9 = var8_8.b;
                            var10_10 = -1 << -1;
                            var11_11 = var9_9 & var10_10;
                            if (var11_11 != 0) {
                                var8_8.b = var9_9 -= var10_10;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var8_8 = new QX1$c$a$a(var3_3, (f80_0)var4_4);
                            }
                            var4_4 = var8_8.a;
                            var12_12 = j90_0.COROUTINE_SUSPENDED;
                            var10_10 = var8_8.b;
                            var13_13 = 2;
                            var14_14 = 2.8E-45f;
                            if (var10_10 == 0) break block26;
                            if (var10_10 == var6_6) break block27;
                            if (var10_10 != var13_13) break block28;
                            vl2_2.b(var4_4);
                            break block29;
                        }
                        var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var4_4;
                    }
                    var5_5 = var8_8.c;
                    vl2_2.b(var4_4);
                    break block30;
                }
                vl2_2.b(var4_4);
                var4_4 = var1_1;
                var4_4 = (HashMap)var1_1;
                var15_15 /* !! */  = yn3_0.a;
                var16_16 = new Object[]{};
                var15_15 /* !! */ .a("read all cart previous entry from db successful", (Object[])var16_16);
                var17_17 = var4_4.size();
                var18_18 = new Integer(var17_17);
                var16_16 = new Object[var6_6];
                var16_16[0] = var18_18;
                var15_15 /* !! */ .a("cart previous entry count = %s", (Object[])var16_16);
                var15_15 /* !! */  = var3_3.b;
                var16_16 = var15_15 /* !! */ .iterator();
                var18_18 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(var16_16, (String)var18_18);
                while (true) {
                    block32: {
                        block31: {
                            var19_19 = var16_16.hasNext();
                            var20_20 = var3_3.c;
                            if (!var19_19) break;
                            var18_18 = (CartEntry)var16_16.next();
                            Intrinsics.checkNotNull(var18_18);
                            var20_20.getClass();
                            var21_21 = var18_18.getQuantity();
                            if (var21_21 != null && (var21_21 = var18_18.getProduct()) != null && (var21_21 = var18_18.getProduct().getWasPriceData()) != null && (var22_22 = TextUtils.isEmpty((CharSequence)(var21_21 = var18_18.getBasePrice().getValue()))) == 0) {
                                var21_21 = var18_18.getQuantity();
                                var22_22 = var21_21.intValue();
                                var23_23 = var18_18.getBasePrice().getValue();
                                if (var23_23 == null) {
                                    var23_23 = "0";
                                }
                                var24_24 = mz3_0.J(var23_23);
                                var25_25 = var18_18.getQuantity();
                                Intrinsics.checkNotNull(var25_25);
                                var26_26 = var25_25.intValue();
                                var27_27 = var26_26;
                                var24_24 *= var27_27;
                            } else {
                                var22_22 = 0;
                                var28_28 = 0.0f;
                                var21_21 = null;
                                var29_29 = 0;
                                var24_24 = 0.0f;
                                var23_23 = null;
                            }
                            var25_25 = var18_18.getVoucherPromoAmt();
                            var26_26 = TextUtils.isEmpty((CharSequence)var25_25);
                            if (var26_26 == 0) {
                                var25_25 = var18_18.getVoucherPromoAmt();
                                var27_27 = mz3_0.J((String)var25_25);
                            } else {
                                var26_26 = 0;
                                var27_27 = 0.0f;
                                var25_25 = null;
                            }
                            var30_30 = var18_18.getMultiItemPromoAmt();
                            var31_31 = TextUtils.isEmpty((CharSequence)var30_30);
                            if (!var31_31) {
                                var30_30 = var18_18.getMultiItemPromoAmt();
                                var32_32 = mz3_0.J(var30_30);
                            } else {
                                var31_31 = false;
                                var32_32 = 0.0f;
                                var30_30 = null;
                            }
                            var24_24 = var24_24 - var27_27 - var32_32;
                            var33_33 = Float.valueOf(var24_24);
                            var34_34 = var18_18.getProduct();
                            var35_35 = var34_34.getCode();
                            var35_35 = (CartEntity)var4_4.get(var35_35);
                            if (var35_35 != null) {
                                var35_35 = var18_18.getProduct().getCode();
                                if ((var35_35 = (CartEntity)var4_4.get(var35_35)) != null) {
                                    var14_14 = var35_35.getValue();
                                    var28_28 = var22_22;
                                    var33_33 = var35_35 = Float.valueOf(var14_14 *= var28_28);
                                } else {
                                    var33_33 = null;
                                }
                                var35_35 = var18_18.getProduct().getCode();
                                var35_35 = var4_4.get(var35_35);
                                Intrinsics.checkNotNull(var35_35);
                                var35_35 = (CartEntity)var35_35;
                                var13_13 = (int)var35_35.isDod();
                            } else {
                                var13_13 = 0;
                                var14_14 = 0.0f;
                                var35_35 = null;
                            }
                            Intrinsics.checkNotNull(var33_33);
                            var28_28 = var33_33.floatValue() - var24_24;
                            var11_11 = 100;
                            var36_36 = (float)var11_11 * var28_28 / var24_24;
                            var24_24 = 100.0f;
                            var29_29 = var28_28 == var24_24 ? 0 : (var28_28 > var24_24 ? 1 : -1);
                            if (var29_29 > 0) break block31;
                            var29_29 = 0x40A00000;
                            var24_24 = 5.0f;
                            cfr_temp_0 = var36_36 - var24_24;
                            var11_11 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var11_11 <= 0) break block32;
                        }
                        if ((var11_11 = (int)((cfr_temp_1 = var27_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1))) == 0 && (var11_11 = (int)((cfr_temp_2 = var32_32 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1))) == 0) {
                            var11_11 = (int)var28_28;
                            var18_18.setPriceDrop(var11_11);
                            var20_20.W0 = var6_6;
                        }
                    }
                    if ((var11_11 = (int)((cfr_temp_3 = var28_28 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1))) < 0 && (var11_11 = (int)((cfr_temp_4 = var27_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1))) == 0 && (var11_11 = (int)((cfr_temp_5 = var32_32 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1))) == 0 && var13_13 != 0) {
                        var11_11 = Math.abs((int)var28_28);
                        var18_18.setPriceIncrease(var11_11);
                        var20_20.W0 = var6_6;
                    }
                    var13_13 = 2;
                    var14_14 = 2.8E-45f;
                }
                var4_4 = yn3_0.a;
                var10_10 = var15_15 /* !! */ .size();
                var37_37 = new Integer(var10_10);
                var15_15 /* !! */  = new Object[var6_6];
                var15_15 /* !! */ [0] = var37_37;
                var4_4.a("cart current entry count = %s", var15_15 /* !! */ );
                var4_4 = var20_20.S0;
                var8_8.c = var5_5 = var3_3.a;
                var8_8.b = var6_6;
                if (var4_4 != null && (var38_38 /* !! */  = var4_4.getEntries()) != null && (var6_6 = (var38_38 /* !! */  = var4_4.getEntries()).size()) > 0) {
                    var38_38 /* !! */  = CartDaoHelper.INSTANCE;
                    var4_4 = var4_4.getEntries();
                    var15_15 /* !! */  = "getEntries(...)";
                    Intrinsics.checkNotNullExpressionValue(var4_4, (String)var15_15 /* !! */ );
                    var4_4 = var38_38 /* !! */ .deleteAndInsertAllInCartDao((List)var4_4, var8_8);
                    var38_38 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    if (var4_4 != var38_38 /* !! */ ) {
                        var4_4 = Unit.a;
                    }
                } else {
                    var4_4 = CartDaoHelper.INSTANCE.deleteAllProducts2(var8_8);
                    if (var4_4 != (var38_38 /* !! */  = j90_0.COROUTINE_SUSPENDED)) {
                        var4_4 = Unit.a;
                    }
                }
                if (var4_4 == var12_12) {
                    return var12_12;
                }
            }
            var4_4 = Unit.a;
            var38_38 /* !! */  = null;
            var8_8.c = null;
            var8_8.b = var6_6 = 2;
            var4_4 = var5_5.emit(var4_4, var8_8);
            if (var4_4 == var12_12) {
                return var12_12;
            }
        }
        return Unit.a;
    }
}

