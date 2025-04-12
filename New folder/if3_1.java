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
import com.ril.ajio.services.data.Home.LinkDetail;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from if3
 */
public final class if3_1
implements View.OnClickListener {
    public final /* synthetic */ jf3_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LinkDetail c;

    public /* synthetic */ if3_1(jf3_1 jf3_12, String string2, LinkDetail linkDetail) {
        this.a = jf3_12;
        this.b = string2;
        this.c = linkDetail;
    }

    public final void onClick(View object) {
        jf3_1 jf3_12 = this.a;
        Intrinsics.checkNotNullParameter((Object)jf3_12, "this$0");
        LinkDetail linkDetail = this.c;
        Intrinsics.checkNotNullParameter(linkDetail, "$linkDetail");
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        CharSequence charSequence = jf3_12.a;
        String string2 = "->";
        charSequence = nn_2.a((String)charSequence, string2);
        String string3 = this.b;
        ((StringBuilder)charSequence).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        String string4 = "Global Nav";
        ((GTMEvents)object2).pushButtonTapEvent(string4, charSequence, (String)object);
        object = new Bundle();
        object2 = linkDetail.getLinkName();
        object.putString("category_name", (String)object2);
        object2 = new StringBuilder();
        charSequence = jf3_12.a;
        object2 = BW0.b((StringBuilder)object2, (String)charSequence, string2, string3);
        object.putString("Category_L1_L2", (String)object2);
        object2 = FirebaseEvents.Companion.getInstance();
        charSequence = "navigation_used";
        ((FirebaseEvents)object2).sendEvent((String)charSequence, (Bundle)object);
        object = jf3_12.b;
        if (object != null) {
            object.i(linkDetail);
        }
    }
}

