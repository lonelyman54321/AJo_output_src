/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from YZ1
 */
public final class yz1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;

    public yz1_2(f80_0 f80_02, qz1_2 qz1_22, String string2) {
        this.a = qz1_22;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        String string2 = this.b;
        object = new yz1_2(f80_02, qz1_22, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yz1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yz1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.M;
        String string2 = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "order details interaction", "Delivery alert impression", string2, "order_details_interaction", "order details screen", null, null, null, "", false, null, 1760, null);
        return Unit.a;
    }
}

