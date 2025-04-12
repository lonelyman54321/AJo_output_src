/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.OrderDetailRepo;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class QZ1$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public QZ1$c(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, String string2, String string3, f80_0 f80_02) {
        this.b = qz1_22;
        this.c = selectedOrderItem;
        this.d = string2;
        this.e = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        String string3 = this.e;
        qz1_2 qz1_22 = this.b;
        SelectedOrderItem selectedOrderItem = this.c;
        object = new QZ1$c(qz1_22, selectedOrderItem, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (QZ1$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((QZ1$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            qz1_2 qz1_22;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            qz1_22 = this.b;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = qz1_22.c;
                object2 = Boolean.TRUE;
                ((h83_0)object).setValue(object2);
                qz1_22.F = object = this.c;
                object = qz1_22.q0;
                String string2 = ((UserInformation)((hh3_2)object).getValue()).getUserId();
                object2 = "getUserId(...)";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
                String string3 = ServiceUtil.getToken((UserInformation)((hh3_2)object).getValue());
                this.a = n3;
                String string4 = this.d;
                String string5 = this.e;
                OrderDetailRepo orderDetailRepo = qz1_22.b;
                object = orderDetailRepo.getReturnOrderItemDetails(string4, string5, string2, string3, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (es0_2)object;
            n3 = 0;
            object2 = new QZ1$c$a(qz1_22, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = new QZ1$c$b(qz1_22);
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

