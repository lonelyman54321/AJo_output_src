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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oi2
 */
public final class oi2_0
implements View.OnClickListener {
    public final /* synthetic */ ri2_1 a;

    public /* synthetic */ oi2_0(ri2_1 ri2_12) {
        this.a = ri2_12;
    }

    public final void onClick(View view) {
        ri2_1 ri2_12 = this.a;
        Intrinsics.checkNotNullParameter(ri2_12, "this$0");
        Bundle bundle = new Bundle();
        Object object = ri2_12.c.l6();
        int n3 = ((String)object).length();
        object = n3 == 0 ? "" : ri2_12.c.l6();
        bundle.putString("product_id", (String)object);
        object = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        String string2 = tr2_2.a.d().h;
        String string3 = bv_0.a((AnalyticsManager$Companion)object);
        String string4 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "widget interaction", "bbs widget", string2, "widget_interaction", "pdp screen", "pdp screen", string3, bundle, string4, false, null, 1536, null);
        ri2_12.m.X0();
    }
}

