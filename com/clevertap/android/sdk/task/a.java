/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.FailureExecutable;
import com.clevertap.android.sdk.task.Task$1;
import com.clevertap.android.sdk.task.a$a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class a {
    public final CleverTapInstanceConfig a;
    public final Executor b;
    public final Executor c;
    public final ArrayList d;
    public Object e;
    public final ArrayList f;

    public a(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, Executor executor2, String object) {
        this.d = object = new Object();
        this.f = object = new Object();
        object = a$a.FAILED;
        this.c = executor;
        this.b = executor2;
        this.a = cleverTapInstanceConfig;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(li_2 li_22) {
        Executor executor = this.b;
        synchronized (this) {
            ArrayList arrayList = this.d;
            FailureExecutable failureExecutable = new FailureExecutable(executor, li_22);
            arrayList.add(failureExecutable);
            return;
        }
    }

    public final void b(e92 e922) {
        ArrayList arrayList = this.f;
        Executor executor = this.b;
        bg3_1 bg3_12 = new bg3_1(executor, e922);
        arrayList.add(bg3_12);
    }

    public final void c(String string2, Callable callable) {
        Task$1 task$1 = new Task$1(this, string2, callable);
        this.c.execute(task$1);
    }

    public final Future d(String object, Callable callable) {
        Executor executor = this.c;
        boolean bl2 = executor instanceof ExecutorService;
        if (bl2) {
            executor = (ExecutorService)executor;
            Task$1 task$1 = new Task$1(this, (String)object, callable);
            return executor.submit(task$1);
        }
        object = new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
        throw object;
    }
}

