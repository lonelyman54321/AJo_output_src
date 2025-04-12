/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class aW
implements AutoCloseable,
i90_0 {
    public final CoroutineContext a;

    public aW(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.a = coroutineContext;
    }

    public final void close() {
        Object object = i$a.a;
        CoroutineContext coroutineContext = this.a;
        if ((object = (i)coroutineContext.get((CoroutineContext$a)object)) != null) {
            coroutineContext = null;
            object.d(null);
        }
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }
}

