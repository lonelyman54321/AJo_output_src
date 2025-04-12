/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vd2
 */
public final class vd2_1
implements Function2 {
    public final /* synthetic */ SelectedOrderItem a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ CartOrder c;
    public final /* synthetic */ int d;

    public /* synthetic */ vd2_1(SelectedOrderItem selectedOrderItem, qz1_2 qz1_22, CartOrder cartOrder, int n3) {
        this.a = selectedOrderItem;
        this.b = qz1_22;
        this.c = cartOrder;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        CartOrder cartOrder = this.c;
        Intrinsics.checkNotNullParameter(cartOrder, "$cartOrder");
        int n3 = Me3.b(this.d | 1);
        de2_0.C(this.a, qz1_22, cartOrder, (b30_0)object, n3);
        return Unit.a;
    }
}

