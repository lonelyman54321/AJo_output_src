/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ExecutionList;
import com.google.common.util.concurrent.ForwardingFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.common.util.concurrent.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

class JdkFutureAdapters$ListenableFutureAdapter
extends ForwardingFuture
implements ListenableFuture {
    private static final Executor defaultAdapterExecutor;
    private static final ThreadFactory threadFactory;
    private final Executor adapterExecutor;
    private final Future delegate;
    private final ExecutionList executionList;
    private final AtomicBoolean hasListeners;

    static {
        Object object = new ThreadFactoryBuilder();
        threadFactory = object = ((ThreadFactoryBuilder)object).setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
        defaultAdapterExecutor = Executors.newCachedThreadPool((ThreadFactory)object);
    }

    public JdkFutureAdapters$ListenableFutureAdapter(Future future) {
        Executor executor = defaultAdapterExecutor;
        this(future, executor);
    }

    public JdkFutureAdapters$ListenableFutureAdapter(Future object, Executor executor) {
        Object object2 = new ExecutionList();
        this.executionList = object2;
        this.hasListeners = object2 = new AtomicBoolean(false);
        object = (Future)Preconditions.checkNotNull(object);
        this.delegate = object;
        this.adapterExecutor = object = (Executor)Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ void a(JdkFutureAdapters$ListenableFutureAdapter jdkFutureAdapters$ListenableFutureAdapter) {
        jdkFutureAdapters$ListenableFutureAdapter.lambda$addListener$0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addListener$0() {
        try {
            Future future = this.delegate;
            Uninterruptibles.getUninterruptibly(future);
        }
        catch (Error | RuntimeException | ExecutionException throwable) {}
        this.executionList.execute();
    }

    public void addListener(Runnable object, Executor object2) {
        ExecutionList executionList = this.executionList;
        executionList.add((Runnable)object, (Executor)object2);
        object = this.hasListeners;
        object2 = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (bl3) {
            object = this.delegate;
            bl3 = object.isDone();
            if (bl3) {
                this.executionList.execute();
                return;
            }
            object = this.adapterExecutor;
            object2 = new o(this);
            object.execute((Runnable)object2);
        }
    }

    public Future delegate() {
        return this.delegate;
    }
}

