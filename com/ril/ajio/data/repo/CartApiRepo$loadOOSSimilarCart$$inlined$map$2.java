/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2;
import java.util.ArrayList;
import kotlin.Unit;

public final class CartApiRepo$loadOOSSimilarCart$$inlined$map$2
implements es0_2 {
    final /* synthetic */ ArrayList $oosInventoryProduct$inlined;
    final /* synthetic */ String $screenName$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$loadOOSSimilarCart$$inlined$map$2(es0_2 es0_22, CartApiRepo cartApiRepo, ArrayList arrayList, String string2) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.this$0 = cartApiRepo;
        this.$oosInventoryProduct$inlined = arrayList;
        this.$screenName$inlined = string2;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        CartApiRepo cartApiRepo = this.this$0;
        ArrayList arrayList = this.$oosInventoryProduct$inlined;
        String string2 = this.$screenName$inlined;
        CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2 cartApiRepo$loadOOSSimilarCart$$inlined$map$2$2 = new CartApiRepo$loadOOSSimilarCart$$inlined$map$2$2((fs0_2)object, cartApiRepo, arrayList, string2);
        if ((object = es0_22.collect(cartApiRepo$loadOOSSimilarCart$$inlined$map$2$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

