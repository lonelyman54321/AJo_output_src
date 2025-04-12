/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from TY1
 */
public final class ty1_2
implements Function0 {
    public final /* synthetic */ NewEEcommerceEventsRevamp a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ String d;

    public /* synthetic */ ty1_2(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, Long l2, String string2) {
        this.a = newEEcommerceEventsRevamp;
        this.b = product;
        this.c = l2;
        this.d = string2;
    }

    public final Object invoke() {
        Long l2 = this.c;
        String string2 = this.d;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.a;
        Product product = this.b;
        return NewEEcommerceEventsRevamp.b(newEEcommerceEventsRevamp, product, l2, string2);
    }
}

