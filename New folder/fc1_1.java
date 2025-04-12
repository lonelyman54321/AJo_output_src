/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Fc1
 */
public final class fc1_1
implements ExecutorService {
    public final ThreadPoolExecutor a;

    public fc1_1() {
        ThreadPoolExecutor threadPoolExecutor;
        int n3 = Runtime.getRuntime().availableProcessors();
        int n4 = n3 * 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        this.a = threadPoolExecutor = new ThreadPoolExecutor(n4, n4, 60, timeUnit, linkedBlockingQueue);
    }

    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }

    public final void execute(Runnable runnable2) {
        this.a.execute(runnable2);
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, l2, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, l2, timeUnit);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final Future submit(Runnable runnable2) {
        return this.a.submit(runnable2);
    }

    public final Future submit(Runnable runnable2, Object object) {
        return this.a.submit(runnable2, object);
    }

    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }
}

