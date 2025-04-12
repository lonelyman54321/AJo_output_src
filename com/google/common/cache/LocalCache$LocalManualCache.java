/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.AbstractCache$SimpleStatsCounter;
import com.google.common.cache.AbstractCache$StatsCounter;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$1;
import com.google.common.cache.LocalCache$LocalManualCache$1;
import com.google.common.cache.LocalCache$ManualSerializationProxy;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

class LocalCache$LocalManualCache
implements Cache,
Serializable {
    private static final long serialVersionUID = 1L;
    final LocalCache localCache;

    public LocalCache$LocalManualCache(CacheBuilder cacheBuilder) {
        LocalCache localCache = new LocalCache(cacheBuilder, null);
        this(localCache);
    }

    private LocalCache$LocalManualCache(LocalCache localCache) {
        this.localCache = localCache;
    }

    public /* synthetic */ LocalCache$LocalManualCache(LocalCache localCache, LocalCache$1 localCache$1) {
        this(localCache);
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use ManualSerializationProxy");
        throw object;
    }

    public ConcurrentMap asMap() {
        return this.localCache;
    }

    public void cleanUp() {
        this.localCache.cleanUp();
    }

    public Object get(Object object, Callable callable) {
        Preconditions.checkNotNull(callable);
        LocalCache localCache = this.localCache;
        LocalCache$LocalManualCache$1 localCache$LocalManualCache$1 = new LocalCache$LocalManualCache$1(this, callable);
        return localCache.get(object, localCache$LocalManualCache$1);
    }

    public ImmutableMap getAllPresent(Iterable iterable) {
        return this.localCache.getAllPresent(iterable);
    }

    public Object getIfPresent(Object object) {
        return this.localCache.getIfPresent(object);
    }

    public void invalidate(Object object) {
        Preconditions.checkNotNull(object);
        this.localCache.remove(object);
    }

    public void invalidateAll() {
        this.localCache.clear();
    }

    public void invalidateAll(Iterable iterable) {
        this.localCache.invalidateAll(iterable);
    }

    public void put(Object object, Object object2) {
        this.localCache.put(object, object2);
    }

    public void putAll(Map map2) {
        this.localCache.putAll(map2);
    }

    public long size() {
        return this.localCache.longSize();
    }

    public CacheStats stats() {
        AbstractCache$SimpleStatsCounter abstractCache$SimpleStatsCounter = new AbstractCache$SimpleStatsCounter();
        LocalCache$Segment[] localCache$SegmentArray = this.localCache.globalStatsCounter;
        abstractCache$SimpleStatsCounter.incrementBy((AbstractCache$StatsCounter)localCache$SegmentArray);
        localCache$SegmentArray = this.localCache.segments;
        int n3 = localCache$SegmentArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            AbstractCache$StatsCounter abstractCache$StatsCounter = localCache$SegmentArray[i3].statsCounter;
            abstractCache$SimpleStatsCounter.incrementBy(abstractCache$StatsCounter);
        }
        return abstractCache$SimpleStatsCounter.snapshot();
    }

    public Object writeReplace() {
        LocalCache localCache = this.localCache;
        LocalCache$ManualSerializationProxy localCache$ManualSerializationProxy = new LocalCache$ManualSerializationProxy(localCache);
        return localCache$ManualSerializationProxy;
    }
}

