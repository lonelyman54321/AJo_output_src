/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from De2$f
 */
public final class de2$f_0
implements gx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ CartOrder c;

    public de2$f_0(List list, qz1_2 qz1_22, CartOrder cartOrder) {
        this.a = list;
        this.b = qz1_22;
        this.c = cartOrder;
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
            int n7;
            Object object4;
            block3: {
                object = this.a;
                object3 = "selectedOrdersList";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    boolean bl2;
                    object3 = (SelectedOrderItem)object.next();
                    string2 = ((SelectedOrderItem)object3).getOrderStatus();
                    n7 = (int)(kotlin.text.b.i(string2, (String)(object4 = "Cancelled"), bl2 = true) ? 1 : 0);
                    if (n7 == 0) continue;
                    break block3;
                }
                n3 = 0;
                object3 = null;
            }
            object = this.c;
            n7 = 584;
            object4 = this.b;
            de2_0.C((SelectedOrderItem)object3, (qz1_2)object4, (CartOrder)object, (b30_0)object2, n7);
        }
        return Unit.a;
    }
}

