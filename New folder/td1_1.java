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
 * Renamed from tD1
 */
public final class td1_1
implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ vd1_1 a;

    public /* synthetic */ td1_1(vd1_1 vd1_12) {
        this.a = vd1_12;
    }

    public final boolean onGroupClick(ExpandableListView object, View object2, int n3, long l2) {
        Object object3;
        int n4;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = ((vd1_1)object).a;
        Object object4 = null;
        object2 = object2 != null ? "" : null;
        Object object5 = ((vd1_1)object).c;
        hh3_2 hh3_22 = ((vd1_1)object).e;
        String string2 = "-";
        if (object5 != null && (n4 = object5.getChildrenCount(n3)) == 0) {
            object5 = ((vd1_1)object).c;
            if (object5 != null) {
                object4 = object5.c.get(n3);
            }
            if ((n3 = object4 instanceof CMSNavigation) != 0) {
                object4 = (CMSNavigation)object4;
                ((vd1_1)object).d = object3 = ((CMSNavigation)object4).getName();
                object3 = n1.a((String)object2, string2, (String)object3);
                object5 = (jo_2)hh3_22.getValue();
                ((jo_2)object5).x((String)object3);
                object3 = ((vd1_1)object).c;
                if (object3 != null) {
                    object3.notifyDataSetChanged();
                }
                object3 = new Bundle();
                String string3 = ((vd1_1)object).d;
                object3.putString("category_name", string3);
                object3.putString("Category_L1_L2", (String)object2);
                object5 = FirebaseEvents.Companion.getInstance();
                string3 = "navigation_used";
                ((FirebaseEvents)object5).sendEvent(string3, (Bundle)object3);
                ((vd1_1)object).f((CMSNavigation)object4);
            }
        } else {
            object5 = ((vd1_1)object).c;
            if (object5 != null) {
                object4 = object5.c.get(n3);
            }
            if ((n3 = (object4 = (NavImpl)object4) instanceof Navigation) != 0) {
                object4 = (Navigation)object4;
                ((vd1_1)object).d = object3 = ((Navigation)object4).getName();
            }
        }
        object3 = AnalyticsManager.Companion;
        object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
        object5 = ((vd1_1)object).d;
        object5 = n1.a((String)object2, ">", (String)object5);
        ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object4, "Global Nav", (String)object5);
        object = ((vd1_1)object).d;
        object = n1.a((String)object2, string2, (String)object);
        ((jo_2)hh3_22.getValue()).x((String)object);
        return false;
    }
}

