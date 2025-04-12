/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class B0$f
extends qg3_2
implements Function2 {
    public final /* synthetic */ B0 a;

    public B0$f(B0 b02, f80_0 f80_02) {
        this.a = b02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        B0 b02 = this.a;
        object = new B0$f(b02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (B0$f)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((B0$f)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((B0)object).A;
        if (object2 != null) {
            y91 y912 = new y91((x91)object2);
            object2 = ((B0)object).p;
            if (object2 != null) {
                i90_0 i90_02 = ((LP1$c)object).f1();
                D0 d02 = new D0((wr1_1)object2, y912, null);
                int n3 = 3;
                Ae3.d(i90_02, null, null, d02, n3);
            }
            ((B0)object).A = null;
        }
        return Unit.a;
    }
}

