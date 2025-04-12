/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;

/*
 * Renamed from ak0
 */
public final class ak0_0
implements vv1$a {
    public static void a(AnalyticsManager$Companion object, GTMEvents gTMEvents, String string2, String string3) {
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        gTMEvents.pushButtonTapEvent(string2, string3, (String)object);
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

