/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from X33
 */
public final class x33_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ e43_0 a;
    public final /* synthetic */ String b;

    public x33_0(e43_0 e43_02, String string2, f80_0 f80_02) {
        this.a = e43_02;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e43_0 e43_02 = this.a;
        String string2 = this.b;
        object = new x33_0(e43_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (x33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((x33_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        e43_0 e43_02 = this.a;
        String string2 = this.b;
        String string3 = e43_0.b(e43_02, string2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "Shop the Look", "Close", string3, "shop_the_look", null, null, null, null, string4, false, null, 1776, null);
        return Unit.a;
    }
}

