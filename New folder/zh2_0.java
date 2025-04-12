/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zh2
 */
public final class zh2_0 {
    public final /* synthetic */ yh2_1 a;

    public zh2_0(yh2_1 yh2_12) {
        this.a = yh2_12;
    }

    public final void a() {
        yh2_1 yh2_12 = this.a;
        yh2_12.getClass();
        NewCustomEventsRevamp newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Object object = yh2_12.b;
        Object object2 = object.x5();
        String string2 = null;
        object2 = object2 != null ? object2.getCode() : null;
        String string3 = "product_id";
        Pair pair = new Pair(string3, object2);
        object = object.x5();
        if (object != null) {
            string2 = ((Product)object).getName();
        }
        object = new Pair("product_name", string2);
        object2 = new Pair[]{pair, object};
        object = DE.b(object2);
        newCustomEventsRevamp.newPDPInteractionsCustomEvent("visit ajiogram store", "click", "pdp screen", (Bundle)object);
        yh2_12.b.a3();
    }

    public final void b(int n3, Product product) {
        String string2 = "AJIOGRAM_PRODUCT_WIDGET";
        Intrinsics.checkNotNullParameter(string2, "listType");
        this.a.h.F(product, n3, string2);
    }
}

