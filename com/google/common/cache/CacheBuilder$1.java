/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.AbstractCache$StatsCounter;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheStats;

class CacheBuilder$1
implements AbstractCache$StatsCounter {
    public void recordEviction() {
    }

    public void recordHits(int n3) {
    }

    public void recordLoadException(long l2) {
    }

    public void recordLoadSuccess(long l2) {
    }

    public void recordMisses(int n3) {
    }

    public CacheStats snapshot() {
        return CacheBuilder.EMPTY_STATS;
    }
}

