/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from NR0
 */
public final class nr0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public nr0_1(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        String string3 = this.b;
        object = new nr0_1(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nr0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        String string4 = this.a;
        String string5 = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek feed bottom navigation interactions", string4, "", "fleek_bottom_navigation_click", string5, string5, string2, null, string3, false, null, 1664, null);
        return Unit.a;
    }
}

