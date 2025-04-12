/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class IN2 {
    public static void a(String string2, int n3, String string3, String string4, String string5, String string6) {
        Object object;
        int n4 = n3 & 0x20;
        if (n4 != 0) {
            n4 = 0;
            object = null;
        } else {
            object = string6;
        }
        Intrinsics.checkNotNullParameter(string2, "eventAction");
        Bundle bundle = new Bundle();
        String string7 = "order_id";
        Object object2 = string3;
        bundle.putString(string7, string3);
        String string8 = "";
        string7 = string4 == null ? string8 : string4;
        object2 = "return_id";
        bundle.putString((String)object2, string7);
        string7 = string5 == null ? string8 : string5;
        bundle.putString("order_status", string7);
        bundle.putString("product_id", (String)object);
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        String string9 = bv_0.a((AnalyticsManager$Companion)object);
        String string10 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "order item details interaction", string2, string8, "order_item_details_interaction", "order item details screen", "order management screen", string9, bundle, string10, false, null, 1536, null);
    }

    public static void b(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "eventAction");
        Bundle bundle = new Bundle();
        Object object = string3;
        bundle.putString("order_id", string3);
        Object object2 = "";
        object = string5 == null ? object2 : string5;
        String string7 = "return_id";
        bundle.putString(string7, (String)object);
        if (string6 != null) {
            object2 = string6;
        }
        bundle.putString("order_status", (String)object2);
        object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string8 = bv_0.a((AnalyticsManager$Companion)object2);
        String string9 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "order item details interaction", string2, string4, "order_item_details_interaction", "order item details screen", "order management screen", string8, bundle, string9, false, null, 1536, null);
    }
}

