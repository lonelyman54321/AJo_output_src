/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.o;
import com.google.gson.JsonObject;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.payment.fragment.d$a;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.PaymentInformation;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eq2
 */
public final class eq2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eq2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (o)object;
                yT1 yT12 = (yT1)this.b;
                uo0_0.h((o)object, yT12);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object2 = (g)this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "cartDataCallback");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (!bl2) return Unit.a;
        object3 = ((g)object2).c;
        if (object3 != null) {
            object3.h();
        }
        bl2 = ((DataCallback)object).getStatus();
        int n4 = 0;
        Object object4 = null;
        boolean bl3 = false;
        Object object5 = null;
        if (!bl2) {
            int n7;
            Object object6;
            object3 = (PayNowResponse)JsonUtils.fromJson((String)(object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData())), PayNowResponse.class);
            if (object3 != null) {
                object6 = ((PayNowResponse)object3).getTransactionId();
            } else {
                n7 = 0;
                object6 = null;
            }
            Object object7 = "Placeorder_Loyaltyrewadz";
            if (object6 != null && (n7 = ((String)object6).length()) != 0) {
                Exception exception2;
                block21: {
                    boolean bl4;
                    object = AnalyticsManager.Companion;
                    object4 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                    object6 = " SavedCard_EntirelyThroughLR";
                    ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object4, (String)object7, (String)object6);
                    ((g)object2).g = object3;
                    if (object3 == null) return Unit.a;
                    try {
                        bl4 = ((Fragment)object2).isAdded();
                        if (!bl4) return Unit.a;
                        object = d.Companion;
                        object6 = ((g)object2).f;
                        object3 = ((g)object2).g;
                        object7 = object3 != null ? (object3 = ((PayNowResponse)object3).getTransactionId()) : null;
                    }
                    catch (Exception exception2) {
                        break block21;
                    }
                    String string2 = "";
                    object.getClass();
                    bl4 = false;
                    object = null;
                    Object var15_21 = null;
                    n4 = 2;
                    object3 = object2;
                    object5 = object6;
                    object6 = object7;
                    object7 = string2;
                    string2 = null;
                    object = d$a.a((vp1_2)object2, n4, (String)object5, (String)object6, (String)object7, false, null);
                    object2 = ((Fragment)object2).getChildFragmentManager();
                    object3 = "OtpBottomSheetFragment";
                    ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                    return Unit.a;
                }
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception2);
                return Unit.a;
            }
            if (object3 != null) {
                object6 = ((PayNowResponse)object3).getTransactionInformation();
            } else {
                n7 = 0;
                object6 = null;
            }
            if (object6 == null) return Unit.a;
            object6 = ((g)object2).k;
            if (object6 != null && (object6 = ((PriceValidation)object6).getPriceSplitup()) != null) {
                object6 = ((PriceSplitUp)object6).getLoyalty();
            } else {
                n7 = 0;
                object6 = null;
            }
            if (object6 != null) {
                object6 = AnalyticsManager.Companion;
                GTMEvents gTMEvents = ((AnalyticsManager$Companion)object6).getInstance().getGtmEvents();
                String string3 = "SavedCard_SplitPayment";
                ak0_0.a((AnalyticsManager$Companion)object6, gTMEvents, (String)object7, string3);
            }
            if ((object6 = ((PayNowResponse)object3).getTransactionInformation()) != null && (object6 = ((TransactionInformation)object6).getPaymentInformation()) != null) {
                object6 = ((PaymentInformation)object6).getPaymentInstrument();
            } else {
                n7 = 0;
                object6 = null;
            }
            object7 = "UPI";
            n7 = (int)(((String)object7).equalsIgnoreCase((String)object6) ? 1 : 0);
            if (n7 != 0) {
                ((g)object2).t = object;
                object = ((PayNowResponse)object3).getTransactionInformation();
                if (object != null && (object = ((TransactionInformation)object).getPaymentInformation()) != null) {
                    object5 = ((PaymentInformation)object).getIntentURI();
                }
                ((g)object2).u = object5;
                object = cp$a.e();
                object.getClass();
                boolean bl5 = cp_1.f();
                if (bl5) {
                    object = new cn2_1();
                    object3 = ka0_0.UPI_PAYMENT;
                    object4 = "paymentType";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    ((cn2_1)object).c = object3;
                    Intrinsics.checkNotNullParameter(object2, "onCountDownSuccess");
                    ((cn2_1)object).b = object2;
                    object2 = ((Fragment)object2).requireActivity().getSupportFragmentManager();
                    object3 = "PaymentAcc";
                    ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                    return Unit.a;
                } else {
                    ((g)object2).Ya();
                }
                return Unit.a;
            }
            object2 = ((g)object2).Wa();
            bl3 = dm0_0.b;
            n7 = 12;
            object3 = new hj2_0((String)object, n7, bl3, false);
            ((kj2_1)object2).c((hj2_0)object3);
            return Unit.a;
        }
        int n8 = ((DataCallback)object).getStatus();
        if (n8 != (bl2 = true)) return Unit.a;
        object = ((g)object2).Wa();
        bl2 = dm0_0.b;
        int n10 = 14;
        object2 = new hj2_0(null, n10, bl2, false);
        ((kj2_1)object).c((hj2_0)object2);
        return Unit.a;
    }
}

