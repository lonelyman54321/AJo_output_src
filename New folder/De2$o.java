/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$o
implements gx0_2 {
    public final /* synthetic */ SelectedOrderItem a;
    public final /* synthetic */ qz1_2 b;

    public De2$o(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = selectedOrderItem;
        this.b = qz1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.a;
            if (object == null || (object3 = ((SelectedOrderItem)object).getOrderStatus()) == null) {
                object3 = "";
            }
            object4 = this.b;
            object4.getClass();
            n4 = (int)(qz1_2.I((SelectedOrderItem)object) ? 1 : 0);
            int n7 = 8;
            de2_0.r(n7, (b30_0)object2, (qz1_2)object4, (String)object3, n4 != 0);
        }
        return Unit.a;
    }
}

