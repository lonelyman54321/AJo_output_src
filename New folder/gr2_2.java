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
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gr2
 */
public final class gr2_2
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ir2_2 a;

    public /* synthetic */ gr2_2(ir2_2 ir2_22) {
        this.a = ir2_22;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = "COD";
        if (bl2) {
            uh_1.Companion.getClass();
            Intrinsics.checkNotNullParameter(object3, "<set-?>");
            uh_1.e = object3;
            object2 = ((ir2_2)object).k;
            object3 = ((ir2_2)object).c.A();
            boolean n3 = ((m80_0)object3).d();
            Object object5 = ((uh_1)object2).b;
            object2 = ((uh_1)object2).a;
            if (object5 != null) {
                ((eo2_0)object2).e = n3;
                ((eo2_0)object2).d = object5;
            }
            int bl3 = 13;
            ((eo2_0)object2).b(bl3);
            uh_1.c = bl2 = true;
            uh_1.d = bl2;
            ((ir2_2)object).f.showContentContainer();
            object3 = ((ir2_2)object).b;
            if (object3 != null) {
                object5 = ((ir2_2)object).e;
                int n4 = ((rw_2)object).a;
                object3.k((ToggleButton)object5, n4);
            }
            if (object3 != null) {
                object3.Ea(bl2);
            }
        } else {
            boolean bl3;
            uh_1.Companion.getClass();
            bl2 = false;
            object2 = null;
            uh_1.c = false;
            Bundle bundle = new Bundle();
            Object object4 = AnalyticsManager.Companion;
            Object object5 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp().getPAYMENT_MODE();
            String string2 = "cod";
            bundle.putString((String)object5, string2);
            object5 = ((ir2_2)object).b;
            if (object5 != null) {
                string2 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp().getEC_CHECKOUT_INTERACTIONS();
                String string3 = "cod click";
                String string4 = "payment_accordian_close";
                String string5 = "payment accordian close";
                object4 = object5;
                object5 = string2;
                string2 = string5;
                object4.g((String)object5, string5, string3, bundle, string4);
            }
            object4 = ((ir2_2)object).f;
            ((AjioCustomExpandablePanel)((Object)object4)).hideContentContainer();
            boolean bl4 = uh_1.d;
            if ((bl4 || (bl3 = Intrinsics.areEqual(object4 = uh_1.e, object3))) && (object3 = ((ir2_2)object).b) != null) {
                object3.Ea(false);
            }
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new hr2_2((ir2_2)object);
        object2.postDelayed((Runnable)object3, 1000L);
    }
}

