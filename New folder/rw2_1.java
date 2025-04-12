/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from Rw2
 */
public final class rw2_1 {
    public static final NewCustomEventsRevamp a;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        newEEcommerceEventsRevamp.getPrevScreenType();
        a = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        newEEcommerceEventsRevamp.getPrevScreen();
        newEEcommerceEventsRevamp.getCurrentScreen();
    }

    public static void a(String object, CartEntry object2, HashMap hashMap) {
        Object object3;
        Bundle bundle = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = a;
        Object object4 = newCustomEventsRevamp.getPRODUCT_ID();
        Object object5 = "";
        if (object2 == null || (object3 = ((CartEntry)object2).getProduct()) == null || (object3 = ((Product)object3).getCode()) == null) {
            object3 = object5;
        }
        bundle.putString((String)object4, (String)object3);
        object4 = newCustomEventsRevamp.getPRODUCT_NAME();
        if (object2 != null && (object3 = ((CartEntry)object2).getProduct()) != null && (object3 = ((Product)object3).getName()) != null) {
            object5 = object3;
        }
        bundle.putString((String)object4, (String)object5);
        object4 = newCustomEventsRevamp.getORDER_ID();
        bundle.putString((String)object4, (String)object);
        if (hashMap != null) {
            boolean bl2;
            object = null;
            if (object2 != null && (object4 = ((CartEntry)object2).getProduct()) != null) {
                object4 = ((Product)object4).getCode();
            } else {
                bl2 = false;
                object4 = null;
            }
            bl2 = hashMap.containsKey(object4);
            if (bl2) {
                if (object2 != null && (object4 = ((CartEntry)object2).getProduct()) != null) {
                    object4 = ((Product)object4).getCode();
                } else {
                    bl2 = false;
                    object4 = null;
                }
                object4 = (ArrayList)hashMap.get(object4);
                object5 = a21.a;
                object5.getClass();
                bl2 = a21.c((ArrayList)object4);
                if (bl2) {
                    if (object2 != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                        object = ((Product)object2).getCode();
                    }
                    object = String.valueOf(a21.e((List)hashMap.get(object)));
                    object2 = "offer_count";
                    bundle.putString((String)object2, (String)object);
                }
            }
        }
        object = AnalyticsManager.Companion;
        object4 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object5 = newCustomEventsRevamp.getCANCEL();
        object3 = newCustomEventsRevamp.getCANCEL_SUCCESS();
        String string2 = av_0.a((AnalyticsManager$Companion)object);
        AnalyticsData analyticsData = ne_0.b(bundle);
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object4, (String)object5, object3, string2, analyticsData, null, 16, null);
    }
}

