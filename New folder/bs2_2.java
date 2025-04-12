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
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bs2
 */
public final class bs2_2
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ds2_2 a;

    public /* synthetic */ bs2_2(ds2_2 ds2_22) {
        this.a = ds2_22;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = "NetBanking";
        if (bl2) {
            String string2;
            uh_1.Companion.getClass();
            object2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            uh_1.e = object3;
            Object object4 = ((ds2_2)object).b;
            if (object4 != null) {
                object2 = ((ds2_2)object).g;
                string2 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                String string3 = "payment accordian open";
                String string4 = "net banking";
                String string5 = "payment_accordian_open";
                Object var10_15 = null;
                object4.g(string2, string3, string4, null, string5);
            }
            object2 = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
            object4 = "Net_Banking_clicked";
            string2 = "Net Banking selected";
            ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object3, (String)object4, string2);
            uh_1.d = bl2 = true;
            ((ds2_2)object).f.showContentContainer();
            object2 = ((ds2_2)object).b;
            if (object2 != null) {
                object3 = ((ds2_2)object).e;
                int n3 = ((rw_2)object).a;
                object2.k((ToggleButton)object3, n3);
            }
        } else {
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            object2 = uh_1.Companion;
            object2.getClass();
            bl2 = uh_1.c;
            int n4 = -1;
            if ((bl2 && (bl2 = ((m80_0)(object2 = ((ds2_2)object).c.A())).d()) || !(bl2 = uh_1.d)) && !(bl2 = Intrinsics.areEqual(object2 = uh_1.e, object3))) {
                ((ds2_2)object).w(n4);
                object2 = ((ds2_2)object).h;
                ((ku1_2)object2).a();
            } else {
                ((ds2_2)object).w(n4);
                object2 = ((ds2_2)object).h;
                object3 = ((ku1_2)object2).b;
                if (object3 != null) {
                    object3.a();
                }
                if ((object3 = ((ds2_2)object).d) != null) {
                    object8 = ((ku1_2)object2).d;
                    object7 = object8.j0();
                    object6 = object8.n8();
                    object5 = hj_1.NET_BANKING;
                    object8 = object8.H();
                    op2_2.d((op2_2)object3, (PaymentInstruments)object7, (TenantResponse)object6, object5, (HashSet)object8);
                }
                ((ku1_2)object2).a();
            }
            object2 = ((ds2_2)object).b;
            if (object2 != null) {
                object3 = null;
                object2.i4(null);
            }
            Bundle bundle = new Bundle();
            object2 = ((ds2_2)object).g;
            object3 = ((NewCustomEventsRevamp)object2).getPAYMENT_MODE();
            bundle.putString((String)object3, "net banking");
            object8 = ((ds2_2)object).b;
            if (object8 != null) {
                object7 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                object5 = "net banking";
                String string6 = "payment_accordian_close";
                object6 = "payment accordian close";
                object8.g((String)object7, (String)object6, (String)object5, bundle, string6);
            }
            object2 = ((ds2_2)object).f;
            ((AjioCustomExpandablePanel)((Object)object2)).hideContentContainer();
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new cs2_2((ds2_2)object);
        object2.postDelayed((Runnable)object3, 1000L);
    }
}

