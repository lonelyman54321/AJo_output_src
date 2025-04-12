/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class dZ2$a
implements i90_0 {
    public final mz2_1 a;
    public final CoroutineContext b;

    public dZ2$a(mz2_1 mz2_12, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(mz2_12, "httpSendSender");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.a = mz2_12;
        this.b = coroutineContext;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }
}

