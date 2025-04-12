/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2;
import java.util.List;
import kotlin.Unit;

public final class CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1
implements es0_2 {
    final /* synthetic */ List $cartEntityList$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1(es0_2 es0_22, List list) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$cartEntityList$inlined = list;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        List list = this.$cartEntityList$inlined;
        CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2 cartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2 = new CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2((fs0_2)object, list);
        if ((object = es0_22.collect(cartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

