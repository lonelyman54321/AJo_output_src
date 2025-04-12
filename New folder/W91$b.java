/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class W91$b
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;

    public W91$b(boolean bl2, f80_0 f80_02) {
        this.b = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.b;
        W91$b w91$b = new W91$b(bl2, f80_02);
        w91$b.a = object;
        return w91$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (db1_2)object;
        object2 = (f80_0)object2;
        object = (W91$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((W91$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = ((db1_2)this.a).f;
        object2 = W91.c;
        boolean bl2 = this.b;
        x91_0 x91_02 = new x91_0(bl2);
        object.c((xq_2)object2, x91_02);
        return Unit.a;
    }
}

