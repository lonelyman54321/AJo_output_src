/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;

/*
 * Renamed from za2
 */
public final class za2_0 {
    public static final NewEEcommerceEventsRevamp a;
    public static final NewCustomEventsRevamp b;
    public static final String c;
    public static final String d;

    static {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        a = newEEcommerceEventsRevamp = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        b = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        c = newEEcommerceEventsRevamp.getPrevScreen();
        d = newEEcommerceEventsRevamp.getPrevScreenType();
    }
}

