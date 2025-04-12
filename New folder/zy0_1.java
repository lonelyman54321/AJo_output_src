/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;

/*
 * Renamed from zy0
 */
public final class zy0_1 {
    public final op2_2 a;
    public final kj2_1 b;
    public PaymentInstrumentInfo c;
    public jy0_1 d;
    public final NewCustomEventsRevamp e;

    public zy0_1(op2_2 object, mu1_1 mu1_12, kj2_1 object2) {
        this.a = object;
        this.b = object2;
        if (object != null && mu1_12 != null) {
            object = ((op2_2)object).s;
            object2 = new yy0_1(this);
            zy0$a zy0$a = new zy0$a((yy0_1)object2);
            ((LiveData)object).e(mu1_12, zy0$a);
        }
        this.e = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }
}

