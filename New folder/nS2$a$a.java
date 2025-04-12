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
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.List;

public final class nS2$a$a
implements View.OnClickListener {
    public final /* synthetic */ ns2$a_0 a;

    public nS2$a$a(ns2$a_0 a_02) {
        this.a = a_02;
    }

    public final void onClick(View object) {
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, "Savedcard_deleteclicked", "Delete clicked on saved card");
        object = this.a;
        object2 = ((ns2$a_0)object).e;
        int n3 = ((ns2$a_0)object).d;
        List list = ((ns2_1)object2).a;
        Object e2 = list.get(n3);
        if (e2 != null) {
            object = (PaymentInstrumentInfo)list.get(n3);
            object2 = ((ns2_1)object2).c;
            object2.U5((PaymentInstrumentInfo)object);
        }
    }
}

