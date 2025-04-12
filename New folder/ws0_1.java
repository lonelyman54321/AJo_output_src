/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ws0
 */
public final class ws0_1
implements CoroutineContext {
    public final /* synthetic */ CoroutineContext a;
    public final Throwable b;

    public ws0_1(CoroutineContext coroutineContext, Throwable throwable) {
        this.a = coroutineContext;
        this.b = throwable;
    }

    public final Object fold(Object object, Function2 function2) {
        return this.a.fold(object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return this.a.get(coroutineContext$a);
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return this.a.minusKey(coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.a.plus(coroutineContext);
    }
}

