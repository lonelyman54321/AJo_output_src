/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jx0
 */
public final class jx0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jx0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (oa2_1)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((oa2_1)object).b;
                if (object2 != null) {
                    String string2 = "";
                    DateRangeItem dateRangeItem = new DateRangeItem(string2, string2);
                    int n4 = ((RecyclerView$B)object).getAdapterPosition();
                    object2.a(n4, dateRangeItem);
                }
                return;
            }
            case 1: {
                n3 = InAppBottomUpdatesView.g;
                object = (InAppBottomUpdatesView)((Object)object);
                Intrinsics.checkNotNullParameter(object, (String)object2);
                NewCustomEventsRevamp newCustomEventsRevamp = ((InAppBottomUpdatesView)((Object)object)).e;
                String string3 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
                object2 = AnalyticsManager.Companion;
                String string4 = av_0.a((AnalyticsManager$Companion)object2);
                String string5 = av_0.a((AnalyticsManager$Companion)object2);
                object2 = ((InAppBottomUpdatesView)((Object)object)).f;
                String string6 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
                String string7 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, "install now", "", "event_app_update_interaction", string4, string5, string6, null, string7, false, null, 1536, null);
                ((InAppBottomUpdatesView)((Object)object)).d.completeUpdate();
                return;
            }
            case 0: 
        }
        object = (px0_1)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((px0_1)object).b;
        if (object != null) {
            object.show();
        }
    }
}

