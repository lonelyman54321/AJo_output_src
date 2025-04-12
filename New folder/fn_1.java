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
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FN
 */
public final class fn_1
implements View.OnClickListener {
    public final /* synthetic */ hn_1 a;
    public final /* synthetic */ PaymentInstrumentInfo b;

    public /* synthetic */ fn_1(hn_1 hn_12, PaymentInstrumentInfo paymentInstrumentInfo) {
        this.a = hn_12;
        this.b = paymentInstrumentInfo;
    }

    public final void onClick(View object) {
        int n3;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$paymentInstrumentInfo");
        Object object3 = ((hn_1)object).e;
        boolean bl2 = object3.isChecked() ^ true;
        object3.setChecked(bl2);
        object3 = ((hn_1)object).e;
        bl2 = object3.isChecked();
        Object object4 = bl2;
        ((PaymentInstrumentInfo)object2).setSelected((Boolean)object4);
        object = ((hn_1)object).b;
        if (object != null) {
            object4 = ((PaymentInstrumentInfo)object2).getCode();
            boolean bl3 = object3.isChecked();
            object.p((String)object4, bl3);
        }
        object = ((PaymentInstrumentInfo)object2).getCode();
        boolean bl4 = object3.isChecked();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = bl4 ? "select" : "deselect";
            Bundle bundle = new Bundle();
            InternalWalletUtil.a.getClass();
            object3 = InternalWalletUtil.c((String)object);
            bundle.putString((String)object3, (String)object2);
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object = InternalWalletUtil.f((String)object);
            String string2 = n1.a((String)object, " - ", (String)object2);
            String string3 = "bag screen";
            String string4 = "bag interactions";
            object4 = "wallet toggle";
            String string5 = "checkout_wallet_toggle";
            ((GTMEvents)object3).pushCartInteractionsEvent((String)object4, string2, string5, string3, string4, bundle);
        }
    }
}

