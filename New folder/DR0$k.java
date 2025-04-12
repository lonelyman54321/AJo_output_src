/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class DR0$k
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public DR0$k(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        String string3 = this.b;
        object = new DR0$k(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$k)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$k)object).invokeSuspend(object2);
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
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek feed top navigation interactions", string4, "", "fleek_top_navigation_click", string5, string5, string2, null, string3, false, null, 1664, null);
        return Unit.a;
    }
}

