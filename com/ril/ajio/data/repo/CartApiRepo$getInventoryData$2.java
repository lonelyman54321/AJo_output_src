/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

final class CartApiRepo$getInventoryData$2
extends qg3_2
implements gx0_2 {
    /* synthetic */ Object L$0;
    int label;

    public CartApiRepo$getInventoryData$2(f80_0 f80_02) {
        super(3, f80_02);
    }

    public final Object invoke(fs0_2 object, Throwable object2, f80_0 f80_02) {
        object = new CartApiRepo$getInventoryData$2(f80_02);
        ((CartApiRepo$getInventoryData$2)object).L$0 = object2;
        object2 = Unit.a;
        return ((CartApiRepo$getInventoryData$2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object2 = object = this.L$0;
            object2 = (Throwable)object;
            ApiErrorRepo.INSTANCE.logApiException((Throwable)object2, "cartInventoryCheck", true, "bag screen", "Forward");
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

