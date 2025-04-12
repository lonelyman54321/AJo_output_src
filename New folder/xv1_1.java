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
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XV1
 */
public final class xv1_1
implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ yv1_1 a;

    public /* synthetic */ xv1_1(yv1_1 yv1_12) {
        this.a = yv1_12;
    }

    public final boolean onGroupClick(ExpandableListView object, View object2, int n3, long l2) {
        int n4;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = ((yv1_1)object).a;
        Object object3 = null;
        object2 = object2 != null ? object2.D4() : null;
        Object object4 = ((yv1_1)object).d;
        hh3_2 hh3_22 = ((yv1_1)object).f;
        String string2 = "-";
        String string3 = ">";
        String string4 = "Global Nav";
        if (object4 != null && (n4 = object4.getChildrenCount(n3)) == 0) {
            object4 = ((yv1_1)object).d;
            if (object4 != null) {
                object3 = object4.c.get(n3);
            }
            if ((n3 = object3 instanceof CMSNavigation) != 0) {
                object3 = (CMSNavigation)object3;
                Object object5 = ((CMSNavigation)object3).getName();
                ((yv1_1)object).e = object5;
                object5 = AnalyticsManager.Companion;
                object4 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
                String string5 = ((yv1_1)object).e;
                string3 = n1.a((String)object2, string3, string5);
                ak0_0.a((AnalyticsManager$Companion)object5, (GTMEvents)object4, string4, string3);
                object5 = ((yv1_1)object).e;
                object5 = n1.a((String)object2, string2, (String)object5);
                object4 = (jo_2)hh3_22.getValue();
                ((jo_2)object4).x((String)object5);
                object5 = ((yv1_1)object).d;
                if (object5 != null) {
                    object5.notifyDataSetChanged();
                }
                object5 = new Bundle();
                string3 = ((yv1_1)object).e;
                object5.putString("category_name", string3);
                object5.putString("Category_L1_L2", (String)object2);
                object4 = FirebaseEvents.Companion.getInstance();
                string3 = "navigation_used";
                ((FirebaseEvents)object4).sendEvent(string3, (Bundle)object5);
                ((yv1_1)object).P7((CMSNavigation)object3);
            }
        } else {
            object4 = ((yv1_1)object).d;
            if (object4 != null) {
                object3 = object4.c.get(n3);
            }
            if ((n3 = (object3 = (NavImpl)object3) instanceof Navigation) != 0) {
                Object object6 = ((Navigation)object3).getName();
                ((yv1_1)object).e = object6;
                object6 = AnalyticsManager.Companion;
                object3 = ((AnalyticsManager$Companion)object6).getInstance().getGtmEvents();
                object4 = ((yv1_1)object).e;
                object4 = n1.a((String)object2, string3, (String)object4);
                ak0_0.a((AnalyticsManager$Companion)object6, (GTMEvents)object3, string4, (String)object4);
            }
        }
        object = ((yv1_1)object).e;
        object = n1.a((String)object2, string2, (String)object);
        ((jo_2)hh3_22.getValue()).x((String)object);
        return false;
    }
}

