/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CrashlyticsTasks {
    private static final Executor DIRECT;

    static {
        jl1_0 jl1_02 = new Object();
        DIRECT = jl1_02;
    }

    private CrashlyticsTasks() {
    }

    public static /* synthetic */ Task a(TaskCompletionSource taskCompletionSource, AtomicBoolean atomicBoolean, CancellationTokenSource cancellationTokenSource, Task task2) {
        return CrashlyticsTasks.lambda$race$0(taskCompletionSource, atomicBoolean, cancellationTokenSource, task2);
    }

    private static /* synthetic */ Task lambda$race$0(TaskCompletionSource taskCompletionSource, AtomicBoolean object, CancellationTokenSource cancellationTokenSource, Task task2) {
        boolean bl2 = task2.isSuccessful();
        if (bl2) {
            object = task2.getResult();
            taskCompletionSource.trySetResult(object);
        } else {
            Exception exception = task2.getException();
            if (exception != null) {
                object = task2.getException();
                taskCompletionSource.trySetException((Exception)object);
            } else {
                boolean bl3 = ((AtomicBoolean)object).getAndSet(true);
                if (bl3) {
                    cancellationTokenSource.cancel();
                }
            }
        }
        return Tasks.forResult(null);
    }

    public static Task race(Task task2, Task task3) {
        Object object = new CancellationTokenSource();
        Object object2 = ((CancellationTokenSource)object).getToken();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource((CancellationToken)object2);
        object2 = new AtomicBoolean(false);
        jd0_0 jd0_02 = new jd0_0(taskCompletionSource, (AtomicBoolean)object2, (CancellationTokenSource)object);
        object = DIRECT;
        task2.continueWithTask((Executor)object, jd0_02);
        task3.continueWithTask((Executor)object, jd0_02);
        return taskCompletionSource.getTask();
    }
}

