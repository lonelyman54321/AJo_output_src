/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.network.api.CartApi;
import com.ril.ajio.services.network.api.CartApi$DefaultImpls;
import com.ril.ajio.services.query.QueryCart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CartApiRepo$moveToCloset$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $addToClosetURL;
    final /* synthetic */ QueryCart $queryCart;
    final /* synthetic */ String $sourceStoreId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$moveToCloset$1(CartApiRepo cartApiRepo, Ref$ObjectRef ref$ObjectRef, QueryCart queryCart, String string2, f80_0 f80_02) {
        this.this$0 = cartApiRepo;
        this.$addToClosetURL = ref$ObjectRef;
        this.$queryCart = queryCart;
        this.$sourceStoreId = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$addToClosetURL;
        QueryCart queryCart = this.$queryCart;
        String string2 = this.$sourceStoreId;
        CartApiRepo$moveToCloset$1 cartApiRepo$moveToCloset$1 = new CartApiRepo$moveToCloset$1(cartApiRepo, ref$ObjectRef, queryCart, string2, f80_02);
        cartApiRepo$moveToCloset$1.L$0 = object;
        return cartApiRepo$moveToCloset$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$moveToCloset$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$moveToCloset$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            String string2;
            Object object2;
            Object object3;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            CartApiRepo$moveToCloset$1 cartApiRepo$moveToCloset$1 = this;
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
                        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw illegalStateException;
                    }
                    object3 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    object2 = object3;
                    object3 = object;
                    break block6;
                }
                vl2_2.b(object);
                object2 = object3 = this.L$0;
                object2 = (fs0_2)object3;
                object3 = CartApiRepo.access$getCartDataApi$p(this.this$0);
                String string3 = (String)this.$addToClosetURL.element;
                String string4 = this.$queryCart.getProductCode();
                int n8 = this.$queryCart.getQuantity();
                String string5 = String.valueOf(n8);
                String string6 = fm_1.a(this.this$0, "access$getUserInformation$p(...)");
                string6 = kp1_0.c("Bearer ", string6);
                String string7 = this.$sourceStoreId;
                this.L$0 = object2;
                this.label = n3;
                int n10 = 64;
                string2 = string3;
                string3 = string4;
                string4 = string5;
                string5 = string6;
                string6 = "AddtoCloset";
                object3 = CartApi$DefaultImpls.addToCloset2$default((CartApi)object3, string2, string3, string4, string5, string6, string7, false, this, n10, null);
                if (object3 == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            string2 = null;
            cartApiRepo$moveToCloset$1.L$0 = null;
            cartApiRepo$moveToCloset$1.label = n4;
            object3 = object2.emit(object3, this);
            if (object3 == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

