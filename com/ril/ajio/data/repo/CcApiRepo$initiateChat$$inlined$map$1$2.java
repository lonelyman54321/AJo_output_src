/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CcApiRepo$initiateChat$$inlined$map$1$2$1;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import kotlin.Unit;

public final class CcApiRepo$initiateChat$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public CcApiRepo$initiateChat$$inlined$map$1$2(fs0_2 fs0_22) {
        this.$this_unsafeFlow = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof CcApiRepo$initiateChat$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (CcApiRepo$initiateChat$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new CcApiRepo$initiateChat$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var1_1 = (InitiateChat)var9_9.b;
            var10_10 = var9_9.a;
            var6_6 = (int)var10_10.d();
            if (var6_6 != 0 && var1_1 != null) {
                var10_10 = DataCallback.Companion;
                var1_1 = var10_10.onSuccess(var1_1);
            } else {
                var11_11 = ApiErrorRepo.INSTANCE;
                var12_12 = 24;
                var13_13 = "initiate_chat";
                var14_14 = true;
                var1_1 = ApiErrorRepo.handleApiError$default(var11_11, (dl2_2)var9_9, var13_13, var14_14, null, null, var12_12, null);
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

