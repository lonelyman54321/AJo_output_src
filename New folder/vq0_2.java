/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vQ0
 */
public final class vq0_2
extends qg3_2
implements Function2 {
    public vq0_2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vq0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vq0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = sq0_1.b;
        object2 = AnalyticsManager.Companion;
        String string2 = av_0.a((AnalyticsManager$Companion)object2);
        String string3 = av_0.a((AnalyticsManager$Companion)object2);
        String string4 = bv_0.a((AnalyticsManager$Companion)object2);
        String string5 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek brand directory interaction", "search initiated", "", "fleek_brand_directory_interaction", string2, string3, string4, null, string5, false, null, 1536, null);
        return Unit.a;
    }
}

