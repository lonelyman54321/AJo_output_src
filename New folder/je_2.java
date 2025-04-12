/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from jE
 */
public final class je_2
implements gx0_2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ je_2(Function1 function1, Object object) {
        this.a = function1;
        this.b = object;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Throwable)object;
        object3 = (CoroutineContext)object3;
        object = this.a;
        object2 = this.b;
        hz0_2.a((Function1)object, object2, (CoroutineContext)object3);
        return Unit.a;
    }
}

