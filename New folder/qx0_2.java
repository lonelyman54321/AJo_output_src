/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from QX0
 */
public final class qx0_2
implements Function0 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ qx0_2(Product product, int n3, String string2) {
        this.a = product;
        this.b = n3;
        this.c = string2;
    }

    public final Object invoke() {
        int n3 = this.b;
        String string2 = this.c;
        return GAEcommerceEvents.a(this.a, n3, string2);
    }
}

