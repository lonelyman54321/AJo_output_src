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
import com.ril.ajio.services.data.Home.LinkDetail;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gf3
 */
public final class gf3_0
implements View.OnClickListener {
    public final /* synthetic */ LinkDetail a;
    public final /* synthetic */ hf3_1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gf3_0(LinkDetail linkDetail, hf3_1 hf3_12, String string2) {
        this.a = linkDetail;
        this.b = hf3_12;
        this.c = string2;
    }

    public final void onClick(View object) {
        LinkDetail linkDetail = this.a;
        Intrinsics.checkNotNullParameter(linkDetail, "$linkDetail");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = new Bundle();
        Object object3 = linkDetail.getLinkName();
        object.putString("category_name", (String)object3);
        object3 = object2.d;
        Object object4 = linkDetail.getLinkName();
        CharSequence charSequence = new StringBuilder();
        charSequence.append((String)object3);
        object3 = "->";
        charSequence.append((String)object3);
        charSequence.append((String)object4);
        object4 = charSequence.toString();
        object.putString("Category_L1_L2", (String)object4);
        object4 = FirebaseEvents.Companion.getInstance();
        charSequence = "navigation_used";
        ((FirebaseEvents)object4).sendEvent((String)charSequence, (Bundle)object);
        object = object2.a;
        object2 = object != null ? object.d() : null;
        object4 = linkDetail.getLinkName();
        object2 = nn_2.a((String)object2, (String)object3);
        charSequence = this.c;
        object2 = BW0.b((StringBuilder)object2, (String)charSequence, (String)object3, (String)object4);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object3 = AnalyticsManager.Companion;
            object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
            charSequence = "Global Nav";
            ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object4, (String)charSequence, (String)object2);
        }
        if (object != null) {
            object.i(linkDetail);
        }
    }
}

