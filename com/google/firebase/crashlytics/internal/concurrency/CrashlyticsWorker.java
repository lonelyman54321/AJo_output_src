/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class CrashlyticsWorker
implements Executor {
    private final ExecutorService executor;
    private Task tail;
    private final Object tailLock;

    public CrashlyticsWorker(ExecutorService executorService) {
        Object object;
        this.tailLock = object = new Object();
        this.tail = object = Tasks.forResult(null);
        this.executor = executorService;
    }

    public static /* synthetic */ Task a(Callable callable, Task task2) {
        return CrashlyticsWorker.lambda$submitTask$3(callable, task2);
    }

    public static /* synthetic */ Task b(Callable callable, Task task2) {
        return CrashlyticsWorker.lambda$submit$0(callable, task2);
    }

    public static /* synthetic */ void c() {
        CrashlyticsWorker.lambda$await$6();
    }

    public static /* synthetic */ Task d(Runnable runnable2, Task task2) {
        return CrashlyticsWorker.lambda$submit$1(runnable2, task2);
    }

    public static /* synthetic */ Task e(SuccessContinuation successContinuation, Task task2) {
        return CrashlyticsWorker.lambda$submitTaskOnSuccess$5(successContinuation, task2);
    }

    public static /* synthetic */ Task f(Callable callable, Task task2) {
        return CrashlyticsWorker.lambda$submitTaskOnSuccess$4(callable, task2);
    }

    public static /* synthetic */ Task g(Callable callable, Task task2) {
        return CrashlyticsWorker.lambda$submitTask$2(callable, task2);
    }

    private static /* synthetic */ void lambda$await$6() {
    }

    private static /* synthetic */ Task lambda$submit$0(Callable callable, Task task2) {
        return Tasks.forResult(callable.call());
    }

    private static /* synthetic */ Task lambda$submit$1(Runnable runnable2, Task task2) {
        runnable2.run();
        return Tasks.forResult(null);
    }

    private static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task2) {
        return (Task)callable.call();
    }

    private static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task2) {
        return (Task)callable.call();
    }

    private static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task2) {
        return (Task)callable.call();
    }

    private static /* synthetic */ Task lambda$submitTaskOnSuccess$5(SuccessContinuation object, Task object2) {
        boolean bl2 = ((Task)object2).isSuccessful();
        if (bl2) {
            object2 = ((Task)object2).getResult();
            return object.then(object2);
        }
        object = ((Task)object2).getException();
        if (object != null) {
            return Tasks.forException(((Task)object2).getException());
        }
        return Tasks.forCanceled();
    }

    public void await() {
        Object object = new Object();
        object = this.submit((Runnable)object);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Tasks.await((Task)object, 30, timeUnit);
        Thread.sleep(1L);
    }

    public void execute(Runnable runnable2) {
        this.executor.execute(runnable2);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task submit(Runnable object) {
        Object object2 = this.tailLock;
        synchronized (object2) {
            Task task2 = this.tail;
            ExecutorService executorService = this.executor;
            Kd0 kd0 = new Kd0((Runnable)object);
            this.tail = object = task2.continueWithTask(executorService, kd0);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task submit(Callable object) {
        Object object2 = this.tailLock;
        synchronized (object2) {
            Task task2 = this.tail;
            ExecutorService executorService = this.executor;
            Ld0 ld0 = new Ld0(object);
            this.tail = object = task2.continueWithTask(executorService, ld0);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task submitTask(Callable object) {
        Object object2 = this.tailLock;
        synchronized (object2) {
            Task task2 = this.tail;
            ExecutorService executorService = this.executor;
            Nd0 nd0 = new Nd0((Callable)object);
            this.tail = object = task2.continueWithTask(executorService, nd0);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task submitTask(Callable object, Continuation continuation) {
        Object object2 = this.tailLock;
        synchronized (object2) {
            Object object3 = this.tail;
            ExecutorService executorService = this.executor;
            Od0 od0 = new Od0((Callable)object);
            object = ((Task)object3).continueWithTask(executorService, od0);
            object3 = this.executor;
            this.tail = object = ((Task)object).continueWithTask((Executor)object3, continuation);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task submitTaskOnSuccess(Callable object, SuccessContinuation successContinuation) {
        Object object2 = this.tailLock;
        synchronized (object2) {
            Object object3 = this.tail;
            Object object4 = this.executor;
            pd0_0 pd0_02 = new pd0_0((Callable)object);
            object = ((Task)object3).continueWithTask((Executor)object4, pd0_02);
            object3 = this.executor;
            object4 = new qd0_0(successContinuation);
            this.tail = object = ((Task)object).continueWithTask((Executor)object3, (Continuation)object4);
            return object;
        }
    }
}

