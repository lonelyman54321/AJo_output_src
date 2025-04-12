/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CartApiRepo$checkForPanVerification$$inlined$map$1$2$1;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class CartApiRepo$checkForPanVerification$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public CartApiRepo$checkForPanVerification$$inlined$map$1$2(fs0_2 fs0_22) {
        this.$this_unsafeFlow = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof CartApiRepo$checkForPanVerification$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (CartApiRepo$checkForPanVerification$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new CartApiRepo$checkForPanVerification$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var1_1 = (dl2_2)var1_1;
            var9_9 = (Unit)var1_1.b;
            var10_10 = var1_1.a;
            var11_11 = var10_10.d();
            if (var11_11 && var9_9 != null) {
                var1_1 = DataCallback.Companion.onSuccess(var9_9);
            } else {
                var9_9 = ApiErrorRepo.INSTANCE;
                var12_12 = String.valueOf(var1_1.c);
                var13_13 = "panCardVerificatioApi";
                var10_10 = var9_9;
                var14_14 = var1_1;
                var10_10 = ApiErrorRepo.logApiError$default((ApiErrorRepo)var9_9, (String)var12_12, (dl2_2)var1_1, var13_13, true, "PAN verification screen", null, 32, null);
                DataCallback.Companion.onFailed((DataError)var10_10);
                var15_15 = 24;
                var14_14 = "panCardVerificatioApi";
                var16_16 = true;
                var10_10 = var9_9;
                var12_12 = var1_1;
                var1_1 = ApiErrorRepo.handleApiError$default((ApiErrorRepo)var9_9, (dl2_2)var1_1, (String)var14_14, var16_16, null, null, var15_15, null);
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

