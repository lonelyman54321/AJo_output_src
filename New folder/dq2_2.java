/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dq2
 */
public final class dq2_2
implements Function1 {
    public final /* synthetic */ g a;

    public /* synthetic */ dq2_2(g g3) {
        this.a = g3;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "lpOtpResponseCallback");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3) {
            object3 = ((g)object2).c;
            if (object3 != null) {
                object3.h();
            }
            n3 = ((DataCallback)object).getStatus();
            boolean bl2 = false;
            Object object4 = null;
            if (!n3) {
                object3 = String.valueOf(((DataCallback)object).getData());
                Class<PayNowResponse> clazz = PayNowResponse.class;
                if ((object3 = (PayNowResponse)JsonUtils.fromJson((String)object3, clazz)) != null) {
                    object4 = ((PayNowResponse)object3).getTransactionInformation();
                }
                if (object4 != null) {
                    object3 = AnalyticsManager.Companion;
                    object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                    clazz = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents().getScreenName();
                    String string2 = "  Placeorder_Loyaltyrewadz_EntirePayment_OldCard";
                    ((GTMEvents)object4).pushButtonTapEvent("Placeorder_Loyaltyrewadz_EntirePayment", string2, (String)((Object)clazz));
                    object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                    object3 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents().getScreenName();
                    clazz = "LoyaltyRewards_OTPAuthentication";
                    String string3 = "OTPAuthenticatedSavedCard";
                    ((GTMEvents)object4).pushButtonTapEvent((String)((Object)clazz), string3, (String)object3);
                    object2 = ((g)object2).Wa();
                    bl2 = dm0_0.b;
                    object = JsonUtils.toJson(((DataCallback)object).getData());
                    int n4 = 12;
                    object3 = new hj2_0((String)object, n4, bl2, false);
                    ((kj2_1)object2).c((hj2_0)object3);
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == (n3 = 1)) {
                    object = ((g)object2).Wa();
                    n3 = (int)(dm0_0.b ? 1 : 0);
                    int n8 = 14;
                    object2 = new hj2_0(null, n8, n3 != 0, false);
                    ((kj2_1)object).c((hj2_0)object2);
                }
            }
        }
        return Unit.a;
    }
}

