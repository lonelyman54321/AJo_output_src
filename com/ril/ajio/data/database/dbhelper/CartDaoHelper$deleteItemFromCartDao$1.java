/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class CartDaoHelper$deleteItemFromCartDao$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $productCode;
    private /* synthetic */ Object L$0;
    int label;

    public CartDaoHelper$deleteItemFromCartDao$1(String string2, f80_0 f80_02) {
        this.$productCode = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.$productCode;
        CartDaoHelper$deleteItemFromCartDao$1 cartDaoHelper$deleteItemFromCartDao$1 = new CartDaoHelper$deleteItemFromCartDao$1(string2, f80_02);
        cartDaoHelper$deleteItemFromCartDao$1.L$0 = object;
        return cartDaoHelper$deleteItemFromCartDao$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartDaoHelper$deleteItemFromCartDao$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartDaoHelper$deleteItemFromCartDao$1)object).invokeSuspend(object2);
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
                object = CartDaoHelper.INSTANCE;
                String string2 = this.$productCode;
                this.L$0 = object2;
                this.label = n3;
                object = CartDaoHelper.access$deleteCartEntity((CartDaoHelper)object, string2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = Boolean.TRUE;
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

