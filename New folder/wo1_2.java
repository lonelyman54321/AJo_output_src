/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wo1
 */
public final class wo1_2
implements CoroutineContext$Element {
    public static final Wo1$a b;
    public final CoroutineContext a;

    static {
        Wo1$a wo1$a;
        b = wo1$a = new Object();
    }

    public wo1_2(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "callContext");
        this.a = coroutineContext;
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return b;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

