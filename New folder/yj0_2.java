/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yj0
 */
public final class yj0_2
extends xj0_2
implements f80_0 {
    public gx0_2 a;
    public Object b;
    public f80_0 c;
    public Object d;

    public final j90_0 a(Object object, tm1_2 tm1_22) {
        Intrinsics.checkNotNull(tm1_22, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.c = tm1_22;
        this.b = object;
        object = j90_0.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(tm1_22, "frame");
        return object;
    }

    public final CoroutineContext getContext() {
        return f.a;
    }

    public final void resumeWith(Object object) {
        this.c = null;
        this.d = object;
    }
}

