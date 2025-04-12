/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import java.util.StringTokenizer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lc0
 */
public final class lc0_0
implements F62 {
    public final /* synthetic */ sc0_2 a;

    public /* synthetic */ lc0_0(sc0_2 sc0_22) {
        this.a = sc0_22;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b(object3, (DataCallback)object);
        if (n3 != 0) {
            object3 = ((sc0_2)object2).c;
            if (object3 != null) {
                ((AjioProgressView)((Object)object3)).dismiss();
                ((AjioProgressView)((Object)object3)).hideMessage();
            }
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            int n4 = 1;
            if (n3 == 0) {
                boolean bl2;
                object = ((sc0_2)object2).l;
                if (object != null) {
                    object2 = null;
                    ((h91)object).w = false;
                }
                if (object != null) {
                    ((h91)object).v = n4;
                }
                Intrinsics.checkNotNull(object);
                object = ((h91)object).u;
                object2 = new StringTokenizer((String)object);
                while (bl2 = ((StringTokenizer)object2).hasMoreTokens()) {
                    object = AnalyticsManager.Companion;
                    object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                    String string2 = ((StringTokenizer)object2).nextToken();
                    String string3 = "Coupon Purchased";
                    ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object3, string3, string2);
                }
            } else {
                n3 = ((DataCallback)object).getStatus();
                if (n3 == n4) {
                    object = ((DataCallback)object).getError();
                    ((sc0_2)object2).Ta((DataError)object);
                }
            }
        }
    }
}

