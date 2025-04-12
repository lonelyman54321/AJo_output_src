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
import androidx.appcompat.widget.AppCompatTextView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCmsAppUpdateVH;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bD0
 */
public final class bd0_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bd0_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (HomeCmsAppUpdateVH)this.c;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = (po_0)this.b;
                if (object2 != null) {
                    object2.w9();
                }
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object = ((HomeCmsAppUpdateVH)object).e.getText();
                object = object != null ? object.toString() : null;
                ((GTMEvents)object2).pushUpdateAppEvent("link click", object, "landing screen");
                return;
            }
            case 0: 
        }
        Object object = (gd0_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = (gD0$a)this.c;
        Object object4 = "$this_apply";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        boolean bl2 = ((gd0_0)object).a;
        if (bl2) {
            object = (ExchangeReturnTabActivity)((gd0_0)object).j;
            Intrinsics.checkNotNull(object);
            ((ExchangeReturnTabActivity)object).A2();
        } else {
            Bundle bundle = E1.a("serviceability", "exchange_available");
            String string2 = ((gd0_0)object).o;
            bundle.putString("product_id", string2);
            string2 = ((gd0_0)object).p;
            bundle.putString("order_id", string2);
            string2 = ((gd0_0)object).q;
            bundle.putString("order_status", string2);
            object4 = AnalyticsManager.Companion;
            String string3 = bv_0.a((AnalyticsManager$Companion)object4);
            object3 = ((gD0$a)object3).k;
            object3 = object3 != null ? ((AppCompatTextView)object3).getText() : null;
            String string4 = String.valueOf(object3);
            String string5 = cv_0.a((AnalyticsManager$Companion)object4);
            NewCustomEventsRevamp newCustomEventsRevamp = ((gd0_0)object).n;
            String string6 = "buttonTap";
            String string7 = "create return";
            String string8 = "buttonTap";
            String string9 = "exchange size & reason selection screen";
            int n4 = 1568;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string6, string7, string4, string8, string9, null, string3, bundle, string5, false, null, n4, null);
            object = (ExchangeReturnTabActivity)((gd0_0)object).j;
            Intrinsics.checkNotNull(object);
            ((ExchangeReturnTabActivity)object).C2();
        }
    }
}

