/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cI0
 */
public final class ci0_2
implements Xf0$b {
    public static void b(String string2, String string3) {
        AnalyticsData analyticsData;
        Object object = string2;
        Bundle bundle = E1.a("browser_type", string2);
        object = analyticsData;
        analyticsData = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, bundle, null, null, null, null, null, null, 65023, null);
        Object object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        String string4 = av_0.a((AnalyticsManager$Companion)object2);
        object2 = object;
        object = "user interaction";
        ((GTMEvents)object2).gtmEventsToGaWithCategory((String)object, "user_interaction", "external link clicks", string3, string4, analyticsData);
    }

    public final void a(Context object, Uri object2, int n3) {
        if (object != null && object2 != null) {
            String string2 = "android.intent.action.VIEW";
            Object object3 = new Intent(string2);
            string2 = "android.intent.category.BROWSABLE";
            object3 = object3.addCategory(string2);
            string2 = "addCategory(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object3.setData(object2);
            try {
                object.startActivity(object3);
            }
            catch (Exception exception) {
                object3 = CustomWebViewActivity.Companion;
                string2 = object2.toString();
                CustomWebViewActivity$a.b((CustomWebViewActivity$a)object3, object, string2, n3);
                object = String.valueOf(object2);
                object2 = "in-app webview";
                ci0_2.b((String)object2, (String)object);
            }
            object = String.valueOf(object2);
            object2 = "external browser";
            ci0_2.b((String)object2, (String)object);
        }
    }
}

