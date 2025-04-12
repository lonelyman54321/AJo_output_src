/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from v7
 */
public final class v7_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static void a(String string2, String string3, boolean bl2) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string3, "calledFrom");
        Bundle bundle = new Bundle();
        Object object2 = "reason";
        bundle.putString((String)object2, string2);
        object2 = bl2 ? "gift_card_submit_fail" : "check_balance_fail";
        String string4 = object2;
        object2 = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object2);
        String string6 = cv_0.a((AnalyticsManager$Companion)object2);
        Object object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string7 = "wallet screen";
        boolean bl3 = Intrinsics.areEqual(string3, string7);
        object2 = bl3 ? ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEC_WALLET_INTERACTION() : ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEC_PAYMENT_INSTRUMENT_SCR_TYPE();
        string7 = kp1_0.c("fail - ", string2);
        object = object3;
        object3 = "gift card submit";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, (String)object3, string7, string4, string3, string3, string5, bundle, string6, false, null, 1536, null);
    }

    public static void b(String string2) {
        Bundle bundle = E1.a("reason", string2);
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string3 = bv_0.a(analyticsManager$Companion);
        String string4 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string5 = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp().getEC_WALLET_CHECK_BALANCE_TYPE();
        String string6 = kp1_0.c("fail - ", string2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, "gift card submit", string6, "add_to_wallet", "wallet screen", "wallet screen", string3, bundle, string4, false, null, 1536, null);
    }
}

