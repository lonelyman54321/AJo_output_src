/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.entity.BannerAdData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Ba
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ Ba(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                h h3 = (h)this.b;
                Intrinsics.checkNotNullParameter(h3, "this$0");
                Intrinsics.checkNotNullParameter(object, "lpOtpReponseCallback");
                Object object2 = h3.e;
                GTMEvents gTMEvents = null;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    n3 = 0;
                    object2 = null;
                }
                ((PEProgressView)((Object)object2)).dismiss();
                n3 = ((DataCallback)object).getStatus();
                if (n3 == 0) {
                    object2 = AnalyticsManager.Companion;
                    gTMEvents = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    String string2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                    String string3 = "  Placeorder_Loyaltyrewadz_EntirePayment_NewCard";
                    gTMEvents.pushButtonTapEvent("Placeorder_Loyaltyrewadz_EntirePayment", string3, string2);
                    gTMEvents = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                    string2 = "LoyaltyRewards_OTPAuthentication";
                    String string4 = "  OTPAuthenticatedNewCard";
                    gTMEvents.pushButtonTapEvent(string2, string4, (String)object2);
                    object2 = ((DataCallback)object).getData();
                    if (object2 != null) {
                        object = String.valueOf(((DataCallback)object).getData());
                        h3.Oa((String)object);
                    }
                } else {
                    int n4 = ((DataCallback)object).getStatus();
                    if (n4 == (n3 = 1)) {
                        h3.Oa(null);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (BannerAdData)object;
        Object object3 = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = ((q22_0)object3).Wa();
        Yj2 yj2 = ((q22_0)object3).G0;
        String string5 = ((q22_0)object3).cb().d.V1;
        Object object5 = ((q22_0)object3).cb().d.M;
        object5 = object5 != null ? ((ProductsList)object5).getFreeTextSearch() : null;
        ((BannerAdViewModel)object4).triggerGAForBannerClick(yj2, string5, (BannerAdData)object, (String)object5);
        if (object != null && (object4 = ((BannerAdData)object).getClktrackers()) != null) {
            yj2 = null;
            if ((object4 = (String)object4.get(0)) != null) {
                object = ((BannerAdData)object).getCcbValue();
                Intrinsics.checkNotNullParameter(object4, "url");
                long l2 = k7.p();
                string5 = String.valueOf(l2);
                object5 = "[trq]";
                object4 = kotlin.text.b.n((String)object4, (String)object5, string5, false);
                if (object == null) {
                    object = "";
                }
                string5 = "[ccb]";
                object = kotlin.text.b.n((String)object4, string5, (String)object, false);
                object3 = ((q22_0)object3).Wa();
                ((BannerAdViewModel)object3).callBannerClickImpression((String)object);
            }
        }
        return Unit.a;
    }
}

