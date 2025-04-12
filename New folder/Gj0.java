/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;

public final class Gj0
implements vv1$a,
aa3_2 {
    public static String b(int n3, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n3);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public void a(ba3_2 object) {
        Object object2;
        Object object3 = ((ba3_2)object).b;
        if (object3 != null) {
            object2 = ((ba3_2)object).e;
            object3.setError((CharSequence)object2);
        }
        if ((object = ((ba3_2)object).h) != null) {
            object3 = AnalyticsManager.Companion.getInstance();
            object2 = ((AnalyticsManager)object3).getGtmEvents();
            int n3 = 112;
            String string2 = ((xx0_0)object).d;
            String string3 = ((xx0_0)object).b;
            String string4 = ((xx0_0)object).a;
            String string5 = ((xx0_0)object).c;
            GTMEvents.gtmEventsToGa$default((GTMEvents)object2, string2, string3, string4, string5, null, null, null, n3, null);
        }
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

