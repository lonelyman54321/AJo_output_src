/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class CartApiRepo$getInventoryData$1
extends qg3_2
implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$getInventoryData$1(CartApiRepo cartApiRepo, f80_0 f80_02) {
        this.this$0 = cartApiRepo;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this.this$0;
        CartApiRepo$getInventoryData$1 cartApiRepo$getInventoryData$1 = new CartApiRepo$getInventoryData$1(cartApiRepo, f80_02);
        cartApiRepo$getInventoryData$1.L$0 = object;
        return cartApiRepo$getInventoryData$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$getInventoryData$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$getInventoryData$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.L$0;
                object2 = (fs0_2)object;
                object = this.this$0;
                this.L$0 = object2;
                this.label = n3;
                object = CartApiRepo.access$callInventoryApi((CartApiRepo)object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            this.L$0 = null;
            this.label = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

