/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from We2
 */
public final class we2_0
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ we2_0(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Object object = Boolean.TRUE;
        qz1_22.n.setValue(object);
        object = md3_0.c(qz1_22);
        SelectedOrderItem selectedOrderItem = this.b;
        g02_0 g02_02 = new g02_0(qz1_22, selectedOrderItem, null);
        Ae3.d((i90_0)object, null, null, g02_02, 3);
        return Unit.a;
    }
}

