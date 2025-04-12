/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.events.parameters.PredefinedCustom;
import com.affise.attribution.events.predefined.OrderEvent;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.AffiliateData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class p5$b$a
implements OnSendSuccessCallback {
    public final /* synthetic */ OrderEvent a;
    public final /* synthetic */ CartOrder b;
    public final /* synthetic */ Product c;

    public p5$b$a(OrderEvent orderEvent, CartOrder cartOrder, Product product) {
        this.a = orderEvent;
        this.b = cartOrder;
        this.c = product;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void handle() {
        p5_0 p5_02 = p5_0.a;
        Object object = p5_0.c.b();
        if (object == null || (object = ((AffiliateData)object).getClickId()) == null) {
            object = "default_click_id";
        }
        Object object2 = object;
        Bundle bundle = new Bundle();
        object = this.a.customPredefined();
        String string2 = this.b.getCode();
        Intrinsics.checkNotNullExpressionValue(string2, "getCode(...)");
        Object object3 = this.c;
        if (object3 == null || (object3 = ((Product)object3).getCode()) == null) {
            object3 = "";
        }
        object = ((PredefinedCustom)object).conversionId(string2, (String)object3);
        bundle.putString("order_id", (String)object);
        object = Unit.a;
        p5_0.d(p5_02, "affise_callback", "affise callback ", "purchase - success", (String)object2, "order confirmation screen", bundle);
    }
}

