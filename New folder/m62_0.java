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
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M62
 */
public final class m62_0
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final t82_0 c;
    public final cq1_2 d;
    public final sj2_0 e;
    public final View f;
    public final NewCustomEventsRevamp g;
    public final NewEEcommerceEventsRevamp h;
    public final boolean i;

    public m62_0(View view, yi2_1 object, t82_0 object2, cq1_2 object3, sj2_0 sj2_02) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object2, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(object3, "moreProductOfferCallback");
        Intrinsics.checkNotNullParameter(sj2_02, "pdpuiDelegateListener");
        super(view);
        this.a = view;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = sj2_02;
        object2 = AnalyticsManager.Companion;
        this.g = object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.h = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        object = object.o5();
        object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        this.i = bl2 = Intrinsics.areEqual(object, object2);
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.f = view;
    }

    public final void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.pdp_more_offers;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            object = this.b.F7();
            cq1_2 cq1_22 = this.d;
            cq1_22.a2((ArrayList)object);
        }
    }

    public final void w(Bundle bundle) {
        NewCustomEventsRevamp newCustomEventsRevamp = this.g;
        String string2 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTION();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.h;
        String string3 = newEEcommerceEventsRevamp.getPrevScreen();
        String string4 = newEEcommerceEventsRevamp.getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "bank offers mini card", "viewed", "product_details_interactions", "pdp screen", "pdp screen", string3, bundle, string4, false, null, 1536, null);
    }

    public final void x(Bundle bundle) {
        NewCustomEventsRevamp newCustomEventsRevamp = this.g;
        String string2 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTION();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.h;
        String string3 = newEEcommerceEventsRevamp.getPrevScreen();
        String string4 = newEEcommerceEventsRevamp.getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "coupon  mini card", "viewed", "product_details_interactions", "pdp screen", "pdp screen", string3, bundle, string4, false, null, 1536, null);
    }
}

