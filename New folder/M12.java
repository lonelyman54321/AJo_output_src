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
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

public final class M12
implements View.OnClickListener {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ M12(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onClick(View view) {
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        Bundle bundle = new Bundle();
        Object object = String.valueOf(newProductDetailsFragment.Wa().d());
        bundle.putString("number_of_items_on_cart", (String)object);
        object = newProductDetailsFragment.H;
        String string2 = ((NewCustomEventsRevamp)object).getEA_NAV_CLICK_HEADER();
        String string3 = ((NewCustomEventsRevamp)object).getEN_NAV_CLICK();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        Object object2 = av_0.a(analyticsManager$Companion);
        String string4 = av_0.a(analyticsManager$Companion);
        String string5 = newProductDetailsFragment.n1;
        String string6 = newProductDetailsFragment.o1;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "buttonTap", string2, "Bag Button", string3, (String)object2, string4, string5, bundle, string6, false, null, 1536, null);
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        object2 = ne_0.b(bundle);
        GTMEvents.pushButtonTapEvent$default(gTMEvents, "Header Click", "Proceed to Bag", "pdp screen", (AnalyticsData)object2, null, 16, null);
        newProductDetailsFragment.Xb();
    }
}

