/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NN
 */
public final class nn_1
implements View.OnClickListener {
    public final /* synthetic */ on_1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    public /* synthetic */ nn_1(on_1 on_12, ArrayList arrayList, String string2) {
        this.a = on_12;
        this.b = arrayList;
        this.c = string2;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$oosEntries");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$cartAge");
        Bundle bundle = new Bundle();
        String string3 = ((on_1)object).h.getSV_EP_OOS_SKU();
        object2 = lp_0.b((ArrayList)object2);
        bundle.putString(string3, (String)object2);
        string3 = "oos";
        bundle.putString("reason_to_remove", string3);
        bundle.putString("cart_age", string2);
        object2 = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object2);
        String string5 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp newCustomEventsRevamp = ((on_1)object).h;
        String string6 = "bag interactions";
        String string7 = "remove all click";
        String string8 = "";
        String string9 = "remove_all";
        String string10 = "bag screen";
        String string11 = "bag screen";
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string6, string7, string8, string9, string10, string11, string4, bundle, string5, false, null, n3, null);
        object = ((on_1)object).a;
        if (object != null) {
            object.D1();
        }
    }
}

