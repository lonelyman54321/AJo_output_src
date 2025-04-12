/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class qI2
extends qg3_2
implements gx0_2 {
    public final Object invoke(Object object, Object object2, Object object3) {
        ((Number)object).intValue();
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object = new qg3_2(3, (f80_0)object3);
        object2 = Unit.a;
        ((qI2)object).invokeSuspend(object2);
        return Boolean.FALSE;
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return Boolean.FALSE;
    }
}

