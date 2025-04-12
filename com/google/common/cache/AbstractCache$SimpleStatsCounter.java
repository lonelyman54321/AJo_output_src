/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.AbstractCache$StatsCounter;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LongAddable;
import com.google.common.cache.LongAddables;

public final class AbstractCache$SimpleStatsCounter
implements AbstractCache$StatsCounter {
    private final LongAddable evictionCount;
    private final LongAddable hitCount;
    private final LongAddable loadExceptionCount;
    private final LongAddable loadSuccessCount;
    private final LongAddable missCount;
    private final LongAddable totalLoadTime;

    public AbstractCache$SimpleStatsCounter() {
        LongAddable longAddable;
        this.hitCount = longAddable = LongAddables.create();
        this.missCount = longAddable = LongAddables.create();
        this.loadSuccessCount = longAddable = LongAddables.create();
        this.loadExceptionCount = longAddable = LongAddables.create();
        this.totalLoadTime = longAddable = LongAddables.create();
        this.evictionCount = longAddable = LongAddables.create();
    }

    private static long negativeToMaxValue(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            l2 = Long.MAX_VALUE;
        }
        return l2;
    }

    public void incrementBy(AbstractCache$StatsCounter object) {
        object = object.snapshot();
        LongAddable longAddable = this.hitCount;
        long l2 = ((CacheStats)object).hitCount();
        longAddable.add(l2);
        longAddable = this.missCount;
        l2 = ((CacheStats)object).missCount();
        longAddable.add(l2);
        longAddable = this.loadSuccessCount;
        l2 = ((CacheStats)object).loadSuccessCount();
        longAddable.add(l2);
        longAddable = this.loadExceptionCount;
        l2 = ((CacheStats)object).loadExceptionCount();
        longAddable.add(l2);
        longAddable = this.totalLoadTime;
        l2 = ((CacheStats)object).totalLoadTime();
        longAddable.add(l2);
        longAddable = this.evictionCount;
        l2 = ((CacheStats)object).evictionCount();
        longAddable.add(l2);
    }

    public void recordEviction() {
        this.evictionCount.increment();
    }

    public void recordHits(int n3) {
        LongAddable longAddable = this.hitCount;
        long l2 = n3;
        longAddable.add(l2);
    }

    public void recordLoadException(long l2) {
        this.loadExceptionCount.increment();
        this.totalLoadTime.add(l2);
    }

    public void recordLoadSuccess(long l2) {
        this.loadSuccessCount.increment();
        this.totalLoadTime.add(l2);
    }

    public void recordMisses(int n3) {
        LongAddable longAddable = this.missCount;
        long l2 = n3;
        longAddable.add(l2);
    }

    public CacheStats snapshot() {
        long l2 = AbstractCache$SimpleStatsCounter.negativeToMaxValue(this.hitCount.sum());
        long l3 = AbstractCache$SimpleStatsCounter.negativeToMaxValue(this.missCount.sum());
        long l4 = AbstractCache$SimpleStatsCounter.negativeToMaxValue(this.loadSuccessCount.sum());
        long l7 = AbstractCache$SimpleStatsCounter.negativeToMaxValue(this.loadExceptionCount.sum());
        long l8 = AbstractCache$SimpleStatsCounter.negativeToMaxValue(this.totalLoadTime.sum());
        long l12 = AbstractCache$SimpleStatsCounter.negativeToMaxValue(this.evictionCount.sum());
        CacheStats cacheStats = new CacheStats(l2, l3, l4, l7, l8, l12);
        return cacheStats;
    }
}

