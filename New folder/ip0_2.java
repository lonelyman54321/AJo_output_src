/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from IP0
 */
public final class ip0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public ip0_2(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        String string3 = this.b;
        object = new ip0_2(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ip0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ip0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = pp0_0.a;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        String string4 = this.a;
        String string5 = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek insert category menu interactions", string4, string5, "fleek_feed_inserts_interactions", "feed screen", "feed screen", string2, null, string3, false, null, 1664, null);
        return Unit.a;
    }
}

