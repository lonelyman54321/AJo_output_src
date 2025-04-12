/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Z33
 */
public final class z33_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ List a;

    public z33_0(List list, f80_0 f80_02) {
        this.a = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        List list = this.a;
        object = new z33_0(list, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (z33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((z33_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        object2 = this;
        List list = this.a;
        NewEEcommerceEventsRevamp.pushEEProductImpression$default(newEEcommerceEventsRevamp, list, null, "shop the look", null, "shop the look", false, string2, "shop the look", string3, null, null, null, false, null, null, 0L, null, null, null, null, null, null, false, 8388138, null);
        return Unit.a;
    }
}

