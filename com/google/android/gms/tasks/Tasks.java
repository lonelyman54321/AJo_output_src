/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tasks.zza;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzaa;
import com.google.android.gms.tasks.zzab;
import com.google.android.gms.tasks.zzad;
import com.google.android.gms.tasks.zzae;
import com.google.android.gms.tasks.zzaf;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.tasks.zzx;
import com.google.android.gms.tasks.zzy;
import com.google.android.gms.tasks.zzz;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    private Tasks() {
    }

    public static Object await(Task task2) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Object object = "Task must not be null";
        Preconditions.checkNotNull(task2, object);
        boolean bl2 = task2.isComplete();
        if (bl2) {
            return Tasks.zza(task2);
        }
        object = new zzad(null);
        Tasks.zzb(task2, (zzae)object);
        ((zzad)object).zza();
        return Tasks.zza(task2);
    }

    public static Object await(Task object, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(object, "Task must not be null");
        Object object2 = "TimeUnit must not be null";
        Preconditions.checkNotNull((Object)timeUnit, object2);
        boolean bl2 = ((Task)object).isComplete();
        if (bl2) {
            return Tasks.zza((Task)object);
        }
        object2 = new zzad(null);
        Tasks.zzb((Task)object, (zzae)object2);
        boolean bl3 = ((zzad)object2).zzb(l2, timeUnit);
        if (bl3) {
            return Tasks.zza((Task)object);
        }
        object = new TimeoutException("Timed out waiting for Task");
        throw object;
    }

    public static Task call(Callable callable) {
        return Tasks.call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static Task call(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        zzw zzw2 = new zzw();
        zzz zzz2 = new zzz(zzw2, callable);
        executor.execute(zzz2);
        return zzw2;
    }

    public static Task forCanceled() {
        zzw zzw2 = new zzw();
        zzw2.zzc();
        return zzw2;
    }

    public static Task forException(Exception exception) {
        zzw zzw2 = new zzw();
        zzw2.zza(exception);
        return zzw2;
    }

    public static Task forResult(Object object) {
        zzw zzw2 = new zzw();
        zzw2.zzb(object);
        return zzw2;
    }

    public static Task whenAll(Collection iterator) {
        boolean bl2;
        if (iterator != null && !(bl2 = iterator.isEmpty())) {
            Object object;
            boolean bl3;
            Object object2 = iterator.iterator();
            while (bl3 = object2.hasNext()) {
                object = (Task)object2.next();
                if (object != null) continue;
                iterator = new Iterator("null tasks are not accepted");
                throw iterator;
            }
            object2 = new zzw();
            int n3 = iterator.size();
            object = new zzaf(n3, (zzw)object2);
            iterator = iterator.iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                Task task2 = (Task)iterator.next();
                Tasks.zzb(task2, (zzae)object);
            }
            return object2;
        }
        return Tasks.forResult(null);
    }

    public static Task whenAll(Task ... taskArray) {
        int n3;
        if (taskArray != null && (n3 = taskArray.length) != 0) {
            return Tasks.whenAll(Arrays.asList(taskArray));
        }
        return Tasks.forResult(null);
    }

    public static Task whenAllComplete(Collection collection) {
        return Tasks.whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    public static Task whenAllComplete(Executor executor, Collection collection) {
        boolean bl2;
        if (collection != null && !(bl2 = collection.isEmpty())) {
            Task task2 = Tasks.whenAll(collection);
            zzab zzab2 = new zzab(collection);
            return task2.continueWithTask(executor, zzab2);
        }
        return Tasks.forResult(Collections.emptyList());
    }

    public static Task whenAllComplete(Executor executor, Task ... object) {
        int n3;
        if (object != null && (n3 = ((Task[])object).length) != 0) {
            object = Arrays.asList(object);
            return Tasks.whenAllComplete(executor, (Collection)object);
        }
        return Tasks.forResult(Collections.emptyList());
    }

    public static Task whenAllComplete(Task ... taskArray) {
        int n3;
        if (taskArray != null && (n3 = taskArray.length) != 0) {
            return Tasks.whenAllComplete(Arrays.asList(taskArray));
        }
        return Tasks.forResult(Collections.emptyList());
    }

    public static Task whenAllSuccess(Collection collection) {
        return Tasks.whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    public static Task whenAllSuccess(Executor executor, Collection collection) {
        boolean bl2;
        if (collection != null && !(bl2 = collection.isEmpty())) {
            Task task2 = Tasks.whenAll(collection);
            zzaa zzaa2 = new zzaa(collection);
            return task2.continueWith(executor, zzaa2);
        }
        return Tasks.forResult(Collections.emptyList());
    }

    public static Task whenAllSuccess(Executor executor, Task ... object) {
        int n3;
        if (object != null && (n3 = ((Task[])object).length) != 0) {
            object = Arrays.asList(object);
            return Tasks.whenAllSuccess(executor, (Collection)object);
        }
        return Tasks.forResult(Collections.emptyList());
    }

    public static Task whenAllSuccess(Task ... taskArray) {
        int n3;
        if (taskArray != null && (n3 = taskArray.length) != 0) {
            return Tasks.whenAllSuccess(Arrays.asList(taskArray));
        }
        return Tasks.forResult(Collections.emptyList());
    }

    public static Task withTimeout(Task task2, long l2, TimeUnit timeUnit) {
        boolean bl2;
        Object object = "Task must not be null";
        Preconditions.checkNotNull(task2, object);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2, "Timeout must be positive");
        Preconditions.checkNotNull((Object)timeUnit, "TimeUnit must not be null");
        object = new zzb();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource((CancellationToken)object);
        Object object2 = Looper.getMainLooper();
        zza zza2 = new zza((Looper)object2);
        object2 = new zzx(taskCompletionSource);
        l2 = timeUnit.toMillis(l2);
        zza2.postDelayed((Runnable)object2, l2);
        zzy zzy2 = new zzy(zza2, taskCompletionSource, (zzb)object);
        task2.addOnCompleteListener(zzy2);
        return taskCompletionSource.getTask();
    }

    private static Object zza(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            return ((Task)object).getResult();
        }
        bl2 = ((Task)object).isCanceled();
        if (bl2) {
            object = new CancellationException("Task is already canceled");
            throw object;
        }
        object = ((Task)object).getException();
        ExecutionException executionException = new ExecutionException((Throwable)object);
        throw executionException;
    }

    private static void zzb(Task task2, zzae zzae2) {
        Executor executor = TaskExecutors.zza;
        task2.addOnSuccessListener(executor, (OnSuccessListener)zzae2);
        task2.addOnFailureListener(executor, (OnFailureListener)zzae2);
        task2.addOnCanceledListener(executor, (OnCanceledListener)zzae2);
    }
}

