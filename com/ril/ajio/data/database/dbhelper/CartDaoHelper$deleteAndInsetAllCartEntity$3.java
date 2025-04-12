/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import kotlin.Unit;

final class CartDaoHelper$deleteAndInsetAllCartEntity$3
extends qg3_2
implements gx0_2 {
    /* synthetic */ Object L$0;
    int label;

    public CartDaoHelper$deleteAndInsetAllCartEntity$3(f80_0 f80_02) {
        super(3, f80_02);
    }

    public final Object invoke(fs0_2 object, Throwable object2, f80_0 f80_02) {
        object = new CartDaoHelper$deleteAndInsetAllCartEntity$3(f80_02);
        ((CartDaoHelper$deleteAndInsetAllCartEntity$3)object).L$0 = object2;
        object2 = Unit.a;
        return ((CartDaoHelper$deleteAndInsetAllCartEntity$3)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (Throwable)this.L$0;
            yn3_0.a.e((Throwable)object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

