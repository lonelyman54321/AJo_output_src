/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.OrderDetailRepo;
import com.ril.ajio.services.data.Order.NudgeInformation;
import com.ril.ajio.services.network.api.OrderDetailApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class OrderDetailRepo$highReturn$1
extends qg3_2
implements Function2 {
    final /* synthetic */ NudgeInformation $nudgeInformation;
    final /* synthetic */ String $token;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderDetailRepo this$0;

    public OrderDetailRepo$highReturn$1(OrderDetailRepo orderDetailRepo, String string2, String string3, NudgeInformation nudgeInformation, f80_0 f80_02) {
        this.this$0 = orderDetailRepo;
        this.$url = string2;
        this.$token = string3;
        this.$nudgeInformation = nudgeInformation;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        OrderDetailRepo orderDetailRepo = this.this$0;
        String string2 = this.$url;
        String string3 = this.$token;
        NudgeInformation nudgeInformation = this.$nudgeInformation;
        OrderDetailRepo$highReturn$1 orderDetailRepo$highReturn$1 = new OrderDetailRepo$highReturn$1(orderDetailRepo, string2, string3, nudgeInformation, f80_02);
        orderDetailRepo$highReturn$1.L$0 = object;
        return orderDetailRepo$highReturn$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (OrderDetailRepo$highReturn$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((OrderDetailRepo$highReturn$1)object).invokeSuspend(object2);
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
                OrderDetailApi orderDetailApi = OrderDetailRepo.access$getOrderDetailApi$p(this.this$0);
                String string2 = this.$url;
                object = this.$token;
                String string3 = kp1_0.c("Bearer ", (String)object);
                String string4 = OrderDetailRepo.access$getClientType$cp();
                Intrinsics.checkNotNullExpressionValue(string4, "access$getClientType$cp(...)");
                String string5 = OrderDetailRepo.access$getClientVersion$cp();
                NudgeInformation nudgeInformation = this.$nudgeInformation;
                this.L$0 = object2;
                this.label = n3;
                String string6 = "NudgeInformation";
                object = orderDetailApi.highReturn(string2, string3, string4, string5, string6, nudgeInformation, this);
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

