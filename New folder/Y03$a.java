/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class Y03$a
extends AdaptedFunctionReference
implements Function1 {
    public final Object invoke(Object object) {
        j90_0 j90_02;
        object = (f80_0)object;
        if ((object = ((is2_2)this.receiver).c((f80_0)object)) != (j90_02 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }
}

