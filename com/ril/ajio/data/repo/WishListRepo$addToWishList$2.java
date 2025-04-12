/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.WishListApi;
import com.ril.ajio.services.network.api.WishListApi$DefaultImpls;
import com.ril.ajio.services.query.QueryCart;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class WishListRepo$addToWishList$2
extends qg3_2
implements Function2 {
    final /* synthetic */ String $addToWishListUrl;
    final /* synthetic */ QueryCart $queryCart;
    final /* synthetic */ String $requestID;
    final /* synthetic */ String $sourceStoreId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WishListRepo this$0;

    public WishListRepo$addToWishList$2(WishListRepo wishListRepo, String string2, QueryCart queryCart, String string3, String string4, f80_0 f80_02) {
        this.this$0 = wishListRepo;
        this.$addToWishListUrl = string2;
        this.$queryCart = queryCart;
        this.$sourceStoreId = string3;
        this.$requestID = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        WishListRepo wishListRepo = this.this$0;
        String string2 = this.$addToWishListUrl;
        QueryCart queryCart = this.$queryCart;
        String string3 = this.$sourceStoreId;
        String string4 = this.$requestID;
        WishListRepo$addToWishList$2 wishListRepo$addToWishList$2 = new WishListRepo$addToWishList$2(wishListRepo, string2, queryCart, string3, string4, f80_02);
        wishListRepo$addToWishList$2.L$0 = object;
        return wishListRepo$addToWishList$2;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (WishListRepo$addToWishList$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((WishListRepo$addToWishList$2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            Object object2;
            Object object3;
            Object object4;
            int n3;
            j90_0 j90_02;
            WishListRepo$addToWishList$2 wishListRepo$addToWishList$2;
            block7: {
                int n4;
                block3: {
                    block4: {
                        block5: {
                            wishListRepo$addToWishList$2 = this;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw illegalStateException;
                    }
                    object4 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    object3 = object4;
                    object4 = object;
                    break block7;
                }
                vl2_2.b(object);
                Object object5 = object4 = this.L$0;
                object5 = (fs0_2)object4;
                object4 = WishListRepo.access$getWishListApi$p(this.this$0);
                object2 = this.$addToWishListUrl;
                Object object6 = WishListRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object6, "access$getUserInformation$p(...)");
                object6 = ServiceUtil.getToken((UserInformation)object6);
                object6 = kp1_0.c("Bearer ", (String)object6);
                String string2 = WishListRepo.access$getClientType$cp();
                String string3 = WishListRepo.access$getClientVersion$cp();
                String string4 = this.$queryCart.getProductCode();
                if (string4 == null) {
                    string4 = "";
                }
                int n8 = wishListRepo$addToWishList$2.$queryCart.getQuantity();
                String string5 = String.valueOf(n8);
                String string6 = wishListRepo$addToWishList$2.$sourceStoreId;
                String string7 = wishListRepo$addToWishList$2.$requestID;
                wishListRepo$addToWishList$2.L$0 = object5;
                wishListRepo$addToWishList$2.label = n4;
                int n10 = 128;
                object3 = object2;
                object2 = object6;
                object6 = string2;
                string2 = string3;
                string3 = string4;
                string4 = string5;
                string5 = string6;
                string6 = null;
                Object object7 = object5;
                object5 = null;
                if ((object4 = WishListApi$DefaultImpls.addToCloset$default((WishListApi)object4, (String)object3, (String)object2, (String)object6, string2, string3, string4, string5, false, string7, this, n10, null)) == j90_02) {
                    return j90_02;
                }
                object3 = object7;
            }
            object2 = null;
            wishListRepo$addToWishList$2.L$0 = null;
            wishListRepo$addToWishList$2.label = n3;
            object4 = object3.emit(object4, wishListRepo$addToWishList$2);
            if (object4 == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

