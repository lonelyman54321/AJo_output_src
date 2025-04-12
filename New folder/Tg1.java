/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

public final class Tg1 {
    public static final Object a(Function1 function1, f80_0 f80_02) {
        CoroutineContext coroutineContext = f80_02.getContext();
        Rg1$a rg1$a = Rg1$a.a;
        if ((coroutineContext = (rg1_1)coroutineContext.get(rg1$a)) == null) {
            return aQ1.a(f80_02.getContext()).R(function1, f80_02);
        }
        new Tg1$a(function1, null);
        return coroutineContext.v0();
    }
}

