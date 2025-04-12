/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;

public final class zE2 {
    public static final NewCustomEventsRevamp a;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        a = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
    }
}

