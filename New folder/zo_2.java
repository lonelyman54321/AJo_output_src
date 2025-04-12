/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Price;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zo
 */
public final class zo_2
implements Function2 {
    public final /* synthetic */ Cart a;

    public /* synthetic */ zo_2(Cart cart) {
        this.a = cart;
    }

    public final Object invoke(Object object, Object object2) {
        float f5;
        object = (Price)object;
        object2 = (Price)object2;
        Cart cart = this.a;
        Intrinsics.checkNotNullParameter(cart, "$it");
        Intrinsics.checkNotNullParameter(object, "bagTotalAmount");
        Intrinsics.checkNotNullParameter(object2, "bagDiscount");
        object = ((Price)object).getValue();
        float f6 = 0.0f;
        if (object != null) {
            f5 = Float.parseFloat((String)object);
        } else {
            f5 = 0.0f;
            object = null;
        }
        cart.setTotalBag(f5);
        object = ((Price)object2).getValue();
        if (object != null) {
            f6 = Float.parseFloat((String)object);
        }
        cart.setTotalBagSaving(f6);
        return Unit.a;
    }
}

