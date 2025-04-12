/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Gi3$a$d
extends qg3_2
implements Function2 {
    public final /* synthetic */ dy2_1 a;

    public Gi3$a$d(dy2_1 dy2_12, f80_0 f80_02) {
        this.a = dy2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dy2_1 dy2_12 = this.a;
        object = new Gi3$a$d(dy2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Gi3$a$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Gi3$a$d)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a;
        ((dy2_1)object2).b = true;
        ((dy2_1)object2).d.b(null);
        return Unit.a;
    }
}

