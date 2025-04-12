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
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WQ
 */
public final class wq_0 {
    public final String a;
    public final NewCustomEventsRevamp b;
    public final String c;

    public wq_0() {
        String string2;
        Object object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.a = string2 = newEEcommerceEventsRevamp.getPrevScreenType();
        this.b = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.c = object = newEEcommerceEventsRevamp.getPrevScreen();
    }

    public final void a(String string2, String string3, String string4, String string5, HashMap hashMap) {
        wq_0 wq_02 = this;
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Object object = "screenName";
        Intrinsics.checkNotNullParameter(string5, (String)object);
        NewCustomEventsRevamp newCustomEventsRevamp = this.b;
        if (hashMap != null) {
            int n3 = hashMap.isEmpty() ^ 1;
            if (n3 != 0 || (n3 = hashMap.size()) != 0) {
                String string6;
                Object object2;
                boolean bl2;
                Bundle bundle = new Bundle();
                object = hashMap.entrySet().iterator();
                while (bl2 = object.hasNext()) {
                    object2 = (Map.Entry)object.next();
                    string6 = (String)object2.getKey();
                    object2 = (String)object2.getValue();
                    bundle.putString(string6, (String)object2);
                }
                object2 = newCustomEventsRevamp.getEN_SELF_CARE_INTERACTION();
                string6 = "";
                String string7 = wq_02.c;
                String string8 = wq_02.a;
                int n4 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, (String)object2, string5, string6, string7, bundle, string8, false, null, n4, null);
            }
        } else {
            String string9 = newCustomEventsRevamp.getEN_SELF_CARE_INTERACTION();
            String string10 = "";
            String string11 = this.c;
            Object var10_11 = null;
            String string12 = this.a;
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string9, string5, string10, string11, null, string12, false, null, n7, null);
        }
    }
}

