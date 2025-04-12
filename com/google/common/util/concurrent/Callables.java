/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.Callable;

public final class Callables {
    private Callables() {
    }

    public static /* synthetic */ void a(Supplier supplier, Runnable runnable2) {
        Callables.lambda$threadRenaming$3(supplier, runnable2);
    }

    public static AsyncCallable asAsyncCallable(Callable callable, ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        sj_2 sj_22 = new sj_2(listeningExecutorService, callable);
        return sj_22;
    }

    public static /* synthetic */ ListenableFuture b(ListeningExecutorService listeningExecutorService, Callable callable) {
        return listeningExecutorService.submit(callable);
    }

    public static /* synthetic */ Object c(Supplier supplier, Callable callable) {
        return Callables.lambda$threadRenaming$2(supplier, callable);
    }

    public static /* synthetic */ Object d(Object object) {
        return object;
    }

    private static /* synthetic */ Object lambda$threadRenaming$2(Supplier object, Callable callable) {
        Thread thread2 = Thread.currentThread();
        String string2 = thread2.getName();
        object = (String)object.get();
        boolean bl2 = Callables.trySetName((String)object, thread2);
        try {
            callable = callable.call();
            return callable;
        }
        finally {
            if (bl2) {
                Callables.trySetName(string2, thread2);
            }
        }
    }

    private static /* synthetic */ void lambda$threadRenaming$3(Supplier object, Runnable runnable2) {
        Thread thread2 = Thread.currentThread();
        String string2 = thread2.getName();
        object = (String)object.get();
        boolean bl2 = Callables.trySetName((String)object, thread2);
        try {
            runnable2.run();
            return;
        }
        finally {
            if (bl2) {
                Callables.trySetName(string2, thread2);
            }
        }
    }

    public static Callable returning(Object object) {
        tj_2 tj_22 = new tj_2(object);
        return tj_22;
    }

    public static Runnable threadRenaming(Runnable runnable2, Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable2);
        uj_2 uj_22 = new uj_2(supplier, runnable2);
        return uj_22;
    }

    public static Callable threadRenaming(Callable callable, Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        rj_2 rj_22 = new rj_2(supplier, callable);
        return rj_22;
    }

    private static boolean trySetName(String string2, Thread thread2) {
        try {
            thread2.setName(string2);
            return true;
        }
        catch (SecurityException securityException) {
            return false;
        }
    }
}

