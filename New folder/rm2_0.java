/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rm2
 */
public final class rm2_0 {
    public static final NewCustomEventsRevamp a;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        a = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
    }

    public static void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "action");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string3 = av_0.a(analyticsManager$Companion);
        String string4 = av_0.a(analyticsManager$Companion);
        String string5 = bv_0.a(analyticsManager$Companion);
        String string6 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "pan api response", string2, "", "pan_api_response", string3, string4, string5, null, string6, false, null, 1536, null);
    }

    public static void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "action");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string3 = av_0.a(analyticsManager$Companion);
        String string4 = av_0.a(analyticsManager$Companion);
        String string5 = bv_0.a(analyticsManager$Companion);
        String string6 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "pan interactions", string2, "", "pan_interactions", string3, string4, string5, null, string6, false, null, 1536, null);
    }
}

