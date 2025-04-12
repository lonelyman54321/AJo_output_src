/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;

public final class aQ1 {
    public static final yp1_2 a(CoroutineContext object) {
        Object object2 = YP1$a.a;
        if ((object = (yp1_2)object.get((CoroutineContext$a)object2)) != null) {
            return object;
        }
        object2 = "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

