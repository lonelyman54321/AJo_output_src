/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cd2
 */
public final class cd2_0
implements Function2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ Product c;
    public final /* synthetic */ int d;

    public /* synthetic */ cd2_0(CartOrder cartOrder, qz1_2 qz1_22, Product product, int n3) {
        this.a = cartOrder;
        this.b = qz1_22;
        this.c = product;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        CartOrder cartOrder = this.a;
        Product product = this.c;
        de2_0.q(cartOrder, qz1_22, product, (b30_0)object, n3);
        return Unit.a;
    }
}

