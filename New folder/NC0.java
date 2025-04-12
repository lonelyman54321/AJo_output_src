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
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class NC0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ NC0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (xp2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = new Bundle();
                n3 = ((jo_2)((xp2_2)object2).k.getValue()).d();
                Object object3 = String.valueOf(n3);
                object.putString("number_of_items_on_cart", (String)object3);
                object3 = ((xp2_2)object2).q;
                String string2 = ((NewCustomEventsRevamp)object3).getEA_NAV_CLICK_HEADER();
                String string3 = ((NewCustomEventsRevamp)object3).getEN_NAV_CLICK();
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                Object object4 = av_0.a(analyticsManager$Companion);
                String string4 = av_0.a(analyticsManager$Companion);
                String string5 = ((xp2_2)object2).r;
                String string6 = ((xp2_2)object2).s;
                int n4 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "buttonTap", string2, "Bag Button", string3, (String)object4, string4, string5, (Bundle)object, string6, false, null, n4, null);
                Object object5 = analyticsManager$Companion.getInstance().getGtmEvents();
                object4 = ne_0.b((Bundle)object);
                string3 = "pdp screen";
                string4 = null;
                string2 = "Header Click";
                int n7 = 16;
                GTMEvents.pushButtonTapEvent$default((GTMEvents)object5, string2, "Proceed to Bag", string3, (AnalyticsData)object4, null, n7, null);
                qn_2.Companion.getClass();
                object = new qn_2();
                object3 = new Bundle();
                boolean bl2 = true;
                object3.putBoolean("cart_tab_selection", bl2);
                ((Fragment)object).setArguments((Bundle)object3);
                object3 = ((xp2_2)object2).g;
                object5 = null;
                String string7 = "activityFragmentListener";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string7);
                    n3 = 0;
                    object3 = null;
                }
                if ((object2 = ((xp2_2)object2).g) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string7);
                } else {
                    object5 = object2;
                }
                object2 = object5.y();
                j3$a.a((j3_0)object3, (Fragment)object2, (Fragment)object, bl2, "CartFragment");
                return;
            }
            case 0: 
        }
        rc0_2.a a2 = rc0_2.Companion;
        object2 = (rc0_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((rc0_2)object2).f;
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

