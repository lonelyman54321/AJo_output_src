/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Utils {
    private static final int BACKGROUND_TIMEOUT_MILLIS = 4000;
    private static final int MAIN_TIMEOUT_MILLIS = 3000;
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, Task task2) {
        return Utils.lambda$awaitEvenIfOnMainThread$0(countDownLatch, task2);
    }

    public static Object awaitEvenIfOnMainThread(Task object) {
        int n3 = 1;
        Object object2 = new CountDownLatch(n3);
        ExecutorService executorService = TASK_CONTINUATION_EXECUTOR_SERVICE;
        mk0_0 mk0_02 = new mk0_0(object2);
        ((Task)object).continueWith(executorService, mk0_02);
        executorService = Looper.getMainLooper();
        mk0_02 = Looper.myLooper();
        if (executorService == mk0_02) {
            long l2 = 3000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ((CountDownLatch)object2).await(l2, timeUnit);
        } else {
            long l3 = 4000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ((CountDownLatch)object2).await(l3, timeUnit);
        }
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            return ((Task)object).getResult();
        }
        bl2 = ((Task)object).isCanceled();
        if (!bl2) {
            bl2 = ((Task)object).isComplete();
            if (bl2) {
                object = ((Task)object).getException();
                object2 = new IllegalStateException((Throwable)object);
                throw object2;
            }
            object = new TimeoutException();
            throw object;
        }
        object = new CancellationException("Task is already canceled");
        throw object;
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

    private static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$0(CountDownLatch countDownLatch, Task task2) {
        countDownLatch.countDown();
        return null;
    }
}

