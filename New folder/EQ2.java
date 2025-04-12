/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;

public final class EQ2 {
    public static boolean a;
    public static final NewCustomEventsRevamp b;

    static {
        b = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }
}

