/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ca0$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public Ca0$b(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new Ca0$b(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Ca0$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ca0$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        object2 = "coupon bonanza - how it works screen";
        String string2 = "screenName";
        Intrinsics.checkNotNullParameter(object2, string2);
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        analyticsManager$Companion.getInstance().getGtmEvents().pushOpenScreenEvent((String)object2);
        object.getClass();
        String string3 = "coupon bonanza - how it works screen";
        Intrinsics.checkNotNullParameter(string3, string2);
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string4 = bv_0.a(analyticsManager$Companion);
        String string5 = cv_0.a(analyticsManager$Companion);
        newCustomEventsRevamp.newPushCustomScreenView(string3, "coupon bonanza screen", string4, null, string5);
        return Unit.a;
    }
}

