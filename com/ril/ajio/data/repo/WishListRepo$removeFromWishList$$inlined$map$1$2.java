/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.data.repo.WishListRepo$removeFromWishList$$inlined$map$1$2$1;
import kotlin.Unit;

public final class WishListRepo$removeFromWishList$$inlined$map$1$2
implements fs0_2 {
    final /* synthetic */ String $requestID$inlined;
    final /* synthetic */ fs0_2 $this_unsafeFlow;
    final /* synthetic */ WishListRepo this$0;

    public WishListRepo$removeFromWishList$$inlined$map$1$2(fs0_2 fs0_22, WishListRepo wishListRepo, String string2) {
        this.$this_unsafeFlow = fs0_22;
        this.this$0 = wishListRepo;
        this.$requestID$inlined = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof WishListRepo$removeFromWishList$$inlined$map$1$2$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (WishListRepo$removeFromWishList$$inlined$map$1$2$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new WishListRepo$removeFromWishList$$inlined$map$1$2$1(this, (f80_0)var2_2);
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
            var9_9 = (il2_2)var1_1.b;
            if (var9_9 != null && (var11_11 = (var10_10 = var1_1.a).d())) {
                var1_1 = DataCallback.Companion.onSuccess(var9_9);
            } else {
                var9_9 = this.this$0;
                var10_10 = this.$requestID$inlined;
                var1_1 = WishListRepo.access$parseApiError((WishListRepo)var9_9, (dl2_2)var1_1, (String)var10_10);
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

