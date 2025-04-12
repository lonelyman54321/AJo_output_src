/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class oT {
    public static final NewCustomEventsRevamp a;
    public static final String b;
    public static final String c;

    static {
        Object object = AnalyticsManager.Companion;
        a = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        b = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        c = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
    }

    public static void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "scrollPercentage");
        NewCustomEventsRevamp newCustomEventsRevamp = a;
        String string3 = newCustomEventsRevamp.getEC_USER_INTERACTION();
        String string4 = b;
        String string5 = c;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, "scroll depth", string2, "scroll_depth", "my account screen", "my account screen", string4, null, string5, false, null, 1536, null);
    }

    public static void b(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "categoryName");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        NewCustomEventsRevamp newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        String string7 = b;
        String string8 = c;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string6, string7, null, string8, false, null, 1536, null);
    }
}

