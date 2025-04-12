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
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LZ1
 */
public final class lz1_0
implements View.OnClickListener {
    public final /* synthetic */ mz1_2 a;
    public final /* synthetic */ List b;

    public /* synthetic */ lz1_0(mz1_2 mz1_22, List list) {
        this.a = mz1_22;
        this.b = list;
    }

    public final void onClick(View view) {
        int n3;
        int n4;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((mz1_2)object).b;
        if (object2 != null && (object2 = this.b) != null && (n4 = ((RecyclerView$B)object).getAdapterPosition()) < (n3 = object2.size()) && (n4 = ((RecyclerView$B)object).getAdapterPosition()) >= 0) {
            Object object3;
            n4 = ((RecyclerView$B)object).getAdapterPosition();
            object2 = (Notifications)object2.get(n4);
            Bundle bundle = new Bundle();
            long l2 = ((Notifications)object2).getNotiType();
            long l3 = 5001L;
            String string2 = "notification_type";
            Object object4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object4 == false) {
                object3 = "order";
                bundle.putString(string2, (String)object3);
            } else {
                object3 = "offer";
                bundle.putString(string2, (String)object3);
            }
            object3 = AnalyticsManager.Companion;
            Object object5 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents().getScreenName();
            bundle.putString("screenname", (String)object5);
            object5 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents().getScreenName();
            bundle.putString("screen_name", (String)object5);
            object5 = FirebaseEvents.Companion.getInstance();
            String string3 = "inapp_notification_clicked";
            ((FirebaseEvents)object5).sendEvent(string3, bundle);
            NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
            String string4 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp().getEC_NOTI_INTERACTION();
            String string5 = bundle.getString(string2, "");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
            String string7 = cv_0.a((AnalyticsManager$Companion)object3);
            String string8 = "notification click";
            String string9 = "notification_click";
            String string10 = "notification screen";
            String string11 = "notification screen";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string8, string5, string9, string10, string11, string6, null, string7, false, null, n7, null);
            bundle = new Bundle();
            object5 = ((Notifications)object2).getDeepLinkUrl();
            bundle.putString("DEEP_LINK_MY_ACCOUNT", (String)object5);
            object3 = "NOTIFICATION_POSITION";
            int n8 = ((RecyclerView$B)object).getAdapterPosition();
            bundle.putInt((String)object3, n8);
            l2 = ((Notifications)object2).getNotiType();
            object2 = l2;
            object = ((mz1_2)object).b;
            object.J6(bundle, (Long)object2);
        }
    }
}

