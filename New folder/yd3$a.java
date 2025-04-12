/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class yd3$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ f23_0 a;
    public final /* synthetic */ p83_0 b;

    public yd3$a(f23_0 f23_02, p83_0 p83_02, f80_0 f80_02) {
        this.a = f23_02;
        this.b = p83_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        f23_0 f23_02 = this.a;
        p83_0 p83_02 = this.b;
        object = new yd3$a(f23_02, p83_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yd3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yd3$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        ((f23_0)object).b((p83_0)object2);
        return Unit.a;
    }
}

