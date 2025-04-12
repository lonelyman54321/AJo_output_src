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
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from PP0
 */
public final class pp0_0 {
    public static final NewCustomEventsRevamp a;
    public static final c80 b;

    static {
        Object object = AnalyticsManager.Companion;
        a = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = ir0_2.a;
        b = d.a(em0_2.b);
    }

    public static void a(String string2, String string3, String object) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "productBrand");
        String string4 = "true";
        String string5 = "isUnseen";
        Bundle bundle = dm_1.a((String)object, "postId", string4, string5);
        bundle.putString("post_id", (String)object);
        bundle.putString(string5, string4);
        object = new jp0_2(string2, string3, bundle, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static void b(String string2, String string3, String object) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "productBrand");
        String string4 = "true";
        String string5 = "isUnseen";
        Bundle bundle = dm_1.a((String)object, "postId", string4, string5);
        bundle.putString(string5, string4);
        bundle.putString("post_id", (String)object);
        object = new kp0_2(string2, string3, bundle, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static void c(String string2, String object) {
        Intrinsics.checkNotNullParameter("post share click", "action");
        Intrinsics.checkNotNullParameter(string2, "productBrand");
        String string3 = "true";
        String string4 = "isUnseen";
        Bundle bundle = dm_1.a((String)object, "postId", string3, string4);
        bundle.putString(string4, string3);
        bundle.putString("post_id", (String)object);
        object = new mp0_2(string2, bundle, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static void d(Resource resource, String string2, String object) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Bundle bundle = new Bundle();
        String string3 = resource != null ? resource.getId() : null;
        bundle.putString("store_id", string3);
        bundle.putString("post_id", (String)object);
        bundle.putString("isUnseen", "unseen");
        object = new op0_2(string2, resource, bundle, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static void e(String string2, String string3, Bundle bundle, String string4) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(bundle, "customEventBundle");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        pp0$a_0 pp0$a_0 = new pp0$a_0(string2, string3, string4, bundle, null);
        Ae3.d(b, null, null, pp0$a_0, 3);
    }
}

