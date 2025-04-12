/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from C4
 */
public final class c4_0
extends qg3_2
implements Function2 {
    public c4_0() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (c4_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c4_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object = new AnalyticsData$Builder();
        AnalyticsData analyticsData = ((AnalyticsData$Builder)object).label("deeplink").build();
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object2, "Add To Bag", "Add To Bag Button", "deeplink", analyticsData, null, 16, null);
        return Unit.a;
    }
}

