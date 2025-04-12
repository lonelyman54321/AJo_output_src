/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.WishListApi;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class WishListRepo$removeFromWishList$2
extends qg3_2
implements Function2 {
    final /* synthetic */ String $requestID;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WishListRepo this$0;

    public WishListRepo$removeFromWishList$2(WishListRepo wishListRepo, String string2, String string3, f80_0 f80_02) {
        this.this$0 = wishListRepo;
        this.$url = string2;
        this.$requestID = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        WishListRepo wishListRepo = this.this$0;
        String string2 = this.$url;
        String string3 = this.$requestID;
        WishListRepo$removeFromWishList$2 wishListRepo$removeFromWishList$2 = new WishListRepo$removeFromWishList$2(wishListRepo, string2, string3, f80_02);
        wishListRepo$removeFromWishList$2.L$0 = object;
        return wishListRepo$removeFromWishList$2;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (WishListRepo$removeFromWishList$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((WishListRepo$removeFromWishList$2)object).invokeSuspend(object2);
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
                WishListApi wishListApi = WishListRepo.access$getWishListApi$p(this.this$0);
                String string2 = this.$url;
                object = WishListRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object, "access$getUserInformation$p(...)");
                object = ServiceUtil.getToken((UserInformation)object);
                String string3 = kp1_0.c("Bearer ", (String)object);
                String string4 = WishListRepo.access$getClientType$cp();
                String string5 = WishListRepo.access$getClientVersion$cp();
                String string6 = this.$requestID;
                this.L$0 = object2;
                this.label = n3;
                object = wishListApi.removeFromCloset(string2, string3, string4, string5, string6, this);
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

