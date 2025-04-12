/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.affise.attribution.events.parameters.PredefinedCustom;
import com.affise.attribution.events.predefined.OrderCancelEvent;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.AffiliateData;
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class o5
implements Runnable {
    public final /* synthetic */ OrderCancelEvent a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Product c;

    public /* synthetic */ o5(OrderCancelEvent orderCancelEvent, Ref$ObjectRef ref$ObjectRef, Product product) {
        this.a = orderCancelEvent;
        this.b = ref$ObjectRef;
        this.c = product;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        Object object;
        p5_0 p5_02 = p5_0.a;
        Object object2 = p5_0.c.b();
        if (object2 == null || (object2 = ((AffiliateData)object2).getClickId()) == null) {
            object2 = "default_click_id";
        }
        Object object3 = object2;
        Bundle bundle = new Bundle();
        object2 = this.a.customPredefined();
        String string2 = (String)this.b.element;
        Object object4 = "";
        if (string2 == null) {
            string2 = object4;
        }
        if ((object = this.c) != null && (object = ((Product)object).getCode()) != null) {
            object4 = object;
        }
        object2 = ((PredefinedCustom)object2).conversionId(string2, (String)object4);
        bundle.putString("order_id", (String)object2);
        object2 = Unit.a;
        p5_0.d(p5_02, "affise_validation", "affise validation", "order cancel", (String)object3, "order cancellation screen", bundle);
    }
}

