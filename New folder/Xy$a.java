/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

public final class Xy$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ db1_2 a;
    public /* synthetic */ bg2_2 b;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (db1_2)object;
        object2 = (bg2_2)object2;
        object3 = (f80_0)object3;
        Xy$a xy$a = new qg3_2(3, (f80_0)object3);
        xy$a.a = object;
        xy$a.b = object2;
        object = Unit.a;
        return xy$a.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        Object object3 = ((db1_2)object).f;
        Object object4 = xy_2.a;
        object3 = (qb2_2)((e40_0)object3).a((xq_2)object4);
        if (object3 == null) {
            return null;
        }
        object = ((db1_2)object).e;
        object4 = new u62_0((bg2_2)object2, (CoroutineContext)object, (qb2_2)object3);
        return object4;
    }
}

