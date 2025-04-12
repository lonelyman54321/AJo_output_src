/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from De2$g
 */
public final class de2$g_0
implements gx0_2 {
    public final /* synthetic */ SelectedOrderItem a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ CartOrder c;

    public de2$g_0(qz1_2 qz1_22, CartOrder cartOrder, SelectedOrderItem selectedOrderItem) {
        this.a = selectedOrderItem;
        this.b = qz1_22;
        this.c = cartOrder;
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
            object = this.c;
            n3 = 584;
            object4 = this.a;
            qz1_2 qz1_22 = this.b;
            de2_0.C((SelectedOrderItem)object4, qz1_22, (CartOrder)object, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

