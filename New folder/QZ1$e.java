/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class QZ1$e
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;

    public QZ1$e(f80_0 f80_02, qz1_2 qz1_22, String string2) {
        this.a = qz1_22;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        String string2 = this.b;
        object = new QZ1$e(f80_02, qz1_22, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (QZ1$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((QZ1$e)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.M;
        String string2 = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "order details interaction", "Exit", string2, "order_details_interaction", "unique package code screen", null, null, null, "", false, null, 1760, null);
        return Unit.a;
    }
}

