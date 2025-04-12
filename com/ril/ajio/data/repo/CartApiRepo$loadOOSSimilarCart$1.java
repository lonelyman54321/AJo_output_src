/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class CartApiRepo$loadOOSSimilarCart$1
extends qg3_2
implements Function2 {
    final /* synthetic */ ArrayList $oosInventoryProduct;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$loadOOSSimilarCart$1(CartApiRepo cartApiRepo, ArrayList arrayList, f80_0 f80_02) {
        this.this$0 = cartApiRepo;
        this.$oosInventoryProduct = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this.this$0;
        ArrayList arrayList = this.$oosInventoryProduct;
        CartApiRepo$loadOOSSimilarCart$1 cartApiRepo$loadOOSSimilarCart$1 = new CartApiRepo$loadOOSSimilarCart$1(cartApiRepo, arrayList, f80_02);
        cartApiRepo$loadOOSSimilarCart$1.L$0 = object;
        return cartApiRepo$loadOOSSimilarCart$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$loadOOSSimilarCart$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$loadOOSSimilarCart$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (fs0_2)this.L$0;
            Object object2 = this.this$0;
            ArrayList arrayList = this.$oosInventoryProduct;
            object2 = CartApiRepo.access$getSimilarCartReqInfo((CartApiRepo)object2, arrayList);
            this.label = n4;
            object = object.emit(object2, this);
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

