/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2$1;
import com.ril.ajio.services.data.Product.SimilarProductOOSInfo;
import java.util.ArrayList;
import kotlin.Unit;

public final class CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2
implements fs0_2 {
    final /* synthetic */ ArrayList $oosInventoryProduct$inlined;
    final /* synthetic */ String $screenName$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2(fs0_2 fs0_22, CartApiRepo cartApiRepo, ArrayList arrayList, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.this$0 = cartApiRepo;
        this.$oosInventoryProduct$inlined = arrayList;
        this.$screenName$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2$1(this, (f80_0)var2_2);
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
            var1_1 = (SimilarProductOOSInfo)var9_9.b;
            var10_10 = var9_9.a;
            var6_6 = (int)var10_10.d();
            if (var6_6 != 0 && var1_1 != null) {
                var10_10 = this.this$0;
                var11_11 = this.$oosInventoryProduct$inlined;
                var12_13 = CartApiRepo.access$populateOOSWithSimilar((CartApiRepo)var10_10, (SimilarProductOOSInfo)var1_1, var11_11);
            } else {
                var11_12 = ApiErrorRepo.INSTANCE;
                var13_14 = this.$screenName$inlined;
                var14_15 = "Forward";
                var15_16 = "SimilarProductList_2";
                var16_17 = true;
                var11_12.getApiError((dl2_2)var9_9, var15_16, var16_17, var13_14, var14_15);
                var12_13 = false;
                var1_1 = null;
            }
            var1_1 = var12_13;
            var4_4.label = var7_7;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

