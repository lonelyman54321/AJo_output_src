/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Xp3
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ Xp3(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke() {
        Object object;
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Object object2 = qz1_22.y;
        SelectedOrderItem selectedOrderItem = this.b;
        String string2 = null;
        if (selectedOrderItem != null && (object = selectedOrderItem.getConsignment()) != null && (object = ((Consignment)object).getReturnRequests()) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                ReturnRequest returnRequest = (ReturnRequest)object.next();
                String string3 = returnRequest.getExchangeOrderID();
                if (string3 == null) continue;
                string2 = returnRequest.getExchangeOrderID();
            }
        }
        ((h83_0)object2).setValue(string2);
        object2 = Boolean.TRUE;
        qz1_22.u.setValue(object2);
        object2 = (CartOrder)qz1_22.l.getValue();
        qz1_22.h((CartOrder)object2, 8, selectedOrderItem);
        return Unit.a;
    }
}

