/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class L81
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L81(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4 = this.a;
        switch (n4) {
            default: {
                dv_0 dv_02;
                object = (zr2_1)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                dv_0 dv_03 = ((zr2_1)object).b;
                if (dv_03 != null) {
                    dv_03.c();
                }
                if ((dv_02 = ((zr2_1)object).b) != null) {
                    object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                    String string2 = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
                    String string3 = "wallet verify";
                    String string4 = "verify by otp";
                    String string5 = "wallet_verify";
                    dv_02.g(string2, string3, string4, null, string5);
                }
                object = AnalyticsManager.Companion;
                ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().pushButtonTapEvent("spc wallet verify otp", "", "single page checkout");
                GTMEvents.pushCheckoutInteractionsEvent$default(((AnalyticsManager$Companion)object).getInstance().getGtmEvents(), "wallet verify", "click", "checkout_wallet_verify_click", "single page checkout", null, 16, null);
                return;
            }
            case 0: 
        }
        object = (N81)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((uq2_0)object).Qa().d;
        int n7 = 0;
        Object object3 = null;
        if (object2 != null && (object2 = ((RtoResponseData)object2).getRtoData()) != null) {
            object2 = ((RtoData)object2).getEntries();
        } else {
            n3 = 0;
            object2 = null;
        }
        WX0 wX0 = WX0.CLOSE_DIALOG;
        Object var6_10 = null;
        if (object2 != null) {
            n3 = ((ArrayList)object2).size();
        } else {
            n3 = 0;
            object2 = null;
        }
        ((uq2_0)object).Sa(wX0, n3);
        object2 = ((uq2_0)object).g;
        if (object2 != null) {
            n3 = ((sw_0)object2).getPreference("RTO_DIALOG_VISIBILITY_COUNT", 0);
            object3 = n3;
        }
        if (object3 != null) {
            n3 = (Integer)object3;
        } else {
            n3 = 0;
            object2 = null;
        }
        object3 = ((uq2_0)object).Qa().l;
        if (object3 != null) {
            n7 = ((RtoFirebaseData)object3).getVisibilityThreshold();
        } else {
            n7 = 0;
            object3 = null;
        }
        if (n3 >= n7) {
            object2 = ((uq2_0)object).Qa();
            n7 = 1;
            ((lq2_0)object2).e(n7 != 0);
            object2 = ((uq2_0)object).g;
            if (object2 != null) {
                ((jo_2)object2).C(0);
            }
        }
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

