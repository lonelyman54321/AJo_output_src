/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ToggleButton
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qs2
 */
public final class qs2_1
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ss2_2 a;

    public /* synthetic */ qs2_1(ss2_2 ss2_22) {
        this.a = ss2_22;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = "UPI";
        Object object4 = null;
        if (bl2) {
            uh_1.Companion.getClass();
            Intrinsics.checkNotNullParameter(object3, "<set-?>");
            uh_1.e = object3;
            bl2 = false;
            uh_1.d = false;
            object2 = ((ss2_2)object).b;
            if (object2 != null) {
                object3 = ((ss2_2)object).h;
                int n3 = ((rw_2)object).a;
                object2.k((ToggleButton)object3, n3);
            }
            object2 = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
            String string2 = "UPI_clicked";
            String string3 = "UPI  selected";
            ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object3, string2, string3);
            object2 = ((ss2_2)object).b;
            if (object2 != null) {
                object3 = ((ss2_2)object).q;
                String string4 = ((NewCustomEventsRevamp)object3).getEC_CHECKOUT_INTERACTIONS();
                String string5 = "payment accordian open";
                String string6 = "upi click";
                String string7 = "payment_accordian_open";
                Object object5 = object2;
                object2.g(string4, string5, string6, null, string7);
            }
            ((ss2_2)object).g.showContentContainer();
            object3 = ((ss2_2)object).t;
            if (object3 == null) {
                object3 = hj_1.UPI;
                ((ss2_2)object).a((hj_1)((Object)object3), null);
            } else {
                object3 = hj_1.SAVED_UPI;
                ((ss2_2)object).a((hj_1)((Object)object3), null);
            }
            if (object2 != null) {
                object3 = ((ss2_2)object).v;
                object4 = ((cu3)object3).d;
                object3 = ((cu3)object3).c;
                int n4 = ((ArrayList)object3).size();
                object2.I3(n4, (ArrayList)object4);
            }
        } else {
            uy2_1.a = "";
            object2 = uh_1.Companion;
            object2.getClass();
            bl2 = uh_1.c;
            if ((bl2 && (bl2 = ((m80_0)(object2 = ((ss2_2)object).c.A())).d()) || !(bl2 = uh_1.d)) && !(bl2 = Intrinsics.areEqual(object2 = uh_1.e, object3))) {
                object2 = ((ss2_2)object).v;
                ((cu3)object2).c();
            } else {
                object2 = ((ss2_2)object).v;
                object3 = ((ss2_2)object).d;
                ((cu3)object2).b((op2_2)object3);
            }
            object2 = ((ss2_2)object).b;
            if (object2 != null) {
                object2.i4(null);
            }
            Bundle bundle = new Bundle();
            object2 = ((ss2_2)object).q;
            object3 = ((NewCustomEventsRevamp)object2).getPAYMENT_MODE();
            object4 = "upi";
            bundle.putString((String)object3, (String)object4);
            dv_0 dv_02 = ((ss2_2)object).b;
            if (dv_02 != null) {
                String string8 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                String string9 = "upi click";
                String string10 = "payment_accordian_close";
                String string11 = "payment accordian close";
                dv_02.g(string8, string11, string9, bundle, string10);
            }
            object2 = ((ss2_2)object).g;
            ((AjioCustomExpandablePanel)((Object)object2)).hideContentContainer();
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new rs2_1((ss2_2)object);
        object2.postDelayed((Runnable)object3, 1000L);
    }
}

