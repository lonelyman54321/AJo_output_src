/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cC0
 */
public final class cc0_1
implements F62 {
    public final /* synthetic */ dc0_1 a;

    public /* synthetic */ cc0_1(dc0_1 dc0_12) {
        this.a = dc0_12;
    }

    public final void onChanged(Object object) {
        object = (Boolean)object;
        object = dc0_1.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        CartDeliveryAddress cartDeliveryAddress = ((dc0_1)object).h;
        if (cartDeliveryAddress != null && (object = ((dc0_1)object).k) != null) {
            ((ExReturnAddressActivity)object).z2(cartDeliveryAddress);
        }
    }
}

