/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;

/*
 * Renamed from YE3
 */
public final class ye3_0 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        a = "cash screen - bank transfer status";
        b = "transferable_cash";
        c = "check transfer details";
        d = "Transfer ajio cash to bank";
        e = "check transfer status";
    }

    public static final void a(float f5) {
        Bundle bundle = new Bundle();
        String string2 = b;
        bundle.putFloat(string2, f5);
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        String string3 = av_0.a(analyticsManager$Companion);
        AnalyticsData analyticsData = ne_0.b(bundle);
        GTMEvents.pushButtonTapEvent$default(gTMEvents, "IMPS - Clicked on Transfer to Bank", "IMPS_Clicked_transfer_to_bank", string3, analyticsData, null, 16, null);
    }
}

