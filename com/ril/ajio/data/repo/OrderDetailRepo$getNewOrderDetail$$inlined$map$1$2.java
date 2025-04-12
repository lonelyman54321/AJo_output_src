/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.OrderDetailRepo$getNewOrderDetail$$inlined$map$1$2$1;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;

public final class OrderDetailRepo$getNewOrderDetail$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public OrderDetailRepo$getNewOrderDetail$$inlined$map$1$2(fs0_2 fs0_22) {
        this.$this_unsafeFlow = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof OrderDetailRepo$getNewOrderDetail$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (OrderDetailRepo$getNewOrderDetail$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new OrderDetailRepo$getNewOrderDetail$$inlined$map$1$2$1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.result;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.label;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.$this_unsafeFlow;
            var9_9 = var1_1;
            var9_9 = (dl2_2)var1_1;
            var1_1 = (CartOrder)var9_9.b;
            var10_10 = var9_9.a;
            var11_11 = var10_10.d();
            if (var11_11 && var1_1 != null) {
                var10_10 = m80_0.Companion;
                var11_11 = var1_1.isConvenienceFeeEnabled();
                var10_10.getClass();
                m80_0.c = var11_11;
                var12_12 = var1_1.getIsConvenienceFeeRefundable();
                var10_10.getClass();
                m80_0.d = var12_12;
                var10_10 = DataCallback.Companion;
                var1_1 = var10_10.onSuccess(var1_1);
            } else {
                var13_14 = var10_10.d();
                var6_6 = 0;
                var10_10 = null;
                if (var13_14 != 0) {
                    var13_14 = R$string.pdp_details_not_available;
                    var1_1 = hv3_0.K(var13_14);
                    var12_13 = yn3_0.a;
                    var14_15 = "Data not present";
                    var10_10 = new Object[]{};
                    var12_13.a((String)var14_15, (Object[])var10_10);
lbl52:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var1_1 = var9_9.c;
                if (var1_1 != null) {
                    var1_1 = var1_1.k();
                } else {
                    var13_14 = 0;
                    var1_1 = null;
                }
                var12_13 = yn3_0.a;
                var14_15 = kp1_0.c("ErrorBody: ", (String)var1_1);
                var10_10 = new Object[]{};
                var12_13.d((String)var14_15, (Object[])var10_10);
                ** continue;
                var14_15 = var1_1;
                var12_13 = ApiErrorRepo.INSTANCE;
                var15_16 = 48;
                var16_17 = "OrderDetails";
                var17_18 = true;
                var1_1 = ApiErrorRepo.handleApiError$default((ApiErrorRepo)var12_13, (String)var1_1, (dl2_2)var9_9, var16_17, var17_18, null, null, var15_16, null);
            }
            var4_4.label = var7_7;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

