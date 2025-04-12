/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2$1;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.SubWallet;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ Cart $cartResp$inlined;
    final /* synthetic */ HashSet $internalWalletSelectedViews$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2(fs0_2 fs0_22, Cart cart, HashSet hashSet) {
        this.$this_unsafeFlow = fs0_22;
        this.$cartResp$inlined = cart;
        this.$internalWalletSelectedViews$inlined = hashSet;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = var2_2 instanceof CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2$1;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var2_2;
        var6_6 = (CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2$1)var2_2;
        var7_7 = var6_6.label;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.label = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2$1(var3_3, (f80_0)var4_4);
        }
        var4_4 = var6_6.result;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.label;
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
            var4_4 = var3_3.$this_unsafeFlow;
            var11_11 = var1_1;
            var11_11 = (dl2_2)var1_1;
            var12_12 = (PriceValidation)var11_11.b;
            var13_13 = var11_11.a;
            var14_14 = var13_13.d();
            if (var14_14 && var12_12 != null) {
                var11_11 = var12_12.getError();
                var14_14 = false;
                var15_15 = null;
                if (var11_11 != null) {
                    var11_11 = var11_11.getCode();
                } else {
                    var16_17 = 0;
                    var11_11 = null;
                }
                if (var11_11 != null) {
                    var11_11 = var12_12.getError();
                    if (var11_11 != null) {
                        var15_15 = var11_11.getDescription();
                    }
                    if (var15_15 != null) {
                        var11_11 = in_0.a;
                        var15_15 = var12_12.getError();
                        if (var15_15 != null && (var15_15 = var15_15.getDescription()) != null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var15_15 = "";
                        ** continue;
                        var17_18 = var15_15;
                        var11_11.getClass();
                        var18_20 = "CART_PriceCalculation";
                        Intrinsics.checkNotNullParameter(var18_20, "requestID");
                        Intrinsics.checkNotNullParameter(var15_15, "errorMessage");
                        var19_22 = "bag screen";
                        Intrinsics.checkNotNullParameter(var19_22, "screenName");
                        var20_23 = ServiceErrorEventTracker.INSTANCE;
                        var15_15 = "ApplicationError: statusCode:";
                        var11_11 = new Object((String)var15_15);
                        var21_24 = var13_13.d;
                        var11_11.append(var21_24);
                        var13_13 = " ";
                        var11_11.append((String)var13_13);
                        var11_11.append((String)var17_18);
                        var22_25 = var11_11.toString();
                        var23_26 = Boolean.TRUE;
                        var24_27 = "Forward";
                        var20_23.trackPaymentServiceErrorEvents((String)var18_20, (String)var17_18, (String)var22_25, var21_24, var23_26, var19_22, var24_27);
                    }
                }
                if ((var13_13 = var12_12.getPriceSplitup()) != null) {
                    var13_13 = yn3_0.a;
                    var16_17 = 0;
                    var11_11 = null;
                    var15_15 = new Object[]{};
                    var13_13.a("paymentDebug: before updateOrderSummary", (Object[])var15_15);
                    var13_13 = in_0.a;
                    var15_15 = var3_3.$cartResp$inlined;
                    var13_13.getClass();
                    var13_13 = new HashMap();
                    var20_23 = var12_12.getPriceSplitup();
                    if (var20_23 != null && (var20_23 = var20_23.getInternalWallets()) != null) {
                        var16_17 = var20_23.size();
                    }
                    if ((var20_23 = var12_12.getPriceSplitup()) != null && (var20_23 = var20_23.getInternalWallets()) != null) {
                        var20_23 = ((Iterable)var20_23).iterator();
                        while (var25_28 = var20_23.hasNext()) {
                            var18_20 = (PaymentInstrumentInfo)var20_23.next();
                            if (var18_20 != null && (var17_18 = var18_20.getCode()) != null && (var26_29 = var17_18.length()) > 0) {
                                var22_25 = var18_20.getMultipleWalletEnabledAmount();
                                var13_13.put(var17_18, var22_25);
                            }
                            if (var18_20 != null && (var17_18 = var18_20.getSubWallets()) != null) {
                                var17_18 = ((Iterable)var17_18).iterator();
                                while ((var26_29 = (int)var17_18.hasNext()) != 0) {
                                    var22_25 = (SubWallet)var17_18.next();
                                    if (var22_25 == null || (var27_30 = var22_25.getCode()) == null || (var28_31 = var27_30.length()) <= 0) continue;
                                    var22_25 = var22_25.getMultipleWalletEnabledAmount();
                                    var13_13.put(var27_30, var22_25);
                                }
                            }
                            if (var16_17 > var9_9) {
                                if (var18_20 == null) continue;
                                var18_20 = var18_20.getMultipleWalletEnabledAmount();
                                continue;
                            }
                            if (var18_20 == null) continue;
                            var18_20 = var18_20.getAmount();
                        }
                    }
                    if (var15_15 != null) {
                        var11_11 = var12_12.getMultipleWalletEnabledAmountMessage();
                        var15_15.setMultipleWalletEnabledAmountMessage((String)var11_11);
                    }
                    if (var15_15 != null && (var11_11 = var15_15.getInternalWallets()) != null) {
                        var11_11 = var11_11.iterator();
                        while (var14_14 = var11_11.hasNext()) {
                            var15_15 = (PaymentInstrumentInfo)var11_11.next();
                            if (var15_15 != null && (var20_23 = var15_15.getCode()) != null && (var25_28 = var13_13.containsKey(var20_23))) {
                                var20_23 = (Float)var13_13.get(var20_23);
                                var15_15.setMultipleWalletEnabledAmount((Float)var20_23);
                            }
                            if (var15_15 == null || (var15_15 = var15_15.getSubWallets()) == null) continue;
                            var15_15 = ((Iterable)var15_15).iterator();
                            while (var29_32 = var15_15.hasNext()) {
                                var20_23 = (SubWallet)var15_15.next();
                                if (var20_23 == null || (var18_20 = var20_23.getCode()) == null || !(var30_34 = var13_13.containsKey(var18_20))) continue;
                                var18_20 = (Float)var13_13.get(var18_20);
                                var20_23.setMultipleWalletEnabledAmount((Float)var18_20);
                            }
                        }
                    }
                    var13_13 = in_0.a;
                    var11_11 = var3_3.$internalWalletSelectedViews$inlined;
                    var15_15 = var3_3.$cartResp$inlined;
                    var13_13.getClass();
                    in_0.a(var11_11, (Cart)var15_15);
                }
                var13_13 = DataCallback.Companion;
                var12_12 = var13_13.onSuccess(var12_12);
            } else {
                var13_13 = ApiErrorRepo.INSTANCE;
                var15_16 = "CART_PriceCalculation";
                var29_33 = true;
                var18_21 = "bag screen";
                var17_19 = "Forward";
                var12_12 = var13_13.handleApiError((dl2_2)var11_11, var15_16, var29_33, var18_21, var17_19);
            }
            var6_6.label = var9_9;
            var4_4 = var4_4.emit(var12_12, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

