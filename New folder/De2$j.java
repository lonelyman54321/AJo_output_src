/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$j
implements gx0_2 {
    public final /* synthetic */ CartDeliveryAddress a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;

    public De2$j(CartDeliveryAddress cartDeliveryAddress, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = cartDeliveryAddress;
        this.b = qz1_22;
        this.c = selectedOrderItem;
    }

    /*
     * Enabled aggressive block sorting
     */
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
            return Unit.a;
        }
        object = this.a;
        if (object == null || (object3 = ((CartDeliveryAddress)object).getPhone()) == null) {
            object3 = "NA";
        }
        Object object4 = object3;
        if (object == null) return Unit.a;
        object3 = this.b;
        object3.getClass();
        string2 = qz1_2.m((CartDeliveryAddress)object);
        String string3 = V4.a((CartDeliveryAddress)object);
        qz1_2 qz1_22 = this.b;
        SelectedOrderItem selectedOrderItem = this.c;
        int n7 = 36864;
        de2_0.d(string2, string3, (String)object4, qz1_22, selectedOrderItem, (b30_0)object2, n7);
        n4 = 8;
        float f5 = n4;
        n3 = 6;
        vb2.h(f5, (b30_0)object2, n3);
        return Unit.a;
    }
}

