/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ue2
 */
public final class ue2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ ue2_1(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.c | 1);
        SelectedOrderItem selectedOrderItem = this.b;
        de2_0.E(qz1_22, selectedOrderItem, (b30_0)object, n3);
        return Unit.a;
    }
}

