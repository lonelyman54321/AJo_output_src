/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from nQ0
 */
public final class nq0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Bundle a;

    public nq0_2(Bundle bundle, f80_0 f80_02) {
        this.a = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Bundle bundle = this.a;
        object = new nq0_2(bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nq0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nq0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = sq0_1.b;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        object2 = this;
        Bundle bundle = this.a;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "ingress interaction", "close icon click", "", "ingress_interaction", "ingress screen", "ingress screen", string2, bundle, string3, false, null, 1536, null);
        return Unit.a;
    }
}

