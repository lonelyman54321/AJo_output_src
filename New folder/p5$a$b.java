/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.parameters.PredefinedCustom;
import com.affise.attribution.events.predefined.OrderCancelEvent;
import com.affise.attribution.network.HttpResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.AffiliateData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class p5$a$b
implements OnSendFailedCallback {
    public final /* synthetic */ OrderCancelEvent a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Product c;

    public p5$a$b(OrderCancelEvent orderCancelEvent, Ref$ObjectRef ref$ObjectRef, Product product) {
        this.a = orderCancelEvent;
        this.b = ref$ObjectRef;
        this.c = product;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void handle(HttpResponse object) {
        Object object2;
        String string2 = "status";
        Intrinsics.checkNotNullParameter(object, string2);
        p5_0 p5_02 = p5_0.a;
        object = p5_0.c.b();
        if (object == null || (object = ((AffiliateData)object).getClickId()) == null) {
            object = "default_click_id";
        }
        Object object3 = object;
        Bundle bundle = new Bundle();
        object = this.a.customPredefined();
        string2 = (String)this.b.element;
        Object object4 = "";
        if (string2 == null) {
            string2 = object4;
        }
        if ((object2 = this.c) != null && (object2 = ((Product)object2).getCode()) != null) {
            object4 = object2;
        }
        object = ((PredefinedCustom)object).conversionId(string2, (String)object4);
        bundle.putString("order_id", (String)object);
        object = Unit.a;
        p5_0.d(p5_02, "affise_callback", "affise callback ", "cancel order - failure", (String)object3, "order cancellation screen", bundle);
    }
}

