/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.a;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.util.Map;
import java.util.concurrent.Executor;

class CacheLoader$1
extends CacheLoader {
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ CacheLoader val$loader;

    public CacheLoader$1(CacheLoader cacheLoader, Executor executor) {
        this.val$loader = cacheLoader;
        this.val$executor = executor;
    }

    public static /* synthetic */ Object a(CacheLoader cacheLoader, Object object, Object object2) {
        return CacheLoader$1.lambda$reload$0(cacheLoader, object, object2);
    }

    private static /* synthetic */ Object lambda$reload$0(CacheLoader cacheLoader, Object object, Object object2) {
        return cacheLoader.reload(object, object2).get();
    }

    public Object load(Object object) {
        return this.val$loader.load(object);
    }

    public Map loadAll(Iterable iterable) {
        return this.val$loader.loadAll(iterable);
    }

    public ListenableFuture reload(Object object, Object object2) {
        CacheLoader cacheLoader = this.val$loader;
        a a2 = new a(cacheLoader, object, object2);
        object = ListenableFutureTask.create(a2);
        this.val$executor.execute((Runnable)object);
        return object;
    }
}

