/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.concurrent.c$a;

public final class c$b
implements c$a {
    public final ThreadPoolExecutor a;

    public c$b(Zy3 zy3) {
        ThreadPoolExecutor threadPoolExecutor;
        Intrinsics.checkNotNullParameter(zy3, "threadFactory");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
        this.a = threadPoolExecutor = new ThreadPoolExecutor(0, -1 >>> 1, (long)60, timeUnit, synchronousQueue, zy3);
    }

    public final void a(c c2) {
        Intrinsics.checkNotNullParameter(c2, "taskRunner");
        c2.notify();
    }

    public final void b(c c2, long l2) {
        String string2 = "taskRunner";
        Intrinsics.checkNotNullParameter(c2, string2);
        long l3 = 1000000L;
        long l4 = l2 / l3;
        l3 *= l4;
        l3 = l2 - l3;
        long l7 = 0L;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 > 0 || (l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) > 0) {
            int n3 = (int)l3;
            c2.wait(l4, n3);
        }
    }

    public final void execute(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "runnable");
        this.a.execute(runnable2);
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}

