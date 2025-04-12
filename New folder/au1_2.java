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
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from AU1
 */
public final class au1_2
implements View.OnClickListener {
    public final /* synthetic */ cu1_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ au1_2(cu1_1 cu1_12, int n3, ArrayList arrayList) {
        this.a = cu1_12;
        this.b = n3;
        this.c = arrayList;
    }

    public final void onClick(View view) {
        Object object = view;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$data");
        Object object4 = "v";
        Intrinsics.checkNotNullParameter(view, (String)object4);
        Object object5 = ((qw_2)object2).b;
        object5.getClass();
        Intrinsics.checkNotNullParameter(view, (String)object4);
        Intrinsics.checkNotNullParameter(object3, "data");
        object2 = ((cu1_1)object2).d;
        object4 = "listener";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        ((zu1_1)object5).d = object2;
        int n3 = this.b;
        Object object6 = (PaymentInstrumentInfo)object3.get(n3);
        String string2 = null;
        boolean bl2 = true;
        if (object6 != null) {
            boolean bl3;
            Object object7 = ((zu1_1)object5).c;
            if (object7 != null) {
                object7 = ((PaymentInstrumentInfo)object7).getCode();
            } else {
                bl3 = false;
                object7 = null;
            }
            Object object8 = ((PaymentInstrumentInfo)object6).getCode();
            bl3 = kotlin.text.b.i((String)object7, (String)object8, bl2);
            if (!bl3) {
                object7 = ((PaymentInstrumentInfo)object6).getPriceValidation();
                if (object7 != null && (object7 = ((PriceValidation)object7).getPriceSplitup()) != null) {
                    object7 = ((PriceSplitUp)object7).getOfferDetails();
                } else {
                    bl3 = false;
                    object7 = null;
                }
                if (object7 == null) {
                    object7 = ((zu1_1)object5).c;
                    if (object7 != null) {
                        ((PaymentInstrumentInfo)object7).setOfferDetails(null);
                        ((PaymentInstrumentInfo)object7).setPriceValidation(null);
                    }
                    if ((object7 = ((zu1_1)object5).d) != null) {
                        object7.a();
                    }
                    ((zu1_1)object5).c = object6;
                    object8 = ((zu1_1)object5).a;
                    if (object8 != null) {
                        Object object9 = object6;
                        int n4 = 1048575;
                        Object object10 = null;
                        Object object11 = null;
                        hj_1 hj_12 = null;
                        Object object12 = null;
                        object6 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n4, null);
                        object7 = ((zu1_1)object5).c;
                        if (object7 != null) {
                            object7 = ((PaymentInstrumentInfo)object7).getCode();
                        } else {
                            bl3 = false;
                            object7 = null;
                        }
                        ((PriceRequest)object6).setInstrumentInstanceCode((String)object7);
                        object7 = oo2_0.a;
                        object5 = ((zu1_1)object5).b;
                        object9 = object5 != null ? ((kj2_1)object5).s : null;
                        object7.getClass();
                        object7 = oo2_0.c("NET_BANKING", (PaymentInstruments)object9);
                        if (object7 != null) {
                            object7 = ((PaymentInstrumentType)object7).getPaymentInstrumentCode();
                        } else {
                            bl3 = false;
                            object7 = null;
                        }
                        ((PriceRequest)object6).setPaymentInstrument((String)object7);
                        object10 = object5 != null ? (object7 = ((kj2_1)object5).s) : null;
                        object11 = object5 != null ? (object7 = ((kj2_1)object5).E) : null;
                        hj_12 = hj_1.NET_BANKING;
                        object12 = object5 != null ? (object5 = ((kj2_1)object5).w) : null;
                        object9 = object6;
                        ((op2_2)object8).k((PriceRequest)object6, (PaymentInstruments)object10, (TenantResponse)object11, hj_12, (HashSet)object12);
                    }
                }
            }
        }
        object5 = object3;
        object5 = (Collection)object3;
        boolean bl4 = object5.isEmpty() ^ bl2;
        if (bl4) {
            if ((object3 = (PaymentInstrumentInfo)object3.get(n3)) != null) {
                string2 = ((PaymentInstrumentInfo)object3).getName();
            }
        } else {
            string2 = "";
        }
        object3 = kp1_0.c("Netbanking Bank selected -", string2);
        object4 = AnalyticsManager.Companion;
        object5 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
        object4 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents().getScreenName();
        ((GTMEvents)object5).pushButtonTapEvent("Netbankingbank_clicked", object3, (String)object4);
        object = view.getTag();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        int n7 = (Integer)object;
        object2.t(n7);
    }
}

