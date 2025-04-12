/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Z11
 */
public final class z11_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z11_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                rn2_2 rn2_22 = (rn2_2)this.b;
                Intrinsics.checkNotNullParameter(rn2_22, "this$0");
                rn2_22.x("");
                return;
            }
            case 1: {
                ag1_1 ag1_12 = (ag1_1)this.b;
                Intrinsics.checkNotNullParameter(ag1_12, "this$0");
                Object object = AnalyticsManager.Companion;
                Object object2 = ((AnalyticsManager$Companion)object).getInstance();
                Object object3 = ((AnalyticsManager)object2).getNewCustomEventsRevamp();
                String string2 = bv_0.a((AnalyticsManager$Companion)object);
                String string3 = cv_0.a((AnalyticsManager$Companion)object);
                int n4 = 1568;
                int n7 = 0;
                Object object4 = "severe return detail screen interaction";
                String string4 = "back click";
                Object object5 = "";
                Object object6 = "severe_return_detail_screen_interaction";
                String string5 = "return - exchange nudge severe return detail screen";
                String string6 = null;
                String string7 = null;
                String string8 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, string4, (String)object5, (String)object6, string5, null, string2, null, string3, false, null, n4, null);
                object = ag1_12.d;
                if (object != null) {
                    int n8;
                    object2 = ag1_12.e;
                    object3 = "close";
                    if (object2 != null && (object2 = ((ProfileHealth)object2).getRule()) != null && (n8 = ((String)object2).length()) != 0) {
                        object3 = object2;
                    }
                    object5 = object3;
                    object2 = ag1_12.e;
                    object3 = "";
                    if (object2 != null && (object2 = ((ProfileHealth)object2).getMessage()) != null && (n8 = ((String)object2).length()) != 0) {
                        object3 = object2;
                    }
                    object6 = object3;
                    object2 = "ProceedPayment";
                    n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                    if (n3 != 0) {
                        n4 = 0;
                        object4 = ag1_12.a;
                        string4 = "rvp alert halfcut screen - auto";
                        string5 = "RVP_fraud_engine_response";
                        string6 = "bag screen";
                        string2 = "bag screen";
                        string7 = ag1_12.b;
                        string3 = null;
                        string8 = ag1_12.c;
                        n7 = 1664;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string4, (String)object5, (String)object3, string5, string6, string2, string7, null, string8, false, null, n7, null);
                    } else {
                        n4 = 0;
                        object4 = ag1_12.a;
                        string4 = "rvp alert halfcut screen - manual";
                        string5 = "RVP_fraud_engine_response";
                        string6 = "bag screen";
                        string2 = "bag screen";
                        string7 = ag1_12.b;
                        string3 = null;
                        string8 = ag1_12.c;
                        n7 = 1664;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string4, (String)object5, (String)object3, string5, string6, string2, string7, null, string8, false, null, n7, null);
                    }
                }
                ag1_12.dismiss();
                return;
            }
            case 0: 
        }
        Object object = (Function0)this.b;
        if (object != null) {
            object = (Unit)object.invoke();
        }
    }
}

