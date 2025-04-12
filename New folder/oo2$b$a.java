/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.InternalWalletAmount;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.SubWallet;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.b;

public final class oo2$b$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ oo2_1 b;
    public final /* synthetic */ PaymentInstruments c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TenantResponse e;

    public oo2$b$a(fs0_2 fs0_22, oo2_1 oo2_12, PaymentInstruments paymentInstruments, HashSet hashSet, TenantResponse tenantResponse) {
        this.a = fs0_22;
        this.b = oo2_12;
        this.c = paymentInstruments;
        this.d = hashSet;
        this.e = tenantResponse;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block50: {
            block54: {
                block51: {
                    block52: {
                        block53: {
                            block48: {
                                block49: {
                                    var3_3 = this;
                                    var4_4 = var2_2;
                                    var5_5 = var2_2 instanceof oo2$b$a$a;
                                    if (!var5_5) ** GOTO lbl-1000
                                    var6_6 = var2_2;
                                    var6_6 = (oo2$b$a$a)var2_2;
                                    var7_7 = var6_6.b;
                                    var8_8 = -1 << -1;
                                    var9_9 = var7_7 & var8_8;
                                    if (var9_9) {
                                        var6_6.b = var7_7 -= var8_8;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var6_6 = new oo2$b$a$a(var3_3, (f80_0)var4_4);
                                    }
                                    var4_4 = var6_6.a;
                                    var10_10 = j90_0.COROUTINE_SUSPENDED;
                                    var8_8 = var6_6.b;
                                    var9_9 = 1;
                                    if (var8_8 == 0) break block48;
                                    if (var8_8 != var9_9) break block49;
                                    vl2_2.b(var4_4);
                                    break block50;
                                }
                                var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var4_4;
                            }
                            vl2_2.b(var4_4);
                            var11_11 = var1_1;
                            var11_11 = (dl2_2)var1_1;
                            var4_4 = (PriceValidation)var11_11.b;
                            var12_12 = var11_11.a;
                            var13_13 = var12_12.d();
                            if (!var13_13 || var4_4 == null) break block51;
                            var14_14 = var4_4.getError();
                            var11_11 = null;
                            if (var14_14 != null) {
                                var14_14 = var14_14.getCode();
                            } else {
                                var13_13 = false;
                                var14_14 = null;
                                var15_16 = 0.0f;
                            }
                            var16_17 = "";
                            if (var14_14 != null) {
                                var14_14 = var4_4.getError();
                                if (var14_14 != null) {
                                    var14_14 = var14_14.getDescription();
                                } else {
                                    var13_13 = false;
                                    var14_14 = null;
                                    var15_16 = 0.0f;
                                }
                                if (var14_14 != null) {
                                    var14_14 = var4_4.getError();
                                    if (var14_14 == null || (var14_14 = var14_14.getDescription()) == null) {
                                        var14_14 = var16_17;
                                    }
                                    var3_3.b.getClass();
                                    var17_19 = "PAYMENT_PriceCalculation";
                                    var8_8 = var12_12.d;
                                    oo2_1.h(var8_8, (String)var17_19, (String)var14_14);
                                }
                            }
                            if ((var12_12 = var4_4.getPriceSplitup()) == null) break block52;
                            var12_12 = yn3_0.a;
                            var13_13 = false;
                            var15_16 = 0.0f;
                            var14_14 = null;
                            var17_19 = new Object[]{};
                            var18_20 = "paymentDebug: before updateOrderSummary";
                            var12_12.a((String)var18_20, (Object[])var17_19);
                            var8_8 = (int)no2_0.c;
                            if (var8_8 == 0) {
                                var12_12 = var4_4.getPriceSplitup();
                                if (var12_12 != null) {
                                    var12_12 = var12_12.getNetPayableAmount();
                                } else {
                                    var8_8 = 0;
                                    var12_12 = null;
                                }
                                no2_0.e = var12_12;
                            }
                            if ((var12_12 = var4_4.getPriceSplitup()) != null) {
                                var12_12 = var12_12.getNetPayableAmount();
                            } else {
                                var8_8 = 0;
                                var12_12 = null;
                            }
                            no2_0.d = var12_12;
                            InternalWalletUtil.a.getClass();
                            var12_12 = new HashMap();
                            var17_19 = var4_4.getPriceSplitup();
                            if (var17_19 != null && (var17_19 = var17_19.getInternalWallets()) != null) {
                                var19_22 = var17_19.size();
                            } else {
                                var19_22 = 0;
                                var17_19 = null;
                            }
                            var18_20 = var4_4.getPriceSplitup();
                            var20_24 = false;
                            var21_25 = 0.0f;
                            var22_26 = null;
                            if (var18_20 == null || (var18_20 = var18_20.getInternalWallets()) == null) break block53;
                            var18_20 = ((Iterable)var18_20).iterator();
                            var23_28 = false;
                            var24_29 = 0.0f;
                            var25_30 = null;
                            while (var26_31 = var18_20.hasNext()) {
                                block47: {
                                    var27_32 = (PaymentInstrumentInfo)var18_20.next();
                                    if (var27_32 != null && (var28_33 = var27_32.getCode()) != null && (var29_34 = var28_33.length()) > 0) {
                                        var30_35 = var27_32.getMultipleWalletEnabledAmount();
                                        var12_12.put(var28_33, var30_35);
                                    }
                                    if (var27_32 != null && (var28_33 = var27_32.getSubWallets()) != null) {
                                        var28_33 = ((Iterable)var28_33).iterator();
                                        while ((var29_34 = (int)var28_33.hasNext()) != 0) {
                                            var30_35 = (SubWallet)var28_33.next();
                                            if (var30_35 != null && (var14_14 = var30_35.getCode()) != null && (var31_36 = var14_14.length()) > 0) {
                                                var30_35 = var30_35.getMultipleWalletEnabledAmount();
                                                var12_12.put(var14_14, var30_35);
                                            }
                                            var13_13 = false;
                                            var15_16 = 0.0f;
                                            var14_14 = null;
                                        }
                                    }
                                    if (var19_22 <= var9_9) ** GOTO lbl127
                                    if (var27_32 != null && (var14_14 = var27_32.getMultipleWalletEnabledAmount()) != null) {
                                        var15_16 = var14_14.floatValue();
                                    } else {
                                        while (true) {
                                            var13_13 = false;
                                            var15_16 = 0.0f;
                                            var14_14 = null;
                                            break block47;
                                            break;
                                        }
lbl127:
                                        // 1 sources

                                        if (var27_32 == null || (var14_14 = var27_32.getAmount()) == null) ** continue;
                                        var15_16 = var14_14.floatValue();
                                    }
                                }
                                var24_29 += var15_16;
                                var13_13 = false;
                                var15_16 = 0.0f;
                                var14_14 = null;
                            }
                            var21_25 = var24_29;
                        }
                        if ((var14_14 = var3_3.c) != null) {
                            var14_14.setTotalInternalWalletAmountUsed(var21_25);
                        }
                        if (var14_14 != null) {
                            var17_19 = var4_4.getMultipleWalletEnabledAmountMessage();
                            var14_14.setMultipleWalletEnabledAmountMessage((String)var17_19);
                        }
                        var17_19 = "INTERNAL_WALLET";
                        if (var14_14 != null && (var18_20 = var14_14.getPaymentInstrumentDetails()) != null) {
                            var18_20 = ((Iterable)var18_20).iterator();
                            while (var20_24 = var18_20.hasNext()) {
                                var22_26 = (PaymentInstrumentType)var18_20.next();
                                if (var22_26 != null) {
                                    var25_30 = var22_26.getPaymentInstrumentCode();
                                } else {
                                    var23_28 = false;
                                    var25_30 = null;
                                    var24_29 = 0.0f;
                                }
                                if (!(var23_28 = kotlin.text.b.i((String)var25_30, (String)var17_19, (boolean)var9_9))) continue;
                                if (var22_26 == null || (var18_20 = var22_26.getPaymentInstrumentsInfo()) == null) break;
                                var18_20 = var18_20.iterator();
                                while (var20_24 = var18_20.hasNext()) {
                                    var22_26 = (PaymentInstrumentInfo)var18_20.next();
                                    if (var22_26 != null && (var25_30 = var22_26.getCode()) != null && (var26_31 = var12_12.containsKey(var25_30))) {
                                        var25_30 = (Float)var12_12.get(var25_30);
                                        var22_26.setMultipleWalletEnabledAmount((Float)var25_30);
                                    }
                                    if (var22_26 == null || (var22_26 = var22_26.getSubWallets()) == null) continue;
                                    var22_26 = ((Iterable)var22_26).iterator();
                                    while (var23_28 = var22_26.hasNext()) {
                                        var25_30 = (SubWallet)var22_26.next();
                                        if (var25_30 == null || (var27_32 = var25_30.getCode()) == null || !(var32_37 = var12_12.containsKey(var27_32))) continue;
                                        var27_32 = (Float)var12_12.get(var27_32);
                                        var25_30.setMultipleWalletEnabledAmount((Float)var27_32);
                                    }
                                }
                                break block3;
                            }
                        }
                        InternalWalletUtil.a.getClass();
                        var12_12 = var3_3.d;
                        if (var12_12 != null && (var33_38 = var12_12.isEmpty()) == 0) {
                            if (var14_14 != null && (var18_20 = var14_14.getPaymentInstrumentDetails()) != null) {
                                var33_38 = var18_20.size();
                            } else {
                                var33_38 = 0;
                                var34_39 = 0.0f;
                                var18_20 = null;
                            }
                            if (var33_38 > 0) {
                                var18_20 = oo2_0.a;
                                var18_20.getClass();
                                var14_14 = oo2_0.c((String)var17_19, (PaymentInstruments)var14_14);
                                if (var14_14 != null && (var17_19 = var14_14.getPaymentInstrumentsInfo()) != null) {
                                    var19_22 = var17_19.size();
                                } else {
                                    var19_22 = 0;
                                    var17_19 = null;
                                }
                                if (var19_22 > 0 && var14_14 != null && (var14_14 = var14_14.getPaymentInstrumentsInfo()) != null) {
                                    var14_14 = var14_14.iterator();
                                    var19_22 = 0;
                                    var17_19 = null;
                                    while ((var33_38 = (int)var14_14.hasNext()) != 0) {
                                        var18_20 = (PaymentInstrumentInfo)var14_14.next();
                                        if (var18_20 != null) {
                                            var22_26 = var18_20.getCode();
                                        } else {
                                            var20_24 = false;
                                            var22_26 = null;
                                            var21_25 = 0.0f;
                                        }
                                        if (!(var20_24 = CollectionsKt.F((Iterable)var12_12, var22_26))) continue;
                                        if (var17_19 == null) {
                                            var17_19 = new ArrayList();
                                        }
                                        if (var18_20 == null || (var25_30 = var18_20.getName()) == null) {
                                            var25_30 = var16_17;
                                        }
                                        var27_32 = InternalWalletUtil.a;
                                        var27_32.getClass();
                                        var34_39 = InternalWalletUtil.b((PaymentInstrumentInfo)var18_20, (HashSet)var12_12);
                                        var22_26 = new InternalWalletAmount((String)var25_30, var34_39);
                                        var17_19.add(var22_26);
                                    }
                                    var11_11 = var17_19;
                                }
                            }
                        }
                        if ((var12_12 = var3_3.e) != null && (var12_12 = var12_12.getOrderSummary()) != null) {
                            var12_12.setInternalWalletAmountList((ArrayList)var11_11);
                        }
                    }
                    var12_12 = DataCallback.Companion;
                    var4_4 = var12_12.onSuccess(var4_4);
                    break block54;
                }
                var14_15 = ApiErrorRepo.INSTANCE;
                var16_18 = "PAYMENT_PriceCalculation";
                var19_23 = true;
                var18_21 = "single page checkout";
                var22_27 = "Forward";
                var4_4 = var14_15.handleApiError((dl2_2)var11_11, var16_18, var19_23, var18_21, var22_27);
            }
            var6_6.b = var9_9;
            var12_12 = var3_3.a;
            var4_4 = var12_12.emit(var4_4, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

