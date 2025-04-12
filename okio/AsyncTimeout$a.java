/*
 * Decompiled with CFR 0.152.
 */
package okio;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;

public final class AsyncTimeout$a {
    public static AsyncTimeout a() {
        AsyncTimeout asyncTimeout;
        Object object = AsyncTimeout.l;
        Intrinsics.checkNotNull(object);
        object = ((AsyncTimeout)object).f;
        AsyncTimeout asyncTimeout2 = null;
        if (object == null) {
            long l2;
            long l3;
            long l4 = System.nanoTime();
            object = AsyncTimeout.i;
            long l7 = AsyncTimeout.j;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object.await(l7, timeUnit);
            object = AsyncTimeout.l;
            Intrinsics.checkNotNull(object);
            object = ((AsyncTimeout)object).f;
            if (object == null && (l3 = (l2 = (l7 = System.nanoTime() - l4) - (l4 = AsyncTimeout.k)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
                asyncTimeout2 = AsyncTimeout.l;
            }
            return asyncTimeout2;
        }
        long l8 = System.nanoTime();
        long l12 = ((AsyncTimeout)object).g - l8;
        long l14 = l12 - (l8 = 0L);
        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object2 > 0) {
            object = AsyncTimeout.i;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            object.await(l12, timeUnit);
            return null;
        }
        AsyncTimeout asyncTimeout3 = AsyncTimeout.l;
        Intrinsics.checkNotNull(asyncTimeout3);
        asyncTimeout3.f = asyncTimeout = ((AsyncTimeout)object).f;
        ((AsyncTimeout)object).f = null;
        return object;
    }
}

