/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Di3$a
extends qg3_2
implements gx0_2 {
    public final Object invoke(Object object, Object object2, Object object3) {
        object = (cy2_0)object;
        long cfr_ignored_0 = ((e72)object2).a;
        object3 = (f80_0)object3;
        object = new qg3_2(3, (f80_0)object3);
        object2 = Unit.a;
        return ((Di3$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return Unit.a;
    }
}

