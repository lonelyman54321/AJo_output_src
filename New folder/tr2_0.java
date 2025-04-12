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
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tr2
 */
public final class tr2_0
implements View.OnClickListener {
    public final /* synthetic */ PaymentInstrumentInfo a;
    public final /* synthetic */ ur2_1 b;

    public /* synthetic */ tr2_0(PaymentInstrumentInfo paymentInstrumentInfo, ur2_1 ur2_12) {
        this.a = paymentInstrumentInfo;
        this.b = ur2_12;
    }

    public final void onClick(View object) {
        int n3;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$paymentInstrumentInfo");
        Object object2 = this.b;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object = ((PaymentInstrumentInfo)object).getCode();
        if (object != null && (n3 = ((String)object).length()) > 0) {
            object3 = ((ur2_1)object2).b;
            if (object3 != null) {
                int n4 = ((RecyclerView$B)object2).getLayoutPosition();
                object3.R1(n4, (String)object);
            }
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object2 = InternalWalletUtil.a;
            object2.getClass();
            String string2 = InternalWalletUtil.f((String)object);
            int n7 = 16;
            String string3 = "wallet retry";
            String string4 = "checkout_wallet_retry";
            String string5 = "single page checkout";
            GTMEvents.pushCheckoutInteractionsEvent$default((GTMEvents)object3, string3, string2, string4, string5, null, n7, null);
        }
    }
}

