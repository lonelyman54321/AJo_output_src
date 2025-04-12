/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
import android.app.Activity;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class HW
extends RecyclerView$B
implements g71_0 {
    public final ConstraintLayout a;

    public HW(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.containerOnboarding;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (ConstraintLayout)((Object)object);
        this.a = object;
    }

    public final gw_2 D6() {
        return null;
    }

    public final void Y9(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        Intrinsics.checkNotNullParameter(string4, "returnId");
        Intrinsics.checkNotNullParameter(string5, "orderId");
        Intrinsics.checkNotNullParameter(string6, "position");
    }

    public final void Z6(BannerData bannerData, List list) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(list, "bannerList");
    }

    public final void c4(String string2, HotSpotT hotSpotT, String string3, BannerData bannerData, String string4, String string5) {
        Object object = hotSpotT;
        Intrinsics.checkNotNullParameter(hotSpotT, "hotspot");
        object = bannerData;
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(string5, "creativeSlot");
        Object object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        Object object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getEE_SELECT_PROMOTION();
        String string6 = String.valueOf(string3);
        String string7 = bv_0.a((AnalyticsManager$Companion)object2);
        String string8 = cv_0.a((AnalyticsManager$Companion)object2);
        NewEEcommerceEventsRevamp.pushEESelectPromotion$default((NewEEcommerceEventsRevamp)object, (String)object3, string6, "home landing screen", string7, "home landing screen", string8, true, false, null, null, string5, false, 2944, null);
        object2 = this;
        object = zv0_2.b(this.itemView.getContext());
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.app.Activity");
        object = (Activity)object;
        object3 = kj0_1.g();
        string6 = string3;
        ((kj0_1)object3).w((Activity)object, string3);
    }

    public final void e0() {
    }

    public final void m(String string2) {
    }
}

