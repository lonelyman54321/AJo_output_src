/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nO2
 */
public final class no2_1
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ no2_1(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (bl2) {
            object2 = (CartOrder)((qz1_2)object).l.getValue();
            int n3 = 9;
            SelectedOrderItem selectedOrderItem = this.b;
            ((qz1_2)object).h((CartOrder)object2, n3, selectedOrderItem);
            object2 = Boolean.TRUE;
            object = ((qz1_2)object).v;
            ((h83_0)object).setValue(object2);
        }
        return Unit.a;
    }
}

