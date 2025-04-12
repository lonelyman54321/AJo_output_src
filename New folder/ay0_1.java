/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Ay0
 */
public final class ay0_1
implements View.OnClickListener {
    public final /* synthetic */ cy0_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ ay0_1(cy0_1 cy0_12, int n3, ArrayList arrayList) {
        this.a = cy0_12;
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
        Object object5 = ((zv_0)object2).b;
        object5.getClass();
        Intrinsics.checkNotNullParameter(view, (String)object4);
        Intrinsics.checkNotNullParameter(object3, "data");
        object2 = ((cy0_1)object2).d;
        object4 = "listener";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        ((zy0_1)object5).d = object2;
        int n3 = this.b;
        object3 = (PaymentInstrumentInfo)object3.get(n3);
        if (object3 != null) {
            object4 = ((zy0_1)object5).c;
            HashSet hashSet = null;
            if (object4 != null) {
                object4 = ((PaymentInstrumentInfo)object4).getInstrument_code();
            } else {
                n3 = 0;
                object4 = null;
            }
            Object object6 = ((PaymentInstrumentInfo)object3).getInstrument_code();
            boolean bl2 = true;
            n3 = (int)(kotlin.text.b.i((String)object4, (String)object6, bl2) ? 1 : 0);
            if (n3 == 0) {
                object4 = ((PaymentInstrumentInfo)object3).getPriceValidation();
                if (object4 != null && (object4 = ((PriceValidation)object4).getPriceSplitup()) != null) {
                    object4 = ((PriceSplitUp)object4).getOfferDetails();
                } else {
                    n3 = 0;
                    object4 = null;
                }
                if (object4 == null) {
                    op2_2 op2_22;
                    object4 = ((zy0_1)object5).c;
                    if (object4 != null) {
                        ((PaymentInstrumentInfo)object4).setOfferDetails(null);
                        ((PaymentInstrumentInfo)object4).setPriceValidation(null);
                    }
                    if ((object4 = ((zy0_1)object5).d) != null) {
                        object4.a();
                    }
                    ((zy0_1)object5).c = object3;
                    object6 = ((zy0_1)object5).d;
                    if (object6 != null) {
                        String string2 = ((zy0_1)object5).e.getEC_CHECKOUT_INTERACTIONS();
                        object3 = ((zy0_1)object5).c;
                        if (object3 == null || (object3 = ((PaymentInstrumentInfo)object3).getName()) == null) {
                            object3 = "";
                        }
                        object4 = "IndividualBankEMI_selected_";
                        String string3 = ((String)object4).concat((String)object3);
                        String string4 = "payment accordian select";
                        String string5 = "payment_accordian_select";
                        object6.g(string2, string4, string3, null, string5);
                    }
                    if ((op2_22 = ((zy0_1)object5).a) != null) {
                        int n4 = 1048575;
                        Object object7 = null;
                        Object object8 = null;
                        hj_1 hj_12 = null;
                        object3 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n4, null);
                        object4 = ((zy0_1)object5).c;
                        if (object4 != null) {
                            object4 = ((PaymentInstrumentInfo)object4).getInstrument_code();
                        } else {
                            n3 = 0;
                            object4 = null;
                        }
                        ((PriceRequest)object3).setInstrumentInstanceCode((String)object4);
                        object4 = oo2_0.a;
                        object5 = ((zy0_1)object5).b;
                        object6 = object5 != null ? ((kj2_1)object5).s : null;
                        object4.getClass();
                        object4 = oo2_0.c("EMI", (PaymentInstruments)object6);
                        if (object4 != null) {
                            object4 = ((PaymentInstrumentType)object4).getPaymentInstrumentCode();
                        } else {
                            n3 = 0;
                            object4 = null;
                        }
                        ((PriceRequest)object3).setPaymentInstrument((String)object4);
                        object7 = object5 != null ? (object4 = ((kj2_1)object5).s) : null;
                        object8 = object5 != null ? (object4 = ((kj2_1)object5).E) : null;
                        hj_12 = hj_1.EMI;
                        if (object5 != null) {
                            hashSet = ((kj2_1)object5).w;
                        }
                        op2_22.k((PriceRequest)object3, (PaymentInstruments)object7, (TenantResponse)object8, hj_12, hashSet);
                    }
                }
            }
        }
        object = view.getTag();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        int n7 = (Integer)object;
        object2.t(n7);
    }
}

