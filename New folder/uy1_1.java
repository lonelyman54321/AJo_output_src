/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from UY1
 */
public final class uy1_1
implements Function0 {
    public final /* synthetic */ NewEEcommerceEventsRevamp a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ Long c;

    public /* synthetic */ uy1_1(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CartEntry cartEntry, Long l2) {
        this.a = newEEcommerceEventsRevamp;
        this.b = cartEntry;
        this.c = l2;
    }

    public final Object invoke() {
        CartEntry cartEntry = this.b;
        Long l2 = this.c;
        return NewEEcommerceEventsRevamp.d(this.a, cartEntry, l2);
    }
}

