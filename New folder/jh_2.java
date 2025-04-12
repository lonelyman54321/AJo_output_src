/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jH
 */
public final class jh_2
implements View.OnClickListener {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ kh_2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ jh_2(CMSNavigation cMSNavigation, kh_2 kh_22, String string2) {
        this.a = cMSNavigation;
        this.b = kh_22;
        this.c = string2;
    }

    public final void onClick(View object) {
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = new Bundle();
        CMSNavigation cMSNavigation = this.a;
        boolean bl2 = false;
        Object object3 = null;
        Object object4 = cMSNavigation != null ? cMSNavigation.getName() : null;
        Object object5 = "category_name";
        object.putString((String)object5, (String)object4);
        object4 = object2.d;
        object5 = cMSNavigation != null ? cMSNavigation.getName() : null;
        CharSequence charSequence = new StringBuilder();
        charSequence.append((String)object4);
        object4 = "->";
        charSequence.append((String)object4);
        charSequence.append((String)object5);
        object5 = charSequence.toString();
        object.putString("Category_L1_L2", (String)object5);
        object5 = FirebaseEvents.Companion.getInstance();
        charSequence = "navigation_used";
        ((FirebaseEvents)object5).sendEvent((String)charSequence, (Bundle)object);
        object = object2.a;
        object2 = object != null ? object.d() : null;
        if (cMSNavigation != null) {
            object3 = cMSNavigation.getName();
        }
        object2 = nn_2.a((String)object2, (String)object4);
        object5 = this.c;
        bl2 = TextUtils.isEmpty((CharSequence)(object2 = BW0.b((StringBuilder)object2, (String)object5, (String)object4, (String)object3)));
        if (!bl2) {
            object3 = AnalyticsManager.Companion;
            object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
            object5 = "Global Nav";
            ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object4, (String)object5, (String)object2);
        }
        if (object != null) {
            object.P7(cMSNavigation);
        }
    }
}

