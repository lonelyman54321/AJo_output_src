/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from J0
 */
public abstract class j0_0
extends AtomicReference
implements yr0_2 {
    public static final FutureTask c;
    public static final FutureTask d;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable a;
    public Thread b;

    static {
        FutureTask<Object> futureTask;
        Runnable runnable2 = Functions.a;
        c = futureTask = new FutureTask<Object>(runnable2, null);
        d = futureTask = new FutureTask<Object>(runnable2, null);
    }

    public j0_0(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void a(Future future) {
        Runnable runnable2;
        Object object;
        while ((object = (Future)this.get()) != (runnable2 = c)) {
            boolean bl2;
            runnable2 = d;
            if (object == runnable2) {
                object = this.b;
                runnable2 = Thread.currentThread();
                if (object != runnable2) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object = null;
                }
                future.cancel(bl2);
                break;
            }
            bl2 = this.compareAndSet(object, future);
            if (!bl2) continue;
        }
    }

    public final void dispose() {
        boolean bl2;
        Runnable runnable2;
        Future future = (Future)this.get();
        if (future != (runnable2 = c) && future != (runnable2 = d) && (bl2 = this.compareAndSet(future, runnable2)) && future != null) {
            runnable2 = this.b;
            Thread thread2 = Thread.currentThread();
            if (runnable2 != thread2) {
                bl2 = true;
            } else {
                bl2 = false;
                runnable2 = null;
            }
            future.cancel(bl2);
        }
    }

    public final boolean isDisposed() {
        boolean bl2;
        FutureTask futureTask;
        Future future = (Future)this.get();
        if (future != (futureTask = c) && future != (futureTask = d)) {
            bl2 = false;
            future = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

