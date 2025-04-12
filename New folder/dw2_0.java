/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.SearchApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dW2
 */
public final class dw2_0 {
    public final IV2 a;
    public final SearchApi b;
    public final UserInformation c;
    public final jo_2 d;
    public final String e;
    public final String f;
    public final NewCustomEventsRevamp g;
    public final String h;
    public final String i;

    public dw2_0(IV2 object) {
        Intrinsics.checkNotNullParameter(object, "searchNetworkRepos");
        this.a = object;
        this.b = object = AjioApiConnector.INSTANCE.getSearchApi();
        this.c = object = VX0.a(AJIOApplication.Companion);
        Object object2 = AJIOApplication$a.a();
        this.d = object = new jo_2((Context)object2);
        this.e = "deviceID";
        this.f = "sessionID";
        object = AnalyticsManager.Companion;
        this.g = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.h = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.i = object = cv_0.a((AnalyticsManager$Companion)object);
    }
}

