/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$n
implements gx0_2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;

    public De2$n(qz1_2 qz1_22, CartOrder cartOrder, SelectedOrderItem selectedOrderItem) {
        this.a = cartOrder;
        this.b = qz1_22;
        this.c = selectedOrderItem;
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
            n4 = 0;
            object = null;
            object3 = this.a;
            string2 = object3 != null ? ((CartOrder)object3).getCode() : null;
            if (object3 != null) {
                object = ((CartOrder)object3).getCreated();
            }
            object = k7.c((String)object, "dd MMM yyyy", "yyyy-MM-dd'T'HH:mm:ssZZZZ");
            this.b.getClass();
            object3 = this.c;
            n3 = (int)(qz1_2.I((SelectedOrderItem)object3) ? 1 : 0);
            de2_0.o(string2, (String)object, n3 != 0, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

