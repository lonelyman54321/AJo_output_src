/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from HP0
 */
public final class hp0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;

    public hp0_2(String string2, f80_0 f80_02) {
        this.a = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        object = new hp0_2(string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hp0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hp0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = pp0_0.a;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        object2 = this;
        String string4 = this.a;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek feed interactions", "all caught for now", string4, "fleek_feed_interactions", "feed screen", "feed screen", string2, null, string3, false, null, 1664, null);
        return Unit.a;
    }
}

