/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.AddressRepo$getDropAtStoreListNew$$inlined$map$1$2;
import kotlin.Unit;

public final class AddressRepo$getDropAtStoreListNew$$inlined$map$1
implements es0_2 {
    final /* synthetic */ String $requestID$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;
    final /* synthetic */ AddressRepo this$0;

    public AddressRepo$getDropAtStoreListNew$$inlined$map$1(es0_2 es0_22, AddressRepo addressRepo, String string2) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.this$0 = addressRepo;
        this.$requestID$inlined = string2;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        AddressRepo addressRepo = this.this$0;
        String string2 = this.$requestID$inlined;
        AddressRepo$getDropAtStoreListNew$$inlined$map$1$2 addressRepo$getDropAtStoreListNew$$inlined$map$1$2 = new AddressRepo$getDropAtStoreListNew$$inlined$map$1$2((fs0_2)object, addressRepo, string2);
        if ((object = es0_22.collect(addressRepo$getDropAtStoreListNew$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

