/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.closet;

import com.ril.ajio.closet.WishlistSyncWorker$b$a;
import com.ril.ajio.closet.WishlistSyncWorker$b$b;
import com.ril.ajio.data.repo.WishListRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class WishlistSyncWorker$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ WishListRepo b;

    public WishlistSyncWorker$b(WishListRepo wishListRepo, f80_0 f80_02) {
        this.b = wishListRepo;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        WishListRepo wishListRepo = this.b;
        object = new WishlistSyncWorker$b(wishListRepo, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (WishlistSyncWorker$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((WishlistSyncWorker$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b.getWishlistProducts();
            int n7 = 3;
            WishlistSyncWorker$b$a wishlistSyncWorker$b$a = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, wishlistSyncWorker$b$a);
            object = WishlistSyncWorker$b$b.a;
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

