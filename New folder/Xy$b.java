/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Xy$b
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;

    public Xy$b() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Xy$b xy$b = new qg3_2(2, f80_02);
        xy$b.a = object;
        return xy$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (jb1_2)object;
        object2 = (f80_0)object2;
        object = (Xy$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Xy$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (jb1_2)this.a;
        object2 = ((jb1_2)object).a().c().getAttributes();
        Object object3 = xy_2.b;
        object2 = (qb2_2)object2.a((xq_2)object3);
        if (object2 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "listener");
        object3 = ((jb1_2)object).b();
        CoroutineContext coroutineContext = object.getCoroutineContext();
        Long l2 = oa1_0.a((ma1_0)object);
        object2 = nf_2.a((uf_1)object3, coroutineContext, l2, (qb2_2)object2);
        return da3_0.c(((jb1_2)object).a(), (uf_1)object2).d();
    }
}

