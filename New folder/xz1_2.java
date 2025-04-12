/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from XZ1
 */
public final class xz1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;

    public xz1_2(qz1_2 qz1_22, f80_0 f80_02) {
        this.a = qz1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        object = new xz1_2(qz1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xz1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xz1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        NewCustomEventsRevamp.newPushCustomEvent$default(this.a.M, "order details interaction", "how to find code click", null, "order_details_interaction", "order details screen", null, null, null, "", false, null, 1764, null);
        return Unit.a;
    }
}

