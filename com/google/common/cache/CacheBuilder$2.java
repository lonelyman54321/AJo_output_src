/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Supplier;
import com.google.common.cache.AbstractCache$SimpleStatsCounter;
import com.google.common.cache.AbstractCache$StatsCounter;

class CacheBuilder$2
implements Supplier {
    public AbstractCache$StatsCounter get() {
        AbstractCache$SimpleStatsCounter abstractCache$SimpleStatsCounter = new AbstractCache$SimpleStatsCounter();
        return abstractCache$SimpleStatsCounter;
    }
}

