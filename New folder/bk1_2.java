/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bk1
 */
public final class bk1_2
extends h80_0 {
    public bk1_2(f80_0 f80_02, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNull(f80_02, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(f80_02, coroutineContext);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return object;
    }
}

