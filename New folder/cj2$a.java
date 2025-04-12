/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
import android.os.Bundle;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class cj2$a {
    public final /* synthetic */ cj2_1 a;

    public cj2$a(cj2_1 cj2_12) {
        this.a = cj2_12;
    }

    public final void sizeChartInteraction(String string2) {
        String string3 = string2;
        Intrinsics.checkNotNullParameter(string2, "message");
        cj2_1 cj2_12 = this.a;
        boolean bl2 = cj2_12.g;
        if (!bl2) {
            Object object;
            String string4;
            Object object2;
            cj2_12.g = bl2 = true;
            Object object3 = new JSONObject(string2);
            string3 = object3.optString("totalColumnInSizeChart");
            object3 = cj2_12.b;
            Object object4 = object3.i2();
            String string5 = null;
            if (object4 != null) {
                boolean bl3;
                object2 = new ArrayList();
                object4 = ((ArrayList)object4).iterator();
                while (bl3 = object4.hasNext()) {
                    string4 = object4.next();
                    object = string4;
                    object = (ProductOptionVariant)((Object)string4);
                    int n3 = ((ProductOptionVariant)object).getStockLevel();
                    if (n3 <= 0) continue;
                    ((ArrayList)object2).add(string4);
                }
                int n4 = ((ArrayList)object2).size();
                object4 = n4;
            } else {
                boolean bl4 = false;
                object4 = null;
            }
            Bundle bundle = new Bundle();
            object2 = object3.l6();
            string4 = "product_id";
            bundle.putString(string4, (String)object2);
            object3 = object3.x5();
            if (object3 != null) {
                string5 = ((Product)object3).getBrandName();
            }
            bundle.putString("product_brand", string5);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(object4);
            object4 = " | ";
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(string3);
            String string6 = ((StringBuilder)object3).toString();
            object2 = cj2_12.h;
            string4 = "size chart interactions";
            object = "New size chart display on pdp";
            String string7 = "size_chart_interaction";
            String string8 = "pdp screen";
            String string9 = "pdp screen";
            String string10 = cj2_12.i;
            String string11 = "";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string4, (String)object, string6, string7, string8, string9, string10, bundle, string11, false, null, n7, null);
        }
    }
}

