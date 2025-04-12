/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class HH3$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object = new qg3_2(3, (f80_0)object3);
        ((HH3$a)object).a = object2;
        object2 = Unit.a;
        return ((HH3$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a("wishlistSync: fetched closet products from db failed", objectArray);
        ((yn3$a)object2).e((Throwable)object);
        return Unit.a;
    }
}

