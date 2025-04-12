/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;

public final class c80
implements i90_0 {
    public final CoroutineContext a;

    public c80(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineScope(coroutineContext=");
        CoroutineContext coroutineContext = this.a;
        stringBuilder.append(coroutineContext);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

