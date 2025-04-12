/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.AlertDialog;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rP1
 */
public final class rp1_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2;
                String string3;
                object = (jq2_2)this.b;
                Object object2 = "this$0";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Object object3 = ((jq2_2)object).b;
                if (object3 != null) {
                    object2 = ((jq2_2)object).f;
                    string3 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                    string2 = "spc interaction";
                    String string4 = "View more selected in offer section";
                    String string5 = "spc_interaction";
                    object3.g(string3, string2, string4, null, string5);
                }
                object2 = AnalyticsManager.Companion;
                object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                string3 = "Banners_viewmore ";
                string2 = "View more selected in banners section ";
                ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object3, string3, string2);
                object = ((jq2_2)object).b;
                if (object != null) {
                    object.h5();
                }
                return;
            }
            case 0: 
        }
        ((AlertDialog)this.b).dismiss();
    }
}

