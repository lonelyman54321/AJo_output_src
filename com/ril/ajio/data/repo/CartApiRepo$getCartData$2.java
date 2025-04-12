/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.network.api.CartApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CartApiRepo$getCartData$2
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $adId;
    final /* synthetic */ Ref$ObjectRef $cartDataURL;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$getCartData$2(CartApiRepo cartApiRepo, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, f80_0 f80_02) {
        this.this$0 = cartApiRepo;
        this.$cartDataURL = ref$ObjectRef;
        this.$adId = ref$ObjectRef2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$cartDataURL;
        Ref$ObjectRef ref$ObjectRef2 = this.$adId;
        CartApiRepo$getCartData$2 cartApiRepo$getCartData$2 = new CartApiRepo$getCartData$2(cartApiRepo, ref$ObjectRef, ref$ObjectRef2, f80_02);
        cartApiRepo$getCartData$2.L$0 = object;
        return cartApiRepo$getCartData$2;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$getCartData$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$getCartData$2)object).invokeSuspend(object2);
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
                CartApi cartApi = CartApiRepo.access$getCartDataApi$p(this.this$0);
                Object object3 = object = this.$cartDataURL.element;
                object3 = (String)object;
                object = fm_1.a(this.this$0, "access$getUserInformation$p(...)");
                String string2 = kp1_0.c("Bearer ", (String)object);
                Object object4 = object = this.$adId.element;
                object4 = (String)object;
                this.L$0 = object2;
                this.label = n3;
                String string3 = "GetCartList";
                object = cartApi.getCartData((String)object3, string2, (String)object4, string3, this);
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

