/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;

public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long l2, long l3, long l4, long l7, long l8, long l12) {
        CacheStats cacheStats = this;
        long l14 = l2;
        long l15 = l3;
        long l16 = l4;
        long l17 = l7;
        long l18 = l8;
        long l19 = l12;
        boolean bl2 = false;
        long l20 = 0L;
        long l21 = l2 == l20 ? 0 : (l2 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l15 == l20 ? 0 : (l15 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l16 == l20 ? 0 : (l16 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l17 == l20 ? 0 : (l17 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l18 == l20 ? 0 : (l18 < l20 ? -1 : 1);
        l21 = l21 >= 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l21);
        l21 = l19 == l20 ? 0 : (l19 < l20 ? -1 : 1);
        if (l21 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        cacheStats.hitCount = l14;
        cacheStats.missCount = l15;
        cacheStats.loadSuccessCount = l16;
        cacheStats.loadExceptionCount = l17;
        cacheStats.totalLoadTime = l18;
        cacheStats.evictionCount = l19;
    }

    public double averageLoadPenalty() {
        double d2;
        long l2 = this.loadSuccessCount;
        long l3 = this.loadExceptionCount;
        l2 = LongMath.saturatedAdd(l2, l3);
        l3 = 0L;
        double d5 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            l2 = 0L;
            d2 = 0.0;
        } else {
            l3 = this.totalLoadTime;
            d5 = l3;
            d2 = l2;
            d2 = d5 / d2;
        }
        return d2;
    }

    public boolean equals(Object object) {
        Object object2 = object instanceof CacheStats;
        boolean bl2 = false;
        if (object2) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            long l12;
            object = (CacheStats)object;
            long l14 = this.hitCount;
            long l15 = ((CacheStats)object).hitCount;
            long l16 = l14 - l15;
            object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (!(object2 || (object2 = (l12 = (l14 = this.missCount) - (l15 = ((CacheStats)object).missCount)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) || (object2 = (l8 = (l14 = this.loadSuccessCount) - (l15 = ((CacheStats)object).loadSuccessCount)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) || (object2 = (l7 = (l14 = this.loadExceptionCount) - (l15 = ((CacheStats)object).loadExceptionCount)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) || (object2 = (l4 = (l14 = this.totalLoadTime) - (l15 = ((CacheStats)object).totalLoadTime)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) || (l3 = (l2 = (l14 = this.evictionCount) - (l15 = ((CacheStats)object).evictionCount)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public long evictionCount() {
        return this.evictionCount;
    }

    public int hashCode() {
        Long l2 = this.hitCount;
        Long l3 = this.missCount;
        Long l4 = this.loadSuccessCount;
        Long l7 = this.loadExceptionCount;
        Long l8 = this.totalLoadTime;
        Long l12 = this.evictionCount;
        Object[] objectArray = new Object[]{l2, l3, l4, l7, l8, l12};
        return Objects.hashCode(objectArray);
    }

    public long hitCount() {
        return this.hitCount;
    }

    public double hitRate() {
        double d2;
        long l2 = this.requestCount();
        long l3 = 0L;
        double d5 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            l2 = 0x3FF0000000000000L;
            d2 = 1.0;
        } else {
            l3 = this.hitCount;
            d5 = l3;
            d2 = l2;
            d2 = d5 / d2;
        }
        return d2;
    }

    public long loadCount() {
        long l2 = this.loadSuccessCount;
        long l3 = this.loadExceptionCount;
        return LongMath.saturatedAdd(l2, l3);
    }

    public long loadExceptionCount() {
        return this.loadExceptionCount;
    }

    public double loadExceptionRate() {
        double d2;
        long l2 = this.loadSuccessCount;
        long l3 = this.loadExceptionCount;
        l2 = LongMath.saturatedAdd(l2, l3);
        l3 = 0L;
        double d5 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            l2 = 0L;
            d2 = 0.0;
        } else {
            l3 = this.loadExceptionCount;
            d5 = l3;
            d2 = l2;
            d2 = d5 / d2;
        }
        return d2;
    }

    public long loadSuccessCount() {
        return this.loadSuccessCount;
    }

    public CacheStats minus(CacheStats cacheStats) {
        long l2 = this.hitCount;
        long l3 = cacheStats.hitCount;
        l2 = LongMath.saturatedSubtract(l2, l3);
        l3 = 0L;
        l2 = Math.max(l3, l2);
        long l4 = this.missCount;
        long l7 = cacheStats.missCount;
        l4 = LongMath.saturatedSubtract(l4, l7);
        l4 = Math.max(l3, l4);
        l7 = this.loadSuccessCount;
        long l8 = cacheStats.loadSuccessCount;
        l7 = LongMath.saturatedSubtract(l7, l8);
        l7 = Math.max(l3, l7);
        l8 = this.loadExceptionCount;
        long l12 = cacheStats.loadExceptionCount;
        l8 = LongMath.saturatedSubtract(l8, l12);
        l8 = Math.max(l3, l8);
        l12 = this.totalLoadTime;
        long l14 = l8;
        l8 = cacheStats.totalLoadTime;
        l8 = LongMath.saturatedSubtract(l12, l8);
        l8 = Math.max(l3, l8);
        l12 = this.evictionCount;
        long l15 = cacheStats.evictionCount;
        l15 = LongMath.saturatedSubtract(l12, l15);
        l12 = Math.max(l3, l15);
        l3 = l4;
        l4 = l7;
        l7 = l14;
        CacheStats cacheStats2 = new CacheStats(l2, l3, l4, l14, l8, l12);
        return cacheStats2;
    }

    public long missCount() {
        return this.missCount;
    }

    public double missRate() {
        double d2;
        long l2 = this.requestCount();
        long l3 = 0L;
        double d5 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            l2 = 0L;
            d2 = 0.0;
        } else {
            l3 = this.missCount;
            d5 = l3;
            d2 = l2;
            d2 = d5 / d2;
        }
        return d2;
    }

    public CacheStats plus(CacheStats cacheStats) {
        long l2 = this.hitCount;
        long l3 = cacheStats.hitCount;
        l2 = LongMath.saturatedAdd(l2, l3);
        l3 = this.missCount;
        long l4 = cacheStats.missCount;
        l3 = LongMath.saturatedAdd(l3, l4);
        l4 = this.loadSuccessCount;
        long l7 = cacheStats.loadSuccessCount;
        l4 = LongMath.saturatedAdd(l4, l7);
        l7 = this.loadExceptionCount;
        long l8 = cacheStats.loadExceptionCount;
        l7 = LongMath.saturatedAdd(l7, l8);
        l8 = this.totalLoadTime;
        long l12 = cacheStats.totalLoadTime;
        l8 = LongMath.saturatedAdd(l8, l12);
        l12 = this.evictionCount;
        long l14 = cacheStats.evictionCount;
        l12 = LongMath.saturatedAdd(l12, l14);
        CacheStats cacheStats2 = new CacheStats(l2, l3, l4, l7, l8, l12);
        return cacheStats2;
    }

    public long requestCount() {
        long l2 = this.hitCount;
        long l3 = this.missCount;
        return LongMath.saturatedAdd(l2, l3);
    }

    public String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        long l2 = this.hitCount;
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("hitCount", l2);
        l2 = this.missCount;
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("missCount", l2);
        l2 = this.loadSuccessCount;
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("loadSuccessCount", l2);
        l2 = this.loadExceptionCount;
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("loadExceptionCount", l2);
        l2 = this.totalLoadTime;
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("totalLoadTime", l2);
        l2 = this.evictionCount;
        return moreObjects$ToStringHelper.add("evictionCount", l2).toString();
    }

    public long totalLoadTime() {
        return this.totalLoadTime;
    }
}

