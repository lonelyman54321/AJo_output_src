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
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.pdprefresh.view.PDPAssuredGiftView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jh2
 */
public final class jh2_1
implements View.OnClickListener {
    public final /* synthetic */ PDPAssuredGiftView a;

    public /* synthetic */ jh2_1(PDPAssuredGiftView pDPAssuredGiftView) {
        this.a = pDPAssuredGiftView;
    }

    public final void onClick(View object) {
        Object object2;
        PDPAssuredGiftView pDPAssuredGiftView = this.a;
        Intrinsics.checkNotNullParameter((Object)pDPAssuredGiftView, "this$0");
        Bundle bundle = new Bundle();
        object = pDPAssuredGiftView.m;
        if (object != null) {
            float f5 = ((jo_2)object).c();
            object2 = "amount_payable";
            bundle.putFloat((String)object2, f5);
        }
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = "pdp screen";
        String string3 = "widget interaction";
        String string4 = "view gifts click";
        String string5 = "";
        String string6 = "widget_interaction";
        ((GTMEvents)object2).pushCartInteractionsEvent(string4, string5, string6, string2, string3, bundle);
        object = pDPAssuredGiftView.l;
        if (object != null) {
            object.W3();
        }
    }
}

