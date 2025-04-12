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
import com.jio.jioads.videomodule.config.b;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.database.entity.Notifications;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from r7
 */
public final class r7_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = "this$0";
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, (String)object);
                n3 = (int)(s7.a() ? 1 : 0);
                if (n3 != 0 && (object = s7.N) == null) {
                    object = s7.h0();
                    n3 = (int)(((b)object).k ? 1 : 0);
                    if (n3 != 0) {
                        s7.e();
                    }
                }
                return;
            }
            case 1: {
                Object object = (cp2_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                n52_0 n52_02 = ((cp2_0)object).c;
                if (n52_02 != null) {
                    Object object2;
                    n52_02 = new Bundle();
                    Object object3 = ((cp2_0)object).b;
                    Intrinsics.checkNotNull(object3);
                    int n4 = ((RecyclerView$B)object).getAdapterPosition();
                    object3 = (Notifications)object3.get(n4);
                    Object object4 = new Bundle();
                    long l2 = ((Notifications)object3).getNotiType();
                    long l3 = 5001L;
                    String string2 = "notification_type";
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 == false) {
                        object2 = "order";
                        object4.putString(string2, (String)object2);
                    } else {
                        object2 = "offer";
                        object4.putString(string2, (String)object2);
                    }
                    object2 = AnalyticsManager.Companion;
                    Object object5 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                    object4.putString("screenname", (String)object5);
                    object5 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                    object4.putString("screen_name", (String)object5);
                    object5 = FirebaseEvents.Companion.getInstance();
                    String string3 = "inapp_notification_clicked";
                    ((FirebaseEvents)object5).sendEvent(string3, (Bundle)object4);
                    NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                    String string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEC_NOTI_INTERACTION();
                    object5 = "";
                    String string5 = object4.getString(string2, (String)object5);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    String string6 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
                    String string7 = cv_0.a((AnalyticsManager$Companion)object2);
                    String string8 = "notification click";
                    String string9 = "notification_click";
                    String string10 = "notification screen";
                    String string11 = "notification screen";
                    int n7 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string8, string5, string9, string10, string11, string6, null, string7, false, null, n7, null);
                    object2 = ((Notifications)object3).getDeepLinkUrl();
                    n52_02.putString("DEEP_LINK_MY_ACCOUNT", (String)object2);
                    object4 = "NOTIFICATION_POSITION";
                    int n8 = ((RecyclerView$B)object).getAdapterPosition();
                    n52_02.putInt((String)object4, n8);
                    object = ((cp2_0)object).c;
                    if (object != null) {
                        long l7 = ((Notifications)object3).getNotiType();
                        object3 = l7;
                        object.J6((Bundle)n52_02, (Long)object3);
                    }
                }
                return;
            }
            case 0: 
        }
        AjioExoPlayerFragment ajioExoPlayerFragment = (AjioExoPlayerFragment)this.b;
        Intrinsics.checkNotNullParameter(ajioExoPlayerFragment, "this$0");
        ajioExoPlayerFragment.Sa();
    }
}

