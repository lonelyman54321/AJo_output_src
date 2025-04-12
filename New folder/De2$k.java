/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$k
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public De2$k(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            this.a.getClass();
            object = this.b;
            n3 = (int)(qz1_2.I((SelectedOrderItem)object) ? 1 : 0);
            if (object != null) {
                object = ((SelectedOrderItem)object).getReturnId();
            } else {
                n4 = 0;
                object = null;
            }
            string2 = null;
            de2_0.L(n3 != 0, (String)object, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

