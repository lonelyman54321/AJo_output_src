/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;

/*
 * Renamed from JQ
 */
public final class jq_1 {
    public static final /* synthetic */ int a;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        newEEcommerceEventsRevamp.getPrevScreen();
        newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public static void a(String string2) {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        ak0_0.a(analyticsManager$Companion, gTMEvents, "Global Nav", string2);
    }
}

