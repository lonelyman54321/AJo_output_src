/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.view.View;
import android.widget.CompoundButton;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class QT
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ST a;
    public final /* synthetic */ qq2_2 b;

    public /* synthetic */ QT(ST sT, qq2_2 qq2_22) {
        this.a = sT;
        this.b = qq2_22;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        qq2_2 qq2_22 = this.b;
        Intrinsics.checkNotNullParameter(qq2_22, "$rvData");
        View view = ((ST)object).g;
        String string2 = "Order Summary";
        Object object2 = ((ST)object).D;
        object = ((ST)object).c;
        if (bl2) {
            object2 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
            String string3 = "order details accordian open";
            String string4 = "order_detail_accordian_open";
            object.J8((String)object2, string3, string4);
            object2 = "Open";
            object.w6((String)object2, string2);
            boolean bl3 = false;
            object = null;
            view.setVisibility(0);
        } else {
            object2 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
            String string5 = "order details accordian close";
            String string6 = "order_detail_accordian_close";
            object.J8((String)object2, string5, string6);
            object2 = "Close";
            object.w6((String)object2, string2);
            int n3 = 8;
            view.setVisibility(n3);
        }
        qq2_22.e = bl2;
    }
}

