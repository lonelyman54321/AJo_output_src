/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.p;
import com.google.firebase.messaging.q;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class WithinAppServiceConnection$BindRequest {
    final Intent intent;
    private final TaskCompletionSource taskCompletionSource;

    public WithinAppServiceConnection$BindRequest(Intent intent) {
        TaskCompletionSource taskCompletionSource;
        this.taskCompletionSource = taskCompletionSource = new TaskCompletionSource();
        this.intent = intent;
    }

    public static /* synthetic */ void a(ScheduledFuture scheduledFuture, Task task2) {
        scheduledFuture.cancel(false);
    }

    public static /* synthetic */ void b(WithinAppServiceConnection$BindRequest withinAppServiceConnection$BindRequest) {
        withinAppServiceConnection$BindRequest.lambda$arrangeTimeout$0();
    }

    private /* synthetic */ void lambda$arrangeTimeout$0() {
        this.intent.getAction();
        this.finish();
    }

    public void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
        Object object = new p(this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        object = scheduledExecutorService.schedule((Runnable)object, (long)20, timeUnit);
        Task task2 = this.getTask();
        q q2 = new q((ScheduledFuture)object);
        task2.addOnCompleteListener(scheduledExecutorService, (OnCompleteListener)q2);
    }

    public void finish() {
        this.taskCompletionSource.trySetResult(null);
    }

    public Task getTask() {
        return this.taskCompletionSource.getTask();
    }
}

