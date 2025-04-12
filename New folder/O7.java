/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.home.AjioHomeActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class O7
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O7(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = object;
                object3 = (Map)object;
                ((Function0)object2).invoke();
                return Unit.a;
            }
            case 1: {
                Object object4 = object;
                object4 = (Ns2$a)object;
                object2 = (Ns2)object2;
                Ns2$a.d((Ns2$a)object4, (Ns2)object2, 0, 0);
                return Unit.a;
            }
            case 0: 
        }
        Object object5 = object;
        object5 = (DataCallback)object;
        Object object6 = AjioHomeActivity.Companion;
        object2 = (AjioHomeActivity)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object6 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object6, (DataCallback)object5);
        if (n4 != 0 && (n4 = qo_0.b) == 0) {
            int n7;
            int n8;
            object6 = (Integer)((DataCallback)object5).getData();
            if (object6 != null && (n8 = ((Integer)object6).intValue()) == (n7 = 4)) {
                object5 = ((DataCallback)object5).getData();
                Intrinsics.checkNotNull(object5);
                object5 = (Number)object5;
                n3 = ((Number)object5).intValue();
                ((AjioHomeActivity)object2).q3(n3);
            } else if (object6 != null && (n4 = ((Integer)object6).intValue()) == (n8 = 3) && (n4 = (int)(qo_0.d ? 1 : 0)) == 0) {
                NewCustomEventsRevamp newCustomEventsRevamp = ((AjioHomeActivity)object2).l1;
                String string2 = newCustomEventsRevamp.getEC_APP_UPDATE_INTERACTION();
                object6 = AnalyticsManager.Companion;
                String string3 = av_0.a((AnalyticsManager$Companion)object6);
                String string4 = av_0.a((AnalyticsManager$Companion)object6);
                String string5 = "update";
                String string6 = "";
                String string7 = "event_app_update_interaction";
                String string8 = ((AjioHomeActivity)object2).m1;
                String string9 = ((AjioHomeActivity)object2).n1;
                int n10 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string3, string4, string8, null, string9, false, null, n10, null);
                n4 = 1;
                qo_0.d = n4;
                object5 = ((DataCallback)object5).getData();
                Intrinsics.checkNotNull(object5);
                object5 = (Number)object5;
                n3 = ((Number)object5).intValue();
                ((AjioHomeActivity)object2).q3(n3);
            }
        }
        return Unit.a;
    }
}

