/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.closet;

import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

public final class WishlistSyncWorker$b$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object = new qg3_2(3, (f80_0)object3);
        ((WishlistSyncWorker$b$a)object).a = object2;
        object2 = Unit.a;
        return ((WishlistSyncWorker$b$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = yn3_0.a;
        object2 = new StringBuilder("wishlistSync: wishlist sync api exception ");
        ((StringBuilder)object2).append(throwable);
        object2 = ((StringBuilder)object2).toString();
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a((String)object2, objectArray);
        ApiErrorRepo.INSTANCE.logApiException(throwable, "BackGround_wishlistSync", false, "", "Forward");
        return Unit.a;
    }
}

