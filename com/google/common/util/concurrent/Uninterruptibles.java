/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class Uninterruptibles {
    private Uninterruptibles() {
    }

    public static void awaitTerminationUninterruptibly(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Verify.verify(Uninterruptibles.awaitTerminationUninterruptibly(executorService, Long.MAX_VALUE, timeUnit));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean awaitTerminationUninterruptibly(ExecutorService var0, long var1_2, TimeUnit var3_3) {
        block7: {
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl5:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var7_6 = var0.awaitTermination(var1_2, var3_3);
                if (!var4_4) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl13:
                // 1 sources

                var8_7 = Thread.currentThread();
                var8_7.interrupt();
lbl15:
                // 2 sources

                return var7_6;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var8_8 = Thread.currentThread();
            var8_8.interrupt();
        }
        throw var0_1;
    }

    public static void awaitUninterruptibly(CountDownLatch object) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    ((CountDownLatch)object).await();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                object = Thread.currentThread();
                ((Thread)object).interrupt();
            }
            return;
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean awaitUninterruptibly(CountDownLatch var0, long var1_2, TimeUnit var3_3) {
        block7: {
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl5:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var7_6 = var0.await(var1_2, var3_3);
                if (!var4_4) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl13:
                // 1 sources

                var8_7 = Thread.currentThread();
                var8_7.interrupt();
lbl15:
                // 2 sources

                return var7_6;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var8_8 = Thread.currentThread();
            var8_8.interrupt();
        }
        throw var0_1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean awaitUninterruptibly(Condition var0, long var1_2, TimeUnit var3_3) {
        block7: {
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl5:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var7_6 = var0.await(var1_2, var3_3);
                if (!var4_4) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl13:
                // 1 sources

                var8_7 = Thread.currentThread();
                var8_7.interrupt();
lbl15:
                // 2 sources

                return var7_6;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var8_8 = Thread.currentThread();
            var8_8.interrupt();
        }
        throw var0_1;
    }

    public static Object getUninterruptibly(Future future) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    future = future.get();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return future;
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object getUninterruptibly(Future var0, long var1_2, TimeUnit var3_3) {
        block7: {
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl5:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var0 /* !! */  = var0 /* !! */ .get(var1_2, var3_3);
                if (!var4_4) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl13:
                // 1 sources

                var7_6 = Thread.currentThread();
                var7_6.interrupt();
lbl15:
                // 2 sources

                return var0 /* !! */ ;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var7_7 = Thread.currentThread();
            var7_7.interrupt();
        }
        throw var0_1;
    }

    public static void joinUninterruptibly(Thread thread2) {
        boolean bl2 = false;
        Thread thread3 = null;
        while (true) {
            block5: {
                try {
                    thread2.join();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread3 = Thread.currentThread();
                        thread3.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return;
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void joinUninterruptibly(Thread var0, long var1_2, TimeUnit var3_3) {
        block7: {
            Preconditions.checkNotNull(var0);
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl7:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var3_3.timedJoin(var0, var1_2);
                if (!var4_4) ** GOTO lbl17
                ** GOTO lbl15
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl15:
                // 1 sources

                var0 = Thread.currentThread();
                var0.interrupt();
lbl17:
                // 2 sources

                return;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var7_6 = Thread.currentThread();
            var7_6.interrupt();
        }
        throw var0_1;
    }

    public static void putUninterruptibly(BlockingQueue object, Object object2) {
        boolean bl2 = false;
        while (true) {
            block5: {
                try {
                    object.put(object2);
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        object2 = Thread.currentThread();
                        ((Thread)object2).interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                object = Thread.currentThread();
                ((Thread)object).interrupt();
            }
            return;
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void sleepUninterruptibly(long var0, TimeUnit var2_1) {
        block7: {
            var3_2 = false;
            var0 = var2_1.toNanos(var0);
            var4_3 = System.nanoTime() + var0;
lbl5:
            // 2 sources

            while (true) {
                var2_1 = TimeUnit.NANOSECONDS;
                var2_1.sleep(var0);
                if (!var3_2) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var6_5) {
                    break block7;
                }
lbl13:
                // 1 sources

                var6_4 = Thread.currentThread();
                var6_4.interrupt();
lbl15:
                // 2 sources

                return;
                catch (InterruptedException v0) {}
                var3_2 = true;
                {
                    var0 = System.nanoTime();
                    var0 = var4_3 - var0;
                    ** continue;
                }
            }
        }
        if (var3_2) {
            var7_6 = Thread.currentThread();
            var7_6.interrupt();
        }
        throw var6_5;
    }

    public static Object takeUninterruptibly(BlockingQueue blockingQueue) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    blockingQueue = blockingQueue.take();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return blockingQueue;
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean tryAcquireUninterruptibly(Semaphore var0, int var1_2, long var2_3, TimeUnit var4_4) {
        block7: {
            var5_5 = false;
            var2_3 = var4_4.toNanos(var2_3);
            var6_6 = System.nanoTime() + var2_3;
lbl5:
            // 2 sources

            while (true) {
                var4_4 = TimeUnit.NANOSECONDS;
                var8_7 = var0.tryAcquire(var1_2, var2_3, var4_4);
                if (!var5_5) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl13:
                // 1 sources

                var9_8 = Thread.currentThread();
                var9_8.interrupt();
lbl15:
                // 2 sources

                return var8_7;
                catch (InterruptedException v0) {}
                var5_5 = true;
                {
                    var2_3 = System.nanoTime();
                    var2_3 = var6_6 - var2_3;
                    ** continue;
                }
            }
        }
        if (var5_5) {
            var9_9 = Thread.currentThread();
            var9_9.interrupt();
        }
        throw var0_1;
    }

    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, long l2, TimeUnit timeUnit) {
        return Uninterruptibles.tryAcquireUninterruptibly(semaphore, 1, l2, timeUnit);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean tryLockUninterruptibly(Lock var0, long var1_2, TimeUnit var3_3) {
        block7: {
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl5:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var7_6 = var0.tryLock(var1_2, var3_3);
                if (!var4_4) ** GOTO lbl15
                ** GOTO lbl13
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl13:
                // 1 sources

                var8_7 = Thread.currentThread();
                var8_7.interrupt();
lbl15:
                // 2 sources

                return var7_6;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var8_8 = Thread.currentThread();
            var8_8.interrupt();
        }
        throw var0_1;
    }
}

