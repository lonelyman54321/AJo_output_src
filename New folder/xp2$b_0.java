/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xp2$b
 */
public final class xp2$b_0
implements OnGACuratedWidgetEventHandlerListener {
    public final /* synthetic */ xp2_2 a;

    public xp2$b_0(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final void pushEECuratedWidgetOptionsImpressions(List list, int n3, String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        Bundle bundle = this.a.Qa();
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().pushEECuratedWidgetOptionsImpression(list, n3, string2, string3, string4, string5, string6, bundle);
    }
}

