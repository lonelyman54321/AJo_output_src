/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.network.api.CartApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CartApiRepo$getProductSize$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $productSizeURL;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$getProductSize$1(CartApiRepo cartApiRepo, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.this$0 = cartApiRepo;
        this.$productSizeURL = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$productSizeURL;
        CartApiRepo$getProductSize$1 cartApiRepo$getProductSize$1 = new CartApiRepo$getProductSize$1(cartApiRepo, ref$ObjectRef, f80_02);
        cartApiRepo$getProductSize$1.L$0 = object;
        return cartApiRepo$getProductSize$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$getProductSize$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$getProductSize$1)object).invokeSuspend(object2);
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
                Object object3 = object = this.$productSizeURL.element;
                object3 = (String)object;
                object = fm_1.a(this.this$0, "access$getUserInformation$p(...)");
                String string2 = kp1_0.c("Bearer ", (String)object);
                String string3 = CartApiRepo.access$getClientType$cp();
                Intrinsics.checkNotNullExpressionValue(string3, "access$getClientType$cp(...)");
                String string4 = CartApiRepo.access$getClientVersion$cp();
                this.L$0 = object2;
                this.label = n3;
                String string5 = "CartProductsSizeVariantAuth";
                object = cartApi.getProductSize((String)object3, string2, string3, string4, string5, this);
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

