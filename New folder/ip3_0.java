/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ip3
 */
public final class ip3_0
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ ip3_0(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Serializable serializable = Boolean.TRUE;
        qz1_22.t.setValue(serializable);
        serializable = (CartOrder)qz1_22.l.getValue();
        SelectedOrderItem selectedOrderItem = this.b;
        qz1_22.h((CartOrder)serializable, 6, selectedOrderItem);
        return Unit.a;
    }
}

