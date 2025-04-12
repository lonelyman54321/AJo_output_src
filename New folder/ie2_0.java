/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ie2
 */
public final class ie2_0
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ int d;

    public /* synthetic */ ie2_0(qz1_2 qz1_22, Product product, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = qz1_22;
        this.b = product;
        this.c = selectedOrderItem;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        Product product = this.b;
        SelectedOrderItem selectedOrderItem = this.c;
        de2_0.y(qz1_22, product, selectedOrderItem, (b30_0)object, n3);
        return Unit.a;
    }
}

