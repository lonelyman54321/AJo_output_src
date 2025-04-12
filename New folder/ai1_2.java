/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from Ai1
 */
public final class ai1_2
implements Callable,
yr0_2 {
    public static final FutureTask f;
    public final Runnable a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final ExecutorService d;
    public Thread e;

    static {
        FutureTask<Object> futureTask;
        Runnable runnable2 = Functions.a;
        f = futureTask = new FutureTask<Object>(runnable2, null);
    }

    public ai1_2(Runnable atomicReference, ExecutorService executorService) {
        this.a = atomicReference;
        this.c = atomicReference = new AtomicReference();
        this.b = atomicReference = new AtomicReference();
        this.d = executorService;
    }

    public final void a(Future future) {
        while (true) {
            FutureTask futureTask;
            Object object;
            Object object2;
            if ((object2 = (Future)((AtomicReference)(object = this.c)).get()) == (futureTask = f)) {
                boolean bl2;
                object = this.e;
                object2 = Thread.currentThread();
                if (object != object2) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object = null;
                }
                future.cancel(bl2);
                return;
            }
            do {
                boolean bl3;
                if (!(bl3 = ((AtomicReference)object).compareAndSet(object2, future))) continue;
                return;
            } while ((futureTask = ((AtomicReference)object).get()) == object2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block9: {
            block10: {
                this.e = var1_1 = Thread.currentThread();
                var1_1 = null;
                try {
                    var2_2 = this.a;
                    var2_2.run();
                    var2_2 = this.d;
                    var2_2 = var2_2.submit(this);
lbl8:
                    // 2 sources

                    while (true) {
                        var3_4 = this.b;
                        var4_5 /* !! */  = var3_4.get();
                        var5_6 /* !! */  = ai1_2.f;
                        if ((var4_5 /* !! */  = (Future)var4_5 /* !! */ ) != var5_6 /* !! */ ) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var7_7 = var3_4.compareAndSet(var4_5 /* !! */ , var2_2);
                                if (!var7_7) continue;
lbl16:
                                // 2 sources

                                while (true) {
                                    this.e = null;
                                    return null;
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                catch (Throwable var2_3) {
                    break block9;
                }
                {
                    var3_4 = this.e;
                    var4_5 /* !! */  = Thread.currentThread();
                    if (var3_4 != var4_5 /* !! */ ) {
                        var6_8 = true;
                        break block10;
                    }
                    var6_8 = false;
                    var3_4 = null;
                }
            }
            var2_2.cancel(var6_8);
            ** while (true)
            ** while ((var5_6 /* !! */  = var3_4.get()) == var4_5 /* !! */ )
lbl34:
            // 1 sources

            ** while (true)
        }
        this.e = null;
        dr2_2.b(var2_3);
        return null;
    }

    public final void dispose() {
        Thread thread2;
        Object object = this.c;
        Runnable runnable2 = f;
        object = ((AtomicReference)object).getAndSet(runnable2);
        boolean bl2 = false;
        if (object != null && object != runnable2) {
            boolean bl3;
            thread2 = this.e;
            Thread thread3 = Thread.currentThread();
            if (thread2 != thread3) {
                bl3 = true;
            } else {
                bl3 = false;
                thread2 = null;
            }
            object.cancel(bl3);
        }
        if ((object = (Future)this.b.getAndSet(runnable2)) != null && object != runnable2) {
            runnable2 = this.e;
            thread2 = Thread.currentThread();
            if (runnable2 != thread2) {
                bl2 = true;
            }
            object.cancel(bl2);
        }
    }

    public final boolean isDisposed() {
        boolean bl2;
        FutureTask futureTask;
        Object v4 = this.c.get();
        if (v4 == (futureTask = f)) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }
}

