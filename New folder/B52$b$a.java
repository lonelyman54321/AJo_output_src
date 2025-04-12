/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class B52$b$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object = new qg3_2(3, (f80_0)object3);
        ((B52$b$a)object).a = object2;
        object2 = Unit.a;
        return ((B52$b$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.a;
        yn3_0.a.e((Throwable)object);
        return Unit.a;
    }
}

