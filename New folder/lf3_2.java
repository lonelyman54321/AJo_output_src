/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnGroupClickListener
 */
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lf3
 */
public final class lf3_2
implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ nf3_2 a;

    public /* synthetic */ lf3_2(nf3_2 nf3_22) {
        this.a = nf3_22;
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int n3, long l2) {
        Object object;
        int n4;
        int n7 = n3;
        nf3_2 nf3_22 = this.a;
        Intrinsics.checkNotNullParameter(nf3_22, "this$0");
        Object object2 = nf3_22.a;
        Object object3 = null;
        object2 = object2 != null ? object2.d() : null;
        Object object4 = nf3_22.c;
        hh3_2 hh3_22 = nf3_22.e;
        Object object5 = nf3_22.j;
        String string2 = "-";
        Object object6 = " - ";
        String string3 = ">";
        String string4 = "Global Nav";
        if (object4 != null && (n4 = object4.getChildrenCount(n7)) == 0) {
            object4 = nf3_22.c;
            if (object4 != null) {
                object3 = object4.c.get(n7);
            }
            if ((n7 = object3 instanceof LinkDetail) != 0) {
                object3 = (LinkDetail)object3;
                nf3_22.d = object = ((LinkDetail)object3).getLinkName();
                object = AnalyticsManager.Companion;
                object4 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                String string5 = nf3_22.d;
                string3 = n1.a((String)object2, string3, string5);
                string5 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                ((GTMEvents)object4).pushButtonTapEvent(string4, string3, string5);
                object4 = ((NewCustomEventsRevamp)object5).getEC_USER_INTERACTION();
                string3 = ((NewCustomEventsRevamp)object5).getEA_NAV_CLICK_MAIN();
                string4 = nf3_22.d;
                string4 = n1.a((String)object2, (String)object6, string4);
                String string6 = av_0.a((AnalyticsManager$Companion)object);
                String string7 = av_0.a((AnalyticsManager$Companion)object);
                string5 = "navigation_click";
                String string8 = nf3_22.k;
                n7 = 0;
                object6 = nf3_22.l;
                int n8 = 1536;
                Object object7 = object6;
                object6 = object4;
                object4 = string2;
                string2 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object6, string3, string4, string5, string6, string7, string8, null, (String)object7, false, null, n8, null);
                object = nf3_22.d;
                object = n1.a((String)object2, (String)object4, (String)object);
                object5 = (jo_2)hh3_22.getValue();
                ((jo_2)object5).x((String)object);
                object = nf3_22.c;
                if (object != null) {
                    object.notifyDataSetChanged();
                }
                object = new Bundle();
                object6 = nf3_22.d;
                object.putString("category_name", (String)object6);
                object.putString("Category_L1_L2", (String)object2);
                object5 = FirebaseEvents.Companion.getInstance();
                object6 = "navigation_used";
                ((FirebaseEvents)object5).sendEvent((String)object6, (Bundle)object);
                nf3_22.i((LinkDetail)object3);
            } else {
                object4 = string2;
            }
        } else {
            object4 = string2;
            Object object8 = nf3_22.c;
            if (object8 != null) {
                object3 = object8.c.get(n7);
            }
            if ((n7 = (object3 = (NavImpl)object3) instanceof Navigation) != 0) {
                object = ((Navigation)object3).getName();
                nf3_22.d = object;
                object = AnalyticsManager.Companion;
                object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                object8 = nf3_22.d;
                string3 = n1.a((String)object2, string3, (String)object8);
                object8 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                ((GTMEvents)object3).pushButtonTapEvent(string4, string3, (String)object8);
                object3 = ((NewCustomEventsRevamp)object5).getEC_USER_INTERACTION();
                string3 = ((NewCustomEventsRevamp)object5).getEA_NAV_CLICK_MAIN();
                string4 = nf3_22.d;
                string4 = n1.a((String)object2, (String)object6, string4);
                String string9 = av_0.a((AnalyticsManager$Companion)object);
                String string10 = av_0.a((AnalyticsManager$Companion)object);
                object8 = "navigation_click";
                String string11 = nf3_22.k;
                string2 = null;
                object = nf3_22.l;
                int n10 = 1536;
                object6 = object3;
                Object object9 = object;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object3, string3, string4, (String)object8, string9, string10, string11, null, (String)object, false, null, n10, null);
            }
        }
        object = nf3_22.d;
        object = n1.a((String)object2, (String)object4, (String)object);
        ((jo_2)hh3_22.getValue()).x((String)object);
        return false;
    }
}

