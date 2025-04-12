/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from Pe2
 */
public final class pe2_1
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ CartOrder c;
    public final /* synthetic */ CartEntry d;
    public final /* synthetic */ ft1_2 e;

    public pe2_1(i90_0 i90_02, qz1_2 qz1_22, CartOrder cartOrder, CartEntry cartEntry, ft1_2 ft1_22) {
        this.a = i90_02;
        this.b = qz1_22;
        this.c = cartOrder;
        this.d = cartEntry;
        this.e = ft1_22;
    }

    public final Object invoke() {
        ft1_2 ft1_22 = this.e;
        qz1_2 qz1_22 = this.b;
        CartOrder cartOrder = this.c;
        CartEntry cartEntry = this.d;
        oe2_2 oe2_22 = new oe2_2(qz1_22, cartOrder, cartEntry, ft1_22, null);
        Ae3.d(this.a, null, null, oe2_22, 3);
        return Unit.a;
    }
}

