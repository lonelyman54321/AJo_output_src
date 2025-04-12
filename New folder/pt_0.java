/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pT
 */
public final class pt_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pt_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                Object uq2_22 = (tt3_0)this.b;
                Intrinsics.checkNotNullParameter(uq2_22, "this$0");
                Intrinsics.checkNotNullParameter(object, "v");
                object = object.getTag();
                Object object2 = "null cannot be cast to non-null type com.ril.ajio.payment.adapter.UPIAdapter.UPIViewHolder";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (Tt3$a)object;
                int n3 = ((tt3_0)uq2_22).f;
                int n4 = object.e;
                if (n3 != n4) {
                    ((tt3_0)uq2_22).f = n4;
                    uq2_22.notifyDataSetChanged();
                    object2 = ((tt3_0)uq2_22).d;
                    object2.c(null);
                    object = hj_1.INTENT_UPI;
                    int n7 = ((tt3_0)uq2_22).f;
                    List list = ((tt3_0)uq2_22).a;
                    Object object3 = (UpiAppInfo)list.get(n7);
                    object2.a((hj_1)((Object)object), (UpiAppInfo)object3);
                    n4 = ((tt3_0)uq2_22).f;
                    object = jk0_0.a(list.get(n4), "Individual UPI selected -");
                    uq2_22 = AnalyticsManager.Companion;
                    object2 = ((AnalyticsManager$Companion)uq2_22).getInstance().getGtmEvents();
                    object3 = "Individualupi_selected";
                    ak0_0.a((AnalyticsManager$Companion)uq2_22, (GTMEvents)object2, (String)object3, (String)object);
                }
                return;
            }
            case 1: {
                uq2_2 rt_12 = (uq2_2)this.b;
                Intrinsics.checkNotNullParameter(rt_12, "this$0");
                rt_12.a.E4();
                return;
            }
            case 0: 
        }
        rt_1 rt_12 = (rt_1)this.b;
        Intrinsics.checkNotNullParameter(rt_12, "this$0");
        object = rt_12.f;
        boolean bl3 = object.isChecked() ^ true;
        object.setChecked(bl3);
    }
}

