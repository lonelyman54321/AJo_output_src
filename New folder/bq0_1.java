/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlinx.coroutines.d;

/*
 * Renamed from BQ0
 */
public final class bq0_1 {
    public final NewCustomEventsRevamp a;
    public final c80 b;

    public bq0_1() {
        Object object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.a = object;
        object = ir0_2.a;
        this.b = object = d.a(em0_2.b);
    }
}

