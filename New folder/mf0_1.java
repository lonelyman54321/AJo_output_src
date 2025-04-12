/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MF0
 */
public final class mf0_1
extends RecyclerView$B {
    public final View a;
    public final HomeRowData b;
    public final x82_0 c;
    public final NewCustomEventsRevamp d;
    public final String e;
    public final String f;
    public final View g;
    public final AjioTextView h;

    public mf0_1(View object, HomeRowData object2, x82_0 object3) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        object2 = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.d = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.e = object2 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        this.f = object2 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        int n3 = R$id.row_shop_the_look;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.g = object2;
        n3 = R$id.widgetCta;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (AjioTextView)object;
        this.h = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(boolean bl2, boolean bl3) {
        String string2;
        mf0_1 mf0_12 = this;
        Object object = this.d;
        if (bl2) {
            string2 = ((NewCustomEventsRevamp)object).getEVENT_CATEGORY_USER_LEVEL_EXPLORE();
            object = ((NewCustomEventsRevamp)object).getEVENT_NAME_USER_LEVEL_EXPLORE();
        } else if (bl3) {
            string2 = ((NewCustomEventsRevamp)object).getEVENT_CATEGORY_DYNAMIC_EXPLORE();
            object = ((NewCustomEventsRevamp)object).getEVENT_NAME_EXPLORE_ALL();
        } else {
            string2 = ((NewCustomEventsRevamp)object).getEVENT_CATEGORY_PRODUCT_EXPLORE();
            object = ((NewCustomEventsRevamp)object).getEVENT_NAME_EXPLORE_ALL();
        }
        Object object2 = object;
        NewCustomEventsRevamp newCustomEventsRevamp = mf0_12.d;
        String string3 = newCustomEventsRevamp.getEVENT_ACTION_EXPLORE_ALL();
        String string4 = av_0.a(AnalyticsManager.Companion);
        String string5 = mf0_12.e;
        String string6 = mf0_12.f;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, "", (String)object2, string4, "home landing screen", string5, null, string6, false, null, 1536, null);
    }
}

