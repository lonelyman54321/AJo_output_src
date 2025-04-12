/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GN
 */
public final class gn_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ gn_1(RecyclerView$B recyclerView$B, Serializable serializable, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
        this.c = serializable;
    }

    public final void onClick(View object) {
        boolean bl2;
        Object object2;
        String string2;
        String string3;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = (fn2_2)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                Object object4 = (ReturnRequest)this.c;
                Intrinsics.checkNotNullParameter(object4, "$returnRequest");
                object = ((fn2_2)object3).a;
                if (object != null) {
                    object3 = object4.getReturnId();
                    object4 = ReturnRefundLinksEnum.REFUND_BREAKUP;
                    object.O0((String)object3, (ReturnRefundLinksEnum)((Object)object4));
                }
                return;
            }
            case 0: 
        }
        object = (hn_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)this.c;
        Object object5 = "$paymentInstrumentInfo";
        Intrinsics.checkNotNullParameter(paymentInstrumentInfo, (String)object5);
        object = ((hn_1)object).b;
        if (object != null) {
            object5 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
            string3 = ((NewCustomEventsRevamp)object5).getEC_CHECKOUT_INTERACTIONS();
            String string4 = "spc_interaction";
            string2 = "spc interaction";
            String string5 = "View details selected in redemption option";
            object2 = object;
            object.g(string3, string2, string5, null, string4);
        }
        if (paymentInstrumentInfo != null) {
            object5 = paymentInstrumentInfo.getCode();
        } else {
            bl2 = false;
            object5 = null;
        }
        object2 = "AJIO_CASH_WALLET";
        bl2 = Intrinsics.areEqual(object2, object5);
        if (bl2) {
            object5 = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
            string3 = "AJIOWallet";
            string2 = "View Details selected on Ajio Wallet";
            ak0_0.a((AnalyticsManager$Companion)object5, (GTMEvents)object2, string3, string2);
            if (object != null) {
                object.j(paymentInstrumentInfo);
            }
        } else if (object != null) {
            object.s(paymentInstrumentInfo);
        }
    }
}

