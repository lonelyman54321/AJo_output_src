/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2;
import com.ril.ajio.services.data.Cart.Cart;
import java.util.HashSet;
import kotlin.Unit;

public final class CartApiRepo$getInternalWalletOnCart$$inlined$map$1
implements es0_2 {
    final /* synthetic */ Cart $cartResp$inlined;
    final /* synthetic */ HashSet $internalWalletSelectedViews$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public CartApiRepo$getInternalWalletOnCart$$inlined$map$1(es0_2 es0_22, Cart cart, HashSet hashSet) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$cartResp$inlined = cart;
        this.$internalWalletSelectedViews$inlined = hashSet;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        Cart cart = this.$cartResp$inlined;
        HashSet hashSet = this.$internalWalletSelectedViews$inlined;
        CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2 cartApiRepo$getInternalWalletOnCart$$inlined$map$1$2 = new CartApiRepo$getInternalWalletOnCart$$inlined$map$1$2((fs0_2)object, cart, hashSet);
        if ((object = es0_22.collect(cartApiRepo$getInternalWalletOnCart$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

