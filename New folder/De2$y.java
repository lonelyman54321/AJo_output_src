/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class De2$y
implements Function2 {
    public final /* synthetic */ SelectedOrderItem a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ CartDeliveryAddress e;

    public De2$y(SelectedOrderItem selectedOrderItem, boolean bl2, boolean bl3, qz1_2 qz1_22, CartDeliveryAddress cartDeliveryAddress) {
        this.a = selectedOrderItem;
        this.b = bl2;
        this.c = bl3;
        this.d = qz1_22;
        this.e = cartDeliveryAddress;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.a;
            if (object != null && (object2 = ((SelectedOrderItem)object).getConsignment()) != null) {
                object2 = ((Consignment)object2).getShipmentStatus();
            } else {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            n4 = (int)("delivered".equalsIgnoreCase((String)object2) ? 1 : 0);
            int n7 = -471181174;
            object3.K(n7);
            Object object4 = this.d;
            if (n4 != 0 && (n4 = (int)(((h40_0)(object2 = h40_0.a)).j2() ? 1 : 0)) != 0 && ((n4 = (int)(this.b ? 1 : 0)) != 0 || (n4 = (int)(this.c ? 1 : 0)) != 0)) {
                km2_0.b((qz1_2)object4, (SelectedOrderItem)object, (b30_0)object3, 72);
                n4 = 7;
                f5 = n4;
                int n8 = 6;
                vb2.h(f5, (b30_0)object3, n8);
            }
            object3.E();
            object4.getClass();
            n3 = (int)(qz1_2.I((SelectedOrderItem)object) ? 1 : 0);
            if (n3 != 0) {
                object = this.e;
                if (object == null || (object2 = ((CartDeliveryAddress)object).getPhone()) == null) {
                    object2 = "NA";
                }
                if (object != null) {
                    object4 = qz1_2.m((CartDeliveryAddress)object);
                    String string2 = V4.a((CartDeliveryAddress)object);
                    SelectedOrderItem selectedOrderItem = this.a;
                    int n10 = 4096;
                    de2_0.v((String)object4, string2, (String)object2, selectedOrderItem, (b30_0)object3, n10);
                }
            }
        }
        return Unit.a;
    }
}

