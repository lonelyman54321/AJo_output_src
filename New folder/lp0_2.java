/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from LP0
 */
public final class lp0_2
extends qg3_2
implements Function2 {
    public lp0_2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lp0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lp0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = pp0_0.a;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek_feed_interactions", "refresh feed", "", "fleek_feed_interactions", "feed screen", "feed screen", string2, null, string3, false, null, 1664, null);
        return Unit.a;
    }
}

