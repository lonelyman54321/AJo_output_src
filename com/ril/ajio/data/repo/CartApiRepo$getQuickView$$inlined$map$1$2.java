/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.CartApiRepo$getQuickView$$inlined$map$1$2$1;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class CartApiRepo$getQuickView$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $screenName$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;

    public CartApiRepo$getQuickView$$inlined$map$1$2(fs0_2 fs0_22, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.$screenName$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof CartApiRepo$getQuickView$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (CartApiRepo$getQuickView$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new CartApiRepo$getQuickView$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var1_1 = (QuickViewProduct)var9_9.b;
            var10_10 = var9_9.a;
            var6_6 = (int)var10_10.d();
            if (var6_6 != 0 && var1_1 != null) {
                var10_10 = var1_1.getProducts();
                if (var10_10 != null) {
                    var10_10 = var1_1.getProducts();
                    Intrinsics.checkNotNull(var10_10);
                    var10_10 = var10_10.iterator();
                    while (var11_11 = var10_10.hasNext()) {
                        var12_12 = (Product)var10_10.next();
                        Y63.g(var12_12);
                    }
                }
                var10_10 = DataCallback.Companion;
                var1_1 = var10_10.onSuccess(var1_1);
            } else {
                var12_13 = ApiErrorRepo.INSTANCE;
                var13_14 = this.$screenName$inlined;
                var14_15 = "Forward";
                var15_16 = "GteQuickView";
                var16_17 = true;
                var1_1 = var12_13.handleApiError((dl2_2)var9_9, var15_16, var16_17, var13_14, var14_15);
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

