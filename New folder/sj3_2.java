/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sJ3
 */
public final class sj3_2
implements i90_0 {
    public final gf_2 a;
    public final CoroutineContext b;

    public sj3_2(gf_2 gf_22, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(gf_22, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.a = gf_22;
        this.b = coroutineContext;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }
}

