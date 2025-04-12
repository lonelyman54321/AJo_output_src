/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.CartDaoHelper$getAllCartEntity$$inlined$map$1$2;
import java.util.HashMap;
import kotlin.Unit;

public final class CartDaoHelper$getAllCartEntity$$inlined$map$1
implements es0_2 {
    final /* synthetic */ HashMap $cartEntityMap$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public CartDaoHelper$getAllCartEntity$$inlined$map$1(es0_2 es0_22, HashMap hashMap) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$cartEntityMap$inlined = hashMap;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        HashMap hashMap = this.$cartEntityMap$inlined;
        CartDaoHelper$getAllCartEntity$$inlined$map$1$2 cartDaoHelper$getAllCartEntity$$inlined$map$1$2 = new CartDaoHelper$getAllCartEntity$$inlined$map$1$2((fs0_2)object, hashMap);
        if ((object = es0_22.collect(cartDaoHelper$getAllCartEntity$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

