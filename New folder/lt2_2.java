/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * Renamed from lT2
 */
public final class lt2_2
extends j0_0
implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    public final Object call() {
        Thread thread2;
        FutureTask futureTask = j0_0.c;
        this.b = thread2 = Thread.currentThread();
        thread2 = null;
        try {
            Runnable runnable2 = this.a;
            runnable2.run();
            return null;
        }
        finally {
            this.lazySet(futureTask);
            this.b = null;
        }
    }
}

