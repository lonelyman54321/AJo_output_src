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

public final class LD2 {
    public static final NewCustomEventsRevamp a;
    public static final String b;

    static {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        a = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        b = "dimension11";
    }

    public static Bundle a(String string2, String string3, String string4, String string5) {
        Bundle bundle = new Bundle();
        if (string3 != null) {
            String string6 = "product_id";
            bundle.putString(string6, string3);
        }
        if (string4 != null) {
            string3 = "product_name";
            bundle.putString(string3, string4);
        }
        if (string5 != null) {
            string3 = "product_brick";
            bundle.putString(string3, string5);
        }
        if (string2 != null) {
            string3 = "order_id";
            bundle.putString(string3, string2);
        }
        return bundle;
    }

    public static void b(String string2, String string3, String string4, String string5) {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string6 = av_0.a(analyticsManager$Companion);
        String string7 = av_0.a(analyticsManager$Companion);
        String string8 = bv_0.a(analyticsManager$Companion);
        Bundle bundle = LD2.a(string2, string3, string4, string5);
        String string9 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "reviews & ratings interactions", "Edit Feedback", "", "reviews_rating_interactions", string6, string7, string8, bundle, string9, false, null, 1536, null);
    }

    public static void c(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "label");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string7 = av_0.a(analyticsManager$Companion);
        String string8 = av_0.a(analyticsManager$Companion);
        String string9 = bv_0.a(analyticsManager$Companion);
        String string10 = string6;
        string10 = LD2.a("", string4, string5, string6);
        String string11 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "reviews & ratings interactions", string2, string3, "reviews_rating_interactions", string7, string8, string9, (Bundle)string10, string11, false, null, 1536, null);
    }

    public static void d(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "label");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string7 = av_0.a(analyticsManager$Companion);
        String string8 = av_0.a(analyticsManager$Companion);
        String string9 = bv_0.a(analyticsManager$Companion);
        Bundle bundle = LD2.a(string3, string4, string5, string6);
        String string10 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "reviews & ratings interactions", "Add a Review", string2, "reviews_rating_interactions", string7, string8, string9, bundle, string10, false, null, 1536, null);
    }

    public static void e(String string2, String string3, String string4, String string5) {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string6 = av_0.a(analyticsManager$Companion);
        String string7 = av_0.a(analyticsManager$Companion);
        String string8 = bv_0.a(analyticsManager$Companion);
        Bundle bundle = LD2.a(string2, string3, string4, string5);
        String string9 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "reviews_rating_interactions", "order details", "review seen", "reviews_rating_interactions", string6, string7, string8, bundle, string9, false, null, 1536, null);
    }

    public static void f(String string2, String string3, String string4, String string5, String string6, String string7) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "label");
        StringBuilder stringBuilder = new StringBuilder("Sub Rating | ");
        stringBuilder.append(string2);
        String string8 = stringBuilder.toString();
        object = AnalyticsManager.Companion;
        String string9 = av_0.a((AnalyticsManager$Companion)object);
        String string10 = av_0.a((AnalyticsManager$Companion)object);
        String string11 = bv_0.a((AnalyticsManager$Companion)object);
        Bundle bundle = LD2.a(string4, string5, string6, string7);
        String string12 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "reviews & ratings interactions", string8, string3, "reviews_rating_interactions", string9, string10, string11, bundle, string12, false, null, 1536, null);
    }
}

