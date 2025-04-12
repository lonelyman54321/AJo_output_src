/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.model.DataError;
import com.google.gson.Gson;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.CartApiRepo$mergeCarts$$inlined$map$1$2$1;
import com.ril.ajio.services.data.Cart.Cart;
import kotlin.Unit;
import kotlin.text.b;

public final class CartApiRepo$mergeCarts$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $screenName$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$mergeCarts$$inlined$map$1$2(fs0_2 fs0_22, CartApiRepo cartApiRepo, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.this$0 = cartApiRepo;
        this.$screenName$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block12: {
            block13: {
                block14: {
                    block9: {
                        block10: {
                            block11: {
                                var3_3 = this;
                                var4_4 = var2_2;
                                var5_5 = var2_2 instanceof CartApiRepo$mergeCarts$$inlined$map$1$2$1;
                                if (!var5_5) ** GOTO lbl-1000
                                var6_6 = var2_2;
                                var6_6 = (CartApiRepo$mergeCarts$$inlined$map$1$2$1)var2_2;
                                var7_7 = var6_6.label;
                                var8_8 = -1 << -1;
                                var9_9 = var7_7 & var8_8;
                                if (var9_9 != 0) {
                                    var6_6.label = var7_7 -= var8_8;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var6_6 = new CartApiRepo$mergeCarts$$inlined$map$1$2$1(var3_3, (f80_0)var4_4);
                                }
                                var4_4 = var6_6.result;
                                var10_10 = j90_0.COROUTINE_SUSPENDED;
                                var8_8 = var6_6.label;
                                var9_9 = 0;
                                var11_11 = 2;
                                var12_12 = 1;
                                if (var8_8 == 0) break block9;
                                if (var8_8 == var12_12) break block10;
                                if (var8_8 != var11_11) break block11;
                                vl2_2.b(var4_4);
                                break block12;
                            }
                            var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var4_4;
                        }
                        var13_13 = (fs0_2)var6_6.L$0;
                        vl2_2.b(var4_4);
                        break block13;
                    }
                    vl2_2.b(var4_4);
                    var13_13 = var3_3.$this_unsafeFlow;
                    var14_14 = var1_1;
                    var14_14 = (dl2_2)var1_1;
                    var4_4 = (Cart)var14_14.b;
                    var15_15 = var14_14.a;
                    var16_16 = var15_15.d();
                    var17_17 = "cart_id";
                    if (!var16_16 || var4_4 == null) break block14;
                    var15_15 = ap_0.a;
                    ap_0.c = var4_4.getCode();
                    var15_15 = CartApiRepo.access$getAppPreferences$p(var3_3.this$0);
                    var18_18 = var4_4.getCode();
                    var15_15.putPreference(var17_17, (Object)var18_18);
                    var15_15 = var3_3.this$0;
                    var18_18 = var3_3.$screenName$inlined;
                    var6_6.L$0 = var13_13;
                    var6_6.label = var12_12;
                    var4_4 = CartApiRepo.access$getMergeCartInventory((CartApiRepo)var15_15, (Cart)var4_4, var18_18, var6_6);
                    if (var4_4 == var10_10) {
                        return var10_10;
                    }
                    break block13;
                }
                var19_20 = var15_15.d();
                var15_15 = null;
                if (var19_20 != 0) {
                    var19_20 = R$string.pdp_details_not_available;
                    var4_4 = hv3_0.K(var19_20);
                    var20_21 = yn3_0.a;
                    var18_19 = "Data not present";
                    var15_15 = new Object[]{};
                    var20_21.a((String)var18_19, (Object[])var15_15);
lbl65:
                    // 4 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var4_4 = var14_14.c;
                if (var4_4 != null) {
                    var4_4 = var4_4.k();
                } else {
                    var19_20 = 0;
                    var4_4 = null;
                }
                var18_19 = yn3_0.a;
                var21_25 = kp1_0.c("ErrorBody: ", (String)var4_4);
                var15_15 = new Object[]{};
                var18_19.d(var21_25, (Object[])var15_15);
                var15_15 = new Gson();
                var18_19 = (var15_15 = (DataError)var15_15.fromJson((String)var4_4, DataError.class)).getErrorMessage().getType();
                var16_16 = b.i((String)var18_19, var21_25 = "CartError", (boolean)var12_12);
                if (!var16_16) ** GOTO lbl65
                var18_19 = ap_0.a;
                var21_25 = var18_19.getGuId();
                if (var21_25 != null && (var23_24 = b.i(var21_25 = var15_15.getErrorMessage().getSubject(), var22_23 = var18_19.getGuId(), (boolean)var12_12))) {
                    var18_19.removeCartGuId();
                }
                if ((var18_19 = ap_0.c) == null || (var12_12 = b.i((String)(var15_15 = var15_15.getErrorMessage().getSubject()), (String)(var18_19 = ap_0.c), (boolean)var12_12)) == 0) ** GOTO lbl65
                ap_0.c = null;
                var20_22 = ap_0.b;
                var20_22.removePreference(var17_17);
                ** while (true)
                var18_19 = var4_4;
                var15_15 = ApiErrorRepo.INSTANCE;
                var22_23 = var3_3.$screenName$inlined;
                var23_24 = true;
                var17_17 = "MergeCartList";
                var24_26 = 32;
                var4_4 = ApiErrorRepo.handleApiError$default((ApiErrorRepo)var15_15, (String)var4_4, (dl2_2)var14_14, var17_17, var23_24, var22_23, null, var24_26, null);
            }
            var6_6.L$0 = null;
            var6_6.label = var11_11;
            var4_4 = var13_13.emit(var4_4, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

