/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Ob0$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public Ob0$c(ob0_1 ob0_12, String string2, String string3, f80_0 f80_02) {
        this.a = ob0_12;
        this.b = string2;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.c;
        ob0_1 ob0_12 = this.a;
        object = new Ob0$c(ob0_12, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Ob0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ob0$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.E;
        String string2 = this.b;
        String string3 = this.c;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "coupon bonanza interaction", string2, string3, "coupon_bonanza_interaction", string2, null, null, null, "", false, null, 1760, null);
        return Unit.a;
    }
}

