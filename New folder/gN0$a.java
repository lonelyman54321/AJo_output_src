/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class gN0$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public gN0$a(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new gN0$a(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gN0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gN0$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        object2 = md3_0.c((jD3)object);
        xb0_2 xb0_22 = new xb0_2((ob0_1)object, null);
        Ae3.d((i90_0)object2, null, null, xb0_22, 3);
        return Unit.a;
    }
}

