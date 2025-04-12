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
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lH
 */
public final class lh_2
implements View.OnClickListener {
    public final /* synthetic */ mh_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CMSNavigation c;

    public /* synthetic */ lh_2(mh_2 mh_22, String string2, CMSNavigation cMSNavigation) {
        this.a = mh_22;
        this.b = string2;
        this.c = cMSNavigation;
    }

    public final void onClick(View object) {
        mh_2 mh_22 = this.a;
        Intrinsics.checkNotNullParameter((Object)mh_22, "this$0");
        CMSNavigation cMSNavigation = this.c;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$cmsNavigation");
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        CharSequence charSequence = mh_22.a;
        String string2 = "->";
        charSequence = nn_2.a((String)charSequence, string2);
        String string3 = this.b;
        ((StringBuilder)charSequence).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        String string4 = "Global Nav";
        ((GTMEvents)object2).pushButtonTapEvent(string4, charSequence, (String)object);
        object = new Bundle();
        object2 = cMSNavigation.getName();
        object.putString("category_name", (String)object2);
        object2 = new StringBuilder();
        charSequence = mh_22.a;
        object2 = BW0.b((StringBuilder)object2, (String)charSequence, string2, string3);
        object.putString("Category_L1_L2", (String)object2);
        object2 = FirebaseEvents.Companion.getInstance();
        charSequence = "navigation_used";
        ((FirebaseEvents)object2).sendEvent((String)charSequence, (Bundle)object);
        object = mh_22.b;
        if (object != null) {
            object.P7(cMSNavigation);
        }
    }
}

