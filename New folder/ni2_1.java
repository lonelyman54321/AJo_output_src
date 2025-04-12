/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ni2
 */
public final class ni2_1
implements View.OnClickListener {
    public final /* synthetic */ oi2_1 a;

    public /* synthetic */ ni2_1(oi2_1 oi2_12) {
        this.a = oi2_12;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.getClass();
        Object object2 = h40_0.a;
        object2 = h40_0.u();
        Object object3 = h40_0.t();
        String string2 = "bannerName";
        boolean bl3 = object3.has(string2);
        String string3 = null;
        if (bl3) {
            object3 = object3.optString(string2);
        } else {
            bl2 = false;
            object3 = null;
        }
        cp_1.Companion.getClass();
        Object object4 = cp$a.e();
        String string4 = "";
        if (object2 == null) {
            object2 = string4;
        }
        object4.getClass();
        String string5 = cp_1.k((String)object2);
        object2 = AnalyticsManager.Companion;
        object4 = ((AnalyticsManager$Companion)object2).getInstance();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager)object4).getNewEEcommerceEventsRevamp();
        String string6 = av_0.a((AnalyticsManager$Companion)object2);
        String string7 = bv_0.a((AnalyticsManager$Companion)object2);
        String string8 = object3 == null ? string4 : object3;
        String string9 = "1|1";
        newEEcommerceEventsRevamp.pushSelectContentEventForThirdPartyBanner(string6, string7, string5, string8, string5, string9);
        object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        object3 = "dressToolPdpBannerConfig";
        object2 = ((cw)object2).d((String)object3);
        bl2 = object2.has(string2);
        if (bl2) {
            string3 = object2.optString(string2);
        }
        ((oi2_1)object).b.A4(string3, false);
    }
}

