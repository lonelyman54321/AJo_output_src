/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.OrderListApiRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.OrderListApi;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

final class OrderListApiRepo$getOrderList$2
extends qg3_2
implements Function2 {
    final /* synthetic */ boolean $isNewOrderEnabled;
    final /* synthetic */ boolean $isRefundConfigEnabled;
    final /* synthetic */ Ref$ObjectRef $orderListURL;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderListApiRepo this$0;

    public OrderListApiRepo$getOrderList$2(OrderListApiRepo orderListApiRepo, Ref$ObjectRef ref$ObjectRef, boolean bl2, boolean bl3, f80_0 f80_02) {
        this.this$0 = orderListApiRepo;
        this.$orderListURL = ref$ObjectRef;
        this.$isRefundConfigEnabled = bl2;
        this.$isNewOrderEnabled = bl3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        OrderListApiRepo orderListApiRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$orderListURL;
        boolean bl2 = this.$isRefundConfigEnabled;
        boolean bl3 = this.$isNewOrderEnabled;
        OrderListApiRepo$getOrderList$2 orderListApiRepo$getOrderList$2 = new OrderListApiRepo$getOrderList$2(orderListApiRepo, ref$ObjectRef, bl2, bl3, f80_02);
        orderListApiRepo$getOrderList$2.L$0 = object;
        return orderListApiRepo$getOrderList$2;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (OrderListApiRepo$getOrderList$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((OrderListApiRepo$getOrderList$2)object).invokeSuspend(object2);
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
                OrderListApi orderListApi = OrderListApiRepo.access$getOrderListApi$p(this.this$0);
                Object object3 = object = this.$orderListURL.element;
                object3 = (String)object;
                object = OrderListApiRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object, "access$getUserInformation$p(...)");
                object = ServiceUtil.getToken((UserInformation)object);
                String string2 = kp1_0.c("Bearer ", (String)object);
                String string3 = OrderListApiRepo.access$getClientType$cp();
                Intrinsics.checkNotNullExpressionValue(string3, "access$getClientType$cp(...)");
                String string4 = OrderListApiRepo.access$getClientVersion$cp();
                boolean bl2 = this.$isRefundConfigEnabled;
                boolean bl3 = this.$isNewOrderEnabled;
                this.L$0 = object2;
                this.label = n3;
                String string5 = "getOrderList";
                object = orderListApi.getOrderList((String)object3, string2, string3, string4, string5, bl2, bl3, this);
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

