/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dbhelper;

import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import com.ril.ajio.data.database.entity.CartEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class CartDaoHelper$addItemToCartDao$1
extends qg3_2
implements Function2 {
    final /* synthetic */ boolean $isDod;
    final /* synthetic */ String $price;
    final /* synthetic */ String $productCode;
    private /* synthetic */ Object L$0;
    int label;

    public CartDaoHelper$addItemToCartDao$1(String string2, String string3, boolean bl2, f80_0 f80_02) {
        this.$productCode = string2;
        this.$price = string3;
        this.$isDod = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.$productCode;
        String string3 = this.$price;
        boolean bl2 = this.$isDod;
        CartDaoHelper$addItemToCartDao$1 cartDaoHelper$addItemToCartDao$1 = new CartDaoHelper$addItemToCartDao$1(string2, string3, bl2, f80_02);
        cartDaoHelper$addItemToCartDao$1.L$0 = object;
        return cartDaoHelper$addItemToCartDao$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartDaoHelper$addItemToCartDao$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartDaoHelper$addItemToCartDao$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block9: {
                float f5;
                String string2;
                block5: {
                    block6: {
                        block7: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block5;
                            if (n7 == n3) break block6;
                            if (n7 != n4) break block7;
                            vl2_2.b(object);
                            break block8;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    break block9;
                }
                vl2_2.b(object);
                object2 = object = this.L$0;
                object2 = (fs0_2)object;
                Object object3 = this.$productCode;
                if (object3 == null) {
                    object3 = "";
                }
                if ((string2 = this.$price) != null) {
                    f5 = Float.parseFloat(string2);
                } else {
                    f5 = 0.0f;
                    string2 = null;
                }
                boolean bl2 = this.$isDod;
                object = new CartEntity((String)object3, f5, bl2);
                object3 = CartDaoHelper.INSTANCE;
                this.L$0 = object2;
                this.label = n3;
                object = CartDaoHelper.access$insertCartEntity((CartDaoHelper)object3, (CartEntity)object, this);
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

