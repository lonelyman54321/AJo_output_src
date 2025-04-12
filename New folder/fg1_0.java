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
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fG1
 */
public final class fg1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fg1_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ed3_2 ed3_22 = (ed3_2)this.b;
                Intrinsics.checkNotNullParameter(ed3_22, "this$0");
                tt2_2 tt2_22 = (tt2_2)this.c;
                Intrinsics.checkNotNullParameter(tt2_22, "$scrollStateHolder");
                ed3_22.Qa(tt2_22);
                return;
            }
            case 1: {
                boolean bl2;
                Object object2;
                String string2;
                String string3;
                object = (Yr2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)this.c;
                Object object3 = "$paymentInstrumentInfo";
                Intrinsics.checkNotNullParameter(paymentInstrumentInfo, (String)object3);
                object = ((Yr2)object).b;
                if (object != null) {
                    object3 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                    string3 = ((NewCustomEventsRevamp)object3).getEC_CHECKOUT_INTERACTIONS();
                    String string4 = "spc_interaction";
                    string2 = "spc interaction";
                    String string5 = "View details selected in redemption option";
                    object2 = object;
                    object.g(string3, string2, string5, null, string4);
                }
                if (paymentInstrumentInfo != null) {
                    object3 = paymentInstrumentInfo.getCode();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                object2 = "AJIO_CASH_WALLET";
                bl2 = Intrinsics.areEqual(object2, object3);
                if (bl2) {
                    object3 = AnalyticsManager.Companion;
                    object2 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                    string3 = "AJIOWallet";
                    string2 = "View Details selected on Ajio Wallet";
                    ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object2, string3, string2);
                    if (object != null) {
                        object.j(paymentInstrumentInfo);
                    }
                } else if (object != null) {
                    object.s(paymentInstrumentInfo);
                }
                return;
            }
            case 0: 
        }
        kG1 kG12 = (kG1)this.c;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        n3 = kG12.getLayoutPosition();
        Product product = (Product)this.b;
        product.setViewHolderPos(n3);
        object = product.getFnlColorVariantData();
        if (object != null) {
            object = ((ProductFnlColorVariantData)object).getColorGroup();
        } else {
            n3 = 0;
            object = null;
        }
        kG12.b.R4(product, (String)object);
    }
}

