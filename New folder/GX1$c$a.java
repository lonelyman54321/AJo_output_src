/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Order.EarnPoint;
import com.ril.ajio.services.data.Order.ExtraResponseParams;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class GX1$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ wx1_1 b;

    public GX1$c$a(fs0_2 fs0_22, wx1_1 wx1_12) {
        this.a = fs0_22;
        this.b = wx1_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = var2_2 instanceof GX1$c$a$a;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var2_2;
        var6_6 = (GX1$c$a$a)var2_2;
        var7_7 = var6_6.b;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9) {
            var6_6.b = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new GX1$c$a$a(var3_3, (f80_0)var4_4);
        }
        var4_4 = var6_6.a;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.b;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl24
        if (var8_8 == var9_9) {
            vl2_2.b(var4_4);
        } else {
            var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var4_4;
lbl24:
            // 1 sources

            vl2_2.b(var4_4);
            var4_4 = var1_1;
            var4_4 = (EarnPoint)((DataCallback)var1_1).getData();
            var11_11 = var3_3.b;
            var4_4 = var11_11.c1 = var4_4;
            if (var4_4 != null && (var12_12 = var4_4.getStatus()) != null && ((var12_12 = var4_4.getStatus()) == null || (var13_13 = var12_12.getStatusCode()) != (var14_14 = 2))) {
                var12_12 = var4_4.getEligibleEarnAmount();
                var15_15 = 0.0;
                var17_16 = var12_12 != null ? var12_12.doubleValue() : var15_15;
                var12_12 = "get(...)";
                var19_17 = var11_11.d1;
                var20_18 /* !! */  = (double)(var17_16 == var15_15 ? 0 : (var17_16 > var15_15 ? 1 : -1));
                if (var20_18 /* !! */  > 0) {
                    var11_11 = var4_4.getEligibleEarnAmount();
                    if (var11_11 != null) {
                        var15_15 = var11_11.doubleValue();
                    }
                    var19_17.setEligibleEarnAmount(var15_15);
                } else {
                    var21_19 = var4_4.getExtraResponseParams();
                    if (var21_19 != null) {
                        var22_20 = var21_19.size();
                        var24_22 = null;
                        for (var23_21 = 0; var23_21 < var22_20; ++var23_21) {
                            var25_23 = var21_19.get(var23_21);
                            Intrinsics.checkNotNullExpressionValue(var25_23, (String)var12_12);
                            var25_23 = (ExtraResponseParams)var25_23;
                            var26_24 = var25_23.getKey();
                            if (var26_24 == null) continue;
                            var26_24 = var25_23.getKey();
                            Intrinsics.checkNotNull(var26_24);
                            var26_24 = var26_24.getValue();
                            var20_18 /* !! */  = (double)TextUtils.isEmpty((CharSequence)var26_24);
                            if (var20_18 /* !! */  != false) continue;
                            var26_24 = var25_23.getKey();
                            Intrinsics.checkNotNull(var26_24);
                            var26_24 = var26_24.getValue();
                            Intrinsics.checkNotNull(var26_24);
                            var27_25 = "minimumEarnThreshold";
                            var20_18 /* !! */  = (double)kotlin.text.b.i((String)var26_24, (String)var27_25, (boolean)var9_9);
                            if (var20_18 /* !! */  == false || (var26_24 = var25_23.getValue()) == null) continue;
                            var25_23 = var25_23.getValue();
                            Intrinsics.checkNotNull(var25_23);
                            var25_23 = var25_23.getValue();
                            var28_26 = mz3_0.J((String)var25_23);
                            var26_24 = var11_11.S0;
                            if (var26_24 != null && (var26_24 = var26_24.getTotalPriceWithTax()) != null) {
                                var26_24 = var26_24.getValue();
                            } else {
                                var20_18 /* !! */  = (double)false;
                                var29_27 = 0.0f;
                                var26_24 = null;
                            }
                            if (var26_24 != null && (var20_18 /* !! */  = (double)var26_24.length()) != false) {
                                var26_24 = var11_11.S0;
                                if (var26_24 != null && (var26_24 = var26_24.getTotalPriceWithTax()) != null) {
                                    var26_24 = var26_24.getValue();
                                } else {
                                    var20_18 /* !! */  = (double)false;
                                    var29_27 = 0.0f;
                                    var26_24 = null;
                                }
                                var29_27 = mz3_0.J((String)var26_24);
                            } else {
                                var20_18 /* !! */  = (double)false;
                                var29_27 = 0.0f;
                                var26_24 = null;
                            }
                            var30_28 = var11_11.S0;
                            if (var30_28 != null && (var30_28 = var30_28.getDeliveryCost()) != null) {
                                var30_28 = var30_28.getValue();
                            } else {
                                var31_29 = 0;
                                var32_30 = 0.0f;
                                var30_28 = null;
                            }
                            if (var30_28 != null && (var31_29 = var30_28.length()) != 0) {
                                var30_28 = var11_11.S0;
                                if (var30_28 != null && (var30_28 = var30_28.getDeliveryCost()) != null) {
                                    var30_28 = var30_28.getValue();
                                } else {
                                    var31_29 = 0;
                                    var32_30 = 0.0f;
                                    var30_28 = null;
                                }
                                var32_30 = mz3_0.J((String)var30_28);
                            } else {
                                var31_29 = 0;
                                var32_30 = 0.0f;
                                var30_28 = null;
                            }
                            var27_25 = var11_11.S0;
                            if (var27_25 != null && (var27_25 = var27_25.getExclusiveGST()) != null) {
                                var27_25 = var27_25.getValue();
                            } else {
                                var33_31 = 0;
                                var34_32 = 0.0f;
                                var27_25 = null;
                            }
                            if (var27_25 != null && (var33_31 = var27_25.length()) != 0) {
                                var27_25 = var11_11.S0;
                                if (var27_25 != null && (var27_25 = var27_25.getExclusiveGST()) != null) {
                                    var27_25 = var27_25.getValue();
                                } else {
                                    var33_31 = 0;
                                    var34_32 = 0.0f;
                                    var27_25 = null;
                                }
                                var34_32 = mz3_0.J((String)var27_25);
                            } else {
                                var33_31 = 0;
                                var34_32 = 0.0f;
                                var27_25 = null;
                            }
                            var29_27 = var29_27 - var32_30 - var34_32;
                            cfr_temp_0 = (var28_26 -= var29_27) - 0.0f;
                            var31_29 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var31_29 <= 0) continue;
                            var19_17.setAdditionalPurchaseAmount(var28_26);
                        }
                    }
                }
                var4_4 = var4_4.getExtraResponseParams();
                if (var4_4 != null) {
                    var8_8 = var4_4.size();
                    var32_30 = 0.0f;
                    var30_28 = null;
                    for (var31_29 = 0; var31_29 < var8_8; ++var31_29) {
                        var21_19 = var4_4.get(var31_29);
                        Intrinsics.checkNotNullExpressionValue(var21_19, (String)var12_12);
                        var21_19 = (ExtraResponseParams)var21_19;
                        var35_33 = var21_19.component1();
                        var21_19 = var21_19.component2();
                        if (var35_33 == null || (var23_21 = (int)TextUtils.isEmpty((CharSequence)(var24_22 = var35_33.getValue()))) != 0) continue;
                        var35_33 = var35_33.getValue();
                        Intrinsics.checkNotNull(var35_33);
                        var24_22 = "walletInfo";
                        var22_20 = (int)kotlin.text.b.i((String)var35_33, var24_22, (boolean)var9_9);
                        if (var22_20 == 0 || var21_19 == null) continue;
                        var21_19 = var21_19.getValue();
                        var19_17.setWalletInfo((String)var21_19);
                    }
                }
            }
            var4_4 = Unit.a;
            var6_6.b = var9_9;
            var11_11 = var3_3.a;
            if ((var4_4 = var11_11.emit(var4_4, var6_6)) == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

