/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Payment.FEPayment;
import com.ril.ajio.services.data.Payment.FEResult;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.OTPValidation;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Go2
 */
public final class go2_0 {
    public static final NewCustomEventsRevamp a;
    public static final NewEEcommerceEventsRevamp b;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        a = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        b = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(PaymentInstruments object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        String string2 = null;
        if (object != null && (object2 = ((PaymentInstruments)object).getFraudEngineResponseDetails()) != null && (object2 = ((FraudEngineResponse)object2).getResult()) != null && (object2 = ((FEResult)object2).getOtpValidation()) != null) {
            object2 = ((OTPValidation)object2).getAction();
        } else {
            bl3 = false;
            object2 = null;
        }
        String string3 = "OTP_VALIDATION";
        bl3 = string3.equalsIgnoreCase((String)object2);
        if (!bl3) {
            if (object != null && (object = ((PaymentInstruments)object).getFraudEngineResponseDetails()) != null && (object = ((FraudEngineResponse)object).getResult()) != null && (object = ((FEResult)object).getOTP_VALIDATION()) != null) {
                string2 = ((FEPayment)object).getAction();
            }
            if (!(bl2 = string3.equalsIgnoreCase(string2))) return false;
        }
        if (bl2 = dm0_0.f) return false;
        return true;
    }

    public static void b(String object) {
        StringBuilder stringBuilder = new StringBuilder("spc errors - cta disable -");
        stringBuilder.append((String)object);
        String string2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string3 = av_0.a((AnalyticsManager$Companion)object);
        GTMEvents.gtmEventsToGaWithCategory$default(gTMEvents, "errors interactions", "business_error", "business error", string2, string3, null, 32, null);
    }
}

