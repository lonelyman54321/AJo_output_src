/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from De2$h
 */
public final class de2$h_0
implements gx0_2 {
    public final /* synthetic */ SelectedOrderItem a;

    public de2$h_0(SelectedOrderItem selectedOrderItem) {
        this.a = selectedOrderItem;
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
            object = this.a;
            if (object != null && (object = ((SelectedOrderItem)object).getConsignment()) != null && (object = ((Consignment)object).getReturnRequests()) != null) {
                n3 = 0;
                object3 = null;
                object = (ReturnRequest)((ArrayList)object).get(0);
            } else {
                n4 = 0;
                object = null;
            }
            n3 = 8;
            de2_0.J((ReturnRequest)object, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

