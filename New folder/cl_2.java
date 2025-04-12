/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from cL
 */
public final class cl_2
implements gx0_2 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ cl_2(Function1 function1) {
        this.a = function1;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Throwable)object;
        object3 = (CoroutineContext)object3;
        this.a.invoke(object);
        return Unit.a;
    }
}

