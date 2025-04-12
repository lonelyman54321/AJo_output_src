/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.CartDaoHelper$insertCartEntity$$inlined$map$1$2;
import com.ril.ajio.data.database.entity.CartEntity;
import kotlin.Unit;

public final class CartDaoHelper$insertCartEntity$$inlined$map$1
implements es0_2 {
    final /* synthetic */ CartEntity $cartEntity$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public CartDaoHelper$insertCartEntity$$inlined$map$1(es0_2 es0_22, CartEntity cartEntity) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$cartEntity$inlined = cartEntity;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        CartEntity cartEntity = this.$cartEntity$inlined;
        CartDaoHelper$insertCartEntity$$inlined$map$1$2 cartDaoHelper$insertCartEntity$$inlined$map$1$2 = new CartDaoHelper$insertCartEntity$$inlined$map$1$2((fs0_2)object, cartEntity);
        if ((object = es0_22.collect(cartDaoHelper$insertCartEntity$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

