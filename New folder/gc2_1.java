/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gc2
 */
public final class gc2_1
implements Function2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ CartEntry c;
    public final /* synthetic */ Product d;
    public final /* synthetic */ SelectedOrderItem e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ gc2_1(CartOrder cartOrder, qz1_2 qz1_22, CartEntry cartEntry, Product product, SelectedOrderItem selectedOrderItem, rd2_2 rd2_22, ad2_1 ad2_12, int n3) {
        this.a = cartOrder;
        this.b = qz1_22;
        this.c = cartEntry;
        this.d = product;
        this.e = selectedOrderItem;
        this.f = rd2_22;
        this.g = ad2_12;
        this.h = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        CartOrder cartOrder = this.a;
        Intrinsics.checkNotNullParameter(cartOrder, "$cartOrder");
        qz1_2 qz1_22 = this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        CartEntry cartEntry = this.c;
        Intrinsics.checkNotNullParameter(cartEntry, "$cartEntry");
        Product product = this.d;
        Intrinsics.checkNotNullParameter(product, "$product");
        object = this.f;
        Intrinsics.checkNotNullParameter(object, "$onCloseButtonClicked");
        object2 = this.g;
        Intrinsics.checkNotNullParameter(object2, "$onOkayButtonClicked");
        int n3 = Me3.b(this.h | 1);
        Object object4 = object;
        object4 = (rd2_2)object;
        Object object5 = object2;
        object5 = (ad2_1)object2;
        SelectedOrderItem selectedOrderItem = this.e;
        jd2_1.f(cartOrder, qz1_22, cartEntry, product, selectedOrderItem, (rd2_2)object4, (ad2_1)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

