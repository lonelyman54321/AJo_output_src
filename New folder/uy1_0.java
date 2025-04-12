/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uy1
 */
public final class uy1_0 {
    public static final NewCustomEventsRevamp a;
    public static final hh3_2 b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;

    static {
        Object object = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        a = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = new m00(1);
        b = yr1_2.b((Function0)object);
        c = "hybris_id";
        d = "restore mobile number";
        e = "restore phone number - click";
        f = "new mobile number";
        g = "cancel request";
        h = "request success";
        i = "formError";
        j = "change email address";
        k = "change mobile number";
        l = "new email id";
    }

    public static String a() {
        boolean bl2;
        Object object = b;
        Object object2 = ((hh3_2)object).getValue();
        String string2 = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (UserInformation)object2;
        if (object2 != null) {
            object2 = ((UserInformation)object2).getEncryptedId();
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object = ((hh3_2)object).getValue();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = ((UserInformation)object).getEncryptedId();
            Intrinsics.checkNotNull(object);
        } else {
            object = "";
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(boolean bl2) {
        Object object = bl2 ? "Yes" : "No";
        String string2 = object;
        Bundle bundle = new Bundle();
        object = c;
        Object object2 = uy1_0.a();
        bundle.putString((String)object, (String)object2);
        bundle.putString("page_type", "my account screen");
        object2 = a;
        String string3 = ((NewCustomEventsRevamp)object2).getEC_USER_ACCOUNTS();
        object = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        String string5 = cv_0.a((AnalyticsManager$Companion)object);
        String string6 = g;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string3, string6, string2, "user_account_interactions", "my account screen", "my account screen", string4, bundle, string5, false, null, 1536, null);
    }

    public static void c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "bannerName");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string3 = av_0.a(analyticsManager$Companion);
        String string4 = av_0.a(analyticsManager$Companion);
        String string5 = bv_0.a(analyticsManager$Companion);
        String string6 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(a, "user accounts interactions", "bannerImpression", string2, "user_accounts_interaction", string3, string4, string5, null, string6, false, null, 1664, null);
    }

    public static void d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorMessage");
        Bundle bundle = new Bundle();
        Object object = c;
        Object object2 = uy1_0.a();
        bundle.putString((String)object, (String)object2);
        bundle.putString("page_type", "login/signup");
        object2 = a;
        String string3 = ((NewCustomEventsRevamp)object2).getEC_USER_ACCOUNTS();
        object = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        String string5 = cv_0.a((AnalyticsManager$Companion)object);
        String string6 = i;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string3, string6, string2, "user_account_interactions", "signup screen", "signup screen", string4, bundle, string5, false, null, 1536, null);
    }

    public static void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "label");
        Bundle bundle = new Bundle();
        bundle.putString("page_type", "user account screen");
        NewCustomEventsRevamp newCustomEventsRevamp = a;
        String string3 = newCustomEventsRevamp.getEC_USER_ACCOUNTS();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string4 = bv_0.a(analyticsManager$Companion);
        String string5 = cv_0.a(analyticsManager$Companion);
        String string6 = d;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string6, string2, "user_account_interactions", "login/signup screen", "login/signup screen", string4, bundle, string5, false, null, 1536, null);
    }
}

