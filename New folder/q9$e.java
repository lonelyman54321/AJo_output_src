/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class q9$e
implements OnGACuratedWidgetEventHandlerListener {
    public final void pushEECuratedWidgetOptionsImpressions(List list, int n3, String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        NewEEcommerceEventsRevamp.pushEECuratedWidgetOptionsImpression$default(AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp(), list, n3, string2, string3, string4, string5, string6, null, 128, null);
    }
}

